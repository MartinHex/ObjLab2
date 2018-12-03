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
		super(x,y,height,width,c.clone());
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
		super(f,height, width, c.clone());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fill(Graphics g){
		g.setColor(this.getColor());
		g.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight())
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public int getArea(){
			return (Math.PI * width/2 * height/2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getPerimeter(){
			//Perimeter for an ellipse, from Wikipedia. Kanske klart, vi får dubbelkolla! NUmerisk version av integral.
			int perimeter = floor(4*(width/2)*(Math.PI/2) * Math.sqrt(1 - Math.sqrt(1-(height/2*height/2)/((width/2 * width/2))) * Math.sin(Math.PI/4)*Math.sin(Math.PI/4)));
			return perimeter;
	  }
}
