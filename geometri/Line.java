package geometri;

import java.awt.*;
import java.lang.Math;

/**
 * This class represents the shape of a line.
 * It implements the interface GeometricalForm so that it defines basic characteristics
 * such as movability and geometric properties such as area.
 *
 * The line is defined by its 2 end-points.
 *
 * @author Oscar and Martin
 *
 */
public class Line extends AbstractForm{

	/** X coordinate of the end position. */
	private int x2;
	/** Y coordinate of the starting position. */
	private int y2;
	/** Color of the line. */

	/**
	 * Constructs a line between two given points.
	 *
	 * @param x1
	 * 			X coordinate from where the line starts.
	 * @param y1
	 * 			Y coordinate from where the line starts.
	 * @param x2
	 * 			X coordinate from where the line ends.
	 * @param y2
	 * 			Y coordinate from where the line ends.
	 * @param c
	 * 			Color of the line.
	 * @throws IllegalPositionException
	 * 			Only allows positive start and end positions.
	 */
	public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {
		super(x1, y1, (int)(Math.abs(y2-y1)+0.5), (int)(Math.abs(x2-x1)+0.5), c);
		if(x2 < 0 || y2 < 0){throw new IllegalPositionException();}
			this.x2 = x2;
			this.y2 = y2;
	}

	/**
	 * Constructs a line between two given points.
	 *
	 * @param f1
	 * 			GeometricalForm from whose position the line starts.
	 * @param f2
	 * 			GeometricalForm from whose position the line ends.
	 * @param c
	 * 			Color of the line.
	 */
	public Line(GeometricalForm f1, GeometricalForm f2, Color c) {
		super(f1, (int) Math.abs(f2.getY()-f1.getY()+0.5),(int) Math.abs(f2.getX() - f1.getX()+0.5), c);
		this.x2 = f2.getX();
		this.y2 = f2.getY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fill(Graphics g){
		g.setColor(this.getColor());
		g.drawLine(this.getX(), this.getY(), this.x2, this.y2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getArea(){
    	return 0;
    }

		private double getLength(){
			return Math.sqrt((this.getY()-y2)*(this.getY() - y2) + (this.getX() - x2)*(this.getX() - x2));
		}

	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getPerimeter(){
    	return (int) (2*this.getLength()+0.5);
    }

		/**
		*{@inheritDoc}
		*/
		@Override
		public void move(int dx, int dy) throws IllegalPositionException{
			if( this.x2+dx<0 || this.y2+dy<0){throw new IllegalPositionException();}
			super.move(dx,dy);
			this.x2 += dx;
			this.y2 += dy;
		}
		/**
		*{@inheritDoc}
		*/
		@Override
		public void place(int x, int y) throws IllegalPositionException{
			this.move(x-this.getX(),y-this.getY());
		}
}
