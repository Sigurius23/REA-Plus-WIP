package p562vv;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35467g0;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: vv.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C36527b implements Parcelable {
    public static final Parcelable.Creator<C36527b> CREATOR = new C35467g0(6);

    /* JADX INFO: renamed from: E */
    public final float f156313E;

    /* JADX INFO: renamed from: F */
    public final float f156314F;

    /* JADX INFO: renamed from: w */
    public final boolean f156315w;

    /* JADX INFO: renamed from: x */
    public final int f156316x;

    /* JADX INFO: renamed from: y */
    public final float f156317y;

    /* JADX INFO: renamed from: z */
    public final float f156318z;

    public C36527b(float f13, float f14, float f15, float f16, int i13, boolean z4) {
        this.f156315w = z4;
        this.f156316x = i13;
        this.f156317y = f13;
        this.f156318z = f14;
        this.f156313E = f15;
        this.f156314F = f16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C36527b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.logo.generated.LogoSettings");
        C36527b c36527b = (C36527b) obj;
        return this.f156315w == c36527b.f156315w && this.f156316x == c36527b.f156316x && Float.compare(this.f156317y, c36527b.f156317y) == 0 && Float.compare(this.f156318z, c36527b.f156318z) == 0 && Float.compare(this.f156313E, c36527b.f156313E) == 0 && Float.compare(this.f156314F, c36527b.f156314F) == 0;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f156315w), Integer.valueOf(this.f156316x), Float.valueOf(this.f156317y), Float.valueOf(this.f156318z), Float.valueOf(this.f156313E), Float.valueOf(this.f156314F));
    }

    public final String toString() {
        return AbstractC39415s.m125909s("LogoSettings(enabled=" + this.f156315w + ", position=" + this.f156316x + ",\n      marginLeft=" + this.f156317y + ", marginTop=" + this.f156318z + ", marginRight=" + this.f156313E + ",\n      marginBottom=" + this.f156314F + ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        AbstractC22676k.m65750j(out, "out");
        out.writeInt(this.f156315w ? 1 : 0);
        out.writeInt(this.f156316x);
        out.writeFloat(this.f156317y);
        out.writeFloat(this.f156318z);
        out.writeFloat(this.f156313E);
        out.writeFloat(this.f156314F);
    }
}
