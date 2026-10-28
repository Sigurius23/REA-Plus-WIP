package h20;

import android.os.Parcel;
import android.os.Parcelable;
import d40.AbstractC11672q;
import d40.C11669n;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: h20.h1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16665h1 implements Parcelable {
    public static final Parcelable.Creator<C16665h1> CREATOR = new C16699n(7);

    /* JADX INFO: renamed from: E */
    public final C16768y2 f64081E;

    /* JADX INFO: renamed from: F */
    public final C16659g1 f64082F;

    /* JADX INFO: renamed from: G */
    public final C16678j2 f64083G;

    /* JADX INFO: renamed from: H */
    public final C16667h3 f64084H;

    /* JADX INFO: renamed from: I */
    public final C16678j2 f64085I;

    /* JADX INFO: renamed from: J */
    public final EnumC16672i2 f64086J;

    /* JADX INFO: renamed from: K */
    public final float f64087K;

    /* JADX INFO: renamed from: w */
    public final C16749v1 f64088w;

    /* JADX INFO: renamed from: x */
    public final C16749v1 f64089x;

    /* JADX INFO: renamed from: y */
    public final C16637c3 f64090y;

    /* JADX INFO: renamed from: z */
    public final C16691l3 f64091z;

    public C16665h1(C16749v1 colorsLight, C16749v1 colorsDark, C16637c3 shapes, C16691l3 typography, C16768y2 primaryButton, C16659g1 embeddedAppearance, C16678j2 formInsetValues, C16667h3 sectionSpacing, C16678j2 textFieldInsets, EnumC16672i2 iconStyle, float f13) {
        AbstractC22676k.m65750j(colorsLight, "colorsLight");
        AbstractC22676k.m65750j(colorsDark, "colorsDark");
        AbstractC22676k.m65750j(shapes, "shapes");
        AbstractC22676k.m65750j(typography, "typography");
        AbstractC22676k.m65750j(primaryButton, "primaryButton");
        AbstractC22676k.m65750j(embeddedAppearance, "embeddedAppearance");
        AbstractC22676k.m65750j(formInsetValues, "formInsetValues");
        AbstractC22676k.m65750j(sectionSpacing, "sectionSpacing");
        AbstractC22676k.m65750j(textFieldInsets, "textFieldInsets");
        AbstractC22676k.m65750j(iconStyle, "iconStyle");
        this.f64088w = colorsLight;
        this.f64089x = colorsDark;
        this.f64090y = shapes;
        this.f64091z = typography;
        this.f64081E = primaryButton;
        this.f64082F = embeddedAppearance;
        this.f64083G = formInsetValues;
        this.f64084H = sectionSpacing;
        this.f64085I = textFieldInsets;
        this.f64086J = iconStyle;
        this.f64087K = f13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16665h1)) {
            return false;
        }
        C16665h1 c16665h1 = (C16665h1) obj;
        return AbstractC22676k.m65745e(this.f64088w, c16665h1.f64088w) && AbstractC22676k.m65745e(this.f64089x, c16665h1.f64089x) && AbstractC22676k.m65745e(this.f64090y, c16665h1.f64090y) && AbstractC22676k.m65745e(this.f64091z, c16665h1.f64091z) && AbstractC22676k.m65745e(this.f64081E, c16665h1.f64081E) && AbstractC22676k.m65745e(this.f64082F, c16665h1.f64082F) && AbstractC22676k.m65745e(this.f64083G, c16665h1.f64083G) && AbstractC22676k.m65745e(this.f64084H, c16665h1.f64084H) && AbstractC22676k.m65745e(this.f64085I, c16665h1.f64085I) && this.f64086J == c16665h1.f64086J && Float.compare(this.f64087K, c16665h1.f64087K) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f64087K) + ((this.f64086J.hashCode() + ((this.f64085I.hashCode() + AbstractC11266d.m30447a(this.f64084H.f64100w, (this.f64083G.hashCode() + ((this.f64082F.hashCode() + ((this.f64081E.hashCode() + ((this.f64091z.hashCode() + ((this.f64090y.hashCode() + ((this.f64089x.hashCode() + (this.f64088w.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Appearance(colorsLight=");
        sb4.append(this.f64088w);
        sb4.append(", colorsDark=");
        sb4.append(this.f64089x);
        sb4.append(", shapes=");
        sb4.append(this.f64090y);
        sb4.append(", typography=");
        sb4.append(this.f64091z);
        sb4.append(", primaryButton=");
        sb4.append(this.f64081E);
        sb4.append(", embeddedAppearance=");
        sb4.append(this.f64082F);
        sb4.append(", formInsetValues=");
        sb4.append(this.f64083G);
        sb4.append(", sectionSpacing=");
        sb4.append(this.f64084H);
        sb4.append(", textFieldInsets=");
        sb4.append(this.f64085I);
        sb4.append(", iconStyle=");
        sb4.append(this.f64086J);
        sb4.append(", verticalModeRowPadding=");
        return AbstractC30007c.m91837g(this.f64087K, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f64088w.writeToParcel(dest, i13);
        this.f64089x.writeToParcel(dest, i13);
        this.f64090y.writeToParcel(dest, i13);
        this.f64091z.writeToParcel(dest, i13);
        this.f64081E.writeToParcel(dest, i13);
        this.f64082F.writeToParcel(dest, i13);
        this.f64083G.writeToParcel(dest, i13);
        this.f64084H.writeToParcel(dest, i13);
        this.f64085I.writeToParcel(dest, i13);
        dest.writeString(this.f64086J.name());
        dest.writeFloat(this.f64087K);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16665h1(C16749v1 colorsLight, C16749v1 colorsDark, C16637c3 shapes, C16691l3 typography, C16768y2 c16768y2) {
        AbstractC22676k.m65750j(colorsLight, "colorsLight");
        AbstractC22676k.m65750j(colorsDark, "colorsDark");
        AbstractC22676k.m65750j(shapes, "shapes");
        AbstractC22676k.m65750j(typography, "typography");
        C16659g1 embeddedAppearance = C16659g1.f64059E;
        C16678j2 c16678j2 = C16678j2.f64135E;
        AbstractC22676k.m65750j(embeddedAppearance, "embeddedAppearance");
        C16678j2 c16678j3 = C16678j2.f64136F;
        EnumC16672i2.f64118w.getClass();
        EnumC16672i2 enumC16672i2 = EnumC16672i2.f64119x;
        C11669n c11669n = AbstractC11672q.f37691a;
        this(colorsLight, colorsDark, shapes, typography, c16768y2, embeddedAppearance, c16678j2, C16667h3.f64099x, c16678j3, enumC16672i2, 0.0f);
    }
}
