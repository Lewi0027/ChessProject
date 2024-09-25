package com.chess.common;

public class Location {
    public final File column;
    public final Integer row;

    public Location(File column, Integer row) {
        this.column = column;
        this.row = row;
    }

    // public Location(Integer column, Integer row) {
    //     char colLetter = (char) column;
    //     this.column = File.(column + 'A');
    //     this.row = row;
    // }

    public Location(Location location) {
        this.column = location.column;
        this.row = location.row;
    }

    public File getColumn() {
        return this.column;
    }

    public Integer getRow() {
        return this.row;
    }

    @Override
    public String toString() {
        return "Location: " +
            "Column=" + column +
            ", Row=" + row;
    }
}
