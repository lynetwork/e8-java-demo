package com.ly.e8.entity;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Order implements Serializable {
	
	private static final long serialVersionUID = 3044728333959333996L;
	private String ly_user_id;
	private String ly_order_no;
	private String ly_money;
	private String ly_trade_type;
	private String ly_return_url;
	private String ly_notify_url;
	private String ly_notes;
	private String ly_sign_type;
	private String ly_scan_code;
	private String ly_skip_not_page;
	private String ly_body;
	public Order(String ly_user_id, String ly_order_no, String ly_money, String ly_trade_type, String ly_return_url,
			String ly_notify_url, String ly_notes, String ly_sign_type, String ly_scan_code, String ly_skip_not_page,
			String ly_body) {
		super();
		this.ly_user_id = ly_user_id;
		this.ly_order_no = ly_order_no;
		this.ly_money = ly_money;
		this.ly_trade_type = ly_trade_type;
		this.ly_return_url = ly_return_url;
		this.ly_notify_url = ly_notify_url;
		this.ly_notes = ly_notes;
		this.ly_sign_type = ly_sign_type;
		this.ly_scan_code = ly_scan_code;
		this.ly_skip_not_page = ly_skip_not_page;
		this.ly_body = ly_body;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLy_user_id() {
		return ly_user_id;
	}
	public void setLy_user_id(String ly_user_id) {
		this.ly_user_id = ly_user_id;
	}
	public String getLy_order_no() {
		return ly_order_no;
	}
	public void setLy_order_no(String ly_order_no) {
		this.ly_order_no = ly_order_no;
	}
	public String getLy_money() {
		return ly_money;
	}
	public void setLy_money(String ly_money) {
		this.ly_money = ly_money;
	}
	public String getLy_trade_type() {
		return ly_trade_type;
	}
	public void setLy_trade_type(String ly_trade_type) {
		this.ly_trade_type = ly_trade_type;
	}
	public String getLy_return_url() {
		return ly_return_url;
	}
	public void setLy_return_url(String ly_return_url) {
		this.ly_return_url = ly_return_url;
	}
	public String getLy_notify_url() {
		return ly_notify_url;
	}
	public void setLy_notify_url(String ly_notify_url) {
		this.ly_notify_url = ly_notify_url;
	}
	public String getLy_notes() {
		return ly_notes;
	}
	public void setLy_notes(String ly_notes) {
		this.ly_notes = ly_notes;
	}
	public String getLy_sign_type() {
		return ly_sign_type;
	}
	public void setLy_sign_type(String ly_sign_type) {
		this.ly_sign_type = ly_sign_type;
	}
	public String getLy_scan_code() {
		return ly_scan_code;
	}
	public void setLy_scan_code(String ly_scan_code) {
		this.ly_scan_code = ly_scan_code;
	}
	public String getLy_skip_not_page() {
		return ly_skip_not_page;
	}
	public void setLy_skip_not_page(String ly_skip_not_page) {
		this.ly_skip_not_page = ly_skip_not_page;
	}
	public String getLy_body() {
		return ly_body;
	}
	public void setLy_body(String ly_body) {
		this.ly_body = ly_body;
	}
	
	
	
}
