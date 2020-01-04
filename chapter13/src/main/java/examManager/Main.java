package examManager;


import java.util.List;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {

		Function<List<Double>,Double> average = myScores -> {
			Double sum = 0d;
			for (Double nextScore : myScores) {
				sum += nextScore;
			}
			return (sum / myScores.size()) + 100;
		};

		Function<List<Double>,Double> highScore = myScores -> {
			Double highest = 0d;
			for (Double nextScore : myScores) {
				highest = Math.max(highest, nextScore);
			}
			return highest;
		};

		Function<List<Double>,Double> lowScore = myScores -> {
			Double lowest = myScores.get(0);
			for (Double nextScore : myScores) {
				lowest = Math.min(lowest, nextScore);
			}
			return lowest;
		};

		ExamManager examManager = new ExamManager();
		System.out.println ("The average score is " + examManager.customCalculation(average));
		System.out.println ("The highest score is " + examManager.customCalculation(highScore));
		System.out.println ("The lowest score is " + examManager.customCalculation(lowScore));
	}

}
