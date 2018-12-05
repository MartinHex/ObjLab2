package geometri;

import java.awt.Color;
import java.awt.Graphics;
/**
 * This class represents the shape of a point.
 * It implements the interface GeometricalForm so that it defines basic characteristics
 * such as movability and geometric properties such as area.
 *
 * @author Oscar and Martin
 *
 */
public class Point extends AbstractForm{

  /**
  * Initiates a point in the plane.
  * @param x x-position of the square.
  * @param y y-position of the square.
  * @param c Color of the point.
	* @throws IllegalPositionException
	* 			Only allows positive coordinates.
  */
  public Point(int x, int y, Color c) throws IllegalPositionException{
		super(x,y,0,0,c.clone());
  }

  /** Translates GeometricalForm to point.
  * @param f Old Geometrical Form.
  * @param c Color of the point.
  */
  public Point(GeometricalForm f, Color c){
		super(f,0,0,c.clone());
   }

  /**
  *{@inheritDoc}
  */
  @Override
  public void fill(Graphics g){
		//A point is drawn as a line with the same start and end position.s
		g.setColor(this.getColor());
		g.drawLine(this.getX(), this.getY(), this.getX(), this.getY());
  }

  /**
  * Get the area of the point which since one dimensional; returns zero.
  */
  @Override
  public int getArea(){
		return 0;
  }

  /**
  * Get the perimeter of the point which since one dimensional; returns zero.
  */
  @Override
  public int getPerimeter(){
		return 0;
  }
}
