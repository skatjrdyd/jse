package oop01.encapusle;

public class KaupVO {
	//필드
	private double height;
	private double weight; //몸무게
	int idx;
	private String msg;
	
	// 생성자
	public KaupVO(double height, double weight){
		this.height = height;
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = (int)((weight/(height*height))*10000);
	}

	public String getMsg() {
		String msg = "";
		if(idx > 30){
			msg = "비만";
		}else if(idx > 24){
			msg = "과체중";
		}else if(idx > 20){
			msg ="정상";
		}else if (idx > 15){
			msg = "저체중";
		}else if(idx > 13){
			msg = "마름";
		}else if(idx > 10){
			msg = "영양실조";
		}else{
			msg = "소모증";
		}
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	// ALT + SHIFT + S

	@Override
	public String toString() {
		return "카우프지수 [height=" + height + ", weight=" + weight + ", idx="
				+ idx + ", msg=" + msg + "]";
	}
	
	
}
