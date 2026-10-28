package p007a6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.C1565b0;
import androidx.lifecycle.C1614p;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1633v0;
import androidx.room.C1849z1;
import bc3.AbstractC3006f0;
import bc3.C3003e1;
import bc3.C3016h2;
import bc3.C3058t;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ch3.C4685h;
import ck.C4776f;
import com.amplitude.android.engagement.C4861a;
import dk.C12100f;
import fk.InterfaceC14544a;
import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l83.C23454a0;
import m83.AbstractC25267u;
import org.json.JSONObject;
import p005a3.C0237p;
import p109e6.AbstractC12755j;
import p138f6.AbstractC14134f;
import p138f6.C14132d;
import p173gj.C15903d;
import p173gj.C15906g;
import p197hj.C17326i;
import p197hj.C17332o;
import p255jk.C21743a;
import p281kj.C22507b;
import p343nk.C26792m;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.C30058e;
import q83.InterfaceC30057d;
import q83.InterfaceC30059f;
import q83.InterfaceC30061h;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a6.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0448q extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1548w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f1549x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f1550y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0448q(InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f1548w = 8;
        this.f1550y = (AbstractC32275i) interfaceC4351m;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f1548w) {
            case 0:
                C0448q c0448q = new C0448q((AbstractC0418e1) this.f1550y, interfaceC30057d, 0);
                c0448q.f1549x = obj;
                return c0448q;
            case 1:
                return new C0448q((AbstractC1615p0) this.f1549x, (C1614p) this.f1550y, interfaceC30057d, 1);
            case 2:
                return new C0448q((AbstractC1615p0) this.f1549x, (InterfaceC1633v0) this.f1550y, interfaceC30057d, 2);
            case 3:
                C0448q c0448q2 = new C0448q((C1565b0) this.f1550y, interfaceC30057d, 3);
                c0448q2.f1549x = obj;
                return c0448q2;
            case 4:
                C0448q c0448q3 = new C0448q((InterfaceC4339a) this.f1550y, interfaceC30057d, 4);
                c0448q3.f1549x = obj;
                return c0448q3;
            case 5:
                return new C0448q((C15903d) this.f1549x, (C4776f) this.f1550y, interfaceC30057d, 5);
            case 6:
                C0448q c0448q4 = new C0448q((Set) this.f1550y, interfaceC30057d, 6);
                c0448q4.f1549x = obj;
                return c0448q4;
            case 7:
                return new C0448q((C22507b) this.f1549x, (C21743a) this.f1550y, interfaceC30057d, 7);
            case 8:
                C0448q c0448q5 = new C0448q((AbstractC32275i) this.f1550y, interfaceC30057d);
                c0448q5.f1549x = obj;
                return c0448q5;
            case 9:
                return new C0448q((C0237p) this.f1549x, (String) this.f1550y, interfaceC30057d, 9);
            default:
                return new C0448q((C26792m) this.f1549x, (String) this.f1550y, interfaceC30057d, 10);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f1548w) {
            case 0:
                return ((C0448q) create((AbstractC0418e1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                C0448q c0448q = (C0448q) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c0448q.invokeSuspend(c23454a0);
                return c23454a0;
            case 2:
                C0448q c0448q2 = (C0448q) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c0448q2.invokeSuspend(c23454a1);
                return c23454a1;
            case 3:
                C0448q c0448q3 = (C0448q) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c0448q3.invokeSuspend(c23454a2);
                return c23454a2;
            case 4:
                return ((C0448q) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                C0448q c0448q4 = (C0448q) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a3 = C23454a0.f92919a;
                c0448q4.invokeSuspend(c23454a3);
                return c23454a3;
            case 6:
                return ((C0448q) create((AbstractC14134f) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                C0448q c0448q5 = (C0448q) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a4 = C23454a0.f92919a;
                c0448q5.invokeSuspend(c23454a4);
                return c23454a4;
            case 8:
                return ((C0448q) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 9:
                C0448q c0448q6 = (C0448q) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a5 = C23454a0.f92919a;
                c0448q6.invokeSuspend(c23454a5);
                return c23454a5;
            default:
                C0448q c0448q7 = (C0448q) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a6 = C23454a0.f92919a;
                c0448q7.invokeSuspend(c23454a6);
                return c23454a6;
        }
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [c93.m, s83.i] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i13;
        int i14 = this.f1548w;
        boolean z4 = true;
        InterfaceC30057d interfaceC30057d = null;
        boolean z13 = false;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f1550y;
        switch (i14) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                AbstractC0418e1 abstractC0418e1 = (AbstractC0418e1) this.f1549x;
                return Boolean.valueOf((abstractC0418e1 instanceof C0407b) && ((C0407b) abstractC0418e1).f1440a <= ((C0407b) ((AbstractC0418e1) obj2)).f1440a);
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((AbstractC1615p0) this.f1549x).observeForever((C1614p) obj2);
                return c23454a0;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((AbstractC1615p0) this.f1549x).removeObserver((InterfaceC1633v0) obj2);
                return c23454a0;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f1549x;
                C1565b0 c1565b0 = (C1565b0) obj2;
                AbstractC1638x abstractC1638x = c1565b0.f6190w;
                if (abstractC1638x.getCurrentState().compareTo(EnumC1635w.f6326x) >= 0) {
                    abstractC1638x.mo4986a(c1565b0);
                } else {
                    AbstractC3006f0.m8715i(interfaceC2994c0.getCoroutineContext(), null);
                }
                return c23454a0;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC30063j coroutineContext = ((InterfaceC2994c0) this.f1549x).getCoroutineContext();
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj2;
                try {
                    C3016h2 c3016h2 = new C3016h2();
                    c3016h2.f12035F = AbstractC3006f0.m8728v(AbstractC3006f0.m8725s(coroutineContext), true, c3016h2);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C3016h2.f12033G;
                    try {
                        do {
                            i13 = atomicIntegerFieldUpdater.get(c3016h2);
                            if (i13 != 0) {
                                if (i13 != 2 && i13 != 3) {
                                    C3016h2.m8739l(i13);
                                    throw null;
                                }
                            }
                            return interfaceC4339a.invoke();
                        } while (!atomicIntegerFieldUpdater.compareAndSet(c3016h2, i13, 0));
                        return interfaceC4339a.invoke();
                    } finally {
                        c3016h2.m8740k();
                    }
                } catch (InterruptedException e5) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e5);
                }
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C15906g c15906g = ((C15903d) this.f1549x).f60128a;
                C4685h c4685h = ((C4776f) obj2).f19672w;
                if (c4685h == null) {
                    AbstractC22676k.m65757q("networkConnectivityChecker");
                    throw null;
                }
                InterfaceC14544a interfaceC14544a = (InterfaceC14544a) c4685h.f19188z;
                if (c4685h.f19187y) {
                    try {
                        Object systemService = ((Context) c4685h.f19186x).getSystemService("connectivity");
                        if (systemService instanceof ConnectivityManager) {
                            Network activeNetwork = ((ConnectivityManager) systemService).getActiveNetwork();
                            if (activeNetwork != null) {
                                NetworkCapabilities networkCapabilities = ((ConnectivityManager) systemService).getNetworkCapabilities(activeNetwork);
                                if (networkCapabilities != null) {
                                    if (!networkCapabilities.hasTransport(1)) {
                                        if (networkCapabilities.hasTransport(0)) {
                                        }
                                    }
                                }
                            }
                        } else {
                            interfaceC14544a.debug("Service is not an instance of ConnectivityManager. Offline mode is not supported");
                        }
                    } catch (Throwable th3) {
                        interfaceC14544a.warn("Error checking network connectivity: " + th3.getMessage());
                        interfaceC14544a.warn(AbstractC29125c.m88514W(th3));
                    }
                    z13 = true;
                    break;
                } else {
                    z13 = true;
                }
                c15906g.f60167p = Boolean.valueOf(!z13);
                return c23454a0;
            case 6:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                Set setKeySet = ((AbstractC14134f) this.f1549x).mo40226a().keySet();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(setKeySet, 10));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C14132d) it.next()).f50837a);
                }
                Set set = (Set) obj2;
                if (set != AbstractC12755j.f43635a) {
                    Set set2 = set;
                    if ((set2 instanceof Collection) && set2.isEmpty()) {
                        z4 = false;
                    } else {
                        Iterator it3 = set2.iterator();
                        while (it3.hasNext()) {
                            if (!arrayList.contains((String) it3.next())) {
                            }
                        }
                        z4 = false;
                    }
                }
                return Boolean.valueOf(z4);
            case 7:
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C4861a c4861a = ((C22507b) this.f1549x).f88211w;
                C21743a c21743a = (C21743a) obj2;
                C4861a.f20259o.m16030H(new C17332o(0, c21743a));
                JSONObject jSONObjectM44469v = AbstractC15751g.m44469v(c21743a);
                c4861a.f20263d.m53801a("window.engagement.forwardEvent(" + jSONObjectM44469v + ')', C17326i.f67115y);
                return c23454a0;
            case 8:
                EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC30061h interfaceC30061h = ((InterfaceC2994c0) this.f1549x).getCoroutineContext().get(C30058e.f122675w);
                AbstractC22676k.m65747g(interfaceC30061h);
                InterfaceC30059f interfaceC30059f = (InterfaceC30059f) interfaceC30061h;
                C3058t c3058tM8707a = AbstractC3006f0.m8707a();
                AbstractC3006f0.m8731y(C3003e1.f12012w, interfaceC30059f, EnumC2998d0.f12007z, new C0458v(c3058tM8707a, (InterfaceC4351m) obj2, (InterfaceC30057d) null));
                while (!c3058tM8707a.isCompleted()) {
                    try {
                        return AbstractC3006f0.m8699E(interfaceC30059f, new C1849z1(c3058tM8707a, interfaceC30057d, 8));
                    } catch (InterruptedException unused) {
                    }
                }
                return c3058tM8707a.m8801A();
            case 9:
                EnumC31071a enumC31071a10 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((C12100f) ((C0237p) this.f1549x).f812x).m33432i((String) obj2);
                return c23454a0;
            default:
                EnumC31071a enumC31071a11 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((C26792m) this.f1549x).f106715a.m33432i((String) obj2);
                return c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0448q(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f1548w = i13;
        this.f1549x = obj;
        this.f1550y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0448q(Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f1548w = i13;
        this.f1550y = obj;
    }
}
