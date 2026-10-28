package com.whoop.payments.domain.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import rx0.C31901f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBg\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\r\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&Jb\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b*\u0010!J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b5\u0010!R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b6\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b7\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010&¨\u0006="}, m65681d2 = {"Lcom/whoop/payments/domain/models/PaymentsResponse;", "", "", "paymentMethodId", "brand", "country", "", "expMonth", "expYear", "funding", "last4", "Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;", "expirationStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_release", "(Lcom/whoop/payments/domain/models/PaymentsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "component6", "component7", "component8", "()Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;)Lcom/whoop/payments/domain/models/PaymentsResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPaymentMethodId", "getBrand", "getCountry", "I", "getExpMonth", "getExpYear", "getFunding", "getLast4", "Lcom/whoop/payments/domain/models/PaymentMethodExpirationStatus;", "getExpirationStatus", "Companion", "$serializer", "a", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaymentsResponse {
    public static final int $stable = 0;

    @SerializedName("brand")
    private final String brand;

    @SerializedName("country")
    private final String country;

    @SerializedName("exp_month")
    private final int expMonth;

    @SerializedName("exp_year")
    private final int expYear;

    @SerializedName("expiration_status")
    private final PaymentMethodExpirationStatus expirationStatus;

    @SerializedName("funding")
    private final String funding;

    @SerializedName("last4")
    private final String last4;

    @SerializedName("payment_method_id")
    private final String paymentMethodId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31901f(20))};

    /* JADX INFO: renamed from: com.whoop.payments.domain.models.PaymentsResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/payments/domain/models/PaymentsResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/payments/domain/models/PaymentsResponse;", "serializer", "()Lwc3/c;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaymentsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PaymentsResponse(int i13, String str, String str2, String str3, int i14, int i15, String str4, String str5, PaymentMethodExpirationStatus paymentMethodExpirationStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, PaymentsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.paymentMethodId = str;
        this.brand = str2;
        this.country = str3;
        this.expMonth = i14;
        this.expYear = i15;
        this.funding = str4;
        this.last4 = str5;
        this.expirationStatus = paymentMethodExpirationStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return PaymentMethodExpirationStatus.INSTANCE.serializer();
    }

    public static /* synthetic */ PaymentsResponse copy$default(PaymentsResponse paymentsResponse, String str, String str2, String str3, int i13, int i14, String str4, String str5, PaymentMethodExpirationStatus paymentMethodExpirationStatus, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = paymentsResponse.paymentMethodId;
        }
        if ((i15 & 2) != 0) {
            str2 = paymentsResponse.brand;
        }
        if ((i15 & 4) != 0) {
            str3 = paymentsResponse.country;
        }
        if ((i15 & 8) != 0) {
            i13 = paymentsResponse.expMonth;
        }
        if ((i15 & 16) != 0) {
            i14 = paymentsResponse.expYear;
        }
        if ((i15 & 32) != 0) {
            str4 = paymentsResponse.funding;
        }
        if ((i15 & 64) != 0) {
            str5 = paymentsResponse.last4;
        }
        if ((i15 & 128) != 0) {
            paymentMethodExpirationStatus = paymentsResponse.expirationStatus;
        }
        String str6 = str5;
        PaymentMethodExpirationStatus paymentMethodExpirationStatus2 = paymentMethodExpirationStatus;
        int i16 = i14;
        String str7 = str4;
        return paymentsResponse.copy(str, str2, str3, i13, i16, str7, str6, paymentMethodExpirationStatus2);
    }

    public static final /* synthetic */ void write$Self$payments_release(PaymentsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.paymentMethodId);
        output.encodeStringElement(serialDesc, 1, self.brand);
        output.encodeStringElement(serialDesc, 2, self.country);
        output.encodeIntElement(serialDesc, 3, self.expMonth);
        output.encodeIntElement(serialDesc, 4, self.expYear);
        output.encodeStringElement(serialDesc, 5, self.funding);
        output.encodeStringElement(serialDesc, 6, self.last4);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.expirationStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getExpMonth() {
        return this.expMonth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getExpYear() {
        return this.expYear;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFunding() {
        return this.funding;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PaymentMethodExpirationStatus getExpirationStatus() {
        return this.expirationStatus;
    }

    public final PaymentsResponse copy(String paymentMethodId, String brand, String country, int expMonth, int expYear, String funding, String last4, PaymentMethodExpirationStatus expirationStatus) {
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        AbstractC22676k.m65750j(brand, "brand");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(funding, "funding");
        AbstractC22676k.m65750j(last4, "last4");
        return new PaymentsResponse(paymentMethodId, brand, country, expMonth, expYear, funding, last4, expirationStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentsResponse)) {
            return false;
        }
        PaymentsResponse paymentsResponse = (PaymentsResponse) other;
        return AbstractC22676k.m65745e(this.paymentMethodId, paymentsResponse.paymentMethodId) && AbstractC22676k.m65745e(this.brand, paymentsResponse.brand) && AbstractC22676k.m65745e(this.country, paymentsResponse.country) && this.expMonth == paymentsResponse.expMonth && this.expYear == paymentsResponse.expYear && AbstractC22676k.m65745e(this.funding, paymentsResponse.funding) && AbstractC22676k.m65745e(this.last4, paymentsResponse.last4) && this.expirationStatus == paymentsResponse.expirationStatus;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final String getCountry() {
        return this.country;
    }

    public final int getExpMonth() {
        return this.expMonth;
    }

    public final int getExpYear() {
        return this.expYear;
    }

    public final PaymentMethodExpirationStatus getExpirationStatus() {
        return this.expirationStatus;
    }

    public final String getFunding() {
        return this.funding;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.expYear, AbstractC11266d.m30448b(this.expMonth, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.paymentMethodId.hashCode() * 31, 31, this.brand), 31, this.country), 31), 31), 31, this.funding), 31, this.last4);
        PaymentMethodExpirationStatus paymentMethodExpirationStatus = this.expirationStatus;
        return iM30450d + (paymentMethodExpirationStatus == null ? 0 : paymentMethodExpirationStatus.hashCode());
    }

    public String toString() {
        String str = this.paymentMethodId;
        String str2 = this.brand;
        String str3 = this.country;
        int i13 = this.expMonth;
        int i14 = this.expYear;
        String str4 = this.funding;
        String str5 = this.last4;
        PaymentMethodExpirationStatus paymentMethodExpirationStatus = this.expirationStatus;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PaymentsResponse(paymentMethodId=", str, ", brand=", str2, ", country=");
        AbstractC11266d.m30470x(i13, str3, ", expMonth=", ", expYear=", sbM32001t);
        AbstractC11895b.m31979B(i14, ", funding=", str4, ", last4=", sbM32001t);
        sbM32001t.append(str5);
        sbM32001t.append(", expirationStatus=");
        sbM32001t.append(paymentMethodExpirationStatus);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public PaymentsResponse(String paymentMethodId, String brand, String country, int i13, int i14, String funding, String last4, PaymentMethodExpirationStatus paymentMethodExpirationStatus) {
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        AbstractC22676k.m65750j(brand, "brand");
        AbstractC22676k.m65750j(country, "country");
        AbstractC22676k.m65750j(funding, "funding");
        AbstractC22676k.m65750j(last4, "last4");
        this.paymentMethodId = paymentMethodId;
        this.brand = brand;
        this.country = country;
        this.expMonth = i13;
        this.expYear = i14;
        this.funding = funding;
        this.last4 = last4;
        this.expirationStatus = paymentMethodExpirationStatus;
    }
}
