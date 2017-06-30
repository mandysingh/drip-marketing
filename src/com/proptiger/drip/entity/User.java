package com.proptiger.drip.entity;

import java.util.List;

public class User {

    private Integer       id;

    private String        name;

    private Integer       cityId;

    private List<Integer> executedCampaignIds;

    private List<Integer> clickedCampaignIds;

    private List<Integer> openedCampaignIds;

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

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public List<Integer> getExecutedCampaignIds() {
        return executedCampaignIds;
    }

    public void setExecutedCampaignIds(List<Integer> executedCampaignIds) {
        this.executedCampaignIds = executedCampaignIds;
    }

    public List<Integer> getClickedCampaignIds() {
        return clickedCampaignIds;
    }

    public void setClickedCampaignIds(List<Integer> clickedCampaignIds) {
        this.clickedCampaignIds = clickedCampaignIds;
    }

    public List<Integer> getOpenedCampaignIds() {
        return openedCampaignIds;
    }

    public void setOpenedCampaignIds(List<Integer> openedCampaignIds) {
        this.openedCampaignIds = openedCampaignIds;
    }

}
