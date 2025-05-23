package moduloEstadisticas.Stadistics.model;

public enum TimeLapse {
    DAY("Reporte con informacion del dia."),WEEK("Reporte con informacion de una semana."), MONTH("Reporte con informacion de un mes."), SEMESTER("Reporte con informacion del semestre.");
    private final String description;
    TimeLapse(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
