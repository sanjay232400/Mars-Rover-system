public class MoveForwardCommand implements Command {
    private final Rover rover;
    private final Grid grid;

    public MoveForwardCommand(Rover rover, Grid grid) {
        this.rover = rover;
        this.grid = grid;
    }

    @Override
    public void execute() {
        Position newPosition = rover.nextPosition();
        if (grid.isValidPosition(newPosition)) {
            rover.moveTo(newPosition);
        } else {
            System.out.println("Obstacle detected or out of bounds at " + newPosition + ". Command ignored.");
        }
    }
}
