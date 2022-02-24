public class IntPair {
    public int x;
    public int y;
    
    public IntPair(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj == null || obj.getClass()!= this.getClass()) {
            return false;
        }

        IntPair pair = (IntPair) obj;


        return pair.x == this.x && pair.y == this.y;
    }
      
    @Override
    public int hashCode() {
        // unique pairing function
        return (x+y)*(x+y+1)/2 + y;
    }
}