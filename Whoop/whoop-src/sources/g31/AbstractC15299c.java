package g31;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.selection.AbstractC1110b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import dn0.C12212l;
import gy0.AbstractC16272a;
import gy0.AbstractC16277f;
import i93.C18283i;
import i93.C18284j;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import l83.C23454a0;
import m83.AbstractC25243e0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p163g1.C15160u4;
import p209i3.AbstractC18032n;
import p209i3.C18027i;
import p291l0.AbstractC22960g2;
import p291l0.AbstractC22977m;
import p291l0.InterfaceC22996s0;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p545v6.C35716e;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qc1.C30217a;
import x81.C38072d;

/* JADX INFO: renamed from: g31.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "maximum", "numSelected", "Lkotlin/Function1;", "Ll83/a0;", "onRatingSelected", "e", "(Landroidx/compose/ui/Modifier;IILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15299c {
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m43421e(Modifier modifier, final int i13, final int i14, Function1 function1, Composer composer, int i15, int i16) {
        Modifier modifier2;
        int i17;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        final Function1 function4;
        Object objM87133R;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(65220578);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            modifier2 = modifier;
        } else if ((i15 & 6) == 0) {
            modifier2 = modifier;
            i17 = (c28655q.m87153g(modifier2) ? 4 : 2) | i15;
        } else {
            modifier2 = modifier;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q.m87149e(i14) ? 256 : 128;
        }
        int i19 = i16 & 8;
        if (i19 == 0) {
            if ((i15 & 3072) == 0) {
                function2 = function1;
                i17 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i17 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i17 & 1, z4)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                if (i19 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C15160u4(7);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                float f13 = 8 * 0.5f;
                AbstractC22960g2.m66729a(AbstractC18032n.m51775c(modifier3, false, new C30217a(12)), AbstractC22977m.m66746i(f13), AbstractC22977m.m66746i(f13), null, 0, 0, AbstractC37817c.m121344e(370004743, c28655q, new Function3() { // from class: g31.b
                    @Override // p715kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return AbstractC15299c.m43423g(i13, i14, function4, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue);
                    }
                }), c28655q, 1573296, 56);
                function3 = function4;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C35716e(modifier2, i13, i14, function3, i15, i16, 2);
            }
        }
        i17 |= 3072;
        function2 = function1;
        if ((i17 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i17 & 1, z4)) {
            if (i18 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            if (i19 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C15160u4(7);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            float f14 = 8 * 0.5f;
            AbstractC22960g2.m66729a(AbstractC18032n.m51775c(modifier3, false, new C30217a(12)), AbstractC22977m.m66746i(f14), AbstractC22977m.m66746i(f14), null, 0, 0, AbstractC37817c.m121344e(370004743, c28655q, new Function3() { // from class: g31.b
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return AbstractC15299c.m43423g(i13, i14, function4, (InterfaceC22996s0) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q, 1573296, 56);
            function3 = function4;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35716e(modifier2, i13, i14, function3, i15, i16, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m43422f(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m43423g(int i13, int i14, Function1 function1, InterfaceC22996s0 FlowRow, Composer composer, int i15) {
        long jM53363d;
        AbstractC22676k.m65750j(FlowRow, "$this$FlowRow");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i15 & 1, (i15 & 17) != 16)) {
            Iterator it = new C18284j(1, i13, 1).iterator();
            while (((C18283i) it).f71138y) {
                int iNextInt = ((AbstractC25243e0) it).nextInt();
                boolean z4 = iNextInt <= i14;
                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(AbstractC16272a.f62144q3, c28655q, 0);
                String strM92102X = AbstractC30060g.m92102X(AbstractC16277f.f62362p, new Object[]{Integer.valueOf(iNextInt), Integer.valueOf(i13)}, c28655q);
                if (z4) {
                    c28655q.m87150e0(-1955268053);
                    jM53363d = C38072d.f163053a.m121949b(c28655q, 6).getAccentAction();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1955266906);
                    jM53363d = AbstractC18489d0.m53363d(C38072d.f163053a, c28655q, 6, false);
                }
                C18027i c18027i = new C18027i(3);
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87149e(iNextInt);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C12212l(function1, iNextInt, 1);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3446c = AbstractC1110b.m3446c(C2314t.f9131w, z4, c18027i, (InterfaceC4339a) objM87133R, 10);
                float f13 = 8;
                float f14 = 4;
                AbstractC15005f3.m43107a(abstractC26165aM88500I, strM92102X, AbstractC1102d.m3421r(AbstractC1099a.m3394p(1 * f13, modifierM3446c), 8.5f * f14, f13 * f14), jM53363d, c28655q, 0, 0);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m43424h(Function1 function1, int i13) {
        function1.invoke(Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m43425i(Modifier modifier, int i13, int i14, Function1 function1, int i15, int i16, Composer composer, int i17) {
        m43421e(modifier, i13, i14, function1, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }
}
