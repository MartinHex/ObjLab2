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
  /** Height of the rectangle */
  private int height;
  /** Width of the rectangle */
	private int width;

  /**
  * A geometic form on the shape as a rektangle.
  * @param x x-cordinate of the rektangle.
  * @param y y-cordinate of the rektangle.
  * @param width Width of the rectangle.
  * @param height Height of the rectangle.
  * @param c Color of the rectangle.
  */
  public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException{
		super(x,y,c);
		this.width = width;
		this.height = height;
  }

  /**
  * Change a geometric to rektange based on the same position.
  * @param f The geometric Form being modified.
  * @param width Width of the rectangle.
  * @param height Height of the rectangle.
  * @param c Color of the rectangle.
  */
  public Rectangle(GeometricalForm f, int width, int height, Color c){
		super(f);
		this.width = width;
		this.height = height;
		this.color = c.copy();
  }

  /**
  *{@inheritDoc}
  */
  @Override
	public void fill(Graphics g){

	}

  /**
  *{@inheritDoc}
  */
  @Override
  public int getArea(){
		return width*height;
  }
  /**
  * Get the height of the rectangle. Is an integer value.
  */
  @Override
  public int getHeight(){
		return height;
  }
  /**
  * Get the width of the rectangle. Is an integer value.
  */
  @Override
  public int getWidth(){
		return width;
  }
  /**
  *{@inheritDoc}
  */
  @Override
  public int getPerimeter(){
		return 2*width+2*height;
  }
}
