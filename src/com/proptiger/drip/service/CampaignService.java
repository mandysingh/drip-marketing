package com.proptiger.drip.service;

import java.util.List;

import com.proptiger.drip.entity.SimpleJob;
import com.proptiger.drip.input.CampaignNode;

public interface CampaignService {

    List<SimpleJob> generateAndSaveJobs(CampaignNode campaign);

}
