package com.proptiger.drip.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.proptiger.drip.entity.SimpleJob;
import com.proptiger.drip.entity.SimpleJob.State;
import com.proptiger.drip.input.CampaignNode;
import com.proptiger.drip.input.Campaign;
import com.proptiger.drip.input.CampaignNode;
import com.proptiger.drip.service.CampaignService;

public class CampaignServiceImpl implements CampaignService {

    @Override
    public List<SimpleJob> generateAndSaveJobs(Campaign campaign) {
        List<SimpleJob> jobs = new ArrayList<>();

        for (CampaignNode a : campaign.getActions()) {
            SimpleJob mainJob = new SimpleJob();
            // use date util to add mins/hours
            mainJob.setFirstStartTime(new Date(a.getSchedule().getIntervals().get(0)));
            mainJob.setSchedule(a.getSchedule());
            mainJob.setSelector(campaign.getSelector());
            mainJob.setState(State.OPEN);
            mainJob.setTemplate(a.getTemplate());
            jobs.add(mainJob);
            jobs.addAll(getJobsFromTrigger(a.getTriggers(), campaign));
        }

        return jobs;
    }

    private List<SimpleJob> getJobsFromTrigger(List<CampaignNode> triggers, Campaign campaign) {
        List<SimpleJob> jobs = new ArrayList<>();
        // update selector according to trigger and campaign id
        for (CampaignNode t : triggers) {

        }
        return new ArrayList<>();
    }

}
