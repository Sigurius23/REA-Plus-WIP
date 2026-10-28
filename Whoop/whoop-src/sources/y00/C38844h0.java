package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38844h0 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38844h0> CREATOR = new C38873k(17);

    /* JADX INFO: renamed from: w */
    public final C38915o4 f167216w;

    public C38844h0(C38915o4 paymentMethod) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f167216w = paymentMethod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38844h0) && AbstractC22676k.m65745e(this.f167216w, ((C38844h0) obj).f167216w);
    }

    public final int hashCode() {
        return this.f167216w.hashCode();
    }

    public final String toString() {
        return "ConsumerPaymentDetailsShare(paymentMethod=" + this.f167216w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f167216w.writeToParcel(dest, i13);
    }
}
