package lg3;

import androidx.room.C1774d;
import b30.C2477a2;
import com.squareup.wire.AbstractC5583n;
import fa3.AbstractC14332y;
import fa3.C14303b;
import fa3.C14320m;
import fa3.C14327t;
import fa3.C14329v;
import fa3.EnumC14301a;
import fa3.EnumC14304b0;
import ia3.C18295a;
import ja3.C21510f0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jg3.AbstractC21688o;
import kg3.AbstractC22465d;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lb3.AbstractC23763c0;
import lb3.AbstractC23767d1;
import lb3.AbstractC23791o;
import lb3.AbstractC23797r;
import lb3.AbstractC23811y;
import lb3.EnumC23776g1;
import lb3.InterfaceC23796q0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mb3.AbstractC25390g;
import mb3.C25395l;
import na3.C26514a;
import na3.C26515b;
import na3.C26517d;
import na3.C26519f;
import na3.C26521h;
import na3.C26530q;
import na3.EnumC26518e;
import na3.EnumC26520g;
import nb3.C26552i;
import ng3.InterfaceC26700m;
import ob3.EnumC27806p;
import ob3.InterfaceC27797g;
import ob3.InterfaceC27803m;
import p000.C31931s;
import p048ce.AbstractC4482w;
import p319m4.AbstractC25012a;
import p522uf.AbstractC34870c0;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q93.C30080d;
import r80.AbstractC31061c;
import r93.InterfaceC31107a1;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import s93.InterfaceC32299a;
import s93.InterfaceC32307i;
import u93.C34709w0;
import va3.C35847e;
import va3.C35848f;
import ya3.AbstractC39363f;

/* JADX INFO: renamed from: lg3.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C24055q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95067a;

    /* JADX INFO: renamed from: b */
    public boolean f95068b;

    /* JADX INFO: renamed from: c */
    public boolean f95069c;

    /* JADX INFO: renamed from: d */
    public final Object f95070d;

    /* JADX INFO: renamed from: e */
    public final Object f95071e;

    /* JADX INFO: renamed from: f */
    public final Serializable f95072f;

    public C24055q(InterfaceC32299a interfaceC32299a, boolean z4, C41113q containerContext, EnumC14301a enumC14301a, boolean z13) {
        this.f95067a = 1;
        AbstractC22676k.m65750j(containerContext, "containerContext");
        this.f95070d = interfaceC32299a;
        this.f95068b = z4;
        this.f95071e = containerContext;
        this.f95072f = enumC14301a;
        this.f95069c = z13;
    }

    /* JADX INFO: renamed from: d */
    public static void m70964d(Object obj, ArrayList arrayList, C31931s c31931s) {
        arrayList.add(obj);
        Iterable iterable = (Iterable) c31931s.invoke(obj);
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m70964d(it.next(), arrayList, c31931s);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static C35848f m70965f(AbstractC23763c0 abstractC23763c0) {
        C26552i c26552i = AbstractC23767d1.f94137a;
        InterfaceC31126h interfaceC31126hMo1784d = abstractC23763c0.mo69844i0().mo1784d();
        InterfaceC31117e interfaceC31117e = interfaceC31126hMo1784d instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31126hMo1784d : null;
        if (interfaceC31117e != null) {
            return AbstractC39363f.m125524f(interfaceC31117e);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static EnumC26520g m70966g(InterfaceC27797g interfaceC27797g) {
        AbstractC23763c0 abstractC23763c0M74498g;
        AbstractC23763c0 abstractC23763c0M74498g2;
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        AbstractC23797r abstractC23797rM74497f = AbstractC25390g.m74497f(interfaceC27797g);
        if (abstractC23797rM74497f == null || (abstractC23763c0M74498g = AbstractC25390g.m74478O(abstractC23797rM74497f)) == null) {
            abstractC23763c0M74498g = AbstractC25390g.m74498g(interfaceC27797g);
            AbstractC22676k.m65747g(abstractC23763c0M74498g);
        }
        if (AbstractC25390g.m74470G(abstractC23763c0M74498g)) {
            return EnumC26520g.f105436x;
        }
        AbstractC23797r abstractC23797rM74497f2 = AbstractC25390g.m74497f(interfaceC27797g);
        if (abstractC23797rM74497f2 == null || (abstractC23763c0M74498g2 = AbstractC25390g.m74489Z(abstractC23797rM74497f2)) == null) {
            abstractC23763c0M74498g2 = AbstractC25390g.m74498g(interfaceC27797g);
            AbstractC22676k.m65747g(abstractC23763c0M74498g2);
        }
        if (AbstractC25390g.m74470G(abstractC23763c0M74498g2)) {
            return null;
        }
        return EnumC26520g.f105437y;
    }

    /* JADX INFO: renamed from: a */
    public boolean m70967a(char c3, char c7) {
        if (this.f95068b) {
            return c3 == c7;
        }
        return c3 == c7 || Character.toUpperCase(c3) == Character.toUpperCase(c7) || Character.toLowerCase(c3) == Character.toLowerCase(c7);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0228  */
    /* JADX WARN: Code duplicated, block: B:118:0x022c  */
    /* JADX WARN: Code duplicated, block: B:127:0x023e  */
    /* JADX WARN: Code duplicated, block: B:184:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:199:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:245:0x0399  */
    /* JADX WARN: Code duplicated, block: B:247:0x039c  */
    /* JADX WARN: Code duplicated, block: B:252:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:259:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:263:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:265:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:266:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:268:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:272:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:273:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:277:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:279:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:282:0x040c  */
    /* JADX WARN: Code duplicated, block: B:288:0x0423  */
    /* JADX WARN: Code duplicated, block: B:289:0x042f  */
    /* JADX WARN: Code duplicated, block: B:293:0x043f  */
    /* JADX WARN: Code duplicated, block: B:304:0x046a  */
    /* JADX WARN: Code duplicated, block: B:308:0x0471  */
    /* JADX WARN: Code duplicated, block: B:311:0x0476  */
    /* JADX WARN: Code duplicated, block: B:315:0x047d  */
    /* JADX WARN: Code duplicated, block: B:318:0x0484  */
    /* JADX WARN: Code duplicated, block: B:321:0x048e  */
    /* JADX WARN: Code duplicated, block: B:326:0x049e  */
    /* JADX WARN: Code duplicated, block: B:341:0x039f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x0406 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x0449 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0439 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x0498 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:359:0x0488 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:368:0x0242 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0138  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public C1774d m70968b(AbstractC23811y abstractC23811y, Iterable iterable, C26530q c26530q, boolean z4) {
        boolean z13;
        InterfaceC31165x0 interfaceC31165x0M74510s;
        int i13;
        C41113q c41113q;
        boolean z14;
        C26521h c26521h;
        boolean z15;
        C26521h c26521hM70970e;
        EnumC26520g enumC26520g;
        boolean z16;
        C26517d c26517d;
        EnumC26520g enumC26520g2;
        boolean z17;
        EnumC26518e enumC26518e;
        InterfaceC32307i annotations;
        AbstractC23797r abstractC23797rM74497f;
        boolean z18;
        ArrayList<C26517d> arrayList;
        Iterator it;
        boolean z19;
        boolean z24;
        EnumC26520g enumC26520g3;
        ArrayList arrayList2;
        Set setM74103I1;
        EnumC26520g enumC26520g4;
        EnumC26520g enumC26520g5;
        EnumC26520g enumC26520g6;
        ArrayList arrayList3;
        Iterator it3;
        EnumC26520g enumC26520g7;
        boolean z25;
        boolean z26;
        Iterator it4;
        C26517d c26517d2;
        EnumC26518e enumC26518e2;
        ArrayList arrayList4;
        Iterator it5;
        Set setM74103I2;
        EnumC26520g enumC26520g8;
        EnumC26520g enumC26520g9;
        C26515b c26515b;
        C26517d c26517d3;
        InterfaceC27797g interfaceC27797g;
        EnumC26520g enumC26520gM70966g;
        AbstractC23763c0 abstractC23763c0M74498g;
        AbstractC23763c0 abstractC23763c0M74498g2;
        EnumC26518e enumC26518e3;
        EnumC27806p enumC27806pM109973H;
        C24055q c24055q = this;
        InterfaceC32299a interfaceC32299a = (InterfaceC32299a) c24055q.f95070d;
        C41113q c41113q2 = (C41113q) c24055q.f95071e;
        boolean z27 = c24055q.f95068b;
        AbstractC22676k.m65750j(abstractC23811y, "<this>");
        ArrayList arrayListM70976m = m70976m(abstractC23811y);
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it6 = iterable.iterator();
        while (it6.hasNext()) {
            arrayList5.add(c24055q.m70976m((InterfaceC27797g) it6.next()));
        }
        int i14 = 1;
        if (!z27 || ((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            z13 = false;
            break;
        }
        Iterator it7 = iterable.iterator();
        while (true) {
            if (!it7.hasNext()) {
                z13 = false;
                break;
            }
            InterfaceC27797g other = (InterfaceC27797g) it7.next();
            AbstractC22676k.m65750j(other, "other");
            if (!((C25395l) ((C18295a) c41113q2.f177224x).f71243u).m74524a(abstractC23811y, (AbstractC23811y) other)) {
                z13 = true;
                break;
            }
        }
        int size = arrayListM70976m.size();
        C26517d[] c26517dArr = new C26517d[size];
        int i15 = 0;
        while (i15 < size) {
            InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C2477a2(c24055q, arrayListM70976m, i15, i14));
            C26517d c26517d4 = C26517d.f105426e;
            if (i15 <= 0 || !z13) {
                C26515b c26515b2 = (C26515b) arrayListM70976m.get(i15);
                C14320m c14320m = (C14320m) interfaceC23462hM92087G.getValue();
                InterfaceC27797g interfaceC27797g2 = c26515b2.f105422a;
                InterfaceC27803m interfaceC27803m = c26515b2.f105424c;
                if (interfaceC27797g2 == null) {
                    if (interfaceC27803m == null) {
                        enumC27806pM109973H = null;
                    } else {
                        if (!(interfaceC27803m instanceof InterfaceC31165x0)) {
                            StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb4.append(interfaceC27803m);
                            sb4.append(", ");
                            throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27803m.getClass(), sb4).toString());
                        }
                        EnumC23776g1 variance = ((InterfaceC31165x0) interfaceC27803m).getVariance();
                        AbstractC22676k.m65749i(variance, "getVariance(...)");
                        enumC27806pM109973H = AbstractC34870c0.m109973H(variance);
                    }
                    if (enumC27806pM109973H == EnumC27806p.IN) {
                        i13 = size;
                        c41113q = c41113q2;
                        z14 = z27;
                        c26517d = c26517d4;
                        c26521h = null;
                    }
                    z15 = false;
                    z18 = c26517d.f105430d;
                    arrayList = new ArrayList();
                    it = arrayList5.iterator();
                    while (it.hasNext()) {
                        c26515b = (C26515b) AbstractC25265s.m74102I0(i15, (List) it.next());
                        if (c26515b != null || (interfaceC27797g = c26515b.f105422a) == null) {
                            c26517d3 = null;
                        } else {
                            EnumC26520g enumC26520gM70966g2 = m70966g(interfaceC27797g);
                            if (enumC26520gM70966g2 == null) {
                                AbstractC23811y abstractC23811yM69884c = AbstractC23791o.m69884c((AbstractC23811y) interfaceC27797g);
                                enumC26520gM70966g = abstractC23811yM69884c != null ? m70966g(abstractC23811yM69884c) : c26521h;
                            } else {
                                enumC26520gM70966g = enumC26520gM70966g2;
                            }
                            String str = C30080d.f122759a;
                            AbstractC23797r abstractC23797rM74497f2 = AbstractC25390g.m74497f(interfaceC27797g);
                            if (abstractC23797rM74497f2 == null || (abstractC23763c0M74498g = AbstractC25390g.m74478O(abstractC23797rM74497f2)) == null) {
                                abstractC23763c0M74498g = AbstractC25390g.m74498g(interfaceC27797g);
                                AbstractC22676k.m65747g(abstractC23763c0M74498g);
                            }
                            if (C30080d.f122769k.containsKey(m70965f(abstractC23763c0M74498g))) {
                                enumC26518e3 = EnumC26518e.f105431w;
                            } else {
                                AbstractC23797r abstractC23797rM74497f3 = AbstractC25390g.m74497f(interfaceC27797g);
                                if (abstractC23797rM74497f3 == null || (abstractC23763c0M74498g2 = AbstractC25390g.m74489Z(abstractC23797rM74497f3)) == null) {
                                    abstractC23763c0M74498g2 = AbstractC25390g.m74498g(interfaceC27797g);
                                    AbstractC22676k.m65747g(abstractC23763c0M74498g2);
                                }
                                enumC26518e3 = C30080d.f122768j.containsKey(m70965f(abstractC23763c0M74498g2)) ? EnumC26518e.f105432x : null;
                            }
                            AbstractC23763c0 abstractC23763c0M74498g3 = AbstractC25390g.m74498g(interfaceC27797g);
                            c26517d3 = new C26517d(enumC26520gM70966g, enumC26518e3, (((abstractC23763c0M74498g3 != null ? AbstractC25390g.m74496e(abstractC23763c0M74498g3) : null) != null ? true : z15) || (((AbstractC23811y) interfaceC27797g).mo69863p0() instanceof C26519f)) ? true : z15, enumC26520gM70966g != enumC26520gM70966g2 ? true : z15);
                        }
                        if (c26517d3 != null) {
                            arrayList.add(c26517d3);
                        }
                        c26521h = null;
                    }
                    if (i15 == 0 || !z14) {
                        z19 = z15;
                    } else {
                        z19 = true;
                    }
                    if (i15 == 0 || !(interfaceC32299a instanceof InterfaceC31107a1) || ((C34709w0) ((InterfaceC31107a1) interfaceC32299a)).f146190K == null) {
                        z24 = z15;
                    } else {
                        z24 = true;
                    }
                    enumC26520g3 = c26517d.f105427a;
                    arrayList2 = new ArrayList();
                    for (C26517d c26517d5 : arrayList) {
                        if (c26517d5.f105430d) {
                            enumC26520g9 = null;
                        } else {
                            enumC26520g9 = c26517d5.f105427a;
                        }
                        if (enumC26520g9 != null) {
                            arrayList2.add(enumC26520g9);
                        }
                    }
                    setM74103I1 = AbstractC25265s.m74103I1(arrayList2);
                    if (z18) {
                        enumC26520g4 = null;
                    } else {
                        enumC26520g4 = enumC26520g3;
                    }
                    enumC26520g5 = EnumC26520g.f105435w;
                    if (enumC26520g4 != enumC26520g5) {
                        enumC26520g5 = (EnumC26520g) AbstractC4482w.m13992c0(setM74103I1, EnumC26520g.f105437y, EnumC26520g.f105436x, enumC26520g4, z19);
                    }
                    if (enumC26520g5 == null) {
                        arrayList4 = new ArrayList();
                        it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            enumC26520g8 = ((C26517d) it5.next()).f105427a;
                            if (enumC26520g8 != null) {
                                arrayList4.add(enumC26520g8);
                            }
                        }
                        setM74103I2 = AbstractC25265s.m74103I1(arrayList4);
                        enumC26520g6 = EnumC26520g.f105435w;
                        if (enumC26520g3 != enumC26520g6) {
                            enumC26520g6 = (EnumC26520g) AbstractC4482w.m13992c0(setM74103I2, EnumC26520g.f105437y, EnumC26520g.f105436x, enumC26520g3, z19);
                        }
                    } else {
                        enumC26520g6 = enumC26520g5;
                    }
                    arrayList3 = new ArrayList();
                    it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        enumC26518e2 = ((C26517d) it3.next()).f105428b;
                        if (enumC26518e2 != null) {
                            arrayList3.add(enumC26518e2);
                        }
                    }
                    EnumC26518e enumC26518e4 = (EnumC26518e) AbstractC4482w.m13992c0(AbstractC25265s.m74103I1(arrayList3), EnumC26518e.f105432x, EnumC26518e.f105431w, c26517d.f105428b, z19);
                    if (enumC26520g6 != null || z4 || (z24 && enumC26520g6 == EnumC26520g.f105436x)) {
                        enumC26520g7 = null;
                    } else {
                        enumC26520g7 = enumC26520g6;
                    }
                    if (enumC26520g7 == null && enumC26520g5 == null) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    if (enumC26520g7 != EnumC26520g.f105437y) {
                        z26 = false;
                    } else {
                        if (z18 == z25 || !c26517d.f105429c) {
                            if (!arrayList.isEmpty()) {
                                it4 = arrayList.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        c26517d2 = (C26517d) it4.next();
                                        if (c26517d2.f105430d == z25 || !c26517d2.f105429c) {
                                        }
                                    }
                                }
                            }
                            z26 = false;
                        }
                        z26 = true;
                    }
                    c26517d4 = new C26517d(enumC26520g7, enumC26518e4, z26, z25);
                } else {
                    z13 = z13;
                }
                boolean z28 = interfaceC27803m == null;
                Iterable iterable2 = C25271y.f99162w;
                Iterable annotations2 = interfaceC27797g2 != null ? ((AbstractC23811y) interfaceC27797g2).getAnnotations() : iterable2;
                if (interfaceC27797g2 == null) {
                    interfaceC31165x0M74510s = null;
                } else {
                    AbstractC23763c0 abstractC23763c0M74498g4 = AbstractC25390g.m74498g(interfaceC27797g2);
                    if (abstractC23763c0M74498g4 == null && ((abstractC23797rM74497f = AbstractC25390g.m74497f(interfaceC27797g2)) == null || (abstractC23763c0M74498g4 = AbstractC25390g.m74478O(abstractC23797rM74497f)) == null)) {
                        AbstractC23763c0 abstractC23763c0M74498g5 = AbstractC25390g.m74498g(interfaceC27797g2);
                        AbstractC22676k.m65747g(abstractC23763c0M74498g5);
                        abstractC23763c0M74498g4 = abstractC23763c0M74498g5;
                    }
                    InterfaceC23796q0 interfaceC23796q0M74487X = AbstractC25390g.m74487X(abstractC23763c0M74498g4);
                    if (interfaceC23796q0M74487X != null) {
                        interfaceC31165x0M74510s = AbstractC25390g.m74510s(interfaceC23796q0M74487X);
                    } else {
                        interfaceC31165x0M74510s = null;
                    }
                }
                boolean z29 = z28;
                i13 = size;
                boolean z34 = ((EnumC14301a) c24055q.f95072f) == EnumC14301a.TYPE_PARAMETER_BOUNDS;
                if (z29) {
                    if (!z34) {
                        ((C18295a) c41113q2.f177224x).f71242t.getClass();
                    }
                    if (interfaceC32299a != null && (annotations = interfaceC32299a.getAnnotations()) != null) {
                        iterable2 = annotations;
                    }
                    annotations2 = AbstractC25265s.m74126d1(iterable2, annotations2);
                }
                ((C18295a) c41113q2.f177224x).f71239q.getClass();
                Iterator it8 = annotations2.iterator();
                EnumC26518e enumC26518e5 = null;
                while (it8.hasNext()) {
                    C35847e c35847eM40910d = C14303b.m40910d(it8.next());
                    Iterator it9 = it8;
                    if (AbstractC25265s.m74155w0(AbstractC14332y.f52336n, c35847eM40910d)) {
                        enumC26518e = EnumC26518e.f105431w;
                    } else {
                        if (AbstractC25265s.m74155w0(AbstractC14332y.f52337o, c35847eM40910d)) {
                            enumC26518e = EnumC26518e.f105432x;
                        } else {
                            continue;
                        }
                        it8 = it9;
                    }
                    if (enumC26518e5 != null && enumC26518e5 != enumC26518e) {
                        enumC26518e5 = null;
                        break;
                    }
                    enumC26518e5 = enumC26518e;
                    it8 = it9;
                }
                C14303b c14303b = ((C18295a) c41113q2.f177224x).f71239q;
                c41113q = c41113q2;
                C1774d c1774d = new C1774d(5, c24055q, c26515b2);
                c14303b.getClass();
                Iterator it10 = annotations2.iterator();
                C26521h c26521h2 = null;
                while (true) {
                    if (!it10.hasNext()) {
                        z14 = z27;
                        c26521h = null;
                        break;
                    }
                    Object next = it10.next();
                    Iterator it11 = it10;
                    C26521h c26521hM40914g = c14303b.m40914g(next, ((Boolean) c1774d.invoke(next)).booleanValue());
                    if (c26521hM40914g != null) {
                        z14 = z27;
                    } else {
                        Object objM40916i = c14303b.m40916i(next);
                        if (objM40916i == null) {
                            z14 = z27;
                        } else {
                            EnumC14304b0 enumC14304b0M40915h = c14303b.m40915h(next);
                            if (enumC14304b0M40915h == null) {
                                enumC14304b0M40915h = ((C14329v) c14303b.f52225a.f19186x).f52300a;
                            }
                            z14 = z27;
                            if (enumC14304b0M40915h == EnumC14304b0.IGNORE) {
                                c26521hM40914g = null;
                            } else {
                                C26521h c26521hM40914g2 = c14303b.m40914g(objM40916i, ((Boolean) c1774d.invoke(objM40916i)).booleanValue());
                                if (c26521hM40914g2 != null) {
                                    c14303b = c14303b;
                                    c26521h = null;
                                    c26521hM40914g = C26521h.m78595a(c26521hM40914g2, null, enumC14304b0M40915h == EnumC14304b0.WARN, 1);
                                }
                            }
                            if (c26521h2 == null) {
                                c26521h2 = c26521hM40914g;
                            } else {
                                boolean z35 = c26521h2.f105440b;
                                if (c26521hM40914g == null && !c26521hM40914g.equals(c26521h2) && (!(z17 = c26521hM40914g.f105440b) || z35)) {
                                    if (z17 || !z35) {
                                        c26521h2 = c26521h;
                                        break;
                                    }
                                    c26521h2 = c26521hM40914g;
                                }
                            }
                            c14303b = c14303b;
                            z27 = z14;
                            it10 = it11;
                        }
                        c14303b = c14303b;
                        c26521h = null;
                        c26521hM40914g = null;
                        if (c26521h2 == null) {
                            c26521h2 = c26521hM40914g;
                        } else {
                            boolean z36 = c26521h2.f105440b;
                            if (c26521hM40914g == null) {
                                continue;
                            }
                        }
                        c14303b = c14303b;
                        z27 = z14;
                        it10 = it11;
                    }
                    c26521h = null;
                    if (c26521h2 == null) {
                        c26521h2 = c26521hM40914g;
                    } else {
                        boolean z37 = c26521h2.f105440b;
                        if (c26521hM40914g == null) {
                            continue;
                        }
                    }
                    c14303b = c14303b;
                    z27 = z14;
                    it10 = it11;
                }
                if (c26521h2 != null) {
                    EnumC26520g enumC26520g10 = c26521h2.f105439a;
                    c26517d = new C26517d(enumC26520g10, enumC26518e5, enumC26520g10 == EnumC26520g.f105437y && interfaceC31165x0M74510s != null, c26521h2.f105440b);
                    z15 = false;
                } else {
                    C26521h c26521hM70970e2 = interfaceC31165x0M74510s != null ? c24055q.m70970e(interfaceC31165x0M74510s) : c26521h;
                    C26521h c26521hM78595a = c26521hM70970e2 != null ? C26521h.m78595a(c26521hM70970e2, EnumC26520g.f105437y, false, 2) : c14320m != null ? c14320m.f52276a : c26521h;
                    boolean z38 = (c26521hM70970e2 != null ? c26521hM70970e2.f105439a : c26521h) == EnumC26520g.f105437y || !(interfaceC31165x0M74510s == null || c14320m == null || !c14320m.f52278c);
                    if (interfaceC27803m == null || (c26521hM70970e = c24055q.m70970e(interfaceC27803m)) == null) {
                        z15 = false;
                        c26521hM70970e = c26521h;
                    } else if (c26521hM70970e.f105439a == EnumC26520g.f105436x) {
                        z15 = false;
                        c26521hM70970e = C26521h.m78595a(c26521hM70970e, EnumC26520g.f105435w, false, 2);
                    } else {
                        z15 = false;
                    }
                    if (c26521hM70970e != null) {
                        EnumC26520g enumC26520g11 = c26521hM70970e.f105439a;
                        if (c26521hM78595a == null) {
                            c26521hM78595a = c26521hM70970e;
                        } else {
                            EnumC26520g enumC26520g12 = c26521hM78595a.f105439a;
                            boolean z39 = c26521hM78595a.f105440b;
                            boolean z44 = c26521hM70970e.f105440b;
                            if ((!z44 || z39) && ((!z44 && z39) || (enumC26520g11.compareTo(enumC26520g12) >= 0 && enumC26520g11.compareTo(enumC26520g12) > 0))) {
                                c26521hM78595a = c26521hM70970e;
                            }
                        }
                    }
                    if (c26521hM78595a != null) {
                        enumC26520g2 = c26521hM78595a.f105439a;
                    } else {
                        enumC26520g = c26521h;
                    }
                    if (c26521hM78595a != null) {
                        if (c26521hM78595a.f105440b) {
                            enumC26520g = enumC26520g2;
                            z16 = true;
                        }
                        c26517d = new C26517d(enumC26520g, enumC26518e5, z38, z16);
                    } else {
                        enumC26520g = enumC26520g2;
                    }
                    enumC26520g = enumC26520g2;
                    z16 = z15;
                    c26517d = new C26517d(enumC26520g, enumC26518e5, z38, z16);
                }
                z18 = c26517d.f105430d;
                arrayList = new ArrayList();
                it = arrayList5.iterator();
                while (it.hasNext()) {
                    c26515b = (C26515b) AbstractC25265s.m74102I0(i15, (List) it.next());
                    if (c26515b != null) {
                        c26517d3 = null;
                    } else {
                        c26517d3 = null;
                    }
                    if (c26517d3 != null) {
                        arrayList.add(c26517d3);
                    }
                    c26521h = null;
                }
                if (i15 == 0) {
                    z19 = z15;
                } else {
                    z19 = z15;
                }
                if (i15 == 0) {
                    z24 = z15;
                } else {
                    z24 = z15;
                }
                enumC26520g3 = c26517d.f105427a;
                arrayList2 = new ArrayList();
                while (r14.hasNext()) {
                    if (c26517d5.f105430d) {
                        enumC26520g9 = null;
                    } else {
                        enumC26520g9 = c26517d5.f105427a;
                    }
                    if (enumC26520g9 != null) {
                        arrayList2.add(enumC26520g9);
                    }
                }
                setM74103I1 = AbstractC25265s.m74103I1(arrayList2);
                if (z18) {
                    enumC26520g4 = null;
                } else {
                    enumC26520g4 = enumC26520g3;
                }
                enumC26520g5 = EnumC26520g.f105435w;
                if (enumC26520g4 != enumC26520g5) {
                    enumC26520g5 = (EnumC26520g) AbstractC4482w.m13992c0(setM74103I1, EnumC26520g.f105437y, EnumC26520g.f105436x, enumC26520g4, z19);
                }
                if (enumC26520g5 == null) {
                    arrayList4 = new ArrayList();
                    it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        enumC26520g8 = ((C26517d) it5.next()).f105427a;
                        if (enumC26520g8 != null) {
                            arrayList4.add(enumC26520g8);
                        }
                    }
                    setM74103I2 = AbstractC25265s.m74103I1(arrayList4);
                    enumC26520g6 = EnumC26520g.f105435w;
                    if (enumC26520g3 != enumC26520g6) {
                        enumC26520g6 = (EnumC26520g) AbstractC4482w.m13992c0(setM74103I2, EnumC26520g.f105437y, EnumC26520g.f105436x, enumC26520g3, z19);
                    }
                } else {
                    enumC26520g6 = enumC26520g5;
                }
                arrayList3 = new ArrayList();
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    enumC26518e2 = ((C26517d) it3.next()).f105428b;
                    if (enumC26518e2 != null) {
                        arrayList3.add(enumC26518e2);
                    }
                }
                EnumC26518e enumC26518e6 = (EnumC26518e) AbstractC4482w.m13992c0(AbstractC25265s.m74103I1(arrayList3), EnumC26518e.f105432x, EnumC26518e.f105431w, c26517d.f105428b, z19);
                if (enumC26520g6 != null) {
                    enumC26520g7 = null;
                } else {
                    enumC26520g7 = null;
                }
                if (enumC26520g7 == null) {
                    z25 = false;
                } else {
                    z25 = false;
                }
                if (enumC26520g7 != EnumC26520g.f105437y) {
                    z26 = false;
                } else if (z18 == z25) {
                    if (!arrayList.isEmpty()) {
                        it4 = arrayList.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                c26517d2 = (C26517d) it4.next();
                                if (c26517d2.f105430d == z25) {
                                }
                            }
                        }
                    }
                    z26 = false;
                } else {
                    if (!arrayList.isEmpty()) {
                        it4 = arrayList.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                c26517d2 = (C26517d) it4.next();
                                if (c26517d2.f105430d == z25) {
                                }
                            }
                        }
                    }
                    z26 = false;
                }
                c26517d4 = new C26517d(enumC26520g7, enumC26518e6, z26, z25);
            } else {
                z13 = z13;
                i13 = size;
                c41113q = c41113q2;
                z14 = z27;
            }
            c26517dArr[i15] = c26517d4;
            i15++;
            c24055q = this;
            z13 = z13;
            c41113q2 = c41113q;
            size = i13;
            z27 = z14;
            i14 = 1;
        }
        return new C1774d(6, c26530q, c26517dArr);
    }

    /* JADX INFO: renamed from: c */
    public C24054p m70969c() {
        return (C24054p) AbstractC25012a.m73371d((ArrayList) this.f95072f, 1);
    }

    /* JADX INFO: renamed from: e */
    public C26521h m70970e(InterfaceC27803m interfaceC27803m) {
        List list;
        EnumC26520g enumC26520g;
        AbstractC22676k.m65750j(interfaceC27803m, "<this>");
        if (!(interfaceC27803m instanceof C21510f0)) {
            return null;
        }
        if (!(interfaceC27803m instanceof InterfaceC31165x0)) {
            StringBuilder sb4 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb4.append(interfaceC27803m);
            sb4.append(", ");
            throw new IllegalArgumentException(AbstractC31061c.m95642r(AbstractC22671h0.f89337a, interfaceC27803m.getClass(), sb4).toString());
        }
        List upperBounds = ((InterfaceC31165x0) interfaceC27803m).getUpperBounds();
        AbstractC22676k.m65749i(upperBounds, "getUpperBounds(...)");
        List list2 = upperBounds;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (!AbstractC25390g.m74466C((InterfaceC27797g) it.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (m70966g((InterfaceC27797g) obj) != null) {
                        arrayList.add(obj);
                    }
                }
                InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C26514a(upperBounds, this));
                if (!arrayList.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it3 = arrayList.iterator();
                        if (it3.hasNext()) {
                            AbstractC22676k.m65750j((InterfaceC27797g) it3.next(), "<this>");
                            list = upperBounds;
                        }
                    }
                    return new C26521h(EnumC26520g.f105435w, false);
                }
                if (((List) interfaceC23462hM92087G.getValue()).isEmpty()) {
                    return null;
                }
                List list3 = (List) interfaceC23462hM92087G.getValue();
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it4 = list3.iterator();
                    if (it4.hasNext()) {
                        AbstractC22676k.m65750j((InterfaceC27797g) it4.next(), "<this>");
                        list = (List) interfaceC23462hM92087G.getValue();
                    }
                }
                return new C26521h(EnumC26520g.f105435w, true);
                List list4 = list;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it5 = list4.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            enumC26520g = EnumC26520g.f105436x;
                            break;
                        }
                        if (!AbstractC25390g.m74472I((InterfaceC27797g) it5.next())) {
                            enumC26520g = EnumC26520g.f105437y;
                            break;
                        }
                    }
                } else {
                    enumC26520g = EnumC26520g.f105436x;
                    break;
                }
                return new C26521h(enumC26520g, list != upperBounds);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public Long m70971h(InterfaceC26700m interfaceC26700m) {
        return (Long) m70969c().f95063G.get(interfaceC26700m);
    }

    /* JADX INFO: renamed from: i */
    public boolean m70972i() {
        return this.f95069c;
    }

    /* JADX INFO: renamed from: j */
    public void m70973j(AbstractC21688o abstractC21688o) {
        AbstractC5583n.m16762V(abstractC21688o, "zone");
        m70969c().f95062F = abstractC21688o;
    }

    /* JADX INFO: renamed from: k */
    public int m70974k(InterfaceC26700m interfaceC26700m, long j7, int i13, int i14) {
        AbstractC5583n.m16762V(interfaceC26700m, "field");
        Long l7 = (Long) m70969c().f95063G.put(interfaceC26700m, Long.valueOf(j7));
        return (l7 == null || l7.longValue() == j7) ? i14 : ~i13;
    }

    /* JADX INFO: renamed from: l */
    public boolean m70975l(CharSequence charSequence, int i13, CharSequence charSequence2, int i14, int i15) {
        if (i13 + i15 <= charSequence.length() && i14 + i15 <= charSequence2.length()) {
            if (this.f95068b) {
                for (int i16 = 0; i16 < i15; i16++) {
                    if (charSequence.charAt(i13 + i16) == charSequence2.charAt(i14 + i16)) {
                    }
                }
                return true;
            }
            for (int i17 = 0; i17 < i15; i17++) {
                char cCharAt = charSequence.charAt(i13 + i17);
                char cCharAt2 = charSequence2.charAt(i14 + i17);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l83.h] */
    /* JADX INFO: renamed from: m */
    public ArrayList m70976m(InterfaceC27797g interfaceC27797g) {
        C41113q c41113q = (C41113q) this.f95071e;
        C14327t c14327t = (C14327t) c41113q.f177226z.getValue();
        C14303b c14303b = ((C18295a) c41113q.f177224x).f71239q;
        AbstractC22676k.m65750j(interfaceC27797g, "<this>");
        C26515b c26515b = new C26515b(interfaceC27797g, C14303b.m40908b(c14303b, c14327t, ((AbstractC23811y) interfaceC27797g).getAnnotations()), null);
        C31931s c31931s = new C31931s(this, 14);
        ArrayList arrayList = new ArrayList(1);
        m70964d(c26515b, arrayList, c31931s);
        return arrayList;
    }

    public String toString() {
        switch (this.f95067a) {
            case 0:
                return m70969c().toString();
            default:
                return super.toString();
        }
    }

    public C24055q(C24040b c24040b) {
        this.f95067a = 0;
        this.f95068b = true;
        this.f95069c = true;
        ArrayList arrayList = new ArrayList();
        this.f95072f = arrayList;
        this.f95070d = c24040b.f95022c;
        this.f95071e = c24040b.f95024e;
        arrayList.add(new C24054p(this));
    }

    public C24055q(C24055q c24055q) {
        this.f95067a = 0;
        this.f95068b = true;
        this.f95069c = true;
        ArrayList arrayList = new ArrayList();
        this.f95072f = arrayList;
        this.f95070d = (C24058t) c24055q.f95070d;
        this.f95071e = (AbstractC22465d) c24055q.f95071e;
        this.f95068b = c24055q.f95068b;
        this.f95069c = c24055q.f95069c;
        arrayList.add(new C24054p(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24055q(InterfaceC32299a interfaceC32299a, boolean z4, C41113q c41113q, EnumC14301a enumC14301a) {
        this(interfaceC32299a, z4, c41113q, enumC14301a, false);
        this.f95067a = 1;
    }
}
