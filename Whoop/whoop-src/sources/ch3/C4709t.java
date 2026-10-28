package ch3;

import bh3.InterfaceC3254a;
import p098dt.AbstractC12350b;
import xg3.AbstractC38283j;
import xg3.AbstractC38292s;

/* JADX INFO: renamed from: ch3.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C4709t implements InterfaceC3254a {

    /* JADX INFO: renamed from: w */
    public long f19275w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC38292s f19276x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC38283j f19277y;

    public C4709t(AbstractC38292s abstractC38292s, AbstractC38283j abstractC38283j) {
        this.f19276x = abstractC38292s;
        this.f19277y = abstractC38283j;
    }

    @Override // bh3.InterfaceC3254a
    public final void call() {
        AbstractC38292s abstractC38292s = this.f19276x;
        try {
            long j7 = this.f19275w;
            this.f19275w = 1 + j7;
            abstractC38292s.onNext(Long.valueOf(j7));
        } catch (Throwable th3) {
            try {
                this.f19277y.mo14750b();
            } finally {
                AbstractC12350b.m34574W(th3, abstractC38292s);
            }
        }
    }
}
