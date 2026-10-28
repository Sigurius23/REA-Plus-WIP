package androidx.compose.foundation;

import c93.InterfaceC4339a;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p132f0.C13833w;
import p132f0.InterfaceC13832v0;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/ClickableElement;", "La3/h1;", "Lf0/w;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class ClickableElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final String f4483E;

    /* JADX INFO: renamed from: F */
    public final C18027i f4484F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC4339a f4485G;

    /* JADX INFO: renamed from: w */
    public final InterfaceC21083i f4486w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC13832v0 f4487x;

    /* JADX INFO: renamed from: y */
    public final boolean f4488y;

    /* JADX INFO: renamed from: z */
    public final boolean f4489z;

    public ClickableElement(InterfaceC21083i interfaceC21083i, InterfaceC13832v0 interfaceC13832v0, boolean z4, boolean z13, String str, C18027i c18027i, InterfaceC4339a interfaceC4339a) {
        this.f4486w = interfaceC21083i;
        this.f4487x = interfaceC13832v0;
        this.f4488y = z4;
        this.f4489z = z13;
        this.f4483E = str;
        this.f4484F = c18027i;
        this.f4485G = interfaceC4339a;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C13833w(this.f4486w, this.f4487x, this.f4488y, this.f4489z, this.f4483E, this.f4484F, this.f4485G);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return AbstractC22676k.m65745e(this.f4486w, clickableElement.f4486w) && AbstractC22676k.m65745e(this.f4487x, clickableElement.f4487x) && this.f4488y == clickableElement.f4488y && this.f4489z == clickableElement.f4489z && AbstractC22676k.m65745e(this.f4483E, clickableElement.f4483E) && AbstractC22676k.m65745e(this.f4484F, clickableElement.f4484F) && this.f4485G == clickableElement.f4485G;
    }

    public final int hashCode() {
        InterfaceC21083i interfaceC21083i = this.f4486w;
        int iHashCode = (interfaceC21083i != null ? interfaceC21083i.hashCode() : 0) * 31;
        InterfaceC13832v0 interfaceC13832v0 = this.f4487x;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (interfaceC13832v0 != null ? interfaceC13832v0.hashCode() : 0)) * 31, 31, this.f4488y), 31, this.f4489z);
        String str = this.f4483E;
        int iHashCode2 = (iM8289b + (str != null ? str.hashCode() : 0)) * 31;
        C18027i c18027i = this.f4484F;
        return this.f4485G.hashCode() + ((iHashCode2 + (c18027i != null ? Integer.hashCode(c18027i.f69949a) : 0)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("clickable");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4489z), "enabled");
        c2404l2.m7400b().m7292c(this.f4485G, "onClick");
        c2404l2.m7400b().m7292c(this.f4483E, "onClickLabel");
        c2404l2.m7400b().m7292c(this.f4484F, "role");
        c2404l2.m7400b().m7292c(this.f4486w, "interactionSource");
        c2404l2.m7400b().m7292c(this.f4487x, "indicationNodeFactory");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C13833w) abstractC2316v).m39154j1(this.f4486w, this.f4487x, this.f4488y, this.f4489z, this.f4483E, this.f4484F, this.f4485G);
    }
}
