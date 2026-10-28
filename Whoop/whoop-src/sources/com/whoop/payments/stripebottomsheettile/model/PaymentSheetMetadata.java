package com.whoop.payments.stripebottomsheettile.model;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBU\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JP\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b*\u0010$J\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u000b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b8\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010'¨\u0006>"}, m65681d2 = {"Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;", "", "Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;", "paymentSheetConfiguration", "Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;", "defaultBillingDetails", "Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;", "setupIntentConfiguration", "", "paymentMethodConfigurationId", "stripePublishableKey", "", "autoPopUp", "<init>", "(Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$payments_release", "(Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;", "component2", "()Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;", "component3", "()Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;", "component4", "()Ljava/lang/String;", "component5", "component6", "()Z", "copy", "(Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetConfiguration;", "getPaymentSheetConfiguration", "Lcom/whoop/payments/stripebottomsheettile/model/DefaultBillingDetails;", "getDefaultBillingDetails", "Lcom/whoop/payments/stripebottomsheettile/model/SetupIntentConfiguration;", "getSetupIntentConfiguration", "Ljava/lang/String;", "getPaymentMethodConfigurationId", "getStripePublishableKey", "Z", "getAutoPopUp", "Companion", "$serializer", "a", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaymentSheetMetadata {
    private final boolean autoPopUp;
    private final DefaultBillingDetails defaultBillingDetails;
    private final String paymentMethodConfigurationId;
    private final PaymentSheetConfiguration paymentSheetConfiguration;
    private final SetupIntentConfiguration setupIntentConfiguration;
    private final String stripePublishableKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.payments.stripebottomsheettile.model.PaymentSheetMetadata$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/payments/stripebottomsheettile/model/PaymentSheetMetadata;", "serializer", "()Lwc3/c;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaymentSheetMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PaymentSheetMetadata(int i13, PaymentSheetConfiguration paymentSheetConfiguration, DefaultBillingDetails defaultBillingDetails, SetupIntentConfiguration setupIntentConfiguration, String str, String str2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, PaymentSheetMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.paymentSheetConfiguration = paymentSheetConfiguration;
        this.defaultBillingDetails = defaultBillingDetails;
        this.setupIntentConfiguration = setupIntentConfiguration;
        this.paymentMethodConfigurationId = str;
        this.stripePublishableKey = str2;
        this.autoPopUp = z4;
    }

    public static /* synthetic */ PaymentSheetMetadata copy$default(PaymentSheetMetadata paymentSheetMetadata, PaymentSheetConfiguration paymentSheetConfiguration, DefaultBillingDetails defaultBillingDetails, SetupIntentConfiguration setupIntentConfiguration, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            paymentSheetConfiguration = paymentSheetMetadata.paymentSheetConfiguration;
        }
        if ((i13 & 2) != 0) {
            defaultBillingDetails = paymentSheetMetadata.defaultBillingDetails;
        }
        if ((i13 & 4) != 0) {
            setupIntentConfiguration = paymentSheetMetadata.setupIntentConfiguration;
        }
        if ((i13 & 8) != 0) {
            str = paymentSheetMetadata.paymentMethodConfigurationId;
        }
        if ((i13 & 16) != 0) {
            str2 = paymentSheetMetadata.stripePublishableKey;
        }
        if ((i13 & 32) != 0) {
            z4 = paymentSheetMetadata.autoPopUp;
        }
        String str3 = str2;
        boolean z13 = z4;
        return paymentSheetMetadata.copy(paymentSheetConfiguration, defaultBillingDetails, setupIntentConfiguration, str, str3, z13);
    }

    public static final /* synthetic */ void write$Self$payments_release(PaymentSheetMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, PaymentSheetConfiguration$$serializer.INSTANCE, self.paymentSheetConfiguration);
        output.encodeNullableSerializableElement(serialDesc, 1, DefaultBillingDetails$$serializer.INSTANCE, self.defaultBillingDetails);
        output.encodeSerializableElement(serialDesc, 2, SetupIntentConfiguration$$serializer.INSTANCE, self.setupIntentConfiguration);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.paymentMethodConfigurationId);
        output.encodeStringElement(serialDesc, 4, self.stripePublishableKey);
        output.encodeBooleanElement(serialDesc, 5, self.autoPopUp);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaymentSheetConfiguration getPaymentSheetConfiguration() {
        return this.paymentSheetConfiguration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DefaultBillingDetails getDefaultBillingDetails() {
        return this.defaultBillingDetails;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SetupIntentConfiguration getSetupIntentConfiguration() {
        return this.setupIntentConfiguration;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPaymentMethodConfigurationId() {
        return this.paymentMethodConfigurationId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStripePublishableKey() {
        return this.stripePublishableKey;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getAutoPopUp() {
        return this.autoPopUp;
    }

    public final PaymentSheetMetadata copy(PaymentSheetConfiguration paymentSheetConfiguration, DefaultBillingDetails defaultBillingDetails, SetupIntentConfiguration setupIntentConfiguration, String paymentMethodConfigurationId, String stripePublishableKey, boolean autoPopUp) {
        AbstractC22676k.m65750j(paymentSheetConfiguration, "paymentSheetConfiguration");
        AbstractC22676k.m65750j(setupIntentConfiguration, "setupIntentConfiguration");
        AbstractC22676k.m65750j(stripePublishableKey, "stripePublishableKey");
        return new PaymentSheetMetadata(paymentSheetConfiguration, defaultBillingDetails, setupIntentConfiguration, paymentMethodConfigurationId, stripePublishableKey, autoPopUp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSheetMetadata)) {
            return false;
        }
        PaymentSheetMetadata paymentSheetMetadata = (PaymentSheetMetadata) other;
        return AbstractC22676k.m65745e(this.paymentSheetConfiguration, paymentSheetMetadata.paymentSheetConfiguration) && AbstractC22676k.m65745e(this.defaultBillingDetails, paymentSheetMetadata.defaultBillingDetails) && AbstractC22676k.m65745e(this.setupIntentConfiguration, paymentSheetMetadata.setupIntentConfiguration) && AbstractC22676k.m65745e(this.paymentMethodConfigurationId, paymentSheetMetadata.paymentMethodConfigurationId) && AbstractC22676k.m65745e(this.stripePublishableKey, paymentSheetMetadata.stripePublishableKey) && this.autoPopUp == paymentSheetMetadata.autoPopUp;
    }

    public final boolean getAutoPopUp() {
        return this.autoPopUp;
    }

    public final DefaultBillingDetails getDefaultBillingDetails() {
        return this.defaultBillingDetails;
    }

    public final String getPaymentMethodConfigurationId() {
        return this.paymentMethodConfigurationId;
    }

    public final PaymentSheetConfiguration getPaymentSheetConfiguration() {
        return this.paymentSheetConfiguration;
    }

    public final SetupIntentConfiguration getSetupIntentConfiguration() {
        return this.setupIntentConfiguration;
    }

    public final String getStripePublishableKey() {
        return this.stripePublishableKey;
    }

    public int hashCode() {
        int iHashCode = this.paymentSheetConfiguration.hashCode() * 31;
        DefaultBillingDetails defaultBillingDetails = this.defaultBillingDetails;
        int iHashCode2 = (this.setupIntentConfiguration.hashCode() + ((iHashCode + (defaultBillingDetails == null ? 0 : defaultBillingDetails.hashCode())) * 31)) * 31;
        String str = this.paymentMethodConfigurationId;
        return Boolean.hashCode(this.autoPopUp) + AbstractC11266d.m30450d((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.stripePublishableKey);
    }

    public String toString() {
        PaymentSheetConfiguration paymentSheetConfiguration = this.paymentSheetConfiguration;
        DefaultBillingDetails defaultBillingDetails = this.defaultBillingDetails;
        SetupIntentConfiguration setupIntentConfiguration = this.setupIntentConfiguration;
        String str = this.paymentMethodConfigurationId;
        String str2 = this.stripePublishableKey;
        boolean z4 = this.autoPopUp;
        StringBuilder sb4 = new StringBuilder("PaymentSheetMetadata(paymentSheetConfiguration=");
        sb4.append(paymentSheetConfiguration);
        sb4.append(", defaultBillingDetails=");
        sb4.append(defaultBillingDetails);
        sb4.append(", setupIntentConfiguration=");
        sb4.append(setupIntentConfiguration);
        sb4.append(", paymentMethodConfigurationId=");
        sb4.append(str);
        sb4.append(", stripePublishableKey=");
        return AbstractC21702c.m61137h(sb4, str2, ", autoPopUp=", z4, ")");
    }

    public PaymentSheetMetadata(PaymentSheetConfiguration paymentSheetConfiguration, DefaultBillingDetails defaultBillingDetails, SetupIntentConfiguration setupIntentConfiguration, String str, String stripePublishableKey, boolean z4) {
        AbstractC22676k.m65750j(paymentSheetConfiguration, "paymentSheetConfiguration");
        AbstractC22676k.m65750j(setupIntentConfiguration, "setupIntentConfiguration");
        AbstractC22676k.m65750j(stripePublishableKey, "stripePublishableKey");
        this.paymentSheetConfiguration = paymentSheetConfiguration;
        this.defaultBillingDetails = defaultBillingDetails;
        this.setupIntentConfiguration = setupIntentConfiguration;
        this.paymentMethodConfigurationId = str;
        this.stripePublishableKey = stripePublishableKey;
        this.autoPopUp = z4;
    }
}
