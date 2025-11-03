package exam1029;

public class Image implements clickable, Drawable{
	
	String url;
	
	public Image() {}
	public Image(String url) {
		this.url = url;
	}
	
	@Override
	public void click() {
		System.out.println("버튼이 클릭되었습니다.");
	}
	@Override
	public void draw() {
		if(url!=null) {
			System.out.println(url+" 파일을 그립니다.");
		}
		
	}
	
	

}
