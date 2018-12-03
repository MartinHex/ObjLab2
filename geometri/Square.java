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
public class Square extends AbstractForm {

  /**
  * A geometic form on the shape as a square.
  * @param x x-cordinate of the square.
  * @param y y-cordinate of the square.
  * @param side Side-length of the square.
  * @param c Color of the square.
  * @throws IllegalPositionException Only allows positive coordinates.
  */
  public Square(int x, int y, int side, Color c) throws IllegalPositionException{
    if(x < 0 || y < 0){throw new IllegalPositionException();}
    super(x,y,side,side,c.clone());
  }
  /**
  * Change a geometric to rektange based on the same position.
  * @param f The geometric Form being modified.
  * @param side Sidelength of the square.
  * @param c Color of the square.
  */
  public Square(GeometricalForm f, int side, Color c){
	  super(f,side,side,c.clone());
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
    return this.getHeight()*this.getWidth();
  }

  /**
  *{@inheritDoc}
  */
  @Override
  public int getPerimeter(){
    return 4*this.getWidth();
  }
}
