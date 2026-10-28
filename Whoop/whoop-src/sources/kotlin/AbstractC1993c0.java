package kotlin;

import a00.C0073h;
import a01.C0089i;
import a20.C0167g;
import a41.C0373i;
import a81.C0561l;
import am2.C1008b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import aq0.C1905p;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.mapbox.common.logger.LogPriority;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import f41.C14063a;
import f41.C14067e;
import f41.C14080r;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import hy0.AbstractC17808z1;
import hy0.C17731c2;
import hy0.EnumC17727b2;
import hy0.EnumC17786s0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import java.util.List;
import km0.C22581e;
import l83.C23454a0;
import ny0.AbstractC27265l0;
import ny0.AbstractC27274q;
import ny0.AbstractC27292z;
import o81.C27656a;
import p000.AbstractC11266d;
import p000.C22079k;
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
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p291l0.InterfaceC23013y;
import p315m0.AbstractC24868a;
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
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
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
import ws2.AbstractC37617i;
import x81.C38072d;
import y71.AbstractC39279l;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;
import yb0.AbstractC39383f;
import ys2.AbstractC39758e;

/* JADX INFO: renamed from: at2.c0 */
/* JADX INFO: loaded from: classes11.dex */
@p715kotlin.Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0012²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\nX\u008a\u0084\u0002"}, m65681d2 = {"Lys2/e$j;", "viewState", "Lkotlin/Function1;", "Lws2/i;", "Ll83/a0;", "onViewEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lys2/e$j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Q", "(Lys2/e$j;Landroidx/compose/runtime/Composer;I)V", "s", "(Lys2/e$j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lat2/a;", "bottomSheetType", "Lv41/g;", "bottomSheetTopBar", "Lb3/x2;", "keyboard", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC1993c0 {

    /* JADX INFO: renamed from: at2.c0$a */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.SetUpBehaviorScreenV2Kt$SetUpBehaviorScreenV2$2$1", m100430f = "SetUpBehaviorScreenV2.kt", m100431l = {89}, m100432m = "invokeSuspend", m100433v = 2)
    @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f7884w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f7885x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f7886y;

        /* JADX INFO: renamed from: at2.c0$a$a, reason: collision with other inner class name */
        @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41288a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC28670t2 f7887w;

            public C41288a(InterfaceC28670t2 interfaceC28670t2) {
                this.f7887w = interfaceC28670t2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC2464x2 interfaceC2464x2M6063O;
                if (enumC15209z3 == EnumC15209z3.f57106w && (interfaceC2464x2M6063O = AbstractC1993c0.m6063O(this.f7887w)) != null) {
                    ((C2463x1) interfaceC2464x2M6063O).m7442a();
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f7885x = c15199y3;
            this.f7886y = interfaceC28670t2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m6097h(C15199y3 c15199y3) {
            return c15199y3.m43222c();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f7885x, this.f7886y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f7884w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C2034v(this.f7885x, 1));
                C41288a c41288a = new C41288a(this.f7886y);
                this.f7884w = 1;
                if (c13084s1M87240H.collect(c41288a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: at2.c0$b */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.SetUpBehaviorScreenV2Kt$SetUpBehaviorScreenV2$3$1$1", m100430f = "SetUpBehaviorScreenV2.kt", m100431l = {LogPriority.NONE}, m100432m = "invokeSuspend", m100433v = 2)
    @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f7888w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f7889x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC35664f.a aVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f7889x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f7889x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f7888w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 modalBottomSheetState = this.f7889x.getModalBottomSheetState();
                this.f7888w = 1;
                if (modalBottomSheetState.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: at2.c0$c */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f7890E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f7891F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f7892w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC39758e.j f7893x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2994c0 f7894y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC35664f.a f7895z;

        /* JADX INFO: renamed from: at2.c0$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.SetUpBehaviorScreenV2Kt$SetUpBehaviorScreenV2$5$1$2$1$3$1$1$1", m100430f = "SetUpBehaviorScreenV2.kt", m100431l = {198}, m100432m = "invokeSuspend", m100433v = 2)
        @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC28601c1 f7896E;

            /* JADX INFO: renamed from: w */
            int f7897w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Object f7898x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC35664f.a f7899y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f7900z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f7898x = obj;
                this.f7899y = aVar;
                this.f7900z = interfaceC28601c1;
                this.f7896E = interfaceC28601c2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f7898x, this.f7899y, this.f7900z, this.f7896E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f7897w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC1993c0.m6060L(this.f7900z, new AbstractC1986a.a((C14063a) this.f7898x));
                    AbstractC1993c0.m6062N(this.f7896E, new C35666g(((C14063a) this.f7898x).getBottomSheetTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, 2, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    C15199y3 modalBottomSheetState = this.f7899y.getModalBottomSheetState();
                    this.f7897w = 1;
                    if (modalBottomSheetState.m43225f(this) == enumC31071a) {
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

        public c(Function1 function1, AbstractC39758e.j jVar, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f7892w = function1;
            this.f7893x = jVar;
            this.f7894y = interfaceC2994c0;
            this.f7895z = aVar;
            this.f7890E = interfaceC28601c1;
            this.f7891F = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m6099a(Object viewEvent) {
            AbstractC22676k.m65750j(viewEvent, "viewEvent");
            if (viewEvent instanceof C14080r) {
                C14080r c14080r = (C14080r) viewEvent;
                this.f7892w.invoke(new AbstractC37617i.l(this.f7893x.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), c14080r.getId(), c14080r.getIsToggled(), c14080r.getIsAvoid(), c14080r.getSelectedNumber()));
            }
            if (viewEvent instanceof C14063a) {
                AbstractC3006f0.m8732z(this.f7894y, null, null, new a(viewEvent, this.f7895z, this.f7890E, this.f7891F, null), 3);
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m6099a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: at2.c0$d */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f7901E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f7902F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f7903w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC39758e.j f7904x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2994c0 f7905y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC35664f.a f7906z;

        /* JADX INFO: renamed from: at2.c0$d$a */
        @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.SetUpBehaviorScreenV2Kt$SetUpBehaviorScreenV2$5$1$2$1$6$1$1$1", m100430f = "SetUpBehaviorScreenV2.kt", m100431l = {238}, m100432m = "invokeSuspend", m100433v = 2)
        @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC28601c1 f7907E;

            /* JADX INFO: renamed from: w */
            int f7908w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Object f7909x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC35664f.a f7910y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f7911z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f7909x = obj;
                this.f7910y = aVar;
                this.f7911z = interfaceC28601c1;
                this.f7907E = interfaceC28601c2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f7909x, this.f7910y, this.f7911z, this.f7907E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f7908w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC1993c0.m6060L(this.f7911z, new AbstractC1986a.a((C14063a) this.f7909x));
                    AbstractC1993c0.m6062N(this.f7907E, new C35666g(((C14063a) this.f7909x).getBottomSheetTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, 2, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    C15199y3 modalBottomSheetState = this.f7910y.getModalBottomSheetState();
                    this.f7908w = 1;
                    if (modalBottomSheetState.m43225f(this) == enumC31071a) {
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

        public d(Function1 function1, AbstractC39758e.j jVar, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f7903w = function1;
            this.f7904x = jVar;
            this.f7905y = interfaceC2994c0;
            this.f7906z = aVar;
            this.f7901E = interfaceC28601c1;
            this.f7902F = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m6100a(Object viewEvent) {
            AbstractC22676k.m65750j(viewEvent, "viewEvent");
            if (viewEvent instanceof C14080r) {
                C14080r c14080r = (C14080r) viewEvent;
                this.f7903w.invoke(new AbstractC37617i.l(this.f7904x.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), c14080r.getId(), c14080r.getIsToggled(), c14080r.getIsAvoid(), c14080r.getSelectedNumber()));
            }
            if (viewEvent instanceof C14063a) {
                AbstractC3006f0.m8732z(this.f7905y, null, null, new a(viewEvent, this.f7906z, this.f7901E, this.f7902F, null), 3);
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m6100a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: at2.c0$e */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.SetUpBehaviorScreenV2Kt$SetUpBehaviorScreenV2$5$1$2$1$7$1$1$1", m100430f = "SetUpBehaviorScreenV2.kt", m100431l = {263}, m100432m = "invokeSuspend", m100433v = 2)
    @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f7912E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f7913F;

        /* JADX INFO: renamed from: w */
        int f7914w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f7915x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC39758e.j f7916y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC35664f.a f7917z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function1 function1, AbstractC39758e.j jVar, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f7915x = function1;
            this.f7916y = jVar;
            this.f7917z = aVar;
            this.f7912E = interfaceC28601c1;
            this.f7913F = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f7915x, this.f7916y, this.f7917z, this.f7912E, this.f7913F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f7914w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f7915x.invoke(AbstractC37617i.e.f160952a);
                AbstractC1993c0.m6060L(this.f7912E, AbstractC1986a.b.f7857a);
                AbstractC1993c0.m6062N(this.f7913F, new C35666g(this.f7916y.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, 2, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                C15199y3 modalBottomSheetState = this.f7917z.getModalBottomSheetState();
                this.f7914w = 1;
                if (modalBottomSheetState.m43225f(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: at2.c0$f */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.customizeplan.view.SetUpBehaviorScreenV2Kt$SetUpBehaviorScreenV2$6$1$1", m100430f = "SetUpBehaviorScreenV2.kt", m100431l = {278}, m100432m = "invokeSuspend", m100433v = 2)
    @p715kotlin.Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f7918w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f7919x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AbstractC35664f.a aVar, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f7919x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f7919x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f7918w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 modalBottomSheetState = this.f7919x.getModalBottomSheetState();
                this.f7918w = 1;
                if (modalBottomSheetState.m43223d(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: at2.c0$g */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f7920w = new g();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: at2.c0$h */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f7921w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f7922x;

        public h(Function1 function1, List list) {
            this.f7921w = function1;
            this.f7922x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m6102a(int i13) {
            return this.f7921w.invoke(this.f7922x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6102a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: at2.c0$i */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f7923w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f7924x;

        public i(Function1 function1, List list) {
            this.f7923w = function1;
            this.f7924x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m6103a(int i13) {
            return this.f7923w.invoke(this.f7924x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6103a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: at2.c0$j */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC35664f.a f7925E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f7926F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f7927G;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f7928w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f7929x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC39758e.j f7930y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC2994c0 f7931z;

        public j(List list, Function1 function1, AbstractC39758e.j jVar, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f7928w = list;
            this.f7929x = function1;
            this.f7930y = jVar;
            this.f7931z = interfaceC2994c0;
            this.f7925E = aVar;
            this.f7926F = interfaceC28601c1;
            this.f7927G = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m6104a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f7928w.get(i13);
            c28655q.m87150e0(-1666562283);
            boolean zM87153g = c28655q.m87153g(this.f7929x) | c28655q.m87157i(this.f7930y) | c28655q.m87157i(this.f7931z) | c28655q.m87157i(this.f7925E);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                c cVar = new c(this.f7929x, this.f7930y, this.f7931z, this.f7925E, this.f7926F, this.f7927G);
                c28655q.m87172p0(cVar);
                objM87133R = cVar;
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, 0, 6);
            AbstractC31061c.m95650z((float) 1.5d, 8, C2314t.f9131w, c28655q, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m6104a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: at2.c0$k */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final k f7932w = new k();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC25312u interfaceC25312u) {
            return null;
        }
    }

    /* JADX INFO: renamed from: at2.c0$l */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f7933w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f7934x;

        public l(Function1 function1, List list) {
            this.f7933w = function1;
            this.f7934x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m6106a(int i13) {
            return this.f7933w.invoke(this.f7934x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6106a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: at2.c0$m */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f7935w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f7936x;

        public m(Function1 function1, List list) {
            this.f7935w = function1;
            this.f7936x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m6107a(int i13) {
            return this.f7935w.invoke(this.f7936x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m6107a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: at2.c0$n */
    @p715kotlin.Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC35664f.a f7937E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f7938F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f7939G;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f7940w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f7941x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC39758e.j f7942y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC2994c0 f7943z;

        public n(List list, Function1 function1, AbstractC39758e.j jVar, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f7940w = list;
            this.f7941x = function1;
            this.f7942y = jVar;
            this.f7943z = interfaceC2994c0;
            this.f7937E = aVar;
            this.f7938F = interfaceC28601c1;
            this.f7939G = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m6108a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            InterfaceC25312u interfaceC25312u = (InterfaceC25312u) this.f7940w.get(i13);
            c28655q.m87150e0(368369076);
            boolean zM87153g = c28655q.m87153g(this.f7941x) | c28655q.m87157i(this.f7942y) | c28655q.m87157i(this.f7943z) | c28655q.m87157i(this.f7937E);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                d dVar = new d(this.f7941x, this.f7942y, this.f7943z, this.f7937E, this.f7938F, this.f7939G);
                c28655q.m87172p0(dVar);
                objM87133R = dVar;
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, 0, 6);
            AbstractC31061c.m95650z((float) 1.5d, 8, C2314t.f9131w, c28655q, false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m6108a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m6049A(Function1 function1, AbstractC39758e.j jVar) {
        function1.invoke(new AbstractC37617i.a(jVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex() == 0, 0, 2, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m6050B(final AbstractC39758e.j jVar, Function1 function1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        final int i13 = 0;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: at2.x
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i14 = i13;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i14) {
                    case 0:
                        return AbstractC1993c0.m6051C(jVar, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC1993c0.m6053E(jVar, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, 1243567575), 3);
        if (!jVar.m127215n().isEmpty()) {
            List<InterfaceC25312u> listM127215n = jVar.m127215n();
            C1905p c1905p = new C1905p(9);
            g gVar = g.f7920w;
            ((C26053f) LazyColumn).m77529r(listM127215n.size(), new h(c1905p, listM127215n), new i(gVar, listM127215n), new C37816b(new j(listM127215n, function1, jVar, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c2), true, 802480018));
        }
        final int i14 = 1;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: at2.x
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i15) {
                    case 0:
                        return AbstractC1993c0.m6051C(jVar, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC1993c0.m6053E(jVar, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, 1668601550), 3);
        List<InterfaceC25312u> listM127208g = jVar.m127208g();
        C1905p c1905p2 = new C1905p(10);
        k kVar = k.f7932w;
        ((C26053f) LazyColumn).m77529r(listM127208g.size(), new l(c1905p2, listM127208g), new m(kVar, listM127208g), new C37816b(new n(listM127208g, function1, jVar, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c2), true, 802480018));
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C2040y(jVar, interfaceC2994c0, function1, aVar, interfaceC28601c1, interfaceC28601c2, 0), true, -682393841), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m6051C(AbstractC39758e.j jVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(2 * f13, c2314t));
            TextResource textResourceM127273d = jVar.getHeader().getTitle();
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM127273d, c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a c2886aM8418P = c38072d.m121952e(c28655q, i15).getT3();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 0, i16, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(jVar.getHeader().getSubTitle(), c28655q, i14), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB1(), null, c28655q, 0, i16, 196602);
            if (jVar.m127215n().isEmpty() || !AbstractC8693b.m21270d(jVar.getTopHeadingDisplay())) {
                c28655q.m87150e0(-1265063189);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1265499483);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(4 * f13, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(jVar.getTopHeadingDisplay(), c28655q, i14), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getSh4(), null, c28655q, 0, i16, 196602);
                AbstractC31061c.m95650z((float) 1.5d, f13, c2314t, c28655q, false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final Object m6052D(InterfaceC25312u topItem) {
        AbstractC22676k.m65750j(topItem, "topItem");
        C14067e c14067e = topItem instanceof C14067e ? (C14067e) topItem : null;
        String strM8299l = c14067e != null ? AbstractC2875y.m8299l(c14067e.getId(), "_topItem") : null;
        return strM8299l == null ? "" : strM8299l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m6053E(AbstractC39758e.j jVar, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zIsEmpty = jVar.m127215n().isEmpty();
            C2314t c2314t = C2314t.f9131w;
            if (zIsEmpty) {
                c28655q.m87150e0(-642529137);
                AbstractC31061c.m95650z(4, 8, c2314t, c28655q, false);
            } else {
                c28655q.m87150e0(-642637203);
                AbstractC31061c.m95650z((float) 2.5d, 8, c2314t, c28655q, false);
            }
            m6065Q(jVar, c28655q, 0);
            AbstractC18489d0.m53380u((float) 1.5d, 8, c2314t, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final Object m6054F(InterfaceC25312u it) {
        AbstractC22676k.m65750j(it, "it");
        C14067e c14067e = it instanceof C14067e ? (C14067e) it : null;
        String id4 = c14067e != null ? c14067e.getId() : null;
        return id4 == null ? "" : id4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m6055G(AbstractC39758e.j jVar, InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zIsEmpty = jVar.m127215n().isEmpty();
            C2314t c2314t = C2314t.f9131w;
            if (zIsEmpty) {
                c28655q.m87150e0(-1114535629);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1114634612);
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
            C39282o c39282o = new C39282o(objArr, jVar.getAddButtonInfo().getTitleDisplay(), null, false, false, new AbstractC39279l.b(null, null, new C39274g(jVar.getAddButtonInfo().getIcon(), null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, false, 4091, defaultConstructorMarker), false, objArr2, objArr3, objArr4, false, objArr5, objArr6, objArr7, null, 32733, defaultConstructorMarker);
            boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87153g(function1) | c28655q.m87157i(jVar) | c28655q.m87157i(aVar);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C0561l((Object) interfaceC2994c0, function1, (Object) jVar, (Object) aVar, (Object) interfaceC28601c1, (Object) interfaceC28601c2, 2);
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
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m6056H(InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC39758e.j jVar, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(function1, jVar, aVar, interfaceC28601c1, interfaceC28601c2, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m6057I(C15199y3 c15199y3, InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC39758e.j jVar, AbstractC35664f.a aVar) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (c15199y3.m43224e()) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(aVar, null), 3);
        } else {
            int iM120803a = jVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex();
            function1.invoke(new AbstractC37617i.a(iM120803a == 0, 0, 2, defaultConstructorMarker));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m6058J(AbstractC39758e.j jVar, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m6092w(jVar, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: K */
    private static final AbstractC1986a m6059K(InterfaceC28601c1 interfaceC28601c1) {
        return (AbstractC1986a) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final void m6060L(InterfaceC28601c1 interfaceC28601c1, AbstractC1986a abstractC1986a) {
        interfaceC28601c1.setValue(abstractC1986a);
    }

    /* JADX INFO: renamed from: M */
    private static final C35666g m6061M(InterfaceC28601c1 interfaceC28601c1) {
        return (C35666g) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final void m6062N(InterfaceC28601c1 interfaceC28601c1, C35666g c35666g) {
        interfaceC28601c1.setValue(c35666g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final InterfaceC2464x2 m6063O(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC2464x2) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m6064P(InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(aVar, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private static final void m6065Q(AbstractC39758e.j jVar, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(819117797);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(jVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            TextResource textResourceM127207f = jVar.getHeadingDisplay();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM127207f, c28655q, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125385c1 = c38072d.m121949b(c28655q, i16).getWhite70();
            C2886a c2886aM8414L = c38072d.m121952e(c28655q, i16).getSh4();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, layoutWeightElement, jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8414L, null, c28655q, 0, i17, 196600);
            c28655q = c28655q;
            C17731c2 c17731c2 = new C17731c2(AbstractC8693b.m21267a(), true, EnumC17727b2.POSITIVE_GREEN, false, null, EnumC17786s0.END, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32728, null);
            int i18 = C17731c2.f68917p;
            AbstractC17808z1.m51175c(c17731c2, c28655q, i18);
            float f13 = 8;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(((float) 0.3d) * f13, c2314t));
            AbstractC17808z1.m51175c(new C17731c2(AbstractC8693b.m21267a(), true, EnumC17727b2.NEGATIVE_YELLOW, false, null, EnumC17786s0.START, false, false, 0, 0, 0.0f, null, null, 0.0f, null, 32728, null), c28655q, i18);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f13, c2314t));
            TextResource textResourceM127213l = jVar.getSubHeadingDisplay();
            if (textResourceM127213l == null) {
                c28655q.m87150e0(-1820960442);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1820960441);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM127213l, c28655q, i15), null, c38072d.m121949b(c28655q, i16).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH6(), null, c28655q, 0, i17, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(jVar, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m6066R(AbstractC39758e.j jVar, int i13, Composer composer, int i14) {
        m6065Q(jVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    private static final void m6088s(AbstractC39758e.j jVar, Function1 function1, Composer composer, int i13) {
        int i14;
        AbstractC39758e.j jVar2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-774511618);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(jVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, ((float) 2.5d) * f13, 2 * f13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            TextResource textResourceM127205d = jVar.getButtonDescriptionDisplay();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM127205d, c28655q, i16);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, modifierM3409f, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196088);
            AbstractC18489d0.m53380u(3, f13, c2314t, c28655q);
            Modifier modifierM44101d = AbstractC15676d.m44101d(AbstractC1102d.m3409f(1.0f, c2314t), "Save_Behaviors_Button");
            TextResource textResourceM127171a = jVar.getBottom().getContinueButtonDisplay();
            boolean zM127172b = jVar.getBottom().getEnableContinueButton();
            int i18 = i15 & 112;
            boolean zM87157i = c28655q.m87157i(jVar) | (i18 == 32);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C2042z(function1, jVar, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27292z.m82343j(modifierM44101d, zM127172b, false, null, null, null, textResourceM127171a, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q, i16 << 18, 0, 8124);
            c28655q = c28655q;
            AbstractC18489d0.m53380u((float) 1.5d, f13, c2314t, c28655q);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9107J, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            TextResource textResourceM127173c = jVar.getBottom().getSkipButtonDisplay();
            if (textResourceM127173c == null) {
                c28655q.m87150e0(-1666676048);
                c28655q.m87173q(false);
                jVar2 = jVar;
            } else {
                c28655q.m87150e0(-1666676047);
                jVar2 = jVar;
                boolean zM87157i2 = c28655q.m87157i(jVar2) | (i18 == 32);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C0167g(15, function1, jVar2);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC27265l0.m82217i(null, null, textResourceM127173c, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, i16 << 6, 0, 4091);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            jVar2 = jVar;
            function1 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(jVar2, function1, i13, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m6089t(Function1 function1, AbstractC39758e.j jVar) {
        function1.invoke(new AbstractC37617i.h(jVar.getPlanId(), jVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), jVar.m127211j(), null, 8, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m6090u(Function1 function1, AbstractC39758e.j jVar, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC37617i.c(jVar.getPlanId(), jVar.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), null, 4, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m6091v(AbstractC39758e.j jVar, Function1 function1, int i13, Composer composer, int i14) {
        m6088s(jVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x006c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:40:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code duplicated, block: B:51:0x013a  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:67:0x0202  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public static final void m6092w(AbstractC39758e.j viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function3;
        Object objM87133R;
        InterfaceC2994c0 interfaceC2994c0;
        C15199y3 c15199y3M3460c;
        Object objM87133R2;
        AbstractC35664f.a aVar;
        Object objM87133R3;
        TextResource textResource;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        boolean zM87157i;
        Object objM87133R4;
        boolean zM87157i2;
        Object objM87133R5;
        Function1 function4;
        boolean z13;
        boolean zM87157i3;
        Object c0073h;
        Function1 function5;
        Object objM87133R6;
        Object[] objArr;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(151705982);
        int i17 = 2;
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                function2 = function1;
                i15 |= c28655q2.m87157i(function2) ? 32 : 16;
            }
            i16 = i15;
            if ((i16 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C1905p(11);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function3 = (Function1) objM87133R6;
                } else {
                    function3 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q2, 3078, 6);
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(AbstractC1986a.b.f7857a);
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objM87133R2;
                aVar = new AbstractC35664f.a(c15199y3M3460c);
                objM87133R3 = c28655q2.m87133R();
                textResource = null;
                objArr = 0;
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = AbstractC28683x.m87272z(new C35666g(viewState.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i17, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    c28655q2.m87172p0(objM87133R3);
                }
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R3;
                int iIndexOf = viewState.getBottomSheet().m65420e().indexOf(viewState.getBottomSheet().getCurrentCategory());
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q2.m87161k(AbstractC2453v1.f9577p), c28655q2);
                zM87157i = c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i || objM87133R4 == c28676v0) {
                    objM87133R4 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
                C35666g c35666gM6061M = m6061M(interfaceC28601c2);
                AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                zM87157i2 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
                objM87133R5 = c28655q2.m87133R();
                if (zM87157i2 || objM87133R5 == c28676v0) {
                    objM87133R5 = new C2028s(interfaceC2994c0, aVar, 1);
                    c28655q2.m87172p0(objM87133R5);
                }
                function4 = function3;
                int i19 = 0;
                AbstractC35660d.m112871m(modifierM3407d, c35666gM6061M, aVar, null, (InterfaceC4339a) objM87133R5, null, null, AbstractC37817c.m121344e(1384521488, c28655q2, new C1987a0(viewState, aVar, iIndexOf, interfaceC2994c0, function4, interfaceC28601c1, i19)), false, bVar, null, null, false, null, AbstractC37817c.m121344e(-354558004, c28655q2, new C1990b0(viewState, function4, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c2, i19)), c28655q2, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                c28655q = c28655q2;
                boolean zM87157i4 = c28655q.m87157i(c15199y3M3460c) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                if ((i16 & 112) == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i3 = zM87157i4 | z13 | c28655q.m87157i(viewState);
                Object objM87133R7 = c28655q.m87133R();
                if (!zM87157i3 || objM87133R7 == c28676v0) {
                    c0073h = new C0073h(c15199y3M3460c, interfaceC2994c0, function4, viewState, aVar, 4);
                    function5 = function4;
                    c28655q.m87172p0(c0073h);
                } else {
                    c0073h = objM87133R7;
                    function5 = function4;
                }
                AbstractC20301a.m56332c((InterfaceC4339a) c0073h, false, c28655q, 0, 1);
                function2 = function5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C0089i(viewState, i13, function2, i14, 3);
            }
        }
        i15 |= 48;
        function2 = function1;
        i16 = i15;
        if ((i16 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C1905p(11);
                    c28655q2.m87172p0(objM87133R6);
                }
                function3 = (Function1) objM87133R6;
            } else {
                function3 = function2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q2, 3078, 6);
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(AbstractC1986a.b.f7857a);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R2;
            aVar = new AbstractC35664f.a(c15199y3M3460c);
            objM87133R3 = c28655q2.m87133R();
            textResource = null;
            objArr = 0;
            if (objM87133R3 == c28676v0) {
                objM87133R3 = AbstractC28683x.m87272z(new C35666g(viewState.getBottomSheet().getTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, i17, objArr == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                c28655q2.m87172p0(objM87133R3);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R3;
            int iIndexOf2 = viewState.getBottomSheet().m65420e().indexOf(viewState.getBottomSheet().getCurrentCategory());
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(c28655q2.m87161k(AbstractC2453v1.f9577p), c28655q2);
            zM87157i = c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87153g(interfaceC28601c1M87238F);
            objM87133R4 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R4 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new a(c15199y3M3460c, interfaceC28601c1M87238F, null);
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R4, C23454a0.f92919a);
            C35666g c35666gM6061M2 = m6061M(interfaceC28601c4);
            AbstractC27274q.b bVar2 = AbstractC27274q.b.f109138f;
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            zM87157i2 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(aVar);
            objM87133R5 = c28655q2.m87133R();
            if (zM87157i2) {
                objM87133R5 = new C2028s(interfaceC2994c0, aVar, 1);
                c28655q2.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C2028s(interfaceC2994c0, aVar, 1);
                c28655q2.m87172p0(objM87133R5);
            }
            function4 = function3;
            int i110 = 0;
            AbstractC35660d.m112871m(modifierM3407d2, c35666gM6061M2, aVar, null, (InterfaceC4339a) objM87133R5, null, null, AbstractC37817c.m121344e(1384521488, c28655q2, new C1987a0(viewState, aVar, iIndexOf2, interfaceC2994c0, function4, interfaceC28601c3, i110)), false, bVar2, null, null, false, null, AbstractC37817c.m121344e(-354558004, c28655q2, new C1990b0(viewState, function4, interfaceC2994c0, aVar, interfaceC28601c3, interfaceC28601c4, i110)), c28655q2, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
            c28655q = c28655q2;
            boolean zM87157i5 = c28655q.m87157i(c15199y3M3460c) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            if ((i16 & 112) == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i3 = zM87157i5 | z13 | c28655q.m87157i(viewState);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87157i3) {
                c0073h = new C0073h(c15199y3M3460c, interfaceC2994c0, function4, viewState, aVar, 4);
                function5 = function4;
                c28655q.m87172p0(c0073h);
            } else {
                c0073h = new C0073h(c15199y3M3460c, interfaceC2994c0, function4, viewState, aVar, 4);
                function5 = function4;
                c28655q.m87172p0(c0073h);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) c0073h, false, c28655q, 0, 1);
            function2 = function5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0089i(viewState, i13, function2, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m6093x(AbstractC37617i it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m6094y(AbstractC39758e.j jVar, AbstractC35664f.a aVar, int i13, InterfaceC2994c0 interfaceC2994c0, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC23013y BottomSheet, Composer composer, int i14) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 17) != 16)) {
            AbstractC2003f1.m6158g(jVar.getBottomSheet(), aVar, m6059K(interfaceC28601c1), i13, interfaceC2994c0, function1, c28655q, C22581e.f88865n | (AbstractC35664f.a.f151587c << 3), 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m6095z(AbstractC39758e.j jVar, Function1 function1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Composer composer, int i13) {
        boolean z4 = false;
        int i14 = 2;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t))));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
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
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(jVar.getHeader().getNavigationTitle(), AbstractC8693b.m21270d(jVar.getHeader().getNavigationSubTitle()) ? new C27656a(jVar.getHeader().getNavigationSubTitle(), z4, i14, null) : null, new C39274g(AbstractC18489d0.m53357C(C38072d.f163053a), AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E))), null, null, null, false, null, null, null, null, null, null, null, null, 32760, null);
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(jVar);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                objM87133R = new C2042z(function1, jVar, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(c2314t, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            float f13 = 8;
            float f14 = ((float) 2.5d) * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), f14, 0 * f13, f14, 0.0f, 8);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM3599a = AbstractC1136a.m3599a(modifierM3398t.mo3471e(new LayoutWeightElement(1.0f, true)), "SetupBehaviorLazyColumnTag");
            boolean zM87157i = c28655q.m87157i(jVar) | c28655q.m87153g(function1) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                C1008b c1008b = new C1008b((Object) jVar, (Object) function1, (Object) interfaceC2994c0, (Object) aVar, interfaceC28601c1, interfaceC28601c2, 1);
                c28655q.m87172p0(c1008b);
                objM87133R2 = c1008b;
            }
            AbstractC22674j.m65717c(modifierM3599a, null, null, null, null, null, false, null, (Function1) objM87133R2, c28655q, 0, 510);
            m6088s(jVar, function1, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
