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

    public static Locatie getEnum(String s) {
        for (var v : values()) {
            if (v.display.equals(s))
                return v;
        }
        return null;
    }

    @Override
    public String toString() {
        return display;
    }
}
