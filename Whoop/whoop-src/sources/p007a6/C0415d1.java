package p007a6;

import c93.InterfaceC4351m;
import ec3.C13084s1;
import java.util.concurrent.atomic.AtomicInteger;
import mc3.AbstractC25438d;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import p014aj.C0929d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0415d1 {

    /* JADX INFO: renamed from: a */
    public final C25437c f1428a = AbstractC25438d.m74669a();

    /* JADX INFO: renamed from: b */
    public final C0929d f1429b = new C0929d(1, false);

    /* JADX INFO: renamed from: c */
    public final C13084s1 f1430c = new C13084s1(new C0412c1(2, null));

    public C0415d1(String str) {
    }

    /* JADX INFO: renamed from: a */
    public final Integer m1098a() {
        return new Integer(((AtomicInteger) this.f1429b.f3422w).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m1099b(Function1 function1, AbstractC32269c abstractC32269c) {
        C0406a1 c0406a1;
        C25437c c25437c;
        Throwable th3;
        InterfaceC25435a interfaceC25435a;
        if (abstractC32269c instanceof C0406a1) {
            c0406a1 = (C0406a1) abstractC32269c;
            int i13 = c0406a1.f1389E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0406a1.f1389E = i13 - Integer.MIN_VALUE;
            } else {
                c0406a1 = new C0406a1(this, abstractC32269c);
            }
        } else {
            c0406a1 = new C0406a1(this, abstractC32269c);
        }
        Object obj = c0406a1.f1392y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0406a1.f1389E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                c0406a1.f1390w = function1;
                c25437c = this.f1428a;
                c0406a1.f1391x = c25437c;
                c0406a1.f1389E = 1;
                if (c25437c.mo68211b(c0406a1) != enumC31071a) {
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a = (InterfaceC25435a) c0406a1.f1390w;
                try {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a.mo68214i(null);
                    return obj;
                } catch (Throwable th4) {
                    th3 = th4;
                    interfaceC25435a.mo68214i(null);
                    throw th3;
                }
            }
            C25437c c25437c2 = c0406a1.f1391x;
            Function1 function2 = (Function1) c0406a1.f1390w;
            AbstractC34132o.m107864I(obj);
            c25437c = c25437c2;
            function1 = function2;
            c0406a1.f1390w = c25437c;
            c0406a1.f1391x = null;
            c0406a1.f1389E = 2;
            Object objInvoke = function1.invoke(c0406a1);
            if (objInvoke != enumC31071a) {
                C25437c c25437c3 = c25437c;
                obj = objInvoke;
                interfaceC25435a = c25437c3;
                interfaceC25435a.mo68214i(null);
                return obj;
            }
            return enumC31071a;
        } catch (Throwable th5) {
            C25437c c25437c4 = c25437c;
            th3 = th5;
            interfaceC25435a = c25437c4;
            interfaceC25435a.mo68214i(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m1100c(InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) throws Throwable {
        C0409b1 c0409b1;
        C25437c c25437c;
        Throwable th3;
        boolean z4;
        if (abstractC32269c instanceof C0409b1) {
            c0409b1 = (C0409b1) abstractC32269c;
            int i13 = c0409b1.f1401E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0409b1.f1401E = i13 - Integer.MIN_VALUE;
            } else {
                c0409b1 = new C0409b1(this, abstractC32269c);
            }
        } else {
            c0409b1 = new C0409b1(this, abstractC32269c);
        }
        Object obj = c0409b1.f1404y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c0409b1.f1401E;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z4 = c0409b1.f1403x;
            c25437c = c0409b1.f1402w;
            try {
                AbstractC34132o.m107864I(obj);
                if (z4) {
                    c25437c.mo68214i(null);
                }
                return obj;
            } catch (Throwable th4) {
                th3 = th4;
                if (z4) {
                    c25437c.mo68214i(null);
                }
                throw th3;
            }
        }
        AbstractC34132o.m107864I(obj);
        C25437c c25437c2 = this.f1428a;
        boolean zTryLock = c25437c2.tryLock();
        try {
            Object objValueOf = Boolean.valueOf(zTryLock);
            c0409b1.f1402w = c25437c2;
            c0409b1.f1403x = zTryLock;
            c0409b1.f1401E = 1;
            Object objInvoke = interfaceC4351m.invoke(objValueOf, c0409b1);
            if (objInvoke == obj2) {
                return obj2;
            }
            c25437c = c25437c2;
            obj = objInvoke;
            z4 = zTryLock;
            if (z4) {
                c25437c.mo68214i(null);
            }
            return obj;
        } catch (Throwable th5) {
            c25437c = c25437c2;
            th3 = th5;
            z4 = zTryLock;
            if (z4) {
                c25437c.mo68214i(null);
            }
            throw th3;
        }
    }
}
