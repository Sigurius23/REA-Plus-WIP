package p180h0;

import l83.C23454a0;
import p181h2.C16617b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.d3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16378d3 extends AbstractC32275i implements Function3 {
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j7 = ((C16617b) obj2).f63937a;
        C16378d3 c16378d3 = new C16378d3(3, (InterfaceC30057d) obj3);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c16378d3.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        return C23454a0.f92919a;
    }
}
