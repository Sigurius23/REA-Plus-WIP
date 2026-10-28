package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.b0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16022b0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16022b0> CREATOR = new C16040k0(12);

    /* JADX INFO: renamed from: w */
    public final boolean f60620w;

    public C16022b0(boolean z4) {
        this.f60620w = z4;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16022b0) && this.f60620w == ((C16022b0) obj).f60620w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f60620w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f60620w ? 1 : 0);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
