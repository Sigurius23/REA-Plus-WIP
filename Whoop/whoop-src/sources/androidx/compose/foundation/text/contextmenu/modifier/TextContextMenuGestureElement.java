package androidx.compose.foundation.text.contextmenu.modifier;

import p003a1.C0110i;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import s83.AbstractC32275i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuGestureElement;", "La3/h1;", "La1/i;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class TextContextMenuGestureElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final AbstractC32275i f4661w;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuGestureElement(Function1 function1) {
        this.f4661w = (AbstractC32275i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, s83.i] */
    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C0110i(this.f4661w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextContextMenuGestureElement) {
            return this.f4661w == ((TextContextMenuGestureElement) obj).f4661w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4661w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "TextContextMenuGestures";
        c2404l2.f9459c.m7292c(this.f4661w, "onPreShowContextMenu");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C0110i) abstractC2316v).f342Q = this.f4661w;
    }
}
