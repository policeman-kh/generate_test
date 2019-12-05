package test.todo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
public class Todo {
    private Integer id;
    private String text;
}
