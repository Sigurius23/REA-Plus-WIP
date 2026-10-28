package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: wz.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37730k0 implements InterfaceC37739n0 {
    public static final Parcelable.Creator<C37730k0> CREATOR = new C37677f(16);

    /* JADX INFO: renamed from: w */
    public final AbstractC37760u0 f161676w;

    public C37730k0(AbstractC37760u0 selectedPayment) {
        AbstractC22676k.m65750j(selectedPayment, "selectedPayment");
        this.f161676w = selectedPayment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37730k0) && AbstractC22676k.m65745e(this.f161676w, ((C37730k0) obj).f161676w);
    }

    public final int hashCode() {
        return this.f161676w.hashCode();
    }

    @Override // p599wz.InterfaceC37739n0
    /* JADX INFO: renamed from: n0 */
    public final AbstractC38794c0 mo121146n0() {
        return AbstractC37740n1.m121156e(this);
    }

    public final String toString() {
        return "Confirmation(selectedPayment=" + this.f161676w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f161676w, i13);
    }
}
