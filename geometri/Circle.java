package geometri;

import java.awt.*;
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
		if(x < 0 || y < 0){throw new IllegalPositionException();}
		super(x,y,diameter,diameter,c.clone());
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
		super(f,diameter,diameter,c.clone());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getArea(){
			return Math.PI*(diameter/2)*(diameter/2);
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getPerimeter(){
			return (int) floor(Math.PI * diameter);
    }
}
