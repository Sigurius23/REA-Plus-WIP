package kh3;

import eh3.C13201e;
import eh3.C13205i;
import eh3.C13206j;
import eh3.InterfaceC13213q;
import gh3.ThreadFactoryC15864i;
import java.util.concurrent.atomic.AtomicReference;
import jh3.C21705f;

/* JADX INFO: renamed from: kh3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C22488a {

    /* JADX INFO: renamed from: d */
    public static final AtomicReference f88180d = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public final C13205i f88181a;

    /* JADX INFO: renamed from: b */
    public final C13201e f88182b;

    /* JADX INFO: renamed from: c */
    public final C13206j f88183c;

    public C22488a() {
        C21705f.f83334f.m61160e().getClass();
        this.f88181a = new C13205i(new ThreadFactoryC15864i("RxComputationScheduler-"));
        this.f88182b = new C13201e(new ThreadFactoryC15864i("RxIoScheduler-"));
        this.f88183c = new C13206j(new ThreadFactoryC15864i("RxNewThreadScheduler-"));
    }

    /* JADX INFO: renamed from: a */
    public static C22488a m64989a() {
        while (true) {
            AtomicReference atomicReference = f88180d;
            C22488a c22488a = (C22488a) atomicReference.get();
            if (c22488a != null) {
                return c22488a;
            }
            C22488a c22488a2 = new C22488a();
            while (!atomicReference.compareAndSet(null, c22488a2)) {
                if (atomicReference.get() != null) {
                    synchronized (c22488a2) {
                        try {
                            C13205i c13205i = c22488a2.f88181a;
                            if (c13205i != null) {
                                c13205i.shutdown();
                            }
                            C13201e c13201e = c22488a2.f88182b;
                            if (c13201e != null) {
                                c13201e.shutdown();
                            }
                            Object obj = c22488a2.f88183c;
                            if (obj instanceof InterfaceC13213q) {
                                ((InterfaceC13213q) obj).shutdown();
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            return c22488a2;
        }
    }
}
