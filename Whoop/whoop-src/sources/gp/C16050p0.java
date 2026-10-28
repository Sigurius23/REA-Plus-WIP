package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16050p0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16050p0> CREATOR = new C16040k0(27);

    /* JADX INFO: renamed from: w */
    public final List f60702w;

    public C16050p0(ArrayList arrayList) {
        AbstractC35135w.m111094f(arrayList);
        this.f60702w = arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16050p0)) {
            return false;
        }
        List list = ((C16050p0) obj).f60702w;
        List list2 = this.f60702w;
        return list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.f60702w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115336q(parcel, 1, this.f60702w);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
