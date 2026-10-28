package p402po;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p529uo.AbstractC35135w;
import p557vo.AbstractC36219a;
import p557vo.AbstractC36221c;
import pn.C29367a;

/* JADX INFO: renamed from: po.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C29388e extends AbstractC36219a {
    public static final Parcelable.Creator<C29388e> CREATOR = new C29367a(5);

    /* JADX INFO: renamed from: E */
    public final int f119211E;

    /* JADX INFO: renamed from: F */
    public final C29386c f119212F;

    /* JADX INFO: renamed from: G */
    public final C29385b f119213G;

    /* JADX INFO: renamed from: H */
    public final boolean f119214H;

    /* JADX INFO: renamed from: w */
    public final C29387d f119215w;

    /* JADX INFO: renamed from: x */
    public final C29384a f119216x;

    /* JADX INFO: renamed from: y */
    public final String f119217y;

    /* JADX INFO: renamed from: z */
    public final boolean f119218z;

    public C29388e(C29387d c29387d, C29384a c29384a, String str, boolean z4, int i13, C29386c c29386c, C29385b c29385b, boolean z13) {
        AbstractC35135w.m111094f(c29387d);
        this.f119215w = c29387d;
        AbstractC35135w.m111094f(c29384a);
        this.f119216x = c29384a;
        this.f119217y = str;
        this.f119218z = z4;
        this.f119211E = i13;
        this.f119212F = c29386c == null ? new C29386c(false, null, null) : c29386c;
        this.f119213G = c29385b == null ? new C29385b(false, null) : c29385b;
        this.f119214H = z13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29388e)) {
            return false;
        }
        C29388e c29388e = (C29388e) obj;
        return AbstractC35135w.m111097i(this.f119215w, c29388e.f119215w) && AbstractC35135w.m111097i(this.f119216x, c29388e.f119216x) && AbstractC35135w.m111097i(this.f119212F, c29388e.f119212F) && AbstractC35135w.m111097i(this.f119213G, c29388e.f119213G) && AbstractC35135w.m111097i(this.f119217y, c29388e.f119217y) && this.f119218z == c29388e.f119218z && this.f119211E == c29388e.f119211E && this.f119214H == c29388e.f119214H;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f119215w, this.f119216x, this.f119212F, this.f119213G, this.f119217y, Boolean.valueOf(this.f119218z), Integer.valueOf(this.f119211E), Boolean.valueOf(this.f119214H)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int iM115338s = AbstractC36221c.m115338s(parcel, 20293);
        AbstractC36221c.m115331l(parcel, 1, this.f119215w, i13);
        AbstractC36221c.m115331l(parcel, 2, this.f119216x, i13);
        AbstractC36221c.m115332m(parcel, 3, this.f119217y);
        AbstractC36221c.m115337r(parcel, 4, 4);
        parcel.writeInt(this.f119218z ? 1 : 0);
        AbstractC36221c.m115337r(parcel, 5, 4);
        parcel.writeInt(this.f119211E);
        AbstractC36221c.m115331l(parcel, 6, this.f119212F, i13);
        AbstractC36221c.m115331l(parcel, 7, this.f119213G, i13);
        AbstractC36221c.m115337r(parcel, 8, 4);
        parcel.writeInt(this.f119214H ? 1 : 0);
        AbstractC36221c.m115339t(parcel, iM115338s);
    }
}
