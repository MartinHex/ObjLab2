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
	public int x1;
	public int y1;
	public int x2;
	public int y2;
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
		super(x1-shiftPos(x1,x2), y1-shiftPos(y1,y1),(int)(Math.abs(y2-y1)+0.5), (int)(Math.abs(x2-x1)+0.5),c);
		this.x1 = x1;
		this.y1 = y1;
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
		super(f1,(int)(Math.abs(f2.getY()-f1.getY())+0.5), (int)(Math.abs(f2.getX()-f1.getX())+0.5), c);
		this.x1 = f1.getX();
		this.y1 = f1.getY();
		this.x2 = f2.getX();
		this.y2 = f2.getY();
		// As the place method cast an exception and we are not allowed to return one we do an internal
		// try-catch method, this is safe as we should not be able to obtain a GeometricalFrom
		// whose coordinates are not qualified.
		try{
		this.place(x1 - shiftPos(x1,x2), y1 - shiftPos(y1, y2));
	}catch(IllegalPositionException e){System.out.println("This won't happen");}
	}

// Shifts the position of the line so that it fits into an abstractFrom, i.e abstract rectangle.
	private static int shiftPos(int a, int b) {
		if(a>b){
			return a-b;
		}
		else{
			return 0;
		}
	}
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fill(Graphics g){
		g.setColor(this.getColor());
		g.drawLine(this.getX() + shiftPos(x1,x2), this.getY() + shiftPos(y1,y2), this.getX() + shiftPos(x2,x1), this.getY() + shiftPos(y2,y1));
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
		*Returns the position of the end points of the given line.
		*
		*The method returns the positions as an array in the order {x1, y1, x2, y2}.
		*
		*/
		public int[] getPositions(){
			return new int[4]{x1, y1, x2, y2};
		}

		/**
		*{@inheritDoc}}
		*/
		@Override
		public boolean equals(Object obj){
			if(obj == this){
				return true;
			}
			if(!(obj instanceof Line)){
				return false;
			}
			Line typeCastedObj = (Line) Obj
			if(!(this.getHeight() == typeCastedObj.getHeight() &&
			 		this.getWidth() == typeCastedObj.getWidth())){
				return false;
			}
			int[] compCoordinates = typeCastedObj.getPositions();
			int[] coordinates = this.getPositions();
			boolean[] temp = new boolean[4]
			for(int i = 0; i<coordinates.size(), i++){
				if( !(0 == coordinates[i] - compCoordinates[i]) ){ return false};
			}
			return true
		}

		/**
		 * {@inheritDoc}
		 */
		@Override
		public in hashCode(){
			return this.getPositions().hashCode()
		}
}
