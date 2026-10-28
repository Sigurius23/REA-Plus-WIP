package h20;

import android.os.Parcel;
import android.os.Parcelable;
import d40.AbstractC11672q;
import d40.C11656a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p208i2.AbstractC17918w0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16772z0 extends AbstractC16653f1 {
    public static final Parcelable.Creator<C16772z0> CREATOR = new C16699n(10);

    /* JADX INFO: renamed from: E */
    public final boolean f64463E;

    /* JADX INFO: renamed from: F */
    public final float f64464F;

    /* JADX INFO: renamed from: G */
    public final float f64465G;

    /* JADX INFO: renamed from: H */
    public final float f64466H;

    /* JADX INFO: renamed from: I */
    public final C16766y0 f64467I;

    /* JADX INFO: renamed from: J */
    public final C16766y0 f64468J;

    /* JADX INFO: renamed from: w */
    public final float f64469w;

    /* JADX INFO: renamed from: x */
    public final float f64470x;

    /* JADX INFO: renamed from: y */
    public final float f64471y;

    /* JADX INFO: renamed from: z */
    public final boolean f64472z;

    static {
        AbstractC11672q.f37696f.getClass();
        AbstractC11672q.f37703m.getClass();
        C11656a c11656a = AbstractC11672q.f37697g;
        C16766y0 c16766y0 = new C16766y0(AbstractC17918w0.m51506H(c11656a.f37637a), AbstractC17918w0.m51506H(c11656a.f37638b));
        C11656a c11656a2 = AbstractC11672q.f37698h;
        new C16772z0(1.0f, 0.0f, 0.0f, true, true, 0.0f, 0.0f, 0.0f, c16766y0, new C16766y0(AbstractC17918w0.m51506H(c11656a2.f37637a), AbstractC17918w0.m51506H(c11656a2.f37638b)));
    }

    public C16772z0(float f13, float f14, float f15, boolean z4, boolean z13, float f16, float f17, float f18, C16766y0 colorsLight, C16766y0 colorsDark) {
        AbstractC22676k.m65750j(colorsLight, "colorsLight");
        AbstractC22676k.m65750j(colorsDark, "colorsDark");
        this.f64469w = f13;
        this.f64470x = f14;
        this.f64471y = f15;
        this.f64472z = z4;
        this.f64463E = z13;
        this.f64464F = f16;
        this.f64465G = f17;
        this.f64466H = f18;
        this.f64467I = colorsLight;
        this.f64468J = colorsDark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16772z0)) {
            return false;
        }
        C16772z0 c16772z0 = (C16772z0) obj;
        return Float.compare(this.f64469w, c16772z0.f64469w) == 0 && Float.compare(this.f64470x, c16772z0.f64470x) == 0 && Float.compare(this.f64471y, c16772z0.f64471y) == 0 && this.f64472z == c16772z0.f64472z && this.f64463E == c16772z0.f64463E && Float.compare(this.f64464F, c16772z0.f64464F) == 0 && Float.compare(this.f64465G, c16772z0.f64465G) == 0 && Float.compare(this.f64466H, c16772z0.f64466H) == 0 && AbstractC22676k.m65745e(this.f64467I, c16772z0.f64467I) && AbstractC22676k.m65745e(this.f64468J, c16772z0.f64468J);
    }

    public final int hashCode() {
        return this.f64468J.hashCode() + ((this.f64467I.hashCode() + AbstractC11266d.m30447a(this.f64466H, AbstractC11266d.m30447a(this.f64465G, AbstractC11266d.m30447a(this.f64464F, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.f64471y, AbstractC11266d.m30447a(this.f64470x, Float.hashCode(this.f64469w) * 31, 31), 31), 31, this.f64472z), 31, this.f64463E), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM8307t = AbstractC2875y.m8307t("FlatWithCheckmark(separatorThicknessDp=", this.f64469w, ", startSeparatorInsetDp=", this.f64470x, ", endSeparatorInsetDp=");
        sbM8307t.append(this.f64471y);
        sbM8307t.append(", topSeparatorEnabled=");
        sbM8307t.append(this.f64472z);
        sbM8307t.append(", bottomSeparatorEnabled=");
        sbM8307t.append(this.f64463E);
        sbM8307t.append(", checkmarkInsetDp=");
        sbM8307t.append(this.f64464F);
        sbM8307t.append(", additionalVerticalInsetsDp=");
        AbstractC30802r.m94772u(sbM8307t, this.f64465G, ", horizontalInsetsDp=", this.f64466H, ", colorsLight=");
        sbM8307t.append(this.f64467I);
        sbM8307t.append(", colorsDark=");
        sbM8307t.append(this.f64468J);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeFloat(this.f64469w);
        dest.writeFloat(this.f64470x);
        dest.writeFloat(this.f64471y);
        dest.writeInt(this.f64472z ? 1 : 0);
        dest.writeInt(this.f64463E ? 1 : 0);
        dest.writeFloat(this.f64464F);
        dest.writeFloat(this.f64465G);
        dest.writeFloat(this.f64466H);
        this.f64467I.writeToParcel(dest, i13);
        this.f64468J.writeToParcel(dest, i13);
    }
}
