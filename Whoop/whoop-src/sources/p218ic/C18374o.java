package p218ic;

import android.app.Activity;
import androidx.lifecycle.RunnableC1645z0;
import bc3.AbstractC3006f0;
import bc3.C3023j1;
import bc3.EnumC2998d0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import io.sentry.C20314d7;
import io.sentry.C20535s;
import io.sentry.C20645z6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20332f7;
import io.sentry.InterfaceC20406l;
import io.sentry.InterfaceC20602v0;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.C20062c;
import io.sentry.android.core.C20067d;
import io.sentry.android.core.C20073f;
import io.sentry.android.core.RunnableC20059b;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.okhttp.C20452d;
import io.sentry.protocol.C20489m;
import io.sentry.protocol.C20501v;
import io.sentry.util.C20579a;
import io.sentry.util.network.InterfaceC20595c;
import java.io.EOFException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import ne3.C26616h;
import p007a6.C0458v;
import p031b9.AbstractC2875y;
import p080d4.C11650i;
import p080d4.C11655n;
import p080d4.InterfaceC11651j;
import p477s2.AbstractC32073e;
import p619xl.C38445a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import s83.AbstractC32275i;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34844u0;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: ic.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18374o implements InterfaceC11651j, InterfaceC20332f7, InterfaceC20595c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f71532w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f71533x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f71534y;

    public /* synthetic */ C18374o(Object obj, Object obj2, Object obj3) {
        this.f71532w = obj;
        this.f71533x = obj2;
        this.f71534y = obj3;
    }

    @Override // io.sentry.util.network.InterfaceC20595c
    /* JADX INFO: renamed from: a */
    public C38445a mo19987a(Object obj) throws EOFException {
        String str;
        Charset charsetM109889a;
        C34830n0 c34830n0 = (C34830n0) this.f71532w;
        C22669g0 c22669g0 = (C22669g0) this.f71533x;
        C20452d c20452d = (C20452d) this.f71534y;
        C34832o0 req = (C34832o0) obj;
        AbstractC22676k.m65750j(req, "req");
        AbstractC34846v0 abstractC34846v0 = req.f146715d;
        if (abstractC34846v0 != null) {
            C26616h c26616h = new C26616h();
            abstractC34846v0.writeTo(c26616h);
            byte[] bArrM79201b0 = c26616h.m79201b0(c26616h.f105866x);
            c34830n0.m109904e(((C34832o0) c22669g0.f89336w).f146713b, C34844u0.m109927d(AbstractC34846v0.Companion, bArrM79201b0, abstractC34846v0.getContentType(), 0, 6));
            C34818h0 contentType = abstractC34846v0.getContentType();
            InterfaceC20602v0 logger = c20452d.f76550w.mo56432l().getLogger();
            AbstractC22676k.m65749i(logger, "getLogger(...)");
            if (contentType != null) {
                try {
                    str = contentType.f146591a;
                } catch (Exception e5) {
                    logger.mo16066m(EnumC20436n5.ERROR, AbstractC2875y.m8298k(e5, new StringBuilder("Failed to parse buffered request body: ")), new Object[0]);
                }
            } else {
                str = null;
            }
            String strName = (contentType == null || (charsetM109889a = contentType.m109889a(AbstractC39397a.f169546a)) == null) ? null : charsetM109889a.name();
            if (strName == null) {
                strName = "UTF-8";
            }
            return AbstractC32073e.m99761t(bArrM79201b0, str, strName, logger);
        }
        return null;
    }

    @Override // io.sentry.InterfaceC20332f7
    /* JADX INFO: renamed from: c */
    public void mo19988c(C20314d7 c20314d7) {
        C20062c c20062cM55937b;
        C20645z6 c20645z6 = (C20645z6) this.f71532w;
        InterfaceC20332f7 interfaceC20332f7 = (InterfaceC20332f7) this.f71533x;
        AtomicReference atomicReference = (AtomicReference) this.f71534y;
        if (interfaceC20332f7 != null) {
            interfaceC20332f7.mo19988c(c20314d7);
        }
        C20073f c20073f = c20645z6.f77218r.f76522i;
        if (c20073f != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) c20073f.f75396w;
            WeakReference weakReference = (WeakReference) c20073f.f75397x;
            String str = (String) c20073f.f75398y;
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                C20067d c20067d = activityLifecycleIntegration.f75220Q;
                C20501v c20501v = c20645z6.f77201a;
                C20535s c20535sM56711a = ((C20579a) c20067d.f75382g).m56711a();
                try {
                    if (c20067d.m55938c()) {
                        C20062c c20062c = null;
                        c20067d.m55939d(new RunnableC20059b(c20067d, activity, 1), null);
                        C20062c c20062c2 = (C20062c) ((WeakHashMap) c20067d.f75380e).remove(activity);
                        if (c20062c2 != null && (c20062cM55937b = c20067d.m55937b()) != null) {
                            c20062c = new C20062c(c20062cM55937b.f75362a - c20062c2.f75362a, c20062cM55937b.f75363b - c20062c2.f75363b, c20062cM55937b.f75364c - c20062c2.f75364c);
                        }
                        if (c20062c != null && (c20062c.f75362a != 0 || c20062c.f75363b != 0 || c20062c.f75364c != 0)) {
                            C20489m c20489m = new C20489m("none", Integer.valueOf(c20062c.f75362a));
                            C20489m c20489m2 = new C20489m("none", Integer.valueOf(c20062c.f75363b));
                            C20489m c20489m3 = new C20489m("none", Integer.valueOf(c20062c.f75364c));
                            HashMap map = new HashMap();
                            map.put("frames_total", c20489m);
                            map.put("frames_slow", c20489m2);
                            map.put("frames_frozen", c20489m3);
                            ((ConcurrentHashMap) c20067d.f75379d).put(c20501v, map);
                        }
                    }
                    c20535sM56711a.close();
                } catch (Throwable th3) {
                    try {
                        c20535sM56711a.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f75226z;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().mo16066m(EnumC20436n5.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        InterfaceC20406l interfaceC20406l = c20645z6.f77217q;
        if (interfaceC20406l != null) {
            atomicReference.set(interfaceC20406l.mo56619e(c20645z6));
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [c93.m, s83.i] */
    @Override // p080d4.InterfaceC11651j
    /* JADX INFO: renamed from: d */
    public Object mo8621d(C11650i c11650i) {
        InterfaceC30063j interfaceC30063j = (InterfaceC30063j) this.f71532w;
        EnumC2998d0 enumC2998d0 = (EnumC2998d0) this.f71533x;
        ?? r10 = (AbstractC32275i) this.f71534y;
        RunnableC1645z0 runnableC1645z0 = new RunnableC1645z0((InterfaceC3027k1) interfaceC30063j.get(C3023j1.f12041w), 6);
        EnumC18364j enumC18364j = EnumC18364j.f71497w;
        C11655n c11655n = c11650i.f37630c;
        if (c11655n != null) {
            c11655n.mo31061a(runnableC1645z0, enumC18364j);
        }
        return AbstractC3006f0.m8732z(AbstractC3006f0.m8708b(interfaceC30063j), null, enumC2998d0, new C0458v((InterfaceC4351m) r10, c11650i, (InterfaceC30057d) null), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C18374o(InterfaceC30063j interfaceC30063j, EnumC2998d0 enumC2998d0, InterfaceC4351m interfaceC4351m) {
        this.f71532w = interfaceC30063j;
        this.f71533x = enumC2998d0;
        this.f71534y = (AbstractC32275i) interfaceC4351m;
    }
}
