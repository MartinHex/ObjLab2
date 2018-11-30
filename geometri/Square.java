package geometri;

import java.awt.Color;
import java.awt.Graphics;
/**
 * This class represents the shape of a square.
 * It implements the interface GeometricalForm so that it defines basic characteristics
 * such as movability and geometric properties such as area.
 *
 * @author Oscar and Martin
 *
 */
public class Square extends AbstracForm {
  /** Sidelength of the square. */
  private int side;

  /**
  * A geometic form on the shape as a square.
  * @param x x-cordinate of the square.
  * @param y y-cordinate of the square.
  * @param side Side-length of the square.
  * @param c Color of the square.
  */
  public Square(int x, int y, int side, Color c) throws IllegalPositionException{
    super(x,y,c);
    this.side = side;
  }
  /**
  * Change a geometric to rektange based on the same position.
  * @param f The geometric Form being modified.
  * @param width Width of the square.
  * @param height Height of the square.
  * @param c Color of the square.
  */
  public Square(GeometricalForm f, int side, Color c){
	  super(f,c);
    this.side = side;
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
    return side*side;
  }
  /**
  *{@inheritDoc}
  */
  @Override
  public int getHeight(){
    return side;
  }
  /**
  *{@inheritDoc}
  */
  @Override
  public int getWidth(){
    return side;
  }
  /**
  *{@inheritDoc}
  */
  @Override
  public int getPerimeter(){
    return 4*side;
  }
}
