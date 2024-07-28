[10:23 pm, 28/07/2024] Ram Tce: import java.util.HashSet;
import java.util.Set;

public class Grid {
    private final int width;
    private final int height;
    private final Set<Position> obstacles;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.obstacles = new HashSet<>();
    }

    public void addObstacle(int x, int y) {
        obstacles.add(new Position(x, y));
    }

    public boolean isValidPosition(Position position) {
        return position.getX() >= 0 && position.getX() < width &&
               position.getY() >= 0 && position.getY() < height &&
               !obstacles.contains(position);
    }
}
 
