package gq;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gq.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C16079h extends AbstractC36219a {
    public static final Parcelable.Creator<C16079h> CREATOR = new C16054r0(9);

    /* JADX INFO: renamed from: E */
    public C16078g f60809E;

    /* JADX INFO: renamed from: w */
    public String f60810w;

    /* JADX INFO: renamed from: x */
    public String f60811x;

    /* JADX INFO: renamed from: y */
    public C16077f f60812y;

    /* JADX INFO: renamed from: z */
    public C16078g f60813z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f60810w);
        AbstractC36221c.m115332m(parcel, 3, this.f60811x);
        AbstractC36221c.m115331l(parcel, 4, this.f60812y, i13);
        AbstractC36221c.m115331l(parcel, 5, this.f60813z, i13);
        AbstractC36221c.m115331l(parcel, 6, this.f60809E, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
