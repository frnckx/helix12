public class Actor {
    private int id;
    private String firstName;
    private String lastName;
    private String  lastUpdate;

    public Actor() {
    }

    public Actor(int id, String firstName, String lastName, String lastUpdate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lastUpdate='" + lastUpdate + '\'' +
                '}';
    }
}
