package p591wp;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import v00.C35467g0;

/* JADX INFO: renamed from: wp.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C37492m extends AbstractC36219a {
    public static final Parcelable.Creator<C37492m> CREATOR = new C35467g0(26);

    /* JADX INFO: renamed from: E */
    public boolean f160357E;

    /* JADX INFO: renamed from: F */
    public boolean f160358F;

    /* JADX INFO: renamed from: G */
    public boolean f160359G;

    /* JADX INFO: renamed from: H */
    public C37483d f160360H;

    /* JADX INFO: renamed from: I */
    public C37483d f160361I;

    /* JADX INFO: renamed from: J */
    public int f160362J;

    /* JADX INFO: renamed from: K */
    public List f160363K;

    /* JADX INFO: renamed from: L */
    public final List f160364L;

    /* JADX INFO: renamed from: w */
    public final List f160365w;

    /* JADX INFO: renamed from: x */
    public float f160366x;

    /* JADX INFO: renamed from: y */
    public int f160367y;

    /* JADX INFO: renamed from: z */
    public float f160368z;

    public C37492m() {
        this.f160366x = 10.0f;
        this.f160367y = -16777216;
        this.f160368z = 0.0f;
        this.f160357E = true;
        this.f160358F = false;
        this.f160359G = false;
        this.f160360H = new C37482c();
        this.f160361I = new C37482c();
        this.f160362J = 0;
        this.f160363K = null;
        this.f160364L = new ArrayList();
        this.f160365w = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115336q(parcel, 2, this.f160365w);
        float f13 = this.f160366x;
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeFloat(f13);
        int i14 = this.f160367y;
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(i14);
        float f14 = this.f160368z;
        AbstractC36221c.m115337r(parcel, 5, 4);
        parcel.writeFloat(f14);
        boolean z4 = this.f160357E;
        AbstractC36221c.m115337r(parcel, 6, 4);
        parcel.writeInt(z4 ? 1 : 0);
        boolean z13 = this.f160358F;
        AbstractC36221c.m115337r(parcel, 7, 4);
        parcel.writeInt(z13 ? 1 : 0);
        boolean z14 = this.f160359G;
        AbstractC36221c.m115337r(parcel, 8, 4);
        parcel.writeInt(z14 ? 1 : 0);
        AbstractC36221c.m115331l(parcel, 9, this.f160360H.m120169b(), i13);
        AbstractC36221c.m115331l(parcel, 10, this.f160361I.m120169b(), i13);
        int i15 = this.f160362J;
        AbstractC36221c.m115337r(parcel, 11, 4);
        parcel.writeInt(i15);
        AbstractC36221c.m115336q(parcel, 12, this.f160363K);
        List<C37495p> list = this.f160364L;
        ArrayList arrayList = new ArrayList(list.size());
        for (C37495p c37495p : list) {
            C37494o c37494o = c37495p.f160375w;
            float f15 = c37494o.f160371w;
            Pair pair = new Pair(Integer.valueOf(c37494o.f160372x), Integer.valueOf(c37494o.f160373y));
            arrayList.add(new C37495p(new C37494o(this.f160366x, ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), this.f160357E, c37494o.f160370E), c37495p.f160376x));
        }
        AbstractC36221c.m115336q(parcel, 13, arrayList);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }

    public C37492m(ArrayList arrayList, float f13, int i13, float f14, boolean z4, boolean z13, boolean z14, C37483d c37483d, C37483d c37483d2, int i14, ArrayList arrayList2, ArrayList arrayList3) {
        this.f160366x = 10.0f;
        this.f160367y = -16777216;
        this.f160368z = 0.0f;
        this.f160357E = true;
        this.f160358F = false;
        this.f160359G = false;
        this.f160360H = new C37482c();
        this.f160361I = new C37482c();
        this.f160362J = 0;
        this.f160363K = null;
        this.f160364L = new ArrayList();
        this.f160365w = arrayList;
        this.f160366x = f13;
        this.f160367y = i13;
        this.f160368z = f14;
        this.f160357E = z4;
        this.f160358F = z13;
        this.f160359G = z14;
        if (c37483d != null) {
            this.f160360H = c37483d;
        }
        if (c37483d2 != null) {
            this.f160361I = c37483d2;
        }
        this.f160362J = i14;
        this.f160363K = arrayList2;
        if (arrayList3 != null) {
            this.f160364L = arrayList3;
        }
    }
}
