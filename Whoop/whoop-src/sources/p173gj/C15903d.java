package p173gj;

import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.C3022j0;
import bc3.C3063u1;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import cd3.C4455g;
import ck.C4771a;
import ck.C4773c;
import ck.C4775e;
import ck.C4776f;
import com.google.crypto.tink.internal.C5101l0;
import com.iterable.iterableapi.C5317e;
import fk.InterfaceC14544a;
import hk.C17365a;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25247g0;
import mk.C25626a;
import mk.C25627b;
import p005a3.C0237p;
import p007a6.C0410c;
import p223ik.InterfaceC18598b;
import p255jk.C21743a;
import p255jk.C21744b;
import p282kk.InterfaceC22536e;
import p343nk.C26780a;
import p389p0.C28539n0;
import p428qk.C30438a;
import p428qk.C30439b;
import p428qk.C30440c;
import p505ts.AbstractC34132o;
import p581we.C37199o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import so.C32798o;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: gj.d */
/* JADX INFO: loaded from: classes.dex */
public final class C15903d {

    /* JADX INFO: renamed from: a */
    public final C15906g f60128a;

    /* JADX INFO: renamed from: b */
    public final C0237p f60129b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2994c0 f60130c;

    /* JADX INFO: renamed from: d */
    public final AbstractC3076z f60131d;

    /* JADX INFO: renamed from: e */
    public final AbstractC3076z f60132e;

    /* JADX INFO: renamed from: f */
    public final AbstractC3076z f60133f;

    /* JADX INFO: renamed from: g */
    public final C15912m f60134g;

    /* JADX INFO: renamed from: h */
    public InterfaceC18598b f60135h;

    /* JADX INFO: renamed from: i */
    public InterfaceC18598b f60136i;

    /* JADX INFO: renamed from: j */
    public C28539n0 f60137j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC14544a f60138k;

    /* JADX INFO: renamed from: l */
    public C30440c f60139l;

    /* JADX INFO: renamed from: m */
    public final C3022j0 f60140m;

    /* JADX INFO: renamed from: n */
    public final C37199o f60141n;

    /* JADX INFO: renamed from: o */
    public C15901b f60142o;

    /* JADX INFO: renamed from: p */
    public C5317e f60143p;

    public C15903d(C15906g c15906g, C0237p c0237p, InterfaceC2994c0 interfaceC2994c0, AbstractC3076z abstractC3076z, AbstractC3076z abstractC3076z2, AbstractC3076z abstractC3076z3) {
        this.f60128a = c15906g;
        this.f60129b = c0237p;
        this.f60130c = interfaceC2994c0;
        this.f60131d = abstractC3076z;
        this.f60132e = abstractC3076z2;
        this.f60133f = abstractC3076z3;
        C37199o c37199o = new C37199o();
        Set setSynchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        AbstractC22676k.m65749i(setSynchronizedSet, "synchronizedSet(mutableSetOf())");
        c37199o.f159041x = setSynchronizedSet;
        this.f60141n = c37199o;
        if (AbstractC39414r.m125890i0(c15906g.f60152a) || c15906g.f60154c <= 0 || c15906g.f60155d <= 0) {
            throw new IllegalArgumentException("invalid configuration");
        }
        C15912m c15912m = new C15912m();
        c15912m.f159041x = this;
        this.f60134g = c15912m;
        this.f60138k = c15906g.f60158g.m11156E(this);
        this.f60143p = new C5317e(1);
        InterfaceC2994c0 interfaceC2994c1 = this.f60130c;
        AbstractC3076z abstractC3076z4 = this.f60131d;
        EnumC2998d0 enumC2998d0 = EnumC2998d0.f12005x;
        InterfaceC4351m c0410c = new C0410c(this, this, null, 18);
        C3063u1 c3063u1 = new C3063u1(AbstractC3006f0.m8695A(interfaceC2994c1, abstractC3076z4), c0410c);
        c3063u1.m8676b0(enumC2998d0, c3063u1, c0410c);
        this.f60140m = c3063u1;
        c3063u1.start();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static Object m44878b(C15903d c15903d, C30439b identityConfiguration, AbstractC32269c abstractC32269c) {
        C15900a c15900a;
        C30440c c30440c;
        if (abstractC32269c instanceof C15900a) {
            c15900a = (C15900a) abstractC32269c;
            int i13 = c15900a.f60120E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15900a.f60120E = i13 - Integer.MIN_VALUE;
            } else {
                c15900a = new C15900a(c15903d, abstractC32269c);
            }
        } else {
            c15900a = new C15900a(c15903d, abstractC32269c);
        }
        Object obj = c15900a.f60123y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15900a.f60120E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C32798o c32798o = new C32798o(c15903d);
            c15900a.f60121w = c15903d;
            c15900a.f60122x = identityConfiguration;
            c15900a.f60120E = 1;
            Object obj2 = C23454a0.f92919a;
            if (c32798o.f136499a < 3) {
                ((InterfaceC14544a) c32798o.f136502d).debug("Migrating storage to version 3");
                Object objM102856a = c32798o.m102856a(c15900a);
                if (objM102856a == enumC31071a) {
                    obj2 = objM102856a;
                }
            } else {
                c15903d.f60138k.debug("Storage already at version 3");
            }
            if (obj2 == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            identityConfiguration = c15900a.f60122x;
            c15903d = c15900a.f60121w;
            AbstractC34132o.m107864I(obj);
        }
        c15903d.getClass();
        AbstractC22676k.m65750j(identityConfiguration, "identityConfiguration");
        synchronized (C30440c.f125068b) {
            try {
                LinkedHashMap linkedHashMap = C30440c.f125069c;
                String str = identityConfiguration.f125062a;
                Object c30440c2 = linkedHashMap.get(str);
                if (c30440c2 == null) {
                    c30440c2 = new C30440c(identityConfiguration);
                    linkedHashMap.put(str, c30440c2);
                }
                c30440c = (C30440c) c30440c2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        c15903d.f60139l = c30440c;
        C0237p c0237p = c15903d.f60129b;
        C26780a c26780a = new C26780a(c0237p);
        C4455g c4455g = c15903d.m44882c().f125070a;
        c4455g.getClass();
        synchronized (c4455g.f17959E) {
            ((LinkedHashSet) c4455g.f17960F).add(c26780a);
        }
        if (c15903d.m44882c().f125070a.f17961w) {
            C30438a identity = c15903d.m44882c().f125070a.m13958y();
            AbstractC22676k.m65750j(identity, "identity");
            AbstractC18489d0.m53382w(1, "updateType");
            c0237p.m692W(identity.f125060a);
            c0237p.m687R(identity.f125061b);
        }
        InterfaceC30057d interfaceC30057d = null;
        if (!AbstractC22676k.m65745e(c15903d.f60128a.f60167p, null)) {
            c15903d.m44881a(new C4776f());
        }
        C15901b c15901b = new C15901b(c15903d);
        c15903d.f60142o = c15901b;
        c15903d.m44881a(c15901b);
        c15903d.m44881a(new C25627b());
        C5317e c5317e = c15903d.f60143p;
        if (c5317e == null) {
            AbstractC22676k.m65757q("activityLifecycleCallbacks");
            throw null;
        }
        c15903d.m44881a(new C4775e(c5317e));
        c15903d.m44881a(new C4771a());
        c15903d.m44881a(new C4773c(0));
        c15903d.m44881a(new C25626a());
        C15912m c15912m = c15903d.f60134g;
        AbstractC22676k.m65748h(c15912m, "null cannot be cast to non-null type com.amplitude.android.Timeline");
        AbstractC3006f0.m8732z(c15912m.m119204G().f60130c, c15912m.m119204G().f60133f, null, new C0410c(c15912m, interfaceC30057d, 17), 2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static void m44879g(C15903d c15903d, Map map) {
        LinkedHashMap linkedHashMapM74003l0;
        c15903d.getClass();
        C5101l0 c5101l0 = new C5101l0(22);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    String property = (String) entry.getKey();
                    AbstractC22676k.m65750j(property, "property");
                    synchronized (c5101l0) {
                        if (property.length() == 0) {
                            C17365a.f67285a.warn("Attempting to perform operation $set with a null or empty string property, ignoring");
                        } else if (((LinkedHashMap) c5101l0.f21444y).containsKey("$clearAll")) {
                            C17365a.f67285a.warn("This Identify already contains a $clearAll operation, ignoring operation %s");
                        } else if (((LinkedHashSet) c5101l0.f21443x).contains(property)) {
                            C17365a.f67285a.warn("Already used property " + property + " in previous operation, ignoring operation $set");
                        } else {
                            if (!((LinkedHashMap) c5101l0.f21444y).containsKey("$set")) {
                                ((LinkedHashMap) c5101l0.f21444y).put("$set", new LinkedHashMap());
                            }
                            Object obj = ((LinkedHashMap) c5101l0.f21444y).get("$set");
                            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
                            AbstractC22681m0.m65772c(obj).put(property, value);
                            ((LinkedHashSet) c5101l0.f21443x).add(property);
                        }
                    }
                }
            }
        }
        C21744b c21744b = new C21744b();
        synchronized (c5101l0) {
            linkedHashMapM74003l0 = AbstractC25247g0.m74003l0((LinkedHashMap) c5101l0.f21444y);
            for (Map.Entry entry2 : linkedHashMapM74003l0.entrySet()) {
                String str = (String) entry2.getKey();
                Object value2 = entry2.getValue();
                if (value2 instanceof Map) {
                    linkedHashMapM74003l0.put(str, AbstractC25247g0.m74003l0((Map) value2));
                }
            }
        }
        c21744b.f83626O = linkedHashMapM74003l0;
        c15903d.m44886h(c21744b);
    }

    /* JADX INFO: renamed from: j */
    public static void m44880j(C15903d c15903d, String eventType, Map map, int i13) {
        if ((i13 & 2) != 0) {
            map = null;
        }
        c15903d.getClass();
        AbstractC22676k.m65750j(eventType, "eventType");
        C21743a c21743a = new C21743a();
        c21743a.f83624M = eventType;
        c21743a.f83625N = map != null ? AbstractC25247g0.m74003l0(map) : null;
        c15903d.m44886h(c21743a);
    }

    /* JADX INFO: renamed from: a */
    public final void m44881a(InterfaceC22536e interfaceC22536e) {
        if (!(interfaceC22536e instanceof C4771a)) {
            this.f60134g.m119224f(interfaceC22536e);
            return;
        }
        C0237p c0237p = this.f60129b;
        C4771a c4771a = (C4771a) interfaceC22536e;
        synchronized (((ArrayList) c0237p.f814z)) {
            c4771a.mo15043b(this);
            ((ArrayList) c0237p.f814z).add(c4771a);
        }
    }

    /* JADX INFO: renamed from: c */
    public final C30440c m44882c() {
        C30440c c30440c = this.f60139l;
        if (c30440c != null) {
            return c30440c;
        }
        AbstractC22676k.m65757q("idContainer");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC18598b m44883d() {
        InterfaceC18598b interfaceC18598b = this.f60136i;
        if (interfaceC18598b != null) {
            return interfaceC18598b;
        }
        AbstractC22676k.m65757q("identifyInterceptStorage");
        throw null;
    }

    /* JADX INFO: renamed from: e */
    public final C28539n0 m44884e() {
        C28539n0 c28539n0 = this.f60137j;
        if (c28539n0 != null) {
            return c28539n0;
        }
        AbstractC22676k.m65757q("identityStorage");
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC18598b m44885f() {
        InterfaceC18598b interfaceC18598b = this.f60135h;
        if (interfaceC18598b != null) {
            return interfaceC18598b;
        }
        AbstractC22676k.m65757q("storage");
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final void m44886h(C21743a c21743a) {
        if (c21743a.f83631c == null) {
            c21743a.f83631c = Long.valueOf(System.currentTimeMillis());
        }
        this.f60138k.debug("Logged event with type: " + c21743a.mo61353a());
        this.f60134g.mo44890N(c21743a);
    }

    /* JADX INFO: renamed from: i */
    public final void m44887i(String str) {
        AbstractC3006f0.m8732z(this.f60130c, this.f60131d, null, new C0410c(this, str, null, 19), 2);
    }
}
