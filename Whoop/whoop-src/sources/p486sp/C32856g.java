package p486sp;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: sp.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C32856g extends AbstractC36219a {
    public static final Parcelable.Creator<C32856g> CREATOR = new C32854e(2);

    /* JADX INFO: renamed from: w */
    public String[] f136885w;

    /* JADX INFO: renamed from: x */
    public int[] f136886x;

    /* JADX INFO: renamed from: y */
    public RemoteViews f136887y;

    /* JADX INFO: renamed from: z */
    public byte[] f136888z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115333n(parcel, 1, this.f136885w);
        AbstractC36221c.m115328i(parcel, 2, this.f136886x);
        AbstractC36221c.m115331l(parcel, 3, this.f136887y, i13);
        AbstractC36221c.m115325f(parcel, 4, this.f136888z);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
