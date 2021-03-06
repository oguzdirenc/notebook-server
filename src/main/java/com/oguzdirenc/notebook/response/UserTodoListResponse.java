package com.oguzdirenc.notebook.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@Builder
public class UserTodoListResponse {

    String todoListId;
    String todoListHeader;
    String todoListDescription;
    Set<String> usernameList;
    Integer listItemCount;

    public UserTodoListResponse() {
    }

    public UserTodoListResponse(String todoListId, String todoListHeader, String todoListDescription, Set<String> usernameList, Integer listItemCount) {
        this.todoListId=todoListId;
        this.todoListHeader = todoListHeader;
        this.todoListDescription = todoListDescription;
        this.usernameList = usernameList;
        this.listItemCount = listItemCount;
    }
}