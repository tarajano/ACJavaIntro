import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Hybrid04_weather {
	public static void main(String[] args) {
		try {
			// Using Jsoup, grab the html file of a website
			Document doc = Jsoup.connect("https://weather.gc.ca/city/pages/on-118_metric_e.html").get();

			// Title
			System.out.println(doc.title());

			// Creator
			Elements metas = doc.getElementsByTag("meta");
			for (Element meta : metas) {
				if(meta.attr("name").equals("dcterms.creator")){
					System.out.println(meta.attr("content"));
					break;
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}