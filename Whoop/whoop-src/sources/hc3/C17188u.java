package hc3;

import bc3.AbstractC2985a;
import bc3.AbstractC3006f0;
import ge3.AbstractC15751g;
import kotlinx.coroutines.DispatchException;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s83.InterfaceC32270d;

/* JADX INFO: renamed from: hc3.u */
/* JADX INFO: loaded from: classes5.dex */
public class C17188u extends AbstractC2985a implements InterfaceC32270d {

    /* JADX INFO: renamed from: z */
    public final InterfaceC30057d f66005z;

    public C17188u(InterfaceC30063j interfaceC30063j, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30063j, true, true);
        this.f66005z = interfaceC30057d;
    }

    @Override // bc3.C3060t1
    /* JADX INFO: renamed from: K */
    public final boolean mo8806K() {
        return true;
    }

    /* JADX INFO: renamed from: c0 */
    public void mo8787c0() {
    }

    @Override // s83.InterfaceC32270d
    public final InterfaceC32270d getCallerFrame() {
        InterfaceC30057d interfaceC30057d = this.f66005z;
        if (interfaceC30057d instanceof InterfaceC32270d) {
            return (InterfaceC32270d) interfaceC30057d;
        }
        return null;
    }

    @Override // bc3.C3060t1
    /* JADX INFO: renamed from: j */
    public void mo8694j(Object obj) throws DispatchException {
        AbstractC17167b.m48481g(AbstractC3006f0.m8697C(obj), AbstractC15751g.m44424D(this.f66005z));
    }

    @Override // bc3.C3060t1
    /* JADX INFO: renamed from: l */
    public void mo8791l(Object obj) {
        this.f66005z.resumeWith(AbstractC3006f0.m8697C(obj));
    }
}
