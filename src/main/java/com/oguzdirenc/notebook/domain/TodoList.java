package com.oguzdirenc.notebook.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;

import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Document
@Builder
public class TodoList {

    public TodoList(UUID todoListId, String todoListName, String todoListDescription, List<UUID> userIdList) {
        this.todoListId = todoListId;
        this.todoListName = todoListName;
        this.todoListDescription = todoListDescription;
        this.userIdList = userIdList;
    }

    public TodoList() {
    }

    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private UUID todoListId;

    @NotBlank(message = "Todo list name cannot be blank")
    private String todoListName;

    private String todoListDescription;

    private List<UUID> userIdList;

}
