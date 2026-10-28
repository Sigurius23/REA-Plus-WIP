package rx0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.C25307p;
import p720m91.C25311t;
import qk2.C30453i;
import qz0.AbstractC30795n;
import r12.C30856a;
import r80.AbstractC31061c;
import ri2.C31469a;
import rm2.C31604d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: rx0.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrx0/c;", "renderResult", "Lkotlin/Function0;", "Ll83/a0;", "onNavigateBack", "e", "(Lrx0/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "debug-tools_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31900e {
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x0146  */
    /* JADX WARN: Code duplicated, block: B:49:0x014a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0165  */
    /* JADX WARN: Code duplicated, block: B:57:0x016f  */
    /* JADX WARN: Code duplicated, block: B:59:0x01af  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:64:0x0202  */
    /* JADX WARN: Code duplicated, block: B:66:0x0210  */
    /* JADX WARN: Code duplicated, block: B:69:0x0244  */
    /* JADX WARN: Code duplicated, block: B:71:0x024c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0256  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m99157e(InterfaceC31898c renderResult, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a4;
        C38072d c38072d;
        int i16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int iHashCode2;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(renderResult, "renderResult");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-927629732);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(renderResult) : c28655q.m87157i(renderResult) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C31469a(29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, AbstractC22953f.m66725n(AbstractC1092a.m3358c(modifierM3407d, c38072d.m121949b(c28655q, i16).getBackgroundDarkStd(), AbstractC17918w0.f69621a)));
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("JSON Playground")), null, interfaceC4339a4, null, null, c28655q, ((i15 << 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
                InterfaceC4339a interfaceC4339a5 = interfaceC4339a4;
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3407d2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                if (renderResult instanceof InterfaceC31898c.a) {
                    AbstractC30795n.m94707h("No content to render", null, AbstractC31061c.m95627c(c28655q, 1443821637, c38072d, c28655q, i16), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 6, 0, 262138);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else if (renderResult instanceof InterfaceC31898c.b) {
                    c28655q.m87150e0(1443827719);
                    AbstractC30795n.m94707h(((InterfaceC31898c.b) renderResult).getMessage(), null, c38072d.m121949b(c28655q, i16).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 262138);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    if (renderResult instanceof InterfaceC31898c.c) {
                        throw AbstractC11895b.m32003v(1443819915, c28655q, false);
                    }
                    c28655q.m87150e0(1809187955);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = C25311t.f99303a.m74328b();
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a((C25307p) objM87133R), AbstractC37817c.m121344e(860793312, c28655q, new C30856a(renderResult, 14)), c28655q, 56);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a5;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(renderResult, i13, interfaceC4339a3, i14, 9);
            }
        }
        i15 |= 48;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C31469a(29);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, c2314t2);
            c38072d = C38072d.f163053a;
            i16 = C38072d.f163054b;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * 8, AbstractC22953f.m66725n(AbstractC1092a.m3358c(modifierM3407d3, c38072d.m121949b(c28655q, i16).getBackgroundDarkStd(), AbstractC17918w0.f69621a)));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N3);
            AbstractC6719b.m20143d(null, AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l("JSON Playground")), null, interfaceC4339a4, null, null, c28655q, ((i15 << 6) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
            InterfaceC4339a interfaceC4339a6 = interfaceC4339a4;
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, c2314t2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3407d4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            if (renderResult instanceof InterfaceC31898c.a) {
                AbstractC30795n.m94707h("No content to render", null, AbstractC31061c.m95627c(c28655q, 1443821637, c38072d, c28655q, i16), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 6, 0, 262138);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (renderResult instanceof InterfaceC31898c.b) {
                c28655q.m87150e0(1443827719);
                AbstractC30795n.m94707h(((InterfaceC31898c.b) renderResult).getMessage(), null, c38072d.m121949b(c28655q, i16).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q, 0, 0, 262138);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                if (renderResult instanceof InterfaceC31898c.c) {
                    throw AbstractC11895b.m32003v(1443819915, c28655q, false);
                }
                c28655q.m87150e0(1809187955);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = C25311t.f99303a.m74328b();
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a((C25307p) objM87133R), AbstractC37817c.m121344e(860793312, c28655q, new C30856a(renderResult, 14)), c28655q, 56);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a6;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(renderResult, i13, interfaceC4339a3, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m99158f() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m99159g(InterfaceC31898c interfaceC31898c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C25306o c25306oM99151a = ((InterfaceC31898c.c) interfaceC31898c).getItemWrapper();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C31604d(20);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74290q(c25306oM99151a, null, null, (Function1) objM87133R, c28655q, C25306o.f99297c | 3072, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m99160h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m99161i(InterfaceC31898c interfaceC31898c, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m99157e(interfaceC31898c, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
