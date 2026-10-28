package fa3;

import db3.EnumC11891c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.C35850h;

/* JADX INFO: renamed from: fa3.g0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14314g0 {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f52261a;

    /* JADX INFO: renamed from: b */
    public static final ArrayList f52262b;

    /* JADX INFO: renamed from: c */
    public static final Object f52263c;

    /* JADX INFO: renamed from: d */
    public static final LinkedHashMap f52264d;

    /* JADX INFO: renamed from: e */
    public static final Set f52265e;

    /* JADX INFO: renamed from: f */
    public static final Set f52266f;

    /* JADX INFO: renamed from: g */
    public static final C14306c0 f52267g;

    /* JADX INFO: renamed from: h */
    public static final Object f52268h;

    /* JADX INFO: renamed from: i */
    public static final LinkedHashMap f52269i;

    /* JADX INFO: renamed from: j */
    public static final HashSet f52270j;

    /* JADX INFO: renamed from: k */
    public static final LinkedHashMap f52271k;

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setM74059b1 = AbstractC25260n.m74059b1(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(setM74059b1, 10));
        for (String str : setM74059b1) {
            String strM31931c = EnumC11891c.BOOLEAN.m31931c();
            AbstractC22676k.m65749i(strM31931c, "getDesc(...)");
            arrayList.add(C14319l.m40925a("java/util/Collection", str, "Ljava/util/Collection;", strM31931c));
        }
        f52261a = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C14306c0) it.next()).f52237e);
        }
        f52262b = arrayList2;
        ArrayList arrayList3 = f52261a;
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((C14306c0) it3.next()).f52234b.m113817b());
        }
        String strConcat = "java/util/".concat("Collection");
        EnumC11891c enumC11891c = EnumC11891c.BOOLEAN;
        String strM31931c2 = enumC11891c.m31931c();
        AbstractC22676k.m65749i(strM31931c2, "getDesc(...)");
        C14306c0 c14306c0M40925a = C14319l.m40925a(strConcat, "contains", "Ljava/lang/Object;", strM31931c2);
        EnumC14312f0 enumC14312f0 = EnumC14312f0.f52259z;
        C23465k c23465k = new C23465k(c14306c0M40925a, enumC14312f0);
        String strConcat2 = "java/util/".concat("Collection");
        String strM31931c3 = enumC11891c.m31931c();
        AbstractC22676k.m65749i(strM31931c3, "getDesc(...)");
        C23465k c23465k2 = new C23465k(C14319l.m40925a(strConcat2, "remove", "Ljava/lang/Object;", strM31931c3), enumC14312f0);
        String strConcat3 = "java/util/".concat("Map");
        String strM31931c4 = enumC11891c.m31931c();
        AbstractC22676k.m65749i(strM31931c4, "getDesc(...)");
        C23465k c23465k3 = new C23465k(C14319l.m40925a(strConcat3, "containsKey", "Ljava/lang/Object;", strM31931c4), enumC14312f0);
        String strConcat4 = "java/util/".concat("Map");
        String strM31931c5 = enumC11891c.m31931c();
        AbstractC22676k.m65749i(strM31931c5, "getDesc(...)");
        C23465k c23465k4 = new C23465k(C14319l.m40925a(strConcat4, "containsValue", "Ljava/lang/Object;", strM31931c5), enumC14312f0);
        String strConcat5 = "java/util/".concat("Map");
        String strM31931c6 = enumC11891c.m31931c();
        AbstractC22676k.m65749i(strM31931c6, "getDesc(...)");
        C23465k c23465k5 = new C23465k(C14319l.m40925a(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strM31931c6), enumC14312f0);
        C23465k c23465k6 = new C23465k(C14319l.m40925a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), EnumC14312f0.f52255E);
        C14306c0 c14306c0M40925a2 = C14319l.m40925a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        EnumC14312f0 enumC14312f1 = EnumC14312f0.f52257x;
        C23465k c23465k7 = new C23465k(c14306c0M40925a2, enumC14312f1);
        C23465k c23465k8 = new C23465k(C14319l.m40925a("java/util/".concat("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), enumC14312f1);
        String strConcat6 = "java/util/".concat("List");
        EnumC11891c enumC11891c2 = EnumC11891c.INT;
        String strM31931c7 = enumC11891c2.m31931c();
        AbstractC22676k.m65749i(strM31931c7, "getDesc(...)");
        C14306c0 c14306c0M40925a3 = C14319l.m40925a(strConcat6, "indexOf", "Ljava/lang/Object;", strM31931c7);
        EnumC14312f0 enumC14312f2 = EnumC14312f0.f52258y;
        C23465k c23465k9 = new C23465k(c14306c0M40925a3, enumC14312f2);
        String strConcat7 = "java/util/".concat("List");
        String strM31931c8 = enumC11891c2.m31931c();
        AbstractC22676k.m65749i(strM31931c8, "getDesc(...)");
        Map mapM73990Y = AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, c23465k6, c23465k7, c23465k8, c23465k9, new C23465k(C14319l.m40925a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strM31931c8), enumC14312f2));
        f52263c = mapM73990Y;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(mapM73990Y.size()));
        for (Map.Entry entry : mapM73990Y.entrySet()) {
            linkedHashMap.put(((C14306c0) entry.getKey()).f52237e, entry.getValue());
        }
        f52264d = linkedHashMap;
        LinkedHashSet linkedHashSetM34556E = AbstractC12350b.m34556E(f52263c.keySet(), f52261a);
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(linkedHashSetM34556E, 10));
        Iterator it4 = linkedHashSetM34556E.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((C14306c0) it4.next()).f52234b);
        }
        f52265e = AbstractC25265s.m74103I1(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(linkedHashSetM34556E, 10));
        Iterator it5 = linkedHashSetM34556E.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((C14306c0) it5.next()).f52237e);
        }
        f52266f = AbstractC25265s.m74103I1(arrayList6);
        EnumC11891c enumC11891c3 = EnumC11891c.INT;
        String strM31931c9 = enumC11891c3.m31931c();
        AbstractC22676k.m65749i(strM31931c9, "getDesc(...)");
        C14306c0 c14306c0M40925a4 = C14319l.m40925a("java/util/List", "removeAt", strM31931c9, "Ljava/lang/Object;");
        f52267g = c14306c0M40925a4;
        String strConcat8 = "java/lang/".concat("Number");
        String strM31931c10 = EnumC11891c.BYTE.m31931c();
        AbstractC22676k.m65749i(strM31931c10, "getDesc(...)");
        C23465k c23465k10 = new C23465k(C14319l.m40925a(strConcat8, "toByte", "", strM31931c10), C35850h.m113814e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strM31931c11 = EnumC11891c.SHORT.m31931c();
        AbstractC22676k.m65749i(strM31931c11, "getDesc(...)");
        C23465k c23465k11 = new C23465k(C14319l.m40925a(strConcat9, "toShort", "", strM31931c11), C35850h.m113814e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strM31931c12 = enumC11891c3.m31931c();
        AbstractC22676k.m65749i(strM31931c12, "getDesc(...)");
        C23465k c23465k12 = new C23465k(C14319l.m40925a(strConcat10, "toInt", "", strM31931c12), C35850h.m113814e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strM31931c13 = EnumC11891c.LONG.m31931c();
        AbstractC22676k.m65749i(strM31931c13, "getDesc(...)");
        C23465k c23465k13 = new C23465k(C14319l.m40925a(strConcat11, "toLong", "", strM31931c13), C35850h.m113814e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strM31931c14 = EnumC11891c.FLOAT.m31931c();
        AbstractC22676k.m65749i(strM31931c14, "getDesc(...)");
        C23465k c23465k14 = new C23465k(C14319l.m40925a(strConcat12, "toFloat", "", strM31931c14), C35850h.m113814e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strM31931c15 = EnumC11891c.DOUBLE.m31931c();
        AbstractC22676k.m65749i(strM31931c15, "getDesc(...)");
        C23465k c23465k15 = new C23465k(C14319l.m40925a(strConcat13, "toDouble", "", strM31931c15), C35850h.m113814e("doubleValue"));
        C23465k c23465k16 = new C23465k(c14306c0M40925a4, C35850h.m113814e("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strM31931c16 = enumC11891c3.m31931c();
        AbstractC22676k.m65749i(strM31931c16, "getDesc(...)");
        String strM31931c17 = EnumC11891c.CHAR.m31931c();
        AbstractC22676k.m65749i(strM31931c17, "getDesc(...)");
        Map mapM73990Y2 = AbstractC25247g0.m73990Y(c23465k10, c23465k11, c23465k12, c23465k13, c23465k14, c23465k15, c23465k16, new C23465k(C14319l.m40925a(strConcat14, "get", strM31931c16, strM31931c17), C35850h.m113814e("charAt")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), C35850h.m113814e("get")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), C35850h.m113814e("set")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), C35850h.m113814e("getAndSet")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), C35850h.m113814e("getAndAdd")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), C35850h.m113814e("addAndGet")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), C35850h.m113814e("get")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), C35850h.m113814e("set")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), C35850h.m113814e("getAndSet")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), C35850h.m113814e("getAndAdd")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), C35850h.m113814e("addAndGet")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), C35850h.m113814e("get")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), C35850h.m113814e("set")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), C35850h.m113814e("getAndSet")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", "Ljava/lang/Object;"), C35850h.m113814e("get")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicReference"), "store", "Ljava/lang/Object;", "V"), C35850h.m113814e("set")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), C35850h.m113814e("getAndSet")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), C35850h.m113814e("get")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), C35850h.m113814e("set")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), C35850h.m113814e("getAndSet")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), C35850h.m113814e("compareAndSet")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), C35850h.m113814e("getAndAdd")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), C35850h.m113814e("addAndGet")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), C35850h.m113814e("get")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), C35850h.m113814e("set")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), C35850h.m113814e("getAndSet")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), C35850h.m113814e("compareAndSet")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), C35850h.m113814e("getAndAdd")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), C35850h.m113814e("addAndGet")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), C35850h.m113814e("get")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), C35850h.m113814e("set")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), C35850h.m113814e("getAndSet")), new C23465k(C14319l.m40925a("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), C35850h.m113814e("compareAndSet")));
        f52268h = mapM73990Y2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(mapM73990Y2.size()));
        for (Map.Entry entry2 : mapM73990Y2.entrySet()) {
            linkedHashMap2.put(((C14306c0) entry2.getKey()).f52237e, entry2.getValue());
        }
        f52269i = linkedHashMap2;
        ?? r10 = f52268h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r10.entrySet()) {
            C14306c0 c14306c0 = (C14306c0) entry3.getKey();
            C35850h name = (C35850h) entry3.getValue();
            String classInternalName = c14306c0.f52233a;
            String str2 = c14306c0.f52235c;
            String str3 = c14306c0.f52236d;
            AbstractC22676k.m65750j(classInternalName, "classInternalName");
            AbstractC22676k.m65750j(name, "name");
            String jvmDescriptor = name + '(' + str2 + ')' + str3;
            AbstractC22676k.m65750j(jvmDescriptor, "jvmDescriptor");
            linkedHashSet.add(classInternalName + '.' + jvmDescriptor);
        }
        Set setKeySet = f52268h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it6 = setKeySet.iterator();
        while (it6.hasNext()) {
            hashSet.add(((C14306c0) it6.next()).f52234b);
        }
        f52270j = hashSet;
        Set<Map.Entry> setEntrySet = f52268h.entrySet();
        ArrayList<C23465k> arrayList7 = new ArrayList(AbstractC25267u.m74163i0(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new C23465k(((C14306c0) entry4.getKey()).f52234b, entry4.getValue()));
        }
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList7, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM73988W);
        for (C23465k c23465k17 : arrayList7) {
            linkedHashMap3.put((C35850h) c23465k17.f92938x, (C35850h) c23465k17.f92937w);
        }
        f52271k = linkedHashMap3;
    }
}
