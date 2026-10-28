package p118ei;

import androidx.room.C1774d;
import bc3.C3033m;
import bi.C3273k;
import bi.C3280r;
import bi.C3281s;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import java.io.Closeable;
import p505ts.AbstractC34132o;
import p547v8.AbstractC35785b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import ud3.C34826l0;
import ud3.C34832o0;
import ud3.C34850x0;
import va3.AbstractC35854l;
import zd3.C40571o;

/* JADX INFO: renamed from: ei.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C13215b {

    /* JADX INFO: renamed from: a */
    public final C34826l0 f45798a;

    public /* synthetic */ C13215b(C34826l0 c34826l0) {
        this.f45798a = c34826l0;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static Object m37114a(C34826l0 c34826l0, C3280r c3280r, C3273k c3273k, AbstractC32269c abstractC32269c) {
        C13214a c13214a;
        InterfaceC4351m interfaceC4351m;
        InterfaceC4351m interfaceC4351m2;
        Closeable closeable;
        Throwable th3;
        Closeable closeable2;
        if (abstractC32269c instanceof C13214a) {
            c13214a = (C13214a) abstractC32269c;
            int i13 = c13214a.f45797z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13214a.f45797z = i13 - Integer.MIN_VALUE;
            } else {
                c13214a = new C13214a(abstractC32269c);
            }
        } else {
            c13214a = new C13214a(abstractC32269c);
        }
        Object objM113413h = c13214a.f45796y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13214a.f45797z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM113413h);
            c13214a.f45794w = c3273k;
            c13214a.f45795x = c34826l0;
            c13214a.f45797z = 1;
            objM113413h = AbstractC35785b.m113413h(c3280r, c13214a);
            if (objM113413h != enumC31071a) {
            }
            interfaceC4351m = c3273k;
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable2 = (Closeable) c13214a.f45794w;
                try {
                    AbstractC34132o.m107864I(objM113413h);
                    AbstractC35854l.m113829i(closeable2, null);
                    return objM113413h;
                } catch (Throwable th4) {
                    th3 = th4;
                    try {
                        throw th3;
                    } catch (Throwable th5) {
                        AbstractC35854l.m113829i(closeable2, th3);
                        throw th5;
                    }
                }
            }
            InterfaceC4351m interfaceC4351m3 = (InterfaceC4351m) c13214a.f45794w;
            AbstractC34132o.m107864I(objM113413h);
            interfaceC4351m2 = interfaceC4351m3;
            closeable = (Closeable) objM113413h;
            try {
                C3281s c3281sM113412g = AbstractC35785b.m113412g((C34850x0) closeable);
                c13214a.f45794w = closeable;
                c13214a.f45797z = 3;
                objM113413h = interfaceC4351m2.invoke(c3281sM113412g, c13214a);
                if (objM113413h != enumC31071a) {
                    closeable2 = closeable;
                    AbstractC35854l.m113829i(closeable2, null);
                    return objM113413h;
                }
                interfaceC4351m = c3273k;
                return enumC31071a;
            } catch (Throwable th6) {
                th3 = th6;
                closeable2 = closeable;
                throw th3;
            }
        }
        c34826l0 = c13214a.f45795x;
        InterfaceC4351m interfaceC4351m4 = (InterfaceC4351m) c13214a.f45794w;
        AbstractC34132o.m107864I(objM113413h);
        interfaceC4351m = interfaceC4351m4;
        interfaceC4351m = c3273k;
        C40571o c40571oM109898b = c34826l0.m109898b((C34832o0) objM113413h);
        c13214a.f45794w = interfaceC4351m;
        c13214a.f45795x = null;
        c13214a.f45797z = 2;
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c13214a));
        c3033m.m8774s();
        C1774d c1774d = new C1774d(1, c40571oM109898b, c3033m);
        c40571oM109898b.m131548d(c1774d);
        c3033m.m8776u(c1774d);
        objM113413h = c3033m.m8773r();
        if (objM113413h != enumC31071a) {
            interfaceC4351m2 = interfaceC4351m;
            closeable = (Closeable) objM113413h;
            C3281s c3281sM113412g2 = AbstractC35785b.m113412g((C34850x0) closeable);
            c13214a.f45794w = closeable;
            c13214a.f45797z = 3;
            objM113413h = interfaceC4351m2.invoke(c3281sM113412g2, c13214a);
            if (objM113413h != enumC31071a) {
                closeable2 = closeable;
                AbstractC35854l.m113829i(closeable2, null);
                return objM113413h;
            }
        }
        interfaceC4351m = c3273k;
        return enumC31071a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C13215b) {
            return this.f45798a.equals(((C13215b) obj).f45798a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45798a.hashCode();
    }

    public final String toString() {
        return "CallFactoryNetworkClient(callFactory=" + this.f45798a + ')';
    }
}
