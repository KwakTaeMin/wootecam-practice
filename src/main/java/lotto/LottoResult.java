package lotto;

import java.util.List;

public class LottoResult {

	private Lotto winningLotto;
	private List<Lotto> userLottos;

	public LottoResult(Lotto winningLotto, List<Lotto> userLottos) {
		this.winningLotto = winningLotto;
		this.userLottos = userLottos;
	}

	private void compareUserLottos() {
		for (Lotto userLottoNumber : userLottos) {
			compareLotto(userLottoNumber);
		}
	}

	private void compareLotto(Lotto userLotto) {

	}
}
