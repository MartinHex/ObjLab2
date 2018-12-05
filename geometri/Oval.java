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
		super(x,y,height,width,c);
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
		super(f,height, width, c);
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fill(Graphics g){
		g.setColor(this.getColor());
		g.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
	}
  /**
     * {@inheritDoc}
     */
  @Override
  public int getArea(){
		return (int)(Math.PI * this.getWidth()/2 * this.getHeight()/2+0.5);
  }
  /**
   * {@inheritDoc}
   */
  @Override
  public int getPerimeter(){
		//Approximative solution of the perimeter.
		int perimeter = (int) (Math.PI*Math.sqrt(2*(this.getWidth()*this.getWidth()+getHeight()/2*getHeight()/2))+0.5);
		return perimeter;
	 }
}
