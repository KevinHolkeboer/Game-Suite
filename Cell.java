package gameCode;

public class Cell {
	private int mineCount;
	private boolean isFlagged;
	private boolean isExposed;
	private boolean isMine;
	
	public Cell(){
		this.mineCount = 0;
		this.isFlagged = false;
		this.isExposed = false;
		this.isMine = false;
	}
	public Cell(int count, boolean flag, boolean exposed, boolean mine){
		this.mineCount = count;
		this.isFlagged = flag;
		this.isExposed = exposed;
		this.isMine = mine;
	}
	
	public void changeMineCount(int mines){
		this.mineCount = mines;
	}
	public void changeIsFlagged(){
		if(this.isFlagged){
			this.isFlagged = false;
		} else{
			this.isFlagged = true;
		}
	}
	public void setIsFlagged(boolean flag){
		this.isFlagged = flag;
	}
	public void changeIsExposed(boolean exposed){
		this.isExposed = exposed;
	}
	public void changeIsMine(boolean mine){
		this.isMine = mine;
	}
	public int getMineCount(){
		return this.mineCount;
	}
	public boolean getIsFlagged(){
		return this.isFlagged;
	}
	public boolean isExposed(){
		return this.isExposed;
	}
	public boolean getIsMine(){
		return this.isMine;
	}
	public void incrMine(){
		this.mineCount++;
	}
}
