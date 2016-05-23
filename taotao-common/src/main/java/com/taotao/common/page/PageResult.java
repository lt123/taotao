package com.taotao.common.page;

import java.util.List;

/**
 * Created by Administrator on 2016/4/28.
 */
public class PageResult<T> {
    private Integer totalCount;
    private Integer totalPage;
    private Integer pageSize;
    private Integer currentPage;
    private List<T> rows;

    public PageResult(Integer currentPage, Integer pageSize, Integer count, List<T> rows) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.rows = rows;
        this.totalCount = count;
        this.totalPage = ((count - 1) / this.pageSize) + 1;
    }

    public PageResult() {
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getTotal(){
        return totalCount;
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "totalCount=" + totalCount +
                ", totalPage=" + totalPage +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                ", rows=" + rows +
                '}';
    }
}
