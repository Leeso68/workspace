package p1004;
//p.242 문제 3
public class Song {
	//제목, 가수, 연도, 국적 필드
	private String title;
	private String artist;
	private String year;
	private String country;
	//생성자 2개
	public Song() {
		
	}
	public Song(String title, String artist, String year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	//show() 메소드
	public void show() {
		System.out.println(this.year+ "년 " + this.country 
					+ "국적의 " + this.artist+ "가 부른 " + this.title);

	}

}
