package geometri;
import java.awt.*;

abstract class AbstractForm implements GeometricalForm{
  private int x;
  private int y;
  private Color c;

  protected AbstractForm(int x,int y,Color c) throws IllegalPositionException{
    if( x<0 || y<0){throw new IllegalPositionException();}
    this.x=x;
    this.y=y;
    this.c = c.copy();
  }
  /**
  *{@inheritDoc}
  */
  public int getArea();
  /**
  *{@inheritDoc}
  */
  public int getPerimeter();

  public int compareTo( GeometricalForm f );

  /**
  *{@inheritDoc}
  */
  public void fill( Graphics g );

  /**
  *{@inheritDoc}
  */
  public Color getColor(){
    return c.copy();
  };

  /**
  *{@inheritDoc}
  */
  public int getWidth();

  /**
  *{@inheritDoc}
  */
  public int getHeight();


  /**
  *{@inheritDoc}
  */
  public int getX(){
		return x;
  }
  /**
  *{@inheritDoc}
  */
  public int getY(){
		return y;
  }
  /**
  *{@inheritDoc}
  */
  public void move(int dx, int dy) throws IllegalPositionException{
		if( x+dx<0 || y+dy<0){throw new IllegalPositionException();}
		this.x += dx;
		this.y += dy;
  }
  /**
  *{@inheritDoc}
  */
  public void place(int x, int y) throws IllegalPositionException{
		if( x<0 || y<0){throw new IllegalPositionException();}
		this.x = x;
		this.y = y;
  }

}
