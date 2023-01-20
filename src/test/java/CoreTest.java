import org.example.BootCamp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CoreTest {
    BootCamp bootCamp = new BootCamp();
    @Test
    void fistTest() {
        String result = bootCamp.WhoAmI();

        assertEquals("bootcamp", result );
    }
}
