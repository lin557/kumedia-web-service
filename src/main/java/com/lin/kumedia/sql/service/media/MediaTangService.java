package com.lin.kumedia.sql.service.media;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lin.kumedia.sql.entity.media.MediaTang;
import com.lin.kumedia.sql.mapper.media.MediaTangMapper;
import com.lin.kumedia.sql.service.BaseService;
import com.lin.kumedia.web.pojo.TangProfile;
import com.lin.kumedia.web.pojo.codedata.TotalRows;

@Service
public class MediaTangService extends BaseService<MediaTangMapper, MediaTang> {

    /**
     * 获取唐诗列表
     * @return
     */
    public TotalRows<TangProfile> getTangList() {
        QueryWrapper<MediaTang> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("showed", 1);
        queryWrapper.orderByAsc("LENGTH(tang_id)", "tang_id");
        List<MediaTang> list = mapper.selectList(queryWrapper);
        
        List<TangProfile> outList = new ArrayList<TangProfile>();
        for (int i = 0; i < list.size(); i++) {
            MediaTang tmp = list.get(i);
            TangProfile item = new TangProfile();
            item.setId(tmp.getId());
            item.setTitle(tmp.getTitle());
            item.setWriter(tmp.getWriters());
            item.setPath(String.format("/%s/%s", "tang", tmp.getTangId()));
            
            outList.add(item);
        }
        return new TotalRows<TangProfile>(outList.size(), outList);
    }
    
    public MediaTang getTangById(String tangId) {
        QueryWrapper<MediaTang> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("tang_id", tangId);
        MediaTang map = mapper.selectOne(queryWrapper);
        return map;
    }
}
