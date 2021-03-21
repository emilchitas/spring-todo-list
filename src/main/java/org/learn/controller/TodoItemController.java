package org.learn.controller;

import org.learn.model.TodoData;
import org.learn.model.TodoItem;
import org.learn.service.TodoItemService;
import org.learn.util.Mappings;
import org.learn.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.time.LocalDate;

@Controller
public class TodoItemController {

    private final TodoItemService todoItemService;

    @Autowired
    public TodoItemController(TodoItemService todoItemService) {
        this.todoItemService = todoItemService;
        todoData().addItem(new TodoItem("fourth","fourth details", LocalDate.now()));
    }

    @ModelAttribute("todoData")
    public TodoData todoData() {
        return todoItemService.getData();
    }

    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }
}
