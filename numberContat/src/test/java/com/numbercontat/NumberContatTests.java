package com.numbercontat;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.assertj.core.api.Assertions.assertThat;

public class NumberContatTests {


	@Test
	public void testZero() {
		
		assertThat(NumberContat.buildTheThird(0, 0)).isEqualTo(0);
		
	}
	
	@Test
	public void happyExerciseExample() {
		assertThat(NumberContat.buildTheThird(10256, 512)).isNotEqualTo(0);
		assertThat(NumberContat.buildTheThird(10256, 512)).isEqualTo(15012256);
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

}
