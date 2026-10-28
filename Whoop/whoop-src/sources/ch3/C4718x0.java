package ch3;

import bh3.InterfaceC3255b;
import p098dt.AbstractC12350b;
import xg3.AbstractC38291r;
import xg3.InterfaceC38288o;

/* JADX INFO: renamed from: ch3.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4718x0 implements InterfaceC38288o {

    /* JADX INFO: renamed from: w */
    public final InterfaceC3255b f19300w;

    public C4718x0(InterfaceC3255b interfaceC3255b) {
        this.f19300w = interfaceC3255b;
    }

    @Override // bh3.InterfaceC3255b
    /* JADX INFO: renamed from: b */
    public final void mo9472b(Object obj) {
        AbstractC38291r abstractC38291r = (AbstractC38291r) obj;
        C4716w0 c4716w0 = new C4716w0(abstractC38291r);
        abstractC38291r.m122687c(c4716w0);
        try {
            this.f19300w.mo9472b(c4716w0);
        } catch (Throwable th3) {
            AbstractC12350b.m34573V(th3);
            c4716w0.m14774c(th3);
        }
    }
}
