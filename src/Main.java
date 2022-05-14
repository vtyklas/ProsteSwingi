
public class Main {

    public static void main(String[] args) throws InterruptedException {
        StringTask task = new StringTask("ABC", 300000);
        System.out.println("Task " + task.getStatus());
        task.start();
        if (args.length > 0 && args[0].equals("abort")) {
            new Thread(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }task.abort();
            }).start();
        }
        while (!task.isDone()) {
            Thread.sleep(500);
            switch(task.getStatus()) {
                case RUNNING: System.out.print("R."); break;
                case ABORTED: System.out.println(" ... aborted."); break;
                case READY: System.out.println(" ... ready."); break;
                default: System.out.println("uknown state");
            }

        }
        System.out.println("Task " + task.getStatus());
        System.out.println(task.getResult().length());
        System.out.println(task.getResult().substring(0,task.getTxt().length()));
    }

}