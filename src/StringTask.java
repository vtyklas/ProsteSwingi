
public class StringTask extends Thread implements Runnable {
    private String text;
    private int counter;
    private TaskState state;
    private String result = "";
    private static boolean isEnded;


    public StringTask(String text, int counter)
    {
        this.text = text;
        this.counter = counter;
        state = TaskState.CREATED;
        isEnded = false;
    }

    public enum TaskState
    {
        CREATED,RUNNING,ABORTED,READY
    }

    @Override
    public void run()
    {
        for (int i = 0; i < counter && !isEnded; i++) {
            result += text;

        }
        if(state.equals(TaskState.RUNNING)){
            state = TaskState.READY;
        }

    }

    public String getResult()
    {
        return result;
    }

    public void start(){
        Thread t = new Thread(this);
        this.state = TaskState.RUNNING;
        t.start();
    }

    public void abort()
    {
        this.state = TaskState.ABORTED;
        isEnded = true;
    }

    public boolean isDone()
    {
        if(state.equals(TaskState.READY) || state.equals(TaskState.ABORTED)){
            return true;
        }
        return false;
    }

    public TaskState getStatus(){
        return this.state;
    }

    public String getTxt(){
        return this.text;
    }

}