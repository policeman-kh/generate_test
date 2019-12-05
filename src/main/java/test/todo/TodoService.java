package test.todo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class TodoService {

    public List<Todo> findAll() {
        final List<Todo> list = new ArrayList<>();
        list.add(Todo.builder().id(1).text("1").build());
        list.add(Todo.builder().id(2).text("2").build());
        return list;
    }

    public int create(Todo todo) {
        throw new IllegalStateException("Not implemented.");
    }
}
