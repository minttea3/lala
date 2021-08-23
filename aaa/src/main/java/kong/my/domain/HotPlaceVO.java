package kong.my.domain;

public class HotPlaceVO {
	private int idx;		// 순번
	private String s_idx;	// 지역
	private String t_idx;	// 테마
	private String shopname;// 가게 이름
	private String image;	// 이미지
	private String loc;		// 위치
	private String hours;	// 영업시간
	private String menuprice;// 메뉴, 가격
	private String comments; // 댓글
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getS_idx() {
		return s_idx;
	}
	public void setS_idx(String s_idx) {
		this.s_idx = s_idx;
	}
	public String getT_idx() {
		return t_idx;
	}
	public void setT_idx(String t_idx) {
		this.t_idx = t_idx;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public String getMenuprice() {
		return menuprice;
	}
	public void setMenuprice(String menuprice) {
		this.menuprice = menuprice;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
	
	
}
