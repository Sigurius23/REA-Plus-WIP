package p525uj;

import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p208i2.C17919x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: uj.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C35031i {

    /* JADX INFO: renamed from: a */
    public final float f148279a;

    /* JADX INFO: renamed from: b */
    public final Float f148280b;

    /* JADX INFO: renamed from: c */
    public final float f148281c;

    /* JADX INFO: renamed from: d */
    public final float f148282d;

    /* JADX INFO: renamed from: e */
    public final long f148283e;

    /* JADX INFO: renamed from: f */
    public final long f148284f;

    /* JADX INFO: renamed from: g */
    public final long f148285g;

    /* JADX INFO: renamed from: h */
    public final int f148286h;

    /* JADX INFO: renamed from: i */
    public final String f148287i;

    /* JADX INFO: renamed from: j */
    public final C17919x f148288j;

    /* JADX INFO: renamed from: k */
    public final C17919x f148289k;

    /* JADX INFO: renamed from: l */
    public final C17919x f148290l;

    /* JADX INFO: renamed from: m */
    public final C17919x f148291m;

    /* JADX INFO: renamed from: n */
    public final C17919x f148292n;

    /* JADX INFO: renamed from: o */
    public final C17919x f148293o;

    public /* synthetic */ C35031i(float f13, float f14, long j7, long j13, long j14, int i13, C17919x c17919x, C17919x c17919x2, C17919x c17919x3, int i14) {
        this((i14 & 1) != 0 ? 32.0f : f13, null, 8.0f, (i14 & 8) != 0 ? 6.0f : f14, j7, j13, j14, (i14 & 128) != 0 ? 600 : i13, null, null, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : c17919x, null, null, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c17919x2, (i14 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : c17919x3);
    }

    /* JADX INFO: renamed from: a */
    public static C35031i m110698a(C35031i c35031i, float f13, Float f14, float f15, float f16, int i13, String str, C17919x c17919x, C17919x c17919x2, C17919x c17919x3, int i14) {
        float f17 = (i14 & 1) != 0 ? c35031i.f148279a : f13;
        Float f18 = (i14 & 2) != 0 ? c35031i.f148280b : f14;
        float f19 = (i14 & 4) != 0 ? c35031i.f148281c : f15;
        float f24 = (i14 & 8) != 0 ? c35031i.f148282d : f16;
        long j7 = c35031i.f148283e;
        long j13 = c35031i.f148284f;
        long j14 = c35031i.f148285g;
        int i15 = (i14 & 128) != 0 ? c35031i.f148286h : i13;
        String str2 = (i14 & 256) != 0 ? c35031i.f148287i : str;
        C17919x c17919x4 = (i14 & 512) != 0 ? c35031i.f148288j : c17919x;
        C17919x c17919x5 = c35031i.f148289k;
        C17919x c17919x6 = (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c35031i.f148290l : c17919x2;
        C17919x c17919x7 = (i14 & 4096) != 0 ? c35031i.f148291m : c17919x3;
        C17919x c17919x8 = c35031i.f148292n;
        C17919x c17919x9 = c35031i.f148293o;
        c35031i.getClass();
        c35031i.getClass();
        c35031i.getClass();
        return new C35031i(f17, f18, f19, f24, j7, j13, j14, i15, str2, c17919x4, c17919x5, c17919x6, c17919x7, c17919x8, c17919x9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35031i)) {
            return false;
        }
        C35031i c35031i = (C35031i) obj;
        return Float.compare(this.f148279a, c35031i.f148279a) == 0 && AbstractC22676k.m65745e(this.f148280b, c35031i.f148280b) && Float.compare(this.f148281c, c35031i.f148281c) == 0 && Float.compare(this.f148282d, c35031i.f148282d) == 0 && C17919x.m51542d(this.f148283e, c35031i.f148283e) && C17919x.m51542d(this.f148284f, c35031i.f148284f) && C17919x.m51542d(this.f148285g, c35031i.f148285g) && this.f148286h == c35031i.f148286h && AbstractC22676k.m65745e(this.f148287i, c35031i.f148287i) && AbstractC22676k.m65745e(this.f148288j, c35031i.f148288j) && AbstractC22676k.m65745e(this.f148289k, c35031i.f148289k) && AbstractC22676k.m65745e(this.f148290l, c35031i.f148290l) && AbstractC22676k.m65745e(this.f148291m, c35031i.f148291m) && AbstractC22676k.m65745e(this.f148292n, c35031i.f148292n) && AbstractC22676k.m65745e(this.f148293o, c35031i.f148293o);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f148279a) * 31;
        Float f13 = this.f148280b;
        int iM30447a = AbstractC11266d.m30447a(this.f148282d, AbstractC11266d.m30447a(this.f148281c, (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31, 31), 31);
        int i13 = C17919x.f69638o;
        int iM30448b = AbstractC11266d.m30448b(this.f148286h, AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(iM30447a, this.f148283e, 31), this.f148284f, 31), this.f148285g, 31), 31);
        String str = this.f148287i;
        int iHashCode2 = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        C17919x c17919x = this.f148288j;
        int iHashCode3 = (iHashCode2 + (c17919x == null ? 0 : Long.hashCode(c17919x.f69639a))) * 31;
        C17919x c17919x2 = this.f148289k;
        int iHashCode4 = (iHashCode3 + (c17919x2 == null ? 0 : Long.hashCode(c17919x2.f69639a))) * 31;
        C17919x c17919x3 = this.f148290l;
        int iHashCode5 = (iHashCode4 + (c17919x3 == null ? 0 : Long.hashCode(c17919x3.f69639a))) * 31;
        C17919x c17919x4 = this.f148291m;
        int iHashCode6 = (iHashCode5 + (c17919x4 == null ? 0 : Long.hashCode(c17919x4.f69639a))) * 31;
        C17919x c17919x5 = this.f148292n;
        int iHashCode7 = (iHashCode6 + (c17919x5 == null ? 0 : Long.hashCode(c17919x5.f69639a))) * 31;
        C17919x c17919x6 = this.f148293o;
        return (iHashCode7 + (c17919x6 != null ? Long.hashCode(c17919x6.f69639a) : 0)) * 961;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("FormControlTheme(height=");
        sb4.append(this.f148279a);
        sb4.append(", width=");
        sb4.append(this.f148280b);
        sb4.append(", padding=");
        sb4.append(this.f148281c);
        sb4.append(", cornerRadius=");
        sb4.append(this.f148282d);
        sb4.append(", backgroundColor=");
        AbstractC13673n.m38574u(this.f148283e, ", borderColor=", sb4);
        AbstractC13673n.m38574u(this.f148284f, ", contentColor=", sb4);
        AbstractC13673n.m38574u(this.f148285g, ", fontWeight=", sb4);
        sb4.append(this.f148286h);
        sb4.append(", shadow=");
        sb4.append(this.f148287i);
        sb4.append(", shadowColor=");
        sb4.append(this.f148288j);
        sb4.append(", placeholderColor=");
        sb4.append(this.f148289k);
        sb4.append(", baseAccent=");
        sb4.append(this.f148290l);
        sb4.append(", activeBackgroundColor=");
        sb4.append(this.f148291m);
        sb4.append(", nudgeRatingStarColor=");
        sb4.append(this.f148292n);
        sb4.append(", nudgeRatingStarColorSelected=");
        sb4.append(this.f148293o);
        sb4.append(", layoutCornerRadius=null, heightSmall=null)");
        return sb4.toString();
    }

    public C35031i(float f13, Float f14, float f15, float f16, long j7, long j13, long j14, int i13, String str, C17919x c17919x, C17919x c17919x2, C17919x c17919x3, C17919x c17919x4, C17919x c17919x5, C17919x c17919x6) {
        this.f148279a = f13;
        this.f148280b = f14;
        this.f148281c = f15;
        this.f148282d = f16;
        this.f148283e = j7;
        this.f148284f = j13;
        this.f148285g = j14;
        this.f148286h = i13;
        this.f148287i = str;
        this.f148288j = c17919x;
        this.f148289k = c17919x2;
        this.f148290l = c17919x3;
        this.f148291m = c17919x4;
        this.f148292n = c17919x5;
        this.f148293o = c17919x6;
    }
}
