package com.rewardpoint.api.serverImpl;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.tomcat.util.json.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.rewardpoint.api.controller.rewardController;
import com.rewardpoint.api.model.Responcedata;
import com.rewardpoint.api.model.RewardMonthly;
import com.rewardpoint.api.model.RewardTotal;
import com.rewardpoint.api.model.RewardpointBO;
import com.rewardpoint.api.model.TotalRewardpoint;
import com.rewardpoint.api.service.RewardService;

@Service
public class RewardImplementation implements RewardService{
	private static final Logger log = LoggerFactory.getLogger(RewardImplementation.class);

	@Override
	public Responcedata getRewaredTransaction() {
		// TODO Auto-generated method stub
		
		
		String data ="[\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 1,\r\n"
				+ "    \"customerName\": \"PrabhakaranJ\",\r\n"
				+ "    \"amount\": 120,\r\n"
				+ "    \"transactionDate\": \"05-04-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 1,\r\n"
				+ "    \"customerName\": \"PrabhakaranJ\",\r\n"
				+ "    \"amount\": 75,\r\n"
				+ "    \"transactionDate\": \"01-05-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 1,\r\n"
				+ "    \"customerName\": \"PrabhakaranJ\",\r\n"
				+ "    \"amount\": 94,\r\n"
				+ "    \"transactionDate\": \"05-05-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 1,\r\n"
				+ "    \"customerName\": \"PrabhakaranJ\",\r\n"
				+ "    \"amount\": 10,\r\n"
				+ "    \"transactionDate\": \"06-04-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 1,\r\n"
				+ "    \"customerName\": \"PrabhakaranJ\",\r\n"
				+ "    \"amount\": 75,\r\n"
				+ "    \"transactionDate\": \"06-03-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 1,\r\n"
				+ "    \"customerName\": \"PrabhakaranJ\",\r\n"
				+ "    \"amount\": 200,\r\n"
				+ "    \"transactionDate\": \"23-03-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 1,\r\n"
				+ "    \"customerName\": \"PrabhakaranJ\",\r\n"
				+ "    \"amount\": 1,\r\n"
				+ "    \"transactionDate\": \"19-04-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 1,\r\n"
				+ "    \"customerName\": \"PrabhakaranJ\",\r\n"
				+ "    \"amount\": 80,\r\n"
				+ "    \"transactionDate\": \"12-03-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 1,\r\n"
				+ "    \"customerName\": \"PrabhakaranJ\",\r\n"
				+ "    \"amount\": 224,\r\n"
				+ "    \"transactionDate\": \"07-05-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 2,\r\n"
				+ "    \"customerName\": \"james jackson\",\r\n"
				+ "    \"amount\": 125,\r\n"
				+ "    \"transactionDate\": \"05-02-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 2,\r\n"
				+ "    \"customerName\": \"james jackson\",\r\n"
				+ "    \"amount\": 75,\r\n"
				+ "    \"transactionDate\": \"05-03-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 2,\r\n"
				+ "    \"customerName\": \"james jackson\",\r\n"
				+ "    \"amount\": 10,\r\n"
				+ "    \"transactionDate\": \"06-04-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 2,\r\n"
				+ "    \"customerName\": \"james jackson\",\r\n"
				+ "    \"amount\": 75,\r\n"
				+ "    \"transactionDate\": \"16-05-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 2,\r\n"
				+ "    \"customerName\": \"james jackson\",\r\n"
				+ "    \"amount\": 200,\r\n"
				+ "    \"transactionDate\": \"25-03-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 2,\r\n"
				+ "    \"customerName\": \"james jackson\",\r\n"
				+ "    \"amount\": 224,\r\n"
				+ "    \"transactionDate\": \"28-05-2022\"\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"customerID\": 3,\r\n"
				+ "    \"customerName\": \"Monica\",\r\n"
				+ "    \"amount\": 120,\r\n"
				+ "    \"transactionDate\": \"06-05-2022\"\r\n"
				+ "  }\r\n"
				+ "]";
		
		log.info(data);
		

		RewardpointBO[] transactiondata = null;
		
		List<RewardpointBO> rewardlist = new ArrayList<>();
		Responcedata result = new Responcedata();
        TotalRewardpoint TRP = new TotalRewardpoint();
        Integer Gobalpoint = 0;

			
		try {
			ObjectMapper mapper = new ObjectMapper();
             
			  transactiondata = mapper.readValue(data, RewardpointBO[].class);
			  for(RewardpointBO t:transactiondata) {
				  RewardpointBO rewarddata = new RewardpointBO();
				  rewarddata.setCustomerID(t.getCustomerID());
				  rewarddata.setCustomerName(t.getCustomerName());
				  rewarddata.setAmount(t.getAmount());
				  rewarddata.setTransactionDate(t.getTransactionDate());	
				  Integer DayRewardPoints = calculateRewards(rewarddata);
				  rewarddata.setTotalReward(DayRewardPoints); 
				  rewardlist.add(rewarddata);
				  
			  }
			  
			
			 List<RewardpointBO> distinctElements = rewardlist.stream().filter(distinctByKey(cust -> cust.getCustomerID()))
						.collect(Collectors.toList());
			 
			
			 
			 List<RewardTotal> rewardtotal = new ArrayList<>();
			 for(RewardpointBO s:distinctElements) {
				 TotalRewardpoint TRPP = new TotalRewardpoint();
				 Integer Totalreward = rewardlist.stream().filter(i -> i.getCustomerID().equals(s.getCustomerID()))
						 .collect(Collectors.toList()).stream().map(j -> j.getTotalReward())
				            .mapToInt(i -> i)
				            .sum();
				 
				RewardTotal rewardtot = new RewardTotal();
				rewardtot.setCustomerID(s.getCustomerID());
				rewardtot.setCustomerName(s.getCustomerName());
				rewardtot.setTotalReward(Totalreward);
				 rewardtotal.add(rewardtot);
			 }
			 
			 TotalRewardpoint TRPs= new TotalRewardpoint();
			 
			 List<RewardMonthly> rewardmonthly = new ArrayList<>();
			// for(RewardpointBO s:distinctElements) {
				    
			        

				 
//				    Map<Object, List<RewardpointBO>> personByMap = new HashMap<>();
//                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//                    personByMap = rewardlist.stream().filter(i -> i.getCustomerID().equals(s.getCustomerID()))
//                                .collect(Collectors.groupingBy(p -> YearMonth.parse(p.getTransactionDate(), dtf)));
                    
                    Map<Object, List<RewardpointBO>> personByMap = new HashMap<>();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    personByMap = rewardlist.stream()
                                .collect(Collectors.groupingBy(p -> YearMonth.parse(p.getTransactionDate(), dtf)));
                    
                    
                    SimpleDateFormat format = new SimpleDateFormat("yyyy");
                    Calendar lastmonth = Calendar.getInstance();
                    Calendar secondmonth = Calendar.getInstance();
                    Calendar thirdmonth = Calendar.getInstance();
                    lastmonth.add(Calendar.MONTH, -1);
                    secondmonth.add(Calendar.MONTH, -2);
                    thirdmonth.add(Calendar.MONTH, -3);
                       System.out.println(format.format(lastmonth.getTime()));
                    
                    	//personByMap.put(format.format(cal.getTime()), distinctElements);
                    List<RewardMonthly> rewardpM = new ArrayList<>();
                    
                    	 for (Entry<Object, List<RewardpointBO>>  entry : personByMap.entrySet()) {
                    		
                    		
                    			 
                    			 List<RewardpointBO> getmonth = entry.getValue();
                    			 
                    			 for(RewardpointBO g:getmonth) {
                    				 RewardMonthly getm = new RewardMonthly();
                    				 getm.setCustomerID(g.getCustomerID());
                    				 getm.setCustomerName(g.getCustomerName());
                    				 getm.setMonth(entry.getKey().toString());
                    				 getm.setAmount(g.getAmount());
                    				 getm.setRewardpoint(g.getTotalReward());
                    				 rewardpM.add(getm);
                    				 
                    			 }
                    			 
                    			
                    			 
                    			 Integer lastmonthpoint = rewardpM.stream()
                						 .collect(Collectors.toList()).stream().map(j -> j.getRewardpoint())
                				            .mapToInt(i -> i)
                				            .sum();
                    			 
                    			 TRPs.setMonthlytransaction(rewardpM);
                    			 TRPs.setMonthlytotalreward(lastmonthpoint); 
                    			 
                    			 
                    		
                    	  }
                    	 
                    	 
                    	

			// }
			 
			 
		
			
			 result.setTransactionResponse(rewardlist);
			 result.setTotalRewardResponse(rewardtotal);
			 result.setMonthlyTransactionResponse(TRPs);
			 
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

		return result;
	}

	private Integer calculateRewards(RewardpointBO t) { 
		if (t.getAmount() > 50 && t.getAmount() <= 100) {
			return Math.round(t.getAmount() - 50);
		} else if (t.getAmount() > 100) {
			return Math.round(t.getAmount() - 100) * 2
					+ (100 - 50);
		} else
			return 0;

	}
	
	 public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
	       Set<Object> seen = ConcurrentHashMap.newKeySet();
	       return t -> seen.add(keyExtractor.apply(t));
	   }
	
}
