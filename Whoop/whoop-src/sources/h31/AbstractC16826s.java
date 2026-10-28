package h31;

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
import c91.InterfaceC4327a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import com.whoop.whoopaction.domain.models.UpdateAction;
import gy0.AbstractC16277f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
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
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import x81.C38072d;

/* JADX INFO: renamed from: h31.s */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lh31/q;", "itemState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "showError", "Lkotlin/Function0;", "onDismiss", "f", "(ZLc93/a;Landroidx/compose/runtime/Composer;I)V", "Lh31/m;", "viewState", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16826s {

    /* JADX INFO: renamed from: h31.s$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.recommendationtile.RecommendationTileWrapperKt$CommitErrorToast$1$1", m100430f = "RecommendationTileWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f64626w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Context f64627x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f64628y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f64629z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f64627x = context;
            this.f64628y = str;
            this.f64629z = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f64627x, this.f64628y, this.f64629z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f64626w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Toast.makeText(this.f64627x, this.f64628y, 1).show();
            this.f64629z.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h31.s$b */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.recommendationtile.RecommendationTileWrapperKt$RecommendationTileWrapper$2$1", m100430f = "RecommendationTileWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f64630w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC23864c<C16820m, InterfaceC16822o> f64631x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C16824q f64632y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC23864c<C16820m, InterfaceC16822o> abstractC23864c, C16824q c16824q, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f64631x = abstractC23864c;
            this.f64632y = c16824q;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f64631x, this.f64632y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f64630w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f64631x.mo1216g(new InterfaceC16822o.e(this.f64632y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h31.s$c */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.recommendationtile.RecommendationTileWrapperKt$RecommendationTileWrapper$3$1", m100430f = "RecommendationTileWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f64633w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f64634x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f64635y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC23864c<C16820m, InterfaceC16822o> f64636z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC28670t2 interfaceC28670t2, Function1 function1, AbstractC23864c<C16820m, InterfaceC16822o> abstractC23864c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f64634x = interfaceC28670t2;
            this.f64635y = function1;
            this.f64636z = abstractC23864c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f64634x, this.f64635y, this.f64636z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f64633w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM47392b = AbstractC16826s.m47414j(this.f64634x).getFollowupMessage();
            if (strM47392b != null) {
                Function1 function1 = this.f64635y;
                AbstractC23864c<C16820m, InterfaceC16822o> abstractC23864c = this.f64636z;
                function1.invoke(new InterfaceC4327a.b(strM47392b));
                abstractC23864c.mo1216g(InterfaceC16822o.a.f64610a);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h31.s$d */
    @InterfaceC32271e(m100429c = "com.whoop.design.atomic.molecule.recommendationtile.RecommendationTileWrapperKt$RecommendationTileWrapper$5$1$1", m100430f = "RecommendationTileWrapper.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f64637w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f64638x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C9598e f64639y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC23864c<C16820m, InterfaceC16822o> f64640z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, C9598e c9598e, AbstractC23864c<C16820m, InterfaceC16822o> abstractC23864c, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f64638x = function1;
            this.f64639y = c9598e;
            this.f64640z = abstractC23864c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f64638x, this.f64639y, this.f64640z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f64637w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f64638x.invoke(this.f64639y);
            this.f64640z.mo1216g(InterfaceC16822o.c.f64613a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f */
    private static final void m47410f(boolean z4, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1205759514);
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
                c28655q.m87150e0(1970387961);
                boolean zM87157i = c28655q.m87157i(context) | c28655q.m87153g(strM92103Y) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new a(context, strM92103Y, interfaceC4339a, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1970525384);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0374j(z4, interfaceC4339a, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m47411g(boolean z4, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m47410f(z4, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
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
    /* JADX INFO: renamed from: h */
    public static final void m47412h(Modifier modifier, C16824q itemState, Function1 onViewEvent, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function1;
        C28677v1 c28677v1M87180u;
        C16817j c16817j;
        InterfaceC30057d interfaceC30057d;
        Object objM70119d;
        AbstractC23864c abstractC23864c;
        Object obj;
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-286444733);
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
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 147) != 146)) {
            if (i16 != 0) {
                modifier2 = C2314t.f9131w;
            }
            if (((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue()) {
                c28655q.m87150e0(625160615);
                Modifier modifier3 = modifier2;
                AbstractC16819l.m47379c(itemState, onViewEvent, modifier3, c28655q, ((i17 >> 3) & 126) | ((i17 << 6) & 896), 0);
                c28655q.m87173q(false);
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                } else {
                    c16817j = new C16817j(modifier3, itemState, onViewEvent, i13, i14, 1);
                }
            } else {
                Modifier modifier4 = modifier2;
                function1 = onViewEvent;
                c28655q.m87150e0(625275935);
                c28655q.m87173q(false);
                C16820m c16820m = new C16820m(itemState, false, null, null, 14, null);
                String strM47401f = itemState.getRecommendationId();
                int i18 = C9598e.f28134d;
                c28655q.m87150e0(1371609227);
                boolean zIsFeatureEnabled = C38072d.f163053a.m121950c(c28655q, 6).isFeatureEnabled("safe-design-view-model-injection-android");
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zIsFeatureEnabled) {
                    InterfaceC1583f2 interfaceC1583f2M30452f = AbstractC11266d.m30452f(c28655q, -707312137, false, c28655q);
                    Context applicationContext = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    boolean z4 = ((((i18 & 7168) ^ 3072) > 2048 && c28655q.m87153g(null)) || (i18 & 3072) == 2048) | ((((i18 & 14) ^ 6) > 4 && c28655q.m87153g(c16820m)) || (i18 & 6) == 4) | ((((i18 & 112) ^ 48) > 32 && c28655q.m87153g(strM47401f)) || (i18 & 48) == 32);
                    Object objM87133R = c28655q.m87133R();
                    if (z4 || objM87133R == c28676v0) {
                        interfaceC30057d = null;
                        objM70119d = AbstractC23865d.m70119d(interfaceC1583f2M30452f, c16820m, application, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC16823p.class), null, strM47401f);
                        c28655q.m87172p0(objM70119d);
                    } else {
                        objM70119d = objM87133R;
                        interfaceC30057d = null;
                    }
                    abstractC23864c = (AbstractC23864c) objM70119d;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-707976188);
                    InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q);
                    if (interfaceC1583f2M73844a == null) {
                        c28655q.m87150e0(-707931115);
                        c28655q.m87173q(false);
                        obj = null;
                        abstractC23864c = null;
                    } else {
                        c28655q.m87150e0(-707931114);
                        Context applicationContext2 = ((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b)).getApplicationContext();
                        AbstractC22676k.m65748h(applicationContext2, "null cannot be cast to non-null type android.app.Application");
                        Application application2 = (Application) applicationContext2;
                        boolean z13 = ((((i18 & 112) ^ 48) > 32 && c28655q.m87153g(strM47401f)) || (i18 & 48) == 32) | ((((i18 & 14) ^ 6) > 4 && c28655q.m87153g(c16820m)) || (i18 & 6) == 4) | ((((i18 & 7168) ^ 3072) > 2048 && c28655q.m87153g(null)) || (i18 & 3072) == 2048);
                        Object objM87133R2 = c28655q.m87133R();
                        if (z13 || objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC23865d.m70117b(application2, interfaceC1583f2M73844a, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC16823p.class), null, new C23863b(c16820m), strM47401f);
                            obj = null;
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            obj = null;
                        }
                        abstractC23864c = (AbstractC23864c) objM87133R2;
                        c28655q.m87173q(false);
                    }
                    if (abstractC23864c == null) {
                        c28655q.m87150e0(-707430526);
                        boolean z14 = ((((i18 & 7168) ^ 3072) > 2048 && c28655q.m87153g(obj)) || (i18 & 3072) == 2048) | ((((i18 & 112) ^ 48) > 32 && c28655q.m87153g(strM47401f)) || (i18 & 48) == 32) | ((((i18 & 14) ^ 6) > 4 && c28655q.m87153g(c16820m)) || (i18 & 6) == 4);
                        Object objM87133R3 = c28655q.m87133R();
                        if (z14 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C23863b(c16820m);
                            c28655q.m87172p0(objM87133R3);
                        }
                        abstractC23864c = (C23863b) objM87133R3;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-438479417);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                    i18 = i18;
                    interfaceC30057d = null;
                }
                c28655q = c28655q;
                InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(abstractC23864c.getViewState(), c16820m, null, c28655q, i18 << 3, 2);
                String strM47401f2 = itemState.getRecommendationId();
                boolean zM87157i = c28655q.m87157i(abstractC23864c) | ((i17 & 112) == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i || objM87133R4 == c28676v0) {
                    objM87133R4 = new b(abstractC23864c, itemState, interfaceC30057d);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM47401f2);
                String strM47392b = m47414j(interfaceC28601c1M87260n).getFollowupMessage();
                int i19 = i17 & 896;
                boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87260n) | (i19 == 256) | c28655q.m87157i(abstractC23864c);
                Object objM87133R5 = c28655q.m87133R();
                if (zM87153g || objM87133R5 == c28676v0) {
                    objM87133R5 = new c(interfaceC28601c1M87260n, function1, abstractC23864c, interfaceC30057d);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, strM47392b);
                boolean zM47393c = m47414j(interfaceC28601c1M87260n).getShowCommitError();
                boolean zM87157i2 = c28655q.m87157i(abstractC23864c);
                Object objM87133R6 = c28655q.m87133R();
                if (zM87157i2 || objM87133R6 == c28676v0) {
                    objM87133R6 = new C16825r(abstractC23864c, 0);
                    c28655q.m87172p0(objM87133R6);
                }
                boolean z15 = false;
                m47410f(zM47393c, (InterfaceC4339a) objM87133R6, c28655q, 0);
                C9598e c9598eM47391a = m47414j(interfaceC28601c1M87260n).getDismiss();
                if (c9598eM47391a == null) {
                    c28655q.m87150e0(626273514);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(626273515);
                    boolean zM87157i3 = (i19 == 256) | c28655q.m87157i(c9598eM47391a) | c28655q.m87157i(abstractC23864c);
                    Object objM87133R7 = c28655q.m87133R();
                    if (zM87157i3 || objM87133R7 == c28676v0) {
                        objM87133R7 = new d(function1, c9598eM47391a, abstractC23864c, interfaceC30057d);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R7, c9598eM47391a);
                    z15 = false;
                    c28655q.m87173q(false);
                }
                C16824q c16824qM47394d = m47414j(interfaceC28601c1M87260n).getTile();
                boolean zM87157i4 = c28655q.m87157i(abstractC23864c) | (i19 == 256 ? true : z15);
                Object objM87133R8 = c28655q.m87133R();
                if (zM87157i4 || objM87133R8 == c28676v0) {
                    objM87133R8 = new C2205b(function1, abstractC23864c, 2);
                    c28655q.m87172p0(objM87133R8);
                }
                AbstractC16819l.m47379c(c16824qM47394d, (Function1) objM87133R8, modifier4, c28655q, (i17 << 6) & 896, 0);
                modifier2 = modifier4;
            }
            c28677v1M87180u.f115982d = c16817j;
        }
        function1 = onViewEvent;
        c28655q.m87138X();
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c16817j = new C16817j(modifier2, itemState, function1, i13, i14, 2);
            c28677v1M87180u.f115982d = c16817j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m47413i(Modifier modifier, C16824q c16824q, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m47412h(modifier, c16824q, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C16820m m47414j(InterfaceC28670t2 interfaceC28670t2) {
        return (C16820m) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m47415k(AbstractC23864c abstractC23864c) {
        abstractC23864c.mo1216g(InterfaceC16822o.d.f64614a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m47416l(Function1 function1, AbstractC23864c abstractC23864c, Object event) {
        AbstractC22676k.m65750j(event, "event");
        UpdateAction updateActionM47422d = AbstractC16827t.m47422d(event);
        if (updateActionM47422d == null) {
            function1.invoke(event);
        } else {
            abstractC23864c.mo1216g(new InterfaceC16822o.b(updateActionM47422d));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m47417m(Modifier modifier, C16824q c16824q, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m47412h(modifier, c16824q, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
