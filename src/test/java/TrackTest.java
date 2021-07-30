import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
class TrackTest {

    @Test
    public void track_shouldBeCreated() {
        Track track = new Track();
        assertThat(track).isNotNull();
    }

}
