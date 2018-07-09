package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.AuthCache;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class JsonObject {
	
	/*public static void main(String[] args) throws ParseException {
		String jsonStr = "{printingList:[{\"documentClass\" : \"NewProposals\",\"documentId\"  : \"10100001\",\"tmCode\" : \"DT1\"},{\"documentClass\" : \"Loosemails\",\"documentId\"  : \"10000001\",\"tmCode\" : \"DT2\"}]}";
		
		String str = "{\"ZPROPUSR\":\"SITBATCH\",\"ZDVERUSR\":\"SITUSER01\",\"ZUWAPUSR\":\"SITUSER01\",\"TTMPRCNO\":\"2859000001\",\"CHDRNUM\":\"40291922\",\"STATCODE\":\"IF\",\"PSTATCODE\":\"PP\",\"HPROPDTE\":{\"CCYY\":2016,\"MM\":12,\"DD\":1},\"HPRRCVDT\":{\"CCYY\":2017,\"MM\":4,\"DD\":3},\"LIFCNUM\":\"02044268\",\"SALUT\":\"06\",\"LAGIVNAM\":\"???????\",\"LASURNAM\":\"????????\",\"LIFAIDNO\":\"3334314313520\",\"COWNNUM\":\"02044268\",\"ZSALUTL\":\"06\",\"OWGIVNAM\":\"???????\",\"OWSURNAM\":\"????????\",\"POWNIDNO\":\"3334314313520\",\"ZPYMODDS\":\"?????\",\"ZPRDLIN\":\"IL\",\"ZLONDSC\":\"\",\"ZBPLNCD\":\"BE21\",\"ZBPLNNM\":\"??????????? ???????????? 15/5 | ??????????????? 15/5\",\"INSTPREM\":500000,\"SUMINS\":500000,\"RECPTDT\":{\"CCYY\":2017,\"MM\":4,\"DD\":21},\"ZRPLNCD\":[\"RWP2\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"],\"ZRPLNNM\":[\"?????????????????????????????????????????? | ??????????????????????????????????????????\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"],\"PREM\":[0,0,0,0,0,0,0,0,0,0,0,0,0,0],\"ZSSI\":[500000,0,0,0,0,0,0,0,0,0,0,0,0,0],\"ZUWCSETY\":\"NON-MED\",\"FUPCDE\":[\"RW1\",\"2O0\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"],\"LONGDESC\":[\"Free Waiver of Premium Limit\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"],\"FUPSTS\":[\"O\",\"W\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"]}";

		JSONArray arr = new JSONArray();
		
		Gson gson = new Gson();
		
		JSONParser parser = new JSONParser(); 
		JSONObject json = (JSONObject) parser.parse(str);
		
		System.out.println(json.keySet());
		Set<String> keySet = json.keySet();
		for(String key : keySet){
			System.out.println(key);
			String type = json.get(key).getClass().getName();
			System.out.println(type);
			if(type.toUpperCase().contains("OBJECT")){
				JSONObject jObj = (JSONObject) json.get(key);
				System.out.println(jObj.keySet());
			} else if(type.toUpperCase().contains("ARRAY")){
				System.out.println(json.get(key).toString());
				arr = (JSONArray) json.get(key);
				System.out.println(arr.contains("RW1"));
				System.out.println(arr.contains("Free Waiver of Premium Limit"));
			} else {
				System.out.println(json.get(key).toString());
			}
		}
		
	}*/
	
	public static void main(String[] args) {
		String output = "";
		try{
			/*String str = "http://10.21.213.75:9080/rest/bpm/wle/v1/process/3126?parts=header%7Csummary";
			HttpClient client = HttpClientBuilder.create().build();
			HttpHost targetHost = new HttpHost("10.21.213.75", 9080, "http");
			
			CredentialsProvider credsProvider = new BasicCredentialsProvider();
			credsProvider.setCredentials(
			        new AuthScope(targetHost.getHostName(), targetHost.getPort()),
			        new UsernamePasswordCredentials("pssitadmin", "Scblife@1234"));
			
			AuthCache authCache = new BasicAuthCache();
			// Generate BASIC scheme object and add it to the local auth cache
			BasicScheme basicAuth = new BasicScheme();
			authCache.put(targetHost, basicAuth);
			
			HttpClientContext context = HttpClientContext.create();
			context.setCredentialsProvider(credsProvider);
			context.setAuthCache(authCache);
			
			HttpGet request = new HttpGet(str);
			System.out.println("before sending request");
			HttpResponse response = client.execute(request, context);
			System.out.println("after sending request");
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			System.out.println("after bufferedreader " + response.getEntity().getContentType());
			output = org.apache.commons.io.IOUtils.toString(rd);
			System.out.println(output);*/
			/*JSONArray arr = new JSONArray();
			JSONParser parser = new JSONParser();*/
			
			JsonArray jarr = new JsonArray();
			JsonParser jparser = new JsonParser();
			
			output = "{\"ZPROPUSR\":\"SITBATCH\",\"ZDVERUSR\":\"SITUSER01\",\"ZUWAPUSR\":\"SITUSER01\",\"TTMPRCNO\":\"2859000001\",\"CHDRNUM\":\"40291922\",\"STATCODE\":\"IF\",\"PSTATCODE\":\"PP\",\"HPROPDTE\":{\"CCYY\":2016,\"MM\":12,\"DD\":1},\"HPRRCVDT\":{\"CCYY\":2017,\"MM\":4,\"DD\":3},\"LIFCNUM\":\"02044268\",\"SALUT\":\"06\",\"LAGIVNAM\":\"???????\",\"LASURNAM\":\"????????\",\"LIFAIDNO\":\"3334314313520\",\"COWNNUM\":\"02044268\",\"ZSALUTL\":\"06\",\"OWGIVNAM\":\"???????\",\"OWSURNAM\":\"????????\",\"POWNIDNO\":\"3334314313520\",\"ZPYMODDS\":\"?????\",\"ZPRDLIN\":\"IL\",\"ZLONDSC\":\"\",\"ZBPLNCD\":\"BE21\",\"ZBPLNNM\":\"??????????? ???????????? 15/5 | ??????????????? 15/5\",\"INSTPREM\":500000,\"SUMINS\":500000,\"RECPTDT\":{\"CCYY\":2017,\"MM\":4,\"DD\":21},\"ZRPLNCD\":[\"RWP2\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"],\"ZRPLNNM\":[\"?????????????????????????????????????????? | ??????????????????????????????????????????\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"],\"PREM\":[0,0,0,0,0,0,0,0,0,0,0,0,0,0],\"ZSSI\":[500000,0,0,0,0,0,0,0,0,0,0,0,0,0],\"ZUWCSETY\":\"NON-MED\",\"FUPCDE\":[\"RW1\",\"2O0\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"],\"LONGDESC\":[\"Free Waiver of Premium Limit\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"],\"FUPSTS\":[\"O\",\"W\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\",\"\"]}";
			//System.out.println(output);
			//JSONObject json = (JSONObject) parser.parse(output);
			com.google.gson.JsonObject obj = (com.google.gson.JsonObject) jparser.parse(output);
			System.out.println(obj);
			System.out.println(obj.get("RECPTDT").isJsonObject());
			System.out.println(obj.get("RECPTDT").getAsJsonObject().keySet());
			
			/*System.out.println(json.keySet());
			Set<String> keySet = json.keySet();
			
			for(String key : keySet){
				System.out.println(key);
				String type = json.get(key).getClass().getName();
				System.out.println(type);
				if(type.toUpperCase().contains("OBJECT")){
					JSONObject jObj = (JSONObject) json.get(key);
					System.out.println(jObj.keySet());
					System.out.println(jObj.get("tasks").getClass());
					arr = (JSONArray)  jObj.get("tasks");
					System.out.println(arr.get(0));
					JSONObject o = (JSONObject) arr.get(0);
					System.out.println(o.keySet());
					System.out.println(o.get("clientTypes").getClass());
					//JSONObject o = null;
					for(int i = 0; i < arr.size(); i++){
						o = (JSONObject) arr.get(i);
						System.out.println(o.get("clientTypes").toString());
						System.out.println(o.get("state"));
						if((o.get("clientTypes").toString().toUpperCase().contains("IBM_WLE_EXTERNAL_ACTIVITY")) && 
								"STATE_CLAIMED".equalsIgnoreCase(String.valueOf(o.get("state")))){
							System.out.println(o.get("displayName"));
							System.out.println("IBM_WLE_Coach".equalsIgnoreCase(o.get("clientTypes").toString()));
							System.out.println(o.get("priorityName"));
						}
						System.out.println("----------");
						
					}
					
				}
			}*/
			
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
