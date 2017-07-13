package com.cc.costcalculator.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class CostDTO {
	
	private String costId;
	private BigDecimal costAmount;
	private Date effectiveDate;
	
	public String getCostId() {
		return costId;
	}
	public void setCostId(String costId) {
		this.costId = costId;
	}
	public BigDecimal getCostAmount() {
		return costAmount;
	}
	public void setCostAmount(BigDecimal costAmount) {
		this.costAmount = costAmount;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	
	@Override
    public boolean equals(Object object) {
		if(object == this) return true;
		if(!(object instanceof CostDTO)) return false;
		
		CostDTO costDTO = (CostDTO) object;
		
		return Objects.equals(this.getCostId(), costDTO.getCostId());
    }
	
	@Override
    public int hashCode() {
        return Objects.hash(this.getCostId());
    }
	
	@Override
	public String toString() {
		return "CostDTO [costId=" + costId + ", costAmount=" + costAmount + ", effectiveDate=" + effectiveDate + "]";
	}
	
	

}
