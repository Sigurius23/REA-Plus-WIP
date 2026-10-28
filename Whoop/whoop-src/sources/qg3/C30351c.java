package qg3;

import java.util.concurrent.atomic.AtomicInteger;
import jh3.C21705f;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p471rx.exceptions.CompositeException;
import p471rx.exceptions.OnCompletedFailedException;
import p471rx.exceptions.OnErrorFailedException;
import p471rx.exceptions.OnErrorNotImplementedException;
import pg3.C29218v0;
import pg3.InterfaceC29182e;
import xg3.AbstractC38292s;
import xg3.InterfaceC38282i;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: qg3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C30351c extends AtomicInteger implements InterfaceC38293t, InterfaceC38282i {

    /* JADX INFO: renamed from: w */
    public final InterfaceC29182e f124530w;

    /* JADX INFO: renamed from: x */
    public final AbstractC38292s f124531x;

    /* JADX INFO: renamed from: y */
    public volatile boolean f124532y;

    /* JADX INFO: renamed from: z */
    public volatile C29218v0 f124533z;

    public C30351c(InterfaceC29182e interfaceC29182e, AbstractC38292s abstractC38292s) {
        super(0);
        this.f124530w = interfaceC29182e;
        this.f124531x = abstractC38292s;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f124532y;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        this.f124532y = true;
        this.f124530w.cancel();
    }

    /* JADX INFO: renamed from: c */
    public final void m92808c(C29218v0 c29218v0) {
        try {
            if (!this.f124532y) {
                this.f124531x.onNext(c29218v0);
            }
            try {
                if (this.f124532y) {
                    return;
                }
                this.f124531x.onCompleted();
            } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException unused) {
                C21705f.f83334f.m61158b().getClass();
            } catch (Throwable th3) {
                AbstractC12350b.m34573V(th3);
                C21705f.f83334f.m61158b().getClass();
            }
        } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException unused2) {
            C21705f.f83334f.m61158b().getClass();
        } catch (Throwable th4) {
            AbstractC12350b.m34573V(th4);
            try {
                this.f124531x.onError(th4);
            } catch (OnCompletedFailedException | OnErrorFailedException | OnErrorNotImplementedException unused3) {
                C21705f.f83334f.m61158b().getClass();
            } catch (Throwable th5) {
                AbstractC12350b.m34573V(th5);
                new CompositeException(th4, th5);
                C21705f.f83334f.m61158b().getClass();
            }
        }
    }

    @Override // xg3.InterfaceC38282i
    public final void request(long j7) {
        if (j7 == 0) {
            return;
        }
        while (true) {
            int i13 = get();
            if (i13 != 0) {
                if (i13 == 1) {
                    return;
                }
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new IllegalStateException(AbstractC2875y.m8295h(i13, "Unknown state: "));
                    }
                    return;
                } else if (compareAndSet(2, 3)) {
                    m92808c(this.f124533z);
                    return;
                }
            } else if (compareAndSet(0, 1)) {
                return;
            }
        }
    }
}
