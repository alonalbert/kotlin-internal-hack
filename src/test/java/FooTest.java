import org.junit.jupiter.api.Test;

public class FooTest {
    @Test
    public void test() {
        Foo foo = new Foo();
        foo.publicFunction();
        foo.internalFunction$foo();
    }
}
