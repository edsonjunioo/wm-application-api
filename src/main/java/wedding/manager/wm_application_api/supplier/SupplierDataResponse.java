package wedding.manager.wm_application_api.supplier;

public record SupplierDataResponse(
        Long id,
        String name,
        String type,
        String description,
        HiringStatus hiringStatus
) {
    public SupplierDataResponse(Supplier supplier) {
        this(supplier.getId(), supplier.getName(), supplier.getType(), supplier.getDescription(), supplier.getHiringStatus());
    }
}
