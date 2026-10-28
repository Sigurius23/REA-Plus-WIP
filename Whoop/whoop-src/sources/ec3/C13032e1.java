package ec3;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13032e1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ int f45049w;

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C13032e1 c13032e1 = new C13032e1(2, interfaceC30057d);
        c13032e1.f45049w = ((Number) obj).intValue();
        return c13032e1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C13032e1) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        return Boolean.valueOf(this.f45049w > 0);
    }
}
