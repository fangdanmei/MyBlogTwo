package entity;

import java.io.Serializable;

public class BlogType implements Serializable {
	private static final long serialVersionID=1L;
	private Integer id;
	private String typeName;
	private Integer orderNo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}
	

}
