package lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoUser {

	private final List<Lotto> lottos;

	public LottoUser() {
		this.lottos = new ArrayList<>();
	}

	public void buyLottos(int price) throws Exception {
		int lottoCount = price / Lotto.LOTTO_PRICE;
		for (int count = 1; count <= lottoCount; count++) {
			this.lottos.add(LottoGenerator.generate());
		}
	}

	public List<Lotto> getUserLottos() {
		return this.lottos;
	}
}
