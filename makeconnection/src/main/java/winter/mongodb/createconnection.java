package winter.mongodb;

import java.util.Arrays;
import java.util.List;

import org.bson.Document;
// import org.bson.types.ObjectId;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
// import com.mongodb.client.model.Projections;
import com.mongodb.client.model.Sorts;

public class createconnection {
    public static void main(String[] args) {
        try(MongoClient client = MongoClients.create("mongodb://localhost:27017")){

            MongoDatabase database = client.getDatabase("shop");
            // System.out.println("Database Name: " + database.getName());
            MongoCollection<Document> collection = database.getCollection("products");
            // if(collection != null){
                // System.out.println("Collection Found");
            // }


            // write query to find documents where price is 799
            // Document document1 = new Document("price",799);
            // collection.find(document1).forEach(document -> System.out.println(document.toJson()));

            // Retrieval: Write a query to find all documents where isFeatured is true.
            // Document document2 = new Document("isFeatured",true);
            // collection.find(document2).forEach(document -> System.out.println(document.toJson()));

            
            // Projection: How can you retrieve only the name and price fields for all documents?
            // collection.find().projection(Projections.include("name","price")).limit(5).forEach(document -> System.out.println(document.toJson()));

            // Filtering: Write a query to find all products priced above 500.

            // collection.find(new Document("price",new Document("$gt",500))).limit(5).forEach(document -> System.out.println(document.toJson()));

            // Updating: How can you update the price of the product with _id: 64c23601e32f4a51b19b926d to 850?
            // Document document3 = new Document("_id" , new ObjectId("64c23601e32f4a51b19b926d"));
            // collection.updateOne(document3,new Document("$set",new Document("price",850)));
            // collection.find(document3).forEach(document -> System.out.println(document.toJson()));

            // Array queue: Write a query to find all products with a specific color(e.g., "red") in colors array.
            
            // collection.find().limit(5).forEach(document -> System.out.println(document.toJson()));
            // collection.find(new Document("colors","#333333")).limit(5).forEach(document -> System.out.println(document.toJson()));

            // Sorting : How you can sort all products in ascending order of their price?
            // collection.find().sort(Sorts.ascending("price")).forEach(document -> System.out.println(document.toJson()));

            // Aggregation: write an aggregation pipeline to calculate the average price of products in a specific category.

            // List<Document> document4 = Arrays.asList(new Document("$group", new Document("_id","$category").append("Average_price", new Document("$avg","$price"))));
            // collection.aggregate(document4).forEach(document -> System.out.println(document.toJson()));


            


            

        }catch(MongoException e){
            e.printStackTrace();
        }
    }
}
