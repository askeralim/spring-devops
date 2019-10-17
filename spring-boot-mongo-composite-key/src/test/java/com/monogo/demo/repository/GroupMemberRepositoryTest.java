package com.monogo.demo.repository;

import com.monogo.demo.DemoApplication;
import com.monogo.demo.model.GroupMember;
import com.monogo.demo.model.GroupMemberPrimaryKey;
import com.monogo.demo.model.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class GroupMemberRepositoryTest {

    @Autowired
    private GroupMemberRepository repository;

    @Before
    public void init() {
        repository.deleteAll();
    }

    @Test
    public void shouldSaveGroupMember() throws Exception {
        String userId = UUID.randomUUID().toString();
        GroupMemberPrimaryKey key = new GroupMemberPrimaryKey("asker","group1");
        GroupMember member = new GroupMember(key,new Date());

        repository.save(member);

        GroupMember actualUser = repository.findOne(key);
        assertThat(actualUser.getId().getGroupId()).isEqualTo("group1");

        List<GroupMember> memberList = repository.findByGroupId("group1");
        System.out.println(memberList.size());
        assertThat(memberList.size()).isEqualTo(1);
    }

//    @Test
//    public void shouldReturnAllUsers() throws Exception {
//        List<GroupMember> memberList = repository.findByGroupId("group1");
//        System.out.println(memberList.size());
//        assertThat(memberList.size()).isEqualTo(1);
//    }
}