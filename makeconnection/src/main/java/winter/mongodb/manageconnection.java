package winter.mongodb;

import java.util.Arrays;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class manageconnection {
    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017";
        try(MongoClient client = MongoClients.create(uri)){

            MongoDatabase database = client.getDatabase("students");
            System.out.println("Connected with " + database.getName());

            MongoCollection<Document> collection = database.getCollection("class");
            if(collection == null){
                database.createCollection("class");
                System.out.println("Collection created");
            }

            Document find1 = new Document("$or",(Arrays.asList(new Document("marks",90),new Document("marks",95))));

            
            collection.find(find1).forEach(document -> System.out.println(document));

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
