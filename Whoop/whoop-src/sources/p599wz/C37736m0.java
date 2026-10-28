package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: wz.m0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37736m0 implements InterfaceC37739n0 {
    public static final Parcelable.Creator<C37736m0> CREATOR = new C37677f(18);

    /* JADX INFO: renamed from: w */
    public final AbstractC38794c0 f161690w;

    /* JADX INFO: renamed from: x */
    public final EnumC37763v0 f161691x;

    /* JADX INFO: renamed from: y */
    public final boolean f161692y;

    /* JADX INFO: renamed from: z */
    public final boolean f161693z;

    public /* synthetic */ C37736m0(AbstractC38794c0 abstractC38794c0) {
        this(abstractC38794c0, null, true, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37736m0)) {
            return false;
        }
        C37736m0 c37736m0 = (C37736m0) obj;
        return AbstractC22676k.m65745e(this.f161690w, c37736m0.f161690w) && this.f161691x == c37736m0.f161691x && this.f161692y == c37736m0.f161692y && this.f161693z == c37736m0.f161693z;
    }

    public final int hashCode() {
        AbstractC38794c0 abstractC38794c0 = this.f161690w;
        int iHashCode = (abstractC38794c0 == null ? 0 : abstractC38794c0.hashCode()) * 31;
        EnumC37763v0 enumC37763v0 = this.f161691x;
        return Boolean.hashCode(this.f161693z) + AbstractC2875y.m8289b((iHashCode + (enumC37763v0 != null ? enumC37763v0.hashCode() : 0)) * 31, 31, this.f161692y);
    }

    @Override // p599wz.InterfaceC37739n0
    /* JADX INFO: renamed from: n0 */
    public final AbstractC38794c0 mo121146n0() {
        return AbstractC37740n1.m121156e(this);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PaymentMethodSelection(selectedPayment=");
        sb4.append(this.f161690w);
        sb4.append(", paymentMethodFilter=");
        sb4.append(this.f161691x);
        sb4.append(", sharePaymentDetailsImmediatelyAfterCreation=");
        return AbstractC36095b.m114682j(sb4, this.f161692y, ", shouldShowSecondaryCta=", this.f161693z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f161690w, i13);
        EnumC37763v0 enumC37763v0 = this.f161691x;
        if (enumC37763v0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC37763v0.name());
        }
        dest.writeInt(this.f161692y ? 1 : 0);
        dest.writeInt(this.f161693z ? 1 : 0);
    }

    public C37736m0(AbstractC38794c0 abstractC38794c0, EnumC37763v0 enumC37763v0, boolean z4, boolean z13) {
        this.f161690w = abstractC38794c0;
        this.f161691x = enumC37763v0;
        this.f161692y = z4;
        this.f161693z = z13;
    }
}
