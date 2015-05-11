package com.stardust.express.models;

import java.util.Date;

import com.stardust.express.tools.IViewContext;

public class HistoryRecord  extends DataModel {
	private String vehicleNumber = "";
	private String entranceGateway = "";
	private String exitGateway = "";
	private Date date;
	private double amount = 0;
	private String comment;
	private String merchandiseType = "";
	private String vehicleType = "";
	private String channel = "";
	private String snapshoot1 = "";
	private String snapshoot2 = "";
	private String snapshoot3 = "";
	private String snapshoot4 = "";
	private String video = "";
	private User operator;
	private User leader;
	
	public HistoryRecord(IViewContext ctx) {
		vehicleNumber = ctx.getString("vehicleNumber");
		entranceGateway = ctx.getString("entranceGateway");
		exitGateway = ctx.getString("exitGateway");
		date = ctx.getDate("date");
		amount = ctx.getDouble("amount");
		comment = ctx.getString("comment");
		merchandiseType = ctx.getString("merchandiseType");
		vehicleType = ctx.getString("vehicleType");
		channel = ctx.getString("channel");
		snapshoot1 = ctx.getString("snapshoot1");
		snapshoot2 = ctx.getString("snapshoot2");
		snapshoot3 = ctx.getString("snapshoot3");
		snapshoot4 = ctx.getString("snapshoot4");
		video = ctx.getString("video");
		if (ctx.getLong("operatorId") > 0) {
			User user = new User();
			user.setId(ctx.getLong("operatorId"));
		}
	}
	
	public void setVehicleNumber(String number) {
		vehicleNumber = number;
	}
	
	public String getVehicleNumber(){
		return vehicleNumber;
	}
	
	public void setEntranceGateway(String gateway) {
		entranceGateway = gateway;
	}
	
	public String getEntranceGateway(){
		return entranceGateway;
	}
	
	public void setExitGateway(String gateway) {
		exitGateway = gateway;
	}
	
	public String getExitGateway(){
		return exitGateway;
	}
	
	public void setDate(Date d) {
		date = d;
	}
	
	public Date getDate(){
		return date;
	}
	
	public void setAmount(double amt) {
		amount = amt;
	}
	
	public double getAmount(){
		return amount;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getComment(){
		return comment;
	}
	
	public void setChannel(String channel) {
		this.channel = channel;
	}
	
	public String getChannel(){
		return channel;
	}
	
	public void setMerchandiseType(String type) {
		merchandiseType = type;
	}
	
	public String getMerchandiseType(){
		return merchandiseType;
	}
	
	public void setVehicleType(String type) {
		vehicleType = type;
	}
	
	public String getVehicleType(){
		return vehicleType;
	}
	
	public void setSnapshoot1(String path) {
		snapshoot1 = path;
	}
	
	public String getSnapshoot1(){
		return snapshoot1;
	}
	
	public void setSnapshoot2(String path) {
		snapshoot2 = path;
	}
	
	public String getSnapshoot2(){
		return snapshoot2;
	}
	
	public void setSnapshoot3(String path) {
		snapshoot3 = path;
	}
	
	public String getSnapshoot3(){
		return snapshoot3;
	}
	
	public void setSnapshoot4(String path) {
		snapshoot4 = path;
	}
	
	public String getSnapshoot4(){
		return snapshoot4;
	}
	
	public void setVideo(String path) {
		video = path;
	}
	
	public String getVideo(){
		return video;
	}
	
	public void setOperator(User operator) {
		this.operator = operator;
	}
	
	public User getOperator(){
		return operator;
	}
	
	public void setLeader(User leader) {
		this.leader = leader;
	}
	
	public User getLeader(){
		return leader;
	}
}
