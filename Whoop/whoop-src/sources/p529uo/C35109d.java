package p529uo;

import android.os.Parcel;
import android.os.Parcelable;
import p486sp.C32854e;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: uo.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C35109d extends AbstractC36219a {
    public static final Parcelable.Creator<C35109d> CREATOR = new C32854e(21);

    /* JADX INFO: renamed from: w */
    public final int f148986w;

    /* JADX INFO: renamed from: x */
    public final String f148987x;

    public C35109d(int i13, String str) {
        this.f148986w = i13;
        this.f148987x = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C35109d)) {
            return false;
        }
        C35109d c35109d = (C35109d) obj;
        return c35109d.f148986w == this.f148986w && AbstractC35135w.m111097i(c35109d.f148987x, this.f148987x);
    }

    public final int hashCode() {
        return this.f148986w;
    }

    public final String toString() {
        int i13 = this.f148986w;
        int length = String.valueOf(i13).length();
        String str = this.f148987x;
        StringBuilder sb4 = new StringBuilder(length + 1 + String.valueOf(str).length());
        sb4.append(i13);
        sb4.append(":");
        sb4.append(str);
        return sb4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f148986w);
        AbstractC36221c.m115332m(parcel, 2, this.f148987x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
