package lotto.Validator;

import static lotto.error.ErrorCode.BONUS_NUMBER_DUPLICATE;
import static lotto.error.ErrorCode.INVALID_BONUS_NUMBER_RANGE;

import java.util.List;

public class BonusNumberValidator {
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;

    public static void validateBonusNumber(int bonusNumber, List<Integer> winningNumbers) {
        if (winningNumbers.contains(bonusNumber)) {
            throw new IllegalArgumentException(BONUS_NUMBER_DUPLICATE.getMessage());
        }
        if (bonusNumber < MIN_NUMBER || bonusNumber > MAX_NUMBER) {
            throw new IllegalArgumentException(INVALID_BONUS_NUMBER_RANGE.getMessage());
        }
    }
}