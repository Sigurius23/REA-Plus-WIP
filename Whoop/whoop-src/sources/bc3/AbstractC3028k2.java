package bc3;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import kotlinx.coroutines.TimeoutCancellationException;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bc3.k2 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3028k2 {
    /* JADX INFO: renamed from: a */
    public static final Object m8747a(RunnableC3020i2 runnableC3020i2, InterfaceC4351m interfaceC4351m) {
        AbstractC3006f0.m8728v(runnableC3020i2, true, new C3059t0(AbstractC3034m0.m8784d(runnableC3020i2.f66005z.getContext()).mo8690i(runnableC3020i2.f12040E, runnableC3020i2, runnableC3020i2.f11989y), 0));
        return AbstractC12889b.m36266c0(runnableC3020i2, false, runnableC3020i2, interfaceC4351m);
    }

    /* JADX INFO: renamed from: b */
    public static final Object m8748b(long j7, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        if (j7 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object objM8747a = m8747a(new RunnableC3020i2(j7, interfaceC30057d), interfaceC4351m);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8747a;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m8749c(long j7, InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        return m8748b(AbstractC3034m0.m8785e(j7), interfaceC4351m, abstractC32269c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final Object m8750d(long j7, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        C3024j2 c3024j2;
        C22669g0 c22669g0;
        if (interfaceC30057d instanceof C3024j2) {
            c3024j2 = (C3024j2) interfaceC30057d;
            int i13 = c3024j2.f12044y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3024j2.f12044y = i13 - Integer.MIN_VALUE;
            } else {
                c3024j2 = new C3024j2(interfaceC30057d);
            }
        } else {
            c3024j2 = new C3024j2(interfaceC30057d);
        }
        Object obj = c3024j2.f12043x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3024j2.f12044y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (j7 <= 0) {
                return null;
            }
            C22669g0 c22669g1 = new C22669g0();
            try {
                c3024j2.f12042w = c22669g1;
                c3024j2.f12044y = 1;
                RunnableC3020i2 runnableC3020i2 = new RunnableC3020i2(j7, c3024j2);
                c22669g1.f89336w = runnableC3020i2;
                Object objM8747a = m8747a(runnableC3020i2, interfaceC4351m);
                return objM8747a == enumC31071a ? enumC31071a : objM8747a;
            } catch (TimeoutCancellationException e5) {
                e = e5;
                c22669g0 = c22669g1;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c3024j2.f12042w;
            try {
                AbstractC34132o.m107864I(obj);
                return obj;
            } catch (TimeoutCancellationException e13) {
                e = e13;
            }
        }
        if (e.f89398w == c22669g0.f89336w) {
            return null;
        }
        throw e;
    }

    /* JADX INFO: renamed from: e */
    public static final Object m8751e(long j7, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        return m8750d(AbstractC3034m0.m8785e(j7), interfaceC4351m, interfaceC30057d);
    }
}
