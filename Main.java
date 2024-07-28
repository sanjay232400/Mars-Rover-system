import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        grid.addObstacle(2, 2);
        grid.addObstacle(3, 5);

        Rover rover = new Rover(0, 0, Direction.N);

        List<Command> commands = new ArrayList<>();
        commands.add(new MoveForwardCommand(rover, grid));
        commands.add(new MoveForwardCommand(rover, grid));
        commands.add(new TurnRightCommand(rover));
        commands.add(new MoveForwardCommand(rover, grid));
        commands.add(new TurnLeftCommand(rover));
        commands.add(new MoveForwardCommand(rover, grid));

        for (Command command : commands) {
            command.execute();
        }

        System.out.println(rover);
    }
}
