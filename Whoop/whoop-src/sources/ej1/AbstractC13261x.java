package ej1;

import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import cj1.AbstractC4754j;
import cj1.AbstractC4756l;
import cj1.C4755k;
import com.whoop.profile.view.edit.C9790n;
import e11.C12582b;
import l83.C23454a0;
import l83.InterfaceC23459e;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
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
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x81.C38072d;

/* JADX INFO: renamed from: ej1.x */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lej1/y;", "wrapperViewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Lej1/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lcj1/l;", "miniArchViewState", "k", "(Landroidx/compose/ui/Modifier;Lcj1/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "health_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13261x {

    /* JADX INFO: renamed from: ej1.x$a */
    @InterfaceC32271e(m100429c = "com.whoop.health.view.HealthspanHeroMetricWrapperKt$HealthspanHeroMetricWrapper$2$1", m100430f = "HealthspanHeroMetricWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f45917w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4755k f45918x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13262y f45919y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C4755k c4755k, C13262y c13262y, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f45918x = c4755k;
            this.f45919y = c13262y;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f45918x, this.f45919y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f45917w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f45918x.mo1216g(new AbstractC4754j.b(this.f45919y.getViewState()));
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x0113  */
    /* JADX WARN: Code duplicated, block: B:63:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:67:0x014b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0164  */
    /* JADX WARN: Code duplicated, block: B:70:0x0169  */
    /* JADX WARN: Code duplicated, block: B:76:0x0180  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01da  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0207  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
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
    /* JADX INFO: renamed from: f */
    public static final void m37308f(Modifier modifier, C13262y wrapperViewState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        Modifier modifier4;
        C28676v0 c28676v0;
        Function1 function3;
        AbstractC4756l.a aVar;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R;
        AbstractC4756l.a aVar2;
        AbstractC23864c abstractC23864c;
        C4755k c4755k;
        boolean zM87157i;
        Object objM87133R2;
        boolean zM87157i2;
        Object objM87133R3;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g2;
        Object objM87133R4;
        Object obj;
        Object obj2;
        boolean zM87153g3;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(wrapperViewState, "wrapperViewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(406374902);
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
            i15 |= c28655q.m87157i(wrapperViewState) ? 32 : 16;
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
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                c28676v0 = C28635l.f115821a;
                if (i17 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C13251n(6);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function3 = (Function1) objM87133R6;
                } else {
                    function3 = function2;
                }
                aVar = AbstractC4756l.a.f19605a;
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (!zM87153g || objM87133R == c28676v0) {
                        aVar2 = aVar;
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, aVar2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4755k.class), null, null);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        aVar2 = aVar;
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R;
                    c28655q.m87173q(false);
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
                        zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(null);
                        objM87133R4 = c28655q.m87133R();
                        if (!zM87153g2 || objM87133R4 == c28676v0) {
                            objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4755k.class), null, new C23863b(aVar), null);
                            obj = null;
                            obj2 = null;
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            obj = null;
                            obj2 = null;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R4;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(obj);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87153g3 || objM87133R5 == c28676v0) {
                            objM87133R5 = new C23863b(aVar);
                            c28655q.m87172p0(objM87133R5);
                        }
                        abstractC23864c = (C23863b) objM87133R5;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                    aVar2 = aVar;
                }
                AbstractC22676k.m65748h(abstractC23864c, "null cannot be cast to non-null type com.whoop.health.presentation.HealthspanHeroMetricMiniArchViewModel");
                c4755k = (C4755k) abstractC23864c;
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(c4755k.getViewState(), aVar2, null, c28655q, 48, 2);
                zM87157i = c28655q.m87157i(c4755k) | c28655q.m87157i(wrapperViewState);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new a(c4755k, wrapperViewState, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c4755k);
                AbstractC4756l abstractC4756lM37310h = m37310h(interfaceC28601c1M87260n);
                zM87157i2 = c28655q.m87157i(c4755k) | ((i15 & 896) == 256);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C9790n(16, c4755k, function3);
                    c28655q.m87172p0(objM87133R3);
                }
                Modifier modifier5 = modifier4;
                m37313k(modifier5, abstractC4756lM37310h, (Function1) objM87133R3, c28655q, i15 & 14, 0);
                function2 = function3;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C12582b(i13, i14, 9, (Object) modifier3, (Object) wrapperViewState, (InterfaceC23459e) function2);
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
                modifier4 = C2314t.f9131w;
            } else {
                modifier4 = modifier2;
            }
            c28676v0 = C28635l.f115821a;
            if (i17 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C13251n(6);
                    c28655q.m87172p0(objM87133R6);
                }
                function3 = (Function1) objM87133R6;
            } else {
                function3 = function2;
            }
            aVar = AbstractC4756l.a.f19605a;
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
                    zM87153g2 = c28655q.m87153g(null) | c28655q.m87153g(null);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4755k.class), null, new C23863b(aVar), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4755k.class), null, new C23863b(aVar), null);
                        obj = null;
                        obj2 = null;
                        c28655q.m87172p0(objM87133R4);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R4;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g3 = c28655q.m87153g(obj2) | c28655q.m87153g(obj);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R5 = new C23863b(aVar);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C23863b(aVar);
                        c28655q.m87172p0(objM87133R5);
                    }
                    abstractC23864c = (C23863b) objM87133R5;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
                aVar2 = aVar;
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    aVar2 = aVar;
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, aVar2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4755k.class), null, null);
                    c28655q.m87172p0(objM87133R);
                } else {
                    aVar2 = aVar;
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, aVar2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4755k.class), null, null);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
                c28655q.m87173q(false);
            }
            AbstractC22676k.m65748h(abstractC23864c, "null cannot be cast to non-null type com.whoop.health.presentation.HealthspanHeroMetricMiniArchViewModel");
            c4755k = (C4755k) abstractC23864c;
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(c4755k.getViewState(), aVar2, null, c28655q, 48, 2);
            zM87157i = c28655q.m87157i(c4755k) | c28655q.m87157i(wrapperViewState);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new a(c4755k, wrapperViewState, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(c4755k, wrapperViewState, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c4755k);
            AbstractC4756l abstractC4756lM37310h2 = m37310h(interfaceC28601c1M87260n2);
            zM87157i2 = c28655q.m87157i(c4755k) | ((i15 & 896) == 256);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R3 = new C9790n(16, c4755k, function3);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C9790n(16, c4755k, function3);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifier6 = modifier4;
            m37313k(modifier6, abstractC4756lM37310h2, (Function1) objM87133R3, c28655q, i15 & 14, 0);
            function2 = function3;
            modifier3 = modifier6;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 9, (Object) modifier3, (Object) wrapperViewState, (InterfaceC23459e) function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m37309g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final AbstractC4756l m37310h(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC4756l) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m37311i(C4755k c4755k, Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC4754j) {
            c4755k.mo1216g((AbstractC4754j) event);
        } else {
            function1.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m37312j(Modifier modifier, C13262y c13262y, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m37308f(modifier, c13262y, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    public static final void m37313k(Modifier modifier, AbstractC4756l miniArchViewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Modifier modifier2;
        AbstractC22676k.m65750j(miniArchViewState, "miniArchViewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-750874205);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(miniArchViewState) ? 32 : 16;
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
                    objM87133R = new C13251n(7);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function3 = function1;
            if (miniArchViewState.equals(AbstractC4756l.a.f19605a)) {
                c28655q.m87150e0(-1103500364);
                c28655q.m87173q(false);
                modifier2 = modifier;
            } else {
                if (!(miniArchViewState instanceof AbstractC4756l.b)) {
                    throw AbstractC11895b.m32003v(-35599132, c28655q, false);
                }
                c28655q.m87150e0(-1103423360);
                modifier2 = modifier;
                AbstractC13259v.m37290h(modifier2, ((AbstractC4756l.b) miniArchViewState).getState(), function3, c28655q, i15 & 910, 0);
                c28655q.m87173q(false);
            }
            modifier = modifier2;
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12582b(i13, i14, 10, (Object) modifier, (Object) miniArchViewState, (InterfaceC23459e) function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m37314l(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m37315m(Modifier modifier, AbstractC4756l abstractC4756l, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m37313k(modifier, abstractC4756l, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
