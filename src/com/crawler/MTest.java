package com.crawler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MTest {

	public static void main(String[] args) {

		MTest crawler = new MTest();

		ArrayList<Movie> movies = crawler.getNaverMovie();
		
		for(Movie movie : movies) {
			System.out.println(movie);
		}

	}

	public ArrayList<Movie> getNaverMovie() {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		
		

		setMovies(movies);// 제목
		setImgUrlAndCode(movies);// 이미지,코드
		setRating(movies);// 평점
		setEtc(movies);// 장르, 개봉일, 감독, 상영시간, 배우
		
		setSeqAndState(movies); // seq랑 state 에 일단 더미 데이터 넣어주기

		return movies;

	}

	private void setSeqAndState(ArrayList<Movie> movies) {
		for(int i = 0 ; i < movies.size() ; i++) {
			movies.get(i).setMovieSeq(i);
			movies.get(i).setMovieState("상영작");
		}
		
	}

	private void setMovies(ArrayList<Movie> movies) {
		Document doc;
		// 제목
		try {
			doc = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn").get();
			Elements elements = doc.select(".tit a");
			System.out.println("현재 상영작 수 " + elements.size() + "개");
			if (elements.size() > 1) {
				for (Element element : elements) {
					Movie movie = new Movie();
					movie.setMovieTitle(element.text());
					movies.add(movie);
				}
			} else {
				System.out.println("제목 못읽음");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void setImgUrlAndCode(ArrayList<Movie> movies) {

		Document doc;
		// 이미지 및 영화 코드
		try {
			doc = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn").get();
			Elements elements = doc.select(".thumb");
			System.out.println("현재 상영작 수 " + elements.size() + "개");
			if (elements.size() > 1 && (elements.size() == movies.size())) {
				int i = 0;
				for (Element element : elements) {

					String str = element.html();
					String imgUrl = getImgUrl(str).trim();
					String movieCode = getMovieCode(str).trim();
					movies.get(i).setImgUrl(imgUrl);
					movies.get(i).setCode(movieCode);
					i++;
				}
			} else {
				System.out.println("이미지, 코드  못읽음");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void setRating(ArrayList<Movie> movies) {
		Document doc;
		// 평점

		try {
			doc = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn").get();
			Elements elements = doc.select(".info_star .num");
			System.out.println("현재 상영작 수 " + elements.size() + "개");
			if (elements.size() > 1 && (elements.size() == movies.size())) {
				int i = 0;
				for (Element element : elements) {
					movies.get(i++).setRating(element.text());
				}
			} else {
				System.out.println("평점  못읽음");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void setEtc(ArrayList<Movie> movies) {
		Document doc;

		// 장르, 개봉일, 감독, 상영시간, 배우

		try {
			doc = Jsoup.connect("https://movie.naver.com/movie/running/current.nhn").get();
			Elements elements = doc.select(".info_txt1");
			System.out.println("현재 상영작 수 " + elements.size() + "개");
			if (elements.size() > 1 && (elements.size() == movies.size())) {
				int i = 0;
				for (Element element : elements) {
					String text = element.text();
					// System.out.println("영화 장르  = " + text);

					String genre = getStr(text, "genre");
					String time = getStr(text, "time");
					String pupDate = getStr(text, "pupDate");
					String director = getStr(text, "director");
					String actor = getStr(text, "actor");
					
					
					/*System.out.println(genre);
					System.out.println(time);
					System.out.println(pupDate);
					System.out.println(director);
					System.out.println(actor);*/
					
					movies.get(i).setGenre(genre);
					movies.get(i).setTime(time);
					movies.get(i).setPupDate(pupDate);
					movies.get(i).setDirector(director);
					movies.get(i).setActor(actor);
					i++;
				}
			} else {
				System.out.println("Etc 못 읽음");
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String getImgUrl(String text) {
		String regex = "src=\"(http://|https://)[^<>\"]+\"";
		Matcher m = Pattern.compile(regex).matcher(text);
		String str = "";

		while (m.find()) {
			str = m.group().replace("src=\"", "");
			str = str.replace("\"", "");
		}
		return str;
	}

	public static String getMovieCode(String text) {
		String regex = "code=[^<>\"]+\"";
		Matcher m = Pattern.compile(regex).matcher(text);
		String str = "";

		while (m.find()) {
			str = m.group();
			str = str.replace("\"", "");
		}
		return str;
	}

	public static String getStr(String text, String thing) {
		String str = "";
		String regex = "";
		Matcher m = null;

		if (thing.equals("genre")) {
			regex = "개요[^0-9]+(|)";
			m = Pattern.compile(regex).matcher(text);

			while (m.find()) {
				str = m.group();
				str = str.replace("개요", "").replace(" |", "").trim();
			}

		} else if (thing.equals("time")) {
			regex = "[0-9]+분";
			m = Pattern.compile(regex).matcher(text);

			while (m.find()) {
				str = m.group();
				str = str.trim();
			}

		} else if (thing.equals("pupDate")) {
			regex = "...........개봉";
			m = Pattern.compile(regex).matcher(text);

			while (m.find()) {
				str = m.group();
				str = str.replace("개봉", "").trim();
			}

		} else if (thing.equals("director")) {
			regex = "감독.+출연";
			m = Pattern.compile(regex).matcher(text);

			while (m.find()) {
				str = m.group();
				str = str.replace(" 출연", "").replace("감독 ", "").trim();
			}

		} else if (thing.equals("actor")) {
			regex = "출연.+";
			m = Pattern.compile(regex).matcher(text);

			while (m.find()) {
				str = m.group();
				str = str.replace("출연", "").trim();
			}

		}

		return str;
	}

}
