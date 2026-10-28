package p529uo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1337q1;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: uo.l */
/* JADX INFO: loaded from: classes.dex */
public final class C35124l extends AbstractC36219a {
    public static final Parcelable.Creator<C35124l> CREATOR = new C1337q1(9);

    /* JADX INFO: renamed from: E */
    public final int f149050E;

    /* JADX INFO: renamed from: w */
    public final int f149051w;

    /* JADX INFO: renamed from: x */
    public final boolean f149052x;

    /* JADX INFO: renamed from: y */
    public final boolean f149053y;

    /* JADX INFO: renamed from: z */
    public final int f149054z;

    public C35124l(int i13, boolean z4, boolean z13, int i14, int i15) {
        this.f149051w = i13;
        this.f149052x = z4;
        this.f149053y = z13;
        this.f149054z = i14;
        this.f149050E = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f149051w);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f149052x ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(this.f149053y ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(this.f149054z);
        AbstractC36221c.m115337r(parcel, 5, 4);
        parcel.writeInt(this.f149050E);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
