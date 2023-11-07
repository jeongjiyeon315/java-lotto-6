package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private InputView() {
    }

    public static String inputMoney() {
        return Console.readLine();
    }


    public static String inputLottoNumbers() {
        return Console.readLine();
    }

    public static String inputBonusNumber() {
        return Console.readLine();
    }
}
