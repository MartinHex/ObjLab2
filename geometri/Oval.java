package geometri;

import java.awt.Color;
import java.awt.Graphics;

/**
 * This class represents the shape of a Oval.
 * It implements the interface GeometricalForm so that it defines basic characteristics
 * such as movability and geometric properties such as area.
 *
 * @author Oscar and Martin
 *
 */
public class Oval extends AbstractForm{

	private int width;
	/** Height of the Oval. */
	private int height;

	/**
	 * Constructs an oval shape as an GeometricalForm.
	 *
	 * @param x
	 * 			X coordinate of the Oval.
	 * @param y
	 * 			Y coordinate of the Oval.
	 * @param width
	 * 			Width of the Oval.
	 * @param height
	 * 			Height of the Oval.
	 * @param c
	 * 			Color of the Oval.
	 * @throws IllegalPositionException
	 * 			Only allows positive coordinates.
	 */
	public Oval(int x, int y, int width, int height, Color c) throws IllegalPositionException {
		if(x<0 || y<0){
			throw new IllegalPositionException();
		}
		super(x,y,c);
		this.width = width;
		this.height = height;
	}

	/**
	 *
	 * @param f
	 * 			GeometricalForm object, whose position is replicated.
	 * @param width
	 * 			Width of the Oval.
	 * @param height
	 * 			Height of the Oval.
	 * @param c
	 * 			Color of the Oval.
	 */
	public Oval(GeometricalForm f, int width, int height, Color c) {
		super(f.getX(), f.getY(), c);
		this.width = width;
		this.height = height;
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
    public int getArea(){

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getHeight(){

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPerimeter(){

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getWidth(){

    }

}