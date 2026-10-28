package o10;

import android.os.Parcel;
import android.os.Parcelable;
import e10.InterfaceC12555l;
import mn.C25704b;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38941r3;

/* JADX INFO: renamed from: o10.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C27394g implements InterfaceC12555l {
    public static final Parcelable.Creator<C27394g> CREATOR = new C25704b(21);

    /* JADX INFO: renamed from: E */
    public final EnumC38941r3 f110108E;

    /* JADX INFO: renamed from: w */
    public final String f110109w;

    /* JADX INFO: renamed from: x */
    public final String f110110x;

    /* JADX INFO: renamed from: y */
    public final String f110111y;

    /* JADX INFO: renamed from: z */
    public final String f110112z;

    public C27394g(String paymentDetailsId, String expectedPaymentMethodType, String str, String str2, EnumC38941r3 enumC38941r3) {
        AbstractC22676k.m65750j(paymentDetailsId, "paymentDetailsId");
        AbstractC22676k.m65750j(expectedPaymentMethodType, "expectedPaymentMethodType");
        this.f110109w = paymentDetailsId;
        this.f110110x = expectedPaymentMethodType;
        this.f110111y = str;
        this.f110112z = str2;
        this.f110108E = enumC38941r3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27394g)) {
            return false;
        }
        C27394g c27394g = (C27394g) obj;
        return AbstractC22676k.m65745e(this.f110109w, c27394g.f110109w) && AbstractC22676k.m65745e(this.f110110x, c27394g.f110110x) && AbstractC22676k.m65745e(this.f110111y, c27394g.f110111y) && AbstractC22676k.m65745e(this.f110112z, c27394g.f110112z) && this.f110108E == c27394g.f110108E;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f110109w.hashCode() * 31, 31, this.f110110x);
        String str = this.f110111y;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110112z;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC38941r3 enumC38941r3 = this.f110108E;
        return iHashCode2 + (enumC38941r3 != null ? enumC38941r3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("LinkPassthroughConfirmationOption(paymentDetailsId=", this.f110109w, ", expectedPaymentMethodType=", this.f110110x, ", cvc=");
        AbstractC11266d.m30444B(sbM32001t, this.f110111y, ", billingPhone=", this.f110112z, ", allowRedisplay=");
        sbM32001t.append(this.f110108E);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f110109w);
        dest.writeString(this.f110110x);
        dest.writeString(this.f110111y);
        dest.writeString(this.f110112z);
        dest.writeParcelable(this.f110108E, i13);
    }
}
