package com.lin.kumedia.web.pojo.codedata;

import java.util.List;

/**
 * EasyUI表的数据格式
 * @author zhen.lin
 * @data   2018年1月30日 下午9:39:14 
 */
public class TotalRows<T> {

    private Long total;
    private List<T> rows;
    
    public TotalRows(long nTotal, List<T> lRows) {
        this.total = nTotal;
        this.rows = lRows;
    }
    
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

}
