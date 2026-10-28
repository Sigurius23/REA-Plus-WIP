package p108e4;

import android.util.Log;
import androidx.compose.p018ui.layout.AbstractC1131a;
import e93.AbstractC12889b;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jh3.AbstractC21702c;
import l83.C23454a0;
import p002a0.C0046q;
import p005a3.C0237p;
import p027b3.C2375f3;
import p136f4.C14051c;
import p242j4.C21302b;
import p242j4.C21306f;
import p242j4.C21307g;
import p242j4.C21311k;
import p242j4.InterfaceC21308h;
import p272k4.C22183g;
import p319m4.AbstractC25021j;
import p319m4.AbstractC25023l;
import p319m4.C25014c;
import p319m4.C25016e;
import p319m4.C25017f;
import p333n4.C26246b;
import p333n4.C26250f;
import p333n4.InterfaceC26247c;
import p635y2.AbstractC39083d;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.InterfaceC39124q0;
import p636y3.AbstractC39170b;
import p636y3.AbstractC39177i;
import p636y3.C39169a;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: e4.r */
/* JADX INFO: loaded from: classes.dex */
public final class C12684r implements InterfaceC26247c {

    /* JADX INFO: renamed from: a */
    public final C25017f f43369a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f43370b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f43371c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f43372d;

    /* JADX INFO: renamed from: e */
    public final C12685s f43373e;

    /* JADX INFO: renamed from: f */
    public final int[] f43374f;

    /* JADX INFO: renamed from: g */
    public final int[] f43375g;

    public C12684r(InterfaceC39171c interfaceC39171c) {
        C25017f c25017f = new C25017f(0, 0);
        c25017f.f97963r0 = new ArrayList();
        c25017f.f97964s0 = new C0237p(c25017f);
        C26250f c26250f = new C26250f(c25017f);
        c25017f.f97965t0 = c26250f;
        c25017f.f97967v0 = null;
        c25017f.f97968w0 = false;
        c25017f.f97969x0 = new C14051c();
        c25017f.f97950A0 = 0;
        c25017f.f97951B0 = 0;
        c25017f.f97952C0 = new C25014c[4];
        c25017f.f97953D0 = new C25014c[4];
        c25017f.f97954E0 = 257;
        c25017f.f97955F0 = false;
        c25017f.f97956G0 = false;
        c25017f.f97957H0 = null;
        c25017f.f97958I0 = null;
        c25017f.f97959J0 = null;
        c25017f.f97960K0 = null;
        c25017f.f97961L0 = new HashSet();
        c25017f.f97962M0 = new C26246b();
        c25017f.f97967v0 = this;
        c26250f.f104378h = this;
        this.f43369a = c25017f;
        this.f43370b = new LinkedHashMap();
        this.f43371c = new LinkedHashMap();
        this.f43372d = new LinkedHashMap();
        this.f43373e = new C12685s(interfaceC39171c);
        this.f43374f = new int[2];
        this.f43375g = new int[2];
        new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public static void m35487d(int i13, int i14, int i15, int i16, boolean z4, boolean z13, int i17, int[] iArr) {
        int iM35485e = AbstractC12682p.m35485e(i13);
        if (iM35485e == 0) {
            iArr[0] = i14;
            iArr[1] = i14;
            return;
        }
        if (iM35485e == 1) {
            iArr[0] = 0;
            iArr[1] = i17;
            return;
        }
        if (iM35485e != 2) {
            if (iM35485e != 3) {
                throw new IllegalStateException(AbstractC21702c.m61129B(i13).concat(" is not supported").toString());
            }
            iArr[0] = i17;
            iArr[1] = i17;
            return;
        }
        boolean z14 = z13 || ((i16 == 1 || i16 == 2) && (i16 == 2 || i15 != 1 || z4));
        iArr[0] = z14 ? i14 : 0;
        if (!z14) {
            i14 = i17;
        }
        iArr[1] = i14;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01a3  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p333n4.InterfaceC26247c
    /* JADX INFO: renamed from: a */
    public final void mo3624a(C25016e c25016e, C26246b c26246b) {
        char c3;
        boolean z4;
        boolean z13;
        int iMo450c0;
        char c7;
        Object obj;
        String str = c25016e.f97927k;
        LinkedHashMap linkedHashMap = this.f43371c;
        Integer[] numArr = (Integer[]) linkedHashMap.get(str);
        int i13 = c26246b.f104359a;
        int i14 = c26246b.f104361c;
        int i15 = c25016e.f97942s;
        int i16 = c26246b.f104368j;
        boolean z14 = true;
        if ((numArr != null ? numArr[1].intValue() : 0) != c25016e.m73441l()) {
            z14 = false;
        }
        boolean zMo73394B = c25016e.mo73394B();
        C12685s c12685s = this.f43373e;
        m35487d(i13, i14, i15, i16, z14, zMo73394B, C39169a.m124765i(c12685s.f43387l), this.f43374f);
        m35487d(c26246b.f104360b, c26246b.f104362d, c25016e.f97943t, c26246b.f104368j, (numArr != null ? numArr[0].intValue() : 0) == c25016e.m73445r(), c25016e.mo73395C(), C39169a.m124764h(c12685s.f43387l), this.f43375g);
        int[] iArr = this.f43374f;
        int i17 = iArr[0];
        int i18 = iArr[1];
        int[] iArr2 = this.f43375g;
        long jM124769a = AbstractC39170b.m124769a(i17, i18, iArr2[0], iArr2[1]);
        int i19 = c26246b.f104368j;
        if (i19 != 1 && i19 != 2 && c26246b.f104359a == 3 && c25016e.f97942s == 0 && c26246b.f104360b == 3 && c25016e.f97943t == 0) {
            c3 = 2;
        } else {
            long jM35488c = m35488c(c25016e, jM124769a);
            c25016e.f97919g = false;
            int i24 = (int) (jM35488c >> 32);
            Integer numValueOf = Integer.valueOf(i24);
            int i25 = c25016e.f97945v;
            Integer numValueOf2 = i25 > 0 ? Integer.valueOf(i25) : null;
            c3 = 2;
            int i26 = c25016e.f97946w;
            int iIntValue = ((Number) AbstractC12889b.m36289s(numValueOf, numValueOf2, i26 > 0 ? Integer.valueOf(i26) : null)).intValue();
            int i27 = (int) (jM35488c & 4294967295L);
            Integer numValueOf3 = Integer.valueOf(i27);
            int i28 = c25016e.f97948y;
            Integer numValueOf4 = Integer.valueOf(i28);
            if (i28 <= 0) {
                numValueOf4 = null;
            }
            int i29 = c25016e.f97949z;
            int iIntValue2 = ((Number) AbstractC12889b.m36289s(numValueOf3, numValueOf4, i29 > 0 ? Integer.valueOf(i29) : null)).intValue();
            if (iIntValue != i24) {
                jM124769a = AbstractC39170b.m124769a(iIntValue, iIntValue, C39169a.m124766j(jM124769a), C39169a.m124764h(jM124769a));
                z4 = true;
            } else {
                z4 = false;
            }
            if (iIntValue2 != i27) {
                jM124769a = AbstractC39170b.m124769a(C39169a.m124767k(jM124769a), C39169a.m124765i(jM124769a), iIntValue2, iIntValue2);
                z13 = true;
            } else {
                z13 = z4;
            }
            if (z13) {
                m35488c(c25016e, jM124769a);
                c25016e.f97919g = false;
            }
        }
        AbstractC39104j1 abstractC39104j1 = (AbstractC39104j1) this.f43370b.get(c25016e.f97920g0);
        c26246b.f104363e = abstractC39104j1 != null ? abstractC39104j1.f168211w : c25016e.m73445r();
        c26246b.f104364f = abstractC39104j1 != null ? abstractC39104j1.f168212x : c25016e.m73441l();
        if (abstractC39104j1 != null) {
            ArrayList arrayList = c12685s.f43384i;
            if (c12685s.f43385j) {
                arrayList.clear();
                Iterator it = c12685s.f43383h.iterator();
                while (it.hasNext()) {
                    C25016e c25016eMo59809a = ((InterfaceC21308h) c12685s.f43378c.get(it.next())).mo59809a();
                    if (c25016eMo59809a != null) {
                        arrayList.add(c25016eMo59809a);
                    }
                }
                c12685s.f43385j = false;
            }
            if (arrayList.contains(c25016e)) {
                iMo450c0 = abstractC39104j1.mo450c0(AbstractC39083d.f168140a);
            } else {
                iMo450c0 = Integer.MIN_VALUE;
            }
        } else {
            iMo450c0 = Integer.MIN_VALUE;
        }
        c26246b.f104366h = iMo450c0 != Integer.MIN_VALUE;
        c26246b.f104365g = iMo450c0;
        Object obj2 = linkedHashMap.get(str);
        if (obj2 == null) {
            Integer[] numArr2 = new Integer[3];
            c7 = 0;
            numArr2[0] = 0;
            numArr2[1] = 0;
            numArr2[c3] = Integer.MIN_VALUE;
            linkedHashMap.put(str, numArr2);
            obj = numArr2;
        } else {
            c7 = 0;
            obj = obj2;
        }
        Integer[] numArr3 = (Integer[]) obj;
        numArr3[c7] = Integer.valueOf(c26246b.f104363e);
        numArr3[1] = Integer.valueOf(c26246b.f104364f);
        numArr3[c3] = Integer.valueOf(c26246b.f104365g);
        c26246b.f104367i = (c26246b.f104363e == c26246b.f104361c && c26246b.f104364f == c26246b.f104362d) ? c7 : 1;
    }

    @Override // p333n4.InterfaceC26247c
    /* JADX INFO: renamed from: b */
    public final void mo3625b() {
    }

    /* JADX INFO: renamed from: c */
    public final long m35488c(C25016e c25016e, long j7) {
        int i13;
        Object obj = c25016e.f97920g0;
        String str = c25016e.f97927k;
        int i14 = 0;
        if (!(c25016e instanceof AbstractC25023l)) {
            if (obj instanceof InterfaceC39124q0) {
                AbstractC39104j1 abstractC39104j1Mo448T = ((InterfaceC39124q0) obj).mo448T(j7);
                this.f43370b.put(obj, abstractC39104j1Mo448T);
                return C0046q.m97a(abstractC39104j1Mo448T.f168211w, abstractC39104j1Mo448T.f168212x);
            }
            Log.w("CCL", "Nothing to measure for widget: " + str);
            return C0046q.m97a(0, 0);
        }
        if (C39169a.m124763g(j7)) {
            i13 = 1073741824;
        } else {
            i13 = C39169a.m124761e(j7) ? Integer.MIN_VALUE : 0;
        }
        if (C39169a.m124762f(j7)) {
            i14 = 1073741824;
        } else if (C39169a.m124760d(j7)) {
            i14 = Integer.MIN_VALUE;
        }
        AbstractC25023l abstractC25023l = (AbstractC25023l) c25016e;
        abstractC25023l.mo67542Y(i13, C39169a.m124765i(j7), i14, C39169a.m124764h(j7));
        return C0046q.m97a(abstractC25023l.f98024A0, abstractC25023l.f98025B0);
    }

    /* JADX INFO: renamed from: e */
    public final void m35489e(AbstractC39101i1 abstractC39101i1, List list) {
        InterfaceC39124q0 interfaceC39124q0;
        AbstractC39104j1 abstractC39104j1;
        Object next;
        LinkedHashMap linkedHashMap = this.f43372d;
        if (linkedHashMap.isEmpty()) {
            ArrayList arrayList = this.f43369a.f97963r0;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                C25016e c25016e = (C25016e) arrayList.get(i13);
                Object obj = c25016e.f97920g0;
                if (obj instanceof InterfaceC39124q0) {
                    C21311k c21311k = c25016e.f97925j;
                    C25016e c25016e2 = c21311k.f81480a;
                    if (c25016e2 != null) {
                        c21311k.f81481b = c25016e2.m73446s();
                        c21311k.f81482c = c25016e2.m73447t();
                        c25016e2.m73446s();
                        c25016e2.m73447t();
                        c21311k.m59834a(c25016e2.f97925j);
                    }
                    linkedHashMap.put(obj, new C21311k(c21311k));
                }
            }
        }
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            InterfaceC39124q0 interfaceC39124q1 = (InterfaceC39124q0) list.get(i14);
            if (linkedHashMap.containsKey(interfaceC39124q1)) {
                interfaceC39124q0 = interfaceC39124q1;
            } else {
                Iterator it = linkedHashMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    InterfaceC39124q0 interfaceC39124q2 = (InterfaceC39124q0) next;
                    if (AbstractC1131a.m3497a(interfaceC39124q2) != null && AbstractC22676k.m65745e(AbstractC1131a.m3497a(interfaceC39124q2), AbstractC1131a.m3497a(interfaceC39124q1))) {
                        break;
                    }
                }
                interfaceC39124q0 = (InterfaceC39124q0) next;
                if (interfaceC39124q0 == null) {
                    continue;
                }
            }
            C21311k c21311k2 = (C21311k) linkedHashMap.get(interfaceC39124q0);
            if (c21311k2 == null || (abstractC39104j1 = (AbstractC39104j1) this.f43370b.get(interfaceC39124q0)) == null) {
                return;
            }
            if (linkedHashMap.containsKey(interfaceC39124q1)) {
                AbstractC21478l0.m60414T(abstractC39101i1, abstractC39104j1, c21311k2);
            } else {
                int i15 = abstractC39104j1.f168211w;
                int i16 = abstractC39104j1.f168212x;
                if (!((i16 >= 0) & (i15 >= 0))) {
                    AbstractC39177i.m124789a("width and height must be >= 0");
                }
                AbstractC21478l0.m60414T(abstractC39101i1, interfaceC39124q1.mo448T(AbstractC39170b.m124776h(i15, i15, i16, i16)), c21311k2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public final long m35490f(long j7, EnumC39181m enumC39181m, C12679m c12679m, List list, int i13) {
        C21306f c21306f;
        C21306f c21306f2;
        int i14;
        C21307g c21307g;
        AbstractC25021j abstractC25021jMo59831s;
        AbstractC25021j abstractC25021jMo59831s2;
        if (list.isEmpty()) {
            return AbstractC35744b.m113228a(C39169a.m124767k(j7), C39169a.m124766j(j7));
        }
        boolean zM124763g = C39169a.m124763g(j7);
        String str = C21306f.f81458i;
        if (zM124763g) {
            c21306f = C21306f.m59826b(C39169a.m124765i(j7));
        } else {
            c21306f = new C21306f(str);
            int iM124767k = C39169a.m124767k(j7);
            if (iM124767k >= 0) {
                c21306f.f81463a = iM124767k;
            }
        }
        C12685s c12685s = this.f43373e;
        C21302b c21302b = c12685s.f43381f;
        HashMap map = c12685s.f43379d;
        HashMap map2 = c12685s.f43378c;
        C21302b c21302b2 = c12685s.f43381f;
        c21302b.f81420d0 = c21306f;
        if (C39169a.m124762f(j7)) {
            c21306f2 = C21306f.m59826b(C39169a.m124764h(j7));
        } else {
            c21306f2 = new C21306f(str);
            int iM124766j = C39169a.m124766j(j7);
            if (iM124766j >= 0) {
                c21306f2.f81463a = iM124766j;
            }
        }
        c21302b2.f81422e0 = c21306f2;
        C21306f c21306f3 = c21302b2.f81420d0;
        C25017f c25017f = this.f43369a;
        int i15 = 0;
        c21306f3.m59828a(c25017f, 0);
        c21302b2.f81422e0.m59828a(c25017f, 1);
        c12685s.f43387l = j7;
        c12685s.f43377b = !(enumC39181m == EnumC39181m.f168424x);
        this.f43370b.clear();
        this.f43371c.clear();
        this.f43372d.clear();
        ArrayList arrayList = c12679m.f43358F;
        if (!c12679m.f43362z && list.size() == arrayList.size()) {
            int size = list.size();
            int i16 = 0;
            while (true) {
                if (i16 < size) {
                    Object objMo454p = ((InterfaceC39124q0) list.get(i16)).mo454p();
                    i14 = i15;
                    if (!AbstractC22676k.m65745e(objMo454p instanceof C12675i ? (C12675i) objMo454p : null, arrayList.get(i16))) {
                        break;
                    }
                    i16++;
                    i15 = i14;
                } else {
                    AbstractC21478l0.m60441l(c12685s, list);
                }
                c25017f.m73429S(C39169a.m124765i(j7));
                c25017f.m73424N(C39169a.m124764h(j7));
                c25017f.f97964s0.m696a0(c25017f);
                c25017f.f97954E0 = i13;
                C14051c.f50153q = c25017f.m73461c0(512);
                c25017f.m73460a0(c25017f.f97954E0, 0, 0, 0, 0, 0, 0);
                return AbstractC35744b.m113228a(c25017f.m73445r(), c25017f.m73441l());
            }
        }
        i14 = 0;
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            ((InterfaceC21308h) map2.get(it.next())).mo59809a().mo73416D();
        }
        map2.clear();
        map2.put(Integer.valueOf(i14), c21302b2);
        map.clear();
        c12685s.f43380e.clear();
        c12685s.f43383h.clear();
        c12685s.f43385j = true;
        c12679m.f43358F.clear();
        c12679m.f43361y.m128204d(new C2375f3(list, c12679m, c12685s, 1), c12679m.f43357E, C23454a0.f92919a);
        boolean z4 = i14;
        c12679m.f43362z = z4;
        AbstractC21478l0.m60441l(c12685s, list);
        c25017f.f97963r0.clear();
        c21302b2.f81420d0.m59828a(c25017f, z4 ? 1 : 0);
        c21302b2.f81422e0.m59828a(c25017f, 1);
        for (Object obj : map.keySet()) {
            AbstractC25021j abstractC25021jMo59831s3 = ((C21307g) map.get(obj)).mo59831s();
            if (abstractC25021jMo59831s3 != null) {
                InterfaceC21308h interfaceC21308hM35492b = (InterfaceC21308h) map2.get(obj);
                if (interfaceC21308hM35492b == null) {
                    interfaceC21308hM35492b = c12685s.m35492b(obj);
                }
                interfaceC21308hM35492b.mo59810b(abstractC25021jMo59831s3);
            }
        }
        for (Object obj2 : map2.keySet()) {
            InterfaceC21308h interfaceC21308h = (InterfaceC21308h) map2.get(obj2);
            if (interfaceC21308h != c21302b2 && (interfaceC21308h.mo59811c() instanceof C21307g) && (abstractC25021jMo59831s2 = ((C21307g) interfaceC21308h.mo59811c()).mo59831s()) != null) {
                InterfaceC21308h interfaceC21308hM35492b2 = (InterfaceC21308h) map2.get(obj2);
                if (interfaceC21308hM35492b2 == null) {
                    interfaceC21308hM35492b2 = c12685s.m35492b(obj2);
                }
                interfaceC21308hM35492b2.mo59810b(abstractC25021jMo59831s2);
            }
        }
        Iterator it3 = map2.keySet().iterator();
        while (it3.hasNext()) {
            InterfaceC21308h interfaceC21308h2 = (InterfaceC21308h) map2.get(it3.next());
            if (interfaceC21308h2 != c21302b2) {
                C25016e c25016eMo59809a = interfaceC21308h2.mo59809a();
                c25016eMo59809a.f97924i0 = interfaceC21308h2.getKey().toString();
                c25016eMo59809a.f97901U = null;
                if (interfaceC21308h2.mo59811c() instanceof C22183g) {
                    interfaceC21308h2.apply();
                }
                c25017f.m73455V(c25016eMo59809a);
            } else {
                interfaceC21308h2.mo59810b(c25017f);
            }
        }
        Iterator it4 = map.keySet().iterator();
        while (it4.hasNext()) {
            C21307g c21307g2 = (C21307g) map.get(it4.next());
            if (c21307g2.mo59831s() != null) {
                Iterator it5 = c21307g2.f81472m0.iterator();
                while (it5.hasNext()) {
                    c21307g2.mo59831s().m73472V(((InterfaceC21308h) map2.get(it5.next())).mo59809a());
                }
                c21307g2.apply();
            } else {
                c21307g2.apply();
            }
        }
        Iterator it6 = map2.keySet().iterator();
        while (it6.hasNext()) {
            InterfaceC21308h interfaceC21308h3 = (InterfaceC21308h) map2.get(it6.next());
            if (interfaceC21308h3 != c21302b2 && (interfaceC21308h3.mo59811c() instanceof C21307g) && (abstractC25021jMo59831s = (c21307g = (C21307g) interfaceC21308h3.mo59811c()).mo59831s()) != null) {
                for (Object obj3 : c21307g.f81472m0) {
                    InterfaceC21308h interfaceC21308h4 = (InterfaceC21308h) map2.get(obj3);
                    if (interfaceC21308h4 != null) {
                        abstractC25021jMo59831s.m73472V(interfaceC21308h4.mo59809a());
                    } else if (obj3 instanceof InterfaceC21308h) {
                        abstractC25021jMo59831s.m73472V(((InterfaceC21308h) obj3).mo59809a());
                    } else {
                        System.out.println("couldn't find reference for " + obj3);
                    }
                }
                interfaceC21308h3.apply();
            }
        }
        for (Object obj4 : map2.keySet()) {
            InterfaceC21308h interfaceC21308h5 = (InterfaceC21308h) map2.get(obj4);
            interfaceC21308h5.apply();
            C25016e c25016eMo59809a2 = interfaceC21308h5.mo59809a();
            if (c25016eMo59809a2 != null && obj4 != null) {
                c25016eMo59809a2.f97927k = obj4.toString();
            }
        }
        c25017f.m73429S(C39169a.m124765i(j7));
        c25017f.m73424N(C39169a.m124764h(j7));
        c25017f.f97964s0.m696a0(c25017f);
        c25017f.f97954E0 = i13;
        C14051c.f50153q = c25017f.m73461c0(512);
        c25017f.m73460a0(c25017f.f97954E0, 0, 0, 0, 0, 0, 0);
        return AbstractC35744b.m113228a(c25017f.m73445r(), c25017f.m73441l());
    }
}
