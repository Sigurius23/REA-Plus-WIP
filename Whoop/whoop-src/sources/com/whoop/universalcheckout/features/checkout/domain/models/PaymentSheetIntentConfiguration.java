package com.whoop.universalcheckout.features.checkout.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$JR\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b4\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010$¨\u00069"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;", "", "", "amount", "", "currency", "paymentMethodConfigurationId", "", "setupFutureUsage", "onBehalfOf", "requireCvcRecollection", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "()Z", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Z)Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getAmount", "Ljava/lang/String;", "getCurrency", "getPaymentMethodConfigurationId", "Ljava/lang/Boolean;", "getSetupFutureUsage", "getOnBehalfOf", "Z", "getRequireCvcRecollection", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaymentSheetIntentConfiguration {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long amount;
    private final String currency;
    private final String onBehalfOf;
    private final String paymentMethodConfigurationId;
    private final boolean requireCvcRecollection;
    private final Boolean setupFutureUsage;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/PaymentSheetIntentConfiguration;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaymentSheetIntentConfiguration$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PaymentSheetIntentConfiguration(int i13, long j7, String str, String str2, Boolean bool, String str3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, PaymentSheetIntentConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.amount = j7;
        this.currency = str;
        this.paymentMethodConfigurationId = str2;
        this.setupFutureUsage = bool;
        if ((i13 & 16) == 0) {
            this.onBehalfOf = null;
        } else {
            this.onBehalfOf = str3;
        }
        if ((i13 & 32) == 0) {
            this.requireCvcRecollection = false;
        } else {
            this.requireCvcRecollection = z4;
        }
    }

    public static /* synthetic */ PaymentSheetIntentConfiguration copy$default(PaymentSheetIntentConfiguration paymentSheetIntentConfiguration, long j7, String str, String str2, Boolean bool, String str3, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j7 = paymentSheetIntentConfiguration.amount;
        }
        long j13 = j7;
        if ((i13 & 2) != 0) {
            str = paymentSheetIntentConfiguration.currency;
        }
        String str4 = str;
        if ((i13 & 4) != 0) {
            str2 = paymentSheetIntentConfiguration.paymentMethodConfigurationId;
        }
        String str5 = str2;
        if ((i13 & 8) != 0) {
            bool = paymentSheetIntentConfiguration.setupFutureUsage;
        }
        Boolean bool2 = bool;
        if ((i13 & 16) != 0) {
            str3 = paymentSheetIntentConfiguration.onBehalfOf;
        }
        String str6 = str3;
        if ((i13 & 32) != 0) {
            z4 = paymentSheetIntentConfiguration.requireCvcRecollection;
        }
        return paymentSheetIntentConfiguration.copy(j13, str4, str5, bool2, str6, z4);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(PaymentSheetIntentConfiguration self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeLongElement(serialDesc, 0, self.amount);
        output.encodeStringElement(serialDesc, 1, self.currency);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.paymentMethodConfigurationId);
        output.encodeNullableSerializableElement(serialDesc, 3, BooleanSerializer.INSTANCE, self.setupFutureUsage);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.onBehalfOf != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.onBehalfOf);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.requireCvcRecollection) {
            output.encodeBooleanElement(serialDesc, 5, self.requireCvcRecollection);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPaymentMethodConfigurationId() {
        return this.paymentMethodConfigurationId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getRequireCvcRecollection() {
        return this.requireCvcRecollection;
    }

    public final PaymentSheetIntentConfiguration copy(long amount, String currency, String paymentMethodConfigurationId, Boolean setupFutureUsage, String onBehalfOf, boolean requireCvcRecollection) {
        AbstractC22676k.m65750j(currency, "currency");
        return new PaymentSheetIntentConfiguration(amount, currency, paymentMethodConfigurationId, setupFutureUsage, onBehalfOf, requireCvcRecollection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSheetIntentConfiguration)) {
            return false;
        }
        PaymentSheetIntentConfiguration paymentSheetIntentConfiguration = (PaymentSheetIntentConfiguration) other;
        return this.amount == paymentSheetIntentConfiguration.amount && AbstractC22676k.m65745e(this.currency, paymentSheetIntentConfiguration.currency) && AbstractC22676k.m65745e(this.paymentMethodConfigurationId, paymentSheetIntentConfiguration.paymentMethodConfigurationId) && AbstractC22676k.m65745e(this.setupFutureUsage, paymentSheetIntentConfiguration.setupFutureUsage) && AbstractC22676k.m65745e(this.onBehalfOf, paymentSheetIntentConfiguration.onBehalfOf) && this.requireCvcRecollection == paymentSheetIntentConfiguration.requireCvcRecollection;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    public final String getPaymentMethodConfigurationId() {
        return this.paymentMethodConfigurationId;
    }

    public final boolean getRequireCvcRecollection() {
        return this.requireCvcRecollection;
    }

    public final Boolean getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Long.hashCode(this.amount) * 31, 31, this.currency);
        String str = this.paymentMethodConfigurationId;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.setupFutureUsage;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.onBehalfOf;
        return Boolean.hashCode(this.requireCvcRecollection) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        long j7 = this.amount;
        String str = this.currency;
        String str2 = this.paymentMethodConfigurationId;
        Boolean bool = this.setupFutureUsage;
        String str3 = this.onBehalfOf;
        boolean z4 = this.requireCvcRecollection;
        StringBuilder sbM114685m = AbstractC36095b.m114685m("PaymentSheetIntentConfiguration(amount=", ", currency=", j7, str);
        sbM114685m.append(", paymentMethodConfigurationId=");
        sbM114685m.append(str2);
        sbM114685m.append(", setupFutureUsage=");
        sbM114685m.append(bool);
        sbM114685m.append(", onBehalfOf=");
        sbM114685m.append(str3);
        sbM114685m.append(", requireCvcRecollection=");
        sbM114685m.append(z4);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }

    public PaymentSheetIntentConfiguration(long j7, String currency, String str, Boolean bool, String str2, boolean z4) {
        AbstractC22676k.m65750j(currency, "currency");
        this.amount = j7;
        this.currency = currency;
        this.paymentMethodConfigurationId = str;
        this.setupFutureUsage = bool;
        this.onBehalfOf = str2;
        this.requireCvcRecollection = z4;
    }

    public /* synthetic */ PaymentSheetIntentConfiguration(long j7, String str, String str2, Boolean bool, String str3, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j7, str, str2, bool, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? false : z4);
    }
}
