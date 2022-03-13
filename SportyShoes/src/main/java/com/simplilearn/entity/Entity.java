package com.simplilearn.entity;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


import java.util.Date;

@MappedSuperclass

public abstract class Entity {
    @Column(nullable = false, updatable = false)
    private Date createDate;
    @Column(insertable = false)
    private Date lastUpdateDate;
    
    public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
}
