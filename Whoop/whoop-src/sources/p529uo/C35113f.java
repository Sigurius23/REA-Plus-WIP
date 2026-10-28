package p529uo;

import android.os.Parcel;
import android.os.Parcelable;
import p486sp.C32854e;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: uo.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C35113f extends AbstractC36219a {
    public static final Parcelable.Creator<C35113f> CREATOR = new C32854e(26);

    /* JADX INFO: renamed from: E */
    public final int f148998E;

    /* JADX INFO: renamed from: F */
    public final int[] f148999F;

    /* JADX INFO: renamed from: w */
    public final C35124l f149000w;

    /* JADX INFO: renamed from: x */
    public final boolean f149001x;

    /* JADX INFO: renamed from: y */
    public final boolean f149002y;

    /* JADX INFO: renamed from: z */
    public final int[] f149003z;

    public C35113f(C35124l c35124l, boolean z4, boolean z13, int[] iArr, int i13, int[] iArr2) {
        this.f149000w = c35124l;
        this.f149001x = z4;
        this.f149002y = z13;
        this.f149003z = iArr;
        this.f148998E = i13;
        this.f148999F = iArr2;
    }

    /* JADX INFO: renamed from: b */
    public final C35124l m111068b() {
        return this.f149000w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 1, this.f149000w, i13);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f149001x ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(this.f149002y ? 1 : 0);
        AbstractC36221c.m115328i(parcel, 4, this.f149003z);
        AbstractC36221c.m115337r(parcel, 5, 4);
        parcel.writeInt(this.f148998E);
        AbstractC36221c.m115328i(parcel, 6, this.f148999F);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
