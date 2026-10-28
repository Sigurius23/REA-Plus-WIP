package ym1;

import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import b11.C2275b;
import bz0.C3711a;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.ChallengeLandingScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.WeeklyPlanOverviewScreenModel;
import ec3.InterfaceC13037f2;
import ft2.C14773a;
import gt2.AbstractC16204b;
import gt2.AbstractC16205c;
import h01.C16550q;
import ht2.AbstractC17633e;
import ht2.C17629a;
import ht2.C17634f;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import vb1.C35868a;
import x81.C38072d;

/* JADX INFO: renamed from: ym1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\r8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lht2/f;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Lht2/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "any", "", "isInPlan", "n", "(Ljava/lang/Object;Z)Ljava/lang/Object;", "Lgt2/c;", "homeTileViewState", "isExpanded", "m", "(Lgt2/c;Z)Lgt2/c;", "weeklyPlanHomeTileViewState", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39652c {
    /* JADX WARN: Code duplicated, block: B:104:0x0183  */
    /* JADX WARN: Code duplicated, block: B:106:0x0192  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:111:0x01be  */
    /* JADX WARN: Code duplicated, block: B:139:0x0203  */
    /* JADX WARN: Code duplicated, block: B:143:0x0220  */
    /* JADX WARN: Code duplicated, block: B:144:0x0224  */
    /* JADX WARN: Code duplicated, block: B:146:0x0228  */
    /* JADX WARN: Code duplicated, block: B:147:0x022d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0231  */
    /* JADX WARN: Code duplicated, block: B:151:0x023c  */
    /* JADX WARN: Code duplicated, block: B:153:0x024a  */
    /* JADX WARN: Code duplicated, block: B:155:0x0269  */
    /* JADX WARN: Code duplicated, block: B:158:0x0288  */
    /* JADX WARN: Code duplicated, block: B:160:0x0299  */
    /* JADX WARN: Code duplicated, block: B:162:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:169:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:171:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:173:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:174:0x02df  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:180:0x0303  */
    /* JADX WARN: Code duplicated, block: B:182:0x0311  */
    /* JADX WARN: Code duplicated, block: B:184:0x031f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0321  */
    /* JADX WARN: Code duplicated, block: B:189:0x032b  */
    /* JADX WARN: Code duplicated, block: B:192:0x0346  */
    /* JADX WARN: Code duplicated, block: B:195:0x0350  */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:77:0x013a  */
    /* JADX INFO: renamed from: f */
    public static final void m126776f(C17634f viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        final Function1 function4;
        AbstractC16205c weeklyPlanHomeTileViewState;
        AbstractC16205c abstractC16205c;
        int i16;
        InterfaceC28601c1 interfaceC28601c1M87261o;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean z13;
        Object objM87133R;
        final AbstractC23864c abstractC23864c;
        C14773a c14773a;
        InterfaceC13037f2 viewState2;
        boolean z14;
        int i17;
        boolean z15;
        AbstractC16205c abstractC16205cM126778h;
        AbstractC16205c abstractC16205cM126783m;
        boolean z16;
        C2314t c2314t;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        AbstractC16205c.c cVar;
        InterfaceC25312u state;
        boolean z19;
        boolean z24;
        Object objM87133R3;
        boolean z25;
        boolean z26;
        Object objM87133R4;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean z27;
        Object objM87133R5;
        Object obj;
        boolean z28;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1026555998);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
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
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C35868a(20);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function4 = (Function1) objM87133R7;
                } else {
                    function4 = function2;
                }
                weeklyPlanHomeTileViewState = viewState.getWeeklyPlanHomeTileViewState();
                if (weeklyPlanHomeTileViewState == null) {
                    weeklyPlanHomeTileViewState = AbstractC16205c.b.f61543b;
                }
                abstractC16205c = weeklyPlanHomeTileViewState;
                i16 = AbstractC16205c.f61541a;
                c28655q.m87150e0(1371609227);
                interfaceC28601c1M87261o = null;
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    z13 = ((((i16 & 14) ^ 6) <= 4 && c28655q.m87153g(abstractC16205c)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i16 & 48) == 32) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i16 & 3072) == 2048);
                    objM87133R = c28655q.m87133R();
                    if (z13 || objM87133R == c28676v0) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, abstractC16205c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14773a.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext2;
                        z27 = ((((i16 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i16 & 48) == 32) | ((((i16 & 14) ^ 6) <= 4 && c28655q.m87153g(abstractC16205c)) || (i16 & 6) == 4) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i16 & 3072) == 2048);
                        objM87133R5 = c28655q.m87133R();
                        if (!z27 || objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14773a.class), null, new C23863b(abstractC16205c), null);
                            obj = null;
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            obj = null;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R5;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        z28 = ((((i16 & 14) ^ 6) <= 4 && c28655q.m87153g(abstractC16205c)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87153g(obj)) || (i16 & 48) == 32) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i16 & 3072) == 2048);
                        objM87133R6 = c28655q.m87133R();
                        if (z28 || objM87133R6 == c28676v0) {
                            objM87133R6 = new C23863b(abstractC16205c);
                            c28655q.m87172p0(objM87133R6);
                        }
                        abstractC23864c = (C23863b) objM87133R6;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                }
                if (abstractC23864c instanceof C14773a) {
                    c14773a = (C14773a) abstractC23864c;
                } else {
                    c14773a = null;
                }
                if (c14773a != null) {
                    viewState2 = c14773a.getViewState();
                } else {
                    viewState2 = null;
                }
                if (viewState2 == null) {
                    c28655q.m87150e0(-1962077521);
                    z14 = false;
                } else {
                    z14 = false;
                    c28655q.m87150e0(1322180498);
                    interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewState2, c28655q, 0);
                }
                c28655q.m87173q(z14);
                if (interfaceC28601c1M87261o == null) {
                    c28655q.m87150e0(1322181813);
                    i17 = i16;
                    interfaceC28601c1M87261o = AbstractC28683x.m87260n(abstractC23864c.getViewState(), AbstractC16205c.b.f61543b, null, c28655q, AbstractC16205c.b.f61544c << 3, 2);
                    z15 = false;
                } else {
                    i17 = i16;
                    z15 = false;
                    c28655q.m87150e0(1322178837);
                }
                c28655q.m87173q(z15);
                abstractC16205cM126778h = m126778h(interfaceC28601c1M87261o);
                abstractC16205cM126783m = m126783m(abstractC16205cM126778h, viewState.getIsExpanded());
                z16 = abstractC16205cM126778h instanceof AbstractC16205c.c;
                c2314t = C2314t.f9131w;
                if (z16) {
                    c28655q.m87150e0(19298908);
                    cVar = (AbstractC16205c.c) abstractC16205cM126778h;
                    state = cVar.getState();
                    if (state instanceof C17629a) {
                        c28655q.m87150e0(19372409);
                        boolean zM87157i = c28655q.m87157i(abstractC23864c);
                        if ((i15 & 112) == 32) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z25 | zM87157i;
                        objM87133R4 = c28655q.m87133R();
                        if (z26 || objM87133R4 == c28676v0) {
                            final int i19 = 0;
                            objM87133R4 = new Function1() { // from class: ym1.b
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    switch (i19) {
                                        case 0:
                                            return AbstractC39652c.m126779i(abstractC23864c, function4, obj2);
                                        default:
                                            return AbstractC39652c.m126781k(abstractC23864c, function4, obj2);
                                    }
                                }
                            };
                            c28655q.m87172p0(objM87133R4);
                        }
                        AbstractC17633e.m50204L(c2314t, abstractC16205cM126783m, (Function1) objM87133R4, c28655q, (i17 << 3) | 6, 0);
                        z19 = false;
                        c28655q.m87173q(false);
                    } else if (state instanceof C16550q) {
                        c28655q.m87150e0(19814531);
                        InterfaceC25312u state2 = cVar.getState();
                        if ((i15 & 112) == 32) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R3 = c28655q.m87133R();
                        if (z24 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C2275b(function4, 21);
                            c28655q.m87172p0(objM87133R3);
                        }
                        AbstractC25303l.m74291r(state2, null, null, (Function1) objM87133R3, c28655q, 0, 6);
                        c28655q = c28655q;
                        z19 = false;
                        c28655q.m87173q(false);
                    } else {
                        z19 = false;
                        c28655q.m87150e0(19962959);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z19);
                } else {
                    c28655q.m87150e0(19985744);
                    boolean zM87157i2 = c28655q.m87157i(abstractC23864c);
                    if ((i15 & 112) == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z17 | zM87157i2;
                    objM87133R2 = c28655q.m87133R();
                    if (z18 || objM87133R2 == c28676v0) {
                        final int i24 = 1;
                        objM87133R2 = new Function1() { // from class: ym1.b
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i24) {
                                    case 0:
                                        return AbstractC39652c.m126779i(abstractC23864c, function4, obj2);
                                    default:
                                        return AbstractC39652c.m126781k(abstractC23864c, function4, obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC17633e.m50204L(c2314t, abstractC16205cM126778h, (Function1) objM87133R2, c28655q, (i17 << 3) | 6, 0);
                    c28655q.m87173q(false);
                }
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3711a(viewState, i13, function3, i14, 6);
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
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C35868a(20);
                    c28655q.m87172p0(objM87133R7);
                }
                function4 = (Function1) objM87133R7;
            } else {
                function4 = function2;
            }
            weeklyPlanHomeTileViewState = viewState.getWeeklyPlanHomeTileViewState();
            if (weeklyPlanHomeTileViewState == null) {
                weeklyPlanHomeTileViewState = AbstractC16205c.b.f61543b;
            }
            abstractC16205c = weeklyPlanHomeTileViewState;
            i16 = AbstractC16205c.f61541a;
            c28655q.m87150e0(1371609227);
            interfaceC28601c1M87261o = null;
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    obj = null;
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext3;
                    z27 = ((((i16 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i16 & 48) == 32) | ((((i16 & 14) ^ 6) <= 4 && c28655q.m87153g(abstractC16205c)) || (i16 & 6) == 4) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i16 & 3072) == 2048);
                    objM87133R5 = c28655q.m87133R();
                    if (z27) {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14773a.class), null, new C23863b(abstractC16205c), null);
                        obj = null;
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14773a.class), null, new C23863b(abstractC16205c), null);
                        obj = null;
                        c28655q.m87172p0(objM87133R5);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R5;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    if (((i16 & 112) ^ 48) <= 32) {
                    }
                    z28 = ((((i16 & 14) ^ 6) <= 4 && c28655q.m87153g(abstractC16205c)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87153g(obj)) || (i16 & 48) == 32) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i16 & 3072) == 2048);
                    objM87133R6 = c28655q.m87133R();
                    if (z28) {
                        objM87133R6 = new C23863b(abstractC16205c);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C23863b(abstractC16205c);
                        c28655q.m87172p0(objM87133R6);
                    }
                    abstractC23864c = (C23863b) objM87133R6;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                if (((i16 & 112) ^ 48) <= 32) {
                }
                z13 = ((((i16 & 14) ^ 6) <= 4 && c28655q.m87153g(abstractC16205c)) || (i16 & 6) == 4) | ((((i16 & 112) ^ 48) <= 32 && c28655q.m87153g(null)) || (i16 & 48) == 32) | ((((i16 & 7168) ^ 3072) <= 2048 && c28655q.m87153g(null)) || (i16 & 3072) == 2048);
                objM87133R = c28655q.m87133R();
                if (z13) {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, abstractC16205c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14773a.class), null, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, abstractC16205c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14773a.class), null, null);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
                c28655q.m87173q(false);
            }
            if (abstractC23864c instanceof C14773a) {
                c14773a = (C14773a) abstractC23864c;
            } else {
                c14773a = null;
            }
            if (c14773a != null) {
                viewState2 = c14773a.getViewState();
            } else {
                viewState2 = null;
            }
            if (viewState2 == null) {
                c28655q.m87150e0(-1962077521);
                z14 = false;
            } else {
                z14 = false;
                c28655q.m87150e0(1322180498);
                interfaceC28601c1M87261o = AbstractC28683x.m87261o(viewState2, c28655q, 0);
            }
            c28655q.m87173q(z14);
            if (interfaceC28601c1M87261o == null) {
                c28655q.m87150e0(1322181813);
                i17 = i16;
                interfaceC28601c1M87261o = AbstractC28683x.m87260n(abstractC23864c.getViewState(), AbstractC16205c.b.f61543b, null, c28655q, AbstractC16205c.b.f61544c << 3, 2);
                z15 = false;
            } else {
                i17 = i16;
                z15 = false;
                c28655q.m87150e0(1322178837);
            }
            c28655q.m87173q(z15);
            abstractC16205cM126778h = m126778h(interfaceC28601c1M87261o);
            abstractC16205cM126783m = m126783m(abstractC16205cM126778h, viewState.getIsExpanded());
            z16 = abstractC16205cM126778h instanceof AbstractC16205c.c;
            c2314t = C2314t.f9131w;
            if (z16) {
                c28655q.m87150e0(19298908);
                cVar = (AbstractC16205c.c) abstractC16205cM126778h;
                state = cVar.getState();
                if (state instanceof C17629a) {
                    c28655q.m87150e0(19372409);
                    boolean zM87157i3 = c28655q.m87157i(abstractC23864c);
                    if ((i15 & 112) == 32) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z25 | zM87157i3;
                    objM87133R4 = c28655q.m87133R();
                    if (z26) {
                        final int i110 = 0;
                        objM87133R4 = new Function1() { // from class: ym1.b
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i110) {
                                    case 0:
                                        return AbstractC39652c.m126779i(abstractC23864c, function4, obj2);
                                    default:
                                        return AbstractC39652c.m126781k(abstractC23864c, function4, obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        final int i111 = 0;
                        objM87133R4 = new Function1() { // from class: ym1.b
                            @Override // p715kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i111) {
                                    case 0:
                                        return AbstractC39652c.m126779i(abstractC23864c, function4, obj2);
                                    default:
                                        return AbstractC39652c.m126781k(abstractC23864c, function4, obj2);
                                }
                            }
                        };
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC17633e.m50204L(c2314t, abstractC16205cM126783m, (Function1) objM87133R4, c28655q, (i17 << 3) | 6, 0);
                    z19 = false;
                    c28655q.m87173q(false);
                } else if (state instanceof C16550q) {
                    c28655q.m87150e0(19814531);
                    InterfaceC25312u state3 = cVar.getState();
                    if ((i15 & 112) == 32) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R3 = c28655q.m87133R();
                    if (z24) {
                        objM87133R3 = new C2275b(function4, 21);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C2275b(function4, 21);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC25303l.m74291r(state3, null, null, (Function1) objM87133R3, c28655q, 0, 6);
                    c28655q = c28655q;
                    z19 = false;
                    c28655q.m87173q(false);
                } else {
                    z19 = false;
                    c28655q.m87150e0(19962959);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z19);
            } else {
                c28655q.m87150e0(19985744);
                boolean zM87157i4 = c28655q.m87157i(abstractC23864c);
                if ((i15 & 112) == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | zM87157i4;
                objM87133R2 = c28655q.m87133R();
                if (z18) {
                    final int i25 = 1;
                    objM87133R2 = new Function1() { // from class: ym1.b
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i25) {
                                case 0:
                                    return AbstractC39652c.m126779i(abstractC23864c, function4, obj2);
                                default:
                                    return AbstractC39652c.m126781k(abstractC23864c, function4, obj2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    final int i26 = 1;
                    objM87133R2 = new Function1() { // from class: ym1.b
                        @Override // p715kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i26) {
                                case 0:
                                    return AbstractC39652c.m126779i(abstractC23864c, function4, obj2);
                                default:
                                    return AbstractC39652c.m126781k(abstractC23864c, function4, obj2);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC17633e.m50204L(c2314t, abstractC16205cM126778h, (Function1) objM87133R2, c28655q, (i17 << 3) | 6, 0);
                c28655q.m87173q(false);
            }
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3711a(viewState, i13, function3, i14, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m126777g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final AbstractC16205c m126778h(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC16205c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m126779i(AbstractC23864c abstractC23864c, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC16204b.b) {
            abstractC23864c.mo1216g(it);
        } else {
            function1.invoke(m126784n(it, true));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m126780j(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(m126784n(it, false));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m126781k(AbstractC23864c abstractC23864c, Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC16204b.b) {
            abstractC23864c.mo1216g(it);
        } else {
            function1.invoke(it);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m126782l(C17634f c17634f, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m126776f(c17634f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final AbstractC16205c m126783m(AbstractC16205c homeTileViewState, boolean z4) {
        AbstractC16205c.c cVarM45876a;
        AbstractC22676k.m65750j(homeTileViewState, "homeTileViewState");
        AbstractC16205c.c cVar = homeTileViewState instanceof AbstractC16205c.c ? (AbstractC16205c.c) homeTileViewState : null;
        InterfaceC25312u state = cVar != null ? cVar.getState() : null;
        C17629a c17629a = state instanceof C17629a ? (C17629a) state : null;
        return (c17629a == null || (cVarM45876a = cVar.m45876a(C17629a.m50185b(c17629a, null, z4, null, null, null, null, null, 125, null))) == null) ? homeTileViewState : cVarM45876a;
    }

    /* JADX INFO: renamed from: n */
    public static final Object m126784n(Object any, boolean z4) {
        AbstractC22676k.m65750j(any, "any");
        C9598e c9598e = any instanceof C9598e ? (C9598e) any : null;
        NavigationScreenModel parameters = c9598e != null ? c9598e.getParameters() : null;
        if (parameters instanceof WeeklyPlanOverviewScreenModel) {
            return C9598e.m23127b((C9598e) any, null, WeeklyPlanOverviewScreenModel.copy$default((WeeklyPlanOverviewScreenModel) parameters, Boolean.valueOf(z4), null, "weekly_plan_tile_on_home", null, 10, null), null, 5, null);
        }
        return parameters instanceof ChallengeLandingScreenModel ? C9598e.m23127b((C9598e) any, null, ((ChallengeLandingScreenModel) parameters).copy("weekly_plan_tile_on_home"), null, 5, null) : any;
    }
}
