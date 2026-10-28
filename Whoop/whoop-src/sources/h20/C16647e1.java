package h20;

import android.os.Parcel;
import android.os.Parcelable;
import d40.AbstractC11672q;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: h20.e1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16647e1 extends AbstractC16653f1 {
    public static final Parcelable.Creator<C16647e1> CREATOR = new C16699n(15);

    /* JADX INFO: renamed from: y */
    public static final C16647e1 f64003y;

    /* JADX INFO: renamed from: w */
    public final float f64004w;

    /* JADX INFO: renamed from: x */
    public final float f64005x;

    static {
        AbstractC11672q.f37704n.getClass();
        AbstractC11672q.f37703m.getClass();
        f64003y = new C16647e1(12.0f, 0.0f);
    }

    public C16647e1(float f13, float f14) {
        this.f64004w = f13;
        this.f64005x = f14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16647e1)) {
            return false;
        }
        C16647e1 c16647e1 = (C16647e1) obj;
        return Float.compare(this.f64004w, c16647e1.f64004w) == 0 && Float.compare(this.f64005x, c16647e1.f64005x) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f64005x) + (Float.hashCode(this.f64004w) * 31);
    }

    public final String toString() {
        return AbstractC31061c.m95638n("FloatingButton(spacingDp=", this.f64004w, ", additionalInsetsDp=", this.f64005x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeFloat(this.f64004w);
        dest.writeFloat(this.f64005x);
    }
}
