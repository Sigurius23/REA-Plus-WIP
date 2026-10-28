package i31;

import a41.C0374j;
import android.app.Application;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.InterfaceC1583f2;
import b03.C2205b;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.whoopaction.domain.models.UpdateAction;
import ge3.AbstractC15751g;
import gy0.AbstractC16277f;
import h02.C16587n0;
import h31.AbstractC16827t;
import h31.C16825r;
import l83.C23454a0;
import ld1.AbstractC23864c;
import ld1.AbstractC23865d;
import ld1.C23863b;
import p000.AbstractC11266d;
import p026b2.C2314t;
import p027b3.AbstractC2399k2;
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
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: i31.h */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Li31/g;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "i", "(Landroidx/compose/ui/Modifier;Li31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "showError", "Lkotlin/Function0;", "onShown", "g", "(ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "Li31/d;", "viewState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC18053h {

    /* JADX INFO: renamed from: i31.h$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.recommendationtileheader.RecommendationTileHeaderWrapperKt$CompletionErrorToast$1$1", m100430f = "RecommendationTileHeaderWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f70094w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Context f70095x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f70096y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f70097z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f70095x = context;
            this.f70096y = str;
            this.f70097z = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f70095x, this.f70096y, this.f70097z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f70094w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Toast.makeText(this.f70095x, this.f70096y, 1).show();
            this.f70097z.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: g */
    private static final void m51858g(boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1934828401);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87155h(z4) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62325f2);
            if (z4) {
                c28655q.m87150e0(-2011577114);
                boolean zM87157i = c28655q.m87157i(context) | c28655q.m87153g(strM92103Y) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new a(context, strM92103Y, interfaceC4339a, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2011441613);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0374j(z4, interfaceC4339a, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m51859h(boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m51858g(z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
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
    /* JADX INFO: renamed from: i */
    public static final void m51860i(Modifier modifier, C18052g itemState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C18047b c18047b;
        C18049d c18049d;
        AbstractC23864c abstractC23864c;
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-646592419);
        int i16 = i14 & 1;
        int i17 = 2;
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
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        boolean z4 = false;
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            String id4 = itemState.getId();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (id4 == null || AbstractC39414r.m125890i0(id4)) {
                id4 = null;
            }
            if (((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue() || id4 == null) {
                Modifier modifier5 = modifier4;
                c28655q.m87150e0(293831943);
                AbstractC18048c.m51828h(itemState, onViewEvent, modifier5, c28655q, ((i15 << 6) & 896) | ((i15 >> 3) & 126), 0);
                c28655q.m87173q(false);
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                } else {
                    c18047b = new C18047b(modifier5, itemState, onViewEvent, i13, i14, 1);
                }
            } else {
                c28655q.m87150e0(293953029);
                c28655q.m87173q(false);
                C18049d c18049d2 = new C18049d(itemState, z4, i17, defaultConstructorMarker);
                boolean zM87153g = c28655q.m87153g(id4);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C16587n0(itemState, 13);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                String strConcat = "recommendation-header:".concat(id4);
                c28655q.m87150e0(1371609227);
                if (C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android")) {
                    InterfaceC1583f2 interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    Context applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    boolean zM87153g2 = c28655q.m87153g(strConcat) | c28655q.m87153g(c18049d2) | c28655q.m87153g(interfaceC4339a);
                    Object objM87133R2 = c28655q.m87133R();
                    if (zM87153g2 || objM87133R2 == c28676v0) {
                        c18049d = c18049d2;
                        objM87133R2 = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c18049d, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18051f.class), interfaceC4339a, strConcat);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        c18049d = c18049d2;
                    }
                    abstractC23864c = (AbstractC23864c) objM87133R2;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-707976188);
                    InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                        Application application2 = (Application) applicationContext2;
                        boolean zM87153g3 = c28655q.m87153g(strConcat) | c28655q.m87153g(c18049d2) | c28655q.m87153g(interfaceC4339a);
                        Object objM87133R3 = c28655q.m87133R();
                        if (zM87153g3 || objM87133R3 == c28676v0) {
                            objM87133R3 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC18051f.class), interfaceC4339a, new C23863b(c18049d2), strConcat);
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R3;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        boolean zM87153g4 = c28655q.m87153g(strConcat) | c28655q.m87153g(c18049d2) | c28655q.m87153g(interfaceC4339a);
                        Object objM87133R4 = c28655q.m87133R();
                        if (zM87153g4 || objM87133R4 == c28676v0) {
                            objM87133R4 = new C23863b(c18049d2);
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
                    c18049d = c18049d2;
                }
                AbstractC23864c abstractC23864c2 = abstractC23864c;
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c2.getViewState(), c18049d, null, c28655q, 0, 2);
                boolean zM51838b = m51863l(interfaceC28601c1M87260n).getShowCompletionError();
                boolean zM87157i = c28655q.m87157i(abstractC23864c2);
                Object objM87133R5 = c28655q.m87133R();
                if (zM87157i || objM87133R5 == c28676v0) {
                    objM87133R5 = new C16825r(abstractC23864c2, 1);
                    c28655q.m87172p0(objM87133R5);
                }
                m51858g(zM51838b, (InterfaceC4339a) objM87133R5, c28655q, 0);
                C18052g c18052gM51837a = m51863l(interfaceC28601c1M87260n).getHeader();
                boolean zM87157i2 = c28655q.m87157i(abstractC23864c2) | ((i15 & 896) == 256);
                Object objM87133R6 = c28655q.m87133R();
                if (zM87157i2 || objM87133R6 == c28676v0) {
                    objM87133R6 = new C2205b(onViewEvent, abstractC23864c2, 3);
                    c28655q.m87172p0(objM87133R6);
                }
                Modifier modifier6 = modifier4;
                AbstractC18048c.m51828h(c18052gM51837a, (Function1) objM87133R6, modifier6, c28655q, (i15 << 6) & 896, 0);
                modifier3 = modifier6;
            }
            c28677v1M87180u.f115982d = c18047b;
        }
        c28655q.m87138X();
        modifier3 = modifier2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c18047b = new C18047b(modifier3, itemState, onViewEvent, i13, i14, 2);
            c28677v1M87180u.f115982d = c18047b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m51861j(Modifier modifier, C18052g c18052g, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m51860i(modifier, c18052g, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C34911a m51862k(C18052g c18052g) {
        return AbstractC15751g.m44431K(c18052g);
    }

    /* JADX INFO: renamed from: l */
    private static final C18049d m51863l(InterfaceC28670t2 interfaceC28670t2) {
        return (C18049d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m51864m(AbstractC23864c abstractC23864c) {
        abstractC23864c.mo1216g(InterfaceC18050e.b.f70082a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m51865n(Function1 function1, AbstractC23864c abstractC23864c, Object event) {
        AbstractC22676k.m65750j(event, "event");
        UpdateAction updateActionM47422d = AbstractC16827t.m47422d(event);
        if (updateActionM47422d == null) {
            function1.invoke(event);
        } else {
            abstractC23864c.mo1216g(new InterfaceC18050e.a(updateActionM47422d));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m51866o(Modifier modifier, C18052g c18052g, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m51860i(modifier, c18052g, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
