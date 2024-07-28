public class Rover {
    private Position position;
    private Direction direction;

    public Rover(int x, int y, Direction direction) {
        this.position = new Position(x, y);
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.left();
    }

    public void turnRight() {
        direction = direction.right();
    }

    public void moveTo(Position newPosition) {
        this.position = newPosition;
    }

    public Position nextPosition() {
        int x = position.getX();
        int y = position.getY();

        switch (direction) {
            case N:
                return new Position(x, y + 1);
            case E:
                return new Position(x + 1, y);
            case S:
                return new Position(x, y - 1);
            case W:
                return new Position(x - 1, y);
        }
        return position; // should never reach here
    }

    @Override
    public String toString() {
        return "Rover is at " + position + " facing " + direction + ".";
    }
}
