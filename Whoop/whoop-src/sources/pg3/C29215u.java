package pg3;

import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ud3.InterfaceC34819i;

/* JADX INFO: renamed from: pg3.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C29215u extends AbstractC29217v {

    /* JADX INFO: renamed from: d */
    public final InterfaceC29187g f118253d;

    public C29215u(C29216u0 c29216u0, InterfaceC34819i interfaceC34819i, InterfaceC29201n interfaceC29201n, InterfaceC29187g interfaceC29187g) {
        super(c29216u0, interfaceC34819i, interfaceC29201n);
        this.f118253d = interfaceC29187g;
    }

    @Override // pg3.AbstractC29217v
    /* JADX INFO: renamed from: a */
    public final Object mo88716a(C29174b0 c29174b0, Object[] objArr) {
        InterfaceC29182e interfaceC29182e = (InterfaceC29182e) this.f118253d.adapt(c29174b0);
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) objArr[objArr.length - 1];
        try {
            return AbstractC29184e1.m88682d(interfaceC29182e, interfaceC30057d);
        } catch (Exception e5) {
            AbstractC29184e1.m88695q(e5, interfaceC30057d);
            return EnumC31071a.f128113w;
        }
    }
}
