package ec3;

import c93.InterfaceC4351m;
import fc3.C14389t;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: ec3.k2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13057k2 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final InterfaceC13062m f45128w;

    /* JADX INFO: renamed from: x */
    public final AbstractC32275i f45129x;

    /* JADX WARN: Multi-variable type inference failed */
    public C13057k2(InterfaceC13062m interfaceC13062m, InterfaceC4351m interfaceC4351m) {
        this.f45128w = interfaceC13062m;
        this.f45129x = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [s83.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4, types: [c93.m, s83.i] */
    /* JADX INFO: renamed from: b */
    public final Object m36574b(AbstractC32269c abstractC32269c) {
        C13053j2 c13053j2;
        C14389t c14389t;
        C13057k2 c13057k2;
        if (abstractC32269c instanceof C13053j2) {
            c13053j2 = (C13053j2) abstractC32269c;
            int i13 = c13053j2.f45111E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13053j2.f45111E = i13 - Integer.MIN_VALUE;
            } else {
                c13053j2 = new C13053j2(this, abstractC32269c);
            }
        } else {
            c13053j2 = new C13053j2(this, abstractC32269c);
        }
        Object obj = c13053j2.f45114y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        ?? r10 = c13053j2.f45111E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (r10 == 0) {
                AbstractC34132o.m107864I(obj);
                c14389t = new C14389t(this.f45128w, c13053j2.getContext());
                ?? r14 = this.f45129x;
                c13053j2.f45112w = this;
                c13053j2.f45113x = c14389t;
                c13053j2.f45111E = 1;
                if (r14.invoke(c14389t, c13053j2) != enumC31071a) {
                    c13057k2 = this;
                }
                return enumC31071a;
            }
            if (r10 != 1) {
                if (r10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            c14389t = c13053j2.f45113x;
            c13057k2 = c13053j2.f45112w;
            AbstractC34132o.m107864I(obj);
            c14389t.releaseIntercepted();
            InterfaceC13062m interfaceC13062m = c13057k2.f45128w;
            r10 = interfaceC13062m instanceof C13057k2;
            if (r10 != 0) {
                c13053j2.f45112w = null;
                c13053j2.f45113x = null;
                c13053j2.f45111E = 2;
                if (((C13057k2) interfaceC13062m).m36574b(c13053j2) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return c23454a0;
        } catch (Throwable th3) {
            r10.releaseIntercepted();
            throw th3;
        }
    }

    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        return this.f45128w.emit(obj, interfaceC30057d);
    }
}
