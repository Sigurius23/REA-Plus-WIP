package androidx.compose.p018ui.graphics;

import al.AbstractC0954a;
import androidx.compose.p018ui.node.NodeCoordinator;
import p000.AbstractC11266d;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p005a3.C0227m1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p208i2.C17872b1;
import p208i2.C17877d0;
import p208i2.C17881e1;
import p208i2.C17901o;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/graphics/GraphicsLayerElement;", "La3/h1;", "Li2/b1;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final /* data */ class GraphicsLayerElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final float f4798E;

    /* JADX INFO: renamed from: F */
    public final float f4799F;

    /* JADX INFO: renamed from: G */
    public final float f4800G;

    /* JADX INFO: renamed from: H */
    public final float f4801H;

    /* JADX INFO: renamed from: I */
    public final long f4802I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC17869a1 f4803J;

    /* JADX INFO: renamed from: K */
    public final boolean f4804K;

    /* JADX INFO: renamed from: L */
    public final AbstractC0954a f4805L;

    /* JADX INFO: renamed from: M */
    public final long f4806M;

    /* JADX INFO: renamed from: N */
    public final long f4807N;

    /* JADX INFO: renamed from: O */
    public final int f4808O;

    /* JADX INFO: renamed from: w */
    public final float f4809w;

    /* JADX INFO: renamed from: x */
    public final float f4810x;

    /* JADX INFO: renamed from: y */
    public final float f4811y;

    /* JADX INFO: renamed from: z */
    public final float f4812z;

    public GraphicsLayerElement(float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f24, long j7, InterfaceC17869a1 interfaceC17869a1, boolean z4, AbstractC0954a abstractC0954a, long j13, long j14, int i13) {
        this.f4809w = f13;
        this.f4810x = f14;
        this.f4811y = f15;
        this.f4812z = f16;
        this.f4798E = f17;
        this.f4799F = f18;
        this.f4800G = f19;
        this.f4801H = f24;
        this.f4802I = j7;
        this.f4803J = interfaceC17869a1;
        this.f4804K = z4;
        this.f4805L = abstractC0954a;
        this.f4806M = j13;
        this.f4807N = j14;
        this.f4808O = i13;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C17872b1 c17872b1 = new C17872b1();
        c17872b1.f69538O = this.f4809w;
        c17872b1.f69539P = this.f4810x;
        c17872b1.f69540Q = this.f4811y;
        c17872b1.f69541R = this.f4812z;
        c17872b1.f69542S = this.f4798E;
        c17872b1.f69543T = this.f4799F;
        c17872b1.f69544U = this.f4800G;
        c17872b1.f69545V = this.f4801H;
        c17872b1.f69546W = 8.0f;
        c17872b1.f69547X = this.f4802I;
        c17872b1.f69548Y = this.f4803J;
        c17872b1.f69549Z = this.f4804K;
        c17872b1.f69550a0 = this.f4805L;
        c17872b1.f69551b0 = this.f4806M;
        c17872b1.f69552c0 = this.f4807N;
        c17872b1.f69553d0 = this.f4808O;
        c17872b1.f69554e0 = 3;
        c17872b1.f69555f0 = new C0227m1(c17872b1, 15);
        return c17872b1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphicsLayerElement)) {
            return false;
        }
        GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
        return Float.compare(this.f4809w, graphicsLayerElement.f4809w) == 0 && Float.compare(this.f4810x, graphicsLayerElement.f4810x) == 0 && Float.compare(this.f4811y, graphicsLayerElement.f4811y) == 0 && Float.compare(this.f4812z, graphicsLayerElement.f4812z) == 0 && Float.compare(this.f4798E, graphicsLayerElement.f4798E) == 0 && Float.compare(this.f4799F, graphicsLayerElement.f4799F) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f4800G, graphicsLayerElement.f4800G) == 0 && Float.compare(this.f4801H, graphicsLayerElement.f4801H) == 0 && Float.compare(8.0f, 8.0f) == 0 && C17881e1.m51436a(this.f4802I, graphicsLayerElement.f4802I) && AbstractC22676k.m65745e(this.f4803J, graphicsLayerElement.f4803J) && this.f4804K == graphicsLayerElement.f4804K && AbstractC22676k.m65745e(this.f4805L, graphicsLayerElement.f4805L) && C17919x.m51542d(this.f4806M, graphicsLayerElement.f4806M) && C17919x.m51542d(this.f4807N, graphicsLayerElement.f4807N) && this.f4808O == graphicsLayerElement.f4808O;
    }

    public final int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(8.0f, AbstractC11266d.m30447a(this.f4801H, AbstractC11266d.m30447a(this.f4800G, AbstractC11266d.m30447a(0.0f, AbstractC11266d.m30447a(this.f4799F, AbstractC11266d.m30447a(this.f4798E, AbstractC11266d.m30447a(this.f4812z, AbstractC11266d.m30447a(this.f4811y, AbstractC11266d.m30447a(this.f4810x, Float.hashCode(this.f4809w) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i13 = C17881e1.f69567c;
        int iM8289b = AbstractC2875y.m8289b((this.f4803J.hashCode() + AbstractC11266d.m30451e(iM30447a, this.f4802I, 31)) * 31, 31, this.f4804K);
        AbstractC0954a abstractC0954a = this.f4805L;
        int iHashCode = (iM8289b + (abstractC0954a == null ? 0 : abstractC0954a.hashCode())) * 31;
        int i14 = C17919x.f69638o;
        return AbstractC11266d.m30448b(3, AbstractC11266d.m30448b(this.f4808O, AbstractC11266d.m30451e(AbstractC11266d.m30451e(iHashCode, this.f4806M, 31), this.f4807N, 31), 31), 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("graphicsLayer");
        c2404l2.m7400b().m7292c(Float.valueOf(this.f4809w), "scaleX");
        c2404l2.m7400b().m7292c(Float.valueOf(this.f4810x), "scaleY");
        c2404l2.m7400b().m7292c(Float.valueOf(this.f4811y), "alpha");
        c2404l2.m7400b().m7292c(Float.valueOf(this.f4812z), "translationX");
        c2404l2.m7400b().m7292c(Float.valueOf(this.f4798E), "translationY");
        c2404l2.m7400b().m7292c(Float.valueOf(this.f4799F), "shadowElevation");
        c2404l2.m7400b().m7292c(Float.valueOf(0.0f), "rotationX");
        c2404l2.m7400b().m7292c(Float.valueOf(this.f4800G), "rotationY");
        c2404l2.m7400b().m7292c(Float.valueOf(this.f4801H), "rotationZ");
        c2404l2.m7400b().m7292c(Float.valueOf(8.0f), "cameraDistance");
        c2404l2.m7400b().m7292c(new C17881e1(this.f4802I), "transformOrigin");
        c2404l2.m7400b().m7292c(this.f4803J, "shape");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4804K), "clip");
        c2404l2.m7400b().m7292c(this.f4805L, "renderEffect");
        c2404l2.m7400b().m7292c(new C17919x(this.f4806M), "ambientShadowColor");
        c2404l2.m7400b().m7292c(new C17919x(this.f4807N), "spotShadowColor");
        c2404l2.m7400b().m7292c(new C17877d0(this.f4808O), "compositingStrategy");
        c2404l2.m7400b().m7292c(new C17901o(), "blendMode");
        c2404l2.m7400b().m7292c(null, "colorFilter");
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("GraphicsLayerElement(scaleX=");
        sb4.append(this.f4809w);
        sb4.append(", scaleY=");
        sb4.append(this.f4810x);
        sb4.append(", alpha=");
        sb4.append(this.f4811y);
        sb4.append(", translationX=");
        sb4.append(this.f4812z);
        sb4.append(", translationY=");
        sb4.append(this.f4798E);
        sb4.append(", shadowElevation=");
        sb4.append(this.f4799F);
        sb4.append(", rotationX=0.0, rotationY=");
        sb4.append(this.f4800G);
        sb4.append(", rotationZ=");
        sb4.append(this.f4801H);
        sb4.append(", cameraDistance=8.0, transformOrigin=");
        sb4.append((Object) C17881e1.m51439d(this.f4802I));
        sb4.append(", shape=");
        sb4.append(this.f4803J);
        sb4.append(", clip=");
        sb4.append(this.f4804K);
        sb4.append(", renderEffect=");
        sb4.append(this.f4805L);
        sb4.append(", ambientShadowColor=");
        AbstractC13673n.m38574u(this.f4806M, ", spotShadowColor=", sb4);
        AbstractC13673n.m38574u(this.f4807N, ", compositingStrategy=", sb4);
        sb4.append((Object) C17877d0.m51434a(this.f4808O));
        sb4.append(", blendMode=");
        sb4.append((Object) C17901o.m51482a(3));
        sb4.append(", colorFilter=null)");
        return sb4.toString();
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C17872b1 c17872b1 = (C17872b1) abstractC2316v;
        c17872b1.f69538O = this.f4809w;
        c17872b1.f69539P = this.f4810x;
        c17872b1.f69540Q = this.f4811y;
        c17872b1.f69541R = this.f4812z;
        c17872b1.f69542S = this.f4798E;
        c17872b1.f69543T = this.f4799F;
        c17872b1.f69544U = this.f4800G;
        c17872b1.f69545V = this.f4801H;
        c17872b1.f69546W = 8.0f;
        c17872b1.f69547X = this.f4802I;
        c17872b1.f69548Y = this.f4803J;
        c17872b1.f69549Z = this.f4804K;
        c17872b1.f69550a0 = this.f4805L;
        c17872b1.f69551b0 = this.f4806M;
        c17872b1.f69552c0 = this.f4807N;
        c17872b1.f69553d0 = this.f4808O;
        c17872b1.f69554e0 = 3;
        NodeCoordinator nodeCoordinator = AbstractC0201g.m514n(c17872b1, 2).f4859P;
        if (nodeCoordinator != null) {
            nodeCoordinator.m3512F1(c17872b1.f69555f0, true);
        }
    }
}
