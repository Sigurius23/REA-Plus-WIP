package pf;

import aa3.EnumC0636l1;
import aa3.EnumC0639m1;
import aa3.EnumC0642n1;
import ac.AbstractC0735a;
import al.AbstractC0954a;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import android.text.Layout;
import android.util.Log;
import android.util.TypedValue;
import android.view.Window;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.graphics.painter.BitmapPainter;
import androidx.compose.p018ui.graphics.vector.VectorPainter;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p018ui.res.ResourceResolutionException;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1575d2;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1563a2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1620r;
import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1848z0;
import androidx.room.C1768b1;
import androidx.room.C1776d1;
import androidx.room.C1831t1;
import androidx.room.RunnableC1764a1;
import b83.C2807c;
import ba3.C2905c;
import ba3.C2906d;
import ba3.C2909g;
import ba3.C2910h;
import bc3.AbstractC3006f0;
import bc3.C3033m;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cb3.AbstractC4393e;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.whoop.data.repositories.C6656c;
import com.whoop.service.network.model.UserState;
import dj.AbstractC12064i;
import e61.C12764g;
import ge3.AbstractC15751g;
import i63.C18163d;
import i93.C18283i;
import i93.C18284j;
import ih0.AbstractC18489d0;
import io.sentry.AbstractC20519r4;
import io.sentry.InterfaceC20602v0;
import io.sentry.config.AbstractC20301a;
import j93.AbstractC21478l0;
import j93.InterfaceC21461d;
import j93.InterfaceC21493z;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import kb3.InterfaceC22343l;
import l83.C23454a0;
import lb3.AbstractC23811y;
import m83.AbstractC25243e0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mg.AbstractC25522d;
import mg.C25525g;
import mg.InterfaceC25526h;
import n83.C26459b;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import o73.C27648a;
import o93.AbstractC27742n;
import of3.InterfaceC27903a;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p002a0.AbstractC0015d1;
import p002a0.C0006a1;
import p002a0.C0023g0;
import p002a0.C0030i1;
import p002a0.C0057v0;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0237p;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p026b2.InterfaceC2302h;
import p029b5.AbstractC2722a;
import p031b9.AbstractC2875y;
import p040c0.C3731d;
import p040c0.C3759m0;
import p040c0.C3765o0;
import p040c0.C3768p0;
import p077d0.AbstractC11343d2;
import p077d0.AbstractC11348f;
import p077d0.C11421z1;
import p077d0.InterfaceC11337c0;
import p107e3.AbstractC12602c;
import p108e4.C12685s;
import p114eb.C12971l;
import p132f0.C13823s0;
import p165g3.C15286a;
import p165g3.C15287b;
import p165g3.C15288c;
import p165g3.C15289d;
import p183h4.C16834b;
import p208i2.AbstractC17921y;
import p208i2.C17885g;
import p208i2.C17903p;
import p209i3.AbstractC18032n;
import p210i4.AbstractC18061c;
import p210i4.C18059a;
import p210i4.C18063e;
import p210i4.C18065g;
import p210i4.C18066h;
import p218ic.AbstractC18360h;
import p218ic.C18358g;
import p218ic.C18389w;
import p242j4.C21302b;
import p242j4.C21306f;
import p242j4.EnumC21309i;
import p272k4.AbstractC22179c;
import p272k4.C22183g;
import p272k4.C22184h;
import p272k4.C22185i;
import p291l0.AbstractC22989q;
import p298l8.AbstractC23420c;
import p318m3.AbstractC24984n;
import p318m3.C24982l;
import p331n2.AbstractC26165a;
import p355o2.AbstractC27422a;
import p355o2.C27430e;
import p356o3.AbstractC27493c;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p395p6.C28883h0;
import p395p6.C28900n;
import p395p6.C28918t;
import p426qi.C30387i;
import p426qi.C30402w;
import p437qt.C30582e;
import p505ts.AbstractC34132o;
import p518ub.InterfaceC34733f;
import p524ui.C34982j;
import p524ui.C34983k;
import p524ui.C34998z;
import p581we.C37199o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39105k;
import p635y2.InterfaceC39127r0;
import p668z1.C39967p;
import p692zt.C41113q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22686q;
import pf.AbstractC29125c;
import pf3.C29155a;
import q83.InterfaceC30057d;
import q83.InterfaceC30059f;
import qa3.C30144j1;
import r83.EnumC31071a;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import ra3.C31181a;
import s83.AbstractC32269c;
import sa3.AbstractC32330d;
import sa3.C32329c;
import sa3.C32336j;
import t83.C33617b;
import u63.AbstractC34560a;
import u83.AbstractC34651a;
import v83.AbstractC35800a;
import va3.AbstractC35854l;
import wb3.AbstractC37056f;
import xf3.C38266c;
import ya3.AbstractC39365h;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: pf.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC29125c {

    /* JADX INFO: renamed from: a */
    public static long f117891a;

    /* JADX INFO: renamed from: b */
    public static Method f117892b;

    /* JADX INFO: renamed from: c */
    public static Method f117893c;

    /* JADX INFO: renamed from: d */
    public static Method f117894d;

    /* JADX INFO: renamed from: A */
    public static final C38266c m88492A(ComponentCallbacks componentCallbacks) {
        AbstractC22676k.m65750j(componentCallbacks, "<this>");
        if (componentCallbacks instanceof InterfaceC27903a) {
            return ((InterfaceC27903a) componentCallbacks).getKoin().f106046a.f159364d;
        }
        C26669a c26669a = C29155a.f118017b;
        if (c26669a != null) {
            return c26669a.f106046a.f159364d;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    /* JADX INFO: renamed from: B */
    public static List m88493B(Throwable th3) {
        Object objInvoke;
        AbstractC22676k.m65750j(th3, "<this>");
        Integer num = AbstractC35800a.f152284a;
        if (!(num == null || num.intValue() >= 19)) {
            Method method = AbstractC34651a.f145962b;
            return (method == null || (objInvoke = method.invoke(th3, null)) == null) ? C25271y.f99162w : AbstractC25260n.m74048W((Throwable[]) objInvoke);
        }
        Throwable[] suppressed = th3.getSuppressed();
        AbstractC22676k.m65749i(suppressed, "getSuppressed(...)");
        return AbstractC25260n.m74048W(suppressed);
    }

    /* JADX INFO: renamed from: C */
    public static final Object m88494C(InterfaceC22343l interfaceC22343l, InterfaceC21493z p13) {
        AbstractC22676k.m65750j(interfaceC22343l, "<this>");
        AbstractC22676k.m65750j(p13, "p");
        return interfaceC22343l.invoke();
    }

    /* JADX INFO: renamed from: D */
    public static void m88495D(Exception exc, String str) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m88496E() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0735a.m1791c();
        }
        try {
            if (f117892b == null) {
                f117891a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f117892b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f117892b.invoke(null, Long.valueOf(f117891a))).booleanValue();
        } catch (Exception e5) {
            m88495D(e5, "isTagEnabled");
            return false;
        }
    }

    /* JADX INFO: renamed from: F */
    public static final void m88497F(C22686q c22686q) {
        C32329c MEMBER_KIND = AbstractC32330d.f133816p;
        AbstractC22676k.m65749i(MEMBER_KIND, "MEMBER_KIND");
        C33617b c33617b = EnumC0636l1.f2216y;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c33617b, 10));
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        while (c0030i1.hasNext()) {
            arrayList.add(((EnumC0636l1) c0030i1.next()).f2217w);
        }
    }

    /* JADX INFO: renamed from: G */
    public static final ArrayList m88498G(Map map, Function1 function1) {
        AbstractC22676k.m65750j(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C12971l c12971l = (C12971l) entry.getValue();
            Boolean boolValueOf = c12971l != null ? Boolean.valueOf(c12971l.f44799b) : null;
            AbstractC22676k.m65747g(boolValueOf);
            if (!boolValueOf.booleanValue() && !c12971l.f44800c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (((Boolean) function1.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public static final C41113q m88499H(C22686q c22686q) {
        C32329c MODALITY = AbstractC32330d.f133805e;
        AbstractC22676k.m65749i(MODALITY, "MODALITY");
        C33617b c33617b = EnumC0639m1.f2221G;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c33617b, 10));
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        while (c0030i1.hasNext()) {
            arrayList.add(((EnumC0639m1) c0030i1.next()).f2225w);
        }
        return new C41113q(c22686q, MODALITY, c33617b, arrayList);
    }

    /* JADX INFO: renamed from: I */
    public static final AbstractC26165a m88500I(int i13, Composer composer, int i14) {
        TypedValue typedValue;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        Resources resources = (Resources) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4977c);
        C15289d c15289d = (C15289d) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4979e);
        synchronized (c15289d) {
            typedValue = (TypedValue) c15289d.f57434a.m121b(i13);
            z4 = true;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i13, typedValue, true);
                C0023g0 c0023g0 = c15289d.f57434a;
                int iM47d = c0023g0.m47d(i13);
                Object[] objArr = c0023g0.f150c;
                Object obj = objArr[iM47d];
                c0023g0.f149b[iM47d] = i13;
                objArr[iM47d] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !AbstractC39414r.m125880Y(charSequence, ".xml")) {
            c28655q.m87150e0(-1771631096);
            Resources.Theme theme = context.getTheme();
            boolean zM87153g = c28655q.m87153g(charSequence);
            if ((((i14 & 14) ^ 6) <= 4 || !c28655q.m87149e(i13)) && (i14 & 6) != 4) {
                z4 = false;
            }
            boolean zM87153g2 = zM87153g | z4 | c28655q.m87153g(theme);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g2 || objM87133R == C28635l.f115821a) {
                try {
                    Drawable drawable = resources.getDrawable(i13, null);
                    AbstractC22676k.m65748h(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    objM87133R = new C17885g(((BitmapDrawable) drawable).getBitmap());
                    c28655q.m87172p0(objM87133R);
                } catch (Exception e5) {
                    throw new ResourceResolutionException(e5, "Error attempting to load resource: " + ((Object) charSequence));
                }
            }
            BitmapPainter bitmapPainter = new BitmapPainter((C17885g) objM87133R);
            c28655q.m87173q(false);
            return bitmapPainter;
        }
        c28655q.m87150e0(-1771786530);
        Resources.Theme theme2 = context.getTheme();
        int i15 = typedValue.changingConfigurations;
        C15288c c15288c = (C15288c) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4978d);
        C15287b c15287b = new C15287b(theme2, i13);
        WeakReference weakReference = (WeakReference) c15288c.f57433a.get(c15287b);
        C15286a c15286aM107859D = weakReference != null ? (C15286a) weakReference.get() : null;
        if (c15286aM107859D == null) {
            XmlResourceParser xml = resources.getXml(i13);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!AbstractC22676k.m65745e(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            c15286aM107859D = AbstractC34132o.m107859D(theme2, resources, xml, i15);
            c15288c.f57433a.put(c15287b, new WeakReference(c15286aM107859D));
        }
        VectorPainter vectorPainterM82849c = AbstractC27422a.m82849c(c15286aM107859D.f57429a, c28655q);
        c28655q.m87173q(false);
        return vectorPainterM82849c;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX INFO: renamed from: J */
    public static void m88501J(int i13, C12685s c12685s, C0237p c0237p, C18059a c18059a) {
        String strM51906c;
        AbstractC22179c abstractC22179c = i13 == 0 ? (C22184h) c12685s.m35495e(1) : (C22185i) c12685s.m35495e(2);
        AbstractC18061c abstractC18061cM51895n = c18059a.m51895n(1);
        if (abstractC18061cM51895n instanceof C18059a) {
            C18059a c18059a2 = (C18059a) abstractC18061cM51895n;
            if (c18059a2.f70145E.size() < 1) {
                return;
            }
            for (int i14 = 0; i14 < c18059a2.f70145E.size(); i14++) {
                abstractC22179c.m59829q(c18059a2.m51902v(i14));
            }
            if (c18059a.f70145E.size() > 2) {
                AbstractC18061c abstractC18061cM51895n2 = c18059a.m51895n(2);
                if (abstractC18061cM51895n2 instanceof C18065g) {
                    C18065g c18065g = (C18065g) abstractC18061cM51895n2;
                    for (String str : c18065g.m51890A()) {
                        str.getClass();
                        if (str.equals("style")) {
                            AbstractC18061c abstractC18061cM51896o = c18065g.m51896o(str);
                            if (abstractC18061cM51896o instanceof C18059a) {
                                C18059a c18059a3 = (C18059a) abstractC18061cM51896o;
                                if (c18059a3.f70145E.size() > 1) {
                                    strM51906c = c18059a3.m51902v(0);
                                    abstractC22179c.m63487u(c18059a3.m51897p(1));
                                } else {
                                    strM51906c = abstractC18061cM51896o.m51906c();
                                }
                            } else {
                                strM51906c = abstractC18061cM51896o.m51906c();
                            }
                            strM51906c.getClass();
                            if (strM51906c.equals("packed")) {
                                abstractC22179c.m63492z(EnumC21309i.f81476y);
                            } else if (strM51906c.equals("spread_inside")) {
                                abstractC22179c.m63492z(EnumC21309i.f81475x);
                            } else {
                                abstractC22179c.m63492z(EnumC21309i.f81474w);
                            }
                        } else {
                            m88502K(c0237p, c12685s, c18065g, abstractC22179c, str);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:115:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:137:0x021b  */
    /* JADX WARN: Code duplicated, block: B:172:0x0293  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x014e  */
    /* JADX INFO: renamed from: K */
    public static void m88502K(C0237p c0237p, C12685s c12685s, C18065g c18065g, C21302b c21302b, String str) {
        float fM19990e;
        float fM19990e2;
        boolean z4;
        boolean z13;
        boolean z14;
        boolean z15 = c12685s.f43377b;
        AbstractC18061c abstractC18061cM51901u = c18065g.m51901u(str);
        C18059a c18059a = abstractC18061cM51901u instanceof C18059a ? (C18059a) abstractC18061cM51901u : null;
        if (c18059a == null || c18059a.f70145E.size() <= 1) {
            String strM51904y = c18065g.m51904y(str);
            if (strM51904y != null) {
                C21302b c21302bM35492b = strM51904y.equals("parent") ? c12685s.m35492b(0) : c12685s.m35492b(strM51904y);
                str.getClass();
                switch (str) {
                    case "baseline":
                        c12685s.m35491a(c21302b.f81413a);
                        c12685s.m35491a(c21302bM35492b.f81413a);
                        c21302b.f81432j0 = 15;
                        c21302b.f81410X = c21302bM35492b;
                        break;
                    case "bottom":
                        c21302b.m59813e(c21302bM35492b);
                        break;
                    case "end":
                        if (!z15) {
                            c21302b.f81432j0 = 1;
                            c21302b.f81396J = c21302bM35492b;
                            break;
                        } else {
                            c21302b.f81432j0 = 4;
                            c21302b.f81399M = c21302bM35492b;
                            break;
                        }
                        break;
                    case "top":
                        c21302b.m59824p(c21302bM35492b);
                        break;
                    case "start":
                        if (!z15) {
                            c21302b.f81432j0 = 4;
                            c21302b.f81399M = c21302bM35492b;
                            break;
                        } else {
                            c21302b.f81432j0 = 1;
                            c21302b.f81396J = c21302bM35492b;
                            break;
                        }
                        break;
                }
            }
            return;
        }
        String strM51902v = c18059a.m51902v(0);
        AbstractC18061c abstractC18061cM51900t = c18059a.m51900t(1);
        String strM51906c = abstractC18061cM51900t instanceof C18066h ? abstractC18061cM51900t.m51906c() : null;
        float fM19990e3 = 0.0f;
        if (c18059a.f70145E.size() > 2) {
            fM19990e = c12685s.f43376a.m19990e(c0237p.m715v(c18059a.m51900t(2)));
        } else {
            fM19990e = 0.0f;
        }
        float f13 = fM19990e;
        if (c18059a.f70145E.size() > 3) {
            fM19990e2 = c12685s.f43376a.m19990e(c0237p.m715v(c18059a.m51900t(3)));
        } else {
            fM19990e2 = 0.0f;
        }
        C21302b c21302bM35492b2 = strM51902v.equals("parent") ? c12685s.m35492b(0) : c12685s.m35492b(strM51902v);
        str.getClass();
        switch (str) {
            case "baseline":
                strM51906c.getClass();
                switch (strM51906c) {
                    case "baseline":
                        c12685s.m35491a(c21302b.f81413a);
                        c12685s.m35491a(c21302bM35492b2.f81413a);
                        c21302b.f81432j0 = 15;
                        c21302b.f81410X = c21302bM35492b2;
                        break;
                    case "bottom":
                        c12685s.m35491a(c21302b.f81413a);
                        c21302b.f81432j0 = 17;
                        c21302b.f81412Z = c21302bM35492b2;
                        break;
                    case "top":
                        c12685s.m35491a(c21302b.f81413a);
                        c21302b.f81432j0 = 16;
                        c21302b.f81411Y = c21302bM35492b2;
                        break;
                }
                z4 = false;
                z13 = true;
                break;
            case "circular":
                float fM715v = c0237p.m715v(c18059a.m51895n(1));
                if (c18059a.f70145E.size() > 2) {
                    fM19990e3 = c12685s.f43376a.m19990e(c0237p.m715v(c18059a.m51900t(2)));
                }
                c21302b.f81414a0 = c21302b.m59818j(c21302bM35492b2);
                c21302b.f81416b0 = fM715v;
                c21302b.f81418c0 = fM19990e3;
                c21302b.f81432j0 = 20;
                z4 = false;
                z13 = true;
                break;
            case "bottom":
                strM51906c.getClass();
                switch (strM51906c) {
                    case "baseline":
                        c12685s.m35491a(c21302bM35492b2.f81413a);
                        c21302b.f81432j0 = 14;
                        c21302b.f81409W = c21302bM35492b2;
                        break;
                    case "bottom":
                        c21302b.m59813e(c21302bM35492b2);
                        break;
                    case "top":
                        c21302b.f81432j0 = 12;
                        c21302b.f81407U = c21302bM35492b2;
                        break;
                }
                z4 = false;
                z13 = true;
                break;
            case "end":
                z13 = !z15;
                z4 = true;
                break;
            case "top":
                strM51906c.getClass();
                switch (strM51906c) {
                    case "baseline":
                        c12685s.m35491a(c21302bM35492b2.f81413a);
                        c21302b.f81432j0 = 11;
                        c21302b.f81406T = c21302bM35492b2;
                        break;
                    case "bottom":
                        c21302b.f81432j0 = 10;
                        c21302b.f81405S = c21302bM35492b2;
                        break;
                    case "top":
                        c21302b.m59824p(c21302bM35492b2);
                        break;
                }
                z4 = false;
                z13 = true;
                break;
            case "left":
                z4 = true;
                z13 = true;
                break;
            case "right":
                z4 = true;
                z13 = false;
                break;
            case "start":
                z13 = z15;
                z4 = true;
                break;
            default:
                z4 = false;
                z13 = true;
                break;
        }
        if (z4) {
            strM51906c.getClass();
            switch (strM51906c) {
                case "end":
                    z14 = !z15;
                    break;
                case "right":
                    z14 = false;
                    break;
                case "start":
                    z14 = z15;
                    break;
                default:
                    z14 = true;
                    break;
            }
            if (z13) {
                if (z14) {
                    c21302b.f81432j0 = 1;
                    c21302b.f81396J = c21302bM35492b2;
                } else {
                    c21302b.f81432j0 = 2;
                    c21302b.f81397K = c21302bM35492b2;
                }
            } else if (z14) {
                c21302b.f81432j0 = 3;
                c21302b.f81398L = c21302bM35492b2;
            } else {
                c21302b.f81432j0 = 4;
                c21302b.f81399M = c21302bM35492b2;
            }
        }
        c21302b.mo59820l(Float.valueOf(f13)).m59822n(Float.valueOf(fM19990e2));
    }

    /* JADX INFO: renamed from: L */
    public static C21306f m88503L(C18065g c18065g, String str, C12685s c12685s, C6656c c6656c) {
        AbstractC18061c abstractC18061cM51896o = c18065g.m51896o(str);
        C21306f c21306fM59826b = C21306f.m59826b(0);
        if (abstractC18061cM51896o instanceof C18066h) {
            return m88504M(abstractC18061cM51896o.m51906c());
        }
        if (abstractC18061cM51896o instanceof C18063e) {
            return C21306f.m59826b(c12685s.m35493c(Float.valueOf(c6656c.m19990e(c18065g.m51898q(str)))));
        }
        if (abstractC18061cM51896o instanceof C18065g) {
            C18065g c18065g2 = (C18065g) abstractC18061cM51896o;
            String strM51904y = c18065g2.m51904y("value");
            if (strM51904y != null) {
                c21306fM59826b = m88504M(strM51904y);
            }
            AbstractC18061c abstractC18061cM51901u = c18065g2.m51901u("min");
            if (abstractC18061cM51901u != null) {
                if (abstractC18061cM51901u instanceof C18063e) {
                    int iM35493c = c12685s.m35493c(Float.valueOf(c6656c.m19990e(((C18063e) abstractC18061cM51901u).mo51907d())));
                    if (iM35493c >= 0) {
                        c21306fM59826b.f81463a = iM35493c;
                    }
                } else if (abstractC18061cM51901u instanceof C18066h) {
                    c21306fM59826b.f81463a = -2;
                }
            }
            AbstractC18061c abstractC18061cM51901u2 = c18065g2.m51901u("max");
            if (abstractC18061cM51901u2 != null) {
                if (abstractC18061cM51901u2 instanceof C18063e) {
                    int iM35493c2 = c12685s.m35493c(Float.valueOf(c6656c.m19990e(((C18063e) abstractC18061cM51901u2).mo51907d())));
                    if (c21306fM59826b.f81464b >= 0) {
                        c21306fM59826b.f81464b = iM35493c2;
                        return c21306fM59826b;
                    }
                } else if ((abstractC18061cM51901u2 instanceof C18066h) && c21306fM59826b.f81469g) {
                    c21306fM59826b.f81468f = C21306f.f81458i;
                    c21306fM59826b.f81464b = Integer.MAX_VALUE;
                }
            }
        }
        return c21306fM59826b;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: M */
    public static C21306f m88504M(String str) {
        C21306f c21306fM59826b = C21306f.m59826b(0);
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    b = 0;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    b = 1;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    b = 2;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    b = 3;
                }
                break;
        }
        String str2 = C21306f.f81458i;
        String str3 = C21306f.f81459j;
        switch (b) {
            case 0:
                return C21306f.m59827c(str2);
            case 1:
                return new C21306f(C21306f.f81460k);
            case 2:
                return C21306f.m59827c(str3);
            case 3:
                return new C21306f(str2);
            default:
                if (str.endsWith("%")) {
                    float f13 = Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
                    C21306f c21306f = new C21306f(C21306f.f81461l);
                    c21306f.f81465c = f13;
                    c21306f.f81469g = true;
                    c21306f.f81464b = 0;
                    return c21306f;
                }
                if (!str.contains(":")) {
                    return c21306fM59826b;
                }
                C21306f c21306f2 = new C21306f(C21306f.f81462m);
                c21306f2.f81467e = str;
                c21306f2.f81468f = str3;
                c21306f2.f81469g = true;
                return c21306f2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    /* JADX INFO: renamed from: N */
    public static void m88505N(int i13, C12685s c12685s, String str, C18065g c18065g) {
        ArrayList<String> arrayListM51890A = c18065g.m51890A();
        C21302b c21302bM35492b = c12685s.m35492b(str);
        if (i13 == 0) {
            c12685s.m35494d(0, str);
        } else {
            c12685s.m35494d(1, str);
        }
        boolean z4 = c12685s.f43377b || i13 == 0;
        C22183g c22183g = (C22183g) c21302bM35492b.f81417c;
        boolean z13 = false;
        boolean z14 = true;
        float fM51898q = 0.0f;
        for (String str2 : arrayListM51890A) {
            str2.getClass();
            switch (str2) {
                case "percent":
                    AbstractC18061c abstractC18061cM51901u = c18065g.m51901u(str2);
                    C18059a c18059a = abstractC18061cM51901u instanceof C18059a ? (C18059a) abstractC18061cM51901u : null;
                    if (c18059a == null) {
                        fM51898q = c18065g.m51898q(str2);
                        z13 = true;
                        z14 = true;
                        break;
                    } else {
                        if (c18059a.f70145E.size() > 1) {
                            String strM51902v = c18059a.m51902v(0);
                            float fM51897p = c18059a.m51897p(1);
                            strM51902v.getClass();
                            switch (strM51902v) {
                                case "end":
                                    z14 = !z4;
                                    break;
                                case "left":
                                    z14 = true;
                                    fM51898q = fM51897p;
                                    z13 = true;
                                    continue;
                                    break;
                                case "right":
                                    z14 = false;
                                    break;
                                case "start":
                                    z14 = z4;
                                    break;
                            }
                            fM51898q = fM51897p;
                        }
                        z13 = true;
                        break;
                    }
                    break;
                case "end":
                    fM51898q = c12685s.f43376a.m19990e(c18065g.m51898q(str2));
                    z14 = !z4;
                    break;
                case "left":
                    fM51898q = c12685s.f43376a.m19990e(c18065g.m51898q(str2));
                    z14 = true;
                    break;
                case "right":
                    fM51898q = c12685s.f43376a.m19990e(c18065g.m51898q(str2));
                    z14 = false;
                    break;
                case "start":
                    fM51898q = c12685s.f43376a.m19990e(c18065g.m51898q(str2));
                    z14 = z4;
                    break;
            }
        }
        if (z13) {
            if (z14) {
                c22183g.f86055d = -1;
                c22183g.f86056e = -1;
                c22183g.f86057f = fM51898q;
                return;
            } else {
                c22183g.f86055d = -1;
                c22183g.f86056e = -1;
                c22183g.f86057f = 1.0f - fM51898q;
                return;
            }
        }
        if (z14) {
            c22183g.f86055d = c22183g.f86052a.m35493c(Float.valueOf(fM51898q));
            c22183g.f86056e = -1;
            c22183g.f86057f = 0.0f;
        } else {
            Float fValueOf = Float.valueOf(fM51898q);
            c22183g.f86055d = -1;
            c22183g.f86056e = c22183g.f86052a.m35493c(fValueOf);
            c22183g.f86057f = 0.0f;
        }
    }

    /* JADX INFO: renamed from: O */
    public static void m88506O(C12685s c12685s, C0237p c0237p, String str, C18065g c18065g) throws CLParsingException {
        C21302b c21302bM35492b = c12685s.m35492b(str);
        C21306f c21306f = c21302bM35492b.f81420d0;
        String str2 = C21306f.f81458i;
        if (c21306f == null) {
            c21302bM35492b.f81420d0 = new C21306f(str2);
        }
        if (c21302bM35492b.f81422e0 == null) {
            c21302bM35492b.f81422e0 = new C21306f(str2);
        }
        Iterator it = c18065g.m51890A().iterator();
        while (it.hasNext()) {
            m88534k(c0237p, c12685s, c18065g, c21302bM35492b, (String) it.next());
        }
    }

    /* JADX INFO: renamed from: P */
    public static final void m88507P(C2910h c2910h) {
        int i13 = C2906d.f11687w;
        if (c2910h.f11692b != 1 || c2910h.f11693c != 1) {
            throw new IllegalArgumentException(AbstractC11266d.m30460n("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", c2910h, " was passed").toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Q */
    public static final void m88508Q(C37816b c37816b, AbstractC32269c abstractC32269c) {
        C28883h0 c28883h0;
        if (abstractC32269c instanceof C28883h0) {
            c28883h0 = (C28883h0) abstractC32269c;
            int i13 = c28883h0.f116917x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c28883h0.f116917x = i13 - Integer.MIN_VALUE;
            } else {
                c28883h0 = new C28883h0(abstractC32269c);
            }
        } else {
            c28883h0 = new C28883h0(abstractC32269c);
        }
        Object obj = c28883h0.f116916w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c28883h0.f116917x;
        if (i14 != 0) {
            if (i14 == 1) {
                throw AbstractC2875y.m8309v(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        C28900n c28900n = (C28900n) c28883h0.getContext().get(C28918t.f117028w);
        if (c28900n == null) {
            throw new IllegalStateException("provideContent requires a ContentReceiver and should only be called from GlanceAppWidget.provideGlance");
        }
        c28883h0.f116917x = 1;
        c28900n.m87818a(c37816b, c28883h0);
    }

    /* JADX INFO: renamed from: R */
    public static C31181a m88509R(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C18284j c18284j = new C18284j(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c18284j, 10));
        Iterator it = c18284j.iterator();
        while (((C18283i) it).f71138y) {
            ((AbstractC25243e0) it).nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] iArrM74091C1 = AbstractC25265s.m74091C1(arrayList);
        return new C31181a(Arrays.copyOf(iArrM74091C1, iArrM74091C1.length));
    }

    /* JADX INFO: renamed from: S */
    public static void m88510S(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: T */
    public static final boolean m88511T(AbstractC23811y abstractC23811y) {
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23811y.mo69844i0().mo1784d();
        if (interfaceC31126hMo1784d != null && ((AbstractC39365h.m125538b(interfaceC31126hMo1784d) && AbstractC39365h.m125541e(interfaceC31126hMo1784d) && !AbstractC4393e.m13809g((InterfaceC31117e) interfaceC31126hMo1784d).equals(AbstractC27742n.f111883h)) || AbstractC39365h.m125543g(abstractC23811y))) {
            return true;
        }
        InterfaceC31126h interfaceC31126hMo1784d2 = abstractC23811y.mo69844i0().mo1784d();
        InterfaceC31165x0 interfaceC31165x0 = interfaceC31126hMo1784d2 instanceof InterfaceC31165x0 ? (InterfaceC31165x0) interfaceC31126hMo1784d2 : null;
        return interfaceC31165x0 != null && m88511T(AbstractC20301a.m56306E(interfaceC31165x0));
    }

    /* JADX INFO: renamed from: U */
    public static void m88512U(AbstractC20519r4 abstractC20519r4, C37199o c37199o, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        if (abstractC20519r4.f76883w != null) {
            c37199o.m119207K(AnalyticsRequestV2.PARAM_EVENT_ID);
            c37199o.m119219Y(interfaceC20602v0, abstractC20519r4.f76883w);
        }
        c37199o.m119207K("contexts");
        c37199o.m119219Y(interfaceC20602v0, abstractC20519r4.f76884x);
        if (abstractC20519r4.f76885y != null) {
            c37199o.m119207K("sdk");
            c37199o.m119219Y(interfaceC20602v0, abstractC20519r4.f76885y);
        }
        if (abstractC20519r4.f76886z != null) {
            c37199o.m119207K("request");
            c37199o.m119219Y(interfaceC20602v0, abstractC20519r4.f76886z);
        }
        AbstractMap abstractMap = abstractC20519r4.f76872E;
        if (abstractMap != null && !abstractMap.isEmpty()) {
            c37199o.m119207K("tags");
            c37199o.m119219Y(interfaceC20602v0, abstractC20519r4.f76872E);
        }
        if (abstractC20519r4.f76873F != null) {
            c37199o.m119207K("release");
            c37199o.m119222b0(abstractC20519r4.f76873F);
        }
        if (abstractC20519r4.f76874G != null) {
            c37199o.m119207K("environment");
            c37199o.m119222b0(abstractC20519r4.f76874G);
        }
        if (abstractC20519r4.f76875H != null) {
            c37199o.m119207K("platform");
            c37199o.m119222b0(abstractC20519r4.f76875H);
        }
        if (abstractC20519r4.f76876I != null) {
            c37199o.m119207K(UserState.Sources.USER);
            c37199o.m119219Y(interfaceC20602v0, abstractC20519r4.f76876I);
        }
        if (abstractC20519r4.f76878K != null) {
            c37199o.m119207K("server_name");
            c37199o.m119222b0(abstractC20519r4.f76878K);
        }
        if (abstractC20519r4.f76879L != null) {
            c37199o.m119207K("dist");
            c37199o.m119222b0(abstractC20519r4.f76879L);
        }
        List list = abstractC20519r4.f76880M;
        if (list != null && !list.isEmpty()) {
            c37199o.m119207K("breadcrumbs");
            c37199o.m119219Y(interfaceC20602v0, abstractC20519r4.f76880M);
        }
        if (abstractC20519r4.f76881N != null) {
            c37199o.m119207K("debug_meta");
            c37199o.m119219Y(interfaceC20602v0, abstractC20519r4.f76881N);
        }
        AbstractMap abstractMap2 = abstractC20519r4.f76882O;
        if (abstractMap2 == null || abstractMap2.isEmpty()) {
            return;
        }
        c37199o.m119207K("extra");
        c37199o.m119219Y(interfaceC20602v0, abstractC20519r4.f76882O);
    }

    /* JADX INFO: renamed from: V */
    public static void m88513V(Window window, boolean z4) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 35) {
            AbstractC12602c.m35324f(window, z4);
        } else if (i13 >= 30) {
            AbstractC2722a.m7684k(window, z4);
        } else {
            C27648a.m83573X(window, z4);
        }
    }

    /* JADX INFO: renamed from: W */
    public static String m88514W(Throwable th3) {
        AbstractC22676k.m65750j(th3, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th3.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: X */
    public static byte[] m88515X(C18358g data) {
        AbstractC22676k.m65750j(data, "data");
        HashMap map = data.f71480a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    m88516Y(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                AbstractC22676k.m65747g(byteArray);
                return byteArray;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(dataOutputStream, th3);
                    throw th4;
                }
            }
        } catch (IOException e5) {
            C18389w.m52886d().m52890c(AbstractC18360h.f71486a, "Error in Data#toByteArray: ", e5);
            return new byte[0];
        }
    }

    /* JADX INFO: renamed from: Y */
    public static final void m88516Y(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i13;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                throw new IllegalArgumentException("Unsupported value type " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(obj.getClass()).getSimpleName());
            }
            Object[] objArr = (Object[]) obj;
            Class<?> cls = objArr.getClass();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(cls);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean[].class))) {
                i13 = 8;
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Byte[].class))) {
                i13 = 9;
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer[].class))) {
                i13 = 10;
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long[].class))) {
                i13 = 11;
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float[].class))) {
                i13 = 12;
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double[].class))) {
                i13 = 13;
            } else {
                if (!AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String[].class))) {
                    throw new IllegalArgumentException("Unsupported value type " + c22673i0.getOrCreateKotlinClass(objArr.getClass()).getQualifiedName());
                }
                i13 = 14;
            }
            dataOutputStream.writeByte(i13);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i13 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i13 == 9) {
                    Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i13 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i13 == 11) {
                    Long l7 = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l7 != null ? l7.longValue() : 0L);
                } else if (i13 == 12) {
                    Float f13 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f13 != null ? f13.floatValue() : 0.0f);
                } else if (i13 == 13) {
                    Double d3 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d3 != null ? d3.doubleValue() : 0.0d);
                } else if (i13 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    /* JADX INFO: renamed from: Z */
    public static String m88517Z(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    /* JADX INFO: renamed from: a */
    public static final void m88518a(C11421z1 c11421z1, Modifier modifier, InterfaceC11337c0 interfaceC11337c0, Function1 function1, Function3 function3, Composer composer, int i13) {
        Function1 function2;
        AbstractC0954a abstractC0954a = c11421z1.f36630a;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1877370462);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87153g(c11421z1) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC11337c0) ? 256 : 128;
        }
        int i15 = i14 | 3072;
        if ((i13 & 24576) == 0) {
            i15 |= c28655q.m87157i(function3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = C3731d.f15252E;
                c28655q.m87172p0(objM87133R);
            }
            function2 = (Function1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            Object obj = objM87133R2;
            if (objM87133R2 == c28676v0) {
                C39967p c39967p = new C39967p();
                c39967p.add(abstractC0954a.mo2428y0());
                c28655q.m87172p0(c39967p);
                obj = c39967p;
            }
            C39967p c39967p2 = (C39967p) obj;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                long[] jArr = AbstractC0015d1.f36a;
                objM87133R3 = new C0057v0();
                c28655q.m87172p0(objM87133R3);
            }
            C0057v0 c0057v0 = (C0057v0) objM87133R3;
            C28633k1 c28633k1 = c11421z1.f36633d;
            if (AbstractC22676k.m65745e(abstractC0954a.mo2428y0(), c28633k1.getValue())) {
                c28655q.m87150e0(321189832);
                if (c39967p2.size() == 1 && AbstractC22676k.m65745e(c39967p2.get(0), c28633k1.getValue())) {
                    c28655q.m87150e0(321514464);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(321324186);
                    boolean z4 = (i15 & 14) == 4;
                    Object objM87133R4 = c28655q.m87133R();
                    if (z4 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C0006a1(c11421z1, 12);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC25265s.m74132j1(c39967p2, (Function1) objM87133R4);
                    c0057v0.m123a();
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(321520416);
                c28655q.m87173q(false);
            }
            if (c0057v0.m124b(c28633k1.getValue())) {
                c28655q.m87150e0(322323936);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(321581083);
                ListIterator listIterator = c39967p2.listIterator();
                int i16 = 0;
                while (true) {
                    C26459b c26459b = (C26459b) listIterator;
                    if (!c26459b.hasNext()) {
                        i16 = -1;
                        break;
                    } else if (AbstractC22676k.m65745e(function2.invoke(c26459b.next()), function2.invoke(c28633k1.getValue()))) {
                        break;
                    } else {
                        i16++;
                    }
                }
                if (i16 == -1) {
                    c39967p2.add(c28633k1.getValue());
                } else {
                    c39967p2.set(i16, c28633k1.getValue());
                }
                c0057v0.m123a();
                int size = c39967p2.size();
                for (int i17 = 0; i17 < size; i17++) {
                    Object obj2 = c39967p2.get(i17);
                    c0057v0.m135m(obj2, AbstractC37817c.m121344e(-934471669, c28655q, new C3765o0(c11421z1, interfaceC11337c0, obj2, function3)));
                }
                c28655q.m87173q(false);
            }
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-1312707512);
            int size2 = c39967p2.size();
            for (int i18 = 0; i18 < size2; i18++) {
                Object obj3 = c39967p2.get(i18);
                c28655q.m87144b0(1171574969, function2.invoke(obj3));
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) c0057v0.m129g(obj3);
                if (interfaceC4351m == null) {
                    c28655q.m87150e0(1959122128);
                } else {
                    c28655q.m87150e0(1171576145);
                    interfaceC4351m.invoke(c28655q, 0);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3768p0(c11421z1, modifier, interfaceC11337c0, function2, function3, i13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x0061->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX INFO: renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m88519a0(p395p6.AbstractC28880g0 r5, android.content.Context r6, s83.AbstractC32269c r7) {
        /*
            boolean r0 = r7 instanceof p395p6.C28886i0
            if (r0 == 0) goto L13
            r0 = r7
            p6.i0 r0 = (p395p6.C28886i0) r0
            int r1 = r0.f116923E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116923E = r1
            goto L18
        L13:
            p6.i0 r0 = new p6.i0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f116927z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f116923E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.util.Iterator r5 = r0.f116926y
            android.content.Context r6 = r0.f116925x
            p6.g0 r2 = r0.f116924w
            p505ts.AbstractC34132o.m107864I(r7)
            goto L61
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            android.content.Context r6 = r0.f116925x
            p6.g0 r5 = r0.f116924w
            p505ts.AbstractC34132o.m107864I(r7)
            goto L59
        L40:
            p505ts.AbstractC34132o.m107864I(r7)
            p6.n0 r7 = new p6.n0
            r7.<init>(r6)
            java.lang.Class r2 = r5.getClass()
            r0.f116924w = r5
            r0.f116925x = r6
            r0.f116923E = r4
            java.io.Serializable r7 = r7.m87820b(r2, r0)
            if (r7 != r1) goto L59
            goto L7b
        L59:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = r5
            r5 = r7
        L61:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L7c
            java.lang.Object r7 = r5.next()
            n6.l r7 = (p335n6.InterfaceC26395l) r7
            r0.f116924w = r2
            r0.f116925x = r6
            r0.f116926y = r5
            r0.f116923E = r3
            java.lang.Object r7 = r2.m87809p(r6, r7, r0)
            if (r7 != r1) goto L61
        L7b:
            return r1
        L7c:
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.AbstractC29125c.m88519a0(p6.g0, android.content.Context, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0064  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:62:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m88520b(Object obj, Modifier modifier, InterfaceC11337c0 interfaceC11337c0, String str, Function3 function3, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC11337c0 interfaceC11337c1;
        int i16;
        String str2;
        int i17;
        boolean z4;
        Modifier modifier2;
        String str3;
        C28677v1 c28677v1M87180u;
        InterfaceC11337c0 interfaceC11337c0M30574v;
        String str4;
        int i18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-513216493);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(obj) : c28655q.m87157i(obj) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(modifier) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC11337c1 = interfaceC11337c0;
                i15 |= c28655q.m87157i(interfaceC11337c1) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    str2 = str;
                    if (c28655q.m87153g(str2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i18;
                }
                if ((i15 & 9363) != 9362) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i19 != 0) {
                        modifier = C2314t.f9131w;
                    }
                    Modifier modifier3 = modifier;
                    if (i24 != 0) {
                        interfaceC11337c0M30574v = AbstractC11348f.m30574v(0, 0, null, 7);
                    } else {
                        interfaceC11337c0M30574v = interfaceC11337c1;
                    }
                    if (i16 != 0) {
                        str4 = "Crossfade";
                    } else {
                        str4 = str2;
                    }
                    InterfaceC11337c0 interfaceC11337c2 = interfaceC11337c0M30574v;
                    m88518a(AbstractC11343d2.m30544f(obj, str4, c28655q, (i15 & 14) | ((i15 >> 6) & 112), 0), modifier3, interfaceC11337c2, null, function3, c28655q, i15 & 58352);
                    str3 = str4;
                    modifier2 = modifier3;
                    interfaceC11337c1 = interfaceC11337c2;
                } else {
                    c28655q.m87138X();
                    modifier2 = modifier;
                    str3 = str2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3759m0(obj, modifier2, interfaceC11337c1, str3, function3, i13, i14);
                }
            }
            i15 |= 3072;
            str2 = str;
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(function3)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    modifier = C2314t.f9131w;
                }
                Modifier modifier4 = modifier;
                if (i24 != 0) {
                    interfaceC11337c0M30574v = AbstractC11348f.m30574v(0, 0, null, 7);
                } else {
                    interfaceC11337c0M30574v = interfaceC11337c1;
                }
                if (i16 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                InterfaceC11337c0 interfaceC11337c3 = interfaceC11337c0M30574v;
                m88518a(AbstractC11343d2.m30544f(obj, str4, c28655q, (i15 & 14) | ((i15 >> 6) & 112), 0), modifier4, interfaceC11337c3, null, function3, c28655q, i15 & 58352);
                str3 = str4;
                modifier2 = modifier4;
                interfaceC11337c1 = interfaceC11337c3;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3759m0(obj, modifier2, interfaceC11337c1, str3, function3, i13, i14);
            }
        }
        i15 |= 384;
        interfaceC11337c1 = interfaceC11337c0;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                str2 = str;
                if (c28655q.m87153g(str2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(function3)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i18;
            }
            if ((i15 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    modifier = C2314t.f9131w;
                }
                Modifier modifier5 = modifier;
                if (i24 != 0) {
                    interfaceC11337c0M30574v = AbstractC11348f.m30574v(0, 0, null, 7);
                } else {
                    interfaceC11337c0M30574v = interfaceC11337c1;
                }
                if (i16 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                InterfaceC11337c0 interfaceC11337c4 = interfaceC11337c0M30574v;
                m88518a(AbstractC11343d2.m30544f(obj, str4, c28655q, (i15 & 14) | ((i15 >> 6) & 112), 0), modifier5, interfaceC11337c4, null, function3, c28655q, i15 & 58352);
                str3 = str4;
                modifier2 = modifier5;
                interfaceC11337c1 = interfaceC11337c4;
            } else {
                c28655q.m87138X();
                modifier2 = modifier;
                str3 = str2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3759m0(obj, modifier2, interfaceC11337c1, str3, function3, i13, i14);
            }
        }
        i15 |= 3072;
        str2 = str;
        if ((i13 & 24576) == 0) {
            if (c28655q.m87157i(function3)) {
                i18 = DfuBaseService.ERROR_CONNECTION_MASK;
            } else {
                i18 = DfuBaseService.ERROR_REMOTE_MASK;
            }
            i15 |= i18;
        }
        if ((i15 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i19 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier6 = modifier;
            if (i24 != 0) {
                interfaceC11337c0M30574v = AbstractC11348f.m30574v(0, 0, null, 7);
            } else {
                interfaceC11337c0M30574v = interfaceC11337c1;
            }
            if (i16 != 0) {
                str4 = "Crossfade";
            } else {
                str4 = str2;
            }
            InterfaceC11337c0 interfaceC11337c5 = interfaceC11337c0M30574v;
            m88518a(AbstractC11343d2.m30544f(obj, str4, c28655q, (i15 & 14) | ((i15 >> 6) & 112), 0), modifier6, interfaceC11337c5, null, function3, c28655q, i15 & 58352);
            str3 = str4;
            modifier2 = modifier6;
            interfaceC11337c1 = interfaceC11337c5;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            str3 = str2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3759m0(obj, modifier2, interfaceC11337c1, str3, function3, i13, i14);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m88521b0(C2910h c2910h) {
        int i13 = C2909g.f11690w;
        if (c2910h.f11692b != 1 || c2910h.f11693c != 1) {
            throw new IllegalArgumentException(AbstractC11266d.m30460n("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", c2910h, " was passed").toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:101:0x0113  */
    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:106:0x0143  */
    /* JADX WARN: Code duplicated, block: B:109:0x0166  */
    /* JADX WARN: Code duplicated, block: B:110:0x016a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0182  */
    /* JADX WARN: Code duplicated, block: B:115:0x0190  */
    /* JADX WARN: Code duplicated, block: B:118:0x019c  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00da  */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x0108  */
    /* JADX WARN: Code duplicated, block: B:97:0x010a  */
    /* JADX INFO: renamed from: c */
    public static final void m88522c(final AbstractC26165a abstractC26165a, final String str, Modifier modifier, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k, float f13, AbstractC17921y abstractC17921y, Composer composer, final int i13, final int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        InterfaceC2302h interfaceC2302h2;
        int i17;
        int i18;
        int i19;
        int i24;
        float f14;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z4;
        final Modifier modifier3;
        final InterfaceC2302h interfaceC2302h3;
        final InterfaceC39105k interfaceC39105k2;
        final AbstractC17921y abstractC17921y2;
        final float f15;
        C28677v1 c28677v1M87180u;
        Modifier modifierM51775c;
        InterfaceC2302h interfaceC2302h4;
        int i29;
        InterfaceC39105k interfaceC39105k3;
        AbstractC17921y abstractC17921y3;
        C28676v0 c28676v0;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1142754848);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(abstractC26165a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        int i34 = i14 & 4;
        if (i34 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC2302h2 = interfaceC2302h;
                    if (c28655q.m87153g(interfaceC2302h2)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 16;
                if (i18 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87153g(interfaceC39105k)) {
                            i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 32;
                    if (i24 != 0) {
                        if ((196608 & i13) == 0) {
                            f14 = f13;
                            if (c28655q.m87147d(f14)) {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 64;
                        if (i26 != 0) {
                            if ((1572864 & i13) == 0) {
                                if (c28655q.m87153g(abstractC17921y)) {
                                    i27 = 1048576;
                                } else {
                                    i27 = 524288;
                                }
                                i15 |= i27;
                            }
                            i28 = i15;
                            if ((i15 & 599187) != 599186) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (c28655q.m87135U(i28 & 1, z4)) {
                                modifierM51775c = C2314t.f9131w;
                                if (i34 != 0) {
                                    modifier2 = modifierM51775c;
                                }
                                if (i16 != 0) {
                                    interfaceC2302h4 = C2299e.f9102E;
                                } else {
                                    interfaceC2302h4 = interfaceC2302h2;
                                }
                                if (i18 != 0) {
                                    interfaceC39105k3 = C39102j.f168200b;
                                    i29 = i24;
                                } else {
                                    i29 = i24;
                                    interfaceC39105k3 = interfaceC39105k;
                                }
                                if (i29 != 0) {
                                    f14 = 1.0f;
                                }
                                if (i26 != 0) {
                                    abstractC17921y3 = null;
                                } else {
                                    abstractC17921y3 = abstractC17921y;
                                }
                                c28676v0 = C28635l.f115821a;
                                if (str != null) {
                                    c28655q.m87150e0(1899234820);
                                    if ((i28 & 112) == 32) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    objM87133R2 = c28655q.m87133R();
                                    if (z13 || objM87133R2 == c28676v0) {
                                        objM87133R2 = new C12764g(str, 1);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(1899393602);
                                    c28655q.m87173q(false);
                                }
                                Modifier modifierM3481d = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = C13823s0.f49331a;
                                    c28655q.m87172p0(objM87133R);
                                }
                                InterfaceC39127r0 interfaceC39127r0 = (InterfaceC39127r0) objM87133R;
                                iHashCode = Long.hashCode(c28655q.f115904T);
                                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3481d);
                                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                                InterfaceC0221l.f734a.getClass();
                                c0213j = C0217k.f724b;
                                c28655q.m87158i0();
                                if (c28655q.f115903S) {
                                    c28655q.m87163l(c0213j);
                                } else {
                                    c28655q.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0);
                                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                                c0209i = C0217k.f732j;
                                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                                }
                                c28655q.m87173q(true);
                                modifier3 = modifier2;
                                interfaceC2302h3 = interfaceC2302h4;
                                interfaceC39105k2 = interfaceC39105k3;
                                abstractC17921y2 = abstractC17921y3;
                            } else {
                                c28655q.m87138X();
                                modifier3 = modifier2;
                                interfaceC2302h3 = interfaceC2302h2;
                                interfaceC39105k2 = interfaceC39105k;
                                abstractC17921y2 = abstractC17921y;
                            }
                            f15 = f14;
                            c28677v1M87180u = c28655q.m87180u();
                            if (c28677v1M87180u != null) {
                                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                                    @Override // c93.InterfaceC4351m
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                        return C23454a0.f92919a;
                                    }
                                };
                            }
                        }
                        i15 |= 1572864;
                        i28 = i15;
                        if ((i15 & 599187) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i28 & 1, z4)) {
                            modifierM51775c = C2314t.f9131w;
                            if (i34 != 0) {
                                modifier2 = modifierM51775c;
                            }
                            if (i16 != 0) {
                                interfaceC2302h4 = C2299e.f9102E;
                            } else {
                                interfaceC2302h4 = interfaceC2302h2;
                            }
                            if (i18 != 0) {
                                interfaceC39105k3 = C39102j.f168200b;
                                i29 = i24;
                            } else {
                                i29 = i24;
                                interfaceC39105k3 = interfaceC39105k;
                            }
                            if (i29 != 0) {
                                f14 = 1.0f;
                            }
                            if (i26 != 0) {
                                abstractC17921y3 = null;
                            } else {
                                abstractC17921y3 = abstractC17921y;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (str != null) {
                                c28655q.m87150e0(1899234820);
                                if ((i28 & 112) == 32) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z13) {
                                    objM87133R2 = new C12764g(str, 1);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C12764g(str, 1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1899393602);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3481d2 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = C13823s0.f49331a;
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC39127r0 interfaceC39127r1 = (InterfaceC39127r0) objM87133R;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3481d2);
                            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r1);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            c28655q.m87173q(true);
                            modifier3 = modifier2;
                            interfaceC2302h3 = interfaceC2302h4;
                            interfaceC39105k2 = interfaceC39105k3;
                            abstractC17921y2 = abstractC17921y3;
                        } else {
                            c28655q.m87138X();
                            modifier3 = modifier2;
                            interfaceC2302h3 = interfaceC2302h2;
                            interfaceC39105k2 = interfaceC39105k;
                            abstractC17921y2 = abstractC17921y;
                        }
                        f15 = f14;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                    return C23454a0.f92919a;
                                }
                            };
                        }
                    }
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    f14 = f13;
                    i26 = i14 & 64;
                    if (i26 != 0) {
                        if ((1572864 & i13) == 0) {
                            if (c28655q.m87153g(abstractC17921y)) {
                                i27 = 1048576;
                            } else {
                                i27 = 524288;
                            }
                            i15 |= i27;
                        }
                        i28 = i15;
                        if ((i15 & 599187) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i28 & 1, z4)) {
                            modifierM51775c = C2314t.f9131w;
                            if (i34 != 0) {
                                modifier2 = modifierM51775c;
                            }
                            if (i16 != 0) {
                                interfaceC2302h4 = C2299e.f9102E;
                            } else {
                                interfaceC2302h4 = interfaceC2302h2;
                            }
                            if (i18 != 0) {
                                interfaceC39105k3 = C39102j.f168200b;
                                i29 = i24;
                            } else {
                                i29 = i24;
                                interfaceC39105k3 = interfaceC39105k;
                            }
                            if (i29 != 0) {
                                f14 = 1.0f;
                            }
                            if (i26 != 0) {
                                abstractC17921y3 = null;
                            } else {
                                abstractC17921y3 = abstractC17921y;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (str != null) {
                                c28655q.m87150e0(1899234820);
                                if ((i28 & 112) == 32) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z13) {
                                    objM87133R2 = new C12764g(str, 1);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C12764g(str, 1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1899393602);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3481d3 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = C13823s0.f49331a;
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC39127r0 interfaceC39127r2 = (InterfaceC39127r0) objM87133R;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3481d3);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r2);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            c28655q.m87173q(true);
                            modifier3 = modifier2;
                            interfaceC2302h3 = interfaceC2302h4;
                            interfaceC39105k2 = interfaceC39105k3;
                            abstractC17921y2 = abstractC17921y3;
                        } else {
                            c28655q.m87138X();
                            modifier3 = modifier2;
                            interfaceC2302h3 = interfaceC2302h2;
                            interfaceC39105k2 = interfaceC39105k;
                            abstractC17921y2 = abstractC17921y;
                        }
                        f15 = f14;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                    return C23454a0.f92919a;
                                }
                            };
                        }
                    }
                    i15 |= 1572864;
                    i28 = i15;
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z4)) {
                        modifierM51775c = C2314t.f9131w;
                        if (i34 != 0) {
                            modifier2 = modifierM51775c;
                        }
                        if (i16 != 0) {
                            interfaceC2302h4 = C2299e.f9102E;
                        } else {
                            interfaceC2302h4 = interfaceC2302h2;
                        }
                        if (i18 != 0) {
                            interfaceC39105k3 = C39102j.f168200b;
                            i29 = i24;
                        } else {
                            i29 = i24;
                            interfaceC39105k3 = interfaceC39105k;
                        }
                        if (i29 != 0) {
                            f14 = 1.0f;
                        }
                        if (i26 != 0) {
                            abstractC17921y3 = null;
                        } else {
                            abstractC17921y3 = abstractC17921y;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (str != null) {
                            c28655q.m87150e0(1899234820);
                            if ((i28 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13) {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1899393602);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3481d4 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C13823s0.f49331a;
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC39127r0 interfaceC39127r3 = (InterfaceC39127r0) objM87133R;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3481d4);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r3);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        c28655q.m87173q(true);
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h4;
                        interfaceC39105k2 = interfaceC39105k3;
                        abstractC17921y2 = abstractC17921y3;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h2;
                        interfaceC39105k2 = interfaceC39105k;
                        abstractC17921y2 = abstractC17921y;
                    }
                    f15 = f14;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i15 |= 24576;
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        f14 = f13;
                        if (c28655q.m87147d(f14)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 64;
                    if (i26 != 0) {
                        if ((1572864 & i13) == 0) {
                            if (c28655q.m87153g(abstractC17921y)) {
                                i27 = 1048576;
                            } else {
                                i27 = 524288;
                            }
                            i15 |= i27;
                        }
                        i28 = i15;
                        if ((i15 & 599187) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i28 & 1, z4)) {
                            modifierM51775c = C2314t.f9131w;
                            if (i34 != 0) {
                                modifier2 = modifierM51775c;
                            }
                            if (i16 != 0) {
                                interfaceC2302h4 = C2299e.f9102E;
                            } else {
                                interfaceC2302h4 = interfaceC2302h2;
                            }
                            if (i18 != 0) {
                                interfaceC39105k3 = C39102j.f168200b;
                                i29 = i24;
                            } else {
                                i29 = i24;
                                interfaceC39105k3 = interfaceC39105k;
                            }
                            if (i29 != 0) {
                                f14 = 1.0f;
                            }
                            if (i26 != 0) {
                                abstractC17921y3 = null;
                            } else {
                                abstractC17921y3 = abstractC17921y;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (str != null) {
                                c28655q.m87150e0(1899234820);
                                if ((i28 & 112) == 32) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z13) {
                                    objM87133R2 = new C12764g(str, 1);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C12764g(str, 1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1899393602);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3481d5 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = C13823s0.f49331a;
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC39127r0 interfaceC39127r4 = (InterfaceC39127r0) objM87133R;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3481d5);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r4);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            c28655q.m87173q(true);
                            modifier3 = modifier2;
                            interfaceC2302h3 = interfaceC2302h4;
                            interfaceC39105k2 = interfaceC39105k3;
                            abstractC17921y2 = abstractC17921y3;
                        } else {
                            c28655q.m87138X();
                            modifier3 = modifier2;
                            interfaceC2302h3 = interfaceC2302h2;
                            interfaceC39105k2 = interfaceC39105k;
                            abstractC17921y2 = abstractC17921y;
                        }
                        f15 = f14;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                    return C23454a0.f92919a;
                                }
                            };
                        }
                    }
                    i15 |= 1572864;
                    i28 = i15;
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z4)) {
                        modifierM51775c = C2314t.f9131w;
                        if (i34 != 0) {
                            modifier2 = modifierM51775c;
                        }
                        if (i16 != 0) {
                            interfaceC2302h4 = C2299e.f9102E;
                        } else {
                            interfaceC2302h4 = interfaceC2302h2;
                        }
                        if (i18 != 0) {
                            interfaceC39105k3 = C39102j.f168200b;
                            i29 = i24;
                        } else {
                            i29 = i24;
                            interfaceC39105k3 = interfaceC39105k;
                        }
                        if (i29 != 0) {
                            f14 = 1.0f;
                        }
                        if (i26 != 0) {
                            abstractC17921y3 = null;
                        } else {
                            abstractC17921y3 = abstractC17921y;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (str != null) {
                            c28655q.m87150e0(1899234820);
                            if ((i28 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13) {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1899393602);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3481d6 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C13823s0.f49331a;
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC39127r0 interfaceC39127r5 = (InterfaceC39127r0) objM87133R;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3481d6);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r5);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        c28655q.m87173q(true);
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h4;
                        interfaceC39105k2 = interfaceC39105k3;
                        abstractC17921y2 = abstractC17921y3;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h2;
                        interfaceC39105k2 = interfaceC39105k;
                        abstractC17921y2 = abstractC17921y;
                    }
                    f15 = f14;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                f14 = f13;
                i26 = i14 & 64;
                if (i26 != 0) {
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87153g(abstractC17921y)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                    i28 = i15;
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z4)) {
                        modifierM51775c = C2314t.f9131w;
                        if (i34 != 0) {
                            modifier2 = modifierM51775c;
                        }
                        if (i16 != 0) {
                            interfaceC2302h4 = C2299e.f9102E;
                        } else {
                            interfaceC2302h4 = interfaceC2302h2;
                        }
                        if (i18 != 0) {
                            interfaceC39105k3 = C39102j.f168200b;
                            i29 = i24;
                        } else {
                            i29 = i24;
                            interfaceC39105k3 = interfaceC39105k;
                        }
                        if (i29 != 0) {
                            f14 = 1.0f;
                        }
                        if (i26 != 0) {
                            abstractC17921y3 = null;
                        } else {
                            abstractC17921y3 = abstractC17921y;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (str != null) {
                            c28655q.m87150e0(1899234820);
                            if ((i28 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13) {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1899393602);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3481d7 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C13823s0.f49331a;
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC39127r0 interfaceC39127r6 = (InterfaceC39127r0) objM87133R;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3481d7);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r6);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        c28655q.m87173q(true);
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h4;
                        interfaceC39105k2 = interfaceC39105k3;
                        abstractC17921y2 = abstractC17921y3;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h2;
                        interfaceC39105k2 = interfaceC39105k;
                        abstractC17921y2 = abstractC17921y;
                    }
                    f15 = f14;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i15 |= 1572864;
                i28 = i15;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i28 & 1, z4)) {
                    modifierM51775c = C2314t.f9131w;
                    if (i34 != 0) {
                        modifier2 = modifierM51775c;
                    }
                    if (i16 != 0) {
                        interfaceC2302h4 = C2299e.f9102E;
                    } else {
                        interfaceC2302h4 = interfaceC2302h2;
                    }
                    if (i18 != 0) {
                        interfaceC39105k3 = C39102j.f168200b;
                        i29 = i24;
                    } else {
                        i29 = i24;
                        interfaceC39105k3 = interfaceC39105k;
                    }
                    if (i29 != 0) {
                        f14 = 1.0f;
                    }
                    if (i26 != 0) {
                        abstractC17921y3 = null;
                    } else {
                        abstractC17921y3 = abstractC17921y;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (str != null) {
                        c28655q.m87150e0(1899234820);
                        if ((i28 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1899393602);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3481d8 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C13823s0.f49331a;
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC39127r0 interfaceC39127r7 = (InterfaceC39127r0) objM87133R;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3481d8);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r7);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h4;
                    interfaceC39105k2 = interfaceC39105k3;
                    abstractC17921y2 = abstractC17921y3;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h2;
                    interfaceC39105k2 = interfaceC39105k;
                    abstractC17921y2 = abstractC17921y;
                }
                f15 = f14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= 3072;
            interfaceC2302h2 = interfaceC2302h;
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87153g(interfaceC39105k)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        f14 = f13;
                        if (c28655q.m87147d(f14)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 64;
                    if (i26 != 0) {
                        if ((1572864 & i13) == 0) {
                            if (c28655q.m87153g(abstractC17921y)) {
                                i27 = 1048576;
                            } else {
                                i27 = 524288;
                            }
                            i15 |= i27;
                        }
                        i28 = i15;
                        if ((i15 & 599187) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i28 & 1, z4)) {
                            modifierM51775c = C2314t.f9131w;
                            if (i34 != 0) {
                                modifier2 = modifierM51775c;
                            }
                            if (i16 != 0) {
                                interfaceC2302h4 = C2299e.f9102E;
                            } else {
                                interfaceC2302h4 = interfaceC2302h2;
                            }
                            if (i18 != 0) {
                                interfaceC39105k3 = C39102j.f168200b;
                                i29 = i24;
                            } else {
                                i29 = i24;
                                interfaceC39105k3 = interfaceC39105k;
                            }
                            if (i29 != 0) {
                                f14 = 1.0f;
                            }
                            if (i26 != 0) {
                                abstractC17921y3 = null;
                            } else {
                                abstractC17921y3 = abstractC17921y;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (str != null) {
                                c28655q.m87150e0(1899234820);
                                if ((i28 & 112) == 32) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z13) {
                                    objM87133R2 = new C12764g(str, 1);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C12764g(str, 1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1899393602);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3481d9 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = C13823s0.f49331a;
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC39127r0 interfaceC39127r8 = (InterfaceC39127r0) objM87133R;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3481d9);
                            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r8);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            c28655q.m87173q(true);
                            modifier3 = modifier2;
                            interfaceC2302h3 = interfaceC2302h4;
                            interfaceC39105k2 = interfaceC39105k3;
                            abstractC17921y2 = abstractC17921y3;
                        } else {
                            c28655q.m87138X();
                            modifier3 = modifier2;
                            interfaceC2302h3 = interfaceC2302h2;
                            interfaceC39105k2 = interfaceC39105k;
                            abstractC17921y2 = abstractC17921y;
                        }
                        f15 = f14;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                    return C23454a0.f92919a;
                                }
                            };
                        }
                    }
                    i15 |= 1572864;
                    i28 = i15;
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z4)) {
                        modifierM51775c = C2314t.f9131w;
                        if (i34 != 0) {
                            modifier2 = modifierM51775c;
                        }
                        if (i16 != 0) {
                            interfaceC2302h4 = C2299e.f9102E;
                        } else {
                            interfaceC2302h4 = interfaceC2302h2;
                        }
                        if (i18 != 0) {
                            interfaceC39105k3 = C39102j.f168200b;
                            i29 = i24;
                        } else {
                            i29 = i24;
                            interfaceC39105k3 = interfaceC39105k;
                        }
                        if (i29 != 0) {
                            f14 = 1.0f;
                        }
                        if (i26 != 0) {
                            abstractC17921y3 = null;
                        } else {
                            abstractC17921y3 = abstractC17921y;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (str != null) {
                            c28655q.m87150e0(1899234820);
                            if ((i28 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13) {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1899393602);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3481d10 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C13823s0.f49331a;
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC39127r0 interfaceC39127r9 = (InterfaceC39127r0) objM87133R;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3481d10);
                        InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r9);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        c28655q.m87173q(true);
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h4;
                        interfaceC39105k2 = interfaceC39105k3;
                        abstractC17921y2 = abstractC17921y3;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h2;
                        interfaceC39105k2 = interfaceC39105k;
                        abstractC17921y2 = abstractC17921y;
                    }
                    f15 = f14;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                f14 = f13;
                i26 = i14 & 64;
                if (i26 != 0) {
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87153g(abstractC17921y)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                    i28 = i15;
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z4)) {
                        modifierM51775c = C2314t.f9131w;
                        if (i34 != 0) {
                            modifier2 = modifierM51775c;
                        }
                        if (i16 != 0) {
                            interfaceC2302h4 = C2299e.f9102E;
                        } else {
                            interfaceC2302h4 = interfaceC2302h2;
                        }
                        if (i18 != 0) {
                            interfaceC39105k3 = C39102j.f168200b;
                            i29 = i24;
                        } else {
                            i29 = i24;
                            interfaceC39105k3 = interfaceC39105k;
                        }
                        if (i29 != 0) {
                            f14 = 1.0f;
                        }
                        if (i26 != 0) {
                            abstractC17921y3 = null;
                        } else {
                            abstractC17921y3 = abstractC17921y;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (str != null) {
                            c28655q.m87150e0(1899234820);
                            if ((i28 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13) {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1899393602);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3481d11 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C13823s0.f49331a;
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC39127r0 interfaceC39127r10 = (InterfaceC39127r0) objM87133R;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3481d11);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r10);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11);
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        c28655q.m87173q(true);
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h4;
                        interfaceC39105k2 = interfaceC39105k3;
                        abstractC17921y2 = abstractC17921y3;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h2;
                        interfaceC39105k2 = interfaceC39105k;
                        abstractC17921y2 = abstractC17921y;
                    }
                    f15 = f14;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i15 |= 1572864;
                i28 = i15;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i28 & 1, z4)) {
                    modifierM51775c = C2314t.f9131w;
                    if (i34 != 0) {
                        modifier2 = modifierM51775c;
                    }
                    if (i16 != 0) {
                        interfaceC2302h4 = C2299e.f9102E;
                    } else {
                        interfaceC2302h4 = interfaceC2302h2;
                    }
                    if (i18 != 0) {
                        interfaceC39105k3 = C39102j.f168200b;
                        i29 = i24;
                    } else {
                        i29 = i24;
                        interfaceC39105k3 = interfaceC39105k;
                    }
                    if (i29 != 0) {
                        f14 = 1.0f;
                    }
                    if (i26 != 0) {
                        abstractC17921y3 = null;
                    } else {
                        abstractC17921y3 = abstractC17921y;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (str != null) {
                        c28655q.m87150e0(1899234820);
                        if ((i28 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1899393602);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3481d12 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C13823s0.f49331a;
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC39127r0 interfaceC39127r11 = (InterfaceC39127r0) objM87133R;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3481d12);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r11);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h4;
                    interfaceC39105k2 = interfaceC39105k3;
                    abstractC17921y2 = abstractC17921y3;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h2;
                    interfaceC39105k2 = interfaceC39105k;
                    abstractC17921y2 = abstractC17921y;
                }
                f15 = f14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= 24576;
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    f14 = f13;
                    if (c28655q.m87147d(f14)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87153g(abstractC17921y)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                    i28 = i15;
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z4)) {
                        modifierM51775c = C2314t.f9131w;
                        if (i34 != 0) {
                            modifier2 = modifierM51775c;
                        }
                        if (i16 != 0) {
                            interfaceC2302h4 = C2299e.f9102E;
                        } else {
                            interfaceC2302h4 = interfaceC2302h2;
                        }
                        if (i18 != 0) {
                            interfaceC39105k3 = C39102j.f168200b;
                            i29 = i24;
                        } else {
                            i29 = i24;
                            interfaceC39105k3 = interfaceC39105k;
                        }
                        if (i29 != 0) {
                            f14 = 1.0f;
                        }
                        if (i26 != 0) {
                            abstractC17921y3 = null;
                        } else {
                            abstractC17921y3 = abstractC17921y;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (str != null) {
                            c28655q.m87150e0(1899234820);
                            if ((i28 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13) {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1899393602);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3481d13 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C13823s0.f49331a;
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC39127r0 interfaceC39127r12 = (InterfaceC39127r0) objM87133R;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3481d13);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r12);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        c28655q.m87173q(true);
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h4;
                        interfaceC39105k2 = interfaceC39105k3;
                        abstractC17921y2 = abstractC17921y3;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h2;
                        interfaceC39105k2 = interfaceC39105k;
                        abstractC17921y2 = abstractC17921y;
                    }
                    f15 = f14;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i15 |= 1572864;
                i28 = i15;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i28 & 1, z4)) {
                    modifierM51775c = C2314t.f9131w;
                    if (i34 != 0) {
                        modifier2 = modifierM51775c;
                    }
                    if (i16 != 0) {
                        interfaceC2302h4 = C2299e.f9102E;
                    } else {
                        interfaceC2302h4 = interfaceC2302h2;
                    }
                    if (i18 != 0) {
                        interfaceC39105k3 = C39102j.f168200b;
                        i29 = i24;
                    } else {
                        i29 = i24;
                        interfaceC39105k3 = interfaceC39105k;
                    }
                    if (i29 != 0) {
                        f14 = 1.0f;
                    }
                    if (i26 != 0) {
                        abstractC17921y3 = null;
                    } else {
                        abstractC17921y3 = abstractC17921y;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (str != null) {
                        c28655q.m87150e0(1899234820);
                        if ((i28 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1899393602);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3481d14 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C13823s0.f49331a;
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC39127r0 interfaceC39127r13 = (InterfaceC39127r0) objM87133R;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3481d14);
                    InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r13);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m14);
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N14);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h4;
                    interfaceC39105k2 = interfaceC39105k3;
                    abstractC17921y2 = abstractC17921y3;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h2;
                    interfaceC39105k2 = interfaceC39105k;
                    abstractC17921y2 = abstractC17921y;
                }
                f15 = f14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            f14 = f13;
            i26 = i14 & 64;
            if (i26 != 0) {
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87153g(abstractC17921y)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
                i28 = i15;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i28 & 1, z4)) {
                    modifierM51775c = C2314t.f9131w;
                    if (i34 != 0) {
                        modifier2 = modifierM51775c;
                    }
                    if (i16 != 0) {
                        interfaceC2302h4 = C2299e.f9102E;
                    } else {
                        interfaceC2302h4 = interfaceC2302h2;
                    }
                    if (i18 != 0) {
                        interfaceC39105k3 = C39102j.f168200b;
                        i29 = i24;
                    } else {
                        i29 = i24;
                        interfaceC39105k3 = interfaceC39105k;
                    }
                    if (i29 != 0) {
                        f14 = 1.0f;
                    }
                    if (i26 != 0) {
                        abstractC17921y3 = null;
                    } else {
                        abstractC17921y3 = abstractC17921y;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (str != null) {
                        c28655q.m87150e0(1899234820);
                        if ((i28 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1899393602);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3481d15 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C13823s0.f49331a;
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC39127r0 interfaceC39127r14 = (InterfaceC39127r0) objM87133R;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3481d15);
                    InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r14);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m15);
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N15);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h4;
                    interfaceC39105k2 = interfaceC39105k3;
                    abstractC17921y2 = abstractC17921y3;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h2;
                    interfaceC39105k2 = interfaceC39105k;
                    abstractC17921y2 = abstractC17921y;
                }
                f15 = f14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= 1572864;
            i28 = i15;
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i28 & 1, z4)) {
                modifierM51775c = C2314t.f9131w;
                if (i34 != 0) {
                    modifier2 = modifierM51775c;
                }
                if (i16 != 0) {
                    interfaceC2302h4 = C2299e.f9102E;
                } else {
                    interfaceC2302h4 = interfaceC2302h2;
                }
                if (i18 != 0) {
                    interfaceC39105k3 = C39102j.f168200b;
                    i29 = i24;
                } else {
                    i29 = i24;
                    interfaceC39105k3 = interfaceC39105k;
                }
                if (i29 != 0) {
                    f14 = 1.0f;
                }
                if (i26 != 0) {
                    abstractC17921y3 = null;
                } else {
                    abstractC17921y3 = abstractC17921y;
                }
                c28676v0 = C28635l.f115821a;
                if (str != null) {
                    c28655q.m87150e0(1899234820);
                    if ((i28 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13) {
                        objM87133R2 = new C12764g(str, 1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C12764g(str, 1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1899393602);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3481d16 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = C13823s0.f49331a;
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC39127r0 interfaceC39127r15 = (InterfaceC39127r0) objM87133R;
                iHashCode = Long.hashCode(c28655q.f115904T);
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3481d16);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r15);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                c28655q.m87173q(true);
                modifier3 = modifier2;
                interfaceC2302h3 = interfaceC2302h4;
                interfaceC39105k2 = interfaceC39105k3;
                abstractC17921y2 = abstractC17921y3;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC2302h3 = interfaceC2302h2;
                interfaceC39105k2 = interfaceC39105k;
                abstractC17921y2 = abstractC17921y;
            }
            f15 = f14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 384;
        modifier2 = modifier;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC2302h2 = interfaceC2302h;
                if (c28655q.m87153g(interfaceC2302h2)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            i18 = i14 & 16;
            if (i18 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87153g(interfaceC39105k)) {
                        i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 32;
                if (i24 != 0) {
                    if ((196608 & i13) == 0) {
                        f14 = f13;
                        if (c28655q.m87147d(f14)) {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 64;
                    if (i26 != 0) {
                        if ((1572864 & i13) == 0) {
                            if (c28655q.m87153g(abstractC17921y)) {
                                i27 = 1048576;
                            } else {
                                i27 = 524288;
                            }
                            i15 |= i27;
                        }
                        i28 = i15;
                        if ((i15 & 599187) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q.m87135U(i28 & 1, z4)) {
                            modifierM51775c = C2314t.f9131w;
                            if (i34 != 0) {
                                modifier2 = modifierM51775c;
                            }
                            if (i16 != 0) {
                                interfaceC2302h4 = C2299e.f9102E;
                            } else {
                                interfaceC2302h4 = interfaceC2302h2;
                            }
                            if (i18 != 0) {
                                interfaceC39105k3 = C39102j.f168200b;
                                i29 = i24;
                            } else {
                                i29 = i24;
                                interfaceC39105k3 = interfaceC39105k;
                            }
                            if (i29 != 0) {
                                f14 = 1.0f;
                            }
                            if (i26 != 0) {
                                abstractC17921y3 = null;
                            } else {
                                abstractC17921y3 = abstractC17921y;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (str != null) {
                                c28655q.m87150e0(1899234820);
                                if ((i28 & 112) == 32) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                objM87133R2 = c28655q.m87133R();
                                if (z13) {
                                    objM87133R2 = new C12764g(str, 1);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C12764g(str, 1);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(1899393602);
                                c28655q.m87173q(false);
                            }
                            Modifier modifierM3481d17 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = C13823s0.f49331a;
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC39127r0 interfaceC39127r16 = (InterfaceC39127r0) objM87133R;
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q, modifierM3481d17);
                            InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q.m87165m();
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r16);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m17);
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N17);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            c28655q.m87173q(true);
                            modifier3 = modifier2;
                            interfaceC2302h3 = interfaceC2302h4;
                            interfaceC39105k2 = interfaceC39105k3;
                            abstractC17921y2 = abstractC17921y3;
                        } else {
                            c28655q.m87138X();
                            modifier3 = modifier2;
                            interfaceC2302h3 = interfaceC2302h2;
                            interfaceC39105k2 = interfaceC39105k;
                            abstractC17921y2 = abstractC17921y;
                        }
                        f15 = f14;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                    return C23454a0.f92919a;
                                }
                            };
                        }
                    }
                    i15 |= 1572864;
                    i28 = i15;
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z4)) {
                        modifierM51775c = C2314t.f9131w;
                        if (i34 != 0) {
                            modifier2 = modifierM51775c;
                        }
                        if (i16 != 0) {
                            interfaceC2302h4 = C2299e.f9102E;
                        } else {
                            interfaceC2302h4 = interfaceC2302h2;
                        }
                        if (i18 != 0) {
                            interfaceC39105k3 = C39102j.f168200b;
                            i29 = i24;
                        } else {
                            i29 = i24;
                            interfaceC39105k3 = interfaceC39105k;
                        }
                        if (i29 != 0) {
                            f14 = 1.0f;
                        }
                        if (i26 != 0) {
                            abstractC17921y3 = null;
                        } else {
                            abstractC17921y3 = abstractC17921y;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (str != null) {
                            c28655q.m87150e0(1899234820);
                            if ((i28 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13) {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1899393602);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3481d18 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C13823s0.f49331a;
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC39127r0 interfaceC39127r17 = (InterfaceC39127r0) objM87133R;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q, modifierM3481d18);
                        InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q.m87165m();
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r17);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m18);
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N18);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        c28655q.m87173q(true);
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h4;
                        interfaceC39105k2 = interfaceC39105k3;
                        abstractC17921y2 = abstractC17921y3;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h2;
                        interfaceC39105k2 = interfaceC39105k;
                        abstractC17921y2 = abstractC17921y;
                    }
                    f15 = f14;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                f14 = f13;
                i26 = i14 & 64;
                if (i26 != 0) {
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87153g(abstractC17921y)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                    i28 = i15;
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z4)) {
                        modifierM51775c = C2314t.f9131w;
                        if (i34 != 0) {
                            modifier2 = modifierM51775c;
                        }
                        if (i16 != 0) {
                            interfaceC2302h4 = C2299e.f9102E;
                        } else {
                            interfaceC2302h4 = interfaceC2302h2;
                        }
                        if (i18 != 0) {
                            interfaceC39105k3 = C39102j.f168200b;
                            i29 = i24;
                        } else {
                            i29 = i24;
                            interfaceC39105k3 = interfaceC39105k;
                        }
                        if (i29 != 0) {
                            f14 = 1.0f;
                        }
                        if (i26 != 0) {
                            abstractC17921y3 = null;
                        } else {
                            abstractC17921y3 = abstractC17921y;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (str != null) {
                            c28655q.m87150e0(1899234820);
                            if ((i28 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13) {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1899393602);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3481d19 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C13823s0.f49331a;
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC39127r0 interfaceC39127r18 = (InterfaceC39127r0) objM87133R;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q, modifierM3481d19);
                        InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q.m87165m();
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r18);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m19);
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N19);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        c28655q.m87173q(true);
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h4;
                        interfaceC39105k2 = interfaceC39105k3;
                        abstractC17921y2 = abstractC17921y3;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h2;
                        interfaceC39105k2 = interfaceC39105k;
                        abstractC17921y2 = abstractC17921y;
                    }
                    f15 = f14;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i15 |= 1572864;
                i28 = i15;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i28 & 1, z4)) {
                    modifierM51775c = C2314t.f9131w;
                    if (i34 != 0) {
                        modifier2 = modifierM51775c;
                    }
                    if (i16 != 0) {
                        interfaceC2302h4 = C2299e.f9102E;
                    } else {
                        interfaceC2302h4 = interfaceC2302h2;
                    }
                    if (i18 != 0) {
                        interfaceC39105k3 = C39102j.f168200b;
                        i29 = i24;
                    } else {
                        i29 = i24;
                        interfaceC39105k3 = interfaceC39105k;
                    }
                    if (i29 != 0) {
                        f14 = 1.0f;
                    }
                    if (i26 != 0) {
                        abstractC17921y3 = null;
                    } else {
                        abstractC17921y3 = abstractC17921y;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (str != null) {
                        c28655q.m87150e0(1899234820);
                        if ((i28 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1899393602);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3481d110 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C13823s0.f49331a;
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC39127r0 interfaceC39127r19 = (InterfaceC39127r0) objM87133R;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q, modifierM3481d110);
                    InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q.m87165m();
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r19);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m110);
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N110);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h4;
                    interfaceC39105k2 = interfaceC39105k3;
                    abstractC17921y2 = abstractC17921y3;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h2;
                    interfaceC39105k2 = interfaceC39105k;
                    abstractC17921y2 = abstractC17921y;
                }
                f15 = f14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= 24576;
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    f14 = f13;
                    if (c28655q.m87147d(f14)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87153g(abstractC17921y)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                    i28 = i15;
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z4)) {
                        modifierM51775c = C2314t.f9131w;
                        if (i34 != 0) {
                            modifier2 = modifierM51775c;
                        }
                        if (i16 != 0) {
                            interfaceC2302h4 = C2299e.f9102E;
                        } else {
                            interfaceC2302h4 = interfaceC2302h2;
                        }
                        if (i18 != 0) {
                            interfaceC39105k3 = C39102j.f168200b;
                            i29 = i24;
                        } else {
                            i29 = i24;
                            interfaceC39105k3 = interfaceC39105k;
                        }
                        if (i29 != 0) {
                            f14 = 1.0f;
                        }
                        if (i26 != 0) {
                            abstractC17921y3 = null;
                        } else {
                            abstractC17921y3 = abstractC17921y;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (str != null) {
                            c28655q.m87150e0(1899234820);
                            if ((i28 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13) {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1899393602);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3481d111 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C13823s0.f49331a;
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC39127r0 interfaceC39127r110 = (InterfaceC39127r0) objM87133R;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q, modifierM3481d111);
                        InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q.m87165m();
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r110);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m111);
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N111);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        c28655q.m87173q(true);
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h4;
                        interfaceC39105k2 = interfaceC39105k3;
                        abstractC17921y2 = abstractC17921y3;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h2;
                        interfaceC39105k2 = interfaceC39105k;
                        abstractC17921y2 = abstractC17921y;
                    }
                    f15 = f14;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i15 |= 1572864;
                i28 = i15;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i28 & 1, z4)) {
                    modifierM51775c = C2314t.f9131w;
                    if (i34 != 0) {
                        modifier2 = modifierM51775c;
                    }
                    if (i16 != 0) {
                        interfaceC2302h4 = C2299e.f9102E;
                    } else {
                        interfaceC2302h4 = interfaceC2302h2;
                    }
                    if (i18 != 0) {
                        interfaceC39105k3 = C39102j.f168200b;
                        i29 = i24;
                    } else {
                        i29 = i24;
                        interfaceC39105k3 = interfaceC39105k;
                    }
                    if (i29 != 0) {
                        f14 = 1.0f;
                    }
                    if (i26 != 0) {
                        abstractC17921y3 = null;
                    } else {
                        abstractC17921y3 = abstractC17921y;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (str != null) {
                        c28655q.m87150e0(1899234820);
                        if ((i28 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1899393602);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3481d112 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C13823s0.f49331a;
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC39127r0 interfaceC39127r111 = (InterfaceC39127r0) objM87133R;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q, modifierM3481d112);
                    InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q.m87165m();
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r111);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m112);
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N112);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h4;
                    interfaceC39105k2 = interfaceC39105k3;
                    abstractC17921y2 = abstractC17921y3;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h2;
                    interfaceC39105k2 = interfaceC39105k;
                    abstractC17921y2 = abstractC17921y;
                }
                f15 = f14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            f14 = f13;
            i26 = i14 & 64;
            if (i26 != 0) {
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87153g(abstractC17921y)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
                i28 = i15;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i28 & 1, z4)) {
                    modifierM51775c = C2314t.f9131w;
                    if (i34 != 0) {
                        modifier2 = modifierM51775c;
                    }
                    if (i16 != 0) {
                        interfaceC2302h4 = C2299e.f9102E;
                    } else {
                        interfaceC2302h4 = interfaceC2302h2;
                    }
                    if (i18 != 0) {
                        interfaceC39105k3 = C39102j.f168200b;
                        i29 = i24;
                    } else {
                        i29 = i24;
                        interfaceC39105k3 = interfaceC39105k;
                    }
                    if (i29 != 0) {
                        f14 = 1.0f;
                    }
                    if (i26 != 0) {
                        abstractC17921y3 = null;
                    } else {
                        abstractC17921y3 = abstractC17921y;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (str != null) {
                        c28655q.m87150e0(1899234820);
                        if ((i28 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1899393602);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3481d113 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C13823s0.f49331a;
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC39127r0 interfaceC39127r112 = (InterfaceC39127r0) objM87133R;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q, modifierM3481d113);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q.m87165m();
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r112);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m113);
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N113);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h4;
                    interfaceC39105k2 = interfaceC39105k3;
                    abstractC17921y2 = abstractC17921y3;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h2;
                    interfaceC39105k2 = interfaceC39105k;
                    abstractC17921y2 = abstractC17921y;
                }
                f15 = f14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= 1572864;
            i28 = i15;
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i28 & 1, z4)) {
                modifierM51775c = C2314t.f9131w;
                if (i34 != 0) {
                    modifier2 = modifierM51775c;
                }
                if (i16 != 0) {
                    interfaceC2302h4 = C2299e.f9102E;
                } else {
                    interfaceC2302h4 = interfaceC2302h2;
                }
                if (i18 != 0) {
                    interfaceC39105k3 = C39102j.f168200b;
                    i29 = i24;
                } else {
                    i29 = i24;
                    interfaceC39105k3 = interfaceC39105k;
                }
                if (i29 != 0) {
                    f14 = 1.0f;
                }
                if (i26 != 0) {
                    abstractC17921y3 = null;
                } else {
                    abstractC17921y3 = abstractC17921y;
                }
                c28676v0 = C28635l.f115821a;
                if (str != null) {
                    c28655q.m87150e0(1899234820);
                    if ((i28 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13) {
                        objM87133R2 = new C12764g(str, 1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C12764g(str, 1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1899393602);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3481d114 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = C13823s0.f49331a;
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC39127r0 interfaceC39127r113 = (InterfaceC39127r0) objM87133R;
                iHashCode = Long.hashCode(c28655q.f115904T);
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q, modifierM3481d114);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q.m87165m();
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r113);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m114);
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N114);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                c28655q.m87173q(true);
                modifier3 = modifier2;
                interfaceC2302h3 = interfaceC2302h4;
                interfaceC39105k2 = interfaceC39105k3;
                abstractC17921y2 = abstractC17921y3;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC2302h3 = interfaceC2302h2;
                interfaceC39105k2 = interfaceC39105k;
                abstractC17921y2 = abstractC17921y;
            }
            f15 = f14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 3072;
        interfaceC2302h2 = interfaceC2302h;
        i18 = i14 & 16;
        if (i18 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q.m87153g(interfaceC39105k)) {
                    i19 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i19;
            }
            i24 = i14 & 32;
            if (i24 != 0) {
                if ((196608 & i13) == 0) {
                    f14 = f13;
                    if (c28655q.m87147d(f14)) {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 64;
                if (i26 != 0) {
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87153g(abstractC17921y)) {
                            i27 = 1048576;
                        } else {
                            i27 = 524288;
                        }
                        i15 |= i27;
                    }
                    i28 = i15;
                    if ((i15 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z4)) {
                        modifierM51775c = C2314t.f9131w;
                        if (i34 != 0) {
                            modifier2 = modifierM51775c;
                        }
                        if (i16 != 0) {
                            interfaceC2302h4 = C2299e.f9102E;
                        } else {
                            interfaceC2302h4 = interfaceC2302h2;
                        }
                        if (i18 != 0) {
                            interfaceC39105k3 = C39102j.f168200b;
                            i29 = i24;
                        } else {
                            i29 = i24;
                            interfaceC39105k3 = interfaceC39105k;
                        }
                        if (i29 != 0) {
                            f14 = 1.0f;
                        }
                        if (i26 != 0) {
                            abstractC17921y3 = null;
                        } else {
                            abstractC17921y3 = abstractC17921y;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (str != null) {
                            c28655q.m87150e0(1899234820);
                            if ((i28 & 112) == 32) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R2 = c28655q.m87133R();
                            if (z13) {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C12764g(str, 1);
                                c28655q.m87172p0(objM87133R2);
                            }
                            modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1899393602);
                            c28655q.m87173q(false);
                        }
                        Modifier modifierM3481d115 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = C13823s0.f49331a;
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC39127r0 interfaceC39127r114 = (InterfaceC39127r0) objM87133R;
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q, modifierM3481d115);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q.m87165m();
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r114);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m115);
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N115);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        c28655q.m87173q(true);
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h4;
                        interfaceC39105k2 = interfaceC39105k3;
                        abstractC17921y2 = abstractC17921y3;
                    } else {
                        c28655q.m87138X();
                        modifier3 = modifier2;
                        interfaceC2302h3 = interfaceC2302h2;
                        interfaceC39105k2 = interfaceC39105k;
                        abstractC17921y2 = abstractC17921y;
                    }
                    f15 = f14;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                                return C23454a0.f92919a;
                            }
                        };
                    }
                }
                i15 |= 1572864;
                i28 = i15;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i28 & 1, z4)) {
                    modifierM51775c = C2314t.f9131w;
                    if (i34 != 0) {
                        modifier2 = modifierM51775c;
                    }
                    if (i16 != 0) {
                        interfaceC2302h4 = C2299e.f9102E;
                    } else {
                        interfaceC2302h4 = interfaceC2302h2;
                    }
                    if (i18 != 0) {
                        interfaceC39105k3 = C39102j.f168200b;
                        i29 = i24;
                    } else {
                        i29 = i24;
                        interfaceC39105k3 = interfaceC39105k;
                    }
                    if (i29 != 0) {
                        f14 = 1.0f;
                    }
                    if (i26 != 0) {
                        abstractC17921y3 = null;
                    } else {
                        abstractC17921y3 = abstractC17921y;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (str != null) {
                        c28655q.m87150e0(1899234820);
                        if ((i28 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1899393602);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3481d116 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C13823s0.f49331a;
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC39127r0 interfaceC39127r115 = (InterfaceC39127r0) objM87133R;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q, modifierM3481d116);
                    InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q.m87165m();
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r115);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m116);
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N116);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h4;
                    interfaceC39105k2 = interfaceC39105k3;
                    abstractC17921y2 = abstractC17921y3;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h2;
                    interfaceC39105k2 = interfaceC39105k;
                    abstractC17921y2 = abstractC17921y;
                }
                f15 = f14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            f14 = f13;
            i26 = i14 & 64;
            if (i26 != 0) {
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87153g(abstractC17921y)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
                i28 = i15;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i28 & 1, z4)) {
                    modifierM51775c = C2314t.f9131w;
                    if (i34 != 0) {
                        modifier2 = modifierM51775c;
                    }
                    if (i16 != 0) {
                        interfaceC2302h4 = C2299e.f9102E;
                    } else {
                        interfaceC2302h4 = interfaceC2302h2;
                    }
                    if (i18 != 0) {
                        interfaceC39105k3 = C39102j.f168200b;
                        i29 = i24;
                    } else {
                        i29 = i24;
                        interfaceC39105k3 = interfaceC39105k;
                    }
                    if (i29 != 0) {
                        f14 = 1.0f;
                    }
                    if (i26 != 0) {
                        abstractC17921y3 = null;
                    } else {
                        abstractC17921y3 = abstractC17921y;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (str != null) {
                        c28655q.m87150e0(1899234820);
                        if ((i28 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1899393602);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3481d117 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C13823s0.f49331a;
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC39127r0 interfaceC39127r116 = (InterfaceC39127r0) objM87133R;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q, modifierM3481d117);
                    InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q.m87165m();
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r116);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m117);
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N117);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h4;
                    interfaceC39105k2 = interfaceC39105k3;
                    abstractC17921y2 = abstractC17921y3;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h2;
                    interfaceC39105k2 = interfaceC39105k;
                    abstractC17921y2 = abstractC17921y;
                }
                f15 = f14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= 1572864;
            i28 = i15;
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i28 & 1, z4)) {
                modifierM51775c = C2314t.f9131w;
                if (i34 != 0) {
                    modifier2 = modifierM51775c;
                }
                if (i16 != 0) {
                    interfaceC2302h4 = C2299e.f9102E;
                } else {
                    interfaceC2302h4 = interfaceC2302h2;
                }
                if (i18 != 0) {
                    interfaceC39105k3 = C39102j.f168200b;
                    i29 = i24;
                } else {
                    i29 = i24;
                    interfaceC39105k3 = interfaceC39105k;
                }
                if (i29 != 0) {
                    f14 = 1.0f;
                }
                if (i26 != 0) {
                    abstractC17921y3 = null;
                } else {
                    abstractC17921y3 = abstractC17921y;
                }
                c28676v0 = C28635l.f115821a;
                if (str != null) {
                    c28655q.m87150e0(1899234820);
                    if ((i28 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13) {
                        objM87133R2 = new C12764g(str, 1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C12764g(str, 1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1899393602);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3481d118 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = C13823s0.f49331a;
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC39127r0 interfaceC39127r117 = (InterfaceC39127r0) objM87133R;
                iHashCode = Long.hashCode(c28655q.f115904T);
                Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q, modifierM3481d118);
                InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q.m87165m();
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r117);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m118);
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N118);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                c28655q.m87173q(true);
                modifier3 = modifier2;
                interfaceC2302h3 = interfaceC2302h4;
                interfaceC39105k2 = interfaceC39105k3;
                abstractC17921y2 = abstractC17921y3;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC2302h3 = interfaceC2302h2;
                interfaceC39105k2 = interfaceC39105k;
                abstractC17921y2 = abstractC17921y;
            }
            f15 = f14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 24576;
        i24 = i14 & 32;
        if (i24 != 0) {
            if ((196608 & i13) == 0) {
                f14 = f13;
                if (c28655q.m87147d(f14)) {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i25 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i25;
            }
            i26 = i14 & 64;
            if (i26 != 0) {
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87153g(abstractC17921y)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i15 |= i27;
                }
                i28 = i15;
                if ((i15 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i28 & 1, z4)) {
                    modifierM51775c = C2314t.f9131w;
                    if (i34 != 0) {
                        modifier2 = modifierM51775c;
                    }
                    if (i16 != 0) {
                        interfaceC2302h4 = C2299e.f9102E;
                    } else {
                        interfaceC2302h4 = interfaceC2302h2;
                    }
                    if (i18 != 0) {
                        interfaceC39105k3 = C39102j.f168200b;
                        i29 = i24;
                    } else {
                        i29 = i24;
                        interfaceC39105k3 = interfaceC39105k;
                    }
                    if (i29 != 0) {
                        f14 = 1.0f;
                    }
                    if (i26 != 0) {
                        abstractC17921y3 = null;
                    } else {
                        abstractC17921y3 = abstractC17921y;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (str != null) {
                        c28655q.m87150e0(1899234820);
                        if ((i28 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R2 = c28655q.m87133R();
                        if (z13) {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C12764g(str, 1);
                            c28655q.m87172p0(objM87133R2);
                        }
                        modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(1899393602);
                        c28655q.m87173q(false);
                    }
                    Modifier modifierM3481d119 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C13823s0.f49331a;
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC39127r0 interfaceC39127r118 = (InterfaceC39127r0) objM87133R;
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q, modifierM3481d119);
                    InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q.m87165m();
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r118);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m119);
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N119);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    c28655q.m87173q(true);
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h4;
                    interfaceC39105k2 = interfaceC39105k3;
                    abstractC17921y2 = abstractC17921y3;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    interfaceC2302h3 = interfaceC2302h2;
                    interfaceC39105k2 = interfaceC39105k;
                    abstractC17921y2 = abstractC17921y;
                }
                f15 = f14;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                            return C23454a0.f92919a;
                        }
                    };
                }
            }
            i15 |= 1572864;
            i28 = i15;
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i28 & 1, z4)) {
                modifierM51775c = C2314t.f9131w;
                if (i34 != 0) {
                    modifier2 = modifierM51775c;
                }
                if (i16 != 0) {
                    interfaceC2302h4 = C2299e.f9102E;
                } else {
                    interfaceC2302h4 = interfaceC2302h2;
                }
                if (i18 != 0) {
                    interfaceC39105k3 = C39102j.f168200b;
                    i29 = i24;
                } else {
                    i29 = i24;
                    interfaceC39105k3 = interfaceC39105k;
                }
                if (i29 != 0) {
                    f14 = 1.0f;
                }
                if (i26 != 0) {
                    abstractC17921y3 = null;
                } else {
                    abstractC17921y3 = abstractC17921y;
                }
                c28676v0 = C28635l.f115821a;
                if (str != null) {
                    c28655q.m87150e0(1899234820);
                    if ((i28 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13) {
                        objM87133R2 = new C12764g(str, 1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C12764g(str, 1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1899393602);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3481d1110 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = C13823s0.f49331a;
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC39127r0 interfaceC39127r119 = (InterfaceC39127r0) objM87133R;
                iHashCode = Long.hashCode(c28655q.f115904T);
                Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q, modifierM3481d1110);
                InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q.m87165m();
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r119);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m1110);
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N1110);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                c28655q.m87173q(true);
                modifier3 = modifier2;
                interfaceC2302h3 = interfaceC2302h4;
                interfaceC39105k2 = interfaceC39105k3;
                abstractC17921y2 = abstractC17921y3;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC2302h3 = interfaceC2302h2;
                interfaceC39105k2 = interfaceC39105k;
                abstractC17921y2 = abstractC17921y;
            }
            f15 = f14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        f14 = f13;
        i26 = i14 & 64;
        if (i26 != 0) {
            if ((1572864 & i13) == 0) {
                if (c28655q.m87153g(abstractC17921y)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i15 |= i27;
            }
            i28 = i15;
            if ((i15 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i28 & 1, z4)) {
                modifierM51775c = C2314t.f9131w;
                if (i34 != 0) {
                    modifier2 = modifierM51775c;
                }
                if (i16 != 0) {
                    interfaceC2302h4 = C2299e.f9102E;
                } else {
                    interfaceC2302h4 = interfaceC2302h2;
                }
                if (i18 != 0) {
                    interfaceC39105k3 = C39102j.f168200b;
                    i29 = i24;
                } else {
                    i29 = i24;
                    interfaceC39105k3 = interfaceC39105k;
                }
                if (i29 != 0) {
                    f14 = 1.0f;
                }
                if (i26 != 0) {
                    abstractC17921y3 = null;
                } else {
                    abstractC17921y3 = abstractC17921y;
                }
                c28676v0 = C28635l.f115821a;
                if (str != null) {
                    c28655q.m87150e0(1899234820);
                    if ((i28 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z13) {
                        objM87133R2 = new C12764g(str, 1);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C12764g(str, 1);
                        c28655q.m87172p0(objM87133R2);
                    }
                    modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1899393602);
                    c28655q.m87173q(false);
                }
                Modifier modifierM3481d1111 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = C13823s0.f49331a;
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC39127r0 interfaceC39127r1110 = (InterfaceC39127r0) objM87133R;
                iHashCode = Long.hashCode(c28655q.f115904T);
                Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q, modifierM3481d1111);
                InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q.m87165m();
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r1110);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m1111);
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N1111);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                c28655q.m87173q(true);
                modifier3 = modifier2;
                interfaceC2302h3 = interfaceC2302h4;
                interfaceC39105k2 = interfaceC39105k3;
                abstractC17921y2 = abstractC17921y3;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                interfaceC2302h3 = interfaceC2302h2;
                interfaceC39105k2 = interfaceC39105k;
                abstractC17921y2 = abstractC17921y;
            }
            f15 = f14;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                        return C23454a0.f92919a;
                    }
                };
            }
        }
        i15 |= 1572864;
        i28 = i15;
        if ((i15 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i28 & 1, z4)) {
            modifierM51775c = C2314t.f9131w;
            if (i34 != 0) {
                modifier2 = modifierM51775c;
            }
            if (i16 != 0) {
                interfaceC2302h4 = C2299e.f9102E;
            } else {
                interfaceC2302h4 = interfaceC2302h2;
            }
            if (i18 != 0) {
                interfaceC39105k3 = C39102j.f168200b;
                i29 = i24;
            } else {
                i29 = i24;
                interfaceC39105k3 = interfaceC39105k;
            }
            if (i29 != 0) {
                f14 = 1.0f;
            }
            if (i26 != 0) {
                abstractC17921y3 = null;
            } else {
                abstractC17921y3 = abstractC17921y;
            }
            c28676v0 = C28635l.f115821a;
            if (str != null) {
                c28655q.m87150e0(1899234820);
                if ((i28 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objM87133R2 = c28655q.m87133R();
                if (z13) {
                    objM87133R2 = new C12764g(str, 1);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C12764g(str, 1);
                    c28655q.m87172p0(objM87133R2);
                }
                modifierM51775c = AbstractC18032n.m51775c(modifierM51775c, false, (Function1) objM87133R2);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1899393602);
                c28655q.m87173q(false);
            }
            Modifier modifierM3481d1112 = AbstractC1125a.m3481d(AbstractC37056f.m118995s(modifier2.mo3471e(modifierM51775c)), abstractC26165a, interfaceC2302h4, interfaceC39105k3, f14, abstractC17921y3, 2);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = C13823s0.f49331a;
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC39127r0 interfaceC39127r1111 = (InterfaceC39127r0) objM87133R;
            iHashCode = Long.hashCode(c28655q.f115904T);
            Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q, modifierM3481d1112);
            InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q.m87165m();
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r1111);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m1112);
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N1112);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            c28655q.m87173q(true);
            modifier3 = modifier2;
            interfaceC2302h3 = interfaceC2302h4;
            interfaceC39105k2 = interfaceC39105k3;
            abstractC17921y2 = abstractC17921y3;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            interfaceC2302h3 = interfaceC2302h2;
            interfaceC39105k2 = interfaceC39105k;
            abstractC17921y2 = abstractC17921y;
        }
        f15 = f14;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: f0.r0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC29125c.m88522c(abstractC26165a, str, modifier3, interfaceC2302h3, interfaceC39105k2, f15, abstractC17921y2, (Composer) obj, AbstractC28683x.m87244L(i13 | 1), i14);
                    return C23454a0.f92919a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static final AbstractC1637w1 m88523c0(InterfaceC21461d modelClass, InterfaceC1583f2 interfaceC1583f2, String str, InterfaceC1563a2 interfaceC1563a2, AbstractC23420c extras, Composer composer) {
        C1575d2 c1575d2M93817f;
        if (interfaceC1563a2 != null) {
            C1579e2 store = interfaceC1583f2.getViewModelStore();
            AbstractC22676k.m65750j(store, "store");
            AbstractC22676k.m65750j(extras, "extras");
            c1575d2M93817f = new C1575d2(store, interfaceC1563a2, extras);
        } else if (interfaceC1583f2 instanceof InterfaceC1620r) {
            C1579e2 store2 = interfaceC1583f2.getViewModelStore();
            InterfaceC1563a2 factory = ((InterfaceC1620r) interfaceC1583f2).getDefaultViewModelProviderFactory();
            AbstractC22676k.m65750j(store2, "store");
            AbstractC22676k.m65750j(factory, "factory");
            AbstractC22676k.m65750j(extras, "extras");
            c1575d2M93817f = new C1575d2(store2, factory, extras);
        } else {
            c1575d2M93817f = C30582e.m93817f(interfaceC1583f2, null, 6);
        }
        C41113q c41113q = (C41113q) c1575d2M93817f.f6205a;
        if (str != null) {
            AbstractC22676k.m65750j(modelClass, "modelClass");
            return c41113q.m133475w(str, modelClass);
        }
        AbstractC22676k.m65750j(modelClass, "modelClass");
        String qualifiedName = modelClass.getQualifiedName();
        if (qualifiedName != null) {
            return c41113q.m133475w("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX INFO: renamed from: d */
    public static final void m88524d(C27430e c27430e, String str, Modifier modifier, C17903p c17903p, Composer composer, int i13, int i14) {
        if ((i14 & 4) != 0) {
            modifier = C2314t.f9131w;
        }
        Modifier modifier2 = modifier;
        C2307m c2307m = C2299e.f9102E;
        float f13 = (i14 & 32) != 0 ? 1.0f : 0.5f;
        if ((i14 & 64) != 0) {
            c17903p = null;
        }
        m88522c(AbstractC27422a.m82849c(c27430e, composer), str, modifier2, c2307m, C39102j.f168200b, f13, c17903p, composer, (i13 & 112) | 8 | (i13 & 896) | (57344 & i13) | (458752 & i13), 0);
    }

    /* JADX INFO: renamed from: d0 */
    public static final C41113q m88525d0(C22686q c22686q) {
        C32329c VISIBILITY = AbstractC32330d.f133804d;
        AbstractC22676k.m65749i(VISIBILITY, "VISIBILITY");
        C33617b c33617b = EnumC0642n1.f2246z;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(c33617b, 10));
        C0030i1 c0030i1 = new C0030i1(c33617b, 2);
        while (c0030i1.hasNext()) {
            arrayList.add(((EnumC0642n1) c0030i1.next()).f2247w);
        }
        return new C41113q(c22686q, VISIBILITY, c33617b, arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static final void m88526e(C17885g c17885g, String str, Modifier modifier, InterfaceC39105k interfaceC39105k, Composer composer, int i13, int i14) {
        C2307m c2307m = C2299e.f9102E;
        if ((i14 & 16) != 0) {
            interfaceC39105k = C39102j.f168200b;
        }
        InterfaceC39105k interfaceC39105k2 = interfaceC39105k;
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(c17885g);
        Object objM87133R = c28655q.m87133R();
        if (zM87153g || objM87133R == C28635l.f115821a) {
            objM87133R = AbstractC34132o.m107877a(c17885g, 1);
            c28655q.m87172p0(objM87133R);
        }
        m88522c((BitmapPainter) objM87133R, str, modifier, c2307m, interfaceC39105k2, 1.0f, null, c28655q, i13 & 4194288, 0);
    }

    /* JADX INFO: renamed from: e0 */
    public static final C18163d m88527e0(C18163d c18163d, Charset charset) {
        AbstractC22676k.m65750j(c18163d, "<this>");
        AbstractC22676k.m65750j(charset, "charset");
        String str = c18163d.f70477d;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (lowerCase.equals("application")) {
            String lowerCase2 = c18163d.f70478e.toLowerCase(locale);
            AbstractC22676k.m65749i(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase2.equals("json")) {
                return c18163d;
            }
        }
        return c18163d.m52164g(AbstractC34560a.m109275c(charset));
    }

    /* JADX INFO: renamed from: f */
    public static final void m88528f(C30387i c30387i, InterfaceC4339a progress, Modifier modifier, C34998z c34998z, InterfaceC39105k interfaceC39105k, Map map, Composer composer, int i13, int i14, int i15) {
        Modifier modifier2;
        AbstractC22676k.m65750j(progress, "progress");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1070242582);
        C34998z c34998z2 = (i15 & 256) != 0 ? null : c34998z;
        Map map2 = (i15 & 4096) != 0 ? null : map;
        c28655q.m87152f0(-492369756);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (objM87133R == c28676v0) {
            objM87133R = new C30402w();
            c28655q.m87172p0(objM87133R);
        }
        c28655q.m87173q(false);
        C30402w c30402w = (C30402w) objM87133R;
        c28655q.m87152f0(-492369756);
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new Matrix();
            c28655q.m87172p0(objM87133R2);
        }
        c28655q.m87173q(false);
        Matrix matrix = (Matrix) objM87133R2;
        c28655q.m87152f0(1157296644);
        boolean zM87153g = c28655q.m87153g(c30387i);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87153g || objM87133R3 == c28676v0) {
            objM87133R3 = AbstractC28683x.m87272z(null);
            c28655q.m87172p0(objM87133R3);
        }
        c28655q.m87173q(false);
        InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
        c28655q.m87152f0(185151773);
        if (c30387i == null || c30387i.m92859b() == 0.0f) {
            c28655q.m87173q(false);
            C28677v1 c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u == null) {
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                c28677v1M87180u.f115982d = new C34982j(c30387i, progress, modifier2, c34998z2, interfaceC39105k, map2, i13, i14, i15, 0);
            }
            AbstractC22989q.m66760a(modifier2, c28655q, (i13 >> 6) & 14);
            return;
        }
        c28655q.m87173q(false);
        float fM33265c = AbstractC12064i.m33265c();
        Map map3 = map2;
        C34998z c34998z3 = c34998z2;
        AbstractC21478l0.m60421a(AbstractC1102d.m3421r(modifier, c30387i.f124691k.width() / fM33265c, c30387i.f124691k.height() / fM33265c), new C34983k(c30387i, interfaceC39105k, matrix, c30402w, map3, c34998z3, progress, interfaceC28601c1), c28655q, 0);
        C28677v1 c28677v1M87180u2 = c28655q.m87180u();
        if (c28677v1M87180u2 == null) {
            return;
        }
        c28677v1M87180u2.f115982d = new C34982j(c30387i, progress, modifier, c34998z3, interfaceC39105k, map3, i13, i14, i15, 1);
    }

    /* JADX INFO: renamed from: f0 */
    public static final Object m88529f0(AbstractC1848z0 abstractC1848z0, Function1 function1, InterfaceC30057d interfaceC30057d) {
        C1768b1 c1768b1 = new C1768b1(function1, (InterfaceC30057d) null);
        C1831t1 c1831t1 = (C1831t1) interfaceC30057d.getContext().get(C1831t1.f7178x);
        InterfaceC30059f interfaceC30059f = c1831t1 != null ? c1831t1.f7179w : null;
        if (interfaceC30059f != null) {
            return AbstractC3006f0.m8705K(interfaceC30059f, c1768b1, interfaceC30057d);
        }
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(interfaceC30057d));
        c3033m.m8774s();
        try {
            abstractC1848z0.getTransactionExecutor().execute(new RunnableC1764a1(c3033m, abstractC1848z0, c1768b1));
        } catch (RejectedExecutionException e5) {
            c3033m.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e5));
        }
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX INFO: renamed from: g */
    public static void m88530g(Throwable th3, Throwable exception) {
        AbstractC22676k.m65750j(th3, "<this>");
        AbstractC22676k.m65750j(exception, "exception");
        if (th3 != exception) {
            Integer num = AbstractC35800a.f152284a;
            if (num == null || num.intValue() >= 19) {
                th3.addSuppressed(exception);
                return;
            }
            Method method = AbstractC34651a.f145961a;
            if (method != null) {
                method.invoke(th3, exception);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static final Application m88531h(C38266c c38266c) throws C2807c {
        AbstractC22676k.m65750j(c38266c, "<this>");
        try {
            return (Application) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Application.class), null);
        } catch (Exception unused) {
            throw new C2807c("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.", 1);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final Context m88532i(C38266c c38266c) throws C2807c {
        AbstractC22676k.m65750j(c38266c, "<this>");
        try {
            return (Context) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Context.class), null);
        } catch (Exception unused) {
            throw new C2807c("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m88533j(int i13, StringBuilder sb4) {
        for (int i14 = 0; i14 < i13; i14++) {
            sb4.append("?");
            if (i14 < i13 - 1) {
                sb4.append(",");
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m88534k(C0237p c0237p, C12685s c12685s, C18065g c18065g, C21302b c21302b, String str) throws CLParsingException {
        long j7;
        str.getClass();
        switch (str) {
            case "centerVertically":
                String strM51903w = c18065g.m51903w(str);
                C21302b c21302bM35492b = strM51903w.equals("parent") ? c12685s.m35492b(0) : c12685s.m35492b(strM51903w);
                c21302b.m59824p(c21302bM35492b);
                c21302b.m59813e(c21302bM35492b);
                return;
            case "center":
                String strM51903w2 = c18065g.m51903w(str);
                C21302b c21302bM35492b2 = strM51903w2.equals("parent") ? c12685s.m35492b(0) : c12685s.m35492b(strM51903w2);
                c21302b.m59823o(c21302bM35492b2);
                c21302b.m59817i(c21302bM35492b2);
                c21302b.m59824p(c21302bM35492b2);
                c21302b.m59813e(c21302bM35492b2);
                return;
            case "custom":
                AbstractC18061c abstractC18061cM51901u = c18065g.m51901u(str);
                C18065g c18065g2 = abstractC18061cM51901u instanceof C18065g ? (C18065g) abstractC18061cM51901u : null;
                if (c18065g2 == null) {
                    return;
                }
                for (String str2 : c18065g2.m51890A()) {
                    AbstractC18061c abstractC18061cM51896o = c18065g2.m51896o(str2);
                    if (abstractC18061cM51896o instanceof C18063e) {
                        float fMo51907d = abstractC18061cM51896o.mo51907d();
                        if (c21302b.f81430i0 == null) {
                            c21302b.f81430i0 = new HashMap();
                        }
                        c21302b.f81430i0.put(str2, Float.valueOf(fMo51907d));
                    } else if (abstractC18061cM51896o instanceof C18066h) {
                        String strM51906c = abstractC18061cM51896o.m51906c();
                        if (strM51906c.startsWith("#")) {
                            String strSubstring = strM51906c.substring(1);
                            if (strSubstring.length() == 6) {
                                strSubstring = "FF".concat(strSubstring);
                            }
                            j7 = Long.parseLong(strSubstring, 16);
                        } else {
                            j7 = -1;
                        }
                        if (j7 != -1) {
                            c21302b.f81428h0.put(str2, Integer.valueOf((int) j7));
                        }
                    }
                }
                return;
            case "rotationX":
                c21302b.f81448z = c0237p.m715v(c18065g.m51896o(str));
                return;
            case "rotationY":
                c21302b.f81387A = c0237p.m715v(c18065g.m51896o(str));
                return;
            case "rotationZ":
                c21302b.f81388B = c0237p.m715v(c18065g.m51896o(str));
                return;
            case "translationX":
                c21302b.f81389C = c12685s.f43376a.m19990e(c0237p.m715v(c18065g.m51896o(str)));
                return;
            case "translationY":
                c21302b.f81390D = c12685s.f43376a.m19990e(c0237p.m715v(c18065g.m51896o(str)));
                return;
            case "translationZ":
                c21302b.f81391E = c12685s.f43376a.m19990e(c0237p.m715v(c18065g.m51896o(str)));
                return;
            case "height":
                c21302b.f81422e0 = m88503L(c18065g, str, c12685s, c12685s.f43376a);
                return;
            case "motion":
                AbstractC18061c abstractC18061cM51896o2 = c18065g.m51896o(str);
                if (abstractC18061cM51896o2 instanceof C18065g) {
                    C18065g c18065g3 = (C18065g) abstractC18061cM51896o2;
                    C16834b c16834b = new C16834b();
                    for (String str3 : c18065g3.m51890A()) {
                        str3.getClass();
                        switch (str3) {
                            case "stagger":
                                c16834b.m47438a(c18065g3.m51898q(str3), 600);
                                break;
                            case "easing":
                                c16834b.m47440c(603, c18065g3.m51903w(str3));
                                break;
                            case "quantize":
                                AbstractC18061c abstractC18061cM51896o3 = c18065g3.m51896o(str3);
                                if (abstractC18061cM51896o3 instanceof C18059a) {
                                    C18059a c18059a = (C18059a) abstractC18061cM51896o3;
                                    int size = c18059a.f70145E.size();
                                    if (size > 0) {
                                        c16834b.m47439b(610, c18059a.m51899r(0));
                                        if (size > 1) {
                                            c16834b.m47440c(611, c18059a.m51902v(1));
                                            if (size > 2) {
                                                c16834b.m47438a(c18059a.m51897p(2), 602);
                                            }
                                        }
                                    }
                                    break;
                                } else {
                                    AbstractC18061c abstractC18061cM51896o4 = c18065g3.m51896o(str3);
                                    if (abstractC18061cM51896o4 == null) {
                                        StringBuilder sbM53375p = AbstractC18489d0.m53375p("no int found for key <", str3, ">, found [");
                                        sbM53375p.append(abstractC18061cM51896o4.m51909f());
                                        sbM53375p.append("] : ");
                                        sbM53375p.append(abstractC18061cM51896o4);
                                        throw new CLParsingException(sbM53375p.toString(), c18065g3);
                                    }
                                    c16834b.m47439b(610, abstractC18061cM51896o4.mo51908e());
                                    break;
                                }
                                break;
                            case "pathArc":
                                String strM51903w3 = c18065g3.m51903w(str3);
                                String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= 6) {
                                        i13 = -1;
                                    } else if (!strArr[i13].equals(strM51903w3)) {
                                        i13++;
                                    }
                                }
                                if (i13 != -1) {
                                    c16834b.m47439b(607, i13);
                                    break;
                                } else {
                                    System.err.println("0 pathArc = '" + strM51903w3 + "'");
                                    break;
                                }
                                break;
                            case "relativeTo":
                                c16834b.m47440c(605, c18065g3.m51903w(str3));
                                break;
                        }
                    }
                    c21302b.getClass();
                    return;
                }
                return;
            case "pivotX":
                c21302b.f81446x = c0237p.m715v(c18065g.m51896o(str));
                return;
            case "pivotY":
                c21302b.f81447y = c0237p.m715v(c18065g.m51896o(str));
                return;
            case "scaleX":
                c21302b.f81393G = c0237p.m715v(c18065g.m51896o(str));
                return;
            case "scaleY":
                c21302b.f81394H = c0237p.m715v(c18065g.m51896o(str));
                return;
            case "hRtlBias":
                float fM715v = c0237p.m715v(c18065g.m51896o(str));
                if (!c12685s.f43377b) {
                    fM715v = 1.0f - fM715v;
                }
                c21302b.f81427h = fM715v;
                return;
            case "vWeight":
                c21302b.f81425g = c0237p.m715v(c18065g.m51896o(str));
                return;
            case "alpha":
                c21302b.f81392F = c0237p.m715v(c18065g.m51896o(str));
                return;
            case "hBias":
                c21302b.f81427h = c0237p.m715v(c18065g.m51896o(str));
                return;
            case "vBias":
                c21302b.f81429i = c0237p.m715v(c18065g.m51896o(str));
                return;
            case "width":
                c21302b.f81420d0 = m88503L(c18065g, str, c12685s, c12685s.f43376a);
                return;
            case "hWeight":
                c21302b.f81423f = c0237p.m715v(c18065g.m51896o(str));
                return;
            case "centerHorizontally":
                String strM51903w4 = c18065g.m51903w(str);
                C21302b c21302bM35492b3 = strM51903w4.equals("parent") ? c12685s.m35492b(0) : c12685s.m35492b(strM51903w4);
                c21302b.m59823o(c21302bM35492b3);
                c21302b.m59817i(c21302bM35492b3);
                return;
            case "visibility":
                String strM51903w5 = c18065g.m51903w(str);
                strM51903w5.getClass();
                switch (strM51903w5) {
                    case "invisible":
                        c21302b.f81395I = 4;
                        c21302b.f81392F = 0.0f;
                        return;
                    case "gone":
                        c21302b.f81395I = 8;
                        return;
                    case "visible":
                        c21302b.f81395I = 0;
                        return;
                    default:
                        return;
                }
            default:
                m88502K(c0237p, c12685s, c18065g, c21302b, str);
                return;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m88535l(InterfaceC34733f interfaceC34733f, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i13 = 0;
        while (i13 < length) {
            Object obj = objArr[i13];
            i13++;
            if (obj == null) {
                interfaceC34733f.mo5436u(i13);
            } else if (obj instanceof byte[]) {
                interfaceC34733f.mo5434q(i13, (byte[]) obj);
            } else if (obj instanceof Float) {
                interfaceC34733f.mo5435t(((Number) obj).floatValue(), i13);
            } else if (obj instanceof Double) {
                interfaceC34733f.mo5435t(((Number) obj).doubleValue(), i13);
            } else if (obj instanceof Long) {
                interfaceC34733f.mo5433p(i13, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                interfaceC34733f.mo5433p(i13, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                interfaceC34733f.mo5433p(i13, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                interfaceC34733f.mo5433p(i13, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                interfaceC34733f.mo5432n0(i13, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i13 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                interfaceC34733f.mo5433p(i13, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static final Charset m88536m(C18163d c18163d) {
        AbstractC22676k.m65750j(c18163d, "<this>");
        String strM52169b = c18163d.m52169b("charset");
        if (strM52169b != null) {
            try {
                return Charset.forName(strM52169b);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static void m88537n(boolean z4, String str) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m88538o(Object obj) {
        m88539p(obj, "Argument must not be null");
    }

    /* JADX INFO: renamed from: p */
    public static void m88539p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final Object m88540q(AbstractC1848z0 abstractC1848z0, Function1 function1, InterfaceC30057d interfaceC30057d) {
        if ((!abstractC1848z0.inCompatibilityMode() || !abstractC1848z0.isOpenInternal$room_runtime() || !abstractC1848z0.inTransaction()) && interfaceC30057d.getContext().get(C1776d1.f7000w) != null) {
            return m88529f0(abstractC1848z0, function1, interfaceC30057d);
        }
        return function1.invoke(interfaceC30057d);
    }

    /* JADX INFO: renamed from: r */
    public static C32336j m88541r(C30144j1 table) {
        AbstractC22676k.m65750j(table, "table");
        if (table.f123266x.size() == 0) {
            return C32336j.f133837b;
        }
        List list = table.f123266x;
        AbstractC22676k.m65749i(list, "getRequirementList(...)");
        return new C32336j(list);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m88542s(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX INFO: renamed from: t */
    public static C18358g m88543t(byte[] bytes) {
        boolean z4;
        AbstractC22676k.m65750j(bytes, "bytes");
        if (bytes.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        if (bytes.length == 0) {
            return C18358g.f71479b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            byte[] bArr = new byte[2];
            byteArrayInputStream.read(bArr);
            byte b = (byte) (-21267);
            int i13 = 0;
            if (bArr[0] == ((byte) 16777132)) {
                z4 = true;
                if (bArr[1] != b) {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            byteArrayInputStream.reset();
            if (z4) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i14 = objectInputStream.readInt();
                    while (i13 < i14) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i13++;
                    }
                    objectInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(objectInputStream, th3);
                        throw th4;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s13 = dataInputStream.readShort();
                    if (s13 != -21521) {
                        throw new IllegalStateException(AbstractC2875y.m8295h(s13, "Magic number doesn't match: ").toString());
                    }
                    short s14 = dataInputStream.readShort();
                    if (s14 != 1) {
                        throw new IllegalStateException(AbstractC2875y.m8295h(s14, "Unsupported version number: ").toString());
                    }
                    int i15 = dataInputStream.readInt();
                    while (i13 < i15) {
                        linkedHashMap.put(dataInputStream.readUTF(), m88544u(dataInputStream, dataInputStream.readByte()));
                        i13++;
                    }
                    dataInputStream.close();
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        AbstractC35854l.m113829i(dataInputStream, th5);
                        throw th6;
                    }
                }
            }
        } catch (IOException e5) {
            C18389w.m52886d().m52890c(AbstractC18360h.f71486a, "Error in Data#fromByteArray: ", e5);
        } catch (ClassNotFoundException e13) {
            C18389w.m52886d().m52890c(AbstractC18360h.f71486a, "Error in Data#fromByteArray: ", e13);
        }
        return new C18358g(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX INFO: renamed from: u */
    public static final Serializable m88544u(DataInputStream dataInputStream, byte b) throws IOException {
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b == 7) {
            return dataInputStream.readUTF();
        }
        int i13 = 0;
        if (b == 8) {
            int i14 = dataInputStream.readInt();
            ?? r10 = new Boolean[i14];
            while (i13 < i14) {
                r10[i13] = Boolean.valueOf(dataInputStream.readBoolean());
                i13++;
            }
            return r10;
        }
        if (b == 9) {
            int i15 = dataInputStream.readInt();
            ?? r14 = new Byte[i15];
            while (i13 < i15) {
                r14[i13] = Byte.valueOf(dataInputStream.readByte());
                i13++;
            }
            return r14;
        }
        if (b == 10) {
            int i16 = dataInputStream.readInt();
            ?? r15 = new Integer[i16];
            while (i13 < i16) {
                r15[i13] = Integer.valueOf(dataInputStream.readInt());
                i13++;
            }
            return r15;
        }
        if (b == 11) {
            int i17 = dataInputStream.readInt();
            ?? r16 = new Long[i17];
            while (i13 < i17) {
                r16[i13] = Long.valueOf(dataInputStream.readLong());
                i13++;
            }
            return r16;
        }
        if (b == 12) {
            int i18 = dataInputStream.readInt();
            ?? r17 = new Float[i18];
            while (i13 < i18) {
                r17[i13] = Float.valueOf(dataInputStream.readFloat());
                i13++;
            }
            return r17;
        }
        if (b == 13) {
            int i19 = dataInputStream.readInt();
            ?? r18 = new Double[i19];
            while (i13 < i19) {
                r18[i13] = Double.valueOf(dataInputStream.readDouble());
                i13++;
            }
            return r18;
        }
        if (b != 14) {
            throw new IllegalStateException(AbstractC2875y.m8295h(b, "Unsupported type "));
        }
        int i24 = dataInputStream.readInt();
        ?? r19 = new String[i24];
        while (i13 < i24) {
            String utf = dataInputStream.readUTF();
            if (AbstractC22676k.m65745e(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r19[i13] = utf;
            i13++;
        }
        return r19;
    }

    /* JADX INFO: renamed from: v */
    public static final void m88545v(C2910h c2910h) {
        int i13 = C2905c.f11686w;
        if (c2910h.f11692b != 1 || c2910h.f11693c != 1) {
            throw new IllegalArgumentException(AbstractC11266d.m30460n("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", c2910h, " was passed").toString());
        }
    }

    /* JADX INFO: renamed from: w */
    public static final int m88546w(Bitmap bitmap) {
        int i13;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ALPHA_8) {
                i13 = 1;
            } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                i13 = 2;
            } else {
                i13 = config == Bitmap.Config.RGBA_F16 ? 8 : 4;
            }
            return height * i13;
        }
    }

    /* JADX INFO: renamed from: x */
    public static final float m88547x(Layout layout, int i13, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i13);
        C24982l c24982l = AbstractC24984n.f97780a;
        if (layout.getEllipsisCount(i13) <= 0 || layout.getParagraphDirection(i13) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i13) + layout.getLineStart(i13)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i13);
        if ((paragraphAlignment == null ? -1 : AbstractC27493c.f110734a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    /* JADX INFO: renamed from: y */
    public static final float m88548y(Layout layout, int i13, Paint paint) {
        float width;
        float width2;
        C24982l c24982l = AbstractC24984n.f97780a;
        if (layout.getEllipsisCount(i13) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i13) != -1 || layout.getWidth() >= layout.getLineRight(i13)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i13) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i13) + layout.getLineStart(i13)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i13);
        if ((paragraphAlignment != null ? AbstractC27493c.f110734a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i13);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i13);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    /* JADX INFO: renamed from: z */
    public static final InterfaceC25526h m88549z(C25525g c25525g) {
        AbstractC22676k.m65750j(c25525g, "<this>");
        return (InterfaceC25526h) AbstractC25522d.f99934a.f99933a;
    }
}
