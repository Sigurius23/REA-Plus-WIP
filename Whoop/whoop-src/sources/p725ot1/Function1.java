package p725ot1;

import a81.C0556g;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.AbstractC2890e;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bf0.C3196h;
import bm0.C3412o;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cd0.C4435a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf3.C21647a;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kotlin.C2026r;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25260n;
import m83.AbstractC25267u;
import nf3.C26669a;
import no.nordicsemi.android.dfu.DfuBaseService;
import nq0.C27050m;
import nt1.C27124c;
import nt1.C27130i;
import nt1.InterfaceC27122a;
import nt1.InterfaceC27125d;
import nw0.C27207n;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import of2.C27900d;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p249jc.AbstractC21598x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p701ce2.C4493a;
import p709he2.C17219e;
import p709he2.C17220f;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p717lq2.C24679k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.EnumC39333f;
import pf.AbstractC29125c;
import pf3.C29155a;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rs1.AbstractC31794f;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sy0.AbstractC33087j;
import sy0.AbstractC33088k;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ot1.c, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0016\u001a\u00020\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a-\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a+\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u001c2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000H\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006!²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lkotlin/Function1;", "Lnt1/a$c;", "Ll83/a0;", "onNavEvent", "H", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lnt1/d;", "viewState", "Lnt1/a;", "onEvent", "I", "(Lnt1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lnt1/d$b;", "", "selectedRegion", "Lkotlin/Function0;", "showRegionsModal", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lnt1/d$b;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "Lcom/whoop/design/util/TextResource;", "conditions", "u", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "label", "title", "V", "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lnt1/d$a;", "C", "(Lnt1/d$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lnt1/c;", "viewModel", "labrador_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function1 {

    /* JADX INFO: renamed from: ot1.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.view.LabradorEligibilityScreenKt$FullScreenModalScreens$1$4$1", m100430f = "LabradorEligibilityScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f114227w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC27125d.a f114228x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f114229y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC27125d.a aVar, p715kotlin.jvm.functions.Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f114228x = aVar;
            this.f114229y = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f114228x, this.f114229y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f114227w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC27122a interfaceC27122aM81526c = this.f114228x.getFollowUpEvent();
            if (interfaceC27122aM81526c != null) {
                this.f114229y.invoke(interfaceC27122aM81526c);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ot1.c$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f114230w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f114231x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f114232y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f114233z;

        /* JADX INFO: renamed from: ot1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f114234w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f114234w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f114234w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f114230w = c38266c;
            this.f114231x = interfaceC35951a;
            this.f114232y = interfaceC4339a;
            this.f114233z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, nt1.c] */
        @Override // c93.InterfaceC4339a
        public final C27124c invoke() {
            return AbstractC21598x.m60668X(this.f114230w, this.f114231x, new a(this.f114233z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27124c.class), null, this.f114232y);
        }
    }

    /* JADX INFO: renamed from: ot1.c$c */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.view.LabradorEligibilityScreenKt$LabradorEligibilityScreen$1$1", m100430f = "LabradorEligibilityScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f114235w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC23462h f114236x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f114236x = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f114236x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f114235w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Function1.m85798J(this.f114236x).m81523p(InterfaceC27122a.d.f108402a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ot1.c$d */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.view.LabradorEligibilityScreenKt$LabradorEligibilityScreen$4$1$1", m100430f = "LabradorEligibilityScreen.kt", m100431l = {106}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f114237w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f114238x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C15199y3 c15199y3, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f114238x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f114238x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f114237w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f114238x;
                this.f114237w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ot1.c$e */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.view.LabradorEligibilityScreenKt$LabradorEligibilityScreen$5$1$1$1", m100430f = "LabradorEligibilityScreen.kt", m100431l = {121}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f114239w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f114240x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C15199y3 c15199y3, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f114240x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f114240x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f114239w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f114240x;
                this.f114239w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ot1.c$f */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.view.LabradorEligibilityScreenKt$LabradorEligibilityScreen$6$1$1$1", m100430f = "LabradorEligibilityScreen.kt", m100431l = {126}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f114241w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f114242x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C15199y3 c15199y3, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f114242x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f114242x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f114241w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f114242x;
                this.f114241w = 1;
                if (c15199y3.m43225f(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m85789A(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(InterfaceC27122a.b.f108401a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m85790B(InterfaceC27125d.b bVar, p715kotlin.jvm.functions.Function1 function1, String str, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m85836w(bVar, function1, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m85791C(final InterfaceC27125d.a aVar, final p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13) {
        int i14;
        p715kotlin.jvm.functions.Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-570914733);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean z4 = aVar.getType() instanceof AbstractC33208p0.h;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(608834358);
                boolean zM87157i = c28655q.m87157i(aVar) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    final int i15 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: ot1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i15) {
                                case 0:
                                    return Function1.m85792D(aVar, function1);
                                case 1:
                                    return Function1.m85793E(aVar, function1);
                                default:
                                    return Function1.m85794F(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC33199m0.m105214F(new AbstractC33208p0.h(null, 0L, (InterfaceC4339a) objM87133R, 3, null), aVar.getSupportText(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(false);
                function2 = function1;
            } else {
                c28655q.m87150e0(609136701);
                int i16 = i14;
                AbstractC33208p0 abstractC33208p0M81532i = aVar.getType();
                TextResource textResourceM81531h = aVar.getSupportText();
                TextResource textResourceM81528e = aVar.getPrimaryButtonText();
                int i17 = i16 & 112;
                boolean zM87157i2 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    final int i18 = 1;
                    objM87133R2 = new InterfaceC4339a() { // from class: ot1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i18) {
                                case 0:
                                    return Function1.m85792D(aVar, function1);
                                case 1:
                                    return Function1.m85793E(aVar, function1);
                                default:
                                    return Function1.m85794F(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                TextResource textResourceM81530g = aVar.getSecondaryButtonText();
                boolean zM87157i3 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R3 = c28655q.m87133R();
                if (zM87157i3 || objM87133R3 == c28676v0) {
                    final int i19 = 2;
                    objM87133R3 = new InterfaceC4339a() { // from class: ot1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i19) {
                                case 0:
                                    return Function1.m85792D(aVar, function1);
                                case 1:
                                    return Function1.m85793E(aVar, function1);
                                default:
                                    return Function1.m85794F(aVar, function1);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                int i24 = 196608 | AbstractC33208p0.f138461d;
                int i25 = TextResource.$stable;
                AbstractC33199m0.m105214F(abstractC33208p0M81532i, textResourceM81531h, null, textResourceM81528e, interfaceC4339a, true, false, textResourceM81530g, interfaceC4339a2, null, false, false, c28655q, i24 | (i25 << 3) | (i25 << 9) | (i25 << 21), 0, 3652);
                InterfaceC27122a interfaceC27122aM81526c = aVar.getFollowUpEvent();
                boolean zM87157i4 = c28655q.m87157i(aVar) | (i17 == 32);
                Object objM87133R4 = c28655q.m87133R();
                if (zM87157i4 || objM87133R4 == c28676v0) {
                    function2 = function1;
                    objM87133R4 = new a(aVar, function2, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    function2 = function1;
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, interfaceC27122aM81526c);
                c28655q.m87173q(false);
            }
        } else {
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(aVar, function2, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m85792D(InterfaceC27125d.a aVar, p715kotlin.jvm.functions.Function1 function1) {
        InterfaceC27122a interfaceC27122aM81526c = aVar.getFollowUpEvent();
        if (interfaceC27122aM81526c != null) {
            function1.invoke(interfaceC27122aM81526c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m85793E(InterfaceC27125d.a aVar, p715kotlin.jvm.functions.Function1 function1) {
        InterfaceC27122a interfaceC27122aM81527d = aVar.getPrimaryButtonClickEvent();
        if (interfaceC27122aM81527d != null) {
            function1.invoke(interfaceC27122aM81527d);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m85794F(InterfaceC27125d.a aVar, p715kotlin.jvm.functions.Function1 function1) {
        InterfaceC27122a interfaceC27122aM81529f = aVar.getSecondaryButtonClickEvent();
        if (interfaceC27122aM81529f != null) {
            function1.invoke(interfaceC27122aM81529f);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m85795G(InterfaceC27125d.a aVar, p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m85791C(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    public static final void m85796H(p715kotlin.jvm.functions.Function1 onNavEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(onNavEvent, "onNavEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1543739044);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(onNavEvent) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new b(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) objM87133R;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m85798J(interfaceC23462h).getViewState(), InterfaceC27125d.a.INSTANCE.m81534b(), null, c28655q, 0, 2);
            C27124c c27124cM85798J = m85798J(interfaceC23462h);
            boolean zM87157i = c28655q.m87157i(interfaceC23462h);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new c(interfaceC23462h, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c27124cM85798J);
            InterfaceC27125d interfaceC27125dM85799K = m85799K(interfaceC28601c1M87260n);
            boolean zM87157i2 = c28655q.m87157i(interfaceC23462h) | ((i14 & 14) == 4);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C4493a(onNavEvent, interfaceC23462h, 5);
                c28655q.m87172p0(objM87133R3);
            }
            m85797I(interfaceC27125dM85799K, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4435a(onNavEvent, i13, 14);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final void m85797I(InterfaceC27125d interfaceC27125d, p715kotlin.jvm.functions.Function1 onEvent, Composer composer, int i13) {
        int i14;
        p715kotlin.jvm.functions.Function1 function1;
        InterfaceC27125d viewState = interfaceC27125d;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-698294706);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            EnumC15209z3 enumC15209z3 = EnumC15209z3.f57106w;
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q, 3078, 6);
            boolean z4 = c15199y3M3460c.m43221b() != enumC15209z3;
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3M3460c);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C3196h(interfaceC2994c0, c15199y3M3460c, 19);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R2, z4, c28655q, 0, 0);
            if (viewState instanceof InterfaceC27125d.a) {
                c28655q.m87150e0(-1046296690);
                m85791C((InterfaceC27125d.a) viewState, onEvent, c28655q, i14 & 126);
                c28655q.m87173q(false);
                function1 = onEvent;
            } else {
                if (!(viewState instanceof InterfaceC27125d.b)) {
                    throw AbstractC11895b.m32003v(-1046298050, c28655q, false);
                }
                c28655q.m87150e0(1924684107);
                c28655q.m87150e0(-1046291137);
                InterfaceC27125d.b bVar = (InterfaceC27125d.b) viewState;
                List<TextResource> listM81556e = bVar.getRegionPicker().m81556e();
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM81556e, 10));
                Iterator<T> it = listM81556e.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC8693b.m21274h((TextResource) it.next(), c28655q, TextResource.$stable));
                }
                c28655q.m87173q(false);
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(AbstractC25260n.m74078s0(strArr));
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R3;
                C35666g c35666g = new C35666g(bVar.getRegionPicker().getTitle(), null, null, null, null, 0.0f, 0.0f, 126, null);
                AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y3M3460c);
                EnumC39333f enumC39333f = EnumC39333f.BLACK_50;
                C37816b c37816bM121344e = AbstractC37817c.m121344e(277334913, c28655q, new C2026r(viewState, interfaceC2994c0, c15199y3M3460c, interfaceC28601c1, 14));
                viewState = interfaceC27125d;
                function1 = onEvent;
                AbstractC35660d.m112871m(null, c35666g, aVar, enumC39333f, null, null, null, c37816bM121344e, false, null, null, null, false, null, AbstractC37817c.m121344e(-1413537731, c28655q, new C0556g((Object) viewState, function1, (Object) interfaceC2994c0, (Object) c15199y3M3460c, (Object) interfaceC28601c1, 11)), c28655q, (C35666g.f151591h << 3) | 12585984 | (AbstractC35664f.a.f151587c << 6), 24576, 16241);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
        } else {
            function1 = onEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27900d(viewState, function1, i13, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C27124c m85798J(InterfaceC23462h interfaceC23462h) {
        return (C27124c) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: K */
    private static final InterfaceC27125d m85799K(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC27125d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m85800L(InterfaceC27125d interfaceC27125d, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C27130i c27130iM81542h = ((InterfaceC27125d.b) interfaceC27125d).getRegionPicker();
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C17219e(1, interfaceC2994c0, c15199y3, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28328d.m85845f(c27130iM81542h, (p715kotlin.jvm.functions.Function1) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m85801M(InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, C15199y3 c15199y3, String it) {
        AbstractC22676k.m65750j(it, "it");
        m85809U(interfaceC28601c1, it);
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m85802N(InterfaceC27125d interfaceC27125d, p715kotlin.jvm.functions.Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC27125d.b bVar = (InterfaceC27125d.b) interfaceC27125d;
            String strM85808T = m85808T(interfaceC28601c1);
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C3196h(interfaceC2994c0, c15199y3, 20);
                c28655q.m87172p0(objM87133R);
            }
            m85836w(bVar, function1, strM85808T, (InterfaceC4339a) objM87133R, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m85803O(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m85804P(InterfaceC27125d interfaceC27125d, p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m85797I(interfaceC27125d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m85805Q(p715kotlin.jvm.functions.Function1 function1, InterfaceC23462h interfaceC23462h, InterfaceC27122a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC27122a.c) {
            function1.invoke(event);
        } else {
            if (!(event instanceof InterfaceC27122a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            m85798J(interfaceC23462h).m81523p((InterfaceC27122a.f) event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m85806R(p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m85796H(function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m85807S(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: T */
    private static final String m85808T(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: U */
    private static final void m85809U(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: V */
    private static final void m85810V(TextResource textResource, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1075961477);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(textResource) : c28655q2.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(interfaceC4339a) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2 * 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f13, 0.0f, 2);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            float f14 = 4;
            Modifier modifierM95629e = AbstractC31061c.m95629e(modifierM3396r, 3, f14, c38072d.m121949b(c28655q2, i15).getWhite10());
            boolean z4 = (i14 & 896) == 256;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C24679k(interfaceC4339a, 29);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM95629e, false, null, null, (InterfaceC4339a) objM87133R, 15);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3362g);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            int i16 = i14;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f13, 5 * f14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q2, 6);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3395q);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, TextResource.$stable | (i16 & 14));
            long jM125430y = c38072d.m121949b(c28655q2, i15).getBrandWhite();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q2, i15).getB1();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, 0, i17, 196602);
            AbstractC30795n.m94707h(str, null, c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q2, (i16 >> 3) & 14, i17, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17220f(textResource, str, interfaceC4339a, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m85811W(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m85812X(TextResource textResource, String str, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m85810V(textResource, str, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m85834u(List<? extends TextResource> list, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(226862093);
        int i14 = 2;
        int i15 = (i13 & 6) == 0 ? i13 | (c28655q.m87157i(list) ? 4 : 2) : i13;
        int i16 = 0;
        int i17 = 1;
        if (c28655q.m87135U(i15 & 1, (i15 & 3) != 2)) {
            for (TextResource textResource : list) {
                float f13 = i17;
                float f14 = 8 * f13;
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14, 0.0f, i14);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, i16);
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
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                C38072d c38072d = C38072d.f163053a;
                int i18 = C38072d.f163054b;
                long jM125430y = c38072d.m121949b(c28655q, i18).getBrandWhite();
                C2886a c2886aM8420a = c38072d.m121952e(c28655q, i18).getB1();
                int i19 = C2886a.f11498d << 18;
                C28655q c28655q2 = c28655q;
                AbstractC30795n.m94707h("•", null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q2, 6, i19, 196602);
                AbstractC38963t7.m124386p(f13, 4, c2314t, c28655q2);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q2, TextResource.$stable), null, c38072d.m121949b(c28655q2, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i18).getB1(), null, c28655q2, 0, i19, 196602);
                c28655q = c28655q2;
                AbstractC18489d0.m53356B(c28655q, true, c2314t, f14, c28655q);
                i17 = 1;
                i16 = i16;
                i14 = i14;
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3412o(list, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m85835v(List list, int i13, Composer composer, int i14) {
        m85834u(list, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    private static final void m85836w(InterfaceC27125d.b bVar, p715kotlin.jvm.functions.Function1 function1, String str, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        p715kotlin.jvm.functions.Function1 function2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(767555507);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(bVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
            C22961h c22961h = AbstractC22977m.f90656g;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM94757f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC6721d.a aVar = new AbstractC6721d.a(bVar.getPageTitle(), null, Integer.valueOf(bVar.getIcon()), AbstractC30060g.m92103Y(c28655q, AbstractC31794f.f131647b), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            int i15 = i14 & 112;
            boolean z4 = i15 == 32;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C27207n(function1, 15);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(bVar.getBackgroundImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3407d(1.0f, new LayoutWeightElement(1.0f, true)), null, C39102j.f168200b, 0.0f, null, c28655q, 24624, 104);
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f14, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            TextResource textResourceM81543i = bVar.getTitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM81543i, c28655q, i16);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
            C2886a c2886aM8417O = c38072d.m121952e(c28655q, i17).getT2();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q, 0, i18, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(bVar.getBody(), c28655q, i16), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB2(), null, c28655q, 0, i18, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f14, c2314t));
            m85834u(bVar.m81539e(), c28655q, 0);
            AbstractC18489d0.m53356B(c28655q, true, c2314t, f14, c28655q);
            TextResource textResourceM81555d = bVar.getRegionPicker().getLabel();
            boolean z13 = (i14 & 7168) == 2048;
            Object objM87133R2 = c28655q.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C24679k(interfaceC4339a, 28);
                c28655q.m87172p0(objM87133R2);
            }
            m85810V(textResourceM81555d, str, (InterfaceC4339a) objM87133R2, c28655q, ((i14 >> 3) & 112) | i16);
            TextResource textResourceM81515a = bVar.getAcknowledgeAllToggle().getLabel();
            boolean z14 = false;
            AbstractC33088k.g gVar = new AbstractC33088k.g(AbstractC2890e.m8450e().getB2(), null, 2, 0 == true ? 1 : 0);
            boolean zM81516b = bVar.getAcknowledgeAllToggle().getSelected();
            boolean zM87157i = (i15 == 32) | c28655q.m87157i(bVar);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i || objM87133R3 == c28676v0) {
                objM87133R3 = new C27050m(10, function1, bVar);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC33087j.m104824f(textResourceM81515a, gVar, zM81516b, false, 0, 0L, null, null, false, 0L, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q, i16 | 24576 | (AbstractC33088k.g.f137992d << 3), 0, 1000);
            float f15 = 4 * f13;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC30007c.m91835e(c2314t, f14, c28655q, c2314t, 1.0f), f15, 0.0f, 2);
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM21274h2 = AbstractC8693b.m21274h(bVar.getButtonLabel(), c28655q, i16);
            long jM125371X = c38072d.m121949b(c28655q, i17).getRecovery();
            boolean z15 = bVar.getAcknowledgeAllToggle().getSelected() && !AbstractC22676k.m65745e(str, "---");
            if (i15 == 32) {
                z14 = true;
            }
            Object objM87133R4 = c28655q.m87133R();
            if (z14 || objM87133R4 == c28676v0) {
                function2 = function1;
                objM87133R4 = new C27207n(function2, 16);
                c28655q.m87172p0(objM87133R4);
            } else {
                function2 = function1;
            }
            AbstractC27282u.m82292h(modifierM3396r2, enumC27284v, strM21274h2, z15, jM125371X, null, false, (InterfaceC4339a) objM87133R4, c28655q, 54, 96);
            c28655q = c28655q;
            AbstractC30007c.m91851u(c2314t, f15, c28655q, true);
        } else {
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28325a(bVar, function2, str, interfaceC4339a, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m85837x(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(InterfaceC27122a.a.f108400a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m85838y(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m85839z(p715kotlin.jvm.functions.Function1 function1, InterfaceC27125d.b bVar, boolean z4) {
        function1.invoke(new InterfaceC27122a.e(bVar.getAcknowledgeAllToggle().getSetupRequirement(), z4));
        return C23454a0.f92919a;
    }
}
