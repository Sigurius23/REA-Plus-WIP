package rf3;

import p005a3.C0226m0;
import p005a3.C0237p;
import qf3.C30330b;

/* JADX INFO: renamed from: rf3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C31365d extends AbstractC31363b {

    /* JADX INFO: renamed from: b */
    public Object f129025b;

    public C31365d(C30330b c30330b) {
        super(c30330b);
    }

    @Override // rf3.AbstractC31363b
    /* JADX INFO: renamed from: a */
    public final Object mo96460a(C0237p c0237p) {
        Object obj = this.f129025b;
        if (obj == null) {
            return super.mo96460a(c0237p);
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // rf3.AbstractC31363b
    /* JADX INFO: renamed from: b */
    public final Object mo96459b(C0237p c0237p) {
        C0226m0 c0226m0 = new C0226m0(7, this, c0237p);
        synchronized (this) {
            c0226m0.invoke();
        }
        Object obj = this.f129025b;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
