package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.m2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16696m2 implements InterfaceC16702n2 {
    public static final Parcelable.Creator<C16696m2> CREATOR = new C16654f2(4);

    /* JADX INFO: renamed from: w */
    public final C16732s2 f64220w;

    public C16696m2(C16732s2 c16732s2) {
        this.f64220w = c16732s2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16696m2) && AbstractC22676k.m65745e(this.f64220w, ((C16696m2) obj).f64220w);
    }

    public final int hashCode() {
        C16732s2 c16732s2 = this.f64220w;
        if (c16732s2 == null) {
            return 0;
        }
        return c16732s2.hashCode();
    }

    public final String toString() {
        return "SharedPaymentToken(sellerDetails=" + this.f64220w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C16732s2 c16732s2 = this.f64220w;
        if (c16732s2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16732s2.writeToParcel(dest, i13);
        }
    }
}
