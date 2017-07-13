package com.cc.costcalculator.controller;

import java.math.BigDecimal;
import java.util.Date;

import com.cc.costcalculator.exception.UnequalCostDTOException;
import com.cc.costcalculator.model.CostDTO;
import com.cc.costcalculator.model.CostDTOBuilder;
import com.cc.costcalculator.service.CostCalculatorImpl;

public class RunApplicationController {

	public static void main(String[] args) {
		CostCalculatorImpl calculatorImpl = new CostCalculatorImpl();
		
		CostDTO arg1 = new CostDTOBuilder()
				.costId("asdf")
				.costAmount(new BigDecimal("100.534"))
				.effectiveDate(new Date())
				.build();
		
		CostDTO arg2 = new CostDTOBuilder()
				.costId("asdf")
				.costAmount(new BigDecimal("50.23"))
				.effectiveDate(new Date())
				.build();
		
		try{
			CostDTO arg3 = calculatorImpl.add(arg1, arg2);
			System.out.println(arg3);
		} catch (UnequalCostDTOException e) {
			System.out.println(e.getMessage());
		}
		
		try{
			CostDTO arg4 = calculatorImpl.subtract(arg1, arg2);
			System.out.println(arg4);
		} catch (UnequalCostDTOException e) {
			System.out.println(e.getMessage());
		}

	}

}
