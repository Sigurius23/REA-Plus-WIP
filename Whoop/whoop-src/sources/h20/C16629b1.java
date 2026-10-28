package h20;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.android.R;
import d40.AbstractC11672q;
import d40.C11657b;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p208i2.AbstractC17918w0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.b1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16629b1 extends AbstractC16653f1 {
    public static final Parcelable.Creator<C16629b1> CREATOR = new C16699n(12);

    /* JADX INFO: renamed from: E */
    public final float f63965E;

    /* JADX INFO: renamed from: F */
    public final boolean f63966F;

    /* JADX INFO: renamed from: G */
    public final float f63967G;

    /* JADX INFO: renamed from: H */
    public final C16623a1 f63968H;

    /* JADX INFO: renamed from: I */
    public final C16623a1 f63969I;

    /* JADX INFO: renamed from: J */
    public final int f63970J;

    /* JADX INFO: renamed from: w */
    public final float f63971w;

    /* JADX INFO: renamed from: x */
    public final float f63972x;

    /* JADX INFO: renamed from: y */
    public final float f63973y;

    /* JADX INFO: renamed from: z */
    public final boolean f63974z;

    static {
        AbstractC11672q.f37696f.getClass();
        AbstractC11672q.f37703m.getClass();
        C11657b c11657b = AbstractC11672q.f37701k;
        C16623a1 c16623a1 = new C16623a1(AbstractC17918w0.m51506H(c11657b.f37639a), AbstractC17918w0.m51506H(c11657b.f37640b));
        C11657b c11657b2 = AbstractC11672q.f37702l;
        new C16629b1(1.0f, 0.0f, 0.0f, true, 0.0f, true, 0.0f, c16623a1, new C16623a1(AbstractC17918w0.m51506H(c11657b2.f37639a), AbstractC17918w0.m51506H(c11657b2.f37640b)), R.drawable.stripe_ic_chevron_right);
    }

    public C16629b1(float f13, float f14, float f15, boolean z4, float f16, boolean z13, float f17, C16623a1 colorsLight, C16623a1 colorsDark, int i13) {
        AbstractC22676k.m65750j(colorsLight, "colorsLight");
        AbstractC22676k.m65750j(colorsDark, "colorsDark");
        this.f63971w = f13;
        this.f63972x = f14;
        this.f63973y = f15;
        this.f63974z = z4;
        this.f63965E = f16;
        this.f63966F = z13;
        this.f63967G = f17;
        this.f63968H = colorsLight;
        this.f63969I = colorsDark;
        this.f63970J = i13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16629b1)) {
            return false;
        }
        C16629b1 c16629b1 = (C16629b1) obj;
        return Float.compare(this.f63971w, c16629b1.f63971w) == 0 && Float.compare(this.f63972x, c16629b1.f63972x) == 0 && Float.compare(this.f63973y, c16629b1.f63973y) == 0 && this.f63974z == c16629b1.f63974z && Float.compare(this.f63965E, c16629b1.f63965E) == 0 && this.f63966F == c16629b1.f63966F && Float.compare(this.f63967G, c16629b1.f63967G) == 0 && AbstractC22676k.m65745e(this.f63968H, c16629b1.f63968H) && AbstractC22676k.m65745e(this.f63969I, c16629b1.f63969I) && this.f63970J == c16629b1.f63970J;
    }

    public final int hashCode() {
        return ((this.f63969I.hashCode() + ((this.f63968H.hashCode() + AbstractC11266d.m30447a(this.f63967G, AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.f63965E, AbstractC2875y.m8289b(AbstractC11266d.m30447a(this.f63973y, AbstractC11266d.m30447a(this.f63972x, Float.hashCode(this.f63971w) * 31, 31), 31), 31, this.f63974z), 31), 31, this.f63966F), 31)) * 31)) * 31) + this.f63970J;
    }

    public final String toString() {
        StringBuilder sbM8307t = AbstractC2875y.m8307t("FlatWithDisclosure(separatorThicknessDp=", this.f63971w, ", startSeparatorInsetDp=", this.f63972x, ", endSeparatorInsetDp=");
        sbM8307t.append(this.f63973y);
        sbM8307t.append(", topSeparatorEnabled=");
        sbM8307t.append(this.f63974z);
        sbM8307t.append(", additionalVerticalInsetsDp=");
        sbM8307t.append(this.f63965E);
        sbM8307t.append(", bottomSeparatorEnabled=");
        sbM8307t.append(this.f63966F);
        sbM8307t.append(", horizontalInsetsDp=");
        sbM8307t.append(this.f63967G);
        sbM8307t.append(", colorsLight=");
        sbM8307t.append(this.f63968H);
        sbM8307t.append(", colorsDark=");
        sbM8307t.append(this.f63969I);
        sbM8307t.append(", disclosureIconRes=");
        sbM8307t.append(this.f63970J);
        sbM8307t.append(")");
        return sbM8307t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeFloat(this.f63971w);
        dest.writeFloat(this.f63972x);
        dest.writeFloat(this.f63973y);
        dest.writeInt(this.f63974z ? 1 : 0);
        dest.writeFloat(this.f63965E);
        dest.writeInt(this.f63966F ? 1 : 0);
        dest.writeFloat(this.f63967G);
        this.f63968H.writeToParcel(dest, i13);
        this.f63969I.writeToParcel(dest, i13);
        dest.writeInt(this.f63970J);
    }
}
