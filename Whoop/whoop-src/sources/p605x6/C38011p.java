package p605x6;

import androidx.glance.session.SessionWorker;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: x6.p */
/* JADX INFO: loaded from: classes5.dex */
public final class C38011p extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC38016u f162822w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SessionWorker f162823x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38011p(InterfaceC38016u interfaceC38016u, SessionWorker sessionWorker, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f162822w = interfaceC38016u;
        this.f162823x = sessionWorker;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C38011p(this.f162822w, this.f162823x, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C38011p c38011p = (C38011p) create((InterfaceC30057d) obj);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c38011p.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        ((C38017v) this.f162822w).m121747b(this.f162823x.f6002y.f162840c);
        return C23454a0.f92919a;
    }
}
