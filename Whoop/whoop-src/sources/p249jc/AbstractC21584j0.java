package p249jc;

import bc3.C3033m;
import ge3.AbstractC15751g;
import ja3.C21516l;
import java.util.concurrent.ExecutionException;
import p073cq.RunnableC11044m;
import p097ds.InterfaceFutureC12319v;
import p218ic.AbstractC18388v;
import p218ic.C18389w;
import p218ic.EnumC18364j;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: jc.j0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21584j0 {

    /* JADX INFO: renamed from: a */
    public static final String f82776a;

    static {
        String strM52887f = C18389w.m52887f("WorkerWrapper");
        AbstractC22676k.m65749i(strM52887f, "tagWithPrefix(...)");
        f82776a = strM52887f;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m60630a(InterfaceFutureC12319v interfaceFutureC12319v, AbstractC18388v abstractC18388v, AbstractC32275i abstractC32275i) {
        Object obj;
        try {
            boolean z4 = false;
            if (!interfaceFutureC12319v.isDone()) {
                C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(abstractC32275i));
                c3033m.m8774s();
                interfaceFutureC12319v.mo31061a(new RunnableC11044m(interfaceFutureC12319v, c3033m, false, 8), EnumC18364j.f71497w);
                c3033m.m8776u(new C21516l(2, abstractC18388v, interfaceFutureC12319v));
                Object objM8773r = c3033m.m8773r();
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                return objM8773r;
            }
            while (true) {
                try {
                    obj = interfaceFutureC12319v.get();
                    break;
                } catch (InterruptedException unused) {
                    z4 = true;
                } catch (Throwable th3) {
                    if (z4) {
                        Thread.currentThread().interrupt();
                    }
                    throw th3;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
            return obj;
        } catch (ExecutionException e5) {
            Throwable cause = e5.getCause();
            AbstractC22676k.m65747g(cause);
            throw cause;
        }
    }
}
