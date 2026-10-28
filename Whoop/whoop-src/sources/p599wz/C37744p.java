package p599wz;

import android.os.Parcel;
import android.os.Parcelable;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38915o4;

/* JADX INFO: renamed from: wz.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C37744p extends AbstractC37747q {
    public static final Parcelable.Creator<C37744p> CREATOR = new C37677f(6);

    /* JADX INFO: renamed from: w */
    public final C38915o4 f161707w;

    public C37744p(C38915o4 paymentMethod) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f161707w = paymentMethod;
    }

    @Override // p599wz.AbstractC37747q
    /* JADX INFO: renamed from: b */
    public final InterfaceC37711e mo121151b() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37744p) && AbstractC22676k.m65745e(this.f161707w, ((C37744p) obj).f161707w);
    }

    public final int hashCode() {
        return this.f161707w.hashCode();
    }

    public final String toString() {
        return "PaymentMethodObtained(paymentMethod=" + this.f161707w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f161707w, i13);
    }
}
