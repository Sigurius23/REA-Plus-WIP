package y00;

import android.os.Parcel;
import android.os.Parcelable;
import d13.AbstractC11478a;
import java.util.Iterator;
import java.util.List;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: renamed from: y00.z5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39015z5 implements InterfaceC36562b {
    public static final Parcelable.Creator<C39015z5> CREATOR = new C38943r5(4);

    /* JADX INFO: renamed from: w */
    public final List f167923w;

    public C39015z5(List list) {
        this.f167923w = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39015z5) && AbstractC22676k.m65745e(this.f167923w, ((C39015z5) obj).f167923w);
    }

    public final int hashCode() {
        return this.f167923w.hashCode();
    }

    public final String toString() {
        return AbstractC33745d.m106654m("PaymentMethodsList(paymentMethods=", ")", this.f167923w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Iterator itM30863o = AbstractC11478a.m30863o(this.f167923w, dest);
        while (itM30863o.hasNext()) {
            ((C38915o4) itM30863o.next()).writeToParcel(dest, i13);
        }
    }
}
