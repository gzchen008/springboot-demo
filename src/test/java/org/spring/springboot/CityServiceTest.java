package org.spring.springboot;

/**
 * Created by Administrator on 2017/3/21.
 */

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.domain.City;
import org.spring.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class CityServiceTest {
    @Autowired
    private CityService cityService;

    @Test
    public void test(){
        City city = cityService.findCityByName("温岭市");
        Assert.assertNotNull(city);
    }
}
