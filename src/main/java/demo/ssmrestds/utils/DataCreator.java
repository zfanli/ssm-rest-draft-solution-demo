package demo.ssmrestds.utils;

import demo.ssmrestds.entity.PaymentItem;

import java.text.MessageFormat;

public class DataCreator {
    public static PaymentItem[] createPaymentItem(int count) {
        PaymentItem[] pi = new PaymentItem[count];
        for (int i = 0; i < count; i++) {
            pi[i] = new PaymentItem();
            pi[i].setUniqueId(10000 + i);
            pi[i].setVendor("Test Vendor " + i);
            pi[i].setPackageName("Test Package " + i);
            pi[i].setRegisteredMonth(MessageFormat.format("2019-{0}", i));
            pi[i].setRequestDeadline(MessageFormat.format("2019-1-{0}", i));
            pi[i].setPayStatus(i % 2 == 0 ? "0" : "1");
            pi[i].setMediaName("Test Media Name " + i);
            pi[i].setItemName("Test Item " + i);
            pi[i].setChannel(i % 2 == 0 ? "0" : "1");
            pi[i].setRegisteredStartDate(MessageFormat.format("2019-1-{0}", i));
            pi[i].setRegisteredEndDate(MessageFormat.format("2019-1-{0}", i + 1));
            pi[i].setPrice(10000 + i);
            pi[i].setPaidAmount(100 + i);
        }

        return pi;
    }
}
