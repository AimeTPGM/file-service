package mongodb.main;

import java.net.UnknownHostException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mongodb.MongoClient;

public class MongoDBMain {
	 
    public static final String DB_NAME = "filetest";
    public static final String COLLECTION = "filetestonly";
    public static final String MONGO_HOST = "210.121.158.166";
    public static final int MONGO_PORT = 27017;
    private static MongoClient mongo;
    private static ApplicationContext ctx = null;
 
    public static void run() {
    	try {
        	System.out.println("connecting to mongodb at"+MONGO_HOST+":"+MONGO_PORT+"...\ndatabase name: "+DB_NAME+"\ncollection: "+COLLECTION);
            mongo = new MongoClient(
                    MONGO_HOST, MONGO_PORT);
            System.out.println("connected!");
             
        } catch (UnknownHostException e) {
        	System.err.println("Cannot connect to "+MONGO_HOST+":"+MONGO_PORT);
            e.printStackTrace();
        }
    }
    public static MongoClient getMongoClient(){
    	return mongo;
    }
    public static String getDBName(){
    	return DB_NAME;
    }
    public static String getCollection(){
    	return COLLECTION;
    }
    public static String getHost(){
    	return MONGO_HOST;
    }
    public static int getPort(){
    	return MONGO_PORT;
    }
    
    public static ApplicationContext getContext(){
    	if(ctx == null){
    		ctx = new ClassPathXmlApplicationContext("spring.xml");
    	}
    	return ctx;
    }
 
}