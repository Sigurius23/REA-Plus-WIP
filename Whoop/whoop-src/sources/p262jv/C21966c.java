package p262jv;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import java.util.Objects;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: jv.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C21966c implements Parcelable {
    public static final Parcelable.Creator<C21966c> CREATOR = new C16054r0(22);

    /* JADX INFO: renamed from: E */
    public final float f85018E;

    /* JADX INFO: renamed from: F */
    public final float f85019F;

    /* JADX INFO: renamed from: G */
    public final float f85020G;

    /* JADX INFO: renamed from: H */
    public final boolean f85021H;

    /* JADX INFO: renamed from: w */
    public final boolean f85022w;

    /* JADX INFO: renamed from: x */
    public final int f85023x;

    /* JADX INFO: renamed from: y */
    public final int f85024y;

    /* JADX INFO: renamed from: z */
    public final float f85025z;

    public C21966c(boolean z4, int i13, int i14, float f13, float f14, float f15, float f16, boolean z13) {
        this.f85022w = z4;
        this.f85023x = i13;
        this.f85024y = i14;
        this.f85025z = f13;
        this.f85018E = f14;
        this.f85019F = f15;
        this.f85020G = f16;
        this.f85021H = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C21966c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.attribution.generated.AttributionSettings");
        C21966c c21966c = (C21966c) obj;
        return this.f85022w == c21966c.f85022w && this.f85023x == c21966c.f85023x && this.f85024y == c21966c.f85024y && Float.compare(this.f85025z, c21966c.f85025z) == 0 && Float.compare(this.f85018E, c21966c.f85018E) == 0 && Float.compare(this.f85019F, c21966c.f85019F) == 0 && Float.compare(this.f85020G, c21966c.f85020G) == 0 && this.f85021H == c21966c.f85021H;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f85022w), Integer.valueOf(this.f85023x), Integer.valueOf(this.f85024y), Float.valueOf(this.f85025z), Float.valueOf(this.f85018E), Float.valueOf(this.f85019F), Float.valueOf(this.f85020G), Boolean.valueOf(this.f85021H));
    }

    public final String toString() {
        return AbstractC39415s.m125909s("AttributionSettings(enabled=" + this.f85022w + ", iconColor=" + this.f85023x + ",\n      position=" + this.f85024y + ", marginLeft=" + this.f85025z + ", marginTop=" + this.f85018E + ", marginRight=" + this.f85019F + ",\n      marginBottom=" + this.f85020G + ", clickable=" + this.f85021H + ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        AbstractC22676k.m65750j(out, "out");
        out.writeInt(this.f85022w ? 1 : 0);
        out.writeInt(this.f85023x);
        out.writeInt(this.f85024y);
        out.writeFloat(this.f85025z);
        out.writeFloat(this.f85018E);
        out.writeFloat(this.f85019F);
        out.writeFloat(this.f85020G);
        out.writeInt(this.f85021H ? 1 : 0);
    }
}
