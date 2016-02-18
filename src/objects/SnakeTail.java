package objects;

import util.Vector2D;

/**
 * An moveable object...
 * @author Gustav
 *
 */

public class SnakeTail 
extends SnakePart
{

	public SnakeTail(double xSpeed, double ySpeed, double xPos, double yPos,
			double mass, double radius) {
		super(xSpeed, ySpeed, xPos, yPos, mass, radius);
	}
	
	public SnakeTail(Vector2D velocity, Vector2D position, double mass, double radius) {
		super(velocity, position, mass, radius);
	}
}