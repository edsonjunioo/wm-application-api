package wedding.manager.wm_application_api.supplier;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record PaymentSupplierData(

        @NotNull
        BigDecimal totalPrice,

        BigDecimal startValue,

        BigDecimal endValue,

        boolean initialAmountPaid,

        String rules,

        Integer percentStartValue,

        BigDecimal totalPayment) {
}
