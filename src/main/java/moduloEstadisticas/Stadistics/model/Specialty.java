package moduloEstadisticas.Stadistics.model;

/**
 * Enum representing the different specialties available for an inning.
 * This enum is used to specify the medical specialty of a doctor. The specialties available are:
 * General Medicine, Odontology, Psycology.
 */
public enum Specialty {
    GENERAL_MEDICINE("General Medicine"), DENTIST("Dentist"),PSYCHOLOGY("Psychology");
    private final String description;
    Specialty(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
