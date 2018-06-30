package com.cui.po.request;

/**
 * Created by Promisesaybye on 2018/6/29.
 */
public class CommonRequest {
    /**
     * 表示查询的页码,页码从0开始计算
     */
    private int page = 0;

    /**
     * 表示每页的个数。
     */
    private int pagesize = 10;

    /**
     * 表示查询是否分页。
     * 如果值为true，表示结果分页；
     * 如果结果不为true，则结果不分页，取所有结果。
     */
    private boolean isPaging = true;

    /**
     * 表示查询的页码，页码从0开始计算。
     * <p>
     * @return
     */
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    /**
     * 表示每页的个数
     * <p>
     * @return
     */
    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    /**
     * 表示是否分页，如果为false，则表示不要分页。
     * 默认为true，也即是默认需要分页。
     * <p>
     * @return
     */
    public boolean isPaging() {
        return isPaging;
    }

    public void setPaging(boolean isPaging) {
        this.isPaging = isPaging;
    }

    /**
     * 如果需要分页，可以通过该方法获得该页的第一个数据的行数
     * <p>
     * 判断的条件是 >= getStart
     * <p>
     * @return
     */
    public int getStart() {
        return page * pagesize;
    }

    /**
     * 如果需要分页，可以通过该方法获得该页的最后一个数据的下一行的行数
     * <p>
     * 判断条件是 < getEnd
     * <p>
     * @return
     */
    public int getEnd() {
        return (page + 1) * pagesize;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.page;
        hash = 89 * hash + this.pagesize;
        hash = 89 * hash + (this.isPaging ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CommonRequest other = (CommonRequest) obj;
        if (this.page != other.page) {
            return false;
        }
        if (this.pagesize != other.pagesize) {
            return false;
        }
        if (this.isPaging != other.isPaging) {
            return false;
        }
        return true;
    }
}
