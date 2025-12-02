import java.awt.*;

    public class BlueCar {

        String name;
        Image image;
        int xpos;
        int ypos;
        int speed;
        double dx;
        double dy;
        int width;
        int height;

        Rectangle hitbox;

        public BlueCar() {
            hitbox = new Rectangle(xpos, ypos, width, height);
            //convention for making a rectangle
        }

        public BlueCar(int xposInput, int yposInput, double dxInput, double dyInput, int widthInput, int heightInput) {
            //overloaded constructor
            xpos = xposInput;
            ypos = yposInput;
            dx = dxInput;
            dy = dyInput;
            width = widthInput;
            height = heightInput;

            hitbox = new Rectangle(xpos, ypos, width, height);
        }

        public void move() {
            xpos = xpos + (int) dx;
            ypos = ypos + (int) dy;
            if (xpos > 1000) {
                xpos = 0;
            }
            if (ypos > 700) {
                ypos = 0;
            }
            if (xpos < 0) {
                xpos = 1000;
            }
        }
    }

