package xe3;

import aa3.C0656u0;
import af3.AbstractC0844t;
import af3.C0823a0;
import af3.C0834j;
import af3.C0838n;
import af3.C0840p;
import af3.C0841q;
import af3.C0848x;
import bf3.C3205d;
import bi.C3278p;
import df3.InterfaceC12001a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p012ab.C0690l0;
import p047c9.C4320k;
import p477s2.AbstractC32076h;
import p478s3.AbstractC32098d;
import p503tp.C34038i;
import pg3.C29205p;
import ye3.C39481a;
import ye3.C39482b;
import ye3.C39483c;
import ye3.C39484d;
import ye3.C39485e;
import ye3.C39486f;
import ye3.InterfaceC39487g;
import ze3.AbstractC40598b;

/* JADX INFO: renamed from: xe3.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C38248k {

    /* JADX INFO: renamed from: a */
    public final BitSet f163993a;

    /* JADX INFO: renamed from: b */
    public final HashMap f163994b;

    /* JADX INFO: renamed from: c */
    public final C29205p f163995c;

    /* JADX INFO: renamed from: d */
    public final HashMap f163996d;

    /* JADX INFO: renamed from: e */
    public C0690l0 f163997e;

    /* JADX INFO: renamed from: f */
    public boolean f163998f;

    /* JADX INFO: renamed from: g */
    public int f163999g;

    /* JADX INFO: renamed from: h */
    public C38241d f164000h;

    /* JADX INFO: renamed from: i */
    public C38240c f164001i;

    public C38248k(C29205p c29205p) {
        List list = (List) c29205p.f118204x;
        HashMap map = new HashMap();
        m122583b(Arrays.asList(new C39481a('*'), new C39481a('_')), map);
        m122583b(list, map);
        this.f163994b = map;
        this.f163995c = c29205p;
        HashMap map2 = new HashMap();
        this.f163996d = map2;
        map2.put('\\', Collections.singletonList(new C39483c()));
        map2.put('`', Collections.singletonList(new C39484d()));
        map2.put('&', Collections.singletonList(new C39485e()));
        map2.put('<', Arrays.asList(new C39482b(), new C39486f()));
        Set setKeySet = map.keySet();
        Set setKeySet2 = map2.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        Iterator it3 = setKeySet2.iterator();
        while (it3.hasNext()) {
            bitSet.set(((Character) it3.next()).charValue());
        }
        bitSet.set(91);
        bitSet.set(93);
        bitSet.set(33);
        bitSet.set(10);
        this.f163993a = bitSet;
    }

    /* JADX INFO: renamed from: a */
    public static void m122582a(char c3, InterfaceC12001a interfaceC12001a, HashMap map) {
        if (((InterfaceC12001a) map.put(Character.valueOf(c3), interfaceC12001a)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c3 + "'");
    }

    /* JADX INFO: renamed from: b */
    public static void m122583b(Iterable iterable, HashMap map) {
        C38254q c38254q;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC12001a interfaceC12001a = (InterfaceC12001a) it.next();
            char cMo33080d = interfaceC12001a.mo33080d();
            char cMo33078b = interfaceC12001a.mo33078b();
            if (cMo33080d == cMo33078b) {
                InterfaceC12001a interfaceC12001a2 = (InterfaceC12001a) map.get(Character.valueOf(cMo33080d));
                if (interfaceC12001a2 == null || interfaceC12001a2.mo33080d() != interfaceC12001a2.mo33078b()) {
                    m122582a(cMo33080d, interfaceC12001a, map);
                } else {
                    if (interfaceC12001a2 instanceof C38254q) {
                        c38254q = (C38254q) interfaceC12001a2;
                    } else {
                        C38254q c38254q2 = new C38254q(cMo33080d);
                        c38254q2.m122592e(interfaceC12001a2);
                        c38254q = c38254q2;
                    }
                    c38254q.m122592e(interfaceC12001a);
                    map.put(Character.valueOf(cMo33080d), c38254q);
                }
            } else {
                m122582a(cMo33080d, interfaceC12001a, map);
                m122582a(cMo33078b, interfaceC12001a, map);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static C0823a0 m122584i(C0656u0 c0656u0) {
        C0823a0 c0823a0 = new C0823a0(c0656u0.m1644m());
        c0823a0.m2058h(c0656u0.m1646o());
        return c0823a0;
    }

    /* JADX INFO: renamed from: c */
    public final void m122585c(AbstractC0844t abstractC0844t) {
        AbstractC0844t abstractC0844t2 = abstractC0844t.f3039b;
        if (abstractC0844t2 == null) {
            return;
        }
        AbstractC0844t abstractC0844t3 = abstractC0844t.f3040c;
        C0823a0 c0823a0 = null;
        C0823a0 c0823a1 = null;
        int length = 0;
        while (abstractC0844t2 != null) {
            if (abstractC0844t2 instanceof C0823a0) {
                c0823a1 = (C0823a0) abstractC0844t2;
                if (c0823a0 == null) {
                    c0823a0 = c0823a1;
                }
                length = c0823a1.f3019g.length() + length;
            } else {
                m122586d(c0823a0, c0823a1, length);
                m122585c(abstractC0844t2);
                c0823a0 = null;
                c0823a1 = null;
                length = 0;
            }
            if (abstractC0844t2 == abstractC0844t3) {
                break;
            } else {
                abstractC0844t2 = abstractC0844t2.f3042e;
            }
        }
        m122586d(c0823a0, c0823a1, length);
    }

    /* JADX INFO: renamed from: d */
    public final void m122586d(C0823a0 c0823a0, C0823a0 c0823a1, int i13) {
        C0656u0 c0656u0;
        if (c0823a0 == null || c0823a1 == null || c0823a0 == c0823a1) {
            return;
        }
        StringBuilder sb4 = new StringBuilder(i13);
        sb4.append(c0823a0.f3019g);
        if (this.f163998f) {
            c0656u0 = new C0656u0();
            c0656u0.m1638g(c0823a0.m2056e());
        } else {
            c0656u0 = null;
        }
        AbstractC0844t abstractC0844t = c0823a0.f3042e;
        AbstractC0844t abstractC0844t2 = c0823a1.f3042e;
        while (abstractC0844t != abstractC0844t2) {
            sb4.append(((C0823a0) abstractC0844t).f3019g);
            if (c0656u0 != null) {
                c0656u0.m1638g(abstractC0844t.m2056e());
            }
            AbstractC0844t abstractC0844t3 = abstractC0844t.f3042e;
            abstractC0844t.m2059j();
            abstractC0844t = abstractC0844t3;
        }
        c0823a0.f3019g = sb4.toString();
        if (c0656u0 != null) {
            List list = c0656u0.f2286a;
            if (list == null) {
                list = Collections.EMPTY_LIST;
            }
            c0823a0.m2058h(list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:128:0x020d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0214  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d2 A[PHI: r6
      0x02d2: PHI (r6v20 char) = (r6v19 char), (r6v23 char), (r6v24 char) binds: [B:158:0x02c8, B:160:0x02cc, B:163:0x02d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:167:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:169:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:180:0x0320  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x010f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0121 A[LOOP:3: B:48:0x0119->B:50:0x0121, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX WARN: Code duplicated, block: B:59:0x0168  */
    /* JADX WARN: Code duplicated, block: B:60:0x016d  */
    /* JADX WARN: Code duplicated, block: B:63:0x017b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193  */
    /* JADX WARN: Code duplicated, block: B:81:0x019f  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r17v0, types: [xe3.k] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r7v42, types: [tp.i] */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX INFO: renamed from: e */
    public final void m122587e(C0656u0 c0656u0, AbstractC0844t abstractC0844t) {
        boolean z4;
        ?? SingletonList;
        C0823a0 c0823a0M122584i;
        String strM131677b;
        AbstractC0844t c0840p;
        String strM1644m;
        String strM1644m2;
        AbstractC0844t abstractC0844tM122584i;
        C0823a0 c0823a0M122584i2;
        InterfaceC12001a interfaceC12001a;
        Object objSingletonList;
        C0690l0 c0690l0;
        int i13;
        ?? codePoint;
        C4320k c4320kM1743m;
        ArrayList arrayList;
        C0690l0 c0690l1;
        int i14;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        char cCharAt;
        int i15;
        char cCharAt2;
        ?? c34038i;
        C38241d c38241d;
        C38241d c38241d2;
        char cCharAt3;
        char cCharAt4;
        this.f163997e = new C0690l0(c0656u0.f2286a);
        this.f163998f = !c0656u0.m1646o().isEmpty();
        boolean z26 = false;
        this.f163999g = 0;
        String strM131677b2 = null;
        this.f164000h = null;
        this.f164001i = null;
        while (true) {
            char cM1742l = this.f163997e.m1742l();
            if (cM1742l != 0) {
                ?? codePoint2 = 10;
                if (cM1742l == '\n') {
                    z4 = z26;
                    this.f163997e.m1739i();
                    SingletonList = Collections.singletonList(this.f163999g >= 2 ? new C0834j() : new C0848x());
                } else if (cM1742l == '!') {
                    z4 = z26;
                    C4320k c4320kM1743m2 = this.f163997e.m1743m();
                    this.f163997e.m1739i();
                    if (this.f163997e.m1740j('[')) {
                        C4320k c4320kM1743m3 = this.f163997e.m1743m();
                        c0823a0M122584i = m122584i(this.f163997e.m1734d(c4320kM1743m2, c4320kM1743m3));
                        C38240c c38240c = this.f164001i;
                        C38240c c38240c2 = new C38240c(c0823a0M122584i, c4320kM1743m2, c4320kM1743m3, c38240c, this.f164000h, true);
                        if (c38240c != null) {
                            c38240c.f163951h = true;
                        }
                        this.f164001i = c38240c2;
                    } else {
                        C0690l0 c0690l2 = this.f163997e;
                        c0823a0M122584i = m122584i(c0690l2.m1734d(c4320kM1743m2, c0690l2.m1743m()));
                    }
                    SingletonList = Collections.singletonList(c0823a0M122584i);
                } else if (cM1742l == '[') {
                    z4 = z26;
                    C4320k c4320kM1743m4 = this.f163997e.m1743m();
                    this.f163997e.m1739i();
                    C4320k c4320kM1743m5 = this.f163997e.m1743m();
                    C0823a0 c0823a0M122584i3 = m122584i(this.f163997e.m1734d(c4320kM1743m4, c4320kM1743m5));
                    C38240c c38240c3 = this.f164001i;
                    C38240c c38240c4 = new C38240c(c0823a0M122584i3, c4320kM1743m4, c4320kM1743m5, c38240c3, this.f164000h, false);
                    if (c38240c3 != null) {
                        c38240c3.f163951h = true;
                    }
                    this.f164001i = c38240c4;
                    SingletonList = Collections.singletonList(c0823a0M122584i3);
                } else if (cM1742l != ']') {
                    if (this.f163993a.get(cM1742l)) {
                        List list = (List) this.f163996d.get(Character.valueOf(cM1742l));
                        if (list != null) {
                            C4320k c4320kM1743m6 = this.f163997e.m1743m();
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    C29205p c29205pMo126141a = ((InterfaceC39487g) it.next()).mo126141a(this);
                                    if (c29205pMo126141a != null) {
                                        AbstractC0844t abstractC0844t2 = (AbstractC0844t) c29205pMo126141a.f118204x;
                                        this.f163997e.m1744n((C4320k) c29205pMo126141a.f118205y);
                                        if (this.f163998f && abstractC0844t2.m2056e().isEmpty()) {
                                            C0690l0 c0690l3 = this.f163997e;
                                            abstractC0844t2.m2058h(c0690l3.m1734d(c4320kM1743m6, c0690l3.m1743m()).m1646o());
                                        }
                                        objSingletonList = Collections.singletonList(abstractC0844t2);
                                    } else {
                                        this.f163997e.m1744n(c4320kM1743m6);
                                    }
                                } else {
                                    interfaceC12001a = (InterfaceC12001a) this.f163994b.get(Character.valueOf(cM1742l));
                                    if (interfaceC12001a == null) {
                                        objSingletonList = Collections.singletonList(m122588f());
                                    } else {
                                        c0690l0 = this.f163997e;
                                        i13 = c0690l0.f2493d;
                                        if (i13 > 0) {
                                            int i16 = i13 - 1;
                                            cCharAt3 = ((C3205d) c0690l0.f2495f).f12559a.charAt(i16);
                                            if (Character.isLowSurrogate(cCharAt3) && i16 > 0) {
                                                cCharAt4 = ((C3205d) c0690l0.f2495f).f12559a.charAt(i13 - 2);
                                                codePoint = cCharAt3;
                                                if (Character.isHighSurrogate(cCharAt4)) {
                                                    codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                                }
                                            }
                                        } else if (c0690l0.f2492c > 0) {
                                            codePoint = 10;
                                        } else {
                                            codePoint = z26;
                                        }
                                        codePoint = cCharAt3;
                                        codePoint = cCharAt3;
                                        c4320kM1743m = this.f163997e.m1743m();
                                        if (this.f163997e.m1737g(cM1742l) < interfaceC12001a.mo33079c()) {
                                            this.f163997e.m1744n(c4320kM1743m);
                                            c34038i = strM131677b2;
                                        } else {
                                            arrayList = new ArrayList();
                                            this.f163997e.m1744n(c4320kM1743m);
                                            while (this.f163997e.m1740j(cM1742l)) {
                                                C0690l0 c0690l4 = this.f163997e;
                                                arrayList.add(m122584i(c0690l4.m1734d(c4320kM1743m, c0690l4.m1743m())));
                                                c4320kM1743m = this.f163997e.m1743m();
                                            }
                                            c0690l1 = this.f163997e;
                                            i14 = c0690l1.f2493d;
                                            if (i14 < c0690l1.f2494e) {
                                                cCharAt = ((C3205d) c0690l1.f2495f).f12559a.charAt(i14);
                                                if (Character.isHighSurrogate(cCharAt) && (i15 = c0690l1.f2493d + 1) < c0690l1.f2494e) {
                                                    cCharAt2 = ((C3205d) c0690l1.f2495f).f12559a.charAt(i15);
                                                    if (Character.isLowSurrogate(cCharAt2)) {
                                                        codePoint2 = cCharAt;
                                                        codePoint2 = cCharAt;
                                                        codePoint2 = cCharAt;
                                                        codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                                    }
                                                }
                                            } else if (c0690l1.f2492c >= ((List) c0690l1.f2491b).size() - 1) {
                                                codePoint2 = z26;
                                            }
                                            if (codePoint != 0 || AbstractC32098d.m99845k(codePoint)) {
                                                z13 = true;
                                            } else {
                                                z13 = z26;
                                            }
                                            if (codePoint != 0 || AbstractC32098d.m99846l(codePoint)) {
                                                z14 = true;
                                            } else {
                                                z14 = z26;
                                            }
                                            if (codePoint2 != 0 || AbstractC32098d.m99845k(codePoint2)) {
                                                z15 = true;
                                            } else {
                                                z15 = z26;
                                            }
                                            if (codePoint2 != 0 || AbstractC32098d.m99846l(codePoint2)) {
                                                z16 = true;
                                            } else {
                                                z16 = z26;
                                            }
                                            if (z16 && (!z15 || z14 || z13)) {
                                                z17 = true;
                                            } else {
                                                z17 = z26;
                                            }
                                            if (z14 && (!z13 || z16 || z15)) {
                                                z18 = true;
                                            } else {
                                                z18 = z26;
                                            }
                                            if (cM1742l == '_') {
                                                if (z17 || (z18 && !z13)) {
                                                    z25 = z26;
                                                } else {
                                                    z25 = true;
                                                }
                                                if (z18 || (z17 && !z15)) {
                                                    z24 = z26;
                                                } else {
                                                    z24 = true;
                                                }
                                            } else {
                                                if (z17 || cM1742l != interfaceC12001a.mo33080d()) {
                                                    z19 = z26;
                                                } else {
                                                    z19 = true;
                                                }
                                                if (z18 || cM1742l != interfaceC12001a.mo33078b()) {
                                                    z24 = z26;
                                                } else {
                                                    z24 = true;
                                                }
                                                z25 = z19;
                                            }
                                            c34038i = new C34038i(arrayList, z25, z24);
                                        }
                                        if (c34038i == 0) {
                                            objSingletonList = strM131677b2;
                                        } else {
                                            ArrayList arrayList2 = c34038i.f142700a;
                                            c38241d = new C38241d(arrayList2, cM1742l, c34038i.f142702c, c34038i.f142701b, this.f164000h);
                                            this.f164000h = c38241d;
                                            c38241d2 = c38241d.f163957f;
                                            if (c38241d2 != null) {
                                                c38241d2.f163958g = c38241d;
                                            }
                                            objSingletonList = arrayList2;
                                        }
                                        if (objSingletonList == null) {
                                            objSingletonList = Collections.singletonList(m122588f());
                                        }
                                    }
                                }
                            }
                        } else {
                            interfaceC12001a = (InterfaceC12001a) this.f163994b.get(Character.valueOf(cM1742l));
                            if (interfaceC12001a == null) {
                                objSingletonList = Collections.singletonList(m122588f());
                            } else {
                                c0690l0 = this.f163997e;
                                i13 = c0690l0.f2493d;
                                if (i13 > 0) {
                                    int i17 = i13 - 1;
                                    cCharAt3 = ((C3205d) c0690l0.f2495f).f12559a.charAt(i17);
                                    if (Character.isLowSurrogate(cCharAt3)) {
                                        cCharAt4 = ((C3205d) c0690l0.f2495f).f12559a.charAt(i13 - 2);
                                        codePoint = cCharAt3;
                                        if (Character.isHighSurrogate(cCharAt4)) {
                                            codePoint = Character.toCodePoint(cCharAt4, cCharAt3);
                                        }
                                    }
                                } else if (c0690l0.f2492c > 0) {
                                    codePoint = 10;
                                } else {
                                    codePoint = z26;
                                }
                                codePoint = cCharAt3;
                                codePoint = cCharAt3;
                                c4320kM1743m = this.f163997e.m1743m();
                                if (this.f163997e.m1737g(cM1742l) < interfaceC12001a.mo33079c()) {
                                    this.f163997e.m1744n(c4320kM1743m);
                                    c34038i = strM131677b2;
                                } else {
                                    arrayList = new ArrayList();
                                    this.f163997e.m1744n(c4320kM1743m);
                                    while (this.f163997e.m1740j(cM1742l)) {
                                        C0690l0 c0690l5 = this.f163997e;
                                        arrayList.add(m122584i(c0690l5.m1734d(c4320kM1743m, c0690l5.m1743m())));
                                        c4320kM1743m = this.f163997e.m1743m();
                                    }
                                    c0690l1 = this.f163997e;
                                    i14 = c0690l1.f2493d;
                                    if (i14 < c0690l1.f2494e) {
                                        cCharAt = ((C3205d) c0690l1.f2495f).f12559a.charAt(i14);
                                        if (Character.isHighSurrogate(cCharAt)) {
                                            cCharAt2 = ((C3205d) c0690l1.f2495f).f12559a.charAt(i15);
                                            if (Character.isLowSurrogate(cCharAt2)) {
                                                codePoint2 = cCharAt;
                                                codePoint2 = cCharAt;
                                                codePoint2 = cCharAt;
                                                codePoint2 = Character.toCodePoint(cCharAt, cCharAt2);
                                            }
                                        }
                                    } else if (c0690l1.f2492c >= ((List) c0690l1.f2491b).size() - 1) {
                                        codePoint2 = z26;
                                    }
                                    if (codePoint != 0) {
                                        z13 = true;
                                    } else {
                                        z13 = true;
                                    }
                                    if (codePoint != 0) {
                                        z14 = true;
                                    } else {
                                        z14 = true;
                                    }
                                    if (codePoint2 != 0) {
                                        z15 = true;
                                    } else {
                                        z15 = true;
                                    }
                                    if (codePoint2 != 0) {
                                        z16 = true;
                                    } else {
                                        z16 = true;
                                    }
                                    if (z16) {
                                        z17 = z26;
                                    } else {
                                        z17 = z26;
                                    }
                                    if (z14) {
                                        z18 = z26;
                                    } else {
                                        z18 = z26;
                                    }
                                    if (cM1742l == '_') {
                                        if (z17) {
                                            z25 = z26;
                                        } else {
                                            z25 = z26;
                                        }
                                        if (z18) {
                                            z24 = z26;
                                        } else {
                                            z24 = z26;
                                        }
                                    } else {
                                        if (z17) {
                                            z19 = z26;
                                        } else {
                                            z19 = z26;
                                        }
                                        if (z18) {
                                            z24 = z26;
                                        } else {
                                            z24 = z26;
                                        }
                                        z25 = z19;
                                    }
                                    c34038i = new C34038i(arrayList, z25, z24);
                                }
                                if (c34038i == 0) {
                                    objSingletonList = strM131677b2;
                                } else {
                                    ArrayList arrayList3 = c34038i.f142700a;
                                    c38241d = new C38241d(arrayList3, cM1742l, c34038i.f142702c, c34038i.f142701b, this.f164000h);
                                    this.f164000h = c38241d;
                                    c38241d2 = c38241d.f163957f;
                                    if (c38241d2 != null) {
                                        c38241d2.f163958g = c38241d;
                                    }
                                    objSingletonList = arrayList3;
                                }
                                if (objSingletonList == null) {
                                    objSingletonList = Collections.singletonList(m122588f());
                                }
                            }
                        }
                    } else {
                        objSingletonList = Collections.singletonList(m122588f());
                    }
                    z4 = z26;
                    SingletonList = objSingletonList;
                } else {
                    C4320k c4320kM1743m7 = this.f163997e.m1743m();
                    this.f163997e.m1739i();
                    C4320k c4320kM1743m8 = this.f163997e.m1743m();
                    C38240c c38240c5 = this.f164001i;
                    if (c38240c5 == null) {
                        c0823a0M122584i2 = m122584i(this.f163997e.m1734d(c4320kM1743m7, c4320kM1743m8));
                    } else {
                        C0823a0 c0823a0 = c38240c5.f163944a;
                        boolean z27 = c38240c5.f163947d;
                        if (c38240c5.f163950g) {
                            if (this.f163997e.m1740j('(')) {
                                this.f163997e.m1745o();
                                C0690l0 c0690l6 = this.f163997e;
                                char cM1742l2 = c0690l6.m1742l();
                                C4320k c4320kM1743m9 = c0690l6.m1743m();
                                if (AbstractC32076h.m99779l(c0690l6)) {
                                    if (cM1742l2 == '<') {
                                        String strM1644m3 = c0690l6.m1734d(c4320kM1743m9, c0690l6.m1743m()).m1644m();
                                        strM1644m2 = strM1644m3.substring(1, strM1644m3.length() - 1);
                                    } else {
                                        strM1644m2 = c0690l6.m1734d(c4320kM1743m9, c0690l6.m1743m()).m1644m();
                                    }
                                    strM131677b2 = AbstractC40598b.m131677b(strM1644m2);
                                }
                                if (strM131677b2 == null) {
                                    this.f163997e.m1744n(c4320kM1743m8);
                                    strM131677b = null;
                                } else {
                                    if (this.f163997e.m1745o() >= 1) {
                                        C0690l0 c0690l7 = this.f163997e;
                                        C4320k c4320kM1743m10 = c0690l7.m1743m();
                                        if (c0690l7.m1735e()) {
                                            char cM1742l3 = c0690l7.m1742l();
                                            char c3 = '\"';
                                            if (cM1742l3 != '\"') {
                                                c3 = '\'';
                                                if (cM1742l3 == '\'') {
                                                    c0690l7.m1739i();
                                                    if (!AbstractC32076h.m99781o(c0690l7, c3) && c0690l7.m1735e()) {
                                                        c0690l7.m1739i();
                                                        String strM1644m4 = c0690l7.m1734d(c4320kM1743m10, c0690l7.m1743m()).m1644m();
                                                        strM131677b = AbstractC40598b.m131677b(strM1644m4.substring(1, strM1644m4.length() - 1));
                                                    } else {
                                                        strM131677b = null;
                                                    }
                                                } else if (cM1742l3 != '(') {
                                                    strM131677b = null;
                                                } else {
                                                    c3 = ')';
                                                    c0690l7.m1739i();
                                                    if (AbstractC32076h.m99781o(c0690l7, c3)) {
                                                        strM131677b = null;
                                                    } else {
                                                        c0690l7.m1739i();
                                                        String strM1644m5 = c0690l7.m1734d(c4320kM1743m10, c0690l7.m1743m()).m1644m();
                                                        strM131677b = AbstractC40598b.m131677b(strM1644m5.substring(1, strM1644m5.length() - 1));
                                                    }
                                                }
                                            } else {
                                                c0690l7.m1739i();
                                                if (AbstractC32076h.m99781o(c0690l7, c3)) {
                                                    strM131677b = null;
                                                } else {
                                                    c0690l7.m1739i();
                                                    String strM1644m6 = c0690l7.m1734d(c4320kM1743m10, c0690l7.m1743m()).m1644m();
                                                    strM131677b = AbstractC40598b.m131677b(strM1644m6.substring(1, strM1644m6.length() - 1));
                                                }
                                            }
                                        } else {
                                            strM131677b = null;
                                        }
                                        this.f163997e.m1745o();
                                    } else {
                                        strM131677b = null;
                                    }
                                    if (!this.f163997e.m1740j(')')) {
                                        this.f163997e.m1744n(c4320kM1743m8);
                                        strM131677b = null;
                                        strM131677b2 = null;
                                    }
                                }
                            } else {
                                strM131677b = null;
                                strM131677b2 = null;
                            }
                            if (strM131677b2 == null) {
                                C0690l0 c0690l8 = this.f163997e;
                                if (c0690l8.m1740j('[')) {
                                    C4320k c4320kM1743m11 = c0690l8.m1743m();
                                    if (AbstractC32076h.m99780n(c0690l8)) {
                                        C4320k c4320kM1743m12 = c0690l8.m1743m();
                                        if (c0690l8.m1740j(']')) {
                                            strM1644m = c0690l8.m1734d(c4320kM1743m11, c4320kM1743m12).m1644m();
                                            if (strM1644m.length() > 999) {
                                                strM1644m = null;
                                            }
                                        } else {
                                            strM1644m = null;
                                        }
                                    } else {
                                        strM1644m = null;
                                    }
                                } else {
                                    strM1644m = null;
                                }
                                if (strM1644m == null) {
                                    this.f163997e.m1744n(c4320kM1743m8);
                                }
                                if ((strM1644m == null || strM1644m.isEmpty()) && !c38240c5.f163951h) {
                                    strM1644m = this.f163997e.m1734d(c38240c5.f163946c, c4320kM1743m7).m1644m();
                                }
                                if (strM1644m != null) {
                                    C3278p c3278p = (C3278p) this.f163995c.f118205y;
                                    c3278p.getClass();
                                    C0841q c0841q = (C0841q) c3278p.f12803a.get(AbstractC40598b.m131676a(strM1644m));
                                    if (c0841q != null) {
                                        strM131677b2 = c0841q.f3035h;
                                        strM131677b = c0841q.f3036i;
                                    }
                                }
                            }
                            if (strM131677b2 != null) {
                                if (z27) {
                                    C0838n c0838n = new C0838n();
                                    c0838n.f3029g = strM131677b2;
                                    c0838n.f3030h = strM131677b;
                                    c0840p = c0838n;
                                } else {
                                    c0840p = new C0840p(strM131677b2, strM131677b);
                                }
                                AbstractC0844t abstractC0844t3 = c0823a0.f3042e;
                                while (abstractC0844t3 != null) {
                                    AbstractC0844t abstractC0844t4 = abstractC0844t3.f3042e;
                                    c0840p.m2055c(abstractC0844t3);
                                    abstractC0844t3 = abstractC0844t4;
                                }
                                if (this.f163998f) {
                                    C0690l0 c0690l9 = this.f163997e;
                                    c0840p.m2058h(c0690l9.m1734d(c38240c5.f163945b, c0690l9.m1743m()).m1646o());
                                }
                                m122589g(c38240c5.f163949f);
                                m122585c(c0840p);
                                c0823a0.m2059j();
                                C38240c c38240c6 = this.f164001i.f163948e;
                                this.f164001i = c38240c6;
                                if (!z27) {
                                    while (c38240c6 != null) {
                                        if (!c38240c6.f163947d) {
                                            c38240c6.f163950g = false;
                                        }
                                        c38240c6 = c38240c6.f163948e;
                                    }
                                }
                                z4 = false;
                                abstractC0844tM122584i = c0840p;
                            } else {
                                z4 = false;
                                this.f164001i = this.f164001i.f163948e;
                                this.f163997e.m1744n(c4320kM1743m8);
                                abstractC0844tM122584i = m122584i(this.f163997e.m1734d(c4320kM1743m7, c4320kM1743m8));
                            }
                        } else {
                            this.f164001i = c38240c5.f163948e;
                            c0823a0M122584i2 = m122584i(this.f163997e.m1734d(c4320kM1743m7, c4320kM1743m8));
                        }
                        SingletonList = Collections.singletonList(abstractC0844tM122584i);
                    }
                    z4 = z26;
                    abstractC0844tM122584i = c0823a0M122584i2;
                    SingletonList = Collections.singletonList(abstractC0844tM122584i);
                }
            } else {
                z4 = z26;
                SingletonList = 0;
            }
            if (SingletonList == 0) {
                m122589g(null);
                m122585c(abstractC0844t);
                return;
            } else {
                Iterator it3 = SingletonList.iterator();
                while (it3.hasNext()) {
                    abstractC0844t.m2055c((AbstractC0844t) it3.next());
                }
                z26 = z4;
                strM131677b2 = null;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final C0823a0 m122588f() {
        char cM1742l;
        C4320k c4320kM1743m = this.f163997e.m1743m();
        this.f163997e.m1739i();
        while (true) {
            cM1742l = this.f163997e.m1742l();
            if (cM1742l == 0 || this.f163993a.get(cM1742l)) {
                break;
            }
            this.f163997e.m1739i();
        }
        C0690l0 c0690l0 = this.f163997e;
        C0656u0 c0656u0M1734d = c0690l0.m1734d(c4320kM1743m, c0690l0.m1743m());
        String strM1644m = c0656u0M1734d.m1644m();
        if (cM1742l == '\n') {
            int length = strM1644m.length() - 1;
            while (true) {
                if (length < 0) {
                    length = -1;
                    break;
                }
                if (strM1644m.charAt(length) != ' ') {
                    break;
                }
                length--;
            }
            int i13 = length + 1;
            this.f163999g = strM1644m.length() - i13;
            strM1644m = strM1644m.substring(0, i13);
        } else if (cM1742l == 0) {
            strM1644m = strM1644m.substring(0, AbstractC32098d.m99852s(strM1644m, strM1644m.length() - 1, 0) + 1);
        }
        C0823a0 c0823a0 = new C0823a0(strM1644m);
        c0823a0.m2058h(c0656u0M1734d.m1646o());
        return c0823a0;
    }

    /* JADX INFO: renamed from: g */
    public final void m122589g(C38241d c38241d) {
        boolean z4;
        HashMap map = new HashMap();
        C38241d c38241d2 = this.f164000h;
        while (c38241d2 != null) {
            C38241d c38241d3 = c38241d2.f163957f;
            if (c38241d3 == c38241d) {
                break;
            } else {
                c38241d2 = c38241d3;
            }
        }
        while (c38241d2 != null) {
            ArrayList arrayList = c38241d2.f163952a;
            char c3 = c38241d2.f163953b;
            InterfaceC12001a interfaceC12001a = (InterfaceC12001a) this.f163994b.get(Character.valueOf(c3));
            if (!c38241d2.f163956e || interfaceC12001a == null) {
                c38241d2 = c38241d2.f163958g;
            } else {
                char cMo33080d = interfaceC12001a.mo33080d();
                C38241d c38241d4 = c38241d2.f163957f;
                int iMo33077a = 0;
                boolean z13 = false;
                while (true) {
                    if (c38241d4 == null || c38241d4 == c38241d || c38241d4 == map.get(Character.valueOf(c3))) {
                        z4 = false;
                        break;
                    }
                    if (c38241d4.f163955d && c38241d4.f163953b == cMo33080d) {
                        iMo33077a = interfaceC12001a.mo33077a(c38241d4, c38241d2);
                        if (iMo33077a > 0) {
                            z4 = true;
                            z13 = true;
                            break;
                        }
                        z13 = true;
                    }
                    c38241d4 = c38241d4.f163957f;
                }
                if (z4) {
                    for (int i13 = 0; i13 < iMo33077a; i13++) {
                        ArrayList arrayList2 = c38241d4.f163952a;
                        ((C0823a0) arrayList2.remove(arrayList2.size() - 1)).m2059j();
                    }
                    for (int i14 = 0; i14 < iMo33077a; i14++) {
                        ((C0823a0) arrayList.remove(0)).m2059j();
                    }
                    C38241d c38241d5 = c38241d2.f163957f;
                    while (c38241d5 != null && c38241d5 != c38241d4) {
                        C38241d c38241d6 = c38241d5.f163957f;
                        m122590h(c38241d5);
                        c38241d5 = c38241d6;
                    }
                    if (c38241d4.f163952a.size() == 0) {
                        m122590h(c38241d4);
                    }
                    if (arrayList.size() == 0) {
                        C38241d c38241d7 = c38241d2.f163958g;
                        m122590h(c38241d2);
                        c38241d2 = c38241d7;
                    }
                } else {
                    if (!z13) {
                        map.put(Character.valueOf(c3), c38241d2.f163957f);
                        if (!c38241d2.f163955d) {
                            m122590h(c38241d2);
                        }
                    }
                    c38241d2 = c38241d2.f163958g;
                }
            }
        }
        while (true) {
            C38241d c38241d8 = this.f164000h;
            if (c38241d8 == null || c38241d8 == c38241d) {
                return;
            } else {
                m122590h(c38241d8);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m122590h(C38241d c38241d) {
        C38241d c38241d2 = c38241d.f163957f;
        if (c38241d2 != null) {
            c38241d2.f163958g = c38241d.f163958g;
        }
        C38241d c38241d3 = c38241d.f163958g;
        if (c38241d3 == null) {
            this.f164000h = c38241d2;
        } else {
            c38241d3.f163957f = c38241d2;
        }
    }
}
