import Zadanie2.KsiazkaAdresowa;
import db.DBConnect;

/**
 * Created by Marta Pawlik on 21.02.2016.
 */
public class Main {

    public static void main(String[] args) {

        DBConnect.getInstance().connect();

        //CREATE TABLE IF NOT EXISTS
        String update = "CREATE TABLE IF NOT EXISTS ADRESSBOOK(" +
                "ID INT PRIMARY KEY NOT NULL, " +
                "IMIE TEXT, " +
                "NAZWISKO TEXT, " +
                "ULICA TEXT, " +
                "NRDOMU INT, " +
                "MIASTO TEXT, " +
                "NRTEL TEXT" +
                ")";

        DBConnect.getInstance().executeUpdate(update);

        new KsiazkaAdresowa();

        }
    }

