package com.bretgui.geoservice.amap.mapper;

import com.bretgui.geoservice.amap.entity.InfoGrid;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *
 * </p>
 *
 * @author BretGui
 * @since 2019-07-02
 */
public interface InfoGridMapper extends BaseMapper<InfoGrid> {

    /**
    * 获取下载状态为0并且优先级最高的网格
    * @return
    */
    InfoGrid getByStateAndPriority();

    /**
    * 通过ID修改下载状态
    * @return
    */
    int updStateById(Integer id);

}