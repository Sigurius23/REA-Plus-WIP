package lh3;

import java.util.concurrent.atomic.AtomicLong;
import p088dc.AbstractC11895b;
import p471rx.exceptions.MissingBackpressureException;
import xg3.AbstractC38292s;
import xg3.InterfaceC38281h;
import xg3.InterfaceC38282i;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: lh3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C24080c extends AtomicLong implements InterfaceC38282i, InterfaceC38293t, InterfaceC38281h {

    /* JADX INFO: renamed from: w */
    public final C24081d f95128w;

    /* JADX INFO: renamed from: x */
    public final AbstractC38292s f95129x;

    /* JADX INFO: renamed from: y */
    public long f95130y;

    public C24080c(C24081d c24081d, AbstractC38292s abstractC38292s) {
        this.f95128w = c24081d;
        this.f95129x = abstractC38292s;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return get() == Long.MIN_VALUE;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            this.f95128w.m70998a(this);
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onCompleted() {
        if (get() != Long.MIN_VALUE) {
            this.f95129x.onCompleted();
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onError(Throwable th3) {
        if (get() != Long.MIN_VALUE) {
            this.f95129x.onError(th3);
        }
    }

    @Override // xg3.InterfaceC38281h
    public final void onNext(Object obj) {
        long j7 = get();
        if (j7 != Long.MIN_VALUE) {
            long j13 = this.f95130y;
            AbstractC38292s abstractC38292s = this.f95129x;
            if (j7 != j13) {
                this.f95130y = j13 + 1;
                abstractC38292s.onNext(obj);
            } else {
                mo14750b();
                abstractC38292s.onError(new MissingBackpressureException("PublishSubject: could not emit value due to lack of requests"));
            }
        }
    }

    @Override // xg3.InterfaceC38282i
    public final void request(long j7) {
        long j13;
        long j14;
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "n >= 0 required but it was "));
        }
        if (j7 != 0) {
            do {
                j13 = get();
                if (j13 == Long.MIN_VALUE) {
                    return;
                }
                j14 = j13 + j7;
                if (j14 < 0) {
                    j14 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j13, j14));
        }
    }
}
