package com.zmannotes.spring.data.service.impl;

import com.zmannotes.spring.data.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by zman on 16/7/13.
 */
@Service
public class DemoServiceImpl implements DemoService{
    @Override
    public String encrypt(String data) {
        return data.toLowerCase();
    }
}
