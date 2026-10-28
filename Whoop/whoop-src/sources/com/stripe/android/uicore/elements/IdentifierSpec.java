package com.stripe.android.uicore.elements;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import g40.C15365i;
import g40.EnumC15429u1;
import g40.EnumC15434v1;
import g40.InterfaceC15439w1;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nB7\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b!\u0010\u0017J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J'\u0010-\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u001d¨\u00067"}, m65681d2 = {"Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Landroid/os/Parcelable;", "", "v1", "", "ignoreField", "Lg40/w1;", "destination", "<init>", "(Ljava/lang/String;ZLg40/w1;)V", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLg40/w1;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Landroid/os/Parcel;", "dest", "flags", "Ll83/a0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lg40/w1;", "copy", "(Ljava/lang/String;ZLg40/w1;)Lcom/stripe/android/uicore/elements/IdentifierSpec;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "write$Self$stripe_ui_core_release", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getV1", "Z", "getIgnoreField", "Lg40/w1;", "getDestination", "Companion", "com/stripe/android/uicore/elements/a", "$serializer", "stripe-ui-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IdentifierSpec implements Parcelable {
    public static final int $stable = 0;
    private static final IdentifierSpec BacsDebitConfirmed;
    private static final IdentifierSpec Blik;
    private static final IdentifierSpec BlikCode;
    private static final IdentifierSpec CardNumber;
    private static final IdentifierSpec Country;
    private static final IdentifierSpec KonbiniConfirmationNumber;
    private static final IdentifierSpec Line1;
    private static final IdentifierSpec PhoneNumberCountry;
    private static final IdentifierSpec SetAsDefaultPaymentMethod;
    private static final IdentifierSpec Upi;
    private static final IdentifierSpec Vpa;
    private final InterfaceC15439w1 destination;
    private final boolean ignoreField;
    private final String v1;
    public static final C5705a Companion = new C5705a();
    public static final Parcelable.Creator<IdentifierSpec> CREATOR = new C15365i(3);
    private static final InterfaceC37138c[] $childSerializers = {null, null, new C37140e(AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC15439w1.class), new Annotation[0])};
    private static final IdentifierSpec Name = new IdentifierSpec("billing_details[name]", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec CardBrand = new IdentifierSpec("card[brand]", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec PreferredCardBrand = new IdentifierSpec("card[networks][preferred]", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec CardCvc = new IdentifierSpec("card[cvc]", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec CardExpMonth = new IdentifierSpec("card[exp_month]", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec CardExpYear = new IdentifierSpec("card[exp_year]", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec BillingAddress = new IdentifierSpec("billing_details[address]", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec Email = new IdentifierSpec("billing_details[email]", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    private static final IdentifierSpec Phone = new IdentifierSpec("billing_details[phone]", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec Line2 = new IdentifierSpec("billing_details[address][line2]", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec City = new IdentifierSpec("billing_details[address][city]", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec DependentLocality = new IdentifierSpec("", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec PostalCode = new IdentifierSpec("billing_details[address][postal_code]", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec SortingCode = new IdentifierSpec("", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    private static final IdentifierSpec State = new IdentifierSpec("billing_details[address][state]", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec SaveForFutureUse = new IdentifierSpec("save_for_future_use", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec OneLineAddress = new IdentifierSpec("address", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    private static final IdentifierSpec SameAsShipping = new IdentifierSpec("same_as_shipping", true, (InterfaceC15439w1) null, 4, (DefaultConstructorMarker) null);

    /* JADX WARN: Multi-variable type inference failed */
    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        CardNumber = new IdentifierSpec("card[number]", false, (InterfaceC15439w1) null, 6, defaultConstructorMarker);
        Line1 = new IdentifierSpec("billing_details[address][line1]", false, (InterfaceC15439w1) null, 6, defaultConstructorMarker);
        Country = new IdentifierSpec("billing_details[address][country]", false, (InterfaceC15439w1) null, 6, defaultConstructorMarker);
        EnumC15434v1 enumC15434v1 = EnumC15434v1.f58016w;
        SetAsDefaultPaymentMethod = new IdentifierSpec("set_as_default_payment_method", false, (InterfaceC15439w1) enumC15434v1, 2, (DefaultConstructorMarker) null);
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z4 = false;
        Upi = new IdentifierSpec("upi", z4, (InterfaceC15439w1) null, 6, defaultConstructorMarker2);
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        boolean z13 = false;
        Vpa = new IdentifierSpec("upi[vpa]", z13, (InterfaceC15439w1) null, 6, defaultConstructorMarker3);
        EnumC15429u1 enumC15429u1 = EnumC15429u1.f57997x;
        Blik = new IdentifierSpec("blik", z4, enumC15429u1, 2, defaultConstructorMarker2);
        int i13 = 2;
        BlikCode = new IdentifierSpec("blik[code]", z13, enumC15429u1, i13, defaultConstructorMarker3);
        KonbiniConfirmationNumber = new IdentifierSpec("konbini[confirmation_number]", z13, enumC15429u1, i13, defaultConstructorMarker3);
        int i14 = 2;
        DefaultConstructorMarker defaultConstructorMarker4 = null;
        BacsDebitConfirmed = new IdentifierSpec("bacs_debit[confirmed]", false, (InterfaceC15439w1) enumC15434v1, i14, defaultConstructorMarker4);
        PhoneNumberCountry = new IdentifierSpec("phone_number_country", false, (InterfaceC15439w1) enumC15434v1, i14, defaultConstructorMarker4);
    }

    public /* synthetic */ IdentifierSpec(int i13, String str, boolean z4, InterfaceC15439w1 interfaceC15439w1, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, IdentifierSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.v1 = str;
        if ((i13 & 2) == 0) {
            this.ignoreField = false;
        } else {
            this.ignoreField = z4;
        }
        if ((i13 & 4) == 0) {
            this.destination = EnumC15429u1.f57996w;
        } else {
            this.destination = interfaceC15439w1;
        }
    }

    public static /* synthetic */ IdentifierSpec copy$default(IdentifierSpec identifierSpec, String str, boolean z4, InterfaceC15439w1 interfaceC15439w1, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = identifierSpec.v1;
        }
        if ((i13 & 2) != 0) {
            z4 = identifierSpec.ignoreField;
        }
        if ((i13 & 4) != 0) {
            interfaceC15439w1 = identifierSpec.destination;
        }
        return identifierSpec.copy(str, z4, interfaceC15439w1);
    }

    public static final /* synthetic */ void write$Self$stripe_ui_core_release(IdentifierSpec self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.v1);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.ignoreField) {
            output.encodeBooleanElement(serialDesc, 1, self.ignoreField);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.destination == EnumC15429u1.f57996w) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, interfaceC37138cArr[2], self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getV1() {
        return this.v1;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIgnoreField() {
        return this.ignoreField;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final InterfaceC15439w1 getDestination() {
        return this.destination;
    }

    public final IdentifierSpec copy(String v13, boolean ignoreField, InterfaceC15439w1 destination) {
        AbstractC22676k.m65750j(v13, "v1");
        AbstractC22676k.m65750j(destination, "destination");
        return new IdentifierSpec(v13, ignoreField, destination);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentifierSpec)) {
            return false;
        }
        IdentifierSpec identifierSpec = (IdentifierSpec) other;
        return AbstractC22676k.m65745e(this.v1, identifierSpec.v1) && this.ignoreField == identifierSpec.ignoreField && AbstractC22676k.m65745e(this.destination, identifierSpec.destination);
    }

    public final InterfaceC15439w1 getDestination() {
        return this.destination;
    }

    public final boolean getIgnoreField() {
        return this.ignoreField;
    }

    public final String getV1() {
        return this.v1;
    }

    public int hashCode() {
        return this.destination.hashCode() + AbstractC2875y.m8289b(this.v1.hashCode() * 31, 31, this.ignoreField);
    }

    public String toString() {
        String str = this.v1;
        boolean z4 = this.ignoreField;
        InterfaceC15439w1 interfaceC15439w1 = this.destination;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("IdentifierSpec(v1=", str, ", ignoreField=", ", destination=", z4);
        sbM73379l.append(interfaceC15439w1);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.v1);
        dest.writeInt(this.ignoreField ? 1 : 0);
        dest.writeParcelable(this.destination, flags);
    }

    public IdentifierSpec(String v13, boolean z4, InterfaceC15439w1 destination) {
        AbstractC22676k.m65750j(v13, "v1");
        AbstractC22676k.m65750j(destination, "destination");
        this.v1 = v13;
        this.ignoreField = z4;
        this.destination = destination;
    }

    public /* synthetic */ IdentifierSpec(String str, boolean z4, InterfaceC15439w1 interfaceC15439w1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? EnumC15429u1.f57996w : interfaceC15439w1);
    }

    public IdentifierSpec() {
        this("", false, (InterfaceC15439w1) null, 6, (DefaultConstructorMarker) null);
    }
}
