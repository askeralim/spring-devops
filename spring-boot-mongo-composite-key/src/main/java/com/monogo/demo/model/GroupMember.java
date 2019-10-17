package com.monogo.demo.model;


import org.springframework.data.annotation.Id;

import java.util.Date;

public class GroupMember {

    @Id
    private GroupMemberPrimaryKey id;

    private Date joiningDate;

    public GroupMember(GroupMemberPrimaryKey id, Date joiningDate) {
        this.id = id;
        this.joiningDate = joiningDate;
    }

    public GroupMemberPrimaryKey getId() {
        return id;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }
}
