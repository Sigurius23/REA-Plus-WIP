package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p126eq.C13433b;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16034h0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16034h0> CREATOR = new C13433b(27);

    /* JADX INFO: renamed from: w */
    public final String f60659w;

    public C16034h0(String str) {
        AbstractC35135w.m111094f(str);
        this.f60659w = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16034h0) {
            return this.f60659w.equals(((C16034h0) obj).f60659w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f60659w});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115332m(parcel, 1, this.f60659w);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
