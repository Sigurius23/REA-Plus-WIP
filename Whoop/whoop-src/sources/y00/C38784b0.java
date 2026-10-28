package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38784b0 extends AbstractC38794c0 {
    public static final Parcelable.Creator<C38784b0> CREATOR = new C38873k(14);

    /* JADX INFO: renamed from: E */
    public final String f166936E;

    /* JADX INFO: renamed from: F */
    public final C39000y f166937F;

    /* JADX INFO: renamed from: G */
    public final String f166938G;

    /* JADX INFO: renamed from: y */
    public final String f166939y;

    /* JADX INFO: renamed from: z */
    public final String f166940z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38784b0(String id4, String paymentMethodId, String last4, C39000y c39000y, String str) {
        super(false, "card");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        AbstractC22676k.m65750j(last4, "last4");
        this.f166939y = id4;
        this.f166940z = paymentMethodId;
        this.f166936E = last4;
        this.f166937F = c39000y;
        this.f166938G = str;
    }

    @Override // y00.AbstractC38794c0
    /* JADX INFO: renamed from: b */
    public final C39000y mo124309b() {
        return this.f166937F;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38784b0)) {
            return false;
        }
        C38784b0 c38784b0 = (C38784b0) obj;
        return AbstractC22676k.m65745e(this.f166939y, c38784b0.f166939y) && AbstractC22676k.m65745e(this.f166940z, c38784b0.f166940z) && AbstractC22676k.m65745e(this.f166936E, c38784b0.f166936E) && AbstractC22676k.m65745e(this.f166937F, c38784b0.f166937F) && AbstractC22676k.m65745e(this.f166938G, c38784b0.f166938G);
    }

    @Override // y00.AbstractC38794c0
    /* JADX INFO: renamed from: f */
    public final String mo124310f() {
        return this.f166938G;
    }

    @Override // y00.AbstractC38794c0
    public final String getId() {
        return this.f166939y;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f166939y.hashCode() * 31, 31, this.f166940z), 31, this.f166936E);
        C39000y c39000y = this.f166937F;
        int iHashCode = (iM30450d + (c39000y == null ? 0 : c39000y.hashCode())) * 31;
        String str = this.f166938G;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Passthrough(id=", this.f166939y, ", paymentMethodId=", this.f166940z, ", last4=");
        sbM32001t.append(this.f166936E);
        sbM32001t.append(", billingAddress=");
        sbM32001t.append(this.f166937F);
        sbM32001t.append(", billingEmailAddress=");
        return AbstractC25012a.m73376i(this.f166938G, ")", sbM32001t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166939y);
        dest.writeString(this.f166940z);
        dest.writeString(this.f166936E);
        C39000y c39000y = this.f166937F;
        if (c39000y == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c39000y.writeToParcel(dest, i13);
        }
        dest.writeString(this.f166938G);
    }
}
