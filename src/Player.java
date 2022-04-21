public class Player {
        private String FirstName;
        private String LastName;

        public Player () {
            FirstName = "unknown";
            LastName = "unknown";
        }

        public Player(String FirstName, String LastName) {
            this.FirstName = FirstName;
            this.LastName = LastName;
        }

        public String toString() {
            return FirstName + LastName;
        }
    }



