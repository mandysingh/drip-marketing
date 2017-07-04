package com.proptiger.drip.service;

import java.util.List;

import com.proptiger.drip.entity.Payload;
import com.proptiger.drip.entity.SimpleJob;
import com.proptiger.drip.entity.User;

public interface TemplateEngineService {

    List<Payload> getPayloads(List<User> users, String template, SimpleJob simpleJob);
}
