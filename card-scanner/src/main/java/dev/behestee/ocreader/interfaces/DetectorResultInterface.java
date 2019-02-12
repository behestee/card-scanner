package dev.behestee.ocreader.interfaces;

public interface DetectorResultInterface {

    public void onMatchFound(String matchedItem);
    public void onMatchError(String ErrorMsg);
}
