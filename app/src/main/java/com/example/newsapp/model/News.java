package com.example.newsapp.model;

import java.util.List;

public class News {

    /**
     * id : 89041
     * content : 【现场 | 辛秉谦：IPFS在下一代数据中心建设方面将发挥重要作用】金色财经现场报道，4月10日，中国通信工业协会无线网格网络暨MESH+IPFS专业委员会辛秉谦秘书长在"2019第二届深圳国际区块链技术与应用大会”现场演讲时指出，下一代互联网是技术驱动的互联网，IPFS作为下一代互联网的基础协议和文件系统之一，对于习主席提出的“数据中国战略”具有重要意义。尤其是在下一代数据中心建设方面，其组网存储方式及存储规模将发生重大改变和飞跃，这必将对未来中国互联网发展产生深远的影响。同时，他表示，IPFS不是去中心化，它的本质是是网格化、节点化、内容寻址，体现的是在数据世界中我们各自的贡献值。
     * content_prefix : null
     * link_name :
     * link :
     * grade : 4
     * sort : null
     * highlight_color :
     * images : [{"url":"https://img.jinse.com/1694921_watermark.png","thumbnail":"https://img.jinse.com/1694921_live.png","height":100,"width":100}]
     * created_at : 1554863188
     * attribute : null
     * up_counts : 7
     * down_counts : 25
     * zan_status : null
     * readings : null
     * extra_type : 0
     * extra : null
     * prev : null
     * next : null
     */

    private int id;
    private String content;
    private Object content_prefix;
    private String link_name;
    private String link;
    private int grade;
    private Object sort;
    private String highlight_color;
    private int created_at;
    private Object attribute;
    private int up_counts;
    private int down_counts;
    private Object zan_status;
    private Object readings;
    private int extra_type;
    private Object extra;
    private Object prev;
    private Object next;
    private List<ImagesBean> images;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Object getContent_prefix() {
        return content_prefix;
    }

    public void setContent_prefix(Object content_prefix) {
        this.content_prefix = content_prefix;
    }

    public String getLink_name() {
        return link_name;
    }

    public void setLink_name(String link_name) {
        this.link_name = link_name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Object getSort() {
        return sort;
    }

    public void setSort(Object sort) {
        this.sort = sort;
    }

    public String getHighlight_color() {
        return highlight_color;
    }

    public void setHighlight_color(String highlight_color) {
        this.highlight_color = highlight_color;
    }

    public int getCreated_at() {
        return created_at;
    }

    public void setCreated_at(int created_at) {
        this.created_at = created_at;
    }

    public Object getAttribute() {
        return attribute;
    }

    public void setAttribute(Object attribute) {
        this.attribute = attribute;
    }

    public int getUp_counts() {
        return up_counts;
    }

    public void setUp_counts(int up_counts) {
        this.up_counts = up_counts;
    }

    public int getDown_counts() {
        return down_counts;
    }

    public void setDown_counts(int down_counts) {
        this.down_counts = down_counts;
    }

    public Object getZan_status() {
        return zan_status;
    }

    public void setZan_status(Object zan_status) {
        this.zan_status = zan_status;
    }

    public Object getReadings() {
        return readings;
    }

    public void setReadings(Object readings) {
        this.readings = readings;
    }

    public int getExtra_type() {
        return extra_type;
    }

    public void setExtra_type(int extra_type) {
        this.extra_type = extra_type;
    }

    public Object getExtra() {
        return extra;
    }

    public void setExtra(Object extra) {
        this.extra = extra;
    }

    public Object getPrev() {
        return prev;
    }

    public void setPrev(Object prev) {
        this.prev = prev;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public List<ImagesBean> getImages() {
        return images;
    }

    public void setImages(List<ImagesBean> images) {
        this.images = images;
    }

    public static class ImagesBean {
        /**
         * url : https://img.jinse.com/1694921_watermark.png
         * thumbnail : https://img.jinse.com/1694921_live.png
         * height : 100
         * width : 100
         */

        private String url;
        private String thumbnail;
        private int height;
        private int width;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }
}
