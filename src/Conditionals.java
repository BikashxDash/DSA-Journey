public class Conditionals {
    static void main() {

//        if-else Statement

//        int dailyPractice = 12;
//
//        if(dailyPractice >= 10) {
//            System.out.println("Good consistency!");
//        }

//        int age = 18;
//        if(age > 10) {
//            System.out.println("You are eligible for vote");
//        }

//        if-else-if Ladder

//        int score = 42;
//
//        if (score >= 50) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");
//        }

//        int accuracy = 78;
//
//        if (accuracy >= 90) {
//            System.out.println("Excellent");
//            }
//        else if (accuracy >= 75) {
//            System.out.println("Good");
//            }
//        else if (accuracy >= 60) {
//            System.out.println("Average");
//            }
//        else {
//            System.out.println("Needs Improvement");
//        }

//        Nested if-else

//        boolean hasSubscription = true;
//        int solvedProblems = 220;
//
//        if (hasSubscription) {
//
//            if (solvedProblems >= 200) {
//                System.out.println("Unlock Advanced Sheet");
//            } else {
//                System.out.println("Practice More Problems");
//            }
//
//        } else {
//            System.out.println("Upgrade to Premium");
//        }

//        Ternary Operator

//        int streakDays = 35;
//
//        String status = (streakDays >= 30) ? "Consistent" : "Irregular";
//
//        System.out.println(status);

        int dayNumber = 3;

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
}
