public enum TriangleSide {
    A(0), B(1), C(2);
    private final int sideValue;

    TriangleSide(int sideValue){
        this.sideValue = sideValue;
    }

    public int getSide(){
        return sideValue;
    }
}