package p708hb2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.ChatEntrypointExperience;
import com.whoop.navigation.DrawerPresentation;
import cp0.C10941a;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import h02.C16576i;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import l83.C23454a0;
import m83.C25271y;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p705ea2.C12907g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import y31.AbstractC39195d;
import y31.C39192a;
import y31.C39196e;

/* JADX INFO: renamed from: hb2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\r\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0011\u001a3\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\b0\nH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u001d\u001a\u00020\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/navigation/ChatEntrypointExperience;", "experience", "", "fingerprint", "Lcom/whoop/navigation/AiAction;", "n", "(Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/lang/String;)Lcom/whoop/navigation/AiAction;", "Lkotlin/Function0;", "Ll83/a0;", "onBackClick", "Lkotlin/Function1;", "Ly31/a;", "onButtonClick", "e", "(Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "text", "i", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "g", "label", "Ly31/e;", "viewState", "k", "(Ljava/lang/String;Ly31/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "title", "Lgz0/m0;", "icon", "", "isEmphasized", "p", "(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/ChatEntrypointExperience;Z)Ly31/a;", "app_prodStandardRelease"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17096d {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final void m48289e(InterfaceC4339a interfaceC4339a, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        Function1 function2;
        Function1 function3 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-851961845);
        int i14 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(interfaceC4339a) ? 4 : 2) : i13;
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function3) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, c2314t));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66724m);
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
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l("AI Entry Points Debug"), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowBackward()), null, null, null, null, null, false, null, null, null, null, null, null, null, 65530, null), null, interfaceC4339a, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 9) & 7168), 53);
            c28655q = c28655q;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14));
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
            int i16 = 6;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            m48293i("TalkText Widgets — FAB_VOICE", c28655q, 6);
            m48291g("TALK button triggers FAB inline voice recording. TEXT opens drawer with keyboard.", c28655q, 6);
            TextResource textResourceM21278l = AbstractC8693b.m21278l("Smart log with WHOOP AI");
            EnumC16313m0 enumC16313m0 = EnumC16313m0.AI_SPARKLE;
            EnumC16313m0 enumC16313m1 = EnumC16313m0.KEYBOARD;
            ChatEntrypointExperience chatEntrypointExperience = ChatEntrypointExperience.QUICK_KEYBOARD;
            C39192a c39192aM48301q = m48301q("Text", enumC16313m1, chatEntrypointExperience, false, 8, null);
            EnumC16313m0 enumC16313m2 = EnumC16313m0.MICROPHONE;
            ChatEntrypointExperience chatEntrypointExperience2 = ChatEntrypointExperience.FAB_VOICE;
            C39196e c39196e = new C39196e(textResourceM21278l, enumC16313m0, null, null, AbstractC37056f.m118959K(c39192aM48301q, m48301q("Talk", enumC16313m2, chatEntrypointExperience2, false, 8, null)), null, false, null, null, 492, null);
            int i17 = (i15 << 3) & 896;
            int i18 = (C39196e.f168454j << 3) | 6 | i17;
            m48295k("Journal — TEXT (QUICK_KEYBOARD) + TALK (FAB_VOICE)", c39196e, function3, c28655q, i18);
            TextResource textResourceM21278l2 = AbstractC8693b.m21278l("Share something new");
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l("The more WHOOP knows, the better your personalized guidance becomes");
            EnumC16313m0 enumC16313m3 = EnumC16313m0.CAMERA;
            ChatEntrypointExperience chatEntrypointExperience3 = ChatEntrypointExperience.QUICK_CAMERA_BACK;
            int i19 = 482;
            DefaultConstructorMarker defaultConstructorMarker = null;
            boolean z4 = false;
            C9598e c9598e = null;
            m48295k("Empty state — camera + TEXT + TALK (FAB_VOICE)", new C39196e(textResourceM21278l2, null, textResourceM21278l3, AbstractC37056f.m118958J(m48301q(null, enumC16313m3, chatEntrypointExperience3, false, 8, null)), AbstractC37056f.m118959K(m48301q("Text", enumC16313m1, chatEntrypointExperience, false, 8, null), m48301q("Talk", enumC16313m2, chatEntrypointExperience2, false, 8, null)), 0 == true ? 1 : 0, z4, null, c9598e, i19, defaultConstructorMarker), function3, c28655q, i18);
            m48293i("TALK_TEXT_WIDGET_EMPTY_STATE", c28655q, 6);
            m48291g("Center-aligned empty state variant with image.", c28655q, 6);
            m48295k("Empty state — centered, camera + TEXT + TALK (FAB_VOICE)", new C39196e(AbstractC8693b.m21278l("Start sharing with WHOOP"), null, AbstractC8693b.m21278l("The more you share, the smarter your insights, coaching, and recommendations become."), AbstractC37056f.m118958J(m48301q(null, enumC16313m3, chatEntrypointExperience3, false, 8, null)), AbstractC37056f.m118959K(m48301q("Text", enumC16313m1, chatEntrypointExperience, false, 8, null), m48301q("Talk", enumC16313m2, chatEntrypointExperience2, false, 8, null)), 0 == true ? 1 : 0, z4, 0 == true ? 1 : 0, c9598e, i19, defaultConstructorMarker), function3, c28655q, i18);
            TextResource textResourceM21278l4 = AbstractC8693b.m21278l("Start sharing with WHOOP");
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l("The more you share, the smarter your insights, coaching, and recommendations become.");
            List listM118958J = AbstractC37056f.m118958J(m48301q(null, enumC16313m3, chatEntrypointExperience3, false, 8, null));
            C39192a c39192aM48301q2 = m48301q("Text", enumC16313m1, chatEntrypointExperience, false, 8, null);
            ChatEntrypointExperience chatEntrypointExperience4 = ChatEntrypointExperience.QUICK_VOICE;
            m48295k("Empty state — centered, camera + TEXT + TALK (QUICK_VOICE)", new C39196e(textResourceM21278l4, null, textResourceM21278l5, listM118958J, AbstractC37056f.m118959K(c39192aM48301q2, m48301q("Talk", enumC16313m2, chatEntrypointExperience4, false, 8, null)), 0 == true ? 1 : 0, z4, 0 == true ? 1 : 0, c9598e, i19, defaultConstructorMarker), function3, c28655q, i18);
            m48293i("TalkText Widgets — QUICK_VOICE", c28655q, 6);
            m48291g("TALK button opens drawer with voice recording started. No FAB interaction.", c28655q, 6);
            m48295k("No-FAB screen — TEXT + TALK (QUICK_VOICE)", new C39196e(AbstractC8693b.m21278l("Smart log with WHOOP AI"), enumC16313m0, null, null, AbstractC37056f.m118959K(m48301q("Text", enumC16313m1, chatEntrypointExperience, false, 8, null), m48301q("Talk", enumC16313m2, chatEntrypointExperience4, false, 8, null)), null, false, null, 0 == true ? 1 : 0, 492, 0 == true ? 1 : 0), function3, c28655q, i18);
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l("What would you like to share?");
            C39192a c39192aM48301q3 = m48301q(null, enumC16313m3, chatEntrypointExperience3, false, 8, null);
            EnumC16313m0 enumC16313m4 = EnumC16313m0.UPLOAD;
            ChatEntrypointExperience chatEntrypointExperience5 = ChatEntrypointExperience.QUICK_FILES;
            C39192a c39192aM48301q4 = m48301q(null, enumC16313m4, chatEntrypointExperience5, false, 8, null);
            EnumC16313m0 enumC16313m5 = EnumC16313m0.PICTURE;
            ChatEntrypointExperience chatEntrypointExperience6 = ChatEntrypointExperience.QUICK_CAMERA_ROLL;
            m48295k("All buttons — camera + file + picture + TEXT + TALK (all QUICK_*)", new C39196e(textResourceM21278l6, enumC16313m0, null, AbstractC37056f.m118959K(c39192aM48301q3, c39192aM48301q4, m48301q(null, enumC16313m5, chatEntrypointExperience6, false, 8, null)), AbstractC37056f.m118959K(m48301q("Text", enumC16313m1, chatEntrypointExperience, false, 8, null), m48301q("Talk", enumC16313m2, chatEntrypointExperience4, false, 8, null)), null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 484, 0 == true ? 1 : 0), function3, c28655q, i18);
            m48293i("Layout Variants", c28655q, 6);
            m48291g("Testing different button combinations.", c28655q, 6);
            m48295k("TALK only (FAB_VOICE)", new C39196e(AbstractC8693b.m21278l("Talk to WHOOP AI"), enumC16313m0, null, null, AbstractC37056f.m118958J(m48301q("Talk", enumC16313m2, chatEntrypointExperience2, false, 8, null)), null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 492, 0 == true ? 1 : 0), function3, c28655q, i18);
            m48295k("TEXT only (QUICK_KEYBOARD)", new C39196e(AbstractC8693b.m21278l("Ask WHOOP AI anything"), null, null, null, AbstractC37056f.m118958J(m48301q("Text", enumC16313m1, chatEntrypointExperience, false, 8, null)), null, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 494, 0 == true ? 1 : 0), function3, c28655q, i18);
            m48295k("Icon-only — camera + file + picture (QUICK_*)", new C39196e(AbstractC8693b.m21278l("Add to your journal"), null, AbstractC8693b.m21278l("Capture a moment"), AbstractC37056f.m118959K(m48301q(null, enumC16313m3, chatEntrypointExperience3, false, 8, null), m48301q(null, enumC16313m4, chatEntrypointExperience5, false, 8, null), m48301q(null, enumC16313m5, chatEntrypointExperience6, false, 8, null)), C25271y.f99162w, null, false, null, 0 == true ? 1 : 0, 482, null), function3, c28655q, i18);
            m48293i("ChatEntrypointExperience", c28655q, 6);
            m48291g("Each button routes through the real pipeline.", c28655q, 6);
            c28655q.m87150e0(-1614098139);
            for (ChatEntrypointExperience chatEntrypointExperience7 : ChatEntrypointExperience.getEntries()) {
                AbstractC39195d.m124859n(AbstractC1102d.m3409f(1.0f, c2314t), new C39196e(AbstractC8693b.m21278l(chatEntrypointExperience7.name()), null, null, null, AbstractC37056f.m118958J(new C39192a(AbstractC8693b.m21278l(chatEntrypointExperience7.name()), EnumC16313m0.KEYBOARD, chatEntrypointExperience7.name(), m48299o(chatEntrypointExperience7, null, 2, null), false, null, 32, null)), null, false, null, null, 494, null), function3, null, c28655q, (C39196e.f168454j << 3) | i16 | i17, 8);
                i16 = i16;
                function3 = function1;
            }
            int i24 = i16;
            c28655q.m87173q(false);
            m48293i("FORM_INPUT_ONLY — BFF wrapper (AIX-1685)", c28655q, i24);
            m48291g("Routes to AiChatWrapperScreen (BFF, current production path) via a generated fingerprint, so the FORM_INPUT_ONLY hiding behaviour (input bar, history, Context Hub icons) actually applies. The auto-generated card above routes to the legacy AiCoachWrapperScreen and won't exercise this PR's changes.", c28655q, i24);
            TextResource textResource = null;
            function2 = function1;
            AbstractC39195d.m124859n(AbstractC1102d.m3409f(1.0f, c2314t), new C39196e(AbstractC8693b.m21278l("FORM_INPUT_ONLY (BFF)"), null, null, null, AbstractC37056f.m118958J(new C39192a(AbstractC8693b.m21278l("Launch"), EnumC16313m0.KEYBOARD, "FORM_INPUT_ONLY BFF", m48298n(ChatEntrypointExperience.FORM_INPUT_ONLY, "debug-" + UUID.randomUUID()), true, textResource, 32, null)), null, false, textResource, null, 494, null), function2, null, c28655q, (C39196e.f168454j << 3) | i24 | i17, 8);
            AbstractC25012a.m73388u((float) 10, f13, c2314t, c28655q, true);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            function2 = function3;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12907g0(interfaceC4339a, function2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m48290f(InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m48289e(interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final void m48291g(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(170967514);
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
            c28677v1M87180u.f115982d = new C10941a(str, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m48292h(String str, int i13, Composer composer, int i14) {
        m48291g(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final void m48293i(String str, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(782595291);
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
            c28677v1M87180u.f115982d = new C10941a(str, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m48294j(String str, int i13, Composer composer, int i14) {
        m48293i(str, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m48295k(String str, C39196e c39196e, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(763208688);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c39196e) : c28655q.m87157i(c39196e) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            function2 = function1;
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        } else {
            function2 = function1;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, i14 & 14, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            AbstractC39195d.m124859n(AbstractC1102d.m3409f(1.0f, c2314t), c39196e, function2, null, c28655q, 6 | (C39196e.f168454j << 3) | (i14 & 112) | (i14 & 896), 8);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16576i(str, c39196e, function1, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m48296l(String str, C39196e c39196e, Function1 function1, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m48295k(str, c39196e, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final AiAction m48298n(ChatEntrypointExperience chatEntrypointExperience, String str) {
        return new AiAction("talk_text_debug", (String) null, (String) null, (String) null, (String) null, (String) null, str, (String) null, (String) null, false, (String) null, (Boolean) null, (String) null, (String) null, chatEntrypointExperience, (Map) null, (DrawerPresentation) null, 107012, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ AiAction m48299o(ChatEntrypointExperience chatEntrypointExperience, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        return m48298n(chatEntrypointExperience, str);
    }

    /* JADX INFO: renamed from: p */
    private static final C39192a m48300p(String str, EnumC16313m0 enumC16313m0, ChatEntrypointExperience chatEntrypointExperience, boolean z4) {
        TextResource textResourceM21278l = str != null ? AbstractC8693b.m21278l(str) : null;
        if (str == null) {
            str = enumC16313m0.name();
        }
        return new C39192a(textResourceM21278l, enumC16313m0, str, m48299o(chatEntrypointExperience, null, 2, null), z4, null, 32, null);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ C39192a m48301q(String str, EnumC16313m0 enumC16313m0, ChatEntrypointExperience chatEntrypointExperience, boolean z4, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        return m48300p(str, enumC16313m0, chatEntrypointExperience, z4);
    }
}
