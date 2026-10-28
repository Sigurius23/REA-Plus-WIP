package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p319m4.AbstractC25012a;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: wz.t0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37757t0 extends AbstractC37760u0 {
    public static final Parcelable.Creator<C37757t0> CREATOR = new C37677f(22);

    /* JADX INFO: renamed from: x */
    public final AbstractC37748q0 f161730x;

    /* JADX INFO: renamed from: y */
    public final String f161731y;

    /* JADX INFO: renamed from: z */
    public final String f161732z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37757t0(AbstractC37748q0 linkPaymentDetails, String str, String str2) {
        super(linkPaymentDetails.mo121157b());
        AbstractC22676k.m65750j(linkPaymentDetails, "linkPaymentDetails");
        this.f161730x = linkPaymentDetails;
        this.f161731y = str;
        this.f161732z = str2;
    }

    @Override // p599wz.AbstractC37760u0
    /* JADX INFO: renamed from: b */
    public final String mo121162b() {
        return this.f161732z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37757t0)) {
            return false;
        }
        C37757t0 c37757t0 = (C37757t0) obj;
        return AbstractC22676k.m65745e(this.f161730x, c37757t0.f161730x) && AbstractC22676k.m65745e(this.f161731y, c37757t0.f161731y) && AbstractC22676k.m65745e(this.f161732z, c37757t0.f161732z);
    }

    @Override // p599wz.AbstractC37760u0
    /* JADX INFO: renamed from: f */
    public final String mo121163f() {
        return this.f161731y;
    }

    public final int hashCode() {
        int iHashCode = this.f161730x.hashCode() * 31;
        String str = this.f161731y;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f161732z;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LinkPaymentDetails(linkPaymentDetails=");
        sb4.append(this.f161730x);
        sb4.append(", collectedCvc=");
        sb4.append(this.f161731y);
        sb4.append(", billingPhone=");
        return AbstractC25012a.m73376i(this.f161732z, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f161730x, i13);
        dest.writeString(this.f161731y);
        dest.writeString(this.f161732z);
    }
}
