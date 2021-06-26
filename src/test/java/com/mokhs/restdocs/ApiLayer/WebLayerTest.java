//package com.mokhs.restdocs.ApiLayer;
//
//import com.mokhs.restdocs.controller.HomeController;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultActions;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
//import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
//import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(HomeController.class)
//@AutoConfigureRestDocs
//public class WebLayerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void shouldDefaultMessage() throws Exception {
//
//        ResultActions resultActions = this.mockMvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(content().string(containsString("Hello World!")));
//
//        resultActions
//                .andDo(document("home", responseFields(
//                                fieldWithPath("message").description("The welcome message for the user."))
//                        )
//                );
//    }
//}
