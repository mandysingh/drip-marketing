package com.proptiger.drip.entity;

import java.util.Date;

import com.proptiger.drip.input.Schedule;
import com.proptiger.drip.input.Selector;

public class SimpleJob {

    private Integer  id;

    private Selector selector;

    private Schedule schedule;

    private String   template;

    private State    state;

    private Date     firstStartTime;

    public enum State {
        OPEN, RUNNING, SLEEPING, DONE
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Selector getSelector() {
        return selector;
    }

    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Date getFirstStartTime() {
        return firstStartTime;
    }

    public void setFirstStartTime(Date firstStartTime) {
        this.firstStartTime = firstStartTime;
    }
}
