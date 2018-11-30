package geometri;

/**
 * This class represents the shape of a Rectangle.
 * It implements the interface GeometricalForm so that it defines basic characteristics 
 * such as movability and geometric properties such as area. 
 * 
 * @author Oscar and Martin
 *
 */
public class Rectangle implements GeometricalForm {
  /** x-position of the rectangle */
	private int x;
  /** y-position of the rectangle */
	private int y;
  /** Height of the rectangle */
  private int height;
  /** Width of the rectangle */
	private int width;
  /** Color of the rectangle */
	private Color color;

  /**
  * A geometic form on the shape as a rektangle.
  * @param x x-cordinate of the rektangle.
  * @param y y-cordinate of the rektangle.
  * @param width Width of the rectangle.
  * @param height Height of the rectangle.
  * @param c Color of the rectangle.
  */
  public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException{

  }

  /**
  * Change a geometric to rektange based on the same position.
  * @param f The geometric Form being modified.
  * @param width Width of the rectangle.
  * @param height Height of the rectangle.
  * @param c Color of the rectangle.
  */
  public Rectangle(GeometricalForm f, int width, int height, Color c){

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
  * Get the height of the rectangle. Is an integer value.
  */
  @Override
  public int getHeight(){

  }
  /**
  * Get the width of the rectangle. Is an integer value.
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
