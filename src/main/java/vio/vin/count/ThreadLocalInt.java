package vio.vin.count;

public class ThreadLocalInt {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static void set(int value) {
        threadLocal.set(value);
    }

    public static int get() {
        return threadLocal.get();
    }

    public static void remove() {
        threadLocal.remove();
    }
}

