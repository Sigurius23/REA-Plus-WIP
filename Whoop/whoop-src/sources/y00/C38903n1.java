package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.n1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38903n1 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38903n1> CREATOR = new C38992x0(6);

    /* JADX INFO: renamed from: w */
    public final InterfaceC38875k1 f167472w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC38845h1 f167473x;

    public C38903n1(InterfaceC38875k1 mobilePaymentElement, InterfaceC38845h1 customerSheet) {
        AbstractC22676k.m65750j(mobilePaymentElement, "mobilePaymentElement");
        AbstractC22676k.m65750j(customerSheet, "customerSheet");
        this.f167472w = mobilePaymentElement;
        this.f167473x = customerSheet;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38903n1)) {
            return false;
        }
        C38903n1 c38903n1 = (C38903n1) obj;
        return AbstractC22676k.m65745e(this.f167472w, c38903n1.f167472w) && AbstractC22676k.m65745e(this.f167473x, c38903n1.f167473x);
    }

    public final int hashCode() {
        return this.f167473x.hashCode() + (this.f167472w.hashCode() * 31);
    }

    public final String toString() {
        return "Components(mobilePaymentElement=" + this.f167472w + ", customerSheet=" + this.f167473x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f167472w, i13);
        dest.writeParcelable(this.f167473x, i13);
    }
}
