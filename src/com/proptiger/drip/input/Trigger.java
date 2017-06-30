package com.proptiger.drip.input;

import java.util.List;

public class Trigger {

    public enum Type {
        SENT, OPENED, CLICKED;
    }

    private Type          type;

    private String        template;

    private Schedule      schedule;

    private List<Trigger> triggers;

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

    public List<Trigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }
}
