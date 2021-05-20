package lotto;

public class LottoNumber implements Comparable<LottoNumber> {

	public static final int MIN_LOTTO_NUMBER = 1;
	public static final int MAX_LOTTO_NUMBER = 45;

	private int number;

	public LottoNumber(int number) throws Exception {
		validateNumber(number);
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return String.valueOf(this.number);
	}

	@Override
	public boolean equals(Object lottoNumber) {
		if (!(lottoNumber instanceof LottoNumber)) {
			return false;
		}
		if (((LottoNumber)lottoNumber).getNumber() == this.number) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(LottoNumber lottoNumber) {
		if (this.number < lottoNumber.getNumber()) {
			return -1;
		} else if (this.number > lottoNumber.getNumber()) {
			return 1;
		}
		return 0;
	}

	private void validateNumber(int number) throws Exception {
		if (number > MAX_LOTTO_NUMBER || number < MIN_LOTTO_NUMBER) {
			throw new Exception("로또 번호는 1보다 작거나 45보다 클 수 없습니다.");
		}
	}

}

