package wedding.manager.wm_application_api.supplier;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import wedding.manager.wm_application_api.commons.Address;

@Table(name = "supplier")
@Entity(name = "Supplier")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Supplier {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;
    private String type;
    private String description;

    @Column(name = "hiring_status")
    @Enumerated(EnumType.STRING)
    private HiringStatus hiringStatus;

    @Embedded
    private Address address;

    @Embedded
    private PaymentSupplier paymentSupplier;

    private Boolean active;

    public Supplier(SupplierData supplierData) {
        this.active = true;
        this.name = supplierData.name();
        this.email = supplierData.email();
        this.phoneNumber = supplierData.phoneNumber();
        this.type = supplierData.type();
        this.description = supplierData.description();
        this.hiringStatus = supplierData.hiringStatus();
        this.address = new Address(supplierData.addressData());
        this.paymentSupplier = new PaymentSupplier(supplierData.paymentSupplierData());

    }

    public void updateinfo(SupplierUpdateData supplierUpdateData) {
        if (supplierUpdateData.name() != null) {
            this.name = supplierUpdateData.name();
        }
        if(supplierUpdateData.phoneNumber() != null) {
            this.phoneNumber = supplierUpdateData.phoneNumber();
        }
        if(supplierUpdateData.type() != null) {
            this.type = supplierUpdateData.type();
        }
        if(supplierUpdateData.description() != null) {
            this.description = supplierUpdateData.description();
        }
        if(supplierUpdateData.hiringStatus() != null) {
            this.hiringStatus = supplierUpdateData.hiringStatus();
        }
        if(supplierUpdateData.addressData() != null) {
            this.address.updateAddress(supplierUpdateData.addressData());
        }
    }

    public void deleteLogical() {
        this.active = false;
    }
}
