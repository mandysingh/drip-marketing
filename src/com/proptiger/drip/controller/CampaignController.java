package com.proptiger.drip.controller;

import java.util.List;

import com.proptiger.drip.entity.SimpleJob;
import com.proptiger.drip.input.Campaign;
import com.proptiger.drip.service.CampaignService;

public class CampaignController {

    private CampaignService campaignService;

    public void addCampaign(Campaign campaign) {
        List<SimpleJob> jobs = campaignService.generateJobs(campaign);
        // save jobs
    }
}
