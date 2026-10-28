package pg3;

import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ud3.InterfaceC34819i;

/* JADX INFO: renamed from: pg3.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C29213t extends AbstractC29217v {

    /* JADX INFO: renamed from: d */
    public final InterfaceC29187g f118225d;

    /* JADX INFO: renamed from: e */
    public final boolean f118226e;

    public C29213t(C29216u0 c29216u0, InterfaceC34819i interfaceC34819i, InterfaceC29201n interfaceC29201n, InterfaceC29187g interfaceC29187g, boolean z4) {
        super(c29216u0, interfaceC34819i, interfaceC29201n);
        this.f118225d = interfaceC29187g;
        this.f118226e = z4;
    }

    @Override // pg3.AbstractC29217v
    /* JADX INFO: renamed from: a */
    public final Object mo88716a(C29174b0 c29174b0, Object[] objArr) {
        InterfaceC29182e interfaceC29182e = (InterfaceC29182e) this.f118225d.adapt(c29174b0);
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) objArr[objArr.length - 1];
        try {
            if (!this.f118226e) {
                return AbstractC29184e1.m88680b(interfaceC29182e, interfaceC30057d);
            }
            AbstractC22676k.m65748h(interfaceC29182e, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            return AbstractC29184e1.m88681c(interfaceC29182e, interfaceC30057d);
        } catch (LinkageError e5) {
            throw e5;
        } catch (ThreadDeath e13) {
            throw e13;
        } catch (VirtualMachineError e14) {
            throw e14;
        } catch (Throwable th3) {
            AbstractC29184e1.m88695q(th3, interfaceC30057d);
            return EnumC31071a.f128113w;
        }
    }
}
