import org.junit.Ignore;
import org.junit.Test;

public class FailureTest {

    @Test
    @Ignore
    public void shouldFailed() {
        throw new RuntimeException();
    }

}