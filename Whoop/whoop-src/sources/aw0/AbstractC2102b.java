package aw0;

import a01.C0084d;
import a01.C0085e;
import android.app.Application;
import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import kotlin.C1991b1;
import l83.C23454a0;
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
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25306o;
import p720m91.InterfaceC25312u;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x81.C38072d;
import yv0.AbstractC39801d;
import yv0.C39798a;
import yv0.C39800c;
import yv0.InterfaceC39799b;

/* JADX INFO: renamed from: aw0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lyv0/a;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "g", "(Landroidx/compose/ui/Modifier;Lyv0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lyv0/d;", "viewState", "l", "(Landroidx/compose/ui/Modifier;Lyv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "core-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2102b {

    /* JADX INFO: renamed from: aw0.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.core.details.activitytargets.view.ActivityDetailsTargetsMiniArchWrapperKt$ActivityDetailsTargetsMiniArchWrapper$2$1", m100430f = "ActivityDetailsTargetsMiniArchWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f8337w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<AbstractC39801d, InterfaceC39799b> f8338x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39798a f8339y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC23864c<AbstractC39801d, InterfaceC39799b> abstractC23864c, C39798a c39798a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f8338x = abstractC23864c;
            this.f8339y = c39798a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f8338x, this.f8339y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f8337w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f8338x.mo1216g(new InterfaceC39799b.a(this.f8339y.getPath()));
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
    /* JADX WARN: Code duplicated, block: B:46:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114  */
    /* JADX WARN: Code duplicated, block: B:63:0x012b  */
    /* JADX WARN: Code duplicated, block: B:65:0x013a  */
    /* JADX WARN: Code duplicated, block: B:67:0x014c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0164  */
    /* JADX WARN: Code duplicated, block: B:70:0x0169  */
    /* JADX WARN: Code duplicated, block: B:76:0x0180  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01be  */
    /* JADX WARN: Code duplicated, block: B:86:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
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
    public static final void m6639g(Modifier modifier, C39798a itemState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        Modifier modifier3;
        C28676v0 c28676v0;
        Function1 function4;
        AbstractC39801d.c cVar;
        String id4;
        InterfaceC1583f2 interfaceC1583f2M30452f;
        Context applicationContext;
        Application application;
        boolean zM87153g;
        Object objM87133R;
        AbstractC39801d.c cVar2;
        AbstractC23864c abstractC23864c;
        boolean zM87157i;
        Object objM87133R2;
        InterfaceC1583f2 interfaceC1583f2M73844a;
        Application application2;
        boolean zM87153g2;
        Object objM87133R3;
        Object obj;
        boolean zM87153g3;
        Object objM87133R4;
        Object objM87133R5;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-887313974);
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
            i15 |= c28655q.m87153g(itemState) ? 32 : 16;
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
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C1991b1(12);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function4 = (Function1) objM87133R5;
                } else {
                    function4 = function2;
                }
                cVar = AbstractC39801d.c.f171525a;
                id4 = itemState.getId();
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                    } else {
                        application = null;
                    }
                    zM87153g = c28655q.m87153g(id4) | c28655q.m87153g(null);
                    objM87133R = c28655q.m87133R();
                    if (!zM87153g || objM87133R == c28676v0) {
                        cVar2 = cVar;
                        objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, cVar2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39800c.class), null, id4);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        cVar2 = cVar;
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
                        zM87153g2 = c28655q.m87153g(id4) | c28655q.m87153g(null);
                        objM87133R3 = c28655q.m87133R();
                        if (!zM87153g2 || objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39800c.class), null, new C23863b(cVar), id4);
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
                        zM87153g3 = c28655q.m87153g(id4) | c28655q.m87153g(obj);
                        objM87133R4 = c28655q.m87133R();
                        if (zM87153g3 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C23863b(cVar);
                            c28655q.m87172p0(objM87133R4);
                        }
                        abstractC23864c = (C23863b) objM87133R4;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                    cVar2 = cVar;
                }
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), cVar2, null, c28655q, 48, 2);
                String id5 = itemState.getId();
                zM87157i = c28655q.m87157i(abstractC23864c) | ((i15 & 112) == 32);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new a(abstractC23864c, itemState, null);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, id5);
                AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(AbstractC2112l.m6676h()), AbstractC37817c.m121344e(616296074, c28655q, new C0084d((Object) modifier3, function4, (Object) interfaceC28601c1M87260n, 1)), c28655q, 56);
                modifier2 = modifier3;
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0085e(modifier2, itemState, function3, i13, i14, 8);
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
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C1991b1(12);
                    c28655q.m87172p0(objM87133R5);
                }
                function4 = (Function1) objM87133R5;
            } else {
                function4 = function2;
            }
            cVar = AbstractC39801d.c.f171525a;
            id4 = itemState.getId();
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
                    Context applicationContext3 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    AbstractC22676k.m65748h(applicationContext3, "null cannot be cast to non-null type android.app.Application");
                    application2 = (Application) applicationContext3;
                    zM87153g2 = c28655q.m87153g(id4) | c28655q.m87153g(null);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g2) {
                        objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39800c.class), null, new C23863b(cVar), id4);
                        obj = null;
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39800c.class), null, new C23863b(cVar), id4);
                        obj = null;
                        c28655q.m87172p0(objM87133R3);
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R3;
                    c28655q.m87173q(false);
                }
                if (abstractC23864c == null) {
                    c28655q.m87150e0(-707430526);
                    zM87153g3 = c28655q.m87153g(id4) | c28655q.m87153g(obj);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87153g3) {
                        objM87133R4 = new C23863b(cVar);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C23863b(cVar);
                        c28655q.m87172p0(objM87133R4);
                    }
                    abstractC23864c = (C23863b) objM87133R4;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-438479417);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
                cVar2 = cVar;
            } else {
                interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                } else {
                    application = null;
                }
                zM87153g = c28655q.m87153g(id4) | c28655q.m87153g(null);
                objM87133R = c28655q.m87133R();
                if (zM87153g) {
                    cVar2 = cVar;
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, cVar2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39800c.class), null, id4);
                    c28655q.m87172p0(objM87133R);
                } else {
                    cVar2 = cVar;
                    objM87133R = AbstractC23865d.m70119d(interfaceC1583f2M30452f, cVar2, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39800c.class), null, id4);
                    c28655q.m87172p0(objM87133R);
                }
                abstractC23864c = (AbstractC23864c) objM87133R;
                c28655q.m87173q(false);
            }
            InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(abstractC23864c.getViewState(), cVar2, null, c28655q, 48, 2);
            String id6 = itemState.getId();
            zM87157i = c28655q.m87157i(abstractC23864c) | ((i15 & 112) == 32);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new a(abstractC23864c, itemState, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(abstractC23864c, itemState, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, id6);
            AbstractC28683x.m87247a(AbstractC25303l.m74272C().mo86977a(AbstractC2112l.m6676h()), AbstractC37817c.m121344e(616296074, c28655q, new C0084d((Object) modifier3, function4, (Object) interfaceC28601c1M87260n2, 1)), c28655q, 56);
            modifier2 = modifier3;
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(modifier2, itemState, function3, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m6640h(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final AbstractC39801d m6641i(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC39801d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m6642j(Modifier modifier, Function1 function1, InterfaceC28670t2 interfaceC28670t2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m6644l(modifier, m6641i(interfaceC28670t2), function1, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m6643k(Modifier modifier, C39798a c39798a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m6639g(modifier, c39798a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m6644l(Modifier modifier, AbstractC39801d viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(140899134);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(viewState) ? 32 : 16;
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
                    objM87133R = new C1991b1(13);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            Function1 function3 = function1;
            if (viewState.equals(AbstractC39801d.c.f171525a) || viewState.equals(AbstractC39801d.a.f171522a)) {
                c28655q.m87150e0(-2034869758);
                c28655q.m87173q(false);
            } else {
                if (!(viewState instanceof AbstractC39801d.b)) {
                    throw AbstractC11895b.m32003v(-2034879247, c28655q, false);
                }
                c28655q.m87150e0(-2034867473);
                AbstractC25303l.m74290q(((AbstractC39801d.b) viewState).getItem(), null, new C2101a(0, modifier), function3, c28655q, C25306o.f99297c | ((i15 << 3) & 7168), 2);
                c28655q.m87173q(false);
            }
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0085e(modifier2, viewState, function2, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m6645m(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final Modifier m6646n(Modifier modifier, InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1317894291);
        c28655q.m87173q(false);
        return modifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m6647o(Modifier modifier, AbstractC39801d abstractC39801d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m6644l(modifier, abstractC39801d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
