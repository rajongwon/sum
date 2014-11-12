package sumModel.diary;

import java.util.Date;

public class ManDiaryDto {
	private int m_diary_num;		//남자 다이어리 번호
	private String m_id;			//남자 아이디
	private String m_diary_subject;	//남자 다이어리 제목
	private String m_diary_content;	//남자 다이어리 내용
	private Date m_diary_date;		//남자 다이어리 날짜
	private String m_diary_weather;	//남자 다이어리 날씨
	
	public int getM_diary_num() {
		return m_diary_num;
	}
	
	public void setM_diary_num(int m_diary_num) {
		this.m_diary_num = m_diary_num;
	}
	
	public String getM_id() {
		return m_id;
	}
	
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	
	public String getM_diary_subject() {
		return m_diary_subject;
	}
	
	public void setM_diary_subject(String m_diary_subject) {
		this.m_diary_subject = m_diary_subject;
	}
	
	public String getM_diary_content() {
		return m_diary_content;
	}
	
	public void setM_diary_content(String m_diary_content) {
		this.m_diary_content = m_diary_content;
	}
	
	public Date getM_diary_date() {
		return m_diary_date;
	}
	
	public void setM_diary_date(Date m_diary_date) {
		this.m_diary_date = m_diary_date;
	}
	
	public String getM_diary_weather() {
		return m_diary_weather;
	}
	
	public void setM_diary_weather(String m_diary_weather) {
		this.m_diary_weather = m_diary_weather;
	}
}
