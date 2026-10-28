package ec3;

import fc3.C14389t;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function3;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C13100y implements InterfaceC13058l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC13058l f45267w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC32275i f45268x;

    /* JADX WARN: Multi-variable type inference failed */
    public C13100y(InterfaceC13058l interfaceC13058l, Function3 function3) {
        this.f45267w = interfaceC13058l;
        this.f45268x = (AbstractC32275i) function3;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function3, s83.i] */
    /* JADX WARN: Type inference failed for: r9v6, types: [kotlin.jvm.functions.Function3, s83.i] */
    @Override // ec3.InterfaceC13058l
    public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) throws Throwable {
        C13097x c13097x;
        C13100y c13100y;
        C13069n2 c13069n2;
        ?? r10;
        C14389t c14389t;
        Throwable th3;
        C14389t c14389t2;
        ?? r14;
        if (interfaceC30057d instanceof C13097x) {
            c13097x = (C13097x) interfaceC30057d;
            int i13 = c13097x.f45260x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13097x.f45260x = i13 - Integer.MIN_VALUE;
            } else {
                c13097x = new C13097x(this, interfaceC30057d);
            }
        } else {
            c13097x = new C13097x(this, interfaceC30057d);
        }
        Object obj = c13097x.f45259w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13097x.f45260x;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                InterfaceC13058l interfaceC13058l = this.f45267w;
                c13097x.f45262z = this;
                c13097x.f45258E = interfaceC13062m;
                c13097x.f45260x = 1;
                if (interfaceC13058l.collect(interfaceC13062m, c13097x) != enumC31071a) {
                    c13100y = this;
                    c14389t = new C14389t(interfaceC13062m, c13097x.getContext());
                    r14 = c13100y.f45268x;
                    c13097x.f45262z = c14389t;
                    c13097x.f45258E = null;
                    c13097x.f45260x = 3;
                    if (r14.invoke(c14389t, null, c13097x) != enumC31071a) {
                        c14389t2 = c14389t;
                        c14389t2.releaseIntercepted();
                        return C23454a0.f92919a;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                c13100y = this;
                c13069n2 = new C13069n2(th);
                r10 = c13100y.f45268x;
                c13097x.f45262z = th;
                c13097x.f45258E = null;
                c13097x.f45260x = 2;
                if (AbstractC13091v.m36595e(c13069n2, r10, th, c13097x) == enumC31071a) {
                    throw th;
                }
            }
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                Throwable th5 = (Throwable) c13097x.f45262z;
                AbstractC34132o.m107864I(obj);
                throw th5;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c14389t2 = (C14389t) c13097x.f45262z;
            try {
                AbstractC34132o.m107864I(obj);
                c14389t2.releaseIntercepted();
                return C23454a0.f92919a;
            } catch (Throwable th6) {
                th3 = th6;
                c14389t2.releaseIntercepted();
                throw th3;
            }
        }
        interfaceC13062m = c13097x.f45258E;
        c13100y = (C13100y) c13097x.f45262z;
        try {
            AbstractC34132o.m107864I(obj);
            c14389t = new C14389t(interfaceC13062m, c13097x.getContext());
            try {
                r14 = c13100y.f45268x;
                c13097x.f45262z = c14389t;
                c13097x.f45258E = null;
                c13097x.f45260x = 3;
                if (r14.invoke(c14389t, null, c13097x) != enumC31071a) {
                    c14389t2 = c14389t;
                    c14389t2.releaseIntercepted();
                    return C23454a0.f92919a;
                }
            } catch (Throwable th7) {
                th3 = th7;
                c14389t2 = c14389t;
                c14389t2.releaseIntercepted();
                throw th3;
            }
        } catch (Throwable th8) {
            th = th8;
            c13069n2 = new C13069n2(th);
            r10 = c13100y.f45268x;
            c13097x.f45262z = th;
            c13097x.f45258E = null;
            c13097x.f45260x = 2;
            if (AbstractC13091v.m36595e(c13069n2, r10, th, c13097x) == enumC31071a) {
                throw th;
            }
        }
        return enumC31071a;
    }
}
