package wedding.manager.wm_application_api.couple;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import wedding.manager.wm_application_api.commons.AddressData;

public record CoupleUpdateData(

        @NotNull
        Long id,
        String fianceName,
        String fianceeName,

        @Email
        String fianceEmail,

        @Email
        String fianceeEmail,

        @Valid
        AddressData addressData

) {
}
