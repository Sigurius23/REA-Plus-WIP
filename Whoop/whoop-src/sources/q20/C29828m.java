package q20;

import android.os.Parcel;
import android.os.Parcelable;
import p599wz.AbstractC37760u0;
import p599wz.EnumC37721h0;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import pn.C29367a;
import y00.C38864j0;

/* JADX INFO: renamed from: q20.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C29828m extends AbstractC29840y {
    public static final Parcelable.Creator<C29828m> CREATOR = new C29367a(27);

    /* JADX INFO: renamed from: x */
    public final EnumC37721h0 f121915x;

    /* JADX INFO: renamed from: y */
    public final AbstractC37760u0 f121916y;

    /* JADX INFO: renamed from: z */
    public final C38864j0 f121917z;

    public C29828m(EnumC37721h0 linkExpressMode, AbstractC37760u0 abstractC37760u0, C38864j0 c38864j0) {
        AbstractC22676k.m65750j(linkExpressMode, "linkExpressMode");
        this.f121915x = linkExpressMode;
        this.f121916y = abstractC37760u0;
        this.f121917z = c38864j0;
    }

    /* JADX INFO: renamed from: h */
    public static C29828m m91328h(C29828m c29828m, AbstractC37760u0 abstractC37760u0) {
        EnumC37721h0 linkExpressMode = c29828m.f121915x;
        C38864j0 c38864j0 = c29828m.f121917z;
        c29828m.getClass();
        AbstractC22676k.m65750j(linkExpressMode, "linkExpressMode");
        return new C29828m(linkExpressMode, abstractC37760u0, c38864j0);
    }

    @Override // q20.AbstractC29840y
    /* JADX INFO: renamed from: b */
    public final boolean mo91323b() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29828m)) {
            return false;
        }
        C29828m c29828m = (C29828m) obj;
        return this.f121915x == c29828m.f121915x && AbstractC22676k.m65745e(this.f121916y, c29828m.f121916y) && AbstractC22676k.m65745e(this.f121917z, c29828m.f121917z);
    }

    @Override // q20.AbstractC29840y
    /* JADX INFO: renamed from: f */
    public final InterfaceC41211c mo91324f(String merchantName, boolean z4) {
        AbstractC22676k.m65750j(merchantName, "merchantName");
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f121915x.hashCode() * 31;
        AbstractC37760u0 abstractC37760u0 = this.f121916y;
        int iHashCode2 = (iHashCode + (abstractC37760u0 == null ? 0 : abstractC37760u0.hashCode())) * 31;
        C38864j0 c38864j0 = this.f121917z;
        return iHashCode2 + (c38864j0 != null ? c38864j0.hashCode() : 0);
    }

    public final String toString() {
        return "Link(linkExpressMode=" + this.f121915x + ", selectedPayment=" + this.f121916y + ", shippingAddress=" + this.f121917z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f121915x.name());
        dest.writeParcelable(this.f121916y, i13);
        dest.writeParcelable(this.f121917z, i13);
    }

    public /* synthetic */ C29828m(EnumC37721h0 enumC37721h0, AbstractC37760u0 abstractC37760u0, C38864j0 c38864j0, int i13) {
        this((i13 & 1) != 0 ? EnumC37721h0.f161649w : enumC37721h0, (i13 & 2) != 0 ? null : abstractC37760u0, (i13 & 4) != 0 ? null : c38864j0);
    }
}
