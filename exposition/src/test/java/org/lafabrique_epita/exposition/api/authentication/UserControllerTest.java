package org.lafabrique_epita.exposition.api.authentication;

import org.junit.jupiter.api.Test;
import org.lafabrique_epita.application.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.lang.reflect.Executable;

@WebMvcTest
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserServiceImpl userService;

    @Test
    public void shouldRegisterValidUser() throws Exception {
        String jsonBody = """
                {
                    "username": "Fatiha",
                    "email": "Fatiha@gmail.com",
                    "password": "MotdePasse_123"
                }
                """;

        mockMvc.perform(
                MockMvcRequestBuilders.post("/register")
                        .contentType("application/json")
                        .content(jsonBody))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
