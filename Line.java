package geometri;

import java.awt.Color;
import java.awt.Graphics;

/**
 * This class represents the shape of a line.
 * It implements the interface GeometricalForm so that it defines basic characteristics 
 * such as movability and geometric properties such as area. 
 * 
 * The line is defined by its 2 end points.
 *  
 * @author Oscar and Martin
 *
 */
public class Line implements GeometricalForm{
	
	/** X coordinate of the starting position. */
	private int x1;
	/** X coordinate of the end position. */
	private int x2;
	/** Y coordinate of the starting position. */
	private int y1;
	/** Y coordinate of the end position. */
	private int y2;
	/** Color of the line. */
	private Color color;	
	
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
		
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public int compareTo(GeometricalForm a) {
		
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void fill(Graphics g){
		
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
    public Color getColor(){
    	
    }
	
	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getArea(){
    	
    }
	
	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getHeight(){
    	
    }
	
	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getPerimeter(){
    	
    }
	
	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getWidth(){
    	
    }
	
	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getX(){
    	
    }
	
	/**
	 * {@inheritDoc}
	 */
	@Override
    public int getY(){
    	
    }
	
	/**
	 * {@inheritDoc}
	 */
	@Override
    public void move(int dx, int dy) throws IllegalPositionException{
    	
    }
	
	/**
	 * {@inheritDoc}
	 */
	@Override
    public void place(int x, int y) throws IllegalPositionException{
    	
    }
	

}
