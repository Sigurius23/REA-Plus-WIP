package coil.compose;

import p000.AbstractC11266d;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p026b2.InterfaceC2302h;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p181h2.C16620e;
import p331n2.AbstractC26165a;
import p635y2.InterfaceC39105k;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m65681d2 = {"Lcoil/compose/ContentPainterElement;", "La3/h1;", "Lcoil/compose/ContentPainterNode;", "Ln2/a;", "painter", "Ln2/a;", "coil-compose-base_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class ContentPainterElement extends AbstractC0207h1 {
    private final AbstractC26165a painter;

    /* JADX INFO: renamed from: w */
    public final InterfaceC2302h f20228w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC39105k f20229x;

    /* JADX INFO: renamed from: y */
    public final float f20230y;

    public ContentPainterElement(AbstractC26165a abstractC26165a, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k, float f13) {
        this.painter = abstractC26165a;
        this.f20228w = interfaceC2302h;
        this.f20229x = interfaceC39105k;
        this.f20230y = f13;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new ContentPainterNode(this.painter, this.f20228w, this.f20229x, this.f20230y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPainterElement)) {
            return false;
        }
        ContentPainterElement contentPainterElement = (ContentPainterElement) obj;
        return AbstractC22676k.m65745e(this.painter, contentPainterElement.painter) && AbstractC22676k.m65745e(this.f20228w, contentPainterElement.f20228w) && AbstractC22676k.m65745e(this.f20229x, contentPainterElement.f20229x) && Float.compare(this.f20230y, contentPainterElement.f20230y) == 0;
    }

    public final int hashCode() {
        return AbstractC11266d.m30447a(this.f20230y, (this.f20229x.hashCode() + ((this.f20228w.hashCode() + (this.painter.hashCode() * 31)) * 31)) * 31, 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "content";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(this.painter, "painter");
        c2365d3.m7292c(this.f20228w, "alignment");
        c2365d3.m7292c(this.f20229x, "contentScale");
        c2365d3.m7292c(Float.valueOf(this.f20230y), "alpha");
        c2365d3.m7292c(null, "colorFilter");
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("ContentPainterElement(painter=");
        sb4.append(this.painter);
        sb4.append(", alignment=");
        sb4.append(this.f20228w);
        sb4.append(", contentScale=");
        sb4.append(this.f20229x);
        sb4.append(", alpha=");
        return AbstractC30007c.m91837g(this.f20230y, ", colorFilter=null)", sb4);
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ContentPainterNode contentPainterNode = (ContentPainterNode) abstractC2316v;
        boolean zM47210b = C16620e.m47210b(contentPainterNode.getPainter().getF4822H(), this.painter.getF4822H());
        contentPainterNode.m15511a1(this.painter);
        contentPainterNode.f20231O = this.f20228w;
        contentPainterNode.f20232P = this.f20229x;
        contentPainterNode.f20233Q = this.f20230y;
        if (!zM47210b) {
            AbstractC0201g.m509i(contentPainterNode);
        }
        AbstractC0201g.m508h(contentPainterNode);
    }
}
