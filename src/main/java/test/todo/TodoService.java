package test.todo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.evosuite.runtime.mock.StaticReplacementMethod;
import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class TodoService {
    /**
     * Responds dummy data list to find all.
     */
    public List<Todo> findAll() {
        final List<Todo> list = new ArrayList<>();
        list.add(new Todo(1, "1"));
        list.add(new Todo(2, "2"));
        return list;
    }

    /**
     * Output todo data to temporary file as dummy.
     */
    public int create(Todo todo) {
        return createLocal(todo);
    }

    @StaticReplacementMethod
    public static int createLocal(Todo todo){
        try {
            final Path tmpPath = Files.createTempFile( "", ".test");
            final File tmpFile = tmpPath.toFile();
            try (FileWriter fw = new FileWriter(tmpFile, true)) {
                fw.write(todo.toString());
                fw.flush();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            tmpFile.delete();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 1;
    }
}
