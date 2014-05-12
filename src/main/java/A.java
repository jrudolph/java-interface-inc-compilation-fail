public interface A { // change this to `abstract class` to see the compile failure
    public static final A x = new B();
}
