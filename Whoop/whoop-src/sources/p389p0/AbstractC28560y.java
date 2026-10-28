package p389p0;

import androidx.compose.foundation.lazy.layout.C1107c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2647w2;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import i93.C18284j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import m83.AbstractC25265s;
import m83.AbstractC25269w;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26944e0;
import nq0.C27050m;
import nx1.C27225g;
import o71.C27632b;
import ox0.C28448b;
import p002a0.AbstractC0048r;
import p002a0.C0020f0;
import p012ab.C0682h0;
import p014aj.C0929d;
import p133f1.C13996z;
import p268k0.AbstractC22086a;
import p292l1.C23205y0;
import p318m3.C24977g;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p446r1.C30849c;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39035h;
import p634y1.AbstractC39038k;
import p634y1.C39031d;
import p634y1.InterfaceC39030c;
import p634y1.InterfaceC39033f;
import p635y2.AbstractC39098h1;
import p652yl.C39615a;
import p668z1.AbstractC39957f;
import p715kotlin.jvm.functions.Function1;
import p725ot1.C28330f;

/* JADX INFO: renamed from: p0.y */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC28560y {

    /* JADX INFO: renamed from: a */
    public static final C28550t[] f115546a = new C28550t[0];

    /* JADX INFO: renamed from: b */
    public static final C24977g f115547b = new C24977g(13);

    /* JADX INFO: renamed from: c */
    public static final void m86876c(InterfaceC4339a interfaceC4339a, Modifier modifier, C28535l0 c28535l0, InterfaceC28512c0 interfaceC28512c0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1055276397);
        int i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13 | (c28655q.m87153g(modifier) ? 32 : 16) | (c28655q.m87153g(c28535l0) ? 256 : 128) | (c28655q.m87153g(interfaceC28512c0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            m86878e(AbstractC37817c.m121344e(-933153643, c28655q, new C1107c(c28535l0, modifier, interfaceC28512c0, AbstractC28683x.m87238F(interfaceC4339a, c28655q))), c28655q, 6);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27632b(interfaceC4339a, modifier, c28535l0, interfaceC28512c0, i13, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m86877d(Object obj, int i13, C28527h0 c28527h0, C37816b c37816b, Composer composer, int i14) {
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(872548579);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87157i(obj) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87157i(c28527h0) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q.m87157i(c37816b) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            boolean zM87153g = c28655q.m87153g(obj) | c28655q.m87153g(c28527h0);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C28524g0(obj, c28527h0);
                c28655q.m87172p0(objM87133R);
            }
            C28524g0 c28524g0 = (C28524g0) objM87133R;
            c28524g0.f115427c = i13;
            C28633k1 c28633k1 = c28524g0.f115431g;
            C28596b0 c28596b0 = AbstractC39098h1.f168192a;
            C28524g0 c28524g1 = (C28524g0) c28655q.m87161k(c28596b0);
            AbstractC39957f abstractC39957fM126587c = C39615a.m126587c();
            Function1 function1Mo128133e = abstractC39957fM126587c != null ? abstractC39957fM126587c.mo128133e() : null;
            AbstractC39957f abstractC39957fM126589e = C39615a.m126589e(abstractC39957fM126587c);
            try {
                if (c28524g1 != ((C28524g0) c28633k1.getValue())) {
                    c28633k1.setValue(c28524g1);
                    if (c28524g0.f115428d > 0) {
                        C28524g0 c28524g2 = c28524g0.f115429e;
                        if (c28524g2 != null) {
                            c28524g2.m86828b();
                        }
                        if (c28524g1 != null) {
                            c28524g1.m86827a();
                        } else {
                            c28524g1 = null;
                        }
                        c28524g0.f115429e = c28524g1;
                    }
                }
                C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                boolean zM87153g2 = c28655q.m87153g(c28524g0);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C26944e0(c28524g0, 21);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87251e(c28524g0, (Function1) objM87133R2, c28655q);
                AbstractC28683x.m87247a(c28596b0.mo86977a(c28524g0), c37816b, c28655q, ((i15 >> 6) & 112) | 8);
            } catch (Throwable th3) {
                C39615a.m126591g(abstractC39957fM126587c, abstractC39957fM126589e, function1Mo128133e);
                throw th3;
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(i13, i14, 7, obj, c28527h0, c37816b);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m86878e(C37816b c37816b, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-709502251);
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C28674u2 c28674u2 = AbstractC39035h.f168004a;
            InterfaceC39033f interfaceC39033f = (InterfaceC39033f) c28655q.m87161k(c28674u2);
            C39031d c39031dM124461g = AbstractC39038k.m124461g(c28655q);
            Object[] objArr = {interfaceC39033f};
            C28539n0 c28539n0 = new C28539n0(10, new C28557w0(0), new C27050m(16, interfaceC39033f, c39031dM124461g));
            boolean zM87157i = c28655q.m87157i(interfaceC39033f) | c28655q.m87157i(c39031dM124461g);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C28448b(6, interfaceC39033f, c39031dM124461g);
                c28655q.m87172p0(objM87133R);
            }
            C28559x0 c28559x0 = (C28559x0) AbstractC39038k.m124458d(objArr, c28539n0, (InterfaceC4339a) objM87133R, c28655q, 0);
            AbstractC28683x.m87247a(c28674u2.mo86977a(c28559x0), AbstractC37817c.m121344e(-412824043, c28655q, new C2647w2(26, c37816b, c28559x0)), c28655q, 56);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13996z(c37816b, i13, 4);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m86879f(InterfaceC28509b0 interfaceC28509b0, Object obj, int i13, Object obj2, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1439843069);
        int i15 = (c28655q.m87153g(interfaceC28509b0) ? 4 : 2) | i14 | (c28655q.m87153g(obj) ? 32 : 16) | (c28655q.m87149e(i13) ? 256 : 128) | (c28655q.m87153g(obj2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            ((InterfaceC39030c) obj).mo86875c(obj2, AbstractC37817c.m121344e(980966366, c28655q, new C23205y0(i13, obj2, interfaceC28509b0)), c28655q, 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g(interfaceC28509b0, obj, i13, obj2, i14);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final int m86880g(int i13, C30849c c30849c) {
        int i14 = c30849c.f127229y - 1;
        int i15 = 0;
        while (i15 < i14) {
            int i16 = ((i14 - i15) / 2) + i15;
            Object[] objArr = c30849c.f127227w;
            int i17 = ((C28526h) objArr[i16]).f115433a;
            if (i17 != i13) {
                if (i17 < i13) {
                    i15 = i16 + 1;
                    if (i13 < ((C28526h) objArr[i15]).f115433a) {
                    }
                } else {
                    i14 = i16 - 1;
                }
            }
            return i16;
        }
        return i15;
    }

    /* JADX INFO: renamed from: h */
    public static final C28530j m86881h(Object obj) {
        if (obj instanceof C28530j) {
            return (C28530j) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final List m86882i(C28519e1 c28519e1, int i13, int i14, ArrayList arrayList, C0020f0 c0020f0, int i15, int i16, int i17, Function1 function1) {
        int i18;
        C0020f0 c0020f1;
        long j7;
        long j13;
        int i19;
        Object obj;
        int i24;
        if (c28519e1 == null || arrayList.isEmpty() || (i18 = c0020f0.f47b) == 0) {
            return C25271y.f99162w;
        }
        int i25 = -1;
        if (i14 - i13 < 0 || i18 == 0) {
            c0020f1 = AbstractC0048r.f139a;
        } else {
            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, i18);
            int i26 = c18284jM36278i0.f71133w;
            int i27 = c18284jM36278i0.f71134x;
            int iM28c = -1;
            if (i26 <= i27) {
                while (c0020f0.m28c(i26) <= i13) {
                    iM28c = c0020f0.m28c(i26);
                    if (i26 == i27) {
                        break;
                    }
                    i26++;
                }
            }
            if (iM28c == -1) {
                c0020f1 = AbstractC0048r.f139a;
            } else {
                C0020f0 c0020f2 = AbstractC0048r.f139a;
                c0020f1 = new C0020f0(1);
                c0020f1.m26a(iM28c);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i28 = 0; i28 < size; i28++) {
            Object obj2 = arrayList.get(i28);
            int index = ((InterfaceC28518e0) obj2).getIndex();
            int[] iArr = c0020f0.f46a;
            int i29 = c0020f0.f47b;
            for (int i34 = 0; i34 < i29; i34++) {
                if (iArr[i34] == index) {
                    arrayList3.add(obj2);
                    break;
                }
            }
        }
        int[] iArr2 = c0020f1.f46a;
        int i35 = c0020f1.f47b;
        int i36 = 0;
        while (i36 < i35) {
            int i37 = iArr2[i36];
            Iterator it = arrayList.iterator();
            int i38 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i38 = i25;
                    break;
                }
                if (((InterfaceC28518e0) it.next()).getIndex() == i37) {
                    break;
                }
                i38++;
            }
            InterfaceC28518e0 interfaceC28518e0 = i38 == i25 ? (InterfaceC28518e0) function1.invoke(Integer.valueOf(i37)) : (InterfaceC28518e0) arrayList.remove(i38);
            int iMo77544g = interfaceC28518e0.mo77544g();
            if (i38 == i25) {
                j7 = 4294967295L;
                i19 = Integer.MIN_VALUE;
            } else {
                long jMo77547j = interfaceC28518e0.mo77547j(0);
                if (interfaceC28518e0.mo77542e()) {
                    j7 = 4294967295L;
                    j13 = jMo77547j & 4294967295L;
                } else {
                    j7 = 4294967295L;
                    j13 = jMo77547j >> 32;
                }
                i19 = (int) j13;
            }
            int size2 = arrayList3.size();
            int i39 = 0;
            while (true) {
                if (i39 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i39);
                if (((InterfaceC28518e0) obj).getIndex() != i37) {
                    break;
                }
                i39++;
            }
            InterfaceC28518e0 interfaceC28518e1 = (InterfaceC28518e0) obj;
            if (interfaceC28518e1 != null) {
                long jMo77547j2 = interfaceC28518e1.mo77547j(0);
                i24 = (int) (interfaceC28518e1.mo77542e() ? jMo77547j2 & j7 : jMo77547j2 >> 32);
            } else {
                i24 = Integer.MIN_VALUE;
            }
            int iMax = i19 == Integer.MIN_VALUE ? -i15 : Math.max(-i15, i19);
            if (i24 != Integer.MIN_VALUE) {
                iMax = Math.min(iMax, i24 - iMo77544g);
            }
            interfaceC28518e0.mo77546i();
            interfaceC28518e0.mo77538a(iMax, 0, i16, i17);
            arrayList2.add(interfaceC28518e0);
            i36++;
            i25 = -1;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: j */
    public static final List m86883j(InterfaceC28509b0 interfaceC28509b0, C28527h0 c28527h0, C0929d c0929d) {
        C18284j c18284j;
        C30849c c30849c = (C30849c) c0929d.f3422w;
        if (!(c30849c.f127229y != 0) && c28527h0.f115436w.isEmpty()) {
            return C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        if (((C30849c) c0929d.f3422w).f127229y != 0) {
            int i13 = c30849c.f127229y;
            if (i13 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr = c30849c.f127227w;
            int i14 = ((C28532k) objArr[0]).f115445a;
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = ((C28532k) objArr[i15]).f115445a;
                if (i16 < i14) {
                    i14 = i16;
                }
            }
            if (i14 < 0) {
                AbstractC22086a.m63158a("negative minIndex");
            }
            int i17 = c30849c.f127229y;
            if (i17 == 0) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            Object[] objArr2 = c30849c.f127227w;
            int i18 = ((C28532k) objArr2[0]).f115446b;
            for (int i19 = 0; i19 < i17; i19++) {
                int i24 = ((C28532k) objArr2[i19]).f115446b;
                if (i24 > i18) {
                    i18 = i24;
                }
            }
            c18284j = new C18284j(i14, Math.min(i18, interfaceC28509b0.getItemCount() - 1), 1);
        } else {
            c18284j = C18284j.f71140z;
        }
        int size = c28527h0.f115436w.size();
        for (int i25 = 0; i25 < size; i25++) {
            C28524g0 c28524g0 = (C28524g0) c28527h0.get(i25);
            int iM86884k = m86884k(c28524g0.f115427c, c28524g0.f115425a, interfaceC28509b0);
            int i26 = c18284j.f71133w;
            if ((iM86884k > c18284j.f71134x || i26 > iM86884k) && iM86884k >= 0 && iM86884k < interfaceC28509b0.getItemCount()) {
                arrayList.add(Integer.valueOf(iM86884k));
            }
        }
        int i27 = c18284j.f71133w;
        int i28 = c18284j.f71134x;
        if (i27 <= i28) {
            while (true) {
                arrayList.add(Integer.valueOf(i27));
                if (i27 == i28) {
                    break;
                }
                i27++;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static final int m86884k(int i13, Object obj, InterfaceC28509b0 interfaceC28509b0) {
        int iMo77531b;
        return (obj == null || interfaceC28509b0.getItemCount() == 0 || (i13 < interfaceC28509b0.getItemCount() && obj.equals(interfaceC28509b0.mo77532c(i13))) || (iMo77531b = interfaceC28509b0.mo77531b(obj)) == -1) ? i13 : iMo77531b;
    }

    /* JADX INFO: renamed from: o */
    public static void m86885o() {
        int i13 = C28550t.f115500t;
    }

    /* JADX INFO: renamed from: p */
    public static final List m86886p(int i13, int i14, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return C25271y.f99162w;
        }
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(list);
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            InterfaceC28518e0 interfaceC28518e0 = (InterfaceC28518e0) arrayList.get(i15);
            int index = interfaceC28518e0.getIndex();
            if (i13 <= index && index <= i14) {
                arrayListM74097F1.add(interfaceC28518e0);
            }
        }
        AbstractC25269w.m74166l0(arrayListM74097F1, f115547b);
        return arrayListM74097F1;
    }

    /* JADX INFO: renamed from: l */
    public Object m86887l(int i13) {
        C28526h c28526hM1698m = mo77527m().m1698m(i13);
        return c28526hM1698m.f115435c.getType().invoke(Integer.valueOf(i13 - c28526hM1698m.f115433a));
    }

    /* JADX INFO: renamed from: m */
    public abstract C0682h0 mo77527m();

    /* JADX INFO: renamed from: n */
    public Object m86888n(int i13) {
        Object objInvoke;
        C28526h c28526hM1698m = mo77527m().m1698m(i13);
        int i14 = i13 - c28526hM1698m.f115433a;
        Function1 key = c28526hM1698m.f115435c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i14))) == null) ? new C28520f(i13) : objInvoke;
    }
}
