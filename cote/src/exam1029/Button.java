package exam1029;

public class Button implements clickable, Drawable{
	
	String label;
	
	public Button() {}
	public Button(String label) {
		this.label = label;
	}

	@Override
	public void click() {
		System.out.println("그림이 클릭되었습니다.");
		
	}
	
	@Override
	public void draw() {
		if(label != null) {
			System.out.println(label+" 버튼을 그립니다.");
		}
		
	}
	

}
