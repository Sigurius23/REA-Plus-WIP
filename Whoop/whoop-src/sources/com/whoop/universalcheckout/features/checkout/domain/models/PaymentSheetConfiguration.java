package com.whoop.universalcheckout.features.checkout.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p719m22.C24958m;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JB\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"¨\u00067"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;", "", "Lcom/whoop/universalcheckout/features/checkout/domain/models/Customer;", "customer", "Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;", "defaultBillingDetails", "Lcom/whoop/universalcheckout/features/checkout/domain/models/GooglePayConfiguration;", "googlePay", "", "", "paymentMethodTypes", "<init>", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/Customer;Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;Lcom/whoop/universalcheckout/features/checkout/domain/models/GooglePayConfiguration;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/universalcheckout/features/checkout/domain/models/Customer;Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;Lcom/whoop/universalcheckout/features/checkout/domain/models/GooglePayConfiguration;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/universalcheckout/features/checkout/domain/models/Customer;", "component2", "()Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;", "component3", "()Lcom/whoop/universalcheckout/features/checkout/domain/models/GooglePayConfiguration;", "component4", "()Ljava/util/List;", "copy", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/Customer;Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;Lcom/whoop/universalcheckout/features/checkout/domain/models/GooglePayConfiguration;Ljava/util/List;)Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/universalcheckout/features/checkout/domain/models/Customer;", "getCustomer", "Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;", "getDefaultBillingDetails", "Lcom/whoop/universalcheckout/features/checkout/domain/models/GooglePayConfiguration;", "getGooglePay", "Ljava/util/List;", "getPaymentMethodTypes", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaymentSheetConfiguration {
    private final Customer customer;
    private final BillingDetails defaultBillingDetails;
    private final GooglePayConfiguration googlePay;
    private final List<String> paymentMethodTypes;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C24958m(25))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetConfiguration;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaymentSheetConfiguration$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PaymentSheetConfiguration(int i13, Customer customer, BillingDetails billingDetails, GooglePayConfiguration googlePayConfiguration, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PaymentSheetConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.customer = customer;
        this.defaultBillingDetails = billingDetails;
        this.googlePay = googlePayConfiguration;
        if ((i13 & 8) == 0) {
            this.paymentMethodTypes = C25271y.f99162w;
        } else {
            this.paymentMethodTypes = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentSheetConfiguration copy$default(PaymentSheetConfiguration paymentSheetConfiguration, Customer customer, BillingDetails billingDetails, GooglePayConfiguration googlePayConfiguration, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            customer = paymentSheetConfiguration.customer;
        }
        if ((i13 & 2) != 0) {
            billingDetails = paymentSheetConfiguration.defaultBillingDetails;
        }
        if ((i13 & 4) != 0) {
            googlePayConfiguration = paymentSheetConfiguration.googlePay;
        }
        if ((i13 & 8) != 0) {
            list = paymentSheetConfiguration.paymentMethodTypes;
        }
        return paymentSheetConfiguration.copy(customer, billingDetails, googlePayConfiguration, list);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(PaymentSheetConfiguration self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, Customer$$serializer.INSTANCE, self.customer);
        output.encodeNullableSerializableElement(serialDesc, 1, BillingDetails$$serializer.INSTANCE, self.defaultBillingDetails);
        output.encodeNullableSerializableElement(serialDesc, 2, GooglePayConfiguration$$serializer.INSTANCE, self.googlePay);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.paymentMethodTypes, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.paymentMethodTypes);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Customer getCustomer() {
        return this.customer;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BillingDetails getDefaultBillingDetails() {
        return this.defaultBillingDetails;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GooglePayConfiguration getGooglePay() {
        return this.googlePay;
    }

    public final List<String> component4() {
        return this.paymentMethodTypes;
    }

    public final PaymentSheetConfiguration copy(Customer customer, BillingDetails defaultBillingDetails, GooglePayConfiguration googlePay, List<String> paymentMethodTypes) {
        AbstractC22676k.m65750j(customer, "customer");
        AbstractC22676k.m65750j(paymentMethodTypes, "paymentMethodTypes");
        return new PaymentSheetConfiguration(customer, defaultBillingDetails, googlePay, paymentMethodTypes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSheetConfiguration)) {
            return false;
        }
        PaymentSheetConfiguration paymentSheetConfiguration = (PaymentSheetConfiguration) other;
        return AbstractC22676k.m65745e(this.customer, paymentSheetConfiguration.customer) && AbstractC22676k.m65745e(this.defaultBillingDetails, paymentSheetConfiguration.defaultBillingDetails) && AbstractC22676k.m65745e(this.googlePay, paymentSheetConfiguration.googlePay) && AbstractC22676k.m65745e(this.paymentMethodTypes, paymentSheetConfiguration.paymentMethodTypes);
    }

    public final Customer getCustomer() {
        return this.customer;
    }

    public final BillingDetails getDefaultBillingDetails() {
        return this.defaultBillingDetails;
    }

    public final GooglePayConfiguration getGooglePay() {
        return this.googlePay;
    }

    public final List<String> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    public int hashCode() {
        int iHashCode = this.customer.hashCode() * 31;
        BillingDetails billingDetails = this.defaultBillingDetails;
        int iHashCode2 = (iHashCode + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        GooglePayConfiguration googlePayConfiguration = this.googlePay;
        return this.paymentMethodTypes.hashCode() + ((iHashCode2 + (googlePayConfiguration != null ? googlePayConfiguration.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "PaymentSheetConfiguration(customer=" + this.customer + ", defaultBillingDetails=" + this.defaultBillingDetails + ", googlePay=" + this.googlePay + ", paymentMethodTypes=" + this.paymentMethodTypes + ")";
    }

    public PaymentSheetConfiguration(Customer customer, BillingDetails billingDetails, GooglePayConfiguration googlePayConfiguration, List<String> paymentMethodTypes) {
        AbstractC22676k.m65750j(customer, "customer");
        AbstractC22676k.m65750j(paymentMethodTypes, "paymentMethodTypes");
        this.customer = customer;
        this.defaultBillingDetails = billingDetails;
        this.googlePay = googlePayConfiguration;
        this.paymentMethodTypes = paymentMethodTypes;
    }

    public /* synthetic */ PaymentSheetConfiguration(Customer customer, BillingDetails billingDetails, GooglePayConfiguration googlePayConfiguration, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(customer, billingDetails, googlePayConfiguration, (i13 & 8) != 0 ? C25271y.f99162w : list);
    }
}
