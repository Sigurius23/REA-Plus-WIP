package lf0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.advancedlabs.presentation.models.AppointmentSummaryBottomSheet;
import j21.C21245d;
import kd1.AbstractC22403o;
import l72.C23401h;
import l80.C23434k;
import l83.C23454a0;
import lc0.C23825g;
import ld0.C23845d;
import p026b2.C2314t;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import rz0.AbstractC31926e;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llf0/h;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Llf0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23918g {
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m70351e(Modifier modifier, C23922h viewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        boolean z4;
        Function1 function2;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        Function1 function3;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1630545080);
        int i16 = i14 & 1;
        if (i16 != 0) {
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                i15 |= c28655q.m87157i(function1) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C23825g(6);
                        c28655q.m87172p0(objM87133R);
                    }
                    function3 = (Function1) objM87133R;
                } else {
                    function3 = function1;
                }
                AbstractC31926e.m99375j(modifier4, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-426326232, c28655q, new C21245d(11, viewState, function3)), c28655q, (i15 & 14) | 12582912, 122);
                modifier3 = modifier4;
                function2 = function3;
            } else {
                c28655q.m87138X();
                function2 = function1;
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 6, (Object) modifier3, (Object) viewState, function2);
            }
        }
        i15 |= 384;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            if (i17 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C23825g(6);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            AbstractC31926e.m99375j(modifier4, null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(-426326232, c28655q, new C21245d(11, viewState, function3)), c28655q, (i15 & 14) | 12582912, 122);
            modifier3 = modifier4;
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 6, (Object) modifier3, (Object) viewState, function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m70352f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m70353g(C23922h c23922h, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * 8, C2314t.f9131w);
            C23845d c23845dM70362a = c23922h.getAppointmentSummary();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C23434k(function1, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23954p.m70583h(modifierM3394p, c23845dM70362a, (Function1) objM87133R, c28655q, (AbstractC22403o.f87638a << 3) | 6, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m70354h(Function1 function1, AppointmentSummaryBottomSheet bottomSheet) {
        AbstractC22676k.m65750j(bottomSheet, "bottomSheet");
        function1.invoke(bottomSheet);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m70355i(Modifier modifier, C23922h c23922h, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70351e(modifier, c23922h, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
