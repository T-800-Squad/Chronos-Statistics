package moduloEstadisticas.Stadistics.model;

/**
 * Enum representing the different roles within the system.
 * The roles determine the permissions and the type of user in the system.
 * Each role has a description associated with it, and this description is used for matching user input.
 */
public enum Role {
    STUDENT("Student"), TEACHER("Teacher"),ADMIN("Administrator")
    ,GENERAL_SERVICES("General Services");
    private final String description;
    Role(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
