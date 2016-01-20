package c.impl.list;

public interface List {
	/**
		데이터 하나를 추가한다
	*/
	public void add();
	/**
		특정 위치에 있는 값을 수정한다
	*/
	public void update(int index, Object value);
	
	/**
		특정 위치에 있는 값을 삭제한다.
	*/
	public void remove(int index);
	
	/**
		특정 위치에 있는 값을 검색한다
	*/
	public void search(int index);
}