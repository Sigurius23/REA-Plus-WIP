package gq;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gq.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C16077f extends AbstractC36219a {
    public static final Parcelable.Creator<C16077f> CREATOR = new C16054r0(7);

    /* JADX INFO: renamed from: w */
    public long f60805w;

    /* JADX INFO: renamed from: x */
    public long f60806x;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        long j7 = this.f60805w;
        AbstractC36221c.m115337r(parcel, 2, 8);
        parcel.writeLong(j7);
        long j13 = this.f60806x;
        AbstractC36221c.m115337r(parcel, 3, 8);
        parcel.writeLong(j13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
