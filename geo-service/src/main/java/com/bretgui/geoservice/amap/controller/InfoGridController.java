package com.bretgui.geoservice.amap.controller;


import com.alibaba.fastjson.JSONObject;
import com.bretgui.geoservice.amap.entity.InfoGrid;
import com.bretgui.geoservice.amap.service.IInfoGridService;
import com.bretgui.geoservice.common.ResultJson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author BretGui
 * @since 2019-07-02
 */
@Controller
@RequestMapping("/amap/info-grid")
public class InfoGridController {

    private static final Logger logger = LoggerFactory.getLogger(InfoGridController.class);

    @Resource
    private IInfoGridService iInfoGridService;

    @RequestMapping("getByStateAndPriority")
    @ResponseBody
    public Object getByStateAndPriority(){
        ResultJson resultJson = new ResultJson();
        try{
            InfoGrid infoGrid = iInfoGridService.getByStateAndPriority();
            if (infoGrid != null) {
                resultJson.setData(JSONObject.toJSON(infoGrid));
                logger.info("获取网格-----gid:" + infoGrid.getGid());
            }else{
                resultJson.setMsg("*无法查询到可下载网格,请检查数据是否已全部下载。*");
                logger.info("未查询到可下载网格");
            }
        }catch (Exception e){
            resultJson.setStatus(500);
            resultJson.setMsg("error");
            logger.error("异常:" + e.getMessage());
        }
        return resultJson;
    }

}
