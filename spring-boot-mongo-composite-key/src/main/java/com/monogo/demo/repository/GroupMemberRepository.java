package com.monogo.demo.repository;

import com.monogo.demo.model.GroupMember;
import com.monogo.demo.model.GroupMemberPrimaryKey;
import com.monogo.demo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupMemberRepository extends MongoRepository<GroupMember, GroupMemberPrimaryKey> {
    @Query("{ 'id.groupId' : ?0 }")
    List<GroupMember> findByGroupId(String groupId);
}
