package rm1;

import am2.C1024j;
import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import bg0.C3226h;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.home.domain.models.DayOneTransitionViewState;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CoachScreenModel;
import ec3.InterfaceC13037f2;
import h01.C16551r;
import h01.InterfaceC16556w;
import h31.C16825r;
import is0.C20911u0;
import java.util.Map;
import k31.C22174d;
import k31.EnumC22171a;
import kd1.EnumC22400l;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import mm1.C25697k;
import no0.C26954j0;
import o01.C27347c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p323m8.AbstractC25218a;
import p353o0.C27325i;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p699b70.C2776b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p741vn1.AbstractC36203g;
import p741vn1.C36213q;
import p741vn1.EnumC36197a;
import p741vn1.EnumC36205i;
import qk2.C30453i;
import r12.C30856a;
import re1.C31324k;
import sn1.AbstractC32773a;
import sn1.C32774b;
import um1.AbstractC35084b;
import um1.AbstractC35087e;
import wb3.AbstractC37056f;
import x81.C38072d;
import z51.C40101l;

/* JADX INFO: renamed from: rm1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011²\u0006\u000e\u0010\r\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/home/domain/models/DayOneTransitionViewState;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "C", "(Lcom/whoop/home/domain/models/DayOneTransitionViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lvn1/q;", "", "isDayOneAnimationCompleted", "m", "(Lvn1/q;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "shouldShowReplayButton", "shouldAnimateReplayButton", "Lvn1/g;", "notificationCenterViewState", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31595i {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m97447A(C36213q c36213q, Function1 function1, InterfaceC28670t2 interfaceC28670t2) {
        InterfaceC16556w interfaceC16556wM115208c;
        TextResource textResourceMo46713d;
        C27347c c27347cM115261a = c36213q.getAiChatEntryPointItem();
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (c27347cM115261a == null) {
            return c23454a0;
        }
        AbstractC36203g abstractC36203gM97470s = m97470s(interfaceC28670t2);
        String strM21268b = null;
        AbstractC36203g.c cVar = abstractC36203gM97470s instanceof AbstractC36203g.c ? (AbstractC36203g.c) abstractC36203gM97470s : null;
        if (cVar != null && (interfaceC16556wM115208c = cVar.getCardToDisplay()) != null && (textResourceMo46713d = interfaceC16556wM115208c.getSubtitle()) != null) {
            strM21268b = AbstractC8693b.m21268b(textResourceMo46713d);
        }
        String str = strM21268b == null ? "" : strM21268b;
        AppScreen.C9345k1 c9345k1 = AppScreen.C9345k1.f27714w;
        String sourceType = c27347cM115261a.getSourceType();
        String str2 = sourceType == null ? "" : sourceType;
        String conversationSeedId = c27347cM115261a.getConversationSeedId();
        function1.invoke(new C9598e(c9345k1, new CoachScreenModel(str2, str, conversationSeedId == null ? "" : conversationSeedId, (Integer) null, (String) null, (String) null, true, c27347cM115261a.getSourceId(), (Map) null, "notifications_wrapper_chat_entry", c27347cM115261a.getEducationType(), (String) null, (String) null, false, 14648, (DefaultConstructorMarker) null), 0 == true ? 1 : 0, 4, null));
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m97448B(C36213q c36213q, boolean z4, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m97464m(c36213q, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: C */
    public static final void m97449C(DayOneTransitionViewState viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        EnumC31589c enumC31589c;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1685729808);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C31593g(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    function2 = (Function1) objM87133R;
                }
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                C40101l overviewGaugeState = viewState.getOverviewGaugeState();
                C25697k welcomeCardState = viewState.getWelcomeCardState();
                boolean z13 = !viewState.isDayOneAnimationCompleted();
                if (viewState.isDayOneAnimationCompleted()) {
                    enumC31589c = EnumC31589c.COMPLETE;
                } else {
                    enumC31589c = EnumC31589c.INITIAL;
                }
                int i17 = (i15 << 3) & 896;
                AbstractC31599m.m97491E(null, new C31597k(overviewGaugeState, welcomeCardState, 0, 0L, z13, enumC31589c, 12, null), function2, c28655q, (C40101l.f173095t << 3) | i17, 1);
                m97464m(viewState.getNotificationsCenterViewState(), viewState.isDayOneAnimationCompleted(), function2, c28655q, C36213q.f155039g | i17, 0);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
            }
            function3 = function2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C30453i(viewState, i13, function3, i14, 6);
            }
        }
        i15 |= 48;
        function2 = function1;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C31593g(2);
                    c28655q.m87172p0(objM87133R);
                }
                function2 = (Function1) objM87133R;
            }
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(2 * 8), C2299e.f9110M, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            C40101l overviewGaugeState2 = viewState.getOverviewGaugeState();
            C25697k welcomeCardState2 = viewState.getWelcomeCardState();
            boolean z14 = !viewState.isDayOneAnimationCompleted();
            if (viewState.isDayOneAnimationCompleted()) {
                enumC31589c = EnumC31589c.COMPLETE;
            } else {
                enumC31589c = EnumC31589c.INITIAL;
            }
            int i18 = (i15 << 3) & 896;
            AbstractC31599m.m97491E(null, new C31597k(overviewGaugeState2, welcomeCardState2, 0, 0L, z14, enumC31589c, 12, null), function2, c28655q, (C40101l.f173095t << 3) | i18, 1);
            m97464m(viewState.getNotificationsCenterViewState(), viewState.isDayOneAnimationCompleted(), function2, c28655q, C36213q.f155039g | i18, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        function3 = function2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30453i(viewState, i13, function3, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m97450D(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m97451E(DayOneTransitionViewState dayOneTransitionViewState, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m97449C(dayOneTransitionViewState, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:122:0x01da  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:127:0x0208  */
    /* JADX WARN: Code duplicated, block: B:128:0x020d  */
    /* JADX WARN: Code duplicated, block: B:158:0x025b  */
    /* JADX WARN: Code duplicated, block: B:162:0x027a  */
    /* JADX WARN: Code duplicated, block: B:163:0x027e  */
    /* JADX WARN: Code duplicated, block: B:165:0x0282  */
    /* JADX WARN: Code duplicated, block: B:166:0x0287  */
    /* JADX WARN: Code duplicated, block: B:168:0x028b  */
    /* JADX WARN: Code duplicated, block: B:169:0x0298  */
    /* JADX WARN: Code duplicated, block: B:171:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:176:0x0304  */
    /* JADX WARN: Code duplicated, block: B:177:0x0308  */
    /* JADX WARN: Code duplicated, block: B:182:0x0329  */
    /* JADX WARN: Code duplicated, block: B:185:0x0337  */
    /* JADX WARN: Code duplicated, block: B:186:0x034d  */
    /* JADX WARN: Code duplicated, block: B:188:0x035e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0360  */
    /* JADX WARN: Code duplicated, block: B:193:0x036d  */
    /* JADX WARN: Code duplicated, block: B:196:0x037e  */
    /* JADX WARN: Code duplicated, block: B:200:0x0397  */
    /* JADX WARN: Code duplicated, block: B:203:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:204:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:208:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:211:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:212:0x03df  */
    /* JADX WARN: Code duplicated, block: B:216:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:220:0x0439  */
    /* JADX WARN: Code duplicated, block: B:221:0x043c  */
    /* JADX WARN: Code duplicated, block: B:226:0x0453  */
    /* JADX WARN: Code duplicated, block: B:229:0x045b  */
    /* JADX WARN: Code duplicated, block: B:230:0x0476  */
    /* JADX WARN: Code duplicated, block: B:233:0x0486  */
    /* JADX WARN: Code duplicated, block: B:234:0x0490  */
    /* JADX WARN: Code duplicated, block: B:236:0x049c  */
    /* JADX WARN: Code duplicated, block: B:237:0x049e  */
    /* JADX WARN: Code duplicated, block: B:241:0x04af  */
    /* JADX WARN: Code duplicated, block: B:252:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:255:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:256:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:262:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:264:0x0520  */
    /* JADX WARN: Code duplicated, block: B:267:0x052b  */
    /* JADX WARN: Code duplicated, block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x011e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0120  */
    /* JADX WARN: Code duplicated, block: B:90:0x0158  */
    /* JADX WARN: Code duplicated, block: B:93:0x017c  */
    /* JADX INFO: renamed from: m */
    public static final void m97464m(C36213q viewState, boolean z4, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z13;
        C28655q c28655q;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        AbstractC36203g abstractC36203gM115263c;
        int i16;
        C22174d c22174dM63477d;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean z14;
        Object objM87133R3;
        AbstractC36203g abstractC36203g;
        AbstractC23864c abstractC23864c;
        AbstractC23864c abstractC23864c2;
        C32774b c32774b;
        InterfaceC13037f2 viewState2;
        boolean z15;
        InterfaceC28601c1 interfaceC28601c1M87261o;
        int i17;
        C28655q c28655q2;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z16;
        boolean zM87157i;
        Object objM87133R4;
        Object objM87133R5;
        boolean zM87157i2;
        Object objM87133R6;
        boolean z17;
        boolean z18;
        Object objM87133R7;
        Object objM87133R8;
        boolean zM87157i3;
        Object objM87133R9;
        InterfaceC28601c1 interfaceC28601c3;
        InterfaceC28601c1 interfaceC28601c4;
        boolean z19;
        AbstractC36203g abstractC36203gM97470s;
        AbstractC36203g.c cVar;
        boolean zM65745e;
        C27347c c27347cM115261a;
        C27347c c27347cM82506b;
        C22174d c22174dM115265f;
        boolean z24;
        boolean zM87157i4;
        Object objM87133R10;
        boolean z25;
        InterfaceC28601c1 interfaceC28601c5;
        boolean z26;
        boolean z27;
        Object objM87133R11;
        InterfaceC16556w interfaceC16556wM115208c;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean z28;
        boolean z29;
        Object objM87133R12;
        Object obj;
        Object obj2;
        boolean z34;
        boolean z35;
        Object objM87133R13;
        Object objM87133R14;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1875265374);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q3.m87153g(viewState) : c28655q3.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87155h(z4) ? 32 : 16;
        }
        int i18 = i14 & 4;
        if (i18 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q3.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q3.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R14 = c28655q3.m87133R();
                    if (objM87133R14 == c28676v0) {
                        objM87133R14 = new C31593g(1);
                        c28655q3.m87172p0(objM87133R14);
                    }
                    function4 = (Function1) objM87133R14;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getShouldShowReplayDefaultState()));
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q3.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                abstractC36203gM115263c = viewState.getNotificationsCenterViewState();
                if (abstractC36203gM115263c == null) {
                    abstractC36203gM115263c = AbstractC36203g.b.f155006b;
                }
                i16 = AbstractC36203g.f155003a;
                c28655q3.m87150e0(1371609227);
                c22174dM63477d = null;
                if (C38072d.f163053a.m121950c(c28655q3, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q3, -707312137, false, c28655q3);
                    applicationContext = ((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    z14 = ((((i16 & 14) ^ 6) <= 4 && c28655q3.m87153g(abstractC36203gM115263c)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) <= 32 && c28655q3.m87153g(null)) || (i16 & 48) == 32) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q3.m87153g(null)) || (i16 & 3072) == 2048);
                    objM87133R3 = c28655q3.m87133R();
                    if (!z14 || objM87133R3 == c28676v0) {
                        abstractC36203g = abstractC36203gM115263c;
                        objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, abstractC36203g, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32774b.class), null, null);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        abstractC36203g = abstractC36203gM115263c;
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R3;
                    c28655q3.m87173q(false);
                } else {
                    c28655q3.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q3);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q3.m87150e0(-707931115);
                        c28655q3.m87173q(false);
                        obj = null;
                        abstractC23864c = null;
                        obj2 = null;
                    } else {
                        c28655q3.m87150e0(-707931114);
                        Context applicationContext2 = ((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext2;
                        if (((i16 & 112) ^ 48) <= 32 && c28655q3.m87153g(null)) {
                            z28 = true;
                        } else if ((i16 & 48) == 32) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = ((((i16 & 14) ^ 6) <= 4 && c28655q3.m87153g(abstractC36203gM115263c)) || (i16 & 6) == 4) | z28 | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q3.m87153g(null)) || (i16 & 3072) == 2048);
                        objM87133R12 = c28655q3.m87133R();
                        if (!z29 || objM87133R12 == c28676v0) {
                            objM87133R12 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32774b.class), null, new C23863b(abstractC36203gM115263c), null);
                            obj = null;
                            obj2 = null;
                            c28655q3.m87172p0(objM87133R12);
                        } else {
                            obj = null;
                            obj2 = null;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R12;
                        c28655q3.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q3.m87150e0(-707430526);
                        z35 = ((((i16 & 112) ^ 48) <= 32 && c28655q3.m87153g(obj2)) || (i16 & 48) == 32) | ((((i16 & 14) ^ 6) <= 4 && c28655q3.m87153g(abstractC36203gM115263c)) || (i16 & 6) == 4) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q3.m87153g(obj)) || (i16 & 3072) == 2048);
                        objM87133R13 = c28655q3.m87133R();
                        if (z35 || objM87133R13 == c28676v0) {
                            objM87133R13 = new C23863b(abstractC36203gM115263c);
                            c28655q3.m87172p0(objM87133R13);
                        }
                        abstractC23864c = (C23863b) objM87133R13;
                        z34 = false;
                        c28655q3.m87173q(false);
                    } else {
                        z34 = false;
                        c28655q3.m87150e0(-438479417);
                        c28655q3.m87173q(false);
                    }
                    c28655q3.m87173q(z34);
                    c28655q3.m87173q(z34);
                    abstractC36203g = abstractC36203gM115263c;
                }
                abstractC23864c2 = abstractC23864c;
                if (abstractC23864c2 instanceof C32774b) {
                    c32774b = (C32774b) abstractC23864c2;
                } else {
                    c32774b = null;
                }
                if (c32774b != null) {
                    viewState2 = c32774b.getViewState();
                } else {
                    viewState2 = null;
                }
                if (viewState2 == null) {
                    c28655q3.m87150e0(1391932851);
                    z15 = false;
                    c28655q3.m87173q(false);
                    interfaceC28601c1M87261o = null;
                } else {
                    z15 = false;
                    c28655q3.m87150e0(-1756214258);
                    interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewState2, c28655q3, 0);
                    c28655q3.m87173q(false);
                }
                if (interfaceC28601c1M87261o == null) {
                    c28655q3.m87150e0(-1756212390);
                    c28655q2 = c28655q3;
                    i17 = i16;
                    interfaceC28601c1M87261o = AbstractC28683x.m87260n(abstractC23864c2.getViewState(), abstractC36203g, null, c28655q2, i16 << 3, 2);
                } else {
                    i17 = i16;
                    c28655q2 = c28655q3;
                    c28655q2.m87150e0(-1756216637);
                }
                c28655q2.m87173q(z15);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.5d) * 8), C2299e.f9110M, c28655q2, 6);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, C2314t.f9131w);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                if (viewState.getNotificationsCenterViewState() == null) {
                    c28655q2.m87150e0(-1958633085);
                    c28655q2.m87173q(false);
                    interfaceC28601c3 = interfaceC28601c1M87261o;
                    z19 = false;
                    interfaceC28601c4 = interfaceC28601c2;
                } else {
                    c28655q2.m87150e0(-1958633084);
                    AbstractC36203g abstractC36203gM97470s2 = m97470s(interfaceC28601c1M87261o);
                    if (viewState.getAiChatEntryPointItem() != null) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87157i = c28655q2.m87157i(abstractC23864c2);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i || objM87133R4 == c28676v0) {
                        objM87133R4 = new C16825r(abstractC23864c2, 3);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R4;
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C1024j(9, interfaceC28601c1, interfaceC28601c2);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    Function1 function5 = (Function1) objM87133R5;
                    zM87157i2 = c28655q2.m87157i(abstractC23864c2);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87157i2 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C30856a(abstractC23864c2, 4);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R6;
                    boolean zM87153g = c28655q2.m87153g(interfaceC28601c1M87261o) | c28655q2.m87157i(abstractC23864c2);
                    if ((i15 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zM87153g | z17;
                    objM87133R7 = c28655q2.m87133R();
                    if (z18 || objM87133R7 == c28676v0) {
                        objM87133R7 = new C20911u0(function4, abstractC23864c2, interfaceC28601c1M87261o, 1);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    Function1 function6 = (Function1) objM87133R7;
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C27325i(19, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R8;
                    zM87157i3 = c28655q2.m87157i(abstractC23864c2);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i3 || objM87133R9 == c28676v0) {
                        objM87133R9 = new C2776b(abstractC23864c2, 4);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    interfaceC28601c3 = interfaceC28601c1M87261o;
                    interfaceC28601c4 = interfaceC28601c2;
                    C28655q c28655q4 = c28655q2;
                    z19 = false;
                    AbstractC31600n.m97542h(null, abstractC36203gM97470s2, z16, z4, interfaceC4339a, function5, interfaceC4351m, function6, interfaceC4339a2, (Function1) objM87133R9, c28655q4, ((i15 << 6) & 7168) | (i17 << 3) | 100859904, 1);
                    c28655q2 = c28655q4;
                    c28655q2.m87173q(false);
                }
                abstractC36203gM97470s = m97470s(interfaceC28601c3);
                if (abstractC36203gM97470s instanceof AbstractC36203g.c) {
                    cVar = (AbstractC36203g.c) abstractC36203gM97470s;
                } else {
                    cVar = null;
                }
                if (cVar != null || (interfaceC16556wM115208c = cVar.getCardToDisplay()) == null) {
                    zM65745e = z19;
                } else {
                    zM65745e = AbstractC22676k.m65745e(interfaceC16556wM115208c.getAppNotificationType(), "AI_COACH");
                }
                c27347cM115261a = viewState.getAiChatEntryPointItem();
                if (c27347cM115261a != null) {
                    c27347cM82506b = C27347c.m82506b(c27347cM115261a, null, null, null, null, null, null, null, null, zM65745e, null, 767, null);
                } else {
                    c27347cM82506b = null;
                }
                boolean zM97466o = m97466o(interfaceC28601c1);
                boolean zM97468q = m97468q(interfaceC28601c4);
                c22174dM115265f = viewState.getReplayViewState();
                if (c22174dM115265f == null) {
                    c28655q2.m87150e0(-1955576082);
                    c28655q2.m87173q(z19);
                } else {
                    c28655q2.m87150e0(-1725651085);
                    if (viewState.getAiChatEntryPointItem() == null) {
                        z24 = true;
                    } else {
                        z24 = z19;
                    }
                    boolean zM97468q2 = m97468q(interfaceC28601c4);
                    zM87157i4 = c28655q2.m87157i(abstractC23864c2);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i4 || objM87133R10 == c28676v0) {
                        objM87133R10 = new C26954j0(abstractC23864c2, interfaceC28601c1, interfaceC28601c4, 27);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    c22174dM63477d = C22174d.m63477d(c22174dM115265f, null, null, z24, zM97468q2, (Function1) objM87133R10, 3, null);
                    c28655q2.m87173q(z19);
                }
                if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q2.m87157i(viewState))) {
                    z25 = true;
                } else {
                    z25 = z19;
                }
                interfaceC28601c5 = interfaceC28601c3;
                boolean zM87153g2 = c28655q2.m87153g(interfaceC28601c5) | z25;
                if ((i15 & 896) == 256) {
                    z26 = true;
                } else {
                    z26 = z19;
                }
                z27 = zM87153g2 | z26;
                objM87133R11 = c28655q2.m87133R();
                if (!z27 || objM87133R11 == c28676v0) {
                    function3 = function4;
                    objM87133R11 = new C31324k(viewState, function3, interfaceC28601c5, 1);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    function3 = function4;
                }
                C28655q c28655q5 = c28655q2;
                AbstractC35084b.m110939c(c27347cM82506b, zM97466o, zM97468q, c22174dM63477d, (InterfaceC4339a) objM87133R11, c28655q5, C27347c.f109538k | (C22174d.f85992f << 9));
                c28655q = c28655q5;
                c28655q.m87173q(true);
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3226h(viewState, z4, function3, i13, i14, 28);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q3.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R14 = c28655q3.m87133R();
                if (objM87133R14 == c28676v0) {
                    objM87133R14 = new C31593g(1);
                    c28655q3.m87172p0(objM87133R14);
                }
                function4 = (Function1) objM87133R14;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q3.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.valueOf(viewState.getShouldShowReplayDefaultState()));
                c28655q3.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q3.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q3.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            abstractC36203gM115263c = viewState.getNotificationsCenterViewState();
            if (abstractC36203gM115263c == null) {
                abstractC36203gM115263c = AbstractC36203g.b.f155006b;
            }
            i16 = AbstractC36203g.f155003a;
            c28655q3.m87150e0(1371609227);
            c22174dM63477d = null;
            if (C38072d.f163053a.m121950c(c28655q3, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q3.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q3);
                if (interfaceC1583f2M73844a == null) {
                    c28655q3.m87150e0(-707931115);
                    c28655q3.m87173q(false);
                    obj = null;
                    abstractC23864c = null;
                    obj2 = null;
                } else {
                    c28655q3.m87150e0(-707931114);
                    Context applicationContext3 = ((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext3;
                    if (((i16 & 112) ^ 48) <= 32) {
                    }
                    if ((i16 & 48) == 32) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = ((((i16 & 14) ^ 6) <= 4 && c28655q3.m87153g(abstractC36203gM115263c)) || (i16 & 6) == 4) | z28 | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q3.m87153g(null)) || (i16 & 3072) == 2048);
                    objM87133R12 = c28655q3.m87133R();
                    if (z29) {
                        objM87133R12 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32774b.class), null, new C23863b(abstractC36203gM115263c), null);
                        obj = null;
                        obj2 = null;
                        c28655q3.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32774b.class), null, new C23863b(abstractC36203gM115263c), null);
                        obj = null;
                        obj2 = null;
                        c28655q3.m87172p0(objM87133R12);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R12;
                    c28655q3.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q3.m87150e0(-707430526);
                    z35 = ((((i16 & 112) ^ 48) <= 32 && c28655q3.m87153g(obj2)) || (i16 & 48) == 32) | ((((i16 & 14) ^ 6) <= 4 && c28655q3.m87153g(abstractC36203gM115263c)) || (i16 & 6) == 4) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q3.m87153g(obj)) || (i16 & 3072) == 2048);
                    objM87133R13 = c28655q3.m87133R();
                    if (z35) {
                        objM87133R13 = new C23863b(abstractC36203gM115263c);
                        c28655q3.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C23863b(abstractC36203gM115263c);
                        c28655q3.m87172p0(objM87133R13);
                    }
                    abstractC23864c = (C23863b) objM87133R13;
                    z34 = false;
                    c28655q3.m87173q(false);
                } else {
                    z34 = false;
                    c28655q3.m87150e0(-438479417);
                    c28655q3.m87173q(false);
                }
                c28655q3.m87173q(z34);
                c28655q3.m87173q(z34);
                abstractC36203g = abstractC36203gM115263c;
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q3, -707312137, false, c28655q3);
                applicationContext = ((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                if (((i16 & 112) ^ 48) <= 32) {
                }
                z14 = ((((i16 & 14) ^ 6) <= 4 && c28655q3.m87153g(abstractC36203gM115263c)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) <= 32 && c28655q3.m87153g(null)) || (i16 & 48) == 32) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q3.m87153g(null)) || (i16 & 3072) == 2048);
                objM87133R3 = c28655q3.m87133R();
                if (z14) {
                    abstractC36203g = abstractC36203gM115263c;
                    objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, abstractC36203g, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32774b.class), null, null);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    abstractC36203g = abstractC36203gM115263c;
                    objM87133R3 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, abstractC36203g, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C32774b.class), null, null);
                    c28655q3.m87172p0(objM87133R3);
                }
                abstractC23864c = (AbstractC23864c) objM87133R3;
                c28655q3.m87173q(false);
            }
            abstractC23864c2 = abstractC23864c;
            if (abstractC23864c2 instanceof C32774b) {
                c32774b = (C32774b) abstractC23864c2;
            } else {
                c32774b = null;
            }
            if (c32774b != null) {
                viewState2 = c32774b.getViewState();
            } else {
                viewState2 = null;
            }
            if (viewState2 == null) {
                c28655q3.m87150e0(1391932851);
                z15 = false;
                c28655q3.m87173q(false);
                interfaceC28601c1M87261o = null;
            } else {
                z15 = false;
                c28655q3.m87150e0(-1756214258);
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewState2, c28655q3, 0);
                c28655q3.m87173q(false);
            }
            if (interfaceC28601c1M87261o == null) {
                c28655q3.m87150e0(-1756212390);
                c28655q2 = c28655q3;
                i17 = i16;
                interfaceC28601c1M87261o = AbstractC28683x.m87260n(abstractC23864c2.getViewState(), abstractC36203g, null, c28655q2, i16 << 3, 2);
            } else {
                i17 = i16;
                c28655q2 = c28655q3;
                c28655q2.m87150e0(-1756216637);
            }
            c28655q2.m87173q(z15);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(((float) 1.5d) * 8), C2299e.f9110M, c28655q2, 6);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, C2314t.f9131w);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
            if (viewState.getNotificationsCenterViewState() == null) {
                c28655q2.m87150e0(-1958633085);
                c28655q2.m87173q(false);
                interfaceC28601c3 = interfaceC28601c1M87261o;
                z19 = false;
                interfaceC28601c4 = interfaceC28601c2;
            } else {
                c28655q2.m87150e0(-1958633084);
                AbstractC36203g abstractC36203gM97470s3 = m97470s(interfaceC28601c1M87261o);
                if (viewState.getAiChatEntryPointItem() != null) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i = c28655q2.m87157i(abstractC23864c2);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R4 = new C16825r(abstractC23864c2, 3);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C16825r(abstractC23864c2, 3);
                    c28655q2.m87172p0(objM87133R4);
                }
                InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R4;
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C1024j(9, interfaceC28601c1, interfaceC28601c2);
                    c28655q2.m87172p0(objM87133R5);
                }
                Function1 function7 = (Function1) objM87133R5;
                zM87157i2 = c28655q2.m87157i(abstractC23864c2);
                objM87133R6 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R6 = new C30856a(abstractC23864c2, 4);
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C30856a(abstractC23864c2, 4);
                    c28655q2.m87172p0(objM87133R6);
                }
                InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) objM87133R6;
                boolean zM87153g3 = c28655q2.m87153g(interfaceC28601c1M87261o) | c28655q2.m87157i(abstractC23864c2);
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87153g3 | z17;
                objM87133R7 = c28655q2.m87133R();
                if (z18) {
                    objM87133R7 = new C20911u0(function4, abstractC23864c2, interfaceC28601c1M87261o, 1);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C20911u0(function4, abstractC23864c2, interfaceC28601c1M87261o, 1);
                    c28655q2.m87172p0(objM87133R7);
                }
                Function1 function8 = (Function1) objM87133R7;
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C27325i(19, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R8);
                }
                InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                zM87157i3 = c28655q2.m87157i(abstractC23864c2);
                objM87133R9 = c28655q2.m87133R();
                if (zM87157i3) {
                    objM87133R9 = new C2776b(abstractC23864c2, 4);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C2776b(abstractC23864c2, 4);
                    c28655q2.m87172p0(objM87133R9);
                }
                interfaceC28601c3 = interfaceC28601c1M87261o;
                interfaceC28601c4 = interfaceC28601c2;
                C28655q c28655q6 = c28655q2;
                z19 = false;
                AbstractC31600n.m97542h(null, abstractC36203gM97470s3, z16, z4, interfaceC4339a3, function7, interfaceC4351m2, function8, interfaceC4339a4, (Function1) objM87133R9, c28655q6, ((i15 << 6) & 7168) | (i17 << 3) | 100859904, 1);
                c28655q2 = c28655q6;
                c28655q2.m87173q(false);
            }
            abstractC36203gM97470s = m97470s(interfaceC28601c3);
            if (abstractC36203gM97470s instanceof AbstractC36203g.c) {
                cVar = (AbstractC36203g.c) abstractC36203gM97470s;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                zM65745e = z19;
            } else {
                zM65745e = z19;
            }
            c27347cM115261a = viewState.getAiChatEntryPointItem();
            if (c27347cM115261a != null) {
                c27347cM82506b = C27347c.m82506b(c27347cM115261a, null, null, null, null, null, null, null, null, zM65745e, null, 767, null);
            } else {
                c27347cM82506b = null;
            }
            boolean zM97466o2 = m97466o(interfaceC28601c1);
            boolean zM97468q3 = m97468q(interfaceC28601c4);
            c22174dM115265f = viewState.getReplayViewState();
            if (c22174dM115265f == null) {
                c28655q2.m87150e0(-1955576082);
                c28655q2.m87173q(z19);
            } else {
                c28655q2.m87150e0(-1725651085);
                if (viewState.getAiChatEntryPointItem() == null) {
                    z24 = true;
                } else {
                    z24 = z19;
                }
                boolean zM97468q4 = m97468q(interfaceC28601c4);
                zM87157i4 = c28655q2.m87157i(abstractC23864c2);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i4) {
                    objM87133R10 = new C26954j0(abstractC23864c2, interfaceC28601c1, interfaceC28601c4, 27);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C26954j0(abstractC23864c2, interfaceC28601c1, interfaceC28601c4, 27);
                    c28655q2.m87172p0(objM87133R10);
                }
                c22174dM63477d = C22174d.m63477d(c22174dM115265f, null, null, z24, zM97468q4, (Function1) objM87133R10, 3, null);
                c28655q2.m87173q(z19);
            }
            if ((i15 & 14) != 4) {
                z25 = true;
            } else {
                z25 = true;
            }
            interfaceC28601c5 = interfaceC28601c3;
            boolean zM87153g4 = c28655q2.m87153g(interfaceC28601c5) | z25;
            if ((i15 & 896) == 256) {
                z26 = true;
            } else {
                z26 = z19;
            }
            z27 = zM87153g4 | z26;
            objM87133R11 = c28655q2.m87133R();
            if (z27) {
                function3 = function4;
                objM87133R11 = new C31324k(viewState, function3, interfaceC28601c5, 1);
                c28655q2.m87172p0(objM87133R11);
            } else {
                function3 = function4;
                objM87133R11 = new C31324k(viewState, function3, interfaceC28601c5, 1);
                c28655q2.m87172p0(objM87133R11);
            }
            C28655q c28655q7 = c28655q2;
            AbstractC35084b.m110939c(c27347cM82506b, zM97466o2, zM97468q3, c22174dM63477d, (InterfaceC4339a) objM87133R11, c28655q7, C27347c.f109538k | (C22174d.f85992f << 9));
            c28655q = c28655q7;
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3226h(viewState, z4, function3, i13, i14, 28);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m97465n(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final boolean m97466o(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: p */
    private static final void m97467p(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: q */
    private static final boolean m97468q(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: r */
    private static final void m97469r(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: s */
    private static final AbstractC36203g m97470s(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC36203g) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m97471t(AbstractC23864c abstractC23864c) {
        abstractC23864c.mo1216g(AbstractC32773a.g.f136325a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m97472u(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, boolean z4) {
        m97467p(interfaceC28601c1, true);
        m97469r(interfaceC28601c2, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m97473v(AbstractC23864c abstractC23864c, String id4, EnumC36197a dismissCardAction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(dismissCardAction, "dismissCardAction");
        abstractC23864c.mo1216g(new AbstractC32773a.f(id4, dismissCardAction, null, 4, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m97474w(Function1 function1, AbstractC23864c abstractC23864c, InterfaceC28670t2 interfaceC28670t2, Object event) {
        InterfaceC16556w interfaceC16556wM115208c;
        InterfaceC16556w interfaceC16556wM115208c2;
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof EnumC22400l) {
            AbstractC36203g abstractC36203gM97470s = m97470s(interfaceC28670t2);
            AbstractC36203g.c cVar = abstractC36203gM97470s instanceof AbstractC36203g.c ? (AbstractC36203g.c) abstractC36203gM97470s : null;
            if (cVar != null && (interfaceC16556wM115208c2 = cVar.getCardToDisplay()) != null) {
                abstractC23864c.mo1216g(new AbstractC32773a.d(interfaceC16556wM115208c2.getId()));
            }
            if (event == EnumC22400l.TURN_OFF_ALARM) {
                AbstractC36203g abstractC36203gM97470s2 = m97470s(interfaceC28670t2);
                AbstractC36203g.c cVar2 = abstractC36203gM97470s2 instanceof AbstractC36203g.c ? (AbstractC36203g.c) abstractC36203gM97470s2 : null;
                if (cVar2 != null && (interfaceC16556wM115208c = cVar2.getCardToDisplay()) != null) {
                    function1.invoke(new AbstractC35087e.a((EnumC22400l) event, interfaceC16556wM115208c.getId()));
                }
            } else {
                function1.invoke(event);
            }
        } else if (event instanceof C16551r) {
            abstractC23864c.mo1216g(new AbstractC32773a.a((C16551r) event));
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m97475x(InterfaceC28601c1 interfaceC28601c1) {
        m97467p(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m97476y(AbstractC23864c abstractC23864c, EnumC36205i notificationCardDismissAnimation) {
        AbstractC22676k.m65750j(notificationCardDismissAnimation, "notificationCardDismissAnimation");
        abstractC23864c.mo1216g(new AbstractC32773a.b(notificationCardDismissAnimation));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m97477z(AbstractC23864c abstractC23864c, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Object action) {
        AbstractC22676k.m65750j(action, "action");
        if (action == EnumC22171a.REPLAY) {
            m97467p(interfaceC28601c1, false);
            m97469r(interfaceC28601c2, true);
            abstractC23864c.mo1216g(new AbstractC32773a.h(null, 1, 0 == true ? 1 : 0));
        }
        return C23454a0.f92919a;
    }
}
