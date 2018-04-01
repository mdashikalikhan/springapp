package com.controller.operations;

import org.springframework.stereotype.Service;

@Service
public class NumberManagerImpl implements NumberManager {

	@Override
	public Number add(NumbersVo numbersVo) {
		return numbersVo.getNumber1() + numbersVo.getNumber2() + numbersVo.getNumber3();
	}

	@Override
	public Number customCalculation(NumbersVo numbersVo) {
		return numbersVo.getNumber1() + numbersVo.getNumber2() - numbersVo.getNumber3();
	}

}
