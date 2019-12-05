package test.testme;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

import test.todo.Todo;
import test.todo.TodoController;
import test.todo.TodoService;

public class TodoControllerTest {
    @Mock
    TodoService todoService;
    @InjectMocks
    TodoController todoController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testIndex() throws Exception {
        when(todoService.findAll()).thenReturn(Arrays.<Todo>asList(new Todo(Integer.valueOf(0), "text")));

        List<Todo> result = todoController.index();
        Assert.assertEquals(Arrays.<Todo>asList(new Todo(Integer.valueOf(0), "text")), result);
    }

    @Test
    public void testCreate() throws Exception {
        when(todoService.create(any())).thenReturn(0);

        Todo result = todoController.create(new Todo(Integer.valueOf(0), "text"));
        Assert.assertEquals(new Todo(Integer.valueOf(0), "text"), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme