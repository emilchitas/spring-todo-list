package org.learn.service;

import org.learn.model.TodoData;
import org.learn.model.TodoItem;

public interface TodoItemService {
    void addItem(TodoItem toAdd);

    void removeItem(int id);

    TodoItem getItem(int id);

    void updateItem(TodoItem toUpdate);

    TodoData getData();

}
