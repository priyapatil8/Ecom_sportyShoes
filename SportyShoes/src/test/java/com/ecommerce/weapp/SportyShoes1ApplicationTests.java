package com.ecommerce.weapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.webapp.Controller.ShoeController;
import com.ecommerce.webapp.Pojo.ShoeDetails;

class SportyShoes1ApplicationTests {

	@Test
	void contextLoads() throws Exception {

		ShoeController shoeContrl = new ShoeController();

		ShoeDetails shoeDetls = new ShoeDetails();

		// SportyShoes1Application sportyShoesApp = new SportyShoes1Application();
		assertThat(shoeContrl).isNotNull();
		assertThat(shoeDetls).isNotNull();
	}

}
