package vv2;

import ad3.AbstractC0770m;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1632v;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import c41.AbstractC3992b0;
import c41.AbstractC4158z;
import c41.C3985a0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.weightlifting.StrengthTrainerDestination;
import cu2.AbstractC11128h;
import dp0.AbstractC12248d;
import dp0.AbstractC12250f;
import du2.AbstractC12378b;
import ej1.C13258u;
import ep0.AbstractC13396b;
import ep0.C13404j;
import eu2.AbstractC13644a;
import fi0.InterfaceC14515a;
import gb1.AbstractC15673b0;
import gb1.AbstractC15676d;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import hy0.C17736e;
import io.sentry.config.AbstractC20301a;
import j02.C21173v0;
import java.util.List;
import java.util.WeakHashMap;
import jf3.C21647a;
import kd1.AbstractC22392e;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import n51.C26299f;
import nf3.C26669a;
import ny0.C27256h;
import ny0.EnumC27272p;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p249jc.AbstractC21598x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
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
import p555vl.AbstractC36095b;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.InterfaceC39332e;
import pf3.C29155a;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qx0.C30745a;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s01.C32048d;
import s01.EnumC32047c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf0.C34904e;
import um0.C35076b;
import uv2.C35285b;
import uv2.C35286c;
import uv2.InterfaceC35284a;
import v41.C35657b0;
import v90.C35813e;
import vf3.InterfaceC35951a;
import vs2.C36478d;
import vv1.C36532c;
import wb3.AbstractC37056f;
import x81.C38072d;
import xf3.C38266c;
import y71.AbstractC39279l;
import y71.AbstractC39281n;
import y71.C39282o;

/* JADX INFO: renamed from: vv2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000bH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\"\u0017\u0010#\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0017\u0010&\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u0019\"\u0017\u0010)\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010\u0019¨\u0006,²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;", "navArgs", "Lfi0/a;", "analytics", "Lvv2/a;", "navRouter", "Ll83/a0;", "x", "(Lcom/whoop/weightlifting/StrengthTrainerDestination$g$a;Lfi0/a;Lvv2/a;Landroidx/compose/runtime/Composer;I)V", "Luv2/c;", "viewState", "Lkotlin/Function1;", "Luv2/a;", "onEvent", "y", "(Luv2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Luv2/c$a;", "t", "(Luv2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "R", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "a", "Luv2/c;", "getSampleLinkWorkoutViewState", "()Luv2/c;", "sampleLinkWorkoutViewState", "b", "getSampleLinkWorkoutWithAIViewState", "sampleLinkWorkoutWithAIViewState", "c", "getSampleEmptyTemplatesLinkWorkoutViewState", "sampleEmptyTemplatesLinkWorkoutViewState", "d", "getSampleLoadingLinkWorkoutViewState", "sampleLoadingLinkWorkoutViewState", "e", "getSampleErrorLinkWorkoutViewState", "sampleErrorLinkWorkoutViewState", "f", "getSampleReqFailLinkWorkoutViewState", "sampleReqFailLinkWorkoutViewState", "Luv2/b;", "viewModel", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC36539e {

    /* JADX INFO: renamed from: a */
    private static final C35286c f156434a;

    /* JADX INFO: renamed from: b */
    private static final C35286c f156435b;

    /* JADX INFO: renamed from: c */
    private static final C35286c f156436c;

    /* JADX INFO: renamed from: d */
    private static final C35286c f156437d;

    /* JADX INFO: renamed from: e */
    private static final C35286c f156438e;

    /* JADX INFO: renamed from: f */
    private static final C35286c f156439f;

    /* JADX INFO: renamed from: vv2.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f156440w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f156441x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f156442y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f156443z;

        /* JADX INFO: renamed from: vv2.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42569a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f156444w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42569a(C21647a c21647a) {
                super(0);
                this.f156444w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f156444w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f156440w = c38266c;
            this.f156441x = interfaceC35951a;
            this.f156442y = interfaceC4339a;
            this.f156443z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, uv2.b] */
        @Override // c93.InterfaceC4339a
        public final C35285b invoke() {
            return AbstractC21598x.m60668X(this.f156440w, this.f156441x, new C42569a(this.f156443z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35285b.class), null, this.f156442y);
        }
    }

    /* JADX INFO: renamed from: vv2.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.linkworkouts.view.LinkWorkoutScreenKt$LinkWorkoutScreen$1$1", m100430f = "LinkWorkoutScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f156445w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ StrengthTrainerDestination.C10744g.a f156446x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f156447y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StrengthTrainerDestination.C10744g.a aVar, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f156446x = aVar;
            this.f156447y = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f156446x, this.f156447y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f156445w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC36539e.m117135z(this.f156447y).m111943n(new InterfaceC35284a.b(this.f156446x.getLinkActivityId()));
            AbstractC36539e.m117135z(this.f156447y).m111943n(InterfaceC35284a.d.f150214a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vv2.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.linkworkouts.view.LinkWorkoutScreenKt$LinkWorkoutScreen$2$1", m100430f = "LinkWorkoutScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lbc3/c0;", "Landroidx/lifecycle/x;", "it", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;Landroidx/lifecycle/x;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f156448w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ StrengthTrainerDestination.C10744g.a f156449x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14515a f156450y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f156451z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StrengthTrainerDestination.C10744g.a aVar, InterfaceC14515a interfaceC14515a, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f156449x = aVar;
            this.f156450y = interfaceC14515a;
            this.f156451z = interfaceC23462h;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, AbstractC1638x abstractC1638x, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return new c(this.f156449x, this.f156450y, this.f156451z, interfaceC30057d).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f156448w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC36539e.m117135z(this.f156451z).m111943n(new InterfaceC35284a.h(this.f156449x.getLinkActivityId()));
            AbstractC12378b.m34740j(this.f156450y, this.f156449x.getSource());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vv2.e$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C39282o f156452w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f156453x;

        public d(C39282o c39282o, Function1 function1) {
            this.f156452w = c39282o;
            this.f156453x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m117137a() {
            Object event = this.f156452w.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
            InterfaceC35284a interfaceC35284a = event instanceof InterfaceC35284a ? (InterfaceC35284a) event : null;
            if (interfaceC35284a != null) {
                this.f156453x.invoke(interfaceC35284a);
            }
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m117137a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vv2.e$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f156454w = new e();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C39282o c39282o) {
            return null;
        }
    }

    /* JADX INFO: renamed from: vv2.e$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f156455w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f156456x;

        public f(Function1 function1, List list) {
            this.f156455w = function1;
            this.f156456x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m117139a(int i13) {
            return this.f156455w.invoke(this.f156456x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m117139a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: vv2.e$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC4352n {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f156457w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f156458x;

        public g(List list, Function1 function1) {
            this.f156457w = list;
            this.f156458x = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m117140a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C39282o c39282o = (C39282o) this.f156457w.get(i13);
            c28655q.m87150e0(-1125396815);
            boolean zM87157i = c28655q.m87157i(c39282o) | c28655q.m87153g(this.f156458x);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new d(c39282o, this.f156458x);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC39281n.m125207c(null, c39282o, (InterfaceC4339a) objM87133R, c28655q, C39282o.f168987q << 3, 1);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m117140a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C35286c.b bVarM111955b;
        TextResource.C8691e c8691e = new TextResource.C8691e("LINK WORKOUT");
        TextResource.C8691e c8691e2 = new TextResource.C8691e("Link a workout to calculate your Muscular Load");
        TextResource.C8691e c8691e3 = new TextResource.C8691e("Link your recent activity to an existing workout, or create a new workout from scratch to unlock Muscular Load. Ensure you input each exercise in the order that it occurred.");
        AbstractC3992b0.c cVar = AbstractC3992b0.c.f16257g;
        C3985a0 c3985a0 = new C3985a0(null, cVar, new TextResource.C8691e("NEW WORKOUT"), false, 0, null, null, 121, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        C39282o c39282o = new C39282o(new InterfaceC35284a.f(10L, new TextResource.C8691e("PUSH DAY")), new TextResource.C8691e("PUSH DAY"), objArr4, false, false, new AbstractC39279l.b(new TextResource.C8691e("Yesterday"), objArr2, objArr3, null, objArr, null, null, null, null, null, null, false, 4094, null), false, objArr6, objArr7, objArr8, false, objArr9, null, null, objArr5, 32732, null);
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        C39282o c39282o2 = new C39282o(new InterfaceC35284a.f(11L, new TextResource.C8691e("MORNING ROUTINE")), new TextResource.C8691e("MORNING ROUTINE"), objArr20, false, false, new AbstractC39279l.b(objArr10, null, null, null, null, objArr11, objArr12, objArr13, null, objArr14, objArr15, false, 4095, null), false, objArr16, objArr17, objArr21, false, objArr18, null, null, objArr19, 32732, null);
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        C39282o c39282o3 = new C39282o(new InterfaceC35284a.f(12L, new TextResource.C8691e("UPPER BODY")), new TextResource.C8691e("UPPER BODY"), objArr32, false, false, new AbstractC39279l.b(objArr25, null, null, null, null, objArr22, objArr23, objArr26, null, objArr24, objArr27, false, 4095, null), false, objArr28, objArr29, objArr33, false, objArr30, null, null, objArr31, 32732, null);
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        C39282o c39282o4 = new C39282o(new InterfaceC35284a.f(13L, new TextResource.C8691e("PULL DAY")), new TextResource.C8691e("PULL DAY"), objArr44, false, false, new AbstractC39279l.b(objArr37, null, null, null, null, objArr34, objArr35, objArr38, null, objArr36, objArr39, false, 4095, null), false, objArr40, objArr41, objArr45, false, objArr42, null, null, objArr43, 32732, null);
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        Object[] objArr55 = 0 == true ? 1 : 0;
        Object[] objArr56 = 0 == true ? 1 : 0;
        Object[] objArr57 = 0 == true ? 1 : 0;
        InterfaceC39332e interfaceC39332e = null;
        Object[] objArr58 = 0 == true ? 1 : 0;
        Object[] objArr59 = 0 == true ? 1 : 0;
        Object[] objArr60 = 0 == true ? 1 : 0;
        Object[] objArr61 = 0 == true ? 1 : 0;
        Object[] objArr62 = 0 == true ? 1 : 0;
        Object[] objArr63 = 0 == true ? 1 : 0;
        Object[] objArr64 = 0 == true ? 1 : 0;
        Object[] objArr65 = 0 == true ? 1 : 0;
        Object[] objArr66 = 0 == true ? 1 : 0;
        Object[] objArr67 = 0 == true ? 1 : 0;
        Object[] objArr68 = 0 == true ? 1 : 0;
        C13404j c13404j = null;
        InterfaceC25312u interfaceC25312u = null;
        InterfaceC25312u interfaceC25312u2 = null;
        InterfaceC25312u interfaceC25312u3 = null;
        boolean z4 = false;
        C35286c.b bVar = new C35286c.b(c8691e, c8691e2, c8691e3, c13404j, interfaceC25312u, c3985a0, interfaceC25312u2, interfaceC25312u3, AbstractC37056f.m118959K(c39282o, c39282o2, c39282o3, c39282o4, new C39282o(new InterfaceC35284a.f(14L, new TextResource.C8691e("FULL BODY")), new TextResource.C8691e("FULL BODY"), objArr56, false, false, new AbstractC39279l.b(objArr49, null, null, null, null, objArr46, objArr47, objArr50, null, objArr48, objArr51, false, 4095, null), false, objArr52, objArr53, objArr57, false, objArr54, null, null, objArr55, 32732, null), new C39282o(new InterfaceC35284a.f(15L, new TextResource.C8691e("LEG DAY")), new TextResource.C8691e("LEG DAY"), interfaceC39332e, false, false, new AbstractC39279l.b(objArr61, interfaceC39332e, null, null, null, objArr58, objArr59, objArr62, null, objArr60, objArr63, false, 4095, null), false, objArr64, objArr65, objArr68, false, objArr66, null, null, objArr67, 32732, null)), z4, 728, null);
        Object[] objArr69 = 0;
        Object[] objArr70 = 0;
        Object[] objArr71 = 0;
        Object[] objArr72 = 0;
        Object[] objArr73 = 0;
        Object[] objArr74 = 0;
        Object[] objArr75 = 0;
        Object[] objArr76 = 0;
        int i13 = 1;
        C35286c c35286c = new C35286c(null, bVar, i13, 0 == true ? 1 : 0);
        f156434a = c35286c;
        C35286c.b content = c35286c.getContent();
        if (content != null) {
            String str = null;
            String str2 = null;
            boolean z13 = false;
            C21173v0 c21173v0 = null;
            bVarM111955b = C35286c.b.m111955b(content, null, null, null, AbstractC13396b.m37823a(), new C32048d(new TextResource.C8691e("Just list your exercises with sets and reps in the order performed and AI does the rest."), new TextResource.C8691e("TRY IT OUT"), EnumC16313m0.ARROW_FORWARD, "TRY IT OUT", new C9598e(AppScreen.C9345k1.f27714w, new CoachScreenModel("CHAT_WITH_AGENT", (String) (0 == true ? 1 : 0), "ai-strength-trainer-auto-link-2a09a5d6-69c0-4ad2-bc9c-6d3dff58c742", (Integer) (0 == true ? 1 : 0), str, str2, false, "ai-strength-trainer-auto-link", AbstractC25247g0.m73989X(new C23465k("activity_id", AbstractC0770m.m1841c("2a09a5d6-69c0-4ad2-bc9c-6d3dff58c742"))), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), z13, 14360, (DefaultConstructorMarker) (0 == true ? 1 : 0)), c21173v0, 4, null), new TextResource.C8691e("Log Automatically with AI"), EnumC32047c.COACH_GRADIENT), null, new C27256h(new TextResource.C8691e("LOG MANUALLY"), null, null, null, str, str2, EnumC27272p.DEFAULT, null, null, null, null, null, null, z13, false, null, false, false, null, null, null, null, null, null, null, 33554366, null), new C17736e(null, null, new TextResource.C8691e("My Workouts"), 3, null), null, true, 263, null);
        } else {
            bVarM111955b = null;
        }
        f156435b = C35286c.m111944b(c35286c, null, bVarM111955b, 1, null);
        Object[] objArr77 = 0 == true ? 1 : 0;
        Object[] objArr78 = 0 == true ? 1 : 0;
        Object[] objArr79 = 0 == true ? 1 : 0;
        f156436c = new C35286c(objArr76 == true ? 1 : 0, new C35286c.b(new TextResource.C8691e("LINK WORKOUT"), new TextResource.C8691e("Link a workout to calculate your Muscular Load"), new TextResource.C8691e("Link your recent activity to an existing workout, or create a new workout from scratch to unlock Muscular Load. Ensure you input each exercise in the order that it occurred."), objArr78, objArr79, new C3985a0(null, cVar, new TextResource.C8691e("NEW WORKOUT"), false, 0, null, null, 121, null), objArr77, null, null, false, 984, null), i13, objArr75 == true ? 1 : 0);
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z14 = false;
        int i14 = 2;
        f156437d = new C35286c(new C35286c.a(AbstractC33208p0.c.f138471e, null, null, null, null, null, z14, 126, defaultConstructorMarker), objArr74 == true ? 1 : 0, i14, objArr73 == true ? 1 : 0);
        AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35473h1), false, 0 == true ? 1 : 0, 6, 0 == true ? 1 : 0);
        TextResource.C8688b c8688bM21277k = AbstractC8693b.m21277k(AbstractC11128h.f35409N);
        InterfaceC35284a.a aVar = InterfaceC35284a.a.f150210a;
        f156438e = new C35286c(new C35286c.a(bVar2, null, c8688bM21277k, aVar, null, 0 == true ? 1 : 0, z14, 114, defaultConstructorMarker), objArr72 == true ? 1 : 0, i14, objArr71 == true ? 1 : 0);
        boolean z15 = false;
        Object[] objArr80 = 0 == true ? 1 : 0;
        f156439f = new C35286c(new C35286c.a(new AbstractC33208p0.b(AbstractC8693b.m21277k(AbstractC11128h.f35506s1), z15, null, 6, null), objArr80, AbstractC8693b.m21277k(AbstractC11128h.f35409N), aVar, null, null, z15, 114, null), objArr70 == true ? 1 : 0, i14, objArr69 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: A */
    private static final C35286c m117091A(InterfaceC28670t2 interfaceC28670t2) {
        return (C35286c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m117092B(C36535a c36535a) {
        c36535a.m117090b(InterfaceC35284a.a.f150210a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m117093C(C36535a c36535a, InterfaceC23462h interfaceC23462h, InterfaceC35284a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC35284a.i) {
            m117135z(interfaceC23462h).m111943n((InterfaceC35284a.i) event);
        } else {
            if (!(event instanceof InterfaceC35284a.g)) {
                throw new NoWhenBranchMatchedException();
            }
            c36535a.m117090b((InterfaceC35284a.g) event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m117094D(StrengthTrainerDestination.C10744g.a aVar, InterfaceC14515a interfaceC14515a, C36535a c36535a, int i13, Composer composer, int i14) {
        m117133x(aVar, interfaceC14515a, c36535a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final Modifier m117095E(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return m117108R(applyIf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m117096F(Function1 function1) {
        function1.invoke(InterfaceC35284a.a.f150210a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m117097G(C35286c.b bVar, Function1 function1, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC25312u aiChatCallout = bVar.getAiChatCallout();
        if (aiChatCallout != null) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C26299f(aiChatCallout, function1, 3), true, 674559987), 3);
        }
        C3985a0 addTile = bVar.getAddTile();
        if (addTile != null) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C36538d(0, addTile, function1), true, -1991458521), 3);
        }
        InterfaceC25312u builderCta = bVar.getBuilderCta();
        if (builderCta != null) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C26299f(builderCta, function1, 2), true, -750932437), 3);
        }
        InterfaceC25312u divider = bVar.getDivider();
        if (divider != null) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C13258u(4, divider), true, -1338324180), 3);
        }
        List<C39282o> listM111964j = bVar.m111964j();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM111964j.size(), null, new f(e.f156454w, listM111964j), new C37816b(new g(listM111964j, function1), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m117098H(InterfaceC25312u interfaceC25312u, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C35657b0(function1, 12);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, null, (Function1) objM87133R, c28655q, 0, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m117099I(Function1 function1, Object event) {
        C9598e c9598eM99591c;
        AbstractC22676k.m65750j(event, "event");
        C32048d c32048d = event instanceof C32048d ? (C32048d) event : null;
        if (c32048d != null && (c9598eM99591c = c32048d.getDestination()) != null) {
            function1.invoke(new InterfaceC35284a.c(c9598eM99591c));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m117100J(C3985a0 c3985a0, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C34904e(function1, 28);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC4158z.m12975d(c3985a0, null, null, null, (InterfaceC4339a) objM87133R, c28655q, C3985a0.f16213h, 14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m117101K(Function1 function1) {
        function1.invoke(InterfaceC35284a.e.f150215a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m117102L(InterfaceC25312u interfaceC25312u, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C30745a c30745a = new C30745a(29);
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C35657b0(function1, 11);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, null, c30745a, (Function1) objM87133R, c28655q, 0, 2);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final Modifier m117103M(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1746221893);
        Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 1 * 8, 7);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m117104N(Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C27256h) {
            function1.invoke(InterfaceC35284a.e.f150215a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m117105O(InterfaceC25312u interfaceC25312u, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC25303l.m74291r(interfaceC25312u, null, null, null, c28655q, 0, 14);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m117106P(C35286c c35286c, Function1 function1, int i13, Composer composer, int i14) {
        m117134y(c35286c, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: R */
    private static final Modifier m117108R(Modifier modifier) {
        return AbstractC1125a.m3478a(modifier, new C36478d(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m117109S(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        InterfaceC22131e.m63385u(drawBehind, C17909s.m51489g(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(4286544383L)), new C17919x(AbstractC17918w0.m51517e(2153366526L)), new C17919x(C17919x.f69636m)), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), Float.intBitsToFloat((int) (drawBehind.mo731d() >> 32)), 8), 0L, 0L, 0.3f, null, 0, 118);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m117129t(final C35286c.a aVar, final Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1340626944);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(aVar) : c28655q.m87157i(aVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            int i15 = i14;
            AbstractC33208p0 type = aVar.getType();
            TextResource supportText = aVar.getSupportText();
            TextResource primaryButtonText = aVar.getPrimaryButtonText();
            TextResource secondaryButtonText = aVar.getSecondaryButtonText();
            boolean showSecondaryButton = aVar.getShowSecondaryButton();
            int i16 = i15 & 112;
            boolean zM87157i = c28655q.m87157i(aVar) | (i16 == 32);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                final int i17 = 0;
                objM87133R = new InterfaceC4339a() { // from class: vv2.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                return AbstractC36539e.m117130u(aVar, function1);
                            default:
                                return AbstractC36539e.m117131v(aVar, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(aVar) | (i16 == 32);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i18 = 1;
                objM87133R2 = new InterfaceC4339a() { // from class: vv2.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i18) {
                            case 0:
                                return AbstractC36539e.m117130u(aVar, function1);
                            default:
                                return AbstractC36539e.m117131v(aVar, function1);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            int i19 = AbstractC33208p0.f138461d;
            int i24 = TextResource.$stable;
            AbstractC33199m0.m105214F(type, supportText, null, primaryButtonText, interfaceC4339a, showSecondaryButton, false, secondaryButtonText, interfaceC4339a2, null, false, false, c28655q, i19 | (i24 << 3) | (i24 << 9) | (i24 << 21), 0, 3652);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(aVar, function1, i13, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m117130u(C35286c.a aVar, Function1 function1) {
        InterfaceC35284a primaryClickEvent = aVar.getPrimaryClickEvent();
        if (primaryClickEvent != null) {
            function1.invoke(primaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m117131v(C35286c.a aVar, Function1 function1) {
        InterfaceC35284a secondaryClickEvent = aVar.getSecondaryClickEvent();
        if (secondaryClickEvent != null) {
            function1.invoke(secondaryClickEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m117132w(C35286c.a aVar, Function1 function1, int i13, Composer composer, int i14) {
        m117129t(aVar, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: x */
    public static final void m117133x(StrengthTrainerDestination.C10744g.a navArgs, InterfaceC14515a analytics, C36535a navRouter, Composer composer, int i13) {
        int i14;
        Object obj;
        AbstractC22676k.m65750j(navArgs, "navArgs");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(navRouter, "navRouter");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1340951345);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(navArgs) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(analytics) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(navRouter) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            c28655q.m87152f0(-1688186518);
            C26669a c26669a = C29155a.f118017b;
            if (c26669a == null) {
                throw new IllegalStateException("KoinApplication has not been started");
            }
            C38266c c38266c = c26669a.f106046a.f159364d;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q, -1688186210, c28655q, false, -3686552);
            C35286c.b bVar = null;
            boolean z4 = false;
            boolean zM87153g = c28655q.m87153g(null) | c28655q.m87153g(null);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v0) {
                obj = objM87133R;
                InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null, c21647aM114690r));
                c28655q.m87172p0(interfaceC23462hM92087G);
                obj = interfaceC23462hM92087G;
            }
            c28655q.m87173q(false);
            InterfaceC23462h interfaceC23462h = (InterfaceC23462h) obj;
            c28655q.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m117135z(interfaceC23462h).getViewState(), new C35286c(new C35286c.a(AbstractC33208p0.c.f138471e, null, null, null, null, null, false, 126, null), bVar, i15, z4 ? 1 : 0), null, c28655q, 0, 2);
            C35285b c35285bM117135z = m117135z(interfaceC23462h);
            int i16 = i14 & 14;
            boolean zM87157i = c28655q.m87157i(interfaceC23462h) | (i16 == 4);
            Object objM87133R2 = c28655q.m87133R();
            Object obj2 = objM87133R2;
            if (zM87157i || objM87133R2 == c28676v0) {
                b bVar2 = new b(navArgs, interfaceC23462h, null);
                c28655q.m87172p0(bVar2);
                obj2 = bVar2;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) obj2, c35285bM117135z);
            EnumC1632v enumC1632v = EnumC1632v.ON_CREATE;
            boolean zM87157i2 = (i16 == 4) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(analytics);
            Object objM87133R3 = c28655q.m87133R();
            Object obj3 = objM87133R3;
            if (zM87157i2 || objM87133R3 == c28676v0) {
                c cVar = new c(navArgs, analytics, interfaceC23462h, null);
                c28655q.m87172p0(cVar);
                obj3 = cVar;
            }
            AbstractC22392e.m64443d(enumC1632v, (Function3) obj3, c28655q, 6);
            boolean zM87157i3 = c28655q.m87157i(navRouter);
            Object objM87133R4 = c28655q.m87133R();
            Object obj4 = objM87133R4;
            if (zM87157i3 || objM87133R4 == c28676v0) {
                C36532c c36532c = new C36532c(navRouter, 1);
                c28655q.m87172p0(c36532c);
                obj4 = c36532c;
            }
            AbstractC20301a.m56332c((InterfaceC4339a) obj4, false, c28655q, 0, 1);
            C35286c c35286cM117091A = m117091A(interfaceC28601c1M87260n);
            boolean zM87157i4 = c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(navRouter);
            Object objM87133R5 = c28655q.m87133R();
            Object obj5 = objM87133R5;
            if (zM87157i4 || objM87133R5 == c28676v0) {
                C35076b c35076b = new C35076b(14, navRouter, interfaceC23462h);
                c28655q.m87172p0(c35076b);
                obj5 = c35076b;
            }
            m117134y(c35286cM117091A, (Function1) obj5, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C36537c(navArgs, analytics, navRouter, i13, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
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
    /* JADX INFO: renamed from: y */
    private static final void m117134y(C35286c c35286c, Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C28655q c28655q;
        boolean z4;
        ?? r14;
        C2314t c2314t;
        C28655q c28655q2;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1047401738);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q3.m87157i(c35286c) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q3.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q3.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2));
            C35286c.b content = c35286c.getContent();
            boolean z13 = content != null && content.getUseGradientBackground();
            Object objM87133R = c28655q3.m87133R();
            int i16 = 3;
            Object obj = C28635l.f115821a;
            if (objM87133R == obj) {
                objM87133R = new C36478d(i16);
                c28655q3.m87172p0(objM87133R);
            }
            Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM44028b0, z13, (Function1) objM87133R);
            C35286c.b content2 = c35286c.getContent();
            C13404j screenContextMetadata = content2 != null ? content2.getScreenContextMetadata() : null;
            int i17 = C13404j.f46947x;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC12250f.m34129b(modifierM44099b, screenContextMetadata, false, c28655q3, i17 << 3, 2));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM66724m);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N);
            if (c35286c.getContent() != null) {
                c28655q3.m87150e0(2142963712);
                C35286c.b content3 = c35286c.getContent();
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                int iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, c2314t2);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N2);
                float f13 = 8;
                float f14 = 1 * f13;
                Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t2, 0.0f, 0.0f, 0.0f, f14, 7);
                AbstractC6721d.a aVar = new AbstractC6721d.a(content3.getTitle(), null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), AbstractC30060g.m92103Y(c28655q3, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                int i18 = i15 & 112;
                boolean z14 = i18 == 32;
                Object objM87133R2 = c28655q3.m87133R();
                if (z14 || objM87133R2 == obj) {
                    objM87133R2 = new C34904e(function1, 29);
                    c28655q3.m87172p0(objM87133R2);
                }
                AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R2, null, null, c28655q3, (AbstractC6721d.a.f25641r << 3) | 6, 52);
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t2, ((float) 2.5d) * f13, 0.0f, 2);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, 0);
                int iHashCode3 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3396r);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(interfaceC4339a);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q3, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, modifierM118962N3);
                TextResource headline = content3.getHeadline();
                int i19 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(headline, c28655q3, i19);
                C38072d c38072d = C38072d.f163053a;
                int i24 = C38072d.f163054b;
                long jM125430y = c38072d.m121949b(c28655q3, i24).getBrandWhite();
                C2886a c2886aM8418P = c38072d.m121952e(c28655q3, i24).getT3();
                int i25 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q3, 0, i25, 196602);
                c2314t = c2314t2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(content3.getSubtext(), c28655q3, i19), AbstractC1099a.m3398t(c2314t2, 0.0f, f14, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q3, i24).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i24).getB2(), null, c28655q3, 48, i25, 196600);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                z4 = true;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, 32, 0.0f, 0.0f, 13);
                C13404j screenContextMetadata2 = content3.getScreenContextMetadata();
                WeakHashMap weakHashMap = C22944c2.f90553v;
                InterfaceC22973k1 interfaceC22973k1M34113f = AbstractC12248d.m34113f(screenContextMetadata2, AbstractC1099a.m3381c(0.0f, 0.0f, 0.0f, (4 * f13) + AbstractC22953f.m66717e(C22949e.m66712e(c28655q3).f90558e, c28655q3).mo43109a(), 7), false, c28655q3, i17, 4);
                C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 1.5d) * f13);
                boolean zM87157i = (i18 == 32) | c28655q3.m87157i(content3);
                Object objM87133R3 = c28655q3.m87133R();
                if (zM87157i || objM87133R3 == obj) {
                    function2 = function1;
                    objM87133R3 = new C35076b(15, content3, function2);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    function2 = function1;
                }
                AbstractC22674j.m65717c(modifierM3398t2, null, interfaceC22973k1M34113f, c22971kM66746i, null, null, false, null, (Function1) objM87133R3, c28655q3, 24576, 490);
                C28655q c28655q4 = c28655q3;
                r14 = 0;
                AbstractC25012a.m73392y(c28655q4, true, true, false);
                c28655q2 = c28655q4;
            } else {
                function2 = function1;
                z4 = true;
                r14 = 0;
                c2314t = c2314t2;
                c28655q3.m87150e0(2147163282);
                c28655q3.m87173q(false);
                c28655q2 = c28655q3;
            }
            C35286c.b content4 = c35286c.getContent();
            if ((content4 != null ? content4.getScreenContextMetadata() : null) != null) {
                c28655q2.m87150e0(2147229622);
                AbstractC13644a.m38442b(C1100b.f4583a.mo3400a(c2314t, C2299e.f9105H), c28655q2, r14, r14);
                c28655q2.m87173q(r14);
            } else {
                c28655q2.m87150e0(2147348786);
                c28655q2.m87173q(r14);
            }
            if (c35286c.getFullScreenModal() != null) {
                c28655q2.m87150e0(2147399595);
                m117129t(c35286c.getFullScreenModal(), function2, c28655q2, i15 & 112);
                c28655q2.m87173q(r14);
            } else {
                c28655q2.m87150e0(-2147468718);
                c28655q2.m87173q(r14);
            }
            c28655q2.m87173q(z4);
            c28655q = c28655q2;
        } else {
            function2 = function1;
            c28655q3.m87138X();
            c28655q = c28655q3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35813e(c35286c, function2, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C35285b m117135z(InterfaceC23462h interfaceC23462h) {
        return (C35285b) interfaceC23462h.getValue();
    }
}
