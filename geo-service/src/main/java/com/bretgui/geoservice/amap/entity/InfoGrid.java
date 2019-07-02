package com.bretgui.geoservice.amap.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author BretGui
 * @since 2019-07-02
 */
@TableName("amap_info_grid")
public class InfoGrid implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer gid;

    private String colName;

    private String rowName;

    private String geom;

    /**
     * POI数量
     */
    private Integer poiCount;

    /**
     * 0:未下载
1:下载中
2:下载完成
     */
    private Integer downloadState;

    /**
     * 省代码
     */
    private String provinceCode;

    /**
     * 市代码
     */
    private String cityCode;

    /**
     * 区县代码
     */
    private String contyCode;

    /**
     * 下载优先级(1-100)
     */
    private Integer downloadPriority;

    /**
     * 最小经度
     */
    private Double minLon;

    /**
     * 最小纬度
     */
    private Double minLat;

    /**
     * 最大经度
     */
    private Double maxLon;

    /**
     * 最大纬度
     */
    private Double maxLat;

    private LocalDateTime startTime;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }
    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }
    public String getRowName() {
        return rowName;
    }

    public void setRowName(String rowName) {
        this.rowName = rowName;
    }
    public String getGeom() {
        return geom;
    }

    public void setGeom(String geom) {
        this.geom = geom;
    }
    public Integer getPoiCount() {
        return poiCount;
    }

    public void setPoiCount(Integer poiCount) {
        this.poiCount = poiCount;
    }
    public Integer getDownloadState() {
        return downloadState;
    }

    public void setDownloadState(Integer downloadState) {
        this.downloadState = downloadState;
    }
    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
    public String getContyCode() {
        return contyCode;
    }

    public void setContyCode(String contyCode) {
        this.contyCode = contyCode;
    }
    public Integer getDownloadPriority() {
        return downloadPriority;
    }

    public void setDownloadPriority(Integer downloadPriority) {
        this.downloadPriority = downloadPriority;
    }
    public Double getMinLon() {
        return minLon;
    }

    public void setMinLon(Double minLon) {
        this.minLon = minLon;
    }
    public Double getMinLat() {
        return minLat;
    }

    public void setMinLat(Double minLat) {
        this.minLat = minLat;
    }
    public Double getMaxLon() {
        return maxLon;
    }

    public void setMaxLon(Double maxLon) {
        this.maxLon = maxLon;
    }
    public Double getMaxLat() {
        return maxLat;
    }

    public void setMaxLat(Double maxLat) {
        this.maxLat = maxLat;
    }
    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "InfoGrid{" +
            "gid=" + gid +
            ", colName=" + colName +
            ", rowName=" + rowName +
            ", geom=" + geom +
            ", poiCount=" + poiCount +
            ", downloadState=" + downloadState +
            ", provinceCode=" + provinceCode +
            ", cityCode=" + cityCode +
            ", contyCode=" + contyCode +
            ", downloadPriority=" + downloadPriority +
            ", minLon=" + minLon +
            ", minLat=" + minLat +
            ", maxLon=" + maxLon +
            ", maxLat=" + maxLat +
            ", startTime=" + startTime +
        "}";
    }
}
