package com.whoop.core.details.view;

import a71.C0520a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2609r;
import bc3.InterfaceC2994c0;
import c41.C4091p1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.core.details.view.AbstractC6470a;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import cz0.AbstractC11258s;
import d61.InterfaceC11732a;
import ep0.C13404j;
import ew0.AbstractC13720a;
import fy1.AbstractC14874j;
import gz0.EnumC16313m0;
import hw0.C17700e;
import hw0.InterfaceC17699d;
import hy0.C17750h1;
import iw0.AbstractC20978k0;
import iw0.AbstractC20992x;
import iw0.C20970g0;
import iw0.C20972h0;
import iw0.C20980l0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.InterfaceC23459e;
import m12.AbstractC24936d;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import mc1.EnumC25417b;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26957l;
import nq0.C27050m;
import nw0.C27207n;
import nx1.C27225g;
import o72.C27640a;
import ov2.C28402f;
import ow0.AbstractC28434d;
import p088dc.AbstractC11895b;
import p329n0.C26057j;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import p725ot1.C28325a;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: com.whoop.core.details.view.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aS\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lhw0/d;", "viewState", "Lkotlin/Function1;", "Lcom/whoop/core/details/view/b;", "Ll83/a0;", "coreDetailsViewEventListener", "Lew0/a;", "onNavigationEvent", "Lcom/whoop/analytics/AnalyticEventModel;", "onAnalyticEvent", "N", "(Lhw0/d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lhw0/d$b;", "x", "(Lhw0/d$b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lhw0/d$c;", "onViewEvent", "S", "(Lhw0/d$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC6470a {

    /* JADX INFO: renamed from: com.whoop.core.details.view.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.view.CoreDetailsScreenKt$FullScreenModalScreen$1$4$1", m100430f = "CoreDetailsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25349w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC17699d.c f25350x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f25351y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC17699d.c cVar, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f25350x = cVar;
            this.f25351y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f25350x, this.f25351y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f25349w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC6471b interfaceC6471bM50638j = this.f25350x.getFollowUpEvent();
            if (interfaceC6471bM50638j != null) {
                this.f25351y.invoke(interfaceC6471bM50638j);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m19767A(Function1 function1, int i13) {
        function1.invoke(new InterfaceC6471b.g(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m19768B(Function1 function1) {
        function1.invoke(new InterfaceC6471b.h(true));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m19769C(Function1 function1, String exerciseId) {
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        function1.invoke(new AbstractC13720a.e(exerciseId, false, 2, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m19770D(Function1 function1, C9598e it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC13720a.b(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m19771E(InterfaceC17699d.b bVar, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m19813x(bVar, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m19772F(InterfaceC28601c1 interfaceC28601c1, Function1 function1, Object it) {
        C0520a c0520a;
        C0520a c0520a2;
        C0520a c0520a3;
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof InterfaceC11732a.c) {
            interfaceC28601c1.setValue(Boolean.TRUE);
        } else if (it instanceof InterfaceC11732a.b) {
            interfaceC28601c1.setValue(Boolean.FALSE);
        }
        if (it instanceof InterfaceC11732a) {
            AbstractC11258s abstractC11258s = (AbstractC11258s) AbstractC25265s.m74113Q0(((InterfaceC11732a) it).mo31360b().values());
            TextResource textResourceM1227g = null;
            List<C0520a> listMo30408a = abstractC11258s != null ? abstractC11258s.mo30408a() : null;
            TextResource textResourceM1231k = (listMo30408a == null || (c0520a3 = (C0520a) AbstractC25265s.m74102I0(0, listMo30408a)) == null) ? null : c0520a3.getValueDisplay();
            TextResource textResourceM1229i = (listMo30408a == null || (c0520a2 = (C0520a) AbstractC25265s.m74102I0(0, listMo30408a)) == null) ? null : c0520a2.getUnitDisplay();
            if (listMo30408a != null && (c0520a = (C0520a) AbstractC25265s.m74102I0(0, listMo30408a)) != null) {
                textResourceM1227g = c0520a.getSecondaryContextualDisplay();
            }
            function1.invoke(new InterfaceC6471b.k(textResourceM1231k, textResourceM1229i, textResourceM1227g));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m19773G(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC6471b.j((EnumC25417b) it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m19774H(Function1 function1) {
        function1.invoke(AbstractC13720a.a.f48702a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m19775I(Function1 function1, boolean z4) {
        function1.invoke(new InterfaceC6471b.a(z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m19776J(Function1 function1, String it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC13720a.h(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m19777K(Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(AbstractC13720a.f.f48714a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m19778L(Function1 function1, Function1 function2, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC13720a) {
            function1.invoke(it);
        } else if (it instanceof InterfaceC6471b) {
            function2.invoke(it);
        } else if (it instanceof C9598e) {
            function1.invoke(new AbstractC13720a.b((C9598e) it));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m19779M(Function1 function1, Function1 function2, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof C9598e) {
            function1.invoke(new AbstractC13720a.b((C9598e) it));
        } else if (it instanceof C4091p1) {
            function2.invoke(InterfaceC6471b.f.f25357a);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x010c  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0117  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129  */
    /* JADX WARN: Code duplicated, block: B:76:0x0132  */
    /* JADX WARN: Code duplicated, block: B:78:0x0152  */
    /* JADX WARN: Code duplicated, block: B:81:0x016b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:86:0x017d  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: N */
    public static final void m19780N(InterfaceC17699d viewState, Function1 coreDetailsViewEventListener, Function1 onNavigationEvent, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC17699d.b bVar;
        InterfaceC17699d.d dVarM50624j;
        Function1 function5;
        boolean z13;
        Object objM87133R;
        boolean z14;
        Object objM87133R2;
        Object objM87133R3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(coreDetailsViewEventListener, "coreDetailsViewEventListener");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(686901460);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(coreDetailsViewEventListener) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        int i16 = i14 & 8;
        if (i16 == 0) {
            if ((i13 & 3072) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C28402f(1);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function4 = (Function1) objM87133R3;
                } else {
                    function4 = function2;
                }
                AbstractC14874j.m42904c(viewState, viewState.getScreenTag(), c28655q, i15 & 14);
                if (viewState instanceof InterfaceC17699d.c) {
                    c28655q.m87150e0(-1312646847);
                    m19785S((InterfaceC17699d.c) viewState, coreDetailsViewEventListener, onNavigationEvent, c28655q, i15 & 1022);
                    c28655q.m87173q(false);
                    function5 = function4;
                } else {
                    if (viewState instanceof InterfaceC17699d.b) {
                        throw AbstractC11895b.m32003v(-1312647471, c28655q, false);
                    }
                    c28655q.m87150e0(-2037081665);
                    bVar = (InterfaceC17699d.b) viewState;
                    dVarM50624j = bVar.getNavigateToEditActivityScreen();
                    if (dVarM50624j != null) {
                        coreDetailsViewEventListener.invoke(InterfaceC6471b.p.f25373a);
                        onNavigationEvent.invoke(new AbstractC13720a.d(dVarM50624j.getStartDate(), dVarM50624j.getEndDate(), dVarM50624j.getActivityInternalName(), dVarM50624j.getActivityId(), dVarM50624j.getActivityType()));
                    }
                    if (bVar.getExerciseSummary() != null) {
                        c28655q.m87150e0(-2036469167);
                        C20980l0 c20980l0M50620f = bVar.getExerciseSummary();
                        if ((i15 & 112) == 32) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13 || objM87133R == c28676v0) {
                            objM87133R = new C27207n(coreDetailsViewEventListener, 19);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                        z14 = (i15 & 896) == 256;
                        objM87133R2 = c28655q.m87133R();
                        if (z14 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C26957l(onNavigationEvent, 23);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC20978k0.m58322s(c20980l0M50620f, interfaceC4339a, (Function1) objM87133R2, bVar.getIsExerciseImageNavigationEnabled(), bVar.getIsEstimatedOneRepMaxEnabled(), c28655q, 0, 0);
                        c28655q.m87173q(false);
                        function5 = function4;
                    } else {
                        c28655q.m87150e0(-2035785586);
                        function5 = function4;
                        m19813x(bVar, coreDetailsViewEventListener, onNavigationEvent, function5, c28655q, i15 & 8190);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                function3 = function5;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C27640a((Object) viewState, coreDetailsViewEventListener, onNavigationEvent, (Object) function3, i13, i14, 4);
            }
        }
        i15 |= 3072;
        function2 = function1;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C28402f(1);
                    c28655q.m87172p0(objM87133R3);
                }
                function4 = (Function1) objM87133R3;
            } else {
                function4 = function2;
            }
            AbstractC14874j.m42904c(viewState, viewState.getScreenTag(), c28655q, i15 & 14);
            if (viewState instanceof InterfaceC17699d.c) {
                c28655q.m87150e0(-1312646847);
                m19785S((InterfaceC17699d.c) viewState, coreDetailsViewEventListener, onNavigationEvent, c28655q, i15 & 1022);
                c28655q.m87173q(false);
                function5 = function4;
            } else {
                if (viewState instanceof InterfaceC17699d.b) {
                    throw AbstractC11895b.m32003v(-1312647471, c28655q, false);
                }
                c28655q.m87150e0(-2037081665);
                bVar = (InterfaceC17699d.b) viewState;
                dVarM50624j = bVar.getNavigateToEditActivityScreen();
                if (dVarM50624j != null) {
                    coreDetailsViewEventListener.invoke(InterfaceC6471b.p.f25373a);
                    onNavigationEvent.invoke(new AbstractC13720a.d(dVarM50624j.getStartDate(), dVarM50624j.getEndDate(), dVarM50624j.getActivityInternalName(), dVarM50624j.getActivityId(), dVarM50624j.getActivityType()));
                }
                if (bVar.getExerciseSummary() != null) {
                    c28655q.m87150e0(-2036469167);
                    C20980l0 c20980l0M50620f2 = bVar.getExerciseSummary();
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C27207n(coreDetailsViewEventListener, 19);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C27207n(coreDetailsViewEventListener, 19);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R;
                    if ((i15 & 896) == 256) {
                    }
                    objM87133R2 = c28655q.m87133R();
                    if (z14) {
                        objM87133R2 = new C26957l(onNavigationEvent, 23);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C26957l(onNavigationEvent, 23);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC20978k0.m58322s(c20980l0M50620f2, interfaceC4339a2, (Function1) objM87133R2, bVar.getIsExerciseImageNavigationEnabled(), bVar.getIsEstimatedOneRepMaxEnabled(), c28655q, 0, 0);
                    c28655q.m87173q(false);
                    function5 = function4;
                } else {
                    c28655q.m87150e0(-2035785586);
                    function5 = function4;
                    m19813x(bVar, coreDetailsViewEventListener, onNavigationEvent, function5, c28655q, i15 & 8190);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            function3 = function5;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27640a((Object) viewState, coreDetailsViewEventListener, onNavigationEvent, (Object) function3, i13, i14, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m19781O(AnalyticEventModel it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m19782P(Function1 function1) {
        function1.invoke(new InterfaceC6471b.h(false));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m19783Q(Function1 function1, String exerciseId) {
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        function1.invoke(new AbstractC13720a.e(exerciseId, false, 2, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m19784R(InterfaceC17699d interfaceC17699d, Function1 function1, Function1 function2, Function1 function3, int i13, int i14, Composer composer, int i15) {
        m19780N(interfaceC17699d, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: S */
    public static final void m19785S(final InterfaceC17699d.c viewState, final Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1899261367);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean z4 = viewState.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q2.m87150e0(-1706726080);
                TextResource title = viewState.getType().getTitle();
                boolean z13 = (i14 & 896) == 256;
                Object objM87133R = c28655q2.m87133R();
                if (z13 || objM87133R == c28676v0) {
                    objM87133R = new C27207n(onNavigationEvent, 18);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(title, 0L, (InterfaceC4339a) objM87133R, 2, null), viewState.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            } else {
                c28655q2.m87150e0(-1706359939);
                int i15 = i14;
                AbstractC33208p0 abstractC33208p0M50644p = viewState.getType();
                TextResource textResourceM50643o = viewState.getSupportText();
                TextResource textResourceM50640l = viewState.getPrimaryButtonText();
                int i16 = i15 & 112;
                boolean zM87157i = c28655q2.m87157i(viewState) | (i16 == 32);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    final int i17 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: ow0.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i17) {
                                case 0:
                                    return AbstractC6470a.m19787U(viewState, onViewEvent);
                                default:
                                    return AbstractC6470a.m19788V(viewState, onViewEvent);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                TextResource textResourceM50642n = viewState.getSecondaryButtonText();
                boolean zM87157i2 = c28655q2.m87157i(viewState) | (i16 == 32);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    final int i18 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: ow0.e
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return AbstractC6470a.m19787U(viewState, onViewEvent);
                                default:
                                    return AbstractC6470a.m19788V(viewState, onViewEvent);
                            }
                        }
                    };
                    c28655q2.m87172p0(objM87133R3);
                }
                int i19 = AbstractC33208p0.f138461d | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                int i24 = TextResource.$stable;
                AbstractC33199m0.m105214F(abstractC33208p0M50644p, textResourceM50643o, null, textResourceM50640l, interfaceC4339a, true, false, textResourceM50642n, (InterfaceC4339a) objM87133R3, null, false, false, c28655q2, i19 | (i24 << 3) | (i24 << 9) | (i24 << 21), 0, 3652);
                c28655q = c28655q2;
                InterfaceC6471b interfaceC6471bM50638j = viewState.getFollowUpEvent();
                boolean zM87157i3 = c28655q.m87157i(viewState) | (i16 == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i3 || objM87133R4 == c28676v0) {
                    objM87133R4 = new a(viewState, onViewEvent, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, interfaceC6471bM50638j);
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) viewState, onViewEvent, (InterfaceC23459e) onNavigationEvent, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m19786T(Function1 function1) {
        function1.invoke(AbstractC13720a.a.f48702a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m19787U(InterfaceC17699d.c cVar, Function1 function1) {
        InterfaceC6471b interfaceC6471bM50639k = cVar.getPrimaryButtonClickEvent();
        if (interfaceC6471bM50639k != null) {
            function1.invoke(interfaceC6471bM50639k);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m19788V(InterfaceC17699d.c cVar, Function1 function1) {
        InterfaceC6471b interfaceC6471bM50641m = cVar.getSecondaryButtonClickEvent();
        if (interfaceC6471bM50641m != null) {
            function1.invoke(interfaceC6471bM50641m);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m19789W(InterfaceC17699d.c cVar, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m19785S(cVar, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    private static final void m19813x(InterfaceC17699d.b bVar, Function1 function1, Function1 function2, Function1 function3, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1872332693);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            int i15 = i14 & 112;
            AbstractC28434d.m86161e(bVar.getDialogState(), function1, c28655q, i15);
            C20972h0 c20972h0M50623i = bVar.getHeaderToolBarState();
            c28655q.m87150e0(-279560176);
            Map<TextResource, C17700e> mapM50622h = bVar.m50622h();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(mapM50622h.size()));
            Iterator<T> it = mapM50622h.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                C17700e c17700e = (C17700e) entry.getValue();
                EnumC16313m0 enumC16313m0M50657b = c17700e.getIcon();
                boolean zM87157i = c28655q.m87157i(c17700e) | ((i14 & 896) == 256) | (i15 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C26057j(c17700e, function2, function1, 11);
                    c28655q.m87172p0(objM87133R2);
                }
                linkedHashMap.put(key, new C20970g0(enumC16313m0M50657b, (InterfaceC4339a) objM87133R2));
            }
            c28655q.m87173q(false);
            List<InterfaceC25312u> listM50618d = bVar.m50618d();
            List<InterfaceC25312u> listM50617c = bVar.m50617c();
            List<C17750h1> listM50626l = bVar.m50626l();
            boolean zBooleanValue = ((Boolean) interfaceC28601c1.getValue()).booleanValue();
            boolean zM50629o = bVar.getIsExerciseImageNavigationEnabled();
            boolean zM50628n = bVar.getIsExerciseDetailsV2FFEnabled();
            C13404j c13404jM50625k = bVar.getScreenContextMetadata();
            boolean z4 = i15 == 32;
            Object objM87133R3 = c28655q.m87133R();
            if (z4 || objM87133R3 == c28676v0) {
                objM87133R3 = new C2609r(interfaceC28601c1, function1, 27);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function4 = (Function1) objM87133R3;
            boolean z13 = i15 == 32;
            Object objM87133R4 = c28655q.m87133R();
            if (z13 || objM87133R4 == c28676v0) {
                objM87133R4 = new C26957l(function1, 19);
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function5 = (Function1) objM87133R4;
            int i16 = i14 & 896;
            boolean z14 = i16 == 256;
            int i17 = i14;
            Object objM87133R5 = c28655q.m87133R();
            if (z14 || objM87133R5 == c28676v0) {
                objM87133R5 = new C27207n(function2, 17);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R5;
            boolean z15 = i15 == 32;
            Object objM87133R6 = c28655q.m87133R();
            if (z15 || objM87133R6 == c28676v0) {
                objM87133R6 = new C26957l(function1, 20);
                c28655q.m87172p0(objM87133R6);
            }
            Function1 function6 = (Function1) objM87133R6;
            boolean z16 = i16 == 256;
            Object objM87133R7 = c28655q.m87133R();
            if (z16 || objM87133R7 == c28676v0) {
                objM87133R7 = new C26957l(function2, 21);
                c28655q.m87172p0(objM87133R7);
            }
            Function1 function7 = (Function1) objM87133R7;
            boolean z17 = i16 == 256;
            Object objM87133R8 = c28655q.m87133R();
            if (z17 || objM87133R8 == c28676v0) {
                objM87133R8 = new C26957l(function2, 22);
                c28655q.m87172p0(objM87133R8);
            }
            Function1 function8 = (Function1) objM87133R8;
            boolean z18 = (i15 == 32) | (i16 == 256);
            Object objM87133R9 = c28655q.m87133R();
            if (z18 || objM87133R9 == c28676v0) {
                objM87133R9 = new C2777c(function2, 13, function1);
                c28655q.m87172p0(objM87133R9);
            }
            Function1 function9 = (Function1) objM87133R9;
            boolean z19 = (i16 == 256) | (i15 == 32);
            Object objM87133R10 = c28655q.m87133R();
            if (z19 || objM87133R10 == c28676v0) {
                objM87133R10 = new C2777c(function2, 14, function1);
                c28655q.m87172p0(objM87133R10);
            }
            Function1 function10 = (Function1) objM87133R10;
            boolean zM87157i2 = (i16 == 256) | c28655q.m87157i(bVar);
            Object objM87133R11 = c28655q.m87133R();
            if (zM87157i2 || objM87133R11 == c28676v0) {
                objM87133R11 = new C27050m(14, function2, bVar);
                c28655q.m87172p0(objM87133R11);
            }
            Function1 function11 = (Function1) objM87133R11;
            boolean z24 = i15 == 32;
            Object objM87133R12 = c28655q.m87133R();
            if (z24 || objM87133R12 == c28676v0) {
                objM87133R12 = new C26957l(function1, 24);
                c28655q.m87172p0(objM87133R12);
            }
            Function1 function12 = (Function1) objM87133R12;
            boolean z25 = i15 == 32;
            Object objM87133R13 = c28655q.m87133R();
            if (z25 || objM87133R13 == c28676v0) {
                objM87133R13 = new C27207n(function1, 20);
                c28655q.m87172p0(objM87133R13);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R13;
            boolean z26 = i16 == 256;
            Object objM87133R14 = c28655q.m87133R();
            if (z26 || objM87133R14 == c28676v0) {
                objM87133R14 = new C26957l(function2, 25);
                c28655q.m87172p0(objM87133R14);
            }
            Function1 function13 = (Function1) objM87133R14;
            boolean z27 = i16 == 256;
            Object objM87133R15 = c28655q.m87133R();
            if (z27 || objM87133R15 == c28676v0) {
                objM87133R15 = new C26957l(function2, 26);
                c28655q.m87172p0(objM87133R15);
            }
            AbstractC20992x.m58472y0(null, c20972h0M50623i, linkedHashMap, listM50618d, listM50617c, listM50626l, function4, function5, interfaceC4339a, function6, function7, function8, function9, function10, function3, function11, zBooleanValue, function12, interfaceC4339a2, function13, zM50629o, zM50628n, (Function1) objM87133R15, c13404jM50625k, c28655q, (TextResource.$stable | AbstractC22403o.f87638a) << 3, (i17 << 3) & 57344, C13404j.f46947x << 9, 1);
            c28655q = c28655q;
            String strM50621g = bVar.getFeatureEducationKey();
            if (strM50621g == null) {
                c28655q.m87150e0(-72704849);
            } else {
                c28655q.m87150e0(-72704848);
                AbstractC24936d.m73080z(strM50621g, null, false, null, null, null, null, c28655q, 0, 126);
            }
            c28655q.m87173q(false);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28325a(bVar, function1, function2, function3, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m19814y(C17700e c17700e, Function1 function1, Function1 function2) {
        Object objM50656a = c17700e.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (objM50656a instanceof AbstractC13720a) {
            function1.invoke(objM50656a);
        } else if (objM50656a instanceof InterfaceC6471b) {
            function2.invoke(objM50656a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m19815z(Function1 function1, InterfaceC17699d.b bVar, String message) {
        AbstractC22676k.m65750j(message, "message");
        String strM50616b = bVar.getActivityName();
        if (strM50616b == null) {
            strM50616b = "";
        }
        function1.invoke(new AbstractC13720a.c(message, strM50616b));
        return C23454a0.f92919a;
    }
}
