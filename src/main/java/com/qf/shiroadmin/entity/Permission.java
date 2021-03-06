package com.qf.shiroadmin.entity;

public class Permission {
    private Integer id;

    private Short type;

    private String name;

    private String icon;

    private Integer parentid;

    private Short level;

    private String pems;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Short getLevel() {
        return level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    public String getPems() {
        return pems;
    }

    public void setPems(String pems) {
        this.pems = pems == null ? null : pems.trim();
    }
}