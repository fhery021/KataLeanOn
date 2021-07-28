import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    public void demoRun_shouldReturn1() {
        org.assertj.core.api.Assertions.assertThat(Demo.run()).isEqualTo(1);
    }

}