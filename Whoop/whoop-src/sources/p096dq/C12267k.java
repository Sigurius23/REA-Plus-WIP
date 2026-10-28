package p096dq;

import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: dq.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C12267k extends AbstractC36219a {
    public static final Parcelable.Creator<C12267k> CREATOR = new C12280x(12);

    /* JADX INFO: renamed from: w */
    public String f41074w;

    /* JADX INFO: renamed from: x */
    public C12260d f41075x;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 1, this.f41074w);
        AbstractC36221c.m115331l(parcel, 2, this.f41075x, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
