package com.util;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import com.pojo.MyItunes;


public class RestUtil {
	HttpResponse response;
	private MyItunes pojo;

	public MyItunes getMyPojo() {
		return pojo;
	}

	public void setMyPojo(MyItunes pojo) {
		this.pojo = pojo;
	}

	public void getRequest(String URI) {
		try {
			HttpGet get = new HttpGet(URI);
			get.addHeader(HttpHeaders.CONTENT_TYPE, "application/json");
			response = HttpClientBuilder.create().build().execute(get);
			if (response != null) {
				setMyPojo(ResourceUtil.retrieveResource(response, MyItunes.class));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int validateStatusCode() {
		return response.getStatusLine().getStatusCode();
	}

	public String validateResultCount() {
		pojo = getMyPojo();
		return pojo.getResultCount();
	}

	public String validateTrackId() {
		return getMyPojo().getResults()[0].getTrackId();
	}

	public String validateArtistName() {
		return getMyPojo().getResults()[0].getArtistName();
	}
}
