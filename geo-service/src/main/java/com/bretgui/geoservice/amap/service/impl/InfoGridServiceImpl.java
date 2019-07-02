package com.bretgui.geoservice.amap.service.impl;

import com.bretgui.geoservice.amap.entity.InfoGrid;
import com.bretgui.geoservice.amap.mapper.InfoGridMapper;
import com.bretgui.geoservice.amap.service.IInfoGridService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author BretGui
 * @since 2019-07-02
 */
@Service
public class InfoGridServiceImpl extends ServiceImpl<InfoGridMapper, InfoGrid> implements IInfoGridService {

    @Resource
    private InfoGridMapper infoGridMapper;

    @Transactional
    public InfoGrid getByStateAndPriority() {
        InfoGrid infoGrid = infoGridMapper.getByStateAndPriority();
        infoGrid.setDownloadState(1);
        infoGridMapper.updStateById(infoGrid.getGid());
        return infoGrid;
    }
}