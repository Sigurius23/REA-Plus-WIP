package pt2;

import a81.C0556g;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
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
import f41.C14067e;
import f41.C14080r;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.sentry.config.AbstractC20301a;
import java.util.List;
import jp2.C21881l;
import jt2.EnumC21941c;
import km0.C22581e;
import kotlin.C2018n;
import kotlin.C2026r;
import kotlin.C2028s;
import kotlin.C2030t;
import l83.C23454a0;
import l83.InterfaceC23459e;
import mt2.AbstractC25946g;
import nt2.AbstractC27131a;
import nx1.C27225g;
import ny0.AbstractC27274q;
import ny0.AbstractC27292z;
import ot2.AbstractC28344m;
import ot2.C28332a;
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
import p730qt2.AbstractC30598d0;
import p730qt2.C30596c0;
import pl0.C29344b;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uv0.AbstractC35283c;
import uw0.AbstractC35302l;
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

/* JADX INFO: renamed from: pt2.i */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0013²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\nX\u008a\u0084\u0002"}, m65681d2 = {"Lot2/m;", "viewState", "Lkotlin/Function1;", "Lnt2/a;", "Ll83/a0;", "onViewEvent", "Lmt2/g;", "onNavigationEvent", "B", "(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lot2/a;", "F", "(Lot2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "y", "(Lot2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lv41/g;", "bottomSheetTopBar", "Lb3/x2;", "keyboard", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29527i {

    /* JADX INFO: renamed from: pt2.i$a */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeActivitySelectionScreenKt$Success$3$1", m100430f = "HubAndSpokeActivitySelectionScreen.kt", m100431l = {106}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120177w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f120178x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f120179y;

        /* JADX INFO: renamed from: pt2.i$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42191a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC28670t2 f120180w;

            public C42191a(InterfaceC28670t2 interfaceC28670t2) {
                this.f120180w = interfaceC28670t2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC2464x2 interfaceC2464x2M90239K;
                if (enumC15209z3 == EnumC15209z3.f57106w && (interfaceC2464x2M90239K = AbstractC29527i.m90239K(this.f120180w)) != null) {
                    ((C2463x1) interfaceC2464x2M90239K).m7442a();
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120178x = c15199y3;
            this.f120179y = interfaceC28670t2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m90284h(C15199y3 c15199y3) {
            return c15199y3.m43222c();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f120178x, this.f120179y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120177w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C29526h(this.f120178x, 0));
                C42191a c42191a = new C42191a(this.f120179y);
                this.f120177w = 1;
                if (c13084s1M87240H.collect(c42191a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pt2.i$b */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeActivitySelectionScreenKt$Success$4$1$1", m100430f = "HubAndSpokeActivitySelectionScreen.kt", m100431l = {116}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120181w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f120182x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC35664f.a aVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120182x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f120182x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120181w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f120182x.getModalBottomSheetState();
                this.f120181w = 1;
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

    /* JADX INFO: renamed from: pt2.i$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f120183w;

        public c(Function1 function1) {
            this.f120183w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m90286a(Object viewEvent) {
            AbstractC22676k.m65750j(viewEvent, "viewEvent");
            if (viewEvent instanceof C14080r) {
                C14080r c14080r = (C14080r) viewEvent;
                this.f120183w.invoke(new AbstractC27131a.o(c14080r.getId(), c14080r.getIsToggled(), c14080r.getSelectedNumber()));
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m90286a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pt2.i$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f120184w;

        public d(Function1 function1) {
            this.f120184w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m90287a(Object viewEvent) {
            AbstractC22676k.m65750j(viewEvent, "viewEvent");
            if (viewEvent instanceof C14080r) {
                C14080r c14080r = (C14080r) viewEvent;
                this.f120184w.invoke(new AbstractC27131a.o(c14080r.getId(), c14080r.getIsToggled(), c14080r.getSelectedNumber()));
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m90287a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pt2.i$e */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeActivitySelectionScreenKt$Success$6$1$2$1$7$1$1$1", m100430f = "HubAndSpokeActivitySelectionScreen.kt", m100431l = {254}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120185w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f120186x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC35664f.a f120187y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1, AbstractC35664f.a aVar, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120186x = function1;
            this.f120187y = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f120186x, this.f120187y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120185w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f120186x.invoke(new AbstractC27131a.e(EnumC21941c.ACTIVITY));
                C15199y3 c15199y3M112950a = this.f120187y.getModalBottomSheetState();
                this.f120185w = 1;
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

    /* JADX INFO: renamed from: pt2.i$f */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.hubandspoke.view.HubAndSpokeActivitySelectionScreenKt$Success$7$1$1", m100430f = "HubAndSpokeActivitySelectionScreen.kt", m100431l = {276}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120188w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f120189x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC35664f.a aVar, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120189x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f120189x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120188w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f120189x.getModalBottomSheetState();
                this.f120188w = 1;
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

    /* JADX INFO: renamed from: pt2.i$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f120190w = new g();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: pt2.i$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f120191w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f120192x;

        public h(Function1 function1, List list) {
            this.f120191w = function1;
            this.f120192x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m90289a(int i13) {
            return this.f120191w.invoke(this.f120192x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m90289a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: pt2.i$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f120193w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f120194x;

        public i(Function1 function1, List list) {
            this.f120193w = function1;
            this.f120194x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m90290a(int i13) {
            return this.f120193w.invoke(this.f120194x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m90290a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: pt2.i$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f120195w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f120196x;

        public j(List list, Function1 function1) {
            this.f120195w = list;
            this.f120196x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m90291a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f120195w.get(i13);
            c28655q.m87150e0(1213146855);
            boolean zM87153g = c28655q.m87153g(this.f120196x);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new c(this.f120196x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, 0, 6);
            AbstractC31061c.m95650z((float) 1.5d, 8, C2314t.f9131w, c28655q, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m90291a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pt2.i$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f120197w = new k();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: pt2.i$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f120198w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f120199x;

        public l(Function1 function1, List list) {
            this.f120198w = function1;
            this.f120199x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m90293a(int i13) {
            return this.f120198w.invoke(this.f120199x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m90293a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: pt2.i$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f120200w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f120201x;

        public m(Function1 function1, List list) {
            this.f120200w = function1;
            this.f120201x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m90294a(int i13) {
            return this.f120200w.invoke(this.f120201x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m90294a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: pt2.i$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f120202w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f120203x;

        public n(List list, Function1 function1) {
            this.f120202w = list;
            this.f120203x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m90295a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | i14;
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f120202w.get(i13);
            c28655q.m87150e0(-41172970);
            boolean zM87153g = c28655q.m87153g(this.f120203x);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new d(this.f120203x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, 0, 6);
            AbstractC31061c.m95650z((float) 1.5d, 8, C2314t.f9131w, c28655q, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m90295a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m90229A(C28332a c28332a, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m90281y(c28332a, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: B */
    public static final void m90230B(AbstractC28344m viewState, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        C23454a0 c23454a0;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-286422529);
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
                    objM87133R = new C29344b(22);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (i17 != 0) {
                Object objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C29344b(25);
                    c28655q.m87172p0(objM87133R2);
                }
                function2 = (Function1) objM87133R2;
            }
            Function1 function4 = function2;
            if (viewState instanceof AbstractC28344m.i) {
                c28655q.m87150e0(1286742589);
                C28332a c28332aM85967a = ((AbstractC28344m.i) viewState).getActivitiesScreen();
                if (c28332aM85967a == null) {
                    c28655q.m87150e0(1286768473);
                    c28655q.m87173q(false);
                    c23454a0 = null;
                } else {
                    c28655q.m87150e0(1286768474);
                    m90234F(c28332aM85967a, function1, function4, c28655q, i15 & MessageListItemViewType.GIPHY, 0);
                    c28655q.m87173q(false);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c28655q.m87150e0(-374125956);
                    p730qt2.Function1.m93909d(function4, c28655q, (i15 >> 6) & 14, 0);
                } else {
                    c28655q.m87150e0(-374134171);
                }
                c28655q.m87173q(false);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1287053922);
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
            c28677v1M87180u.f115982d = new C29524f(viewState, function5, function3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m90231C(AbstractC27131a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m90232D(AbstractC25946g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m90233E(AbstractC28344m abstractC28344m, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m90230B(abstractC28344m, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:60:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x0154 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:64:0x0156  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0208  */
    /* JADX WARN: Code duplicated, block: B:80:0x022c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0237  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    private static final void m90234F(C28332a c28332a, Function1 function1, Function1 function2, Composer composer, int i13, int i14) {
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
        C15199y3 c15199y3M3460c;
        AbstractC35664f.a aVar;
        Object objM87133R2;
        TextResource textResource;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        boolean zM87157i;
        Object objM87133R3;
        boolean zM87157i2;
        Object objM87133R4;
        Function1 function9;
        Function1 function10;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objM87133R5;
        Function1 function11;
        Function1 function12;
        Object objM87133R6;
        Object objM87133R7;
        Object[] objArr;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1696577863);
        int i18 = 2;
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(c28332a) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
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
                    if (i19 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C29344b(26);
                            c28655q.m87172p0(objM87133R7);
                        }
                        function7 = (Function1) objM87133R7;
                    } else {
                        function7 = function3;
                    }
                    if (i16 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C29344b(27);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function8 = (Function1) objM87133R6;
                    } else {
                        function8 = function4;
                    }
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                    aVar = new AbstractC35664f.a(c15199y3M3460c);
                    objM87133R2 = c28655q.m87133R();
                    textResource = null;
                    objArr = 0;
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(new C35666g(c28332a.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i18, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                        c28655q.m87172p0(objM87133R2);
                    }
                    InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                    int iIndexOf = c28332a.getBottomSheet().m65420e().indexOf(c28332a.getBottomSheet().getCurrentCategory());
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q.m87161k(AbstractC2453v1.f9577p), c28655q);
                    zM87157i = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87157i || objM87133R3 == c28676v0) {
                        objM87133R3 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                        c28655q.m87172p0(objM87133R3);
                    }
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                    C35666g c35666gM90238J = m90238J(interfaceC28601c1);
                    AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                    objM87133R4 = c28655q.m87133R();
                    if (zM87157i2 || objM87133R4 == c28676v0) {
                        objM87133R4 = new C2028s(interfaceC2994c0, aVar, 4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function9 = function7;
                    function10 = function8;
                    AbstractC35660d.m112871m(modifierM3407d, c35666gM90238J, aVar, null, (InterfaceC4339a) objM87133R4, null, null, AbstractC37817c.m121344e(1579210585, c28655q, new C2030t(iIndexOf, 3, c28332a, interfaceC2994c0, aVar, function7)), false, bVar, null, null, false, null, AbstractC37817c.m121344e(-1626693867, c28655q, new C0556g((Object) c28332a, function9, (Object) function10, (Object) interfaceC2994c0, (Object) aVar, 12)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
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
                    objM87133R5 = c28655q.m87133R();
                    if (!z15 || objM87133R5 == c28676v0) {
                        objM87133R5 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 0);
                        function11 = function9;
                        function12 = function10;
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function11 = function9;
                        function12 = function10;
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, false, c28655q, 0, 1);
                    function5 = function11;
                    function6 = function12;
                } else {
                    c28655q.m87138X();
                    function5 = function3;
                    function6 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C28330f(c28332a, function5, function6, i13, i14, 22);
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
                if (i19 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29344b(26);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function7 = (Function1) objM87133R7;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C29344b(27);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function8 = (Function1) objM87133R6;
                } else {
                    function8 = function4;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                aVar = new AbstractC35664f.a(c15199y3M3460c);
                objM87133R2 = c28655q.m87133R();
                textResource = null;
                objArr = 0;
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(new C35666g(c28332a.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i18, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                int iIndexOf2 = c28332a.getBottomSheet().m65420e().indexOf(c28332a.getBottomSheet().getCurrentCategory());
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q.m87161k(AbstractC2453v1.f9577p), c28655q);
                zM87157i = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R3 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                C35666g c35666gM90238J2 = m90238J(interfaceC28601c2);
                AbstractC27274q.b bVar2 = AbstractC27274q.b.f109138f;
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R4 = new C2028s(interfaceC2994c0, aVar, 4);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2028s(interfaceC2994c0, aVar, 4);
                    c28655q.m87172p0(objM87133R4);
                }
                function9 = function7;
                function10 = function8;
                AbstractC35660d.m112871m(modifierM3407d2, c35666gM90238J2, aVar, null, (InterfaceC4339a) objM87133R4, null, null, AbstractC37817c.m121344e(1579210585, c28655q, new C2030t(iIndexOf2, 3, c28332a, interfaceC2994c0, aVar, function7)), false, bVar2, null, null, false, null, AbstractC37817c.m121344e(-1626693867, c28655q, new C0556g((Object) c28332a, function9, (Object) function10, (Object) interfaceC2994c0, (Object) aVar, 12)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
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
                objM87133R5 = c28655q.m87133R();
                if (z15) {
                    objM87133R5 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 0);
                    function11 = function9;
                    function12 = function10;
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 0);
                    function11 = function9;
                    function12 = function10;
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, false, c28655q, 0, 1);
                function5 = function11;
                function6 = function12;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(c28332a, function5, function6, i13, i14, 22);
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
                if (i19 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C29344b(26);
                        c28655q.m87172p0(objM87133R7);
                    }
                    function7 = (Function1) objM87133R7;
                } else {
                    function7 = function3;
                }
                if (i16 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C29344b(27);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function8 = (Function1) objM87133R6;
                } else {
                    function8 = function4;
                }
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
                aVar = new AbstractC35664f.a(c15199y3M3460c);
                objM87133R2 = c28655q.m87133R();
                textResource = null;
                objArr = 0;
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(new C35666g(c28332a.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i18, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R2;
                int iIndexOf3 = c28332a.getBottomSheet().m65420e().indexOf(c28332a.getBottomSheet().getCurrentCategory());
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q.m87161k(AbstractC2453v1.f9577p), c28655q);
                zM87157i = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F);
                objM87133R3 = c28655q.m87133R();
                if (zM87157i) {
                    objM87133R3 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                    c28655q.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
                C35666g c35666gM90238J3 = m90238J(interfaceC28601c3);
                AbstractC27274q.b bVar3 = AbstractC27274q.b.f109138f;
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i2) {
                    objM87133R4 = new C2028s(interfaceC2994c0, aVar, 4);
                    c28655q.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new C2028s(interfaceC2994c0, aVar, 4);
                    c28655q.m87172p0(objM87133R4);
                }
                function9 = function7;
                function10 = function8;
                AbstractC35660d.m112871m(modifierM3407d3, c35666gM90238J3, aVar, null, (InterfaceC4339a) objM87133R4, null, null, AbstractC37817c.m121344e(1579210585, c28655q, new C2030t(iIndexOf3, 3, c28332a, interfaceC2994c0, aVar, function7)), false, bVar3, null, null, false, null, AbstractC37817c.m121344e(-1626693867, c28655q, new C0556g((Object) c28332a, function9, (Object) function10, (Object) interfaceC2994c0, (Object) aVar, 12)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
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
                objM87133R5 = c28655q.m87133R();
                if (z15) {
                    objM87133R5 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 0);
                    function11 = function9;
                    function12 = function10;
                    c28655q.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 0);
                    function11 = function9;
                    function12 = function10;
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, false, c28655q, 0, 1);
                function5 = function11;
                function6 = function12;
            } else {
                c28655q.m87138X();
                function5 = function3;
                function6 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C28330f(c28332a, function5, function6, i13, i14, 22);
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
            if (i19 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C29344b(26);
                    c28655q.m87172p0(objM87133R7);
                }
                function7 = (Function1) objM87133R7;
            } else {
                function7 = function3;
            }
            if (i16 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C29344b(27);
                    c28655q.m87172p0(objM87133R6);
                }
                function8 = (Function1) objM87133R6;
            } else {
                function8 = function4;
            }
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6);
            aVar = new AbstractC35664f.a(c15199y3M3460c);
            objM87133R2 = c28655q.m87133R();
            textResource = null;
            objArr = 0;
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(new C35666g(c28332a.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i18, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R2;
            int iIndexOf4 = c28332a.getBottomSheet().m65420e().indexOf(c28332a.getBottomSheet().getCurrentCategory());
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q.m87161k(AbstractC2453v1.f9577p), c28655q);
            zM87157i = c28655q.m87157i(c15199y3M3460c) | c28655q.m87153g(interfaceC28601c1M87238F);
            objM87133R3 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R3 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, C23454a0.f92919a);
            C35666g c35666gM90238J4 = m90238J(interfaceC28601c4);
            AbstractC27274q.b bVar4 = AbstractC27274q.b.f109138f;
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R4 = new C2028s(interfaceC2994c0, aVar, 4);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C2028s(interfaceC2994c0, aVar, 4);
                c28655q.m87172p0(objM87133R4);
            }
            function9 = function7;
            function10 = function8;
            AbstractC35660d.m112871m(modifierM3407d4, c35666gM90238J4, aVar, null, (InterfaceC4339a) objM87133R4, null, null, AbstractC37817c.m121344e(1579210585, c28655q, new C2030t(iIndexOf4, 3, c28332a, interfaceC2994c0, aVar, function7)), false, bVar4, null, null, false, null, AbstractC37817c.m121344e(-1626693867, c28655q, new C0556g((Object) c28332a, function9, (Object) function10, (Object) interfaceC2994c0, (Object) aVar, 12)), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
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
            objM87133R5 = c28655q.m87133R();
            if (z15) {
                objM87133R5 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 0);
                function11 = function9;
                function12 = function10;
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C29525g(c15199y3M3460c, interfaceC2994c0, function9, function10, aVar, 0);
                function11 = function9;
                function12 = function10;
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, false, c28655q, 0, 1);
            function5 = function11;
            function6 = function12;
        } else {
            c28655q.m87138X();
            function5 = function3;
            function6 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28330f(c28332a, function5, function6, i13, i14, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m90235G(AbstractC27131a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m90236H(AbstractC25946g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m90237I(C28332a c28332a, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m90234F(c28332a, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final C35666g m90238J(InterfaceC28601c1 interfaceC28601c1) {
        return (C35666g) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final InterfaceC2464x2 m90239K(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC2464x2) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m90240L(InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(aVar, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m90241M(C28332a c28332a, int i13, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, Function1 function1, InterfaceC23013y BottomSheet, Composer composer, int i14) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 17) != 16)) {
            C22581e c22581eM85863b = c28332a.getBottomSheet();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C29520c(function1, 0);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function2 = (Function1) objM87133R;
            boolean zM87153g2 = c28655q.m87153g(function1);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C29522d(function1, 0);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
            boolean zM87153g3 = c28655q.m87153g(function1);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C29520c(function1, 1);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function3 = (Function1) objM87133R3;
            boolean zM87153g4 = c28655q.m87153g(function1);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87153g4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C29520c(function1, 2);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC35302l.m112030o(c22581eM85863b, i13, interfaceC2994c0, aVar, false, false, function2, interfaceC4339a, function3, (Function1) objM87133R4, null, c28655q, C22581e.f88865n | (AbstractC35664f.a.f151587c << 9), 0, 1072);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m90242N(Function1 function1, String id4) {
        AbstractC22676k.m65750j(id4, "id");
        function1.invoke(new AbstractC27131a.n(EnumC21941c.ACTIVITY, id4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m90243O(Function1 function1) {
        function1.invoke(new AbstractC27131a.j(EnumC21941c.ACTIVITY));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m90244P(Function1 function1, int i13) {
        function1.invoke(new AbstractC27131a.c(EnumC21941c.ACTIVITY, i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m90245Q(Function1 function1, String query) {
        AbstractC22676k.m65750j(query, "query");
        function1.invoke(new AbstractC27131a.r(EnumC21941c.ACTIVITY, query));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m90246R(C28332a c28332a, Function1 function1, Function1 function2, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, Composer composer, int i13) {
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
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(c28332a.getTitleDisplay(), null, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E))), null, null, null, false, null, null, null, null, null, null, null, null, 32762, null);
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(function2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C11901c(function1, 13, function2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(c2314t, "contentLazyColumn")), ((float) 2.5d) * 8, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3396r, true, 1.0f);
            boolean zM87157i = c28655q.m87157i(c28332a) | c28655q.m87153g(function1) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                C21881l c21881l = new C21881l(c28332a, function1, interfaceC2994c0, aVar, 25);
                c28655q.m87172p0(c21881l);
                objM87133R2 = c21881l;
            }
            AbstractC22674j.m65717c(modifierM31988g, null, null, null, null, null, false, null, (Function1) objM87133R2, c28655q, 0, 510);
            m90281y(c28332a, function1, function2, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m90247S(Function1 function1, Function1 function2) {
        function1.invoke(new AbstractC27131a.f(false, 1, null));
        function2.invoke(new AbstractC25946g.b(TargetGoalType.ACTIVITIES));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m90248T(final C28332a c28332a, Function1 function1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        final int i13 = 0;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: pt2.e
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i14 = i13;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i14) {
                    case 0:
                        return AbstractC29527i.m90249U(c28332a, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC29527i.m90251W(c28332a, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, -1208801824), 3);
        if (!c28332a.m85873l().isEmpty()) {
            List<InterfaceC25312u> listM85873l = c28332a.m85873l();
            C29344b c29344b = new C29344b(23);
            g gVar = g.f120190w;
            ((C26053f) LazyColumn).m77529r(listM85873l.size(), new h(c29344b, listM85873l), new i(gVar, listM85873l), new C37816b(new j(listM85873l, function1), true, 802480018));
        }
        final int i14 = 1;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: pt2.e
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i15) {
                    case 0:
                        return AbstractC29527i.m90249U(c28332a, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC29527i.m90251W(c28332a, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, -1067701609), 3);
        List<InterfaceC25312u> listM85867f = c28332a.m85867f();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM85867f.size(), new l(new C29344b(24), listM85867f), new m(k.f120197w, listM85867f), new C37816b(new n(listM85867f, function1), true, 802480018));
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C2026r(c28332a, interfaceC2994c0, function1, aVar, 19), true, -433402600), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m90249U(C28332a c28332a, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f13, c2314t));
            TextResource textResourceM85869h = c28332a.getTitle();
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM85869h, c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a c2886aM8418P = c38072d.m121952e(c28655q, i15).getT3();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 0, i16, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c28332a.getSubtitle(), c28655q, i14), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, i16, 196602);
            if (c28332a.m85873l().isEmpty() || !AbstractC8693b.m21270d(c28332a.getTopHeadingDisplay())) {
                c28655q.m87150e0(1886828578);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1886392284);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(4 * f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c28332a.getTopHeadingDisplay(), c28655q, i14), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getSh4(), null, c28655q, 0, i16, 196602);
                AbstractC31061c.m95650z((float) 1.5d, f13, c2314t, c28655q, false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final Object m90250V(InterfaceC25312u topItem) {
        AbstractC22676k.m65750j(topItem, "topItem");
        C14067e c14067e = topItem instanceof C14067e ? (C14067e) topItem : null;
        String strM8299l = c14067e != null ? AbstractC2875y.m8299l(c14067e.getId(), "_topItem") : null;
        return strM8299l == null ? "" : strM8299l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m90251W(C28332a c28332a, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zIsEmpty = c28332a.m85873l().isEmpty();
            C2314t c2314t = C2314t.f9131w;
            if (zIsEmpty) {
                c28655q.m87150e0(629339174);
                AbstractC31061c.m95650z(4, 8, c2314t, c28655q, false);
            } else {
                c28655q.m87150e0(629231108);
                AbstractC31061c.m95650z((float) 2.5d, 8, c2314t, c28655q, false);
            }
            String strM21274h = AbstractC8693b.m21274h(c28332a.getHeadingDisplay(), c28655q, TextResource.$stable);
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
    /* JADX INFO: renamed from: X */
    public static final Object m90252X(InterfaceC25312u it) {
        AbstractC22676k.m65750j(it, "it");
        C14067e c14067e = it instanceof C14067e ? (C14067e) it : null;
        String id4 = c14067e != null ? c14067e.getId() : null;
        return id4 == null ? "" : id4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m90253Y(C28332a c28332a, InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC35664f.a aVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zIsEmpty = c28332a.m85873l().isEmpty();
            C2314t c2314t = C2314t.f9131w;
            if (zIsEmpty) {
                c28655q.m87150e0(-824995190);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-825094173);
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
            C39282o c39282o = new C39282o(null, c28332a.getAddButtonInfo().getTitleDisplay(), null, false, false, new AbstractC39279l.b(objArr, null, new C39274g(c28332a.getAddButtonInfo().getIcon(), null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, 4091, defaultConstructorMarker), false, objArr2, objArr3, objArr4, false, objArr5, objArr6, objArr7, null, 32733, defaultConstructorMarker);
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(function1) | c28655q.m87157i(aVar);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C2018n(interfaceC2994c0, function1, aVar, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39281n.m125207c(null, c39282o, (InterfaceC4339a) objM87133R, c28655q, C39282o.f168987q << 3, 1);
            C30596c0 c30596c0M85871j = c28332a.getTooltip();
            if (c30596c0M85871j == null) {
                c28655q.m87150e0(-824121332);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-824121331);
                AbstractC11266d.m30469w(5, 8, c2314t, c28655q);
                AbstractC30598d0.m93869c(c2314t, c30596c0M85871j, c28655q, (TextResource.$stable << 3) | 6);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m90254Z(InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC35664f.a aVar) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(function1, aVar, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m90256a0(C15199y3 c15199y3, InterfaceC2994c0 interfaceC2994c0, Function1 function1, Function1 function2, AbstractC35664f.a aVar) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (c15199y3.m43224e()) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(aVar, null), 3);
        } else {
            function1.invoke(new AbstractC27131a.f(false, 1, defaultConstructorMarker));
            function2.invoke(new AbstractC25946g.b(TargetGoalType.ACTIVITIES));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m90281y(C28332a c28332a, Function1 function1, Function1 function2, Composer composer, int i13) {
        C28332a c28332a2;
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1859254405);
        if ((i13 & 6) == 0) {
            c28332a2 = c28332a;
            i14 = (c28655q2.m87157i(c28332a2) ? 4 : 2) | i13;
        } else {
            c28332a2 = c28332a;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function2) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC22953f.m66722k(c2314t), 0.0f, f13, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1099a.m3396r(c2314t, 5 * 4, 0.0f, 2), "Save_Activities_Button");
            TextResource textResourceM85864c = c28332a2.getContinueButtonDisplay();
            boolean zM85865d = c28332a2.getEnableContinueButton();
            boolean z4 = ((i14 & 112) == 32) | ((i14 & 896) == 256);
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C11901c(function1, 14, function2);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC27292z.m82343j(modifierM44101d, zM85865d, false, null, null, null, textResourceM85864c, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q2, TextResource.$stable << 18, 0, 8124);
            c28655q = c28655q2;
            AbstractC25012a.m73389v(c2314t, f13, c28655q, true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) c28332a, function1, (InterfaceC23459e) function2, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m90282z(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC27131a.h.f108495a);
        function2.invoke(new AbstractC25946g.b(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }
}
