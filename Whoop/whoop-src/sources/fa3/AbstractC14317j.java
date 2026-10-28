package fa3;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import va3.C35845c;
import va3.C35847e;
import va3.C35853k;

/* JADX INFO: renamed from: fa3.j */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14317j {

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap f52273a;

    /* JADX INFO: renamed from: b */
    public static final Map f52274b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f52273a = linkedHashMap;
        m40924c(C35853k.f152655x, m40922a("java.util.ArrayList", "java.util.LinkedList"));
        m40924c(C35853k.f152656y, m40922a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        m40924c(C35853k.f152657z, m40922a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C35847e c35847e = new C35847e("java.util.function.Function");
        m40924c(new C35845c(c35847e.m113789b(), c35847e.f152613a.m113796g()), m40922a("java.util.function.UnaryOperator"));
        C35847e c35847e2 = new C35847e("java.util.function.BiFunction");
        m40924c(new C35845c(c35847e2.m113789b(), c35847e2.f152613a.m113796g()), m40922a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new C23465k(((C35845c) entry.getKey()).m113773a(), ((C35845c) entry.getValue()).m113773a()));
        }
        f52274b = AbstractC25247g0.m74000i0(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m40922a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            C35847e c35847e = new C35847e(str);
            arrayList.add(new C35845c(c35847e.m113789b(), c35847e.f152613a.m113796g()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static C35847e m40923b(C35847e c35847e) {
        return (C35847e) f52274b.get(c35847e);
    }

    /* JADX INFO: renamed from: c */
    public static void m40924c(C35845c c35845c, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f52273a.put(obj, c35845c);
        }
    }
}
