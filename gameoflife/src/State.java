public enum State {
    
    DEAD(0),
    ALIVE(1);

    private final int u;

    State(int u) {
       this.u = u;
    }

    public int getU() {
        return u;
    }
}
