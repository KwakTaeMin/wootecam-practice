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
		for (Lotto userLotto : userLottos) {
			compareLotto(userLotto);
		}
	}

	private void compareLotto(Lotto lotto) {
		List<LottoNumber> lottoNumbers = lotto.getLottoNumbers();
		for (LottoNumber lottoNumber : lottoNumbers) {
			this.winningLotto.containNumber(lottoNumber);
		}
	}
}
