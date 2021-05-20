package lotto;

import java.util.List;

public class LottoResult {

	private int threeMatches;
	private int fourMatches;
	private int fiveMatches;
	private int sixMatches;

	public LottoResult(Lotto winningLotto, List<Lotto> userLottos) {
		this.threeMatches = 0;
		this.fourMatches = 0;
		this.fiveMatches = 0;
		this.sixMatches = 0;
	}

	private void compareLotto(Lotto winningLotto, Lotto userLotto) {
		int mactchCount = 0;
		for (LottoNumber userLottoNumber : userLotto.getLottoNumbers()) {
			if(winningLotto.containNumber(userLottoNumber))
				mactchCount++;
		}

	}

	public int getThreeMatches() {
		return this.threeMatches;
	}

	public int getFourMatches() {
		return this.fourMatches;
	}

	public int getFiveMatches() {
		return this.fiveMatches;
	}

	public int getSixMatches() {
		return this.sixMatches;
	}

}
