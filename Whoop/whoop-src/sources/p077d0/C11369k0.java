package p077d0;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: d0.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11369k0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ float f36445w;

    public C11369k0() {
        super(2, null);
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C11369k0 c11369k0 = new C11369k0(2, interfaceC30057d);
        c11369k0.f36445w = ((Number) obj).floatValue();
        return c11369k0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C11369k0) create(Float.valueOf(((Number) obj).floatValue()), (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        return Boolean.valueOf(this.f36445w > 0.0f);
    }
}
