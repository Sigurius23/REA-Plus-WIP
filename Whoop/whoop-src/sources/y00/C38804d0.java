package y00;

import android.os.Parcel;
import android.os.Parcelable;
import d13.AbstractC11478a;
import java.util.Iterator;
import java.util.List;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y00.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38804d0 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38804d0> CREATOR = new C38873k(13);

    /* JADX INFO: renamed from: w */
    public final List f166994w;

    public C38804d0(List list) {
        this.f166994w = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38804d0) && AbstractC22676k.m65745e(this.f166994w, ((C38804d0) obj).f166994w);
    }

    public final int hashCode() {
        return this.f166994w.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106654m("ConsumerPaymentDetails(paymentDetails=", ")", this.f166994w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Iterator itM30863o = AbstractC11478a.m30863o(this.f166994w, dest);
        while (itM30863o.hasNext()) {
            dest.writeParcelable((Parcelable) itM30863o.next(), i13);
        }
    }
}
