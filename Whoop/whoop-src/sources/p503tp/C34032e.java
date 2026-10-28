package p503tp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: tp.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C34032e extends AbstractC36219a {

    @RecentlyNonNull
    public static final Parcelable.Creator<C34032e> CREATOR = new C34025a0(14);

    /* JADX INFO: renamed from: w */
    public final List f142687w;

    /* JADX INFO: renamed from: x */
    public final Bundle f142688x;

    public C34032e(ArrayList arrayList, Bundle bundle) {
        this.f142688x = null;
        AbstractC35135w.m111095g(arrayList, "transitionEvents list can't be null.");
        if (!arrayList.isEmpty()) {
            for (int i13 = 1; i13 < arrayList.size(); i13++) {
                AbstractC35135w.m111089a(((C34028c) arrayList.get(i13)).f142674y >= ((C34028c) arrayList.get(i13 + (-1))).f142674y);
            }
        }
        this.f142687w = Collections.unmodifiableList(arrayList);
        this.f142688x = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34032e.class != obj.getClass()) {
            return false;
        }
        return this.f142687w.equals(((C34032e) obj).f142687w);
    }

    public final int hashCode() {
        return this.f142687w.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        AbstractC35135w.m111094f(parcel);
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115336q(parcel, 1, this.f142687w);
        AbstractC36221c.m115324e(parcel, 2, this.f142688x);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
