
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


/**
 *
 * @author Shane - shanelee.co.uk
*/


public class WebScrape {
    public static void main(String[] args) {
        final String url = 
"https://www.booking.com/searchresults.html?ss=Biloxi&ssne=Biloxi&ssne_untouched=Biloxi&label=gen173nr-1FCAEoggI46AdIM1gEaJ4CiAEBmAExuAEXyAEM2AEB6AEB-AECiAIBqAIDuAL7ufKjBsACAdICJDM3ZmRlYjJhLWU1ZGUtNDBhOS1iMzE3LTcwZTFkZTAzYWYzZNgCBeACAQ&aid=304142&lang=en-us&sb=1&src_elem=sb&src=searchresults&dest_id=20068916&dest_type=city&checkin=2023-06-23&checkout=2023-06-24&group_adults=2&no_rooms=1&group_children=0"   ;     
        try {
            final Document document = Jsoup.connect(url).get();
           
            for (Element row : document.select(
                "div.a1b3f50dcd.be36d14cea.f7c6687c3d.f996d8c258")) { //f996d8c258.f7c6687c3d.be36d14cea.a1b3f50dcd
                    
                if (!row.select("div.bui-review-score__badge").isEmpty()) {
                    
                    continue;
                }
                else {
                    final String name = row.select(
                            "div.fcab3ed991.a23c043802").text(); //span.fcab3ed991.fbd1d3018c.e729ed5ab6
                    
System.err.println(name);
                    //get the price of the hotel

                    final String price = row.select("span.fcab3ed991.fbd1d3018c.e729ed5ab6").text();
                            System.err.println(price);

                    


                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
}