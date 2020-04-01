package テスト;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class GreetingTest {
    private Greeting target = new Greeting();

    @Test
    public void getMessage_朝開始() {
        String message = this.target.getMessage(5);
        assertThat(message, is("おはようございます"));
    }

}
