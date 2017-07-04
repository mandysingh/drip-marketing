package com.proptiger.drip.controller;

import java.util.List;
import java.util.Map;

import com.proptiger.drip.entity.SimpleJob;
import com.proptiger.drip.input.CampaignNode;
import com.proptiger.drip.input.CampaignNode.Type;
import com.proptiger.drip.service.CampaignService;

public class CampaignController {

    private CampaignService campaignService;

    public List<SimpleJob> addCampaign(CampaignNode campaign) {
        List<SimpleJob> jobs = campaignService.generateAndSaveJobs(campaign);
        return jobs;
    }

    public void updateUserAttributes(int campaignNodeId, int userId, Type type) {

    }

    public void updateUserAttributes(Map<String, String> custom, int userId) {

    }
}
