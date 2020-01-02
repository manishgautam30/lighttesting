package test;

public class LED {
    private String colourName;
    private boolean working;

    public LED(String colourName, boolean working) {
        this.colourName = colourName;
        this.working = working;
    }

    public String getColourName() {
        return colourName;
    }

    public void setColourName(String colourName) {
        this.colourName = colourName;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}