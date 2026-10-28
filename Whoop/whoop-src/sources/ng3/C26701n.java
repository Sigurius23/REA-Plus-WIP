package ng3;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import at.EnumC1972p;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import jg3.C21679f;
import jg3.C21689p;
import l83.C23467m;
import l83.C23468n;
import live.hms.video.factories.C24148c;
import m83.AbstractC25267u;
import n30.C26212c;
import n30.InterfaceC26213d;
import o33.EnumC27516a;
import p002a0.C0030i1;
import p362oa.InterfaceC27750d;
import p398p9.InterfaceC28985i;
import p418q9.AbstractC30067b;
import p444r.InterfaceC30829w;
import p444r.MenuC30818l;
import p499t9.C33651t;
import p499t9.InterfaceC33627e0;
import p499t9.InterfaceC33646o;
import p503tp.InterfaceC34024a;
import p505ts.AbstractC34132o;
import p623xr.C38624t;
import p623xr.InterfaceC38616l;
import p690zr.AbstractC41023g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p93.AbstractC29032k;
import p93.C29028g;
import p93.C29029h;
import p93.C29030i;
import p93.C29031j;
import p93.EnumC29025d;
import pm.InterfaceC29353a;
import q30.C29926q0;
import q30.C29929s;
import q30.C29932t0;
import r30.C30897b;
import r30.C30902g;
import r30.EnumC30901f;
import r30.EnumC30904i;
import t30.EnumC33499a;
import t83.C33617b;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ng3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C26701n implements InterfaceC26704q, InterfaceC34024a, InterfaceC27750d, InterfaceC29353a, InterfaceC28985i, InterfaceC30829w, InterfaceC38616l {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f106192w;

    public /* synthetic */ C26701n(int i13) {
        this.f106192w = i13;
    }

    /* JADX INFO: renamed from: f */
    public static final C29929s m79401f(C30897b c30897b) {
        int i13 = C29932t0.f122237h;
        C29926q0 c29926q0 = c30897b.f127396z;
        String str = c30897b.f127393w;
        String str2 = c30897b.f127395y;
        String str3 = c30897b.f127394x;
        EnumC30904i enumC30904i = EnumC30904i.UnrecognizedCriticalMessageExtensions;
        String strValueOf = String.valueOf(402);
        C26701n c26701n = EnumC30901f.f127432x;
        return new C29929s(new C30902g(str3, str2, strValueOf, "Transaction timed-out.", "Challenge request timed-out", "CReq", str, c29926q0, 4));
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m79402h(AbstractC41023g0 abstractC41023g0, long j7) {
        C24148c c24148c = new C24148c(29);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC41023g0.size());
        Iterator<E> it = abstractC41023g0.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) c24148c.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j7);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:12:0x001c A[RETURN] */
    /* JADX INFO: renamed from: i */
    public static EnumC27516a m79403i(String str) {
        for (EnumC27516a enumC27516a : EnumC27516a.values()) {
            if (enumC27516a.f110801w.equals(str)) {
                if (enumC27516a == null) {
                    return EnumC27516a.UNKNOWN;
                }
                return enumC27516a;
            }
        }
        enumC27516a = null;
        if (enumC27516a == null) {
            return EnumC27516a.UNKNOWN;
        }
        return enumC27516a;
    }

    /* JADX INFO: renamed from: k */
    public static C26701n m79404k(EnumC1972p enumC1972p) throws GeneralSecurityException {
        int iOrdinal = enumC1972p.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
            throw new GeneralSecurityException("invalid curve type: " + enumC1972p);
        }
        return new C26701n(10);
    }

    /* JADX INFO: renamed from: m */
    public static void m79405m(AbstractC29032k functionTypeKind) {
        AbstractC22676k.m65750j(functionTypeKind, "functionTypeKind");
        if (functionTypeKind.equals(C29028g.f117498c)) {
            C26701n c26701n = EnumC29025d.f117496w;
            return;
        }
        if (functionTypeKind.equals(C29031j.f117501c)) {
            C26701n c26701n2 = EnumC29025d.f117496w;
            return;
        }
        if (functionTypeKind.equals(C29029h.f117499c)) {
            C26701n c26701n3 = EnumC29025d.f117496w;
        } else if (functionTypeKind.equals(C29030i.f117500c)) {
            C26701n c26701n4 = EnumC29025d.f117496w;
        } else {
            C26701n c26701n5 = EnumC29025d.f117496w;
        }
    }

    /* JADX INFO: renamed from: n */
    public static EnumC33499a m79406n(String directoryServerName, InterfaceC26213d errorReporter) {
        Object next;
        AbstractC22676k.m65750j(directoryServerName, "directoryServerName");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        C33617b c33617b = EnumC33499a.f139850H;
        c33617b.getClass();
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        do {
            if (!c0030i1.hasNext()) {
                next = null;
                break;
            }
            next = c0030i1.next();
        } while (!AbstractC39421y.m125921F(((EnumC33499a) next).f139851w, AbstractC39414r.m125869O0(directoryServerName).toString(), true));
        Object objM107888l = (EnumC33499a) next;
        if (objM107888l == null) {
            C33617b c33617b2 = EnumC33499a.f139850H;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c33617b2, 10));
            C0030i1 c0030i2 = new C0030i1(c33617b2, 2);
            while (c0030i2.hasNext()) {
                arrayList.add(((EnumC33499a) c0030i2.next()).f139851w);
            }
            objM107888l = AbstractC34132o.m107888l(new SDKRuntimeException("Directory server name '" + directoryServerName + "' is not supported. Must be one of " + arrayList + ".", 0));
        }
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            ((C26212c) errorReporter).m77828c(thM68037a);
        }
        EnumC33499a enumC33499a = EnumC33499a.f139848F;
        if (objM107888l instanceof C23467m) {
            objM107888l = enumC33499a;
        }
        return (EnumC33499a) objM107888l;
    }

    @Override // p623xr.InterfaceC38617m
    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object mo45127a() {
        return new C38624t("StandardIntegrity");
    }

    @Override // p398p9.InterfaceC28985i
    /* JADX INFO: renamed from: b */
    public void mo68093b() {
        synchronized (AbstractC30067b.f122681a) {
            Object obj = AbstractC30067b.f122682b;
            synchronized (obj) {
                if (AbstractC30067b.f122683c) {
                    return;
                }
                long jM92141a = AbstractC30067b.m92141a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    AbstractC30067b.f122684d = jM92141a;
                    AbstractC30067b.f122683c = true;
                }
            }
        }
    }

    @Override // p398p9.InterfaceC28985i
    /* JADX INFO: renamed from: c */
    public void mo68094c() {
    }

    @Override // p362oa.InterfaceC27750d
    /* JADX INFO: renamed from: d */
    public InterfaceC33627e0 mo2198d() {
        return new C33651t(-9223372036854775807L);
    }

    @Override // p362oa.InterfaceC27750d
    /* JADX INFO: renamed from: e */
    public void mo2200e(long j7) {
    }

    @Override // p444r.InterfaceC30829w
    /* JADX INFO: renamed from: g */
    public void mo16445g(MenuC30818l menuC30818l, boolean z4) {
    }

    @Override // pm.InterfaceC29353a
    public long getTime() {
        return System.currentTimeMillis();
    }

    @Override // p362oa.InterfaceC27750d
    /* JADX INFO: renamed from: j */
    public long mo2203j(InterfaceC33646o interfaceC33646o) {
        return -1L;
    }

    @Override // ng3.InterfaceC26704q
    /* JADX INFO: renamed from: l */
    public Object mo43799l(InterfaceC26698k interfaceC26698k) {
        switch (this.f106192w) {
            case 0:
                return (InterfaceC26705r) interfaceC26698k.mo14019g(this);
            case 1:
                EnumC26688a enumC26688a = EnumC26688a.OFFSET_SECONDS;
                if (interfaceC26698k.mo60986a(enumC26688a)) {
                    return C21689p.m61076r(interfaceC26698k.mo14018f(enumC26688a));
                }
                return null;
            default:
                EnumC26688a enumC26688a2 = EnumC26688a.NANO_OF_DAY;
                if (interfaceC26698k.mo60986a(enumC26688a2)) {
                    return C21679f.m61033u0(interfaceC26698k.mo60987h(enumC26688a2));
                }
                return null;
        }
    }

    @Override // p444r.InterfaceC30829w
    /* JADX INFO: renamed from: s */
    public boolean mo16448s(MenuC30818l menuC30818l) {
        return false;
    }
}
