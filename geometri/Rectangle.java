package geometri;

import java.awt.Color;
import java.awt.Graphics;
/**
 * This class represents the shape of a Rectangle.
 * It implements the interface GeometricalForm so that it defines basic characteristics
 * such as movability and geometric properties such as area.
 *
 * @author Oscar and Martin
 *
 */
public class Rectangle extends AbstractForm {
  /**
  * A geometic form on the shape as a rektangle.
  * @param x x-cordinate of the rektangle.
  * @param y y-cordinate of the rektangle.
  * @param width Width of the rectangle.
  * @param height Height of the rectangle.
  * @param c Color of the rectangle.
  * @throws IllegalPositionException
  * 			Only allows positive coordinates.
  */
  public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		super(x,y,height,width,c);
  }
  /**
  * Change a geometric to rektange based on the same position.
  * @param f The geometric Form being modified.
  * @param width Width of the rectangle.
  * @param height Height of the rectangle.
  * @param c Color of the rectangle.
  */
  public Rectangle(GeometricalForm f, int width, int height, Color c){
		super(f,height,width,c);
  }
  /**
  *{@inheritDoc}
  */
  @Override
	public void fill(Graphics g){
    g.setColor(this.getColor());
    g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
	}
  /**
  *{@inheritDoc}
  */
  @Override
  public int getArea(){
		return this.getWidth()*this.getHeight();
  }
  /**
  *{@inheritDoc}
  */
  @Override
  public int getPerimeter(){
		return 2*this.getWidth()+2*this.getHeight();
  }
}
