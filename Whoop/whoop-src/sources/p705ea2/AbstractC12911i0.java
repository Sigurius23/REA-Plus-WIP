package p705ea2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.coacheverywherecommon.models.CoachEducationType;
import com.whoop.coacheverywherecommon.models.CoachEntry;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.ChatEntrypointExperience;
import com.whoop.navigation.DrawerPresentation;
import com.whoop.profile.view.C9813i;
import d42.C11699o;
import ep0.C13404j;
import gb1.AbstractC15673b0;
import gz0.AbstractC16319p0;
import java.util.Locale;
import java.util.Map;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15011f9;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22976l1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ea2.i0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a1\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/navigation/DrawerPresentation;", "preset", "Lep0/j;", "o", "(Lcom/whoop/navigation/DrawerPresentation;)Lep0/j;", "Lkotlin/Function0;", "Ll83/a0;", "onBackClick", "Lkotlin/Function1;", "onPresetSelected", "j", "(Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "title", "subtitle", "onClick", "g", "(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12911i0 {
    /* JADX INFO: renamed from: g */
    private static final void m36315g(String str, String str2, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        String str3;
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1205495215);
        if ((i13 & 6) == 0) {
            str3 = str;
            i14 = (c28655q.m87153g(str3) ? 4 : 2) | i13;
        } else {
            str3 = str;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), AbstractC33253j.m105489e(12));
            long j7 = C17919x.f69629f;
            Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM118994r, C17919x.m51541c(0.08f, j7), AbstractC17918w0.f69621a);
            boolean z4 = (i14 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C11699o(interfaceC4339a, 12);
                c28655q.m87172p0(objM87133R);
            }
            float f13 = 16;
            float f14 = 14;
            Modifier modifierM3393o = AbstractC1099a.m3393o(new C22976l1(f13, f14, f13, f14), AbstractC1092a.m3362g(modifierM3358c, false, null, null, (InterfaceC4339a) objM87133R, 15));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3393o);
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
            AbstractC15011f9.m43114b(str3, null, j7, AbstractC35745c.m113246h(16), null, C28780r.f116541H, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, (i14 & 14) | 200064, 0, 131026);
            AbstractC15011f9.m43114b(str2, null, C17919x.m51541c(0.6f, j7), AbstractC35745c.m113246h(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, ((i14 >> 3) & 14) | 3456, 0, 131058);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12909h0(str, str2, interfaceC4339a, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m36316h(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m36317i(String str, String str2, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m36315g(str, str2, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m36318j(InterfaceC4339a onBackClick, Function1 onPresetSelected, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onBackClick, "onBackClick");
        AbstractC22676k.m65750j(onPresetSelected, "onPresetSelected");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(628331901);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(onBackClick) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onPresetSelected) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
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
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l("AUTO-POP HEIGHT TESTER"), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, onBackClick, null, null, c28655q, ((i15 << 9) & 7168) | (AbstractC6721d.a.f25641r << 3), 53);
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            float f13 = 20;
            float f14 = 24;
            Modifier modifierM3393o = AbstractC1099a.m3393o(new C22976l1(f13, f14, f13, f14), modifierM3407d);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(16), c2305k, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3393o);
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
            AbstractC15011f9.m43114b("Fires an auto-pop with each drawer_presentation preset.", null, C17919x.m51541c(0.72f, C17919x.f69629f), AbstractC35745c.m113246h(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c28655q, 3462, 0, 131058);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(4, c2314t));
            int i16 = i15 & 112;
            boolean z4 = i16 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C9813i(onPresetSelected, 14);
                c28655q.m87172p0(objM87133R);
            }
            m36315g("HALF_SCREEN", "0.45 · existing half drawer", (InterfaceC4339a) objM87133R, c28655q, 54);
            boolean z13 = i16 == 32;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C9813i(onPresetSelected, 15);
                c28655q.m87172p0(objM87133R2);
            }
            m36315g("HOME_GAUGE_LEVEL", "0.60 · just below the home gauges (Wake Up)", (InterfaceC4339a) objM87133R2, c28655q, 54);
            boolean z14 = i16 == 32;
            Object objM87133R3 = c28655q.m87133R();
            if (z14 || objM87133R3 == c28676v0) {
                objM87133R3 = new C9813i(onPresetSelected, 16);
                c28655q.m87172p0(objM87133R3);
            }
            m36315g("FULL_SCREEN", "routes via shouldOpenFullSize", (InterfaceC4339a) objM87133R3, c28655q, 54);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12907g0(onBackClick, onPresetSelected, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m36319k(Function1 function1) {
        function1.invoke(DrawerPresentation.HALF_SCREEN);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m36320l(Function1 function1) {
        function1.invoke(DrawerPresentation.HOME_GAUGE_LEVEL);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m36321m(Function1 function1) {
        function1.invoke(DrawerPresentation.FULL_SCREEN);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m36322n(InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m36318j(interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public static final C13404j m36323o(DrawerPresentation preset) {
        AbstractC22676k.m65750j(preset, "preset");
        String strName = preset.name();
        Locale locale = Locale.ROOT;
        String lowerCase = strName.toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
        String strConcat = "wake-up-debug-".concat(lowerCase);
        String lowerCase2 = preset.name().toLowerCase(locale);
        AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
        String str = "AUTOPOP";
        String str2 = null;
        String str3 = "CHAT_WITH_AGENT";
        String str4 = "wake-up-debug";
        String str5 = "daily-outlook";
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean z4 = false;
        String str9 = null;
        Boolean bool = null;
        String str10 = null;
        ChatEntrypointExperience chatEntrypointExperience = null;
        Map map = null;
        C9598e c9598e = null;
        CoachEducationType coachEducationType = null;
        String str11 = null;
        CoachEntry coachEntry = null;
        return AbstractC6219a.m18523a(new AiContextMetadata(false, (Boolean) (0 == true ? 1 : 0), c9598e, coachEducationType, str11, new AiAction(str, str2, str3, str4, str5, str6, strConcat, str7, str8, z4, str9, bool, AbstractC11895b.m31996o("Debug: auto-pop dispatched at ", lowerCase2, "."), str10, chatEntrypointExperience, map, preset, 57856, (DefaultConstructorMarker) null), coachEntry, 95, (DefaultConstructorMarker) (0 == true ? 1 : 0)));
    }
}
