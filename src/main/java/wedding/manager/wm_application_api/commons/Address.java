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

    public void updateAddress(AddressData addressData) {
        if(addressData.city() != null){
            this.city = addressData.city();
        }
        if(addressData.country() != null){
            this.country = addressData.country();
        }
        if(addressData.state() != null){
            this.state = addressData.state();
        }
        if(addressData.zip() != null){
            this.zip = addressData.zip();
        }
        if(addressData.complement() != null){
            this.complement = addressData.complement();
        }
        if(addressData.number() != null){
            this.number = addressData.number();
        }
        if(addressData.district() != null){
            this.district = addressData.district();
        }
        if(addressData.street() != null){
            this.street = addressData.street();
        }

    }
}
