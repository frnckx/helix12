public class SqlConstants {

    public static String SELECT_ALL_FROM_ACTOR_WHERE_ID_BIGGER = "SELECT * FROM actor WHERE actor_id > ?";
    public static String SELECT_LAST_N_ACTOR = "SELECT * FROM  actor ORDER BY actor_id DESC LIMIT ? ";

    // film title, actor neve

    public static String SELECT_ALL_FILMS_AND_ACTORS = "select film.title, actor.first_name, actor.last_name from film inner join film_actor ON film.film_id = film_actor.film_id inner join actor on actor.actor_id = film_actor.actor_id WHERE actor_id > ?";
}
