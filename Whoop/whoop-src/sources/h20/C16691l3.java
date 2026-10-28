package h20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import d40.AbstractC11672q;
import d40.C11674s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.l3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16691l3 implements Parcelable {
    public static final Parcelable.Creator<C16691l3> CREATOR = new C16654f2(19);

    /* JADX INFO: renamed from: z */
    public static final C16691l3 f64194z;

    /* JADX INFO: renamed from: w */
    public final float f64195w;

    /* JADX INFO: renamed from: x */
    public final Integer f64196x;

    /* JADX INFO: renamed from: y */
    public final C16679j3 f64197y;

    static {
        C11674s c11674s = AbstractC11672q.f37694d;
        f64194z = new C16691l3(c11674s.f37722d, c11674s.f37729k, new C16679j3(null));
    }

    public C16691l3(float f13, Integer num, C16679j3 custom) {
        AbstractC22676k.m65750j(custom, "custom");
        this.f64195w = f13;
        this.f64196x = num;
        this.f64197y = custom;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16691l3)) {
            return false;
        }
        C16691l3 c16691l3 = (C16691l3) obj;
        return Float.compare(this.f64195w, c16691l3.f64195w) == 0 && AbstractC22676k.m65745e(this.f64196x, c16691l3.f64196x) && AbstractC22676k.m65745e(this.f64197y, c16691l3.f64197y);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f64195w) * 31;
        Integer num = this.f64196x;
        return this.f64197y.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "Typography(sizeScaleFactor=" + this.f64195w + ", fontResId=" + this.f64196x + ", custom=" + this.f64197y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeFloat(this.f64195w);
        Integer num = this.f64196x;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        this.f64197y.writeToParcel(dest, i13);
    }

    public C16691l3(Integer num) {
        this(1.0f, num, new C16679j3(null));
    }
}
