package bc3;

import hc3.C17191x;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: renamed from: bc3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C2993c extends AbstractC3035m1 {

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11998H = AtomicReferenceFieldUpdater.newUpdater(C2993c.class, Object.class, "_disposer$volatile");

    /* JADX INFO: renamed from: E */
    public final C3033m f11999E;

    /* JADX INFO: renamed from: F */
    public InterfaceC3056s0 f12000F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C3001e f12001G;
    private volatile /* synthetic */ Object _disposer$volatile;

    public C2993c(C3001e c3001e, C3033m c3033m) {
        this.f12001G = c3001e;
        this.f11999E = c3033m;
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: i */
    public final boolean mo8685i() {
        return false;
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: j */
    public final void mo8686j(Throwable th3) throws DispatchException {
        C3033m c3033m = this.f11999E;
        if (th3 != null) {
            C17191x c17191xM8760F = c3033m.m8760F(th3);
            if (c17191xM8760F != null) {
                c3033m.mo8746n(c17191xM8760F);
                C2997d c2997d = (C2997d) f11998H.get(this);
                if (c2997d != null) {
                    c2997d.m8689b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3001e.f12010b;
        C3001e c3001e = this.f12001G;
        if (atomicIntegerFieldUpdater.decrementAndGet(c3001e) == 0) {
            InterfaceC3018i0[] interfaceC3018i0Arr = c3001e.f12011a;
            ArrayList arrayList = new ArrayList(interfaceC3018i0Arr.length);
            for (InterfaceC3018i0 interfaceC3018i0 : interfaceC3018i0Arr) {
                arrayList.add(interfaceC3018i0.m8741b());
            }
            c3033m.resumeWith(arrayList);
        }
    }
}
