package androidx.compose.p018ui.draw;

import androidx.compose.p018ui.node.NodeCoordinator;
import p000.AbstractC11266d;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p005a3.C0227m1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p208i2.C17905q;
import p208i2.C17919x;
import p208i2.InterfaceC17869a1;
import p636y3.C39174f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "La3/h1;", "Li2/q;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class ShadowGraphicsLayerElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final long f4786E;

    /* JADX INFO: renamed from: w */
    public final float f4787w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC17869a1 f4788x;

    /* JADX INFO: renamed from: y */
    public final boolean f4789y;

    /* JADX INFO: renamed from: z */
    public final long f4790z;

    public ShadowGraphicsLayerElement(float f13, InterfaceC17869a1 interfaceC17869a1, boolean z4, long j7, long j13) {
        this.f4787w = f13;
        this.f4788x = interfaceC17869a1;
        this.f4789y = z4;
        this.f4790z = j7;
        this.f4786E = j13;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C17905q(new C0227m1(this, 12));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) obj;
        return C39174f.m124782b(this.f4787w, shadowGraphicsLayerElement.f4787w) && AbstractC22676k.m65745e(this.f4788x, shadowGraphicsLayerElement.f4788x) && this.f4789y == shadowGraphicsLayerElement.f4789y && C17919x.m51542d(this.f4790z, shadowGraphicsLayerElement.f4790z) && C17919x.m51542d(this.f4786E, shadowGraphicsLayerElement.f4786E);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.f4788x.hashCode() + (Float.hashCode(this.f4787w) * 31)) * 31, 31, this.f4789y);
        int i13 = C17919x.f69638o;
        return Long.hashCode(this.f4786E) + AbstractC11266d.m30451e(iM8289b, this.f4790z, 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("shadow");
        c2404l2.m7400b().m7292c(new C39174f(this.f4787w), "elevation");
        c2404l2.m7400b().m7292c(this.f4788x, "shape");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4789y), "clip");
        c2404l2.m7400b().m7292c(new C17919x(this.f4790z), "ambientColor");
        c2404l2.m7400b().m7292c(new C17919x(this.f4786E), "spotColor");
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        AbstractC13673n.m38572s(this.f4787w, ", shape=", sb4);
        sb4.append(this.f4788x);
        sb4.append(", clip=");
        sb4.append(this.f4789y);
        sb4.append(", ambientColor=");
        AbstractC13673n.m38574u(this.f4790z, ", spotColor=", sb4);
        sb4.append((Object) C17919x.m51548j(this.f4786E));
        sb4.append(')');
        return sb4.toString();
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C17905q c17905q = (C17905q) abstractC2316v;
        c17905q.f69606O = new C0227m1(this, 12);
        NodeCoordinator nodeCoordinator = AbstractC0201g.m514n(c17905q, 2).f4859P;
        if (nodeCoordinator != null) {
            nodeCoordinator.m3512F1(c17905q.f69606O, true);
        }
    }
}
