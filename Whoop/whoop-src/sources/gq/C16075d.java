package gq;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gq.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C16075d extends AbstractC36219a {
    public static final Parcelable.Creator<C16075d> CREATOR = new C16054r0(4);

    /* JADX INFO: renamed from: E */
    public long f60797E;

    /* JADX INFO: renamed from: F */
    public int f60798F;

    /* JADX INFO: renamed from: w */
    public int f60799w;

    /* JADX INFO: renamed from: x */
    public String f60800x;

    /* JADX INFO: renamed from: y */
    public double f60801y;

    /* JADX INFO: renamed from: z */
    public String f60802z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        int i14 = this.f60799w;
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(i14);
        AbstractC36221c.m115332m(parcel, 3, this.f60800x);
        double d3 = this.f60801y;
        AbstractC36221c.m115337r(parcel, 4, 8);
        parcel.writeDouble(d3);
        AbstractC36221c.m115332m(parcel, 5, this.f60802z);
        long j7 = this.f60797E;
        AbstractC36221c.m115337r(parcel, 6, 8);
        parcel.writeLong(j7);
        int i15 = this.f60798F;
        AbstractC36221c.m115337r(parcel, 7, 4);
        parcel.writeInt(i15);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
