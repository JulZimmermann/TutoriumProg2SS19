public enum Betriebsystem {

    Windows7(500),
    WindowsXP(5000),
    Windows10(100),
    Linux(0);

    public final int sleepTime;

    Betriebsystem(int sleepTime) {
        this.sleepTime = sleepTime;
    }

}
