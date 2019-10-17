package com.monogo.demo.repository;

import com.monogo.demo.DemoApplication;
import com.monogo.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void shouldSaveTheUser() throws Exception {
        String userId = UUID.randomUUID().toString();
        User user = new User(userId,"Asker","","",User.Type.USER);

        repository.save(user);

        User actualUser = repository.findOne(userId);
        assertThat(actualUser.getId()).isEqualTo(userId);
    }

    @Test
    public void shouldReturnAllUsers() throws Exception {
        String userId = UUID.randomUUID().toString();
        User user = new User(userId,"Asker","","",User.Type.USER);

        repository.save(user);

//        Map<String, List<String>> actualCategory = repository.groupByName("2");
//        assertThat(actualCategory.get(0).getId()).isEqualToComparingFieldByField(key);

    }
}