package com.project.nyvia380.common.user.group;

import com.project.nyvia380.common.user.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Group {

    private String groupName;
    private User groupLeader;
    private int userCount;
    private String groupDescription;
}
