package sunshine.serhiypetrosiuk.com.sunshine.data;

import java.util.ArrayList;

/**
 * Created by user on 12/16/14.
 */
public class EmailsGenerator {

    public static ArrayList<Email> getEmails(int count){
        ArrayList<Email> emails = new ArrayList<Email>();
        String[] domains = new String[]{"gmail.com", "mail.ru", "ukr.net"};
        String[] names   = new String[]{"inna", "serhiy", "ura", "mike", "tomas", "goran"};

        for (int i = 0; i < count; i++){
            int domainIndex = (int)(Math.random() * domains.length);
            int nameIndex   = (int)(Math.random() * names.length);
            String email = new String(names[nameIndex] + "@" + domains[domainIndex]);
            Integer id = i;
            emails.add(new Email(id, email ,names[nameIndex]));
        }

        return emails;
    }

}
