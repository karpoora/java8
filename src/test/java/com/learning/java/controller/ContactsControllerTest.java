package com.learning.java.controller;

import com.learning.java.LearningJavaApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by krvh271 on 1/9/18.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LearningJavaApplication.class)
@AutoConfigureMockMvc
public class ContactsControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testGetContactsAPI() throws Exception {
        mockMvc.perform(get("/contacts"))
                .andDo(print())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
    }

    @Test
    public void testGetContacts() throws Exception {
        mockMvc.perform(get("/contacts"))
                .andDo(print())
                .andExpect(status().isOk());
    }


}