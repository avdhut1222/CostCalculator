package com.cc.costcalculator.model;

import java.math.BigDecimal;
import java.util.Date;

public class CostDTOBuilder {
	
	private CostDTO costDTO = new CostDTO();

	public CostDTO build(){
		return this.costDTO;
	}
	
	public CostDTOBuilder costId(String costId){
		this.costDTO.setCostId(costId);
		return this;
	}
	
	public CostDTOBuilder costAmount(BigDecimal costAmount){
		this.costDTO.setCostAmount(costAmount);
		return this;
	}
	
	public CostDTOBuilder effectiveDate(Date effectiveDate){
		this.costDTO.setEffectiveDate(effectiveDate);
		return this;
	}

}
