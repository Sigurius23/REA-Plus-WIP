package p529uo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p486sp.C32854e;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: uo.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C35125m extends AbstractC36219a {
    public static final Parcelable.Creator<C35125m> CREATOR = new C32854e(22);

    /* JADX INFO: renamed from: w */
    public final int f149055w;

    /* JADX INFO: renamed from: x */
    public List f149056x;

    public C35125m(int i13, List list) {
        this.f149055w = i13;
        this.f149056x = list;
    }

    /* JADX INFO: renamed from: b */
    public final int m111073b() {
        return this.f149055w;
    }

    /* JADX INFO: renamed from: f */
    public final List m111074f() {
        return this.f149056x;
    }

    /* JADX INFO: renamed from: h */
    public final void m111075h(C35121j c35121j) {
        if (this.f149056x == null) {
            this.f149056x = new ArrayList();
        }
        this.f149056x.add(c35121j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f149055w);
        AbstractC36221c.m115336q(parcel, 2, this.f149056x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
