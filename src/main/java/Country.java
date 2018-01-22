public class Country {
    private int country_id;
    private String country;
    private String last_update;

    public Country() {
    }

    public Country(int country_id, String country, String last_update) {
        this.country_id = country_id;
        this.country = country;
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_id=" + country_id +
                ", country='" + country + '\'' +
                ", last_update='" + last_update + '\'' +
                '}';
    }
}
