package p402po;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pn.C29367a;

/* JADX INFO: renamed from: po.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C29385b extends AbstractC36219a {
    public static final Parcelable.Creator<C29385b> CREATOR = new C29367a(9);

    /* JADX INFO: renamed from: w */
    public final boolean f119205w;

    /* JADX INFO: renamed from: x */
    public final String f119206x;

    public C29385b(boolean z4, String str) {
        if (z4) {
            AbstractC35135w.m111094f(str);
        }
        this.f119205w = z4;
        this.f119206x = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29385b)) {
            return false;
        }
        C29385b c29385b = (C29385b) obj;
        return this.f119205w == c29385b.f119205w && AbstractC35135w.m111097i(this.f119206x, c29385b.f119206x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f119205w), this.f119206x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f119205w ? 1 : 0);
        AbstractC36221c.m115332m(parcel, 2, this.f119206x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
