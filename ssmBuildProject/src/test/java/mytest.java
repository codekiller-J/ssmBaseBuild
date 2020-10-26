import com.alex.pojo.Books;
import com.alex.service.BookService;
import com.alex.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {



    @Test
    public  void test(){
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService)context.getBean("BookServiceImpl");
        for (Books books:bookServiceImpl.queryAllBook()){
            System.out.println(books);
        }
    }
}
