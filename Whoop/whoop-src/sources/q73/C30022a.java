package q73;

import bi.AbstractC3269g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import jc3.C21607a;
import n73.InterfaceC26443b;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: q73.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C30022a extends AtomicReference implements InterfaceC26443b {
    @Override // n73.InterfaceC26443b
    public final void dispose() {
        C21607a c21607a;
        if (get() == null || (c21607a = (C21607a) getAndSet(null)) == null) {
            return;
        }
        try {
            c21607a.f82938a.cancel((CancellationException) null);
        } catch (Exception e5) {
            AbstractC3269g.m9495a0(e5);
            AbstractC21598x.m60677d0(e5);
        }
    }

    @Override // n73.InterfaceC26443b
    public final boolean isDisposed() {
        return get() == null;
    }
}
