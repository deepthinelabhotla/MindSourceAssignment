package com.test;

import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.util.Configuration;
import com.util.RestUtil;

public class ITunesTest extends BaseTest {
	RestUtil util;

	@BeforeClass
	public void beforeClass() {
		util = new RestUtil();
		
		util.getRequest(Configuration.URI);
	}
	
	@Test
	public void testStatusCode() {
		Assert.assertEquals(HttpStatus.SC_OK, util.validateStatusCode());
	}

	@Test
	public void testResultCount() {
		Assert.assertEquals("5", util.validateResultCount());
	}

	@Test
	public void testTrackId() {
		Assert.assertEquals("1068799088", util.validateTrackId());
	}

	@Test
	public void testArtistName() {
		Assert.assertEquals("Taylor Swift", util.validateArtistName());
	}
}
