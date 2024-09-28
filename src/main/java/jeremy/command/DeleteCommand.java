package jeremy.command;

import jeremy.exception.InvalidTaskNumberException;
import jeremy.exception.TaskNotFoundException;
import jeremy.util.Storage;
import jeremy.util.TaskList;
import jeremy.util.Ui;

public class DeleteCommand extends Command {
    private final String argument;

    public DeleteCommand(String argument) {
        this.argument = argument;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws TaskNotFoundException, InvalidTaskNumberException {
        tasks.deleteTask(argument);
    }
}
