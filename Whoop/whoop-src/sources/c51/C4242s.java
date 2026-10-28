package c51;

import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p636y3.C39174f;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: c51.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b/\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u00013B£\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b¢\u0006\u0004\b%\u0010&J¬\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u00104\u001a\u0004\b7\u00106R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00106R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b!\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b%\u0010C\u001a\u0004\b>\u0010DR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bA\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bF\u0010L\u001a\u0004\bH\u0010MR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b<\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bQ\u0010SR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bO\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b5\u0010W\u001a\u0004\bX\u0010YR\u0011\u0010[\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bZ\u00106R\u0011\u0010]\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\\\u00106¨\u0006^"}, m65681d2 = {"Lc51/s;", "Lm91/u;", "Ly3/f;", "radius", "padding", "", "gradientPadding", "", "paceOfAgingAnimationScore", "yearsDifferenceAnimationScore", "Ll83/k;", "Li2/x;", "colors", "Li2/t;", "centerShadowBrush", "Lc51/l;", "outline", "", "usingPrimitiveEdgeFade", "Lc51/e;", "edgeFade", "Lc51/y;", "primitiveEdgeFade", "Lc51/m;", "particles", "Lc51/r;", "transition", "Lc51/o;", "text", "<init>", "(FFFDDLl83/k;Li2/t;Lc51/l;ZLc51/e;Lc51/y;Lc51/m;Lc51/r;Lc51/o;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ly3/c;", "density", "f", "(Ly3/c;)Li2/t;", "startColor", "endColor", "g", "(Ly3/c;JJ)Li2/t;", "b", "(FFFDDLl83/k;Li2/t;Lc51/l;ZLc51/e;Lc51/y;Lc51/m;Lc51/r;Lc51/o;)Lc51/s;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "F", "n", "()F", "getPadding-D9Ej5fM", "c", "getGradientPadding", "d", "D", "k", "()D", "e", "t", "Ll83/k;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ll83/k;", "Li2/t;", "()Li2/t;", "Lc51/l;", "j", "()Lc51/l;", "i", "Z", "q", "()Z", "Lc51/e;", "()Lc51/e;", "Lc51/y;", "m", "()Lc51/y;", "l", "Lc51/m;", "()Lc51/m;", "Lc51/r;", "p", "()Lc51/r;", "Lc51/o;", "o", "()Lc51/o;", "s", "viewWidth", "r", "viewHeight", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4242s implements InterfaceC25312u {

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p */
    public static final int f17232p = 8;

    /* JADX INFO: renamed from: q */
    private static final float f17233q = 160;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float padding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final float gradientPadding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final double paceOfAgingAnimationScore;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final double yearsDifferenceAnimationScore;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C23465k colors;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final AbstractC17911t centerShadowBrush;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C4235l outline;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean usingPrimitiveEdgeFade;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C4228e edgeFade;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C4248y primitiveEdgeFade;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C4236m particles;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C4241r transition;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C4238o text;

    /* JADX INFO: renamed from: c51.s$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lc51/s$a;", "", "<init>", "()V", "Ly3/f;", "DEFAULT_RADIUS", "F", "a", "()F", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final float m13253a() {
            return C4242s.f17233q;
        }

        private Companion() {
        }
    }

    public /* synthetic */ C4242s(float f13, float f14, float f15, double d3, double d14, C23465k c23465k, AbstractC17911t abstractC17911t, C4235l c4235l, boolean z4, C4228e c4228e, C4248y c4248y, C4236m c4236m, C4241r c4241r, C4238o c4238o, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15, d3, d14, c23465k, abstractC17911t, c4235l, z4, c4228e, c4248y, c4236m, c4241r, c4238o);
    }

    /* JADX INFO: renamed from: b */
    public final C4242s m13236b(float radius, float padding, float gradientPadding, double paceOfAgingAnimationScore, double yearsDifferenceAnimationScore, C23465k colors, AbstractC17911t centerShadowBrush, C4235l outline, boolean usingPrimitiveEdgeFade, C4228e edgeFade, C4248y primitiveEdgeFade, C4236m particles, C4241r transition, C4238o text) {
        AbstractC22676k.m65750j(colors, "colors");
        AbstractC22676k.m65750j(centerShadowBrush, "centerShadowBrush");
        AbstractC22676k.m65750j(outline, "outline");
        AbstractC22676k.m65750j(edgeFade, "edgeFade");
        AbstractC22676k.m65750j(primitiveEdgeFade, "primitiveEdgeFade");
        AbstractC22676k.m65750j(particles, "particles");
        return new C4242s(radius, padding, gradientPadding, paceOfAgingAnimationScore, yearsDifferenceAnimationScore, colors, centerShadowBrush, outline, usingPrimitiveEdgeFade, edgeFade, primitiveEdgeFade, particles, transition, text, null);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbstractC17911t getCenterShadowBrush() {
        return this.centerShadowBrush;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4242s)) {
            return false;
        }
        C4242s c4242s = (C4242s) other;
        return C39174f.m124782b(this.radius, c4242s.radius) && C39174f.m124782b(this.padding, c4242s.padding) && Float.compare(this.gradientPadding, c4242s.gradientPadding) == 0 && Double.compare(this.paceOfAgingAnimationScore, c4242s.paceOfAgingAnimationScore) == 0 && Double.compare(this.yearsDifferenceAnimationScore, c4242s.yearsDifferenceAnimationScore) == 0 && AbstractC22676k.m65745e(this.colors, c4242s.colors) && AbstractC22676k.m65745e(this.centerShadowBrush, c4242s.centerShadowBrush) && AbstractC22676k.m65745e(this.outline, c4242s.outline) && this.usingPrimitiveEdgeFade == c4242s.usingPrimitiveEdgeFade && AbstractC22676k.m65745e(this.edgeFade, c4242s.edgeFade) && AbstractC22676k.m65745e(this.primitiveEdgeFade, c4242s.primitiveEdgeFade) && AbstractC22676k.m65745e(this.particles, c4242s.particles) && AbstractC22676k.m65745e(this.transition, c4242s.transition) && AbstractC22676k.m65745e(this.text, c4242s.text);
    }

    /* JADX INFO: renamed from: f */
    public final AbstractC17911t m13238f(InterfaceC39171c density) {
        AbstractC22676k.m65750j(density, "density");
        C23465k c23465k = this.colors;
        return m13239g(density, ((C17919x) c23465k.f92937w).f69639a, ((C17919x) c23465k.f92938x).f69639a);
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC17911t m13239g(InterfaceC39171c density, long startColor, long endColor) {
        AbstractC22676k.m65750j(density, "density");
        float f13 = 2;
        return C17909s.m51487e(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(startColor)), new C23465k(Float.valueOf(this.gradientPadding), new C17919x(startColor)), new C23465k(Float.valueOf(1 - this.gradientPadding), new C17919x(endColor)), new C23465k(Float.valueOf(1.0f), new C17919x(endColor))}, (((long) Float.floatToRawIntBits(density.mo743q0(m13251s()) / f13)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(density.mo743q0(m13251s()) / f13)) << 32) | (((long) Float.floatToRawIntBits(density.mo743q0(m13250r()))) & 4294967295L), 8);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C23465k getColors() {
        return this.colors;
    }

    public int hashCode() {
        int iHashCode = (this.particles.hashCode() + ((this.primitiveEdgeFade.hashCode() + ((this.edgeFade.hashCode() + AbstractC2875y.m8289b((this.outline.hashCode() + ((this.centerShadowBrush.hashCode() + ((this.colors.hashCode() + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC11266d.m30447a(this.gradientPadding, AbstractC11266d.m30447a(this.padding, Float.hashCode(this.radius) * 31, 31), 31), 31, this.paceOfAgingAnimationScore), 31, this.yearsDifferenceAnimationScore)) * 31)) * 31)) * 31, 31, this.usingPrimitiveEdgeFade)) * 31)) * 31)) * 31;
        C4241r c4241r = this.transition;
        int iHashCode2 = (iHashCode + (c4241r == null ? 0 : c4241r.hashCode())) * 31;
        C4238o c4238o = this.text;
        return iHashCode2 + (c4238o != null ? c4238o.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C4228e getEdgeFade() {
        return this.edgeFade;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C4235l getOutline() {
        return this.outline;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final double getPaceOfAgingAnimationScore() {
        return this.paceOfAgingAnimationScore;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C4236m getParticles() {
        return this.particles;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final C4248y getPrimitiveEdgeFade() {
        return this.primitiveEdgeFade;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final C4238o getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final C4241r getTransition() {
        return this.transition;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getUsingPrimitiveEdgeFade() {
        return this.usingPrimitiveEdgeFade;
    }

    /* JADX INFO: renamed from: r */
    public final float m13250r() {
        return m13251s();
    }

    /* JADX INFO: renamed from: s */
    public final float m13251s() {
        return (this.radius + this.padding) * 2;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final double getYearsDifferenceAnimationScore() {
        return this.yearsDifferenceAnimationScore;
    }

    public String toString() {
        String strM124783c = C39174f.m124783c(this.radius);
        String strM124783c2 = C39174f.m124783c(this.padding);
        float f13 = this.gradientPadding;
        double d3 = this.paceOfAgingAnimationScore;
        double d14 = this.yearsDifferenceAnimationScore;
        C23465k c23465k = this.colors;
        AbstractC17911t abstractC17911t = this.centerShadowBrush;
        C4235l c4235l = this.outline;
        boolean z4 = this.usingPrimitiveEdgeFade;
        C4228e c4228e = this.edgeFade;
        C4248y c4248y = this.primitiveEdgeFade;
        C4236m c4236m = this.particles;
        C4241r c4241r = this.transition;
        C4238o c4238o = this.text;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AmoebaViewState(radius=", strM124783c, ", padding=", strM124783c2, ", gradientPadding=");
        sbM32001t.append(f13);
        sbM32001t.append(", paceOfAgingAnimationScore=");
        sbM32001t.append(d3);
        AbstractC31061c.m95622B(sbM32001t, ", yearsDifferenceAnimationScore=", d14, ", colors=");
        sbM32001t.append(c23465k);
        sbM32001t.append(", centerShadowBrush=");
        sbM32001t.append(abstractC17911t);
        sbM32001t.append(", outline=");
        sbM32001t.append(c4235l);
        sbM32001t.append(", usingPrimitiveEdgeFade=");
        sbM32001t.append(z4);
        sbM32001t.append(", edgeFade=");
        sbM32001t.append(c4228e);
        sbM32001t.append(", primitiveEdgeFade=");
        sbM32001t.append(c4248y);
        sbM32001t.append(", particles=");
        sbM32001t.append(c4236m);
        sbM32001t.append(", transition=");
        sbM32001t.append(c4241r);
        sbM32001t.append(", text=");
        sbM32001t.append(c4238o);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    private C4242s(float f13, float f14, float f15, double d3, double d14, C23465k colors, AbstractC17911t centerShadowBrush, C4235l outline, boolean z4, C4228e edgeFade, C4248y primitiveEdgeFade, C4236m particles, C4241r c4241r, C4238o c4238o) {
        AbstractC22676k.m65750j(colors, "colors");
        AbstractC22676k.m65750j(centerShadowBrush, "centerShadowBrush");
        AbstractC22676k.m65750j(outline, "outline");
        AbstractC22676k.m65750j(edgeFade, "edgeFade");
        AbstractC22676k.m65750j(primitiveEdgeFade, "primitiveEdgeFade");
        AbstractC22676k.m65750j(particles, "particles");
        this.radius = f13;
        this.padding = f14;
        this.gradientPadding = f15;
        this.paceOfAgingAnimationScore = d3;
        this.yearsDifferenceAnimationScore = d14;
        this.colors = colors;
        this.centerShadowBrush = centerShadowBrush;
        this.outline = outline;
        this.usingPrimitiveEdgeFade = z4;
        this.edgeFade = edgeFade;
        this.primitiveEdgeFade = primitiveEdgeFade;
        this.particles = particles;
        this.transition = c4241r;
        this.text = c4238o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4242s(float f13, float f14, float f15, double d3, double d14, C23465k c23465k, AbstractC17911t abstractC17911t, C4235l c4235l, boolean z4, C4228e c4228e, C4248y c4248y, C4236m c4236m, C4241r c4241r, C4238o c4238o, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z13;
        AbstractC17911t abstractC17911tM51490h;
        C4236m c4236m2;
        float f16 = (i13 & 1) != 0 ? f17233q : f13;
        float f17 = (i13 & 2) != 0 ? (float) 20.0d : f14;
        float f18 = (i13 & 4) != 0 ? 0.25f : f15;
        double d15 = (i13 & 8) != 0 ? 0.0d : d3;
        double d16 = (i13 & 16) == 0 ? d14 : 0.0d;
        C23465k c23465k2 = (i13 & 32) != 0 ? new C23465k(new C17919x(AbstractC17918w0.m51517e(4278251935L)), new C17919x(AbstractC17918w0.m51517e(4286185407L))) : c23465k;
        float f19 = 0.0f;
        if ((i13 & 64) != 0) {
            z13 = false;
            abstractC17911tM51490h = C17909s.m51490h(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(AbstractC17918w0.m51517e(4278716424L))), new C23465k(Float.valueOf(0.25f), new C17919x(AbstractC17918w0.m51517e(4278716424L))), new C23465k(Float.valueOf(0.6f), new C17919x(AbstractC17918w0.m51515c(0)))}, 0L, 0.0f, 14);
        } else {
            z13 = false;
            abstractC17911tM51490h = abstractC17911t;
        }
        C4235l c4235l2 = (i13 & 128) != 0 ? new C4235l(0, null, null, null, null, 0L, 0.0d, null, 0.0f, 0, 1023, null) : c4235l;
        boolean z14 = (i13 & 256) != 0 ? z13 : z4;
        C4228e c4228e2 = (i13 & 512) != 0 ? new C4228e(0.0f, 0.0f, 0.0f, 0.0f, 15, null) : c4228e;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        C4248y c4248y2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new C4248y(null, 1, null) : c4248y;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            c4236m2 = new C4236m(objArr2 == true ? 1 : 0, f19, 3, objArr == true ? 1 : 0);
        } else {
            c4236m2 = c4236m;
        }
        double d17 = d15;
        this(f16, f17, f18, d17, d16, c23465k2, abstractC17911tM51490h, c4235l2, z14, c4228e2, c4248y2, c4236m2, (i13 & 4096) != 0 ? null : c4241r, (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? c4238o : null, null);
    }
}
