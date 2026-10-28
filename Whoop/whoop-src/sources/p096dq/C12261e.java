package p096dq;

import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C12261e extends AbstractC36219a {
    public static final Parcelable.Creator<C12261e> CREATOR = new C12280x(7);

    /* JADX INFO: renamed from: w */
    public String f41038w;

    /* JADX INFO: renamed from: x */
    public String f41039x;

    /* JADX INFO: renamed from: y */
    public int f41040y;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 2, this.f41038w);
        AbstractC36221c.m115332m(parcel, 3, this.f41039x);
        int i14 = this.f41040y;
        if (i14 != 1 && i14 != 2 && i14 != 3) {
            i14 = 0;
        }
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(i14);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
