package jg2;

import a80.C0542f;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.navigation.models.GenericInteraction;
import g11.C15218b;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import hb3.AbstractC17104a0;
import hy0.AbstractC17755i2;
import hy0.C17794v;
import java.io.IOException;
import l83.C23454a0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p710im1.C18656a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: jg2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ljg2/b;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "e", "(Landroidx/compose/ui/Modifier;Ljg2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "expanded", "start-activity_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21671c {
    /* JADX INFO: renamed from: e */
    public static final void m60946e(Modifier modifier, C21670b c21670b, Function1 onViewEvent, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Function1 function1;
        C38072d c38072d;
        boolean z4;
        C21670b state = c21670b;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2110395342);
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
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            boolean zM87153g = c28655q.m87153g(state.getId());
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            float f13 = 4;
            float f14 = f13 * f13;
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, modifier2), AbstractC33253j.m105489e(f14));
            C38072d c38072d2 = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            float f15 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f15, AbstractC1092a.m3358c(modifierM118994r, c38072d2.m121949b(c28655q, i17).getWhite5(), AbstractC17918w0.f69621a));
            C22971k c22971kM66746i = AbstractC22977m.m66746i(1 * f15);
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            Modifier modifier3 = modifier2;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C15218b(24, interfaceC28601c1);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3409f, false, null, null, (InterfaceC4339a) objM87133R2, 15);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C23010x c23010xM73381n = AbstractC25012a.m73381n((float) 0.5d, f15, c2305k, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            String strM60933a = c21670b.getLabel();
            if (strM60933a == null) {
                c28655q.m87150e0(2022242686);
                c28655q.m87173q(false);
                c38072d = c38072d2;
                z4 = true;
            } else {
                c28655q.m87150e0(2022242687);
                c38072d = c38072d2;
                z4 = true;
                AbstractC30795n.m94707h(strM60933a, null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            String strM60936e = c21670b.m60936e();
            if (strM60936e == null && (strM60936e = c21670b.getPlaceholder()) == null) {
                strM60936e = "";
            }
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(strM60936e, null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getH3(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
            c28655q2.m87173q(z4);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getCaretDown(), c28655q2, 6), null, AbstractC1772c1.m5375L(m60947f(interfaceC28601c1) ? 180.0f : 0.0f, AbstractC1102d.m3419p(f14, c2314t)), c38072d.m121949b(c28655q2, i17).getBrandWhite(), c28655q2, 48, 0);
            c28655q2.m87173q(z4);
            state = c21670b;
            function1 = onViewEvent;
            AbstractC1090b.m3350e(C23016z.f90757a, m60947f(interfaceC28601c1), null, null, null, null, AbstractC37817c.m121344e(-300797504, c28655q2, new C0542f(state, interfaceC28601c1, function1, 21)), c28655q2, 1572870, 30);
            c28655q = c28655q2;
            c28655q.m87173q(z4);
            modifier2 = modifier3;
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 29, modifier2, (Object) state, function1);
        }
    }

    /* JADX INFO: renamed from: f */
    private static final boolean m60947f(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    private static final void m60948g(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m60949h(InterfaceC28601c1 interfaceC28601c1) {
        m60948g(interfaceC28601c1, !m60947f(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m60950i(C21670b c21670b, InterfaceC28601c1 interfaceC28601c1, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        C2314t c2314t;
        Modifier modifier;
        boolean z4;
        long brandWhite;
        Composer composer2 = composer;
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        boolean z13 = false;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, composer2, 0);
        C28655q c28655q = (C28655q) composer2;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        C2314t c2314t2 = C2314t.f9131w;
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer2, c2314t2);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer2, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N);
        c28655q.m87150e0(-949414962);
        for (C21670b.a aVar : c21670b.m60934b()) {
            C28655q c28655q2 = c28655q;
            C2314t c2314t3 = c2314t2;
            AbstractC17755i2.m50938j(AbstractC1102d.m3409f(1.0f, c2314t2), null, null, null, null, 0L, 0L, null, composer2, 6, 254);
            GenericInteraction genericInteractionM60940c = aVar.getInteraction();
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t3);
            if (genericInteractionM60940c != null) {
                c28655q2.m87150e0(694789264);
                boolean zM87153g = c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87153g(function1) | c28655q2.m87157i(genericInteractionM60940c);
                Object objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C18656a0(function1, genericInteractionM60940c, interfaceC28601c1, 10);
                    c28655q2.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t3, false, null, null, (InterfaceC4339a) objM87133R, 15);
                c2314t = c2314t3;
                c28655q2.m87173q(false);
                modifier = modifierM3362g;
            } else {
                c2314t = c2314t3;
                c28655q2.m87150e0(695039868);
                c28655q2.m87173q(false);
                modifier = c2314t;
            }
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(modifierM3409f.mo3471e(modifier), 0.0f, ((float) 1.5d) * f13, 1);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f13), C2299e.f9108K, composer2, 54);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer2, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j2);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(composer2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m2);
            C0209i c0209i2 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N2);
            EnumC16313m0 enumC16313m0M60938a = aVar.getIcon();
            if (enumC16313m0M60938a == null) {
                c28655q2.m87150e0(-481359053);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-481359052);
                float f14 = 4;
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(enumC16313m0M60938a.toWhoopIcon(), composer2, 0), null, AbstractC1102d.m3419p(f14 * f14, c2314t), C38072d.f163053a.m121949b(composer2, C38072d.f163054b).getBrandWhite(), composer2, 432, 0);
                c28655q2.m87173q(false);
            }
            String strM60941d = aVar.getLabel();
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a b6 = c38072d.m121952e(composer2, i14).getB1();
            if (AbstractC22676k.m65745e(aVar.getId(), c21670b.getSelectedOptionId())) {
                c28655q2.m87150e0(1508512237);
                brandWhite = c38072d.m121949b(composer2, i14).getAccentPositiveTrend();
                z4 = false;
            } else {
                z4 = false;
                c28655q2.m87150e0(1508513604);
                brandWhite = c38072d.m121949b(composer2, i14).getBrandWhite();
            }
            c28655q2.m87173q(z4);
            AbstractC30795n.m94707h(strM60941d, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, composer, 0, C2886a.f11498d << 18, 196602);
            c28655q2.m87173q(true);
            composer2 = composer;
            c28655q = c28655q2;
            c2314t2 = c2314t;
            z13 = false;
        }
        C28655q c28655q3 = c28655q;
        c28655q3.m87173q(z13);
        c28655q3.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m60951j(Function1 function1, GenericInteraction genericInteraction, InterfaceC28601c1 interfaceC28601c1) {
        m60948g(interfaceC28601c1, false);
        function1.invoke(genericInteraction);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m60952k(Modifier modifier, C21670b c21670b, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m60946e(modifier, c21670b, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
