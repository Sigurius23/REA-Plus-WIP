package p005a3;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.node.C1134a;
import androidx.compose.p018ui.node.C1135b;
import androidx.compose.p018ui.node.NodeCoordinator;
import com.bumptech.glide.Registry$MissingComponentException;
import com.bumptech.glide.Registry$NoModelLoaderAvailableException;
import com.google.crypto.tink.internal.C5101l0;
import io.sentry.C20318e2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p002a0.C0039m0;
import p014aj.C0928c;
import p026b2.AbstractC2316v;
import p026b2.InterfaceC2315u;
import p027b3.C2374f2;
import p093dl.C12157v;
import p093dl.C12161z;
import p093dl.InterfaceC12155t;
import p093dl.InterfaceC12156u;
import p167g5.C15487f;
import p222ij.C18588n;
import p249jc.C21565a;
import p249jc.C21567b;
import p306ll.C24499b;
import p306ll.InterfaceC24498a;
import p372ol.C28006a;
import p372ol.C28007b;
import p372ol.C28008c;
import p372ol.C28009d;
import p372ol.C28010e;
import p446r1.C30849c;
import p474s.C31983m2;
import p526ul.InterfaceC35055a;
import p581we.C37199o;
import p586wk.InterfaceC37325c;
import p586wk.InterfaceC37332j;
import p586wk.InterfaceC37333k;
import p603x2.AbstractC37831a;
import p618xk.C38417h;
import p618xk.InterfaceC38415f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22677k0;

/* JADX INFO: renamed from: a3.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0223l1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f737a;

    /* JADX INFO: renamed from: b */
    public final Object f738b;

    /* JADX INFO: renamed from: c */
    public final Object f739c;

    /* JADX INFO: renamed from: d */
    public final Object f740d;

    /* JADX INFO: renamed from: e */
    public Object f741e;

    /* JADX INFO: renamed from: f */
    public final Object f742f;

    /* JADX INFO: renamed from: g */
    public Object f743g;

    /* JADX INFO: renamed from: h */
    public Object f744h;

    /* JADX INFO: renamed from: i */
    public Object f745i;

    /* JADX INFO: renamed from: j */
    public final Object f746j;

    /* JADX INFO: renamed from: k */
    public Object f747k;

    public C0223l1(C0230n0 c0230n0) {
        this.f737a = 0;
        this.f738b = c0230n0;
        C0219k1 c0219k1 = new C0219k1();
        c0219k1.f9145z = -1;
        this.f739c = c0219k1;
        C1134a c1134a = new C1134a(c0230n0);
        this.f740d = c1134a;
        this.f741e = c1134a;
        C0224l2 c0224l2 = c1134a.f4881p0;
        this.f742f = c0224l2;
        this.f743g = c0224l2;
        this.f746j = new C30849c(new Modifier[16]);
    }

    /* JADX INFO: renamed from: a */
    public static final void m550a(C0223l1 c0223l1, AbstractC2316v abstractC2316v, NodeCoordinator nodeCoordinator) {
        for (AbstractC2316v abstractC2316v2 = abstractC2316v.f9132E; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9132E) {
            if (abstractC2316v2 == ((C0219k1) c0223l1.f739c)) {
                C0230n0 c0230n0M588G = ((C0230n0) c0223l1.f738b).m588G();
                nodeCoordinator.f4860Q = c0230n0M588G != null ? (C1134a) c0230n0M588G.f783e0.f740d : null;
                c0223l1.f741e = nodeCoordinator;
                return;
            } else {
                if ((abstractC2316v2.f9144y & 2) != 0) {
                    return;
                }
                abstractC2316v2.mo664W0(nodeCoordinator);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC2316v m551f(InterfaceC2315u interfaceC2315u, AbstractC2316v abstractC2316v) {
        AbstractC2316v abstractC2316vCreate;
        if (interfaceC2315u instanceof AbstractC0207h1) {
            abstractC2316vCreate = ((AbstractC0207h1) interfaceC2315u).create();
            abstractC2316vCreate.f9144y = AbstractC0247r1.m768f(abstractC2316vCreate);
        } else {
            C0189d c0189d = new C0189d();
            c0189d.f9144y = AbstractC0247r1.m766d(interfaceC2315u);
            c0189d.f616O = interfaceC2315u;
            c0189d.f618Q = new HashSet();
            abstractC2316vCreate = c0189d;
        }
        if (abstractC2316vCreate.f9141N) {
            AbstractC37831a.m121374b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        abstractC2316vCreate.f9136I = true;
        AbstractC2316v abstractC2316v2 = abstractC2316v.f9133F;
        if (abstractC2316v2 != null) {
            abstractC2316v2.f9132E = abstractC2316vCreate;
            abstractC2316vCreate.f9133F = abstractC2316v2;
        }
        abstractC2316v.f9133F = abstractC2316vCreate;
        abstractC2316vCreate.f9132E = abstractC2316v;
        return abstractC2316vCreate;
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC2316v m552g(AbstractC2316v abstractC2316v) {
        boolean z4 = abstractC2316v.f9141N;
        if (z4) {
            C0039m0 c0039m0 = AbstractC0247r1.f856a;
            if (!z4) {
                AbstractC37831a.m121374b("autoInvalidateRemovedNode called on unattached node");
            }
            AbstractC0247r1.m763a(abstractC2316v, -1, 2);
            abstractC2316v.mo662U0();
            abstractC2316v.mo659O0();
        }
        AbstractC2316v abstractC2316v2 = abstractC2316v.f9133F;
        AbstractC2316v abstractC2316v3 = abstractC2316v.f9132E;
        if (abstractC2316v2 != null) {
            abstractC2316v2.f9132E = abstractC2316v3;
            abstractC2316v.f9133F = null;
        }
        if (abstractC2316v3 != null) {
            abstractC2316v3.f9133F = abstractC2316v2;
            abstractC2316v.f9132E = null;
        }
        AbstractC22676k.m65747g(abstractC2316v3);
        return abstractC2316v3;
    }

    /* JADX INFO: renamed from: p */
    public static void m553p(InterfaceC2315u interfaceC2315u, InterfaceC2315u interfaceC2315u2, AbstractC2316v abstractC2316v) {
        if ((interfaceC2315u instanceof AbstractC0207h1) && (interfaceC2315u2 instanceof AbstractC0207h1)) {
            AbstractC22676k.m65748h(abstractC2316v, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((AbstractC0207h1) interfaceC2315u2).update(abstractC2316v);
            if (abstractC2316v.f9141N) {
                AbstractC0247r1.m765c(abstractC2316v);
                return;
            } else {
                abstractC2316v.f9137J = true;
                return;
            }
        }
        if (!(abstractC2316v instanceof C0189d)) {
            AbstractC37831a.m121374b("Unknown Modifier.Node type");
            return;
        }
        C0189d c0189d = (C0189d) abstractC2316v;
        if (c0189d.f9141N) {
            c0189d.m462Y0();
        }
        c0189d.f616O = interfaceC2315u2;
        c0189d.f9144y = AbstractC0247r1.m766d(interfaceC2315u2);
        if (c0189d.f9141N) {
            c0189d.m460X0(false);
        }
        if (abstractC2316v.f9141N) {
            AbstractC0247r1.m765c(abstractC2316v);
        } else {
            abstractC2316v.f9137J = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m554b(Class cls, Class cls2, InterfaceC12156u interfaceC12156u) {
        C37199o c37199o = (C37199o) this.f738b;
        synchronized (c37199o) {
            ((C12161z) c37199o.f159040w).m33620a(cls, cls2, interfaceC12156u);
            ((HashMap) ((C0928c) c37199o.f159041x).f3421x).clear();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m555c(Class cls, InterfaceC37325c interfaceC37325c) {
        C28007b c28007b = (C28007b) this.f739c;
        synchronized (c28007b) {
            c28007b.f112939w.add(new C28006a(cls, interfaceC37325c));
        }
    }

    /* JADX INFO: renamed from: d */
    public void m556d(Class cls, InterfaceC37333k interfaceC37333k) {
        C20318e2 c20318e2 = (C20318e2) this.f741e;
        synchronized (c20318e2) {
            c20318e2.f76298a.add(new C28010e(cls, interfaceC37333k));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m557e(String str, Class cls, Class cls2, InterfaceC37332j interfaceC37332j) {
        C5101l0 c5101l0 = (C5101l0) this.f740d;
        synchronized (c5101l0) {
            c5101l0.m16039S(str).add(new C28009d(cls, cls2, interfaceC37332j));
        }
    }

    /* JADX INFO: renamed from: h */
    public ArrayList m558h() {
        ArrayList arrayList;
        C18588n c18588n = (C18588n) this.f744h;
        synchronized (c18588n) {
            arrayList = c18588n.f72613a;
        }
        if (arrayList.isEmpty()) {
            throw new Registry$MissingComponentException() { // from class: com.bumptech.glide.Registry$NoImageHeaderParserException
            };
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public List m559i(Object obj) {
        List listUnmodifiableList;
        C37199o c37199o = (C37199o) this.f738b;
        c37199o.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c37199o) {
            C12157v c12157v = (C12157v) ((HashMap) ((C0928c) c37199o.f159041x).f3421x).get(cls);
            listUnmodifiableList = c12157v == null ? null : c12157v.f40410a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((C12161z) c37199o.f159040w).m33622c(cls));
                if (((C12157v) ((HashMap) ((C0928c) c37199o.f159041x).f3421x).put(cls, new C12157v(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new Registry$NoModelLoaderAvailableException(obj);
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z4 = true;
        for (int i13 = 0; i13 < size; i13++) {
            InterfaceC12155t interfaceC12155t = (InterfaceC12155t) listUnmodifiableList.get(i13);
            if (interfaceC12155t.mo33590a(obj)) {
                if (z4) {
                    arrayList = new ArrayList(size - i13);
                    z4 = false;
                }
                arrayList.add(interfaceC12155t);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry$NoModelLoaderAvailableException(obj, listUnmodifiableList);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public boolean m560j(int i13) {
        return (i13 & ((AbstractC2316v) this.f743g).f9145z) != 0;
    }

    /* JADX INFO: renamed from: k */
    public void m561k(Class cls, Class cls2, InterfaceC24498a interfaceC24498a) {
        C22677k0 c22677k0 = (C22677k0) this.f743g;
        synchronized (c22677k0) {
            c22677k0.f89339a.add(new C24499b(cls, cls2, interfaceC24498a));
        }
    }

    /* JADX INFO: renamed from: l */
    public void m562l(InterfaceC38415f interfaceC38415f) {
        C38417h c38417h = (C38417h) this.f742f;
        synchronized (c38417h) {
            ((HashMap) c38417h.f164480w).put(interfaceC38415f.mo49224b(), interfaceC38415f);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m563m() {
        for (AbstractC2316v abstractC2316v = (AbstractC2316v) this.f743g; abstractC2316v != null; abstractC2316v = abstractC2316v.f9133F) {
            abstractC2316v.mo661T0();
            if (abstractC2316v.f9136I) {
                C0039m0 c0039m0 = AbstractC0247r1.f856a;
                if (!abstractC2316v.f9141N) {
                    AbstractC37831a.m121374b("autoInvalidateInsertedNode called on unattached node");
                }
                AbstractC0247r1.m763a(abstractC2316v, -1, 1);
            }
            if (abstractC2316v.f9137J) {
                AbstractC0247r1.m765c(abstractC2316v);
            }
            abstractC2316v.f9136I = false;
            abstractC2316v.f9137J = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0142 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:40:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:72:0x018a  */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x0194  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:78:0x01a0
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: n */
    public void m564n(int r32, p446r1.C30849c r33, p446r1.C30849c r34, p026b2.AbstractC2316v r35, boolean r36) {
        /*
            Method dump skipped, instruction units count: 929
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a3.C0223l1.m564n(int, r1.c, r1.c, b2.v, boolean):void");
    }

    /* JADX INFO: renamed from: o */
    public void m565o() {
        C1135b c1135b;
        InterfaceC0180a2 interfaceC0180a2;
        C0230n0 c0230n0 = (C0230n0) this.f738b;
        NodeCoordinator nodeCoordinator = (C1134a) this.f740d;
        for (AbstractC2316v abstractC2316v = ((C0224l2) this.f742f).f9132E; abstractC2316v != null; abstractC2316v = abstractC2316v.f9132E) {
            InterfaceC0186c0 interfaceC0186c0M505e = AbstractC0201g.m505e(abstractC2316v);
            if (interfaceC0186c0M505e != null) {
                NodeCoordinator nodeCoordinator2 = abstractC2316v.f9135H;
                if (nodeCoordinator2 != null) {
                    c1135b = (C1135b) nodeCoordinator2;
                    InterfaceC0186c0 interfaceC0186c0 = c1135b.f4884p0;
                    c1135b.m3559J1(interfaceC0186c0M505e);
                    if (interfaceC0186c0 != abstractC2316v && (interfaceC0180a2 = c1135b.f4878i0) != null) {
                        ((C2374f2) interfaceC0180a2).invalidate();
                    }
                } else {
                    c1135b = new C1135b(c0230n0, interfaceC0186c0M505e);
                    abstractC2316v.mo664W0(c1135b);
                }
                nodeCoordinator.f4860Q = c1135b;
                c1135b.f4859P = nodeCoordinator;
                nodeCoordinator = c1135b;
            } else {
                abstractC2316v.mo664W0(nodeCoordinator);
            }
        }
        C0230n0 c0230n0M588G = c0230n0.m588G();
        nodeCoordinator.f4860Q = c0230n0M588G != null ? (C1134a) c0230n0M588G.f783e0.f740d : null;
        this.f741e = nodeCoordinator;
    }

    public String toString() {
        switch (this.f737a) {
            case 0:
                StringBuilder sb4 = new StringBuilder("[");
                AbstractC2316v abstractC2316v = (AbstractC2316v) this.f743g;
                C0224l2 c0224l2 = (C0224l2) this.f742f;
                if (abstractC2316v == c0224l2) {
                    sb4.append("]");
                } else {
                    while (abstractC2316v != null && abstractC2316v != c0224l2) {
                        sb4.append(String.valueOf(abstractC2316v));
                        if (abstractC2316v.f9133F == c0224l2) {
                            sb4.append("]");
                        } else {
                            sb4.append(",");
                            abstractC2316v = abstractC2316v.f9133F;
                        }
                    }
                }
                String string = sb4.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                return string;
            default:
                return super.toString();
        }
    }

    public C0223l1() {
        this.f737a = 1;
        this.f745i = new C37199o(29, false);
        this.f746j = new C28008c();
        C31983m2 c31983m2 = new C31983m2(new C15487f(20), (InterfaceC35055a) new C21565a(26), new C21567b(26));
        this.f747k = c31983m2;
        C12161z c12161z = new C12161z(c31983m2);
        C37199o c37199o = new C37199o();
        c37199o.f159041x = new C0928c(9, (byte) 0);
        c37199o.f159040w = c12161z;
        this.f738b = c37199o;
        this.f739c = new C28007b();
        C5101l0 c5101l0 = new C5101l0(28);
        this.f740d = c5101l0;
        this.f741e = new C20318e2(1);
        this.f742f = new C38417h();
        this.f743g = new C22677k0(1, false);
        this.f744h = new C18588n();
        List listAsList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.addAll(listAsList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (c5101l0) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) c5101l0.f21443x);
                ((ArrayList) c5101l0.f21443x).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ArrayList) c5101l0.f21443x).add((String) it.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) c5101l0.f21443x).add(str);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
