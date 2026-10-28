package androidx.room;

import a00.C0072g;
import android.os.CancellationSignal;
import android.view.InputDevice;
import android.view.KeyEvent;
import bc3.C2996c2;
import bc3.C3033m;
import fa3.C14303b;
import fa3.EnumC14301a;
import hb3.C17122k;
import ia3.C18295a;
import ja3.C21509f;
import ja3.C21519o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import jb3.C21541a;
import jb3.C21548h;
import kb3.C22340i;
import l83.C23454a0;
import lb3.AbstractC23811y;
import lg3.C24055q;
import m83.AbstractC25265s;
import na3.C26515b;
import na3.C26517d;
import na3.C26530q;
import o93.AbstractC27736h;
import o93.AbstractC27741m;
import ob3.InterfaceC27797g;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p048ce.C4463d;
import p117eh.C13184a;
import p133f1.C13977s1;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p292l1.C23203x4;
import p390p1.InterfaceC28601c1;
import p477s2.AbstractC32073e;
import p477s2.C32071c;
import p505ts.AbstractC34132o;
import p510u0.AbstractC34339n0;
import p510u0.C34354s0;
import p510u0.EnumC34318g0;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30172x;
import r93.InterfaceC31111c;
import r93.InterfaceC31126h;
import r93.InterfaceC31155s0;
import s93.InterfaceC32300b;
import u93.C34697q0;
import u93.C34704u;
import ud3.C34850x0;
import ud3.InterfaceC34821j;
import ud3.InterfaceC34823k;
import va3.C35850h;
import wb3.AbstractC37056f;
import ya3.AbstractC39373p;
import zd3.C40571o;

/* JADX INFO: renamed from: androidx.room.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C1774d implements Function1, InterfaceC34823k {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6995w;

    /* JADX INFO: renamed from: x */
    public final Object f6996x;

    /* JADX INFO: renamed from: y */
    public final Object f6997y;

    public /* synthetic */ C1774d(int i13, Object obj, Object obj2) {
        this.f6995w = i13;
        this.f6996x = obj;
        this.f6997y = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x014a  */
    /* JADX WARN: Code duplicated, block: B:8:0x002c  */
    /* JADX WARN: Code duplicated, block: B:92:0x019d  */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object extractNullability) {
        InterfaceC31126h interfaceC31126hMo1784d;
        C26517d c26517d;
        boolean zM43345h = true;
        int i13 = 4;
        switch (this.f6995w) {
            case 0:
                CancellationSignal cancellationSignal = (CancellationSignal) this.f6996x;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                ((C2996c2) this.f6997y).cancel((CancellationException) null);
                return C23454a0.f92919a;
            case 1:
                try {
                    ((C40571o) this.f6996x).cancel();
                    break;
                } catch (Throwable unused) {
                }
                return C23454a0.f92919a;
            case 2:
                C34697q0 c34697q0 = (C34697q0) this.f6996x;
                C21519o c21519o = (C21519o) this.f6997y;
                C35850h accessorName = (C35850h) extractNullability;
                AbstractC22676k.m65750j(accessorName, "accessorName");
                return AbstractC22676k.m65745e(c34697q0.getName(), accessorName) ? AbstractC37056f.m118958J(c34697q0) : AbstractC25265s.m74129g1(c21519o.m60511E(accessorName), c21519o.m60512F(accessorName));
            case 3:
                C0072g c0072g = (C0072g) this.f6996x;
                C21548h c21548h = (C21548h) this.f6997y;
                C17122k c17122k = c21548h.f82636L;
                C35850h name = (C35850h) extractNullability;
                AbstractC22676k.m65750j(name, "name");
                C30172x c30172x = (C30172x) ((LinkedHashMap) c0072g.f223x).get(name);
                if (c30172x != null) {
                    return C34704u.m109616X(c17122k.f65760a.f65735a, c21548h, name, (C22340i) c0072g.f225z, new C21541a(c17122k.f65760a.f65735a, new C4463d(i13, c21548h, c30172x)), InterfaceC31155s0.f128370q);
                }
                return null;
            case 4:
                KeyEvent keyEvent = ((C32071c) extractNullability).f133019a;
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) this.f6997y;
                if (!((C23203x4) this.f6996x).m67160b()) {
                    interfaceC28601c1.setValue(Boolean.FALSE);
                }
                return Boolean.FALSE;
            case 5:
                C24055q c24055q = (C24055q) this.f6996x;
                C41113q c41113q = (C41113q) c24055q.f95071e;
                C26515b c26515b = (C26515b) this.f6997y;
                AbstractC22676k.m65750j(extractNullability, "$this$extractNullability");
                InterfaceC27797g interfaceC27797g = c26515b.f105422a;
                InterfaceC32300b interfaceC32300b = (InterfaceC32300b) extractNullability;
                if (interfaceC32300b instanceof C21509f) {
                    ((C18295a) c41113q.f177224x).f71242t.getClass();
                    if (!((C21509f) interfaceC32300b).f82498g && ((EnumC14301a) c24055q.f95072f) != EnumC14301a.TYPE_PARAMETER_BOUNDS) {
                        if (interfaceC27797g != null) {
                            C35850h c35850h = AbstractC27736h.f111789e;
                            interfaceC31126hMo1784d = ((AbstractC23811y) interfaceC27797g).mo69844i0().mo1784d();
                            if (interfaceC31126hMo1784d != null || AbstractC27736h.m83811s(interfaceC31126hMo1784d) == null) {
                                zM43345h = false;
                            } else {
                                ((C18295a) c41113q.f177224x).f71239q.getClass();
                                Object objM40909c = C14303b.m40909c(interfaceC32300b, AbstractC27741m.f111869t);
                                if (objM40909c == null) {
                                    zM43345h = false;
                                } else {
                                    ArrayList arrayListM40907a = C14303b.m40907a(objM40909c, false);
                                    if (arrayListM40907a.isEmpty()) {
                                        zM43345h = false;
                                    } else {
                                        Iterator it = arrayListM40907a.iterator();
                                        while (it.hasNext()) {
                                            if (AbstractC22676k.m65745e((String) it.next(), "TYPE")) {
                                                ((C18295a) c41113q.f177224x).f71242t.getClass();
                                            }
                                        }
                                        zM43345h = false;
                                    }
                                }
                            }
                        } else {
                            zM43345h = false;
                        }
                    }
                } else if (interfaceC27797g != null) {
                    C35850h c35850h2 = AbstractC27736h.f111789e;
                    interfaceC31126hMo1784d = ((AbstractC23811y) interfaceC27797g).mo69844i0().mo1784d();
                    if (interfaceC31126hMo1784d != null) {
                        zM43345h = false;
                    } else {
                        zM43345h = false;
                    }
                } else {
                    zM43345h = false;
                }
                return Boolean.valueOf(zM43345h);
            case 6:
                C26530q c26530q = (C26530q) this.f6996x;
                C26517d[] c26517dArr = (C26517d[]) this.f6997y;
                int iIntValue = ((Number) extractNullability).intValue();
                if (c26530q == null || (c26517d = (C26517d) c26530q.f105468a.get(Integer.valueOf(iIntValue))) == null) {
                    return (iIntValue < 0 || iIntValue >= c26517dArr.length) ? C26517d.f105426e : c26517dArr[iIntValue];
                }
                return c26517d;
            case 7:
                C13184a c13184a = (C13184a) this.f6996x;
                Object obj = c13184a.f45697b;
                C3033m c3033m = (C3033m) this.f6997y;
                synchronized (obj) {
                    ((ArrayList) c13184a.f45698c).remove(c3033m);
                }
                return C23454a0.f92919a;
            case 8:
                KeyEvent keyEvent2 = ((C32071c) extractNullability).f133019a;
                if (((C34354s0) this.f6996x).m108659a() == EnumC34318g0.f144087x && keyEvent2.getKeyCode() == 4 && AbstractC32073e.m99720L(keyEvent2) == 1) {
                    ((C13977s1) this.f6997y).m39777g(null);
                } else {
                    zM43345h = false;
                }
                return Boolean.valueOf(zM43345h);
            case 9:
                KeyEvent keyEvent3 = ((C32071c) extractNullability).f133019a;
                InterfaceC15237i interfaceC15237i = (InterfaceC15237i) this.f6996x;
                InputDevice device = keyEvent3.getDevice();
                if (device == null || !device.supportsSource(513) || device.isVirtual() || AbstractC32073e.m99720L(keyEvent3) != 2 || keyEvent3.getSource() == 257) {
                    zM43345h = false;
                } else if (AbstractC34339n0.m108631i(19, keyEvent3)) {
                    zM43345h = ((C15240l) interfaceC15237i).m43345h(5);
                } else if (AbstractC34339n0.m108631i(20, keyEvent3)) {
                    zM43345h = ((C15240l) interfaceC15237i).m43345h(6);
                } else if (AbstractC34339n0.m108631i(21, keyEvent3)) {
                    zM43345h = ((C15240l) interfaceC15237i).m43345h(3);
                } else if (AbstractC34339n0.m108631i(22, keyEvent3)) {
                    zM43345h = ((C15240l) interfaceC15237i).m43345h(4);
                } else if (AbstractC34339n0.m108631i(23, keyEvent3)) {
                    InterfaceC2464x2 interfaceC2464x2 = ((C34354s0) this.f6997y).f144309c;
                    if (interfaceC2464x2 != null) {
                        ((C2463x1) interfaceC2464x2).m7443b();
                    }
                } else {
                    zM43345h = false;
                }
                return Boolean.valueOf(zM43345h);
            default:
                InterfaceC31111c second = (InterfaceC31111c) extractNullability;
                AbstractC39373p abstractC39373p = (AbstractC39373p) this.f6996x;
                InterfaceC31111c interfaceC31111c = (InterfaceC31111c) this.f6997y;
                AbstractC22676k.m65750j(second, "second");
                abstractC39373p.mo43950c(interfaceC31111c, second);
                return C23454a0.f92919a;
        }
    }

    @Override // ud3.InterfaceC34823k
    public void onFailure(InterfaceC34821j interfaceC34821j, IOException iOException) {
        if (((C40571o) interfaceC34821j).f174718R) {
            return;
        }
        ((C3033m) this.f6997y).resumeWith(AbstractC34132o.m107888l(iOException));
    }

    @Override // ud3.InterfaceC34823k
    public void onResponse(InterfaceC34821j interfaceC34821j, C34850x0 c34850x0) {
        ((C3033m) this.f6997y).resumeWith(c34850x0);
    }
}
