package org.zerock.sample;

import lombok.extern.log4j.Log4j;

@Log4j
public class KoreanCook implements Cook{
	

	public void init() {
		log.info("koreancook init...");
	}
	
	public void destory() {
		log.info("destroy...");
				
	}
}
