package com.proptiger.drip.service;

import com.proptiger.drip.entity.SimpleJob;
import com.proptiger.drip.entity.SimpleJob.State;

public interface SimpleJobService {

    SimpleJob getByState(State state);

    SimpleJob save(SimpleJob simpleJob);
}
