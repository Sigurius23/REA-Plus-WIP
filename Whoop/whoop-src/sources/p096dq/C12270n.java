package p096dq;

import android.os.Parcel;
import android.os.Parcelable;
import p023ay.C2125b;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C12270n extends AbstractC36219a {
    public static final Parcelable.Creator<C12270n> CREATOR = new C2125b(26);

    /* JADX INFO: renamed from: w */
    public int f41096w;

    /* JADX INFO: renamed from: x */
    public String f41097x;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        int i14 = this.f41096w;
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(i14);
        AbstractC36221c.m115332m(parcel, 3, this.f41097x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
