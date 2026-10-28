package gq;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gq.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C16078g extends AbstractC36219a {
    public static final Parcelable.Creator<C16078g> CREATOR = new C16054r0(8);

    /* JADX INFO: renamed from: w */
    public String f60807w;

    /* JADX INFO: renamed from: x */
    public String f60808x;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f60807w);
        AbstractC36221c.m115332m(parcel, 3, this.f60808x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
