package org.learn.controller;

import org.learn.model.TodoData;
import org.learn.util.Mappings;
import org.learn.util.ViewNames;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller

public class TodoItemController {

    @ModelAttribute
    public TodoData todoData() {
        return new TodoData();
    }

    @GetMapping(Mappings.ITEMS)
    public String items() {
        return ViewNames.ITEMS_LIST;
    }
}
