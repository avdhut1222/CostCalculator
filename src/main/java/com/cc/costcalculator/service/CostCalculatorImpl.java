package com.cc.costcalculator.service;

import java.math.BigDecimal;
import java.util.Date;

import com.cc.costcalculator.exception.UnequalCostDTOException;
import com.cc.costcalculator.model.CostDTO;
import com.cc.costcalculator.model.CostDTOBuilder;

public class CostCalculatorImpl implements CostCalculator {

	public CostDTO add(CostDTO arg1, CostDTO arg2) throws UnequalCostDTOException {
		if(arg1.equals(arg2)){
			return new CostDTOBuilder()
					.costId(arg1.getCostId())
					.costAmount(arg1.getCostAmount().add(arg2.getCostAmount()))
					.effectiveDate( (arg1.getEffectiveDate().compareTo(arg2.getEffectiveDate()) < 0) ? arg1.getEffectiveDate() : arg2.getEffectiveDate())
					.build();
		} else {
			throw new UnequalCostDTOException("ERROR! CostIds don't match for the arguments.");
		}
//		return null;
	}

	public CostDTO subtract(CostDTO arg1, CostDTO arg2) throws UnequalCostDTOException {
		if(arg1.equals(arg2)){
			return new CostDTOBuilder()
					.costId(arg1.getCostId())
					.costAmount(arg1.getCostAmount().subtract(arg2.getCostAmount()))
					.effectiveDate( (arg1.getEffectiveDate().compareTo(arg2.getEffectiveDate()) < 0) ? arg1.getEffectiveDate() : arg2.getEffectiveDate())
					.build();
		} else {
			throw new UnequalCostDTOException("ERROR! CostIds don't match for the arguments.");
		}
//		return null;
	}
}
