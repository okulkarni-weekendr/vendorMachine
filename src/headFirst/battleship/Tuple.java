package headFirst.battleship;

public class Tuple<X> {
    private X x, y;

    public Tuple(X x, X y) {
        this.x = x;
        this.y = y;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public X getY() {
        return y;
    }

    public void setY(X y) {
        this.y = y;
    }

//    public X[] getTuple(){
//       X[] tuple = new X[]{};
//       tuple[0] = x;
//       tuple[1] = y;
//       return tuple;
//    }
}
