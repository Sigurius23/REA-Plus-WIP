package p591wp;

import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import v00.C35467g0;

/* JADX INFO: renamed from: wp.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C37495p extends AbstractC36219a {
    public static final Parcelable.Creator<C37495p> CREATOR = new C35467g0(18);

    /* JADX INFO: renamed from: w */
    public final C37494o f160375w;

    /* JADX INFO: renamed from: x */
    public final double f160376x;

    public C37495p(C37494o c37494o, double d3) {
        if (d3 <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.f160375w = c37494o;
        this.f160376x = d3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 2, this.f160375w, i13);
        AbstractC36221c.m115337r(parcel, 3, 8);
        parcel.writeDouble(this.f160376x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
