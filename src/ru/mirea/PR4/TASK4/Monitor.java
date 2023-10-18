package ru.mirea.PR4.TASK4;

class Monitor {
    private String model;
    private int screenSizeInches;

    public Monitor(String model, int screenSizeInches) {
        this.model = model;
        this.screenSizeInches = screenSizeInches;
    }

    public String getModel() {
        return model;
    }

    public int getScreenSizeInches() {
        return screenSizeInches;
    }

}
