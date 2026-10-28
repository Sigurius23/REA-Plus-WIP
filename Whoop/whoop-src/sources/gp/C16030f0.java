package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p126eq.C13433b;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.f0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16030f0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16030f0> CREATOR = new C13433b(24);

    /* JADX INFO: renamed from: w */
    public final long f60648w;

    public C16030f0(long j7) {
        this.f60648w = Long.valueOf(j7).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16030f0) && this.f60648w == ((C16030f0) obj).f60648w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f60648w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 8);
        parcel.writeLong(this.f60648w);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
