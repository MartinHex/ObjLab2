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
public class Point implements GeometricalForm {
  /** x-position of the rectangle */
	private int x;
  /** y-position of the rectangle */
	private int y;
  /** Color of the rectangle */
	private Color color;
  /**
  * Initiates a point in the plane.
  * @param x x-position of the square.
  * @param y y-position of the square.
  * @param c Color of the point.
	* @throws IllegalPositionException
	* 			Only allows positive coordinates.
  */
  public Point(int x, int y, Color c) throws IllegalPositionException{

  }

  /** Translates GeometricalForm to point.
  * @param f Old Geometrical Form.
  * @param c Color of the point.
  */
  public Point(GeometricalForm f, Color c){

   }
  /**
  *{@inheritDoc}
  */
  @Override
  public int compareTo(GeometricalForm a) {

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
  public Color getColor(){

  }

  /**
  * Get the area of the point which since one dimensional; returns zero.
  */
  @Override
  public int getArea(){

  }
  /**
  *{@inheritDoc}
  */
  @Override
  public int getHeight(){

  }
  /**
  *{@inheritDoc}
  */
  @Override
  public int getWidth(){

  }
  /**
  * Get the perimeter of the point which since one dimensional; returns zero.
  */
  @Override
  public int getPerimeter(){

  }
  /**
  *{@inheritDoc}
  */
  @Override
  public int getX(){

  }
  /**
  *{@inheritDoc}
  */
  @Override
  public int getY(){

  }
  /**
  *{@inheritDoc}
  */
  @Override
  public void move(int dx, int dy) throws IllegalPositionException{

  }
  /**
  *{@inheritDoc}
  */
  @Override
  public void place(int x, int y) throws IllegalPositionException{

  }
}
