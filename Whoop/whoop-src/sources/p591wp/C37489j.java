package p591wp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import v00.C35467g0;

/* JADX INFO: renamed from: wp.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C37489j extends AbstractC36219a {
    public static final Parcelable.Creator<C37489j> CREATOR = new C35467g0(24);

    /* JADX INFO: renamed from: w */
    public final int f160351w;

    /* JADX INFO: renamed from: x */
    public final Float f160352x;

    public C37489j(int i13, Float f13) {
        boolean z4 = true;
        if (i13 != 1 && (f13 == null || f13.floatValue() < 0.0f)) {
            z4 = false;
        }
        AbstractC35135w.m111090b(z4, "Invalid PatternItem: type=" + i13 + " length=" + f13);
        this.f160351w = i13;
        this.f160352x = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37489j)) {
            return false;
        }
        C37489j c37489j = (C37489j) obj;
        return this.f160351w == c37489j.f160351w && AbstractC35135w.m111097i(this.f160352x, c37489j.f160352x);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f160351w), this.f160352x});
    }

    public final String toString() {
        return "[PatternItem: type=" + this.f160351w + " length=" + this.f160352x + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f160351w);
        AbstractC36221c.m115326g(parcel, 3, this.f160352x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
