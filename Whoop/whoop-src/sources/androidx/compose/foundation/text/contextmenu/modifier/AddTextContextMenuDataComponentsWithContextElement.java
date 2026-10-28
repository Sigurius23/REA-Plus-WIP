package androidx.compose.foundation.text.contextmenu.modifier;

import c93.InterfaceC4351m;
import p003a1.C0102a;
import p003a1.C0103b;
import p003a1.C0104c;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/AddTextContextMenuDataComponentsWithContextElement;", "La3/h1;", "La1/c;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class AddTextContextMenuDataComponentsWithContextElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC4351m f4660w;

    public AddTextContextMenuDataComponentsWithContextElement(InterfaceC4351m interfaceC4351m) {
        this.f4660w = interfaceC4351m;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C0104c c0104c = new C0104c();
        c0104c.f330Q = this.f4660w;
        C0103b c0103b = new C0103b(c0104c, 0);
        C0102a c0102a = new C0102a();
        c0102a.f327O = c0103b;
        c0104c.m665X0(c0102a);
        return c0104c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddTextContextMenuDataComponentsWithContextElement) {
            return this.f4660w == ((AddTextContextMenuDataComponentsWithContextElement) obj).f4660w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4660w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "addTextContextMenuDataComponentsWithResources";
        c2404l2.f9459c.m7292c(this.f4660w, "builder");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C0104c) abstractC2316v).f330Q = this.f4660w;
    }
}
