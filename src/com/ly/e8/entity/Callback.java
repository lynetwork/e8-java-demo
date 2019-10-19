package com.ly.e8.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Callback implements Serializable {

	private static final long serialVersionUID = -9168109847759346549L;
	private String ly_money;
	private String ly_sys_order_no;
	private String ly_user_order_no;
	private String ly_user_id;
	private String result_status;
	private String ly_sign;
	public Callback(String ly_money, String ly_sys_order_no, String ly_user_order_no, String ly_user_id,
			String result_status, String ly_sign) {
		super();
		this.ly_money = ly_money;
		this.ly_sys_order_no = ly_sys_order_no;
		this.ly_user_order_no = ly_user_order_no;
		this.ly_user_id = ly_user_id;
		this.result_status = result_status;
		this.ly_sign = ly_sign;
	}
	public Callback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLy_money() {
		return ly_money;
	}
	public void setLy_money(String ly_money) {
		this.ly_money = ly_money;
	}
	public String getLy_sys_order_no() {
		return ly_sys_order_no;
	}
	public void setLy_sys_order_no(String ly_sys_order_no) {
		this.ly_sys_order_no = ly_sys_order_no;
	}
	public String getLy_user_order_no() {
		return ly_user_order_no;
	}
	public void setLy_user_order_no(String ly_user_order_no) {
		this.ly_user_order_no = ly_user_order_no;
	}
	public String getLy_user_id() {
		return ly_user_id;
	}
	public void setLy_user_id(String ly_user_id) {
		this.ly_user_id = ly_user_id;
	}
	public String getResult_status() {
		return result_status;
	}
	public void setResult_status(String result_status) {
		this.result_status = result_status;
	}
	public String getLy_sign() {
		return ly_sign;
	}
	public void setLy_sign(String ly_sign) {
		this.ly_sign = ly_sign;
	}
	
	
}
