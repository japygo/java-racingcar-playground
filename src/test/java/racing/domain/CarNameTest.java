package racing.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {

    @Test
    @DisplayName("이름을 생성한다")
    void create() {
        CarName carName = new CarName("test");
        assertThat(carName).isEqualTo(new CarName("test"));
    }

    @Test
    @DisplayName("이름은 값이 존재해야 합니다")
    void valid_empty() {
        assertThatThrownBy(() -> {
            new CarName("");
        }).isInstanceOf(IllegalArgumentException.class);
        assertThatThrownBy(() -> {
            new CarName(null);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("이름은 5자를 초과할 수 없다")
    void valid_size() {
        assertThatThrownBy(() -> {
            new CarName("test test");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}