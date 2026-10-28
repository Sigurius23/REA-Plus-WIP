package p90;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import bm0.C3412o;
import c31.EnumC3921e;
import c41.AbstractC4106r2;
import c41.C4092p2;
import c93.InterfaceC4351m;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.C9812h;
import gz0.EnumC16313m0;
import h80.InterfaceC17002b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j80.InterfaceC21413a;
import j80.InterfaceC21415c;
import java.util.List;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l80.AbstractC23438o;
import l83.C23454a0;
import n83.C26463f;
import no0.C26984y0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p395p6.C28884h1;
import p505ts.AbstractC34132o;
import p714k80.AbstractC22290s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import q22.C29855e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: p90.i */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u000f\u001a\u00020\r8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lp90/j;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lp90/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "Lp90/m;", "paymentImages", "f", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "", "disableTextFields", "isKeyboardOpen", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29001i {

    /* JADX INFO: renamed from: p90.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.paymentmethod.PaymentMethodScreenKt$PaymentMethodScreenView$2$1", m100430f = "PaymentMethodScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f117319w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29002j f117320x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f117321y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C29002j c29002j, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f117320x = c29002j;
            this.f117321y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f117320x, this.f117321y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f117319w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!this.f117320x.getInitialValues().m88068a()) {
                this.f117321y.invoke(EnumC3921e.DISABLE);
            }
            Function1 function1 = this.f117321y;
            String strM88101g = this.f117320x.getAnalyticsValue();
            C29002j c29002j = this.f117320x;
            C26463f c26463f = new C26463f();
            String strM88100f = c29002j.getAnalyticsScreenCopy();
            if (strM88100f != null) {
                c26463f.put("screen_copy", strM88100f);
            }
            function1.invoke(new InterfaceC17002b.j("payment_method", strM88101g, null, c26463f.m78380b(), 4, null));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: p90.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.paymentmethod.PaymentMethodScreenKt$PaymentMethodScreenView$3$1", m100430f = "PaymentMethodScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f117322w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29002j f117323x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f117324y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C29002j c29002j, Function1 function1, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f117323x = c29002j;
            this.f117324y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f117323x, this.f117324y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f117322w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f117323x.getStripeToken() != null) {
                this.f117324y.invoke(new InterfaceC21413a.k0(this.f117323x.getStripeToken()));
            }
            this.f117324y.invoke(InterfaceC21415c.d.f82168a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: p90.i$c */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.paymentmethod.PaymentMethodScreenKt$PaymentMethodScreenView$4$1", m100430f = "PaymentMethodScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f117325w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29002j f117326x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f117327y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C29002j c29002j, Function1 function1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f117326x = c29002j;
            this.f117327y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f117326x, this.f117327y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f117325w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f117326x.getPaymentMethodId() != null) {
                this.f117327y.invoke(new InterfaceC21413a.c0(false, null, null, 7, null));
            }
            this.f117327y.invoke(InterfaceC21415c.d.f82168a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: p90.i$d */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.paymentmethod.PaymentMethodScreenKt$PaymentMethodScreenView$5$1", m100430f = "PaymentMethodScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f117328w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29002j f117329x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f117330y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C29002j c29002j, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f117329x = c29002j;
            this.f117330y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f117329x, this.f117330y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f117328w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC29001i.m88090n(this.f117330y, this.f117329x.getIsLoadingStripeToken());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: p90.i$e */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.screens.paymentmethod.PaymentMethodScreenKt$PaymentMethodScreenView$6$1", m100430f = "PaymentMethodScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f117331w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29002j f117332x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f117333y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C29002j c29002j, Function1 function1, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f117332x = c29002j;
            this.f117333y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f117332x, this.f117333y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f117331w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f117332x.getShowFullScreenError()) {
                this.f117333y.invoke(new AbstractC23438o.g(ActivationFlowDestination.MEMBERSHIP_SERVICES, null, 2, 0 == true ? 1 : 0));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: p90.i$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f117334w = new f();

        /* JADX INFO: renamed from: a */
        public final long m88093a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend15();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m88093a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: p90.i$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f117335w = new g();

        /* JADX INFO: renamed from: a */
        public final long m88094a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m88094a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: f */
    private static final void m88082f(List<C29005m> list, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-362580800);
        int i14 = (i13 & 6) == 0 ? (c28655q.m87157i(list) ? 4 : 2) | i13 : i13;
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(1 * 8), C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            c28655q.m87150e0(-518047897);
            for (C29005m c29005m : list) {
                float f13 = 4;
                C28655q c28655q2 = c28655q;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c29005m.getImageSource(), null, null, c28655q, AbstractC22403o.f87638a, 3), c29005m.getAccessibilityName(), AbstractC1102d.m3411h(5 * f13, AbstractC1102d.m3424u(((float) 7.75d) * f13, c2314t)), null, null, 0.0f, null, c28655q2, 384, 120);
                c28655q = c28655q2;
            }
            c28655q.m87173q(false);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m88083g(List list, int i13, Composer composer, int i14) {
        m88082f(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:103:0x0302  */
    /* JADX WARN: Code duplicated, block: B:106:0x035b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0367  */
    /* JADX WARN: Code duplicated, block: B:109:0x0373  */
    /* JADX WARN: Code duplicated, block: B:111:0x0399  */
    /* JADX WARN: Code duplicated, block: B:113:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:116:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:117:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:119:0x0406  */
    /* JADX WARN: Code duplicated, block: B:122:0x040e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0410  */
    /* JADX WARN: Code duplicated, block: B:126:0x0417 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x041d  */
    /* JADX WARN: Code duplicated, block: B:132:0x042c  */
    /* JADX WARN: Code duplicated, block: B:133:0x042e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0435 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x0437  */
    /* JADX WARN: Code duplicated, block: B:141:0x0469  */
    /* JADX WARN: Code duplicated, block: B:143:0x0477  */
    /* JADX WARN: Code duplicated, block: B:145:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:148:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x0089  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:64:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x0120  */
    /* JADX WARN: Code duplicated, block: B:68:0x0122  */
    /* JADX WARN: Code duplicated, block: B:72:0x012c  */
    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    /* JADX WARN: Code duplicated, block: B:76:0x018b  */
    /* JADX WARN: Code duplicated, block: B:79:0x019e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01af  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:94:0x0201  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:98:0x02dc  */
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
    public static final void m88084h(C29002j viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        boolean z4;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28670t2 interfaceC28670t2M64044h;
        int i16;
        boolean z13;
        boolean z14;
        Object objM87133R2;
        C23454a0 c23454a0;
        boolean z15;
        boolean z16;
        Object objM87133R3;
        boolean z17;
        boolean z18;
        Object objM87133R4;
        boolean zM87157i;
        Object objM87133R5;
        boolean z19;
        boolean z24;
        Object objM87133R6;
        C2314t c2314t;
        float f13;
        C2305k c2305k;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        int i17;
        C0209i c0209i4;
        Function1 function5;
        Function1 function6;
        C2314t c2314t2;
        int i18;
        C28676v0 c28676v1;
        boolean z25;
        double d3;
        boolean z26;
        float f14;
        float f15;
        C29855e c29855eM88105k;
        String strM88115u;
        int i19;
        boolean z27;
        Object objM87133R7;
        Function1 function7;
        boolean z28;
        Object objM87133R8;
        TextResource textResourceM88102h;
        C2314t c2314t3;
        int iHashCode2;
        C23454a0 c23454a1;
        float f16;
        C28998f c28998fM88103i;
        Object objM87133R9;
        Object objM87133R10;
        float f17;
        C4092p2 c4092p2M88106l;
        Object objM87133R11;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1970100575);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
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
                if (i24 != 0) {
                    objM87133R11 = c28655q.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = new C28884h1(8);
                        c28655q.m87172p0(objM87133R11);
                    }
                    function4 = (Function1) objM87133R11;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                interfaceC28670t2M64044h = AbstractC22290s.m64044h(c28655q, 0);
                boolean zM87157i2 = c28655q.m87157i(viewState);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i2 | z13;
                objM87133R2 = c28655q.m87133R();
                if (z14 || objM87133R2 == c28676v0) {
                    objM87133R2 = new a(viewState, function4, null);
                    c28655q.m87172p0(objM87133R2);
                }
                c23454a0 = C23454a0.f92919a;
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
                String strM88111q = viewState.getStripeToken();
                boolean zM87157i3 = c28655q.m87157i(viewState);
                if (i16 == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i3 | z15;
                objM87133R3 = c28655q.m87133R();
                if (z16 || objM87133R3 == c28676v0) {
                    objM87133R3 = new b(viewState, function4, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, strM88111q);
                String strM88108n = viewState.getPaymentMethodId();
                boolean zM87157i4 = c28655q.m87157i(viewState);
                if (i16 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87157i4 | z17;
                objM87133R4 = c28655q.m87133R();
                if (z18 || objM87133R4 == c28676v0) {
                    objM87133R4 = new c(viewState, function4, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM88108n);
                Boolean boolValueOf = Boolean.valueOf(viewState.getIsLoadingStripeToken());
                zM87157i = c28655q.m87157i(viewState);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i || objM87133R5 == c28676v0) {
                    objM87133R5 = new d(viewState, interfaceC28601c1, null);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf);
                Boolean boolValueOf2 = Boolean.valueOf(viewState.getShowFullScreenError());
                boolean zM87157i5 = c28655q.m87157i(viewState);
                if (i16 == 32) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z24 = zM87157i5 | z19;
                objM87133R6 = c28655q.m87133R();
                if (z24 || objM87133R6 == c28676v0) {
                    objM87133R6 = new e(viewState, function4, null);
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, boolValueOf2);
                c2314t = C2314t.f9131w;
                f13 = 8;
                float f18 = 2 * f13;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f18, 0.0f, f18, 0.0f, 10), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C22957g c22957g = AbstractC22977m.f90653d;
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 6);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    i17 = i15;
                } else {
                    i17 = i15;
                    if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    function5 = function4;
                    if (m88091o(interfaceC28670t2M64044h)) {
                        function6 = function5;
                        c2314t2 = c2314t;
                        i18 = i16;
                        c28676v1 = c28676v0;
                        z25 = true;
                        d3 = 2.5d;
                        z26 = false;
                        c28655q.m87150e0(870041840);
                        f14 = f13;
                        AbstractC25012a.m73388u((float) 3.5d, f14, c2314t2, c28655q, false);
                    } else {
                        c28655q.m87150e0(868523274);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        TextResource textResourceM88112r = viewState.getTitle();
                        int i25 = TextResource.$stable;
                        String strM21274h = AbstractC8693b.m21274h(textResourceM88112r, c28655q, i25);
                        C38072d c38072d = C38072d.f163053a;
                        int i26 = C38072d.f163054b;
                        C2886a c2886aM8417O = c38072d.m121952e(c28655q, i26).getT2();
                        long jM125430y = c38072d.m121949b(c28655q, i26).getBrandWhite();
                        int i27 = C2886a.f11498d << 18;
                        c23454a1 = null;
                        function6 = function5;
                        i18 = i16;
                        z25 = true;
                        AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 0, i27, 196602);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(1 * f13, c2314t));
                        AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i25), null, c38072d.m121949b(c28655q, i26).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i26).getB1(), null, c28655q, 0, i27, 196602);
                        c28655q = c28655q;
                        d3 = 2.5d;
                        f16 = ((float) 2.5d) * f13;
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                        c28998fM88103i = viewState.getErrorCalloutState();
                        if (c28998fM88103i == null) {
                            c28655q.m87150e0(1155300936);
                            z26 = false;
                            c28655q.m87173q(false);
                            c2314t2 = c2314t;
                            f17 = f16;
                            c28676v1 = c28676v0;
                        } else {
                            z26 = false;
                            c28655q.m87150e0(1155300937);
                            EnumC16313m0 enumC16313m0 = EnumC16313m0.TINY_ATTENTION_ORANGE;
                            TextResource textResourceM88073a = c28998fM88103i.getMessage();
                            objM87133R9 = c28655q.m87133R();
                            c28676v1 = c28676v0;
                            if (objM87133R9 == c28676v1) {
                                objM87133R9 = f.f117334w;
                                c28655q.m87172p0(objM87133R9);
                            }
                            InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) objM87133R9);
                            objM87133R10 = c28655q.m87133R();
                            if (objM87133R10 == c28676v1) {
                                objM87133R10 = g.f117335w;
                                c28655q.m87172p0(objM87133R10);
                            }
                            c2314t2 = c2314t;
                            f17 = f16;
                            AbstractC4106r2.m12647f(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f17, 7), new C4092p2(enumC16313m0, 0.0f, null, null, textResourceM88073a, null, interfaceC39332eM125323a, null, p745y81.Function1.m125323a((Function1) objM87133R10), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                            c28655q.m87173q(false);
                            c23454a1 = c23454a0;
                        }
                        if (c23454a1 == null) {
                            c28655q.m87150e0(1155853047);
                            c4092p2M88106l = viewState.getInfoCalloutTitleState();
                            if (c4092p2M88106l == null) {
                                c28655q.m87150e0(-1807941957);
                                c28655q.m87173q(z26);
                            } else {
                                c28655q.m87150e0(-1807941956);
                                AbstractC4106r2.m12647f(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f17, 7), c4092p2M88106l, null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                                c28655q.m87173q(z26);
                            }
                            c28655q.m87173q(z26);
                        } else {
                            c2314t2 = c2314t2;
                            c28655q.m87150e0(1007098493);
                            c28655q.m87173q(z26);
                        }
                        m88082f(viewState.m88097c(), c28655q, z26 ? 1 : 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(z26);
                        f14 = f13;
                    }
                    f15 = ((float) d3) * f14;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t2));
                    c29855eM88105k = viewState.getFormValidator();
                    if (c29855eM88105k == null) {
                        c28655q.m87150e0(870305897);
                        c28655q.m87173q(z26);
                        function7 = function6;
                    } else {
                        c28655q.m87150e0(870305898);
                        boolean zM88089m = m88089m(interfaceC28601c1);
                        strM88115u = viewState.getUserCountryCode();
                        if (strM88115u == null) {
                            strM88115u = "";
                        }
                        i19 = i18;
                        if (i19 == 32) {
                            z27 = z25;
                        } else {
                            z27 = z26;
                        }
                        objM87133R7 = c28655q.m87133R();
                        if (!z27 || objM87133R7 == c28676v1) {
                            function7 = function6;
                            objM87133R7 = new C9812h(function7, 6);
                            c28655q.m87172p0(objM87133R7);
                        } else {
                            function7 = function6;
                        }
                        InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R7;
                        if (i19 == 32) {
                            z28 = z25;
                        } else {
                            z28 = z26;
                        }
                        objM87133R8 = c28655q.m87133R();
                        if (z28 || objM87133R8 == c28676v1) {
                            objM87133R8 = new C29000h(function7, 0);
                            c28655q.m87172p0(objM87133R8);
                        }
                        C28655q c28655q2 = c28655q;
                        AbstractC28996d.m88064w(viewState, c29855eM88105k, zM88089m, strM88115u, null, null, interfaceC4351m, (Function1) objM87133R8, c28655q2, (i17 & 14) | (C29855e.f122028d << 3), 48);
                        c28655q = c28655q2;
                        c28655q.m87173q(z26);
                    }
                    textResourceM88102h = viewState.getDisclaimerText();
                    if (textResourceM88102h == null) {
                        c28655q.m87150e0(871056779);
                        c28655q.m87173q(z26);
                        c2314t3 = c2314t2;
                    } else {
                        AbstractC33745d.m106667z(c28655q, 871056780, c2314t2, f15, c28655q);
                        String strM21274h2 = AbstractC8693b.m21274h(textResourceM88102h, c28655q, TextResource.$stable);
                        C38072d c38072d2 = C38072d.f163053a;
                        int i28 = C38072d.f163054b;
                        C2886a c2886aM8420a = c38072d2.m121952e(c28655q, i28).getB1();
                        C28655q c28655q3 = c28655q;
                        c2314t3 = c2314t2;
                        AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, i28).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                        c28655q = c28655q3;
                        c28655q.m87173q(z26);
                    }
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3412i(c2314t3, 4 * f14, 17 * f14)));
                    c28655q.m87173q(true);
                    function3 = function7;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                function5 = function4;
                if (m88091o(interfaceC28670t2M64044h)) {
                    c28655q.m87150e0(868523274);
                    C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                    TextResource textResourceM88112r2 = viewState.getTitle();
                    int i29 = TextResource.$stable;
                    String strM21274h3 = AbstractC8693b.m21274h(textResourceM88112r2, c28655q, i29);
                    C38072d c38072d3 = C38072d.f163053a;
                    int i210 = C38072d.f163054b;
                    C2886a c2886aM8417O2 = c38072d3.m121952e(c28655q, i210).getT2();
                    long jM125430y2 = c38072d3.m121949b(c28655q, i210).getBrandWhite();
                    int i211 = C2886a.f11498d << 18;
                    c23454a1 = null;
                    function6 = function5;
                    i18 = i16;
                    z25 = true;
                    AbstractC30795n.m94707h(strM21274h3, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O2, null, c28655q, 0, i211, 196602);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(1 * f13, c2314t));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i29), null, c38072d3.m121949b(c28655q, i210).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i210).getB1(), null, c28655q, 0, i211, 196602);
                    c28655q = c28655q;
                    d3 = 2.5d;
                    f16 = ((float) 2.5d) * f13;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                    c28998fM88103i = viewState.getErrorCalloutState();
                    if (c28998fM88103i == null) {
                        c28655q.m87150e0(1155300936);
                        z26 = false;
                        c28655q.m87173q(false);
                        c2314t2 = c2314t;
                        f17 = f16;
                        c28676v1 = c28676v0;
                    } else {
                        z26 = false;
                        c28655q.m87150e0(1155300937);
                        EnumC16313m0 enumC16313m1 = EnumC16313m0.TINY_ATTENTION_ORANGE;
                        TextResource textResourceM88073a2 = c28998fM88103i.getMessage();
                        objM87133R9 = c28655q.m87133R();
                        c28676v1 = c28676v0;
                        if (objM87133R9 == c28676v1) {
                            objM87133R9 = f.f117334w;
                            c28655q.m87172p0(objM87133R9);
                        }
                        InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a((Function1) objM87133R9);
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v1) {
                            objM87133R10 = g.f117335w;
                            c28655q.m87172p0(objM87133R10);
                        }
                        c2314t2 = c2314t;
                        f17 = f16;
                        AbstractC4106r2.m12647f(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f17, 7), new C4092p2(enumC16313m1, 0.0f, null, null, textResourceM88073a2, null, interfaceC39332eM125323a2, null, p745y81.Function1.m125323a((Function1) objM87133R10), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                        c28655q.m87173q(false);
                        c23454a1 = c23454a0;
                    }
                    if (c23454a1 == null) {
                        c28655q.m87150e0(1155853047);
                        c4092p2M88106l = viewState.getInfoCalloutTitleState();
                        if (c4092p2M88106l == null) {
                            c28655q.m87150e0(-1807941957);
                            c28655q.m87173q(z26);
                        } else {
                            c28655q.m87150e0(-1807941956);
                            AbstractC4106r2.m12647f(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f17, 7), c4092p2M88106l, null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                            c28655q.m87173q(z26);
                        }
                        c28655q.m87173q(z26);
                    } else {
                        c2314t2 = c2314t2;
                        c28655q.m87150e0(1007098493);
                        c28655q.m87173q(z26);
                    }
                    m88082f(viewState.m88097c(), c28655q, z26 ? 1 : 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(z26);
                    f14 = f13;
                } else {
                    function6 = function5;
                    c2314t2 = c2314t;
                    i18 = i16;
                    c28676v1 = c28676v0;
                    z25 = true;
                    d3 = 2.5d;
                    z26 = false;
                    c28655q.m87150e0(870041840);
                    f14 = f13;
                    AbstractC25012a.m73388u((float) 3.5d, f14, c2314t2, c28655q, false);
                }
                f15 = ((float) d3) * f14;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t2));
                c29855eM88105k = viewState.getFormValidator();
                if (c29855eM88105k == null) {
                    c28655q.m87150e0(870305897);
                    c28655q.m87173q(z26);
                    function7 = function6;
                } else {
                    c28655q.m87150e0(870305898);
                    boolean zM88089m2 = m88089m(interfaceC28601c1);
                    strM88115u = viewState.getUserCountryCode();
                    if (strM88115u == null) {
                        strM88115u = "";
                    }
                    i19 = i18;
                    if (i19 == 32) {
                        z27 = z25;
                    } else {
                        z27 = z26;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z27) {
                        function7 = function6;
                        objM87133R7 = new C9812h(function7, 6);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        function7 = function6;
                        objM87133R7 = new C9812h(function7, 6);
                        c28655q.m87172p0(objM87133R7);
                    }
                    InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) objM87133R7;
                    if (i19 == 32) {
                        z28 = z25;
                    } else {
                        z28 = z26;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z28) {
                        objM87133R8 = new C29000h(function7, 0);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C29000h(function7, 0);
                        c28655q.m87172p0(objM87133R8);
                    }
                    C28655q c28655q4 = c28655q;
                    AbstractC28996d.m88064w(viewState, c29855eM88105k, zM88089m2, strM88115u, null, null, interfaceC4351m2, (Function1) objM87133R8, c28655q4, (i17 & 14) | (C29855e.f122028d << 3), 48);
                    c28655q = c28655q4;
                    c28655q.m87173q(z26);
                }
                textResourceM88102h = viewState.getDisclaimerText();
                if (textResourceM88102h == null) {
                    c28655q.m87150e0(871056779);
                    c28655q.m87173q(z26);
                    c2314t3 = c2314t2;
                } else {
                    AbstractC33745d.m106667z(c28655q, 871056780, c2314t2, f15, c28655q);
                    String strM21274h4 = AbstractC8693b.m21274h(textResourceM88102h, c28655q, TextResource.$stable);
                    C38072d c38072d4 = C38072d.f163053a;
                    int i212 = C38072d.f163054b;
                    C2886a c2886aM8420a2 = c38072d4.m121952e(c28655q, i212).getB1();
                    C28655q c28655q5 = c28655q;
                    c2314t3 = c2314t2;
                    AbstractC30795n.m94707h(strM21274h4, null, c38072d4.m121949b(c28655q, i212).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a2, null, c28655q5, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q5;
                    c28655q.m87173q(z26);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3412i(c2314t3, 4 * f14, 17 * f14)));
                c28655q.m87173q(true);
                function3 = function7;
            } else {
                c28655q.m87138X();
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C26984y0(viewState, i13, function3, i14, 16);
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
            if (i24 != 0) {
                objM87133R11 = c28655q.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = new C28884h1(8);
                    c28655q.m87172p0(objM87133R11);
                }
                function4 = (Function1) objM87133R11;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            interfaceC28670t2M64044h = AbstractC22290s.m64044h(c28655q, 0);
            boolean zM87157i6 = c28655q.m87157i(viewState);
            i16 = i15 & 112;
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i6 | z13;
            objM87133R2 = c28655q.m87133R();
            if (z14) {
                objM87133R2 = new a(viewState, function4, null);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new a(viewState, function4, null);
                c28655q.m87172p0(objM87133R2);
            }
            c23454a0 = C23454a0.f92919a;
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
            String strM88111q2 = viewState.getStripeToken();
            boolean zM87157i7 = c28655q.m87157i(viewState);
            if (i16 == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            z16 = zM87157i7 | z15;
            objM87133R3 = c28655q.m87133R();
            if (z16) {
                objM87133R3 = new b(viewState, function4, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new b(viewState, function4, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, strM88111q2);
            String strM88108n2 = viewState.getPaymentMethodId();
            boolean zM87157i8 = c28655q.m87157i(viewState);
            if (i16 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = zM87157i8 | z17;
            objM87133R4 = c28655q.m87133R();
            if (z18) {
                objM87133R4 = new c(viewState, function4, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new c(viewState, function4, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, strM88108n2);
            Boolean boolValueOf3 = Boolean.valueOf(viewState.getIsLoadingStripeToken());
            zM87157i = c28655q.m87157i(viewState);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R5 = new d(viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new d(viewState, interfaceC28601c1, null);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R5, boolValueOf3);
            Boolean boolValueOf4 = Boolean.valueOf(viewState.getShowFullScreenError());
            boolean zM87157i9 = c28655q.m87157i(viewState);
            if (i16 == 32) {
                z19 = true;
            } else {
                z19 = false;
            }
            z24 = zM87157i9 | z19;
            objM87133R6 = c28655q.m87133R();
            if (z24) {
                objM87133R6 = new e(viewState, function4, null);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new e(viewState, function4, null);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R6, boolValueOf4);
            c2314t = C2314t.f9131w;
            f13 = 8;
            float f19 = 2 * f13;
            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f19, 0.0f, f19, 0.0f, 10), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            C22957g c22957g2 = AbstractC22977m.f90653d;
            c2305k = C2299e.f9110M;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q, 6);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM92116f1);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                i17 = i15;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                function5 = function4;
                if (m88091o(interfaceC28670t2M64044h)) {
                    c28655q.m87150e0(868523274);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                    TextResource textResourceM88112r3 = viewState.getTitle();
                    int i213 = TextResource.$stable;
                    String strM21274h5 = AbstractC8693b.m21274h(textResourceM88112r3, c28655q, i213);
                    C38072d c38072d5 = C38072d.f163053a;
                    int i214 = C38072d.f163054b;
                    C2886a c2886aM8417O3 = c38072d5.m121952e(c28655q, i214).getT2();
                    long jM125430y3 = c38072d5.m121949b(c28655q, i214).getBrandWhite();
                    int i215 = C2886a.f11498d << 18;
                    c23454a1 = null;
                    function6 = function5;
                    i18 = i16;
                    z25 = true;
                    AbstractC30795n.m94707h(strM21274h5, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O3, null, c28655q, 0, i215, 196602);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(1 * f13, c2314t));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i213), null, c38072d5.m121949b(c28655q, i214).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q, i214).getB1(), null, c28655q, 0, i215, 196602);
                    c28655q = c28655q;
                    d3 = 2.5d;
                    f16 = ((float) 2.5d) * f13;
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                    c28998fM88103i = viewState.getErrorCalloutState();
                    if (c28998fM88103i == null) {
                        c28655q.m87150e0(1155300936);
                        z26 = false;
                        c28655q.m87173q(false);
                        c2314t2 = c2314t;
                        f17 = f16;
                        c28676v1 = c28676v0;
                    } else {
                        z26 = false;
                        c28655q.m87150e0(1155300937);
                        EnumC16313m0 enumC16313m2 = EnumC16313m0.TINY_ATTENTION_ORANGE;
                        TextResource textResourceM88073a3 = c28998fM88103i.getMessage();
                        objM87133R9 = c28655q.m87133R();
                        c28676v1 = c28676v0;
                        if (objM87133R9 == c28676v1) {
                            objM87133R9 = f.f117334w;
                            c28655q.m87172p0(objM87133R9);
                        }
                        InterfaceC39332e interfaceC39332eM125323a3 = p745y81.Function1.m125323a((Function1) objM87133R9);
                        objM87133R10 = c28655q.m87133R();
                        if (objM87133R10 == c28676v1) {
                            objM87133R10 = g.f117335w;
                            c28655q.m87172p0(objM87133R10);
                        }
                        c2314t2 = c2314t;
                        f17 = f16;
                        AbstractC4106r2.m12647f(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f17, 7), new C4092p2(enumC16313m2, 0.0f, null, null, textResourceM88073a3, null, interfaceC39332eM125323a3, null, p745y81.Function1.m125323a((Function1) objM87133R10), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                        c28655q.m87173q(false);
                        c23454a1 = c23454a0;
                    }
                    if (c23454a1 == null) {
                        c28655q.m87150e0(1155853047);
                        c4092p2M88106l = viewState.getInfoCalloutTitleState();
                        if (c4092p2M88106l == null) {
                            c28655q.m87150e0(-1807941957);
                            c28655q.m87173q(z26);
                        } else {
                            c28655q.m87150e0(-1807941956);
                            AbstractC4106r2.m12647f(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f17, 7), c4092p2M88106l, null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                            c28655q.m87173q(z26);
                        }
                        c28655q.m87173q(z26);
                    } else {
                        c2314t2 = c2314t2;
                        c28655q.m87150e0(1007098493);
                        c28655q.m87173q(z26);
                    }
                    m88082f(viewState.m88097c(), c28655q, z26 ? 1 : 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(z26);
                    f14 = f13;
                } else {
                    function6 = function5;
                    c2314t2 = c2314t;
                    i18 = i16;
                    c28676v1 = c28676v0;
                    z25 = true;
                    d3 = 2.5d;
                    z26 = false;
                    c28655q.m87150e0(870041840);
                    f14 = f13;
                    AbstractC25012a.m73388u((float) 3.5d, f14, c2314t2, c28655q, false);
                }
                f15 = ((float) d3) * f14;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t2));
                c29855eM88105k = viewState.getFormValidator();
                if (c29855eM88105k == null) {
                    c28655q.m87150e0(870305897);
                    c28655q.m87173q(z26);
                    function7 = function6;
                } else {
                    c28655q.m87150e0(870305898);
                    boolean zM88089m3 = m88089m(interfaceC28601c1);
                    strM88115u = viewState.getUserCountryCode();
                    if (strM88115u == null) {
                        strM88115u = "";
                    }
                    i19 = i18;
                    if (i19 == 32) {
                        z27 = z25;
                    } else {
                        z27 = z26;
                    }
                    objM87133R7 = c28655q.m87133R();
                    if (z27) {
                        function7 = function6;
                        objM87133R7 = new C9812h(function7, 6);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        function7 = function6;
                        objM87133R7 = new C9812h(function7, 6);
                        c28655q.m87172p0(objM87133R7);
                    }
                    InterfaceC4351m interfaceC4351m3 = (InterfaceC4351m) objM87133R7;
                    if (i19 == 32) {
                        z28 = z25;
                    } else {
                        z28 = z26;
                    }
                    objM87133R8 = c28655q.m87133R();
                    if (z28) {
                        objM87133R8 = new C29000h(function7, 0);
                        c28655q.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C29000h(function7, 0);
                        c28655q.m87172p0(objM87133R8);
                    }
                    C28655q c28655q6 = c28655q;
                    AbstractC28996d.m88064w(viewState, c29855eM88105k, zM88089m3, strM88115u, null, null, interfaceC4351m3, (Function1) objM87133R8, c28655q6, (i17 & 14) | (C29855e.f122028d << 3), 48);
                    c28655q = c28655q6;
                    c28655q.m87173q(z26);
                }
                textResourceM88102h = viewState.getDisclaimerText();
                if (textResourceM88102h == null) {
                    c28655q.m87150e0(871056779);
                    c28655q.m87173q(z26);
                    c2314t3 = c2314t2;
                } else {
                    AbstractC33745d.m106667z(c28655q, 871056780, c2314t2, f15, c28655q);
                    String strM21274h6 = AbstractC8693b.m21274h(textResourceM88102h, c28655q, TextResource.$stable);
                    C38072d c38072d6 = C38072d.f163053a;
                    int i216 = C38072d.f163054b;
                    C2886a c2886aM8420a3 = c38072d6.m121952e(c28655q, i216).getB1();
                    C28655q c28655q7 = c28655q;
                    c2314t3 = c2314t2;
                    AbstractC30795n.m94707h(strM21274h6, null, c38072d6.m121949b(c28655q, i216).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a3, null, c28655q7, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q7;
                    c28655q.m87173q(z26);
                }
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3412i(c2314t3, 4 * f14, 17 * f14)));
                c28655q.m87173q(true);
                function3 = function7;
            } else {
                i17 = i15;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            function5 = function4;
            if (m88091o(interfaceC28670t2M64044h)) {
                c28655q.m87150e0(868523274);
                C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a6);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                TextResource textResourceM88112r4 = viewState.getTitle();
                int i217 = TextResource.$stable;
                String strM21274h7 = AbstractC8693b.m21274h(textResourceM88112r4, c28655q, i217);
                C38072d c38072d7 = C38072d.f163053a;
                int i218 = C38072d.f163054b;
                C2886a c2886aM8417O4 = c38072d7.m121952e(c28655q, i218).getT2();
                long jM125430y4 = c38072d7.m121949b(c28655q, i218).getBrandWhite();
                int i219 = C2886a.f11498d << 18;
                c23454a1 = null;
                function6 = function5;
                i18 = i16;
                z25 = true;
                AbstractC30795n.m94707h(strM21274h7, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O4, null, c28655q, 0, i219, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(1 * f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i217), null, c38072d7.m121949b(c28655q, i218).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d7.m121952e(c28655q, i218).getB1(), null, c28655q, 0, i219, 196602);
                c28655q = c28655q;
                d3 = 2.5d;
                f16 = ((float) 2.5d) * f13;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t));
                c28998fM88103i = viewState.getErrorCalloutState();
                if (c28998fM88103i == null) {
                    c28655q.m87150e0(1155300936);
                    z26 = false;
                    c28655q.m87173q(false);
                    c2314t2 = c2314t;
                    f17 = f16;
                    c28676v1 = c28676v0;
                } else {
                    z26 = false;
                    c28655q.m87150e0(1155300937);
                    EnumC16313m0 enumC16313m3 = EnumC16313m0.TINY_ATTENTION_ORANGE;
                    TextResource textResourceM88073a4 = c28998fM88103i.getMessage();
                    objM87133R9 = c28655q.m87133R();
                    c28676v1 = c28676v0;
                    if (objM87133R9 == c28676v1) {
                        objM87133R9 = f.f117334w;
                        c28655q.m87172p0(objM87133R9);
                    }
                    InterfaceC39332e interfaceC39332eM125323a4 = p745y81.Function1.m125323a((Function1) objM87133R9);
                    objM87133R10 = c28655q.m87133R();
                    if (objM87133R10 == c28676v1) {
                        objM87133R10 = g.f117335w;
                        c28655q.m87172p0(objM87133R10);
                    }
                    c2314t2 = c2314t;
                    f17 = f16;
                    AbstractC4106r2.m12647f(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f17, 7), new C4092p2(enumC16313m3, 0.0f, null, null, textResourceM88073a4, null, interfaceC39332eM125323a4, null, p745y81.Function1.m125323a((Function1) objM87133R10), null, null, null, null, false, null, null, null, null, null, null, 1048238, null), null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                    c28655q.m87173q(false);
                    c23454a1 = c23454a0;
                }
                if (c23454a1 == null) {
                    c28655q.m87150e0(1155853047);
                    c4092p2M88106l = viewState.getInfoCalloutTitleState();
                    if (c4092p2M88106l == null) {
                        c28655q.m87150e0(-1807941957);
                        c28655q.m87173q(z26);
                    } else {
                        c28655q.m87150e0(-1807941956);
                        AbstractC4106r2.m12647f(AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f17, 7), c4092p2M88106l, null, c28655q, (C4092p2.f16593v << 3) | 6, 4);
                        c28655q.m87173q(z26);
                    }
                    c28655q.m87173q(z26);
                } else {
                    c2314t2 = c2314t2;
                    c28655q.m87150e0(1007098493);
                    c28655q.m87173q(z26);
                }
                m88082f(viewState.m88097c(), c28655q, z26 ? 1 : 0);
                c28655q.m87173q(true);
                c28655q.m87173q(z26);
                f14 = f13;
            } else {
                function6 = function5;
                c2314t2 = c2314t;
                i18 = i16;
                c28676v1 = c28676v0;
                z25 = true;
                d3 = 2.5d;
                z26 = false;
                c28655q.m87150e0(870041840);
                f14 = f13;
                AbstractC25012a.m73388u((float) 3.5d, f14, c2314t2, c28655q, false);
            }
            f15 = ((float) d3) * f14;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t2));
            c29855eM88105k = viewState.getFormValidator();
            if (c29855eM88105k == null) {
                c28655q.m87150e0(870305897);
                c28655q.m87173q(z26);
                function7 = function6;
            } else {
                c28655q.m87150e0(870305898);
                boolean zM88089m4 = m88089m(interfaceC28601c1);
                strM88115u = viewState.getUserCountryCode();
                if (strM88115u == null) {
                    strM88115u = "";
                }
                i19 = i18;
                if (i19 == 32) {
                    z27 = z25;
                } else {
                    z27 = z26;
                }
                objM87133R7 = c28655q.m87133R();
                if (z27) {
                    function7 = function6;
                    objM87133R7 = new C9812h(function7, 6);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    function7 = function6;
                    objM87133R7 = new C9812h(function7, 6);
                    c28655q.m87172p0(objM87133R7);
                }
                InterfaceC4351m interfaceC4351m4 = (InterfaceC4351m) objM87133R7;
                if (i19 == 32) {
                    z28 = z25;
                } else {
                    z28 = z26;
                }
                objM87133R8 = c28655q.m87133R();
                if (z28) {
                    objM87133R8 = new C29000h(function7, 0);
                    c28655q.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C29000h(function7, 0);
                    c28655q.m87172p0(objM87133R8);
                }
                C28655q c28655q8 = c28655q;
                AbstractC28996d.m88064w(viewState, c29855eM88105k, zM88089m4, strM88115u, null, null, interfaceC4351m4, (Function1) objM87133R8, c28655q8, (i17 & 14) | (C29855e.f122028d << 3), 48);
                c28655q = c28655q8;
                c28655q.m87173q(z26);
            }
            textResourceM88102h = viewState.getDisclaimerText();
            if (textResourceM88102h == null) {
                c28655q.m87150e0(871056779);
                c28655q.m87173q(z26);
                c2314t3 = c2314t2;
            } else {
                AbstractC33745d.m106667z(c28655q, 871056780, c2314t2, f15, c28655q);
                String strM21274h8 = AbstractC8693b.m21274h(textResourceM88102h, c28655q, TextResource.$stable);
                C38072d c38072d8 = C38072d.f163053a;
                int i2110 = C38072d.f163054b;
                C2886a c2886aM8420a4 = c38072d8.m121952e(c28655q, i2110).getB1();
                C28655q c28655q9 = c28655q;
                c2314t3 = c2314t2;
                AbstractC30795n.m94707h(strM21274h8, null, c38072d8.m121949b(c28655q, i2110).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a4, null, c28655q9, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q9;
                c28655q.m87173q(z26);
            }
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3406c(1.0f, AbstractC1102d.m3412i(c2314t3, 4 * f14, 17 * f14)));
            c28655q.m87173q(true);
            function3 = function7;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26984y0(viewState, i13, function3, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m88085i(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m88086j(Function1 function1, boolean z4, C28997e card) {
        AbstractC22676k.m65750j(card, "card");
        function1.invoke(new C29006n(card));
        if (z4) {
            function1.invoke(EnumC3921e.ENABLE);
        } else {
            function1.invoke(EnumC3921e.DISABLE);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m88087k(Function1 function1, Object analyticsEvent) {
        AbstractC22676k.m65750j(analyticsEvent, "analyticsEvent");
        function1.invoke(analyticsEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m88088l(C29002j c29002j, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m88084h(c29002j, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final boolean m88089m(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final void m88090n(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: o */
    private static final boolean m88091o(InterfaceC28670t2 interfaceC28670t2) {
        return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
    }
}
