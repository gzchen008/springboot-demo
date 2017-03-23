package org.spring.springboot;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring.springboot.controller.UserConctroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class UserConctrollerMockTest {

    @Autowired
    private UserConctroller userConctroller;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(userConctroller).build();
    }

    @Test
    public void testGetUser() {
        try {
            ResultActions result = mockMvc.perform(MockMvcRequestBuilders.get("/user/get?id=1"));
            String res = result.andReturn().getResponse().getContentAsString();
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
