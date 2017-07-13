package com.cc.costcalculator.service;

import com.cc.costcalculator.exception.UnequalCostDTOException;
import com.cc.costcalculator.model.CostDTO;

public interface CostCalculator {
	CostDTO add(CostDTO arg1, CostDTO arg2) throws UnequalCostDTOException;
	CostDTO subtract(CostDTO arg1, CostDTO arg2) throws UnequalCostDTOException;
}
