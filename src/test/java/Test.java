import com.lzx.pojo.Books;
import com.lzx.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public static void main(String[] args) {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) classPathXmlApplicationContext.getBean("BookServiceImpl");
        for (Books books : bookServiceImpl.queryAllBooks()) {
            System.out.println(books);
        }
    }

}
