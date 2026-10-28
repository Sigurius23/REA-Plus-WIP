package p037bu;

import ab3.C0714f;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.compose.p018ui.platform.AndroidComposeView;
import bc3.C3033m;
import bh3.InterfaceC3260g;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainter$State$Loading;
import coil.request.NullRequestDataException;
import com.iterable.iterableapi.C5315d1;
import com.iterable.iterableapi.C5339j1;
import com.iterable.iterableapi.InterfaceC5322f0;
import com.whoop.android.R;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import fk.InterfaceC14544a;
import hg3.C17261a;
import ia3.C18298d;
import ig3.InterfaceC18476b;
import io.sentry.C20041a0;
import io.sentry.C20402k4;
import io.sentry.C20412l5;
import io.sentry.C20513q6;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20308d1;
import io.sentry.InterfaceC20411l4;
import io.sentry.InterfaceC20508q1;
import io.sentry.android.core.C20135p;
import io.sentry.protocol.C20469b0;
import io.sentry.protocol.C20471c0;
import io.sentry.util.C20584f;
import ja3.C21521q;
import ja3.C21526v;
import java.io.File;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kb3.InterfaceC22344m;
import l83.C23470p;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import ma3.EnumC25378g;
import mh.C25535c;
import mh.C25537e;
import mh.C25542j;
import mh.C25545m;
import mh.EnumC25534b;
import no.nordicsemi.android.dfu.DfuBaseService;
import oa3.InterfaceC27771n;
import oa3.InterfaceC27772o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002a0.C0062y;
import p007a6.AbstractC0418e1;
import p007a6.C0407b;
import p007a6.C0427h1;
import p007a6.C0453s0;
import p007a6.C0457u0;
import p007a6.C0459v0;
import p014aj.C0929d;
import p040c0.AbstractC3725b;
import p040c0.AbstractC3751j1;
import p040c0.AbstractC3781t1;
import p040c0.C3748i1;
import p077d0.C11353g0;
import p077d0.InterfaceC11341d0;
import p077d0.InterfaceC11345e0;
import p077d0.InterfaceC11398s;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p120ek.C13268b;
import p133f1.C13968p1;
import p173gj.C15903d;
import p184h5.AbstractC16880i0;
import p184h5.AbstractC16901p0;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;
import p211i5.C18090c;
import p314m.LayoutInflaterFactory2C24829a0;
import p341nh.C26708b;
import p341nh.C26714h;
import p341nh.EnumC26713g;
import p369oh.InterfaceC27932a;
import p390p1.AbstractC28667t;
import p425qh.AbstractC30356b;
import p425qh.AbstractC30358d;
import p425qh.ComponentCallbacks2C30361g;
import p474s.AbstractC32027x2;
import p479s4.AbstractC32122c;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33688b;
import p505ts.AbstractC34132o;
import p512u2.C34472r;
import p512u2.C34473s;
import p512u2.C34474t;
import p518ub.InterfaceC34732e;
import p578wb.C37024a;
import p586wk.InterfaceC37328f;
import p636y3.InterfaceC39171c;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import pa3.C29040c;
import pa3.C29043f;
import pa3.EnumC29038a;
import pf.AbstractC29125c;
import pg3.C29218v0;
import pg3.InterfaceC29182e;
import pg3.InterfaceC29189h;
import q83.AbstractC30060g;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import so.C32800q;
import va3.C35845c;
import va3.C35847e;
import va3.C35850h;
import wb3.AbstractC37056f;
import x93.C38122n;
import xg3.C38280g;
import yb3.AbstractC39414r;
import z93.EnumC40212c;

/* JADX INFO: renamed from: bu.c */
/* JADX INFO: loaded from: classes.dex */
public class C3632c implements InterfaceC11345e0, InterfaceC27932a, InterfaceC3260g, InterfaceC5322f0, InterfaceC11398s, InterfaceC37328f, InterfaceC18476b, InterfaceC20508q1, InterfaceC20411l4, InterfaceC22344m, InterfaceC16915u, InterfaceC27771n, InterfaceC29189h, InterfaceC33688b {

    /* JADX INFO: renamed from: x */
    public static volatile C3632c f14786x;

    /* JADX INFO: renamed from: y */
    public static Boolean f14787y = Boolean.FALSE;

    /* JADX INFO: renamed from: w */
    public Object f14788w;

    public /* synthetic */ C3632c(Object obj) {
        this.f14788w = obj;
    }

    /* JADX INFO: renamed from: B */
    public static C25537e m11152B(C25542j c25542j, Throwable th3) {
        Drawable drawableM92826b;
        if (th3 instanceof NullRequestDataException) {
            c25542j.getClass();
            C25535c c25535c = c25542j.f100107F;
            Integer num = c25542j.f100105D;
            c25535c.getClass();
            drawableM92826b = AbstractC30356b.m92826b(c25542j, num);
            if (drawableM92826b == null) {
                Integer num2 = c25542j.f100104C;
                c25535c.getClass();
                drawableM92826b = AbstractC30356b.m92826b(c25542j, num2);
            }
        } else {
            Integer num3 = c25542j.f100104C;
            c25542j.f100107F.getClass();
            drawableM92826b = AbstractC30356b.m92826b(c25542j, num3);
        }
        return new C25537e(drawableM92826b, c25542j, th3);
    }

    /* JADX INFO: renamed from: A */
    public void m11153A() {
        ((AbstractC28667t) this.f14788w).getClass();
    }

    /* JADX INFO: renamed from: C */
    public AbstractC0418e1 m11154C() {
        return (AbstractC0418e1) ((C13045h2) this.f14788w).getValue();
    }

    /* JADX INFO: renamed from: D */
    public ArrayList m11155D(Map map, ArrayList arrayList, boolean z4, boolean z13) {
        ArrayList arrayListM2354n;
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry entry : map.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            boolean z14 = (thread == threadCurrentThread && !z4) || !(arrayList == null || !arrayList.contains(Long.valueOf(thread.getId())) || z4);
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) entry.getValue();
            Thread thread2 = (Thread) entry.getKey();
            C20471c0 c20471c0 = new C20471c0();
            c20471c0.f76629y = thread2.getName();
            c20471c0.f76628x = Integer.valueOf(thread2.getPriority());
            c20471c0.f76627w = Long.valueOf(thread2.getId());
            c20471c0.f76622G = Boolean.valueOf(thread2.isDaemon());
            c20471c0.f76630z = thread2.getState().name();
            c20471c0.f76620E = Boolean.valueOf(z14);
            if (z13 && (arrayListM2354n = ((C0929d) this.f14788w).m2354n(stackTraceElementArr, false)) != null && !arrayListM2354n.isEmpty()) {
                C20469b0 c20469b0 = new C20469b0(arrayListM2354n);
                c20469b0.f76616y = Boolean.TRUE;
                c20471c0.f76624I = c20469b0;
            }
            arrayList2.add(c20471c0);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: E */
    public InterfaceC14544a m11156E(C15903d amplitude) {
        AbstractC22676k.m65750j(amplitude, "amplitude");
        return (InterfaceC14544a) ((C23470p) this.f14788w).getValue();
    }

    /* JADX INFO: renamed from: F */
    public void m11157F(int i13, String str) {
        if (f14787y.booleanValue()) {
            Log.println(i13, (String) this.f14788w, str);
        }
    }

    /* JADX INFO: renamed from: G */
    public C25545m m11158G(C25542j c25542j, C26714h c26714h) {
        Bitmap.Config config;
        List list = c25542j.f100116i;
        Bitmap.Config config2 = c25542j.f100113f;
        if ((!list.isEmpty() && !AbstractC25260n.m74056a0(AbstractC30358d.f124548a, config2)) || (config2 == (config = Bitmap.Config.HARDWARE) && config2 == config && !c25542j.f100121n)) {
            config2 = Bitmap.Config.ARGB_8888;
        }
        AbstractC12350b abstractC12350b = c26714h.f106217a;
        C26708b c26708b = C26708b.f106206a;
        return new C25545m(c25542j.f100108a, config2, null, c26714h, (abstractC12350b.equals(c26708b) || c26714h.f106218b.equals(c26708b)) ? EnumC26713g.f106214x : c25542j.f100133z, AbstractC30356b.m92825a(c25542j), c25542j.f100122o && c25542j.f100116i.isEmpty() && config2 != Bitmap.Config.ALPHA_8, c25542j.f100123p, null, c25542j.f100118k, c25542j.f100119l, c25542j.f100102A, c25542j.f100124q, c25542j.f100125r, c25542j.f100126s);
    }

    /* JADX INFO: renamed from: H */
    public C13968p1 m11159H(C32800q c32800q, AndroidComposeView androidComposeView) {
        long jM108959c;
        boolean zM108957a;
        long jM3578K;
        C0062y c0062y = (C0062y) this.f14788w;
        C0062y c0062y2 = new C0062y(c32800q.m102861e().size());
        List listM102861e = c32800q.m102861e();
        int size = listM102861e.size();
        for (int i13 = 0; i13 < size; i13++) {
            C34474t c34474t = (C34474t) listM102861e.get(i13);
            C34473s c34473s = (C34473s) c0062y.m151c(c34474t.m108962c());
            if (c34473s == null) {
                zM108957a = false;
                jM108959c = c34474t.m108969j();
                jM3578K = c34474t.m108964e();
            } else {
                jM108959c = c34473s.m108959c();
                zM108957a = c34473s.m108957a();
                jM3578K = androidComposeView.m3578K(c34473s.m108958b());
            }
            c0062y2.m155g(c34474t.m108962c(), new C34472r(c34474t.m108962c(), c34474t.m108969j(), c34474t.m108964e(), c34474t.m108960a(), c34474t.m108966g(), jM108959c, jM3578K, zM108957a, c34474t.m108968i(), c34474t.m108961b(), c34474t.m108967h(), c34474t.m108963d()));
            if (c34474t.m108960a()) {
                c0062y.m155g(c34474t.m108962c(), new C34473s(c34474t.m108969j(), c34474t.m108960a(), c34474t.m108965f()));
            } else {
                c0062y.m156h(c34474t.m108962c());
            }
        }
        return new C13968p1(9, c0062y2, c32800q);
    }

    /* JADX INFO: renamed from: I */
    public InterfaceC31117e m11160I(C38122n c38122n) {
        C21521q c21521q;
        C35847e c35847eM122102c = c38122n.m122102c();
        if (c35847eM122102c != null) {
            EnumC25378g[] enumC25378gArr = EnumC25378g.f99454w;
        }
        Class<?> declaringClass = c38122n.f163232a.getDeclaringClass();
        C38122n c38122n2 = declaringClass != null ? new C38122n(declaringClass) : null;
        if (c38122n2 != null) {
            InterfaceC31117e interfaceC31117eM11160I = m11160I(c38122n2);
            InterfaceC22712o interfaceC22712oMo60487H = interfaceC31117eM11160I != null ? interfaceC31117eM11160I.mo60487H() : null;
            InterfaceC31126h contributedClassifier = interfaceC22712oMo60487H != null ? interfaceC22712oMo60487H.getContributedClassifier(c38122n.m122104e(), EnumC40212c.f173635H) : null;
            if (contributedClassifier instanceof InterfaceC31117e) {
                return (InterfaceC31117e) contributedClassifier;
            }
        } else if (c35847eM122102c != null && (c21521q = (C21521q) AbstractC25265s.m74100H0(AbstractC37056f.m118958J(((C18298d) this.f14788w).m52692c(c35847eM122102c.m113789b())))) != null) {
            C21526v c21526v = c21521q.f82553K.f82484d;
            c21526v.getClass();
            return c21526v.m60520o(c38122n.m122104e(), c38122n);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    /* JADX INFO: renamed from: J */
    public void m11161J(AbstractC0418e1 newState) {
        Object value;
        AbstractC0418e1 abstractC0418e1;
        AbstractC22676k.m65750j(newState, "newState");
        C13045h2 c13045h2 = (C13045h2) this.f14788w;
        do {
            value = c13045h2.getValue();
            abstractC0418e1 = (AbstractC0418e1) value;
            if ((abstractC0418e1 instanceof C0459v0) || AbstractC22676k.m65745e(abstractC0418e1, C0427h1.f1468b)) {
                abstractC0418e1 = newState;
            } else if (abstractC0418e1 instanceof C0407b) {
                if (newState.f1440a > ((C0407b) abstractC0418e1).f1440a) {
                    abstractC0418e1 = newState;
                }
            } else if (!(abstractC0418e1 instanceof C0453s0)) {
                if (!(abstractC0418e1 instanceof C0457u0)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
        } while (!c13045h2.m36569i(value, abstractC0418e1));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: K */
    public C25545m m11162K(C25545m c25545m) {
        boolean z4;
        EnumC25534b enumC25534b;
        boolean z13;
        Bitmap.Config config = c25545m.f100136b;
        EnumC25534b enumC25534b2 = c25545m.f100149o;
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        if (enumC25534b2.f100053w) {
            ComponentCallbacks2C30361g componentCallbacks2C30361g = (ComponentCallbacks2C30361g) this.f14788w;
            synchronized (componentCallbacks2C30361g) {
                componentCallbacks2C30361g.m92831a();
                z13 = componentCallbacks2C30361g.f124558E;
            }
            if (!z13) {
                enumC25534b2 = EnumC25534b.DISABLED;
                z4 = true;
            }
            enumC25534b = enumC25534b2;
            if (z4) {
                return new C25545m(c25545m.f100135a, config, c25545m.f100137c, c25545m.f100138d, c25545m.f100139e, c25545m.f100140f, c25545m.f100141g, c25545m.f100142h, c25545m.f100143i, c25545m.f100144j, c25545m.f100145k, c25545m.f100146l, c25545m.f100147m, c25545m.f100148n, enumC25534b);
            }
            return c25545m;
        }
        z4 = false;
        enumC25534b = enumC25534b2;
        if (z4) {
            return new C25545m(c25545m.f100135a, config, c25545m.f100137c, c25545m.f100138d, c25545m.f100139e, c25545m.f100140f, c25545m.f100141g, c25545m.f100142h, c25545m.f100143i, c25545m.f100144j, c25545m.f100145k, c25545m.f100146l, c25545m.f100147m, c25545m.f100148n, enumC25534b);
        }
        return c25545m;
    }

    /* JADX INFO: renamed from: L */
    public void m11163L(int i13, Exception exc) {
        if (f14787y.booleanValue()) {
            Log.println(i13, (String) this.f14788w, Log.getStackTraceString(exc));
        }
    }

    /* JADX INFO: renamed from: M */
    public void m11164M(Exception exc) {
        m11163L(3, exc);
    }

    @Override // p586wk.InterfaceC37328f
    /* JADX INFO: renamed from: a */
    public void mo2343a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f14788w)) {
            ((ByteBuffer) this.f14788w).position(0);
            messageDigest.update(((ByteBuffer) this.f14788w).putInt(num.intValue()).array());
        }
    }

    @Override // bh3.InterfaceC3260g
    /* JADX INFO: renamed from: b */
    public Object mo1678b(Object obj) {
        return C38280g.m122648u(((InterfaceC3260g) this.f14788w).mo1678b((Throwable) obj));
    }

    @Override // ig3.InterfaceC18476b
    /* JADX INFO: renamed from: c */
    public void mo11165c(String str, String str2) {
        C17261a c17261a = (C17261a) this.f14788w;
        Map map = (Map) c17261a.get();
        if (map == null) {
            map = new HashMap();
            c17261a.set(map);
        }
        map.put(str, str2);
    }

    @Override // ig3.InterfaceC18476b
    public void clear() {
        C17261a c17261a = (C17261a) this.f14788w;
        Map map = (Map) c17261a.get();
        if (map != null) {
            map.clear();
            c17261a.remove();
        }
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: d */
    public float mo11166d(float f13, long j7) {
        return ((C3748i1) this.f14788w).m11566a(f13).m11565b(j7 / 1000000);
    }

    @Override // p369oh.InterfaceC27932a
    /* JADX INFO: renamed from: e */
    public void mo11167e(Drawable drawable) {
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.f14788w;
        asyncImagePainter.m15506k(new AsyncImagePainter$State$Loading(drawable != null ? asyncImagePainter.m15505j(drawable) : null));
    }

    @Override // ig3.InterfaceC18476b
    /* JADX INFO: renamed from: f */
    public Map mo11168f() {
        Map map = (Map) ((C17261a) this.f14788w).get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    @Override // pg3.InterfaceC29189h
    /* JADX INFO: renamed from: g */
    public void mo2323g(InterfaceC29182e interfaceC29182e, C29218v0 c29218v0) {
        ((C3033m) this.f14788w).resumeWith(c29218v0);
    }

    @Override // p077d0.InterfaceC11398s
    public InterfaceC11341d0 get(int i13) {
        return (C11353g0) this.f14788w;
    }

    @Override // p500tb.InterfaceC33688b
    /* JADX INFO: renamed from: h */
    public InterfaceC33687a mo11169h(String fileName) {
        AbstractC22676k.m65750j(fileName, "fileName");
        InterfaceC34732e interfaceC34732e = (InterfaceC34732e) this.f14788w;
        String databaseName = interfaceC34732e.getDatabaseName();
        if (databaseName == null) {
            if (!fileName.equals(":memory:")) {
                throw new IllegalArgumentException(AbstractC11895b.m31996o("This driver is configured to open an in-memory database but a file-based named '", fileName, "' was requested.").toString());
            }
        } else if (!databaseName.equals(fileName) && !AbstractC39414r.m125860F0('/', databaseName, databaseName).equals(AbstractC39414r.m125860F0('/', fileName, fileName))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + interfaceC34732e.getDatabaseName() + "' but '" + fileName + "' was requested.").toString());
        }
        return new C37024a(interfaceC34732e.mo109675E0());
    }

    @Override // com.iterable.iterableapi.InterfaceC5322f0
    /* JADX INFO: renamed from: i */
    public void mo11170i(String str) {
        C5315d1 c5315d1 = (C5315d1) this.f14788w;
        if (str == null || str.isEmpty()) {
            c5315d1.m16425h();
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("inAppMessages");
            if (jSONArrayOptJSONArray != null) {
                for (int i13 = 0; i13 < jSONArrayOptJSONArray.length(); i13++) {
                    C5339j1 c5339j1M16456d = C5339j1.m16456d(jSONArrayOptJSONArray.optJSONObject(i13), null);
                    if (c5339j1M16456d != null) {
                        arrayList.add(c5339j1M16456d);
                    }
                }
                C5315d1.m16420c(c5315d1, arrayList);
                c5315d1.f21662I = System.currentTimeMillis();
            }
        } catch (JSONException e5) {
            AbstractC12350b.m34595p("IterableInAppManager", e5.toString());
        }
    }

    @Override // io.sentry.InterfaceC20508q1
    /* JADX INFO: renamed from: j */
    public boolean mo11171j() {
        return C20412l5.m56626d().m56629c(((C20513q6) this.f14788w).getFatalLogger());
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: k */
    public float mo11172k() {
        return 0.0f;
    }

    @Override // oa3.InterfaceC27771n, oa3.InterfaceC27772o
    /* JADX INFO: renamed from: l */
    public void mo195l() {
    }

    @Override // kb3.InterfaceC22344m
    public void lock() {
        ((ReentrantLock) this.f14788w).lock();
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: m */
    public InterfaceC27772o mo196m(C35850h c35850h) {
        String strM113817b = c35850h.m113817b();
        if ("d1".equals(strM113817b)) {
            return new C29040c(this, 0);
        }
        if ("d2".equals(strM113817b)) {
            return new C29040c(this, 1);
        }
        return null;
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: n */
    public void mo197n(C35850h c35850h, C0714f c0714f) {
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        boolean z4;
        boolean z13;
        int iM47600d = c16905q1.m47600d();
        LayoutInflaterFactory2C24829a0 layoutInflaterFactory2C24829a0 = (LayoutInflaterFactory2C24829a0) this.f14788w;
        Context context = layoutInflaterFactory2C24829a0.f97209K;
        int iM47600d2 = c16905q1.m47600d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C24829a0.f97220V;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C24829a0.f97220V.getLayoutParams();
            boolean z14 = true;
            if (layoutInflaterFactory2C24829a0.f97220V.isShown()) {
                if (layoutInflaterFactory2C24829a0.f97203C0 == null) {
                    layoutInflaterFactory2C24829a0.f97203C0 = new Rect();
                    layoutInflaterFactory2C24829a0.f97204D0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C24829a0.f97203C0;
                Rect rect2 = layoutInflaterFactory2C24829a0.f97204D0;
                rect.set(c16905q1.m47598b(), c16905q1.m47600d(), c16905q1.m47599c(), c16905q1.m47597a());
                ViewGroup viewGroup = layoutInflaterFactory2C24829a0.f97225a0;
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC32027x2.m99582a(viewGroup, rect, rect2);
                } else {
                    if (!AbstractC12889b.f44374b) {
                        AbstractC12889b.f44374b = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            AbstractC12889b.f44375c = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                AbstractC12889b.f44375c.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = AbstractC12889b.f44375c;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e5) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e5);
                        }
                    }
                }
                int i13 = rect.top;
                int i14 = rect.left;
                int i15 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C24829a0.f97225a0;
                WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
                C16905q1 c16905q1M47522a = AbstractC16880i0.m47522a(viewGroup2);
                int iM47598b = c16905q1M47522a == null ? 0 : c16905q1M47522a.m47598b();
                int iM47599c = c16905q1M47522a == null ? 0 : c16905q1M47522a.m47599c();
                if (marginLayoutParams.topMargin == i13 && marginLayoutParams.leftMargin == i14 && marginLayoutParams.rightMargin == i15) {
                    z13 = false;
                } else {
                    marginLayoutParams.topMargin = i13;
                    marginLayoutParams.leftMargin = i14;
                    marginLayoutParams.rightMargin = i15;
                    z13 = true;
                }
                if (i13 <= 0 || layoutInflaterFactory2C24829a0.f97227c0 != null) {
                    View view2 = layoutInflaterFactory2C24829a0.f97227c0;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i16 = marginLayoutParams2.height;
                        int i17 = marginLayoutParams.topMargin;
                        if (i16 != i17 || marginLayoutParams2.leftMargin != iM47598b || marginLayoutParams2.rightMargin != iM47599c) {
                            marginLayoutParams2.height = i17;
                            marginLayoutParams2.leftMargin = iM47598b;
                            marginLayoutParams2.rightMargin = iM47599c;
                            layoutInflaterFactory2C24829a0.f97227c0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C24829a0.f97227c0 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM47598b;
                    layoutParams.rightMargin = iM47599c;
                    layoutInflaterFactory2C24829a0.f97225a0.addView(layoutInflaterFactory2C24829a0.f97227c0, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C24829a0.f97227c0;
                z14 = view4 != null;
                if (z14 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C24829a0.f97227c0;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? AbstractC32122c.getColor(context, R.color.abc_decor_view_status_guard_light) : AbstractC32122c.getColor(context, R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C24829a0.f97232h0 && z14) {
                    iM47600d2 = 0;
                }
                z4 = z14;
                z14 = z13;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z4 = false;
            } else {
                z4 = false;
                z14 = false;
            }
            if (z14) {
                layoutInflaterFactory2C24829a0.f97220V.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C24829a0.f97227c0;
        if (view6 != null) {
            view6.setVisibility(z4 ? 0 : 8);
        }
        return AbstractC16901p0.m47578i(view, iM47600d != iM47600d2 ? c16905q1.m47601f(c16905q1.m47598b(), iM47600d2, c16905q1.m47599c(), c16905q1.m47597a()) : c16905q1);
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: p */
    public void mo198p(C35850h c35850h, Object obj) {
        C29043f c29043f = (C29043f) this.f14788w;
        String strM113817b = c35850h.m113817b();
        if ("k".equals(strM113817b)) {
            if (obj instanceof Integer) {
                EnumC29038a.f117518x.getClass();
                EnumC29038a enumC29038a = (EnumC29038a) EnumC29038a.f117519y.get((Integer) obj);
                if (enumC29038a == null) {
                    enumC29038a = EnumC29038a.UNKNOWN;
                }
                c29043f.f117540G = enumC29038a;
                return;
            }
            return;
        }
        if ("mv".equals(strM113817b)) {
            if (obj instanceof int[]) {
                c29043f.f117542w = (int[]) obj;
            }
        } else {
            if ("xs".equals(strM113817b)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    c29043f.f117543x = str;
                    return;
                }
                return;
            }
            if (!"xi".equals(strM113817b)) {
                "pn".equals(strM113817b);
            } else if (obj instanceof Integer) {
                c29043f.f117544y = ((Integer) obj).intValue();
            }
        }
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: q */
    public void mo199q(C35850h c35850h, C35845c c35845c, C35850h c35850h2) {
    }

    @Override // pg3.InterfaceC29189h
    /* JADX INFO: renamed from: r */
    public void mo2329r(InterfaceC29182e interfaceC29182e, Throwable th3) {
        ((C3033m) this.f14788w).resumeWith(AbstractC34132o.m107888l(th3));
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: s */
    public InterfaceC27771n mo201s(C35845c c35845c, C35850h c35850h) {
        return null;
    }

    @Override // io.sentry.InterfaceC20411l4
    /* JADX INFO: renamed from: t */
    public C20402k4 mo1875t(InterfaceC20308d1 interfaceC20308d1, C20513q6 c20513q6) {
        AbstractC29125c.m88510S(interfaceC20308d1, "Scopes are required");
        AbstractC29125c.m88510S(c20513q6, "SentryOptions is required");
        String cacheDirPath = ((C20135p) this.f14788w).f75635x.getCacheDirPath();
        if (cacheDirPath == null || !InterfaceC20411l4.m56625y(c20513q6.getLogger(), cacheDirPath)) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "No cache dir path is defined in options.", new Object[0]);
            return null;
        }
        return new C20402k4(c20513q6.getLogger(), cacheDirPath, new C20041a0(interfaceC20308d1, c20513q6.getSerializer(), c20513q6.getLogger(), c20513q6.getFlushTimeoutMillis(), c20513q6.getMaxQueueSize()), new File(cacheDirPath));
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: u */
    public float mo11173u(float f13, long j7, float f14) {
        return ((C3748i1) this.f14788w).m11566a(f14).m11564a(j7 / 1000000) + f13;
    }

    @Override // kb3.InterfaceC22344m
    public void unlock() {
        ((ReentrantLock) this.f14788w).unlock();
    }

    @Override // ig3.InterfaceC18476b
    /* JADX INFO: renamed from: v */
    public void mo11174v(Map map) {
        ((C17261a) this.f14788w).set(new HashMap(map));
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: w */
    public long mo11175w(float f13) {
        C3748i1 c3748i1 = (C3748i1) this.f14788w;
        c3748i1.getClass();
        float[] fArr = AbstractC3725b.f15209a;
        return ((long) (Math.exp(AbstractC3725b.m11559a(f13, c3748i1.f15324a * c3748i1.f15325b) / (((double) AbstractC3751j1.f15333a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // p077d0.InterfaceC11345e0
    /* JADX INFO: renamed from: x */
    public float mo11176x(float f13, float f14) {
        C3748i1 c3748i1 = (C3748i1) this.f14788w;
        c3748i1.getClass();
        float[] fArr = AbstractC3725b.f15209a;
        float f15 = c3748i1.f15324a;
        float f16 = c3748i1.f15325b;
        double dM11559a = AbstractC3725b.m11559a(f14, f15 * f16);
        double d3 = AbstractC3751j1.f15333a;
        return (Math.signum(f14) * ((float) (Math.exp((d3 / (d3 - 1.0d)) * dM11559a) * ((double) (f15 * f16))))) + f13;
    }

    @Override // p500tb.InterfaceC33688b
    /* JADX INFO: renamed from: z */
    public boolean mo11177z() {
        return true;
    }

    public C3632c(InterfaceC39171c interfaceC39171c) {
        this.f14788w = new C3748i1(AbstractC3781t1.f15422a, interfaceC39171c);
    }

    public C3632c(int i13) {
        switch (i13) {
            case 1:
                this.f14788w = AbstractC13091v.m36593c(C0427h1.f1468b);
                break;
            case 9:
                this.f14788w = AbstractC30060g.m92088H(C13268b.f45949w);
                break;
            case 10:
                this.f14788w = ByteBuffer.allocate(4);
                break;
            case 11:
                new ThreadLocal();
                this.f14788w = new C17261a();
                break;
            case 16:
                this.f14788w = new C20584f(new C18090c(28));
                break;
            case 27:
                this.f14788w = new C0062y((Object) null);
                break;
            case 28:
                this.f14788w = null;
                break;
            default:
                this.f14788w = new HashSet();
                break;
        }
    }

    public C3632c(InterfaceC34732e openHelper) {
        AbstractC22676k.m65750j(openHelper, "openHelper");
        this.f14788w = openHelper;
    }
}
