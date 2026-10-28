package v90;

import am0.C0999c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c31.EnumC3921e;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.activation.domain.models.steps.UpcycleCreditCardVariant;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d21.C11506d;
import h80.InterfaceC17002b;
import hy0.AbstractC17755i2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iz0.AbstractC21048g;
import iz0.C21042a;
import iz0.C21054m;
import j80.InterfaceC21413a;
import java.util.Iterator;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l80.AbstractC23438o;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27248d1;
import ny0.EnumC27250e0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p22.AbstractC28755a;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p734sl0.C32627j2;
import p734sl0.C32632k2;
import p90.AbstractC28996d;
import p90.C28997e;
import p90.C29002j;
import p90.C29005m;
import p90.C29006n;
import pf.AbstractC29125c;
import pp2.C29451o;
import q22.C29855e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t80.C33592b;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: v90.q */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001aA\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006!²\u0006\u000e\u0010 \u001a\u00020\u001f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lv90/r;", "stateData", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "t", "(Lv90/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "securityFooterText", "disclaimerText", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "viewState", "Lq22/e;", "formValidator", "n", "(Landroidx/compose/ui/Modifier;Lv90/r;Lq22/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lv90/b;", "details", "j", "(Landroidx/compose/ui/Modifier;Lv90/b;Landroidx/compose/runtime/Composer;II)V", "Lv90/a;", "item", "l", "(Lv90/a;Landroidx/compose/runtime/Composer;I)V", "Lp90/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lv90/r;)Lp90/j;", "", "disableTextFields", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35825q {

    /* JADX INFO: renamed from: v90.q$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.upcycle.UpcycleJoinTodayScreenKt$PaymentMethodComponent$1$1", m100430f = "UpcycleJoinTodayScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152431w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35826r f152432x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f152433y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C35826r c35826r, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152432x = c35826r;
            this.f152433y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f152432x, this.f152433y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152431w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC35825q.m113655p(this.f152433y, this.f152432x.getIsLoadingPayment());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v90.q$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.upcycle.UpcycleJoinTodayScreenKt$PaymentMethodComponent$2$1", m100430f = "UpcycleJoinTodayScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152434w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35826r f152435x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f152436y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C35826r c35826r, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152435x = c35826r;
            this.f152436y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f152435x, this.f152436y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152434w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f152435x.getStripeToken() == null && this.f152435x.getPaymentOptions().m113538d().size() > 1 && !this.f152435x.getIsTrialMember()) {
                this.f152436y.invoke(new InterfaceC21413a.h0(1));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v90.q$c */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.upcycle.UpcycleJoinTodayScreenKt$UpcycleJoinTodayView$1$1", m100430f = "UpcycleJoinTodayScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152437w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35826r f152438x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f152439y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C35826r c35826r, Function1 function1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152438x = c35826r;
            this.f152439y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f152438x, this.f152439y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152437w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f152438x.getPaymentOptions().getOptionSelected() == 1 && this.f152438x.getUpcycleCreditCardVariant() != UpcycleCreditCardVariant.AFTER_UPCYCLE) {
                this.f152439y.invoke(EnumC3921e.DISABLE);
            }
            this.f152439y.invoke(new InterfaceC17002b.j("upcycle_checkout", null, "upcycle", AbstractC31061c.m95645u("membership", this.f152438x.getMembershipTier()), 2, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v90.q$d */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.upcycle.UpcycleJoinTodayScreenKt$UpcycleJoinTodayView$2$1", m100430f = "UpcycleJoinTodayScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152440w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35826r f152441x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f152442y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C35826r c35826r, Function1 function1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152441x = c35826r;
            this.f152442y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f152441x, this.f152442y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152440w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f152441x.getPaymentMethodId() != null) {
                this.f152442y.invoke(new InterfaceC21413a.c0(false, null, null, 7, null));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v90.q$e */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.upcycle.UpcycleJoinTodayScreenKt$UpcycleJoinTodayView$3$1", m100430f = "UpcycleJoinTodayScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152443w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35826r f152444x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f152445y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C35826r c35826r, Function1 function1, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152444x = c35826r;
            this.f152445y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f152444x, this.f152445y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152443w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f152444x.getShowFullScreenError()) {
                this.f152445y.invoke(new AbstractC23438o.g(ActivationFlowDestination.MEMBERSHIP_SERVICES, null, 2, 0 == true ? 1 : 0));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: v90.q$f */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.upcycle.UpcycleJoinTodayScreenKt$UpcycleJoinTodayView$4$1", m100430f = "UpcycleJoinTodayScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f152446w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35826r f152447x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f152448y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C35826r c35826r, Function1 function1, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f152447x = c35826r;
            this.f152448y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f152447x, this.f152448y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f152446w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f152447x.getPaymentOptions().getOptionSelected() == 0) {
                this.f152448y.invoke(EnumC3921e.ENABLE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: h */
    private static final void m113647h(TextResource textResource, TextResource textResource2, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1783834838);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(textResource2) : c28655q2.m87157i(textResource2) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, 3 * f13, 0.0f, 0.0f, 13));
            C22949e c22949e = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(1 * f13, C2299e.f9111N), C2299e.f9108K, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC28755a.f116472g, c28655q2, 0), null, null, C17919x.f69637n, c28655q2, 3120, 4);
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, i16 | (i15 & 14));
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB3(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
            c28655q2.m87173q(true);
            float f14 = 0 * f13;
            AbstractC21048g.m58807M(AbstractC8693b.m21274h(textResource2, c28655q2, i16 | ((i15 >> 3) & 14)), AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, 2 * f13, 0.0f, 0.0f, 13)), false, new C21054m(C23285v0.m67364b(c38072d.m121952e(c28655q2, i17).getFormLabel().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), c38072d.m121949b(c28655q2, i17).getGreyL2(), c38072d.m121949b(c28655q2, i17).getStrain(), c38072d.m121949b(c28655q2, i17).getRecovery(), C28780r.f116542I, c38072d.m121949b(c28655q2, i17).getBrandWhite(), 1, c38072d.m121949b(c28655q2, i17).getBrandWhite(), new C21042a(c38072d.m121952e(c28655q2, i17).getT1(), c38072d.m121952e(c28655q2, i17).getT2(), c38072d.m121952e(c28655q2, i17).getT3(), c38072d.m121952e(c28655q2, i17).getT4()), c38072d.m121949b(c28655q2, i17).getBrandWhite(), f14, f14, false, false, f14, null), null, 0, 0, 0, false, c28655q2, (C21054m.f79836p << 9) | 48, 500);
            c28655q = c28655q2;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0999c(textResource, textResource2, i13, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m113648i(TextResource textResource, TextResource textResource2, int i13, Composer composer, int i14) {
        m113647h(textResource, textResource2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    private static final void m113649j(Modifier modifier, C35810b c35810b, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C35810b c35810b2;
        Modifier modifier3;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(556481081);
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
            c35810b2 = c35810b;
            i15 |= c28655q.m87157i(c35810b2) ? 32 : 16;
        } else {
            c35810b2 = c35810b;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f13 = 1 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f13, 7);
            Modifier modifier5 = modifier4;
            String strM113534c = c35810b2.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM113534c, modifierM3398t, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q, i17).getH3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i17).getH3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), null, 2, null), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            c28655q.m87150e0(1940701950);
            Iterator<T> it = c35810b.m113533b().iterator();
            while (it.hasNext()) {
                m113651l((C35809a) it.next(), c28655q, TextResource.$stable);
            }
            c28655q.m87173q(false);
            AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, f13, 1), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
            c28655q.m87150e0(1940708638);
            Iterator<T> it3 = c35810b.m113532a().iterator();
            while (it3.hasNext()) {
                m113651l((C35809a) it3.next(), c28655q, TextResource.$stable);
            }
            c28655q.m87173q(false);
            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, f13, 0.0f, 0.0f, 13), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(modifier3, i13, c35810b, i14, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m113650k(Modifier modifier, C35810b c35810b, int i13, int i14, Composer composer, int i15) {
        m113649j(modifier, c35810b, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m113651l(C35809a c35809a, Composer composer, int i13) {
        int i14;
        long greyL3;
        int i15;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1157385930);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c35809a) : c28655q.m87157i(c35809a) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 1 * 8, 1);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (!(((double) 1.0f) > 0.0d)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            TextResource textResourceM113529b = c35809a.getLabel();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM113529b, c28655q, i16);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i17).getB1();
            if (c35809a.getIsHighlightText()) {
                greyL3 = AbstractC25012a.m73366B(c28655q, 115245658, c38072d, c28655q, i17);
            } else {
                c28655q.m87150e0(115246742);
                greyL3 = c38072d.m121949b(c28655q, i17).getGreyL3();
            }
            c28655q.m87173q(false);
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, c2314t, greyL3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 48, i18, 196600);
            C28655q c28655q2 = c28655q;
            TextResource textResourceM113530c = c35809a.getSubtitle();
            if (textResourceM113530c == null) {
                c28655q2.m87150e0(-722261687);
                c28655q2.m87173q(false);
                i15 = i17;
            } else {
                c28655q2.m87150e0(-722261686);
                i15 = i17;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM113530c, c28655q2, i16), c2314t, c38072d.m121949b(c28655q2, i17).getWhite70(), AbstractC35745c.m113246h(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB2(), null, c28655q2, 3120, i18, 196592);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            int i19 = i15;
            C28655q c28655q3 = c28655q2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c35809a.getAmount(), c28655q2, i16), c2314t, c38072d.m121949b(c28655q2, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i19).getB1(), null, c28655q3, 48, i18, 196600);
            c28655q = c28655q3;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(c35809a, i13, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m113652m(C35809a c35809a, int i13, Composer composer, int i14) {
        m113651l(c35809a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m113653n(Modifier modifier, C35826r c35826r, C29855e c29855e, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C29855e c29855e2;
        Modifier modifier3;
        C29855e c29855e3;
        C35826r c35826r2 = c35826r;
        C29855e c29855e4 = c29855e;
        C2305k c2305k = C2299e.f9110M;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2026856054);
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
            i15 |= c28655q.m87157i(c35826r2) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q.m87153g(c29855e4) : c28655q.m87157i(c29855e4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            if (i17 != 0) {
                c29855e4 = null;
            }
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            Boolean boolValueOf = Boolean.valueOf(c35826r2.getIsLoadingPayment());
            boolean zM87157i = c28655q.m87157i(c35826r2);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new a(c35826r2, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, boolValueOf);
            String strM113681t = c35826r2.getStripeToken();
            int i18 = i15 & 7168;
            boolean zM87157i2 = c28655q.m87157i(c35826r2) | (i18 == 2048);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new b(c35826r2, function1, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, strM113681t);
            Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier4);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            C29855e c29855e5 = c29855e4;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f13 = 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f13, 7);
            C2314t c2314t2 = c2314t;
            String strM21274h = AbstractC8693b.m21274h(c35826r2.getPaymentOptions().getTitle(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i19 = C38072d.f163054b;
            Modifier modifier5 = modifier4;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q, i19).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getH3(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            if (c35826r.getStripeToken() != null) {
                c28655q.m87150e0(-1077431436);
                int i24 = 0;
                for (Object obj : c35826r.getPaymentOptions().m113538d()) {
                    int i25 = i24 + 1;
                    if (i24 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    TextResource textResource = (TextResource) obj;
                    EnumC27250e0 enumC27250e0 = EnumC27250e0.TEXT;
                    boolean z4 = c35826r.getPaymentOptions().getOptionSelected() == i24;
                    boolean zM87149e = (i18 == 2048) | c28655q.m87149e(i24);
                    Object objM87133R4 = c28655q.m87133R();
                    if (zM87149e || objM87133R4 == c28676v0) {
                        objM87133R4 = new C11506d(function1, i24, 9);
                        c28655q.m87172p0(objM87133R4);
                    }
                    C28655q c28655q2 = c28655q;
                    AbstractC27248d1.m82113e(null, textResource, enumC27250e0, 0L, z4, false, null, null, (Function1) objM87133R4, c28655q2, (TextResource.$stable << 3) | 384, 233);
                    c28655q = c28655q2;
                    i24 = i25;
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1076987454);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            if (c35826r.getPaymentOptions().getOptionSelected() == AbstractC37056f.m118951C(c35826r.getPaymentOptions().m113538d())) {
                c28655q.m87150e0(-874721389);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                C0209i c0209i4 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                float f14 = 4;
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t2), 0.0f, f14 * f13, 1);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66747j(1 * f13, C2299e.f9111N), C2299e.f9107J, c28655q, 6);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                c28655q.m87150e0(546366532);
                for (C29005m c29005m : c35826r.m113665c()) {
                    C28655q c28655q3 = c28655q;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(c29005m.getImageSource(), null, null, c28655q, AbstractC22403o.f87638a, 3), c29005m.getAccessibilityName(), AbstractC1102d.m3411h(5 * f14, AbstractC1102d.m3424u(((float) 7.75d) * f14, c2314t2)), null, null, 0.0f, null, c28655q3, 384, 120);
                    c28655q = c28655q3;
                    c2314t2 = c2314t2;
                    f14 = f14;
                }
                boolean z13 = false;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                if (c29855e5 == null) {
                    c28655q.m87150e0(-1896183852);
                    c28655q.m87173q(false);
                    c35826r2 = c35826r;
                    c29855e3 = c29855e5;
                } else {
                    c28655q.m87150e0(-1896183851);
                    C29002j c29002jM113662w = m113662w(c35826r);
                    boolean zM113654o = m113654o(interfaceC28601c1);
                    String strM113683v = c35826r.getUserCountryCode();
                    if (strM113683v == null) {
                        strM113683v = "";
                    }
                    c35826r2 = c35826r;
                    boolean zM87157i3 = c28655q.m87157i(c35826r2) | (i18 == 2048);
                    Object objM87133R5 = c28655q.m87133R();
                    if (zM87157i3 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C29451o(function1, c35826r2, 20);
                        c28655q.m87172p0(objM87133R5);
                    }
                    c29855e3 = c29855e5;
                    C28655q c28655q4 = c28655q;
                    AbstractC28996d.m88064w(c29002jM113662w, c29855e3, zM113654o, strM113683v, null, null, (InterfaceC4351m) objM87133R5, null, c28655q4, C29855e.f122028d << 3, 176);
                    c28655q = c28655q4;
                    z13 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(z13);
            } else {
                c35826r2 = c35826r;
                c29855e3 = c29855e5;
                c28655q.m87150e0(-872759988);
                c28655q.m87173q(false);
            }
            c29855e2 = c29855e3;
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            c29855e2 = c29855e4;
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32632k2(modifier3, c35826r2, c29855e2, function1, i13, i14, 15);
        }
    }

    /* JADX INFO: renamed from: o */
    private static final boolean m113654o(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m113655p(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m113656q(Function1 function1, int i13, boolean z4) {
        function1.invoke(new InterfaceC21413a.h0(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m113657r(Function1 function1, C35826r c35826r, boolean z4, C28997e card) {
        AbstractC22676k.m65750j(card, "card");
        if (z4) {
            function1.invoke(new C29006n(card));
            function1.invoke(new InterfaceC17002b.i("upcycle_checkout", null, "update payment method", null, "upcycle", null, 42, null));
            function1.invoke(EnumC3921e.ENABLE);
        } else if (c35826r.getPaymentOptions().getOptionSelected() != 0) {
            function1.invoke(EnumC3921e.DISABLE);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m113658s(Modifier modifier, C35826r c35826r, C29855e c29855e, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m113653n(modifier, c35826r, c29855e, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x0217  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX INFO: renamed from: t */
    public static final void m113659t(C35826r c35826r, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        int i15;
        int iHashCode;
        Modifier modifier;
        ?? r10;
        C2314t c2314t;
        int i16;
        C28655q c28655q2;
        C35826r stateData = c35826r;
        AbstractC22676k.m65750j(stateData, "stateData");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1429189586);
        if ((i13 & 6) == 0) {
            i14 = (c28655q3.m87157i(stateData) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i17 = i14 & 112;
            boolean zM87157i = c28655q3.m87157i(stateData) | (i17 == 32);
            Object objM87133R = c28655q3.m87133R();
            Object obj = C28635l.f115821a;
            if (zM87157i || objM87133R == obj) {
                objM87133R = new c(stateData, onViewEvent, null);
                c28655q3.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
            String strM113674m = stateData.getPaymentMethodId();
            boolean zM87157i2 = c28655q3.m87157i(stateData) | (i17 == 32);
            Object objM87133R2 = c28655q3.m87133R();
            if (zM87157i2 || objM87133R2 == obj) {
                objM87133R2 = new d(stateData, onViewEvent, null);
                c28655q3.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R2, strM113674m);
            Boolean boolValueOf = Boolean.valueOf(stateData.getShowFullScreenError());
            boolean zM87157i3 = c28655q3.m87157i(stateData) | (i17 == 32);
            Object objM87133R3 = c28655q3.m87133R();
            if (zM87157i3 || objM87133R3 == obj) {
                objM87133R3 = new e(stateData, onViewEvent, null);
                c28655q3.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R3, boolValueOf);
            Integer numValueOf = Integer.valueOf(stateData.getPaymentOptions().getOptionSelected());
            boolean zM87157i4 = (i17 == 32) | c28655q3.m87157i(stateData);
            Object objM87133R4 = c28655q3.m87133R();
            if (zM87157i4 || objM87133R4 == obj) {
                objM87133R4 = new f(stateData, onViewEvent, null);
                c28655q3.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R4, numValueOf);
            C2314t c2314t2 = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            float f15 = 4 * f13;
            Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1092a.m3358c(AbstractC1102d.m3407d(1.0f, c2314t2), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a), f14, f15, f14, f14);
            C2305k c2305k = C2299e.f9111N;
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 48);
            int iHashCode2 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3397s);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q3.f115903S) {
                i15 = i14;
            } else {
                i15 = i14;
                if (!AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(c2314t2, 0.0f, 5 * f13, 0.0f, 0.0f, 13), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM92116f0);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                if (c35826r.getUpcycleCreditCardVariant() != UpcycleCreditCardVariant.AFTER_UPCYCLE) {
                    c28655q3.m87150e0(-1151922868);
                    onViewEvent.invoke(EnumC3921e.ENABLE);
                    stateData = c35826r;
                    c2314t = c2314t2;
                    m113653n(c2314t, stateData, c35826r.getFormValidator(), onViewEvent, c28655q3, ((i15 << 3) & 112) | 6 | (C29855e.f122028d << 6) | ((i15 << 6) & 7168), 0);
                    r10 = 1;
                    i16 = 0;
                    modifier = null;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, f15, 1), null, null, null, null, 0L, 0L, null, c28655q3, 6, 254);
                    C28655q c28655q4 = c28655q3;
                    c28655q4.m87173q(false);
                    c28655q2 = c28655q4;
                } else {
                    modifier = null;
                    r10 = 1;
                    stateData = c35826r;
                    C28655q c28655q5 = c28655q3;
                    c2314t = c2314t2;
                    i16 = 0;
                    c28655q5.m87150e0(-1151538468);
                    c28655q5.m87173q(false);
                    c28655q2 = c28655q5;
                }
                m113649j(modifier, stateData.getOrderDetails(), c28655q2, i16, r10);
                TextResource textResourceM113678q = stateData.getSecurityText();
                TextResource textResourceM113668g = stateData.getDisclaimerText();
                int i18 = TextResource.$stable;
                m113647h(textResourceM113678q, textResourceM113668g, c28655q2, i18 | (i18 << 3));
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3412i(c2314t, i16, 10 * f13)));
                c28655q2.m87173q(r10);
                c28655q2.m87173q(r10);
                c28655q = c28655q2;
            }
            AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N);
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(c2314t2, 0.0f, 5 * f13, 0.0f, 0.0f, 13), AbstractC30060g.m92099U(0, c28655q3, 1), 14);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q3, 0);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM92116f1);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i5, modifierM118962N3);
            if (c35826r.getUpcycleCreditCardVariant() != UpcycleCreditCardVariant.AFTER_UPCYCLE) {
                c28655q3.m87150e0(-1151922868);
                onViewEvent.invoke(EnumC3921e.ENABLE);
                stateData = c35826r;
                c2314t = c2314t2;
                m113653n(c2314t, stateData, c35826r.getFormValidator(), onViewEvent, c28655q3, ((i15 << 3) & 112) | 6 | (C29855e.f122028d << 6) | ((i15 << 6) & 7168), 0);
                r10 = 1;
                i16 = 0;
                modifier = null;
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, f15, 1), null, null, null, null, 0L, 0L, null, c28655q3, 6, 254);
                C28655q c28655q6 = c28655q3;
                c28655q6.m87173q(false);
                c28655q2 = c28655q6;
            } else {
                modifier = null;
                r10 = 1;
                stateData = c35826r;
                C28655q c28655q7 = c28655q3;
                c2314t = c2314t2;
                i16 = 0;
                c28655q7.m87150e0(-1151538468);
                c28655q7.m87173q(false);
                c28655q2 = c28655q7;
            }
            m113649j(modifier, stateData.getOrderDetails(), c28655q2, i16, r10);
            TextResource textResourceM113678q2 = stateData.getSecurityText();
            TextResource textResourceM113668g2 = stateData.getDisclaimerText();
            int i19 = TextResource.$stable;
            m113647h(textResourceM113678q2, textResourceM113668g2, c28655q2, i19 | (i19 << 3));
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3412i(c2314t, i16, 10 * f13)));
            c28655q2.m87173q(r10);
            c28655q2.m87173q(r10);
            c28655q = c28655q2;
        } else {
            C28655q c28655q8 = c28655q3;
            c28655q8.m87138X();
            c28655q = c28655q8;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(stateData, onViewEvent, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m113660u(C35826r c35826r, Function1 function1, int i13, Composer composer, int i14) {
        m113659t(c35826r, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    private static final C29002j m113662w(C35826r c35826r) {
        return new C29002j(c35826r.getPaymentOptions().getTitle(), AbstractC8693b.m21278l(""), c35826r.m113665c(), c35826r.getPaymentMethodTextFields(), null, c35826r.getErrorMessages(), c35826r.getAnalyticsName(), c35826r.getDisclaimerText(), c35826r.getFormValidator(), null, null, null, null, null, c35826r.getIsLoadingPayment(), c35826r.getShowFullScreenError(), null, null, null, null, null, null, 4144656, null);
    }
}
