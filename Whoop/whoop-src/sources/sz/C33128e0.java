package sz;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38915o4;

/* JADX INFO: renamed from: sz.e0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33128e0 extends AbstractC33132g0 {
    public static final Parcelable.Creator<C33128e0> CREATOR = new C33133h(10);

    /* JADX INFO: renamed from: w */
    public final C38915o4 f138190w;

    public C33128e0(C38915o4 paymentMethod) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f138190w = paymentMethod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33128e0) && AbstractC22676k.m65745e(this.f138190w, ((C33128e0) obj).f138190w);
    }

    public final int hashCode() {
        return this.f138190w.hashCode();
    }

    public final String toString() {
        return "Completed(paymentMethod=" + this.f138190w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f138190w.writeToParcel(dest, i13);
    }
}
