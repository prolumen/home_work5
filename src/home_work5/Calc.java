package home_work5;

public interface Calc <T extends Number> {
    T exec (T var1, T var2);


    default Double getSumm(T var1, T var2){
        return var1.doubleValue() + var2.doubleValue();
    }

    default Double getDiff(T var1, T var2){
        return var1.doubleValue() - var2.doubleValue();
    }

    default Double getProd(T var1, T var2){
        return var1.doubleValue() * var2.doubleValue();
    }

    default Double getQuot(T var1, T var2){
        return var1.doubleValue() / var2.doubleValue();
    }

    default Double getSqrt (T var1){
        return Math.sqrt(var1.doubleValue());
    }
}
