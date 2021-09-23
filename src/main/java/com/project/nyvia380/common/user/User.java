package com.project.nyvia380.common.user;


import com.project.nyvia380.common.user.group.Group;
import com.project.nyvia380.common.user.roles.Roles;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
//@Setter
public class User {
    @Id
    private String userID;

    private String userName;

    @Indexed(direction = IndexDirection.ASCENDING)
    private Roles userRole;

    private List<Group> userGroups;

    public User(String userID, String userName) {
        this.userID = userID;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID='" + userID + '\'' +
                ", userName='" + userName + '\'' +
                ", userRole=" + userRole +
                ", userGroups=" + userGroups +
                '}';
    }

    public void addToUserGroups(Group group){
        userGroups.add(group);
    }

}
