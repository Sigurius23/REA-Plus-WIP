package km2;

import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import hm2.C17426a;
import im2.C18711b;
import im2.C18712c;
import im2.InterfaceC18710a;
import jp1.C21852d;
import js2.C21930h;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import nf3.C26669a;
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
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import x81.C38072d;
import xf3.C38266c;

/* JADX INFO: renamed from: km2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkm2/g;", "state", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Landroidx/compose/ui/Modifier;Lkm2/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lim2/c;", "viewState", "Lim2/a;", "onEvent", "f", "(Landroidx/compose/ui/Modifier;Lim2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lhm2/a;", "actionRouter", "trends-mini-arch_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22595f {

    /* JADX INFO: renamed from: km2.f$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f88911w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f88912x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f88913y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f88911w = c38266c;
            this.f88912x = interfaceC35951a;
            this.f88913y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [hm2.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C17426a invoke() {
            return this.f88911w.m122602a(this.f88913y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17426a.class), this.f88912x);
        }
    }

    /* JADX INFO: renamed from: km2.f$b */
    @InterfaceC32271e(m100429c = "com.whoop.trendsminiarch.view.TrendsMiniArchScreenKt$TrendsMiniArchScreen$2$1", m100430f = "TrendsMiniArchScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f88914w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C18711b f88915x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C22596g f88916y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C18711b c18711b, C22596g c22596g, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f88915x = c18711b;
            this.f88916y = c22596g;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f88915x, this.f88916y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f88914w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f88915x.mo1216g(new InterfaceC18710a.e(this.f88916y.getPath()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m65519f(Modifier modifier, C18712c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        Function1 function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1306052225);
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
            Modifier modifier3 = modifier;
            if (i17 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C22594e(0);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function3 = function1;
            if (viewState.getMiniArchModal() != null) {
                c28655q.m87150e0(985744492);
                AbstractC22591b.m65485e(viewState.getMiniArchModal(), function3, c28655q, (i15 >> 3) & 112);
                c28655q.m87173q(false);
            } else if (viewState.getScreenContent() != null) {
                c28655q.m87150e0(493427873);
                AbstractC22592c.m65503n(modifier3, viewState.getScreenContent(), function3, c28655q, i15 & 910, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(493556833);
                c28655q.m87173q(false);
            }
            modifier2 = modifier3;
            function2 = function3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(modifier2, viewState, function2, i13, i14, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0257  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:69:0x0172  */
    /* JADX WARN: Code duplicated, block: B:71:0x0181  */
    /* JADX WARN: Code duplicated, block: B:74:0x0191  */
    /* JADX WARN: Code duplicated, block: B:76:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:86:0x0206  */
    /* JADX WARN: Code duplicated, block: B:89:0x0226  */
    /* JADX WARN: Code duplicated, block: B:93:0x0230  */
    /* JADX WARN: Code duplicated, block: B:95:0x0245  */
    /* JADX WARN: Code duplicated, block: B:97:0x024d  */
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
    public static final void m65520g(Modifier modifier, C22596g state, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        C26669a c26669a;
        C38266c c38266c;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23462h interfaceC23462h;
        C18712c viewState;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g2;
        Object objM87133R2;
        AbstractC23864c abstractC23864c;
        C18711b c18711b;
        boolean zM87157i;
        Object objM87133R3;
        boolean zM87157i2;
        Object objM87133R4;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g3;
        Object objM87133R5;
        Object obj;
        Object obj2;
        boolean zM87153g4;
        Object objM87133R6;
        Object objM87133R7;
        AbstractC22676k.m65750j(state, "state");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(11549850);
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
                        objM87133R7 = new C22594e(1);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function4 = (Function1) objM87133R7;
                } else {
                    function4 = function2;
                }
                c28655q.m87152f0(1903845737);
                c26669a = C29155a.f118017b;
                if (c26669a != null) {
                    throw new IllegalStateException("KoinApplication has not been started");
                }
                c38266c = c26669a.f106046a.f159364d;
                c28655q.m87152f0(-3686552);
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                interfaceC23462h = (InterfaceC23462h) objM87133R;
                c28655q.m87173q(false);
                viewState = state.getViewState();
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(viewState) | c28655q.m87153g(null);
                    objM87133R2 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, viewState, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18711b.class), null, null);
                        c28655q.m87172p0(objM87133R2);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R2;
                } else {
                    c28655q.m87150e0(-707976188);
                    interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj2 = null;
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                        application2 = (Application) applicationContext2;
                        zM87153g3 = c28655q.m87153g(null) | c28655q.m87153g(viewState) | c28655q.m87153g(null);
                        objM87133R5 = c28655q.m87133R();
                        if (!zM87153g3 || objM87133R5 == c28676v0) {
                            objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18711b.class), null, new C23863b(viewState), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            obj2 = null;
                            obj = null;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R5;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g4 = c28655q.m87153g(obj2) | c28655q.m87153g(viewState) | c28655q.m87153g(obj);
                        objM87133R6 = c28655q.m87133R();
                        if (zM87153g4 || objM87133R6 == c28676v0) {
                            objM87133R6 = new C23863b(viewState);
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
                AbstractC22676k.m65748h(abstractC23864c, "null cannot be cast to non-null type com.whoop.trendsminiarch.presentation.TrendsMiniArchViewModel");
                c18711b = (C18711b) abstractC23864c;
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(c18711b.getViewState(), state.getViewState(), null, c28655q, 0, 2);
                zM87157i = c28655q.m87157i(c18711b) | c28655q.m87157i(state);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i || objM87133R3 == c28676v0) {
                    objM87133R3 = new b(c18711b, state, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c18711b);
                C18712c c18712cM65523j = m65523j(interfaceC28601c1M87260n);
                zM87157i2 = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(c18711b) | ((i15 & 896) == 256);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C21930h(c18711b, function4, interfaceC23462h, 4);
                    c28655q.m87172p0(objM87133R4);
                }
                Modifier modifier4 = modifier3;
                m65519f(modifier4, c18712cM65523j, (Function1) objM87133R4, c28655q, i15 & 14, 0);
                modifier2 = modifier4;
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C21852d(modifier2, state, function3, i13, i14, 18);
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
                    objM87133R7 = new C22594e(1);
                    c28655q.m87172p0(objM87133R7);
                }
                function4 = (Function1) objM87133R7;
            } else {
                function4 = function2;
            }
            c28655q.m87152f0(1903845737);
            c26669a = C29155a.f118017b;
            if (c26669a != null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            c38266c = c26669a.f106046a.f159364d;
            c28655q.m87152f0(-3686552);
            zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            viewState = state.getViewState();
            c28655q.m87150e0(1371609227);
            if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                c28655q.m87150e0(-707976188);
                interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                if (interfaceC1583f2M73844a == null) {
                    c28655q.m87150e0(-707931115);
                    c28655q.m87173q(false);
                    obj2 = null;
                    obj = null;
                    abstractC23864c = null;
                } else {
                    c28655q.m87150e0(-707931114);
                    Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext3;
                    zM87153g3 = c28655q.m87153g(null) | c28655q.m87153g(viewState) | c28655q.m87153g(null);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18711b.class), null, new C23863b(viewState), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18711b.class), null, new C23863b(viewState), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R5);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R5;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g4 = c28655q.m87153g(obj2) | c28655q.m87153g(viewState) | c28655q.m87153g(obj);
                    objM87133R6 = c28655q.m87133R();
                    if (zM87153g4) {
                        objM87133R6 = new C23863b(viewState);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C23863b(viewState);
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
                zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(viewState) | c28655q.m87153g(null);
                objM87133R2 = c28655q.m87133R();
                if (zM87153g2) {
                    objM87133R2 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, viewState, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18711b.class), null, null);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, viewState, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18711b.class), null, null);
                    c28655q.m87172p0(objM87133R2);
                }
                abstractC23864c = (AbstractC23864c) objM87133R2;
            }
            c28655q.m87173q(false);
            AbstractC22676k.m65748h(abstractC23864c, "null cannot be cast to non-null type com.whoop.trendsminiarch.presentation.TrendsMiniArchViewModel");
            c18711b = (C18711b) abstractC23864c;
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(c18711b.getViewState(), state.getViewState(), null, c28655q, 0, 2);
            zM87157i = c28655q.m87157i(c18711b) | c28655q.m87157i(state);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R3 = new b(c18711b, state, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new b(c18711b, state, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c18711b);
            C18712c c18712cM65523j2 = m65523j(interfaceC28601c1M87260n2);
            zM87157i2 = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(c18711b) | ((i15 & 896) == 256);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R4 = new C21930h(c18711b, function4, interfaceC23462h, 4);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C21930h(c18711b, function4, interfaceC23462h, 4);
                c28655q.m87172p0(objM87133R4);
            }
            Modifier modifier5 = modifier3;
            m65519f(modifier5, c18712cM65523j2, (Function1) objM87133R4, c28655q, i15 & 14, 0);
            modifier2 = modifier5;
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21852d(modifier2, state, function3, i13, i14, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m65521h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final C17426a m65522i(InterfaceC23462h interfaceC23462h) {
        return (C17426a) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: j */
    private static final C18712c m65523j(InterfaceC28670t2 interfaceC28670t2) {
        return (C18712c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m65524k(C18711b c18711b, Function1 function1, InterfaceC23462h interfaceC23462h, InterfaceC18710a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC18710a interfaceC18710aM49458b = m65522i(interfaceC23462h).m49458b(event);
        if (interfaceC18710aM49458b instanceof InterfaceC18710a.f) {
            c18711b.mo1216g((InterfaceC18710a.f) interfaceC18710aM49458b);
        } else if (interfaceC18710aM49458b instanceof InterfaceC18710a.c) {
            function1.invoke(interfaceC18710aM49458b);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m65525l(Modifier modifier, C22596g c22596g, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m65520g(modifier, c22596g, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m65526m(InterfaceC18710a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m65527n(Modifier modifier, C18712c c18712c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m65519f(modifier, c18712c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
