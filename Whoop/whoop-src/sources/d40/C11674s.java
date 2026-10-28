package d40;

import p000.AbstractC11266d;
import p294l3.C23285v0;
import p392p3.AbstractC28771i;
import p636y3.C39183o;
import p636y3.C39184p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d40.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C11674s {

    /* JADX INFO: renamed from: a */
    public final int f37719a;

    /* JADX INFO: renamed from: b */
    public final int f37720b;

    /* JADX INFO: renamed from: c */
    public final int f37721c;

    /* JADX INFO: renamed from: d */
    public final float f37722d;

    /* JADX INFO: renamed from: e */
    public final long f37723e;

    /* JADX INFO: renamed from: f */
    public final long f37724f;

    /* JADX INFO: renamed from: g */
    public final long f37725g;

    /* JADX INFO: renamed from: h */
    public final long f37726h;

    /* JADX INFO: renamed from: i */
    public final long f37727i;

    /* JADX INFO: renamed from: j */
    public final long f37728j;

    /* JADX INFO: renamed from: k */
    public final Integer f37729k;

    /* JADX INFO: renamed from: l */
    public final C23285v0 f37730l;

    /* JADX INFO: renamed from: m */
    public final AbstractC28771i f37731m;

    /* JADX INFO: renamed from: n */
    public final AbstractC28771i f37732n;

    /* JADX INFO: renamed from: o */
    public final AbstractC28771i f37733o;

    /* JADX INFO: renamed from: p */
    public final AbstractC28771i f37734p;

    /* JADX INFO: renamed from: q */
    public final AbstractC28771i f37735q;

    /* JADX INFO: renamed from: r */
    public final AbstractC28771i f37736r;

    public C11674s(int i13, int i14, int i15, float f13, long j7, long j13, long j14, long j15, long j16, long j17, Integer num, C23285v0 c23285v0, AbstractC28771i abstractC28771i, AbstractC28771i abstractC28771i2, AbstractC28771i abstractC28771i3, AbstractC28771i abstractC28771i4, AbstractC28771i abstractC28771i5, AbstractC28771i abstractC28771i6) {
        this.f37719a = i13;
        this.f37720b = i14;
        this.f37721c = i15;
        this.f37722d = f13;
        this.f37723e = j7;
        this.f37724f = j13;
        this.f37725g = j14;
        this.f37726h = j15;
        this.f37727i = j16;
        this.f37728j = j17;
        this.f37729k = num;
        this.f37730l = c23285v0;
        this.f37731m = abstractC28771i;
        this.f37732n = abstractC28771i2;
        this.f37733o = abstractC28771i3;
        this.f37734p = abstractC28771i4;
        this.f37735q = abstractC28771i5;
        this.f37736r = abstractC28771i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11674s)) {
            return false;
        }
        C11674s c11674s = (C11674s) obj;
        return this.f37719a == c11674s.f37719a && this.f37720b == c11674s.f37720b && this.f37721c == c11674s.f37721c && Float.compare(this.f37722d, c11674s.f37722d) == 0 && C39183o.m124803a(this.f37723e, c11674s.f37723e) && C39183o.m124803a(this.f37724f, c11674s.f37724f) && C39183o.m124803a(this.f37725g, c11674s.f37725g) && C39183o.m124803a(this.f37726h, c11674s.f37726h) && C39183o.m124803a(this.f37727i, c11674s.f37727i) && C39183o.m124803a(this.f37728j, c11674s.f37728j) && AbstractC22676k.m65745e(this.f37729k, c11674s.f37729k) && AbstractC22676k.m65745e(this.f37730l, c11674s.f37730l) && AbstractC22676k.m65745e(this.f37731m, c11674s.f37731m) && AbstractC22676k.m65745e(this.f37732n, c11674s.f37732n) && AbstractC22676k.m65745e(this.f37733o, c11674s.f37733o) && AbstractC22676k.m65745e(this.f37734p, c11674s.f37734p) && AbstractC22676k.m65745e(this.f37735q, c11674s.f37735q) && AbstractC22676k.m65745e(this.f37736r, c11674s.f37736r);
    }

    public final int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.f37722d, AbstractC11266d.m30448b(this.f37721c, AbstractC11266d.m30448b(this.f37720b, Integer.hashCode(this.f37719a) * 31, 31), 31), 31);
        C39184p[] c39184pArr = C39183o.f168427b;
        int iM30451e = AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(iM30447a, this.f37723e, 31), this.f37724f, 31), this.f37725g, 31), this.f37726h, 31), this.f37727i, 31), this.f37728j, 31);
        Integer num = this.f37729k;
        int iHashCode = (iM30451e + (num == null ? 0 : num.hashCode())) * 31;
        C23285v0 c23285v0 = this.f37730l;
        int iHashCode2 = (iHashCode + (c23285v0 == null ? 0 : c23285v0.hashCode())) * 31;
        AbstractC28771i abstractC28771i = this.f37731m;
        int iHashCode3 = (iHashCode2 + (abstractC28771i == null ? 0 : abstractC28771i.hashCode())) * 31;
        AbstractC28771i abstractC28771i2 = this.f37732n;
        int iHashCode4 = (iHashCode3 + (abstractC28771i2 == null ? 0 : abstractC28771i2.hashCode())) * 31;
        AbstractC28771i abstractC28771i3 = this.f37733o;
        int iHashCode5 = (iHashCode4 + (abstractC28771i3 == null ? 0 : abstractC28771i3.hashCode())) * 31;
        AbstractC28771i abstractC28771i4 = this.f37734p;
        int iHashCode6 = (iHashCode5 + (abstractC28771i4 == null ? 0 : abstractC28771i4.hashCode())) * 31;
        AbstractC28771i abstractC28771i5 = this.f37735q;
        int iHashCode7 = (iHashCode6 + (abstractC28771i5 == null ? 0 : abstractC28771i5.hashCode())) * 31;
        AbstractC28771i abstractC28771i6 = this.f37736r;
        return iHashCode7 + (abstractC28771i6 != null ? abstractC28771i6.hashCode() : 0);
    }

    public final String toString() {
        String strM124807e = C39183o.m124807e(this.f37723e);
        String strM124807e2 = C39183o.m124807e(this.f37724f);
        String strM124807e3 = C39183o.m124807e(this.f37725g);
        String strM124807e4 = C39183o.m124807e(this.f37726h);
        String strM124807e5 = C39183o.m124807e(this.f37727i);
        String strM124807e6 = C39183o.m124807e(this.f37728j);
        StringBuilder sbM30465s = AbstractC11266d.m30465s(this.f37719a, this.f37720b, "StripeTypography(fontWeightNormal=", ", fontWeightMedium=", ", fontWeightBold=");
        sbM30465s.append(this.f37721c);
        sbM30465s.append(", fontSizeMultiplier=");
        sbM30465s.append(this.f37722d);
        sbM30465s.append(", xxSmallFontSize=");
        AbstractC11266d.m30444B(sbM30465s, strM124807e, ", xSmallFontSize=", strM124807e2, ", smallFontSize=");
        AbstractC11266d.m30444B(sbM30465s, strM124807e3, ", mediumFontSize=", strM124807e4, ", largeFontSize=");
        AbstractC11266d.m30444B(sbM30465s, strM124807e5, ", xLargeFontSize=", strM124807e6, ", fontFamily=");
        sbM30465s.append(this.f37729k);
        sbM30465s.append(", h4=");
        sbM30465s.append(this.f37730l);
        sbM30465s.append(", body1FontFamily=");
        sbM30465s.append(this.f37731m);
        sbM30465s.append(", body2FontFamily=");
        sbM30465s.append(this.f37732n);
        sbM30465s.append(", h5FontFamily=");
        sbM30465s.append(this.f37733o);
        sbM30465s.append(", h6FontFamily=");
        sbM30465s.append(this.f37734p);
        sbM30465s.append(", subtitle1FontFamily=");
        sbM30465s.append(this.f37735q);
        sbM30465s.append(", captionFontFamily=");
        sbM30465s.append(this.f37736r);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }
}
