package bc3;

import ge3.AbstractC15751g;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.C30058e;
import q83.InterfaceC30057d;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bc3.m0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3034m0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final void m8781a(AbstractC32269c abstractC32269c) {
        C3030l0 c3030l0;
        if (abstractC32269c instanceof C3030l0) {
            c3030l0 = (C3030l0) abstractC32269c;
            int i13 = c3030l0.f12048x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3030l0.f12048x = i13 - Integer.MIN_VALUE;
            } else {
                c3030l0 = new C3030l0(abstractC32269c);
            }
        } else {
            c3030l0 = new C3030l0(abstractC32269c);
        }
        Object obj = c3030l0.f12047w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3030l0.f12048x;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c3030l0.f12048x = 1;
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c3030l0));
            c3033m.m8774s();
            if (c3033m.m8773r() == enumC31071a) {
                return;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: b */
    public static final Object m8782b(long j7, InterfaceC30057d interfaceC30057d) {
        if (j7 > 0) {
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
            c3033m.m8774s();
            if (j7 < Long.MAX_VALUE) {
                m8784d(c3033m.f12054E).mo8691m(j7, c3033m);
            }
            Object objM8773r = c3033m.m8773r();
            if (objM8773r == EnumC31071a.f128113w) {
                return objM8773r;
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public static final Object m8783c(long j7, InterfaceC30057d interfaceC30057d) {
        Object objM8782b = m8782b(m8785e(j7), interfaceC30057d);
        return objM8782b == EnumC31071a.f128113w ? objM8782b : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC3026k0 m8784d(InterfaceC30063j interfaceC30063j) {
        InterfaceC30061h interfaceC30061h = interfaceC30063j.get(C30058e.f122675w);
        InterfaceC3026k0 interfaceC3026k0 = interfaceC30061h instanceof InterfaceC3026k0 ? (InterfaceC3026k0) interfaceC30061h : null;
        return interfaceC3026k0 == null ? AbstractC3014h0.f12031a : interfaceC3026k0;
    }

    /* JADX INFO: renamed from: e */
    public static final long m8785e(long j7) {
        boolean zM134289isPositiveimpl = Duration.m134289isPositiveimpl(j7);
        if (zM134289isPositiveimpl) {
            return Duration.m134273getInWholeMillisecondsimpl(Duration.m134291plusLRDsOJo(j7, DurationKt.toDuration(999999L, DurationUnit.NANOSECONDS)));
        }
        if (zM134289isPositiveimpl) {
            throw new NoWhenBranchMatchedException();
        }
        return 0L;
    }
}
