package com.whoop.universalcheckout.features.checkout.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ@\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b,\u0010\u001b¨\u0006/"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;", "", "Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;", "address", "", NotificationCompat.CATEGORY_EMAIL, "name", "phone", "<init>", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/universalcheckout/features/checkout/domain/models/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$universal_checkout_release", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/universalcheckout/features/checkout/domain/models/Address;", "getAddress", "Ljava/lang/String;", "getEmail", "getName", "getPhone", "Companion", "$serializer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BillingDetails {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Address address;
    private final String email;
    private final String name;
    private final String phone;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/universalcheckout/features/checkout/domain/models/BillingDetails;", "serializer", "()Lwc3/c;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BillingDetails$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BillingDetails(int i13, Address address, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, BillingDetails$$serializer.INSTANCE.getDescriptor());
        }
        this.address = address;
        this.email = str;
        this.name = str2;
        this.phone = str3;
    }

    public static /* synthetic */ BillingDetails copy$default(BillingDetails billingDetails, Address address, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            address = billingDetails.address;
        }
        if ((i13 & 2) != 0) {
            str = billingDetails.email;
        }
        if ((i13 & 4) != 0) {
            str2 = billingDetails.name;
        }
        if ((i13 & 8) != 0) {
            str3 = billingDetails.phone;
        }
        return billingDetails.copy(address, str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$universal_checkout_release(BillingDetails self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, Address$$serializer.INSTANCE, self.address);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.email);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.name);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.phone);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final BillingDetails copy(Address address, String email, String name, String phone) {
        return new BillingDetails(address, email, name, phone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BillingDetails)) {
            return false;
        }
        BillingDetails billingDetails = (BillingDetails) other;
        return AbstractC22676k.m65745e(this.address, billingDetails.address) && AbstractC22676k.m65745e(this.email, billingDetails.email) && AbstractC22676k.m65745e(this.name, billingDetails.name) && AbstractC22676k.m65745e(this.phone, billingDetails.phone);
    }

    public final Address getAddress() {
        return this.address;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        Address address = this.address;
        int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Address address = this.address;
        String str = this.email;
        String str2 = this.name;
        String str3 = this.phone;
        StringBuilder sb4 = new StringBuilder("BillingDetails(address=");
        sb4.append(address);
        sb4.append(", email=");
        sb4.append(str);
        sb4.append(", name=");
        return AbstractC11266d.m30464r(sb4, str2, ", phone=", str3, ")");
    }

    public BillingDetails(Address address, String str, String str2, String str3) {
        this.address = address;
        this.email = str;
        this.name = str2;
        this.phone = str3;
    }
}
