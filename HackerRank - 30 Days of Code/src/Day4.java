import java.util.*;

public class Day4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            for(int i = 0; i < T; i++) {
                int age = sc.nextInt();
                person p = new person(age);

                p.amIOld();

                // After passing three years, age will be:
                for (int j = 0; j < 3; j++) {
                    p.yearPasses();
                }

                p.amIOld();
                System.out.println();
            }
        }
    }

    class person {
        int age;

        public person(int initialAge) {
            if(initialAge < 0) {
                this.age = 0;
                System.out.println("Age is not valid, setting age to 0.");
            }
            this.age = initialAge;
        }

        void yearPasses() {
            age++ ;
        }

        void  amIOld() {
            if(this.age < 13) {
                System.out.println("You are young.");
            }
            else if(this.age >= 13 && this.age < 18) {
                System.out.println("You are a teenager.");
            }
            else {
                System.out.println("You are old.");
            }
        }
}