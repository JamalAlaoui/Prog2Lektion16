package opgave03.models;

public class WebServer {
    private LogStrategi logStrategi;

    public WebServer(LogStrategi logStrategi){
        this.logStrategi = logStrategi;
    }

    public void handleRequest(String request) {
        if (request.isEmpty()) {
            logStrategi.logError("Request is empty");
            return;
        }
        logStrategi.logInfo("Handling request: " + request);
    }

    public void setLogTilConsoleStrategi(LogStrategi logTilConsoleStrategi) {
        this.logStrategi = logTilConsoleStrategi;
    }
}
