package com.example.demo.models;

import java.util.ArrayList;

public class SsoMenuResponse {

    private Integer id;
    private String title;
    private String icon;
    private String routerLink;
    private String target;
    private String clase;
    private String badge;
    private String badgeClase;
    private ArrayList<SsoMenuResponse> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getRouterLink() {
        return routerLink;
    }

    public void setRouterLink(String routerLink) {
        this.routerLink = routerLink;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getBadge() {
        return badge;
    }

    public void setBadge(String badge) {
        this.badge = badge;
    }

    public String getBadgeClase() {
        return badgeClase;
    }

    public void setBadgeClase(String badgeClase) {
        this.badgeClase = badgeClase;
    }

    public ArrayList<SsoMenuResponse> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<SsoMenuResponse> children) {
        this.children = children;
    }
}
