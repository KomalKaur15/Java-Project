import java.util.Scanner;

class MovieTicketBooking {

    private String movie_name;
    private String theter_name;
  
    private int cost;

    void movies_list() {
      
        System.out.println("The movies available are:-");
        System.out.println(" 1. Frozen II --------- Rs.120 \n 2. Toy Story 4 ------- Rs.140 \n 3. Mission Mangal ---- Rs.150 \n 4. Dangal ------------ Rs.170 \n ");
      
      
    }

}

class theater extends MovieTicketBooking {
private int total_tickets;
    void th() {
        System.out.println("**The theaters available are:- \n 1. Malhaar Theater \n 2. Aarti Theater");
        int u;
        int up;
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        if (c == 1) {
            System.out.println("**Malhaar Theater**");
            System.out.println("**Select a movie**");
            System.out.println("Movies available are:- \n 1. Frozen II \n 2. Toy Story 4 ");
            Scanner a = new Scanner(System.in);
            int f = a.nextInt();
            if (f == 1) {
                System.out.println("Frozen II movie @ Malhaar Theater");
                System.out.println("Enter the number of tickets to be booked - ");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int remaining= total_tickets-r;
                int amount=120*r;
                System.out.println("To continue to book for this movie press 1");
                Scanner d = new Scanner(System.in);
                int g = d.nextInt();
                System.out.println("\n\n\n");
                if (g == 1) {
                    System.out.println("******************");
                    System.out.println("Theater ------------------- Malhaar Theater");
                    System.out.println("Movie --------------------- Frozen II");
                    System.out.println("Cost ---------------------- Rs."+amount);
                    System.out.println("******************");
                }

            }
            if (f == 2) {
                System.out.println("Toy Story 4 @Malhaar Theater");
                 System.out.println("Enter the number of tickets to be booked - ");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int remaining= total_tickets-r;
                int amount=140*r;
                System.out.println("To continue to book for this movie press 1");
                Scanner d = new Scanner(System.in);
                int g = d.nextInt();
                System.out.println("\n\n\n");
                if (g == 1) {
                    System.out.println("******************");
                    System.out.println("Theater ------------------- Malhaar Theater");
                    System.out.println("Movie --------------------- Toy Story 4");
                    System.out.println("Cost ---------------------- Rs"+amount);
                    System.out.println("******************");
                }

            }

        }
        if (c == 2) {
            System.out.println("**Aarti Theater**");
            System.out.println("**Select a movie**");
            System.out.println("Movies available are:- \n 1. Mission Mangal \n 2. Dangal");
            Scanner a = new Scanner(System.in);
            int p = a.nextInt();
            if (p == 1) {
                System.out.println("Mission Mangal @ Aarti Theater");
                 System.out.println("Enter the number of tickets to be booked - ");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int remaining= total_tickets-r;
                int amount=150*r;
                System.out.println("To continue to book for this movie press 1");
                Scanner d = new Scanner(System.in);
                int g = d.nextInt();
                System.out.println("\n\n\n");
                if (g == 1) {
                    System.out.println("******************");
                    System.out.println("Theater ------------------- Aarti Theater");
                    System.out.println("Movie --------------------- Mission Mangal");
                    System.out.println("Cost ---------------------- Rs."+amount);
                    System.out.println("******************");
                }

            }
            if (p == 2) {
                System.out.println("Dangal @Aarti Theater");
                 System.out.println("Enter the number of tickets to be booked - ");
                Scanner j = new Scanner(System.in);
                int r = j.nextInt();
                int remaining= total_tickets-r;
                int amount=170*r;
                System.out.println("To continue to book for this movie press 1");
                Scanner d = new Scanner(System.in);
                int g = d.nextInt();
                System.out.println("\n\n\n");
                if (g == 1) {
                    System.out.println("******************");
                    System.out.println("Theater ------------------- Aarti Theater");
                    System.out.println("Movie --------------------- Dangal");
                    System.out.println("Cost ---------------------- Rs."+amount);
                    System.out.println("******************");
                }

            }
        }

    }
}

public class Theater_Management_System {

    public static void main(String[] args) {
        MovieTicketBooking ob = new MovieTicketBooking();

        MovieTicketBooking[] moviename = new MovieTicketBooking[2];
        moviename[0] = ob;
        theater a = new theater();
        moviename[1] = a;

        System.out.println("\n---------------------------Welcome to Theater Management System----------------------------\n");
        System.out.println("---------1.List of movies and their prices--------- \n-------2.Access and book tickets through theaters---");

        System.out.println("\n*******************************************************************************************************************");
        Scanner d = new Scanner(System.in);
        int g = d.nextInt();
        switch (g) {
            case 1: {
                ob.movies_list();
                break;
            }
            case 2: {
              
                a.th();
            }
        }

    }

}
