package geometri;


/**
 * This class represents the shape of a square.
 * It implements the interface GeometricalForm so that it defines basic characteristics 
 * such as movability and geometric properties such as area. 
 * 
 * @author Oscar and Martin
 *
 */
public class Square implements GeometricalForm {
  private Rectangle wrappedRectangle;

  /**
  * A geometic form on the shape as a square.
  * @param x x-cordinate of the square.
  * @param y y-cordinate of the square.
  * @param width Width of the square.
  * @param height Height of the square.
  * @param c Color of the square.
  */
  public Square(int x, int y, int side, Color c) throws IllegalPositionException{
  
  }
  /**
  * Change a geometric to rektange based on the same position.
  * @param f The geometric Form being modified.
  * @param width Width of the square.
  * @param height Height of the square.
  * @param c Color of the square.
  */
  public Square(GeometricalForm f, int side, Color c){
	  
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
  *{@inheritDoc}
  */
  @Override
  public int getArea(){

  }
  /**
  * Get the height of the square.
  */
  @Override
  public int getHeight(){

  }
  /**
  * Get the width of the square.
  */
  @Override
  public int getWidth(){

  }
  /**
  *{@inheritDoc}
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
