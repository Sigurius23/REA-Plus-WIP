package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16028e0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16028e0> CREATOR = new C16040k0(15);

    /* JADX INFO: renamed from: w */
    public final int f60644w;

    /* JADX INFO: renamed from: x */
    public final short f60645x;

    /* JADX INFO: renamed from: y */
    public final short f60646y;

    public C16028e0(int i13, short s13, short s14) {
        this.f60644w = i13;
        this.f60645x = s13;
        this.f60646y = s14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16028e0)) {
            return false;
        }
        C16028e0 c16028e0 = (C16028e0) obj;
        return this.f60644w == c16028e0.f60644w && this.f60645x == c16028e0.f60645x && this.f60646y == c16028e0.f60646y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f60644w), Short.valueOf(this.f60645x), Short.valueOf(this.f60646y)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f60644w);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f60645x);
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(this.f60646y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
