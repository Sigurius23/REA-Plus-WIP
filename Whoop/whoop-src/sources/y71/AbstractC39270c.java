package y71;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b81.C2801h;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import gy0.AbstractC16272a;
import gy0.AbstractC16277f;
import java.io.IOException;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p209i3.C18027i;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p291l0.EnumC22935a1;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import vv2.C36537c;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;

/* JADX INFO: renamed from: y71.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ly71/d;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Ly71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "isPressed", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39270c {
    /* JADX INFO: renamed from: e */
    public static final void m125112e(Modifier modifier, C39271d itemState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        long jM95628d;
        long jM95624D;
        long jM95624D2;
        AbstractC22676k.m65750j(modifier, "modifier");
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1709835299);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            float f13 = (((FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.HAL_STRENGTH_TRAINER_ROUNDED_CORNERS) ? 3 : 1) * 4;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            InterfaceC28601c1 interfaceC28601c1M44460m = AbstractC15751g.m44460m(interfaceC21083i, c28655q2, 6);
            if (m125113f(interfaceC28601c1M44460m)) {
                c28655q2.m87150e0(1820766279);
                jM95628d = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, false);
            } else {
                c28655q2.m87150e0(1820767364);
                jM95628d = AbstractC31061c.m95628d(C38072d.f163053a, c28655q2, 6, false);
            }
            if (m125113f(interfaceC28601c1M44460m)) {
                c28655q2.m87150e0(1820769351);
                jM95624D = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
            } else {
                c28655q2.m87150e0(1820770439);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, false);
            }
            if (m125113f(interfaceC28601c1M44460m)) {
                c28655q2.m87150e0(1820772487);
                jM95624D2 = AbstractC11895b.m31986e(C38072d.f163053a, c28655q2, 6, false);
            } else {
                c28655q2.m87150e0(1820773575);
                jM95624D2 = AbstractC31061c.m95624D(C38072d.f163053a, c28655q2, 6, false);
            }
            long j7 = jM95624D2;
            float f14 = itemState.getEnabled() ? 1.0f : 0.2f;
            boolean enabled = itemState.getEnabled();
            C18027i c18027i = new C18027i(0);
            boolean zM87157i = ((i14 & 896) == 256) | c28655q2.m87157i(itemState);
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C39269b(onViewEvent, itemState, 0);
                c28655q2.m87172p0(objM87133R2);
            }
            c28655q = c28655q2;
            AbstractC12889b.m36263b(AbstractC34132o.m107879c(f14, AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3360e(modifier, interfaceC21083i, null, enabled, c18027i, (InterfaceC4339a) objM87133R2, 8)), 14 * 4, 0.0f, 2)), AbstractC33253j.m105489e(f13), jM95628d, null, 0, AbstractC37817c.m121344e(-1603401830, c28655q2, new C2801h(itemState, interfaceC21083i, onViewEvent, j7, jM95624D)), c28655q, 1769472, 24);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(modifier, itemState, onViewEvent, i13, 7);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final boolean m125113f(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m125114g(Function1 function1, C39271d c39271d) {
        function1.invoke(c39271d.getOnItemClick());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m125115h(C39271d c39271d, InterfaceC21083i interfaceC21083i, Function1 function1, long j7, long j13, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            EnumC22935a1 enumC22935a1 = EnumC22935a1.f90538x;
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3388j(c2314t, enumC22935a1), 0.0f, f13, f13, f13, 1);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3406c(1.0f, new LayoutWeightElement(1.0f, true)), f13, 0);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9117z, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3395q);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c39271d.getLabel(), c28655q, 0), null, j13, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196602);
            c28655q.m87173q(true);
            if (c39271d.getShowDotMenuIcon()) {
                c28655q.m87150e0(-92468490);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(AbstractC16272a.f62093i0, c28655q, 6);
                String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62348l1);
                Modifier modifierM3419p = AbstractC1102d.m3419p(6 * 4, c2314t);
                boolean enabled = c39271d.getEnabled();
                C18027i c18027i = new C18027i(0);
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c39271d);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C39269b(function1, c39271d, 1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC15005f3.m43108b(c27430eM107874S, strM92103Y, AbstractC1092a.m3360e(modifierM3419p, interfaceC21083i, null, enabled, c18027i, (InterfaceC4339a) objM87133R, 8), j7, c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-91770804);
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
    public static final C23454a0 m125116i(Function1 function1, C39271d c39271d) {
        function1.invoke(c39271d.getOnMoreOptionsClickEvent());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m125117j(Modifier modifier, C39271d c39271d, Function1 function1, int i13, Composer composer, int i14) {
        m125112e(modifier, c39271d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
