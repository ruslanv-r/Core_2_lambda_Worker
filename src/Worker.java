public class Worker {

    OnTaskDoneListener callback;
    OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {

        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + (i + 1) + " is ERROR! Not complete!");
            } else {
                callback.onDone("Task " + (i + 1) + " is done");
            }
        }
    }
}
