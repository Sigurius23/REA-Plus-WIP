package p007a6;

import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a6.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0412c1 extends AbstractC32275i implements InterfaceC4351m {
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C0412c1(2, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C0412c1 c0412c1 = (C0412c1) create((InterfaceC13062m) obj, (InterfaceC30057d) obj2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c0412c1.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        return C23454a0.f92919a;
    }
}
