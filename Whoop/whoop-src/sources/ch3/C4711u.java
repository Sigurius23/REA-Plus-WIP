package ch3;

import eh3.AbstractC13209m;
import java.util.concurrent.TimeUnit;
import xg3.AbstractC38283j;
import xg3.AbstractC38284k;
import xg3.AbstractC38292s;
import xg3.InterfaceC38278e;

/* JADX INFO: renamed from: ch3.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C4711u implements InterfaceC38278e {

    /* JADX INFO: renamed from: w */
    public final long f19281w;

    /* JADX INFO: renamed from: x */
    public final long f19282x;

    /* JADX INFO: renamed from: y */
    public final TimeUnit f19283y;

    /* JADX INFO: renamed from: z */
    public final AbstractC38284k f19284z;

    public C4711u(long j7, long j13, TimeUnit timeUnit, AbstractC38284k abstractC38284k) {
        this.f19281w = j7;
        this.f19282x = j13;
        this.f19283y = timeUnit;
        this.f19284z = abstractC38284k;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        AbstractC38292s abstractC38292s = (AbstractC38292s) obj;
        AbstractC38283j abstractC38283jMo37108a = this.f19284z.mo37108a();
        abstractC38292s.m122688c(abstractC38283jMo37108a);
        AbstractC13209m.m37112a(abstractC38283jMo37108a, new C4709t(abstractC38292s, abstractC38283jMo37108a), this.f19281w, this.f19282x, this.f19283y);
    }
}
