package p661yv;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38821e7;
import yb3.AbstractC39415s;

/* JADX INFO: renamed from: yv.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39797b implements Parcelable {
    public static final Parcelable.Creator<C39797b> CREATOR = new C38821e7(20);

    /* JADX INFO: renamed from: E */
    public final float f171469E;

    /* JADX INFO: renamed from: F */
    public final float f171470F;

    /* JADX INFO: renamed from: G */
    public final int f171471G;

    /* JADX INFO: renamed from: H */
    public final int f171472H;

    /* JADX INFO: renamed from: I */
    public final int f171473I;

    /* JADX INFO: renamed from: J */
    public final float f171474J;

    /* JADX INFO: renamed from: K */
    public final float f171475K;

    /* JADX INFO: renamed from: L */
    public final float f171476L;

    /* JADX INFO: renamed from: M */
    public final float f171477M;

    /* JADX INFO: renamed from: N */
    public final float f171478N;

    /* JADX INFO: renamed from: O */
    public final boolean f171479O;

    /* JADX INFO: renamed from: P */
    public final long f171480P;

    /* JADX INFO: renamed from: Q */
    public final boolean f171481Q;

    /* JADX INFO: renamed from: R */
    public final float f171482R;

    /* JADX INFO: renamed from: S */
    public final boolean f171483S;

    /* JADX INFO: renamed from: w */
    public final boolean f171484w;

    /* JADX INFO: renamed from: x */
    public final int f171485x;

    /* JADX INFO: renamed from: y */
    public final float f171486y;

    /* JADX INFO: renamed from: z */
    public final float f171487z;

    public C39797b(boolean z4, int i13, float f13, float f14, float f15, float f16, int i14, int i15, int i16, float f17, float f18, float f19, float f24, float f25, boolean z13, long j7, boolean z14, float f26, boolean z15) {
        this.f171484w = z4;
        this.f171485x = i13;
        this.f171486y = f13;
        this.f171487z = f14;
        this.f171469E = f15;
        this.f171470F = f16;
        this.f171471G = i14;
        this.f171472H = i15;
        this.f171473I = i16;
        this.f171474J = f17;
        this.f171475K = f18;
        this.f171476L = f19;
        this.f171477M = f24;
        this.f171478N = f25;
        this.f171479O = z13;
        this.f171480P = j7;
        this.f171481Q = z14;
        this.f171482R = f26;
        this.f171483S = z15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C39797b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type com.mapbox.maps.plugin.scalebar.generated.ScaleBarSettings");
        C39797b c39797b = (C39797b) obj;
        return this.f171484w == c39797b.f171484w && this.f171485x == c39797b.f171485x && Float.compare(this.f171486y, c39797b.f171486y) == 0 && Float.compare(this.f171487z, c39797b.f171487z) == 0 && Float.compare(this.f171469E, c39797b.f171469E) == 0 && Float.compare(this.f171470F, c39797b.f171470F) == 0 && this.f171471G == c39797b.f171471G && this.f171472H == c39797b.f171472H && this.f171473I == c39797b.f171473I && Float.compare(this.f171474J, c39797b.f171474J) == 0 && Float.compare(this.f171475K, c39797b.f171475K) == 0 && Float.compare(this.f171476L, c39797b.f171476L) == 0 && Float.compare(this.f171477M, c39797b.f171477M) == 0 && Float.compare(this.f171478N, c39797b.f171478N) == 0 && this.f171479O == c39797b.f171479O && this.f171480P == c39797b.f171480P && this.f171481Q == c39797b.f171481Q && Float.compare(this.f171482R, c39797b.f171482R) == 0 && this.f171483S == c39797b.f171483S;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f171484w), Integer.valueOf(this.f171485x), Float.valueOf(this.f171486y), Float.valueOf(this.f171487z), Float.valueOf(this.f171469E), Float.valueOf(this.f171470F), Integer.valueOf(this.f171471G), Integer.valueOf(this.f171472H), Integer.valueOf(this.f171473I), Float.valueOf(this.f171474J), Float.valueOf(this.f171475K), Float.valueOf(this.f171476L), Float.valueOf(this.f171477M), Float.valueOf(this.f171478N), Boolean.valueOf(this.f171479O), Long.valueOf(this.f171480P), Boolean.valueOf(this.f171481Q), Float.valueOf(this.f171482R), Boolean.valueOf(this.f171483S));
    }

    public final String toString() {
        return AbstractC39415s.m125909s("ScaleBarSettings(enabled=" + this.f171484w + ", position=" + this.f171485x + ",\n      marginLeft=" + this.f171486y + ", marginTop=" + this.f171487z + ", marginRight=" + this.f171469E + ",\n      marginBottom=" + this.f171470F + ", textColor=" + this.f171471G + ", primaryColor=" + this.f171472H + ",\n      secondaryColor=" + this.f171473I + ", borderWidth=" + this.f171474J + ", height=" + this.f171475K + ",\n      textBarMargin=" + this.f171476L + ", textBorderWidth=" + this.f171477M + ", textSize=" + this.f171478N + ",\n      isMetricUnits=" + this.f171479O + ", refreshInterval=" + this.f171480P + ",\n      showTextBorder=" + this.f171481Q + ", ratio=" + this.f171482R + ",\n      useContinuousRendering=" + this.f171483S + ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i13) {
        AbstractC22676k.m65750j(out, "out");
        out.writeInt(this.f171484w ? 1 : 0);
        out.writeInt(this.f171485x);
        out.writeFloat(this.f171486y);
        out.writeFloat(this.f171487z);
        out.writeFloat(this.f171469E);
        out.writeFloat(this.f171470F);
        out.writeInt(this.f171471G);
        out.writeInt(this.f171472H);
        out.writeInt(this.f171473I);
        out.writeFloat(this.f171474J);
        out.writeFloat(this.f171475K);
        out.writeFloat(this.f171476L);
        out.writeFloat(this.f171477M);
        out.writeFloat(this.f171478N);
        out.writeInt(this.f171479O ? 1 : 0);
        out.writeLong(this.f171480P);
        out.writeInt(this.f171481Q ? 1 : 0);
        out.writeFloat(this.f171482R);
        out.writeInt(this.f171483S ? 1 : 0);
    }
}
