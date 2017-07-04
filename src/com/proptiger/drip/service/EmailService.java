package com.proptiger.drip.service;

import com.proptiger.drip.entity.SimpleJob;

public interface EmailService {

    void sendEmails(SimpleJob simpleJob);
}
