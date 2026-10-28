package h20;

import android.os.Parcel;
import android.os.Parcelable;
import d40.AbstractC11672q;
import d40.C11661f;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p208i2.AbstractC17918w0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.d1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16641d1 extends AbstractC16653f1 {
    public static final Parcelable.Creator<C16641d1> CREATOR = new C16699n(14);

    /* JADX INFO: renamed from: J */
    public static final C16641d1 f63991J;

    /* JADX INFO: renamed from: E */
    public final boolean f63992E;

    /* JADX INFO: renamed from: F */
    public final float f63993F;

    /* JADX INFO: renamed from: G */
    public final float f63994G;

    /* JADX INFO: renamed from: H */
    public final C16635c1 f63995H;

    /* JADX INFO: renamed from: I */
    public final C16635c1 f63996I;

    /* JADX INFO: renamed from: w */
    public final float f63997w;

    /* JADX INFO: renamed from: x */
    public final float f63998x;

    /* JADX INFO: renamed from: y */
    public final float f63999y;

    /* JADX INFO: renamed from: z */
    public final boolean f64000z;

    static {
        AbstractC11672q.f37696f.getClass();
        AbstractC11672q.f37703m.getClass();
        C11661f c11661f = AbstractC11672q.f37699i;
        C16635c1 c16635c1 = new C16635c1(AbstractC17918w0.m51506H(c11661f.f37641a), AbstractC17918w0.m51506H(c11661f.f37642b), AbstractC17918w0.m51506H(c11661f.f37643c));
        C11661f c11661f2 = AbstractC11672q.f37700j;
        f63991J = new C16641d1(1.0f, 0.0f, 0.0f, true, true, 0.0f, 0.0f, c16635c1, new C16635c1(AbstractC17918w0.m51506H(c11661f2.f37641a), AbstractC17918w0.m51506H(c11661f2.f37642b), AbstractC17918w0.m51506H(c11661f2.f37643c)));
    }

    public C16641d1(float f13, float f14, float f15, boolean z4, boolean z13, float f16, float f17, C16635c1 colorsLight, C16635c1 colorsDark) {
        AbstractC22676k.m65750j(colorsLight, "colorsLight");
        AbstractC22676k.m65750j(colorsDark, "colorsDark");
        this.f63997w = f13;
        this.f63998x = f14;
        this.f63999y = f15;
        this.f64000z = z4;
        this.f63992E = z13;
        this.f63993F = f16;
        this.f63994G = f17;
        this.f63995H = colorsLight;
        this.f63996I = colorsDark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16641d1)) {
            return false;
        }
        C16641d1 c16641d1 = (C16641d1) obj;
        return Float.compare(this.f63997w, c16641d1.f63997w) == 0 && Float.compare(this.f63998x, c16641d1.f63998x) == 0 && Float.compare(this.f63999y, c16641d1.f63999y) == 0 && this.f64000z == c16641d1.f64000z && this.f63992E == c16641d1.f63992E && Float.compare(this.f63993F, c16641d1.f63993F) == 0 && Float.compare(this.f63994G, c16641d1.f63994G) == 0 && AbstractC22676k.m65745e(this.f63995H, c16641d1.f63995H) && AbstractC22676k.m65745e(this.f63996I, c16641d1.f63996I);
    }

    public final int hashCode() {
        return this.f63996I.hashCode() + ((this.f63995H.hashCode() + AbstractC11266d.m30447a(this.f63994G, AbstractC11266d.m30447a(this.f63993F, AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.f63999y, AbstractC11266d.m30447a(this.f63998x, Float.hashCode(this.f63997w) * 31, 31), 31), 31, this.f64000z), 31, this.f63992E), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM8307t = AbstractC2875y.m8307t("FlatWithRadio(separatorThicknessDp=", this.f63997w, ", startSeparatorInsetDp=", this.f63998x, ", endSeparatorInsetDp=");
        sbM8307t.append(this.f63999y);
        sbM8307t.append(", topSeparatorEnabled=");
        sbM8307t.append(this.f64000z);
        sbM8307t.append(", bottomSeparatorEnabled=");
        sbM8307t.append(this.f63992E);
        sbM8307t.append(", additionalVerticalInsetsDp=");
        sbM8307t.append(this.f63993F);
        sbM8307t.append(", horizontalInsetsDp=");
        sbM8307t.append(this.f63994G);
        sbM8307t.append(", colorsLight=");
        sbM8307t.append(this.f63995H);
        sbM8307t.append(", colorsDark=");
        sbM8307t.append(this.f63996I);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeFloat(this.f63997w);
        dest.writeFloat(this.f63998x);
        dest.writeFloat(this.f63999y);
        dest.writeInt(this.f64000z ? 1 : 0);
        dest.writeInt(this.f63992E ? 1 : 0);
        dest.writeFloat(this.f63993F);
        dest.writeFloat(this.f63994G);
        this.f63995H.writeToParcel(dest, i13);
        this.f63996I.writeToParcel(dest, i13);
    }
}
