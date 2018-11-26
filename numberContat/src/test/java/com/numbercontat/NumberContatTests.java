package com.numbercontat;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class NumberContatTests {


	@Test
	public void testZero() {
		assertThat(NumberContat.buildTheThird(0, 0)).isEqualTo(0);
	}
	
	@Test
	public void happyExerciseExample() {
		assertThat(NumberContat.buildTheThird(10256, 512)).isNotEqualTo(0);
		// assertThat(NumberContat.buildTheThird(10256, 512)).isEqualTo(15012256);
		assertThat(NumberContat.buildTheThird(10256, 512)).isEqualTo(-1);
	}
	
	@Test
	public void hitMillion() {
		assertThat(NumberContat.buildTheThird(1111, 111)).isNotEqualTo(0);
		assertThat(NumberContat.buildTheThird(1111, 111)).isEqualTo(-1);
	}
	
	@Test
	public void testHappy01() {
		assertThat(NumberContat.buildTheThird(1, 1)).isNotEqualTo(0);
		assertThat(NumberContat.buildTheThird(1, 1)).isEqualTo(11);
	}

	@Test
	public void testHappy02() {
		assertThat(NumberContat.buildTheThird(13, 24)).isNotEqualTo(0);
	}
	
	@Test
	public void testHappy03FirstBigger() {
		assertThat(NumberContat.buildTheThird(1356, 24)).isNotEqualTo(0);
		assertThat(NumberContat.buildTheThird(1356, 24)).isEqualTo(123456);
	}
	
	@Test
	public void testHappy04FirstBigger() {
		assertThat(NumberContat.buildTheThird(13456, 2)).isNotEqualTo(0);
		assertThat(NumberContat.buildTheThird(13456, 2)).isEqualTo(123456);
	}
	
	@Test
	public void testHappy03SecondBigger() {
		assertThat(NumberContat.buildTheThird(1, 23456)).isNotEqualTo(0);
		assertThat(NumberContat.buildTheThird(1, 23456)).isEqualTo(123456);
	}

}
