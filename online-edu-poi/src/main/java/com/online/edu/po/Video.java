package com.online.edu.po;

import com.baomidou.mybatisplus.annotation.*;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 课程小节
 * </p>
 *
 * @author xujin
 * @since 2020-05-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("edu_video")
@ApiModel(value="Video对象", description="课程小节")
public class Video implements Serializable {


    private static final long serialVersionUID = -7404244166019034992L;
    @ApiModelProperty(value = "视频ID")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "课程ID")
    private String courseId;

    @ApiModelProperty(value = "章节ID")
    private String chapterId;

    @ApiModelProperty(value = "节点名称")
    private String title;

    @ApiModelProperty(value = "排序字段")
    private Integer sort;

    @ApiModelProperty(value = "播放次数")
    private Long playCount;

    @ApiModelProperty(value = "是否可以试听：0免费 1收费")
    private Boolean isFree;

    @ApiModelProperty(value = "视频资源")
    private String videoSourceId;

    @ApiModelProperty(value = "视频时长（秒）")
    private Float duration;

    @ApiModelProperty(value = "视频状态:见阿里云文档")
    private String status;

    @ApiModelProperty(value = "视频源文件大小（字节）")
    private Long size;

    @ApiModelProperty(value = "乐观锁")
    @Version
    private Long version;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;

    @ApiModelProperty(value = "云服务器上存储的视频文件名称")
    private String videoOriginalName;

    public Video() {}
    public Video(Builder builder) {
        this.setId(builder.id);
        this.setCourseId(builder.courseId);
        this.setChapterId(builder.chapterId);
        this.setTitle(builder.title);
        this.setSort(builder.sort);
        this.setPlayCount(builder.playCount);
        this.setIsFree(builder.isFree);
        this.setVideoSourceId(builder.videoSourceId);
        this.setDuration(builder.duration);
        this.setStatus(builder.status);
        this.setSize(builder.size);
        this.setVersion(builder.version);
        this.setGmtCreate(builder.gmtCreate);
        this.setGmtModified(builder.gmtModified);
        this.setVideoOriginalName(builder.videoOriginalName);
    }
    public static Builder newBuilder() {
        return new Builder();
    }
    public static final class Builder{
        private String id;
        private String courseId;
        private String chapterId;
        private String title;
        private Integer sort;
        private Long playCount;
        private Boolean isFree;
        private String videoSourceId;
        private Float duration;
        private String status;
        private Long size;
        private Long version;
        private Date gmtCreate;
        private Date gmtModified;
        private String videoOriginalName;
        private Builder(){}
        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Builder courseId(String courseId){
            this.courseId = courseId;
            return this;
        }
        public Builder chapterId(String chapterId){
            this.chapterId = chapterId;
            return this;
        }
        public Builder title(String title){
            this.title = title;
            return this;
        }
        public Builder sort(Integer sort){
            this.sort = sort;
            return this;
        }
        public Builder playCount(Long playCount){
            this.playCount = playCount;
            return this;
        }
        public Builder isFree(Boolean isFree){
            this.isFree = isFree;
            return this;
        }
        public Builder videoSourceId(String videoSourceId){
            this.videoSourceId = videoSourceId;
            return this;
        }
        public Builder duration(Float duration){
            this.duration = duration;
            return this;
        }
        public Builder status(String status){
            this.status = status;
            return this;
        }
        public Builder size(Long size){
            this.size = size;
            return this;
        }
        public Builder version(Long version){
            this.version = version;
            return this;
        }
        public Builder gmtCreate(Date gmtCreate){
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Builder gmtModified(Date gmtModified){
            this.gmtModified = gmtModified;
            return this;
        }
        public Builder videoOriginalName(String videoOriginalName){
            this.videoOriginalName = videoOriginalName;
            return this;
        }
        public Video build() {
            return new Video(this);
        }
    }
}
