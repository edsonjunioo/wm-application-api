package wedding.manager.wm_application_api.supplier;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import wedding.manager.wm_application_api.commons.AddressData;

public record SupplierData(

        @NotBlank
        String name,

        @NotBlank
        @Email
        String email,

        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String phoneNumber,

        @NotBlank
        String type,

        @NotBlank
        String description,

        @NotNull
        HiringStatus hiringStatus,

        @NotNull
        @Valid
        AddressData addressData,

        @NotNull
        @Valid
        PaymentSupplierData paymentSupplierData) {
}
