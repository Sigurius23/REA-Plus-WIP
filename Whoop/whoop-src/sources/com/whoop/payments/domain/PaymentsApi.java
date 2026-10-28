package com.whoop.payments.domain;

import com.whoop.payments.domain.models.PaymentsResponse;
import java.util.List;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import ud3.AbstractC34799a1;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0007\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/payments/domain/PaymentsApi;", "", "", "Lcom/whoop/payments/domain/models/PaymentsResponse;", "getPayments", "(Lq83/d;)Ljava/lang/Object;", "Lud3/a1;", "getPublicStripeToken", "", "country", "getPublicStripeTokenOnboarding", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface PaymentsApi {
    @InterfaceC37275f("membership-service/v1/billing/payment_method")
    Object getPayments(InterfaceC30057d<? super List<PaymentsResponse>> interfaceC30057d);

    @InterfaceC37275f("membership-service/v1/payment/public-stripe-key")
    Object getPublicStripeToken(InterfaceC30057d<? super AbstractC34799a1> interfaceC30057d);

    @InterfaceC37275f("membership-service/v1/payment/public-stripe-key/onboarding")
    Object getPublicStripeTokenOnboarding(@InterfaceC37289t("country") String str, InterfaceC30057d<? super AbstractC34799a1> interfaceC30057d);
}
