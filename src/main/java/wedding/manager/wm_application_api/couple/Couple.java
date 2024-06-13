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


    public Couple(CoupleData coupleData) {
        this.fianceName = coupleData.fianceName();
        this.fianceeName = coupleData.fianceeName();
        this.fianceEmail = coupleData.fianceEmail();
        this.fianceeEmail = coupleData.fianceeEmail();
        this.address = new Address(coupleData.addressData());
    }
}
