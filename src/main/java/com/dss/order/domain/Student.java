package com.dss.order.domain;

public class Student {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 名字
     */
    private String stuname;

    /**
     * 学号
     */
    private String stucode;

    /**
     * 性别（1 男，2 女）
     */
    private String six;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStucode() {
        return stucode;
    }

    public void setStucode(String stucode) {
        this.stucode = stucode;
    }

    public String getSix() {
        return six;
    }

    public void setSix(String six) {
        this.six = six;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stuname=").append(stuname);
        sb.append(", stucode=").append(stucode);
        sb.append(", six=").append(six);
        sb.append("]");
        return sb.toString();
    }
}