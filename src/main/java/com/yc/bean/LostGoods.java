package com.yc.bean;

public class LostGoods {
	
	private Integer id;
	private String name;
	private String description;
	private String lost_province;
	private String lost_city;
	private String lost_district;
	private String lost_address;
	private String img;
	private String reward;
	private Account account;
	private LostType lost_type;
	private Integer status;
	private Integer create_time;
	
	private Integer update_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLost_province() {
		return lost_province;
	}

	public void setLost_province(String lost_province) {
		this.lost_province = lost_province;
	}

	public String getLost_city() {
		return lost_city;
	}

	public void setLost_city(String lost_city) {
		this.lost_city = lost_city;
	}

	public String getLost_district() {
		return lost_district;
	}

	public void setLost_district(String lost_district) {
		this.lost_district = lost_district;
	}

	public String getLost_address() {
		return lost_address;
	}

	public void setLost_address(String lost_address) {
		this.lost_address = lost_address;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public LostType getLost_type() {
		return lost_type;
	}

	public void setLost_type(LostType lost_type) {
		this.lost_type = lost_type;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Integer create_time) {
		this.create_time = create_time;
	}

	public Integer getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Integer update_time) {
		this.update_time = update_time;
	}

	@Override
	public String toString() {
		return "LostGoods [id=" + id + ", name=" + name + ", description="
				+ description + ", lost_province=" + lost_province
				+ ", lost_city=" + lost_city + ", lost_district="
				+ lost_district + ", lost_address=" + lost_address + ", img="
				+ img + ", reward=" + reward + ", account=" + account
				+ ", lost_type=" + lost_type + ", status=" + status
				+ ", create_time=" + create_time + ", update_time="
				+ update_time + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result
				+ ((create_time == null) ? 0 : create_time.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((img == null) ? 0 : img.hashCode());
		result = prime * result
				+ ((lost_address == null) ? 0 : lost_address.hashCode());
		result = prime * result
				+ ((lost_city == null) ? 0 : lost_city.hashCode());
		result = prime * result
				+ ((lost_district == null) ? 0 : lost_district.hashCode());
		result = prime * result
				+ ((lost_province == null) ? 0 : lost_province.hashCode());
		result = prime * result
				+ ((lost_type == null) ? 0 : lost_type.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((reward == null) ? 0 : reward.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((update_time == null) ? 0 : update_time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LostGoods other = (LostGoods) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (create_time == null) {
			if (other.create_time != null)
				return false;
		} else if (!create_time.equals(other.create_time))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (img == null) {
			if (other.img != null)
				return false;
		} else if (!img.equals(other.img))
			return false;
		if (lost_address == null) {
			if (other.lost_address != null)
				return false;
		} else if (!lost_address.equals(other.lost_address))
			return false;
		if (lost_city == null) {
			if (other.lost_city != null)
				return false;
		} else if (!lost_city.equals(other.lost_city))
			return false;
		if (lost_district == null) {
			if (other.lost_district != null)
				return false;
		} else if (!lost_district.equals(other.lost_district))
			return false;
		if (lost_province == null) {
			if (other.lost_province != null)
				return false;
		} else if (!lost_province.equals(other.lost_province))
			return false;
		if (lost_type == null) {
			if (other.lost_type != null)
				return false;
		} else if (!lost_type.equals(other.lost_type))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (reward == null) {
			if (other.reward != null)
				return false;
		} else if (!reward.equals(other.reward))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (update_time == null) {
			if (other.update_time != null)
				return false;
		} else if (!update_time.equals(other.update_time))
			return false;
		return true;
	}

	public LostGoods(Integer id, String name, String description,
			String lost_province, String lost_city, String lost_district,
			String lost_address, String img, String reward, Account account,
			LostType lost_type, Integer status, Integer create_time,
			Integer update_time) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.lost_province = lost_province;
		this.lost_city = lost_city;
		this.lost_district = lost_district;
		this.lost_address = lost_address;
		this.img = img;
		this.reward = reward;
		this.account = account;
		this.lost_type = lost_type;
		this.status = status;
		this.create_time = create_time;
		this.update_time = update_time;
	}

	public LostGoods() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
