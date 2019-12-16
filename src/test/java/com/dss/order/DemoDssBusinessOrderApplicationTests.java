package com.dss.order;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mapstruct.Context;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoDssBusinessOrderApplicationTests.class)
@ActiveProfiles(profiles = "test")
public class DemoDssBusinessOrderApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("11111111111s");
    }

}
