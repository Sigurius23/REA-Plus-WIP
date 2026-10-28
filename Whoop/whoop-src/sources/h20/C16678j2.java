package h20;

import android.os.Parcel;
import android.os.Parcelable;
import d40.AbstractC11672q;
import d40.C11662g;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.j2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16678j2 implements Parcelable {
    public static final Parcelable.Creator<C16678j2> CREATOR = new C16654f2(1);

    /* JADX INFO: renamed from: E */
    public static final C16678j2 f64135E = new C16678j2(20.0f, 0.0f, 20.0f, 40.0f);

    /* JADX INFO: renamed from: F */
    public static final C16678j2 f64136F;

    /* JADX INFO: renamed from: w */
    public final float f64137w;

    /* JADX INFO: renamed from: x */
    public final float f64138x;

    /* JADX INFO: renamed from: y */
    public final float f64139y;

    /* JADX INFO: renamed from: z */
    public final float f64140z;

    static {
        C11662g c11662g = AbstractC11672q.f37706p;
        f64136F = new C16678j2(c11662g.f37644a, c11662g.f37645b, c11662g.f37646c, c11662g.f37647d);
    }

    public C16678j2(float f13, float f14, float f15, float f16) {
        this.f64137w = f13;
        this.f64138x = f14;
        this.f64139y = f15;
        this.f64140z = f16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16678j2)) {
            return false;
        }
        C16678j2 c16678j2 = (C16678j2) obj;
        return Float.compare(this.f64137w, c16678j2.f64137w) == 0 && Float.compare(this.f64138x, c16678j2.f64138x) == 0 && Float.compare(this.f64139y, c16678j2.f64139y) == 0 && Float.compare(this.f64140z, c16678j2.f64140z) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f64140z) + AbstractC11266d.m30447a(this.f64139y, AbstractC11266d.m30447a(this.f64138x, Float.hashCode(this.f64137w) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM8307t = AbstractC2875y.m8307t("Insets(startDp=", this.f64137w, ", topDp=", this.f64138x, ", endDp=");
        sbM8307t.append(this.f64139y);
        sbM8307t.append(", bottomDp=");
        sbM8307t.append(this.f64140z);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeFloat(this.f64137w);
        dest.writeFloat(this.f64138x);
        dest.writeFloat(this.f64139y);
        dest.writeFloat(this.f64140z);
    }
}
