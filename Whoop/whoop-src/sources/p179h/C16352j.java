package p179h;

import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.C22659b0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C16352j extends AbstractC32275i implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C22659b0 f62868w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16352j(C22659b0 c22659b0, InterfaceC30057d interfaceC30057d) {
        super(3, interfaceC30057d);
        this.f62868w = c22659b0;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C16352j c16352j = new C16352j(this.f62868w, (InterfaceC30057d) obj3);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c16352j.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        this.f62868w.f89329w = true;
        return C23454a0.f92919a;
    }
}
