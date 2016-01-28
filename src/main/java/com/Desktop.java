package com;


public class Desktop {
    private String desktopOwner;
    DesktopThings desktopThings;

    public String getDesktopOwner() {
        return desktopOwner;
    }

    public void setDesktopOwner(String desktopOwner) {
        this.desktopOwner = desktopOwner;
    }

    public DesktopThings getDesktopThings() {
        return desktopThings;
    }

    public void setDesktopThings(DesktopThings desktopThings) {
        this.desktopThings = desktopThings;
    }

    public Desktop(String desktopOwner, DesktopThings desktopThings) {
        this.desktopOwner = desktopOwner;
        this.desktopThings = desktopThings;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "desktopOwner='" + desktopOwner + '\'' +
                ", desktopThings=" + desktopThings +
                '}';
    }
}
