package z10;

import android.os.Parcel;
import android.os.Parcelable;
import jh3.AbstractC21702c;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38915o4;

/* JADX INFO: renamed from: z10.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C39989l implements InterfaceC36562b {
    public static final Parcelable.Creator<C39989l> CREATOR = new C39988k(0);

    /* JADX INFO: renamed from: w */
    public final C38915o4 f172559w;

    /* JADX INFO: renamed from: x */
    public final String f172560x;

    /* JADX INFO: renamed from: y */
    public final String f172561y;

    /* JADX INFO: renamed from: z */
    public final boolean f172562z;

    public C39989l(C38915o4 paymentMethod, String str, String str2, boolean z4) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f172559w = paymentMethod;
        this.f172560x = str;
        this.f172561y = str2;
        this.f172562z = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39989l)) {
            return false;
        }
        C39989l c39989l = (C39989l) obj;
        return AbstractC22676k.m65745e(this.f172559w, c39989l.f172559w) && AbstractC22676k.m65745e(this.f172560x, c39989l.f172560x) && AbstractC22676k.m65745e(this.f172561y, c39989l.f172561y) && this.f172562z == c39989l.f172562z;
    }

    public final int hashCode() {
        int iHashCode = this.f172559w.hashCode() * 31;
        String str = this.f172560x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f172561y;
        return Boolean.hashCode(this.f172562z) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("InstantDebitsData(paymentMethod=");
        sb4.append(this.f172559w);
        sb4.append(", last4=");
        sb4.append(this.f172560x);
        sb4.append(", bankName=");
        return AbstractC21702c.m61137h(sb4, this.f172561y, ", eligibleForIncentive=", this.f172562z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f172559w.writeToParcel(dest, i13);
        dest.writeString(this.f172560x);
        dest.writeString(this.f172561y);
        dest.writeInt(this.f172562z ? 1 : 0);
    }
}
