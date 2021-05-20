package lotto;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class LottoGeneratorTest {

	@Test
	public void generateLottoTest() throws Exception {
		Lotto lotto = LottoGenerator.generate();
		assertThat(lotto).isNotNull();

	}
}
