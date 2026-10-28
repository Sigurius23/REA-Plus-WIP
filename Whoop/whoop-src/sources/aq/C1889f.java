package aq;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C4969a;
import p529uo.C35132t;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: aq.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C1889f extends AbstractC36219a {
    public static final Parcelable.Creator<C1889f> CREATOR = new C0113a(29);

    /* JADX INFO: renamed from: w */
    public final int f7435w;

    /* JADX INFO: renamed from: x */
    public final C4969a f7436x;

    /* JADX INFO: renamed from: y */
    public final C35132t f7437y;

    public C1889f(int i13, C4969a c4969a, C35132t c35132t) {
        this.f7435w = i13;
        this.f7436x = c4969a;
        this.f7437y = c35132t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f7435w);
        AbstractC36221c.m115331l(parcel, 2, this.f7436x, i13);
        AbstractC36221c.m115331l(parcel, 3, this.f7437y, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
