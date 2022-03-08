package org.infinitt.domain;
public class Criteria {
	private int pageNum;//����¡��ȣ
	private int amount;//�� �������� �Խù� ����
	private String search;//�˻�����
	private String keyword;//�˻�Ű����
	
	private ResumeDTO resume;
	
	public ResumeDTO getResume() {
		return resume;
	}

	public void setResume(ResumeDTO resume) {
		this.resume = resume;
	}

	//�⺻������
	public Criteria(){
		this(1,10);//1�������� 10��
	}
	
	//������ ȣ��
	public Criteria(int pageNum, int amount){
		this.pageNum=pageNum;
		this.amount=amount;
	}
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Override
	public String toString() {
		return "Criteria [pageNum=" + pageNum + ", amount=" + amount + ", search=" + search + ", keyword=" + keyword
				+ ", resume=" + resume + "]";
	}
	
	
	
	
	
}
