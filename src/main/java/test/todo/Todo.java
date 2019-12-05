package test.todo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Todo {
    private Integer id;
    private String text;
}
