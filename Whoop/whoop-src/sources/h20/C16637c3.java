package h20;

import android.os.Parcel;
import android.os.Parcelable;
import d40.AbstractC11672q;
import d40.C11670o;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: h20.c3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16637c3 implements Parcelable {
    public static final Parcelable.Creator<C16637c3> CREATOR = new C16654f2(14);

    /* JADX INFO: renamed from: z */
    public static final C16637c3 f63986z;

    /* JADX INFO: renamed from: w */
    public final float f63987w;

    /* JADX INFO: renamed from: x */
    public final float f63988x;

    /* JADX INFO: renamed from: y */
    public final float f63989y;

    static {
        C11670o c11670o = AbstractC11672q.f37693c;
        float f13 = c11670o.f37677a;
        f63986z = new C16637c3(f13, c11670o.f37679c, f13);
    }

    public C16637c3(float f13, float f14, float f15) {
        this.f63987w = f13;
        this.f63988x = f14;
        this.f63989y = f15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16637c3)) {
            return false;
        }
        C16637c3 c16637c3 = (C16637c3) obj;
        return Float.compare(this.f63987w, c16637c3.f63987w) == 0 && Float.compare(this.f63988x, c16637c3.f63988x) == 0 && Float.compare(this.f63989y, c16637c3.f63989y) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f63989y) + AbstractC11266d.m30447a(this.f63988x, Float.hashCode(this.f63987w) * 31, 31);
    }

    public final String toString() {
        return AbstractC30007c.m91837g(this.f63989y, ")", AbstractC2875y.m8307t("Shapes(cornerRadiusDp=", this.f63987w, ", borderStrokeWidthDp=", this.f63988x, ", bottomSheetCornerRadiusDp="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeFloat(this.f63987w);
        dest.writeFloat(this.f63988x);
        dest.writeFloat(this.f63989y);
    }

    public C16637c3(float f13) {
        this(f13, 0.0f, f13);
    }
}
