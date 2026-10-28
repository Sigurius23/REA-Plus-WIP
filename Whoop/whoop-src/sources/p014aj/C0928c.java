package p014aj;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.C1769b2;
import androidx.room.C1791h0;
import bc3.C3033m;
import c93.InterfaceC4339a;
import cd3.C4449a;
import cd3.C4450b;
import cd3.C4455g;
import cd3.InterfaceC4456h;
import cg.C4552g;
import ch3.C4689j;
import cl.ExecutorServiceC4794b;
import com.amplitude.android.engagement.C4861a;
import cr.RunnableC11076n;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import gl.C15938c;
import hb3.C17109d;
import hb3.InterfaceC17111e;
import i63.AbstractC18157a;
import i63.C18185x;
import ib3.C18344c;
import io.sentry.android.core.C20067d;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.protocol.C20469b0;
import io.sentry.protocol.C20490n;
import io.sentry.protocol.C20500u;
import io.sentry.transport.C20568r;
import j93.AbstractC21478l0;
import j93.InterfaceC21461d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import l83.C23464j;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import ne.C26593b;
import nf.C26650d;
import no.nordicsemi.android.dfu.DfuBaseService;
import np.C27000e;
import np.C27004i;
import o63.AbstractC27624o;
import o63.InterfaceC27623n;
import p000.AbstractC11266d;
import p005a3.AbstractC0201g;
import p005a3.C0220k2;
import p005a3.C0230n0;
import p031b9.AbstractC2875y;
import p037bu.C3632c;
import p073cq.InterfaceC11034c;
import p073cq.InterfaceC11036e;
import p073cq.InterfaceC11037f;
import p077d0.AbstractC11359h2;
import p077d0.AbstractC11395r;
import p077d0.C11353g0;
import p077d0.InterfaceC11367j2;
import p077d0.InterfaceC11398s;
import p079d2.AbstractC11480b;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p117eh.C13184a;
import p117eh.C13185b;
import p117eh.C13186c;
import p117eh.C13188e;
import p117eh.C13190g;
import p222ij.C18587m;
import p222ij.C18589o;
import p222ij.C18590p;
import p249jc.C21586l;
import p249jc.C21590p;
import p302lf.InterfaceC23891a;
import p306ll.InterfaceC24498a;
import p326mf.AbstractC25492l;
import p392p3.AbstractC28788z;
import p392p3.C28779q;
import p392p3.C28786x;
import p420qc.C30200j;
import p437qt.C30578a;
import p441qx.C30706d0;
import p474s.C31983m2;
import p478s3.AbstractC32098d;
import p505ts.AbstractC34132o;
import p513u4.AbstractC34523k;
import p521ue.C34856b;
import p526ul.InterfaceC35055a;
import p551vf.C35937b;
import p551vf.InterfaceC35936a;
import p581we.AbstractC37178b0;
import p581we.AbstractC37197m;
import p581we.AbstractC37208x;
import p581we.C37187g;
import p581we.C37193j;
import p581we.C37201q;
import p581we.C37203s;
import p581we.C37204t;
import p581we.C37206v;
import p581we.EnumC37179c;
import p581we.EnumC37181d;
import p581we.EnumC37183e;
import p581we.InterfaceC37196l;
import p586wk.C37330h;
import p603x2.AbstractC37831a;
import p613xf.InterfaceC38257c;
import p613xf.InterfaceC38260f;
import p647yf.AbstractC39497j;
import p647yf.C39493f;
import p647yf.InterfaceC39502o;
import p684zk.C40787l;
import p684zk.C40791p;
import p684zk.InterfaceC40801z;
import p692zt.C41113q;
import p715kotlin.KotlinNullPointerException;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import pg3.C29219w;
import pg3.InterfaceC29182e;
import pg3.InterfaceC29189h;
import r83.EnumC31071a;
import r93.InterfaceC31124g0;
import r93.InterfaceC31133j0;
import retrofit2.HttpException;
import ro.C31624i;
import s83.AbstractC32269c;
import s93.AbstractC32309k;
import tg.C33775g;
import tl.AbstractC33913l;
import ug.EnumC34931t;
import uo1.C35141b;
import va3.C35845c;
import wc3.InterfaceC37138c;
import wd3.C37168b;
import xb3.AbstractC38176k;
import xb3.C38180o;
import xb3.C38184s;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: aj.c */
/* JADX INFO: loaded from: classes.dex */
public class C0928c implements InterfaceC4456h, InterfaceC38282i, InterfaceC11037f, InterfaceC11036e, InterfaceC11034c, InterfaceC11367j2, InterfaceC17111e, InterfaceC27623n, InterfaceC24498a, InterfaceC38260f, InterfaceC29189h, InterfaceC37196l, InterfaceC35055a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3420w;

    /* JADX INFO: renamed from: x */
    public final Object f3421x;

    public /* synthetic */ C0928c(Object obj, int i13) {
        this.f3420w = i13;
        this.f3421x = obj;
    }

    /* JADX INFO: renamed from: F */
    public static String m2289F(String str, EnumC0927b enumC0927b, boolean z4) {
        String strConcat = enumC0927b.f3419w;
        if (z4) {
            strConcat = ".temp".concat(strConcat);
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strConcat.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb4 = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb4.append(String.format("%02x", Byte.valueOf(b)));
                }
                strReplaceAll = sb4.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return AbstractC11895b.m31996o("lottie_cache_", strReplaceAll, strConcat);
    }

    /* JADX INFO: renamed from: J */
    public static C20500u m2290J(Throwable th3, C20490n c20490n, Long l7, List list, boolean z4) {
        Package r10 = th3.getClass().getPackage();
        String name = th3.getClass().getName();
        C20500u c20500u = new C20500u();
        String message = th3.getMessage();
        if (r10 != null) {
            name = name.replace(r10.getName() + ".", "");
        }
        String name2 = r10 != null ? r10.getName() : null;
        if (list != null && !list.isEmpty()) {
            C20469b0 c20469b0 = new C20469b0(list);
            if (z4) {
                c20469b0.f76616y = Boolean.TRUE;
            }
            c20500u.f76795E = c20469b0;
        }
        c20500u.f76801z = l7;
        c20500u.f76798w = name;
        c20500u.f76796F = c20490n;
        c20500u.f76800y = name2;
        c20500u.f76799x = message;
        return c20500u;
    }

    /* JADX INFO: renamed from: w */
    public static final void m2291w(C37187g c37187g, C35937b c35937b, String str, String str2, boolean z4, boolean z13) {
        if (!z4 || str2 == null) {
            return;
        }
        int iOrdinal = c37187g.m119168h().ordinal();
        if (iOrdinal == 0) {
            if (z13 || !c35937b.m114179d().m391o(str)) {
                c35937b.m114179d().m380N(str2, str);
                return;
            }
            return;
        }
        if (iOrdinal != 1) {
            throw new C23464j(AbstractC11266d.m30461o("An operation is not implemented: ", "Support for " + c37187g.m119168h() + " is not yet implemented"));
        }
        C4552g c4552g = c35937b.m114182g().f18351E;
        if (z13 || !c4552g.f18345y.containsKey(str)) {
            c4552g.f18345y.remove(str);
            C33775g c33775g = C33775g.f141364n;
            c4552g.f18343w.put((Object) c33775g.m106778c(str), (Object) c33775g.m106778c(str2));
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m2292y(C37187g c37187g, C35937b c35937b, String str, String str2, boolean z4, int i13) {
        if ((i13 & 16) != 0) {
            z4 = true;
        }
        m2291w(c37187g, c35937b, str, str2, z4, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: A */
    public void m2293A(C1769b2 c1769b2, AbstractC32269c abstractC32269c) {
        C1791h0 c1791h0;
        if (abstractC32269c instanceof C1791h0) {
            c1791h0 = (C1791h0) abstractC32269c;
            int i13 = c1791h0.f7076y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1791h0.f7076y = i13 - Integer.MIN_VALUE;
            } else {
                c1791h0 = new C1791h0(this, abstractC32269c);
            }
        } else {
            c1791h0 = new C1791h0(this, abstractC32269c);
        }
        Object obj = c1791h0.f7074w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c1791h0.f7076y;
        if (i14 != 0) {
            if (i14 == 1) {
                throw AbstractC2875y.m8309v(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        C13045h2 c13045h2 = (C13045h2) this.f3421x;
        c1791h0.f7076y = 1;
        c13045h2.collect(c1769b2, c1791h0);
    }

    /* JADX INFO: renamed from: B */
    public C13190g m2294B() {
        C13186c c13186cM37087i;
        C13184a c13184a = (C13184a) this.f3421x;
        C13188e c13188e = (C13188e) c13184a.f45699d;
        synchronized (c13188e) {
            c13184a.m37075a(true);
            c13186cM37087i = c13188e.m37087i(((C13185b) c13184a.f45697b).f45700a);
        }
        if (c13186cM37087i != null) {
            return new C13190g(c13186cM37087i);
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public synchronized void m2295C() {
        try {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f3421x).edit();
            int i13 = 0;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f3421x).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String strM2300I = m2300I(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(strM2300I)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(strM2300I);
                        i13++;
                        editorEdit.putStringSet(key, hashSet);
                    } else {
                        editorEdit.remove(key);
                    }
                }
            }
            if (i13 == 0) {
                editorEdit.remove("fire-count");
            } else {
                editorEdit.putLong("fire-count", i13);
            }
            editorEdit.commit();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: D */
    public void m2296D(Throwable th3, AtomicInteger atomicInteger, HashSet hashSet, ArrayDeque arrayDeque, String str) {
        Thread threadCurrentThread;
        C20490n c20490n;
        boolean zM56488d;
        int iIncrementAndGet = atomicInteger.get();
        String str2 = str;
        while (th3 != null && hashSet.add(th3)) {
            if (str2 == null) {
                str2 = "chained";
            }
            if (th3 instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) th3;
                C20490n c20490nM56485a = exceptionMechanismException.m56485a();
                Throwable thM56487c = exceptionMechanismException.m56487c();
                threadCurrentThread = exceptionMechanismException.m56486b();
                zM56488d = exceptionMechanismException.m56488d();
                th3 = thM56487c;
                c20490n = c20490nM56485a;
            } else {
                C20490n c20490n2 = new C20490n();
                threadCurrentThread = Thread.currentThread();
                c20490n = c20490n2;
                zM56488d = false;
            }
            C20500u c20500uM2290J = m2290J(th3, c20490n, threadCurrentThread != null ? Long.valueOf(threadCurrentThread.getId()) : null, ((C0929d) this.f3421x).m2354n(th3.getStackTrace(), Boolean.FALSE.equals(c20490n.f76743z)), zM56488d);
            ArrayDeque arrayDeque2 = arrayDeque;
            arrayDeque2.addFirst(c20500uM2290J);
            if (c20490n.f76740w == null) {
                c20490n.f76740w = str2;
            }
            if (atomicInteger.get() >= 0) {
                c20490n.f76737I = Integer.valueOf(iIncrementAndGet);
            }
            iIncrementAndGet = atomicInteger.incrementAndGet();
            c20490n.f76736H = Integer.valueOf(iIncrementAndGet);
            Throwable[] suppressed = th3.getSuppressed();
            if (suppressed != null && suppressed.length > 0) {
                int length = suppressed.length;
                int i13 = 0;
                while (i13 < length) {
                    m2296D(suppressed[i13], atomicInteger, hashSet, arrayDeque2, "suppressed");
                    i13++;
                    arrayDeque2 = arrayDeque;
                }
            }
            th3 = th3.getCause();
            str2 = null;
        }
    }

    @Override // o63.InterfaceC27623n
    /* JADX INFO: renamed from: E */
    public void mo2297E(String name, Iterable values) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(values, "values");
        C18185x c18185x = (C18185x) this.f3421x;
        String strM52156f = AbstractC18157a.m52156f(name, false);
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(values, 10));
        Iterator it = values.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC22676k.m65750j(str, "<this>");
            arrayList.add(AbstractC18157a.m52156f(str, true));
        }
        c18185x.mo2297E(strM52156f, arrayList);
    }

    /* JADX INFO: renamed from: G */
    public synchronized ArrayList m2298G() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f3421x).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(m2300I(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(C30578a.m93810a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                ((SharedPreferences) this.f3421x).edit().putLong("fire-global", jCurrentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th3) {
            throw th3;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    public File m2299H(String str) {
        File file = new File(m2305O(), m2289F(str, EnumC0927b.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m2305O(), m2289F(str, EnumC0927b.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(m2305O(), m2289F(str, EnumC0927b.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    /* JADX INFO: renamed from: I */
    public synchronized String m2300I(long j7) {
        return new Date(j7).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /* JADX INFO: renamed from: K */
    public synchronized String m2301K(String str) {
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f3421x).getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public void mo2302L() {
        View view = (View) this.f3421x;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m2303M(Set tableIds) {
        Object value;
        int[] iArr;
        AbstractC22676k.m65750j(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        C13045h2 c13045h2 = (C13045h2) this.f3421x;
        do {
            value = c13045h2.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i13 = 0; i13 < length; i13++) {
                iArr[i13] = tableIds.contains(Integer.valueOf(i13)) ? iArr2[i13] + 1 : iArr2[i13];
            }
        } while (!c13045h2.m36569i(value, iArr));
    }

    /* JADX INFO: renamed from: N */
    public Typeface m2304N(C28786x c28786x) {
        Context context = (Context) this.f3421x;
        if (!(c28786x instanceof C28786x)) {
            return null;
        }
        Typeface typefaceM109098b = AbstractC34523k.m109098b(context, c28786x.f116553a);
        AbstractC22676k.m65747g(typefaceM109098b);
        C28779q c28779q = c28786x.f116555c;
        ThreadLocal threadLocal = AbstractC28788z.f116556a;
        if (typefaceM109098b == null) {
            return null;
        }
        if (c28779q.f116537a.isEmpty()) {
            return typefaceM109098b;
        }
        ThreadLocal threadLocal2 = AbstractC28788z.f116556a;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typefaceM109098b);
        paint.setFontVariationSettings(AbstractC11480b.m30895u(c28779q, context));
        return paint.getTypeface();
    }

    /* JADX INFO: renamed from: O */
    public File m2305O() {
        File file = new File(((C21590p) this.f3421x).f82793w.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: renamed from: P */
    public List m2306P(String workSpecId) {
        AbstractC22676k.m65750j(workSpecId, "workSpecId");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f3421x;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (AbstractC22676k.m65745e(((C30200j) entry.getKey()).f123603a, workSpecId)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((C30200j) it.next());
        }
        return AbstractC25265s.m74093D1(linkedHashMap2.values());
    }

    /* JADX INFO: renamed from: Q */
    public C21586l m2307Q(C30200j id4) {
        AbstractC22676k.m65750j(id4, "id");
        return (C21586l) ((LinkedHashMap) this.f3421x).remove(id4);
    }

    /* JADX INFO: renamed from: R */
    public boolean m2308R(C0230n0 c0230n0) {
        if (!c0230n0.m605X()) {
            AbstractC37831a.m121374b("DepthSortedSet.remove called on an unattached node");
        }
        return ((C0220k2) this.f3421x).remove(c0230n0);
    }

    /* JADX INFO: renamed from: S */
    public synchronized void m2309S(String str) {
        try {
            String strM2301K = m2301K(str);
            if (strM2301K == null) {
                return;
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f3421x).getStringSet(strM2301K, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                ((SharedPreferences) this.f3421x).edit().remove(strM2301K).commit();
            } else {
                ((SharedPreferences) this.f3421x).edit().putStringSet(strM2301K, hashSet).commit();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[], java.io.Serializable] */
    /* JADX INFO: renamed from: T */
    public Serializable m2310T(InterfaceC39502o interfaceC39502o, AbstractC32269c abstractC32269c) {
        C37204t c37204t;
        InterfaceC23891a interfaceC23891a;
        if (abstractC32269c instanceof C37204t) {
            c37204t = (C37204t) abstractC32269c;
            int i13 = c37204t.f159055z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37204t.f159055z = i13 - Integer.MIN_VALUE;
            } else {
                c37204t = new C37204t(this, abstractC32269c);
            }
        } else {
            c37204t = new C37204t(this, abstractC32269c);
        }
        Object obj = c37204t.f159053x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c37204t.f159055z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC23891a interfaceC23891a2 = (InterfaceC23891a) ((InterfaceC4339a) this.f3421x).invoke();
            C39493f c39493f = new C39493f(interfaceC23891a2);
            c37204t.f159052w = interfaceC23891a2;
            c37204t.f159055z = 1;
            if (AbstractC39497j.m126158c(interfaceC39502o, c39493f, c37204t) == enumC31071a) {
                return enumC31071a;
            }
            interfaceC23891a = interfaceC23891a2;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC23891a = c37204t.f159052w;
            AbstractC34132o.m107864I(obj);
        }
        return interfaceC23891a.mo70173a();
    }

    /* JADX INFO: renamed from: U */
    public synchronized boolean m2311U(long j7) {
        if (!((SharedPreferences) this.f3421x).contains("fire-global")) {
            ((SharedPreferences) this.f3421x).edit().putLong("fire-global", j7).commit();
            return true;
        }
        long j13 = ((SharedPreferences) this.f3421x).getLong("fire-global", -1L);
        synchronized (this) {
            if (m2300I(j13).equals(m2300I(j7))) {
                return false;
            }
            ((SharedPreferences) this.f3421x).edit().putLong("fire-global", j7).commit();
            return true;
        }
    }

    /* JADX INFO: renamed from: V */
    public void mo2312V() {
        View viewFindViewById;
        View view = (View) this.f3421x;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new RunnableC11076n(viewFindViewById, 1));
    }

    /* JADX INFO: renamed from: W */
    public synchronized void m2313W(long j7, String str) {
        String strM2300I = m2300I(j7);
        if (((SharedPreferences) this.f3421x).getString("last-used-date", "").equals(strM2300I)) {
            String strM2301K = m2301K(strM2300I);
            if (strM2301K == null) {
                return;
            }
            if (strM2301K.equals(str)) {
                return;
            }
            m2315Y(str, strM2300I);
            return;
        }
        long j13 = ((SharedPreferences) this.f3421x).getLong("fire-count", 0L);
        if (j13 + 1 == 30) {
            m2334z();
            j13 = ((SharedPreferences) this.f3421x).getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(((SharedPreferences) this.f3421x).getStringSet(str, new HashSet()));
        hashSet.add(strM2300I);
        ((SharedPreferences) this.f3421x).edit().putStringSet(str, hashSet).putLong("fire-count", j13 + 1).putString("last-used-date", strM2300I).commit();
    }

    /* JADX INFO: renamed from: X */
    public C21586l m2314X(C30200j c30200j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f3421x;
        Object c21586l = linkedHashMap.get(c30200j);
        if (c21586l == null) {
            c21586l = new C21586l(c30200j);
            linkedHashMap.put(c30200j, c21586l);
        }
        return (C21586l) c21586l;
    }

    /* JADX INFO: renamed from: Y */
    public synchronized void m2315Y(String str, String str2) {
        m2309S(str2);
        HashSet hashSet = new HashSet(((SharedPreferences) this.f3421x).getStringSet(str, new HashSet()));
        hashSet.add(str2);
        ((SharedPreferences) this.f3421x).edit().putStringSet(str, hashSet).commit();
    }

    /* JADX INFO: renamed from: Z */
    public File m2316Z(String str, InputStream inputStream, EnumC0927b enumC0927b) throws IOException {
        File file = new File(m2305O(), m2289F(str, enumC0927b, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];
                while (true) {
                    int i13 = inputStream.read(bArr);
                    if (i13 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i13);
                }
            } catch (Throwable th3) {
                fileOutputStream.close();
                throw th3;
            }
        } catch (Throwable th4) {
            inputStream.close();
            throw th4;
        }
    }

    @Override // p077d0.InterfaceC11367j2, p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: a */
    public boolean mo2317a() {
        ((C41113q) this.f3421x).getClass();
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public C27000e m2318a0() {
        return (C27000e) ((C27004i) this.f3421x).m111061j();
    }

    @Override // o63.InterfaceC27623n
    /* JADX INFO: renamed from: b */
    public Set mo2319b() {
        return ((AbstractC27624o) AbstractC12350b.m34594o((C18185x) this.f3421x)).mo52165b();
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: c */
    public long mo2197c(AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return ((C41113q) this.f3421x).mo2197c(abstractC11395r, abstractC11395r2, abstractC11395r3);
    }

    @Override // p526ul.InterfaceC35055a
    public Object create() {
        C20067d c20067d = (C20067d) this.f3421x;
        return new C40791p((ExecutorServiceC4794b) c20067d.f75376a, (ExecutorServiceC4794b) c20067d.f75377b, (ExecutorServiceC4794b) c20067d.f75378c, (ExecutorServiceC4794b) c20067d.f75379d, (C40787l) c20067d.f75380e, (C40787l) c20067d.f75381f, (C31983m2) c20067d.f75382g);
    }

    @Override // p073cq.InterfaceC11034c
    /* JADX INFO: renamed from: d */
    public void mo2320d() {
        ((CountDownLatch) this.f3421x).countDown();
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: e */
    public void mo2321e(InterfaceC21461d interfaceC21461d, Function1 function1) {
        ((C4455g) this.f3421x).m13931E(interfaceC21461d, function1, true);
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: f */
    public AbstractC11395r mo2322f(AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return ((C41113q) this.f3421x).mo2322f(abstractC11395r, abstractC11395r2, abstractC11395r3);
    }

    @Override // pg3.InterfaceC29189h
    /* JADX INFO: renamed from: g */
    public void mo2323g(InterfaceC29182e interfaceC29182e, C29218v0 c29218v0) {
        C3033m c3033m = (C3033m) this.f3421x;
        if (!c29218v0.f118269a.f146788Q) {
            c3033m.resumeWith(AbstractC34132o.m107888l(new HttpException(c29218v0)));
            return;
        }
        Object obj = c29218v0.f118270b;
        if (obj != null) {
            c3033m.resumeWith(obj);
            return;
        }
        Object objM109908c = interfaceC29182e.mo88678m().m109908c(C29219w.class);
        AbstractC22676k.m65747g(objM109908c);
        C29219w c29219w = (C29219w) objM109908c;
        c3033m.resumeWith(AbstractC34132o.m107888l(new KotlinNullPointerException("Response from " + c29219w.f118272a.getName() + '.' + c29219w.f118274c.getName() + " was null but response body type was declared as non-null")));
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: h */
    public AbstractC11395r mo2202h(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return ((C41113q) this.f3421x).mo2202h(j7, abstractC11395r, abstractC11395r2, abstractC11395r3);
    }

    @Override // p613xf.InterfaceC38260f
    /* JADX INFO: renamed from: j */
    public InterfaceC38257c mo2324j(String schemeId) {
        AbstractC22676k.m65750j(schemeId, "schemeId");
        if (schemeId.equals("aws.auth#sigv4")) {
            return ((C26593b) this.f3421x).f105771F;
        }
        if (schemeId.equals("smithy.api#noAuth")) {
            return C26650d.f105939w;
        }
        throw new IllegalStateException(("auth scheme " + ((Object) C34856b.m109935a(schemeId)) + " not configured for client").toString());
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: k */
    public void mo2325k(InterfaceC21461d interfaceC21461d, InterfaceC37138c serializer) {
        AbstractC22676k.m65750j(serializer, "serializer");
        ((C4455g) this.f3421x).m13933G(interfaceC21461d, new C4449a(serializer), true);
    }

    @Override // p077d0.InterfaceC11355g2
    /* JADX INFO: renamed from: m */
    public AbstractC11395r mo2205m(long j7, AbstractC11395r abstractC11395r, AbstractC11395r abstractC11395r2, AbstractC11395r abstractC11395r3) {
        return ((C41113q) this.f3421x).mo2205m(j7, abstractC11395r, abstractC11395r2, abstractC11395r3);
    }

    @Override // p073cq.InterfaceC11036e
    /* JADX INFO: renamed from: n */
    public void mo1681n(Exception exc) {
        ((CountDownLatch) this.f3421x).countDown();
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: o */
    public void mo2326o(InterfaceC21461d kClass, Function1 function1) {
        AbstractC22676k.m65750j(kClass, "kClass");
        ((C4455g) this.f3421x).m13933G(kClass, new C4450b(function1), true);
    }

    @Override // p073cq.InterfaceC11037f
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f3421x).countDown();
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: p */
    public void mo2327p(InterfaceC21461d interfaceC21461d, Function1 function1) {
        ((C4455g) this.f3421x).m13930D(interfaceC21461d, function1, true);
    }

    /* JADX INFO: renamed from: q */
    public void m2328q(C0230n0 c0230n0) {
        if (!c0230n0.m605X()) {
            AbstractC37831a.m121374b("DepthSortedSet.add called on an unattached node");
        }
        ((C0220k2) this.f3421x).add(c0230n0);
    }

    @Override // pg3.InterfaceC29189h
    /* JADX INFO: renamed from: r */
    public void mo2329r(InterfaceC29182e interfaceC29182e, Throwable th3) {
        ((C3033m) this.f3421x).resumeWith(AbstractC34132o.m107888l(th3));
    }

    @Override // xg3.InterfaceC38282i
    public void request(long j7) {
        C4689j c4689j = (C4689j) this.f3421x;
        if (j7 > 0) {
            c4689j.f19204G.request(j7);
            return;
        }
        c4689j.getClass();
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "n >= 0 required but it was "));
        }
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: s */
    public void mo2330s(InterfaceC21461d interfaceC21461d, InterfaceC21461d interfaceC21461d2, InterfaceC37138c interfaceC37138c) {
        ((C4455g) this.f3421x).m13932F(interfaceC21461d, interfaceC21461d2, interfaceC37138c, true);
    }

    @Override // p306ll.InterfaceC24498a
    /* JADX INFO: renamed from: t */
    public InterfaceC40801z mo714t(InterfaceC40801z interfaceC40801z, C37330h c37330h) {
        return C15938c.m44995d((Resources) this.f3421x, interfaceC40801z);
    }

    public String toString() {
        switch (this.f3420w) {
            case 1:
                return ((C0220k2) this.f3421x).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r8 == r1) goto L38;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2331u(p326mf.AbstractC25492l r7, s83.AbstractC32269c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof p581we.C37202r
            if (r0 == 0) goto L13
            r0 = r8
            we.r r0 = (p581we.C37202r) r0
            int r1 = r0.f159046y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159046y = r1
            goto L18
        L13:
            we.r r0 = new we.r
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f159044w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f159046y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            p505ts.AbstractC34132o.m107864I(r8)
            goto L74
        L36:
            p505ts.AbstractC34132o.m107864I(r8)
            boolean r8 = r7.mo74902c()
            if (r8 != 0) goto La1
            boolean r8 = r7 instanceof p326mf.C25490j
            if (r8 == 0) goto L4a
            we.w r7 = p581we.C37207w.f159057b
            java.lang.String r7 = r7.m119244a()
            return r7
        L4a:
            boolean r8 = r7 instanceof p367of.C27892a
            if (r8 == 0) goto L61
            of.a r7 = (p367of.C27892a) r7
            byte[] r7 = r7.m84163d()
            java.lang.Object r8 = r6.f3421x
            c93.a r8 = (c93.InterfaceC4339a) r8
            byte[] r7 = se.AbstractC32417h.m101180K(r7, r8)
            java.lang.String r7 = tg.AbstractC33774f.m106780a(r7)
            return r7
        L61:
            boolean r8 = r7 instanceof p326mf.C25494n
            if (r8 == 0) goto L7b
            mf.n r7 = (p326mf.C25494n) r7
            yf.o r7 = r7.m74905d()
            r0.f159046y = r4
            java.io.Serializable r8 = r6.m2310T(r7, r0)
            if (r8 != r1) goto L74
            goto L99
        L74:
            byte[] r8 = (byte[]) r8
            java.lang.String r7 = tg.AbstractC33774f.m106780a(r8)
            return r7
        L7b:
            boolean r8 = r7 instanceof p326mf.AbstractC25491k
            if (r8 == 0) goto L9b
            mf.k r7 = (p326mf.AbstractC25491k) r7
            yf.u r7 = r7.mo74903d()
            kc3.d r8 = p679zf.AbstractC40608i.m131682a()
            o23.p r2 = new o23.p
            r4 = 13
            r5 = 0
            r2.<init>(r6, r7, r5, r4)
            r0.f159046y = r3
            java.lang.Object r7 = bc3.AbstractC3006f0.m8705K(r8, r2, r0)
            if (r7 != r1) goto L9a
        L99:
            return r1
        L9a:
            return r7
        L9b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        La1:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Stream must be replayable to calculate a body hash"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p014aj.C0928c.m2331u(mf.l, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x017c A[LOOP:0: B:38:0x0176->B:40:0x017c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public Object m2332v(InterfaceC35936a interfaceC35936a, C37187g c37187g, AbstractC32269c abstractC32269c) throws Throwable {
        C37203s c37203s;
        String strM119244a;
        C37187g c37187g2;
        boolean z4;
        boolean z13;
        boolean z14;
        StringBuilder sb4;
        C38184s c38184sM122272A;
        Iterator it;
        if (abstractC32269c instanceof C37203s) {
            c37203s = (C37203s) abstractC32269c;
            int i13 = c37203s.f159047E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c37203s.f159047E = i13 - Integer.MIN_VALUE;
            } else {
                c37203s = new C37203s(this, abstractC32269c);
            }
        } else {
            c37203s = new C37203s(this, abstractC32269c);
        }
        Object objM2331u = c37203s.f159050y;
        Object obj = EnumC31071a.f128113w;
        int i14 = c37203s.f159047E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM2331u);
            AbstractC37178b0 abstractC37178b0M119164d = c37187g.m119164d();
            if (abstractC37178b0M119164d instanceof C37206v) {
                AbstractC25492l body = interfaceC35936a.getBody();
                c37203s.f159048w = interfaceC35936a;
                c37203s.f159049x = c37187g;
                c37203s.f159047E = 1;
                objM2331u = m2331u(body, c37203s);
                if (objM2331u == obj) {
                    return obj;
                }
            } else {
                if (!(abstractC37178b0M119164d instanceof AbstractC37208x)) {
                    throw new NoWhenBranchMatchedException();
                }
                strM119244a = ((AbstractC37208x) abstractC37178b0M119164d).m119244a();
            }
            c37187g2 = c37187g;
            if (c37187g2.m119168h() == EnumC37179c.f158975x) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4 && c37187g2.m119169i() == EnumC37181d.f158980x) {
                z13 = true;
            } else {
                z13 = false;
            }
            String strM114100b = c37187g2.m119163c().m114100b();
            C35937b c35937bM100579i = AbstractC32309k.m100579i(interfaceC35936a);
            m2291w(c37187g2, c35937bM100579i, "Host", c35937bM100579i.m114182g().m14241d(), !z4, false);
            boolean z15 = z4;
            m2292y(c37187g2, c35937bM100579i, "X-Amz-Algorithm", c37187g2.m119162b().f158986w, z15, 32);
            m2292y(c37187g2, c35937bM100579i, "X-Amz-Credential", AbstractC32098d.m99839e(c37187g2), z15, 32);
            m2292y(c37187g2, c35937bM100579i, "X-Amz-Content-Sha256", strM119244a, z13, 32);
            m2292y(c37187g2, c35937bM100579i, "X-Amz-Date", c37187g2.m119170j().m110113b(EnumC34931t.f147049x), false, 48);
            m2292y(c37187g2, c35937bM100579i, "X-Amz-Expires", null, z15, 32);
            m2292y(c37187g2, c35937bM100579i, "X-Amz-Security-Token", strM114100b, !c37187g2.m119166f(), 32);
            String strM119167g = c37187g2.m119167g();
            if (c37187g2.m119162b() == EnumC37183e.SIGV4_ASYMMETRIC) {
                z14 = true;
            } else {
                z14 = false;
            }
            m2292y(c37187g2, c35937bM100579i, "X-Amz-Region-Set", strM119167g, z14, 32);
            C38180o c38180oM122274C = AbstractC38176k.m122274C(AbstractC38176k.m122272A(AbstractC38176k.m122282r(AbstractC25265s.m74145r0(c35937bM100579i.m114179d().m393r()), new C35141b(c37187g2, 18)), new C37168b(6)), new C30706d0(8));
            String strM122289y = AbstractC38176k.m122289y(c38180oM122274C, ";", null, new C37168b(7), 30);
            m2292y(c37187g2, c35937bM100579i, "X-Amz-SignedHeaders", strM122289y, z15, 32);
            sb4 = new StringBuilder();
            sb4.append(c35937bM100579i.m114180e().name());
            sb4.append('\n');
            sb4.append(AbstractC37197m.m119192a(c35937bM100579i.m114182g(), c37187g2));
            sb4.append('\n');
            sb4.append(AbstractC37197m.m119193b(c35937bM100579i.m114182g()));
            sb4.append('\n');
            c38184sM122272A = AbstractC38176k.m122272A(c38180oM122274C, new C37168b(8));
            it = c38184sM122272A.f163498a.iterator();
            while (it.hasNext()) {
                sb4.append((String) c38184sM122272A.f163499b.invoke(it.next()));
                sb4.append('\n');
            }
            sb4.append('\n');
            sb4.append(strM122289y);
            sb4.append('\n');
            sb4.append(strM119244a);
            String string = sb4.toString();
            m2292y(c37187g2, c35937bM100579i, "X-Amz-Security-Token", strM114100b, c37187g2.m119166f(), 32);
            return new C37193j(c35937bM100579i, string, strM122289y, strM119244a);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c37187g = c37203s.f159049x;
        interfaceC35936a = c37203s.f159048w;
        AbstractC34132o.m107864I(objM2331u);
        strM119244a = (String) objM2331u;
        c37187g2 = c37187g;
        if (c37187g2.m119168h() == EnumC37179c.f158975x) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            z13 = false;
        } else {
            z13 = false;
        }
        String strM114100b2 = c37187g2.m119163c().m114100b();
        C35937b c35937bM100579i2 = AbstractC32309k.m100579i(interfaceC35936a);
        m2291w(c37187g2, c35937bM100579i2, "Host", c35937bM100579i2.m114182g().m14241d(), !z4, false);
        boolean z16 = z4;
        m2292y(c37187g2, c35937bM100579i2, "X-Amz-Algorithm", c37187g2.m119162b().f158986w, z16, 32);
        m2292y(c37187g2, c35937bM100579i2, "X-Amz-Credential", AbstractC32098d.m99839e(c37187g2), z16, 32);
        m2292y(c37187g2, c35937bM100579i2, "X-Amz-Content-Sha256", strM119244a, z13, 32);
        m2292y(c37187g2, c35937bM100579i2, "X-Amz-Date", c37187g2.m119170j().m110113b(EnumC34931t.f147049x), false, 48);
        m2292y(c37187g2, c35937bM100579i2, "X-Amz-Expires", null, z16, 32);
        m2292y(c37187g2, c35937bM100579i2, "X-Amz-Security-Token", strM114100b2, !c37187g2.m119166f(), 32);
        String strM119167g2 = c37187g2.m119167g();
        if (c37187g2.m119162b() == EnumC37183e.SIGV4_ASYMMETRIC) {
            z14 = true;
        } else {
            z14 = false;
        }
        m2292y(c37187g2, c35937bM100579i2, "X-Amz-Region-Set", strM119167g2, z14, 32);
        C38180o c38180oM122274C2 = AbstractC38176k.m122274C(AbstractC38176k.m122272A(AbstractC38176k.m122282r(AbstractC25265s.m74145r0(c35937bM100579i2.m114179d().m393r()), new C35141b(c37187g2, 18)), new C37168b(6)), new C30706d0(8));
        String strM122289y2 = AbstractC38176k.m122289y(c38180oM122274C2, ";", null, new C37168b(7), 30);
        m2292y(c37187g2, c35937bM100579i2, "X-Amz-SignedHeaders", strM122289y2, z16, 32);
        sb4 = new StringBuilder();
        sb4.append(c35937bM100579i2.m114180e().name());
        sb4.append('\n');
        sb4.append(AbstractC37197m.m119192a(c35937bM100579i2.m114182g(), c37187g2));
        sb4.append('\n');
        sb4.append(AbstractC37197m.m119193b(c35937bM100579i2.m114182g()));
        sb4.append('\n');
        c38184sM122272A = AbstractC38176k.m122272A(c38180oM122274C2, new C37168b(8));
        it = c38184sM122272A.f163498a.iterator();
        while (it.hasNext()) {
            sb4.append((String) c38184sM122272A.f163499b.invoke(it.next()));
            sb4.append('\n');
        }
        sb4.append('\n');
        sb4.append(strM122289y2);
        sb4.append('\n');
        sb4.append(strM119244a);
        String string2 = sb4.toString();
        m2292y(c37187g2, c35937bM100579i2, "X-Amz-Security-Token", strM114100b2, c37187g2.m119166f(), 32);
        return new C37193j(c35937bM100579i2, string2, strM122289y2, strM119244a);
    }

    @Override // hb3.InterfaceC17111e
    /* JADX INFO: renamed from: x */
    public C17109d mo2333x(C35845c classId) {
        C17109d c17109dMo2333x;
        AbstractC22676k.m65750j(classId, "classId");
        for (InterfaceC31124g0 interfaceC31124g0 : AbstractC21478l0.m60412R((InterfaceC31133j0) this.f3421x, classId.f152609a)) {
            if ((interfaceC31124g0 instanceof C18344c) && (c17109dMo2333x = ((C18344c) interfaceC31124g0).f71440J.mo2333x(classId)) != null) {
                return c17109dMo2333x;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public synchronized void m2334z() {
        try {
            long j7 = ((SharedPreferences) this.f3421x).getLong("fire-count", 0L);
            String key = "";
            String str = null;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f3421x).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str2 : (Set) entry.getValue()) {
                        if (str == null || str.compareTo(str2) > 0) {
                            key = entry.getKey();
                            str = str2;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f3421x).getStringSet(key, new HashSet()));
            hashSet.remove(str);
            ((SharedPreferences) this.f3421x).edit().putStringSet(key, hashSet).putLong("fire-count", j7 - 1).commit();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public C0928c(C18587m c18587m, C4861a c4861a) {
        this.f3420w = 14;
        this.f3421x = c4861a;
        C41113q c41113q = new C41113q(c18587m);
        c41113q.f177224x = "localStorage";
        c41113q.m133449A(new C18590p("getItem", new C18589o(this, 0)));
        c41113q.m133449A(new C18590p("setItem", new C18589o(this, 1)));
        c41113q.m133449A(new C18590p("removeItem", new C18589o(this, 2)));
        c41113q.m133449A(new C18590p("key", new C18589o(this, 3)));
        c41113q.m133449A(new C18590p("clear", new C18589o(this, 4)));
    }

    public C0928c(C26593b config) {
        this.f3420w = 22;
        AbstractC22676k.m65750j(config, "config");
        this.f3421x = config;
    }

    public C0928c(Context context) {
        this.f3420w = 23;
        this.f3421x = context.getApplicationContext();
    }

    public C0928c(int i13, byte b) {
        this.f3420w = i13;
        switch (i13) {
            case 7:
                this.f3421x = new CountDownLatch(1);
                break;
            case 9:
                this.f3421x = new HashMap();
                break;
            case 16:
                Looper mainLooper = Looper.getMainLooper();
                AbstractC22676k.m65749i(mainLooper, "getMainLooper(...)");
                this.f3421x = new Handler(mainLooper);
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                this.f3421x = new C20568r();
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                this.f3421x = new LinkedHashMap();
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                char[] cArr = AbstractC33913l.f142093a;
                this.f3421x = new ArrayDeque(0);
                break;
            case 27:
                this.f3421x = C37201q.f159043w;
                break;
            default:
                this.f3421x = new C0220k2(AbstractC0201g.f652b);
                break;
        }
    }

    public C0928c(Context context, String str) {
        this.f3420w = 25;
        this.f3421x = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public C0928c(int i13) {
        this.f3420w = 2;
        this.f3421x = AbstractC13091v.m36593c(new int[i13]);
    }

    public C0928c(float f13, float f14, AbstractC11395r abstractC11395r) {
        InterfaceC11398s c31624i;
        this.f3420w = 8;
        int[] iArr = AbstractC11359h2.f36411a;
        if (abstractC11395r != null) {
            c31624i = new C31624i(f13, f14, abstractC11395r);
        } else {
            C3632c c3632c = new C3632c();
            c3632c.f14788w = new C11353g0(f13, f14, 0.01f);
            c31624i = c3632c;
        }
        this.f3421x = new C41113q(c31624i);
    }
}
