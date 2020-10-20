import com.hdxy.entity.User;
import com.hdxy.service.serviceimpl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * @author wzh
 * @Description
 * @create 2020-10-19 23:44
 */
public class MyTest {
    @Test
    public void test1(){
        ApplicationContext cpx = new ClassPathXmlApplicationContext("classpath:appliactionContext.xml");
        UserServiceImpl bean = cpx.getBean(UserServiceImpl.class);
        ArrayList<User> allUsers = bean.getAllUsers();
        for (User allUser : allUsers) {
            System.out.println(allUser);
        }
    }
    @Test
    public void testgetUserById(){
        ApplicationContext cpx = new ClassPathXmlApplicationContext("classpath:appliactionContext.xml");
        UserServiceImpl bean = cpx.getBean(UserServiceImpl.class);
        User userById = bean.getUserById(2);
        System.out.println(userById);

    }
    @Test
    public void test2(){
        ApplicationContext cpx = new ClassPathXmlApplicationContext("classpath:appliactionContext.xml");
        String[] name = cpx.getBeanDefinitionNames();
        for (String s : name) {
            System.out.println(s);
        }
    }
}
