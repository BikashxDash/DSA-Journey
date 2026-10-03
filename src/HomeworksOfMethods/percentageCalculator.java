package HomeworksOfMethods;

public class percentageCalculator {

    static double calculatePercentage(int obtained,int total) {
        return (obtained * 100.0) / total;
    }

    static void main() {

        int obtained = 450;
        int total= 600;

        double percentage = calculatePercentage(obtained, total);

        System.out.println("Percentage: " + percentage + "%");

    }

}
