
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Define the URL of the website you want to scrape
        String url = "https://www.assist.org";

        try {
            // Use Jsoup to connect to the website and retrieve the HTML
            Document doc = Jsoup.connect(url).get();

            // Contact articulation.

            String myUrl;
            String myUrl02;

            myUrl = "https://assist.org/transfer/results?year=73&institution=29&agreement=35&agreementType=from&view=agreement";
            myUrl02 = "https://assist.org/transfer/results?year=73&institution=29&agreement=35&agreementType=from&view=agreement&viewBy=major&viewByKey=26307349";


            Document myDoc01 = Jsoup.connect(myUrl).get();

            Document myNewDoc = Jsoup.connect(myUrl02).get();


            // Select the HTML element containing the title
            Element titleElement = doc.select("title").first();

          //  System.out.println(doc);

          //  System.out.println(myDoc01);

           // System.out.println(myDoc01);
            System.out.println(myNewDoc);


            // Extract and print the text of the title element
            if (titleElement != null) {
                String title = titleElement.text();
                System.out.println("Title: " + title);
            } else {
                System.out.println("Title not found on the page.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}