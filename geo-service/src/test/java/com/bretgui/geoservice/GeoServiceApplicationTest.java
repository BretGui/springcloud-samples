package com.bretgui.geoservice;

import com.bretgui.geoservice.amap.entity.InfoGrid;
import com.bretgui.geoservice.amap.mapper.InfoGridMapper;
import com.bretgui.geoservice.amap.service.IInfoGridService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.lang.reflect.Field;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {GeoServiceApplication.class})
public class GeoServiceApplicationTest {

    private static final Logger logger = LoggerFactory.getLogger(GeoServiceApplicationTest.class);

    @Resource
    private InfoGridMapper infoGridMapper;

    @Resource
    private IInfoGridService iInfoGridService;

    @Test
    @Transactional
    @Rollback
    public void test1() throws Exception{
        logger.info("====================测试开始=====================");
        InfoGrid infoGrid = iInfoGridService.getByStateAndPriority();
        Class cls = infoGrid.getClass();
        Field[] fields = cls.getDeclaredFields();
        for(int i=0; i<fields.length; i++){
            Field f = fields[i];
            f.setAccessible(true);
            System.out.println(f.getName() + ":" + f.get(infoGrid));
        }
        logger.info("====================测试结束=====================");
    }

}
