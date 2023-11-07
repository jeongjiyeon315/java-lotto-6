package lotto.domain;

import lotto.util.Constants;
import lotto.util.Validator;

public class TicketAmount {
    private final int amount;

    public TicketAmount(String money) {
        int purchaseAmount = Integer.parseInt(money);
        validateMoney(purchaseAmount);
        this.amount = purchaseAmount;
    }

    public int calculateTicketAmount() {
        return amount / Constants.LOTTO_MIN_AMOUNT;
    }

    private static void validateMoney(int money) {
        Validator.validateNonDivisibility(money);
    }
}
