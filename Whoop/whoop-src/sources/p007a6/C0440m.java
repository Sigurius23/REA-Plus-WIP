package p007a6;

import c93.InterfaceC4351m;
import mc3.InterfaceC25435a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import p715kotlin.jvm.internal.C22669g0;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0440m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC25435a f1508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C22659b0 f1509b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C22669g0 f1510c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0429i0 f1511d;

    public C0440m(InterfaceC25435a interfaceC25435a, C22659b0 c22659b0, C22669g0 c22669g0, C0429i0 c0429i0) {
        this.f1508a = interfaceC25435a;
        this.f1509b = c22659b0;
        this.f1510c = c22669g0;
        this.f1511d = c0429i0;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ac, B:38:0x00b4), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m1121a(C0419f c0419f, AbstractC32269c abstractC32269c) throws Throwable {
        C0437l c0437l;
        InterfaceC25435a interfaceC25435a;
        C0429i0 c0429i0;
        C22659b0 c22659b0;
        C22669g0 c22669g0;
        InterfaceC4351m interfaceC4351m;
        InterfaceC25435a interfaceC25435a2;
        InterfaceC25435a interfaceC25435a3;
        C0429i0 c0429i1;
        Object obj;
        C22669g0 c22669g1;
        if (abstractC32269c instanceof C0437l) {
            c0437l = (C0437l) abstractC32269c;
            int i13 = c0437l.f1501H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0437l.f1501H = i13 - Integer.MIN_VALUE;
            } else {
                c0437l = new C0437l(this, abstractC32269c);
            }
        } else {
            c0437l = new C0437l(this, abstractC32269c);
        }
        Object obj2 = c0437l.f1499F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0437l.f1501H;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj2);
                c0437l.f1502w = c0419f;
                interfaceC25435a = this.f1508a;
                c0437l.f1503x = interfaceC25435a;
                C22659b0 c22659b1 = this.f1509b;
                c0437l.f1504y = c22659b1;
                C22669g0 c22669g2 = this.f1510c;
                c0437l.f1505z = c22669g2;
                c0429i0 = this.f1511d;
                c0437l.f1498E = c0429i0;
                c0437l.f1501H = 1;
                if (interfaceC25435a.mo68211b(c0437l) != enumC31071a) {
                    c22659b0 = c22659b1;
                    c22669g0 = c22669g2;
                    interfaceC4351m = c0419f;
                }
                return enumC31071a;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c0437l.f1504y;
                    c22669g1 = (C22669g0) c0437l.f1503x;
                    interfaceC25435a2 = (InterfaceC25435a) c0437l.f1502w;
                    try {
                        AbstractC34132o.m107864I(obj2);
                        c22669g1.f89336w = obj;
                        c22669g0 = c22669g1;
                        Object obj3 = c22669g0.f89336w;
                        interfaceC25435a2.mo68214i(null);
                        return obj3;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC25435a2.mo68214i(null);
                        throw th;
                    }
                }
                c0429i1 = (C0429i0) c0437l.f1504y;
                c22669g0 = (C22669g0) c0437l.f1503x;
                interfaceC25435a3 = (InterfaceC25435a) c0437l.f1502w;
                try {
                    AbstractC34132o.m107864I(obj2);
                    if (!AbstractC22676k.m65745e(obj2, c22669g0.f89336w)) {
                        c0437l.f1502w = interfaceC25435a3;
                        c0437l.f1503x = c22669g0;
                        c0437l.f1504y = obj2;
                        c0437l.f1501H = 3;
                        if (c0429i1.m1114j(obj2, false, c0437l) != enumC31071a) {
                            obj = obj2;
                            c22669g1 = c22669g0;
                            interfaceC25435a2 = interfaceC25435a3;
                            c22669g1.f89336w = obj;
                            c22669g0 = c22669g1;
                        }
                        return enumC31071a;
                    }
                    interfaceC25435a2 = interfaceC25435a3;
                    Object obj4 = c22669g0.f89336w;
                    interfaceC25435a2.mo68214i(null);
                    return obj4;
                } catch (Throwable th4) {
                    th = th4;
                    interfaceC25435a2 = interfaceC25435a3;
                    interfaceC25435a2.mo68214i(null);
                    throw th;
                }
            }
            C0429i0 c0429i2 = c0437l.f1498E;
            c22669g0 = c0437l.f1505z;
            c22659b0 = (C22659b0) c0437l.f1504y;
            InterfaceC25435a interfaceC25435a4 = (InterfaceC25435a) c0437l.f1503x;
            InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) c0437l.f1502w;
            AbstractC34132o.m107864I(obj2);
            c0429i0 = c0429i2;
            interfaceC4351m = interfaceC4351m2;
            interfaceC25435a = interfaceC25435a4;
            if (c22659b0.f89329w) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = c22669g0.f89336w;
            c0437l.f1502w = interfaceC25435a;
            c0437l.f1503x = c22669g0;
            c0437l.f1504y = c0429i0;
            c0437l.f1505z = null;
            c0437l.f1498E = null;
            c0437l.f1501H = 2;
            Object objInvoke = interfaceC4351m.invoke(obj5, c0437l);
            if (objInvoke != enumC31071a) {
                interfaceC25435a3 = interfaceC25435a;
                obj2 = objInvoke;
                c0429i1 = c0429i0;
                if (!AbstractC22676k.m65745e(obj2, c22669g0.f89336w)) {
                    c0437l.f1502w = interfaceC25435a3;
                    c0437l.f1503x = c22669g0;
                    c0437l.f1504y = obj2;
                    c0437l.f1501H = 3;
                    if (c0429i1.m1114j(obj2, false, c0437l) != enumC31071a) {
                        obj = obj2;
                        c22669g1 = c22669g0;
                        interfaceC25435a2 = interfaceC25435a3;
                        c22669g1.f89336w = obj;
                        c22669g0 = c22669g1;
                    }
                } else {
                    interfaceC25435a2 = interfaceC25435a3;
                }
                Object obj6 = c22669g0.f89336w;
                interfaceC25435a2.mo68214i(null);
                return obj6;
            }
            return enumC31071a;
        } catch (Throwable th5) {
            th = th5;
            interfaceC25435a2 = interfaceC25435a;
            interfaceC25435a2.mo68214i(null);
            throw th;
        }
    }
}
