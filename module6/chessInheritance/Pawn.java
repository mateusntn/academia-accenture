public class Pawn extends Piece{
    private int PositionX;
    private int PositionY;

    public int getPositionX() {
        return PositionX;
    }

    public void setPositionX(int positionX) {
        PositionX = positionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    public void setPositionY(int positionY) {
        PositionY = positionY;
    }

    @Override
    public void Move(int positionX, int positionY) {
        setPositionX(positionX);
        setPositionY(positionY);
    }
    
}
