package wedding.manager.wm_application_api.supplier;

import jakarta.validation.constraints.NotNull;
import wedding.manager.wm_application_api.commons.AddressData;

public record SupplierUpdateData(
        @NotNull
        Long id,
        String name,
        String phoneNumber,
        String type,
        String description,
        HiringStatus hiringStatus,
        AddressData addressData

) {


}
