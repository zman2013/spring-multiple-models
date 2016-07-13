package com.zmannotes.spring.data;

import com.zmannotes.spring.data.dao.PersonMapper;
import com.zmannotes.spring.data.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/test/demo-data-test.xml")
public class DataTest {

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void test1() {
        Person person = personMapper.selectByPrimaryKey(0);
        assertEquals("name-test-1", person.getName());
    }

}
