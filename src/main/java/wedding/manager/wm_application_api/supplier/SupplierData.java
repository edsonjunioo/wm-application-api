package wedding.manager.wm_application_api.supplier;

import wedding.manager.wm_application_api.commons.AddressData;

public record SupplierData(String name, String email, String phoneNumber, String type, String description, HiringStatus hiringStatus, AddressData addressData, PaymentSupplierData paymentSupplierData) {
}
