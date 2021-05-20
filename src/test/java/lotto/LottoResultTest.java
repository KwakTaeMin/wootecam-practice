package lotto;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LottoResultTest {

	LottoResult lottoResult;
	LottoUser lottoUser;

	@BeforeEach
	void setUp() throws Exception {
		lottoUser = new LottoUser();
		lottoUser.buyLottos(10000);
		List<Lotto> userLottos = lottoUser.getUserLottos();
		List<LottoNumber> winningLottoNumber = new ArrayList<>();
		winningLottoNumber.add(new LottoNumber(1));
		winningLottoNumber.add(new LottoNumber(2));
		winningLottoNumber.add(new LottoNumber(3));
		winningLottoNumber.add(new LottoNumber(4));
		winningLottoNumber.add(new LottoNumber(5));
		winningLottoNumber.add(new LottoNumber(6));
		Lotto winningLotto = new Lotto(winningLottoNumber);
		lottoResult = new LottoResult(winningLotto, userLottos);
	}

	@Test
	public void getLottoResultTest() throws Exception {
		//lottoResult.;
	}
}
