package lv;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.maps.ImageHolder;
import java.util.Objects;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: lv.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C24757b implements Parcelable {
    public static final Parcelable.Creator<C24757b> CREATOR = new C22060h(24);

    /* JADX INFO: renamed from: E */
    public final float f96809E;

    /* JADX INFO: renamed from: F */
    public final float f96810F;

    /* JADX INFO: renamed from: G */
    public final float f96811G;

    /* JADX INFO: renamed from: H */
    public final float f96812H;

    /* JADX INFO: renamed from: I */
    public final boolean f96813I;

    /* JADX INFO: renamed from: J */
    public final boolean f96814J;

    /* JADX INFO: renamed from: K */
    public final boolean f96815K;

    /* JADX INFO: renamed from: L */
    public final ImageHolder f96816L;

    /* JADX INFO: renamed from: w */
    public final boolean f96817w;

    /* JADX INFO: renamed from: x */
    public final int f96818x;

    /* JADX INFO: renamed from: y */
    public final float f96819y;

    /* JADX INFO: renamed from: z */
    public final float f96820z;

    public C24757b(boolean z4, int i13, float f13, float f14, float f15, float f16, float f17, float f18, boolean z13, boolean z14, boolean z15, ImageHolder imageHolder) {
        this.f96817w = z4;
        this.f96818x = i13;
        this.f96819y = f13;
        this.f96820z = f14;
        this.f96809E = f15;
        this.f96810F = f16;
        this.f96811G = f17;
        this.f96812H = f18;
        this.f96813I = z13;
        this.f96814J = z14;
        this.f96815K = z15;
        this.f96816L = imageHolder;
    }

    /* JADX INFO: renamed from: b */
    public final C24756a m72492b() {
        C24756a c24756a = new C24756a();
        c24756a.f96797a = this.f96817w;
        c24756a.f96798b = this.f96818x;
        c24756a.f96799c = this.f96819y;
        c24756a.f96800d = this.f96820z;
        c24756a.f96801e = this.f96809E;
        c24756a.f96802f = this.f96810F;
        c24756a.f96803g = this.f96811G;
        c24756a.f96804h = this.f96812H;
        c24756a.f96805i = this.f96813I;
        c24756a.f96806j = this.f96814J;
        c24756a.f96807k = this.f96815K;
        c24756a.f96808l = this.f96816L;
        return c24756a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C24757b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.compass.generated.CompassSettings");
        C24757b c24757b = (C24757b) obj;
        return this.f96817w == c24757b.f96817w && this.f96818x == c24757b.f96818x && Float.compare(this.f96819y, c24757b.f96819y) == 0 && Float.compare(this.f96820z, c24757b.f96820z) == 0 && Float.compare(this.f96809E, c24757b.f96809E) == 0 && Float.compare(this.f96810F, c24757b.f96810F) == 0 && Float.compare(this.f96811G, c24757b.f96811G) == 0 && Float.compare(this.f96812H, c24757b.f96812H) == 0 && this.f96813I == c24757b.f96813I && this.f96814J == c24757b.f96814J && this.f96815K == c24757b.f96815K && AbstractC22676k.m65745e(this.f96816L, c24757b.f96816L);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f96817w), Integer.valueOf(this.f96818x), Float.valueOf(this.f96819y), Float.valueOf(this.f96820z), Float.valueOf(this.f96809E), Float.valueOf(this.f96810F), Float.valueOf(this.f96811G), Float.valueOf(this.f96812H), Boolean.valueOf(this.f96813I), Boolean.valueOf(this.f96814J), Boolean.valueOf(this.f96815K), this.f96816L);
    }

    public final String toString() {
        return AbstractC39415s.m125909s("CompassSettings(enabled=" + this.f96817w + ", position=" + this.f96818x + ",\n      marginLeft=" + this.f96819y + ", marginTop=" + this.f96820z + ", marginRight=" + this.f96809E + ",\n      marginBottom=" + this.f96810F + ", opacity=" + this.f96811G + ", rotation=" + this.f96812H + ", visibility=" + this.f96813I + ",\n      fadeWhenFacingNorth=" + this.f96814J + ", clickable=" + this.f96815K + ", image=" + this.f96816L + ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        AbstractC22676k.m65750j(out, "out");
        out.writeInt(this.f96817w ? 1 : 0);
        out.writeInt(this.f96818x);
        out.writeFloat(this.f96819y);
        out.writeFloat(this.f96820z);
        out.writeFloat(this.f96809E);
        out.writeFloat(this.f96810F);
        out.writeFloat(this.f96811G);
        out.writeFloat(this.f96812H);
        out.writeInt(this.f96813I ? 1 : 0);
        out.writeInt(this.f96814J ? 1 : 0);
        out.writeInt(this.f96815K ? 1 : 0);
        ImageHolder imageHolder = this.f96816L;
        if (imageHolder == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageHolder.writeToParcel(out, i13);
        }
    }
}
