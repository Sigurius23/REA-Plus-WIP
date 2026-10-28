package ch3;

import fh3.C14493a;
import java.util.concurrent.atomic.AtomicBoolean;
import jh3.AbstractC21700a;
import xg3.AbstractC38291r;
import xg3.InterfaceC38290q;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: ch3.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4716w0 extends AtomicBoolean implements InterfaceC38290q, InterfaceC38293t {

    /* JADX INFO: renamed from: w */
    public final AbstractC38291r f19293w;

    /* JADX INFO: renamed from: x */
    public final C14493a f19294x = new C14493a();

    public C4716w0(AbstractC38291r abstractC38291r) {
        this.f19293w = abstractC38291r;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return get();
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        if (compareAndSet(false, true)) {
            this.f19294x.mo14750b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14774c(Throwable th3) {
        C14493a c14493a = this.f19294x;
        if (!compareAndSet(false, true)) {
            AbstractC21700a.m61126a(th3);
            return;
        }
        try {
            this.f19293w.mo14742d(th3);
        } finally {
            c14493a.mo14750b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m14775d(Object obj) {
        C14493a c14493a = this.f19294x;
        if (compareAndSet(false, true)) {
            try {
                this.f19293w.mo14743e(obj);
            } finally {
                c14493a.mo14750b();
            }
        }
    }
}
