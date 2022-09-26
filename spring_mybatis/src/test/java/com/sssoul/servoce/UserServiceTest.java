package com.sssoul.servoce;

import com.sssoul.config.SpringConfig;
import com.sssoul.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring整合Junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private UserService us;

    @Test
    public void testFindById(){
        System.out.println(us.FindById(1));
    }
}
