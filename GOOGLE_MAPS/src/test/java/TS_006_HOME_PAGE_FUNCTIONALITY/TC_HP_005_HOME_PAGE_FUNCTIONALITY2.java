package TS_006_HOME_PAGE_FUNCTIONALITY;

import org.testng.annotations.Test;

import BASE_CLASS_GOOGLE_MAPS.GM_BASE_CLASS;

public class TC_HP_005_HOME_PAGE_FUNCTIONALITY2 extends GM_BASE_CLASS {
	@Test
	public void validate_supported_env_gm_hp_001() {
		driver.manage().window().maximize();

		// 'home page' functionality is working in all the supported environments

	}
}
