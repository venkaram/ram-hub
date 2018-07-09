package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestTest {
	
	public static void main(String[] args) {
		
		try{
			//URL url = new URL("http://10.21.213.20:8080/PolicyTrackingWS/v1/policytrackings/status");
			URL url = new URL("http://localhost:8080/AutoPriority/priority/calculate?appNum=1239182391");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("GET");
			//conn.setRequestProperty("Accept", "application/json");
			
			String input = "{PolicyNo:'12345678'}";
			
			/*OutputStream os = conn.getOutputStream();
			os.write(input.getBytes());
			os.flush();*/

			if (conn.getResponseCode() != 200) {
				System.out.println(conn.getHeaderFields().toString());
				BufferedReader br = new BufferedReader(new InputStreamReader((conn.getErrorStream())));
				String output;
				System.out.println("Output from Server Error .... \n");
				output = org.apache.commons.io.IOUtils.toString(br);
				System.out.println("===="+output);
				/*while ((output = br.readLine()) != null) {
					System.out.println(output);
				}*/
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
				(conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			output = org.apache.commons.io.IOUtils.toString(br);
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}
			System.out.println(output);

			conn.disconnect();
		} catch(Exception e){
			e.printStackTrace();
		}
		
		/*try{
			String str = "http://localhost:8080/AutoPriority/priority/calculate?appNum=1239182391";
			HttpClient client = HttpClientBuilder.create().build();
			
			HttpGet request = new HttpGet(str);

	        // add request header
	        HttpResponse response = client.execute(request);
	        System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
	        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
	        StringBuffer result = new StringBuffer();
	        String line = "";
	        while ((line = rd.readLine()) != null)
	            result.append(line);
	        System.out.println(result);
			
		} catch(Exception e){
			e.printStackTrace();
		}*/
		
	}

}
