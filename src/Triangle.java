public class Triangle{
    private int[] sides = {0, 0, 0};

    Triangle(int sideA, int sideB, int sideC){
        this.setSide(TriangleSide.A, sideA);
        this.setSide(TriangleSide.B, sideB);
        this.setSide(TriangleSide.C, sideC);
    }

    public int getSide(TriangleSide side){
        return this.sides[side.getSide()];
    }

    private int[] getSides(){
        return this.sides;
    }

    public void setSide(TriangleSide side, int value){
        this.sides[side.getSide()] = value;
    }

    private boolean positiveInputs(){
        for(int i = 0; i < this.getSides().length; i++){
            if(sides[i] <= 0){
                return false;
            }
        }
        return true;
    }

    private boolean validSideLengths(){
        // Checks the if the sum of two sides is greater than the other side
        int[] sides = this.getSides();
        int exchangedSide;
        for(int i = 0; i < sides.length; i++){
            // Changes the current side value with the first side value
            exchangedSide = sides[TriangleSide.A.getSide()];
            sides[TriangleSide.A.getSide()] = sides[i];
            sides[i] = exchangedSide;
            if(sides[TriangleSide.A.getSide()] >= sides[TriangleSide.B.getSide()] + sides[TriangleSide.C.getSide()]){
                return false;
            }
        }
        return true;
    }

    private boolean validSides(){
        if(this.positiveInputs() == false){
            return false;
        }
        if(this.validSideLengths() == false){
            return false;
        }
        return true;
    }

    private String triangleType(){
        int[] sides = this.getSides();
        if(sides[TriangleSide.A.getSide()] == sides[TriangleSide.B.getSide()]
           &&
           sides[TriangleSide.B.getSide()] == sides[TriangleSide.C.getSide()]){

            return "Equilateral Triangle";
        }
        else if(sides[TriangleSide.A.getSide()] == sides[TriangleSide.B.getSide()]
                 ||
                 sides[TriangleSide.A.getSide()] == sides[TriangleSide.C.getSide()]
                 ||
                 sides[TriangleSide.B.getSide()] == sides[TriangleSide.C.getSide()]){

            return "Isosceles Triangle";
        }
        else{
            return "Scalene Triangle";
        }
    }

    public String classify(){
        if(this.validSides() == false){
            return "Not a Triangle";
        }
        return this.triangleType();
    }
}
