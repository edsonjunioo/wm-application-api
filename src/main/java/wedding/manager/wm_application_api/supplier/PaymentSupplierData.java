package wedding.manager.wm_application_api.supplier;

import java.math.BigDecimal;

public record PaymentSupplierData(BigDecimal totalPrice, BigDecimal startValue, BigDecimal endValue, String rules, Integer percentStartValue, BigDecimal totalPayment) {
}
