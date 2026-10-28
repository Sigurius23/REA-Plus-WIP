package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pn.C29367a;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&JF\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b*\u0010\u001fJ\u001a\u0010-\u001a\u00020\u00072\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010!R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b4\u00102\u001a\u0004\b3\u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b6\u00102\u001a\u0004\b5\u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b8\u00102\u001a\u0004\b7\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b:\u0010&¨\u0006>"}, m65681d2 = {"Lcom/stripe/android/financialconnections/model/BankAccount;", "Lcom/stripe/android/financialconnections/model/PaymentAccount;", "", "id", "last4", "bankName", "routingNumber", "", "usesMicrodeposits", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$financial_connections_core_release", "(Lcom/stripe/android/financialconnections/model/BankAccount;Lzc3/c;Lyc3/g;)V", "write$Self", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/financialconnections/model/BankAccount;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getLast4", "getLast4$annotations", "getBankName", "getBankName$annotations", "getRoutingNumber", "getRoutingNumber$annotations", "Z", "getUsesMicrodeposits", "Companion", "$serializer", "com/stripe/android/financialconnections/model/g", "financial-connections-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BankAccount extends PaymentAccount {
    private final String bankName;
    private final String id;
    private final String last4;
    private final String routingNumber;
    private final boolean usesMicrodeposits;
    public static final C5613g Companion = new C5613g();
    public static final Parcelable.Creator<BankAccount> CREATOR = new C29367a(17);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BankAccount(int i13, String str, String str2, String str3, String str4, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, BankAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.last4 = str2;
        if ((i13 & 4) == 0) {
            this.bankName = null;
        } else {
            this.bankName = str3;
        }
        if ((i13 & 8) == 0) {
            this.routingNumber = null;
        } else {
            this.routingNumber = str4;
        }
        if ((i13 & 16) == 0) {
            this.usesMicrodeposits = true;
        } else {
            this.usesMicrodeposits = z4;
        }
    }

    public static /* synthetic */ BankAccount copy$default(BankAccount bankAccount, String str, String str2, String str3, String str4, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = bankAccount.id;
        }
        if ((i13 & 2) != 0) {
            str2 = bankAccount.last4;
        }
        if ((i13 & 4) != 0) {
            str3 = bankAccount.bankName;
        }
        if ((i13 & 8) != 0) {
            str4 = bankAccount.routingNumber;
        }
        if ((i13 & 16) != 0) {
            z4 = bankAccount.usesMicrodeposits;
        }
        boolean z13 = z4;
        String str5 = str3;
        return bankAccount.copy(str, str2, str5, str4, z13);
    }

    @InterfaceC37143h("bank_name")
    public static /* synthetic */ void getBankName$annotations() {
    }

    @InterfaceC37143h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @InterfaceC37143h("last4")
    public static /* synthetic */ void getLast4$annotations() {
    }

    @InterfaceC37143h("routing_number")
    public static /* synthetic */ void getRoutingNumber$annotations() {
    }

    public static final /* synthetic */ void write$Self$financial_connections_core_release(BankAccount self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.getId());
        output.encodeStringElement(serialDesc, 1, self.last4);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.bankName != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.bankName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.routingNumber != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.routingNumber);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.usesMicrodeposits) {
            return;
        }
        output.encodeBooleanElement(serialDesc, 4, self.usesMicrodeposits);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLast4() {
        return this.last4;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getUsesMicrodeposits() {
        return this.usesMicrodeposits;
    }

    public final BankAccount copy(String id4, String last4, String bankName, String routingNumber, boolean usesMicrodeposits) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(last4, "last4");
        return new BankAccount(id4, last4, bankName, routingNumber, usesMicrodeposits);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BankAccount)) {
            return false;
        }
        BankAccount bankAccount = (BankAccount) other;
        return AbstractC22676k.m65745e(this.id, bankAccount.id) && AbstractC22676k.m65745e(this.last4, bankAccount.last4) && AbstractC22676k.m65745e(this.bankName, bankAccount.bankName) && AbstractC22676k.m65745e(this.routingNumber, bankAccount.routingNumber) && this.usesMicrodeposits == bankAccount.usesMicrodeposits;
    }

    public final String getBankName() {
        return this.bankName;
    }

    @Override // com.stripe.android.financialconnections.model.PaymentAccount
    public String getId() {
        return this.id;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public final boolean getUsesMicrodeposits() {
        return this.usesMicrodeposits;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.last4);
        String str = this.bankName;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.routingNumber;
        return Boolean.hashCode(this.usesMicrodeposits) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.last4;
        String str3 = this.bankName;
        String str4 = this.routingNumber;
        boolean z4 = this.usesMicrodeposits;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BankAccount(id=", str, ", last4=", str2, ", bankName=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", routingNumber=", str4, ", usesMicrodeposits=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.last4);
        dest.writeString(this.bankName);
        dest.writeString(this.routingNumber);
        dest.writeInt(this.usesMicrodeposits ? 1 : 0);
    }

    public /* synthetic */ BankAccount(String str, String str2, String str3, String str4, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? true : z4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankAccount(String id4, String last4, String str, String str2, boolean z4) {
        super(null);
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(last4, "last4");
        this.id = id4;
        this.last4 = last4;
        this.bankName = str;
        this.routingNumber = str2;
        this.usesMicrodeposits = z4;
    }
}
