package com.zmannotes.spring.service.impl;

import com.zmannotes.spring.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * Created by zman on 16/7/13.
 */
@Service
public class DemoServiceImpl implements DemoService{
    public String encrypt(String data) {
        return data.toLowerCase();
    }
}
