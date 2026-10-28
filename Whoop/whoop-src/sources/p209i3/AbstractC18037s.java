package p209i3;

import ad3.C0783z;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import androidx.compose.p018ui.node.C1134a;
import androidx.compose.p018ui.node.NodeCoordinator;
import java.util.List;
import p002a0.AbstractC0052t;
import p002a0.C0023g0;
import p002a0.C0057v0;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.C0230n0;
import p005a3.InterfaceC0216j2;
import p026b2.AbstractC2316v;
import p181h2.C16618c;
import p446r1.C30849c;
import p557vo.AbstractC36221c;
import p635y2.AbstractC39125q1;
import p636y3.C39179k;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i3.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18037s {

    /* JADX INFO: renamed from: a */
    public static final C16618c f69999a = new C16618c(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final C18034p m51796a(C0230n0 c0230n0, boolean z4) {
        AbstractC2316v abstractC2316v = (AbstractC2316v) c0230n0.f783e0.f743g;
        Object obj = null;
        if ((abstractC2316v.f9145z & 8) != 0) {
            loop0: while (abstractC2316v != null) {
                if ((abstractC2316v.f9144y & 8) == 0) {
                    if ((abstractC2316v.f9145z & 8) != 0) {
                        break;
                        break;
                    }
                    abstractC2316v = abstractC2316v.f9133F;
                } else {
                    AbstractC2316v abstractC2316vM504d = abstractC2316v;
                    C30849c c30849c = null;
                    while (abstractC2316vM504d != null) {
                        if (abstractC2316vM504d instanceof InterfaceC0216j2) {
                            obj = abstractC2316vM504d;
                            break loop0;
                        }
                        if ((abstractC2316vM504d.f9144y & 8) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                            int i13 = 0;
                            for (AbstractC2316v abstractC2316v2 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
                                if ((abstractC2316v2.f9144y & 8) != 0) {
                                    i13++;
                                    if (i13 == 1) {
                                        abstractC2316vM504d = abstractC2316v2;
                                    } else {
                                        if (c30849c == null) {
                                            c30849c = new C30849c(new AbstractC2316v[16]);
                                        }
                                        if (abstractC2316vM504d != null) {
                                            c30849c.m94885b(abstractC2316vM504d);
                                            abstractC2316vM504d = null;
                                        }
                                        c30849c.m94885b(abstractC2316v2);
                                    }
                                }
                            }
                            if (i13 == 1) {
                            }
                        }
                        abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                    }
                    if ((abstractC2316v.f9145z & 8) != 0) {
                        break;
                    }
                    abstractC2316v = abstractC2316v.f9133F;
                }
            }
        }
        AbstractC22676k.m65747g(obj);
        AbstractC2316v abstractC2316v3 = ((AbstractC2316v) ((InterfaceC0216j2) obj)).f9142w;
        C18030l c18030lM591I = c0230n0.m591I();
        if (c18030lM591I == null) {
            c18030lM591I = new C18030l();
        }
        return new C18034p(abstractC2316v3, z4, c0230n0, c18030lM591I);
    }

    /* JADX INFO: renamed from: b */
    public static final C0023g0 m51797b(C18036r c18036r) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            C18034p c18034pM51794a = c18036r.m51794a();
            C0230n0 c0230n0 = c18034pM51794a.f69988c;
            if (c0230n0.m606Y() && c0230n0.m605X()) {
                C0023g0 c0023g0 = new C0023g0(48);
                C0783z c0783z = new C0783z(13);
                C39179k c39179kM115322c = AbstractC36221c.m115322c(c18034pM51794a.m51783g());
                ((Region) c0783z.f2818x).set(c39179kM115322c.f168418a, c39179kM115322c.f168419b, c39179kM115322c.f168420c, c39179kM115322c.f168421d);
                m51798c(c0783z, c18034pM51794a, c0023g0, c18034pM51794a, new C0783z(13));
                return c0023g0;
            }
            C0023g0 c0023g1 = AbstractC0052t.f161a;
            AbstractC22676k.m65748h(c0023g1, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return c0023g1;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m51798c(C0783z c0783z, C18034p c18034p, C0023g0 c0023g0, C18034p c18034p2, C0783z c0783z2) {
        C16618c c16618cM3508C1;
        C0230n0 c0230n0;
        int i13 = c18034p.f69992g;
        Region region = (Region) c0783z2.f2818x;
        C0230n0 c0230n1 = c18034p2.f69988c;
        int i14 = c18034p2.f69992g;
        boolean z4 = (c0230n1.m606Y() && c0230n1.m605X()) ? false : true;
        Region region2 = (Region) c0783z.f2818x;
        if (!region2.isEmpty() || i14 == i13) {
            if (!z4 || c18034p2.f69990e) {
                Object objM51782f = c18034p2.m51782f();
                if (objM51782f == null) {
                    c16618cM3508C1 = ((C1134a) c0230n1.f783e0.f740d).m3508C1();
                } else {
                    AbstractC2316v abstractC2316v = ((AbstractC2316v) objM51782f).f9142w;
                    Object objM129g = c18034p2.f69989d.f69980w.m129g(AbstractC18029k.f69955b);
                    if (objM129g == null) {
                        objM129g = null;
                    }
                    boolean z13 = objM129g != null;
                    if (!abstractC2316v.f9142w.f9141N) {
                        c16618cM3508C1 = C16618c.f63938e;
                    } else if (z13) {
                        c16618cM3508C1 = AbstractC0201g.m514n(abstractC2316v, 8).m3508C1();
                    } else {
                        NodeCoordinator nodeCoordinatorM514n = AbstractC0201g.m514n(abstractC2316v, 8);
                        c16618cM3508C1 = AbstractC39125q1.m124662h(nodeCoordinatorM514n).mo3547r(nodeCoordinatorM514n, true);
                    }
                }
                C39179k c39179kM115322c = AbstractC36221c.m115322c(c16618cM3508C1);
                region.set(c39179kM115322c.f168418a, c39179kM115322c.f168419b, c39179kM115322c.f168420c, c39179kM115322c.f168421d);
                if (i14 == i13) {
                    i14 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (c18034p2.f69990e) {
                        C18034p c18034pM51787l = c18034p2.m51787l();
                        c0023g0.m51h(i14, new C18035q(c18034p2, AbstractC36221c.m115322c((c18034pM51787l == null || (c0230n0 = c18034pM51787l.f69988c) == null || !c0230n0.m606Y()) ? f69999a : c18034pM51787l.m51783g())));
                        return;
                    } else {
                        if (i14 == -1) {
                            Rect bounds = region.getBounds();
                            c0023g0.m51h(i14, new C18035q(c18034p2, new C39179k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                c0023g0.m51h(i14, new C18035q(c18034p2, new C39179k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listM51776j = C18034p.m51776j(4, c18034p2);
                for (int size = listM51776j.size() - 1; -1 < size; size--) {
                    if (!((C18034p) listM51776j.get(size)).m51786k().f69980w.m125c(AbstractC18039u.f70059z)) {
                        m51798c(c0783z, c18034p, c0023g0, (C18034p) listM51776j.get(size), c0783z2);
                    }
                }
                if (m51801f(c18034p2)) {
                    region2.op(c39179kM115322c.f168418a, c39179kM115322c.f168419b, c39179kM115322c.f168420c, c39179kM115322c.f168421d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Object m51799d(C18030l c18030l, C18043y c18043y) {
        Object objM129g = c18030l.f69980w.m129g(c18043y);
        if (objM129g == null) {
            return null;
        }
        return objM129g;
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m51800e(C18034p c18034p) {
        NodeCoordinator nodeCoordinatorM51780d = c18034p.m51780d();
        C18030l c18030l = c18034p.f69989d;
        if (nodeCoordinatorM51780d != null ? nodeCoordinatorM51780d.m3544o1() : false) {
            return true;
        }
        C18043y c18043y = AbstractC18039u.f70034a;
        if (c18030l.f69980w.m125c(AbstractC18039u.f70049p)) {
            return true;
        }
        return c18030l.f69980w.m125c(AbstractC18039u.f70048o);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public static final boolean m51801f(C18034p c18034p) {
        if (!m51800e(c18034p)) {
            C18030l c18030l = c18034p.f69989d;
            if (c18030l.f69982y) {
                return true;
            }
            C0057v0 c0057v0 = c18030l.f69980w;
            Object[] objArr = c0057v0.f171b;
            Object[] objArr2 = c0057v0.f172c;
            long[] jArr = c0057v0.f170a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j7 = jArr[i13];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((255 & j7) < 128) {
                                int i16 = (i13 << 3) + i15;
                                Object obj = objArr[i16];
                                Object obj2 = objArr2[i16];
                                if (((C18043y) obj).f70066c) {
                                    return true;
                                }
                            }
                            j7 >>= 8;
                        }
                        if (i14 == 8) {
                            if (i13 != length) {
                                i13++;
                            }
                        }
                    } else if (i13 != length) {
                        i13++;
                    }
                }
            }
        }
        return false;
    }
}
