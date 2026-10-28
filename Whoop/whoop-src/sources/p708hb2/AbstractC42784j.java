package p708hb2;

import ah0.C0882c;
import ah0.C0885f;
import ah0.EnumC0881b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import ar2.C1930a;
import b91.C2886a;
import bm2.C3482x;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.service.network.model.UserState;
import com.whoop.whoopaction.domain.models.Action;
import cp0.C10941a;
import d71.C11757c;
import e93.AbstractC12889b;
import gz0.AbstractC16319p0;
import hb1.C17085h;
import ih0.AbstractC18491e0;
import ih0.C18488d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p702ch0.C4651t;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: hb2.j, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a=\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000eH\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006(²\u0006\u000e\u0010 \u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002²\u0006\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050!8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\u00148\n@\nX\u008a\u008e\u0002²\u0006\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050$8\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010'\u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lkotlin/Function0;", "Ll83/a0;", "onBackClick", "F", "(Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "text", "J", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "H", "Lah0/c;", "state", "L", "(Lah0/c;Landroidx/compose/runtime/Composer;I)V", "", "Lhb2/e;", "P", "(Ljava/util/List;)Ljava/util/List;", "userFormId", "formKey", "", "backNavigationEnabled", "questions", "l", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Landroidx/compose/runtime/Composer;I)V", "prompt", "", "maxSelections", "Lah0/f;", "options", "v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Landroidx/compose/runtime/Composer;I)V", "currentIndex", "", "savedAnswers", "isCompleted", "", "selectedOptionIds", "lastPersistPayload", "persistCount", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC42784j {
    /* JADX INFO: renamed from: A */
    private static final void m48309A(InterfaceC28601c1 interfaceC28601c1, Set<String> set) {
        interfaceC28601c1.setValue(set);
    }

    /* JADX INFO: renamed from: B */
    private static final List<String> m48310B(InterfaceC28601c1 interfaceC28601c1) {
        return (List) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: C */
    private static final void m48311C(InterfaceC28601c1 interfaceC28601c1, List<String> list) {
        interfaceC28601c1.setValue(list);
    }

    /* JADX INFO: renamed from: D */
    private static final int m48312D(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: renamed from: E */
    private static final void m48313E(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public static final void m48314F(InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2052160898);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(interfaceC4339a) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(AbstractC28683x.m87267u(c28655q));
            InterfaceC28653p1 interfaceC28653p1M87116A = c28655q.m87116A();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213jM545a = C0217k.m545a();
            c28655q.m87158i0();
            if (c28655q.m87120E()) {
                c28655q.m87163l(c0213jM545a);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.m547c(), interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.m549e(), interfaceC28653p1M87116A);
            C0209i c0209iM546b = C0217k.m546b();
            if (c28655q.m87120E() || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209iM546b);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.m548d(), modifierM118962N);
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(AbstractC28683x.m87267u(c28655q));
            InterfaceC28653p1 interfaceC28653p1M87116A2 = c28655q.m87116A();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66724m);
            C0213j c0213jM545a2 = C0217k.m545a();
            c28655q.m87158i0();
            if (c28655q.m87120E()) {
                c28655q.m87163l(c0213jM545a2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209iM8291d = AbstractC2875y.m8291d(c28655q, c23010xM66775a, c28655q, interfaceC28653p1M87116A2);
            if (c28655q.m87120E() || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209iM8291d);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.m548d(), modifierM118962N2);
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l("Q&A Form Widget Debug"), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i14 << 9) & 7168), 53);
            float f13 = 8;
            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14));
            C23010x c23010xM73381n = AbstractC25012a.m73381n(3, f13, c2305k, c28655q, 6);
            int iHashCode3 = Long.hashCode(AbstractC28683x.m87267u(c28655q));
            InterfaceC28653p1 interfaceC28653p1M87116A3 = c28655q.m87116A();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            C0213j c0213jM545a3 = C0217k.m545a();
            c28655q.m87158i0();
            if (c28655q.m87120E()) {
                c28655q.m87163l(c0213jM545a3);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209iM8291d2 = AbstractC2875y.m8291d(c28655q, c23010xM73381n, c28655q, interfaceC28653p1M87116A3);
            if (c28655q.m87120E() || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209iM8291d2);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.m548d(), modifierM118962N3);
            m48318J("M0 — Single select, unanswered", c28655q, 6);
            m48316H("Default state: Save is disabled until a chip is tapped. Mirrors the design screenshot.", c28655q, 6);
            boolean z4 = false;
            boolean z13 = false;
            int i15 = 48;
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z14 = false;
            String str = null;
            int i16 = 268435336;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            int i17 = 0;
            int i18 = 0;
            boolean z15 = false;
            int i19 = 0;
            boolean z16 = false;
            String str2 = null;
            boolean z17 = false;
            boolean z18 = false;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            int i24 = 0;
            String str7 = null;
            Action action = null;
            Action action2 = null;
            boolean z19 = false;
            EnumC0881b enumC0881b = null;
            C0882c c0882c = new C0882c("qna-debug-unanswered", "abc123", "debug-unanswered", null, "q1", "Single select question", AbstractC37056f.m118959K(new C0885f("opt1", "⚽ Option 1", "opt1", false, z4, null, 48, null), new C0885f("opt2", "🏀 Option 2", "opt2", z4, z13, null, 48, null), new C0885f("opt3", "🏈 Option 3", "opt3", z13, z14, str, i15, defaultConstructorMarker), new C0885f("opt4", "🎾 Option 4", "opt4", z13, z14, str, i15, defaultConstructorMarker)), false, false, 0, i17, i18, z15, i19, z16, str2, z17, z18, str3, str4, str5, str6, i24, str7, action, action2, z19, enumC0881b, i16, defaultConstructorMarker2);
            int i25 = C0882c.f3186C;
            m48320L(c0882c, c28655q, i25);
            m48318J("M0 — Pre-selected (restore)", c28655q, 6);
            m48316H("Mid-flow restore: BFF returned an option with `selected: true`. Save is enabled on first frame.", c28655q, 6);
            boolean z24 = false;
            m48320L(new C0882c("qna-debug-preselected", "abc123", "debug-preselected", null, "q1", "How would you rate your energy today?", AbstractC37056f.m118959K(new C0885f("opt1", "Low", "low", false, false, null, 48, null), new C0885f("opt2", "Medium", "medium", true, z24, null, 48, null), new C0885f("opt3", "High", "high", z24, false, null, 48, null)), false, false, 0, i17, i18, z15, i19, z16, str2, z17, z18, str3, str4, str5, str6, i24, str7, action, action2, z19, enumC0881b, i16, defaultConstructorMarker2), c28655q, i25);
            m48318J("M0 — Completed (read-only-ish)", c28655q, 6);
            m48316H("`status: completed`. Chips don't react; Save button is hidden — there's no valid edit path post-submit. Full read-only treatment lands in AIX-1184.", c28655q, 6);
            boolean z25 = false;
            String str8 = "qna-debug-completed";
            String str9 = "abc123";
            String str10 = "debug-completed";
            String str11 = "q1";
            String str12 = "How would you rate your energy today?";
            m48320L(new C0882c(str8, str9, str10, null, str11, str12, AbstractC37056f.m118959K(new C0885f("opt1", "Low", "low", false, false, null, 48, null), new C0885f("opt2", "Medium", "medium", true, z25, null, 48, null), new C0885f("opt3", "High", "high", z25, false, null, 48, null)), true, false, 0, i17, i18, z15, i19, z16, str2, z17, z18, str3, str4, str5, str6, i24, str7, action, action2, z19, enumC0881b, 268435208, defaultConstructorMarker2), c28655q, i25);
            m48318J("M1 — Multi-page (2 pages, interactive)", c28655q, 6);
            m48316H("Tap Save to advance through both questions. Progress bar at top fills as you answer. Back is hidden — this variant has back-nav disabled.", c28655q, 6);
            boolean z26 = false;
            int i26 = 48;
            DefaultConstructorMarker defaultConstructorMarker3 = null;
            boolean z27 = false;
            String str13 = "q1";
            String str14 = "How would you rate your energy today?";
            C17097e c17097e = new C17097e(str13, str14, AbstractC37056f.m118959K(new C0885f("opt1", "🐇 High", "high", false, z26, null, 48, null), new C0885f("opt2", "🐶 Medium", "medium", z26, z27, null, i26, defaultConstructorMarker3), new C0885f("opt3", "🐢 Low", "low", z26, z27, 0 == true ? 1 : 0, i26, defaultConstructorMarker3)), false, null, 24, null);
            boolean z28 = false;
            boolean z29 = false;
            boolean z34 = false;
            m48336l("user-form-multi-2", "debug-multi-2", false, m48324P(AbstractC37056f.m118959K(c17097e, new C17097e("q2", "How well did you sleep last night?", AbstractC37056f.m118959K(new C0885f("opt1", "Very well", "very-well", z28, z29, 0 == true ? 1 : 0, i26, defaultConstructorMarker3), new C0885f("opt2", "Well", "well", z28, z29, 0 == true ? 1 : 0, i26, defaultConstructorMarker3), new C0885f("opt3", "Okay", "okay", z28, z29, 0 == true ? 1 : 0, i26, defaultConstructorMarker3), new C0885f("opt4", "Poorly", "poorly", z28, z29, 0 == true ? 1 : 0, i26, defaultConstructorMarker3)), z34, null, 24, 0 == true ? 1 : 0))), c28655q, 438);
            m48318J("M1 — Multi-page (6 pages, interactive, back nav on, mixed required/skippable)", c28655q, 6);
            m48316H("Tap Save to advance and Back (bottom-left, shown from page 2 onward) to retreat. Previously-saved selections rehydrate. Q3 (stress) and Q5 (hydration) are skippable (`is_required=false`) — Save is active on first frame so the member can advance without selecting. All other questions are required.", c28655q, 6);
            boolean z35 = false;
            int i27 = 48;
            boolean z36 = false;
            String str15 = "q1";
            String str16 = "How would you rate your energy today?";
            C17097e c17097e2 = new C17097e(str15, str16, AbstractC37056f.m118959K(new C0885f("opt1", "🐇 High", "high", z34, z35, null, 48, null), new C0885f("opt2", "🐶 Medium", "medium", z35, z36, null, i27, defaultConstructorMarker3), new C0885f("opt3", "🐢 Low", "low", z35, z36, 0 == true ? 1 : 0, i27, defaultConstructorMarker3)), false, null, 24, null);
            boolean z37 = false;
            boolean z38 = false;
            C17097e c17097e3 = new C17097e("q2", "How well did you sleep last night?", AbstractC37056f.m118959K(new C0885f("opt1", "Very well", "very-well", z37, z38, 0 == true ? 1 : 0, i27, defaultConstructorMarker3), new C0885f("opt2", "Well", "well", z37, z38, 0 == true ? 1 : 0, i27, defaultConstructorMarker3), new C0885f("opt3", "Okay", "okay", z37, z38, 0 == true ? 1 : 0, i27, defaultConstructorMarker3), new C0885f("opt4", "Poorly", "poorly", z37, z38, 0 == true ? 1 : 0, i27, defaultConstructorMarker3)), false, null, 24, 0 == true ? 1 : 0);
            int i28 = 48;
            DefaultConstructorMarker defaultConstructorMarker4 = null;
            boolean z39 = false;
            boolean z44 = false;
            C17097e c17097e4 = new C17097e("q3", "How is your stress today?", AbstractC37056f.m118959K(new C0885f("opt1", "Low", "low", z39, z44, null, i28, defaultConstructorMarker4), new C0885f("opt2", "Moderate", "moderate", z39, z44, 0 == true ? 1 : 0, i28, defaultConstructorMarker4), new C0885f("opt3", "High", "high", z39, z44, 0 == true ? 1 : 0, i28, defaultConstructorMarker4)), false, null, 16, 0 == true ? 1 : 0);
            int i29 = 48;
            DefaultConstructorMarker defaultConstructorMarker5 = null;
            boolean z45 = false;
            boolean z46 = false;
            C17097e c17097e5 = new C17097e("q4", "How sore are you?", AbstractC37056f.m118959K(new C0885f("opt1", "Not at all", "none", z45, z46, null, i29, defaultConstructorMarker5), new C0885f("opt2", "A little", "some", z45, z46, 0 == true ? 1 : 0, i29, defaultConstructorMarker5), new C0885f("opt3", "Very", "very", z45, z46, 0 == true ? 1 : 0, i29, defaultConstructorMarker5)), false, null, 24, 0 == true ? 1 : 0);
            int i34 = 48;
            DefaultConstructorMarker defaultConstructorMarker6 = null;
            boolean z47 = false;
            boolean z48 = false;
            C17097e c17097e6 = new C17097e("q5", "How hydrated do you feel?", AbstractC37056f.m118959K(new C0885f("opt1", "Very", "very", z47, z48, null, i34, defaultConstructorMarker6), new C0885f("opt2", "Somewhat", "somewhat", z47, z48, 0 == true ? 1 : 0, i34, defaultConstructorMarker6), new C0885f("opt3", "Not at all", "not", z47, z48, 0 == true ? 1 : 0, i34, defaultConstructorMarker6)), false, null, 16, 0 == true ? 1 : 0);
            int i35 = 48;
            DefaultConstructorMarker defaultConstructorMarker7 = null;
            boolean z49 = false;
            boolean z52 = false;
            m48336l("user-form-multi-6", "debug-multi-6", true, m48324P(AbstractC37056f.m118959K(c17097e2, c17097e3, c17097e4, c17097e5, c17097e6, new C17097e("q6", "How is your mood?", AbstractC37056f.m118959K(new C0885f("opt1", "😊 Good", "good", z49, z52, null, i35, defaultConstructorMarker7), new C0885f("opt2", "😐 Neutral", "neutral", z49, z52, 0 == true ? 1 : 0, i35, defaultConstructorMarker7), new C0885f("opt3", "😔 Off", "off", z49, z52, 0 == true ? 1 : 0, i35, defaultConstructorMarker7)), false, null, 24, 0 == true ? 1 : 0))), c28655q, 438);
            m48318J("Edge — Long question prompt", c28655q, 6);
            m48316H("Stress-test typography wrapping for a multi-line prompt.", c28655q, 6);
            boolean z54 = false;
            boolean z55 = false;
            int i36 = 48;
            boolean z56 = false;
            String str17 = null;
            int i37 = 268435336;
            int i38 = 0;
            int i39 = 0;
            int i44 = 0;
            boolean z57 = false;
            int i45 = 0;
            m48320L(new C0882c("qna-debug-long-prompt", "abc123", "debug-long-prompt", null, "q1", "When you woke up this morning, how rested did you feel compared to a typical day after a workout? Take a moment to consider your overall body state.", AbstractC37056f.m118959K(new C0885f("opt1", "Much less rested", "much-less", false, z54, null, 48, null), new C0885f("opt2", "Slightly less rested", "slightly-less", z54, z55, null, 48, null), new C0885f("opt3", "About the same", "same", z55, z56, str17, i36, 0 == true ? 1 : 0), new C0885f("opt4", "More rested than usual", "more-rested", z55, z56, str17, i36, 0 == true ? 1 : 0)), false, false, i38, i39, i44, z57, i45, z16, str2, z17, z18, str3, str4, str5, str6, i24, str7, action, action2, z19, enumC0881b, i37, defaultConstructorMarker2), c28655q, i25);
            m48318J("Edge — Two-option binary", c28655q, 6);
            m48316H("Minimum viable form: yes/no.", c28655q, 6);
            boolean z58 = false;
            m48320L(new C0882c("qna-debug-binary", "abc123", "debug-binary", null, "q1", "Did you sleep well last night?", AbstractC37056f.m118959K(new C0885f("opt1", "👍 Yes", "yes", false, z58, null, 48, null), new C0885f("opt2", "👎 No", "no", z58, false, null, 48, null)), false, false, i38, i39, i44, z57, i45, z16, str2, z17, z18, str3, str4, str5, str6, i24, str7, action, action2, z19, enumC0881b, i37, defaultConstructorMarker2), c28655q, i25);
            m48318J("Edge — Many options", c28655q, 6);
            m48316H("Layout check at 8 options, scroll behaviour inside the chat turn.", c28655q, 6);
            boolean z59 = false;
            boolean z60 = false;
            boolean z64 = false;
            boolean z65 = false;
            boolean z66 = false;
            boolean z67 = false;
            boolean z68 = false;
            int i46 = 0;
            boolean z69 = false;
            m48320L(new C0882c("qna-debug-many", "abc123", "debug-many", null, "q1", "Pick your favourite sport", AbstractC37056f.m118959K(new C0885f("opt1", "⚽ Soccer", "soccer", false, z59, null, 48, null), new C0885f("opt2", "🏀 Basketball", "basketball", z59, z60, null, 48, null), new C0885f("opt3", "🏈 Football", "football", z60, z64, null, 48, null), new C0885f("opt4", "🎾 Tennis", "tennis", z64, z65, null, 48, null), new C0885f("opt5", "⚾ Baseball", "baseball", z65, z66, null, 48, null), new C0885f("opt6", "🏐 Volleyball", "volleyball", z66, z67, null, 48, null), new C0885f("opt7", "🏑 Hockey", "hockey", z67, false, null, 48, null), new C0885f("opt8", "🏉 Rugby", "rugby", 0 == true ? 1 : 0, false, null, 48, null)), false, false, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z68, i46, z69, str2, z17, z18, str3, str4, str5, str6, i24, str7, action, action2, z19, enumC0881b, i37, defaultConstructorMarker2), c28655q, i25);
            m48318J("M1 — Multi-select, interactive (per-toggle persist preview)", c28655q, 6);
            m48316H("Tap chips to toggle. The caption below the form shows the latest `onPersist` payload and a running tally of persist events fired. Deselecting the last chip still fires a persist with an empty list. At-cap unselected taps are suppressed (no persist fired).", c28655q, 6);
            boolean z74 = false;
            boolean z75 = false;
            int i47 = 48;
            DefaultConstructorMarker defaultConstructorMarker8 = null;
            boolean z76 = false;
            m48346v("debug-multi-select-persist", "user-form-multi-persist", "Which recovery practices do you use? (select all that apply, cap 3)", 3, AbstractC37056f.m118959K(new C0885f("opt1", "🧘 Stretching", "stretching", false, z74, null, 48, null), new C0885f("opt2", "🛁 Cold plunge", "cold-plunge", z74, z75, null, 48, null), new C0885f("opt3", "🔥 Sauna", "sauna", z75, z76, null, i47, defaultConstructorMarker8), new C0885f("opt4", "💆 Massage", "massage", z75, z76, 0 == true ? 1 : 0, i47, defaultConstructorMarker8), new C0885f("opt5", "🛌 Naps", "naps", z75, z76, 0 == true ? 1 : 0, i47, defaultConstructorMarker8)), c28655q, (C0885f.f3215g << 12) | 3510);
            c28655q = c28655q;
            m48318J("AIX-1292 — Multi-select with USER_INPUT option", c28655q, 6);
            m48316H("Case 1: MULTI_SELECT question where one option is type=USER_INPUT, rendered inline among the chips as a text input row. Sibling chips (A / B / C) remain independently selectable; typing into the USER_INPUT row (D) auto-selects it, clearing the text deselects it.", c28655q, 0);
            boolean z77 = false;
            boolean z78 = false;
            Integer num = null;
            boolean z79 = false;
            String str18 = "qna-debug-multi-userinput";
            String str19 = "user-form-multi-userinput";
            String str20 = "debug-multi-userinput";
            String str21 = "q1";
            String str22 = "What's on your mind? (select any that apply)";
            m48320L(new C0882c(str18, str19, str20, num, str21, str22, AbstractC37056f.m118959K(new C0885f("opt-a", "Energy", "energy", false, z77, null, 48, 0 == true ? 1 : 0), new C0885f("opt-b", "Sleep", UserState.States.SLEEP, z77, z78, null, 48, null), new C0885f("opt-c", "Stress", "stress", z78, false, null, 48, defaultConstructorMarker8), new C0885f("opt-d", "Other (type your own)", "other", false, true, null)), z79, true, 4, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z68, i46, z69, str2, z17, z18, str3, str4, str5, str6, i24, str7, action, action2, z19, enumC0881b, 268434568, defaultConstructorMarker2), c28655q, i25);
            m48318J("AIX-1292 — FREE_TEXT question (required)", c28655q, 6);
            m48316H("Case 2: question type FREE_TEXT — no chips. The prompt + a single text input row IS the question content. `is_required: true` → submit arrow is disabled until the box is non-empty.", c28655q, 0);
            C25271y c25271y = C25271y.f99162w;
            m48320L(new C0882c("qna-debug-freetext-required", "user-form-freetext-required", "debug-freetext-required", num, "q1", "Tell us in your own words how you slept last night", c25271y, z79, false, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z68, i46, true, str2, true, z18, str3, str4, str5, str6, i24, str7, action, action2, z19, enumC0881b, 268353416, defaultConstructorMarker2), c28655q, i25);
            m48318J("AIX-1292 — FREE_TEXT question (optional)", c28655q, 6);
            m48316H("Case 2 variant: FREE_TEXT with `is_required: false` — submit arrow is always enabled, including with an empty box. Used when the member can skip the question entirely.", c28655q, 0);
            DefaultConstructorMarker defaultConstructorMarker9 = null;
            Integer num2 = null;
            boolean z84 = false;
            boolean z85 = false;
            int i48 = 0;
            int i49 = 0;
            int i54 = 0;
            boolean z86 = false;
            int i55 = 0;
            boolean z87 = true;
            boolean z88 = false;
            boolean z89 = false;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            String str26 = null;
            int i56 = 0;
            String str27 = null;
            Action action3 = null;
            Action action4 = null;
            boolean z94 = false;
            EnumC0881b enumC0881b2 = null;
            m48320L(new C0882c("qna-debug-freetext-optional", "user-form-freetext-optional", "debug-freetext-optional", num2, "q1", "Anything else you'd like to share?", c25271y, z84, z85, i48, i49, i54, z86, i55, z87, null, z88, z89, str23, str24, str25, str26, i56, str27, action3, action4, z94, enumC0881b2, 268353416, defaultConstructorMarker9), c28655q, i25);
            m48318J("AIX-1292 — FREE_TEXT question (rehydrated)", c28655q, 6);
            m48316H("Case 2 reload-after-submit: a FREE_TEXT question with `freeTextValue` populated from the server's prior `user_input_text`. Pre-fills the box.", c28655q, 0);
            m48320L(new C0882c("qna-debug-freetext-rehydrated", "user-form-freetext-rehydrated", "debug-freetext-rehydrated", num2, "q1", "Tell us in your own words how you slept last night", c25271y, z84, z85, i48, i49, i54, z86, i55, z87, "Slept poorly — tossed and turned, woke up a few times", z88, z89, str23, str24, str25, str26, i56, str27, action3, action4, z94, enumC0881b2, 268320648, defaultConstructorMarker9), c28655q, i25);
            m48318J("AIX-1299 — FREE_TEXT with moderation error (403)", c28655q, 6);
            m48316H("BE returned HTTP 403 on a free-text submit. The response body is rendered inline beneath the input in `accentAlert`. The member's previously-typed text is preserved and the field stays editable so they can revise + retry in place.", c28655q, 0);
            m48320L(new C0882c("qna-debug-freetext-moderation", "user-form-freetext-moderation", "debug-freetext-moderation", num2, "q1", "Tell us in your own words how you slept last night", c25271y, z84, z85, i48, i49, i54, z86, i55, z87, "Something the moderator rejected.", true, z89, str23, str24, str25, str26, i56, "Your message couldn't be sent because it contains language we can't process. Please revise and try again.", action3, action4, z94, enumC0881b2, 259932040, defaultConstructorMarker9), c28655q, i25);
            m48318J("AIX-1299 — Multi-select + USER_INPUT with moderation error (403)", c28655q, 6);
            m48316H("Same 403 path, but submitted from the USER_INPUT row of a MULTI_SELECT question. The errored treatment applies to the USER_INPUT input row (red border + right-aligned `!` icon) and the error message renders below the question. Sibling chips remain interactive so the member can swap selection instead of revising the text.", c28655q, 0);
            boolean z95 = false;
            boolean z96 = false;
            boolean z97 = false;
            boolean z98 = false;
            String str28 = "qna-debug-multi-userinput-moderation";
            String str29 = "user-form-multi-userinput-moderation";
            String str30 = "debug-multi-userinput-moderation";
            String str31 = "q1";
            String str32 = "What's on your mind? (select any that apply)";
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            m48320L(new C0882c(str28, str29, str30, null, str31, str32, AbstractC37056f.m118959K(new C0885f("opt-a", "Energy", "energy", false, z95, null, 48, null), new C0885f("opt-b", "Sleep", UserState.States.SLEEP, z95, z96, null, 48, null), new C0885f("opt-c", "Stress", "stress", z96, false, null, 48, null), new C0885f("opt-d", "Other (type your own)", "other", true, true, "Something the moderator rejected.")), false, true, 4, objArr, objArr2, z68, i46, z97, str2, z98, z18, str3, str4, str5, str6, i24, "Your message couldn't be sent because it contains language we can't process. Please revise and try again.", action, action2, z19, enumC0881b, 260045960, defaultConstructorMarker2), c28655q, i25);
            m48318J("M1 — Multi-select, 2 options", c28655q, 6);
            m48316H("`MULTI_SELECT` mode: chips toggle independently. Save is enabled once at least one chip is selected.", c28655q, 6);
            boolean z99 = false;
            int i57 = 268434568;
            String str33 = null;
            m48320L(new C0882c("qna-debug-multi-two", "abc123", "debug-multi-two", null, "q1", "Which workouts did you do today? (select all that apply)", AbstractC37056f.m118959K(new C0885f("opt1", "🏃 Run", "run", false, z99, null, 48, null), new C0885f("opt2", "🚴 Bike", "bike", z99, false, null, 48, null)), false, true, 2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z68, i46, z97, str2, z98, z18, str3, str4, str5, str6, i24, str33, action, action2, z19, enumC0881b, i57, defaultConstructorMarker2), c28655q, i25);
            m48318J("M1 — Multi-select, 6 options", c28655q, 6);
            m48316H("`MULTI_SELECT` mode at 6 options — layout and chip-wrap check with multiple independent toggles.", c28655q, 6);
            boolean z100 = false;
            boolean z101 = false;
            boolean z102 = false;
            boolean z103 = false;
            boolean z104 = false;
            m48320L(new C0882c("qna-debug-multi-six", "abc123", "debug-multi-six", null, "q1", "Which recovery practices do you use? (select all that apply)", AbstractC37056f.m118959K(new C0885f("opt1", "🧘 Stretching", "stretching", false, z100, null, 48, null), new C0885f("opt2", "🛁 Cold plunge", "cold-plunge", z100, z101, null, 48, null), new C0885f("opt3", "🔥 Sauna", "sauna", z101, z102, null, 48, null), new C0885f("opt4", "💆 Massage", "massage", z102, z103, null, 48, null), new C0885f("opt5", "🛌 Naps", "naps", z103, z104, null, 48, null), new C0885f("opt6", "🧊 Ice bath", "ice-bath", z104, false, null, 48, null)), false, true, 6, 0, 0, false, i46, z97, str2, z98, z18, str3, str4, str5, str6, i24, str33, action, action2, z19, enumC0881b, i57, defaultConstructorMarker2), c28655q, i25);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(10 * f13, c2314t));
            c28655q.m87177s();
            c28655q.m87177s();
            c28655q.m87177s();
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.m87205f(new C4651t(i13, 7, interfaceC4339a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m48315G(InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m48314F(interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final void m48316H(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-151248225);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q, i14 & 14, C2886a.f11498d << 18, 196602);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(str, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m48317I(String str, int i13, Composer composer, int i14) {
        m48316H(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final void m48318J(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-145144258);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87153g(str) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getH2(), null, c28655q, i14 & 14, C2886a.f11498d << 18, 196602);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C10941a(str, i13, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m48319K(String str, int i13, Composer composer, int i14) {
        m48318J(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final void m48320L(C0882c c0882c, Composer composer, int i13) {
        int i14;
        C0882c c0882c2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1550911509);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c0882c) : c28655q.m87157i(c0882c) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C17085h(4);
                c28655q.m87172p0(objM87133R);
            }
            c0882c2 = c0882c;
            AbstractC18491e0.m53491j0(modifierM3409f2, c0882c2, false, (Function1) objM87133R, null, null, null, c28655q, (C0882c.f3186C << 3) | 3078 | ((i14 << 3) & 112), 116);
            c28655q.m87173q(true);
        } else {
            c0882c2 = c0882c;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(c0882c2, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m48321M(C18488d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m48322N(C0882c c0882c, int i13, Composer composer, int i14) {
        m48320L(c0882c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private static final List<C17097e> m48324P(List<C17097e> list) {
        List<C17097e> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            arrayList.add(C17097e.m48302b((C17097e) obj, null, null, null, false, i14 + "/" + list.size(), 15, null));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x022c  */
    /* JADX INFO: renamed from: l */
    private static final void m48336l(String str, String str2, boolean z4, List<C17097e> list, Composer composer, int i13) {
        C28655q c28655q;
        C28676v0 c28676v0;
        final int i14;
        Object obj;
        InterfaceC28601c1 interfaceC28601c1;
        boolean zM87149e;
        Object objM87133R;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(67369539);
        int i15 = (i13 & 6) == 0 ? (c28655q2.m87153g(str) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(str2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87157i(list) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            Object objM87133R2 = c28655q2.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R2 == c28676v1) {
                objM87133R2 = AbstractC11895b.m32005x(0, c28655q2);
            }
            final InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v1) {
                objM87133R3 = AbstractC28683x.m87272z(C25272z.f99163w);
                c28655q2.m87172p0(objM87133R3);
            }
            final InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v1) {
                objM87133R4 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R4);
            }
            final InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R4;
            final int size = list.size();
            int iM36284n = AbstractC12889b.m36284n(m48337m(interfaceC28601c2), 0, size - 1);
            final C17097e c17097e = list.get(iM36284n);
            String str3 = m48342r(interfaceC28601c3).get(c17097e.getId());
            String strM30461o = AbstractC11266d.m30461o("debug-form-", str2);
            String id4 = c17097e.getId();
            String prompt = c17097e.getPrompt();
            List<C0885f> listM48305d = c17097e.m48305d();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM48305d, 10));
            for (C0885f c0885f : listM48305d) {
                arrayList.add(C0885f.m2146b(c0885f, null, null, null, str3 != null && str3.equals(c0885f.getOptionId()), false, null, 55, null));
            }
            C0882c c0882c = new C0882c(strM30461o, str, str2, null, id4, prompt, arrayList, m48344t(interfaceC28601c4), false, 0, iM36284n, size, z4 && iM36284n > 0, iM36284n, false, null, c17097e.getIsRequired(), false, c17097e.getProgressLabel(), null, null, null, 0, null, null, null, false, null, 268092168, null);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            c28655q = c28655q2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            boolean zM87157i = c28655q.m87157i(c17097e) | c28655q.m87149e(iM36284n) | c28655q.m87149e(size);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (objM87133R5 != c28676v0) {
                    i14 = iM36284n;
                    obj = objM87133R5;
                    interfaceC28601c1 = interfaceC28601c2;
                }
                Function1 function1 = (Function1) obj;
                zM87149e = c28655q.m87149e(i14);
                objM87133R = c28655q.m87133R();
                if (zM87149e || objM87133R == c28676v0) {
                    objM87133R = new C17101i(interfaceC28601c1, i14, 0);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC18491e0.m53491j0(modifierM3409f2, c0882c, false, function1, null, (InterfaceC4339a) objM87133R, null, c28655q, (C0882c.f3186C << 3) | 6, 84);
                c28655q.m87173q(true);
            }
            i14 = iM36284n;
            obj = new Function1() { // from class: hb2.h
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AbstractC42784j.m48338n(c17097e, i14, size, interfaceC28601c3, interfaceC28601c4, interfaceC28601c2, (C18488d) obj2);
                }
            };
            interfaceC28601c1 = interfaceC28601c2;
            c28655q.m87172p0(obj);
            Function1 function2 = (Function1) obj;
            zM87149e = c28655q.m87149e(i14);
            objM87133R = c28655q.m87133R();
            if (zM87149e) {
                objM87133R = new C17101i(interfaceC28601c1, i14, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C17101i(interfaceC28601c1, i14, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC18491e0.m53491j0(modifierM3409f2, c0882c, false, function2, null, (InterfaceC4339a) objM87133R, null, c28655q, (C0882c.f3186C << 3) | 6, 84);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1930a(str, str2, z4, list, i13, 15);
        }
    }

    /* JADX INFO: renamed from: m */
    private static final int m48337m(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m48338n(C17097e c17097e, int i13, int i14, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, C18488d submission) {
        AbstractC22676k.m65750j(submission, "submission");
        String str = (String) AbstractC25265s.m74098G0(submission.m53354c());
        if (str != null) {
            m48343s(interfaceC28601c1, AbstractC25247g0.m73996e0(m48342r(interfaceC28601c1), new C23465k(c17097e.getId(), str)));
        }
        if (i13 >= i14 - 1) {
            m48345u(interfaceC28601c2, true);
        } else {
            m48341q(interfaceC28601c3, i13 + 1);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m48339o(int i13, InterfaceC28601c1 interfaceC28601c1) {
        if (i13 > 0) {
            m48341q(interfaceC28601c1, i13 - 1);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m48340p(String str, String str2, boolean z4, List list, int i13, Composer composer, int i14) {
        m48336l(str, str2, z4, list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m48341q(InterfaceC28601c1 interfaceC28601c1, int i13) {
        interfaceC28601c1.setValue(Integer.valueOf(i13));
    }

    /* JADX INFO: renamed from: r */
    private static final Map<String, String> m48342r(InterfaceC28601c1 interfaceC28601c1) {
        return (Map) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final void m48343s(InterfaceC28601c1 interfaceC28601c1, Map<String, String> map) {
        interfaceC28601c1.setValue(map);
    }

    /* JADX INFO: renamed from: t */
    private static final boolean m48344t(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    private static final void m48345u(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: v */
    private static final void m48346v(final String str, final String str2, final String str3, final int i13, final List<C0885f> list, Composer composer, final int i14) {
        String str4;
        C28655q c28655q;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1957718419);
        int i15 = (i14 & 6) == 0 ? (c28655q2.m87153g(str) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= c28655q2.m87153g(str2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            str4 = str3;
            i15 |= c28655q2.m87153g(str4) ? 256 : 128;
        } else {
            str4 = str3;
        }
        if ((i14 & 3072) == 0) {
            i15 |= c28655q2.m87149e(i13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            i15 |= c28655q2.m87157i(list) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(C25235a0.f99113w);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
            Object objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC11895b.m32005x(0, c28655q2);
            }
            InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R3;
            String strM30461o = AbstractC11266d.m30461o("debug-form-", str);
            List<C0885f> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (C0885f c0885f : list2) {
                arrayList.add(C0885f.m2146b(c0885f, null, null, null, m48347w(interfaceC28601c3).contains(c0885f.getOptionId()), false, null, 55, null));
            }
            C0882c c0882c = new C0882c(strM30461o, str2, str, null, "q1", str4, arrayList, false, true, i13, 0, 0, false, 0, false, null, false, false, null, null, null, null, 0, null, null, null, false, null, 268434568, null);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = new C17085h(5);
                c28655q2.m87172p0(objM87133R4);
            }
            Function1 function1 = (Function1) objM87133R4;
            Object objM87133R5 = c28655q2.m87133R();
            if (objM87133R5 == c28676v0) {
                interfaceC28601c1 = interfaceC28601c4;
                interfaceC28601c2 = interfaceC28601c5;
                objM87133R5 = new C3482x(interfaceC28601c3, interfaceC28601c1, interfaceC28601c2, 3);
                c28655q2.m87172p0(objM87133R5);
            } else {
                interfaceC28601c1 = interfaceC28601c4;
                interfaceC28601c2 = interfaceC28601c5;
            }
            AbstractC18491e0.m53491j0(modifierM3409f2, c0882c, false, function1, (Function1) objM87133R5, null, null, c28655q2, (C0882c.f3186C << 3) | 27654, 100);
            String strM8295h = AbstractC2875y.m8295h(m48312D(interfaceC28601c2), "persists fired: ");
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125385c1 = c38072d.m121949b(c28655q2, i16).getWhite70();
            C2886a c2886aM8421b = c38072d.m121952e(c28655q2, i16).getB2();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM8295h, null, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8421b, null, c28655q2, 0, i17, 196602);
            List<String> listM48310B = m48310B(interfaceC28601c1);
            AbstractC30795n.m94707h(listM48310B == null ? "last persist payload: (none yet — tap a chip)" : listM48310B.isEmpty() ? "last persist payload: [] (empty deselect — still PUT'd to BE)" : AbstractC11266d.m30461o("last persist payload: ", AbstractC25265s.m74110N0(listM48310B, null, "[", "]", null, 57)), null, c38072d.m121949b(c28655q2, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB2(), null, c28655q2, 0, i17, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: hb2.g
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC42784j.m48350z(str, str2, str3, i13, list, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: w */
    private static final Set<String> m48347w(InterfaceC28601c1 interfaceC28601c1) {
        return (Set) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m48348x(C18488d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m48349y(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, Set newSelections) {
        AbstractC22676k.m65750j(newSelections, "newSelections");
        m48309A(interfaceC28601c1, newSelections);
        m48311C(interfaceC28601c2, AbstractC25265s.m74150t1(AbstractC25265s.m74093D1(newSelections)));
        m48313E(interfaceC28601c3, m48312D(interfaceC28601c3) + 1);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m48350z(String str, String str2, String str3, int i13, List list, int i14, Composer composer, int i15) {
        m48346v(str, str2, str3, i13, list, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }
}
