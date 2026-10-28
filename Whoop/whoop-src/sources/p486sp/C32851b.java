package p486sp;

import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import q30.C29912j0;

/* JADX INFO: renamed from: sp.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C32851b extends AbstractC36219a {
    public static final Parcelable.Creator<C32851b> CREATOR = new C29912j0(28);

    /* JADX INFO: renamed from: w */
    public final byte[] f136880w;

    public C32851b(byte[] bArr) {
        this.f136880w = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115325f(parcel, 2, this.f136880w);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
