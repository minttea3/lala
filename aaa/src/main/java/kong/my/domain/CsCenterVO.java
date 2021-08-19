package kong.my.domain;

import java.util.Date;

public class CsCenterVO {
	
	private int idx;		// 순번
	private String writer;	// 글쓴이 이름
	private String subject;	// 제목
	private String content;	// 내용
	private Date writedate;	// 작성 일자
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWritedate() {
		return writedate;
	}
	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}
	
	

}
