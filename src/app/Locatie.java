package app;

public enum Locatie {
    africa("africa"),
    antarctica("antarctica"),
    asia("asia"),
    australia("australia"),
    europe("europe"),
    north_america("north america"),
    south_america("south america");

    private final String display;

    Locatie(String s) {
        display = s;
    }
    public String getDisplay() {
        return display;
    }
}
