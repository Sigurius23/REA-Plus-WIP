package p096dq;

import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C12278v extends AbstractC36219a {
    public static final Parcelable.Creator<C12278v> CREATOR = new C12280x(2);

    /* JADX INFO: renamed from: E */
    public String f41110E;

    /* JADX INFO: renamed from: F */
    public String f41111F;

    /* JADX INFO: renamed from: G */
    public String f41112G;

    /* JADX INFO: renamed from: H */
    public String f41113H;

    /* JADX INFO: renamed from: I */
    public String f41114I;

    /* JADX INFO: renamed from: J */
    public boolean f41115J;

    /* JADX INFO: renamed from: K */
    public String f41116K;

    /* JADX INFO: renamed from: w */
    public String f41117w;

    /* JADX INFO: renamed from: x */
    public String f41118x;

    /* JADX INFO: renamed from: y */
    public String f41119y;

    /* JADX INFO: renamed from: z */
    public String f41120z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f41117w);
        AbstractC36221c.m115332m(parcel, 3, this.f41118x);
        AbstractC36221c.m115332m(parcel, 4, this.f41119y);
        AbstractC36221c.m115332m(parcel, 5, this.f41120z);
        AbstractC36221c.m115332m(parcel, 6, this.f41110E);
        AbstractC36221c.m115332m(parcel, 7, this.f41111F);
        AbstractC36221c.m115332m(parcel, 8, this.f41112G);
        AbstractC36221c.m115332m(parcel, 9, this.f41113H);
        AbstractC36221c.m115332m(parcel, 10, this.f41114I);
        boolean z4 = this.f41115J;
        AbstractC36221c.m115337r(parcel, 11, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC36221c.m115332m(parcel, 12, this.f41116K);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
