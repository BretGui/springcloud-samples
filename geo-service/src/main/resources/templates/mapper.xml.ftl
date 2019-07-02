<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.bretgui.geoservice.amap.mapper.InfoGridMapper">

    <select id="getByStateAndPriority" resultType="${package.Entity}.${entity}">
        SELECT
            ${table.fieldNames}
        FROM
            ${table.name}
        <where>
            download_state = 0
        </where>
        ORDER BY download_priority DESC LIMIT 1 OFFSET 0
    </select>

    <update id="updStateById" parameterType="Integer">
        UPDATE ${table.name}
        SET
            download_state = 1
        WHERE
            gid = ${r'#{gid}'}
    </update>

</mapper>