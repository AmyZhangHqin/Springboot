package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import com.demo.project.Application;
import com.demo.project.controller.HelloController;

//测试时需要使用的相关注解
@RunWith(SpringRunner.class) 
@SpringBootTest(classes=Application.class) //指明@SpringBootApplication对应的框架入�?
public class HelloContrllerTest {
	
	private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
    }    
    //打开的src/test/下的测试入口，编写简单的http请求来测试；
    //使用mockmvc进行，利用MockMvcResultHandlers.print()打印出执行结果
    @Test
    public void getHello() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON))
        		.andExpect(status().isOk())
        		.andExpect(content().string("Hello World"));
    }

}
