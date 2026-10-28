package androidx.compose.p018ui.layout;

import androidx.compose.p018ui.Modifier;
import p635y2.InterfaceC39072a0;
import p635y2.InterfaceC39124q0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: androidx.compose.ui.layout.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1131a {
    /* JADX INFO: renamed from: a */
    public static final Object m3497a(InterfaceC39124q0 interfaceC39124q0) {
        Object objMo454p = interfaceC39124q0.mo454p();
        InterfaceC39072a0 interfaceC39072a0 = objMo454p instanceof InterfaceC39072a0 ? (InterfaceC39072a0) objMo454p : null;
        if (interfaceC39072a0 != null) {
            return interfaceC39072a0.mo35475T();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Modifier m3498b(Modifier modifier, Function3 function3) {
        return modifier.mo3471e(new LayoutElement(function3));
    }

    /* JADX INFO: renamed from: c */
    public static final Modifier m3499c(Modifier modifier, String str) {
        return modifier.mo3471e(new LayoutIdElement(str));
    }

    /* JADX INFO: renamed from: d */
    public static final Modifier m3500d(Modifier modifier, Function1 function1) {
        return modifier.mo3471e(new OnGloballyPositionedElement(function1));
    }
}
