package test;
	import test.Subscription;
	import java.util.*;
	import java.util.Map.Entry;
public class Daopai {

	    public static void main(String[] args) {
	        Subscription s1 = new Subscription("1","a",123,321);
	        Subscription s2 = new Subscription("2","b",123,321);
	        Subscription s3 = new Subscription("3","c",123,321);
	        Subscription s4 = new Subscription("4","a",123,321);
	        Subscription s5 = new Subscription("5","b",123,321);


	        List<Subscription> subscriptionList = new ArrayList<>();
	        subscriptionList.add(s1);
	        subscriptionList.add(s2);
	        subscriptionList.add(s3);
	        subscriptionList.add(s4);
	        subscriptionList.add(s5);
	        Map<String, List<Subscription>> map = new HashMap<>();
	        List<Subscription> jieguo ;
			//倒排索引表的核心部分
	        for(Subscription s : subscriptionList){
	            if(!map.containsKey(s.getKeyWords())){
	                jieguo= new ArrayList<>();
	                jieguo.add(s);
	                map.put(s.getKeyWords(),jieguo);
	            }
	            else{
	                 map.get(s.getKeyWords()).add(s);
	            }
	        }
	        //遍历输出索引表的内容，验证是否正确
	        Set<Entry<String, List<Subscription>>> entrys = map.entrySet();  //此行可省略，直接将map.entrySet()写在for-each循环的条件中
	        for(Entry<String, List<Subscription>> entry:entrys){
	            System.out.println("key值："+entry.getKey()+" value值："+entry.getValue());
	            System.out.println("key值："+entry.getKey()+" ID值："+entry.getValue().get(0).getSubscriptionID());
	            for(Subscription a : entry.getValue()){
	                System.out.println(a.getKeyWords());
	            }

	        }
	    }
	

}
