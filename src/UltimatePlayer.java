public class UltimatePlayer extends Player {
        private static int jerseyNumber;
        private int jersey;
        private String position;

        public UltimatePlayer() {
            super();
            jersey = 0;
            position = "handler";
        }

        public UltimatePlayer(String firstName, String lastName, String position) {
            super(firstName, lastName);
            if (!(position.equals("handler") && position.equals("cutter")) ){
                this.position = "handler";
            }
            else {
                this.position = position;
            }

        }

        public String getPosition() {
            return position;
        }

        public String toString() {
            return super.toString() + "   Jersey : " + jersey +" Position: " + position;


        }



    }