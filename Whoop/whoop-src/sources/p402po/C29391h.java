package p402po;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pn.C29367a;

/* JADX INFO: renamed from: po.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C29391h extends AbstractC36219a {
    public static final Parcelable.Creator<C29391h> CREATOR = new C29367a(12);

    /* JADX INFO: renamed from: w */
    public final C29394k f119226w;

    /* JADX INFO: renamed from: x */
    public final String f119227x;

    /* JADX INFO: renamed from: y */
    public final int f119228y;

    public C29391h(C29394k c29394k, String str, int i13) {
        AbstractC35135w.m111094f(c29394k);
        this.f119226w = c29394k;
        this.f119227x = str;
        this.f119228y = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29391h)) {
            return false;
        }
        C29391h c29391h = (C29391h) obj;
        return AbstractC35135w.m111097i(this.f119226w, c29391h.f119226w) && AbstractC35135w.m111097i(this.f119227x, c29391h.f119227x) && this.f119228y == c29391h.f119228y;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119226w, this.f119227x});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 1, this.f119226w, i13);
        AbstractC36221c.m115332m(parcel, 2, this.f119227x);
        AbstractC36221c.m115337r(parcel, 3, 4);
        parcel.writeInt(this.f119228y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
