package demo.ssmrestds.controller;

import demo.ssmrestds.entity.PaymentItem;
import demo.ssmrestds.utils.DataCreator;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class PaymentController {

    @GetMapping("/payment")
    public PaymentItem[] getPaymentItems(
            @RequestParam("vendor") String vendor,
            @RequestParam("packageName") String packageName,
            @RequestParam("requestStartDate") String requestStartDate,
            @RequestParam("requestEndDate") String requestEndDate,
            @RequestParam("payStatus") String payStatus,
            @RequestParam("mediaName") String mediaName,
            @RequestParam("itemName") String itemName,
            @RequestParam("channel") String channel,
            @RequestParam("registeredStartDate") String registeredStartDate,
            @RequestParam("registeredEndDate") String registeredEndDate
    ) {
        System.out.println("vendor: " + vendor);
        System.out.println("packageName: " + packageName);
        System.out.println("requestStartDate: " + requestStartDate);
        System.out.println("requestEndDate: " + requestEndDate);
        System.out.println("payStatus: " + payStatus);
        System.out.println("mediaName: " + mediaName);
        System.out.println("itemName: " + itemName);
        System.out.println("channel: " + channel);
        System.out.println("registeredStartDate: " + registeredStartDate);
        System.out.println("registeredEndDate: " + registeredEndDate);
        System.out.println("End.");
        return DataCreator.createPaymentItem(5);
    }
}
