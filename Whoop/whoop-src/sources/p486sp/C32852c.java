package p486sp;

import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import q30.C29912j0;

/* JADX INFO: renamed from: sp.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C32852c extends AbstractC36219a {
    public static final Parcelable.Creator<C32852c> CREATOR = new C29912j0(29);

    /* JADX INFO: renamed from: w */
    public final byte[] f136881w;

    public C32852c(byte[] bArr) {
        this.f136881w = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115325f(parcel, 2, this.f136881w);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
