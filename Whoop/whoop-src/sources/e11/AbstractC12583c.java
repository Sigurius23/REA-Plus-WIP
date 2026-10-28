package e11;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import ci0.C4726a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d30.C11546l;
import do0.C12229c;
import e93.AbstractC12889b;
import gz0.EnumC16313m0;
import ih0.AbstractC18489d0;
import java.io.IOException;
import l83.C23454a0;
import l83.InterfaceC23459e;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: e11.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Le11/d;", "currentPlanTileState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Le11/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "k", "()Le11/d;", "j", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12583c {
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x0104  */
    /* JADX WARN: Code duplicated, block: B:72:0x012e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0139  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m35265e(Modifier modifier, C12584d currentPlanTileState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function4;
        boolean z13;
        boolean z14;
        Object objM87133R;
        long jM95628d;
        Object objM87133R2;
        AbstractC22676k.m65750j(currentPlanTileState, "currentPlanTileState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(387856736);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(currentPlanTileState) : c28655q.m87157i(currentPlanTileState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
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
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C12229c(17);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function4 = (Function1) objM87133R2;
                } else {
                    function4 = function2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "CurrentPlanTag"));
                if ((i15 & 112) != 32 || ((i15 & 64) != 0 && c28655q.m87157i(currentPlanTileState))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = z13 | ((i15 & 896) == 256);
                objM87133R = c28655q.m87133R();
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C11546l(11, currentPlanTileState, function4);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R, 15);
                float f13 = 4;
                C33252i c33252iM105489e = AbstractC33253j.m105489e(3 * f13);
                if (currentPlanTileState.getTrailingIcon() == null) {
                    c28655q.m87150e0(-931816282);
                    jM95628d = C38072d.f163053a.m121949b(c28655q, 6).getWhite5();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-931815321);
                    jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
                }
                AbstractC12889b.m36263b(modifierM3362g, c33252iM105489e, jM95628d, null, 0 * f13, AbstractC37817c.m121344e(-607673021, c28655q, new C4726a(currentPlanTileState, 26)), c28655q, 1769472, 24);
                modifier3 = modifier4;
                function3 = function4;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 0, (Object) modifier3, (Object) currentPlanTileState, (InterfaceC23459e) function3);
            }
        }
        i15 |= 384;
        function2 = function1;
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
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C12229c(17);
                    c28655q.m87172p0(objM87133R2);
                }
                function4 = (Function1) objM87133R2;
            } else {
                function4 = function2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "CurrentPlanTag"));
            if ((i15 & 112) != 32) {
                z13 = true;
            } else {
                z13 = true;
            }
            z14 = z13 | ((i15 & 896) == 256);
            objM87133R = c28655q.m87133R();
            if (z14) {
                objM87133R = new C11546l(11, currentPlanTileState, function4);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C11546l(11, currentPlanTileState, function4);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g2 = AbstractC1092a.m3362g(modifierM3409f2, false, null, null, (InterfaceC4339a) objM87133R, 15);
            float f14 = 4;
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(3 * f14);
            if (currentPlanTileState.getTrailingIcon() == null) {
                c28655q.m87150e0(-931816282);
                jM95628d = C38072d.f163053a.m121949b(c28655q, 6).getWhite5();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-931815321);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q, 6, false);
            }
            AbstractC12889b.m36263b(modifierM3362g2, c33252iM105489e2, jM95628d, null, 0 * f14, AbstractC37817c.m121344e(-607673021, c28655q, new C4726a(currentPlanTileState, 26)), c28655q, 1769472, 24);
            modifier3 = modifier4;
            function3 = function4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 0, (Object) modifier3, (Object) currentPlanTileState, (InterfaceC23459e) function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m35266f(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m35267g(C12584d c12584d, Function1 function1) {
        C9598e c9598eM35272a = c12584d.getDestination();
        if (c9598eM35272a != null) {
            function1.invoke(c9598eM35272a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m35268h(C12584d c12584d, Composer composer, int i13) throws XmlPullParserException, IOException {
        C38072d c38072d;
        C2314t c2314t;
        int i14;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 4;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC1102d.m3405b(c2314t2, 0.0f, 15 * f13, 1));
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c12584d.getLeadingIcon(), c28655q, 6);
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * f13, c2314t2);
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d2.m121949b(c28655q, 6).getWhite50(), c28655q, 432, 0);
            AbstractC18489d0.m53380u(3, f13, c2314t2, c28655q);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            TextResource textResourceM35275d = c12584d.getSubtitle();
            if (textResourceM35275d == null) {
                c28655q.m87150e0(965680378);
                c28655q.m87173q(false);
                c2314t = c2314t2;
                c38072d = c38072d2;
                i14 = 6;
            } else {
                c28655q.m87150e0(965680379);
                String strM21274h = AbstractC8693b.m21274h(textResourceM35275d, c28655q, 0);
                c38072d = c38072d2;
                c2314t = c2314t2;
                i14 = 6;
                AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            TextResource textResourceM35274c = c12584d.getTitle();
            if (textResourceM35274c == null) {
                c28655q.m87150e0(965957239);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(965957240);
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM35274c, c28655q, 0), null, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q2, 0, 0, 196602);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            EnumC16313m0 enumC16313m0M35276e = c12584d.getTrailingIcon();
            if (enumC16313m0M35276e == null) {
                c28655q.m87150e0(899622064);
                c28655q.m87173q(false);
            } else {
                AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q, 899622065, enumC16313m0M35276e, c28655q, i14), null, AbstractC1102d.m3419p(5 * f13, c2314t), c38072d.m121949b(c28655q, i14).getBrandWhite(), c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m35269i(Modifier modifier, C12584d c12584d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m35265e(modifier, c12584d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final C12584d m35270j() {
        return new C12584d(AbstractC8693b.m21278l("Training"), AbstractC8693b.m21278l("CURRENT PLAN"), C38072d.f163053a.m121951d().getActivities().getCycling(), EnumC16313m0.PENCIL, null, 16, null);
    }

    /* JADX INFO: renamed from: k */
    public static final C12584d m35271k() {
        return new C12584d(AbstractC8693b.m21278l("None"), AbstractC8693b.m21278l("CURRENT PLAN"), C38072d.f163053a.m121951d().getActivities().getCycling(), null, null, 16, null);
    }
}
