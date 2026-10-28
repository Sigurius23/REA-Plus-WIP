package p389p0;

import bc3.C3033m;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import l83.C23454a0;
import p026b2.InterfaceC2315u;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22669g0;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C28514d implements InterfaceC2315u {

    /* JADX INFO: renamed from: w */
    public boolean f115410w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f115411x = new ArrayList();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m86821j(AbstractC32269c abstractC32269c) {
        C28511c c28511c;
        C22669g0 c22669g0;
        Throwable th3;
        if (abstractC32269c instanceof C28511c) {
            c28511c = (C28511c) abstractC32269c;
            int i13 = c28511c.f115408z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28511c.f115408z = i13 - Integer.MIN_VALUE;
            } else {
                c28511c = new C28511c(this, abstractC32269c);
            }
        } else {
            c28511c = new C28511c(this, abstractC32269c);
        }
        Object obj = c28511c.f115406x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28511c.f115408z;
        ArrayList arrayList = this.f115411x;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (!this.f115410w) {
                C22669g0 c22669g1 = new C22669g0();
                try {
                    c28511c.f115405w = c22669g1;
                    c28511c.f115408z = 1;
                    C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c28511c));
                    c3033m.m8774s();
                    c22669g1.f89336w = c3033m;
                    arrayList.add(c3033m);
                    if (c3033m.m8773r() == enumC31071a) {
                        return enumC31071a;
                    }
                    c22669g0 = c22669g1;
                    Object obj2 = c22669g0.f89336w;
                    AbstractC22681m0.m65770a(arrayList);
                    arrayList.remove(obj2);
                } catch (Throwable th4) {
                    c22669g0 = c22669g1;
                    th3 = th4;
                    Object obj3 = c22669g0.f89336w;
                    AbstractC22681m0.m65770a(arrayList);
                    arrayList.remove(obj3);
                    throw th3;
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c28511c.f115405w;
            try {
                AbstractC34132o.m107864I(obj);
                Object obj4 = c22669g0.f89336w;
                AbstractC22681m0.m65770a(arrayList);
                arrayList.remove(obj4);
            } catch (Throwable th5) {
                th3 = th5;
                Object obj5 = c22669g0.f89336w;
                AbstractC22681m0.m65770a(arrayList);
                arrayList.remove(obj5);
                throw th3;
            }
        }
        return C23454a0.f92919a;
    }
}
