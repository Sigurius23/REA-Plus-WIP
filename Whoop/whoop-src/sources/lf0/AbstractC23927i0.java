package lf0;

import a80.C0545i;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.navigation.C9598e;
import gb1.AbstractC15676d;
import gy0.AbstractC16277f;
import gz0.EnumC16313m0;
import hb3.AbstractC17104a0;
import hy0.AbstractC17755i2;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import ih0.AbstractC18489d0;
import ih1.C18522f;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import java.util.Iterator;
import java.util.Locale;
import jt1.C21937b;
import kd1.AbstractC22403o;
import kl2.C22571f;
import kotlin.C2032u;
import l01.C23045q;
import l72.C23401h;
import l83.C23454a0;
import ny0.AbstractC27249e;
import ny0.C27256h;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.AbstractC11352g;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.C23016z;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lf0.i0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llf0/j0;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Llf0/j0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Llf0/h0;", "s", "(Llf0/h0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "isExpanded", "", "rotationAngle", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23927i0 {
    /* JADX INFO: renamed from: i */
    public static final void m70405i(Modifier modifier, C23931j0 state, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1362861366);
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
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            Object[] objArr = {state.getId()};
            boolean zM87157i = c28655q.m87157i(state);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C19683b(state, 25);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 0);
            AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifier4), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10(), AbstractC33253j.m105489e(3 * 4), null, null, 0, AbstractC37817c.m121344e(462757798, c28655q, new C2032u((Object) interfaceC28601c1, (Object) state, (Object) AbstractC11352g.m30588b(m70407k(interfaceC28601c1) ? -180.0f : 0.0f, AbstractC11348f.m30574v(300, 0, null, 6), null, null, c28655q, 48, 28), onViewEvent, 19)), c28655q, 14155776, 50);
            c28655q = c28655q;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 11, (Object) modifier3, (Object) state, onViewEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final InterfaceC28601c1 m70406j(C23931j0 c23931j0) {
        return AbstractC28683x.m87272z(Boolean.valueOf(c23931j0.getIsExpanded()));
    }

    /* JADX INFO: renamed from: k */
    private static final boolean m70407k(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    private static final void m70408l(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: m */
    private static final float m70409m(InterfaceC28670t2 interfaceC28670t2) {
        return ((Number) interfaceC28670t2.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m70410n(InterfaceC28601c1 interfaceC28601c1, C23931j0 c23931j0, InterfaceC28670t2 interfaceC28670t2, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 2 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, c2314t);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
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
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C21937b(11, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3362g);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            String strM70432c = c23931j0.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a sh4 = c38072d.m121952e(c28655q, i14).getSh4();
            long brandWhite = c38072d.m121949b(c28655q, i14).getBrandWhite();
            String upperCase = c23931j0.getTitle().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            AbstractC30795n.m94707h(strM70432c, AbstractC15676d.m44101d(c2314t, "AdvancedLabs_ClinicalReportCard_".concat(upperCase)), brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, sh4, null, c28655q, 0, C2886a.f11498d << 18, 196600);
            float f14 = 4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationDown(), c28655q, 6), AbstractC30060g.m92103Y(c28655q, m70407k(interfaceC28601c1) ? AbstractC16277f.f62278S : AbstractC16277f.f62363p0), AbstractC1772c1.m5375L(m70409m(interfaceC28670t2), AbstractC1102d.m3419p(f14 * f14, c2314t)), c38072d.m121949b(c28655q, i14).getWhite50(), c28655q, 0, 0);
            c28655q.m87173q(true);
            AbstractC23911e0.m70293b(null, c23931j0.getHeader(), c28655q, AbstractC22403o.f87638a << 3, 1);
            c28655q.m87173q(true);
            AbstractC1090b.m3350e(C23016z.f90757a, m70407k(interfaceC28601c1), null, null, null, null, AbstractC37817c.m121344e(-1387361896, c28655q, new C18522f(15, c23931j0, function1)), c28655q, 1572870, 30);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m70411o(InterfaceC28601c1 interfaceC28601c1) {
        m70408l(interfaceC28601c1, !m70407k(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m70412p(C23931j0 c23931j0, Function1 function1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        float f13 = 8;
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 2 * f13, 0.0f, 0.0f, 13);
        float f14 = 1 * f13;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f14), C2299e.f9110M, composer, 6);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3398t);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
        C0209i c0209i = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
        }
        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
        AbstractC17755i2.m50938j(null, null, null, null, null, 0L, 0L, null, composer, 0, 255);
        c28655q.m87150e0(-1696878435);
        Iterator<T> it = c23931j0.getBody().m70263b().iterator();
        while (it.hasNext()) {
            m70415s((C23923h0) it.next(), function1, composer, C17731c2.f68917p | C9598e.f28134d);
        }
        c28655q.m87173q(false);
        C27256h c27256hM70262a = c23931j0.getBody().getButton();
        if (c27256hM70262a == null) {
            c28655q.m87150e0(-1063448286);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1063448285);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f14, 0.0f, 0.0f, 13);
            String upperCase = c23931j0.getTitle().toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            Modifier modifierM44101d = AbstractC15676d.m44101d(modifierM3398t2, "AdvancedLabs_ClinicalReportCard_" + upperCase + "_Button");
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(c27256hM70262a);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C0545i(function1, c27256hM70262a, 6);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27249e.m82121d(modifierM44101d, c27256hM70262a, null, (InterfaceC4339a) objM87133R, composer, C27256h.f109055z << 3, 4);
            c28655q.m87173q(false);
        }
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m70413q(Function1 function1, C27256h c27256h) {
        function1.invoke(c27256h.getDestination());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m70414r(Modifier modifier, C23931j0 c23931j0, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70405i(modifier, c23931j0, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m70415s(C23923h0 state, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1337672169);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(state) : c28655q.m87157i(state) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 1 * 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, f13, 1);
            boolean z4 = ((i14 & 112) == 32) | ((i14 & 14) == 4 || ((i14 & 8) != 0 && c28655q.m87157i(state)));
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C23045q(10, state, onViewEvent);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM3396r, false, null, null, (InterfaceC4339a) objM87133R, 15);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC17808z1.m51175c(state.getTrend(), c28655q, C17731c2.f68917p);
            String strM70365c = state.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a b6 = c38072d.m121952e(c28655q, i15).getB1();
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC30795n.m94707h(strM70365c, AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), f13, 0.0f, 2), c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q, 0, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            EnumC16313m0 enumC16313m0M70364b = state.getIcon();
            if (enumC16313m0M70364b == null) {
                c28655q.m87150e0(54678161);
                c28655q.m87173q(false);
            } else {
                float f14 = 4;
                AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q, 54678162, enumC16313m0M70364b, c28655q, 6), null, AbstractC1102d.m3419p(f14 * f14, c2314t), c38072d.m121949b(c28655q, i15).getWhite50(), c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(state, onViewEvent, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m70416t(C23923h0 c23923h0, Function1 function1) {
        C9598e c9598eM70363a = c23923h0.getDestination();
        if (c9598eM70363a != null) {
            function1.invoke(c9598eM70363a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m70417u(C23923h0 c23923h0, Function1 function1, int i13, Composer composer, int i14) {
        m70415s(c23923h0, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
