import java.lang.Math;

public class RewardValue {
    double cash;

    public RewardValue(double cashValue) {
        cash = cashValue;
    }

    public RewardValue(int milesValue) {
        cash = Math.round(milesValue * 0.0035 * 100.0) / 100.0;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return (int)(cash / 0.0035);
    }

}
