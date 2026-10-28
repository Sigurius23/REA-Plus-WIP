package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.m2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38895m2 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38895m2> CREATOR = new C38992x0(27);

    /* JADX INFO: renamed from: w */
    public final String f167440w;

    public C38895m2(String paymentMethod) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f167440w = paymentMethod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38895m2) && AbstractC22676k.m65745e(this.f167440w, ((C38895m2) obj).f167440w);
    }

    public final int hashCode() {
        return this.f167440w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("IncentiveParams(paymentMethod=", this.f167440w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167440w);
    }
}
