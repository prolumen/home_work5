package lesson;

public interface Calculate <T extends Number> {
    public T exec (T var1, T var2);

    default Double getSum(T var1, T var2){
        return var1.doubleValue()
                + var2.doubleValue()
                + 1;
    }

    default T getSum2 (T var1, T var2){
        return exec(var1, var2);
    }

}
