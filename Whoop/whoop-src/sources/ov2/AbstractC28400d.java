package ov2;

import am2.C1040r;
import android.app.Application;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import e31.AbstractC12610b;
import e31.C12611c;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import lv2.C24763a;
import mi2.C25592o;
import nv2.C27176b;
import nv2.C27177c;
import nv2.InterfaceC27175a;
import o72.C27644e;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p11.C28701b;
import p323m8.AbstractC25218a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p725ot1.C28330f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ug.AbstractC34924m;
import uu2.AbstractC35249f;
import uu2.C35247e;
import x81.C38072d;

/* JADX INFO: renamed from: ov2.d */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lov2/e;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "j", "(Landroidx/compose/ui/Modifier;Lov2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lnv2/c;", "viewState", "onEvent", "i", "(Landroidx/compose/ui/Modifier;Lnv2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28400d {

    /* JADX INFO: renamed from: ov2.d$a */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.exerciserecords.view.ExerciseRecordsMiniArchScreenKt$ExerciseRecordsMiniArchScreen$2$1", m100430f = "ExerciseRecordsMiniArchScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f114596w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<C27177c, InterfaceC27175a.d> f114597x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C28401e f114598y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC23864c<C27177c, InterfaceC27175a.d> abstractC23864c, C28401e c28401e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f114597x = abstractC23864c;
            this.f114598y = c28401e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f114597x, this.f114598y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f114596w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f114597x.mo1216g(new InterfaceC27175a.a(this.f114598y.getPath()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m86106i(Modifier modifier, final C27177c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        final Function1 function3;
        Function1 function4;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1583999670);
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
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C27644e(29);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            if (viewState.getMiniArchModal() != null) {
                c28655q.m87150e0(128697504);
                C12611c c12611cM81755c = viewState.getMiniArchModal().getState();
                int i18 = i15 & 896;
                boolean zM87157i = c28655q.m87157i(viewState) | (i18 == 256);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    final int i19 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: ov2.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return AbstractC28400d.m86114q(viewState, function3);
                                default:
                                    return AbstractC28400d.m86115r(viewState, function3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                boolean zM87157i2 = c28655q.m87157i(viewState) | (i18 == 256);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    final int i24 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: ov2.c
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    return AbstractC28400d.m86114q(viewState, function3);
                                default:
                                    return AbstractC28400d.m86115r(viewState, function3);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC12610b.m35349f(c12611cM81755c, interfaceC4339a, (InterfaceC4339a) objM87133R3, c28655q, C12611c.f43049g, 0);
                c28655q.m87173q(false);
                function4 = function3;
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(129078401);
                C28397a c28397aM81756a = viewState.getScreenContent().getListViewState();
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier);
                int i25 = i15 & 896;
                boolean zM87157i3 = c28655q.m87157i(c28397aM81756a) | (i25 == 256);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i3 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C25592o(29, function3, c28397aM81756a);
                    c28655q.m87172p0(objM87133R4);
                }
                function4 = function3;
                AbstractC28403g.m86123d(modifierM3409f, c28397aM81756a, function4, (InterfaceC4339a) objM87133R4, c28655q, i25, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                function4 = function3;
                c28655q.m87150e0(129648460);
                c28655q.m87173q(false);
            }
            function2 = function4;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(modifier2, viewState, function2, i13, i14, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028b  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x014b  */
    /* JADX WARN: Code duplicated, block: B:68:0x015c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0174  */
    /* JADX WARN: Code duplicated, block: B:71:0x0179  */
    /* JADX WARN: Code duplicated, block: B:75:0x0191  */
    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x022c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0254  */
    /* JADX WARN: Code duplicated, block: B:91:0x0256  */
    /* JADX WARN: Code duplicated, block: B:95:0x0260  */
    /* JADX WARN: Code duplicated, block: B:97:0x0281  */
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
    /* JADX INFO: renamed from: j */
    public static final void m86107j(Modifier modifier, C28401e state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        C27177c c27177cM86119c;
        String strM86118b;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R;
        AbstractC23864c abstractC23864c;
        AbstractC23864c abstractC23864c2;
        C35247e c35247e;
        Application application2;
        String strM81750a;
        boolean zM87153g2;
        Object objM87133R2;
        C24763a c24763a;
        boolean zM87157i;
        Object objM87133R3;
        boolean z13;
        boolean z14;
        Object objM87133R4;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application3;
        boolean zM87153g3;
        Object objM87133R5;
        Object obj;
        boolean zM87153g4;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(500543375);
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
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i16 != 0) {
                    modifier3 = C2314t.f9131w;
                } else {
                    modifier3 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C27644e(28);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function4 = (Function1) objM87133R7;
                } else {
                    function4 = function2;
                }
                c27177cM86119c = state.getViewState();
                strM86118b = state.getPath();
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(strM86118b) | c28655q.m87153g(c27177cM86119c) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == c28676v0) {
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c27177cM86119c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27176b.class), null, strM86118b);
                        c28655q.m87172p0(objM87133R);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
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
                        application3 = (Application) applicationContext2;
                        zM87153g3 = c28655q.m87153g(strM86118b) | c28655q.m87153g(c27177cM86119c) | c28655q.m87153g(null);
                        objM87133R5 = c28655q.m87133R();
                        if (!zM87153g3 || objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC23865d.m70117b(application3, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27176b.class), null, new C23863b(c27177cM86119c), strM86118b);
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
                        zM87153g4 = c28655q.m87153g(strM86118b) | c28655q.m87153g(c27177cM86119c) | c28655q.m87153g(obj);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g4 || objM87133R6 == c28676v0) {
                            objM87133R6 = new C23863b(c27177cM86119c);
                            c28655q.m87172p0(objM87133R6);
                        }
                        abstractC23864c = (C23863b) objM87133R6;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                abstractC23864c2 = abstractC23864c;
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c2.getViewState(), state.getViewState(), null, c28655q, 0, 2);
                c35247e = (C35247e) c28655q.m87161k(AbstractC35249f.m111700c());
                Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                application2 = (Application) applicationContext3;
                strM81750a = m86109l(interfaceC28601c1M87260n).getAnalyticsActionFromApi();
                if (strM81750a == null) {
                    strM81750a = state.getAnalyticsActionFromBackend();
                }
                zM87153g2 = c28655q.m87153g(state.getPath()) | c28655q.m87153g(strM81750a) | c28655q.m87153g(application2);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2 || objM87133R2 == c28676v0) {
                    objM87133R2 = (C24763a) AbstractC34924m.m110120B(application2).f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24763a.class), null);
                    c28655q.m87172p0(objM87133R2);
                }
                c24763a = (C24763a) objM87133R2;
                String strM86118b2 = state.getPath();
                zM87157i = c28655q.m87157i(abstractC23864c2) | c28655q.m87157i(state);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new a(abstractC23864c2, state, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87254h(strM86118b2, abstractC23864c2, (InterfaceC4351m) objM87133R3, c28655q);
                C27177c c27177cM86109l = m86109l(interfaceC28601c1M87260n);
                boolean zM87157i2 = c28655q.m87157i(c24763a) | c28655q.m87153g(c35247e) | c28655q.m87157i(abstractC23864c2) | c28655q.m87153g(strM81750a);
                if ((i15 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i2 | z13;
                objM87133R4 = c28655q.m87133R();
                if (z14 || objM87133R4 == c28676v0) {
                    C1040r c1040r = new C1040r((Object) c24763a, (Object) c35247e, (Object) abstractC23864c2, (Object) strM81750a, function4, 29);
                    c28655q.m87172p0(c1040r);
                    objM87133R4 = c1040r;
                }
                Modifier modifier4 = modifier3;
                m86106i(modifier4, c27177cM86109l, (Function1) objM87133R4, c28655q, i15 & 14, 0);
                modifier2 = modifier4;
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(modifier2, state, function3, i13, i14, 1);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i16 != 0) {
                modifier3 = C2314t.f9131w;
            } else {
                modifier3 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C27644e(28);
                    c28655q.m87172p0(objM87133R7);
                }
                function4 = (Function1) objM87133R7;
            } else {
                function4 = function2;
            }
            c27177cM86119c = state.getViewState();
            strM86118b = state.getPath();
            c28655q.m87150e0(1371609227);
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
                    Context applicationContext4 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext4, "null cannot be cast to non-null type android.app.Application");
                    application3 = (Application) applicationContext4;
                    zM87153g3 = c28655q.m87153g(strM86118b) | c28655q.m87153g(c27177cM86119c) | c28655q.m87153g(null);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R5 = AbstractC23865d.m70117b(application3, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27176b.class), null, new C23863b(c27177cM86119c), strM86118b);
                        obj = null;
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = AbstractC23865d.m70117b(application3, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27176b.class), null, new C23863b(c27177cM86119c), strM86118b);
                        obj = null;
                        c28655q.m87172p0(objM87133R5);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R5;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g4 = c28655q.m87153g(strM86118b) | c28655q.m87153g(c27177cM86119c) | c28655q.m87153g(obj);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g4) {
                        objM87133R6 = new C23863b(c27177cM86119c);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C23863b(c27177cM86119c);
                        c28655q.m87172p0(objM87133R6);
                    }
                    abstractC23864c = (C23863b) objM87133R6;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = c28655q.m87153g(strM86118b) | c28655q.m87153g(c27177cM86119c) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c27177cM86119c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27176b.class), null, strM86118b);
                    c28655q.m87172p0(objM87133R);
                } else {
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c27177cM86119c, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27176b.class), null, strM86118b);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
            }
            c28655q.m87173q(false);
            abstractC23864c2 = abstractC23864c;
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(abstractC23864c2.getViewState(), state.getViewState(), null, c28655q, 0, 2);
            c35247e = (C35247e) c28655q.m87161k(AbstractC35249f.m111700c());
            Context applicationContext5 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
            AbstractC22676k.m65748h(applicationContext5, "null cannot be cast to non-null type android.app.Application");
            application2 = (Application) applicationContext5;
            strM81750a = m86109l(interfaceC28601c1M87260n2).getAnalyticsActionFromApi();
            if (strM81750a == null) {
                strM81750a = state.getAnalyticsActionFromBackend();
            }
            zM87153g2 = c28655q.m87153g(state.getPath()) | c28655q.m87153g(strM81750a) | c28655q.m87153g(application2);
            objM87133R2 = c28655q.m87133R();
            if (zM87153g2) {
                objM87133R2 = (C24763a) AbstractC34924m.m110120B(application2).f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24763a.class), null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = (C24763a) AbstractC34924m.m110120B(application2).f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C24763a.class), null);
                c28655q.m87172p0(objM87133R2);
            }
            c24763a = (C24763a) objM87133R2;
            String strM86118b3 = state.getPath();
            zM87157i = c28655q.m87157i(abstractC23864c2) | c28655q.m87157i(state);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R3 = new a(abstractC23864c2, state, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new a(abstractC23864c2, state, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87254h(strM86118b3, abstractC23864c2, (InterfaceC4351m) objM87133R3, c28655q);
            C27177c c27177cM86109l2 = m86109l(interfaceC28601c1M87260n2);
            boolean zM87157i3 = c28655q.m87157i(c24763a) | c28655q.m87153g(c35247e) | c28655q.m87157i(abstractC23864c2) | c28655q.m87153g(strM81750a);
            if ((i15 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i3 | z13;
            objM87133R4 = c28655q.m87133R();
            if (z14) {
                C1040r c1040r2 = new C1040r((Object) c24763a, (Object) c35247e, (Object) abstractC23864c2, (Object) strM81750a, function4, 29);
                c28655q.m87172p0(c1040r2);
                objM87133R4 = c1040r2;
            } else {
                C1040r c1040r3 = new C1040r((Object) c24763a, (Object) c35247e, (Object) abstractC23864c2, (Object) strM81750a, function4, 29);
                c28655q.m87172p0(c1040r3);
                objM87133R4 = c1040r3;
            }
            Modifier modifier5 = modifier3;
            m86106i(modifier5, c27177cM86109l2, (Function1) objM87133R4, c28655q, i15 & 14, 0);
            modifier2 = modifier5;
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(modifier2, state, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m86108k(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final C27177c m86109l(InterfaceC28670t2 interfaceC28670t2) {
        return (C27177c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m86110m(Modifier modifier, C27177c c27177c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m86106i(modifier, c27177c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m86111n(C24763a c24763a, C35247e c35247e, AbstractC23864c abstractC23864c, String str, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC27175a.d) {
            if (event instanceof InterfaceC27175a.c) {
                c24763a.m72506b(c35247e);
            }
            abstractC23864c.mo1216g(event);
        } else if (event instanceof C28701b) {
            c24763a.m72505a(((C28701b) event).getExpanded(), c35247e, str);
            function1.invoke(event);
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m86112o(Modifier modifier, C28401e c28401e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m86107j(modifier, c28401e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m86113p(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m86114q(C27177c c27177c, Function1 function1) {
        InterfaceC27175a interfaceC27175aM81753a = c27177c.getMiniArchModal().getPrimaryClickEvent();
        if (interfaceC27175aM81753a != null) {
            function1.invoke(interfaceC27175aM81753a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m86115r(C27177c c27177c, Function1 function1) {
        InterfaceC27175a interfaceC27175aM81754b = c27177c.getMiniArchModal().getSecondaryClickEvent();
        if (interfaceC27175aM81754b != null) {
            function1.invoke(interfaceC27175aM81754b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m86116s(Function1 function1, C28397a c28397a) {
        function1.invoke(new InterfaceC27175a.c(c28397a.getPath(), c28397a.getNextStartDate()));
        return C23454a0.f92919a;
    }
}
