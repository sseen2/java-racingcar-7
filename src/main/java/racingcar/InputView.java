package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class InputView {
    public static List<String> inputCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String inputString = Console.readLine();
        ExceptionHandler.validateNullInputString(inputString);
        return Arrays.stream(inputString.split(","))
                .toList();
    }

    public static int inputTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String inputNumber = Console.readLine().trim();
        ExceptionHandler.validateNullInputString(inputNumber);
        return ExceptionHandler.parseIntOrThrow(inputNumber);
    }
}