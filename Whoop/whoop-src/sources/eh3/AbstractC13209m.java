package eh3;

import bh3.InterfaceC3254a;
import fh3.C14493a;
import fh3.EnumC14494b;
import java.util.concurrent.TimeUnit;
import xg3.AbstractC38283j;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: eh3.m */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13209m {

    /* JADX INFO: renamed from: a */
    public static final long f45786a = TimeUnit.MINUTES.toNanos(Long.getLong("rx.scheduler.drift-tolerance", 15).longValue());

    /* JADX INFO: renamed from: a */
    public static C14493a m37112a(AbstractC38283j abstractC38283j, InterfaceC3254a interfaceC3254a, long j7, long j13, TimeUnit timeUnit) {
        InterfaceC38293t interfaceC38293t;
        long nanos = timeUnit.toNanos(j13);
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        abstractC38283j.getClass();
        long nanos2 = timeUnit2.toNanos(System.currentTimeMillis());
        long nanos3 = timeUnit.toNanos(j7) + nanos2;
        C14493a c14493a = new C14493a();
        C14493a c14493a2 = new C14493a();
        c14493a2.lazySet(c14493a);
        InterfaceC38293t interfaceC38293tMo37107d = abstractC38283j.mo37107d(new C13208l(nanos2, nanos3, interfaceC3254a, c14493a2, abstractC38283j, nanos), j7, timeUnit);
        do {
            interfaceC38293t = (InterfaceC38293t) c14493a.get();
            if (interfaceC38293t == EnumC14494b.f52923w) {
                interfaceC38293tMo37107d.mo14750b();
                return c14493a2;
            }
        } while (!c14493a.compareAndSet(interfaceC38293t, interfaceC38293tMo37107d));
        return c14493a2;
    }
}
