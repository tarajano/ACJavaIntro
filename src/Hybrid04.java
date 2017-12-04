import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Hybrid04 {
	public static void main(String[] args) {
		try {
			// Using Jsoup, grab the html file of a website
			Document doc = Jsoup.connect("http://fluxrider.com/school/html/sample.html").get();
			// print the title
			System.out.println("Title: " + doc.title());
			// print each links
			Elements links = doc.getElementsByTag("a");
			for (Element link : links) {
				String href = link.attr("href");
				String text = link.text();
				System.out.println(text + ": " + href);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}