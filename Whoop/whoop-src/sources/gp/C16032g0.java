package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p126eq.C13433b;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16032g0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16032g0> CREATOR = new C13433b(25);

    /* JADX INFO: renamed from: w */
    public final boolean f60654w;

    public C16032g0(boolean z4) {
        this.f60654w = Boolean.valueOf(z4).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16032g0) && this.f60654w == ((C16032g0) obj).f60654w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f60654w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f60654w ? 1 : 0);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
