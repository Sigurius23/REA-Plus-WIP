package p402po;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pn.C29367a;

/* JADX INFO: renamed from: po.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C29387d extends AbstractC36219a {
    public static final Parcelable.Creator<C29387d> CREATOR = new C29367a(11);

    /* JADX INFO: renamed from: w */
    public final boolean f119210w;

    public C29387d(boolean z4) {
        this.f119210w = z4;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C29387d) && this.f119210w == ((C29387d) obj).f119210w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f119210w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f119210w ? 1 : 0);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
