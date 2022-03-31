package work;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}