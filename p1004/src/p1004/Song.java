package p1004;
//p.242 ���� 3
public class Song {
	//����, ����, ����, ���� �ʵ�
	private String title;
	private String artist;
	private String year;
	private String country;
	//������ 2��
	public Song() {
		
	}
	public Song(String title, String artist, String year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	//show() �޼ҵ�
	public void show() {
		System.out.println(this.year+ "�� " + this.country 
					+ "������ " + this.artist+ "�� �θ� " + this.title);

	}

}
