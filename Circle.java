package geometri;

import java.awt.Color;
import java.awt.Graphics;
/**
 * This class represents the shape of a circle.
 * It implements the interface GeometricalForm so that it defines basic characteristics
 * Such as movability and geometric properties such as area.
 *
 *
 *
 * @author Oscar and Martin
 *
 */
public class Circle implements GeometricalForm {
	private int x;
	private int y;
	private Color color;
	private int diameter;
	private Oval wrappedOval;

	/**
	 * Constructs a GeometricalForm in the shape of a circle.
	 *
	 * @param x
	 * 			X coordinate of the circle.
	 * @param y
	 * 			Y coordinate of the circle.
	 * @param diameter
	 * 			Diameter of the circle.
	 * @param c
	 * 			Color of the cirlce.
	 * @throws IllegalPositionException
	 * 			Only allows positive coordinates.
	 */
	public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException{
		wrappedOval = new Oval(x,y,diameter,diameter,c);
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
		wrappedOval = new Oval(f,diameter,diameter,c);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int compareTo(GeometricalForm a) {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fill(Graphics g){

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
    public Color getColor(){
			return Color.GREEN;
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getArea(){
			return oval.getColor();
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getHeight(){
			return oval.getHeight();
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getPerimeter(){
			return oval.getPerimeter();
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getWidth(){
			return oval.getWidth();
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getX(){
			return oval.getX();
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getY(){
			return oval.getY();
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
    public void move(int dx, int dy) throws IllegalPositionException{
			oval.move(dx,dy);
    }

	/**
	 * {@inheritDoc}
	 */
	@Override
    public void place(int x, int y) throws IllegalPositionException{

    }

}
