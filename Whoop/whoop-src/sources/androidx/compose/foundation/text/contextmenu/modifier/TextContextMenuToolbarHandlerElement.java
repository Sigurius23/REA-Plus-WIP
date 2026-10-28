package androidx.compose.foundation.text.contextmenu.modifier;

import p003a1.C0112k;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import ro.C31624i;
import s83.AbstractC32275i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/text/contextmenu/modifier/TextContextMenuToolbarHandlerElement;", "La3/h1;", "La1/k;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class TextContextMenuToolbarHandlerElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C31624i f4662w;

    /* JADX INFO: renamed from: x */
    public final AbstractC32275i f4663x;

    /* JADX INFO: renamed from: y */
    public final Function1 f4664y;

    /* JADX INFO: renamed from: z */
    public final Function1 f4665z;

    /* JADX WARN: Multi-variable type inference failed */
    public TextContextMenuToolbarHandlerElement(C31624i c31624i, Function1 function1, Function1 function2, Function1 function3) {
        this.f4662w = c31624i;
        this.f4663x = (AbstractC32275i) function1;
        this.f4664y = function2;
        this.f4665z = function3;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.functions.Function1, s83.i] */
    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C0112k(this.f4662w, this.f4663x, this.f4664y, this.f4665z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextContextMenuToolbarHandlerElement)) {
            return false;
        }
        TextContextMenuToolbarHandlerElement textContextMenuToolbarHandlerElement = (TextContextMenuToolbarHandlerElement) obj;
        return this.f4662w == textContextMenuToolbarHandlerElement.f4662w && this.f4663x == textContextMenuToolbarHandlerElement.f4663x && this.f4664y == textContextMenuToolbarHandlerElement.f4664y && this.f4665z == textContextMenuToolbarHandlerElement.f4665z;
    }

    public final int hashCode() {
        int iHashCode = (this.f4663x.hashCode() + (this.f4662w.hashCode() * 31)) * 31;
        Function1 function1 = this.f4664y;
        return this.f4665z.hashCode() + ((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C0112k c0112k = (C0112k) abstractC2316v;
        c0112k.f346Q.f130665x = null;
        C31624i c31624i = this.f4662w;
        c0112k.f346Q = c31624i;
        c31624i.f130665x = c0112k;
        c0112k.f347R = this.f4663x;
        c0112k.f348S = this.f4664y;
        c0112k.f349T = this.f4665z;
    }
}
