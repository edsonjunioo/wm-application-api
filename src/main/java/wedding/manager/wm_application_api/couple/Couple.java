package wedding.manager.wm_application_api.couple;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import wedding.manager.wm_application_api.commons.Address;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Couple")
@Table(name = "couple")
public class Couple {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fiance_name")
    String fianceName;

    @Column(name = "fiancee_name")
    String fianceeName;

    @Column(name = "fiance_email")
    String fianceEmail;

    @Column(name = "fiancee_email")
    String fianceeEmail;

    @Embedded
    Address address;

    private Boolean active;

    public Couple(CoupleData coupleData) {
        this.active = true;
        this.fianceName = coupleData.fianceName();
        this.fianceeName = coupleData.fianceeName();
        this.fianceEmail = coupleData.fianceEmail();
        this.fianceeEmail = coupleData.fianceeEmail();
        this.address = new Address(coupleData.addressData());
    }

    public void updateinfo(CoupleUpdateData coupleUpdateData) {
        if(coupleUpdateData.fianceName() != null){
            this.fianceName = coupleUpdateData.fianceName();
        }
        if(coupleUpdateData.fianceeName() != null){
            this.fianceeName = coupleUpdateData.fianceeName();
        }
        if(coupleUpdateData.fianceEmail() != null){
            this.fianceEmail = coupleUpdateData.fianceEmail();
        }
        if(coupleUpdateData.fianceeEmail() != null){
            this.fianceeEmail = coupleUpdateData.fianceeEmail();
        }
        if(coupleUpdateData.addressData() != null){
            this.address.updateAddress(coupleUpdateData.addressData());
        }
    }

    public void deleteLogical() {
        this.active = false;
    }
}
