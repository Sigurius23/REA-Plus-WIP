package androidx.compose.p018ui.semantics;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p209i3.AbstractC18032n;
import p209i3.C18021c;
import p209i3.C18030l;
import p209i3.InterfaceC18031m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m65681d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "La3/h1;", "Li3/c;", "Li3/m;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ClearAndSetSemanticsElement extends AbstractC0207h1 implements InterfaceC18031m {

    /* JADX INFO: renamed from: w */
    public final Function1 f4985w;

    public ClearAndSetSemanticsElement(Function1 function1) {
        this.f4985w = function1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C18021c(this.f4985w, false, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClearAndSetSemanticsElement) {
            return this.f4985w == ((ClearAndSetSemanticsElement) obj).f4985w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4985w.hashCode();
    }

    @Override // p209i3.InterfaceC18031m
    /* JADX INFO: renamed from: i */
    public final C18030l mo3600i() {
        C18030l c18030l = new C18030l();
        c18030l.f69982y = false;
        c18030l.f69983z = true;
        this.f4985w.invoke(c18030l);
        return c18030l;
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("clearAndSetSemantics");
        AbstractC18032n.m51773a(c2404l2, mo3600i());
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C18021c) abstractC2316v).f69937Q = this.f4985w;
    }
}
