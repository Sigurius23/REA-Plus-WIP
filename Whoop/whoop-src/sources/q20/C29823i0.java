package q20;

import android.os.Parcel;
import android.os.Parcelable;
import nh3.AbstractC26725a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q20.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29823i0 extends AbstractC29825j0 {
    public static final Parcelable.Creator<C29823i0> CREATOR = new C29831p(8);

    /* JADX INFO: renamed from: w */
    public final String f121904w;

    /* JADX INFO: renamed from: x */
    public final boolean f121905x;

    public C29823i0(String id4, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        this.f121904w = id4;
        this.f121905x = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29823i0)) {
            return false;
        }
        C29823i0 c29823i0 = (C29823i0) obj;
        return AbstractC22676k.m65745e(this.f121904w, c29823i0.f121904w) && this.f121905x == c29823i0.f121905x;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121905x) + (this.f121904w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC26725a.m79503g("PaymentMethod(id=", this.f121904w, ", isLinkOrigin=", ")", this.f121905x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f121904w);
        dest.writeInt(this.f121905x ? 1 : 0);
    }
}
