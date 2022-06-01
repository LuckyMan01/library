package util;

public enum Genre {
    COMEDY("Comedy"),
    DRAMA("Drama"),
    DETECTIVE("Detective"),
    FANTASY("Fantasy"),
    HISTORICAL("Historical");
    private String value;

    Genre(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
