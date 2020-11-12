import com.qiao.pojo.Books;
import com.qiao.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void mybatisSpringTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService mapper = context.getBean("bookServiceImpl",BookService.class);
        List<Books> users = mapper.selectAllBooks();
        System.out.println(users);
    }
}
