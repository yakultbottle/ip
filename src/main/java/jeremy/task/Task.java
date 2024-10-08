package jeremy.task;

/**
 * Represents an abstract task with a description and a completion status.
 * This class serves as the base class for specific task types such as {@code Todo}, {@code Deadline}, and {@code Event}.
 */
public abstract class Task {
    protected final String description;
    protected final String icon;
    protected boolean isDone;

    protected Task(String description, String icon) {
        this.description = description;
        this.icon = icon;
        this.isDone = false;
    }

    public boolean contains(String argument) {
        return this.description.contains(argument);
    }

    /**
     * Returns the status icon representing whether the task is completed.
     *
     * @return "X" if the task is completed, otherwise a blank space.
     */
    private String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    /**
     * Returns whether the task is marked as completed.
     *
     * @return {@code true} if the task is completed, {@code false} otherwise.
     */
    public boolean isDone() {
        return this.isDone;
    }

    /**
     * Marks the task as completed.
     */
    public void markDone() {
        this.isDone = true;
    }

    /**
     * Marks the task as not completed.
     */
    public void markNotDone() {
        this.isDone = false;
    }

    /**
     * Returns a string representation of the task.
     * This includes the completion status icon and the task description.
     *
     * @return A string in the format "[ ] description" or "[X] description".
     */
    public String toString() {
        return "[" + getStatusIcon() + "] " + description;
    }

    /**
     * Returns a string representation of the task formatted for storage.
     * This method is intended to be overridden by subclasses to store their specific data.
     *
     * @return An empty string by default, to be implemented by subclasses.
     */
    public String toStorageString() {
        return "";
    }
}
