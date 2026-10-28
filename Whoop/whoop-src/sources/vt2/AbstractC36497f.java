package vt2;

import am2.C1025j0;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c41.C4105r1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.bot.settings.C6075e;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.WeeklyPlanEditScreenModel;
import com.whoop.weeklyplan.weeklyplan.navigation.WeeklyPlanNavHostDestination;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import java.util.List;
import kd1.C22389c0;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import ls2.AbstractC24716a;
import ls2.C24717b;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26949h;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p077d0.C11393q0;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p40.C28827b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p721n22.C26196a;
import s90.C32290f;
import sc0.C32355c;
import um0.C35076b;
import uo1.C35141b;
import vl0.C36100c;
import vs2.C36478d;
import wt2.AbstractC37625f;
import wt2.AbstractC37634o;
import wt2.AbstractC37636q;
import wt2.C37635p;
import yt2.AbstractC39772c;
import yt2.AbstractC39782m;

/* JADX INFO: renamed from: vt2.f */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001au\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b²\u0006\u000e\u0010\u001a\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lwt2/p;", "viewModel", "Lvt2/h;", "navigationRouter", "Leb/u0;", "navController", "Lwt2/q;", "viewState", "Lls2/b;", "analytics", "", "navigateToPresets", "", "scrollId", "isWrapped", "Lcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;", "startDestination", "Lkotlin/Function1;", "Ll83/a0;", "navigatedToPresetViaDeepLinkCallBack", "v", "(Lwt2/p;Lvt2/h;Leb/u0;Lwt2/q;Lls2/b;ZLjava/lang/String;ZLcom/whoop/weeklyplan/weeklyplan/navigation/WeeklyPlanNavHostDestination;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "content", "r", "(Lc93/m;Landroidx/compose/runtime/Composer;I)V", "showPresetsLandingCallback", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36497f {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m116955A(final AbstractC37636q abstractC37636q, final String str, final boolean z4, final C37635p c37635p, final C24717b c24717b, final C36499h c36499h, final InterfaceC28601c1 interfaceC28601c1, final Function1 function1, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, "OVERVIEW", null, new C37816b(new Function3() { // from class: vt2.e
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC36497f.m116956B(abstractC37636q, str, z4, c37635p, c24717b, c36499h, interfaceC28601c1, function1, (C12982q) obj, (Composer) obj2, iIntValue);
            }
        }, true, -1121627359), 6);
        AbstractC12889b.m36291u(NavHost, "PRESETS", null, new C37816b(new C26949h(abstractC37636q, c36499h, c37635p, 23), true, 987682122), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m116956B(AbstractC37636q abstractC37636q, String str, boolean z4, C37635p c37635p, C24717b c24717b, C36499h c36499h, InterfaceC28601c1 interfaceC28601c1, Function1 function1, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        boolean zM87157i = c28655q.m87157i(c37635p) | c28655q.m87157i(c24717b) | c28655q.m87157i(c36499h);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = new C32290f(c37635p, c24717b, c36499h, 25);
            c28655q.m87172p0(objM87133R);
        }
        Function1 function2 = (Function1) objM87133R;
        boolean zM87157i2 = c28655q.m87157i(c36499h);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = new C36495d(c36499h, 1);
            c28655q.m87172p0(objM87133R2);
        }
        Function1 function3 = (Function1) objM87133R2;
        boolean zM87157i3 = c28655q.m87157i(c24717b);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C35141b(c24717b, 14);
            c28655q.m87172p0(objM87133R3);
        }
        Function1 function4 = (Function1) objM87133R3;
        boolean zM116991y = m116991y(interfaceC28601c1);
        boolean zM87153g = c28655q.m87153g(interfaceC28601c1) | c28655q.m87153g(function1);
        Object objM87133R4 = c28655q.m87133R();
        if (zM87153g || objM87133R4 == c28676v0) {
            objM87133R4 = new C28827b(function1, interfaceC28601c1, 14);
            c28655q.m87172p0(objM87133R4);
        }
        AbstractC39782m.m127481y(abstractC37636q, str, z4, function2, function3, function4, zM116991y, (Function1) objM87133R4, c28655q, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m116957C(C37635p c37635p, C24717b c24717b, C36499h c36499h, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if ((it instanceof AbstractC37634o.c) || (it instanceof AbstractC37634o.b) || (it instanceof AbstractC37634o.a)) {
            c37635p.m120952r((AbstractC37634o) it);
        } else if (it instanceof C9598e) {
            C9598e c9598e = (C9598e) it;
            if (c9598e.getParameters() instanceof WeeklyPlanEditScreenModel) {
                NavigationScreenModel parameters = c9598e.getParameters();
                WeeklyPlanEditScreenModel weeklyPlanEditScreenModel = parameters instanceof WeeklyPlanEditScreenModel ? (WeeklyPlanEditScreenModel) parameters : null;
                List<String> planEditScreens = weeklyPlanEditScreenModel != null ? weeklyPlanEditScreenModel.getPlanEditScreens() : null;
                if (planEditScreens == null || planEditScreens.size() != 1) {
                    c24717b.m72377q(AbstractC24716a.b.f96658a);
                } else {
                    c24717b.m72377q(new AbstractC24716a.g(planEditScreens.get(0)));
                }
            }
            c36499h.m116997b(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m116958D(C36499h c36499h, AbstractC36498g it) {
        AbstractC22676k.m65750j(it, "it");
        c36499h.m116997b(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m116959E(C24717b c24717b, AbstractC24716a it) {
        AbstractC22676k.m65750j(it, "it");
        c24717b.m72377q(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m116960F(Function1 function1, InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m116992z(interfaceC28601c1, z4);
        function1.invoke(Boolean.valueOf(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m116961G(AbstractC37636q abstractC37636q, C36499h c36499h, C37635p c37635p, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        m116984r(AbstractC37817c.m121344e(6287905, composer, new C36100c(abstractC37636q, c36499h, c37635p, 2)), composer, 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m116962H(AbstractC37636q abstractC37636q, C36499h c36499h, C37635p c37635p, Composer composer, int i13) {
        AbstractC37625f abstractC37625fM120956c;
        String strM120955b;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean z4 = abstractC37636q instanceof AbstractC37636q.c;
            AbstractC37636q.c cVar = z4 ? (AbstractC37636q.c) abstractC37636q : null;
            if (cVar == null || (abstractC37625fM120956c = cVar.getPresets()) == null) {
                abstractC37625fM120956c = AbstractC37625f.e.f161006a;
            }
            AbstractC37625f abstractC37625f = abstractC37625fM120956c;
            AbstractC37636q.c cVar2 = z4 ? (AbstractC37636q.c) abstractC37636q : null;
            if (cVar2 == null || (strM120955b = cVar2.getPlanState()) == null) {
                strM120955b = "";
            }
            String str = strM120955b;
            boolean zM87157i = c28655q.m87157i(c36499h) | c28655q.m87157i(c37635p);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C35076b(13, c36499h, c37635p);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(c36499h);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C32355c(c36499h, 29);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(c36499h);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C36495d(c36499h, 0);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC39772c.m127347t(abstractC37625f, str, function1, interfaceC4339a, (Function1) objM87133R3, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m116963I(C36499h c36499h, C37635p c37635p, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof C9598e) {
            c36499h.m116997b(it);
        } else if ((it instanceof AbstractC37634o.a) || (it instanceof AbstractC37634o.c)) {
            c37635p.m120952r((AbstractC37634o) it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m116964J(C36499h c36499h) {
        c36499h.m116997b(AbstractC36498g.e.f155929a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m116965K(C36499h c36499h, AbstractC36498g it) {
        AbstractC22676k.m65750j(it, "it");
        c36499h.m116997b(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m116966L(C37635p c37635p, C36499h c36499h, C12991u0 c12991u0, AbstractC37636q abstractC37636q, C24717b c24717b, boolean z4, String str, boolean z13, WeeklyPlanNavHostDestination weeklyPlanNavHostDestination, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m116988v(c37635p, c36499h, c12991u0, abstractC37636q, c24717b, z4, str, z13, weeklyPlanNavHostDestination, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m116984r(InterfaceC4351m content, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(content, "content");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(482775170);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(content) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C11393q0 c11393q0 = new C11393q0(Boolean.FALSE);
            c11393q0.m30628I0(Boolean.TRUE);
            C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(300, 0, null, 6);
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = new C36478d(2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC1090b.m3347b(c11393q0, C2314t.f9131w, AbstractC3788w0.m11585m(c11347e2M30574v, (Function1) objM87133R), null, null, AbstractC37817c.m121344e(1049092442, c28655q, new C22389c0(5, content)), c28655q, 196656, 24);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26196a(content, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final int m116985s(int i13) {
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m116986t(InterfaceC4351m interfaceC4351m, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        interfaceC4351m.invoke(composer, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m116987u(InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m116984r(interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0141 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x0143  */
    /* JADX WARN: Code duplicated, block: B:104:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x0148  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0151  */
    /* JADX WARN: Code duplicated, block: B:111:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x015b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0161  */
    /* JADX WARN: Code duplicated, block: B:118:0x016e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0179  */
    /* JADX WARN: Code duplicated, block: B:122:0x017c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x0185  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:137:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:142:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:151:0x021d  */
    /* JADX WARN: Code duplicated, block: B:154:0x022e  */
    /* JADX WARN: Code duplicated, block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Code duplicated, block: B:89:0x0112  */
    /* JADX WARN: Code duplicated, block: B:91:0x0118  */
    /* JADX WARN: Code duplicated, block: B:93:0x011e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0121  */
    /* JADX WARN: Code duplicated, block: B:98:0x0135  */
    /* JADX WARN: Code duplicated, block: B:99:0x0138  */
    /* JADX INFO: renamed from: v */
    public static final void m116988v(C37635p viewModel, C36499h navigationRouter, C12991u0 navController, AbstractC37636q viewState, C24717b analytics, boolean z4, String str, boolean z13, WeeklyPlanNavHostDestination weeklyPlanNavHostDestination, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        boolean z14;
        int i16;
        String str2;
        int i17;
        int i18;
        boolean z15;
        int i19;
        int i24;
        int iOrdinal;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        boolean z16;
        C28655q c28655q;
        WeeklyPlanNavHostDestination weeklyPlanNavHostDestination2;
        Function1 function2;
        boolean z17;
        String str3;
        boolean z18;
        C28677v1 c28677v1M87180u;
        boolean z19;
        WeeklyPlanNavHostDestination weeklyPlanNavHostDestination3;
        C28676v0 c28676v0;
        Function1 function3;
        boolean z24;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean zM87157i;
        Object c6075e;
        String str4;
        Object objM87133R2;
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(navigationRouter, "navigationRouter");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(analytics, "analytics");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1011693830);
        if ((i13 & 6) == 0) {
            i15 = (c28655q2.m87157i(viewModel) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87157i(navigationRouter) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(navController) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(viewState) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87157i(analytics) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i34 = i14 & 32;
        if (i34 == 0) {
            if ((196608 & i13) == 0) {
                z14 = z4;
                i15 |= c28655q2.m87155h(z14) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i16 = i14 & 64;
            if (i16 != 0) {
                if ((1572864 & i13) == 0) {
                    str2 = str;
                    if (c28655q2.m87153g(str2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 128;
                if (i18 != 0) {
                    i15 |= 12582912;
                    z15 = z13;
                } else {
                    z15 = z13;
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87155h(z15)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                        i15 |= i19;
                    }
                }
                i24 = i14 & 256;
                if (i24 != 0) {
                    i15 |= 100663296;
                } else if ((i13 & 100663296) != 0) {
                    if (weeklyPlanNavHostDestination == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = weeklyPlanNavHostDestination.ordinal();
                    }
                    int i35 = i15;
                    if (c28655q2.m87149e(iOrdinal)) {
                        i25 = 67108864;
                    } else {
                        i25 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i15 = i35 | i25;
                }
                i26 = i15;
                i27 = i14 & 512;
                if (i27 != 0) {
                    i26 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i26 |= i28;
                }
                i29 = i26;
                if ((i29 & 306783379) != 306783378) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q2.m87135U(i29 & 1, z16)) {
                    if (i34 != 0) {
                        z19 = false;
                    } else {
                        z19 = z14;
                    }
                    if (i16 != 0) {
                        str2 = "";
                    }
                    if (i18 != 0) {
                        z15 = true;
                    }
                    if (i24 != 0) {
                        weeklyPlanNavHostDestination3 = WeeklyPlanNavHostDestination.OVERVIEW;
                    } else {
                        weeklyPlanNavHostDestination3 = weeklyPlanNavHostDestination;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i27 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C36478d(1);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function3 = (Function1) objM87133R2;
                    } else {
                        function3 = function1;
                    }
                    Object[] objArr = new Object[0];
                    if ((458752 & i29) == 131072) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (z24 || objM87133R == c28676v0) {
                        objM87133R = new C4105r1(z19, 3);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q2, 0);
                    String strName = weeklyPlanNavHostDestination3.name();
                    boolean z28 = z19;
                    if ((i29 & 7168) == 2048) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    boolean z29 = z25;
                    if ((3670016 & i29) == 1048576) {
                        z26 = true;
                    } else {
                        z26 = false;
                    }
                    boolean z34 = z29 | z26;
                    if ((29360128 & i29) == 8388608) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87157i = z34 | z27 | c28655q2.m87157i(viewModel) | c28655q2.m87157i(analytics) | c28655q2.m87157i(navigationRouter) | c28655q2.m87153g(interfaceC28601c1) | ((1879048192 & i29) == 536870912);
                    Object objM87133R3 = c28655q2.m87133R();
                    if (!zM87157i || objM87133R3 == c28676v0) {
                        str4 = str2;
                        c6075e = new C6075e(viewState, str4, z15, viewModel, analytics, navigationRouter, interfaceC28601c1, function3);
                        c28655q2.m87172p0(c6075e);
                    } else {
                        c6075e = objM87133R3;
                        str4 = str2;
                    }
                    AbstractC17269i.m48888e(navController, strName, null, (Function1) c6075e, c28655q2, (i29 >> 6) & 14);
                    c28655q = c28655q2;
                    str3 = str4;
                    function2 = function3;
                    weeklyPlanNavHostDestination2 = weeklyPlanNavHostDestination3;
                    z17 = z28;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    weeklyPlanNavHostDestination2 = weeklyPlanNavHostDestination;
                    function2 = function1;
                    z17 = z14;
                    str3 = str2;
                }
                z18 = z15;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C1025j0(viewModel, navigationRouter, navController, viewState, analytics, z17, str3, z18, weeklyPlanNavHostDestination2, function2, i13, i14);
                }
            }
            i15 |= 1572864;
            str2 = str;
            i18 = i14 & 128;
            if (i18 != 0) {
                i15 |= 12582912;
                z15 = z13;
            } else {
                z15 = z13;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i15 |= i19;
                }
            }
            i24 = i14 & 256;
            if (i24 != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) != 0) {
                if (weeklyPlanNavHostDestination == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = weeklyPlanNavHostDestination.ordinal();
                }
                int i36 = i15;
                if (c28655q2.m87149e(iOrdinal)) {
                    i25 = 67108864;
                } else {
                    i25 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 = i36 | i25;
            }
            i26 = i15;
            i27 = i14 & 512;
            if (i27 != 0) {
                i26 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i26 |= i28;
            }
            i29 = i26;
            if ((i29 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q2.m87135U(i29 & 1, z16)) {
                if (i34 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    str2 = "";
                }
                if (i18 != 0) {
                    z15 = true;
                }
                if (i24 != 0) {
                    weeklyPlanNavHostDestination3 = WeeklyPlanNavHostDestination.OVERVIEW;
                } else {
                    weeklyPlanNavHostDestination3 = weeklyPlanNavHostDestination;
                }
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36478d(1);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function1;
                }
                Object[] objArr2 = new Object[0];
                if ((458752 & i29) == 131072) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z24) {
                    objM87133R = new C4105r1(z19, 3);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C4105r1(z19, 3);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R, c28655q2, 0);
                String strName2 = weeklyPlanNavHostDestination3.name();
                boolean z210 = z19;
                if ((i29 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z211 = z25;
                if ((3670016 & i29) == 1048576) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z35 = z211 | z26;
                if ((29360128 & i29) == 8388608) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zM87157i = z35 | z27 | c28655q2.m87157i(viewModel) | c28655q2.m87157i(analytics) | c28655q2.m87157i(navigationRouter) | c28655q2.m87153g(interfaceC28601c1) | ((1879048192 & i29) == 536870912);
                Object objM87133R4 = c28655q2.m87133R();
                if (zM87157i) {
                    str4 = str2;
                    c6075e = new C6075e(viewState, str4, z15, viewModel, analytics, navigationRouter, interfaceC28601c1, function3);
                    c28655q2.m87172p0(c6075e);
                } else {
                    str4 = str2;
                    c6075e = new C6075e(viewState, str4, z15, viewModel, analytics, navigationRouter, interfaceC28601c1, function3);
                    c28655q2.m87172p0(c6075e);
                }
                AbstractC17269i.m48888e(navController, strName2, null, (Function1) c6075e, c28655q2, (i29 >> 6) & 14);
                c28655q = c28655q2;
                str3 = str4;
                function2 = function3;
                weeklyPlanNavHostDestination2 = weeklyPlanNavHostDestination3;
                z17 = z210;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                weeklyPlanNavHostDestination2 = weeklyPlanNavHostDestination;
                function2 = function1;
                z17 = z14;
                str3 = str2;
            }
            z18 = z15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C1025j0(viewModel, navigationRouter, navController, viewState, analytics, z17, str3, z18, weeklyPlanNavHostDestination2, function2, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z14 = z4;
        i16 = i14 & 64;
        if (i16 != 0) {
            if ((1572864 & i13) == 0) {
                str2 = str;
                if (c28655q2.m87153g(str2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i15 |= i17;
            }
            i18 = i14 & 128;
            if (i18 != 0) {
                i15 |= 12582912;
                z15 = z13;
            } else {
                z15 = z13;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87155h(z15)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i15 |= i19;
                }
            }
            i24 = i14 & 256;
            if (i24 != 0) {
                i15 |= 100663296;
            } else if ((i13 & 100663296) != 0) {
                if (weeklyPlanNavHostDestination == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = weeklyPlanNavHostDestination.ordinal();
                }
                int i37 = i15;
                if (c28655q2.m87149e(iOrdinal)) {
                    i25 = 67108864;
                } else {
                    i25 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i15 = i37 | i25;
            }
            i26 = i15;
            i27 = i14 & 512;
            if (i27 != 0) {
                i26 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i26 |= i28;
            }
            i29 = i26;
            if ((i29 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q2.m87135U(i29 & 1, z16)) {
                if (i34 != 0) {
                    z19 = false;
                } else {
                    z19 = z14;
                }
                if (i16 != 0) {
                    str2 = "";
                }
                if (i18 != 0) {
                    z15 = true;
                }
                if (i24 != 0) {
                    weeklyPlanNavHostDestination3 = WeeklyPlanNavHostDestination.OVERVIEW;
                } else {
                    weeklyPlanNavHostDestination3 = weeklyPlanNavHostDestination;
                }
                c28676v0 = C28635l.f115821a;
                if (i27 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C36478d(1);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function3 = (Function1) objM87133R2;
                } else {
                    function3 = function1;
                }
                Object[] objArr3 = new Object[0];
                if ((458752 & i29) == 131072) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R = c28655q2.m87133R();
                if (z24) {
                    objM87133R = new C4105r1(z19, 3);
                    c28655q2.m87172p0(objM87133R);
                } else {
                    objM87133R = new C4105r1(z19, 3);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr3, (InterfaceC4339a) objM87133R, c28655q2, 0);
                String strName3 = weeklyPlanNavHostDestination3.name();
                boolean z212 = z19;
                if ((i29 & 7168) == 2048) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                boolean z213 = z25;
                if ((3670016 & i29) == 1048576) {
                    z26 = true;
                } else {
                    z26 = false;
                }
                boolean z36 = z213 | z26;
                if ((29360128 & i29) == 8388608) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zM87157i = z36 | z27 | c28655q2.m87157i(viewModel) | c28655q2.m87157i(analytics) | c28655q2.m87157i(navigationRouter) | c28655q2.m87153g(interfaceC28601c1) | ((1879048192 & i29) == 536870912);
                Object objM87133R5 = c28655q2.m87133R();
                if (zM87157i) {
                    str4 = str2;
                    c6075e = new C6075e(viewState, str4, z15, viewModel, analytics, navigationRouter, interfaceC28601c1, function3);
                    c28655q2.m87172p0(c6075e);
                } else {
                    str4 = str2;
                    c6075e = new C6075e(viewState, str4, z15, viewModel, analytics, navigationRouter, interfaceC28601c1, function3);
                    c28655q2.m87172p0(c6075e);
                }
                AbstractC17269i.m48888e(navController, strName3, null, (Function1) c6075e, c28655q2, (i29 >> 6) & 14);
                c28655q = c28655q2;
                str3 = str4;
                function2 = function3;
                weeklyPlanNavHostDestination2 = weeklyPlanNavHostDestination3;
                z17 = z212;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                weeklyPlanNavHostDestination2 = weeklyPlanNavHostDestination;
                function2 = function1;
                z17 = z14;
                str3 = str2;
            }
            z18 = z15;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C1025j0(viewModel, navigationRouter, navController, viewState, analytics, z17, str3, z18, weeklyPlanNavHostDestination2, function2, i13, i14);
            }
        }
        i15 |= 1572864;
        str2 = str;
        i18 = i14 & 128;
        if (i18 != 0) {
            i15 |= 12582912;
            z15 = z13;
        } else {
            z15 = z13;
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87155h(z15)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i15 |= i19;
            }
        }
        i24 = i14 & 256;
        if (i24 != 0) {
            i15 |= 100663296;
        } else if ((i13 & 100663296) != 0) {
            if (weeklyPlanNavHostDestination == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = weeklyPlanNavHostDestination.ordinal();
            }
            int i38 = i15;
            if (c28655q2.m87149e(iOrdinal)) {
                i25 = 67108864;
            } else {
                i25 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i15 = i38 | i25;
        }
        i26 = i15;
        i27 = i14 & 512;
        if (i27 != 0) {
            i26 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (c28655q2.m87157i(function1)) {
                i28 = 536870912;
            } else {
                i28 = 268435456;
            }
            i26 |= i28;
        }
        i29 = i26;
        if ((i29 & 306783379) != 306783378) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q2.m87135U(i29 & 1, z16)) {
            if (i34 != 0) {
                z19 = false;
            } else {
                z19 = z14;
            }
            if (i16 != 0) {
                str2 = "";
            }
            if (i18 != 0) {
                z15 = true;
            }
            if (i24 != 0) {
                weeklyPlanNavHostDestination3 = WeeklyPlanNavHostDestination.OVERVIEW;
            } else {
                weeklyPlanNavHostDestination3 = weeklyPlanNavHostDestination;
            }
            c28676v0 = C28635l.f115821a;
            if (i27 != 0) {
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C36478d(1);
                    c28655q2.m87172p0(objM87133R2);
                }
                function3 = (Function1) objM87133R2;
            } else {
                function3 = function1;
            }
            Object[] objArr4 = new Object[0];
            if ((458752 & i29) == 131072) {
                z24 = true;
            } else {
                z24 = false;
            }
            objM87133R = c28655q2.m87133R();
            if (z24) {
                objM87133R = new C4105r1(z19, 3);
                c28655q2.m87172p0(objM87133R);
            } else {
                objM87133R = new C4105r1(z19, 3);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr4, (InterfaceC4339a) objM87133R, c28655q2, 0);
            String strName4 = weeklyPlanNavHostDestination3.name();
            boolean z214 = z19;
            if ((i29 & 7168) == 2048) {
                z25 = true;
            } else {
                z25 = false;
            }
            boolean z215 = z25;
            if ((3670016 & i29) == 1048576) {
                z26 = true;
            } else {
                z26 = false;
            }
            boolean z37 = z215 | z26;
            if ((29360128 & i29) == 8388608) {
                z27 = true;
            } else {
                z27 = false;
            }
            zM87157i = z37 | z27 | c28655q2.m87157i(viewModel) | c28655q2.m87157i(analytics) | c28655q2.m87157i(navigationRouter) | c28655q2.m87153g(interfaceC28601c1) | ((1879048192 & i29) == 536870912);
            Object objM87133R6 = c28655q2.m87133R();
            if (zM87157i) {
                str4 = str2;
                c6075e = new C6075e(viewState, str4, z15, viewModel, analytics, navigationRouter, interfaceC28601c1, function3);
                c28655q2.m87172p0(c6075e);
            } else {
                str4 = str2;
                c6075e = new C6075e(viewState, str4, z15, viewModel, analytics, navigationRouter, interfaceC28601c1, function3);
                c28655q2.m87172p0(c6075e);
            }
            AbstractC17269i.m48888e(navController, strName4, null, (Function1) c6075e, c28655q2, (i29 >> 6) & 14);
            c28655q = c28655q2;
            str3 = str4;
            function2 = function3;
            weeklyPlanNavHostDestination2 = weeklyPlanNavHostDestination3;
            z17 = z214;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            weeklyPlanNavHostDestination2 = weeklyPlanNavHostDestination;
            function2 = function1;
            z17 = z14;
            str3 = str2;
        }
        z18 = z15;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1025j0(viewModel, navigationRouter, navController, viewState, analytics, z17, str3, z18, weeklyPlanNavHostDestination2, function2, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m116989w(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final InterfaceC28601c1 m116990x(boolean z4) {
        return AbstractC28683x.m87272z(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: y */
    private static final boolean m116991y(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: z */
    private static final void m116992z(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }
}
