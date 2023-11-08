package lotto.domain;

import java.util.List;
import lotto.util.Validator;

public class BonusNumber {
    private final int bonus;
    public BonusNumber(WinningNumber winningNumber, String number) {
        Validator.validateInput(number);
        int bonusNumber = Integer.parseInt(number);
        validateBonusNumber(winningNumber.getLotto().getNumbers(), bonusNumber);

        this.bonus = bonusNumber;
    }

    private static void validateBonusNumber(List<Integer> lotto, int bonus) {
        Validator.validateInputIsNatural(bonus);
        Validator.validateInputRange(bonus);
        Validator.validateBonusNumberInLotto(lotto, bonus);
    }

    public int getBonus() {
        return bonus;
    }
}
