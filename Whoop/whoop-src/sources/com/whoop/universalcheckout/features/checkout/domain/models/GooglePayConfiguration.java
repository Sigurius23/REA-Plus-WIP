package com.whoop.universalcheckout.features.checkout.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJJ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00062"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/GooglePayConfiguration;", "", "", "countryCode", "currencyCode", "", "amount", "label", "buttonType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/GooglePayConfiguration;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Long;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/checkout/domain/models/GooglePayConfiguration;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCountryCode", "getCurrencyCode", "Ljava/lang/Long;", "getAmount", "getLabel", "getButtonType", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GooglePayConfiguration {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Long amount;
    private final String buttonType;
    private final String countryCode;
    private final String currencyCode;
    private final String label;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/GooglePayConfiguration$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/GooglePayConfiguration;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GooglePayConfiguration$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GooglePayConfiguration(int i13, String str, String str2, Long l7, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, GooglePayConfiguration$$serializer.INSTANCE.getDescriptor());
        }
        this.countryCode = str;
        this.currencyCode = str2;
        this.amount = l7;
        this.label = str3;
        this.buttonType = str4;
    }

    public static /* synthetic */ GooglePayConfiguration copy$default(GooglePayConfiguration googlePayConfiguration, String str, String str2, Long l7, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = googlePayConfiguration.countryCode;
        }
        if ((i13 & 2) != 0) {
            str2 = googlePayConfiguration.currencyCode;
        }
        if ((i13 & 4) != 0) {
            l7 = googlePayConfiguration.amount;
        }
        if ((i13 & 8) != 0) {
            str3 = googlePayConfiguration.label;
        }
        if ((i13 & 16) != 0) {
            str4 = googlePayConfiguration.buttonType;
        }
        String str5 = str4;
        Long l12 = l7;
        return googlePayConfiguration.copy(str, str2, l12, str3, str5);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(GooglePayConfiguration self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.countryCode);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.currencyCode);
        output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.amount);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.label);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.buttonType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getButtonType() {
        return this.buttonType;
    }

    public final GooglePayConfiguration copy(String countryCode, String currencyCode, Long amount, String label, String buttonType) {
        AbstractC22676k.m65750j(countryCode, "countryCode");
        return new GooglePayConfiguration(countryCode, currencyCode, amount, label, buttonType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GooglePayConfiguration)) {
            return false;
        }
        GooglePayConfiguration googlePayConfiguration = (GooglePayConfiguration) other;
        return AbstractC22676k.m65745e(this.countryCode, googlePayConfiguration.countryCode) && AbstractC22676k.m65745e(this.currencyCode, googlePayConfiguration.currencyCode) && AbstractC22676k.m65745e(this.amount, googlePayConfiguration.amount) && AbstractC22676k.m65745e(this.label, googlePayConfiguration.label) && AbstractC22676k.m65745e(this.buttonType, googlePayConfiguration.buttonType);
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getButtonType() {
        return this.buttonType;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        int iHashCode = this.countryCode.hashCode() * 31;
        String str = this.currencyCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l7 = this.amount;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        String str2 = this.label;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonType;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.countryCode;
        String str2 = this.currencyCode;
        Long l7 = this.amount;
        String str3 = this.label;
        String str4 = this.buttonType;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GooglePayConfiguration(countryCode=", str, ", currencyCode=", str2, ", amount=");
        sbM32001t.append(l7);
        sbM32001t.append(", label=");
        sbM32001t.append(str3);
        sbM32001t.append(", buttonType=");
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public GooglePayConfiguration(String countryCode, String str, Long l7, String str2, String str3) {
        AbstractC22676k.m65750j(countryCode, "countryCode");
        this.countryCode = countryCode;
        this.currencyCode = str;
        this.amount = l7;
        this.label = str2;
        this.buttonType = str3;
    }
}
