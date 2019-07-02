package com.bretgui.geoservice.amap.service;

import com.bretgui.geoservice.amap.entity.InfoGrid;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author BretGui
 * @since 2019-07-02
 */
public interface IInfoGridService extends IService<InfoGrid> {

    InfoGrid getByStateAndPriority();

}