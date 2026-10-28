package p591wp;

import android.os.Parcel;
import android.os.Parcelable;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import v00.C35467g0;

/* JADX INFO: renamed from: wp.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C37486g extends AbstractC36219a {
    public static final Parcelable.Creator<C37486g> CREATOR = new C35467g0(22);

    /* JADX INFO: renamed from: w */
    public final String f160330w;

    public C37486g(String str) {
        AbstractC35135w.m111095g(str, "json must not be null");
        this.f160330w = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f160330w);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
