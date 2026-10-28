package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p555vl.AbstractC36095b;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38864j0;

/* JADX INFO: renamed from: wz.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C37738n extends AbstractC37747q {
    public static final Parcelable.Creator<C37738n> CREATOR = new C37677f(4);

    /* JADX INFO: renamed from: w */
    public final InterfaceC37711e f161695w;

    /* JADX INFO: renamed from: x */
    public final AbstractC37760u0 f161696x;

    /* JADX INFO: renamed from: y */
    public final C38864j0 f161697y;

    /* JADX INFO: renamed from: z */
    public final Boolean f161698z;

    public C37738n(InterfaceC37711e linkAccountUpdate, AbstractC37760u0 abstractC37760u0, C38864j0 c38864j0, Boolean bool) {
        AbstractC22676k.m65750j(linkAccountUpdate, "linkAccountUpdate");
        this.f161695w = linkAccountUpdate;
        this.f161696x = abstractC37760u0;
        this.f161697y = c38864j0;
        this.f161698z = bool;
    }

    @Override // p599wz.AbstractC37747q
    /* JADX INFO: renamed from: b */
    public final InterfaceC37711e mo121151b() {
        return this.f161695w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37738n)) {
            return false;
        }
        C37738n c37738n = (C37738n) obj;
        return AbstractC22676k.m65745e(this.f161695w, c37738n.f161695w) && AbstractC22676k.m65745e(this.f161696x, c37738n.f161696x) && AbstractC22676k.m65745e(this.f161697y, c37738n.f161697y) && AbstractC22676k.m65745e(this.f161698z, c37738n.f161698z);
    }

    public final int hashCode() {
        int iHashCode = this.f161695w.hashCode() * 31;
        AbstractC37760u0 abstractC37760u0 = this.f161696x;
        int iHashCode2 = (iHashCode + (abstractC37760u0 == null ? 0 : abstractC37760u0.hashCode())) * 31;
        C38864j0 c38864j0 = this.f161697y;
        int iHashCode3 = (iHashCode2 + (c38864j0 == null ? 0 : c38864j0.hashCode())) * 31;
        Boolean bool = this.f161698z;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "Completed(linkAccountUpdate=" + this.f161695w + ", selectedPayment=" + this.f161696x + ", shippingAddress=" + this.f161697y + ", authorizationConsentGranted=" + this.f161698z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f161695w, i13);
        dest.writeParcelable(this.f161696x, i13);
        dest.writeParcelable(this.f161697y, i13);
        Boolean bool = this.f161698z;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
    }

    public /* synthetic */ C37738n(InterfaceC37711e interfaceC37711e, AbstractC37760u0 abstractC37760u0, C38864j0 c38864j0, Boolean bool, int i13) {
        this(interfaceC37711e, (i13 & 2) != 0 ? null : abstractC37760u0, (i13 & 4) != 0 ? null : c38864j0, (i13 & 8) != 0 ? null : bool);
    }
}
