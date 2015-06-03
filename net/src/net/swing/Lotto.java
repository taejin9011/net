package net.swing;

import java.util.Arrays;

public class Lotto {
	int[] lotto = new int[6];

	public int[] getLotto() {
		return lotto;
	}

	public void setLotto() {
		for (int i = 0; i < lotto.length; i++) {
			int ran = (int) ((Math.random() * 45) + 1);
			boolean exist = false;

			for (int j = 0; j < lotto.length; j++) {
				exist = false;
				if(lotto[i]==lotto[j]){
				if (exist) {
					i--;
					continue;
				} else {
					lotto[i] = ran;
				}
				}
			}
		}
		Arrays.sort(lotto);
	}

	public void sort(int[] array) {
		
	}
}
