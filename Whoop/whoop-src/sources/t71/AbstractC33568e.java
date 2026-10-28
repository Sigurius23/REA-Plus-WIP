package t71;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import i21.AbstractC18009s;
import i21.AbstractC18010t;
import l83.C23454a0;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.C33192k;

/* JADX INFO: renamed from: t71.e */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lt71/f;", "impactState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "c", "(Landroidx/compose/ui/Modifier;Lt71/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC33568e {
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:55:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x015c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0164  */
    /* JADX WARN: Code duplicated, block: B:62:0x0170  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m106004c(Modifier modifier, C33569f impactState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        C28655q c28655q;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Function1 function4;
        InterfaceC33570g impactCardType;
        int i16;
        Object objM87133R;
        AbstractC22676k.m65750j(impactState, "impactState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-2141270677);
        int i17 = i14 & 1;
        if (i17 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q2.m87153g(impactState) : c28655q2.m87157i(impactState) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i17 != 0) {
                    modifier3 = c2314t;
                } else {
                    modifier3 = modifier2;
                }
                if (i18 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C33192k(29);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                impactCardType = impactState.getImpactCardType();
                if (impactCardType instanceof InterfaceC33570g.b) {
                    c28655q2.m87150e0(-1740197541);
                    AbstractC18010t.m51710f(AbstractC1099a.m3394p(2 * 8, c2314t).mo3471e(modifier3), impactState.getTitle(), impactState.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), impactState.getSubTitle(), impactState.getSubTitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), impactState.getCtaButtonText(), ((InterfaceC33570g.b) impactState.getImpactCardType()).getHorizontalImpactBarViewState(), (InterfaceC33570g.b) impactState.getImpactCardType(), function4, c28655q2, 234881024 & (i15 << 18), 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                } else {
                    i16 = i15;
                    if (impactCardType instanceof InterfaceC33570g.a) {
                        throw AbstractC11895b.m32003v(-471779701, c28655q2, false);
                    }
                    c28655q2.m87150e0(-471753171);
                    AbstractC18009s.m51698g(AbstractC1099a.m3394p(2 * 8, c2314t).mo3471e(modifier3), impactState.getTitle(), impactState.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), impactState.getSubTitle(), impactState.getSubTitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), impactState.getCtaButtonText(), (InterfaceC33570g.a) impactState.getImpactCardType(), ((InterfaceC33570g.a) impactState.getImpactCardType()).m106013a(), function4, c28655q2, 234881024 & (i16 << 18), 0);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                function3 = function4;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33567d(modifier3, impactState, function3, i13, i14, 0);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i17 != 0) {
                modifier3 = c2314t;
            } else {
                modifier3 = modifier2;
            }
            if (i18 != 0) {
                objM87133R = c28655q2.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C33192k(29);
                    c28655q2.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            impactCardType = impactState.getImpactCardType();
            if (impactCardType instanceof InterfaceC33570g.b) {
                c28655q2.m87150e0(-1740197541);
                AbstractC18010t.m51710f(AbstractC1099a.m3394p(2 * 8, c2314t).mo3471e(modifier3), impactState.getTitle(), impactState.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), impactState.getSubTitle(), impactState.getSubTitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), impactState.getCtaButtonText(), ((InterfaceC33570g.b) impactState.getImpactCardType()).getHorizontalImpactBarViewState(), (InterfaceC33570g.b) impactState.getImpactCardType(), function4, c28655q2, 234881024 & (i15 << 18), 0);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                i16 = i15;
                if (impactCardType instanceof InterfaceC33570g.a) {
                    throw AbstractC11895b.m32003v(-471779701, c28655q2, false);
                }
                c28655q2.m87150e0(-471753171);
                AbstractC18009s.m51698g(AbstractC1099a.m3394p(2 * 8, c2314t).mo3471e(modifier3), impactState.getTitle(), impactState.getTitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), impactState.getSubTitle(), impactState.getSubTitleColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), impactState.getCtaButtonText(), (InterfaceC33570g.a) impactState.getImpactCardType(), ((InterfaceC33570g.a) impactState.getImpactCardType()).m106013a(), function4, c28655q2, 234881024 & (i16 << 18), 0);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            function3 = function4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33567d(modifier3, impactState, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m106005d(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m106006e(Modifier modifier, C33569f c33569f, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m106004c(modifier, c33569f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
