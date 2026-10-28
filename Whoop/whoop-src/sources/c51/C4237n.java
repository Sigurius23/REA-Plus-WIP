package c51;

import androidx.core.app.FrameMetricsAggregator;
import i93.C18279e;
import i93.InterfaceC18280f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import l83.C23465k;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: c51.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0001)B\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u009c\u0001\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b6\u0010<R)\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e0\r8\u0006¢\u0006\f\n\u0004\b4\u0010=\u001a\u0004\b:\u0010>R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\b?\u0010,R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b0\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b.\u0010F\u001a\u0004\bG\u0010H¨\u0006I"}, m65681d2 = {"Lc51/n;", "", "Ly3/f;", "radius", "padding", "Lc51/w;", "outline", "Lc51/e;", "edgeFade", "Lc51/y;", "primitiveEdgeFade", "Lc51/t;", "centerShadow", "", "Ll83/k;", "Li2/x;", "colors", "onboardingColors", "", "gradientPadding", "Lc51/x;", "particles", "Lc51/q;", "transition", "<init>", "(FFLc51/w;Lc51/e;Lc51/y;Lc51/t;Ljava/util/List;Ll83/k;FLc51/x;Lc51/q;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "factor", "p", "(F)Lc51/n;", "c", "(FFLc51/w;Lc51/e;Lc51/y;Lc51/t;Ljava/util/List;Ll83/k;FLc51/x;Lc51/q;)Lc51/n;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "n", "()F", "b", "k", "Lc51/w;", "j", "()Lc51/w;", "d", "Lc51/e;", "g", "()Lc51/e;", "e", "Lc51/y;", "m", "()Lc51/y;", "f", "Lc51/t;", "()Lc51/t;", "Ljava/util/List;", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Ll83/k;", "i", "()Ll83/k;", "Lc51/x;", "l", "()Lc51/x;", "Lc51/q;", "o", "()Lc51/q;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C4237n {

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: m */
    public static final int f17198m = 8;

    /* JADX INFO: renamed from: n */
    private static final InterfaceC18280f f17199n = new C18279e(-1.0f, 3.0f);

    /* JADX INFO: renamed from: o */
    private static final InterfaceC18280f f17200o = new C18279e(-10.0f, 10.0f);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final float padding;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C4246w outline;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C4228e edgeFade;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C4248y primitiveEdgeFade;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C4243t centerShadow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<C23465k> colors;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C23465k onboardingColors;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final float gradientPadding;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C4247x particles;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C4240q transition;

    /* JADX INFO: renamed from: c51.n$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m65681d2 = {"Lc51/n$a;", "", "<init>", "()V", "Li93/f;", "", "PACE_OF_AGING_RANGE", "Li93/f;", "b", "()Li93/f;", "DEBUG_YEARS_DIFFERENCE_RANGE", "a", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC18280f m13213a() {
            return C4237n.f17200o;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC18280f m13214b() {
            return C4237n.f17199n;
        }

        private Companion() {
        }
    }

    public /* synthetic */ C4237n(float f13, float f14, C4246w c4246w, C4228e c4228e, C4248y c4248y, C4243t c4243t, List list, C23465k c23465k, float f15, C4247x c4247x, C4240q c4240q, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, c4246w, c4228e, c4248y, c4243t, list, c23465k, f15, c4247x, c4240q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C4237n m13199d(C4237n c4237n, float f13, float f14, C4246w c4246w, C4228e c4228e, C4248y c4248y, C4243t c4243t, List list, C23465k c23465k, float f15, C4247x c4247x, C4240q c4240q, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = c4237n.radius;
        }
        if ((i13 & 2) != 0) {
            f14 = c4237n.padding;
        }
        if ((i13 & 4) != 0) {
            c4246w = c4237n.outline;
        }
        if ((i13 & 8) != 0) {
            c4228e = c4237n.edgeFade;
        }
        if ((i13 & 16) != 0) {
            c4248y = c4237n.primitiveEdgeFade;
        }
        if ((i13 & 32) != 0) {
            c4243t = c4237n.centerShadow;
        }
        if ((i13 & 64) != 0) {
            list = c4237n.colors;
        }
        if ((i13 & 128) != 0) {
            c23465k = c4237n.onboardingColors;
        }
        if ((i13 & 256) != 0) {
            f15 = c4237n.gradientPadding;
        }
        if ((i13 & 512) != 0) {
            c4247x = c4237n.particles;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            c4240q = c4237n.transition;
        }
        C4247x c4247x2 = c4247x;
        C4240q c4240q2 = c4240q;
        C23465k c23465k2 = c23465k;
        float f16 = f15;
        C4243t c4243t2 = c4243t;
        List list2 = list;
        C4248y c4248y2 = c4248y;
        C4246w c4246w2 = c4246w;
        return c4237n.m13200c(f13, f14, c4246w2, c4228e, c4248y2, c4243t2, list2, c23465k2, f16, c4247x2, c4240q2);
    }

    /* JADX INFO: renamed from: c */
    public final C4237n m13200c(float radius, float padding, C4246w outline, C4228e edgeFade, C4248y primitiveEdgeFade, C4243t centerShadow, List<C23465k> colors, C23465k onboardingColors, float gradientPadding, C4247x particles, C4240q transition) {
        AbstractC22676k.m65750j(outline, "outline");
        AbstractC22676k.m65750j(edgeFade, "edgeFade");
        AbstractC22676k.m65750j(primitiveEdgeFade, "primitiveEdgeFade");
        AbstractC22676k.m65750j(centerShadow, "centerShadow");
        AbstractC22676k.m65750j(colors, "colors");
        AbstractC22676k.m65750j(onboardingColors, "onboardingColors");
        AbstractC22676k.m65750j(particles, "particles");
        AbstractC22676k.m65750j(transition, "transition");
        return new C4237n(radius, padding, outline, edgeFade, primitiveEdgeFade, centerShadow, colors, onboardingColors, gradientPadding, particles, transition, null);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C4243t getCenterShadow() {
        return this.centerShadow;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C4237n)) {
            return false;
        }
        C4237n c4237n = (C4237n) other;
        return C39174f.m124782b(this.radius, c4237n.radius) && C39174f.m124782b(this.padding, c4237n.padding) && AbstractC22676k.m65745e(this.outline, c4237n.outline) && AbstractC22676k.m65745e(this.edgeFade, c4237n.edgeFade) && AbstractC22676k.m65745e(this.primitiveEdgeFade, c4237n.primitiveEdgeFade) && AbstractC22676k.m65745e(this.centerShadow, c4237n.centerShadow) && AbstractC22676k.m65745e(this.colors, c4237n.colors) && AbstractC22676k.m65745e(this.onboardingColors, c4237n.onboardingColors) && Float.compare(this.gradientPadding, c4237n.gradientPadding) == 0 && AbstractC22676k.m65745e(this.particles, c4237n.particles) && AbstractC22676k.m65745e(this.transition, c4237n.transition);
    }

    /* JADX INFO: renamed from: f */
    public final List<C23465k> m13202f() {
        return this.colors;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final C4228e getEdgeFade() {
        return this.edgeFade;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getGradientPadding() {
        return this.gradientPadding;
    }

    public int hashCode() {
        return this.transition.hashCode() + ((this.particles.hashCode() + AbstractC11266d.m30447a(this.gradientPadding, (this.onboardingColors.hashCode() + AbstractC11895b.m31983b((this.centerShadow.hashCode() + ((this.primitiveEdgeFade.hashCode() + ((this.edgeFade.hashCode() + ((this.outline.hashCode() + AbstractC11266d.m30447a(this.padding, Float.hashCode(this.radius) * 31, 31)) * 31)) * 31)) * 31)) * 31, 31, this.colors)) * 31, 31)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C23465k getOnboardingColors() {
        return this.onboardingColors;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final C4246w getOutline() {
        return this.outline;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getPadding() {
        return this.padding;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final C4247x getParticles() {
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
    public final C4240q getTransition() {
        return this.transition;
    }

    /* JADX INFO: renamed from: p */
    public final C4237n m13212p(float factor) {
        C4247x c4247x = this.particles;
        return m13199d(this, this.radius * factor, 0.0f, null, null, null, null, null, null, 0.0f, C4247x.m13267b(c4247x, null, c4247x.getMinSpeedRange().m31310e(factor), this.particles.getMaxSpeedRange().m31310e(factor), null, null, null, null, null, null, 505, null), null, 1534, null);
    }

    public String toString() {
        String strM124783c = C39174f.m124783c(this.radius);
        String strM124783c2 = C39174f.m124783c(this.padding);
        C4246w c4246w = this.outline;
        C4228e c4228e = this.edgeFade;
        C4248y c4248y = this.primitiveEdgeFade;
        C4243t c4243t = this.centerShadow;
        List<C23465k> list = this.colors;
        C23465k c23465k = this.onboardingColors;
        float f13 = this.gradientPadding;
        C4247x c4247x = this.particles;
        C4240q c4240q = this.transition;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AmoebaSettings(radius=", strM124783c, ", padding=", strM124783c2, ", outline=");
        sbM32001t.append(c4246w);
        sbM32001t.append(", edgeFade=");
        sbM32001t.append(c4228e);
        sbM32001t.append(", primitiveEdgeFade=");
        sbM32001t.append(c4248y);
        sbM32001t.append(", centerShadow=");
        sbM32001t.append(c4243t);
        sbM32001t.append(", colors=");
        sbM32001t.append(list);
        sbM32001t.append(", onboardingColors=");
        sbM32001t.append(c23465k);
        sbM32001t.append(", gradientPadding=");
        sbM32001t.append(f13);
        sbM32001t.append(", particles=");
        sbM32001t.append(c4247x);
        sbM32001t.append(", transition=");
        sbM32001t.append(c4240q);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    private C4237n(float f13, float f14, C4246w outline, C4228e edgeFade, C4248y primitiveEdgeFade, C4243t centerShadow, List<C23465k> colors, C23465k onboardingColors, float f15, C4247x particles, C4240q transition) {
        AbstractC22676k.m65750j(outline, "outline");
        AbstractC22676k.m65750j(edgeFade, "edgeFade");
        AbstractC22676k.m65750j(primitiveEdgeFade, "primitiveEdgeFade");
        AbstractC22676k.m65750j(centerShadow, "centerShadow");
        AbstractC22676k.m65750j(colors, "colors");
        AbstractC22676k.m65750j(onboardingColors, "onboardingColors");
        AbstractC22676k.m65750j(particles, "particles");
        AbstractC22676k.m65750j(transition, "transition");
        this.radius = f13;
        this.padding = f14;
        this.outline = outline;
        this.edgeFade = edgeFade;
        this.primitiveEdgeFade = primitiveEdgeFade;
        this.centerShadow = centerShadow;
        this.colors = colors;
        this.onboardingColors = onboardingColors;
        this.gradientPadding = f15;
        this.particles = particles;
        this.transition = transition;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4237n(float f13, float f14, C4246w c4246w, C4228e c4228e, C4248y c4248y, C4243t c4243t, List list, C23465k c23465k, float f15, C4247x c4247x, C4240q c4240q, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        float f16 = (i13 & 1) != 0 ? (float) 160.0d : f13;
        float f17 = (i13 & 2) != 0 ? (float) 20.0d : f14;
        C4246w c4246w2 = (i13 & 4) != 0 ? new C4246w(null, null, null, 0L, 0.0d, null, 0.0f, 0, 255, null) : c4246w;
        C4228e c4228e2 = (i13 & 8) != 0 ? new C4228e(0.0f, 0.0f, 0.0f, 0.0f, 15, null) : c4228e;
        C4248y c4248y2 = (i13 & 16) != 0 ? new C4248y(null, 1, null) : c4248y;
        C4243t c4243t2 = (i13 & 32) != 0 ? new C4243t(0L, null, null, 7, null) : c4243t;
        List listM118959K = (i13 & 64) != 0 ? AbstractC37056f.m118959K(new C23465k(new C17919x(AbstractC17918w0.m51517e(4278251935L)), new C17919x(AbstractC17918w0.m51517e(4286185407L))), new C23465k(new C17919x(AbstractC17918w0.m51517e(4278251935L)), new C17919x(AbstractC17918w0.m51517e(4285579519L))), new C23465k(new C17919x(AbstractC17918w0.m51517e(4285579519L)), new C17919x(AbstractC17918w0.m51517e(4285125597L))), new C23465k(new C17919x(AbstractC17918w0.m51517e(4285579519L)), new C17919x(AbstractC17918w0.m51517e(4294944546L))), new C23465k(new C17919x(AbstractC17918w0.m51517e(4294944546L)), new C17919x(AbstractC17918w0.m51517e(4294960746L)))) : list;
        this(f16, f17, c4246w2, c4228e2, c4248y2, c4243t2, listM118959K, (i13 & 128) != 0 ? new C23465k(new C17919x(AbstractC17918w0.m51517e(4289703855L)), new C17919x(AbstractC17918w0.m51517e(4287598479L))) : c23465k, (i13 & 256) != 0 ? 0.25f : f15, (i13 & 512) != 0 ? new C4247x(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null) : c4247x, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? new C4240q(0L, 0.0f, 0L, 0L, 0L, 0L, 63, null) : c4240q, null);
    }
}
