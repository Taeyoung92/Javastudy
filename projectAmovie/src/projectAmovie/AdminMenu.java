package projectAmovie;

import java.io.IOException;
import java.util.ArrayList;

public class AdminMenu extends AbstractMenu{
	private static final AdminMenu instance = new AdminMenu(null);
	private static final String ADMIN_MENU_TEXT =
			"1 : 영화 등록하기\n" +
			"2 : 영화 목록보기\n" +
			"3 : 영화 삭제하기\n" +
			"b : 메인메뉴로 이동\n\n" +
			"메뉴를 선택하세요 : ";
	
	private AdminMenu(Menu prevMenu) {
		super(ADMIN_MENU_TEXT, prevMenu);
	}
	
	public static AdminMenu getInstance() {
		return instance;
	}
	
	public Menu next() {
		switch (sc.nextLine()) {
			case "1" :
				createMovie();
				return this;
			case "2" :
				printAllMovies();
				return this;
			case "3" :
				deleteMovie();
				return this;
			case "b" : return prevMenu;
			default: return this;
		}
	}
	
	private void printAllMovies() {
		try {
			ArrayList<Movie> movies = Movie.findAll();
			System.out.println();
			for(int i = 0; i<movies.size(); i++) {
				System.out.printf("%s\n", movies.get(i).toString());
			}
		}catch (IOException e) {
			System.out.println("데이터 접근에 실패하였습니다.");
		}
	}
	private void createMovie() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		System.out.print("장르 : ");
		String genre = sc.nextLine();
		Movie movie = new Movie(title, genre);
		try {
			movie.save();
			System.out.println(">> 등록되었습니다.");
		}catch(IOException e) {
			System.out.println(">> 실패하였습니다.");
		}
	}
	
	private void deleteMovie() {
		printAllMovies();
		System.out.print("삭제 할 영화를 선택하세요 : ");
		try {
			Movie.delete(sc.nextLine());
			System.out.println(">> 삭제되었습니다.");
		}catch(IOException e) {
			System.out.println(">> 삭제에 실패하였습니다.");
		}
	}
}
