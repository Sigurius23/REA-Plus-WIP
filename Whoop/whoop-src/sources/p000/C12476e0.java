package p000;

import live.hms.video.error.ErrorCodes;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p636y3.C39174f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: e0 */
/* JADX INFO: loaded from: classes10.dex */
public final class C12476e0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a */
    public final float f42577a;

    /* JADX INFO: renamed from: b */
    public final String f42578b;

    /* JADX INFO: renamed from: c */
    public final String f42579c;

    /* JADX INFO: renamed from: d */
    public final int f42580d;

    /* JADX INFO: renamed from: e */
    public final float f42581e;

    /* JADX INFO: renamed from: f */
    public final float f42582f;

    /* JADX INFO: renamed from: g */
    public final long f42583g;

    /* JADX INFO: renamed from: h */
    public final long f42584h;

    /* JADX INFO: renamed from: i */
    public final long f42585i;

    /* JADX INFO: renamed from: j */
    public final float f42586j;

    /* JADX INFO: renamed from: k */
    public final float f42587k;

    /* JADX INFO: renamed from: l */
    public final float f42588l;

    /* JADX INFO: renamed from: m */
    public final float f42589m;

    /* JADX INFO: renamed from: n */
    public final int f42590n;

    /* JADX INFO: renamed from: o */
    public final float f42591o;

    /* JADX INFO: renamed from: p */
    public final int f42592p;

    /* JADX INFO: renamed from: q */
    public final int f42593q;

    /* JADX INFO: renamed from: r */
    public final long f42594r;

    /* JADX INFO: renamed from: s */
    public final float f42595s;

    /* JADX INFO: renamed from: t */
    public final float f42596t;

    public C12476e0(float f13, String subtitle, String str) {
        long jM51517e = AbstractC17918w0.m51517e(4278255536L);
        long jM51517e2 = AbstractC17918w0.m51517e(4282007623L);
        long jM51517e3 = AbstractC17918w0.m51517e(4294967295L);
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.f42577a = f13;
        this.f42578b = subtitle;
        this.f42579c = str;
        this.f42580d = 100;
        this.f42581e = 240.0f;
        this.f42582f = 238.0f;
        this.f42583g = jM51517e;
        this.f42584h = jM51517e2;
        this.f42585i = jM51517e3;
        this.f42586j = 5;
        this.f42587k = 10;
        this.f42588l = 30;
        this.f42589m = 0.3f;
        this.f42590n = 10;
        this.f42591o = 0.8f;
        this.f42592p = 1600;
        this.f42593q = ErrorCodes.InitAPIErrors.cHTTPError;
        this.f42594r = 1500L;
        this.f42595s = 15.0f;
        this.f42596t = 320;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12476e0)) {
            return false;
        }
        C12476e0 c12476e0 = (C12476e0) obj;
        return Float.compare(this.f42577a, c12476e0.f42577a) == 0 && AbstractC22676k.m65745e(this.f42578b, c12476e0.f42578b) && AbstractC22676k.m65745e(this.f42579c, c12476e0.f42579c) && this.f42580d == c12476e0.f42580d && Float.compare(this.f42581e, c12476e0.f42581e) == 0 && Float.compare(this.f42582f, c12476e0.f42582f) == 0 && C17919x.m51542d(this.f42583g, c12476e0.f42583g) && C17919x.m51542d(this.f42584h, c12476e0.f42584h) && C17919x.m51542d(this.f42585i, c12476e0.f42585i) && C39174f.m124782b(this.f42586j, c12476e0.f42586j) && C39174f.m124782b(this.f42587k, c12476e0.f42587k) && C39174f.m124782b(this.f42588l, c12476e0.f42588l) && Float.compare(this.f42589m, c12476e0.f42589m) == 0 && this.f42590n == c12476e0.f42590n && Float.compare(this.f42591o, c12476e0.f42591o) == 0 && this.f42592p == c12476e0.f42592p && this.f42593q == c12476e0.f42593q && this.f42594r == c12476e0.f42594r && Float.compare(this.f42595s, c12476e0.f42595s) == 0 && C39174f.m124782b(this.f42596t, c12476e0.f42596t);
    }

    public final int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.f42582f, AbstractC11266d.m30447a(this.f42581e, AbstractC11266d.m30448b(this.f42580d, AbstractC11266d.m30450d(AbstractC11266d.m30450d(Float.hashCode(this.f42577a) * 31, 31, this.f42578b), 31, this.f42579c), 31), 31), 31);
        int i13 = C17919x.f69638o;
        return Boolean.hashCode(false) + AbstractC11266d.m30447a(this.f42596t, AbstractC11266d.m30447a(this.f42595s, AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.f42593q, AbstractC11266d.m30448b(this.f42592p, AbstractC11266d.m30447a(this.f42591o, AbstractC11266d.m30448b(this.f42590n, AbstractC11266d.m30447a(this.f42589m, AbstractC11266d.m30447a(this.f42588l, AbstractC11266d.m30447a(this.f42587k, AbstractC11266d.m30447a(this.f42586j, AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(iM30447a, this.f42583g, 31), this.f42584h, 31), this.f42585i, 31), 31), 31), 31), 31), 31), 31), 31), 31), this.f42594r, 31), 31), 31);
    }

    public final String toString() {
        String strM51548j = C17919x.m51548j(this.f42583g);
        String strM51548j2 = C17919x.m51548j(this.f42584h);
        String strM51548j3 = C17919x.m51548j(this.f42585i);
        String strM124783c = C39174f.m124783c(this.f42586j);
        String strM124783c2 = C39174f.m124783c(this.f42587k);
        String strM124783c3 = C39174f.m124783c(this.f42588l);
        String strM124783c4 = C39174f.m124783c(this.f42596t);
        StringBuilder sb4 = new StringBuilder("PercentageGaugeViewState(percentage=");
        sb4.append(this.f42577a);
        sb4.append(", subtitle=");
        sb4.append(this.f42578b);
        sb4.append(", percentSymbol=");
        AbstractC11266d.m30470x(this.f42580d, this.f42579c, ", totalSegments=", ", arcSweepAngle=", sb4);
        AbstractC30802r.m94772u(sb4, this.f42581e, ", startAngle=", this.f42582f, ", activeColor=");
        AbstractC11266d.m30444B(sb4, strM51548j, ", inactiveColor=", strM51548j2, ", shootingStarColor=");
        AbstractC11266d.m30444B(sb4, strM51548j3, ", segmentWidth=", strM124783c, ", segmentHeight=");
        AbstractC11266d.m30444B(sb4, strM124783c2, ", shadowHeight=", strM124783c3, ", taperFactor=");
        sb4.append(this.f42589m);
        sb4.append(", largeGapEvery=");
        sb4.append(this.f42590n);
        sb4.append(", largeGapExtraDeg=");
        sb4.append(this.f42591o);
        sb4.append(", animationDuration=");
        sb4.append(this.f42592p);
        sb4.append(", highlightDuration=");
        sb4.append(this.f42593q);
        sb4.append(", highlightPauseMillis=");
        sb4.append(this.f42594r);
        sb4.append(", highlightTailLengthPercent=");
        sb4.append(this.f42595s);
        sb4.append(", size=");
        sb4.append(strM124783c4);
        sb4.append(", isPreview=false)");
        return sb4.toString();
    }
}
