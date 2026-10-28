package p402po;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pn.C29367a;

/* JADX INFO: renamed from: po.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C29390g extends AbstractC36219a {
    public static final Parcelable.Creator<C29390g> CREATOR = new C29367a(7);

    /* JADX INFO: renamed from: E */
    public final boolean f119220E;

    /* JADX INFO: renamed from: F */
    public final int f119221F;

    /* JADX INFO: renamed from: w */
    public final String f119222w;

    /* JADX INFO: renamed from: x */
    public final String f119223x;

    /* JADX INFO: renamed from: y */
    public final String f119224y;

    /* JADX INFO: renamed from: z */
    public final String f119225z;

    public C29390g(String str, String str2, String str3, String str4, boolean z4, int i13) {
        AbstractC35135w.m111094f(str);
        this.f119222w = str;
        this.f119223x = str2;
        this.f119224y = str3;
        this.f119225z = str4;
        this.f119220E = z4;
        this.f119221F = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29390g)) {
            return false;
        }
        C29390g c29390g = (C29390g) obj;
        return AbstractC35135w.m111097i(this.f119222w, c29390g.f119222w) && AbstractC35135w.m111097i(this.f119225z, c29390g.f119225z) && AbstractC35135w.m111097i(this.f119223x, c29390g.f119223x) && AbstractC35135w.m111097i(Boolean.valueOf(this.f119220E), Boolean.valueOf(c29390g.f119220E)) && this.f119221F == c29390g.f119221F;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119222w, this.f119223x, this.f119225z, Boolean.valueOf(this.f119220E), Integer.valueOf(this.f119221F)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 1, this.f119222w);
        AbstractC36221c.m115332m(parcel, 2, this.f119223x);
        AbstractC36221c.m115332m(parcel, 3, this.f119224y);
        AbstractC36221c.m115332m(parcel, 4, this.f119225z);
        AbstractC36221c.m115337r(parcel, 5, 4);
        parcel.writeInt(this.f119220E ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 6, 4);
        parcel.writeInt(this.f119221F);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
