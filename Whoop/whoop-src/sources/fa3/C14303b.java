package fa3;

import ab3.AbstractC0715g;
import ab3.C0710b;
import ab3.C0717i;
import cb3.AbstractC4393e;
import ch3.C4685h;
import dc3.C11934s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import l83.C23465k;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.C25271y;
import na3.C26521h;
import p098dt.AbstractC12350b;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31117e;
import s93.InterfaceC32300b;
import s93.InterfaceC32307i;
import va3.C35847e;
import va3.C35850h;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: fa3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C14303b {

    /* JADX INFO: renamed from: c */
    public static final LinkedHashMap f52224c;

    /* JADX INFO: renamed from: a */
    public final C4685h f52225a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f52226b = new ConcurrentHashMap();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC14301a enumC14301a : EnumC14301a.values()) {
            String str = enumC14301a.f52222w;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, enumC14301a);
            }
        }
        f52224c = linkedHashMap;
    }

    public C14303b(C4685h c4685h) {
        this.f52225a = c4685h;
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m40907a(Object obj, boolean z4) {
        InterfaceC32300b interfaceC32300b = (InterfaceC32300b) obj;
        AbstractC22676k.m65750j(interfaceC32300b, "<this>");
        Map mapMo43952a = interfaceC32300b.mo43952a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapMo43952a.entrySet()) {
            AbstractC25265s.m74141p0(arrayList, (!z4 || AbstractC22676k.m65745e((C35850h) entry.getKey(), AbstractC14331x.f52307b)) ? m40913j((AbstractC0715g) entry.getValue()) : C25271y.f99162w);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0130  */
    /* JADX INFO: renamed from: b */
    public static C14327t m40908b(C14303b c14303b, C14327t c14327t, InterfaceC32307i annotations) {
        boolean z4;
        EnumMap enumMapM40935a;
        C14320m c14320m;
        EnumC14304b0 enumC14304b0M40915h;
        C14320m c14320mM40926a;
        Object objM40909c;
        Object next;
        C23465k c23465k;
        C26521h c26521hM40914g;
        c14303b.getClass();
        AbstractC22676k.m65750j(annotations, "annotations");
        C4685h c4685h = c14303b.f52225a;
        boolean z13 = c4685h.f19187y;
        if (!z13) {
            ArrayList<C14320m> arrayList = new ArrayList();
            Iterator it = annotations.iterator();
            while (true) {
                z4 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                C14320m c14320m2 = null;
                if (z13 || (c14320m = (C14320m) AbstractC14321n.m40929a().get(m40910d(next2))) == null) {
                    c14320mM40926a = null;
                } else {
                    C35847e c35847eM40910d = m40910d(next2);
                    if (c35847eM40910d == null || !AbstractC14321n.m40930b().containsKey(c35847eM40910d)) {
                        enumC14304b0M40915h = c14303b.m40915h(next2);
                        if (enumC14304b0M40915h == null) {
                            enumC14304b0M40915h = ((C14329v) c4685h.f19186x).f52300a;
                        }
                    } else {
                        enumC14304b0M40915h = (EnumC14304b0) ((C11934s) c4685h.f19188z).invoke(c35847eM40910d);
                    }
                    if (enumC14304b0M40915h == EnumC14304b0.IGNORE) {
                        enumC14304b0M40915h = null;
                    }
                    if (enumC14304b0M40915h == null) {
                        c14320mM40926a = null;
                    } else {
                        c14320mM40926a = C14320m.m40926a(c14320m, C26521h.m78595a(c14320m.m40927b(), null, enumC14304b0M40915h == EnumC14304b0.WARN, 1));
                    }
                }
                if (c14320mM40926a != null) {
                    c14320m2 = c14320mM40926a;
                } else {
                    if (((C14329v) c4685h.f19186x).f52303d || (objM40909c = m40909c(next2, AbstractC14332y.m40944e())) == null) {
                        c23465k = null;
                    } else {
                        Iterator it3 = m40911e(next2).iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (c14303b.m40916i(next) == null);
                        if (next == null) {
                            c23465k = null;
                        } else {
                            ArrayList arrayListM40907a = m40907a(objM40909c, true);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator it4 = arrayListM40907a.iterator();
                            while (it4.hasNext()) {
                                EnumC14301a enumC14301a = (EnumC14301a) f52224c.get((String) it4.next());
                                if (enumC14301a != null) {
                                    linkedHashSet.add(enumC14301a);
                                }
                            }
                            if (linkedHashSet.contains(EnumC14301a.TYPE_USE)) {
                                linkedHashSet = AbstractC12350b.m34556E(AbstractC12350b.m34604y(EnumC14301a.TYPE_PARAMETER_BOUNDS, AbstractC25260n.m74059b1(EnumC14301a.values())), linkedHashSet);
                            }
                            c23465k = new C23465k(next, linkedHashSet);
                        }
                    }
                    if (c23465k != null) {
                        Object extractNullability = c23465k.f92937w;
                        Set set = (Set) c23465k.f92938x;
                        EnumC14304b0 enumC14304b0M40915h2 = c14303b.m40915h(next2);
                        if (enumC14304b0M40915h2 == null && (enumC14304b0M40915h2 = c14303b.m40915h(extractNullability)) == null) {
                            enumC14304b0M40915h2 = ((C14329v) c4685h.f19186x).f52300a;
                        }
                        EnumC14304b0 enumC14304b0 = EnumC14304b0.IGNORE;
                        if (enumC14304b0M40915h2 != enumC14304b0) {
                            AbstractC22676k.m65750j(extractNullability, "$this$extractNullability");
                            C26521h c26521hM40914g2 = c14303b.m40914g(extractNullability, false);
                            if (c26521hM40914g2 == null) {
                                Object objM40916i = c14303b.m40916i(extractNullability);
                                if (objM40916i != null) {
                                    EnumC14304b0 enumC14304b0M40915h3 = c14303b.m40915h(extractNullability);
                                    if (enumC14304b0M40915h3 == null) {
                                        enumC14304b0M40915h3 = ((C14329v) c4685h.f19186x).f52300a;
                                    }
                                    if (enumC14304b0M40915h3 == enumC14304b0 || (c26521hM40914g = c14303b.m40914g(objM40916i, false)) == null) {
                                        c26521hM40914g2 = null;
                                    } else {
                                        c26521hM40914g2 = C26521h.m78595a(c26521hM40914g, null, enumC14304b0M40915h3 == EnumC14304b0.WARN, 1);
                                    }
                                } else {
                                    c26521hM40914g2 = null;
                                }
                            }
                            if (c26521hM40914g2 != null) {
                                c14320m2 = new C14320m(C26521h.m78595a(c26521hM40914g2, null, enumC14304b0M40915h2 == EnumC14304b0.WARN, 1), set, 28);
                            }
                        }
                    }
                }
                if (c14320m2 != null) {
                    arrayList.add(c14320m2);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(EnumC14301a.class);
                for (C14320m c14320m3 : arrayList) {
                    for (EnumC14301a enumC14301a2 : c14320m3.m40928c()) {
                        enumMap.containsKey(enumC14301a2);
                        enumMap.put(enumC14301a2, c14320m3);
                    }
                }
                EnumMap enumMap2 = (c14327t == null || (enumMapM40935a = c14327t.m40935a()) == null) ? new EnumMap(EnumC14301a.class) : new EnumMap(enumMapM40935a);
                for (Map.Entry entry : enumMap.entrySet()) {
                    EnumC14301a enumC14301a3 = (EnumC14301a) entry.getKey();
                    C14320m c14320m4 = (C14320m) entry.getValue();
                    if (c14320m4 != null) {
                        enumMap2.put(enumC14301a3, c14320m4);
                        z4 = true;
                    }
                }
                if (z4) {
                    return new C14327t(enumMap2);
                }
            }
        }
        return c14327t;
    }

    /* JADX INFO: renamed from: c */
    public static Object m40909c(Object obj, C35847e c35847e) {
        for (Object obj2 : m40911e(obj)) {
            if (AbstractC22676k.m65745e(m40910d(obj2), c35847e)) {
                return obj2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static C35847e m40910d(Object obj) {
        InterfaceC32300b interfaceC32300b = (InterfaceC32300b) obj;
        AbstractC22676k.m65750j(interfaceC32300b, "<this>");
        return interfaceC32300b.mo43953b();
    }

    /* JADX INFO: renamed from: e */
    public static Iterable m40911e(Object obj) {
        InterfaceC32307i annotations;
        InterfaceC32300b interfaceC32300b = (InterfaceC32300b) obj;
        AbstractC22676k.m65750j(interfaceC32300b, "<this>");
        InterfaceC31117e interfaceC31117eM13806d = AbstractC4393e.m13806d(interfaceC32300b);
        return (interfaceC31117eM13806d == null || (annotations = interfaceC31117eM13806d.getAnnotations()) == null) ? C25271y.f99162w : annotations;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m40912f(Object obj, C35847e c35847e) {
        Iterable iterableM40911e = m40911e(obj);
        if ((iterableM40911e instanceof Collection) && ((Collection) iterableM40911e).isEmpty()) {
            return false;
        }
        Iterator it = iterableM40911e.iterator();
        while (it.hasNext()) {
            if (AbstractC22676k.m65745e(m40910d(it.next()), c35847e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static List m40913j(AbstractC0715g abstractC0715g) {
        if (!(abstractC0715g instanceof C0710b)) {
            return abstractC0715g instanceof C0717i ? AbstractC37056f.m118958J(((C0717i) abstractC0715g).m1781c().m113818c()) : C25271y.f99162w;
        }
        Iterable iterable = (Iterable) ((C0710b) abstractC0715g).mo1777b();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, m40913j((AbstractC0715g) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        if (r6.equals("NEVER") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
    
        if (r6.equals("MAYBE") == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        r6 = na3.EnumC26520g.f105436x;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final na3.C26521h m40914g(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            va3.e r0 = m40910d(r6)
            r1 = 0
            if (r0 != 0) goto L9
            goto L9e
        L9:
            ch3.h r2 = r5.f52225a
            java.lang.Object r2 = r2.f19188z
            dc3.s r2 = (dc3.C11934s) r2
            java.lang.Object r2 = r2.invoke(r0)
            fa3.b0 r2 = (fa3.EnumC14304b0) r2
            r2.getClass()
            fa3.b0 r3 = fa3.EnumC14304b0.IGNORE
            if (r2 != r3) goto L1d
            return r1
        L1d:
            java.util.Set r3 = fa3.AbstractC14332y.m40946g()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L2c
            na3.g r6 = na3.EnumC26520g.f105437y
            goto L90
        L2c:
            java.util.Set r3 = fa3.AbstractC14332y.m40947h()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L39
            na3.g r6 = na3.EnumC26520g.f105436x
            goto L90
        L39:
            java.util.Set r3 = fa3.AbstractC14332y.m40941b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L46
            na3.g r6 = na3.EnumC26520g.f105435w
            goto L90
        L46:
            va3.e r3 = fa3.AbstractC14332y.m40942c()
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L9e
            java.util.ArrayList r6 = m40907a(r6, r4)
            java.lang.Object r6 = m83.AbstractC25265s.m74098G0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8e
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L82;
                case 74175084: goto L79;
                case 433141802: goto L6d;
                case 1933739535: goto L64;
                default: goto L63;
            }
        L63:
            goto L9e
        L64:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L9e
            goto L8e
        L6d:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L76
            goto L9e
        L76:
            na3.g r6 = na3.EnumC26520g.f105435w
            goto L90
        L79:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L8b
            goto L9e
        L82:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L8b
            goto L9e
        L8b:
            na3.g r6 = na3.EnumC26520g.f105436x
            goto L90
        L8e:
            na3.g r6 = na3.EnumC26520g.f105437y
        L90:
            na3.h r0 = new na3.h
            fa3.b0 r1 = fa3.EnumC14304b0.WARN
            if (r2 != r1) goto L97
            goto L99
        L97:
            if (r7 == 0) goto L9a
        L99:
            r4 = 1
        L9a:
            r0.<init>(r6, r4)
            return r0
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fa3.C14303b.m40914g(java.lang.Object, boolean):na3.h");
    }

    /* JADX INFO: renamed from: h */
    public final EnumC14304b0 m40915h(Object obj) {
        String str;
        C14329v c14329v = (C14329v) this.f52225a.f19186x;
        EnumC14304b0 enumC14304b0 = (EnumC14304b0) c14329v.f52302c.get(m40910d(obj));
        if (enumC14304b0 != null) {
            return enumC14304b0;
        }
        Object objM40909c = m40909c(obj, AbstractC14332y.m40948i());
        if (objM40909c == null || (str = (String) AbstractC25265s.m74098G0(m40907a(objM40909c, false))) == null) {
            return null;
        }
        EnumC14304b0 enumC14304b1 = c14329v.f52301b;
        if (enumC14304b1 != null) {
            return enumC14304b1;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return EnumC14304b0.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return EnumC14304b0.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return EnumC14304b0.WARN;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final Object m40916i(Object annotation) {
        Object objM40916i;
        AbstractC22676k.m65750j(annotation, "annotation");
        if (!((C14329v) this.f52225a.f19186x).f52303d) {
            if (AbstractC25265s.m74155w0(AbstractC14332y.m40940a(), m40910d(annotation)) || m40912f(annotation, AbstractC14332y.m40943d())) {
                return annotation;
            }
            if (m40912f(annotation, AbstractC14332y.m40945f())) {
                InterfaceC31117e interfaceC31117eM13806d = AbstractC4393e.m13806d((InterfaceC32300b) annotation);
                AbstractC22676k.m65747g(interfaceC31117eM13806d);
                ConcurrentHashMap concurrentHashMap = this.f52226b;
                Object obj = concurrentHashMap.get(interfaceC31117eM13806d);
                if (obj != null) {
                    return obj;
                }
                Iterator it = m40911e(annotation).iterator();
                do {
                    if (!it.hasNext()) {
                        objM40916i = null;
                        break;
                    }
                    objM40916i = m40916i(it.next());
                } while (objM40916i == null);
                if (objM40916i != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(interfaceC31117eM13806d, objM40916i);
                    return objPutIfAbsent == null ? objM40916i : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
