package pq1;

import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import iq1.C20848a;
import iq1.InterfaceC20850c;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import mq1.C25886a;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28330f;
import pf.C29124b;
import pl0.C29344b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: pq1.f */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lpq1/g;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Landroidx/compose/ui/Modifier;Lpq1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Liq1/a;", "viewState", "Liq1/c;", "onEvent", "f", "(Landroidx/compose/ui/Modifier;Liq1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "behavior-impact_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29482f {

    /* JADX INFO: renamed from: pq1.f$a */
    @InterfaceC32271e(m100429c = "com.whoop.impacts.details.view.journaltrends.BehaviorDetailsImpactJournalTrendsScreenKt$BehaviorDetailsImpactJournalTrendsScreen$2$1", m100430f = "BehaviorDetailsImpactJournalTrendsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119739w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25886a f119740x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C29483g f119741y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C25886a c25886a, C29483g c29483g, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119740x = c25886a;
            this.f119741y = c29483g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f119740x, this.f119741y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f119739w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f119740x.mo1216g(new InterfaceC20850c.a(this.f119741y.getPath()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m90040f(Modifier modifier, C20848a viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-975679723);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C29344b(19);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C20848a.b screenContent = viewState.getScreenContent();
            if (screenContent == null) {
                c28655q.m87150e0(-493754358);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-493754357);
                AbstractC29480d.m90030g(null, screenContent, function3, c28655q, i15 & 896, 1);
                c28655q.m87173q(false);
            }
            C20848a.a miniArchModal = viewState.getMiniArchModal();
            if (miniArchModal == null) {
                c28655q.m87150e0(-493565816);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-493565815);
                AbstractC29478b.m90019e(miniArchModal, function3, c28655q, (i15 >> 3) & 112);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(modifier2, viewState, function2, i13, i14, 19);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: g */
    public static final void m90041g(Modifier modifier, C29483g state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC23864c abstractC23864c;
        Object obj;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1168291749);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(state) ? 32 : 16;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 19) != 18)) {
            Modifier modifier3 = i16 != 0 ? C2314t.f9131w : modifier2;
            int i18 = i14 & 4;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C29344b(20);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            C20848a viewState = state.getViewState();
            c28655q.m87150e0(1371609227);
            Object obj2 = null;
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                InterfaceC1583f2 interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                Context applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(viewState) | c28655q.m87153g(null);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, viewState, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25886a.class), null, null);
                    c28655q.m87172p0(objM87133R2);
                }
                abstractC23864c = (AbstractC23864c) objM87133R2;
            } else {
                c28655q.m87150e0(-707976188);
                InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    abstractC23864c = null;
                    obj = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                    Application application2 = (Application) applicationContext2;
                    boolean zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(viewState) | c28655q.m87153g(null);
                    Object objM87133R3 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C25886a.class), null, new C23863b(viewState), null);
                        obj2 = null;
                        obj = null;
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        obj = null;
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R3;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    boolean zM87153g3 = c28655q.m87153g(obj) | c28655q.m87153g(viewState) | c28655q.m87153g(obj2);
                    Object objM87133R4 = c28655q.m87133R();
                    if (zM87153g3 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C23863b(viewState);
                        c28655q.m87172p0(objM87133R4);
                    }
                    abstractC23864c = (C23863b) objM87133R4;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
            AbstractC22676k.m65748h(abstractC23864c, "null cannot be cast to non-null type com.whoop.impacts.details.presentation.journaltrends.BehaviorDetailsImpactJournalTrendsViewModel");
            C25886a c25886a = (C25886a) abstractC23864c;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(c25886a.getViewState(), state.getViewState(), null, c28655q, 0, 2);
            boolean zM87157i = c28655q.m87157i(c25886a) | c28655q.m87157i(state);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i || objM87133R5 == c28676v0) {
                objM87133R5 = new a(c25886a, state, null);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, c25886a);
            C20848a c20848aM90043i = m90043i(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(c25886a);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i2 || objM87133R6 == c28676v0) {
                objM87133R6 = new C29124b(c25886a, 7);
                c28655q.m87172p0(objM87133R6);
            }
            Modifier modifier4 = modifier3;
            m90040f(modifier4, c20848aM90043i, (Function1) objM87133R6, c28655q, i17 & 14, 0);
            function2 = function3;
            modifier2 = modifier4;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(modifier2, state, function2, i13, i14, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m90042h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final C20848a m90043i(InterfaceC28670t2 interfaceC28670t2) {
        return (C20848a) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m90044j(C25886a c25886a, InterfaceC20850c event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC20850c.f) {
            c25886a.mo1216g((InterfaceC20850c.f) event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m90045k(Modifier modifier, C29483g c29483g, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m90041g(modifier, c29483g, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m90046l(InterfaceC20850c it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m90047m(Modifier modifier, C20848a c20848a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m90040f(modifier, c20848a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
