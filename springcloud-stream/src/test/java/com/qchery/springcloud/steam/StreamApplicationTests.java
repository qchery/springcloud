package com.qchery.springcloud.steam;

import com.qchery.springcloud.stream.StreamApplication;
import com.qchery.springcloud.stream.service.MQService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author Chery
 * @date 2018/3/20 22:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StreamApplication.class)
public class StreamApplicationTests {

    @Autowired
    private MQService mqService;

    @Test
    public void contextLoads() {
        assertNotNull(this.mqService.input());
    }

}
