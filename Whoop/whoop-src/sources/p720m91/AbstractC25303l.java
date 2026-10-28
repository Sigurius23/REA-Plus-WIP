package p720m91;

import a11.C0127e;
import a11.C0132j;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b11.C2276c;
import c41.C4004c5;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import h01.C16542i;
import j02.C21174w;
import kotlin.C2032u;
import kw1.C22852c;
import l83.C23454a0;
import l83.InterfaceC23459e;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p292l1.AbstractC23149o4;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23753z4;
import pf3.C29155a;
import vc1.C35877a;
import wb3.AbstractC37056f;
import wf3.C37247a;
import x81.AbstractC38073e;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: m91.l */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u001aW\u0010\u000b\u001a\u00020\t\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"+\u0010#\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006%²\u0006\u000e\u0010$\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lm91/u;", "T", "item", "Lm91/p;", "itemFactory", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "modifierBuilder", "", "Ll83/a0;", "onViewEvent", "r", "(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lm91/o;", "itemWrapper", "q", "(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "content", "l", "(Lm91/u;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "Lp1/t1;", "a", "Lp1/t1;", "C", "()Lp1/t1;", "LocalItemViewFactory", "", "<set-?>", "b", "Lp1/c1;", "B", "()Z", "D", "(Z)V", "debugDesignSystemEnabled", "visible", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25303l {

    /* JADX INFO: renamed from: a */
    private static final AbstractC28669t1 f99292a = new C28596b0(new C21174w(27));

    /* JADX INFO: renamed from: b */
    private static final InterfaceC28601c1 f99293b = AbstractC28683x.m87272z(Boolean.FALSE);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C25307p m74270A() {
        return Function1.m74312m();
    }

    /* JADX INFO: renamed from: B */
    public static final boolean m74271B() {
        return ((Boolean) f99293b.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: C */
    public static final AbstractC28669t1 m74272C() {
        return f99292a;
    }

    /* JADX INFO: renamed from: D */
    public static final void m74273D(boolean z4) {
        f99293b.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: l */
    private static final void m74285l(InterfaceC25312u interfaceC25312u, InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        int i14;
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-308724218);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(interfaceC25312u) : c28655q.m87157i(interfaceC25312u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4351m) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (m74271B()) {
            c28655q.m87150e0(-1678069794);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.TRUE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            interfaceC4351m.invoke(c28655q, Integer.valueOf((i14 >> 3) & 14));
            if (m74286m(interfaceC28601c1)) {
                c28655q.m87150e0(-157273724);
                String strValueOf = String.valueOf(AbstractC22671h0.f89337a.getOrCreateKotlinClass(interfaceC25312u.getClass()).getSimpleName());
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C16542i(4, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R2);
                }
                z4 = false;
                AbstractC23149o4.m67128c(strValueOf, AbstractC1092a.m3358c(C1100b.f4583a.mo3400a(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R2, 15), C2299e.f9114w), C17919x.f69625b, AbstractC17918w0.f69621a), C17919x.f69631h, 0L, null, 0L, null, 0L, 0, false, 0, 0, C38072d.f163053a.m121952e(c28655q, 6).getH4().getStyle(), c28655q, 384, 0, 131064);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                z4 = false;
                c28655q.m87150e0(-156882597);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(z4);
        } else {
            c28655q.m87150e0(-1677480701);
            AbstractC11895b.m32007z((i14 >> 3) & 14, interfaceC4351m, c28655q, false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0132j(interfaceC25312u, interfaceC4351m, i13, 12);
        }
    }

    /* JADX INFO: renamed from: m */
    private static final boolean m74286m(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    private static final void m74287n(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m74288o(InterfaceC28601c1 interfaceC28601c1) {
        m74287n(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m74289p(InterfaceC25312u interfaceC25312u, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m74285l(interfaceC25312u, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final void m74290q(C25306o itemWrapper, C25307p c25307p, Function3 function3, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        C25307p c25307p2;
        Function3 function4;
        Function1 function2;
        AbstractC22676k.m65750j(itemWrapper, "itemWrapper");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1777065199);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(itemWrapper) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= ((i14 & 2) == 0 && c28655q.m87157i(c25307p)) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= ((i14 & 4) == 0 && c28655q.m87157i(function3)) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if ((i14 & 2) != 0) {
                    c25307p = (C25307p) c28655q.m87161k(f99292a);
                }
                if ((i14 & 4) != 0) {
                    function3 = new Function3() { // from class: m91.k
                        @Override // p715kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return AbstractC25303l.m74296w((InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    };
                }
                if (i16 != 0) {
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C25293d(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    function1 = (Function1) objM87133R;
                }
            } else {
                c28655q.m87138X();
            }
            C25307p c25307p3 = c25307p;
            Function3 function5 = function3;
            Function1 function6 = function1;
            c28655q.m87175r();
            m74285l(itemWrapper.getState(), AbstractC37817c.m121344e(-1514856663, c28655q, new C2032u(itemWrapper, function6, c25307p3, function5, 23)), c28655q, 48);
            function2 = function6;
            c25307p2 = c25307p3;
            function4 = function5;
        } else {
            c28655q.m87138X();
            c25307p2 = c25307p;
            function4 = function3;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c((Object) itemWrapper, (Object) c25307p2, (Object) function4, (InterfaceC23459e) function2, i13, i14, 14);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final <T extends InterfaceC25312u> void m74291r(T item, C25307p c25307p, Function3 function3, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        C25307p c25307p2;
        Function3 c4004c5;
        Function1 function2;
        C25307p c25307p3;
        Function1 function4;
        AbstractC22676k.m65750j(item, "item");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-219034850);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(item) : c28655q.m87157i(item) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= ((i14 & 2) == 0 && c28655q.m87157i(c25307p)) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= ((i14 & 4) == 0 && c28655q.m87157i(function3)) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            c28655q.m87140Z();
            if ((i13 & 1) == 0 || c28655q.m87118C()) {
                if ((i14 & 2) != 0) {
                    c25307p3 = (C25307p) c28655q.m87161k(f99292a);
                    i15 &= -113;
                } else {
                    c25307p3 = c25307p;
                }
                if ((i14 & 4) != 0) {
                    c4004c5 = new C4004c5(6);
                    i15 &= -897;
                } else {
                    c4004c5 = function3;
                }
                if (i16 != 0) {
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C23753z4(22);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                }
                int i17 = i15;
                c28655q.m87175r();
                C25307p c25307p4 = c25307p3;
                c25307p2 = c25307p4;
                m74285l(item, AbstractC37817c.m121344e(-1091886586, c28655q, new C0127e(c25307p4, item, c4004c5, i17, function4)), c28655q, (i17 & 14) | (i17 & 8) | 48);
                function2 = function4;
            } else {
                c28655q.m87138X();
                if ((i14 & 2) != 0) {
                    i15 &= -113;
                }
                if ((i14 & 4) != 0) {
                    i15 &= -897;
                }
                c25307p3 = c25307p;
                c4004c5 = function3;
            }
            function4 = function1;
            int i18 = i15;
            c28655q.m87175r();
            C25307p c25307p5 = c25307p3;
            c25307p2 = c25307p5;
            m74285l(item, AbstractC37817c.m121344e(-1091886586, c28655q, new C0127e(c25307p5, item, c4004c5, i18, function4)), c28655q, (i18 & 14) | (i18 & 8) | 48);
            function2 = function4;
        } else {
            c28655q.m87138X();
            c25307p2 = c25307p;
            c4004c5 = function3;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2276c(item, c25307p2, c4004c5, function2, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Modifier m74292s(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1549423055);
        c28655q.m87173q(false);
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m74293t(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m74294u(C25307p c25307p, InterfaceC25312u interfaceC25312u, Function3 function3, int i13, Function1 function1, Composer composer, int i14) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            int i15 = i13 & 8;
            c25307p.m74321c(interfaceC25312u).Compose((Modifier) function3.invoke(interfaceC25312u, c28655q, Integer.valueOf(i15)), interfaceC25312u, function1, c28655q, i15 << 3);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m74295v(InterfaceC25312u interfaceC25312u, C25307p c25307p, Function3 function3, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m74291r(interfaceC25312u, c25307p, function3, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final Modifier m74296w(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-744067111);
        c28655q.m87173q(false);
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m74297x(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m74298y(C25306o c25306o, Function1 function1, C25307p c25307p, Function3 function3, Composer composer, int i13) {
        Object objM122604c;
        C37247a c37247a;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            C26669a c26669a = C29155a.f118017b;
            C38266c c38266c = (c26669a == null || (c37247a = c26669a.f106046a) == null) ? null : c37247a.f159364d;
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = (c38266c == null || (objM122604c = c38266c.m122604c(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35877a.class), null)) == null) ? null : objM122604c;
                c28655q.m87172p0(objM87133R);
            }
            c25307p.m74321c(c25306o.getState()).Compose((Modifier) function3.invoke(c25306o.getState(), c28655q, 0), c25306o.getState(), C25298g.f99287a.m74261b(c25306o, function1, featureFlagChecker.isFeatureEnabled("android-item-tap-reporter") ? (C35877a) objM87133R : null), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m74299z(C25306o c25306o, C25307p c25307p, Function3 function3, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m74290q(c25306o, c25307p, function3, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
