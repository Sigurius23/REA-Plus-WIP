package tv;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p127ev.AbstractC13664e;
import p127ev.EnumC13677r;
import p486sp.C32854e;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: tv.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C34200c implements Parcelable {
    public static final Parcelable.Creator<C34200c> CREATOR = new C32854e(12);

    /* JADX INFO: renamed from: E */
    public final boolean f143463E;

    /* JADX INFO: renamed from: F */
    public final int f143464F;

    /* JADX INFO: renamed from: G */
    public final int f143465G;

    /* JADX INFO: renamed from: H */
    public final String f143466H;

    /* JADX INFO: renamed from: I */
    public final String f143467I;

    /* JADX INFO: renamed from: J */
    public final boolean f143468J;

    /* JADX INFO: renamed from: K */
    public final EnumC13677r f143469K;

    /* JADX INFO: renamed from: L */
    public final String f143470L;

    /* JADX INFO: renamed from: M */
    public final AbstractC13664e f143471M;

    /* JADX INFO: renamed from: w */
    public final boolean f143472w;

    /* JADX INFO: renamed from: x */
    public final boolean f143473x;

    /* JADX INFO: renamed from: y */
    public final int f143474y;

    /* JADX INFO: renamed from: z */
    public final float f143475z;

    public C34200c(boolean z4, boolean z13, int i13, float f13, boolean z14, int i14, int i15, String str, String str2, boolean z15, EnumC13677r enumC13677r, String str3, AbstractC13664e abstractC13664e) {
        this.f143472w = z4;
        this.f143473x = z13;
        this.f143474y = i13;
        this.f143475z = f13;
        this.f143463E = z14;
        this.f143464F = i14;
        this.f143465G = i15;
        this.f143466H = str;
        this.f143467I = str2;
        this.f143468J = z15;
        this.f143469K = enumC13677r;
        this.f143470L = str3;
        this.f143471M = abstractC13664e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C34200c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.locationcomponent.generated.LocationComponentSettings");
        C34200c c34200c = (C34200c) obj;
        return this.f143472w == c34200c.f143472w && this.f143473x == c34200c.f143473x && this.f143474y == c34200c.f143474y && Float.compare(this.f143475z, c34200c.f143475z) == 0 && this.f143463E == c34200c.f143463E && this.f143464F == c34200c.f143464F && this.f143465G == c34200c.f143465G && AbstractC22676k.m65745e(this.f143466H, c34200c.f143466H) && AbstractC22676k.m65745e(this.f143467I, c34200c.f143467I) && this.f143468J == c34200c.f143468J && this.f143469K == c34200c.f143469K && AbstractC22676k.m65745e(this.f143470L, c34200c.f143470L) && AbstractC22676k.m65745e(this.f143471M, c34200c.f143471M);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f143472w), Boolean.valueOf(this.f143473x), Integer.valueOf(this.f143474y), Float.valueOf(this.f143475z), Boolean.valueOf(this.f143463E), Integer.valueOf(this.f143464F), Integer.valueOf(this.f143465G), this.f143466H, this.f143467I, Boolean.valueOf(this.f143468J), this.f143469K, this.f143470L, this.f143471M);
    }

    public final String toString() {
        return AbstractC39415s.m125909s("LocationComponentSettings(enabled=" + this.f143472w + ",\n      pulsingEnabled=" + this.f143473x + ", pulsingColor=" + this.f143474y + ",\n      pulsingMaxRadius=" + this.f143475z + ", showAccuracyRing=" + this.f143463E + ",\n      accuracyRingColor=" + this.f143464F + ", accuracyRingBorderColor=" + this.f143465G + ",\n      layerAbove=" + this.f143466H + ", layerBelow=" + this.f143467I + ", puckBearingEnabled=" + this.f143468J + ",\n      puckBearing=" + this.f143469K + ", slot=" + this.f143470L + ", locationPuck=" + this.f143471M + ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        AbstractC22676k.m65750j(out, "out");
        out.writeInt(this.f143472w ? 1 : 0);
        out.writeInt(this.f143473x ? 1 : 0);
        out.writeInt(this.f143474y);
        out.writeFloat(this.f143475z);
        out.writeInt(this.f143463E ? 1 : 0);
        out.writeInt(this.f143464F);
        out.writeInt(this.f143465G);
        out.writeString(this.f143466H);
        out.writeString(this.f143467I);
        out.writeInt(this.f143468J ? 1 : 0);
        out.writeString(this.f143469K.name());
        out.writeString(this.f143470L);
        out.writeParcelable(this.f143471M, i13);
    }
}
