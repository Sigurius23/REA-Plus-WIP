package ec3;

import c93.InterfaceC4351m;
import fc3.C14389t;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.s1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13084s1 implements InterfaceC13058l, InterfaceC13026d {

    /* JADX INFO: renamed from: w */
    public final AbstractC32275i f45211w;

    /* JADX WARN: Multi-variable type inference failed */
    public C13084s1(InterfaceC4351m interfaceC4351m) {
        this.f45211w = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v3, types: [c93.m, s83.i] */
    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
        C13014a c13014a;
        Throwable th3;
        C14389t c14389t;
        if (interfaceC30057d instanceof C13014a) {
            c13014a = (C13014a) interfaceC30057d;
            int i13 = c13014a.f44997z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13014a.f44997z = i13 - Integer.MIN_VALUE;
            } else {
                c13014a = new C13014a(this, interfaceC30057d);
            }
        } else {
            c13014a = new C13014a(this, interfaceC30057d);
        }
        Object obj = c13014a.f44995x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13014a.f44997z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c14389t = c13014a.f44994w;
            try {
                AbstractC34132o.m107864I(obj);
                c14389t.releaseIntercepted();
                return c23454a0;
            } catch (Throwable th4) {
                th3 = th4;
                c14389t.releaseIntercepted();
                throw th3;
            }
        }
        AbstractC34132o.m107864I(obj);
        C14389t c14389t2 = new C14389t(interfaceC13062m, c13014a.getContext());
        try {
            c13014a.f44994w = c14389t2;
            c13014a.f44997z = 1;
            Object objInvoke = this.f45211w.invoke(c14389t2, c13014a);
            if (objInvoke != enumC31071a) {
                objInvoke = c23454a0;
            }
            if (objInvoke == enumC31071a) {
                return enumC31071a;
            }
            c14389t = c14389t2;
            c14389t.releaseIntercepted();
            return c23454a0;
        } catch (Throwable th5) {
            th3 = th5;
            c14389t = c14389t2;
            c14389t.releaseIntercepted();
            throw th3;
        }
    }
}
