public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener ErrorListener = System.out::println;

        Worker worker = new Worker(listener, ErrorListener);
        worker.start();
    }
}
