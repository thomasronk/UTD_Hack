package com.src.utdhack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DAO {
	
	public List<Domain> getSearchResults(String cityName) {
		
		Connection conn = null;
		List<Domain> domains = new ArrayList<Domain>();
		try{
			try {
			    Class.forName("com.mysql.jdbc.Driver");
			} 
			catch (ClassNotFoundException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			} 


			
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/TRIPPLANNER?" +
						"user=root&password=root");
			Statement stmt = conn.createStatement();
		    ResultSet rs = stmt.executeQuery("SELECT * FROM  table_destination where City='"+cityName+"'");
		   
		    while(rs.next()){
		    	Domain d = new Domain();
		    	d.setId(rs.getInt(1));
		    	d.setPlaceName(rs.getString(2));
		    	d.setCity(rs.getString(3));
		    	d.setAddress(rs.getString(4));
		    	d.setRating(rs.getFloat(5));
		    	d.setTimeSpent(rs.getFloat(6));
		    	d.setImgUrl(rs.getString(7));
		    	d.setCost(rs.getFloat(8));
		    	domains.add(d);
		    }

		    conn.close();
		    
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally{
			
		}
		return domains;
		
	}
	
	
	public List<RouteVO> getPlaces(String ids, float timeSpent, float cost){
		List<RouteVO> Result = new ArrayList<RouteVO>();
		Connection conn = null;
		List<attractionList> attr =null;
		List<Domain> domains = new ArrayList<Domain>();
		try{
			try {
			    Class.forName("com.mysql.jdbc.Driver");
			} 
			catch (ClassNotFoundException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			} 


			
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/TRIPPLANNER?" +
						"user=root&password=root");
			Statement stmt = conn.createStatement();
			ids ="("+ids+")";
		    ResultSet rs = stmt.executeQuery("SELECT * FROM  table_destination where TimeSpent<="+timeSpent
		    		+"AND cost<="+cost+"AND ID in" + ids+ "order by  id asc");
		   
		    while(rs.next()){
		    	Domain d = new Domain();
		    	d.setId(rs.getInt(1));
		    	d.setPlaceName(rs.getString(2));
		    	d.setCity(rs.getString(3));
		    	d.setAddress(rs.getString(4));
		    	d.setRating(rs.getFloat(5));
		    	d.setTimeSpent(rs.getFloat(6));
		    	d.setImgUrl(rs.getString(7));
		    	d.setCost(rs.getFloat(8));
		    	domains.add(d);
		    }

		    conn.close();
		    System.out.println("check place " + domains.size() + " " + timeSpent + " " + cost);
		    Algorithm alg =  new Algorithm();
		    attr = alg.Run(domains, timeSpent, cost);
		    for(int i =0;i < attr.size();i++){
		    	
		    	Result.add(new RouteVO(i));
	    		Result.get(i).setPath(new String [attr.get(i).List.size()]);
		    	
		    	for(int j=0;j<attr.get(i).List.size();j++){
		    		Result.get(i).getPath()[j] = attr.get(i).List.get(j).getAddress();
		    		
		    		
		    		
		    /*		
		    	System.out.print(" == "+ attr.get(i).List.get(j).getId() +" " + attr.get(i).List.get(j).getTimeSpent() + " "+ attr.get(i).List.get(j).getCost());
		    	Domain d = new Domain();
		    	d.setId(attr.get(i).List.get(j).getId());
		    	d.setAddress(attr.get(i).List.get(j).getAddress());
		    	domainResult.add(d);*/
		    	
		    	
		    	
		    	}

		    }
		    
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally{
			
		}
		return Result;

		
	}

}
