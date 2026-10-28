package tu1;

import a71.C0520a;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b61.AbstractC2756k;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import cz0.AbstractC11258s;
import d61.InterfaceC11732a;
import j71.C21395c;
import java.util.Iterator;
import java.util.List;
import jp1.C21859k;
import k71.C22240a;
import k71.C22257n;
import kd1.C22411w;
import l83.C23454a0;
import ly0.C24802f;
import m83.AbstractC25265s;
import mc1.EnumC25417b;
import n21.C26191e;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p733ry2.C31915d;
import p734sl0.C32632k2;
import p736sz0.AbstractC33207p;
import p745y81.InterfaceC39332e;
import qu1.InterfaceC30626b;
import qu1.InterfaceC30627c;
import qx0.C30745a;
import qz0.AbstractC30795n;
import re1.C31324k;
import rz0.AbstractC31926e;
import s90.C32290f;
import t01.C33259e;
import t71.C33572i;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: tu1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aM\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001a?\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000e\u0010\r\u001aA\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ltu1/g;", "viewState", "Lkotlin/Function1;", "Lqu1/b;", "Ll83/a0;", "onBodyItemClicked", "Lqu1/c$a;", "onAnalyticsEvent", "o", "(Landroidx/compose/ui/Modifier;Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "t", "(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "m", "onViewEvent", "A", "(Ltu1/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "shouldPad", "E", "(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;", "isScrubbing", "last-night-sleep_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34193f {
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:56:0x0160  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162  */
    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    /* JADX WARN: Code duplicated, block: B:66:0x017c  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01df  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: A */
    private static final void m108031A(C34194g c34194g, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        boolean z4;
        Function1 function4;
        Function1 function5;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function6;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        boolean z14;
        Object objM87133R;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1359371955);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c34194g) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function2;
                i15 |= c28655q.m87157i(function3) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C33572i(17);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function6 = (Function1) objM87133R2;
                } else {
                    function6 = function3;
                }
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                String strM21274h = AbstractC8693b.m21274h(c34194g.getTitle(), c28655q, TextResource.$stable);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                Function1 function7 = function6;
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                function5 = function7;
                AbstractC30795n.m94707h(strM21274h, layoutWeightElement, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                boolean zM87157i = c28655q.m87157i(c34194g);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i | z13 | ((i15 & 896) == 256);
                objM87133R = c28655q.m87133R();
                if (!z14 || objM87133R == c28676v0) {
                    function4 = function1;
                    objM87133R = new C31324k(c34194g, function4, function5, 5);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function4 = function1;
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
                float f13 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getEducation(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.5f, AbstractC1102d.m3419p(f13 * f13, modifierM3362g)), "info_icon"), c38072d.m121949b(c28655q, i17).getBrandWhite(), c28655q, 48, 0);
                c28655q.m87173q(true);
            } else {
                function4 = function1;
                c28655q.m87138X();
                function5 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C33259e(c34194g, function4, function5, i13, i14);
            }
        }
        i15 |= 384;
        function3 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C33572i(17);
                    c28655q.m87172p0(objM87133R2);
                }
                function6 = (Function1) objM87133R2;
            } else {
                function6 = function3;
            }
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            String strM21274h2 = AbstractC8693b.m21274h(c34194g.getTitle(), c28655q, TextResource.$stable);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Function1 function8 = function6;
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            C38072d c38072d2 = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            function5 = function8;
            AbstractC30795n.m94707h(strM21274h2, layoutWeightElement2, c38072d2.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i18).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            boolean zM87157i2 = c28655q.m87157i(c34194g);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i2 | z13 | ((i15 & 896) == 256);
            objM87133R = c28655q.m87133R();
            if (z14) {
                function4 = function1;
                objM87133R = new C31324k(c34194g, function4, function5, 5);
                c28655q.m87172p0(objM87133R);
            } else {
                function4 = function1;
                objM87133R = new C31324k(c34194g, function4, function5, 5);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(c2314t2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f14 = 4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d2.m121951d().getVarious().getEducation(), c28655q, 6), null, AbstractC1136a.m3599a(AbstractC34132o.m107879c(0.5f, AbstractC1102d.m3419p(f14 * f14, modifierM3362g2)), "info_icon"), c38072d2.m121949b(c28655q, i18).getBrandWhite(), c28655q, 48, 0);
            c28655q.m87173q(true);
        } else {
            function4 = function1;
            c28655q.m87138X();
            function5 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(c34194g, function4, function5, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m108032B(InterfaceC30627c.a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m108033C(C34194g c34194g, Function1 function1, Function1 function2) {
        C34188a c34188aM108023a = c34194g.getCardInfoState().getBottomSheet();
        if (c34188aM108023a != null) {
            function1.invoke(new InterfaceC30626b.a(c34194g.getId(), c34188aM108023a));
            function2.invoke(new InterfaceC30627c.g(c34194g.getId()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m108034D(C34194g c34194g, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m108031A(c34194g, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    public static final Modifier m108035E(Modifier modifier, boolean z4) {
        AbstractC22676k.m65750j(modifier, "<this>");
        return z4 ? AbstractC1099a.m3396r(modifier, ((float) 1.5d) * 8, 0.0f, 2) : modifier;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ Modifier m108036F(Modifier modifier, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        return m108035E(modifier, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v22, types: [y81.e] */
    /* JADX WARN: Type inference failed for: r23v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r5v20, types: [int] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r9v4, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r9v5, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: m */
    private static final void m108049m(C34194g c34194g, Function1 function1, Function1 function2, Composer composer, int i13) {
        C34194g c34194g2;
        int i14;
        ?? r10;
        boolean z4;
        boolean z13;
        ?? r14;
        ?? r15;
        C2306l c2306l = C2299e.f9107J;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(108067144);
        if ((i13 & 6) == 0) {
            c34194g2 = c34194g;
            i14 = (c28655q.m87157i(c34194g2) ? 4 : 2) | i13;
        } else {
            c34194g2 = c34194g;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 2 * f13, 0.0f, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            m108031A(c34194g2, function1, function2, c28655q, i14 & 1022, 0);
            ?? r16 = c28655q;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9109L, r16, 54);
            int iHashCode2 = Long.hashCode(r16.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = r16.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(r16, modifierM3409f);
            r16.m87158i0();
            if (r16.f115903S) {
                r16.m87163l(c0213j);
            } else {
                r16.m87178s0();
            }
            AbstractC28683x.m87239G(r16, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m2);
            if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, r16, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N2);
            if (c34194g.m108063a().isEmpty()) {
                z4 = false;
                r16.m87150e0(-1281842444);
                r16.m87173q(false);
            } else {
                r16.m87150e0(-1281972179);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r16, 0);
                int iHashCode3 = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = r16.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(r16, c2314t);
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j);
                } else {
                    r16.m87178s0();
                }
                AbstractC28683x.m87239G(r16, c0209i, c22994r1M66759a2);
                AbstractC28683x.m87239G(r16, c0209i2, interfaceC28653p1M87165m3);
                if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, r16, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(r16, c0209i4, modifierM118962N3);
                r16.m87150e0(2029703216);
                Iterator it = c34194g.m108063a().iterator();
                while (it.hasNext()) {
                    AbstractC25303l.m74291r((C24802f) it.next(), null, null, null, r16, C24802f.f97092f, 14);
                }
                z4 = false;
                AbstractC25012a.m73392y(r16, false, true, false);
            }
            if (c34194g.m108066e().isEmpty()) {
                z13 = true;
                r16.m87150e0(-1281649004);
                r16.m87173q(z4);
                r14 = z4;
            } else {
                r16.m87150e0(-1281779700);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r16, z4 ? 1 : 0);
                int iHashCode4 = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = r16.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(r16, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j2);
                } else {
                    r16.m87178s0();
                }
                AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a3);
                AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m4);
                C0209i c0209i5 = C0217k.f732j;
                if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, r16, iHashCode4, c0209i5);
                }
                AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N4);
                r16.m87150e0(1474147833);
                Iterator it3 = c34194g.m108066e().iterator();
                while (it3.hasNext()) {
                    AbstractC25303l.m74291r((C26191e) it3.next(), null, null, null, r16, C26191e.f103877i, 14);
                }
                z13 = true;
                r14 = 0;
                AbstractC25012a.m73392y(r16, false, true, false);
            }
            if (c34194g.m108067f().isEmpty()) {
                r16.m87150e0(-1281148044);
                r16.m87173q(r14);
                r15 = r16;
            } else {
                r16.m87150e0(-1281577611);
                C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, r16, r14);
                int iHashCode5 = Long.hashCode(r16.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = r16.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(r16, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j3 = C0217k.f724b;
                r16.m87158i0();
                if (r16.f115903S) {
                    r16.m87163l(c0213j3);
                } else {
                    r16.m87178s0();
                }
                AbstractC28683x.m87239G(r16, C0217k.f729g, c22994r1M66759a4);
                AbstractC28683x.m87239G(r16, C0217k.f728f, interfaceC28653p1M87165m5);
                C0209i c0209i6 = C0217k.f732j;
                if (r16.f115903S || !AbstractC22676k.m65745e(r16.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, r16, iHashCode5, c0209i6);
                }
                AbstractC28683x.m87239G(r16, C0217k.f726d, modifierM118962N5);
                r16.m87150e0(-724983632);
                ?? r17 = r16;
                for (C34195h c34195h : c34194g.m108067f()) {
                    TextResource textResourceM108072d = c34195h.getValueDisplay();
                    TextResource textResourceM108071c = c34195h.getUnitDisplay();
                    TextResource textResourceM108070b = c34195h.getTimeDisplay();
                    long jMo134584toComposableColorWaAFU9c = c34195h.getScrubColor().mo134584toComposableColorWaAFU9c(r17, 0);
                    int i15 = TextResource.$stable;
                    ?? r24 = r17;
                    AbstractC33207p.m105301e(null, null, textResourceM108072d, null, textResourceM108071c, null, null, textResourceM108070b, false, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, false, null, r24, (i15 << 6) | (i15 << 12) | (i15 << 21), 0, 64875);
                    r17 = r24;
                }
                AbstractC25012a.m73392y(r17, false, z13, false);
                r15 = r17;
            }
            r15.m87173q(z13);
            r15.m87173q(z13);
            r10 = r15;
        } else {
            c28655q.m87138X();
            r10 = c28655q;
        }
        C28677v1 c28677v1M87180u = r10.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34192e(c34194g, function1, function2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m108050n(C34194g c34194g, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m108049m(c34194g, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:68:0x0100  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    public static final void m108051o(Modifier modifier, C34194g viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function7;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-851626656);
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
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i19 = i14 & 4;
        if (i19 == 0) {
            if ((i13 & 384) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    if (i18 != 0) {
                        modifier3 = C2314t.f9131w;
                    } else {
                        modifier3 = modifier2;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i19 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C33572i(15);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function5 = (Function1) objM87133R2;
                    } else {
                        function5 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C33572i(16);
                            c28655q.m87172p0(objM87133R);
                        }
                        function7 = (Function1) objM87133R;
                    } else {
                        function7 = function4;
                    }
                    AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifier3), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), C22411w.f87680a.m64535a().m64090c(), null, null, 0.0f, AbstractC37817c.m121344e(548216784, c28655q, new C21859k((Object) viewState, function5, (Object) function7, 24)), c28655q, 12582912, 114);
                    function6 = function7;
                    modifier2 = modifier3;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C32632k2(modifier2, viewState, function5, function6, i13, i14, 5);
                }
            }
            i15 |= 3072;
            function4 = function2;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C33572i(15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function5 = (Function1) objM87133R2;
                } else {
                    function5 = function3;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C33572i(16);
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                } else {
                    function7 = function4;
                }
                AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifier3), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), C22411w.f87680a.m64535a().m64090c(), null, null, 0.0f, AbstractC37817c.m121344e(548216784, c28655q, new C21859k((Object) viewState, function5, (Object) function7, 24)), c28655q, 12582912, 114);
                function6 = function7;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(modifier2, viewState, function5, function6, i13, i14, 5);
            }
        }
        i15 |= 384;
        function3 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i18 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i19 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C33572i(15);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function5 = (Function1) objM87133R2;
                } else {
                    function5 = function3;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C33572i(16);
                        c28655q.m87172p0(objM87133R);
                    }
                    function7 = (Function1) objM87133R;
                } else {
                    function7 = function4;
                }
                AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifier3), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), C22411w.f87680a.m64535a().m64090c(), null, null, 0.0f, AbstractC37817c.m121344e(548216784, c28655q, new C21859k((Object) viewState, function5, (Object) function7, 24)), c28655q, 12582912, 114);
                function6 = function7;
                modifier2 = modifier3;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C32632k2(modifier2, viewState, function5, function6, i13, i14, 5);
            }
        }
        i15 |= 3072;
        function4 = function2;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i18 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i19 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C33572i(15);
                    c28655q.m87172p0(objM87133R2);
                }
                function5 = (Function1) objM87133R2;
            } else {
                function5 = function3;
            }
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C33572i(16);
                    c28655q.m87172p0(objM87133R);
                }
                function7 = (Function1) objM87133R;
            } else {
                function7 = function4;
            }
            AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifier3), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), C22411w.f87680a.m64535a().m64090c(), null, null, 0.0f, AbstractC37817c.m121344e(548216784, c28655q, new C21859k((Object) viewState, function5, (Object) function7, 24)), c28655q, 12582912, 114);
            function6 = function7;
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(modifier2, viewState, function5, function6, i13, i14, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m108052p(InterfaceC30626b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m108053q(InterfaceC30627c.a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m108054r(C34194g c34194g, Function1 function1, Function1 function2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 2 * f13, 1);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * f13), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            m108049m(c34194g, function1, function2, c28655q, 0);
            m108056t(c34194g, function2, function1, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m108055s(Modifier modifier, C34194g c34194g, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m108051o(modifier, c34194g, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m108056t(C34194g c34194g, Function1 function1, Function1 function2, Composer composer, int i13) {
        boolean z4;
        C28676v0 c28676v0;
        int i14;
        int i15;
        boolean z13;
        int i16;
        C34194g c34194g2 = c34194g;
        Function1 function3 = function1;
        Function1 function4 = function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1142119588);
        int i17 = (i13 & 6) == 0 ? (c28655q.m87157i(c34194g2) ? 4 : 2) | i13 : i13;
        int i18 = 32;
        if ((i13 & 48) == 0) {
            i17 |= c28655q.m87157i(function3) ? 32 : 16;
        }
        int i19 = 256;
        if ((i13 & 384) == 0) {
            i17 |= c28655q.m87157i(function4) ? 256 : 128;
        }
        int i24 = i17;
        boolean z14 = true;
        boolean z15 = false;
        if (c28655q.m87135U(i24 & 1, (i24 & 147) != 146)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R == c28676v1) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            for (InterfaceC25312u interfaceC25312u : c34194g2.m108064b()) {
                boolean z16 = interfaceC25312u instanceof C21395c;
                C2314t c2314t = C2314t.f9131w;
                if (z16) {
                    c28655q.m87150e0(1548578997);
                    Modifier modifierM3384f = AbstractC1099a.m3384f(m108035E(AbstractC1102d.m3409f(1.0f, c2314t), AbstractC22676k.m65745e(c34194g2.getId(), "hours_of_sleep") ^ z14), z15, 1.7f);
                    C21395c c21395c = (C21395c) interfaceC25312u;
                    boolean zM87157i = ((i24 & 112) == i18 ? z14 : z15) | c28655q.m87157i(c34194g2) | ((i24 & 896) == i19 ? z14 : z15);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87157i || objM87133R2 == c28676v1) {
                        C31915d c31915d = new C31915d(function3, (Object) c34194g2, (Object) function4, (Object) interfaceC28601c1, 8);
                        c28655q.m87172p0(c31915d);
                        objM87133R2 = c31915d;
                    }
                    C28655q c28655q2 = c28655q;
                    z4 = z15;
                    AbstractC2756k.m7799p(modifierM3384f, c21395c, null, null, false, null, (Function1) objM87133R2, c28655q2, 0, 60);
                    c28655q = c28655q2;
                    c28655q.m87173q(z4);
                    c28676v0 = c28676v1;
                    i14 = i24;
                    i15 = 256;
                    z13 = true;
                    i16 = 32;
                } else {
                    interfaceC28601c1 = interfaceC28601c1;
                    int i25 = i24;
                    z4 = z15;
                    c28676v0 = c28676v1;
                    if (interfaceC25312u instanceof C22257n) {
                        c28655q.m87150e0(1550105344);
                        C22240a c22240a = new C22240a();
                        Modifier modifierM108036F = m108036F(c2314t, z4, 1, null);
                        C22257n c22257n = (C22257n) interfaceC25312u;
                        i15 = 256;
                        boolean zM87157i2 = ((i25 & 896) == 256 ? true : z4) | c28655q.m87157i(c34194g2) | ((i25 & 112) == 32 ? true : z4);
                        Object objM87133R3 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C32290f((Object) function4, (Object) c34194g2, (Object) function3, 11);
                            c28655q.m87172p0(objM87133R3);
                        }
                        i14 = i25;
                        z13 = true;
                        c22240a.Compose(modifierM108036F, c22257n, (Function1) objM87133R3, c28655q, C22240a.f86718a << 9);
                        c28655q.m87173q(z4);
                        z4 = z4;
                        i16 = 32;
                    } else {
                        i14 = i25;
                        i15 = 256;
                        z13 = true;
                        c28655q.m87150e0(1550476755);
                        i16 = 32;
                        AbstractC25303l.m74291r(interfaceC25312u, null, new C30745a(16), null, c28655q, 0, 10);
                        c28655q.m87173q(z4);
                    }
                }
                c34194g2 = c34194g;
                function3 = function1;
                function4 = function2;
                z15 = z4;
                i19 = i15;
                c28676v1 = c28676v0;
                i24 = i14;
                interfaceC28601c1 = interfaceC28601c1;
                z14 = z13;
                i18 = i16;
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34192e(c34194g, function1, function2, i13, 0);
        }
    }

    /* JADX INFO: renamed from: u */
    private static final boolean m108057u(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: v */
    private static final void m108058v(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m108059w(Function1 function1, C34194g c34194g, Function1 function2, InterfaceC28601c1 interfaceC28601c1, Object it) {
        C0520a c0520a;
        C0520a c0520a2;
        C0520a c0520a3;
        C0520a c0520a4;
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof InterfaceC11732a) {
            AbstractC11258s abstractC11258s = (AbstractC11258s) AbstractC25265s.m74113Q0(((InterfaceC11732a) it).mo31360b().values());
            InterfaceC39332e interfaceC39332eM1226f = null;
            List<C0520a> listMo30408a = abstractC11258s != null ? abstractC11258s.mo30408a() : null;
            if (!m108057u(interfaceC28601c1)) {
                m108058v(interfaceC28601c1, true);
                function1.invoke(new InterfaceC30627c.h(c34194g.getId()));
            } else if (listMo30408a == null) {
                m108058v(interfaceC28601c1, false);
            }
            String id4 = c34194g.getId();
            TextResource textResourceM1231k = (listMo30408a == null || (c0520a4 = (C0520a) AbstractC25265s.m74102I0(0, listMo30408a)) == null) ? null : c0520a4.getValueDisplay();
            TextResource textResourceM1229i = (listMo30408a == null || (c0520a3 = (C0520a) AbstractC25265s.m74102I0(0, listMo30408a)) == null) ? null : c0520a3.getUnitDisplay();
            TextResource textResourceM1227g = (listMo30408a == null || (c0520a2 = (C0520a) AbstractC25265s.m74102I0(0, listMo30408a)) == null) ? null : c0520a2.getSecondaryContextualDisplay();
            if (listMo30408a != null && (c0520a = (C0520a) AbstractC25265s.m74102I0(0, listMo30408a)) != null) {
                interfaceC39332eM1226f = c0520a.getScrubberColor();
            }
            function2.invoke(new InterfaceC30626b.b(id4, textResourceM1231k, textResourceM1229i, textResourceM1227g, interfaceC39332eM1226f));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m108060x(Function1 function1, C34194g c34194g, Function1 function2, Object it) {
        AbstractC22676k.m65750j(it, "it");
        EnumC25417b enumC25417b = (EnumC25417b) it;
        function1.invoke(new InterfaceC30626b.c(c34194g.getId(), enumC25417b));
        function2.invoke(new InterfaceC30627c.i(enumC25417b));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final Modifier m108061y(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-233679895);
        Modifier modifierM108036F = m108036F(C2314t.f9131w, false, 1, null);
        c28655q.m87173q(false);
        return modifierM108036F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m108062z(C34194g c34194g, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m108056t(c34194g, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
