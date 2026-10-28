package eh3;

import bh3.InterfaceC3254a;
import fh3.C14493a;
import fh3.EnumC14494b;
import java.util.concurrent.TimeUnit;
import xg3.AbstractC38283j;
import xg3.InterfaceC38293t;

/* JADX INFO: renamed from: eh3.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C13208l implements InterfaceC3254a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C14493a f45779E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ AbstractC38283j f45780F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ long f45781G;

    /* JADX INFO: renamed from: w */
    public long f45782w;

    /* JADX INFO: renamed from: x */
    public long f45783x;

    /* JADX INFO: renamed from: y */
    public long f45784y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC3254a f45785z;

    public C13208l(long j7, long j13, InterfaceC3254a interfaceC3254a, C14493a c14493a, AbstractC38283j abstractC38283j, long j14) {
        this.f45785z = interfaceC3254a;
        this.f45779E = c14493a;
        this.f45780F = abstractC38283j;
        this.f45781G = j14;
        this.f45783x = j7;
        this.f45784y = j13;
    }

    @Override // bh3.InterfaceC3254a
    public final void call() {
        long j7;
        InterfaceC38293t interfaceC38293t;
        this.f45785z.call();
        C14493a c14493a = this.f45779E;
        if (c14493a.mo14749a()) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        AbstractC38283j abstractC38283j = this.f45780F;
        abstractC38283j.getClass();
        long nanos = timeUnit.toNanos(System.currentTimeMillis());
        long j13 = AbstractC13209m.f45786a;
        long j14 = nanos + j13;
        long j15 = this.f45783x;
        long j16 = this.f45781G;
        if (j14 < j15 || nanos >= j15 + j16 + j13) {
            j7 = nanos + j16;
            long j17 = this.f45782w + 1;
            this.f45782w = j17;
            this.f45784y = j7 - (j16 * j17);
        } else {
            long j18 = this.f45784y;
            long j19 = this.f45782w + 1;
            this.f45782w = j19;
            j7 = (j19 * j16) + j18;
        }
        this.f45783x = nanos;
        InterfaceC38293t interfaceC38293tMo37107d = abstractC38283j.mo37107d(this, j7 - nanos, TimeUnit.NANOSECONDS);
        do {
            interfaceC38293t = (InterfaceC38293t) c14493a.get();
            if (interfaceC38293t == EnumC14494b.f52923w) {
                interfaceC38293tMo37107d.mo14750b();
                return;
            }
        } while (!c14493a.compareAndSet(interfaceC38293t, interfaceC38293tMo37107d));
    }
}
