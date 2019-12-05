package test.todo;

import java.util.List;

import org.evosuite.runtime.mock.StaticReplacementMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class TodoController {
    private final TodoService todoService;

    @GetMapping
    public List<Todo> index() {
        return todoService.findAll();
    }
}
