package com.lnjecit.mapstruct.datatypeconvert.case003;

public class PaymentTypeMapperTest {

    public static void main(String[] args) {
        PaymentTypeMapper paymentTypeMapper = PaymentTypeMapper.INSTANCE;

        for (PaymentType paymentType : PaymentType.values()) {
            System.out.println(paymentType + ":" + paymentTypeMapper.paymentTypeToPaymentTypeView(paymentType));
        }
    }
}
