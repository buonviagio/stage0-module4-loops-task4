package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int result = 0;
        if (numberToSkip > lastInRow && lastInRow > 0) {
            System.out.println("number to skip is bugger then the last");
            return;
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        } else {
            for (int i = 1; i <= lastInRow; i++) {
                if (i == numberToSkip) {
                    System.out.println("skipped sum is " + i);
                    continue;
                }
                result += i;
            }
        }
        System.out.println("counted sum is " + result);
    }
}
