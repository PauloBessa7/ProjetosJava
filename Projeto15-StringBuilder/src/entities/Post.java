package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	private List<comment> com = new ArrayList<>();

	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Post() {
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<comment> getCom() {
		return com;
	}

	public void setCom(List<comment> com) {
		this.com = com;
	}
	
	public void addComment(comment com) {
		this.com.add(com);
	}
	
	public void removeComment(comment com) {
		this.com.add(com);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.title+"\n");
		sb.append(this.likes);
		sb.append(" Likes - ");
		sb.append(this.moment.format(fmt)+"\n");
		sb.append(content+"\n");
		sb.append("Comments: \n");
		for(comment a : com) {
			sb.append(a.getText()+"\n");
		}
		return sb.toString();
	}
}
