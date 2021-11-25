import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class ApplicationTest {
    @Test
    @DisplayName("Given empty args list, when calling application, then do not throw exception")
    void applicationMainSucceed() {
        assertDoesNotThrow(() -> Application.main(new String[0]));
    }
}
