package p180h0;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.t2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16458t2 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f63238w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f63239x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16458t2(long j7, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f63239x = j7;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C16458t2 c16458t2 = new C16458t2(this.f63239x, interfaceC30057d);
        c16458t2.f63238w = obj;
        return c16458t2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C16458t2 c16458t2 = (C16458t2) create((C16360a3) obj, (InterfaceC30057d) obj2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c16458t2.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        C16372c3 c16372c3 = ((C16360a3) this.f63238w).f62899a;
        c16372c3.m46570c(c16372c3.f62946k, this.f63239x, 1);
        return C23454a0.f92919a;
    }
}
