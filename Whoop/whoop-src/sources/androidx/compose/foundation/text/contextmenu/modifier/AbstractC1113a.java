package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.p018ui.Modifier;
import c93.InterfaceC4351m;
import hg3.AbstractC17269i;
import p133f1.C13950j1;
import p181h2.C16618c;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39147y;
import p715kotlin.jvm.functions.Function1;
import ro.C31624i;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1113a {
    /* JADX INFO: renamed from: a */
    public static final Modifier m3450a(Modifier modifier, InterfaceC4351m interfaceC4351m) {
        return modifier.mo3471e(new AddTextContextMenuDataComponentsWithContextElement(interfaceC4351m));
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m3451b(Function1 function1) {
        return new TextContextMenuGestureElement(function1);
    }

    /* JADX INFO: renamed from: c */
    public static final Modifier m3452c(Modifier modifier, C31624i c31624i, Function1 function1, C13950j1 c13950j1, Function1 function2) {
        return modifier.mo3471e(new TextContextMenuToolbarHandlerElement(c31624i, function1, c13950j1, function2));
    }

    /* JADX INFO: renamed from: d */
    public static final C16618c m3453d(C16618c c16618c, InterfaceC39147y interfaceC39147y, InterfaceC39147y interfaceC39147y2) {
        if (!interfaceC39147y.mo3532g() || !interfaceC39147y2.mo3532g()) {
            return C16618c.f63938e;
        }
        return AbstractC17269i.m48896j(interfaceC39147y2.mo3537k(AbstractC39125q1.m124662h(interfaceC39147y), c16618c.m47200f()), c16618c.m47199e());
    }
}
