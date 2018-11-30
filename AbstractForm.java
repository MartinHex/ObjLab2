package geometri;
import java.awt.*;

abstract class AbstractForm implements GeometricalForm{
  private int x;
  private int y;
  private Color c;
  /**
  *Constructs an AbstractForm that contains the basic properties for any form.
  *
  * @param x
  *         X coordinate of the form.
  * @param y
  *         Y coordinate of the form.
  * @param c
  *         Color of the form.
  * @throws IllegalPositionException
            Only positive coordinates are allowed.
  */
  protected AbstractForm(int x,int y,Color c) throws IllegalPositionException{
    if( x<0 || y<0){throw new IllegalPositionException();}
    this.x=x;
    this.y=y;
    this.c = c.copy();
  }
  /**
  *Constructs an AbstractForm that contains the basic properties for any form.
  *
  * @param f
  *         GeometricalForm from where the coordinates are drawn.
  * @param c
  *         Color of the form.
  */
  protected AbstractForm(GeometricalForm f,Color c) {
    this.x=f.getX();
    this.y=f.getY();
    this.c = c.copy();
  }
  /**
  *{@inheritDoc}
  */
  @Override
  public int getArea();
  /**
  *{@inheritDoc}
  */
  @Override
  public int getPerimeter();

  public int compareTo( GeometricalForm f );

  /**
  *{@inheritDoc}
  */
  @Override
  public void fill( Graphics g );

  /**
  *{@inheritDoc}
  */
  @Override
  public Color getColor(){
    return c.copy();
  }

  /**
  *{@inheritDoc}
  */
  @Override
  public int getWidth();

  /**
  *{@inheritDoc}
  */
  @Override
  public int getHeight();


  /**
  *{@inheritDoc}
  */
  @Override
  public int getX(){
		return x;
  }
  /**
  *{@inheritDoc}
  */
  @Override
  public int getY(){
		return y;
  }
  /**
  *{@inheritDoc}
  */
  @Override
  public void move(int dx, int dy) throws IllegalPositionException{
		if( x+dx<0 || y+dy<0){throw new IllegalPositionException();}
		this.x += dx;
		this.y += dy;
  }
  /**
  *{@inheritDoc}
  */
  @Override
  public void place(int x, int y) throws IllegalPositionException{
		if( x<0 || y<0){throw new IllegalPositionException();}
		this.x = x;
		this.y = y;
  }

}
