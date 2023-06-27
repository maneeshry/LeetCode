
import java.time.LocalDate;
import java.util.Scanner;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebScrape {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final String checkin = LocalDate.now().toString();
        final String checkout = LocalDate.now().plusDays(1).toString();

        System.out.println("Enter the number of adults: ");
        final int group_adults = input.nextInt();

        System.out.println("Enter the number of rooms: ");
        final int no_rooms = input.nextInt();
        
        System.out.println("Enter the number of children: ");
        final int group_children = input.nextInt();
        input.close();

        final String url = "https://www.booking.com/searchresults.html?ss=Biloxi&ssne=Biloxi&ssne_untouched=Biloxi&label=gen173nr-1FCAEoggI46AdIM1gEaJ4CiAEBmAExuAEXyAEM2AEB6AEB-AECiAIBqAIDuAL7ufKjBsACAdICJDM3ZmRlYjJhLWU1ZGUtNDBhOS1iMzE3LTcwZTFkZTAzYWYzZNgCBeACAQ&aid=304142&lang=en-us&sb=1&src_elem=sb&src=searchresults&dest_id=20068916&dest_type=city&checkin="
                + checkin + "&checkout=" + checkout + "&group_adults=" + group_adults + "&no_rooms=" + no_rooms
                + "&group_children=" + group_children;
       
        try {
            final Document document = Jsoup.connect(url).get();

            for (Element row : document.select(
                    "div.a1b3f50dcd.be36d14cea.f7c6687c3d.f996d8c258")) { // f996d8c258.f7c6687c3d.be36d14cea.a1b3f50dcd

                if (!row.select("div.bui-review-score__badge").isEmpty()) {

                    continue;
                } else {
                    final String name = row.select(
                            "div.fcab3ed991.a23c043802").text(); // span.fcab3ed991.fbd1d3018c.e729ed5ab6

                    final String price = row.select("span.fcab3ed991.fbd1d3018c.e729ed5ab6").text();
                    System.err.println(name + " --- " + price);
                    System.out.println();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}