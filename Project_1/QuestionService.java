import java.util.Scanner;

public class QuestionService {
    Questions[] ques = new Questions[5];
    String choosed[] = new String[5];

    public QuestionService() {
        ques[0] = new Questions(1, "Who is PM of India ?", "Yogi Adityanath", "Narendra Modi", "Rajnath Singh",
                "Amit Shah", "Narendra Modi");
        ques[1] = new Questions(2, "What is the vaule of 2%2 ?", "0", "1", "2", "4", "0");
        ques[2] = new Questions(3, "Area of rectangle ?", "length * breadth", "length * diagonal", "breadth / length",
                "diagonal / breadth", "length * breadth");
        ques[3] = new Questions(4, "Longest river ?", "Ganga", "Yamuna", "Saraswati", "Neel", "Neel");
        ques[4] = new Questions(5, "Smallest Country ?", "USA", "Egypt", "England", "Vertican City", "Vertican City");
    }

    public void playQuiz() {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        for (Questions q : ques) {
            System.out.println("Question " + q.getId() + " :");
            System.out.println(q.getQuestion());
            System.out.println("a) " + q.getOpt1());
            System.out.println("b) " + q.getOpt2());
            System.out.println("c) " + q.getOpt3());
            System.out.println("d) " + q.getOpt4());

            System.out.print("Choose your option (a/b/c/d): ");
            String choice = sc.nextLine().trim().toLowerCase();

            // Map choice to the actual option text
            switch (choice) {
                case "a":
                    choosed[i] = q.getOpt1();
                    break;
                case "b":
                    choosed[i] = q.getOpt2();
                    break;
                case "c":
                    choosed[i] = q.getOpt3();
                    break;
                case "d":
                    choosed[i] = q.getOpt4();
                    break;
                default:
                    System.out.println("Invalid choice, counting as blank.");
                    choosed[i] = "";
            }
            i++;
        }
    }

    public void printScore() {
        int pts = 0;
        for (int i = 0; i < ques.length; i++) {
            if (choosed[i].equalsIgnoreCase(ques[i].getAns())) {
                pts++;
            }
        }
        System.out.println("Your Score is = " + pts + "/" + ques.length);
    }

}
