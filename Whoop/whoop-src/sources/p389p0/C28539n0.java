package p389p0;

import a63.C0486f0;
import a63.C0488g0;
import a63.C0490h0;
import ad3.AbstractC0757c;
import ad3.C0783z;
import android.content.Context;
import android.util.SparseIntArray;
import androidx.room.AbstractC1772c1;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.C3033m;
import bc3.C3037n;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.google.android.gms.common.C4987d;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.InterfaceC4973d;
import e63.C12776e;
import fk.InterfaceC14544a;
import io.ktor.client.network.sockets.ConnectTimeoutException;
import j93.AbstractC21478l0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.net.SocketTimeoutException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p002a0.C0005a0;
import p005a3.C0237p;
import p031b9.AbstractC2875y;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11395r;
import p077d0.C11351f2;
import p077d0.C11376m;
import p249jc.C21567b;
import p279kd.C22379f;
import p380os.C28301a;
import p428qk.C30438a;
import p428qk.C30439b;
import p499t9.InterfaceC33644n;
import p505ts.AbstractC34132o;
import p505ts.C34124g;
import p505ts.C34128k;
import p518ub.InterfaceC34733f;
import p518ub.InterfaceC34734g;
import p529uo.AbstractC35135w;
import p634y1.C39029b;
import p634y1.InterfaceC39037j;
import p636y3.InterfaceC39171c;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import pg3.AbstractC29184e1;
import pg3.C29174b0;
import pg3.InterfaceC29189h;
import pg3.InterfaceC29201n;
import q83.InterfaceC30057d;
import ud3.AbstractC34799a1;
import ud3.C34850x0;
import ud3.InterfaceC34821j;
import ud3.InterfaceC34823k;
import va3.AbstractC35854l;
import wa3.AbstractC37006m;
import wa3.C36994g;
import wa3.C36995g0;
import wa3.C37000j;
import wa3.C37008n;
import wa3.EnumC37011o0;
import wa3.InterfaceC37019v;
import wb3.AbstractC37056f;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37147l;
import yb3.AbstractC39414r;
import zd3.C40571o;

/* JADX INFO: renamed from: p0.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C28539n0 implements InterfaceC34823k, InterfaceC29201n, InterfaceC34734g, InterfaceC39037j {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115461w;

    /* JADX INFO: renamed from: x */
    public Object f115462x;

    /* JADX INFO: renamed from: y */
    public Object f115463y;

    public /* synthetic */ C28539n0(int i13, Object obj, Object obj2) {
        this.f115461w = i13;
        this.f115462x = obj;
        this.f115463y = obj2;
    }

    @Override // p634y1.InterfaceC39037j
    /* JADX INFO: renamed from: a */
    public Object mo67322a(C39029b c39029b, Object obj) {
        return ((InterfaceC4351m) this.f115462x).invoke(c39029b, obj);
    }

    @Override // p518ub.InterfaceC34734g
    /* JADX INFO: renamed from: b */
    public int mo5445b() {
        Object[] objArr = (Object[]) this.f115463y;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    @Override // p634y1.InterfaceC39037j
    /* JADX INFO: renamed from: c */
    public Object mo67323c(Object obj) {
        return ((Function1) this.f115463y).invoke(obj);
    }

    @Override // pg3.InterfaceC29201n
    public Object convert(Object obj) {
        AbstractC34799a1 value = (AbstractC34799a1) obj;
        AbstractC22676k.m65750j(value, "value");
        C0783z c0783z = (C0783z) this.f115463y;
        InterfaceC37137b loader = (InterfaceC37137b) this.f115462x;
        c0783z.getClass();
        AbstractC22676k.m65750j(loader, "loader");
        String strM109860m = value.m109860m();
        InterfaceC37147l interfaceC37147l = (InterfaceC37147l) c0783z.f2818x;
        AbstractC22676k.m65747g(strM109860m);
        return ((AbstractC0757c) interfaceC37147l).m1831b(loader, strM109860m);
    }

    /* JADX INFO: renamed from: d */
    public C34128k m86834d() throws GeneralSecurityException {
        Integer num = (Integer) this.f115462x;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((C34124g) this.f115463y) != null) {
            return new C34128k(num.intValue(), (C34124g) this.f115463y);
        }
        throw new GeneralSecurityException("hash type is not set");
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC33644n m86835e(Object... objArr) {
        Constructor constructorM85742a;
        synchronized (((AtomicBoolean) this.f115463y)) {
            if (!((AtomicBoolean) this.f115463y).get()) {
                try {
                    constructorM85742a = ((C28301a) this.f115462x).m85742a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f115463y).set(true);
                    constructorM85742a = null;
                } catch (Exception e5) {
                    throw new RuntimeException("Error instantiating extension", e5);
                }
            }
            constructorM85742a = null;
        }
        if (constructorM85742a == null) {
            return null;
        }
        try {
            return (InterfaceC33644n) constructorM85742a.newInstance(objArr);
        } catch (Exception e13) {
            throw new IllegalStateException("Unexpected error creating extractor", e13);
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized Map m86836f() {
        try {
            if (((Map) this.f115463y) == null) {
                this.f115463y = Collections.unmodifiableMap(new HashMap((HashMap) this.f115462x));
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return (Map) this.f115463y;
    }

    /* JADX INFO: renamed from: g */
    public C30438a m86837g() {
        C0237p c0237p = (C0237p) this.f115463y;
        return new C30438a(((Properties) c0237p.f813y).getProperty("user_id", null), ((Properties) c0237p.f813y).getProperty("device_id", null));
    }

    @Override // p518ub.InterfaceC34734g
    /* JADX INFO: renamed from: h */
    public String mo5446h() {
        return (String) this.f115462x;
    }

    @Override // p518ub.InterfaceC34734g
    /* JADX INFO: renamed from: i */
    public void mo5447i(InterfaceC34733f interfaceC34733f) {
        AbstractC29125c.m88535l(interfaceC34733f, (Object[]) this.f115463y);
    }

    /* JADX INFO: renamed from: j */
    public void m86838j(String str) {
        C0237p c0237p = (C0237p) this.f115463y;
        if (str == null) {
            str = "";
        }
        c0237p.m678I("device_id", str);
    }

    /* JADX INFO: renamed from: k */
    public void m86839k(String str) {
        C0237p c0237p = (C0237p) this.f115463y;
        if (str == null) {
            str = "";
        }
        c0237p.m678I("user_id", str);
    }

    /* JADX INFO: renamed from: l */
    public void m86840l(int i13) throws InvalidAlgorithmParameterException {
        if (i13 < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit or larger are supported", Integer.valueOf(i13 * 8)));
        }
        this.f115462x = Integer.valueOf(i13);
    }

    /* JADX INFO: renamed from: m */
    public void m86841m(float f13, InterfaceC39171c interfaceC39171c, InterfaceC2994c0 interfaceC2994c0) {
        if (f13 <= interfaceC39171c.mo743q0(AbstractC28541o0.f115464a)) {
            return;
        }
        AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
        InterfaceC30057d interfaceC30057d = null;
        Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
        AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
        try {
            float fFloatValue = ((Number) ((C11376m) this.f115463y).f36471x.getValue()).floatValue();
            C2996c2 c2996c2 = (C2996c2) this.f115462x;
            if (c2996c2 != null) {
                c2996c2.cancel((CancellationException) null);
            }
            C11376m c11376m = (C11376m) this.f115463y;
            if (c11376m.f36469F) {
                this.f115463y = AbstractC11348f.m30565m(c11376m, fFloatValue - f13, 0.0f, 30);
            } else {
                this.f115463y = new C11376m(AbstractC11348f.f36367i, Float.valueOf(-f13), null, 60);
            }
            this.f115462x = AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C22379f(this, interfaceC30057d, 23), 3);
        } finally {
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m86842n(int i13, C36994g c36994g) {
        Iterator it = (Iterator) this.f115462x;
        while (true) {
            Map.Entry entry = (Map.Entry) this.f115463y;
            if (entry == null || ((C37008n) entry.getKey()).f158357w >= i13) {
                return;
            }
            C37008n c37008n = (C37008n) ((Map.Entry) this.f115463y).getKey();
            Object value = ((Map.Entry) this.f115463y).getValue();
            C37000j c37000j = C37000j.f158349c;
            EnumC37011o0 enumC37011o0 = c37008n.f158358x;
            int i14 = c37008n.f158357w;
            if (c37008n.f158359y) {
                for (Object obj : (List) value) {
                    if (enumC37011o0 == EnumC37011o0.f158365E) {
                        c36994g.m118799x(i14, 3);
                        ((InterfaceC37019v) obj).mo92264f(c36994g);
                        c36994g.m118799x(i14, 4);
                    } else {
                        c36994g.m118799x(i14, enumC37011o0.f158372x);
                        C37000j.m118806k(c36994g, enumC37011o0, obj);
                    }
                }
            } else if (enumC37011o0 == EnumC37011o0.f158365E) {
                c36994g.m118799x(i14, 3);
                ((InterfaceC37019v) value).mo92264f(c36994g);
                c36994g.m118799x(i14, 4);
            } else {
                c36994g.m118799x(i14, enumC37011o0.f158372x);
                C37000j.m118806k(c36994g, enumC37011o0, value);
            }
            if (it.hasNext()) {
                this.f115463y = (Map.Entry) it.next();
            } else {
                this.f115463y = null;
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public int m86843o(Context context, InterfaceC4973d interfaceC4973d) {
        int i13;
        int iIsGooglePlayServicesAvailable;
        AbstractC35135w.m111094f(context);
        AbstractC35135w.m111094f(interfaceC4973d);
        int iMo5666b = interfaceC4973d.mo5666b();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f115462x;
        synchronized (sparseIntArray) {
            i13 = sparseIntArray.get(iMo5666b, -1);
        }
        if (i13 != -1) {
            return i13;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.f115462x;
        synchronized (sparseIntArray2) {
            iIsGooglePlayServicesAvailable = 0;
            int i14 = 0;
            while (true) {
                try {
                    if (i14 >= sparseIntArray2.size()) {
                        iIsGooglePlayServicesAvailable = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i14);
                    if (iKeyAt > iMo5666b && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i14++;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (iIsGooglePlayServicesAvailable == -1) {
                iIsGooglePlayServicesAvailable = ((C4987d) this.f115463y).isGooglePlayServicesAvailable(context, iMo5666b);
            }
            sparseIntArray2.put(iMo5666b, iIsGooglePlayServicesAvailable);
        }
        return iIsGooglePlayServicesAvailable;
    }

    @Override // ud3.InterfaceC34823k
    public void onFailure(InterfaceC34821j interfaceC34821j, IOException iOException) {
        Object obj;
        switch (this.f115461w) {
            case 2:
                try {
                    ((InterfaceC29189h) this.f115462x).mo2329r((C29174b0) this.f115463y, iOException);
                } catch (Throwable th3) {
                    AbstractC29184e1.m88696r(th3);
                    th3.printStackTrace();
                    return;
                }
                break;
            default:
                C3033m c3033m = (C3033m) this.f115463y;
                c3033m.getClass();
                if (!(C3033m.f12052G.get(c3033m) instanceof C3037n)) {
                    C12776e request = (C12776e) this.f115462x;
                    Throwable[] suppressed = iOException.getSuppressed();
                    AbstractC22676k.m65749i(suppressed, "suppressed");
                    if (suppressed.length != 0) {
                        iOException = iOException.getSuppressed()[0];
                        AbstractC22676k.m65749i(iOException, "suppressed[0]");
                    }
                    if (iOException instanceof SocketTimeoutException) {
                        String message = iOException.getMessage();
                        if (message == null || !AbstractC39414r.m125876U(message, "connect", true)) {
                            iOException = AbstractC21478l0.m60429e(request, (SocketTimeoutException) iOException);
                        } else {
                            AbstractC22676k.m65750j(request, "request");
                            StringBuilder sb4 = new StringBuilder("Connect timeout has expired [url=");
                            sb4.append(request.f43715a);
                            sb4.append(", connect_timeout=");
                            C0488g0 c0488g0 = C0490h0.f1652d;
                            C0486f0 c0486f0 = (C0486f0) request.m35806a();
                            if (c0486f0 == null || (obj = c0486f0.f1646b) == null) {
                                obj = "unknown";
                            }
                            iOException = new ConnectTimeoutException(AbstractC2875y.m8303p(sb4, " ms]", obj), (SocketTimeoutException) iOException);
                        }
                    }
                    c3033m.resumeWith(AbstractC34132o.m107888l(iOException));
                    break;
                }
                break;
        }
    }

    @Override // ud3.InterfaceC34823k
    public void onResponse(InterfaceC34821j interfaceC34821j, C34850x0 c34850x0) {
        switch (this.f115461w) {
            case 2:
                InterfaceC29189h interfaceC29189h = (InterfaceC29189h) this.f115462x;
                C29174b0 c29174b0 = (C29174b0) this.f115463y;
                try {
                    try {
                        interfaceC29189h.mo2323g(c29174b0, c29174b0.m88677d(c34850x0));
                    } catch (Throwable th3) {
                        AbstractC29184e1.m88696r(th3);
                        th3.printStackTrace();
                        return;
                    }
                    break;
                } catch (Throwable th4) {
                    AbstractC29184e1.m88696r(th4);
                    try {
                        interfaceC29189h.mo2329r(c29174b0, th4);
                        return;
                    } catch (Throwable th5) {
                        AbstractC29184e1.m88696r(th5);
                        th5.printStackTrace();
                        return;
                    }
                }
                break;
            default:
                if (!((C40571o) interfaceC34821j).f174718R) {
                    ((C3033m) this.f115463y).resumeWith(c34850x0);
                }
                break;
        }
    }

    public C28539n0(GoogleApiAvailability googleApiAvailability) {
        this.f115461w = 8;
        this.f115462x = new SparseIntArray();
        AbstractC35135w.m111094f(googleApiAvailability);
        this.f115463y = googleApiAvailability;
    }

    public C28539n0(C30439b c30439b) throws IOException {
        String property;
        this.f115461w = 3;
        this.f115462x = c30439b;
        File file = c30439b.f125065d;
        AbstractC1772c1.m5396n(file);
        C0237p c0237p = new C0237p(file, c30439b.f125066e, c30439b.f125067f);
        this.f115463y = c0237p;
        File file2 = (File) c0237p.f814z;
        if (file2.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    ((Properties) c0237p.f813y).load(fileInputStream);
                    fileInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(fileInputStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                file2.delete();
                InterfaceC14544a interfaceC14544a = (InterfaceC14544a) c0237p.f812x;
                if (interfaceC14544a != null) {
                    interfaceC14544a.error("Failed to load property file with path " + file2.getAbsolutePath() + ", error stacktrace: " + AbstractC29125c.m88514W(th5));
                }
                file2.getParentFile().mkdirs();
                file2.createNewFile();
            }
        } else {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        C0237p c0237p2 = (C0237p) this.f115463y;
        String str = ((C30439b) this.f115462x).f125063b;
        if (!((str == null || (property = ((Properties) c0237p2.f813y).getProperty("api_key", null)) == null) ? true : property.equals(str))) {
            List listM118959K = AbstractC37056f.m118959K("user_id", "device_id", "api_key", "experiment_api_key");
            c0237p2.getClass();
            Iterator it = listM118959K.iterator();
            while (it.hasNext()) {
                ((Properties) c0237p2.f813y).remove((String) it.next());
            }
            c0237p2.m681L();
        }
        if (str != null) {
            c0237p2.m678I("api_key", str);
        }
    }

    public C28539n0(String str) {
        this.f115461w = 7;
        this.f115462x = str;
        this.f115463y = null;
    }

    public C28539n0(C12776e requestData, C3033m c3033m) {
        this.f115461w = 11;
        AbstractC22676k.m65750j(requestData, "requestData");
        this.f115462x = requestData;
        this.f115463y = c3033m;
    }

    public C28539n0(int i13) {
        this.f115461w = i13;
        switch (i13) {
            case 1:
                this.f115462x = new C21567b(23);
                this.f115463y = new C0005a0(16);
                break;
            case 6:
                break;
            case 12:
                this.f115462x = new HashMap();
                break;
            default:
                C11351f2 c11351f2 = AbstractC11348f.f36367i;
                Float fValueOf = Float.valueOf(0.0f);
                this.f115463y = new C11376m(c11351f2, fValueOf, (AbstractC11395r) c11351f2.f36396a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
        }
    }

    public C28539n0(C29174b0 c29174b0, InterfaceC29189h interfaceC29189h) {
        this.f115461w = 2;
        this.f115463y = c29174b0;
        this.f115462x = interfaceC29189h;
    }

    public C28539n0(AbstractC37006m abstractC37006m) {
        this.f115461w = 9;
        Iterator it = ((C36995g0) abstractC37006m.f158356w.f158350a.entrySet()).iterator();
        this.f115462x = it;
        if (it.hasNext()) {
            this.f115463y = (Map.Entry) it.next();
        }
    }

    public C28539n0(C28301a c28301a) {
        this.f115461w = 5;
        this.f115462x = c28301a;
        this.f115463y = new AtomicBoolean(false);
    }
}
