package com.dss.order.domain;

public class Water {
    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * belong
     */
    private String belong;

    /**
     * parent
     */
    private String parent;

    /**
     * drink
     */
    private Byte drink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public Byte getDrink() {
        return drink;
    }

    public void setDrink(Byte drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", belong=").append(belong);
        sb.append(", parent=").append(parent);
        sb.append(", drink=").append(drink);
        sb.append("]");
        return sb.toString();
    }
}