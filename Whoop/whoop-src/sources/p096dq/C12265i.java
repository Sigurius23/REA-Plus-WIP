package p096dq;

import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C12265i extends AbstractC36219a {
    public static final Parcelable.Creator<C12265i> CREATOR = new C12280x(13);

    /* JADX INFO: renamed from: w */
    public int f41072w;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        int i14 = this.f41072w;
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(i14);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
