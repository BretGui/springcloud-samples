package ${package.Mapper};

import ${package.Entity}.${entity};
import ${superMapperClassPackage};

/**
 * <p>
 *
 * </p>
 *
 * @author ${author}
 * @since ${date}
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