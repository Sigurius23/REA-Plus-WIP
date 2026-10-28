package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.p018ui.Modifier;
import p077d0.AbstractC11348f;
import p077d0.C11362i1;
import p636y3.C39178j;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.a */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC1103a {
    /* JADX INFO: renamed from: a */
    static Modifier m3430a(InterfaceC1103a interfaceC1103a, Modifier modifier, int i13) {
        C11362i1 c11362i1M30573u = (i13 & 1) != 0 ? AbstractC11348f.m30573u(0.0f, 400.0f, 5, null) : null;
        long j7 = 1;
        C11362i1 c11362i1M30573u2 = AbstractC11348f.m30573u(0.0f, 400.0f, 1, new C39178j((j7 & 4294967295L) | (j7 << 32)));
        C11362i1 c11362i1M30573u3 = (i13 & 4) != 0 ? AbstractC11348f.m30573u(0.0f, 400.0f, 5, null) : null;
        ((C1104b) interfaceC1103a).getClass();
        return modifier.mo3471e(new LazyLayoutAnimateItemElement(c11362i1M30573u, c11362i1M30573u2, c11362i1M30573u3));
    }

    /* JADX INFO: renamed from: b */
    static Modifier m3431b(InterfaceC1103a interfaceC1103a, Modifier modifier) {
        return modifier.mo3471e(new ParentSizeElement(1.0f, null, ((C1104b) interfaceC1103a).f4600b, "fillParentMaxHeight", 2));
    }
}
