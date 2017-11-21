import org.junit.Test;

public class FailureTest {

    @Test
    public void shouldFailed() {
        throw new RuntimeException();
    }

}