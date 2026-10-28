package p486sp;

import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: sp.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C32853d extends AbstractC36219a {
    public static final Parcelable.Creator<C32853d> CREATOR = new C32854e(0);

    /* JADX INFO: renamed from: w */
    public final byte[] f136882w;

    public C32853d(byte[] bArr) {
        this.f136882w = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115325f(parcel, 1, this.f136882w);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
