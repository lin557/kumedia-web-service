package com.lin.kumedia.sql.service.system;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lin.kumedia.sql.entity.system.SystemRule;
import com.lin.kumedia.sql.mapper.system.SystemRuleMapper;
import com.lin.kumedia.sql.service.BaseService;

@Service
public class SystemRuleService extends BaseService<SystemRuleMapper, SystemRule> {
    
    /**
     * 媒体ID前缀
     */
    private static String PREFIX_MEDIA_ID = "MID";
    
    private static String PREFIX_TANG_ID = "TAN";
    
    /**
     * 控制前缀格式
     * @param prefix
     * @return
     */
    @SuppressWarnings("unused")
    private String fixPrefix(String prefix) {
        String sTmp = prefix;
        if (sTmp != null) {
            int letter = 3;
            // 只能3个字符
            if (sTmp.length() < letter) {
                sTmp = sTmp + "000";
            }
            sTmp = String.format("%.3s", sTmp);
            // 转大写
            sTmp = sTmp.toUpperCase();
        }
        return sTmp;
    }
    
    /**
     * 获取编码Id
     * @param prefix
     * @return
     */
    public int getRuleId(String prefix) {
        QueryWrapper<SystemRule> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(prefix, prefix);
        SystemRule entity = this.mapper.selectOne(queryWrapper);
        if (entity == null) {
            return 0;
        }
        Integer ret = entity.getSuffix();
        if (ret == null) {
            ret = 1;
        }
        // 后缀+1
        entity.setSuffix(ret + 1);
        this.mapper.updateById(entity);
        return ret.intValue();
    }
    
    /**
     * 获取新的媒体ID
     * @return
     */
    public String newMediaId() {
        return String.valueOf(this.getRuleId(PREFIX_MEDIA_ID));
    }
    
    /**
     * 获取新的媒体ID
     * @return
     */
    public String newTangId() {
        return String.valueOf(this.getRuleId(PREFIX_TANG_ID));
    }
}
