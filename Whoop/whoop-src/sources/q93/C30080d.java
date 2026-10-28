package q93;

import db3.EnumC11891c;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import o93.AbstractC27732d;
import o93.AbstractC27741m;
import o93.AbstractC27742n;
import o93.EnumC27738j;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;
import p93.C29028g;
import p93.C29029h;
import p93.C29030i;
import p93.C29031j;
import va3.AbstractC35844b;
import va3.AbstractC35849g;
import va3.AbstractC35852j;
import va3.C35845c;
import va3.C35847e;
import va3.C35848f;
import va3.C35850h;
import va3.C35853k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: q93.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C30080d {

    /* JADX INFO: renamed from: a */
    public static final String f122759a;

    /* JADX INFO: renamed from: b */
    public static final String f122760b;

    /* JADX INFO: renamed from: c */
    public static final String f122761c;

    /* JADX INFO: renamed from: d */
    public static final String f122762d;

    /* JADX INFO: renamed from: e */
    public static final C35845c f122763e;

    /* JADX INFO: renamed from: f */
    public static final C35847e f122764f;

    /* JADX INFO: renamed from: g */
    public static final C35845c f122765g;

    /* JADX INFO: renamed from: h */
    public static final HashMap f122766h;

    /* JADX INFO: renamed from: i */
    public static final HashMap f122767i;

    /* JADX INFO: renamed from: j */
    public static final HashMap f122768j;

    /* JADX INFO: renamed from: k */
    public static final HashMap f122769k;

    /* JADX INFO: renamed from: l */
    public static final HashMap f122770l;

    /* JADX INFO: renamed from: m */
    public static final HashMap f122771m;

    /* JADX INFO: renamed from: n */
    public static final LinkedHashSet f122772n;

    /* JADX INFO: renamed from: o */
    public static final List f122773o;

    static {
        StringBuilder sb4 = new StringBuilder();
        C29028g c29028g = C29028g.f117498c;
        sb4.append(c29028g.f117502a);
        sb4.append('.');
        sb4.append(c29028g.f117503b);
        f122759a = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        C29029h c29029h = C29029h.f117499c;
        sb5.append(c29029h.f117502a);
        sb5.append('.');
        sb5.append(c29029h.f117503b);
        f122760b = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        C29031j c29031j = C29031j.f117501c;
        sb6.append(c29031j.f117502a);
        sb6.append('.');
        sb6.append(c29031j.f117503b);
        f122761c = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        C29030i c29030i = C29030i.f117500c;
        sb7.append(c29030i.f117502a);
        sb7.append('.');
        sb7.append(c29030i.f117503b);
        f122762d = sb7.toString();
        C35845c c35845cM113770k = AbstractC35844b.m113770k(new C35847e("kotlin.jvm.functions.FunctionN"));
        f122763e = c35845cM113770k;
        f122764f = c35845cM113770k.m113773a();
        f122765g = C35853k.f152652u;
        m92209e(Class.class);
        f122766h = new HashMap();
        f122767i = new HashMap();
        f122768j = new HashMap();
        f122769k = new HashMap();
        f122770l = new HashMap();
        f122771m = new HashMap();
        f122772n = new LinkedHashSet();
        C35845c c35845cM113770k2 = AbstractC35844b.m113770k(AbstractC27741m.f111818B);
        C35847e c35847e = AbstractC27741m.f111826J;
        C35847e c35847e2 = c35845cM113770k2.f152609a;
        C30079c c30079c = new C30079c(m92209e(Iterable.class), c35845cM113770k2, new C35845c(c35847e2, AbstractC35849g.m113811m(c35847e, c35847e2), false));
        C35845c c35845cM113770k3 = AbstractC35844b.m113770k(AbstractC27741m.f111817A);
        C35847e c35847e3 = AbstractC27741m.f111825I;
        C35847e c35847e4 = c35845cM113770k3.f152609a;
        C30079c c30079c2 = new C30079c(m92209e(Iterator.class), c35845cM113770k3, new C35845c(c35847e4, AbstractC35849g.m113811m(c35847e3, c35847e4), false));
        C35845c c35845cM113770k4 = AbstractC35844b.m113770k(AbstractC27741m.f111819C);
        C35847e c35847e5 = AbstractC27741m.f111827K;
        C35847e c35847e6 = c35845cM113770k4.f152609a;
        C30079c c30079c3 = new C30079c(m92209e(Collection.class), c35845cM113770k4, new C35845c(c35847e6, AbstractC35849g.m113811m(c35847e5, c35847e6), false));
        C35845c c35845cM113770k5 = AbstractC35844b.m113770k(AbstractC27741m.f111820D);
        C35847e c35847e7 = AbstractC27741m.f111828L;
        C35847e c35847e8 = c35845cM113770k5.f152609a;
        C30079c c30079c4 = new C30079c(m92209e(List.class), c35845cM113770k5, new C35845c(c35847e8, AbstractC35849g.m113811m(c35847e7, c35847e8), false));
        C35845c c35845cM113770k6 = AbstractC35844b.m113770k(AbstractC27741m.f111822F);
        C35847e c35847e9 = AbstractC27741m.f111830N;
        C35847e c35847e10 = c35845cM113770k6.f152609a;
        C30079c c30079c5 = new C30079c(m92209e(Set.class), c35845cM113770k6, new C35845c(c35847e10, AbstractC35849g.m113811m(c35847e9, c35847e10), false));
        C35845c c35845cM113770k7 = AbstractC35844b.m113770k(AbstractC27741m.f111821E);
        C35847e c35847e11 = AbstractC27741m.f111829M;
        C35847e c35847e12 = c35845cM113770k7.f152609a;
        C30079c c30079c6 = new C30079c(m92209e(ListIterator.class), c35845cM113770k7, new C35845c(c35847e12, AbstractC35849g.m113811m(c35847e11, c35847e12), false));
        C35847e c35847e13 = AbstractC27741m.f111823G;
        C35845c c35845cM113770k8 = AbstractC35844b.m113770k(c35847e13);
        C35847e c35847e14 = AbstractC27741m.f111831O;
        C35847e c35847e15 = c35845cM113770k8.f152609a;
        C30079c c30079c7 = new C30079c(m92209e(Map.class), c35845cM113770k8, new C35845c(c35847e15, AbstractC35849g.m113811m(c35847e14, c35847e15), false));
        C35845c c35845cM113775d = AbstractC35844b.m113770k(c35847e13).m113775d(AbstractC27741m.f111824H.f152613a.m113796g());
        C35847e c35847e16 = AbstractC27741m.f111832P;
        C35847e c35847e17 = c35845cM113775d.f152609a;
        List<C30079c> listM118959K = AbstractC37056f.m118959K(c30079c, c30079c2, c30079c3, c30079c4, c30079c5, c30079c6, c30079c7, new C30079c(m92209e(Map.Entry.class), c35845cM113775d, new C35845c(c35847e17, AbstractC35849g.m113811m(c35847e16, c35847e17), false)));
        f122773o = listM118959K;
        m92208d(Object.class, AbstractC27741m.f111843a);
        m92208d(String.class, AbstractC27741m.f111853f);
        m92208d(CharSequence.class, AbstractC27741m.f111851e);
        m92207c(Throwable.class, AbstractC27741m.f111860k);
        m92208d(Cloneable.class, AbstractC27741m.f111847c);
        m92208d(Number.class, AbstractC27741m.f111858i);
        m92207c(Comparable.class, AbstractC27741m.f111861l);
        m92208d(Enum.class, AbstractC27741m.f111859j);
        m92207c(Annotation.class, AbstractC27741m.f111868s);
        for (C30079c c30079c8 : listM118959K) {
            C35845c c35845c = c30079c8.f122756a;
            C35845c c35845c2 = c30079c8.f122757b;
            C35845c c35845c3 = c30079c8.f122758c;
            m92205a(c35845c, c35845c2);
            m92206b(c35845c3.m113773a(), c35845c);
            f122770l.put(c35845c3, c35845c2);
            f122771m.put(c35845c2, c35845c3);
            C35847e c35847eM113773a = c35845c2.m113773a();
            C35847e c35847eM113773a2 = c35845c3.m113773a();
            f122768j.put(c35845c3.m113773a().f152613a, c35847eM113773a);
            f122769k.put(c35847eM113773a.f152613a, c35847eM113773a2);
        }
        for (EnumC11891c enumC11891c : EnumC11891c.values()) {
            C35847e c35847e18 = enumC11891c.f38879z;
            if (c35847e18 == null) {
                EnumC11891c.m31929a(15);
                throw null;
            }
            C35845c c35845c4 = new C35845c(c35847e18.m113789b(), c35847e18.f152613a.m113796g());
            EnumC27738j enumC27738jM31932d = enumC11891c.m31932d();
            AbstractC22676k.m65749i(enumC27738jM31932d, "getPrimitiveType(...)");
            C35847e c35847eM113788a = AbstractC27742n.f111886k.m113788a(enumC27738jM31932d.f111806w);
            m92205a(c35845c4, new C35845c(c35847eM113788a.m113789b(), c35847eM113788a.f152613a.m113796g()));
        }
        for (C35845c c35845c5 : AbstractC27732d.f111783a) {
            C35847e c35847e19 = new C35847e("kotlin.jvm.internal." + c35845c5.m113777f().m113817b() + "CompanionObject");
            m92205a(new C35845c(c35847e19.m113789b(), c35847e19.f152613a.m113796g()), c35845c5.m113775d(AbstractC35852j.f152625b));
        }
        for (int i13 = 0; i13 < 23; i13++) {
            C35847e c35847e20 = new C35847e(AbstractC2875y.m8295h(i13, "kotlin.jvm.functions.Function"));
            m92205a(new C35845c(c35847e20.m113789b(), c35847e20.f152613a.m113796g()), new C35845c(AbstractC27742n.f111886k, C35850h.m113814e("Function" + i13)));
            m92206b(new C35847e(f122760b + i13), f122765g);
        }
        for (int i14 = 0; i14 < 22; i14++) {
            C29030i c29030i2 = C29030i.f117500c;
            m92206b(new C35847e((c29030i2.f117502a + '.' + c29030i2.f117503b) + i14), f122765g);
        }
        m92206b(new C35847e("kotlin.concurrent.atomics.AtomicInt"), m92209e(AtomicInteger.class));
        m92206b(new C35847e("kotlin.concurrent.atomics.AtomicLong"), m92209e(AtomicLong.class));
        m92206b(new C35847e("kotlin.concurrent.atomics.AtomicBoolean"), m92209e(AtomicBoolean.class));
        m92206b(new C35847e("kotlin.concurrent.atomics.AtomicReference"), m92209e(AtomicReference.class));
        m92206b(new C35847e("kotlin.concurrent.atomics.AtomicIntArray"), m92209e(AtomicIntegerArray.class));
        m92206b(new C35847e("kotlin.concurrent.atomics.AtomicLongArray"), m92209e(AtomicLongArray.class));
        m92206b(new C35847e("kotlin.concurrent.atomics.AtomicArray"), m92209e(AtomicReferenceArray.class));
        m92206b(AbstractC27741m.f111845b.m113798i(), m92209e(Void.class));
    }

    /* JADX INFO: renamed from: a */
    public static void m92205a(C35845c c35845c, C35845c c35845c2) {
        f122766h.put(c35845c.m113773a().f152613a, c35845c2);
        m92206b(c35845c2.m113773a(), c35845c);
    }

    /* JADX INFO: renamed from: b */
    public static void m92206b(C35847e c35847e, C35845c c35845c) {
        f122772n.add(c35847e);
        f122767i.put(c35847e.f152613a, c35845c);
    }

    /* JADX INFO: renamed from: c */
    public static void m92207c(Class cls, C35847e topLevelFqName) {
        C35845c c35845cM92209e = m92209e(cls);
        AbstractC22676k.m65750j(topLevelFqName, "topLevelFqName");
        m92205a(c35845cM92209e, new C35845c(topLevelFqName.m113789b(), topLevelFqName.f152613a.m113796g()));
    }

    /* JADX INFO: renamed from: d */
    public static void m92208d(Class cls, C35848f c35848f) {
        m92207c(cls, c35848f.m113798i());
    }

    /* JADX INFO: renamed from: e */
    public static C35845c m92209e(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return m92209e(declaringClass).m113775d(C35850h.m113814e(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        AbstractC22676k.m65749i(canonicalName, "getCanonicalName(...)");
        C35847e c35847e = new C35847e(canonicalName);
        return new C35845c(c35847e.m113789b(), c35847e.f152613a.m113796g());
    }

    /* JADX INFO: renamed from: f */
    public static boolean m92210f(C35848f c35848f, String str) {
        Integer numM125932Q;
        String str2 = c35848f.f152616a;
        if (AbstractC39421y.m125930O(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            if (!AbstractC39414r.m125907z0(strSubstring, '0') && (numM125932Q = AbstractC39421y.m125932Q(strSubstring)) != null && numM125932Q.intValue() >= 23) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static C35845c m92211g(C35848f kotlinFqName) {
        AbstractC22676k.m65750j(kotlinFqName, "kotlinFqName");
        if (m92210f(kotlinFqName, f122759a) || m92210f(kotlinFqName, f122761c)) {
            return f122763e;
        }
        return (m92210f(kotlinFqName, f122760b) || m92210f(kotlinFqName, f122762d)) ? f122765g : (C35845c) f122767i.get(kotlinFqName);
    }

    /* JADX INFO: renamed from: h */
    public static C35847e m92212h(C35848f c35848f) {
        return (C35847e) f122769k.get(c35848f);
    }
}
