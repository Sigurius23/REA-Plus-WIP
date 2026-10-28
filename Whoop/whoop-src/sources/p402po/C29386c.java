package p402po;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pn.C29367a;

/* JADX INFO: renamed from: po.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C29386c extends AbstractC36219a {
    public static final Parcelable.Creator<C29386c> CREATOR = new C29367a(10);

    /* JADX INFO: renamed from: w */
    public final boolean f119207w;

    /* JADX INFO: renamed from: x */
    public final byte[] f119208x;

    /* JADX INFO: renamed from: y */
    public final String f119209y;

    public C29386c(boolean z4, byte[] bArr, String str) {
        if (z4) {
            AbstractC35135w.m111094f(bArr);
            AbstractC35135w.m111094f(str);
        }
        this.f119207w = z4;
        this.f119208x = bArr;
        this.f119209y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29386c)) {
            return false;
        }
        C29386c c29386c = (C29386c) obj;
        return this.f119207w == c29386c.f119207w && Arrays.equals(this.f119208x, c29386c.f119208x) && Objects.equals(this.f119209y, c29386c.f119209y);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f119208x) + (Objects.hash(Boolean.valueOf(this.f119207w), this.f119209y) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 1, 4);
        parcel.writeInt(this.f119207w ? 1 : 0);
        AbstractC36221c.m115325f(parcel, 2, this.f119208x);
        AbstractC36221c.m115332m(parcel, 3, this.f119209y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
