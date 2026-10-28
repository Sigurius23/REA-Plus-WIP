package mc3;

import bc3.C3029l;
import bc3.C3033m;
import bc3.InterfaceC3025k;
import bc3.InterfaceC3044o2;
import hc3.AbstractC17189v;
import hc3.C17191x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.DispatchException;
import l83.C23454a0;
import p007a6.C0428i;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: mc3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C25436b implements InterfaceC3025k, InterfaceC3044o2 {

    /* JADX INFO: renamed from: w */
    public final C3033m f99624w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25437c f99625x;

    public C25436b(C25437c c25437c, C3033m c3033m) {
        this.f99625x = c25437c;
        this.f99624w = c3033m;
    }

    @Override // bc3.InterfaceC3044o2
    /* JADX INFO: renamed from: b */
    public final void mo8762b(AbstractC17189v abstractC17189v, int i13) {
        this.f99624w.mo8762b(abstractC17189v, i13);
    }

    @Override // bc3.InterfaceC3025k
    /* JADX INFO: renamed from: c */
    public final C17191x mo8743c(Object obj, Function3 function3) {
        C25437c c25437c = this.f99625x;
        C3029l c3029l = new C3029l(c25437c, this);
        C17191x c17191xM8759E = this.f99624w.m8759E((C23454a0) obj, c3029l);
        if (c17191xM8759E != null) {
            C25437c.f99626H.set(c25437c, null);
        }
        return c17191xM8759E;
    }

    @Override // bc3.InterfaceC3025k
    public final boolean cancel(Throwable th3) {
        return this.f99624w.cancel(th3);
    }

    @Override // bc3.InterfaceC3025k
    /* JADX INFO: renamed from: e */
    public final void mo8744e(Object obj, Function1 function1) throws DispatchException {
        this.f99624w.mo8744e((C23454a0) obj, function1);
    }

    @Override // bc3.InterfaceC3025k
    /* JADX INFO: renamed from: g */
    public final void mo8745g(Object obj, Function3 function3) throws DispatchException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C25437c.f99626H;
        C25437c c25437c = this.f99625x;
        atomicReferenceFieldUpdater.set(c25437c, null);
        C0428i c0428i = new C0428i(c25437c, this);
        this.f99624w.mo8744e((C23454a0) obj, c0428i);
    }

    @Override // q83.InterfaceC30057d
    public final InterfaceC30063j getContext() {
        return this.f99624w.f12054E;
    }

    @Override // bc3.InterfaceC3025k
    public final boolean isActive() {
        return this.f99624w.isActive();
    }

    @Override // bc3.InterfaceC3025k
    /* JADX INFO: renamed from: n */
    public final void mo8746n(Object obj) throws DispatchException {
        this.f99624w.mo8746n(obj);
    }

    @Override // q83.InterfaceC30057d
    public final void resumeWith(Object obj) {
        this.f99624w.resumeWith(obj);
    }
}
