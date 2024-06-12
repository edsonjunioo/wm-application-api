package wedding.manager.wm_application_api.commons;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

   private String street;
   private String district;
   private String city;
   private String state;
   private String zip;
   private String complement;
   private String number;
   private String country;

    public Address(AddressData addressData) {
        this.city = addressData.city();
        this.country = addressData.country();
        this.state = addressData.state();
        this.zip = addressData.zip();
        this.complement = addressData.complement();
        this.number = addressData.number();
        this.street = addressData.street();
        this.district = addressData.district();
    }
}
