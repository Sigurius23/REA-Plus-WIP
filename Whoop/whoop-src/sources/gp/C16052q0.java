package gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;

/* JADX INFO: renamed from: gp.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16052q0 extends AbstractC36219a {
    public static final Parcelable.Creator<C16052q0> CREATOR = new C16040k0(28);

    public final boolean equals(Object obj) {
        return obj instanceof C16052q0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.FALSE});
    }

    public final String toString() {
        return "DevicePublicKeyExtension{devicePublicKey=false}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(0);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
