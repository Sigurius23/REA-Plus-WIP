package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import mp.C25801t0;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16048o0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16048o0> CREATOR = new C16040k0(26);

    /* JADX INFO: renamed from: w */
    public final long f60697w;

    /* JADX INFO: renamed from: x */
    public final C25801t0 f60698x;

    /* JADX INFO: renamed from: y */
    public final C25801t0 f60699y;

    /* JADX INFO: renamed from: z */
    public final C25801t0 f60700z;

    public C16048o0(long j7, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        AbstractC35135w.m111094f(bArr);
        C25801t0 c25801t0M76048l = C25801t0.m76048l(bArr.length, bArr);
        AbstractC35135w.m111094f(bArr2);
        C25801t0 c25801t0M76048l2 = C25801t0.m76048l(bArr2.length, bArr2);
        AbstractC35135w.m111094f(bArr3);
        C25801t0 c25801t0M76048l3 = C25801t0.m76048l(bArr3.length, bArr3);
        this.f60697w = j7;
        this.f60698x = c25801t0M76048l;
        this.f60699y = c25801t0M76048l2;
        this.f60700z = c25801t0M76048l3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16048o0)) {
            return false;
        }
        C16048o0 c16048o0 = (C16048o0) obj;
        return this.f60697w == c16048o0.f60697w && AbstractC35135w.m111097i(this.f60698x, c16048o0.f60698x) && AbstractC35135w.m111097i(this.f60699y, c16048o0.f60699y) && AbstractC35135w.m111097i(this.f60700z, c16048o0.f60700z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f60697w), this.f60698x, this.f60699y, this.f60700z});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 8);
        parcel.writeLong(this.f60697w);
        AbstractC36221c.m115325f(parcel, 2, this.f60698x.m76050m());
        AbstractC36221c.m115325f(parcel, 3, this.f60699y.m76050m());
        AbstractC36221c.m115325f(parcel, 4, this.f60700z.m76050m());
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
