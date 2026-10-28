package va3;

import io.sentry.protocol.DebugImage;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: va3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C35853k {

    /* JADX INFO: renamed from: A */
    public static final C35845c f152631A;

    /* JADX INFO: renamed from: a */
    public static final C35847e f152632a;

    /* JADX INFO: renamed from: b */
    public static final C35847e f152633b;

    /* JADX INFO: renamed from: c */
    public static final C35847e f152634c;

    /* JADX INFO: renamed from: d */
    public static final C35847e f152635d;

    /* JADX INFO: renamed from: e */
    public static final C35847e f152636e;

    /* JADX INFO: renamed from: f */
    public static final C35847e f152637f;

    /* JADX INFO: renamed from: g */
    public static final C35847e f152638g;

    /* JADX INFO: renamed from: h */
    public static final C35847e f152639h;

    /* JADX INFO: renamed from: i */
    public static final C35845c f152640i;

    /* JADX INFO: renamed from: j */
    public static final C35845c f152641j;

    /* JADX INFO: renamed from: k */
    public static final C35845c f152642k;

    /* JADX INFO: renamed from: l */
    public static final C35845c f152643l;

    /* JADX INFO: renamed from: m */
    public static final C35845c f152644m;

    /* JADX INFO: renamed from: n */
    public static final C35845c f152645n;

    /* JADX INFO: renamed from: o */
    public static final C35845c f152646o;

    /* JADX INFO: renamed from: p */
    public static final C35845c f152647p;

    /* JADX INFO: renamed from: q */
    public static final C35845c f152648q;

    /* JADX INFO: renamed from: r */
    public static final C35845c f152649r;

    /* JADX INFO: renamed from: s */
    public static final C35845c f152650s;

    /* JADX INFO: renamed from: t */
    public static final C35845c f152651t;

    /* JADX INFO: renamed from: u */
    public static final C35845c f152652u;

    /* JADX INFO: renamed from: v */
    public static final Set f152653v;

    /* JADX INFO: renamed from: w */
    public static final Set f152654w;

    /* JADX INFO: renamed from: x */
    public static final C35845c f152655x;

    /* JADX INFO: renamed from: y */
    public static final C35845c f152656y;

    /* JADX INFO: renamed from: z */
    public static final C35845c f152657z;

    static {
        C35847e c35847e = new C35847e("kotlin");
        f152632a = c35847e;
        C35847e c35847eM113788a = c35847e.m113788a(C35850h.m113814e("reflect"));
        f152633b = c35847eM113788a;
        c35847e.m113788a(C35850h.m113814e("experimental"));
        C35847e c35847eM113788a2 = c35847e.m113788a(C35850h.m113814e("collections"));
        f152634c = c35847eM113788a2;
        c35847e.m113788a(C35850h.m113814e("sequences"));
        C35847e c35847eM113788a3 = c35847e.m113788a(C35850h.m113814e("ranges"));
        f152635d = c35847eM113788a3;
        C35847e c35847eM113788a4 = c35847e.m113788a(C35850h.m113814e(DebugImage.JVM));
        c35847e.m113788a(C35850h.m113814e("js"));
        c35847e.m113788a(C35850h.m113814e("annotations")).m113788a(C35850h.m113814e(DebugImage.JVM));
        c35847eM113788a4.m113788a(C35850h.m113814e("internal"));
        c35847eM113788a4.m113788a(C35850h.m113814e("functions"));
        C35847e c35847eM113788a5 = c35847e.m113788a(C35850h.m113814e("annotation"));
        f152636e = c35847eM113788a5;
        C35847e c35847eM113788a6 = c35847e.m113788a(C35850h.m113814e("internal"));
        c35847eM113788a6.m113788a(C35850h.m113814e("ir"));
        C35847e c35847eM113788a7 = c35847e.m113788a(C35850h.m113814e("coroutines"));
        f152637f = c35847eM113788a7;
        c35847eM113788a7.m113788a(C35850h.m113814e("intrinsics"));
        f152638g = c35847e.m113788a(C35850h.m113814e("enums"));
        c35847e.m113788a(C35850h.m113814e("contracts"));
        C35847e c35847eM113788a8 = c35847e.m113788a(C35850h.m113814e("concurrent")).m113788a(C35850h.m113814e("atomics"));
        f152639h = c35847eM113788a8;
        c35847e.m113788a(C35850h.m113814e("test"));
        c35847e.m113788a(C35850h.m113814e("text"));
        AbstractC25260n.m74059b1(new C35847e[]{c35847e, c35847eM113788a2, c35847eM113788a3, c35847eM113788a5});
        AbstractC25260n.m74059b1(new C35847e[]{c35847e, c35847eM113788a2, c35847eM113788a3, c35847eM113788a5, c35847eM113788a, c35847eM113788a6, c35847eM113788a7, c35847eM113788a8});
        AbstractC35854l.m113822b("Nothing");
        f152640i = AbstractC35854l.m113822b("Unit");
        f152641j = AbstractC35854l.m113822b("Any");
        f152642k = AbstractC35854l.m113822b("Enum");
        AbstractC35854l.m113822b("Annotation");
        f152643l = AbstractC35854l.m113822b("Array");
        C35845c c35845cM113822b = AbstractC35854l.m113822b("Boolean");
        f152644m = c35845cM113822b;
        C35845c c35845cM113822b2 = AbstractC35854l.m113822b("Char");
        C35845c c35845cM113822b3 = AbstractC35854l.m113822b("Byte");
        C35845c c35845cM113822b4 = AbstractC35854l.m113822b("Short");
        C35845c c35845cM113822b5 = AbstractC35854l.m113822b("Int");
        f152645n = c35845cM113822b5;
        C35845c c35845cM113822b6 = AbstractC35854l.m113822b("Long");
        f152646o = c35845cM113822b6;
        C35845c c35845cM113822b7 = AbstractC35854l.m113822b("Float");
        C35845c c35845cM113822b8 = AbstractC35854l.m113822b("Double");
        f152647p = AbstractC35854l.m113827g(c35845cM113822b3);
        f152648q = AbstractC35854l.m113827g(c35845cM113822b4);
        f152649r = AbstractC35854l.m113827g(c35845cM113822b5);
        f152650s = AbstractC35854l.m113827g(c35845cM113822b6);
        AbstractC35854l.m113822b("CharSequence");
        f152651t = AbstractC35854l.m113822b("String");
        AbstractC35854l.m113822b("Throwable");
        AbstractC35854l.m113822b("Cloneable");
        AbstractC35854l.m113826f("KProperty");
        AbstractC35854l.m113826f("KMutableProperty");
        AbstractC35854l.m113826f("KProperty0");
        AbstractC35854l.m113826f("KMutableProperty0");
        AbstractC35854l.m113826f("KProperty1");
        AbstractC35854l.m113826f("KMutableProperty1");
        AbstractC35854l.m113826f("KProperty2");
        AbstractC35854l.m113826f("KMutableProperty2");
        f152652u = AbstractC35854l.m113826f("KFunction");
        AbstractC35854l.m113826f("KClass");
        AbstractC35854l.m113826f("KCallable");
        AbstractC35854l.m113826f("KType");
        AbstractC35854l.m113822b("Comparable");
        AbstractC35854l.m113822b("Number");
        AbstractC35854l.m113822b("Function");
        Set setM74059b1 = AbstractC25260n.m74059b1(new C35845c[]{c35845cM113822b, c35845cM113822b2, c35845cM113822b3, c35845cM113822b4, c35845cM113822b5, c35845cM113822b6, c35845cM113822b7, c35845cM113822b8});
        f152653v = setM74059b1;
        AbstractC25260n.m74059b1(new C35845c[]{c35845cM113822b3, c35845cM113822b4, c35845cM113822b5, c35845cM113822b6});
        Set set = setM74059b1;
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(set, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        for (Object obj : set) {
            linkedHashMap.put(obj, AbstractC35854l.m113825e(((C35845c) obj).m113777f()));
        }
        AbstractC35854l.m113824d(linkedHashMap);
        Set setM74059b2 = AbstractC25260n.m74059b1(new C35845c[]{f152647p, f152648q, f152649r, f152650s});
        f152654w = setM74059b2;
        Set set2 = setM74059b2;
        int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2 >= 16 ? iM73988W2 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, AbstractC35854l.m113825e(((C35845c) obj2).m113777f()));
        }
        AbstractC35854l.m113824d(linkedHashMap2);
        Set set3 = f152653v;
        Set set4 = f152654w;
        LinkedHashSet linkedHashSetM34556E = AbstractC12350b.m34556E(set3, set4);
        C35845c c35845c = f152651t;
        AbstractC12350b.m34555D(c35845c, linkedHashSetM34556E);
        C35847e packageFqName = f152637f;
        C35850h c35850hM113814e = C35850h.m113814e("Continuation");
        AbstractC22676k.m65750j(packageFqName, "packageFqName");
        C35847e c35847e2 = C35847e.f152612c;
        AbstractC35846d.m113785j(c35850hM113814e).f152613a.m113793c();
        AbstractC35854l.m113823c("Iterator");
        AbstractC35854l.m113823c("Iterable");
        AbstractC35854l.m113823c("Collection");
        AbstractC35854l.m113823c("List");
        AbstractC35854l.m113823c("ListIterator");
        AbstractC35854l.m113823c("Set");
        C35845c c35845cM113823c = AbstractC35854l.m113823c("Map");
        AbstractC35854l.m113823c("AbstractMap");
        AbstractC35854l.m113823c("MutableIterator");
        AbstractC35854l.m113823c("CharIterator");
        AbstractC35854l.m113823c("MutableIterable");
        AbstractC35854l.m113823c("MutableCollection");
        f152655x = AbstractC35854l.m113823c("MutableList");
        AbstractC35854l.m113823c("MutableListIterator");
        f152656y = AbstractC35854l.m113823c("MutableSet");
        C35845c c35845cM113823c2 = AbstractC35854l.m113823c("MutableMap");
        f152657z = c35845cM113823c2;
        c35845cM113823c.m113775d(C35850h.m113814e("Entry"));
        c35845cM113823c2.m113775d(C35850h.m113814e("MutableEntry"));
        AbstractC35854l.m113822b("Result");
        C35847e packageFqName2 = f152635d;
        C35850h c35850hM113814e2 = C35850h.m113814e("IntRange");
        AbstractC22676k.m65750j(packageFqName2, "packageFqName");
        AbstractC35846d.m113785j(c35850hM113814e2).f152613a.m113793c();
        C35850h c35850hM113814e3 = C35850h.m113814e("LongRange");
        AbstractC22676k.m65750j(packageFqName2, "packageFqName");
        AbstractC35846d.m113785j(c35850hM113814e3).f152613a.m113793c();
        C35850h c35850hM113814e4 = C35850h.m113814e("CharRange");
        AbstractC22676k.m65750j(packageFqName2, "packageFqName");
        AbstractC35846d.m113785j(c35850hM113814e4).f152613a.m113793c();
        C35847e packageFqName3 = f152636e;
        C35850h c35850hM113814e5 = C35850h.m113814e("AnnotationRetention");
        AbstractC22676k.m65750j(packageFqName3, "packageFqName");
        AbstractC35846d.m113785j(c35850hM113814e5).f152613a.m113793c();
        C35850h c35850hM113814e6 = C35850h.m113814e("AnnotationTarget");
        AbstractC22676k.m65750j(packageFqName3, "packageFqName");
        AbstractC35846d.m113785j(c35850hM113814e6).f152613a.m113793c();
        AbstractC35854l.m113822b("DeprecationLevel");
        f152631A = new C35845c(f152638g, C35850h.m113814e("EnumEntries"));
        C35845c c35845cM113821a = AbstractC35854l.m113821a("AtomicBoolean");
        C35845c c35845cM113821a2 = AbstractC35854l.m113821a("AtomicInt");
        C35845c c35845cM113821a3 = AbstractC35854l.m113821a("AtomicLong");
        AbstractC35854l.m113821a("AtomicReference");
        C23465k c23465k = new C23465k(f152644m, c35845cM113821a);
        C35845c c35845c2 = f152645n;
        C23465k c23465k2 = new C23465k(c35845c2, c35845cM113821a2);
        C35845c c35845c3 = f152646o;
        AbstractC25247g0.m73990Y(c23465k, c23465k2, new C23465k(c35845c3, c35845cM113821a3));
        AbstractC35854l.m113821a("AtomicArray");
        AbstractC25247g0.m73990Y(new C23465k(c35845c2, AbstractC35854l.m113821a("AtomicIntArray")), new C23465k(c35845c3, AbstractC35854l.m113821a("AtomicLongArray")));
        AbstractC12350b.m34555D(f152642k, AbstractC12350b.m34555D(f152641j, AbstractC12350b.m34555D(f152640i, AbstractC12350b.m34555D(c35845c, AbstractC12350b.m34556E(set3, set4)))));
    }
}
