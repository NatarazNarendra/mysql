@FunctionalInterface
public interface TestInterface {
public abstract void show(int n);
//public abstract void show1(int n);
public static void hello() {
System.out.println("static method");
}
public default void test() {
System.out.println("default method");
}
}
