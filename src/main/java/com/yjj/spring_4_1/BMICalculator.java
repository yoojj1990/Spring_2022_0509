package com.yjj.spring_4_1;

public class BMICalculator {

	private double lowWight; //저체중 기준 지수
	private double nomalWight; // 정상체중 기준 지수
	private double overWight; // 과체중 기준 지수
	private double obsityWight; // 비만 기준 지수
	
	public void bmiCalculation(double weight, double height) {
		double h = height * 0.01;
		double result = weight / (h*h); // 몸부게 나누기 키*0.01 의 제곱 = BMI지수
		
		System.out.println("BMI 지수 : " + result);
		
		if(result > obsityWight) {
			System.out.println("비만 입니다");
		} else if(result > overWight) {
			System.out.println("과체중 입니다");
		} else if(result > nomalWight) {
			System.out.println("정상체중 입니다");
		} else {
			System.out.println("저체중 입니다");
		}
	}

	public void setLowWight(double lowWight) {
		this.lowWight = lowWight;
	}

	public void setNomalWight(double nomalWight) {
		this.nomalWight = nomalWight;
	}

	public void setOverWight(double overWight) {
		this.overWight = overWight;
	}

	public void setObsityWight(double obsityWight) {
		this.obsityWight = obsityWight;
	}
	
	
	
	
	
	
	
	
	
	
}
