package com.proptiger.drip.service;

import java.util.List;

import com.proptiger.drip.entity.User;
import com.proptiger.drip.input.Selector;

public interface SearchService {

    List<User> getUsers(Selector selector);
}
