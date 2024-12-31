package winter.mongodb;

// import java.util.Arrays;
// import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
// import com.mongodb.client.model.Sorts;

public class mongodbpractice {
    public static void main(String[] args) {
        String uri = "mongodb://localhost:27017";
        try(MongoClient client = MongoClients.create(uri)){
            MongoDatabase database = client.getDatabase("school");

            MongoCollection<Document> collection = database.getCollection("students");
            if(collection == null){
                database.createCollection("students");
            }

            // List<Document> list  = Arrays.asList(new Document("name", "Madhav Kumar").append("id", 12213356).append("percentile", 8.65).append("address", "Patna, Bihar").append("mobile", 9693744950L),
            // new Document("name", "Ravi Sharma").append("id", 12213357).append("percentile", 9.12).append("address", "Delhi, Delhi").append("mobile", 9812345678L),
            // new Document("name", "Sita Verma").append("id", 12213358).append("percentile", 7.45).append("address", "Mumbai, Maharashtra").append("mobile", 9501234567L),
            // new Document("name", "Amit Yadav").append("id", 12213359).append("percentile", 8.99).append("address", "Noida, Uttar Pradesh").append("mobile", 9912345670L),
            // new Document("name", "Neha Gupta").append("id", 12213360).append("percentile", 7.80).append("address", "Kolkata, West Bengal").append("mobile", 9334455667L),
            // new Document("name", "Rohit Singh").append("id", 12213361).append("percentile", 9.45).append("address", "Chennai, Tamil Nadu").append("mobile", 9887654321L),
            // new Document("name", "Priya Patel").append("id", 12213362).append("percentile", 8.20).append("address", "Surat, Gujarat").append("mobile", 9876543210L),
            // new Document("name", "Vikash Mishra").append("id", 12213363).append("percentile", 9.30).append("address", "Lucknow, Uttar Pradesh").append("mobile", 9445678901L),
            // new Document("name", "Jaya Rai").append("id", 12213364).append("percentile", 7.60).append("address", "Patna, Bihar").append("mobile", 9654321098L),
            // new Document("name", "Aman Sharma").append("id", 12213365).append("percentile", 8.80).append("address", "Bangalore, Karnataka").append("mobile", 9988776655L),
            // new Document("name", "Tanuja Kumar").append("id", 12213366).append("percentile", 7.90).append("address", "Mumbai, Maharashtra").append("mobile", 9765432101L),
            // new Document("name", "Manish Verma").append("id", 12213367).append("percentile", 8.40).append("address", "Delhi, Delhi").append("mobile", 9456789012L),
            // new Document("name", "Meera Singh").append("id", 12213368).append("percentile", 9.10).append("address", "Jaipur, Rajasthan").append("mobile", 9201234567L),
            // new Document("name", "Rajeev Gupta").append("id", 12213369).append("percentile", 8.30).append("address", "Agra, Uttar Pradesh").append("mobile", 9512345678L),
            // new Document("name", "Anjali Yadav").append("id", 12213370).append("percentile", 7.85).append("address", "Patna, Bihar").append("mobile", 9998765432L),
            // new Document("name", "Sandeep Reddy").append("id", 12213371).append("percentile", 8.50).append("address", "Hyderabad, Telangana").append("mobile", 9123456789L),
            // new Document("name", "Sunita Patel").append("id", 12213372).append("percentile", 9.00).append("address", "Ahmedabad, Gujarat").append("mobile", 9678901234L),
            // new Document("name", "Harshit Kapoor").append("id", 12213373).append("percentile", 8.15).append("address", "Kanpur, Uttar Pradesh").append("mobile", 9856123456L),
            // new Document("name", "Kavita Mishra").append("id", 12213374).append("percentile", 7.70).append("address", "Kolkata, West Bengal").append("mobile", 9876543212L),
            // new Document("name", "Vishal Kumar").append("id", 12213375).append("percentile", 9.25).append("address", "Gurgaon, Haryana").append("mobile", 9321654789L)
            // );
            
            // collection.insertMany(list);

            // System.out.println("Document Inserted Successfully");

            // Document finddetailsbyname = new Document("name","Ravi Sharma");
            // collection.find(finddetailsbyname).forEach(document -> System.out.println(document.toJson()));

            // collection.find().sort(Sorts.descending("percentile")).forEach(document -> System.out.println(document.toJson()));
            
            // long count = collection.countDocuments(new Document("address", "Patna, Bihar"));
            // System.out.println("Number of student from Patna, Bihar " + count);

            // Document updatemobilenumber = new Document("$set",new Document("mobile",1234567890));
            // collection.updateOne(new Document("name","Neha Gupta"),updatemobilenumber);
            

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
