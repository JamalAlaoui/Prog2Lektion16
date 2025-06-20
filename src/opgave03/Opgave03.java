package opgave03;

import opgave03.models.*;

public class Opgave03 {
    public static void main(String[] args) {
        WebServer server = new WebServer(new LogTilConsol());


        server.handleRequest("Hello World");
        server.handleRequest("");
    }
}
