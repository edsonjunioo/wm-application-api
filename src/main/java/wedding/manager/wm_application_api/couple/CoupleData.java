package wedding.manager.wm_application_api.couple;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import wedding.manager.wm_application_api.commons.AddressData;

public record CoupleData(

        @NotBlank
        String fianceName,

        @NotBlank
        String fianceeName,

        @NotBlank
        @Email
        String fianceEmail,

        @NotBlank
        @Email
        String fianceeEmail,

        @NotNull
        @Valid
        AddressData addressData

) {
}
