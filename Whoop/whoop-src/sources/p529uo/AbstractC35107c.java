package p529uo;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import bd3.C3142u;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.C4986c;
import com.google.android.gms.common.C4987d;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p035bp.C3510a;
import p229ip.AbstractC20790a;
import p229ip.C20794e;
import p486sp.C32860k;

/* JADX INFO: renamed from: uo.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC35107c {

    /* JADX INFO: renamed from: x */
    public static final C4986c[] f148961x = new C4986c[0];

    /* JADX INFO: renamed from: b */
    public C3142u f148963b;

    /* JADX INFO: renamed from: c */
    public final Context f148964c;

    /* JADX INFO: renamed from: d */
    public final C35118h0 f148965d;

    /* JADX INFO: renamed from: e */
    public final HandlerC35137y f148966e;

    /* JADX INFO: renamed from: h */
    public C35134v f148969h;

    /* JADX INFO: renamed from: i */
    public InterfaceC35105b f148970i;

    /* JADX INFO: renamed from: j */
    public IInterface f148971j;

    /* JADX INFO: renamed from: l */
    public ServiceConnectionC35104a0 f148973l;

    /* JADX INFO: renamed from: n */
    public final C35123k f148975n;

    /* JADX INFO: renamed from: o */
    public final C35123k f148976o;

    /* JADX INFO: renamed from: p */
    public final int f148977p;

    /* JADX INFO: renamed from: q */
    public final String f148978q;

    /* JADX INFO: renamed from: r */
    public volatile String f148979r;

    /* JADX INFO: renamed from: s */
    public volatile C3510a f148980s;

    /* JADX INFO: renamed from: a */
    public volatile String f148962a = null;

    /* JADX INFO: renamed from: f */
    public final Object f148967f = new Object();

    /* JADX INFO: renamed from: g */
    public final Object f148968g = new Object();

    /* JADX INFO: renamed from: k */
    public final ArrayList f148972k = new ArrayList();

    /* JADX INFO: renamed from: m */
    public int f148974m = 1;

    /* JADX INFO: renamed from: t */
    public C4969a f148981t = null;

    /* JADX INFO: renamed from: u */
    public boolean f148982u = false;

    /* JADX INFO: renamed from: v */
    public volatile C35110d0 f148983v = null;

    /* JADX INFO: renamed from: w */
    public final AtomicInteger f148984w = new AtomicInteger(0);

    public AbstractC35107c(Context context, Looper looper, C35118h0 c35118h0, GoogleApiAvailability googleApiAvailability, int i13, C35123k c35123k, C35123k c35123k2, String str) {
        AbstractC35135w.m111095g(context, "Context must not be null");
        this.f148964c = context;
        AbstractC35135w.m111095g(looper, "Looper must not be null");
        AbstractC35135w.m111095g(c35118h0, "Supervisor must not be null");
        this.f148965d = c35118h0;
        AbstractC35135w.m111095g(googleApiAvailability, "API availability must not be null");
        this.f148966e = new HandlerC35137y(this, looper);
        this.f148977p = i13;
        this.f148975n = c35123k;
        this.f148976o = c35123k2;
        this.f148978q = str;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo5665a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public abstract int mo5666b();

    /* JADX INFO: renamed from: c */
    public final void m111058c() {
        if (!m111062n()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract IInterface mo5667d(IBinder iBinder);

    /* JADX INFO: renamed from: e */
    public void mo80986e() {
        this.f148984w.incrementAndGet();
        ArrayList arrayList = this.f148972k;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    AbstractC35133u abstractC35133u = (AbstractC35133u) arrayList.get(i13);
                    synchronized (abstractC35133u) {
                        abstractC35133u.f149075a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this.f148968g) {
            this.f148969h = null;
        }
        m111067t(1, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m111059f(String str) {
        this.f148962a = str;
        mo80986e();
    }

    /* JADX INFO: renamed from: g */
    public C4986c[] mo57329g() {
        return f148961x;
    }

    /* JADX INFO: renamed from: h */
    public Bundle mo5668h() {
        return new Bundle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m111060i(InterfaceC35119i interfaceC35119i, Set set) {
        AttributionSource attributionSource;
        Bundle bundleMo5668h = mo5668h();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.f148980s == null || (attributionSource = this.f148980s.f13982a) == null || attributionSource.getAttributionTag() == null) ? this.f148979r : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i13 = this.f148977p;
        int i14 = C4987d.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = C35115g.f149011O;
        Bundle bundle = new Bundle();
        C4986c[] c4986cArr = C35115g.f149012P;
        C35115g c35115g = new C35115g(6, i13, i14, null, null, scopeArr, bundle, null, c4986cArr, c4986cArr, true, 0, false, str);
        c35115g.f149026z = this.f148964c.getPackageName();
        c35115g.f149015G = bundleMo5668h;
        if (set != null) {
            c35115g.f149014F = (Scope[]) set.toArray(new Scope[0]);
        }
        if (mo5665a()) {
            c35115g.f149016H = new Account("<<default account>>", "com.google");
            if (interfaceC35119i != 0) {
                c35115g.f149013E = ((AbstractC20790a) interfaceC35119i).asBinder();
            }
        } else if (this instanceof C32860k) {
            c35115g.f149016H = null;
        }
        c35115g.f149017I = f148961x;
        c35115g.f149018J = mo57329g();
        if (mo57337p()) {
            c35115g.f149021M = true;
        }
        try {
            synchronized (this.f148968g) {
                try {
                    C35134v c35134v = this.f148969h;
                    if (c35134v != null) {
                        c35134v.m111088s(new BinderC35138z(this, this.f148984w.get()), c35115g);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } catch (DeadObjectException e5) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e5);
            int i15 = this.f148984w.get();
            HandlerC35137y handlerC35137y = this.f148966e;
            handlerC35137y.sendMessage(handlerC35137y.obtainMessage(6, i15, 3));
        } catch (RemoteException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i16 = this.f148984w.get();
            C35106b0 c35106b0 = new C35106b0(this, 8, null, null);
            HandlerC35137y handlerC35137y2 = this.f148966e;
            handlerC35137y2.sendMessage(handlerC35137y2.obtainMessage(1, i16, -1, c35106b0));
        } catch (SecurityException e14) {
            throw e14;
        } catch (RuntimeException e15) {
            e = e15;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i17 = this.f148984w.get();
            C35106b0 c35106b1 = new C35106b0(this, 8, null, null);
            HandlerC35137y handlerC35137y3 = this.f148966e;
            handlerC35137y3.sendMessage(handlerC35137y3.obtainMessage(1, i17, -1, c35106b1));
        }
    }

    /* JADX INFO: renamed from: j */
    public final IInterface m111061j() {
        IInterface iInterface;
        synchronized (this.f148967f) {
            try {
                if (this.f148974m == 5) {
                    throw new DeadObjectException();
                }
                m111058c();
                iInterface = this.f148971j;
                AbstractC35135w.m111095g(iInterface, "Client is connected but service is null");
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return iInterface;
    }

    /* JADX INFO: renamed from: k */
    public abstract String mo5669k();

    /* JADX INFO: renamed from: l */
    public abstract String mo5670l();

    /* JADX INFO: renamed from: m */
    public boolean mo57330m() {
        return mo5666b() >= 211700000;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m111062n() {
        boolean z4;
        synchronized (this.f148967f) {
            z4 = this.f148974m == 4;
        }
        return z4;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m111063o() {
        boolean z4;
        synchronized (this.f148967f) {
            int i13 = this.f148974m;
            z4 = true;
            if (i13 != 2 && i13 != 3) {
                z4 = false;
            }
        }
        return z4;
    }

    /* JADX INFO: renamed from: p */
    public boolean mo57337p() {
        return this instanceof C20794e;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ boolean m111064q(int i13, int i14, IInterface iInterface) {
        synchronized (this.f148967f) {
            try {
                if (this.f148974m != i13) {
                    return false;
                }
                m111067t(i14, iInterface);
                return true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m111065r() {
        int i13;
        int i14;
        synchronized (this.f148967f) {
            i13 = this.f148974m;
        }
        if (i13 == 3) {
            this.f148982u = true;
            i14 = 5;
        } else {
            i14 = 4;
        }
        HandlerC35137y handlerC35137y = this.f148966e;
        handlerC35137y.sendMessage(handlerC35137y.obtainMessage(i14, this.f148984w.get(), 16));
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ boolean m111066s() {
        if (this.f148982u || TextUtils.isEmpty(mo5669k()) || TextUtils.isEmpty(null)) {
            return false;
        }
        try {
            Class.forName(mo5669k());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m111067t(int i13, IInterface iInterface) {
        C3142u c3142u;
        AbstractC35135w.m111089a((i13 == 4) == (iInterface != null));
        synchronized (this.f148967f) {
            try {
                this.f148974m = i13;
                this.f148971j = iInterface;
                Bundle bundle = null;
                if (i13 == 1) {
                    ServiceConnectionC35104a0 serviceConnectionC35104a0 = this.f148973l;
                    if (serviceConnectionC35104a0 != null) {
                        C35118h0 c35118h0 = this.f148965d;
                        String str = this.f148963b.f12308x;
                        AbstractC35135w.m111094f(str);
                        this.f148963b.getClass();
                        if (this.f148978q == null) {
                            this.f148964c.getClass();
                        }
                        c35118h0.m111071b(str, serviceConnectionC35104a0, this.f148963b.f12307w);
                        this.f148973l = null;
                    }
                } else if (i13 == 2 || i13 == 3) {
                    ServiceConnectionC35104a0 serviceConnectionC35104a1 = this.f148973l;
                    if (serviceConnectionC35104a1 != null && (c3142u = this.f148963b) != null) {
                        String str2 = c3142u.f12308x;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb4.append("Calling connect() while still connected, missing disconnect() for ");
                        sb4.append(str2);
                        sb4.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb4.toString());
                        C35118h0 c35118h1 = this.f148965d;
                        String str3 = this.f148963b.f12308x;
                        AbstractC35135w.m111094f(str3);
                        this.f148963b.getClass();
                        if (this.f148978q == null) {
                            this.f148964c.getClass();
                        }
                        c35118h1.m111071b(str3, serviceConnectionC35104a1, this.f148963b.f12307w);
                        this.f148984w.incrementAndGet();
                    }
                    ServiceConnectionC35104a0 serviceConnectionC35104a2 = new ServiceConnectionC35104a0(this, this.f148984w.get());
                    this.f148973l = serviceConnectionC35104a2;
                    String strMo5670l = mo5670l();
                    boolean zMo57330m = mo57330m();
                    this.f148963b = new C3142u(strMo5670l, zMo57330m);
                    if (zMo57330m && mo5666b() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f148963b.f12308x)));
                    }
                    C35118h0 c35118h2 = this.f148965d;
                    String str4 = this.f148963b.f12308x;
                    AbstractC35135w.m111094f(str4);
                    this.f148963b.getClass();
                    String name = this.f148978q;
                    if (name == null) {
                        name = this.f148964c.getClass().getName();
                    }
                    C4969a c4969aM111070a = c35118h2.m111070a(new C35112e0(str4, this.f148963b.f12307w), serviceConnectionC35104a2, name);
                    if (!c4969aM111070a.m15588b()) {
                        String str5 = this.f148963b.f12308x;
                        StringBuilder sb5 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb5.append("unable to connect to service: ");
                        sb5.append(str5);
                        sb5.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb5.toString());
                        int i14 = c4969aM111070a.f20480x;
                        if (i14 == -1) {
                            i14 = 16;
                        }
                        if (c4969aM111070a.f20481y != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c4969aM111070a.f20481y);
                        }
                        int i15 = this.f148984w.get();
                        C35108c0 c35108c0 = new C35108c0(this, i14, bundle);
                        HandlerC35137y handlerC35137y = this.f148966e;
                        handlerC35137y.sendMessage(handlerC35137y.obtainMessage(7, i15, -1, c35108c0));
                    }
                } else if (i13 == 4) {
                    AbstractC35135w.m111094f(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
