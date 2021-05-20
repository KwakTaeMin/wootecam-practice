package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoGenerator {

	private LottoGenerator() {
	}

	public static Lotto generate() throws Exception {
		List<LottoNumber> allNumbers = getAllLottoNumbers();
		shuffleAllNumbers(allNumbers);
		return getAutoLotto(allNumbers);
	}

	private static List<LottoNumber> getAllLottoNumbers() throws Exception {
		List<LottoNumber> allNumbers = new ArrayList<>();
		int number = LottoNumber.MIN_LOTTO_NUMBER;
		while (number < LottoNumber.MAX_LOTTO_NUMBER) {
			LottoNumber lottoNumber = new LottoNumber(number);
			allNumbers.add(lottoNumber);
			number++;
		}
		return allNumbers;
	}

	private static void shuffleAllNumbers(List<LottoNumber> allNumbers) {
		Collections.shuffle(allNumbers);
	}

	private static Lotto getAutoLotto(List<LottoNumber> allNumbers) throws Exception {
		return new Lotto(allNumbers.subList(0, Lotto.LOTTO_NUMBER_SIZE));
	}

}
