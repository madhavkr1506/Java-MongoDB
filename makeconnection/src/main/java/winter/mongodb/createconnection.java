package winter.mongodb;

// import java.util.Arrays;
// import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class createconnection {
    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017";
        try(MongoClient client = MongoClients.create(uri)){
            MongoDatabase database = client.getDatabase("students");
            System.out.println("Connected to the database: " + database.getName());

            // lets create collection
            MongoCollection<Document> collection = database.getCollection("class");
            if(collection == null){
                database.createCollection("class");
                System.out.println("Collection created successfully");
            }else{
                System.out.println("Collection already exists");
            }

            // Document document1 = new Document("name","Shreya").append("marks", 80).append("age",21).append("location", "patna");
        //     List<Document> documents = Arrays.asList(new Document("name", "Khushi").append("marks", 80).append("age", 21).append("location", "Patna"),
        //     new Document("name", "Rahul").append("marks", 90).append("age", 22).append("location", "Delhi"),
        //     new Document("name", "Ananya").append("marks", 85).append("age", 20).append("location", "Mumbai"),
        //     new Document("name", "Amit").append("marks", 76).append("age", 23).append("location", "Kolkata"),
        //     new Document("name", "Neha").append("marks", 88).append("age", 22).append("location", "Chennai"),
        //     new Document("name", "Ravi").append("marks", 70).append("age", 21).append("location", "Bangalore"),
        //     new Document("name", "Priya").append("marks", 92).append("age", 24).append("location", "Hyderabad"),
        //     new Document("name", "Saurabh").append("marks", 78).append("age", 22).append("location", "Pune"),
        //     new Document("name", "Maya").append("marks", 95).append("age", 23).append("location", "Lucknow"),
        //     new Document("name", "Vikas").append("marks", 83).append("age", 21).append("location", "Varanasi")
        // );
        //     collection.insertMany(documents);

        // System.out.println("Document inserted successfully");

            // Document find_document = new Document("name","Shreya");
            // collection.find(find_document).forEach(document -> System.out.println(document.toJson()));

            // Document find_marks = new Document("marks",1);
            // Document result = collection.find(find_document).projection(find_marks).first();
            // if(result != null){
            //     System.out.println("Marks: " + result.get("marks"));
            // }else{
            //     System.out.println("No document found for shreya");
            // }

            

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}