package ad3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1772c1;
import bc3.C3060t1;
import bc3.C3072x1;
import bc3.InterfaceC3025k;
import bh.C3240c;
import bh.C3244g;
import bh.C3247j;
import cf.AbstractC4537l;
import ch.C4588i;
import coil.compose.AsyncImagePainter;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import hc3.C17178k;
import i93.C18284j;
import io.sentry.C20350h4;
import io.sentry.C20402k4;
import io.sentry.C20410l3;
import io.sentry.C20513q6;
import io.sentry.C20546t2;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20308d1;
import io.sentry.InterfaceC20411l4;
import io.sentry.InterfaceC20544t0;
import io.sentry.android.core.AbstractC20133o0;
import io.sentry.android.core.C20121k0;
import io.sentry.android.core.C20135p;
import io.sentry.featureflags.InterfaceC20334b;
import io.sentry.hints.C20363j;
import io.sentry.protocol.C20482i;
import io.sentry.protocol.C20484j;
import io.sentry.protocol.C20501v;
import io.sentry.util.C20579a;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kh.C22467a;
import kh.C22468b;
import kh.C22469c;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import l83.C23454a0;
import l83.C23465k;
import lc3.InterfaceC23833c;
import m83.AbstractC25247g0;
import m83.C25272z;
import mh.C25542j;
import mh.C25545m;
import mh.C25547o;
import mx1.C26009o;
import ne.C26593b;
import o73.C27648a;
import p005a3.C0237p;
import p031b9.C2817b;
import p034bl.C3364d;
import p037bu.C3632c;
import p077d0.InterfaceC11341d0;
import p077d0.InterfaceC11398s;
import p087db.C11856j0;
import p092dh.EnumC12020g;
import p093dl.C12152q;
import p097ds.AbstractC12313p;
import p098dt.AbstractC12350b;
import p173gj.C15903d;
import p180h0.C16465v;
import p195hh.C17280k;
import p195hh.InterfaceC17277h;
import p211i5.C18093f;
import p211i5.C18094g;
import p220ih.InterfaceC18480b;
import p249jc.AbstractC21598x;
import p268k0.AbstractC22086a;
import p329n0.C26061n;
import p329n0.C26068u;
import p341nh.C26707a;
import p341nh.C26714h;
import p341nh.EnumC26713g;
import p341nh.InterfaceC26715i;
import p366oe.C27865a;
import p389p0.C28523g;
import p389p0.C28535l0;
import p389p0.InterfaceC28531j0;
import p425qh.AbstractC30356b;
import p425qh.AbstractC30358d;
import p437qt.C30582e;
import p446r1.C30849c;
import p474s.InterfaceC32032z0;
import p522uf.C34865a;
import p522uf.C34894u;
import p522uf.InterfaceC34869c;
import p63.C28949a;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p73.InterfaceC28962c;
import pf.AbstractC29125c;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: ad3.z */
/* JADX INFO: loaded from: classes5.dex */
public class C0783z implements InterfaceC26715i, InterfaceC11398s, InterfaceC20544t0, InterfaceC20411l4, InterfaceC20334b, InterfaceC23833c, InterfaceC32032z0, InterfaceC34869c, InterfaceC28962c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f2817w;

    /* JADX INFO: renamed from: x */
    public Object f2818x;

    public /* synthetic */ C0783z(Object obj, int i13) {
        this.f2817w = i13;
        this.f2818x = obj;
    }

    /* JADX INFO: renamed from: o */
    public static C25547o m1855o(InterfaceC17277h interfaceC17277h, C25542j c25542j, C22467a c22467a, C22468b c22468b) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(c25542j.f100108a.getResources(), c22468b.f88018a);
        EnumC12020g enumC12020g = EnumC12020g.f39761w;
        Map map = c22468b.f88019b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z4 = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = AbstractC30358d.f124548a;
        if ((interfaceC17277h instanceof C17280k) && ((C17280k) interfaceC17277h).f66436g) {
            z4 = true;
        }
        return new C25547o(bitmapDrawable, c25542j, enumC12020g, c22467a, str, zBooleanValue, z4);
    }

    /* JADX INFO: renamed from: x */
    public static InterfaceC28531j0 m1856x(C0783z c0783z, int i13) {
        C26068u c26068u = (C26068u) c0783z.f2818x;
        AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
        Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
        AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
        try {
            C26061n c26061n = (C26061n) c26068u.f103223f.getValue();
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
            C28535l0 c28535l0 = c26068u.f103233p;
            long j7 = c26061n.f103176j;
            boolean z4 = c26068u.f103221d;
            C26009o c26009o = new C26009o(i13, c26061n);
            C2817b c2817b = c28535l0.f115449c;
            return c2817b != null ? c2817b.m8021y(i13, j7, c28535l0.f115448b, z4, c26009o) : C28523g.f115424a;
        } catch (Throwable th3) {
            C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
            throw th3;
        }
    }

    @Override // io.sentry.InterfaceC20544t0
    /* JADX INFO: renamed from: a */
    public C20501v mo1857a(C20484j c20484j) {
        return ((C20350h4) this.f2818x).mo56420E(c20484j);
    }

    @Override // io.sentry.InterfaceC20544t0
    /* JADX INFO: renamed from: b */
    public C20501v mo1858b(C20484j c20484j) {
        return ((C20350h4) this.f2818x).mo56420E(c20484j);
    }

    @Override // io.sentry.InterfaceC20544t0
    /* JADX INFO: renamed from: c */
    public C20501v mo1859c(C20484j c20484j) {
        return ((C20350h4) this.f2818x).mo56443w(c20484j);
    }

    @Override // io.sentry.featureflags.InterfaceC20334b
    /* JADX INFO: renamed from: clone */
    public InterfaceC20334b m134234clone() {
        return new C0783z(18);
    }

    /* JADX INFO: renamed from: d */
    public void mo1860d(int i13, C18093f c18093f, String str, Bundle bundle) {
    }

    /* JADX INFO: renamed from: e */
    public JsonObject m1861e() {
        return new JsonObject((LinkedHashMap) this.f2818x);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // p522uf.InterfaceC34869c
    /* JADX INFO: renamed from: f */
    public Object mo1862f(C34894u c34894u, C34865a c34865a) {
        C11856j0 c11856j0 = new C11856j0(8);
        c11856j0.m31829o((String) AbstractC21598x.m60654J(c34894u.m110033b(), AbstractC4537l.m14188c()));
        C27865a c27865aM31823g = c11856j0.m31823g();
        C0237p c0237p = ((C26593b) this.f2818x).f105781P;
        Object obj = c0237p.f813y.get(c27865aM31823g.m84112a());
        if (obj == null) {
            obj = (List) c0237p.f814z;
        }
        List list = (List) obj;
        List list2 = (List) c0237p.f812x;
        return list2 != null ? AbstractC12313p.m34264P(list2, list) : list;
    }

    /* JADX INFO: renamed from: g */
    public void m1863g(CancellationException cancellationException) {
        C30849c c30849c = (C30849c) this.f2818x;
        int i13 = c30849c.f127229y;
        InterfaceC3025k[] interfaceC3025kArr = new InterfaceC3025k[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            interfaceC3025kArr[i14] = ((C16465v) c30849c.f127227w[i14]).f63261b;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            interfaceC3025kArr[i15].cancel(cancellationException);
        }
        if (c30849c.f127229y == 0) {
            return;
        }
        AbstractC22086a.m63160c("uncancelled requests present");
    }

    @Override // p077d0.InterfaceC11398s
    public InterfaceC11341d0 get(int i13) {
        return (InterfaceC11341d0) this.f2818x;
    }

    /* JADX INFO: renamed from: h */
    public void m1864h(AbstractC20133o0 abstractC20133o0) {
        ((C20121k0) this.f2818x).getClass();
        if (Build.VERSION.SDK_INT <= 28) {
            String callingPackage = abstractC20133o0.getCallingPackage();
            String packageName = abstractC20133o0.getContext().getPackageName();
            if (callingPackage == null || !callingPackage.equals(packageName)) {
                throw new SecurityException("Provider does not allow for granting of Uri permissions");
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public C18093f mo1865i(int i13) {
        return null;
    }

    @Override // p341nh.InterfaceC26715i
    /* JADX INFO: renamed from: j */
    public Object mo1866j(C3244g c3244g) {
        return AbstractC13091v.m36575A(new C4588i(((AsyncImagePainter) this.f2818x).f20212F, 0), c3244g);
    }

    /* JADX INFO: renamed from: k */
    public C18093f mo1867k(int i13) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public Object m1868l(InterfaceC39443g descriptor, C30582e c30582e) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.f2818x).get(descriptor);
        Object obj = map != null ? map.get(c30582e) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0106 A[PHI: r8 r17
      0x0106: PHI (r8v13 int) = (r8v10 int), (r8v12 int), (r8v15 int) binds: [B:68:0x0103, B:63:0x00f7, B:57:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r17v1 kh.b) = (r17v0 kh.b), (r17v0 kh.b), (r17v2 kh.b) binds: [B:68:0x0103, B:63:0x00f7, B:57:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:73:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x010e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0119 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: m */
    public C22468b m1869m(C25542j c25542j, C22467a c22467a, C26714h c26714h, EnumC26713g enumC26713g) {
        C22468b c22468bMo16070p;
        C22468b c22468b;
        int i13;
        ?? r10;
        boolean zEquals;
        if (c25542j.f100124q.f100053w) {
            C22469c c22469c = (C22469c) ((C3247j) this.f2818x).f12728c.getValue();
            if (c22469c != null) {
                c22468bMo16070p = c22469c.f88020a.mo16070p(c22467a);
                if (c22468bMo16070p == null) {
                    c22468bMo16070p = c22469c.f88021b.m9038g(c22467a);
                }
            } else {
                c22468bMo16070p = null;
            }
            if (c22468bMo16070p != null) {
                Bitmap bitmap = c22468bMo16070p.f88018a;
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (config != Bitmap.Config.HARDWARE || c25542j.f100121n) {
                    Object obj = c22468bMo16070p.f88019b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    if (!AbstractC22676k.m65745e(c26714h, C26714h.f106216c)) {
                        String str = (String) c22467a.f88017x.get("coil#transformation_size");
                        if (str != null) {
                            zEquals = str.equals(c26714h.toString());
                        } else {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            AbstractC12350b abstractC12350b = c26714h.f106217a;
                            int i14 = abstractC12350b instanceof C26707a ? ((C26707a) abstractC12350b).f106205a : Integer.MAX_VALUE;
                            AbstractC12350b abstractC12350b2 = c26714h.f106218b;
                            int i15 = abstractC12350b2 instanceof C26707a ? ((C26707a) abstractC12350b2).f106205a : Integer.MAX_VALUE;
                            double dM5393k = AbstractC1772c1.m5393k(width, height, i14, i15, enumC26713g);
                            boolean zM92825a = AbstractC30356b.m92825a(c25542j);
                            if (zM92825a) {
                                double d3 = dM5393k > 1.0d ? 1.0d : dM5393k;
                                c22468b = null;
                                if (Math.abs(((double) i14) - (((double) width) * d3)) <= 1.0d || Math.abs(((double) i15) - (d3 * ((double) height))) <= 1.0d) {
                                    i13 = 1;
                                } else {
                                    i13 = 1;
                                    if ((dM5393k == 1.0d && !zM92825a) || (dM5393k > 1.0d && zBooleanValue)) {
                                    }
                                }
                            } else {
                                c22468b = null;
                                if (i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE) {
                                    i13 = 1;
                                } else {
                                    int iAbs = Math.abs(i14 - width);
                                    i13 = 1;
                                    if (iAbs > 1) {
                                        r10 = dM5393k == 1.0d ? 0 : 0;
                                    }
                                }
                                if (i15 != Integer.MIN_VALUE && i15 != Integer.MAX_VALUE && Math.abs(i15 - height) > i13) {
                                    if (dM5393k == 1.0d) {
                                    }
                                }
                            }
                            r10 = i13;
                        }
                    } else if (zBooleanValue) {
                        c22468b = null;
                    } else {
                        i13 = 1;
                        c22468b = null;
                        r10 = i13;
                    }
                    if (r10 != 0) {
                        return c22468bMo16070p;
                    }
                    return c22468b;
                }
                zEquals = false;
                c22468b = null;
                r10 = zEquals;
                if (r10 != 0) {
                    return c22468bMo16070p;
                }
                return c22468b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public C22467a m1870n(C25542j c25542j, Object obj, C25545m c25545m, C3240c c3240c) {
        String strMo53321a;
        Map map;
        C22467a c22467a = c25542j.f100112e;
        List list = c25542j.f100116i;
        if (c22467a != null) {
            return c22467a;
        }
        List list2 = ((C3247j) this.f2818x).f12733h.f12704c;
        int size = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                strMo53321a = null;
                break;
            }
            C23465k c23465k = (C23465k) list2.get(i13);
            InterfaceC18480b interfaceC18480b = (InterfaceC18480b) c23465k.f92937w;
            if (((Class) c23465k.f92938x).isAssignableFrom(obj.getClass())) {
                AbstractC22676k.m65748h(interfaceC18480b, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                strMo53321a = interfaceC18480b.mo53321a(obj, c25545m);
                if (strMo53321a != null) {
                    break;
                }
            }
            i13++;
        }
        if (strMo53321a == null) {
            return null;
        }
        Map map2 = c25542j.f100102A.f100151w;
        if (map2.isEmpty()) {
            map = C25272z.f99163w;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map2.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
            map = linkedHashMap;
        }
        if (list.isEmpty() && map.isEmpty()) {
            return new C22467a(strMo53321a);
        }
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(map);
        List list3 = list;
        if (!list3.isEmpty()) {
            if (list3.size() > 0) {
                list.get(0).getClass();
                throw new ClassCastException();
            }
            linkedHashMapM74003l0.put("coil#transformation_size", c25545m.f100138d.toString());
        }
        return new C22467a(strMo53321a, linkedHashMapM74003l0);
    }

    /* JADX INFO: renamed from: p */
    public void m1871p(View view, int i13, boolean z4) {
        C27648a.m83571V(view, (AutofillManager) this.f2818x, i13, z4);
    }

    /* JADX INFO: renamed from: q */
    public void m1872q() {
        C15903d c15903d = (C15903d) this.f2818x;
        c15903d.f60138k.debug("AndroidNetworkListener, onNetworkUnavailable.");
        c15903d.f60128a.f60167p = Boolean.TRUE;
    }

    @Override // io.sentry.featureflags.InterfaceC20334b
    /* JADX INFO: renamed from: r */
    public C20482i mo1873r() {
        ((C20579a) this.f2818x).m56711a().close();
        return null;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo1874s(int i13, int i14, Bundle bundle) {
        return false;
    }

    @Override // io.sentry.InterfaceC20411l4
    /* JADX INFO: renamed from: t */
    public C20402k4 mo1875t(InterfaceC20308d1 interfaceC20308d1, C20513q6 c20513q6) {
        AbstractC29125c.m88510S(interfaceC20308d1, "Scopes are required");
        AbstractC29125c.m88510S(c20513q6, "SentryOptions is required");
        String outboxPath = ((C20135p) this.f2818x).f75635x.getOutboxPath();
        if (outboxPath == null || !InterfaceC20411l4.m56625y(c20513q6.getLogger(), outboxPath)) {
            c20513q6.getLogger().mo16066m(EnumC20436n5.ERROR, "No outbox dir path is defined in options.", new Object[0]);
            return null;
        }
        return new C20402k4(c20513q6.getLogger(), outboxPath, new C20410l3(interfaceC20308d1, c20513q6.getEnvelopeReader(), c20513q6.getSerializer(), c20513q6.getLogger(), c20513q6.getFlushTimeoutMillis(), c20513q6.getMaxQueueSize()), new File(outboxPath));
    }

    @Override // p73.InterfaceC28962c
    public boolean test(Object obj) {
        return ((Class) this.f2818x).isInstance(obj);
    }

    /* JADX INFO: renamed from: u */
    public JsonElement m1876u(String str, JsonElement element) {
        AbstractC22676k.m65750j(element, "element");
        return (JsonElement) ((LinkedHashMap) this.f2818x).put(str, element);
    }

    /* JADX INFO: renamed from: v */
    public void m1877v(C20363j definition) {
        AbstractC22676k.m65750j(definition, "definition");
        C3072x1 c3072x1 = (C3072x1) ((C28949a) this.f2818x).m87910a(definition);
        if (c3072x1 != null) {
            for (C17178k c17178kM48528f = (C17178k) C17178k.f65987w.get(c3072x1); !AbstractC22676k.m65745e(c17178kM48528f, c3072x1); c17178kM48528f = c17178kM48528f.m48528f()) {
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m1878w() {
        C30849c c30849c = (C30849c) this.f2818x;
        C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, c30849c.f127229y);
        int i13 = c18284jM36278i0.f71133w;
        int i14 = c18284jM36278i0.f71134x;
        if (i13 <= i14) {
            while (true) {
                ((C16465v) c30849c.f127227w[i13]).f63261b.resumeWith(C23454a0.f92919a);
                if (i13 == i14) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        c30849c.m94890g();
    }

    public C0783z(AbstractC0757c format) {
        this.f2817w = 29;
        AbstractC22676k.m65750j(format, "format");
        this.f2818x = format;
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public Object m134039clone() {
        switch (this.f2817w) {
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C0783z(18);
            default:
                return super.clone();
        }
    }

    public C0783z(C26593b config) {
        this.f2817w = 24;
        AbstractC22676k.m65750j(config, "config");
        this.f2818x = config;
    }

    public C0783z(Context context) {
        this.f2817w = 2;
        this.f2818x = new C3364d(context, 0);
    }

    public C0783z(C3247j c3247j, C3632c c3632c) {
        this.f2817w = 20;
        this.f2818x = c3247j;
    }

    public C0783z(boolean z4) {
        this.f2817w = 10;
        this.f2818x = new AtomicBoolean(z4);
    }

    public C0783z(int i13) {
        this.f2817w = i13;
        switch (i13) {
            case 1:
                this.f2818x = new ConcurrentHashMap(16);
                break;
            case 6:
                break;
            case 8:
                this.f2818x = new C12152q(500L);
                break;
            case 11:
                this.f2818x = new C30849c(new C16465v[16]);
                break;
            case 12:
                this.f2818x = new C28949a();
                break;
            case 13:
                this.f2818x = new Region();
                break;
            case 14:
                this.f2818x = new C18094g(this);
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                this.f2818x = new C20121k0(C20546t2.f76998w);
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                this.f2818x = new C20579a();
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                this.f2818x = Handler.createAsync(Looper.getMainLooper());
                break;
            case 27:
                this.f2818x = new HashSet();
                break;
            default:
                this.f2818x = new LinkedHashMap();
                break;
        }
    }

    public C0783z(C3060t1 c3060t1, Function3 function3) {
        this.f2817w = 21;
        this.f2818x = function3;
    }
}
