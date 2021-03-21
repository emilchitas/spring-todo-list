package org.learn.service;

import lombok.Getter;
import lombok.NonNull;
import org.learn.model.TodoData;
import org.learn.model.TodoItem;
import org.springframework.stereotype.Service;

@Service
public class TodoItemServiceImpl implements TodoItemService{

    @Getter
    private final TodoData data =new TodoData();

    @Override
    public void addItem(@NonNull TodoItem toAdd) {
        data.addItem(toAdd);
    }

    @Override
    public void removeItem(int id) {
    data.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem toUpdate) {
        data.updateItem(toUpdate);
    }

}
