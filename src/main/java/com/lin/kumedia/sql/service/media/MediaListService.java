package com.lin.kumedia.sql.service.media;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lin.kumedia.sql.entity.media.MediaInfoMap;
import com.lin.kumedia.sql.entity.media.MediaList;
import com.lin.kumedia.sql.mapper.media.MediaListMapper;
import com.lin.kumedia.sql.service.BaseService;
import com.lin.kumedia.sql.service.system.SystemRuleService;
import com.lin.kumedia.web.pojo.MediaProfile;
import com.lin.kumedia.web.pojo.codedata.TotalRows;

@Service
public class MediaListService extends BaseService<MediaListMapper, MediaList> {
    
    @Autowired
    private SystemRuleService systemRuleService;
    
    @Override
    protected void beforeInsert(MediaList entity) {
        super.beforeInsert(entity);
        entity.setMediaId(systemRuleService.newMediaId());
    }

    /**
     * 获取简介列表
     * @return
     */
    public TotalRows<MediaProfile> getMediaList(String category) {
        if (category == null) {
            category = "movie";
        }
        category = category.toLowerCase();
        Page<MediaList> producePage = new Page<>(1, 200);
        QueryWrapper<MediaList> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("category", category);
        queryWrapper.eq("checked", 1);
//        queryWrapper.select("id", "title", "age", "rating", "thumb", "profile");
        Page<MediaList> page = mapper.selectPage(producePage, queryWrapper);
        
        List<MediaList> list = page.getRecords();
        List<MediaProfile> outList = new ArrayList<MediaProfile>();
        for (int i = 0; i < list.size(); i++) {
            MediaList tmp = list.get(i);
            MediaProfile item = new MediaProfile();
            item.setId(tmp.getId());
            item.setTitle(tmp.getTitle());
            item.setAge(tmp.getAge());
            item.setRating(tmp.getRating());
            item.setPath(String.format("/%s/%s", category, tmp.getMediaId()));
            item.setProfile(tmp.getProfile());
            item.setThumb(tmp.getThumb());
            
            outList.add(item);
        }
        return new TotalRows<MediaProfile>(page.getTotal(), outList);
    }
    
    public MediaInfoMap getMediaById(String mediaId) {
        List<MediaInfoMap> map = mapper.selectMediaInfo(mediaId);
        if (map != null && map.size() > 0) {
            return map.get(0);
        }
        return null;
    }
}
