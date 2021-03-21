package org.learn.controller;

import lombok.extern.slf4j.Slf4j;
import org.learn.model.TodoData;
import org.learn.model.TodoItem;
import org.learn.service.TodoItemService;
import org.learn.util.AttributeNames;
import org.learn.util.Mappings;
import org.learn.util.ViewNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;

@Slf4j
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

    @GetMapping(Mappings.ADD_ITEM)
    public String addEditItem(Model model){
        TodoItem todoItem=new TodoItem("","",LocalDate.now());
        model.addAttribute(AttributeNames.TODO_ITEM,todoItem);
        return ViewNames.ADD_ITEM;
    }

    @PostMapping(Mappings.ADD_ITEM)
    public String processItem(@ModelAttribute(AttributeNames.TODO_ITEM) TodoItem todoItem){
        log.info("todoItem from form= {}", todoItem);
        todoItemService.addItem(todoItem);
        return "redirect:/"+Mappings.ITEMS;
    }
}
