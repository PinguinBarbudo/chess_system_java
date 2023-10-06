package boardgame;

public class Position {
	private int row;
	private int column;
	
	public Position() {}
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	/*
	 * end of constructors
	 */
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColum() {
		return column;
	}
	public void setColum(int column) {
		this.column = column;
	}
	/*
	 * end of getters and setters
	 */
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}//end of class