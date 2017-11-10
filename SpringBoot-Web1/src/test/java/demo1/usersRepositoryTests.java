package demo1;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.project.Application;
import com.demo.project.po.Users;
import com.demo.project.po.UsersRepository;

@RunWith(SpringRunner.class)//运行Junit并支持Spring-test特性
@TestPropertySource(locations = {"classpath:application-test.properties"}) //引入对应的测试配置文件
//@SpringBootTest为springApplication创建上下文并支持SpringBoot特性
@SpringBootTest(classes=Application.class) //指明@SpringBootApplication对应的框架入口
public class usersRepositoryTests {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Test
	public void test() throws Exception {
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);        
//		String formattedDate = dateFormat.format(date);
//		//保存数据
//		usersRepository.save(new Users("test1", "test@126.com", "test", "test123456",formattedDate));
		List<Users> list = usersRepository.findAll();//查询全部
		System.out.println("查询到的会员数量："+list.size());
	}
}
