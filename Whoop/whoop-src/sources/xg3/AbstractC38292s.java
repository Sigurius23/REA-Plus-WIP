package xg3;

import gh3.C15868m;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: xg3.s */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC38292s implements InterfaceC38281h, InterfaceC38293t {

    /* JADX INFO: renamed from: w */
    private final C15868m f164091w;

    /* JADX INFO: renamed from: x */
    private final AbstractC38292s f164092x;

    /* JADX INFO: renamed from: y */
    private InterfaceC38282i f164093y;

    /* JADX INFO: renamed from: z */
    private long f164094z;

    public AbstractC38292s() {
        this(null, false);
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: a */
    public final boolean mo14749a() {
        return this.f164091w.f59975x;
    }

    @Override // xg3.InterfaceC38293t
    /* JADX INFO: renamed from: b */
    public final void mo14750b() {
        this.f164091w.mo14750b();
    }

    /* JADX INFO: renamed from: c */
    public final void m122688c(InterfaceC38293t interfaceC38293t) {
        this.f164091w.m44779c(interfaceC38293t);
    }

    /* JADX INFO: renamed from: d */
    public void mo14748d() {
    }

    /* JADX INFO: renamed from: e */
    public final void m122689e(long j7) {
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "number requested cannot be negative: "));
        }
        synchronized (this) {
            InterfaceC38282i interfaceC38282i = this.f164093y;
            if (interfaceC38282i != null) {
                interfaceC38282i.request(j7);
                return;
            }
            long j13 = this.f164094z;
            if (j13 == Long.MIN_VALUE) {
                this.f164094z = j7;
            } else {
                long j14 = j13 + j7;
                if (j14 < 0) {
                    this.f164094z = Long.MAX_VALUE;
                } else {
                    this.f164094z = j14;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo14765f(InterfaceC38282i interfaceC38282i) {
        long j7;
        AbstractC38292s abstractC38292s;
        boolean z4;
        synchronized (this) {
            j7 = this.f164094z;
            this.f164093y = interfaceC38282i;
            abstractC38292s = this.f164092x;
            z4 = abstractC38292s != null && j7 == Long.MIN_VALUE;
        }
        if (z4) {
            abstractC38292s.mo14765f(interfaceC38282i);
        } else if (j7 == Long.MIN_VALUE) {
            interfaceC38282i.request(Long.MAX_VALUE);
        } else {
            interfaceC38282i.request(j7);
        }
    }

    @Override // xg3.InterfaceC38281h
    public void onNext(Object obj) {
        onCompleted();
    }

    public AbstractC38292s(AbstractC38292s abstractC38292s, boolean z4) {
        this.f164094z = Long.MIN_VALUE;
        this.f164092x = abstractC38292s;
        this.f164091w = (!z4 || abstractC38292s == null) ? new C15868m() : abstractC38292s.f164091w;
    }
}
