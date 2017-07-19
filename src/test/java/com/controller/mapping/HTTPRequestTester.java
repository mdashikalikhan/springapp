package com.controller.mapping;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.RequestMethod;

public class HTTPRequestTester {

	/*private final String USER_AGENT = "Mozilla/5.0";*/
	
	public static void main(String[] args)  {
		
		HTTPRequestTester request = new HTTPRequestTester();
		
			try {
				request.sendGetRequest("http://localhost:7001/springapp/method0");
				
				request.sendPostRequest("http://localhost:7001/springapp/method9");				
				
				request.sendPostRequest("http://localhost:7001/springapp/method6");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		
		
			
		
	}
	
	
	private void sendGetRequest(String urlText) throws IOException {
		URL url = new URL(urlText);
		
		HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
		
		httpConnection.setRequestMethod(RequestMethod.GET.toString());
		
		/*httpConnection.setRequestProperty("User-Agent", USER_AGENT);*/
		
		int responseCode = httpConnection.getResponseCode();
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
		
		StringBuffer response = new StringBuffer();
		
		String inputLine;
		
		while((inputLine = buffer.readLine())!=null) {
			response.append(inputLine);
		}
		
		buffer.close();
		
		httpConnection.disconnect();
		
		System.out.println("GET " + urlText);
		System.out.println(responseCode);
		System.out.println(response.toString());
	}
	
	private void sendPostRequest(String urlText) throws IOException {
		URL url = new URL(urlText);
		
		HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
		
		httpConnection.setRequestMethod(RequestMethod.POST.toString());
		
		httpConnection.setDoOutput(true);
		
		DataOutputStream writeConnection = new DataOutputStream(httpConnection.getOutputStream());
		
		writeConnection.flush();
		
		writeConnection.close();
		
		int responseCode = httpConnection.getResponseCode();
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(httpConnection.getInputStream()));
		
		StringBuffer response = new StringBuffer();
		
		String inputLine;
		
		while((inputLine = buffer.readLine())!=null) {
			response.append(inputLine);
		}
		
		buffer.close();
		
		httpConnection.disconnect();
		
		System.out.println("POST " + urlText);
		System.out.println(responseCode);
		System.out.println(response.toString());
	}
	

}