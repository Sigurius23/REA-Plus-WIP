package gq;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gq.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C16074c extends AbstractC36219a {
    public static final Parcelable.Creator<C16074c> CREATOR = new C16054r0(5);

    /* JADX INFO: renamed from: w */
    public String f60794w;

    /* JADX INFO: renamed from: x */
    public C16075d f60795x;

    /* JADX INFO: renamed from: y */
    public C16077f f60796y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f60794w);
        AbstractC36221c.m115331l(parcel, 3, this.f60795x, i13);
        AbstractC36221c.m115331l(parcel, 5, this.f60796y, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
