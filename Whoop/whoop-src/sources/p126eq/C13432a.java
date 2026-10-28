package p126eq;

import android.os.Parcel;
import android.os.Parcelable;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: eq.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C13432a extends AbstractC36219a {
    public static final Parcelable.Creator<C13432a> CREATOR = new C13433b(0);

    /* JADX INFO: renamed from: E */
    public String f47093E;

    /* JADX INFO: renamed from: F */
    public String f47094F;

    /* JADX INFO: renamed from: G */
    public String f47095G;

    /* JADX INFO: renamed from: H */
    public String f47096H;

    /* JADX INFO: renamed from: I */
    public String f47097I;

    /* JADX INFO: renamed from: w */
    public String f47098w;

    /* JADX INFO: renamed from: x */
    public int f47099x;

    /* JADX INFO: renamed from: y */
    public boolean f47100y;

    /* JADX INFO: renamed from: z */
    public String f47101z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 1, this.f47098w);
        int i14 = this.f47099x;
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(i14);
        boolean z4 = this.f47100y;
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC36221c.m115332m(parcel, 4, this.f47101z);
        AbstractC36221c.m115332m(parcel, 5, this.f47093E);
        AbstractC36221c.m115332m(parcel, 6, this.f47094F);
        AbstractC36221c.m115332m(parcel, 7, this.f47095G);
        AbstractC36221c.m115332m(parcel, 8, this.f47096H);
        AbstractC36221c.m115332m(parcel, 9, this.f47097I);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
