package u10;

import a30.C0273a;
import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p486sp.C32854e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29840y;

/* JADX INFO: renamed from: u10.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C34430r implements InterfaceC34432t {
    public static final Parcelable.Creator<C34430r> CREATOR = new C32854e(15);

    /* JADX INFO: renamed from: w */
    public final C0273a f144671w;

    /* JADX INFO: renamed from: x */
    public final AbstractC29840y f144672x;

    /* JADX INFO: renamed from: y */
    public final boolean f144673y;

    public C34430r(C0273a customerState, AbstractC29840y abstractC29840y, boolean z4) {
        AbstractC22676k.m65750j(customerState, "customerState");
        this.f144671w = customerState;
        this.f144672x = abstractC29840y;
        this.f144673y = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34430r)) {
            return false;
        }
        C34430r c34430r = (C34430r) obj;
        return AbstractC22676k.m65745e(this.f144671w, c34430r.f144671w) && AbstractC22676k.m65745e(this.f144672x, c34430r.f144672x) && this.f144673y == c34430r.f144673y;
    }

    public final int hashCode() {
        int iHashCode = this.f144671w.hashCode() * 31;
        AbstractC29840y abstractC29840y = this.f144672x;
        return Boolean.hashCode(this.f144673y) + ((iHashCode + (abstractC29840y == null ? 0 : abstractC29840y.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Complete(customerState=");
        sb4.append(this.f144671w);
        sb4.append(", selection=");
        sb4.append(this.f144672x);
        sb4.append(", shouldInvokeSelectionCallback=");
        return AbstractC18489d0.m53372m(sb4, this.f144673y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f144671w, i13);
        dest.writeParcelable(this.f144672x, i13);
        dest.writeInt(this.f144673y ? 1 : 0);
    }
}
