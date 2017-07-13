package com.cc.costcalculator.service;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cc.costcalculator.exception.UnequalCostDTOException;
import com.cc.costcalculator.model.CostDTO;
import com.cc.costcalculator.model.CostDTOBuilder;

public class CostCalculatorImplTest {
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
	
	CostDTO arg3 = new CostDTOBuilder()
			.costId("asdfg")
			.costAmount(new BigDecimal("50.23"))
			.effectiveDate(new Date())
			.build();
	
	CostDTO arg4 = new CostDTOBuilder()
			.costId("asdf")
			.costAmount(new BigDecimal("150.764"))
			.effectiveDate(new Date())
			.build();

	CostDTO arg5 = new CostDTOBuilder()
			.costId("asdf")
			.costAmount(new BigDecimal("50.304"))
			.effectiveDate(new Date())
			.build();
	
	@Test
	public final void testAdd() throws UnequalCostDTOException {
		CostDTO costDTO = this.calculatorImpl.add(arg1, arg2);
		assertEquals(new BigDecimal("150.764"), costDTO.getCostAmount());
	}
	
	@Test(expected = UnequalCostDTOException.class)
	public final void testAddFail() throws UnequalCostDTOException {
		CostDTO costDTO = this.calculatorImpl.add(arg1, arg3);
	}

	@Test
	public final void testSubtract() throws UnequalCostDTOException {
		CostDTO costDTO = this.calculatorImpl.subtract(arg1, arg2);
		assertEquals(new BigDecimal("50.304"), costDTO.getCostAmount());
	}
	
	@Test(expected = UnequalCostDTOException.class)
	public final void testSubtractFail() throws UnequalCostDTOException {
		CostDTO costDTO = this.calculatorImpl.subtract(arg1, arg3);
	}


}
