package pt2;

import a81.C0561l;
import am2.C1008b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm2.C3467p0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import dc0.C11901c;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import f41.C14063a;
import f41.C14067e;
import f41.C14080r;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.sentry.config.AbstractC20301a;
import java.util.List;
import jt2.EnumC21941c;
import km0.C22581e;
import kotlin.C1987a0;
import kotlin.C2028s;
import kotlin.C2040y;
import l83.C23454a0;
import l83.InterfaceC23459e;
import mt2.AbstractC25946g;
import nt2.AbstractC27131a;
import nx1.C27225g;
import ny0.AbstractC27274q;
import ny0.AbstractC27292z;
import ot2.AbstractC28344m;
import ot2.C28334c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.C26053f;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p725ot1.C28330f;
import pl0.C29344b;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.AbstractC39279l;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: pt2.l */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0015²\u0006\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lot2/m;", "viewState", "Lkotlin/Function1;", "Lnt2/a;", "Ll83/a0;", "onViewEvent", "Lmt2/g;", "onNavigationEvent", "x", "(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lot2/c;", "B", "(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "u", "(Lot2/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lb3/x2;", "keyboard", "Lpt2/a;", "bottomSheetType", "Lv41/g;", "bottomSheetTopBar", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29530l {

    /* JADX INFO: renamed from: pt2.l$a */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeBehaviorSelectionScreenKt$Success$3$1", m100430f = "HubAndSpokeBehaviorSelectionScreen.kt", m100431l = {108}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120207w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f120208x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f120209y;

        /* JADX INFO: renamed from: pt2.l$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42192a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC28670t2 f120210w;

            public C42192a(InterfaceC28670t2 interfaceC28670t2) {
                this.f120210w = interfaceC28670t2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC2464x2 interfaceC2464x2M90313R;
                if (enumC15209z3 == EnumC15209z3.f57106w && (interfaceC2464x2M90313R = AbstractC29530l.m90313R(this.f120210w)) != null) {
                    ((C2463x1) interfaceC2464x2M90313R).m7442a();
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120208x = c15199y3;
            this.f120209y = interfaceC28670t2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m90348h(C15199y3 c15199y3) {
            return c15199y3.m43222c();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f120208x, this.f120209y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120207w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C29526h(this.f120208x, 1));
                C42192a c42192a = new C42192a(this.f120209y);
                this.f120207w = 1;
                if (c13084s1M87240H.collect(c42192a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pt2.l$b */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeBehaviorSelectionScreenKt$Success$4$1$1", m100430f = "HubAndSpokeBehaviorSelectionScreen.kt", m100431l = {118}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120211w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f120212x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC35664f.a aVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120212x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f120212x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120211w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f120212x.getModalBottomSheetState();
                this.f120211w = 1;
                if (c15199y3M112950a.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pt2.l$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f120213E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f120214w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC2994c0 f120215x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC35664f.a f120216y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f120217z;

        /* JADX INFO: renamed from: pt2.l$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeBehaviorSelectionScreenKt$Success$6$1$2$1$3$1$1$1", m100430f = "HubAndSpokeBehaviorSelectionScreen.kt", m100431l = {210}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC28601c1 f120218E;

            /* JADX INFO: renamed from: w */
            int f120219w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Object f120220x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC35664f.a f120221y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f120222z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f120220x = obj;
                this.f120221y = aVar;
                this.f120222z = interfaceC28601c1;
                this.f120218E = interfaceC28601c2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f120220x, this.f120221y, this.f120222z, this.f120218E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f120219w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC29530l.m90315T(this.f120222z, new AbstractC29516a.a((C14063a) this.f120220x));
                    AbstractC29530l.m90317V(this.f120218E, new C35666g(((C14063a) this.f120220x).getBottomSheetTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, 2, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    C15199y3 c15199y3M112950a = this.f120221y.getModalBottomSheetState();
                    this.f120219w = 1;
                    if (c15199y3M112950a.m43225f(this) == enumC31071a) {
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

        public c(Function1 function1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f120214w = function1;
            this.f120215x = interfaceC2994c0;
            this.f120216y = aVar;
            this.f120217z = interfaceC28601c1;
            this.f120213E = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m90350a(Object viewEvent) {
            AbstractC22676k.m65750j(viewEvent, "viewEvent");
            if (viewEvent instanceof C14080r) {
                C14080r c14080r = (C14080r) viewEvent;
                this.f120214w.invoke(new AbstractC27131a.p(c14080r.getId(), c14080r.getIsToggled(), c14080r.getIsAvoid(), c14080r.getSelectedNumber()));
            }
            if (viewEvent instanceof C14063a) {
                AbstractC3006f0.m8732z(this.f120215x, null, null, new a(viewEvent, this.f120216y, this.f120217z, this.f120213E, null), 3);
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m90350a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pt2.l$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f120223E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f120224w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC2994c0 f120225x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC35664f.a f120226y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f120227z;

        /* JADX INFO: renamed from: pt2.l$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeBehaviorSelectionScreenKt$Success$6$1$2$1$6$1$1$1", m100430f = "HubAndSpokeBehaviorSelectionScreen.kt", m100431l = {253}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC28601c1 f120228E;

            /* JADX INFO: renamed from: w */
            int f120229w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Object f120230x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC35664f.a f120231y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f120232z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f120230x = obj;
                this.f120231y = aVar;
                this.f120232z = interfaceC28601c1;
                this.f120228E = interfaceC28601c2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f120230x, this.f120231y, this.f120232z, this.f120228E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f120229w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC29530l.m90315T(this.f120232z, new AbstractC29516a.a((C14063a) this.f120230x));
                    AbstractC29530l.m90317V(this.f120228E, new C35666g(((C14063a) this.f120230x).getBottomSheetTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, 2, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    C15199y3 c15199y3M112950a = this.f120231y.getModalBottomSheetState();
                    this.f120229w = 1;
                    if (c15199y3M112950a.m43225f(this) == enumC31071a) {
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

        public d(Function1 function1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f120224w = function1;
            this.f120225x = interfaceC2994c0;
            this.f120226y = aVar;
            this.f120227z = interfaceC28601c1;
            this.f120223E = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m90351a(Object viewEvent) {
            AbstractC22676k.m65750j(viewEvent, "viewEvent");
            if (viewEvent instanceof C14080r) {
                C14080r c14080r = (C14080r) viewEvent;
                this.f120224w.invoke(new AbstractC27131a.p(c14080r.getId(), c14080r.getIsToggled(), c14080r.getIsAvoid(), c14080r.getSelectedNumber()));
            }
            if (viewEvent instanceof C14063a) {
                AbstractC3006f0.m8732z(this.f120225x, null, null, new a(viewEvent, this.f120226y, this.f120227z, this.f120223E, null), 3);
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m90351a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pt2.l$e */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeBehaviorSelectionScreenKt$Success$6$1$2$1$7$1$1$1", m100430f = "HubAndSpokeBehaviorSelectionScreen.kt", m100431l = {278}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f120233E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f120234F;

        /* JADX INFO: renamed from: w */
        int f120235w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f120236x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C28334c f120237y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC35664f.a f120238z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1, C28334c c28334c, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120236x = function1;
            this.f120237y = c28334c;
            this.f120238z = aVar;
            this.f120233E = interfaceC28601c1;
            this.f120234F = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f120236x, this.f120237y, this.f120238z, this.f120233E, this.f120234F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120235w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f120236x.invoke(new AbstractC27131a.e(EnumC21941c.BEHAVIOR));
                AbstractC29530l.m90315T(this.f120233E, AbstractC29516a.b.f120154a);
                AbstractC29530l.m90317V(this.f120234F, new C35666g(this.f120237y.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, 2, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                C15199y3 c15199y3M112950a = this.f120238z.getModalBottomSheetState();
                this.f120235w = 1;
                if (c15199y3M112950a.m43225f(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pt2.l$f */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeBehaviorSelectionScreenKt$Success$7$1$1", m100430f = "HubAndSpokeBehaviorSelectionScreen.kt", m100431l = {297}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120239w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f120240x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC35664f.a aVar, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120240x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f120240x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120239w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f120240x.getModalBottomSheetState();
                this.f120239w = 1;
                if (c15199y3M112950a.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pt2.l$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f120241w = new g();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: pt2.l$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f120242w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f120243x;

        public h(Function1 function1, List list) {
            this.f120242w = function1;
            this.f120243x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m90353a(int i13) {
            return this.f120242w.invoke(this.f120243x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m90353a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: pt2.l$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f120244w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f120245x;

        public i(Function1 function1, List list) {
            this.f120244w = function1;
            this.f120245x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m90354a(int i13) {
            return this.f120244w.invoke(this.f120245x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m90354a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: pt2.l$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f120246E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f120247F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f120248w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f120249x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2994c0 f120250y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC35664f.a f120251z;

        public j(List list, Function1 function1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f120248w = list;
            this.f120249x = function1;
            this.f120250y = interfaceC2994c0;
            this.f120251z = aVar;
            this.f120246E = interfaceC28601c1;
            this.f120247F = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m90355a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f120248w.get(i13);
            c28655q.m87150e0(283866782);
            boolean zM87153g = c28655q.m87153g(this.f120249x) | c28655q.m87157i(this.f120250y) | c28655q.m87157i(this.f120251z);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                c cVar = new c(this.f120249x, this.f120250y, this.f120251z, this.f120246E, this.f120247F);
                c28655q.m87172p0(cVar);
                objM87133R = cVar;
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, 0, 6);
            AbstractC31061c.m95650z((float) 1.5d, 8, C2314t.f9131w, c28655q, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m90355a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pt2.l$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f120252w = new k();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: pt2.l$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f120253w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f120254x;

        public l(Function1 function1, List list) {
            this.f120253w = function1;
            this.f120254x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m90357a(int i13) {
            return this.f120253w.invoke(this.f120254x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m90357a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: pt2.l$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f120255w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f120256x;

        public m(Function1 function1, List list) {
            this.f120255w = function1;
            this.f120256x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m90358a(int i13) {
            return this.f120255w.invoke(this.f120256x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m90358a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: pt2.l$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f120257E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f120258F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f120259w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f120260x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2994c0 f120261y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC35664f.a f120262z;

        public n(List list, Function1 function1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f120259w = list;
            this.f120260x = function1;
            this.f120261y = interfaceC2994c0;
            this.f120262z = aVar;
            this.f120257E = interfaceC28601c1;
            this.f120258F = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m90359a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f120259w.get(i13);
            c28655q.m87150e0(-1003527901);
            boolean zM87153g = c28655q.m87153g(this.f120260x) | c28655q.m87157i(this.f120261y) | c28655q.m87157i(this.f120262z);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                d dVar = new d(this.f120260x, this.f120261y, this.f120262z, this.f120257E, this.f120258F);
                c28655q.m87172p0(dVar);
                objM87133R = dVar;
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, 0, 6);
            AbstractC31061c.m95650z((float) 1.5d, 8, C2314t.f9131w, c28655q, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m90359a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m90296A(AbstractC28344m abstractC28344m, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m90344x(abstractC28344m, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x013c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x0170  */
    /* JADX WARN: Code duplicated, block: B:70:0x0209  */
    /* JADX WARN: Code duplicated, block: B:71:0x020b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0214  */
    /* JADX WARN: Code duplicated, block: B:75:0x0216  */
    /* JADX WARN: Code duplicated, block: B:78:0x021f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0227  */
    /* JADX WARN: Code duplicated, block: B:83:0x024b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0256  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    private static final void m90297B(C28334c c28334c, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        C28334c c28334c2;
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        boolean z4;
        Function1 function5;
        Function1 function6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function7;
        Function1 function8;
        Object objM87133R;
        InterfaceC2994c0 interfaceC2994c0;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        C15199y3 c15199y3M3460c;
        Object objM87133R2;
        AbstractC35664f.a aVar;
        Object objM87133R3;
        TextResource textResource;
        boolean zM87157i;
        Object objM87133R4;
        boolean zM87157i2;
        Object objM87133R5;
        Function1 function9;
        Function1 function10;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R6;
        Function1 function11;
        Function1 function12;
        Object objM87133R7;
        Object objM87133R8;
        Object[] objArr;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-626703716);
        if ((i13 & 6) == 0) {
            c28334c2 = c28334c;
            i15 = (c28655q.m87157i(c28334c2) ? 4 : 2) | i13;
        } else {
            c28334c2 = c28334c;
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function3 = function1;
                i15 |= c28655q.m87157i(function3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function4 = function2;
                    if (c28655q.m87157i(function4)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C29529k(2);
                            c28655q.m87172p0(objM87133R8);
                        }
                        function7 = (Function1) objM87133R8;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29529k(3);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function8 = (Function1) objM87133R7;
                    } else {
                        function8 = function4;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    int iIndexOf = c28334c2.getBottomSheet().m65420e().indexOf(c28334c2.getBottomSheet().getCurrentCategory());
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q.m87161k(AbstractC2453v1.f9577p), c28655q);
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(AbstractC29516a.b.f120154a);
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    aVar = new AbstractC35664f.a(c15199y3M3460c);
                    objM87133R3 = c28655q.m87133R();
                    textResource = null;
                    objArr = 0;
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = AbstractC28683x.m87272z(new C35666g(c28334c2.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                    zM87157i = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i || objM87133R4 == c28676v0) {
                        objM87133R4 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                        c28655q.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
                    C35666g c35666gM90316U = m90316U(interfaceC28601c2);
                    AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C2028s(interfaceC2994c0, aVar, 5);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function9 = function7;
                    function10 = function8;
                    AbstractC35660d.m112871m(modifierM3407d, c35666gM90316U, aVar, null, (InterfaceC4339a) objM87133R5, null, null, AbstractC37817c.m121344e(-1461773750, c28655q, new C1987a0(c28334c2, aVar, iIndexOf, interfaceC2994c0, function9, interfaceC28601c1, 2)), false, bVar, null, null, false, null, AbstractC37817c.m121344e(-872453362, c28655q, new C3467p0(c28334c, function9, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c2)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                    c28655q = c28655q;
                    boolean zM87157i3 = c28655q.m87157i(c15199y3M3460c) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                    if ((i15 & 112) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z16 = zM87157i3 | z13;
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z16 | z14;
                    objM87133R6 = c28655q.m87133R();
                    if (!z15 || objM87133R6 == c28676v0) {
                        objM87133R6 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 1);
                        function11 = function9;
                        function12 = function10;
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        function11 = function9;
                        function12 = function10;
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
                    function5 = function11;
                    function6 = function12;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28330f(c28334c, function5, function6, i13, i14, 23);
                }
            }
            i15 |= 384;
            function4 = function2;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C29529k(2);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function7 = (Function1) objM87133R8;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29529k(3);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function8 = (Function1) objM87133R7;
                } else {
                    function8 = function4;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                int iIndexOf2 = c28334c2.getBottomSheet().m65420e().indexOf(c28334c2.getBottomSheet().getCurrentCategory());
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q.m87161k(AbstractC2453v1.f9577p), c28655q);
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(AbstractC29516a.b.f120154a);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R2;
                aVar = new AbstractC35664f.a(c15199y3M3460c);
                objM87133R3 = c28655q.m87133R();
                textResource = null;
                objArr = 0;
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C35666g(c28334c2.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
                zM87157i = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
                C35666g c35666gM90316U2 = m90316U(interfaceC28601c4);
                AbstractC27274q.b bVar2 = AbstractC27274q.b.f109138f;
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R5 = new C2028s(interfaceC2994c0, aVar, 5);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C2028s(interfaceC2994c0, aVar, 5);
                    c28655q.m87172p0(objM87133R5);
                }
                function9 = function7;
                function10 = function8;
                AbstractC35660d.m112871m(modifierM3407d2, c35666gM90316U2, aVar, null, (InterfaceC4339a) objM87133R5, null, null, AbstractC37817c.m121344e(-1461773750, c28655q, new C1987a0(c28334c2, aVar, iIndexOf2, interfaceC2994c0, function9, interfaceC28601c3, 2)), false, bVar2, null, null, false, null, AbstractC37817c.m121344e(-872453362, c28655q, new C3467p0(c28334c, function9, function10, interfaceC2994c0, aVar, interfaceC28601c3, interfaceC28601c4)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                c28655q = c28655q;
                boolean zM87157i4 = c28655q.m87157i(c15199y3M3460c) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z17 = zM87157i4 | z13;
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z17 | z14;
                objM87133R6 = c28655q.m87133R();
                if (z15) {
                    objM87133R6 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 1);
                    function11 = function9;
                    function12 = function10;
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 1);
                    function11 = function9;
                    function12 = function10;
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
                function5 = function11;
                function6 = function12;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(c28334c, function5, function6, i13, i14, 23);
            }
        }
        i15 |= 48;
        function3 = function1;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function4 = function2;
                if (c28655q.m87157i(function4)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C29529k(2);
                        c28655q.m87172p0(objM87133R8);
                    }
                    function7 = (Function1) objM87133R8;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29529k(3);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function8 = (Function1) objM87133R7;
                } else {
                    function8 = function4;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                int iIndexOf3 = c28334c2.getBottomSheet().m65420e().indexOf(c28334c2.getBottomSheet().getCurrentCategory());
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q.m87161k(AbstractC2453v1.f9577p), c28655q);
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(AbstractC29516a.b.f120154a);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R2;
                aVar = new AbstractC35664f.a(c15199y3M3460c);
                objM87133R3 = c28655q.m87133R();
                textResource = null;
                objArr = 0;
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C35666g(c28334c2.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    c28655q.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R3;
                zM87157i = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R4 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                    c28655q.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
                C35666g c35666gM90316U3 = m90316U(interfaceC28601c6);
                AbstractC27274q.b bVar3 = AbstractC27274q.b.f109138f;
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R5 = new C2028s(interfaceC2994c0, aVar, 5);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C2028s(interfaceC2994c0, aVar, 5);
                    c28655q.m87172p0(objM87133R5);
                }
                function9 = function7;
                function10 = function8;
                AbstractC35660d.m112871m(modifierM3407d3, c35666gM90316U3, aVar, null, (InterfaceC4339a) objM87133R5, null, null, AbstractC37817c.m121344e(-1461773750, c28655q, new C1987a0(c28334c2, aVar, iIndexOf3, interfaceC2994c0, function9, interfaceC28601c5, 2)), false, bVar3, null, null, false, null, AbstractC37817c.m121344e(-872453362, c28655q, new C3467p0(c28334c, function9, function10, interfaceC2994c0, aVar, interfaceC28601c5, interfaceC28601c6)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                c28655q = c28655q;
                boolean zM87157i5 = c28655q.m87157i(c15199y3M3460c) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                if ((i15 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z18 = zM87157i5 | z13;
                if ((i15 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z18 | z14;
                objM87133R6 = c28655q.m87133R();
                if (z15) {
                    objM87133R6 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 1);
                    function11 = function9;
                    function12 = function10;
                    c28655q.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 1);
                    function11 = function9;
                    function12 = function10;
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
                function5 = function11;
                function6 = function12;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(c28334c, function5, function6, i13, i14, 23);
            }
        }
        i15 |= 384;
        function4 = function2;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C29529k(2);
                    c28655q.m87172p0(objM87133R8);
                }
                function7 = (Function1) objM87133R8;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C29529k(3);
                    c28655q.m87172p0(objM87133R7);
                }
                function8 = (Function1) objM87133R7;
            } else {
                function8 = function4;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            int iIndexOf4 = c28334c2.getBottomSheet().m65420e().indexOf(c28334c2.getBottomSheet().getCurrentCategory());
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q.m87161k(AbstractC2453v1.f9577p), c28655q);
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
            objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(AbstractC29516a.b.f120154a);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R2;
            aVar = new AbstractC35664f.a(c15199y3M3460c);
            objM87133R3 = c28655q.m87133R();
            textResource = null;
            objArr = 0;
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(new C35666g(c28334c2.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R3;
            zM87157i = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R4 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
            C35666g c35666gM90316U4 = m90316U(interfaceC28601c8);
            AbstractC27274q.b bVar4 = AbstractC27274q.b.f109138f;
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R5 = new C2028s(interfaceC2994c0, aVar, 5);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C2028s(interfaceC2994c0, aVar, 5);
                c28655q.m87172p0(objM87133R5);
            }
            function9 = function7;
            function10 = function8;
            AbstractC35660d.m112871m(modifierM3407d4, c35666gM90316U4, aVar, null, (InterfaceC4339a) objM87133R5, null, null, AbstractC37817c.m121344e(-1461773750, c28655q, new C1987a0(c28334c2, aVar, iIndexOf4, interfaceC2994c0, function9, interfaceC28601c7, 2)), false, bVar4, null, null, false, null, AbstractC37817c.m121344e(-872453362, c28655q, new C3467p0(c28334c, function9, function10, interfaceC2994c0, aVar, interfaceC28601c7, interfaceC28601c8)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
            c28655q = c28655q;
            boolean zM87157i6 = c28655q.m87157i(c15199y3M3460c) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            if ((i15 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = zM87157i6 | z13;
            if ((i15 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z19 | z14;
            objM87133R6 = c28655q.m87133R();
            if (z15) {
                objM87133R6 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 1);
                function11 = function9;
                function12 = function10;
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 1);
                function11 = function9;
                function12 = function10;
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, false, c28655q, 0, 1);
            function5 = function11;
            function6 = function12;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(c28334c, function5, function6, i13, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m90298C(AbstractC27131a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m90299D(AbstractC25946g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m90300E(InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(aVar, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m90301F(C28334c c28334c, AbstractC35664f.a aVar, int i13, InterfaceC2994c0 interfaceC2994c0, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC23013y BottomSheet, Composer composer, int i14) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 17) != 16)) {
            AbstractC29519b0.m90222g(c28334c.getBottomSheet(), aVar, m90314S(interfaceC28601c1), i13, interfaceC2994c0, function1, c28655q, C22581e.f88865n | (AbstractC35664f.a.f151587c << 3), 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m90302G(C28334c c28334c, Function1 function1, Function1 function2, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44008S(AbstractC1102d.m3407d(1.0f, c2314t)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
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
            Modifier modifierM44101d = AbstractC15676d.m44101d(c2314t, "Close_Button");
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(c28334c.getTitleDisplay(), null, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E))), null, null, null, false, null, null, null, null, null, null, null, null, 32762, null);
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(function2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C11901c(function1, 15, function2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM44101d, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 52);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * 8, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3396r, true, 1.0f);
            boolean zM87157i = c28655q.m87157i(c28334c) | c28655q.m87153g(function1) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                C1008b c1008b = new C1008b((Object) c28334c, (Object) function1, (Object) interfaceC2994c0, (Object) aVar, interfaceC28601c1, interfaceC28601c2, 17);
                c28655q.m87172p0(c1008b);
                objM87133R2 = c1008b;
            }
            AbstractC22674j.m65717c(modifierM31988g, null, null, null, null, null, false, null, (Function1) objM87133R2, c28655q, 0, 510);
            m90341u(c28334c, function1, function2, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m90303H(Function1 function1, Function1 function2) {
        function1.invoke(new AbstractC27131a.f(false, 1, null));
        function2.invoke(new AbstractC25946g.b(TargetGoalType.BEHAVIORS));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m90304I(final C28334c c28334c, Function1 function1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        final int i13 = 0;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: pt2.j
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i14 = i13;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i14) {
                    case 0:
                        return AbstractC29530l.m90305J(c28334c, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC29530l.m90307L(c28334c, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, -304783645), 3);
        if (!c28334c.m85887l().isEmpty()) {
            List<InterfaceC25312u> listM85887l = c28334c.m85887l();
            C26053f c26053f = (C26053f) LazyColumn;
            c26053f.m77529r(listM85887l.size(), new h(new C29344b(28), listM85887l), new i(g.f120241w, listM85887l), new C37816b(new j(listM85887l, function1, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c2), true, 802480018));
        }
        final int i14 = 1;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: pt2.j
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i15) {
                    case 0:
                        return AbstractC29530l.m90305J(c28334c, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC29530l.m90307L(c28334c, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, 946693964), 3);
        List<InterfaceC25312u> listM85882g = c28334c.m85882g();
        C26053f c26053f2 = (C26053f) LazyColumn;
        c26053f2.m77529r(listM85882g.size(), new l(new C29344b(29), listM85882g), new m(k.f120252w, listM85882g), new C37816b(new n(listM85882g, function1, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c2), true, 802480018));
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C2040y(c28334c, interfaceC2994c0, function1, aVar, interfaceC28601c1, interfaceC28601c2, 6), true, 1659891883), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m90305J(C28334c c28334c, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f13, c2314t));
            TextResource textResourceM85884i = c28334c.getTitle();
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM85884i, c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a c2886aM8418P = c38072d.m121952e(c28655q, i15).getT3();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 0, i16, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c28334c.getSubtitle(), c28655q, i14), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, i16, 196602);
            if (c28334c.m85887l().isEmpty() || !AbstractC8693b.m21270d(c28334c.getTopHeadingDisplay())) {
                c28655q.m87150e0(-247514049);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-247950343);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(4 * f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c28334c.getTopHeadingDisplay(), c28655q, i14), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getSh4(), null, c28655q, 0, i16, 196602);
                AbstractC31061c.m95650z((float) 1.5d, f13, c2314t, c28655q, false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final Object m90306K(InterfaceC25312u topItem) {
        AbstractC22676k.m65750j(topItem, "topItem");
        C14067e c14067e = topItem instanceof C14067e ? (C14067e) topItem : null;
        String strM8299l = c14067e != null ? AbstractC2875y.m8299l(c14067e.getId(), "_topItem") : null;
        return strM8299l == null ? "" : strM8299l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m90307L(C28334c c28334c, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zIsEmpty = c28334c.m85887l().isEmpty();
            C2314t c2314t = C2314t.f9131w;
            if (zIsEmpty) {
                c28655q.m87150e0(-2090172591);
                AbstractC31061c.m95650z(4, 8, c2314t, c28655q, false);
            } else {
                c28655q.m87150e0(-2090280657);
                AbstractC31061c.m95650z((float) 2.5d, 8, c2314t, c28655q, false);
            }
            String strM21274h = AbstractC8693b.m21274h(c28334c.getHeadingDisplay(), c28655q, TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i14).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getSh4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            AbstractC18489d0.m53380u((float) 1.5d, 8, c2314t, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final Object m90308M(InterfaceC25312u it) {
        AbstractC22676k.m65750j(it, "it");
        C14067e c14067e = it instanceof C14067e ? (C14067e) it : null;
        String id4 = c14067e != null ? c14067e.getId() : null;
        return id4 == null ? "" : id4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m90309N(C28334c c28334c, InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zIsEmpty = c28334c.m85887l().isEmpty();
            C2314t c2314t = C2314t.f9131w;
            if (zIsEmpty) {
                c28655q.m87150e0(1880777239);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1880678256);
                AbstractC31061c.m95650z((float) 2.5d, 8, c2314t, c28655q, false);
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            C39282o c39282o = new C39282o(objArr, c28334c.getAddButtonInfo().getTitleDisplay(), null, false, false, new AbstractC39279l.b(null, null, new C39274g(c28334c.getAddButtonInfo().getIcon(), null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, 4091, defaultConstructorMarker), false, objArr2, objArr3, objArr4, false, objArr5, objArr6, objArr7, null, 32733, defaultConstructorMarker);
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(function1) | c28655q.m87157i(c28334c) | c28655q.m87157i(aVar);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C0561l((Object) interfaceC2994c0, function1, (Object) c28334c, (Object) aVar, (Object) interfaceC28601c1, (Object) interfaceC28601c2, 9);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39281n.m125207c(null, c39282o, (InterfaceC4339a) objM87133R, c28655q, C39282o.f168987q << 3, 1);
            AbstractC18489d0.m53380u(5, 8, c2314t, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m90310O(InterfaceC2994c0 interfaceC2994c0, Function1 function1, C28334c c28334c, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(function1, c28334c, aVar, interfaceC28601c1, interfaceC28601c2, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m90311P(C15199y3 c15199y3, InterfaceC2994c0 interfaceC2994c0, Function1 function1, Function1 function2, AbstractC35664f.a aVar) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (c15199y3.m43224e()) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(aVar, null), 3);
        } else {
            function1.invoke(new AbstractC27131a.f(false, 1, defaultConstructorMarker));
            function2.invoke(new AbstractC25946g.b(TargetGoalType.BEHAVIORS));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m90312Q(C28334c c28334c, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m90297B(c28334c, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final InterfaceC2464x2 m90313R(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC2464x2) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: S */
    private static final AbstractC29516a m90314S(InterfaceC28601c1 interfaceC28601c1) {
        return (AbstractC29516a) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final void m90315T(InterfaceC28601c1 interfaceC28601c1, AbstractC29516a abstractC29516a) {
        interfaceC28601c1.setValue(abstractC29516a);
    }

    /* JADX INFO: renamed from: U */
    private static final C35666g m90316U(InterfaceC28601c1 interfaceC28601c1) {
        return (C35666g) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final void m90317V(InterfaceC28601c1 interfaceC28601c1, C35666g c35666g) {
        interfaceC28601c1.setValue(c35666g);
    }

    /* JADX INFO: renamed from: u */
    private static final void m90341u(C28334c c28334c, Function1 function1, Function1 function2, Composer composer, int i13) {
        C28334c c28334c2;
        int i14;
        C28655q c28655q;
        Function1 function3;
        boolean z4;
        C2314t c2314t;
        int i15;
        C28655q c28655q2;
        int i16;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-2126881304);
        if ((i13 & 6) == 0) {
            c28334c2 = c28334c;
            i14 = (c28655q3.m87157i(c28334c2) ? 4 : 2) | i13;
        } else {
            c28334c2 = c28334c;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q3.m87157i(function2) ? 256 : 128;
        }
        if (c28655q3.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC22953f.m66722k(c2314t2), 0.0f, f14, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
            TextResource textResourceM85878c = c28334c2.getButtonDescriptionDisplay();
            if (textResourceM85878c == null) {
                c28655q3.m87150e0(-1156751018);
                c28655q3.m87173q(false);
                c28655q2 = c28655q3;
                i15 = i14;
                c2314t = c2314t2;
                i16 = 5;
                z4 = false;
            } else {
                c28655q3.m87150e0(-1156751017);
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t2, 5 * 4, 0.0f, 2);
                String strM21274h = AbstractC8693b.m21274h(textResourceM85878c, c28655q3, TextResource.$stable);
                C38072d c38072d = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                long jM125385c1 = c38072d.m121949b(c28655q3, i17).getWhite70();
                C2886a c2886aM8420a = c38072d.m121952e(c28655q3, i17).getB1();
                z4 = false;
                c2314t = c2314t2;
                i15 = i14;
                AbstractC30795n.m94707h(strM21274h, modifierM3396r, jM125385c1, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q3, 48, C2886a.f11498d << 18, 196088);
                c28655q2 = c28655q3;
                AbstractC31061c.m95650z(3, f13, c2314t, c28655q2, false);
                i16 = 5;
            }
            Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1099a.m3396r(c2314t, i16 * 4, 0.0f, 2), "Save_Behaviors_Button");
            TextResource textResourceM85879d = c28334c.getContinueButtonDisplay();
            boolean zM85880e = c28334c.getEnableContinueButton();
            boolean z13 = (i15 & 112) == 32 ? true : z4;
            if ((i15 & 896) == 256) {
                z4 = true;
            }
            boolean z14 = z13 | z4;
            Object objM87133R = c28655q2.m87133R();
            if (z14 || objM87133R == C28635l.f115821a) {
                function3 = function1;
                objM87133R = new C11901c(function3, 16, function2);
                c28655q2.m87172p0(objM87133R);
            } else {
                function3 = function1;
            }
            C28655q c28655q4 = c28655q2;
            AbstractC27292z.m82343j(modifierM44101d, zM85880e, false, null, null, null, textResourceM85879d, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q4, TextResource.$stable << 18, 0, 8124);
            c28655q = c28655q4;
            AbstractC25012a.m73389v(c2314t, f14, c28655q, true);
        } else {
            c28655q = c28655q3;
            function3 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) c28334c, function3, (InterfaceC23459e) function2, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m90342v(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC27131a.i.f108496a);
        function2.invoke(new AbstractC25946g.b(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m90343w(C28334c c28334c, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m90341u(c28334c, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public static final void m90344x(AbstractC28344m viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        C23454a0 c23454a0;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-504134907);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(function2) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C28676v0 c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C29529k(0);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (i17 != 0) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C29529k(1);
                    c28655q.m87172p0(objM87133R2);
                }
                function2 = (Function1) objM87133R2;
            }
            Function1 function4 = function2;
            if (viewState instanceof AbstractC28344m.i) {
                c28655q.m87150e0(817906520);
                C28334c c28334cM85968b = ((AbstractC28344m.i) viewState).getBehaviorsScreen();
                if (c28334cM85968b == null) {
                    c28655q.m87150e0(817931443);
                    c28655q.m87173q(false);
                    c23454a0 = null;
                } else {
                    c28655q.m87150e0(817931444);
                    m90297B(c28334cM85968b, function1, function4, c28655q, i15 & MessageListItemViewType.GIPHY, 0);
                    c28655q.m87173q(false);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c28655q.m87150e0(857676258);
                    p730qt2.Function1.m93909d(function4, c28655q, (i15 >> 6) & 14, 0);
                } else {
                    c28655q.m87150e0(857668074);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(818216892);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
        }
        Function1 function5 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29524f(viewState, function5, function3, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m90345y(AbstractC27131a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m90346z(AbstractC25946g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
