package ec3;

import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22665e0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: ec3.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13051j0 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C22665e0 f45105w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f45106x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC13062m f45107y;

    public C13051j0(C22665e0 c22665e0, int i13, InterfaceC13062m interfaceC13062m) {
        this.f45105w = c22665e0;
        this.f45106x = i13;
        this.f45107y = interfaceC13062m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        C13047i0 c13047i0;
        if (interfaceC30057d instanceof C13047i0) {
            c13047i0 = (C13047i0) interfaceC30057d;
            int i13 = c13047i0.f45095y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13047i0.f45095y = i13 - Integer.MIN_VALUE;
            } else {
                c13047i0 = new C13047i0(this, interfaceC30057d);
            }
        } else {
            c13047i0 = new C13047i0(this, interfaceC30057d);
        }
        Object obj2 = c13047i0.f45093w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13047i0.f45095y;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj2);
            return c23454a0;
        }
        AbstractC34132o.m107864I(obj2);
        C22665e0 c22665e0 = this.f45105w;
        int i15 = c22665e0.f89334w;
        if (i15 >= this.f45106x) {
            c13047i0.f45095y = 1;
            return this.f45107y.emit(obj, c13047i0) == enumC31071a ? enumC31071a : c23454a0;
        }
        c22665e0.f89334w = i15 + 1;
        return c23454a0;
    }
}
