package com.proptiger.drip.service;

import java.util.List;

import com.proptiger.drip.entity.SimpleJob;
import com.proptiger.drip.input.Campaign;

public interface CampaignService {

    List<SimpleJob> generateJobs(Campaign campaign);
}
