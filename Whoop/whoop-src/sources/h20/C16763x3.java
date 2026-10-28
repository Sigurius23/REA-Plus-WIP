package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.x3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16763x3 implements Parcelable {
    public static final Parcelable.Creator<C16763x3> CREATOR = new C16654f2(25);

    /* JADX INFO: renamed from: w */
    public final AbstractC16632b4 f64431w;

    public C16763x3(AbstractC16632b4 paymentSheetResult) {
        AbstractC22676k.m65750j(paymentSheetResult, "paymentSheetResult");
        this.f64431w = paymentSheetResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16763x3) && AbstractC22676k.m65745e(this.f64431w, ((C16763x3) obj).f64431w);
    }

    public final int hashCode() {
        return this.f64431w.hashCode();
    }

    public final String toString() {
        return "Result(paymentSheetResult=" + this.f64431w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f64431w, i13);
    }
}
