package fa3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import o93.AbstractC27741m;
import o93.AbstractC27742n;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q93.C30080d;
import va3.C35845c;
import va3.C35847e;
import va3.C35848f;
import va3.C35850h;

/* JADX INFO: renamed from: fa3.f */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14311f {

    /* JADX INFO: renamed from: a */
    public static final Object f52251a;

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f52252b;

    /* JADX INFO: renamed from: c */
    public static final Set f52253c;

    /* JADX INFO: renamed from: d */
    public static final Set f52254d;

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Map] */
    static {
        C35848f c35848f = AbstractC27741m.f111859j;
        C23465k c23465k = new C23465k(c35848f.m113791a(C35850h.m113814e("name")).m113798i(), AbstractC27742n.f111879d);
        C23465k c23465k2 = new C23465k(c35848f.m113791a(C35850h.m113814e("ordinal")).m113798i(), C35850h.m113814e("ordinal"));
        C23465k c23465k3 = new C23465k(AbstractC22674j.m65734t("size", AbstractC27741m.f111819C), C35850h.m113814e("size"));
        C35847e c35847e = AbstractC27741m.f111823G;
        Map mapM73990Y = AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, new C23465k(AbstractC22674j.m65734t("size", c35847e), C35850h.m113814e("size")), new C23465k(AbstractC27741m.f111851e.m113791a(C35850h.m113814e("length")).m113798i(), C35850h.m113814e("length")), new C23465k(AbstractC22674j.m65734t("keys", c35847e), C35850h.m113814e("keySet")), new C23465k(AbstractC22674j.m65734t("values", c35847e), C35850h.m113814e("values")), new C23465k(AbstractC22674j.m65734t("entries", c35847e), C35850h.m113814e("entrySet")), new C23465k(AbstractC22674j.m65734t("size", AbstractC27741m.f111844a0), C35850h.m113814e("length")), new C23465k(AbstractC22674j.m65734t("size", AbstractC27741m.f111846b0), C35850h.m113814e("length")), new C23465k(AbstractC22674j.m65734t("size", AbstractC27741m.f111848c0), C35850h.m113814e("length")));
        f52251a = mapM73990Y;
        Set<Map.Entry> setEntrySet = mapM73990Y.entrySet();
        ArrayList<C23465k> arrayList = new ArrayList(AbstractC25267u.m74163i0(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new C23465k(((C35847e) entry.getKey()).f152613a.m113796g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C23465k c23465k4 : arrayList) {
            C35850h c35850h = (C35850h) c23465k4.f92938x;
            Object arrayList2 = linkedHashMap.get(c35850h);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c35850h, arrayList2);
            }
            ((List) arrayList2).add((C35850h) c23465k4.f92937w);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), AbstractC25265s.m74159y0((Iterable) entry2.getValue()));
        }
        f52252b = linkedHashMap2;
        ?? r10 = f52251a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r10.entrySet()) {
            String str = C30080d.f122759a;
            C35845c c35845cM92211g = C30080d.m92211g(((C35847e) entry3.getKey()).m113789b().f152613a);
            AbstractC22676k.m65747g(c35845cM92211g);
            linkedHashSet.add(c35845cM92211g.m113773a().m113788a((C35850h) entry3.getValue()));
        }
        Set setKeySet = f52251a.keySet();
        f52253c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C35847e) it.next()).f152613a.m113796g());
        }
        f52254d = AbstractC25265s.m74103I1(arrayList3);
    }
}
