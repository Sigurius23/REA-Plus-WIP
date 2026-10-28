package bc3;

import a11.C0129g;
import hc3.AbstractC17167b;
import hc3.C17173f;
import hc3.C17174g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.InterfaceC23457c;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30054a;
import q83.AbstractC30055b;
import q83.C30058e;
import q83.InterfaceC30057d;
import q83.InterfaceC30059f;
import q83.InterfaceC30061h;
import q83.InterfaceC30062i;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: bc3.z */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3076z extends AbstractC30054a implements InterfaceC30059f {
    public static final C3073y Key = new C3073y(C30058e.f122675w, new C0129g(12));

    public AbstractC3076z() {
        super(C30058e.f122675w);
    }

    public static /* synthetic */ AbstractC3076z limitedParallelism$default(AbstractC3076z abstractC3076z, int i13, String str, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i14 & 2) != 0) {
            str = null;
        }
        return abstractC3076z.limitedParallelism(i13, str);
    }

    public abstract void dispatch(InterfaceC30063j interfaceC30063j, Runnable runnable);

    public void dispatchYield(InterfaceC30063j interfaceC30063j, Runnable runnable) {
        AbstractC17167b.m48482h(this, interfaceC30063j, runnable);
    }

    @Override // q83.AbstractC30054a, q83.InterfaceC30063j
    public <E extends InterfaceC30061h> E get(InterfaceC30062i key) {
        E e5;
        AbstractC22676k.m65750j(key, "key");
        if (key instanceof AbstractC30055b) {
            AbstractC30055b abstractC30055b = (AbstractC30055b) key;
            InterfaceC30062i key2 = getKey();
            AbstractC22676k.m65750j(key2, "key");
            if ((key2 == abstractC30055b || abstractC30055b.f122672x == key2) && (e5 = (E) abstractC30055b.f122671w.invoke(this)) != null) {
                return e5;
            }
        } else if (C30058e.f122675w == key) {
            return this;
        }
        return null;
    }

    @Override // q83.InterfaceC30059f
    public final <T> InterfaceC30057d<T> interceptContinuation(InterfaceC30057d<? super T> interfaceC30057d) {
        return new C17173f(this, interfaceC30057d);
    }

    public boolean isDispatchNeeded(InterfaceC30063j interfaceC30063j) {
        return true;
    }

    public AbstractC3076z limitedParallelism(int i13, String str) {
        AbstractC17167b.m48475a(i13);
        return new C17174g(this, i13, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (((q83.InterfaceC30061h) r3.f122671w.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (q83.C30058e.f122675w == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        return q83.C30064k.f122676w;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        return r2;
     */
    @Override // q83.AbstractC30054a, q83.InterfaceC30063j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q83.InterfaceC30063j minusKey(q83.InterfaceC30062i r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r3, r0)
            boolean r1 = r3 instanceof q83.AbstractC30055b
            if (r1 == 0) goto L25
            q83.b r3 = (q83.AbstractC30055b) r3
            q83.i r1 = r2.getKey()
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r1, r0)
            if (r1 == r3) goto L1a
            q83.i r0 = r3.f122672x
            if (r0 != r1) goto L19
            goto L1a
        L19:
            return r2
        L1a:
            kotlin.jvm.functions.Function1 r3 = r3.f122671w
            java.lang.Object r3 = r3.invoke(r2)
            q83.h r3 = (q83.InterfaceC30061h) r3
            if (r3 == 0) goto L2c
            goto L29
        L25:
            q83.e r0 = q83.C30058e.f122675w
            if (r0 != r3) goto L2c
        L29:
            q83.k r3 = q83.C30064k.f122676w
            return r3
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bc3.AbstractC3076z.minusKey(q83.i):q83.j");
    }

    @InterfaceC23457c
    public final AbstractC3076z plus(AbstractC3076z abstractC3076z) {
        return abstractC3076z;
    }

    @Override // q83.InterfaceC30059f
    public final void releaseInterceptedContinuation(InterfaceC30057d<?> interfaceC30057d) {
        AbstractC22676k.m65748h(interfaceC30057d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        C17173f c17173f = (C17173f) interfaceC30057d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C17173f.f65973H;
        while (atomicReferenceFieldUpdater.get(c17173f) == AbstractC17167b.f65958c) {
        }
        Object obj = atomicReferenceFieldUpdater.get(c17173f);
        C3033m c3033m = obj instanceof C3033m ? (C3033m) obj : null;
        if (c3033m != null) {
            c3033m.m8770o();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC3006f0.m8724r(this);
    }

    @InterfaceC23457c
    public /* synthetic */ AbstractC3076z limitedParallelism(int i13) {
        return limitedParallelism(i13, null);
    }
}
