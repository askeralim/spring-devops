package com.monogo.demo.model;

import java.io.Serializable;

public class GroupMemberPrimaryKey implements Serializable {

    private String userId;

    private String groupId;

    public GroupMemberPrimaryKey(String userId, String groupId) {
        this.userId = userId;
        this.groupId = groupId;
    }

    public String getUserId() {
        return userId;
    }

    public String getGroupId() {
        return groupId;
    }
}
