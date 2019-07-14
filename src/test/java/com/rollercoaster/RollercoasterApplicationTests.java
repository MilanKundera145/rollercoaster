package com.rollercoaster;

import com.rollercoaster.entity.User;
import com.rollercoaster.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.bind.SchemaOutputResolver;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RollercoasterApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    public void contextLoads() {
    }

    @Test
    public void test(){
        List<User> users = userService.selectALL2();
        for (User user:users ){
            System.out.println(user);
        }
    }

}
