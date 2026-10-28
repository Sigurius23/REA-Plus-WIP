package bc3;

import hc3.AbstractC17167b;
import hc3.C17173f;
import hc3.C17191x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: bc3.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C3041o extends AbstractC3035m1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f12062E;

    /* JADX INFO: renamed from: F */
    public final C3033m f12063F;

    public /* synthetic */ C3041o(C3033m c3033m, int i13) {
        this.f12062E = i13;
        this.f12063F = c3033m;
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: i */
    public final boolean mo8685i() {
        switch (this.f12062E) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // bc3.AbstractC3035m1
    /* JADX INFO: renamed from: j */
    public final void mo8686j(Throwable th3) {
        switch (this.f12062E) {
            case 0:
                C3060t1 c3060t1M8786h = m8786h();
                C3033m c3033m = this.f12063F;
                Throwable thMo8772q = c3033m.mo8772q(c3060t1M8786h);
                if (c3033m.m8779x()) {
                    C17173f c17173f = (C17173f) c3033m.f12055z;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C17173f.f65973H;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c17173f);
                        C17191x c17191x = AbstractC17167b.f65958c;
                        if (AbstractC22676k.m65745e(obj, c17191x)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c17173f, c17191x, thMo8772q)) {
                                if (atomicReferenceFieldUpdater.get(c17173f) != c17191x) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(c17173f, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(c17173f) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                c3033m.cancel(thMo8772q);
                if (!c3033m.m8779x()) {
                    c3033m.m8770o();
                }
                break;
            default:
                this.f12063F.resumeWith(C23454a0.f92919a);
                break;
        }
    }
}
