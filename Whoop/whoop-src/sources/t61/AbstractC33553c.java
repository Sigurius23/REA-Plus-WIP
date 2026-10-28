package t61;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b11.C2276c;
import com.whoop.design.util.AbstractC8693b;
import e61.C12764g;
import i71.C18204h;
import i71.C18205i;
import i71.InterfaceC18203g;
import java.util.ArrayList;
import java.util.List;
import k61.C22228a;
import k61.C22230c;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p91.AbstractC29011e;
import p91.C29007a;
import s61.AbstractC32230a;
import s61.AbstractC32232c;
import u61.C34552a;
import u61.C34554c;
import u61.C34556e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: t61.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "Lu61/a;", "segments", "Li71/g;", "dataScroller", "Li71/h;", "scrollPosition", "Ll83/a0;", "c", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Li71/g;Li71/h;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33553c {
    /* JADX WARN: Code duplicated, block: B:102:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:106:0x0213  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:72:0x0100  */
    /* JADX WARN: Code duplicated, block: B:77:0x0121  */
    /* JADX WARN: Code duplicated, block: B:81:0x013c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code duplicated, block: B:85:0x015f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0178  */
    /* JADX WARN: Code duplicated, block: B:89:0x0185  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c3  */
    /* JADX INFO: renamed from: c */
    public static final void m105959c(Modifier modifier, List<C34552a> segments, InterfaceC18203g interfaceC18203g, C18204h c18204h, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C18204h c18204h2;
        Modifier modifier3;
        C18204h c18204h3;
        InterfaceC18203g interfaceC18203g2;
        InterfaceC18203g interfaceC18203g3;
        C18204h c18204h4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C22228a c22228aM109233c;
        C22230c c22230cM109236f;
        ArrayList<C34556e> arrayList;
        String strM21274h;
        boolean zM87153g;
        Object objM87133R;
        boolean z4;
        int i16;
        int i17;
        InterfaceC18203g c18205i = interfaceC18203g;
        AbstractC22676k.m65750j(segments, "segments");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-34778177);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(segments) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) != 0) {
                i17 = 128;
            } else if ((i13 & 512) == 0 ? c28655q.m87153g(c18205i) : c28655q.m87157i(c18205i)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i15 |= i17;
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                c18204h2 = c18204h;
                if (c28655q.m87153g(c18204h2)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i15 |= i16;
            } else {
                c18204h2 = c18204h;
            }
            i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            i15 |= i16;
        } else {
            c18204h2 = c18204h;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            c28655q.m87140Z();
            int i19 = i13 & 1;
            C2314t c2314t = C2314t.f9131w;
            if (i19 == 0 || c28655q.m87118C()) {
                if (i18 != 0) {
                    modifier2 = c2314t;
                }
                if ((i14 & 4) != 0) {
                    c18205i = new C18205i();
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    interfaceC18203g3 = c18205i;
                    c18204h4 = new C18204h(0L, 0L, 0L, 0.0f, 15, null);
                }
                c28655q.m87175r();
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9104G, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                c28655q.m87150e0(89282426);
                for (C34552a c34552a : segments) {
                    List listMo52257a = interfaceC18203g3.mo52257a(c34552a.m109234d(), c18204h4, c34552a.getScrollerOffset());
                    c22228aM109233c = c34552a.getFillState();
                    if (c22228aM109233c == null) {
                        c28655q.m87150e0(-976037061);
                    } else {
                        c28655q.m87150e0(-976037060);
                        AbstractC32230a.m100268c(c22228aM109233c, c34552a, c18204h4, interfaceC18203g3, c28655q, ((i15 >> 3) & 896) | ((i15 << 3) & 7168));
                    }
                    c28655q.m87173q(false);
                    c22230cM109236f = c34552a.getStrokeState();
                    if (c22230cM109236f == null) {
                        c28655q.m87150e0(-975939845);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-975939844);
                        AbstractC32232c.m100273c(c22230cM109236f, c34552a, c18204h4, interfaceC18203g3, c28655q, ((i15 >> 3) & 896) | ((i15 << 3) & 7168));
                        c28655q.m87173q(false);
                    }
                    c28655q.m87150e0(89294847);
                    arrayList = new ArrayList();
                    for (Object obj : listMo52257a) {
                        if (((C34556e) obj).getCircle() != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            arrayList.add(obj);
                        }
                    }
                    for (C34556e c34556e : arrayList) {
                        strM21274h = AbstractC8693b.m21274h(c34556e.getContentDescription(), c28655q, 0);
                        Modifier modifierM88149j = AbstractC29011e.m88149j(c2314t, c34556e.getXPercent(), -c34556e.getYPercent(), C29007a.m88130f(C29007a.INSTANCE.m88136a(), 0.0f, -0.5f, false, false, 13, null));
                        zM87153g = c28655q.m87153g(strM21274h);
                        objM87133R = c28655q.m87133R();
                        if (zM87153g || objM87133R == C28635l.f115821a) {
                            objM87133R = new C12764g(strM21274h, 20);
                            c28655q.m87172p0(objM87133R);
                        }
                        Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM88149j, true, (Function1) objM87133R);
                        C34554c circle = c34556e.getCircle();
                        AbstractC22676k.m65747g(circle);
                        C28655q c28655q2 = c28655q;
                        AbstractC33552b.m105950e(modifierM51775c, circle, c34556e.getLabel(), c28655q2, 0, 0);
                        c28655q = c28655q2;
                    }
                    c28655q.m87173q(false);
                    interfaceC18203g3 = interfaceC18203g3;
                    c18204h4 = c18204h4;
                }
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                modifier3 = modifier2;
                interfaceC18203g2 = interfaceC18203g3;
                c18204h3 = c18204h4;
            } else {
                c28655q.m87138X();
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
            }
            interfaceC18203g3 = c18205i;
            c18204h4 = c18204h2;
            c28655q.m87175r();
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9104G, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifier2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            c28655q.m87150e0(89282426);
            while (r0.hasNext()) {
                List listMo52257a2 = interfaceC18203g3.mo52257a(c34552a.m109234d(), c18204h4, c34552a.getScrollerOffset());
                c22228aM109233c = c34552a.getFillState();
                if (c22228aM109233c == null) {
                    c28655q.m87150e0(-976037061);
                } else {
                    c28655q.m87150e0(-976037060);
                    AbstractC32230a.m100268c(c22228aM109233c, c34552a, c18204h4, interfaceC18203g3, c28655q, ((i15 >> 3) & 896) | ((i15 << 3) & 7168));
                }
                c28655q.m87173q(false);
                c22230cM109236f = c34552a.getStrokeState();
                if (c22230cM109236f == null) {
                    c28655q.m87150e0(-975939845);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-975939844);
                    AbstractC32232c.m100273c(c22230cM109236f, c34552a, c18204h4, interfaceC18203g3, c28655q, ((i15 >> 3) & 896) | ((i15 << 3) & 7168));
                    c28655q.m87173q(false);
                }
                c28655q.m87150e0(89294847);
                arrayList = new ArrayList();
                while (r1.hasNext()) {
                    if (((C34556e) obj).getCircle() != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        arrayList.add(obj);
                    }
                }
                while (r1.hasNext()) {
                    strM21274h = AbstractC8693b.m21274h(c34556e.getContentDescription(), c28655q, 0);
                    Modifier modifierM88149j2 = AbstractC29011e.m88149j(c2314t, c34556e.getXPercent(), -c34556e.getYPercent(), C29007a.m88130f(C29007a.INSTANCE.m88136a(), 0.0f, -0.5f, false, false, 13, null));
                    zM87153g = c28655q.m87153g(strM21274h);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g) {
                        objM87133R = new C12764g(strM21274h, 20);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C12764g(strM21274h, 20);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierM88149j2, true, (Function1) objM87133R);
                    C34554c circle2 = c34556e.getCircle();
                    AbstractC22676k.m65747g(circle2);
                    C28655q c28655q3 = c28655q;
                    AbstractC33552b.m105950e(modifierM51775c2, circle2, c34556e.getLabel(), c28655q3, 0, 0);
                    c28655q = c28655q3;
                }
                c28655q.m87173q(false);
                interfaceC18203g3 = interfaceC18203g3;
                c18204h4 = c18204h4;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
            modifier3 = modifier2;
            interfaceC18203g2 = interfaceC18203g3;
            c18204h3 = c18204h4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            c18204h3 = c18204h2;
            interfaceC18203g2 = c18205i;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2276c(modifier3, segments, interfaceC18203g2, c18204h3, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m105960d(String str, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51806e(str, semantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m105961e(Modifier modifier, List list, InterfaceC18203g interfaceC18203g, C18204h c18204h, int i13, int i14, Composer composer, int i15) {
        m105959c(modifier, list, interfaceC18203g, c18204h, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
