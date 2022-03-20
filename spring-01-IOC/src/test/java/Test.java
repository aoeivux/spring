import com.aoeivux.dao.UserDaoImpl;
import com.aoeivux.dao.UserDaoOracleImpl;
import com.aoeivux.pojo.Hello;
import com.aoeivux.service.UserServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void TestHello(){
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.show();
    }


    @org.junit.Test
    public void testUserServiceImpl() {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoImpl());
        userService.getUser();

        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
}
