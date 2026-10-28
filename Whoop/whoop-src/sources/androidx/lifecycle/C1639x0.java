package androidx.lifecycle;

import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bc3.AbstractC3076z;
import hc3.AbstractC17182o;
import kc3.C22365e;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: androidx.lifecycle.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1639x0 extends AbstractC3076z {

    /* JADX INFO: renamed from: w */
    public final C1608n f6330w = new C1608n();

    @Override // bc3.AbstractC3076z
    public final void dispatch(InterfaceC30063j context, Runnable block) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(block, "block");
        C1608n c1608n = this.f6330w;
        c1608n.getClass();
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3069w1 abstractC3069w1Mo8825s = AbstractC17182o.f65999a.mo8825s();
        if (abstractC3069w1Mo8825s.isDispatchNeeded(context) || c1608n.f6282b || !c1608n.f6281a) {
            abstractC3069w1Mo8825s.dispatch(context, new RunnableC1605m(0, c1608n, block));
        } else {
            if (!c1608n.f6284d.offer(block)) {
                throw new IllegalStateException("cannot enqueue any more runnables");
            }
            c1608n.m5007a();
        }
    }

    @Override // bc3.AbstractC3076z
    public final boolean isDispatchNeeded(InterfaceC30063j context) {
        AbstractC22676k.m65750j(context, "context");
        C22365e c22365e = AbstractC3050q0.f12077a;
        if (AbstractC17182o.f65999a.mo8825s().isDispatchNeeded(context)) {
            return true;
        }
        C1608n c1608n = this.f6330w;
        return !(c1608n.f6282b || !c1608n.f6281a);
    }
}
