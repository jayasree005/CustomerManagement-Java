package com.customerManagement.pojo;

public class Customer 
{
  private int cid;
  private String name;
  private long phonenumber; 
  private int numberofsarees;
  private String givendate;
  private String deliverystatus;
  private int cost;
  private String Cover;
  
	public String getCover() {
	return Cover;
}

public void setCover(String cover) {
	Cover = cover;
}

	public int getCid() 
	{
		return cid;
	}
	
	public void setCid(int cid) 
	{
		this.cid = cid;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public long getPhonenumber() 
	{
		return phonenumber;
	}
	
	public void setPhonenumber(long phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	
	public int getNumberofsarees() 
	{
		return numberofsarees;
	}
	
	public void setNumberofsarees(int numberofsarees) 
	{
		this.numberofsarees = numberofsarees;
	}
	
	public String getGivendate() 
	{
		return givendate;
	}
	
	public void setGivendate(String givendate) 
	{
		this.givendate = givendate;
	}
	
	
	
	public String getDeliverystatus() 
	{
		return deliverystatus;
	}

	public void setDeliverystatus(String deliverystatus) 
	{
		this.deliverystatus = deliverystatus;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", phonenumber=" + phonenumber + ", numberofsarees="
				+ numberofsarees + ", givendate=" + givendate + ", deliverystatus=" + deliverystatus + ", cost=" + cost
				+ "]";
	}

	public int getCost() 
	{
		return cost;
	}
	
	public void setCost(int cost)
	{
		this.cost = cost;
	}
}
