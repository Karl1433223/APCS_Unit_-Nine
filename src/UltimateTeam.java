import java.util.ArrayList;

public class UltimateTeam {
    private ArrayList<UltimatePlayer> players;
    private ArrayList<Coach> coaches;

    public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches) {
        this.players = players;
        this.coaches = coaches;
    }

    public String getCutters() {
        String cutterslist = " " ;
        for (UltimatePlayer player : players) {
            if (player.getPosition().equals("cutter")) {
                cutterslist += player.toString() + "\n\n ";
            }
        }
        return cutterslist;
    }

    public String getHandlers() {
        String handlerslist = "";
        for (UltimatePlayer player : players) {
            if (player.getPosition().equals("handler")) {
                handlerslist += player.toString() + "\n\n";
            }
        }
        return handlerslist;
    }

    public String toString() {
        String ACoaches = "COACHES";
        String APlayers = "PLAYERS";
        for (Coach coach : coaches) {
            ACoaches += coach.toString() + "\n\n";
        }

        for (UltimatePlayer player : players) {
            APlayers += player.toString() + "\n" + "\n";
        }
        return ACoaches + APlayers;

    }



}





