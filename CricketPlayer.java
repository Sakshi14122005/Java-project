package code;
import java.util.Scanner;

class CricketPlayer {
    String name;
    int innings;
    int notOut;
    int runs;
    double average;

    CricketPlayer(String name, int innings, int notOut, int runs) {
        this.name = name;
        this.innings = innings;
        this.notOut = notOut;
        this.runs = runs;
        this.average = 0;
    }

    static void calculateAverage(CricketPlayer player) {
        int outs = player.innings - player.notOut;
        if (outs == 0) {
            player.average = player.runs; 
        } else {
            player.average = (double) player.runs / outs;
        }
    }

    static void sortPlayers(CricketPlayer[] players, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (players[i].average < players[j].average) {
                  
                    CricketPlayer temp = players[i];
                    players[i] = players[j];
                    players[j] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println(name + " - Innings: " + innings + ", NotOut: " + notOut +
                ", Runs: " + runs + ", Average: " + String.format("%.2f", average));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for player " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Innings: ");
            int innings = sc.nextInt();
            System.out.print("Not Outs: ");
            int notOut = sc.nextInt();
            System.out.print("Runs: ");
            int runs = sc.nextInt();
            sc.nextLine(); 
            players[i] = new CricketPlayer(name, innings, notOut, runs);
            calculateAverage(players[i]);
        }

        sortPlayers(players, n);

        System.out.println("\nPlayers sorted by batting average:");
        for (int i = 0; i < n; i++) {
            players[i].display();
        }

        sc.close();
    }
}
