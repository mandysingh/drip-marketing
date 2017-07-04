package com.proptiger.drip.service.impl;

import com.proptiger.drip.entity.SimpleJob;
import com.proptiger.drip.entity.SimpleJob.State;
import com.proptiger.drip.service.EmailService;
import com.proptiger.drip.service.JobExecutorService;
import com.proptiger.drip.service.SimpleJobService;

public class JobExecutorServiceImpl implements JobExecutorService {

    private SimpleJobService simpleJobService;

    private EmailService     emailService;

    @Override
    public void startExecuting() {
        // also put filter for time
        SimpleJob simpleJob = simpleJobService.getByState(State.OPEN);
        simpleJob = lockJob(simpleJob);
        emailService.sendEmails(simpleJob);
    }

    private SimpleJob lockJob(SimpleJob simpleJob) {
        // TODO Auto-generated method stub
        return null;
    }

}
