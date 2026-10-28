package p503tp;

import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: tp.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C34029c0 extends AbstractC36219a {
    public static final Parcelable.Creator<C34029c0> CREATOR = new C34025a0(3);

    /* JADX INFO: renamed from: w */
    public final String f142675w;

    /* JADX INFO: renamed from: x */
    public final String f142676x;

    /* JADX INFO: renamed from: y */
    public final String f142677y;

    public C34029c0(String str, String str2, String str3) {
        this.f142677y = str;
        this.f142675w = str2;
        this.f142676x = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 1, this.f142675w);
        AbstractC36221c.m115332m(parcel, 2, this.f142676x);
        AbstractC36221c.m115332m(parcel, 5, this.f142677y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
