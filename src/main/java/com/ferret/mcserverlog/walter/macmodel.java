package com.ferret.mcserverlog.walter;

public class macmodel {
    private double fps;

    public macmodel(double fps, double kwh) {
        this.fps = fps;
        this.kwh = kwh;
    }

    private double kwh;

    public double getFps() {
        return fps;
    }

    public void setFps(double fps) {
        this.fps = fps;
    }

    public double getKwh() {
        return kwh;
    }

    public void setKwh(double kwh) {
        this.kwh = kwh;
    }




}
