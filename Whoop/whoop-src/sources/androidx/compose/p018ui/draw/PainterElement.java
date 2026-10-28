package androidx.compose.p018ui.draw;

import p000.AbstractC11266d;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p026b2.InterfaceC2302h;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p181h2.C16620e;
import p208i2.AbstractC17921y;
import p331n2.AbstractC26165a;
import p635y2.InterfaceC39105k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Landroidx/compose/ui/draw/PainterElement;", "La3/h1;", "Landroidx/compose/ui/draw/PainterNode;", "Ln2/a;", "painter", "Ln2/a;", "getPainter", "()Ln2/a;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final /* data */ class PainterElement extends AbstractC0207h1 {
    private final AbstractC26165a painter;

    /* JADX INFO: renamed from: w */
    public final InterfaceC2302h f4778w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC39105k f4779x;

    /* JADX INFO: renamed from: y */
    public final float f4780y;

    /* JADX INFO: renamed from: z */
    public final AbstractC17921y f4781z;

    public PainterElement(AbstractC26165a abstractC26165a, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k, float f13, AbstractC17921y abstractC17921y) {
        this.painter = abstractC26165a;
        this.f4778w = interfaceC2302h;
        this.f4779x = interfaceC39105k;
        this.f4780y = f13;
        this.f4781z = abstractC17921y;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new PainterNode(this.painter, this.f4778w, this.f4779x, this.f4780y, this.f4781z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return AbstractC22676k.m65745e(this.painter, painterElement.painter) && AbstractC22676k.m65745e(this.f4778w, painterElement.f4778w) && AbstractC22676k.m65745e(this.f4779x, painterElement.f4779x) && Float.compare(this.f4780y, painterElement.f4780y) == 0 && AbstractC22676k.m65745e(this.f4781z, painterElement.f4781z);
    }

    public final int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.f4780y, (this.f4779x.hashCode() + ((this.f4778w.hashCode() + AbstractC2875y.m8289b(this.painter.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        AbstractC17921y abstractC17921y = this.f4781z;
        return iM30447a + (abstractC17921y == null ? 0 : abstractC17921y.hashCode());
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("paint");
        c2404l2.m7400b().m7292c(this.painter, "painter");
        c2404l2.m7400b().m7292c(Boolean.TRUE, "sizeToIntrinsics");
        c2404l2.m7400b().m7292c(this.f4778w, "alignment");
        c2404l2.m7400b().m7292c(this.f4779x, "contentScale");
        c2404l2.m7400b().m7292c(Float.valueOf(this.f4780y), "alpha");
        c2404l2.m7400b().m7292c(this.f4781z, "colorFilter");
    }

    public final String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=true, alignment=" + this.f4778w + ", contentScale=" + this.f4779x + ", alpha=" + this.f4780y + ", colorFilter=" + this.f4781z + ')';
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        PainterNode painterNode = (PainterNode) abstractC2316v;
        painterNode.getClass();
        boolean zM47210b = C16620e.m47210b(painterNode.getPainter().getF4822H(), this.painter.getF4822H());
        painterNode.m3477c1(this.painter);
        painterNode.f4782O = this.f4778w;
        painterNode.f4783P = this.f4779x;
        painterNode.f4784Q = this.f4780y;
        painterNode.f4785R = this.f4781z;
        if (!zM47210b) {
            AbstractC0201g.m509i(painterNode);
        }
        AbstractC0201g.m508h(painterNode);
    }
}
