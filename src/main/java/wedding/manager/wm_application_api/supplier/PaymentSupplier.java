package wedding.manager.wm_application_api.supplier;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentSupplier {

   @Column(name = "total_price")
   private BigDecimal totalPrice;

   @Column(name = "start_value")
   private BigDecimal startValue;

   @Column(name = "end_value")
   private BigDecimal endValue;

   @Column(name = "initial_amount_paid")
   private boolean initialAmountPaid;

   private String rules;

   @Column(name = "percent_start_value")
   private Integer percentStartValue;

   @Column(name = "total_payment")
   private BigDecimal totalPayment;

    public PaymentSupplier(PaymentSupplierData paymentSupplierData) {
        this.totalPrice = paymentSupplierData.totalPrice();
        this.startValue = paymentSupplierData.startValue();
        this.endValue = paymentSupplierData.endValue();
        this.initialAmountPaid = paymentSupplierData.initialAmountPaid();
        this.rules = paymentSupplierData.rules();
        this.percentStartValue = paymentSupplierData.percentStartValue();
        this.totalPayment = paymentSupplierData.totalPayment();

    }
}
