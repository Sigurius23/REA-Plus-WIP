package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C16029f extends AbstractC36219a {
    public static final Parcelable.Creator<C16029f> CREATOR = new C16040k0(18);

    /* JADX INFO: renamed from: w */
    public final boolean f60647w;

    public C16029f(boolean z4) {
        this.f60647w = z4;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16029f) && this.f60647w == ((C16029f) obj).f60647w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f60647w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f60647w ? 1 : 0);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
