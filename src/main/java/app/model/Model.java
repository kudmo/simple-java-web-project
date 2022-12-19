package app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import app.entities.Task;

public class Model {
    private static Model instance = new Model();

    private List<Task> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(Task user) {
        model.add(user);
    }

    public List<String> list() {
        return model.stream()
                .map(Task::toString)
                .collect(Collectors.toList());
    }
}
