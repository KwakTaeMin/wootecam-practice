package lotto;

import java.util.Collections;
import java.util.List;

public class Lotto {

	public static final int LOTTO_PRICE = 1000;
	public static final int LOTTO_NUMBER_SIZE = 6;

	private List<LottoNumber> numbers;

	public Lotto(List<LottoNumber> numbers) throws Exception {
		validate(numbers);
		this.numbers = numbers;
	}

	public List<LottoNumber> getLottoNumbers() {
		return this.numbers;
	}

	public boolean containNumber(LottoNumber number) {
		return this.numbers.contains(number);
	}

	@Override
	public String toString() {
		return this.numbers.toString();
	}

	@Override
	public boolean equals(Object lotto) {
		if (lotto instanceof Lotto) {
			Lotto anotherLotto = (Lotto)lotto;
			Collections.sort(this.numbers);
			Collections.sort(anotherLotto.getLottoNumbers());
			return this.numbers == anotherLotto.getLottoNumbers();
		}
		return false;
	}

	private void validate(List<LottoNumber> numbers) throws Exception {
		if (numbers.size() > LOTTO_NUMBER_SIZE) {
			throw new Exception("6개 보다 크다");
		}
	}
}
