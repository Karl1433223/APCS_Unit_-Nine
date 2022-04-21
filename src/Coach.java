public class Coach extends Player {
        private String role;

        public Coach() {
            super();
            role = "coach";
        }

        public Coach(String firstName, String lastName, String role) {
            super(firstName, lastName);
            this.role = role;
        }

        public String toString() {
            return "Role: " + role;
        }

    }
