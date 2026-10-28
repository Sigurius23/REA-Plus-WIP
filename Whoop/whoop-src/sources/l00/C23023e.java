package l00;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import h00.C16493b0;
import l83.C23454a0;
import p132f0.C13821r1;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: l00.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C23023e extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C16493b0 f90771w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13821r1 f90772x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23023e(C16493b0 c16493b0, C13821r1 c13821r1, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f90771w = c16493b0;
        this.f90772x = c13821r1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C23023e(this.f90771w, this.f90772x, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C23023e c23023e = (C23023e) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c23023e.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        C16493b0 c16493b0 = this.f90771w;
        if (c16493b0 != null) {
            c16493b0.f63386a.invoke(Boolean.valueOf(this.f90772x.mo39182c()));
        }
        return C23454a0.f92919a;
    }
}
