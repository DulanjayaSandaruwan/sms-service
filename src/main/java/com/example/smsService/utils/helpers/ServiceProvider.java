package com.example.smsService.utils.helpers;

import com.example.smsService.utils.helpers.enums.ServiceProviders;

import java.util.Arrays;
import java.util.List;

public class ServiceProvider {

    public static Enum<ServiceProviders> getServiceProviderForMobilePrefix(String mobileNumber) throws Exception {
        if (mobileNumber.matches(".*[^0-9].*")) {
            throw new Exception("String contains non-digit characters.");
        } else {
            String digits = mobileNumber.replaceAll("\\s", "").substring(0, 3);
            if (digits.length() == 3) {
                List<String> dialogPrefixes = Arrays.asList(MobilePrefixes.DIALOG_PREFIXES);
                if (dialogPrefixes.contains(digits)) {
                    return ServiceProviders.DIALOG;
                }
                List<String> mobitelPrefixes = Arrays.asList(MobilePrefixes.MOBITEL_PREFIXES);
                List<String> hutchPrefixes = Arrays.asList(MobilePrefixes.HUTCH_PREFIXES);
                if (mobitelPrefixes.contains(digits)) {
                    return ServiceProviders.MOBITEL;
                } else if (hutchPrefixes.contains(digits)) {
                    return ServiceProviders.HUTCH;
                } else if (digits.equals(MobilePrefixes.AIRTEL_PREFIX)) {
                    return ServiceProviders.AIRTEL;
                } else {
                    throw new Exception("Phone number is not in valid format.");
                }
            } else {
                throw new Exception("Length must be 10 characters");
            }
        }
    }

}
