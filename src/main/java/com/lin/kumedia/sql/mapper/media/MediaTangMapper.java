package com.lin.kumedia.sql.mapper.media;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lin.kumedia.sql.entity.media.MediaTang;

/**
 * 唐诗表增删改查接口
 * 
 * @author zhen.lin
 * @date 2022年10月27日
 */
@Mapper
public interface MediaTangMapper extends BaseMapper<MediaTang> {

//    @Results(id = "MediaInfoMap", value = {
//            @Result(id = true, column = "id", property = "id"),
//            @Result(column = "title", property = "title"),
//            @Result(column = "performer", property = "performer"),
//            @Result(column = "poster", property = "poster"),
//            @Result(column = "media_id", property = "episodes", javaType = List.class, many = @Many(select = "selectMediaEposode"))
//    })
//    @Select("SELECT * FROM media_list WHERE media_id = '${mediaId}'")
//    public List<MediaInfoMap> selectMediaInfo(String mediaId);
//    
//    @Select("SELECT title, url FROM media_episode WHERE media_id = '${mediaId}' ORDER BY num")
//    public List<MediaEposodeMap> selectMediaEposode(String mediaId);
}
