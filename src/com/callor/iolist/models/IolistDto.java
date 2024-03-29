package com.callor.iolist.models;

public class IolistDto {
	public long ioSEQ;		//NUMBER
	public String ioDate;	//VARCHAR2(10)
	public String ioTime;	//VARCHAR2(10)
	public String ioBuId;	//VARCHAR2(10)
	public String ioPCode;	//VARCHAR2(13)
	private int ioQuan;		//NUMBER
	private int ioPrice;		//NUMBER
	public int ioTotal;		//NUMBER
	
	/**
	 * @date : 2023.06.22 
	 * @author : 나
	 * 판매단가와 수량 private
	 * 판매단가 또는 수량을 입력하면 합계(ioTotal)을
	 * 자동 계산하고 싶어서
	 */
	
	public IolistDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IolistDto(long ioSEQ, String ioDate, String ioTime, String ioBuId, String ioPCode, int ioQuan, int ioPrice,
			int ioTotal) {
		super();
		this.ioSEQ = ioSEQ;
		this.ioDate = ioDate;
		this.ioTime = ioTime;
		this.ioBuId = ioBuId;
		this.ioPCode = ioPCode;
		this.ioQuan = ioQuan;
		this.ioPrice = ioPrice;
		this.ioTotal = ioTotal;
	}
	
	public int getIoQuan() {
		return ioQuan;
	}
	public void setIoQuan(int ioQuan) {
		this.ioQuan = ioQuan;
		this.ioTotal = this.ioQuan * this.ioPrice;
	}
	public int getIoPrice() {
		return ioPrice;
	}
	public void setIoPrice(int ioPrice) {
		this.ioPrice = ioPrice;
		this.ioTotal = this.ioQuan * this.ioPrice;
	}
	
	
	@Override
	public String toString() {
		return "IolistDto [ioSEQ=" + ioSEQ + ", ioDate=" + ioDate + ", ioTime=" + ioTime + ", ioBuId=" + ioBuId
				+ ", ioPCode=" + ioPCode + ", ioQuan=" + ioQuan + ", ioPrice=" + ioPrice + ", ioTotal=" + ioTotal + "]";
	}
	
	

}
