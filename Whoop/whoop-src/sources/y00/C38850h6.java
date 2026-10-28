package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p031b9.AbstractC2875y;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.h6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38850h6 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38850h6> CREATOR = new C38943r5(9);

    /* JADX INFO: renamed from: w */
    public final String f167227w;

    /* JADX INFO: renamed from: x */
    public final String f167228x;

    public C38850h6(String paymentMethodId, String encodedPaymentMethod) {
        AbstractC22676k.m65750j(paymentMethodId, "paymentMethodId");
        AbstractC22676k.m65750j(encodedPaymentMethod, "encodedPaymentMethod");
        this.f167227w = paymentMethodId;
        this.f167228x = encodedPaymentMethod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38850h6)) {
            return false;
        }
        C38850h6 c38850h6 = (C38850h6) obj;
        return AbstractC22676k.m65745e(this.f167227w, c38850h6.f167227w) && AbstractC22676k.m65745e(this.f167228x, c38850h6.f167228x);
    }

    public final int hashCode() {
        return this.f167228x.hashCode() + (this.f167227w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("SharePaymentDetails(paymentMethodId=", this.f167227w, ", encodedPaymentMethod=", this.f167228x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167227w);
        dest.writeString(this.f167228x);
    }
}
