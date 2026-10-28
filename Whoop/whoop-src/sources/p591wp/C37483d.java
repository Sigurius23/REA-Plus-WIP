package p591wp;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import java.util.Arrays;
import p031b9.AbstractC2875y;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import v00.C35467g0;

/* JADX INFO: renamed from: wp.d */
/* JADX INFO: loaded from: classes6.dex */
public class C37483d extends AbstractC36219a {
    public static final Parcelable.Creator<C37483d> CREATOR = new C35467g0(19);

    /* JADX INFO: renamed from: w */
    public final int f160321w;

    /* JADX INFO: renamed from: x */
    public final C37481b f160322x;

    /* JADX INFO: renamed from: y */
    public final Float f160323y;

    public C37483d(int i13, C37481b c37481b, Float f13) {
        boolean z4 = true;
        boolean z13 = f13 != null && f13.floatValue() > 0.0f;
        if (i13 == 3) {
            z4 = c37481b != null && z13;
            i13 = 3;
        }
        AbstractC35135w.m111090b(z4, "Invalid Cap: type=" + i13 + " bitmapDescriptor=" + c37481b + " bitmapRefWidth=" + f13);
        this.f160321w = i13;
        this.f160322x = c37481b;
        this.f160323y = f13;
    }

    /* JADX INFO: renamed from: b */
    public final C37483d m120169b() {
        int i13 = this.f160321w;
        if (i13 == 0) {
            return new C37482c();
        }
        if (i13 == 1) {
            return new C37482c(1, null, null, 2);
        }
        if (i13 == 2) {
            return new C37482c(2, null, null, 1);
        }
        if (i13 != 3) {
            AbstractC2875y.m8313z(i13, "Unknown Cap type: ", "d");
            return this;
        }
        C37481b c37481b = this.f160322x;
        AbstractC35135w.m111096h("bitmapDescriptor must not be null", c37481b != null);
        Float f13 = this.f160323y;
        AbstractC35135w.m111096h("bitmapRefWidth must not be null", f13 != null);
        return new C37484e(c37481b, f13.floatValue());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37483d)) {
            return false;
        }
        C37483d c37483d = (C37483d) obj;
        return this.f160321w == c37483d.f160321w && AbstractC35135w.m111097i(this.f160322x, c37483d.f160322x) && AbstractC35135w.m111097i(this.f160323y, c37483d.f160323y);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f160321w), this.f160322x, this.f160323y});
    }

    public String toString() {
        return AbstractC18489d0.m53371l(new StringBuilder("[Cap: type="), this.f160321w, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115337r(parcel, 2, 4);
        parcel.writeInt(this.f160321w);
        C37481b c37481b = this.f160322x;
        AbstractC36221c.m115327h(parcel, 3, c37481b == null ? null : c37481b.f160319a.asBinder());
        AbstractC36221c.m115326g(parcel, 4, this.f160323y);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
