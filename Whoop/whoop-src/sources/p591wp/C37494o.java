package p591wp;

import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import v00.C35467g0;

/* JADX INFO: renamed from: wp.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C37494o extends AbstractC36219a {
    public static final Parcelable.Creator<C37494o> CREATOR = new C35467g0(17);

    /* JADX INFO: renamed from: E */
    public final C37493n f160370E;

    /* JADX INFO: renamed from: w */
    public final float f160371w;

    /* JADX INFO: renamed from: x */
    public final int f160372x;

    /* JADX INFO: renamed from: y */
    public final int f160373y;

    /* JADX INFO: renamed from: z */
    public final boolean f160374z;

    public C37494o(float f13, int i13, int i14, boolean z4, C37493n c37493n) {
        this.f160371w = f13;
        this.f160372x = i13;
        this.f160373y = i14;
        this.f160374z = z4;
        this.f160370E = c37493n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeFloat(this.f160371w);
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(this.f160372x);
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(this.f160373y);
        AbstractC36221c.m115337r(parcel, 5, 4);
        parcel.writeInt(this.f160374z ? 1 : 0);
        AbstractC36221c.m115331l(parcel, 6, this.f160370E, i13);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
