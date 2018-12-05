package geometri;

import java.awt.*;
import java.lang.Math;
/**
 * This class represents the shape of a circle.
 * It implements the interface GeometricalForm so that it defines basic characteristics
 * Such as movability and geometric properties such as area.
 *
 * @author Oscar and Martin
 *
 */
public class Circle extends Oval{

	/**
	 * Constructs a GeometricalForm in the shape of a circle.
	 *
	 * @param x
	 * 			X coordinate of the circle.
	 * @param y
	 * 			Y coordinate of the circle.
	 * @param diameter
	 *			Diameter of the circle.
	 * @param c
	 * 			Color of the cirlce.
	 * @throws IllegalPositionException
	 * 			Only allows positive coordinates.
	 */
	public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException{
		super(x,y,diameter,diameter, c);
	}

	/**
	 * Constructs a GeometricalForm in the shape of a circle.
	 *
	 * @param f
	 * 			GeometricalForm object, whose position is replicated.
	 * @param diameter
	 * 			Diameter of the circle.
	 * @param c
	 * 			Color of the circle.
	 */
	public Circle(GeometricalForm f, int diameter, Color c) {
		super(f,diameter,diameter,c);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getPerimeter(){
			// We override since it is easier to calculate.
			return (int) (Math.PI * diameter +0.5);
    }
}
