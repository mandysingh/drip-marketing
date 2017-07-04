package com.proptiger.drip.input;

import java.util.List;

public class CampaignNode {

    private Selector selector;

    public enum Type {
        INITIAL, SENT, OPENED, CLICKED, CUSTOM;
    }

    private Type               type;

    private String             template;

    private Schedule           schedule;

    private List<CampaignNode> actions;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

}
