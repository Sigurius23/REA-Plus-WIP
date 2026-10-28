package cz0;

import b61.C2759n;
import e71.C12800a;
import e71.C12801b;
import j71.EnumC21393a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l61.C23378c;
import l61.C23379d;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25239c0;
import m83.C25241d0;
import m83.C25263q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u61.C34552a;
import u61.C34556e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: cz0.t */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a)\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\f\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\t0\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a)\u0010\u000f\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u000e0\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\b\u001a!\u0010\u0012\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u000e0\u00002\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0014\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a!\u0010\u0015\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\t0\u00002\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, m65681d2 = {"", "Le71/a;", "", "xInput", "", "plotId", "Lcz0/s;", "b", "(Ljava/util/List;FLjava/lang/String;)Lcz0/s;", "Ll61/d;", "Lj71/a;", "scrubShape", "a", "(Ljava/util/List;FLjava/lang/String;Lj71/a;)Lcz0/s;", "Lu61/a;", "f", "id", "", "e", "(Ljava/util/List;Ljava/lang/String;)I", "d", "c", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC11259t {
    /* JADX INFO: renamed from: a */
    public static final AbstractC11258s m30417a(List<C23379d> list, float f13, String plotId, EnumC21393a scrubShape) {
        Object obj;
        Integer num;
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(plotId, "plotId");
        AbstractC22676k.m65750j(scrubShape, "scrubShape");
        if (list.isEmpty()) {
            return new AbstractC11258s.a(plotId, 0.0f, 0.0f, 0.0f, scrubShape, null, 46, null);
        }
        C2759n c2759n = new C2759n();
        if (list.size() == 1) {
            C23379d c23379d = (C23379d) AbstractC25265s.m74096F0(list);
            C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(c23379d.m67671b());
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25263qM74105J1, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W >= 16 ? iM73988W : 16);
            Iterator it = c25263qM74105J1.iterator();
            while (true) {
                C25241d0 c25241d0 = (C25241d0) it;
                if (!c25241d0.f99123x.hasNext()) {
                    break;
                }
                C25239c0 c25239c0 = (C25239c0) c25241d0.next();
                linkedHashMap.put((C23378c) c25239c0.f99118b, Integer.valueOf(c25239c0.f99117a));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!((C23378c) entry.getKey()).getDataScrubberDetails().getSkip()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(Float.valueOf(((C23378c) entry2.getKey()).getXPercent()), entry2.getValue());
            }
            if (linkedHashMap3.keySet().isEmpty()) {
                return new AbstractC11258s.a(plotId, 0.0f, 0.0f, 0.0f, null, null, 62, null);
            }
            List<Float> listM74093D1 = AbstractC25265s.m74093D1(linkedHashMap3.keySet());
            C23378c c23378c = c23379d.m67671b().get(((Number) AbstractC25247g0.m73986U(listM74093D1.get(c2759n.m7812a(f13, listM74093D1)), linkedHashMap3)).intValue());
            return new AbstractC11258s.a(plotId, c23378c.getXPercent(), c23378c.getYPercentTop(), c23378c.getYPercentBot(), scrubShape, AbstractC37056f.m118958J(c23378c.getDataScrubberDetails()));
        }
        List<C23379d> list2 = list;
        int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
        if (iM73988W2 < 16) {
            iM73988W2 = 16;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iM73988W2);
        for (C23379d c23379d2 : list2) {
            C25263q c25263qM74105J2 = AbstractC25265s.m74105J1(c23379d2.m67671b());
            int iM73988W3 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25263qM74105J2, 10));
            if (iM73988W3 < 16) {
                iM73988W3 = 16;
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(iM73988W3);
            Iterator it3 = c25263qM74105J2.iterator();
            while (true) {
                C25241d0 c25241d1 = (C25241d0) it3;
                if (!c25241d1.f99123x.hasNext()) {
                    break;
                }
                C25239c0 c25239c1 = (C25239c0) c25241d1.next();
                linkedHashMap5.put((C23378c) c25239c1.f99118b, Integer.valueOf(c25239c1.f99117a));
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            for (Map.Entry entry3 : linkedHashMap5.entrySet()) {
                if (!((C23378c) entry3.getKey()).getDataScrubberDetails().getSkip()) {
                    linkedHashMap6.put(entry3.getKey(), entry3.getValue());
                }
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap6.size()));
            for (Map.Entry entry4 : linkedHashMap6.entrySet()) {
                linkedHashMap7.put(Float.valueOf(((C23378c) entry4.getKey()).getXPercent()), entry4.getValue());
            }
            List<Float> listM74093D2 = AbstractC25265s.m74093D1(linkedHashMap7.keySet());
            int iM7812a = c2759n.m7812a(f13, listM74093D2);
            int iIntValue = -1;
            if (iM7812a >= 0 && (num = (Integer) linkedHashMap7.get(listM74093D2.get(iM7812a))) != null) {
                iIntValue = num.intValue();
            }
            linkedHashMap4.put(Integer.valueOf(list.indexOf(c23379d2)), Integer.valueOf(iIntValue));
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        for (Map.Entry entry5 : linkedHashMap4.entrySet()) {
            if (((Number) entry5.getValue()).intValue() >= 0) {
                linkedHashMap8.put(entry5.getKey(), entry5.getValue());
            }
        }
        Iterator it4 = linkedHashMap8.entrySet().iterator();
        if (it4.hasNext()) {
            Object next = it4.next();
            if (it4.hasNext()) {
                Map.Entry entry6 = (Map.Entry) next;
                float fAbs = Math.abs(list.get(((Number) entry6.getKey()).intValue()).m67671b().get(((Number) entry6.getValue()).intValue()).getXPercent() - f13);
                do {
                    Object next2 = it4.next();
                    Map.Entry entry7 = (Map.Entry) next2;
                    float fAbs2 = Math.abs(list.get(((Number) entry7.getKey()).intValue()).m67671b().get(((Number) entry7.getValue()).intValue()).getXPercent() - f13);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it4.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry8 = (Map.Entry) obj;
        if (entry8 == null) {
            return new AbstractC11258s.a(plotId, 0.0f, 0.0f, 0.0f, scrubShape, null, 46, null);
        }
        C23378c c23378c2 = list.get(((Number) entry8.getKey()).intValue()).m67671b().get(((Number) entry8.getValue()).intValue());
        return new AbstractC11258s.a(plotId, c23378c2.getXPercent(), c23378c2.getYPercentTop(), c23378c2.getYPercentBot(), scrubShape, AbstractC37056f.m118958J(c23378c2.getDataScrubberDetails()));
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC11258s m30418b(List<C12800a> list, float f13, String plotId) {
        List listM118958J;
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(plotId, "plotId");
        if (list.isEmpty()) {
            return new AbstractC11258s.b(plotId, 0.0f, null, null, 14, null);
        }
        C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(list);
        int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25263qM74105J1, 10));
        if (iM73988W < 16) {
            iM73988W = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
        Iterator it = c25263qM74105J1.iterator();
        while (true) {
            C25241d0 c25241d0 = (C25241d0) it;
            if (!c25241d0.f99123x.hasNext()) {
                break;
            }
            C25239c0 c25239c0 = (C25239c0) c25241d0.next();
            linkedHashMap.put((C12800a) c25239c0.f99118b, Integer.valueOf(c25239c0.f99117a));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((C12800a) entry.getKey()).getDataScrubberDetails().getSkip()) {
                List<C12801b> listM35842c = ((C12800a) entry.getKey()).m35842c();
                if (!(listM35842c instanceof Collection) || !listM35842c.isEmpty()) {
                    Iterator<T> it3 = listM35842c.iterator();
                    do {
                        if (it3.hasNext()) {
                        }
                    } while (!((C12801b) it3.next()).getDataScrubberDetails().getSkip());
                }
            }
            linkedHashMap2.put(entry.getKey(), entry.getValue());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(Float.valueOf(((C12800a) entry2.getKey()).getXPercent()), entry2.getValue());
        }
        if (linkedHashMap3.keySet().isEmpty()) {
            return new AbstractC11258s.b(plotId, 0.0f, null, null, 14, null);
        }
        List<Float> listM74093D1 = AbstractC25265s.m74093D1(linkedHashMap3.keySet());
        C12800a c12800a = list.get(((Number) AbstractC25247g0.m73986U(listM74093D1.get(new C2759n().m7812a(f13, listM74093D1)), linkedHashMap3)).intValue());
        if (c12800a.m35842c().isEmpty()) {
            return new AbstractC11258s.b(plotId, 0.0f, null, null, 14, null);
        }
        if (c12800a.getDataScrubberDetails().getSkip()) {
            List<C12801b> listM35842c2 = c12800a.m35842c();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM35842c2, 10));
            Iterator<T> it4 = listM35842c2.iterator();
            while (it4.hasNext()) {
                arrayList.add(((C12801b) it4.next()).getDataScrubberDetails());
            }
            listM118958J = arrayList;
        } else {
            listM118958J = AbstractC37056f.m118958J(c12800a.getDataScrubberDetails());
        }
        return new AbstractC11258s.b(plotId, c12800a.getXPercent(), c12800a, listM118958J);
    }

    /* JADX INFO: renamed from: c */
    public static final int m30419c(List<C23379d> list, String id4) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(id4, "id");
        int iHashCode = id4.hashCode();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int iHashCode2 = 1;
            for (C23378c c23378c : ((C23379d) it.next()).m67671b()) {
                iHashCode2 = ((Float.hashCode(c23378c.getYPercentTop()) + ((Float.hashCode(c23378c.getXPercent()) + (iHashCode2 * 31)) * 31)) * 31) + Float.hashCode(c23378c.getYPercentBot());
            }
            iHashCode = (iHashCode * 31) + iHashCode2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: d */
    public static final int m30420d(List<C12800a> list, String id4) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(id4, "id");
        int iHashCode = id4.hashCode();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int iHashCode2 = 1;
            for (C12801b c12801b : ((C12800a) it.next()).m35842c()) {
                iHashCode2 = Float.hashCode(c12801b.getHeightPercent()) + ((Float.hashCode(c12801b.getYPercent()) + (iHashCode2 * 31)) * 31);
            }
            iHashCode = (iHashCode * 31) + iHashCode2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: e */
    public static final int m30421e(List<C34552a> list, String id4) {
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(id4, "id");
        int iHashCode = id4.hashCode();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int iHashCode2 = 1;
            for (C34556e c34556e : ((C34552a) it.next()).m109234d()) {
                iHashCode2 = Float.hashCode(c34556e.getYPercent()) + ((Float.hashCode(c34556e.getXPercent()) + (iHashCode2 * 31)) * 31);
            }
            iHashCode = (iHashCode * 31) + iHashCode2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: f */
    public static final AbstractC11258s m30422f(List<C34552a> list, float f13, String plotId) {
        Object obj;
        Integer num;
        AbstractC22676k.m65750j(list, "<this>");
        AbstractC22676k.m65750j(plotId, "plotId");
        if (list.isEmpty()) {
            return new AbstractC11258s.c(plotId, 0.0f, 0.0f, null, 14, null);
        }
        C2759n c2759n = new C2759n();
        if (list.size() == 1) {
            C34552a c34552a = (C34552a) AbstractC25265s.m74096F0(list);
            C25263q c25263qM74105J1 = AbstractC25265s.m74105J1(c34552a.m109234d());
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25263qM74105J1, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W >= 16 ? iM73988W : 16);
            Iterator it = c25263qM74105J1.iterator();
            while (true) {
                C25241d0 c25241d0 = (C25241d0) it;
                if (!c25241d0.f99123x.hasNext()) {
                    break;
                }
                C25239c0 c25239c0 = (C25239c0) c25241d0.next();
                linkedHashMap.put((C34556e) c25239c0.f99118b, Integer.valueOf(c25239c0.f99117a));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!((C34556e) entry.getKey()).getDataScrubberDetails().getSkip()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(Float.valueOf(((C34556e) entry2.getKey()).getXPercent()), entry2.getValue());
            }
            if (linkedHashMap3.keySet().isEmpty()) {
                return new AbstractC11258s.c(plotId, 0.0f, 0.0f, null, 14, null);
            }
            List<Float> listM74093D1 = AbstractC25265s.m74093D1(linkedHashMap3.keySet());
            C34556e c34556e = c34552a.m109234d().get(((Number) AbstractC25247g0.m73986U(listM74093D1.get(c2759n.m7812a(f13, listM74093D1)), linkedHashMap3)).intValue());
            return new AbstractC11258s.c(plotId, c34556e.getXPercent(), c34556e.getYPercent(), AbstractC37056f.m118958J(c34556e.getDataScrubberDetails()));
        }
        List<C34552a> list2 = list;
        int iM73988W2 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list2, 10));
        if (iM73988W2 < 16) {
            iM73988W2 = 16;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(iM73988W2);
        for (C34552a c34552a2 : list2) {
            C25263q c25263qM74105J2 = AbstractC25265s.m74105J1(c34552a2.m109234d());
            int iM73988W3 = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(c25263qM74105J2, 10));
            if (iM73988W3 < 16) {
                iM73988W3 = 16;
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(iM73988W3);
            Iterator it3 = c25263qM74105J2.iterator();
            while (true) {
                C25241d0 c25241d1 = (C25241d0) it3;
                if (!c25241d1.f99123x.hasNext()) {
                    break;
                }
                C25239c0 c25239c1 = (C25239c0) c25241d1.next();
                linkedHashMap5.put((C34556e) c25239c1.f99118b, Integer.valueOf(c25239c1.f99117a));
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            for (Map.Entry entry3 : linkedHashMap5.entrySet()) {
                if (!((C34556e) entry3.getKey()).getDataScrubberDetails().getSkip()) {
                    linkedHashMap6.put(entry3.getKey(), entry3.getValue());
                }
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap(AbstractC25247g0.m73988W(linkedHashMap6.size()));
            for (Map.Entry entry4 : linkedHashMap6.entrySet()) {
                linkedHashMap7.put(Float.valueOf(((C34556e) entry4.getKey()).getXPercent()), entry4.getValue());
            }
            List<Float> listM74093D2 = AbstractC25265s.m74093D1(linkedHashMap7.keySet());
            int iM7812a = c2759n.m7812a(f13, listM74093D2);
            int iIntValue = -1;
            if (iM7812a >= 0 && (num = (Integer) linkedHashMap7.get(listM74093D2.get(iM7812a))) != null) {
                iIntValue = num.intValue();
            }
            linkedHashMap4.put(Integer.valueOf(list.indexOf(c34552a2)), Integer.valueOf(iIntValue));
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        for (Map.Entry entry5 : linkedHashMap4.entrySet()) {
            if (((Number) entry5.getValue()).intValue() >= 0) {
                linkedHashMap8.put(entry5.getKey(), entry5.getValue());
            }
        }
        Iterator it4 = linkedHashMap8.entrySet().iterator();
        if (it4.hasNext()) {
            Object next = it4.next();
            if (it4.hasNext()) {
                Map.Entry entry6 = (Map.Entry) next;
                float fAbs = Math.abs(list.get(((Number) entry6.getKey()).intValue()).m109234d().get(((Number) entry6.getValue()).intValue()).getXPercent() - f13);
                do {
                    Object next2 = it4.next();
                    Map.Entry entry7 = (Map.Entry) next2;
                    float fAbs2 = Math.abs(list.get(((Number) entry7.getKey()).intValue()).m109234d().get(((Number) entry7.getValue()).intValue()).getXPercent() - f13);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it4.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Map.Entry entry8 = (Map.Entry) obj;
        if (entry8 == null) {
            return new AbstractC11258s.c(plotId, 0.0f, 0.0f, null, 14, null);
        }
        C34556e c34556e2 = list.get(((Number) entry8.getKey()).intValue()).m109234d().get(((Number) entry8.getValue()).intValue());
        return new AbstractC11258s.c(plotId, c34556e2.getXPercent(), c34556e2.getYPercent(), AbstractC37056f.m118958J(c34556e2.getDataScrubberDetails()));
    }
}
