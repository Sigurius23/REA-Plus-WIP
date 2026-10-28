package yt2;

import a81.C0563n;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.profile.view.edit.C9785i;
import dp0.AbstractC12248d;
import dp0.AbstractC12250f;
import e11.C12584d;
import ep0.C13404j;
import f41.C14063a;
import gb1.AbstractC15673b0;
import id2.C18434s;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import java.util.List;
import kotlin.C2028s;
import ks2.AbstractC22822a;
import l83.C23454a0;
import ls2.AbstractC24716a;
import no.nordicsemi.android.dfu.DfuBaseService;
import nw0.C27198e;
import ny0.AbstractC27274q;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15108p2;
import p163g1.C15136s0;
import p163g1.C15199y3;
import p163g1.EnumC15146t0;
import p163g1.EnumC15209z3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.InterfaceC22973k1;
import p291l0.InterfaceC23013y;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p579wc.C37082e1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p634y1.AbstractC39038k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p730qt2.AbstractC30593b;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import re1.C31324k;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uu2.C35269t;
import uv0.AbstractC35283c;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35658c;
import v41.C35666g;
import vt2.AbstractC36498g;
import wb3.AbstractC37056f;
import wt2.AbstractC37625f;
import wt2.AbstractC37634o;
import wt2.AbstractC37636q;
import wt2.C37631l;
import wt2.C37633n;
import wt2.EnumC37624e;
import x81.C38072d;
import y71.C39274g;
import yb0.AbstractC39383f;
import yk2.C39611k;
import yo0.C39681c;
import yo1.C39689b;
import zt2.AbstractC41140i;
import zt2.AbstractC41141j;
import zt2.C41139h;

/* JADX INFO: renamed from: yt2.m */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008d\u0001\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0089\u0001\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001e²\u0006\u000e\u0010\u0018\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lwt2/q;", "viewState", "", "scrollId", "", "isWrapped", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "Lvt2/g;", "onNavigationEvent", "Lls2/a;", "analyticsEvent", "navigateToPresets", "presetsCallback", "y", "(Lwt2/q;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lwt2/q$c;", "presetCallback", "I", "(Lwt2/q$c;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Landroidx/compose/runtime/Composer;I)V", "hasSummaryDisplayed", "showPresetLanding", "Lf41/a;", "bottomSheetInfo", "Lv41/g;", "bottomSheetTopBar", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39782m {

    /* JADX INFO: renamed from: yt2.m$a */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.view.WeeklyPlanScreenKt$WeeklyPlanSuccessScreen$5$1$1", m100430f = "WeeklyPlanScreen.kt", m100431l = {143}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171349w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC35664f.a f171350x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC35664f.a aVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171350x = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f171350x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171349w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3M112950a = this.f171350x.getModalBottomSheetState();
                this.f171349w = 1;
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

    /* JADX INFO: renamed from: yt2.m$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f171351E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC2994c0 f171352w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f171353x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC35664f.a f171354y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f171355z;

        /* JADX INFO: renamed from: yt2.m$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.view.WeeklyPlanScreenKt$WeeklyPlanSuccessScreen$7$1$1$2$1$2$1$1$1$1", m100430f = "WeeklyPlanScreen.kt", m100431l = {240}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC28601c1 f171356E;

            /* JADX INFO: renamed from: w */
            int f171357w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Object f171358x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AbstractC35664f.a f171359y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f171360z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f171358x = obj;
                this.f171359y = aVar;
                this.f171360z = interfaceC28601c1;
                this.f171356E = interfaceC28601c2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f171358x, this.f171359y, this.f171360z, this.f171356E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f171357w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC39782m.m127437M(this.f171360z, new C35666g(((C14063a) this.f171358x).getBottomSheetTitle(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), null, 2, 0 == true ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    AbstractC39782m.m127456c0(this.f171356E, (C14063a) this.f171358x);
                    C15199y3 c15199y3M112950a = this.f171359y.getModalBottomSheetState();
                    this.f171357w = 1;
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

        public b(InterfaceC2994c0 interfaceC2994c0, Function1 function1, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f171352w = interfaceC2994c0;
            this.f171353x = function1;
            this.f171354y = aVar;
            this.f171355z = interfaceC28601c1;
            this.f171351E = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m127483a(Object event) {
            AbstractC22676k.m65750j(event, "event");
            if (event instanceof C14063a) {
                AbstractC3006f0.m8732z(this.f171352w, null, null, new a(event, this.f171354y, this.f171355z, this.f171351E, null), 3);
            } else {
                this.f171353x.invoke(event);
            }
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m127483a(obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yt2.m$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f171361w;

        public c(Function1 function1) {
            this.f171361w = function1;
        }

        /* JADX INFO: renamed from: a */
        public final void m127484a() {
            this.f171361w.invoke(AbstractC36498g.e.f155929a);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m127484a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yt2.m$d */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.view.WeeklyPlanScreenKt$WeeklyPlanSuccessScreen$8$1$1", m100430f = "WeeklyPlanScreen.kt", m100431l = {263}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171362w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15136s0 f171363x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f171364y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f171365z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C15136s0 c15136s0, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171363x = c15136s0;
            this.f171364y = function1;
            this.f171365z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f171363x, this.f171364y, this.f171365z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f171362w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15136s0 c15136s0 = this.f171363x;
                this.f171362w = 1;
                if (c15136s0.m43185a(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC39782m.m127452a0(this.f171365z, false);
            this.f171364y.invoke(Boolean.FALSE);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yt2.m$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f171366w = new e();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C41139h c41139h) {
            return null;
        }
    }

    /* JADX INFO: renamed from: yt2.m$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f171367w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f171368x;

        public f(Function1 function1, List list) {
            this.f171367w = function1;
            this.f171368x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m127486a(int i13) {
            return this.f171367w.invoke(this.f171368x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m127486a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: yt2.m$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f171369E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Function1 f171370F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f171371G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f171372H;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f171373w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37633n f171374x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2994c0 f171375y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC35664f.a f171376z;

        public g(List list, C37633n c37633n, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
            this.f171373w = list;
            this.f171374x = c37633n;
            this.f171375y = interfaceC2994c0;
            this.f171376z = aVar;
            this.f171369E = function1;
            this.f171370F = function2;
            this.f171371G = interfaceC28601c1;
            this.f171372H = interfaceC28601c2;
        }

        /* JADX INFO: renamed from: a */
        public final void m127487a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C41139h c41139h = (C41139h) this.f171373w.get(i13);
            c28655q.m87150e0(1423756325);
            C41139h c41139hM133575b = C41139h.m133575b(c41139h, null, null, null, null, null, null, null, null, this.f171374x.getCurrentPlan() == null, false, null, null, null, 7935, null);
            boolean zM87157i = c28655q.m87157i(this.f171375y) | c28655q.m87157i(this.f171376z) | c28655q.m87153g(this.f171369E);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                b bVar = new b(this.f171375y, this.f171369E, this.f171376z, this.f171371G, this.f171372H);
                c28655q.m87172p0(bVar);
                objM87133R = bVar;
            }
            Function1 function1 = (Function1) objM87133R;
            boolean zM87153g = c28655q.m87153g(this.f171370F);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new c(this.f171370F);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC41140i.m133596h(c41139hM133575b, null, function1, (InterfaceC4339a) objM87133R2, c28655q, 0, 2);
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m127487a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yt2.m$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f171377a;

        static {
            int[] iArr = new int[EnumC37624e.values().length];
            try {
                iArr[EnumC37624e.JANUARY_JUMPSTART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f171377a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m127425A(AbstractC36498g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m127426B(AbstractC24716a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m127427C(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final InterfaceC28601c1 m127428D() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: E */
    private static final boolean m127429E(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: F */
    private static final void m127430F(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m127431G(Function1 function1, AbstractC37636q abstractC37636q) {
        function1.invoke(new AbstractC37634o.c(((AbstractC37636q.a) abstractC37636q).getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m127432H(AbstractC37636q abstractC37636q, String str, boolean z4, Function1 function1, Function1 function2, Function1 function3, boolean z13, Function1 function4, int i13, int i14, Composer composer, int i15) {
        m127481y(abstractC37636q, str, z4, function1, function2, function3, z13, function4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0123  */
    /* JADX WARN: Code duplicated, block: B:102:0x0129  */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:107:0x013e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0140  */
    /* JADX WARN: Code duplicated, block: B:110:0x0144  */
    /* JADX WARN: Code duplicated, block: B:112:0x014a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0158  */
    /* JADX WARN: Code duplicated, block: B:117:0x0160  */
    /* JADX WARN: Code duplicated, block: B:120:0x0171  */
    /* JADX WARN: Code duplicated, block: B:121:0x0173  */
    /* JADX WARN: Code duplicated, block: B:123:0x0179  */
    /* JADX WARN: Code duplicated, block: B:126:0x0184  */
    /* JADX WARN: Code duplicated, block: B:128:0x0187  */
    /* JADX WARN: Code duplicated, block: B:129:0x018a  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:139:0x0225 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x0227  */
    /* JADX WARN: Code duplicated, block: B:143:0x0299  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:153:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:155:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:158:0x0307  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    /* JADX INFO: renamed from: I */
    private static final void m127433I(AbstractC37636q.c cVar, String str, boolean z4, Function1 function1, Function1 function2, Function1 function3, boolean z13, Function1 function4, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        Function1 function6;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z14;
        Function1 function7;
        boolean z15;
        Function1 function8;
        Function1 function9;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function10;
        Function1 function11;
        Function1 function12;
        boolean z16;
        Function1 function13;
        Object objM87133R;
        Object obj;
        InterfaceC2994c0 interfaceC2994c0;
        Object objM87133R2;
        TextResource textResource;
        Object objM95647w;
        InterfaceC28601c1 interfaceC28601c1;
        C15136s0 c15136s0M43172c;
        Object objM87133R3;
        Object obj2;
        AbstractC35664f.a aVar;
        Object objM87133R4;
        Object obj3;
        boolean zM87157i;
        Object obj4;
        Function1 function14;
        boolean zM87157i2;
        Object objM87133R5;
        Function1 function15;
        boolean z17;
        C37633n c37633nM120954a;
        C9598e c9598eM35272a;
        C12584d c12584dM120931d;
        Object objM87133R6;
        Object obj5;
        Object objM87133R7;
        Object obj6;
        Object objM87133R8;
        Object obj7;
        Object objM87133R9;
        Object obj8;
        boolean z18;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(203510980);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(cVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        int i29 = i14 & 8;
        if (i29 == 0) {
            if ((i13 & 3072) == 0) {
                i15 |= c28655q.m87157i(function1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        function6 = function3;
                        if (c28655q.m87157i(function6)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        if ((1572864 & i13) == 0) {
                            if (c28655q.m87155h(z13)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 128;
                        if (i26 != 0) {
                            i15 |= 12582912;
                        } else if ((i13 & 12582912) == 0) {
                            if (c28655q.m87157i(function4)) {
                                i27 = 8388608;
                            } else {
                                i27 = 4194304;
                            }
                            i15 |= i27;
                        }
                        i28 = i15;
                        if ((i28 & 4793491) != 4793490) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c28655q.m87135U(i28 & 1, z14)) {
                            c28676v0 = C28635l.f115821a;
                            if (i29 != 0) {
                                objM87133R9 = c28655q.m87133R();
                                if (objM87133R9 == c28676v0) {
                                    obj8 = objM87133R9;
                                    C39611k c39611k = new C39611k(24);
                                    c28655q.m87172p0(c39611k);
                                    obj8 = c39611k;
                                }
                                obj8 = objM87133R9;
                                function10 = (Function1) obj8;
                            } else {
                                function10 = function1;
                            }
                            if (i16 != 0) {
                                objM87133R8 = c28655q.m87133R();
                                if (objM87133R8 == c28676v0) {
                                    obj7 = objM87133R8;
                                    C39611k c39611k2 = new C39611k(25);
                                    c28655q.m87172p0(c39611k2);
                                    obj7 = c39611k2;
                                }
                                obj7 = objM87133R8;
                                function11 = (Function1) obj7;
                            } else {
                                function11 = function5;
                            }
                            if (i18 != 0) {
                                objM87133R7 = c28655q.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    obj6 = objM87133R7;
                                    C39611k c39611k3 = new C39611k(26);
                                    c28655q.m87172p0(c39611k3);
                                    obj6 = c39611k3;
                                }
                                obj6 = objM87133R7;
                                function12 = (Function1) obj6;
                            } else {
                                function12 = function6;
                            }
                            if (i24 != 0) {
                                z16 = false;
                            } else {
                                z16 = z13;
                            }
                            if (i26 != 0) {
                                objM87133R6 = c28655q.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    obj5 = objM87133R6;
                                    C39611k c39611k4 = new C39611k(20);
                                    c28655q.m87172p0(c39611k4);
                                    obj5 = c39611k4;
                                }
                                obj5 = objM87133R6;
                                function13 = (Function1) obj5;
                            } else {
                                function13 = function4;
                            }
                            objM87133R = c28655q.m87133R();
                            obj = objM87133R;
                            if (objM87133R == c28676v0) {
                                InterfaceC2994c0 interfaceC2994c0M87262p = AbstractC28683x.m87262p(c28655q);
                                c28655q.m87172p0(interfaceC2994c0M87262p);
                                obj = interfaceC2994c0M87262p;
                            }
                            interfaceC2994c0 = (InterfaceC2994c0) obj;
                            objM87133R2 = c28655q.m87133R();
                            textResource = null;
                            z18 = false;
                            objM95647w = objM87133R2;
                            if (objM87133R2 == c28676v0) {
                                if (z16) {
                                    c37633nM120954a = cVar.getPlan();
                                    if (c37633nM120954a != null || (c12584dM120931d = c37633nM120954a.getCurrentPlan()) == null) {
                                        c9598eM35272a = null;
                                    } else {
                                        c9598eM35272a = c12584dM120931d.getDestination();
                                    }
                                    if (c9598eM35272a != null) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                } else {
                                    z17 = false;
                                }
                                objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                            c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                            objM87133R3 = c28655q.m87133R();
                            obj2 = objM87133R3;
                            if (objM87133R3 == c28676v0) {
                                C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(null);
                                c28655q.m87172p0(c28633k1M87272z);
                                obj2 = c28633k1M87272z;
                            }
                            InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) obj2;
                            boolean z19 = z16;
                            aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                            objM87133R4 = c28655q.m87133R();
                            obj3 = objM87133R4;
                            if (objM87133R4 == c28676v0) {
                                C28633k1 c28633k1M87272z2 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                                c28655q.m87172p0(c28633k1M87272z2);
                                obj3 = c28633k1M87272z2;
                            }
                            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) obj3;
                            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                            C35666g c35666gM127436L = m127436L(interfaceC28601c3);
                            AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
                            zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                            Object objM87133R10 = c28655q.m87133R();
                            obj4 = objM87133R10;
                            if (zM87157i || objM87133R10 == c28676v0) {
                                C2028s c2028s = new C2028s(interfaceC2994c0, aVar, 8);
                                c28655q.m87172p0(c2028s);
                                obj4 = c2028s;
                            }
                            C37816b c37816bM121344e = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c2, 1));
                            C35269t c35269t = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c3, interfaceC28601c2);
                            function14 = function11;
                            Function1 function16 = function12;
                            function7 = function10;
                            AbstractC35660d.m112871m(modifierM3407d, c35666gM127436L, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e, false, bVar, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                            if (m127450Z(interfaceC28601c1)) {
                                m127452a0(interfaceC28601c1, false);
                                function13.invoke(Boolean.FALSE);
                                function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                            }
                            boolean zM127450Z = m127450Z(interfaceC28601c1);
                            zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                            objM87133R5 = c28655q.m87133R();
                            if (!zM87157i2 || objM87133R5 == c28676v0) {
                                function15 = function13;
                                objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                                c28655q.m87172p0(objM87133R5);
                            } else {
                                function15 = function13;
                            }
                            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z, c28655q, 0, 0);
                            z15 = z19;
                            function5 = function14;
                            function8 = function16;
                            function9 = function15;
                        } else {
                            c28655q.m87138X();
                            function7 = function1;
                            z15 = z13;
                            function8 = function6;
                            function9 = function4;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
                        }
                    }
                    i15 |= 1572864;
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q.m87157i(function4)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    i28 = i15;
                    if ((i28 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z14)) {
                        c28676v0 = C28635l.f115821a;
                        if (i29 != 0) {
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                obj8 = objM87133R9;
                                C39611k c39611k5 = new C39611k(24);
                                c28655q.m87172p0(c39611k5);
                                obj8 = c39611k5;
                            }
                            obj8 = objM87133R9;
                            function10 = (Function1) obj8;
                        } else {
                            function10 = function1;
                        }
                        if (i16 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                obj7 = objM87133R8;
                                C39611k c39611k6 = new C39611k(25);
                                c28655q.m87172p0(c39611k6);
                                obj7 = c39611k6;
                            }
                            obj7 = objM87133R8;
                            function11 = (Function1) obj7;
                        } else {
                            function11 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                obj6 = objM87133R7;
                                C39611k c39611k7 = new C39611k(26);
                                c28655q.m87172p0(c39611k7);
                                obj6 = c39611k7;
                            }
                            obj6 = objM87133R7;
                            function12 = (Function1) obj6;
                        } else {
                            function12 = function6;
                        }
                        if (i24 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (i26 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                obj5 = objM87133R6;
                                C39611k c39611k8 = new C39611k(20);
                                c28655q.m87172p0(c39611k8);
                                obj5 = c39611k8;
                            }
                            obj5 = objM87133R6;
                            function13 = (Function1) obj5;
                        } else {
                            function13 = function4;
                        }
                        objM87133R = c28655q.m87133R();
                        obj = objM87133R;
                        if (objM87133R == c28676v0) {
                            InterfaceC2994c0 interfaceC2994c0M87262p2 = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(interfaceC2994c0M87262p2);
                            obj = interfaceC2994c0M87262p2;
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) obj;
                        objM87133R2 = c28655q.m87133R();
                        textResource = null;
                        z18 = false;
                        objM95647w = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            if (z16) {
                                z17 = false;
                            } else {
                                c37633nM120954a = cVar.getPlan();
                                if (c37633nM120954a != null) {
                                    c9598eM35272a = null;
                                } else {
                                    c9598eM35272a = null;
                                }
                                if (c9598eM35272a != null) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            }
                            objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                        c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                        objM87133R3 = c28655q.m87133R();
                        obj2 = objM87133R3;
                        if (objM87133R3 == c28676v0) {
                            C28633k1 c28633k1M87272z3 = AbstractC28683x.m87272z(null);
                            c28655q.m87172p0(c28633k1M87272z3);
                            obj2 = c28633k1M87272z3;
                        }
                        InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) obj2;
                        boolean z110 = z16;
                        aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                        objM87133R4 = c28655q.m87133R();
                        obj3 = objM87133R4;
                        if (objM87133R4 == c28676v0) {
                            C28633k1 c28633k1M87272z4 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                            c28655q.m87172p0(c28633k1M87272z4);
                            obj3 = c28633k1M87272z4;
                        }
                        InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) obj3;
                        Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                        C35666g c35666gM127436L2 = m127436L(interfaceC28601c5);
                        AbstractC27274q.b bVar2 = AbstractC27274q.b.f109138f;
                        zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                        Object objM87133R11 = c28655q.m87133R();
                        obj4 = objM87133R11;
                        if (zM87157i) {
                            C2028s c2028s2 = new C2028s(interfaceC2994c0, aVar, 8);
                            c28655q.m87172p0(c2028s2);
                            obj4 = c2028s2;
                        } else {
                            C2028s c2028s3 = new C2028s(interfaceC2994c0, aVar, 8);
                            c28655q.m87172p0(c2028s3);
                            obj4 = c2028s3;
                        }
                        C37816b c37816bM121344e2 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c4, 1));
                        C35269t c35269t2 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c5, interfaceC28601c4);
                        function14 = function11;
                        Function1 function17 = function12;
                        function7 = function10;
                        AbstractC35660d.m112871m(modifierM3407d2, c35666gM127436L2, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e2, false, bVar2, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t2), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                        if (m127450Z(interfaceC28601c1)) {
                            m127452a0(interfaceC28601c1, false);
                            function13.invoke(Boolean.FALSE);
                            function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                        }
                        boolean zM127450Z2 = m127450Z(interfaceC28601c1);
                        zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i2) {
                            function15 = function13;
                            objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            function15 = function13;
                            objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z2, c28655q, 0, 0);
                        z15 = z110;
                        function5 = function14;
                        function8 = function17;
                        function9 = function15;
                    } else {
                        c28655q.m87138X();
                        function7 = function1;
                        z15 = z13;
                        function8 = function6;
                        function9 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function6 = function3;
                i24 = i14 & 64;
                if (i24 != 0) {
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87155h(z13)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q.m87157i(function4)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    i28 = i15;
                    if ((i28 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z14)) {
                        c28676v0 = C28635l.f115821a;
                        if (i29 != 0) {
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                obj8 = objM87133R9;
                                C39611k c39611k9 = new C39611k(24);
                                c28655q.m87172p0(c39611k9);
                                obj8 = c39611k9;
                            }
                            obj8 = objM87133R9;
                            function10 = (Function1) obj8;
                        } else {
                            function10 = function1;
                        }
                        if (i16 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                obj7 = objM87133R8;
                                C39611k c39611k10 = new C39611k(25);
                                c28655q.m87172p0(c39611k10);
                                obj7 = c39611k10;
                            }
                            obj7 = objM87133R8;
                            function11 = (Function1) obj7;
                        } else {
                            function11 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                obj6 = objM87133R7;
                                C39611k c39611k11 = new C39611k(26);
                                c28655q.m87172p0(c39611k11);
                                obj6 = c39611k11;
                            }
                            obj6 = objM87133R7;
                            function12 = (Function1) obj6;
                        } else {
                            function12 = function6;
                        }
                        if (i24 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (i26 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                obj5 = objM87133R6;
                                C39611k c39611k12 = new C39611k(20);
                                c28655q.m87172p0(c39611k12);
                                obj5 = c39611k12;
                            }
                            obj5 = objM87133R6;
                            function13 = (Function1) obj5;
                        } else {
                            function13 = function4;
                        }
                        objM87133R = c28655q.m87133R();
                        obj = objM87133R;
                        if (objM87133R == c28676v0) {
                            InterfaceC2994c0 interfaceC2994c0M87262p3 = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(interfaceC2994c0M87262p3);
                            obj = interfaceC2994c0M87262p3;
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) obj;
                        objM87133R2 = c28655q.m87133R();
                        textResource = null;
                        z18 = false;
                        objM95647w = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            if (z16) {
                                z17 = false;
                            } else {
                                c37633nM120954a = cVar.getPlan();
                                if (c37633nM120954a != null) {
                                    c9598eM35272a = null;
                                } else {
                                    c9598eM35272a = null;
                                }
                                if (c9598eM35272a != null) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            }
                            objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                        c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                        objM87133R3 = c28655q.m87133R();
                        obj2 = objM87133R3;
                        if (objM87133R3 == c28676v0) {
                            C28633k1 c28633k1M87272z5 = AbstractC28683x.m87272z(null);
                            c28655q.m87172p0(c28633k1M87272z5);
                            obj2 = c28633k1M87272z5;
                        }
                        InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) obj2;
                        boolean z111 = z16;
                        aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                        objM87133R4 = c28655q.m87133R();
                        obj3 = objM87133R4;
                        if (objM87133R4 == c28676v0) {
                            C28633k1 c28633k1M87272z6 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                            c28655q.m87172p0(c28633k1M87272z6);
                            obj3 = c28633k1M87272z6;
                        }
                        InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) obj3;
                        Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                        C35666g c35666gM127436L3 = m127436L(interfaceC28601c7);
                        AbstractC27274q.b bVar3 = AbstractC27274q.b.f109138f;
                        zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                        Object objM87133R12 = c28655q.m87133R();
                        obj4 = objM87133R12;
                        if (zM87157i) {
                            C2028s c2028s4 = new C2028s(interfaceC2994c0, aVar, 8);
                            c28655q.m87172p0(c2028s4);
                            obj4 = c2028s4;
                        } else {
                            C2028s c2028s5 = new C2028s(interfaceC2994c0, aVar, 8);
                            c28655q.m87172p0(c2028s5);
                            obj4 = c2028s5;
                        }
                        C37816b c37816bM121344e3 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c6, 1));
                        C35269t c35269t3 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c7, interfaceC28601c6);
                        function14 = function11;
                        Function1 function18 = function12;
                        function7 = function10;
                        AbstractC35660d.m112871m(modifierM3407d3, c35666gM127436L3, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e3, false, bVar3, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t3), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                        if (m127450Z(interfaceC28601c1)) {
                            m127452a0(interfaceC28601c1, false);
                            function13.invoke(Boolean.FALSE);
                            function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                        }
                        boolean zM127450Z3 = m127450Z(interfaceC28601c1);
                        zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i2) {
                            function15 = function13;
                            objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            function15 = function13;
                            objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z3, c28655q, 0, 0);
                        z15 = z111;
                        function5 = function14;
                        function8 = function18;
                        function9 = function15;
                    } else {
                        c28655q.m87138X();
                        function7 = function1;
                        z15 = z13;
                        function8 = function6;
                        function9 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
                    }
                }
                i15 |= 1572864;
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(function4)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                i28 = i15;
                if ((i28 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i28 & 1, z14)) {
                    c28676v0 = C28635l.f115821a;
                    if (i29 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            obj8 = objM87133R9;
                            C39611k c39611k13 = new C39611k(24);
                            c28655q.m87172p0(c39611k13);
                            obj8 = c39611k13;
                        }
                        obj8 = objM87133R9;
                        function10 = (Function1) obj8;
                    } else {
                        function10 = function1;
                    }
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            obj7 = objM87133R8;
                            C39611k c39611k14 = new C39611k(25);
                            c28655q.m87172p0(c39611k14);
                            obj7 = c39611k14;
                        }
                        obj7 = objM87133R8;
                        function11 = (Function1) obj7;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            obj6 = objM87133R7;
                            C39611k c39611k15 = new C39611k(26);
                            c28655q.m87172p0(c39611k15);
                            obj6 = c39611k15;
                        }
                        obj6 = objM87133R7;
                        function12 = (Function1) obj6;
                    } else {
                        function12 = function6;
                    }
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            obj5 = objM87133R6;
                            C39611k c39611k16 = new C39611k(20);
                            c28655q.m87172p0(c39611k16);
                            obj5 = c39611k16;
                        }
                        obj5 = objM87133R6;
                        function13 = (Function1) obj5;
                    } else {
                        function13 = function4;
                    }
                    objM87133R = c28655q.m87133R();
                    obj = objM87133R;
                    if (objM87133R == c28676v0) {
                        InterfaceC2994c0 interfaceC2994c0M87262p4 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(interfaceC2994c0M87262p4);
                        obj = interfaceC2994c0M87262p4;
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) obj;
                    objM87133R2 = c28655q.m87133R();
                    textResource = null;
                    z18 = false;
                    objM95647w = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        if (z16) {
                            z17 = false;
                        } else {
                            c37633nM120954a = cVar.getPlan();
                            if (c37633nM120954a != null) {
                                c9598eM35272a = null;
                            } else {
                                c9598eM35272a = null;
                            }
                            if (c9598eM35272a != null) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        }
                        objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                    c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                    objM87133R3 = c28655q.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v0) {
                        C28633k1 c28633k1M87272z7 = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(c28633k1M87272z7);
                        obj2 = c28633k1M87272z7;
                    }
                    InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) obj2;
                    boolean z112 = z16;
                    aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                    objM87133R4 = c28655q.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28633k1 c28633k1M87272z8 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                        c28655q.m87172p0(c28633k1M87272z8);
                        obj3 = c28633k1M87272z8;
                    }
                    InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) obj3;
                    Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    C35666g c35666gM127436L4 = m127436L(interfaceC28601c9);
                    AbstractC27274q.b bVar4 = AbstractC27274q.b.f109138f;
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                    Object objM87133R13 = c28655q.m87133R();
                    obj4 = objM87133R13;
                    if (zM87157i) {
                        C2028s c2028s6 = new C2028s(interfaceC2994c0, aVar, 8);
                        c28655q.m87172p0(c2028s6);
                        obj4 = c2028s6;
                    } else {
                        C2028s c2028s7 = new C2028s(interfaceC2994c0, aVar, 8);
                        c28655q.m87172p0(c2028s7);
                        obj4 = c2028s7;
                    }
                    C37816b c37816bM121344e4 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c8, 1));
                    C35269t c35269t4 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c9, interfaceC28601c8);
                    function14 = function11;
                    Function1 function19 = function12;
                    function7 = function10;
                    AbstractC35660d.m112871m(modifierM3407d4, c35666gM127436L4, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e4, false, bVar4, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t4), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                    if (m127450Z(interfaceC28601c1)) {
                        m127452a0(interfaceC28601c1, false);
                        function13.invoke(Boolean.FALSE);
                        function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                    }
                    boolean zM127450Z4 = m127450Z(interfaceC28601c1);
                    zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        function15 = function13;
                        objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function15 = function13;
                        objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z4, c28655q, 0, 0);
                    z15 = z112;
                    function5 = function14;
                    function8 = function19;
                    function9 = function15;
                } else {
                    c28655q.m87138X();
                    function7 = function1;
                    z15 = z13;
                    function8 = function6;
                    function9 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
                }
            }
            i15 |= 24576;
            function5 = function2;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87155h(z13)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q.m87157i(function4)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    i28 = i15;
                    if ((i28 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z14)) {
                        c28676v0 = C28635l.f115821a;
                        if (i29 != 0) {
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                obj8 = objM87133R9;
                                C39611k c39611k17 = new C39611k(24);
                                c28655q.m87172p0(c39611k17);
                                obj8 = c39611k17;
                            }
                            obj8 = objM87133R9;
                            function10 = (Function1) obj8;
                        } else {
                            function10 = function1;
                        }
                        if (i16 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                obj7 = objM87133R8;
                                C39611k c39611k18 = new C39611k(25);
                                c28655q.m87172p0(c39611k18);
                                obj7 = c39611k18;
                            }
                            obj7 = objM87133R8;
                            function11 = (Function1) obj7;
                        } else {
                            function11 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                obj6 = objM87133R7;
                                C39611k c39611k19 = new C39611k(26);
                                c28655q.m87172p0(c39611k19);
                                obj6 = c39611k19;
                            }
                            obj6 = objM87133R7;
                            function12 = (Function1) obj6;
                        } else {
                            function12 = function6;
                        }
                        if (i24 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (i26 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                obj5 = objM87133R6;
                                C39611k c39611k110 = new C39611k(20);
                                c28655q.m87172p0(c39611k110);
                                obj5 = c39611k110;
                            }
                            obj5 = objM87133R6;
                            function13 = (Function1) obj5;
                        } else {
                            function13 = function4;
                        }
                        objM87133R = c28655q.m87133R();
                        obj = objM87133R;
                        if (objM87133R == c28676v0) {
                            InterfaceC2994c0 interfaceC2994c0M87262p5 = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(interfaceC2994c0M87262p5);
                            obj = interfaceC2994c0M87262p5;
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) obj;
                        objM87133R2 = c28655q.m87133R();
                        textResource = null;
                        z18 = false;
                        objM95647w = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            if (z16) {
                                z17 = false;
                            } else {
                                c37633nM120954a = cVar.getPlan();
                                if (c37633nM120954a != null) {
                                    c9598eM35272a = null;
                                } else {
                                    c9598eM35272a = null;
                                }
                                if (c9598eM35272a != null) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            }
                            objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                        c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                        objM87133R3 = c28655q.m87133R();
                        obj2 = objM87133R3;
                        if (objM87133R3 == c28676v0) {
                            C28633k1 c28633k1M87272z9 = AbstractC28683x.m87272z(null);
                            c28655q.m87172p0(c28633k1M87272z9);
                            obj2 = c28633k1M87272z9;
                        }
                        InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) obj2;
                        boolean z113 = z16;
                        aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                        objM87133R4 = c28655q.m87133R();
                        obj3 = objM87133R4;
                        if (objM87133R4 == c28676v0) {
                            C28633k1 c28633k1M87272z10 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                            c28655q.m87172p0(c28633k1M87272z10);
                            obj3 = c28633k1M87272z10;
                        }
                        InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) obj3;
                        Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                        C35666g c35666gM127436L5 = m127436L(interfaceC28601c11);
                        AbstractC27274q.b bVar5 = AbstractC27274q.b.f109138f;
                        zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                        Object objM87133R14 = c28655q.m87133R();
                        obj4 = objM87133R14;
                        if (zM87157i) {
                            C2028s c2028s8 = new C2028s(interfaceC2994c0, aVar, 8);
                            c28655q.m87172p0(c2028s8);
                            obj4 = c2028s8;
                        } else {
                            C2028s c2028s9 = new C2028s(interfaceC2994c0, aVar, 8);
                            c28655q.m87172p0(c2028s9);
                            obj4 = c2028s9;
                        }
                        C37816b c37816bM121344e5 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c10, 1));
                        C35269t c35269t5 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c11, interfaceC28601c10);
                        function14 = function11;
                        Function1 function110 = function12;
                        function7 = function10;
                        AbstractC35660d.m112871m(modifierM3407d5, c35666gM127436L5, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e5, false, bVar5, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t5), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                        if (m127450Z(interfaceC28601c1)) {
                            m127452a0(interfaceC28601c1, false);
                            function13.invoke(Boolean.FALSE);
                            function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                        }
                        boolean zM127450Z5 = m127450Z(interfaceC28601c1);
                        zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i2) {
                            function15 = function13;
                            objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            function15 = function13;
                            objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z5, c28655q, 0, 0);
                        z15 = z113;
                        function5 = function14;
                        function8 = function110;
                        function9 = function15;
                    } else {
                        c28655q.m87138X();
                        function7 = function1;
                        z15 = z13;
                        function8 = function6;
                        function9 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
                    }
                }
                i15 |= 1572864;
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(function4)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                i28 = i15;
                if ((i28 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i28 & 1, z14)) {
                    c28676v0 = C28635l.f115821a;
                    if (i29 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            obj8 = objM87133R9;
                            C39611k c39611k111 = new C39611k(24);
                            c28655q.m87172p0(c39611k111);
                            obj8 = c39611k111;
                        }
                        obj8 = objM87133R9;
                        function10 = (Function1) obj8;
                    } else {
                        function10 = function1;
                    }
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            obj7 = objM87133R8;
                            C39611k c39611k112 = new C39611k(25);
                            c28655q.m87172p0(c39611k112);
                            obj7 = c39611k112;
                        }
                        obj7 = objM87133R8;
                        function11 = (Function1) obj7;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            obj6 = objM87133R7;
                            C39611k c39611k113 = new C39611k(26);
                            c28655q.m87172p0(c39611k113);
                            obj6 = c39611k113;
                        }
                        obj6 = objM87133R7;
                        function12 = (Function1) obj6;
                    } else {
                        function12 = function6;
                    }
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            obj5 = objM87133R6;
                            C39611k c39611k114 = new C39611k(20);
                            c28655q.m87172p0(c39611k114);
                            obj5 = c39611k114;
                        }
                        obj5 = objM87133R6;
                        function13 = (Function1) obj5;
                    } else {
                        function13 = function4;
                    }
                    objM87133R = c28655q.m87133R();
                    obj = objM87133R;
                    if (objM87133R == c28676v0) {
                        InterfaceC2994c0 interfaceC2994c0M87262p6 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(interfaceC2994c0M87262p6);
                        obj = interfaceC2994c0M87262p6;
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) obj;
                    objM87133R2 = c28655q.m87133R();
                    textResource = null;
                    z18 = false;
                    objM95647w = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        if (z16) {
                            z17 = false;
                        } else {
                            c37633nM120954a = cVar.getPlan();
                            if (c37633nM120954a != null) {
                                c9598eM35272a = null;
                            } else {
                                c9598eM35272a = null;
                            }
                            if (c9598eM35272a != null) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        }
                        objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                    c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                    objM87133R3 = c28655q.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v0) {
                        C28633k1 c28633k1M87272z11 = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(c28633k1M87272z11);
                        obj2 = c28633k1M87272z11;
                    }
                    InterfaceC28601c1 interfaceC28601c12 = (InterfaceC28601c1) obj2;
                    boolean z114 = z16;
                    aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                    objM87133R4 = c28655q.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28633k1 c28633k1M87272z12 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                        c28655q.m87172p0(c28633k1M87272z12);
                        obj3 = c28633k1M87272z12;
                    }
                    InterfaceC28601c1 interfaceC28601c13 = (InterfaceC28601c1) obj3;
                    Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    C35666g c35666gM127436L6 = m127436L(interfaceC28601c13);
                    AbstractC27274q.b bVar6 = AbstractC27274q.b.f109138f;
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                    Object objM87133R15 = c28655q.m87133R();
                    obj4 = objM87133R15;
                    if (zM87157i) {
                        C2028s c2028s10 = new C2028s(interfaceC2994c0, aVar, 8);
                        c28655q.m87172p0(c2028s10);
                        obj4 = c2028s10;
                    } else {
                        C2028s c2028s11 = new C2028s(interfaceC2994c0, aVar, 8);
                        c28655q.m87172p0(c2028s11);
                        obj4 = c2028s11;
                    }
                    C37816b c37816bM121344e6 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c12, 1));
                    C35269t c35269t6 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c13, interfaceC28601c12);
                    function14 = function11;
                    Function1 function111 = function12;
                    function7 = function10;
                    AbstractC35660d.m112871m(modifierM3407d6, c35666gM127436L6, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e6, false, bVar6, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t6), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                    if (m127450Z(interfaceC28601c1)) {
                        m127452a0(interfaceC28601c1, false);
                        function13.invoke(Boolean.FALSE);
                        function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                    }
                    boolean zM127450Z6 = m127450Z(interfaceC28601c1);
                    zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        function15 = function13;
                        objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function15 = function13;
                        objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z6, c28655q, 0, 0);
                    z15 = z114;
                    function5 = function14;
                    function8 = function111;
                    function9 = function15;
                } else {
                    c28655q.m87138X();
                    function7 = function1;
                    z15 = z13;
                    function8 = function6;
                    function9 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function6 = function3;
            i24 = i14 & 64;
            if (i24 != 0) {
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(function4)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                i28 = i15;
                if ((i28 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i28 & 1, z14)) {
                    c28676v0 = C28635l.f115821a;
                    if (i29 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            obj8 = objM87133R9;
                            C39611k c39611k115 = new C39611k(24);
                            c28655q.m87172p0(c39611k115);
                            obj8 = c39611k115;
                        }
                        obj8 = objM87133R9;
                        function10 = (Function1) obj8;
                    } else {
                        function10 = function1;
                    }
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            obj7 = objM87133R8;
                            C39611k c39611k116 = new C39611k(25);
                            c28655q.m87172p0(c39611k116);
                            obj7 = c39611k116;
                        }
                        obj7 = objM87133R8;
                        function11 = (Function1) obj7;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            obj6 = objM87133R7;
                            C39611k c39611k117 = new C39611k(26);
                            c28655q.m87172p0(c39611k117);
                            obj6 = c39611k117;
                        }
                        obj6 = objM87133R7;
                        function12 = (Function1) obj6;
                    } else {
                        function12 = function6;
                    }
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            obj5 = objM87133R6;
                            C39611k c39611k118 = new C39611k(20);
                            c28655q.m87172p0(c39611k118);
                            obj5 = c39611k118;
                        }
                        obj5 = objM87133R6;
                        function13 = (Function1) obj5;
                    } else {
                        function13 = function4;
                    }
                    objM87133R = c28655q.m87133R();
                    obj = objM87133R;
                    if (objM87133R == c28676v0) {
                        InterfaceC2994c0 interfaceC2994c0M87262p7 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(interfaceC2994c0M87262p7);
                        obj = interfaceC2994c0M87262p7;
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) obj;
                    objM87133R2 = c28655q.m87133R();
                    textResource = null;
                    z18 = false;
                    objM95647w = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        if (z16) {
                            z17 = false;
                        } else {
                            c37633nM120954a = cVar.getPlan();
                            if (c37633nM120954a != null) {
                                c9598eM35272a = null;
                            } else {
                                c9598eM35272a = null;
                            }
                            if (c9598eM35272a != null) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        }
                        objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                    c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                    objM87133R3 = c28655q.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v0) {
                        C28633k1 c28633k1M87272z13 = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(c28633k1M87272z13);
                        obj2 = c28633k1M87272z13;
                    }
                    InterfaceC28601c1 interfaceC28601c14 = (InterfaceC28601c1) obj2;
                    boolean z115 = z16;
                    aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                    objM87133R4 = c28655q.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28633k1 c28633k1M87272z14 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                        c28655q.m87172p0(c28633k1M87272z14);
                        obj3 = c28633k1M87272z14;
                    }
                    InterfaceC28601c1 interfaceC28601c15 = (InterfaceC28601c1) obj3;
                    Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    C35666g c35666gM127436L7 = m127436L(interfaceC28601c15);
                    AbstractC27274q.b bVar7 = AbstractC27274q.b.f109138f;
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                    Object objM87133R16 = c28655q.m87133R();
                    obj4 = objM87133R16;
                    if (zM87157i) {
                        C2028s c2028s12 = new C2028s(interfaceC2994c0, aVar, 8);
                        c28655q.m87172p0(c2028s12);
                        obj4 = c2028s12;
                    } else {
                        C2028s c2028s13 = new C2028s(interfaceC2994c0, aVar, 8);
                        c28655q.m87172p0(c2028s13);
                        obj4 = c2028s13;
                    }
                    C37816b c37816bM121344e7 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c14, 1));
                    C35269t c35269t7 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c15, interfaceC28601c14);
                    function14 = function11;
                    Function1 function112 = function12;
                    function7 = function10;
                    AbstractC35660d.m112871m(modifierM3407d7, c35666gM127436L7, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e7, false, bVar7, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t7), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                    if (m127450Z(interfaceC28601c1)) {
                        m127452a0(interfaceC28601c1, false);
                        function13.invoke(Boolean.FALSE);
                        function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                    }
                    boolean zM127450Z7 = m127450Z(interfaceC28601c1);
                    zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        function15 = function13;
                        objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function15 = function13;
                        objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z7, c28655q, 0, 0);
                    z15 = z115;
                    function5 = function14;
                    function8 = function112;
                    function9 = function15;
                } else {
                    c28655q.m87138X();
                    function7 = function1;
                    z15 = z13;
                    function8 = function6;
                    function9 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
                }
            }
            i15 |= 1572864;
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(function4)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            i28 = i15;
            if ((i28 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i28 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i29 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        obj8 = objM87133R9;
                        C39611k c39611k119 = new C39611k(24);
                        c28655q.m87172p0(c39611k119);
                        obj8 = c39611k119;
                    }
                    obj8 = objM87133R9;
                    function10 = (Function1) obj8;
                } else {
                    function10 = function1;
                }
                if (i16 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        obj7 = objM87133R8;
                        C39611k c39611k1110 = new C39611k(25);
                        c28655q.m87172p0(c39611k1110);
                        obj7 = c39611k1110;
                    }
                    obj7 = objM87133R8;
                    function11 = (Function1) obj7;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        obj6 = objM87133R7;
                        C39611k c39611k1111 = new C39611k(26);
                        c28655q.m87172p0(c39611k1111);
                        obj6 = c39611k1111;
                    }
                    obj6 = objM87133R7;
                    function12 = (Function1) obj6;
                } else {
                    function12 = function6;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        obj5 = objM87133R6;
                        C39611k c39611k1112 = new C39611k(20);
                        c28655q.m87172p0(c39611k1112);
                        obj5 = c39611k1112;
                    }
                    obj5 = objM87133R6;
                    function13 = (Function1) obj5;
                } else {
                    function13 = function4;
                }
                objM87133R = c28655q.m87133R();
                obj = objM87133R;
                if (objM87133R == c28676v0) {
                    InterfaceC2994c0 interfaceC2994c0M87262p8 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(interfaceC2994c0M87262p8);
                    obj = interfaceC2994c0M87262p8;
                }
                interfaceC2994c0 = (InterfaceC2994c0) obj;
                objM87133R2 = c28655q.m87133R();
                textResource = null;
                z18 = false;
                objM95647w = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    if (z16) {
                        z17 = false;
                    } else {
                        c37633nM120954a = cVar.getPlan();
                        if (c37633nM120954a != null) {
                            c9598eM35272a = null;
                        } else {
                            c9598eM35272a = null;
                        }
                        if (c9598eM35272a != null) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                    }
                    objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                objM87133R3 = c28655q.m87133R();
                obj2 = objM87133R3;
                if (objM87133R3 == c28676v0) {
                    C28633k1 c28633k1M87272z15 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(c28633k1M87272z15);
                    obj2 = c28633k1M87272z15;
                }
                InterfaceC28601c1 interfaceC28601c16 = (InterfaceC28601c1) obj2;
                boolean z116 = z16;
                aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                objM87133R4 = c28655q.m87133R();
                obj3 = objM87133R4;
                if (objM87133R4 == c28676v0) {
                    C28633k1 c28633k1M87272z16 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    c28655q.m87172p0(c28633k1M87272z16);
                    obj3 = c28633k1M87272z16;
                }
                InterfaceC28601c1 interfaceC28601c17 = (InterfaceC28601c1) obj3;
                Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                C35666g c35666gM127436L8 = m127436L(interfaceC28601c17);
                AbstractC27274q.b bVar8 = AbstractC27274q.b.f109138f;
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                Object objM87133R17 = c28655q.m87133R();
                obj4 = objM87133R17;
                if (zM87157i) {
                    C2028s c2028s14 = new C2028s(interfaceC2994c0, aVar, 8);
                    c28655q.m87172p0(c2028s14);
                    obj4 = c2028s14;
                } else {
                    C2028s c2028s15 = new C2028s(interfaceC2994c0, aVar, 8);
                    c28655q.m87172p0(c2028s15);
                    obj4 = c2028s15;
                }
                C37816b c37816bM121344e8 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c16, 1));
                C35269t c35269t8 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c17, interfaceC28601c16);
                function14 = function11;
                Function1 function113 = function12;
                function7 = function10;
                AbstractC35660d.m112871m(modifierM3407d8, c35666gM127436L8, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e8, false, bVar8, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t8), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                if (m127450Z(interfaceC28601c1)) {
                    m127452a0(interfaceC28601c1, false);
                    function13.invoke(Boolean.FALSE);
                    function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                }
                boolean zM127450Z8 = m127450Z(interfaceC28601c1);
                zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    function15 = function13;
                    objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function15 = function13;
                    objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z8, c28655q, 0, 0);
                z15 = z116;
                function5 = function14;
                function8 = function113;
                function9 = function15;
            } else {
                c28655q.m87138X();
                function7 = function1;
                z15 = z13;
                function8 = function6;
                function9 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
            }
        }
        i15 |= 3072;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    function6 = function3;
                    if (c28655q.m87157i(function6)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    if ((1572864 & i13) == 0) {
                        if (c28655q.m87155h(z13)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        i15 |= 12582912;
                    } else if ((i13 & 12582912) == 0) {
                        if (c28655q.m87157i(function4)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i15 |= i27;
                    }
                    i28 = i15;
                    if ((i28 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c28655q.m87135U(i28 & 1, z14)) {
                        c28676v0 = C28635l.f115821a;
                        if (i29 != 0) {
                            objM87133R9 = c28655q.m87133R();
                            if (objM87133R9 == c28676v0) {
                                obj8 = objM87133R9;
                                C39611k c39611k1113 = new C39611k(24);
                                c28655q.m87172p0(c39611k1113);
                                obj8 = c39611k1113;
                            }
                            obj8 = objM87133R9;
                            function10 = (Function1) obj8;
                        } else {
                            function10 = function1;
                        }
                        if (i16 != 0) {
                            objM87133R8 = c28655q.m87133R();
                            if (objM87133R8 == c28676v0) {
                                obj7 = objM87133R8;
                                C39611k c39611k1114 = new C39611k(25);
                                c28655q.m87172p0(c39611k1114);
                                obj7 = c39611k1114;
                            }
                            obj7 = objM87133R8;
                            function11 = (Function1) obj7;
                        } else {
                            function11 = function5;
                        }
                        if (i18 != 0) {
                            objM87133R7 = c28655q.m87133R();
                            if (objM87133R7 == c28676v0) {
                                obj6 = objM87133R7;
                                C39611k c39611k1115 = new C39611k(26);
                                c28655q.m87172p0(c39611k1115);
                                obj6 = c39611k1115;
                            }
                            obj6 = objM87133R7;
                            function12 = (Function1) obj6;
                        } else {
                            function12 = function6;
                        }
                        if (i24 != 0) {
                            z16 = false;
                        } else {
                            z16 = z13;
                        }
                        if (i26 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                obj5 = objM87133R6;
                                C39611k c39611k1116 = new C39611k(20);
                                c28655q.m87172p0(c39611k1116);
                                obj5 = c39611k1116;
                            }
                            obj5 = objM87133R6;
                            function13 = (Function1) obj5;
                        } else {
                            function13 = function4;
                        }
                        objM87133R = c28655q.m87133R();
                        obj = objM87133R;
                        if (objM87133R == c28676v0) {
                            InterfaceC2994c0 interfaceC2994c0M87262p9 = AbstractC28683x.m87262p(c28655q);
                            c28655q.m87172p0(interfaceC2994c0M87262p9);
                            obj = interfaceC2994c0M87262p9;
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) obj;
                        objM87133R2 = c28655q.m87133R();
                        textResource = null;
                        z18 = false;
                        objM95647w = objM87133R2;
                        if (objM87133R2 == c28676v0) {
                            if (z16) {
                                z17 = false;
                            } else {
                                c37633nM120954a = cVar.getPlan();
                                if (c37633nM120954a != null) {
                                    c9598eM35272a = null;
                                } else {
                                    c9598eM35272a = null;
                                }
                                if (c9598eM35272a != null) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                            }
                            objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                        c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                        objM87133R3 = c28655q.m87133R();
                        obj2 = objM87133R3;
                        if (objM87133R3 == c28676v0) {
                            C28633k1 c28633k1M87272z17 = AbstractC28683x.m87272z(null);
                            c28655q.m87172p0(c28633k1M87272z17);
                            obj2 = c28633k1M87272z17;
                        }
                        InterfaceC28601c1 interfaceC28601c18 = (InterfaceC28601c1) obj2;
                        boolean z117 = z16;
                        aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                        objM87133R4 = c28655q.m87133R();
                        obj3 = objM87133R4;
                        if (objM87133R4 == c28676v0) {
                            C28633k1 c28633k1M87272z18 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                            c28655q.m87172p0(c28633k1M87272z18);
                            obj3 = c28633k1M87272z18;
                        }
                        InterfaceC28601c1 interfaceC28601c19 = (InterfaceC28601c1) obj3;
                        Modifier modifierM3407d9 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                        C35666g c35666gM127436L9 = m127436L(interfaceC28601c19);
                        AbstractC27274q.b bVar9 = AbstractC27274q.b.f109138f;
                        zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                        Object objM87133R18 = c28655q.m87133R();
                        obj4 = objM87133R18;
                        if (zM87157i) {
                            C2028s c2028s16 = new C2028s(interfaceC2994c0, aVar, 8);
                            c28655q.m87172p0(c2028s16);
                            obj4 = c2028s16;
                        } else {
                            C2028s c2028s17 = new C2028s(interfaceC2994c0, aVar, 8);
                            c28655q.m87172p0(c2028s17);
                            obj4 = c2028s17;
                        }
                        C37816b c37816bM121344e9 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c18, 1));
                        C35269t c35269t9 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c19, interfaceC28601c18);
                        function14 = function11;
                        Function1 function114 = function12;
                        function7 = function10;
                        AbstractC35660d.m112871m(modifierM3407d9, c35666gM127436L9, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e9, false, bVar9, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t9), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                        if (m127450Z(interfaceC28601c1)) {
                            m127452a0(interfaceC28601c1, false);
                            function13.invoke(Boolean.FALSE);
                            function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                        }
                        boolean zM127450Z9 = m127450Z(interfaceC28601c1);
                        zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                        objM87133R5 = c28655q.m87133R();
                        if (zM87157i2) {
                            function15 = function13;
                            objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            function15 = function13;
                            objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                            c28655q.m87172p0(objM87133R5);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z9, c28655q, 0, 0);
                        z15 = z117;
                        function5 = function14;
                        function8 = function114;
                        function9 = function15;
                    } else {
                        c28655q.m87138X();
                        function7 = function1;
                        z15 = z13;
                        function8 = function6;
                        function9 = function4;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
                    }
                }
                i15 |= 1572864;
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(function4)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                i28 = i15;
                if ((i28 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i28 & 1, z14)) {
                    c28676v0 = C28635l.f115821a;
                    if (i29 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            obj8 = objM87133R9;
                            C39611k c39611k1117 = new C39611k(24);
                            c28655q.m87172p0(c39611k1117);
                            obj8 = c39611k1117;
                        }
                        obj8 = objM87133R9;
                        function10 = (Function1) obj8;
                    } else {
                        function10 = function1;
                    }
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            obj7 = objM87133R8;
                            C39611k c39611k1118 = new C39611k(25);
                            c28655q.m87172p0(c39611k1118);
                            obj7 = c39611k1118;
                        }
                        obj7 = objM87133R8;
                        function11 = (Function1) obj7;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            obj6 = objM87133R7;
                            C39611k c39611k1119 = new C39611k(26);
                            c28655q.m87172p0(c39611k1119);
                            obj6 = c39611k1119;
                        }
                        obj6 = objM87133R7;
                        function12 = (Function1) obj6;
                    } else {
                        function12 = function6;
                    }
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            obj5 = objM87133R6;
                            C39611k c39611k11110 = new C39611k(20);
                            c28655q.m87172p0(c39611k11110);
                            obj5 = c39611k11110;
                        }
                        obj5 = objM87133R6;
                        function13 = (Function1) obj5;
                    } else {
                        function13 = function4;
                    }
                    objM87133R = c28655q.m87133R();
                    obj = objM87133R;
                    if (objM87133R == c28676v0) {
                        InterfaceC2994c0 interfaceC2994c0M87262p10 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(interfaceC2994c0M87262p10);
                        obj = interfaceC2994c0M87262p10;
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) obj;
                    objM87133R2 = c28655q.m87133R();
                    textResource = null;
                    z18 = false;
                    objM95647w = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        if (z16) {
                            z17 = false;
                        } else {
                            c37633nM120954a = cVar.getPlan();
                            if (c37633nM120954a != null) {
                                c9598eM35272a = null;
                            } else {
                                c9598eM35272a = null;
                            }
                            if (c9598eM35272a != null) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        }
                        objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                    c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                    objM87133R3 = c28655q.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v0) {
                        C28633k1 c28633k1M87272z19 = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(c28633k1M87272z19);
                        obj2 = c28633k1M87272z19;
                    }
                    InterfaceC28601c1 interfaceC28601c110 = (InterfaceC28601c1) obj2;
                    boolean z118 = z16;
                    aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                    objM87133R4 = c28655q.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28633k1 c28633k1M87272z110 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                        c28655q.m87172p0(c28633k1M87272z110);
                        obj3 = c28633k1M87272z110;
                    }
                    InterfaceC28601c1 interfaceC28601c111 = (InterfaceC28601c1) obj3;
                    Modifier modifierM3407d10 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    C35666g c35666gM127436L10 = m127436L(interfaceC28601c111);
                    AbstractC27274q.b bVar10 = AbstractC27274q.b.f109138f;
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                    Object objM87133R19 = c28655q.m87133R();
                    obj4 = objM87133R19;
                    if (zM87157i) {
                        C2028s c2028s18 = new C2028s(interfaceC2994c0, aVar, 8);
                        c28655q.m87172p0(c2028s18);
                        obj4 = c2028s18;
                    } else {
                        C2028s c2028s19 = new C2028s(interfaceC2994c0, aVar, 8);
                        c28655q.m87172p0(c2028s19);
                        obj4 = c2028s19;
                    }
                    C37816b c37816bM121344e10 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c110, 1));
                    C35269t c35269t10 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c111, interfaceC28601c110);
                    function14 = function11;
                    Function1 function115 = function12;
                    function7 = function10;
                    AbstractC35660d.m112871m(modifierM3407d10, c35666gM127436L10, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e10, false, bVar10, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t10), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                    if (m127450Z(interfaceC28601c1)) {
                        m127452a0(interfaceC28601c1, false);
                        function13.invoke(Boolean.FALSE);
                        function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                    }
                    boolean zM127450Z10 = m127450Z(interfaceC28601c1);
                    zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        function15 = function13;
                        objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function15 = function13;
                        objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z10, c28655q, 0, 0);
                    z15 = z118;
                    function5 = function14;
                    function8 = function115;
                    function9 = function15;
                } else {
                    c28655q.m87138X();
                    function7 = function1;
                    z15 = z13;
                    function8 = function6;
                    function9 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function6 = function3;
            i24 = i14 & 64;
            if (i24 != 0) {
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(function4)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                i28 = i15;
                if ((i28 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i28 & 1, z14)) {
                    c28676v0 = C28635l.f115821a;
                    if (i29 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            obj8 = objM87133R9;
                            C39611k c39611k11111 = new C39611k(24);
                            c28655q.m87172p0(c39611k11111);
                            obj8 = c39611k11111;
                        }
                        obj8 = objM87133R9;
                        function10 = (Function1) obj8;
                    } else {
                        function10 = function1;
                    }
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            obj7 = objM87133R8;
                            C39611k c39611k11112 = new C39611k(25);
                            c28655q.m87172p0(c39611k11112);
                            obj7 = c39611k11112;
                        }
                        obj7 = objM87133R8;
                        function11 = (Function1) obj7;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            obj6 = objM87133R7;
                            C39611k c39611k11113 = new C39611k(26);
                            c28655q.m87172p0(c39611k11113);
                            obj6 = c39611k11113;
                        }
                        obj6 = objM87133R7;
                        function12 = (Function1) obj6;
                    } else {
                        function12 = function6;
                    }
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            obj5 = objM87133R6;
                            C39611k c39611k11114 = new C39611k(20);
                            c28655q.m87172p0(c39611k11114);
                            obj5 = c39611k11114;
                        }
                        obj5 = objM87133R6;
                        function13 = (Function1) obj5;
                    } else {
                        function13 = function4;
                    }
                    objM87133R = c28655q.m87133R();
                    obj = objM87133R;
                    if (objM87133R == c28676v0) {
                        InterfaceC2994c0 interfaceC2994c0M87262p11 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(interfaceC2994c0M87262p11);
                        obj = interfaceC2994c0M87262p11;
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) obj;
                    objM87133R2 = c28655q.m87133R();
                    textResource = null;
                    z18 = false;
                    objM95647w = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        if (z16) {
                            z17 = false;
                        } else {
                            c37633nM120954a = cVar.getPlan();
                            if (c37633nM120954a != null) {
                                c9598eM35272a = null;
                            } else {
                                c9598eM35272a = null;
                            }
                            if (c9598eM35272a != null) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        }
                        objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                    c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                    objM87133R3 = c28655q.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v0) {
                        C28633k1 c28633k1M87272z111 = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(c28633k1M87272z111);
                        obj2 = c28633k1M87272z111;
                    }
                    InterfaceC28601c1 interfaceC28601c112 = (InterfaceC28601c1) obj2;
                    boolean z119 = z16;
                    aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                    objM87133R4 = c28655q.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28633k1 c28633k1M87272z112 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                        c28655q.m87172p0(c28633k1M87272z112);
                        obj3 = c28633k1M87272z112;
                    }
                    InterfaceC28601c1 interfaceC28601c113 = (InterfaceC28601c1) obj3;
                    Modifier modifierM3407d11 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    C35666g c35666gM127436L11 = m127436L(interfaceC28601c113);
                    AbstractC27274q.b bVar11 = AbstractC27274q.b.f109138f;
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                    Object objM87133R110 = c28655q.m87133R();
                    obj4 = objM87133R110;
                    if (zM87157i) {
                        C2028s c2028s110 = new C2028s(interfaceC2994c0, aVar, 8);
                        c28655q.m87172p0(c2028s110);
                        obj4 = c2028s110;
                    } else {
                        C2028s c2028s111 = new C2028s(interfaceC2994c0, aVar, 8);
                        c28655q.m87172p0(c2028s111);
                        obj4 = c2028s111;
                    }
                    C37816b c37816bM121344e11 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c112, 1));
                    C35269t c35269t11 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c113, interfaceC28601c112);
                    function14 = function11;
                    Function1 function116 = function12;
                    function7 = function10;
                    AbstractC35660d.m112871m(modifierM3407d11, c35666gM127436L11, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e11, false, bVar11, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t11), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                    if (m127450Z(interfaceC28601c1)) {
                        m127452a0(interfaceC28601c1, false);
                        function13.invoke(Boolean.FALSE);
                        function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                    }
                    boolean zM127450Z11 = m127450Z(interfaceC28601c1);
                    zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        function15 = function13;
                        objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function15 = function13;
                        objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z11, c28655q, 0, 0);
                    z15 = z119;
                    function5 = function14;
                    function8 = function116;
                    function9 = function15;
                } else {
                    c28655q.m87138X();
                    function7 = function1;
                    z15 = z13;
                    function8 = function6;
                    function9 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
                }
            }
            i15 |= 1572864;
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(function4)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            i28 = i15;
            if ((i28 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i28 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i29 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        obj8 = objM87133R9;
                        C39611k c39611k11115 = new C39611k(24);
                        c28655q.m87172p0(c39611k11115);
                        obj8 = c39611k11115;
                    }
                    obj8 = objM87133R9;
                    function10 = (Function1) obj8;
                } else {
                    function10 = function1;
                }
                if (i16 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        obj7 = objM87133R8;
                        C39611k c39611k11116 = new C39611k(25);
                        c28655q.m87172p0(c39611k11116);
                        obj7 = c39611k11116;
                    }
                    obj7 = objM87133R8;
                    function11 = (Function1) obj7;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        obj6 = objM87133R7;
                        C39611k c39611k11117 = new C39611k(26);
                        c28655q.m87172p0(c39611k11117);
                        obj6 = c39611k11117;
                    }
                    obj6 = objM87133R7;
                    function12 = (Function1) obj6;
                } else {
                    function12 = function6;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        obj5 = objM87133R6;
                        C39611k c39611k11118 = new C39611k(20);
                        c28655q.m87172p0(c39611k11118);
                        obj5 = c39611k11118;
                    }
                    obj5 = objM87133R6;
                    function13 = (Function1) obj5;
                } else {
                    function13 = function4;
                }
                objM87133R = c28655q.m87133R();
                obj = objM87133R;
                if (objM87133R == c28676v0) {
                    InterfaceC2994c0 interfaceC2994c0M87262p12 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(interfaceC2994c0M87262p12);
                    obj = interfaceC2994c0M87262p12;
                }
                interfaceC2994c0 = (InterfaceC2994c0) obj;
                objM87133R2 = c28655q.m87133R();
                textResource = null;
                z18 = false;
                objM95647w = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    if (z16) {
                        z17 = false;
                    } else {
                        c37633nM120954a = cVar.getPlan();
                        if (c37633nM120954a != null) {
                            c9598eM35272a = null;
                        } else {
                            c9598eM35272a = null;
                        }
                        if (c9598eM35272a != null) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                    }
                    objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                objM87133R3 = c28655q.m87133R();
                obj2 = objM87133R3;
                if (objM87133R3 == c28676v0) {
                    C28633k1 c28633k1M87272z113 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(c28633k1M87272z113);
                    obj2 = c28633k1M87272z113;
                }
                InterfaceC28601c1 interfaceC28601c114 = (InterfaceC28601c1) obj2;
                boolean z1110 = z16;
                aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                objM87133R4 = c28655q.m87133R();
                obj3 = objM87133R4;
                if (objM87133R4 == c28676v0) {
                    C28633k1 c28633k1M87272z114 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    c28655q.m87172p0(c28633k1M87272z114);
                    obj3 = c28633k1M87272z114;
                }
                InterfaceC28601c1 interfaceC28601c115 = (InterfaceC28601c1) obj3;
                Modifier modifierM3407d12 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                C35666g c35666gM127436L12 = m127436L(interfaceC28601c115);
                AbstractC27274q.b bVar12 = AbstractC27274q.b.f109138f;
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                Object objM87133R111 = c28655q.m87133R();
                obj4 = objM87133R111;
                if (zM87157i) {
                    C2028s c2028s112 = new C2028s(interfaceC2994c0, aVar, 8);
                    c28655q.m87172p0(c2028s112);
                    obj4 = c2028s112;
                } else {
                    C2028s c2028s113 = new C2028s(interfaceC2994c0, aVar, 8);
                    c28655q.m87172p0(c2028s113);
                    obj4 = c2028s113;
                }
                C37816b c37816bM121344e12 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c114, 1));
                C35269t c35269t12 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c115, interfaceC28601c114);
                function14 = function11;
                Function1 function117 = function12;
                function7 = function10;
                AbstractC35660d.m112871m(modifierM3407d12, c35666gM127436L12, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e12, false, bVar12, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t12), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                if (m127450Z(interfaceC28601c1)) {
                    m127452a0(interfaceC28601c1, false);
                    function13.invoke(Boolean.FALSE);
                    function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                }
                boolean zM127450Z12 = m127450Z(interfaceC28601c1);
                zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    function15 = function13;
                    objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function15 = function13;
                    objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z12, c28655q, 0, 0);
                z15 = z1110;
                function5 = function14;
                function8 = function117;
                function9 = function15;
            } else {
                c28655q.m87138X();
                function7 = function1;
                z15 = z13;
                function8 = function6;
                function9 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
            }
        }
        i15 |= 24576;
        function5 = function2;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                function6 = function3;
                if (c28655q.m87157i(function6)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                if ((1572864 & i13) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    i15 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    if (c28655q.m87157i(function4)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i15 |= i27;
                }
                i28 = i15;
                if ((i28 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i28 & 1, z14)) {
                    c28676v0 = C28635l.f115821a;
                    if (i29 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            obj8 = objM87133R9;
                            C39611k c39611k11119 = new C39611k(24);
                            c28655q.m87172p0(c39611k11119);
                            obj8 = c39611k11119;
                        }
                        obj8 = objM87133R9;
                        function10 = (Function1) obj8;
                    } else {
                        function10 = function1;
                    }
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            obj7 = objM87133R8;
                            C39611k c39611k111110 = new C39611k(25);
                            c28655q.m87172p0(c39611k111110);
                            obj7 = c39611k111110;
                        }
                        obj7 = objM87133R8;
                        function11 = (Function1) obj7;
                    } else {
                        function11 = function5;
                    }
                    if (i18 != 0) {
                        objM87133R7 = c28655q.m87133R();
                        if (objM87133R7 == c28676v0) {
                            obj6 = objM87133R7;
                            C39611k c39611k111111 = new C39611k(26);
                            c28655q.m87172p0(c39611k111111);
                            obj6 = c39611k111111;
                        }
                        obj6 = objM87133R7;
                        function12 = (Function1) obj6;
                    } else {
                        function12 = function6;
                    }
                    if (i24 != 0) {
                        z16 = false;
                    } else {
                        z16 = z13;
                    }
                    if (i26 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            obj5 = objM87133R6;
                            C39611k c39611k111112 = new C39611k(20);
                            c28655q.m87172p0(c39611k111112);
                            obj5 = c39611k111112;
                        }
                        obj5 = objM87133R6;
                        function13 = (Function1) obj5;
                    } else {
                        function13 = function4;
                    }
                    objM87133R = c28655q.m87133R();
                    obj = objM87133R;
                    if (objM87133R == c28676v0) {
                        InterfaceC2994c0 interfaceC2994c0M87262p13 = AbstractC28683x.m87262p(c28655q);
                        c28655q.m87172p0(interfaceC2994c0M87262p13);
                        obj = interfaceC2994c0M87262p13;
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) obj;
                    objM87133R2 = c28655q.m87133R();
                    textResource = null;
                    z18 = false;
                    objM95647w = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        if (z16) {
                            z17 = false;
                        } else {
                            c37633nM120954a = cVar.getPlan();
                            if (c37633nM120954a != null) {
                                c9598eM35272a = null;
                            } else {
                                c9598eM35272a = null;
                            }
                            if (c9598eM35272a != null) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                        }
                        objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                    c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                    objM87133R3 = c28655q.m87133R();
                    obj2 = objM87133R3;
                    if (objM87133R3 == c28676v0) {
                        C28633k1 c28633k1M87272z115 = AbstractC28683x.m87272z(null);
                        c28655q.m87172p0(c28633k1M87272z115);
                        obj2 = c28633k1M87272z115;
                    }
                    InterfaceC28601c1 interfaceC28601c116 = (InterfaceC28601c1) obj2;
                    boolean z1111 = z16;
                    aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                    objM87133R4 = c28655q.m87133R();
                    obj3 = objM87133R4;
                    if (objM87133R4 == c28676v0) {
                        C28633k1 c28633k1M87272z116 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                        c28655q.m87172p0(c28633k1M87272z116);
                        obj3 = c28633k1M87272z116;
                    }
                    InterfaceC28601c1 interfaceC28601c117 = (InterfaceC28601c1) obj3;
                    Modifier modifierM3407d13 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    C35666g c35666gM127436L13 = m127436L(interfaceC28601c117);
                    AbstractC27274q.b bVar13 = AbstractC27274q.b.f109138f;
                    zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                    Object objM87133R112 = c28655q.m87133R();
                    obj4 = objM87133R112;
                    if (zM87157i) {
                        C2028s c2028s114 = new C2028s(interfaceC2994c0, aVar, 8);
                        c28655q.m87172p0(c2028s114);
                        obj4 = c2028s114;
                    } else {
                        C2028s c2028s115 = new C2028s(interfaceC2994c0, aVar, 8);
                        c28655q.m87172p0(c2028s115);
                        obj4 = c2028s115;
                    }
                    C37816b c37816bM121344e13 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c116, 1));
                    C35269t c35269t13 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c117, interfaceC28601c116);
                    function14 = function11;
                    Function1 function118 = function12;
                    function7 = function10;
                    AbstractC35660d.m112871m(modifierM3407d13, c35666gM127436L13, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e13, false, bVar13, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t13), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                    if (m127450Z(interfaceC28601c1)) {
                        m127452a0(interfaceC28601c1, false);
                        function13.invoke(Boolean.FALSE);
                        function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                    }
                    boolean zM127450Z13 = m127450Z(interfaceC28601c1);
                    zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                    objM87133R5 = c28655q.m87133R();
                    if (zM87157i2) {
                        function15 = function13;
                        objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        function15 = function13;
                        objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                        c28655q.m87172p0(objM87133R5);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z13, c28655q, 0, 0);
                    z15 = z1111;
                    function5 = function14;
                    function8 = function118;
                    function9 = function15;
                } else {
                    c28655q.m87138X();
                    function7 = function1;
                    z15 = z13;
                    function8 = function6;
                    function9 = function4;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
                }
            }
            i15 |= 1572864;
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(function4)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            i28 = i15;
            if ((i28 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i28 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i29 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        obj8 = objM87133R9;
                        C39611k c39611k111113 = new C39611k(24);
                        c28655q.m87172p0(c39611k111113);
                        obj8 = c39611k111113;
                    }
                    obj8 = objM87133R9;
                    function10 = (Function1) obj8;
                } else {
                    function10 = function1;
                }
                if (i16 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        obj7 = objM87133R8;
                        C39611k c39611k111114 = new C39611k(25);
                        c28655q.m87172p0(c39611k111114);
                        obj7 = c39611k111114;
                    }
                    obj7 = objM87133R8;
                    function11 = (Function1) obj7;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        obj6 = objM87133R7;
                        C39611k c39611k111115 = new C39611k(26);
                        c28655q.m87172p0(c39611k111115);
                        obj6 = c39611k111115;
                    }
                    obj6 = objM87133R7;
                    function12 = (Function1) obj6;
                } else {
                    function12 = function6;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        obj5 = objM87133R6;
                        C39611k c39611k111116 = new C39611k(20);
                        c28655q.m87172p0(c39611k111116);
                        obj5 = c39611k111116;
                    }
                    obj5 = objM87133R6;
                    function13 = (Function1) obj5;
                } else {
                    function13 = function4;
                }
                objM87133R = c28655q.m87133R();
                obj = objM87133R;
                if (objM87133R == c28676v0) {
                    InterfaceC2994c0 interfaceC2994c0M87262p14 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(interfaceC2994c0M87262p14);
                    obj = interfaceC2994c0M87262p14;
                }
                interfaceC2994c0 = (InterfaceC2994c0) obj;
                objM87133R2 = c28655q.m87133R();
                textResource = null;
                z18 = false;
                objM95647w = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    if (z16) {
                        z17 = false;
                    } else {
                        c37633nM120954a = cVar.getPlan();
                        if (c37633nM120954a != null) {
                            c9598eM35272a = null;
                        } else {
                            c9598eM35272a = null;
                        }
                        if (c9598eM35272a != null) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                    }
                    objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                objM87133R3 = c28655q.m87133R();
                obj2 = objM87133R3;
                if (objM87133R3 == c28676v0) {
                    C28633k1 c28633k1M87272z117 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(c28633k1M87272z117);
                    obj2 = c28633k1M87272z117;
                }
                InterfaceC28601c1 interfaceC28601c118 = (InterfaceC28601c1) obj2;
                boolean z1112 = z16;
                aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                objM87133R4 = c28655q.m87133R();
                obj3 = objM87133R4;
                if (objM87133R4 == c28676v0) {
                    C28633k1 c28633k1M87272z118 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    c28655q.m87172p0(c28633k1M87272z118);
                    obj3 = c28633k1M87272z118;
                }
                InterfaceC28601c1 interfaceC28601c119 = (InterfaceC28601c1) obj3;
                Modifier modifierM3407d14 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                C35666g c35666gM127436L14 = m127436L(interfaceC28601c119);
                AbstractC27274q.b bVar14 = AbstractC27274q.b.f109138f;
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                Object objM87133R113 = c28655q.m87133R();
                obj4 = objM87133R113;
                if (zM87157i) {
                    C2028s c2028s116 = new C2028s(interfaceC2994c0, aVar, 8);
                    c28655q.m87172p0(c2028s116);
                    obj4 = c2028s116;
                } else {
                    C2028s c2028s117 = new C2028s(interfaceC2994c0, aVar, 8);
                    c28655q.m87172p0(c2028s117);
                    obj4 = c2028s117;
                }
                C37816b c37816bM121344e14 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c118, 1));
                C35269t c35269t14 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c119, interfaceC28601c118);
                function14 = function11;
                Function1 function119 = function12;
                function7 = function10;
                AbstractC35660d.m112871m(modifierM3407d14, c35666gM127436L14, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e14, false, bVar14, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t14), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                if (m127450Z(interfaceC28601c1)) {
                    m127452a0(interfaceC28601c1, false);
                    function13.invoke(Boolean.FALSE);
                    function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                }
                boolean zM127450Z14 = m127450Z(interfaceC28601c1);
                zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    function15 = function13;
                    objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function15 = function13;
                    objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z14, c28655q, 0, 0);
                z15 = z1112;
                function5 = function14;
                function8 = function119;
                function9 = function15;
            } else {
                c28655q.m87138X();
                function7 = function1;
                z15 = z13;
                function8 = function6;
                function9 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        function6 = function3;
        i24 = i14 & 64;
        if (i24 != 0) {
            if ((1572864 & i13) == 0) {
                if (c28655q.m87155h(z13)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                i15 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if (c28655q.m87157i(function4)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i15 |= i27;
            }
            i28 = i15;
            if ((i28 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i28 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i29 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        obj8 = objM87133R9;
                        C39611k c39611k111117 = new C39611k(24);
                        c28655q.m87172p0(c39611k111117);
                        obj8 = c39611k111117;
                    }
                    obj8 = objM87133R9;
                    function10 = (Function1) obj8;
                } else {
                    function10 = function1;
                }
                if (i16 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        obj7 = objM87133R8;
                        C39611k c39611k111118 = new C39611k(25);
                        c28655q.m87172p0(c39611k111118);
                        obj7 = c39611k111118;
                    }
                    obj7 = objM87133R8;
                    function11 = (Function1) obj7;
                } else {
                    function11 = function5;
                }
                if (i18 != 0) {
                    objM87133R7 = c28655q.m87133R();
                    if (objM87133R7 == c28676v0) {
                        obj6 = objM87133R7;
                        C39611k c39611k111119 = new C39611k(26);
                        c28655q.m87172p0(c39611k111119);
                        obj6 = c39611k111119;
                    }
                    obj6 = objM87133R7;
                    function12 = (Function1) obj6;
                } else {
                    function12 = function6;
                }
                if (i24 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                if (i26 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        obj5 = objM87133R6;
                        C39611k c39611k1111110 = new C39611k(20);
                        c28655q.m87172p0(c39611k1111110);
                        obj5 = c39611k1111110;
                    }
                    obj5 = objM87133R6;
                    function13 = (Function1) obj5;
                } else {
                    function13 = function4;
                }
                objM87133R = c28655q.m87133R();
                obj = objM87133R;
                if (objM87133R == c28676v0) {
                    InterfaceC2994c0 interfaceC2994c0M87262p15 = AbstractC28683x.m87262p(c28655q);
                    c28655q.m87172p0(interfaceC2994c0M87262p15);
                    obj = interfaceC2994c0M87262p15;
                }
                interfaceC2994c0 = (InterfaceC2994c0) obj;
                objM87133R2 = c28655q.m87133R();
                textResource = null;
                z18 = false;
                objM95647w = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    if (z16) {
                        z17 = false;
                    } else {
                        c37633nM120954a = cVar.getPlan();
                        if (c37633nM120954a != null) {
                            c9598eM35272a = null;
                        } else {
                            c9598eM35272a = null;
                        }
                        if (c9598eM35272a != null) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                    }
                    objM95647w = AbstractC31061c.m95647w(z17, c28655q);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
                c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
                objM87133R3 = c28655q.m87133R();
                obj2 = objM87133R3;
                if (objM87133R3 == c28676v0) {
                    C28633k1 c28633k1M87272z119 = AbstractC28683x.m87272z(null);
                    c28655q.m87172p0(c28633k1M87272z119);
                    obj2 = c28633k1M87272z119;
                }
                InterfaceC28601c1 interfaceC28601c1110 = (InterfaceC28601c1) obj2;
                boolean z1113 = z16;
                aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
                objM87133R4 = c28655q.m87133R();
                obj3 = objM87133R4;
                if (objM87133R4 == c28676v0) {
                    C28633k1 c28633k1M87272z1110 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                    c28655q.m87172p0(c28633k1M87272z1110);
                    obj3 = c28633k1M87272z1110;
                }
                InterfaceC28601c1 interfaceC28601c1111 = (InterfaceC28601c1) obj3;
                Modifier modifierM3407d15 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                C35666g c35666gM127436L15 = m127436L(interfaceC28601c1111);
                AbstractC27274q.b bVar15 = AbstractC27274q.b.f109138f;
                zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
                Object objM87133R114 = c28655q.m87133R();
                obj4 = objM87133R114;
                if (zM87157i) {
                    C2028s c2028s118 = new C2028s(interfaceC2994c0, aVar, 8);
                    c28655q.m87172p0(c2028s118);
                    obj4 = c2028s118;
                } else {
                    C2028s c2028s119 = new C2028s(interfaceC2994c0, aVar, 8);
                    c28655q.m87172p0(c2028s119);
                    obj4 = c2028s119;
                }
                C37816b c37816bM121344e15 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c1110, 1));
                C35269t c35269t15 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c1111, interfaceC28601c1110);
                function14 = function11;
                Function1 function1110 = function12;
                function7 = function10;
                AbstractC35660d.m112871m(modifierM3407d15, c35666gM127436L15, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e15, false, bVar15, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t15), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
                if (m127450Z(interfaceC28601c1)) {
                    m127452a0(interfaceC28601c1, false);
                    function13.invoke(Boolean.FALSE);
                    function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
                }
                boolean zM127450Z15 = m127450Z(interfaceC28601c1);
                zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i2) {
                    function15 = function13;
                    objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function15 = function13;
                    objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                    c28655q.m87172p0(objM87133R5);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z15, c28655q, 0, 0);
                z15 = z1113;
                function5 = function14;
                function8 = function1110;
                function9 = function15;
            } else {
                c28655q.m87138X();
                function7 = function1;
                z15 = z13;
                function8 = function6;
                function9 = function4;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
            }
        }
        i15 |= 1572864;
        i26 = i14 & 128;
        if (i26 != 0) {
            i15 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if (c28655q.m87157i(function4)) {
                i27 = 8388608;
            } else {
                i27 = 4194304;
            }
            i15 |= i27;
        }
        i28 = i15;
        if ((i28 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i28 & 1, z14)) {
            c28676v0 = C28635l.f115821a;
            if (i29 != 0) {
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    obj8 = objM87133R9;
                    C39611k c39611k1111111 = new C39611k(24);
                    c28655q.m87172p0(c39611k1111111);
                    obj8 = c39611k1111111;
                }
                obj8 = objM87133R9;
                function10 = (Function1) obj8;
            } else {
                function10 = function1;
            }
            if (i16 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    obj7 = objM87133R8;
                    C39611k c39611k1111112 = new C39611k(25);
                    c28655q.m87172p0(c39611k1111112);
                    obj7 = c39611k1111112;
                }
                obj7 = objM87133R8;
                function11 = (Function1) obj7;
            } else {
                function11 = function5;
            }
            if (i18 != 0) {
                objM87133R7 = c28655q.m87133R();
                if (objM87133R7 == c28676v0) {
                    obj6 = objM87133R7;
                    C39611k c39611k1111113 = new C39611k(26);
                    c28655q.m87172p0(c39611k1111113);
                    obj6 = c39611k1111113;
                }
                obj6 = objM87133R7;
                function12 = (Function1) obj6;
            } else {
                function12 = function6;
            }
            if (i24 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            if (i26 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    obj5 = objM87133R6;
                    C39611k c39611k1111114 = new C39611k(20);
                    c28655q.m87172p0(c39611k1111114);
                    obj5 = c39611k1111114;
                }
                obj5 = objM87133R6;
                function13 = (Function1) obj5;
            } else {
                function13 = function4;
            }
            objM87133R = c28655q.m87133R();
            obj = objM87133R;
            if (objM87133R == c28676v0) {
                InterfaceC2994c0 interfaceC2994c0M87262p16 = AbstractC28683x.m87262p(c28655q);
                c28655q.m87172p0(interfaceC2994c0M87262p16);
                obj = interfaceC2994c0M87262p16;
            }
            interfaceC2994c0 = (InterfaceC2994c0) obj;
            objM87133R2 = c28655q.m87133R();
            textResource = null;
            z18 = false;
            objM95647w = objM87133R2;
            if (objM87133R2 == c28676v0) {
                if (z16) {
                    z17 = false;
                } else {
                    c37633nM120954a = cVar.getPlan();
                    if (c37633nM120954a != null) {
                        c9598eM35272a = null;
                    } else {
                        c9598eM35272a = null;
                    }
                    if (c9598eM35272a != null) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                }
                objM95647w = AbstractC31061c.m95647w(z17, c28655q);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM95647w;
            c15136s0M43172c = AbstractC15108p2.m43172c(EnumC15146t0.f56806w, c28655q, 6);
            objM87133R3 = c28655q.m87133R();
            obj2 = objM87133R3;
            if (objM87133R3 == c28676v0) {
                C28633k1 c28633k1M87272z1111 = AbstractC28683x.m87272z(null);
                c28655q.m87172p0(c28633k1M87272z1111);
                obj2 = c28633k1M87272z1111;
            }
            InterfaceC28601c1 interfaceC28601c1112 = (InterfaceC28601c1) obj2;
            boolean z1114 = z16;
            aVar = new AbstractC35664f.a(AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q, 3078, 6));
            objM87133R4 = c28655q.m87133R();
            obj3 = objM87133R4;
            if (objM87133R4 == c28676v0) {
                C28633k1 c28633k1M87272z1112 = AbstractC28683x.m87272z(new C35666g(AbstractC8693b.m21267a(), new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), textResource, 2, z18 ? 1 : 0), null, null, null, 0.0f, 0.0f, 124, null));
                c28655q.m87172p0(c28633k1M87272z1112);
                obj3 = c28633k1M87272z1112;
            }
            InterfaceC28601c1 interfaceC28601c1113 = (InterfaceC28601c1) obj3;
            Modifier modifierM3407d16 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            C35666g c35666gM127436L16 = m127436L(interfaceC28601c1113);
            AbstractC27274q.b bVar16 = AbstractC27274q.b.f109138f;
            zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            Object objM87133R115 = c28655q.m87133R();
            obj4 = objM87133R115;
            if (zM87157i) {
                C2028s c2028s1110 = new C2028s(interfaceC2994c0, aVar, 8);
                c28655q.m87172p0(c2028s1110);
                obj4 = c2028s1110;
            } else {
                C2028s c2028s1111 = new C2028s(interfaceC2994c0, aVar, 8);
                c28655q.m87172p0(c2028s1111);
                obj4 = c2028s1111;
            }
            C37816b c37816bM121344e16 = AbstractC37817c.m121344e(1569464406, c28655q, new C39776g(interfaceC28601c1112, 1));
            C35269t c35269t16 = new C35269t(z4, cVar, function11, str, function12, function10, interfaceC2994c0, aVar, interfaceC28601c1, interfaceC28601c1113, interfaceC28601c1112);
            function14 = function11;
            Function1 function1111 = function12;
            function7 = function10;
            AbstractC35660d.m112871m(modifierM3407d16, c35666gM127436L16, aVar, null, (InterfaceC4339a) obj4, null, null, c37816bM121344e16, false, bVar16, null, null, false, null, AbstractC37817c.m121344e(-121408238, c28655q, c35269t16), c28655q, (C35666g.f151591h << 3) | 12582918 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.b.f109139g << 27), 24576, 15720);
            if (m127450Z(interfaceC28601c1)) {
                m127452a0(interfaceC28601c1, false);
                function13.invoke(Boolean.FALSE);
                function14.invoke(new AbstractC36498g.c(cVar.getPlanState()));
            }
            boolean zM127450Z16 = m127450Z(interfaceC28601c1);
            zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15136s0M43172c) | ((i28 & 29360128) == 8388608);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i2) {
                function15 = function13;
                objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                c28655q.m87172p0(objM87133R5);
            } else {
                function15 = function13;
                objM87133R5 = new C27198e((Object) interfaceC2994c0, (Object) c15136s0M43172c, function15, (Object) interfaceC28601c1, 26);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, zM127450Z16, c28655q, 0, 0);
            z15 = z1114;
            function5 = function14;
            function8 = function1111;
            function9 = function15;
        } else {
            c28655q.m87138X();
            function7 = function1;
            z15 = z13;
            function8 = function6;
            function9 = function4;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9785i(cVar, str, z4, function7, function5, function8, z15, function9, i13, i14, 7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m127434J(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m127435K(AbstractC36498g it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    private static final C35666g m127436L(InterfaceC28601c1 interfaceC28601c1) {
        return (C35666g) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final void m127437M(InterfaceC28601c1 interfaceC28601c1, C35666g c35666g) {
        interfaceC28601c1.setValue(c35666g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m127438N(InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(aVar, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m127439O(InterfaceC28601c1 interfaceC28601c1, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C14063a c14063aM127454b0 = m127454b0(interfaceC28601c1);
            if (c14063aM127454b0 == null) {
                c28655q.m87150e0(900169673);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(900169674);
                AbstractC30593b.m93841e(c14063aM127454b0, c28655q, C14063a.f50430f);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m127440P(boolean z4, AbstractC37636q.c cVar, Function1 function1, String str, Function1 function2, Function1 function3, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, Composer composer, int i13) {
        Modifier modifierM44021Y0;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            if (z4) {
                modifierM44021Y0 = c2314t;
            } else {
                C37633n c37633nM120954a = cVar.getPlan();
                EnumC37624e enumC37624eM120935h = c37633nM120954a != null ? c37633nM120954a.getGradientStyle() : null;
                modifierM44021Y0 = (enumC37624eM120935h == null ? -1 : h.f171377a[enumC37624eM120935h.ordinal()]) == 1 ? AbstractC15673b0.m44021Y0(AbstractC15673b0.m44028b0(c2314t), AbstractC37056f.m118959K(new C17919x(AbstractC17918w0.m51517e(2154278630L)), new C17919x(AbstractC17918w0.m51517e(2147806881L)), new C17919x(C17919x.f69636m))) : AbstractC15673b0.m44028b0(c2314t);
            }
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(modifierM3407d.mo3471e(modifierM44021Y0)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
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
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(714036980);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(713418096);
                AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89943o)), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                boolean zM87153g = c28655q.m87153g(function1);
                Object objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C39771b(function1, 4);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            Modifier modifierM3599a = AbstractC1136a.m3599a(c2314t, "WeeklyPlanLazyColumnTag");
            C13404j c13404jM120957d = cVar.getScreenContextMetadata();
            int i14 = C13404j.f46947x;
            Modifier modifierM34129b = AbstractC12250f.m34129b(modifierM3599a, c13404jM120957d, false, c28655q, (i14 << 3) | 6, 2);
            C37633n c37633nM120954a2 = cVar.getPlan();
            C26068u c26068uM127424a = AbstractC39781l.m127424a(str, c37633nM120954a2 != null ? c37633nM120954a2.m120934g() : null, c28655q, 0);
            float f13 = 8;
            float f14 = 2 * f13;
            InterfaceC22973k1 interfaceC22973k1M34113f = AbstractC12248d.m34113f(cVar.getScreenContextMetadata(), new C22976l1(f14, f14, f14, f14), false, c28655q, i14 | 48, 4);
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f13 * 4);
            boolean zM87157i = c28655q.m87157i(cVar) | c28655q.m87153g(function1) | c28655q.m87153g(function2) | c28655q.m87153g(function3) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(aVar);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                C18434s c18434s = new C18434s(cVar, function1, function2, function3, interfaceC28601c1, interfaceC2994c0, aVar, interfaceC28601c2, interfaceC28601c3);
                c28655q.m87172p0(c18434s);
                objM87133R2 = c18434s;
            }
            AbstractC22674j.m65717c(modifierM34129b, c26068uM127424a, interfaceC22973k1M34113f, c22971kM66746i, null, null, false, null, (Function1) objM87133R2, c28655q, 24576, 488);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m127441Q(Function1 function1) {
        function1.invoke(AbstractC36498g.b.f155925a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m127442R(AbstractC37636q.c cVar, Function1 function1, Function1 function2, Function1 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC2994c0 interfaceC2994c0, AbstractC35664f.a aVar, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C0563n((Object) cVar, function1, (Object) function2, (Object) function3, (Object) interfaceC28601c1, 18), true, 1985859427), 3);
        C37633n c37633nM120954a = cVar.getPlan();
        if (c37633nM120954a != null) {
            List<C41139h> listM120934g = c37633nM120954a.m120934g();
            e eVar = e.f171366w;
            ((C26053f) LazyColumn).m77529r(listM120934g.size(), null, new f(eVar, listM120934g), new C37816b(new g(listM120934g, c37633nM120954a, interfaceC2994c0, aVar, function3, function1, interfaceC28601c2, interfaceC28601c3), true, 802480018));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m127443S(AbstractC37636q.c cVar, Function1 function1, Function1 function2, Function1 function3, InterfaceC28601c1 interfaceC28601c1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C37633n c37633nM120954a = cVar.getPlan();
            if (c37633nM120954a == null) {
                c28655q.m87150e0(1858744585);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1858744586);
                boolean zM120959f = cVar.getIsUpdating();
                boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(cVar) | c28655q.m87153g(function2);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C31324k(function1, cVar, function2, 26);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                boolean zM87157i = c28655q.m87157i(cVar) | c28655q.m87153g(function3);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C37082e1(cVar, function3, interfaceC28601c1, 19);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC41141j.m133611h(c37633nM120954a, zM120959f, interfaceC4339a, function1, (Function1) objM87133R2, c28655q, 0, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m127444T(Function1 function1, AbstractC37636q.c cVar, Function1 function2) {
        function1.invoke(new AbstractC36498g.c(cVar.getPlanState()));
        function2.invoke(AbstractC24716a.q.f96685a);
        function2.invoke(new AbstractC24716a.p("Plan Summary"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m127445U(AbstractC37636q.c cVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1, Object viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (!(cVar.getPresets() instanceof AbstractC37625f.f)) {
            function1.invoke(AbstractC37634o.b.f161089a);
        }
        if ((viewEvent instanceof C9598e) && AbstractC22676k.m65745e(((C9598e) viewEvent).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9366m6.f27782w)) {
            m127452a0(interfaceC28601c1, true);
        } else {
            function1.invoke(viewEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m127446V(InterfaceC2994c0 interfaceC2994c0, C15136s0 c15136s0, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(c15136s0, function1, interfaceC28601c1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m127447W(AbstractC37636q.c cVar, String str, boolean z4, Function1 function1, Function1 function2, Function1 function3, boolean z13, Function1 function4, int i13, int i14, Composer composer, int i15) {
        m127433I(cVar, str, z4, function1, function2, function3, z13, function4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m127448X(AbstractC24716a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m127449Y(boolean z4) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    private static final boolean m127450Z(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final void m127452a0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: b0 */
    private static final C14063a m127454b0(InterfaceC28601c1 interfaceC28601c1) {
        return (C14063a) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final void m127456c0(InterfaceC28601c1 interfaceC28601c1, C14063a c14063a) {
        interfaceC28601c1.setValue(c14063a);
    }

    /* JADX INFO: renamed from: w */
    private static final void m127479w(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1969680031);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
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
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, true, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 6, 3068);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C35658c(i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m127480x(int i13, Composer composer, int i14) {
        m127479w(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0121  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x0135  */
    /* JADX WARN: Code duplicated, block: B:107:0x0139  */
    /* JADX WARN: Code duplicated, block: B:109:0x013f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0151  */
    /* JADX WARN: Code duplicated, block: B:113:0x0156  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x016f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0175  */
    /* JADX WARN: Code duplicated, block: B:121:0x017a  */
    /* JADX WARN: Code duplicated, block: B:123:0x017f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0185  */
    /* JADX WARN: Code duplicated, block: B:127:0x0194  */
    /* JADX WARN: Code duplicated, block: B:130:0x019e  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:140:0x0208  */
    /* JADX WARN: Code duplicated, block: B:143:0x0222  */
    /* JADX WARN: Code duplicated, block: B:146:0x0239  */
    /* JADX WARN: Code duplicated, block: B:148:0x0248  */
    /* JADX WARN: Code duplicated, block: B:150:0x028a  */
    /* JADX WARN: Code duplicated, block: B:151:0x028c  */
    /* JADX WARN: Code duplicated, block: B:154:0x0292  */
    /* JADX WARN: Code duplicated, block: B:155:0x0295  */
    /* JADX WARN: Code duplicated, block: B:158:0x029f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:161:0x02df  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:165:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:167:0x0304  */
    /* JADX WARN: Code duplicated, block: B:170:0x0319  */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
    /* JADX INFO: renamed from: y */
    public static final void m127481y(AbstractC37636q viewState, String str, boolean z4, Function1 function1, Function1 function2, Function1 function3, boolean z13, Function1 function4, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        boolean z14;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z15;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        boolean z16;
        String str2;
        Function1 function5;
        Function1 function6;
        Function1 function7;
        Function1 function8;
        boolean z17;
        boolean z18;
        C28677v1 c28677v1M87180u;
        String str3;
        boolean z19;
        C28676v0 c28676v0;
        Function1 function9;
        int i38;
        Function1 function10;
        int i39;
        Function1 function11;
        boolean z24;
        Function1 function12;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        String str4;
        boolean z25;
        Function1 function13;
        Function1 function14;
        Function1 function15;
        boolean z26;
        Function1 function16;
        Function1 function17;
        Function1 function18;
        boolean z27;
        boolean z28;
        boolean z29;
        Object objM87133R2;
        Function1 function19;
        Function1 function20;
        C37631l c37631lM120958e;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1664889808);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i44 = i14 & 2;
        if (i44 == 0) {
            if ((i13 & 48) == 0) {
                i15 |= c28655q.m87153g(str) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z14 = z4;
                    if (c28655q.m87155h(z14)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        if (c28655q.m87157i(function1)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            if (c28655q.m87157i(function2)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        i26 = i14 & 32;
                        if (i26 != 0) {
                            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q.m87157i(function3)) {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i15 |= i27;
                        }
                        i28 = i14 & 64;
                        if (i28 != 0) {
                            i15 |= 1572864;
                            z15 = z13;
                        } else {
                            z15 = z13;
                            if ((i13 & 1572864) == 0) {
                                if (c28655q.m87155h(z15)) {
                                    i29 = 1048576;
                                } else {
                                    i29 = 524288;
                                }
                                i15 |= i29;
                            }
                        }
                        i34 = i15;
                        i35 = i14 & 128;
                        if (i35 != 0) {
                            i34 |= 12582912;
                        } else if ((i13 & 12582912) != 0) {
                            if (c28655q.m87157i(function4)) {
                                i36 = 8388608;
                            } else {
                                i36 = 4194304;
                            }
                            i34 |= i36;
                        }
                        i37 = i34;
                        if ((i37 & 4793491) != 4793490) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (c28655q.m87135U(i37 & 1, z16)) {
                            if (i44 != 0) {
                                str3 = "";
                            } else {
                                str3 = str;
                            }
                            if (i16 != 0) {
                                z19 = true;
                            } else {
                                z19 = z14;
                            }
                            c28676v0 = C28635l.f115821a;
                            if (i18 != 0) {
                                objM87133R6 = c28655q.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = new C39611k(19);
                                    c28655q.m87172p0(objM87133R6);
                                }
                                function9 = (Function1) objM87133R6;
                            } else {
                                function9 = function1;
                            }
                            if (i24 != 0) {
                                objM87133R5 = c28655q.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = new C39611k(21);
                                    c28655q.m87172p0(objM87133R5);
                                }
                                function10 = (Function1) objM87133R5;
                                i38 = i26;
                            } else {
                                i38 = i26;
                                function10 = function2;
                            }
                            if (i38 != 0) {
                                objM87133R4 = c28655q.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C39611k(22);
                                    c28655q.m87172p0(objM87133R4);
                                }
                                function11 = (Function1) objM87133R4;
                                i39 = i28;
                            } else {
                                i39 = i28;
                                function11 = function3;
                            }
                            if (i39 != 0) {
                                z24 = false;
                            } else {
                                z24 = z15;
                            }
                            if (i35 != 0) {
                                objM87133R3 = c28655q.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C39611k(23);
                                    c28655q.m87172p0(objM87133R3);
                                }
                                function12 = (Function1) objM87133R3;
                            } else {
                                function12 = function4;
                            }
                            Object[] objArr = new Object[0];
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C39681c(9);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R, c28655q, 48);
                            if (viewState instanceof AbstractC37636q.c) {
                                c28655q.m87150e0(450464751);
                                AbstractC37636q.c cVar = (AbstractC37636q.c) viewState;
                                m127433I(cVar, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                                str4 = str3;
                                z25 = z19;
                                function19 = function9;
                                function20 = function10;
                                function15 = function11;
                                z26 = z24;
                                function16 = function12;
                                c37631lM120958e = cVar.getSummary();
                                if (c37631lM120958e == null) {
                                    c28655q.m87150e0(450897851);
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(450897852);
                                    if (m127429E(interfaceC28601c1)) {
                                        c28655q.m87150e0(208296225);
                                        c28655q.m87173q(false);
                                    } else {
                                        c28655q.m87150e0(208006964);
                                        if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                            function19.invoke(AbstractC37634o.b.f161089a);
                                        }
                                        function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                                        c28655q.m87173q(false);
                                    }
                                    m127430F(interfaceC28601c1, true);
                                    c28655q.m87173q(false);
                                }
                                c28655q.m87173q(false);
                                function17 = function19;
                                function18 = function20;
                            } else {
                                str4 = str3;
                                z25 = z19;
                                function13 = function9;
                                function14 = function10;
                                function15 = function11;
                                z26 = z24;
                                function16 = function12;
                                if (viewState instanceof AbstractC37636q.a) {
                                    c28655q.m87150e0(451356435);
                                    AbstractC33208p0.b bVar = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                                    TextResource textResourceM21278l = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                                    if ((i37 & 7168) == 2048) {
                                        z27 = true;
                                    } else {
                                        z27 = false;
                                    }
                                    if ((i37 & 14) == 4) {
                                        z28 = true;
                                    } else {
                                        z28 = false;
                                    }
                                    z29 = z27 | z28;
                                    objM87133R2 = c28655q.m87133R();
                                    if (z29 || objM87133R2 == c28676v0) {
                                        objM87133R2 = new C39689b(3, function13, viewState);
                                        c28655q.m87172p0(objM87133R2);
                                    }
                                    int i45 = AbstractC33208p0.b.f138467h;
                                    int i46 = TextResource.$stable;
                                    function18 = function14;
                                    function17 = function13;
                                    AbstractC33199m0.m105214F(bVar, textResourceM21278l, null, textResourceM21278l2, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i45 | (i46 << 3) | (i46 << 9), 6, 3044);
                                    c28655q.m87173q(false);
                                } else {
                                    function17 = function13;
                                    function18 = function14;
                                    if (viewState instanceof AbstractC37636q.b) {
                                        throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                                    }
                                    c28655q.m87150e0(-2063631847);
                                    m127479w(c28655q, 0);
                                    c28655q.m87173q(false);
                                }
                            }
                            function6 = function18;
                            function5 = function17;
                            str2 = str4;
                            z17 = z25;
                            function7 = function15;
                            z18 = z26;
                            function8 = function16;
                        } else {
                            c28655q.m87138X();
                            str2 = str;
                            function5 = function1;
                            function6 = function2;
                            function7 = function3;
                            function8 = function4;
                            z17 = z14;
                            z18 = z15;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
                        }
                    }
                    i15 |= 24576;
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function3)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                        z15 = z13;
                    } else {
                        z15 = z13;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q.m87155h(z15)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                    }
                    i34 = i15;
                    i35 = i14 & 128;
                    if (i35 != 0) {
                        i34 |= 12582912;
                    } else if ((i13 & 12582912) != 0) {
                        if (c28655q.m87157i(function4)) {
                            i36 = 8388608;
                        } else {
                            i36 = 4194304;
                        }
                        i34 |= i36;
                    }
                    i37 = i34;
                    if ((i37 & 4793491) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i37 & 1, z16)) {
                        if (i44 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i16 != 0) {
                            z19 = true;
                        } else {
                            z19 = z14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C39611k(19);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function9 = (Function1) objM87133R6;
                        } else {
                            function9 = function1;
                        }
                        if (i24 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C39611k(21);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function10 = (Function1) objM87133R5;
                            i38 = i26;
                        } else {
                            i38 = i26;
                            function10 = function2;
                        }
                        if (i38 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C39611k(22);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function11 = (Function1) objM87133R4;
                            i39 = i28;
                        } else {
                            i39 = i28;
                            function11 = function3;
                        }
                        if (i39 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i35 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C39611k(23);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function12 = (Function1) objM87133R3;
                        } else {
                            function12 = function4;
                        }
                        Object[] objArr2 = new Object[0];
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39681c(9);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R, c28655q, 48);
                        if (viewState instanceof AbstractC37636q.c) {
                            c28655q.m87150e0(450464751);
                            AbstractC37636q.c cVar2 = (AbstractC37636q.c) viewState;
                            m127433I(cVar2, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                            str4 = str3;
                            z25 = z19;
                            function19 = function9;
                            function20 = function10;
                            function15 = function11;
                            z26 = z24;
                            function16 = function12;
                            c37631lM120958e = cVar2.getSummary();
                            if (c37631lM120958e == null) {
                                c28655q.m87150e0(450897851);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(450897852);
                                if (m127429E(interfaceC28601c1)) {
                                    c28655q.m87150e0(208006964);
                                    if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                        function19.invoke(AbstractC37634o.b.f161089a);
                                    }
                                    function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(208296225);
                                    c28655q.m87173q(false);
                                }
                                m127430F(interfaceC28601c1, true);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                            function17 = function19;
                            function18 = function20;
                        } else {
                            str4 = str3;
                            z25 = z19;
                            function13 = function9;
                            function14 = function10;
                            function15 = function11;
                            z26 = z24;
                            function16 = function12;
                            if (viewState instanceof AbstractC37636q.a) {
                                c28655q.m87150e0(451356435);
                                AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                                if ((i37 & 7168) == 2048) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                if ((i37 & 14) == 4) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                z29 = z27 | z28;
                                objM87133R2 = c28655q.m87133R();
                                if (z29) {
                                    objM87133R2 = new C39689b(3, function13, viewState);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C39689b(3, function13, viewState);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                int i47 = AbstractC33208p0.b.f138467h;
                                int i48 = TextResource.$stable;
                                function18 = function14;
                                function17 = function13;
                                AbstractC33199m0.m105214F(bVar2, textResourceM21278l3, null, textResourceM21278l4, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i47 | (i48 << 3) | (i48 << 9), 6, 3044);
                                c28655q.m87173q(false);
                            } else {
                                function17 = function13;
                                function18 = function14;
                                if (viewState instanceof AbstractC37636q.b) {
                                    throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                                }
                                c28655q.m87150e0(-2063631847);
                                m127479w(c28655q, 0);
                                c28655q.m87173q(false);
                            }
                        }
                        function6 = function18;
                        function5 = function17;
                        str2 = str4;
                        z17 = z25;
                        function7 = function15;
                        z18 = z26;
                        function8 = function16;
                    } else {
                        c28655q.m87138X();
                        str2 = str;
                        function5 = function1;
                        function6 = function2;
                        function7 = function3;
                        function8 = function4;
                        z17 = z14;
                        z18 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
                    }
                }
                i15 |= 3072;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87157i(function2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function3)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                        z15 = z13;
                    } else {
                        z15 = z13;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q.m87155h(z15)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                    }
                    i34 = i15;
                    i35 = i14 & 128;
                    if (i35 != 0) {
                        i34 |= 12582912;
                    } else if ((i13 & 12582912) != 0) {
                        if (c28655q.m87157i(function4)) {
                            i36 = 8388608;
                        } else {
                            i36 = 4194304;
                        }
                        i34 |= i36;
                    }
                    i37 = i34;
                    if ((i37 & 4793491) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i37 & 1, z16)) {
                        if (i44 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i16 != 0) {
                            z19 = true;
                        } else {
                            z19 = z14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C39611k(19);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function9 = (Function1) objM87133R6;
                        } else {
                            function9 = function1;
                        }
                        if (i24 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C39611k(21);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function10 = (Function1) objM87133R5;
                            i38 = i26;
                        } else {
                            i38 = i26;
                            function10 = function2;
                        }
                        if (i38 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C39611k(22);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function11 = (Function1) objM87133R4;
                            i39 = i28;
                        } else {
                            i39 = i28;
                            function11 = function3;
                        }
                        if (i39 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i35 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C39611k(23);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function12 = (Function1) objM87133R3;
                        } else {
                            function12 = function4;
                        }
                        Object[] objArr3 = new Object[0];
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39681c(9);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr3, (InterfaceC4339a) objM87133R, c28655q, 48);
                        if (viewState instanceof AbstractC37636q.c) {
                            c28655q.m87150e0(450464751);
                            AbstractC37636q.c cVar3 = (AbstractC37636q.c) viewState;
                            m127433I(cVar3, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                            str4 = str3;
                            z25 = z19;
                            function19 = function9;
                            function20 = function10;
                            function15 = function11;
                            z26 = z24;
                            function16 = function12;
                            c37631lM120958e = cVar3.getSummary();
                            if (c37631lM120958e == null) {
                                c28655q.m87150e0(450897851);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(450897852);
                                if (m127429E(interfaceC28601c1)) {
                                    c28655q.m87150e0(208006964);
                                    if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                        function19.invoke(AbstractC37634o.b.f161089a);
                                    }
                                    function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(208296225);
                                    c28655q.m87173q(false);
                                }
                                m127430F(interfaceC28601c1, true);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                            function17 = function19;
                            function18 = function20;
                        } else {
                            str4 = str3;
                            z25 = z19;
                            function13 = function9;
                            function14 = function10;
                            function15 = function11;
                            z26 = z24;
                            function16 = function12;
                            if (viewState instanceof AbstractC37636q.a) {
                                c28655q.m87150e0(451356435);
                                AbstractC33208p0.b bVar3 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                                if ((i37 & 7168) == 2048) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                if ((i37 & 14) == 4) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                z29 = z27 | z28;
                                objM87133R2 = c28655q.m87133R();
                                if (z29) {
                                    objM87133R2 = new C39689b(3, function13, viewState);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C39689b(3, function13, viewState);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                int i49 = AbstractC33208p0.b.f138467h;
                                int i410 = TextResource.$stable;
                                function18 = function14;
                                function17 = function13;
                                AbstractC33199m0.m105214F(bVar3, textResourceM21278l5, null, textResourceM21278l6, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i49 | (i410 << 3) | (i410 << 9), 6, 3044);
                                c28655q.m87173q(false);
                            } else {
                                function17 = function13;
                                function18 = function14;
                                if (viewState instanceof AbstractC37636q.b) {
                                    throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                                }
                                c28655q.m87150e0(-2063631847);
                                m127479w(c28655q, 0);
                                c28655q.m87173q(false);
                            }
                        }
                        function6 = function18;
                        function5 = function17;
                        str2 = str4;
                        z17 = z25;
                        function7 = function15;
                        z18 = z26;
                        function8 = function16;
                    } else {
                        c28655q.m87138X();
                        str2 = str;
                        function5 = function1;
                        function6 = function2;
                        function7 = function3;
                        function8 = function4;
                        z17 = z14;
                        z18 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
                    }
                }
                i15 |= 24576;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    z15 = z13;
                } else {
                    z15 = z13;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87155h(z15)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                i34 = i15;
                i35 = i14 & 128;
                if (i35 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 12582912) != 0) {
                    if (c28655q.m87157i(function4)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i34 |= i36;
                }
                i37 = i34;
                if ((i37 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i37 & 1, z16)) {
                    if (i44 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C39611k(19);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function9 = (Function1) objM87133R6;
                    } else {
                        function9 = function1;
                    }
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39611k(21);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                        i38 = i26;
                    } else {
                        i38 = i26;
                        function10 = function2;
                    }
                    if (i38 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39611k(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                        i39 = i28;
                    } else {
                        i39 = i28;
                        function11 = function3;
                    }
                    if (i39 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i35 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39611k(23);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function4;
                    }
                    Object[] objArr4 = new Object[0];
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39681c(9);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr4, (InterfaceC4339a) objM87133R, c28655q, 48);
                    if (viewState instanceof AbstractC37636q.c) {
                        c28655q.m87150e0(450464751);
                        AbstractC37636q.c cVar4 = (AbstractC37636q.c) viewState;
                        m127433I(cVar4, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                        str4 = str3;
                        z25 = z19;
                        function19 = function9;
                        function20 = function10;
                        function15 = function11;
                        z26 = z24;
                        function16 = function12;
                        c37631lM120958e = cVar4.getSummary();
                        if (c37631lM120958e == null) {
                            c28655q.m87150e0(450897851);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(450897852);
                            if (m127429E(interfaceC28601c1)) {
                                c28655q.m87150e0(208006964);
                                if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                    function19.invoke(AbstractC37634o.b.f161089a);
                                }
                                function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(208296225);
                                c28655q.m87173q(false);
                            }
                            m127430F(interfaceC28601c1, true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        function17 = function19;
                        function18 = function20;
                    } else {
                        str4 = str3;
                        z25 = z19;
                        function13 = function9;
                        function14 = function10;
                        function15 = function11;
                        z26 = z24;
                        function16 = function12;
                        if (viewState instanceof AbstractC37636q.a) {
                            c28655q.m87150e0(451356435);
                            AbstractC33208p0.b bVar4 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                            if ((i37 & 7168) == 2048) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            if ((i37 & 14) == 4) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            z29 = z27 | z28;
                            objM87133R2 = c28655q.m87133R();
                            if (z29) {
                                objM87133R2 = new C39689b(3, function13, viewState);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C39689b(3, function13, viewState);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i411 = AbstractC33208p0.b.f138467h;
                            int i412 = TextResource.$stable;
                            function18 = function14;
                            function17 = function13;
                            AbstractC33199m0.m105214F(bVar4, textResourceM21278l7, null, textResourceM21278l8, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i411 | (i412 << 3) | (i412 << 9), 6, 3044);
                            c28655q.m87173q(false);
                        } else {
                            function17 = function13;
                            function18 = function14;
                            if (viewState instanceof AbstractC37636q.b) {
                                throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                            }
                            c28655q.m87150e0(-2063631847);
                            m127479w(c28655q, 0);
                            c28655q.m87173q(false);
                        }
                    }
                    function6 = function18;
                    function5 = function17;
                    str2 = str4;
                    z17 = z25;
                    function7 = function15;
                    z18 = z26;
                    function8 = function16;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    function5 = function1;
                    function6 = function2;
                    function7 = function3;
                    function8 = function4;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
                }
            }
            i15 |= 384;
            z14 = z4;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87157i(function2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function3)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                        z15 = z13;
                    } else {
                        z15 = z13;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q.m87155h(z15)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                    }
                    i34 = i15;
                    i35 = i14 & 128;
                    if (i35 != 0) {
                        i34 |= 12582912;
                    } else if ((i13 & 12582912) != 0) {
                        if (c28655q.m87157i(function4)) {
                            i36 = 8388608;
                        } else {
                            i36 = 4194304;
                        }
                        i34 |= i36;
                    }
                    i37 = i34;
                    if ((i37 & 4793491) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i37 & 1, z16)) {
                        if (i44 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i16 != 0) {
                            z19 = true;
                        } else {
                            z19 = z14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C39611k(19);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function9 = (Function1) objM87133R6;
                        } else {
                            function9 = function1;
                        }
                        if (i24 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C39611k(21);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function10 = (Function1) objM87133R5;
                            i38 = i26;
                        } else {
                            i38 = i26;
                            function10 = function2;
                        }
                        if (i38 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C39611k(22);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function11 = (Function1) objM87133R4;
                            i39 = i28;
                        } else {
                            i39 = i28;
                            function11 = function3;
                        }
                        if (i39 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i35 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C39611k(23);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function12 = (Function1) objM87133R3;
                        } else {
                            function12 = function4;
                        }
                        Object[] objArr5 = new Object[0];
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39681c(9);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr5, (InterfaceC4339a) objM87133R, c28655q, 48);
                        if (viewState instanceof AbstractC37636q.c) {
                            c28655q.m87150e0(450464751);
                            AbstractC37636q.c cVar5 = (AbstractC37636q.c) viewState;
                            m127433I(cVar5, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                            str4 = str3;
                            z25 = z19;
                            function19 = function9;
                            function20 = function10;
                            function15 = function11;
                            z26 = z24;
                            function16 = function12;
                            c37631lM120958e = cVar5.getSummary();
                            if (c37631lM120958e == null) {
                                c28655q.m87150e0(450897851);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(450897852);
                                if (m127429E(interfaceC28601c1)) {
                                    c28655q.m87150e0(208006964);
                                    if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                        function19.invoke(AbstractC37634o.b.f161089a);
                                    }
                                    function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(208296225);
                                    c28655q.m87173q(false);
                                }
                                m127430F(interfaceC28601c1, true);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                            function17 = function19;
                            function18 = function20;
                        } else {
                            str4 = str3;
                            z25 = z19;
                            function13 = function9;
                            function14 = function10;
                            function15 = function11;
                            z26 = z24;
                            function16 = function12;
                            if (viewState instanceof AbstractC37636q.a) {
                                c28655q.m87150e0(451356435);
                                AbstractC33208p0.b bVar5 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                                TextResource textResourceM21278l9 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                                TextResource textResourceM21278l10 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                                if ((i37 & 7168) == 2048) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                if ((i37 & 14) == 4) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                z29 = z27 | z28;
                                objM87133R2 = c28655q.m87133R();
                                if (z29) {
                                    objM87133R2 = new C39689b(3, function13, viewState);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C39689b(3, function13, viewState);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                int i413 = AbstractC33208p0.b.f138467h;
                                int i414 = TextResource.$stable;
                                function18 = function14;
                                function17 = function13;
                                AbstractC33199m0.m105214F(bVar5, textResourceM21278l9, null, textResourceM21278l10, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i413 | (i414 << 3) | (i414 << 9), 6, 3044);
                                c28655q.m87173q(false);
                            } else {
                                function17 = function13;
                                function18 = function14;
                                if (viewState instanceof AbstractC37636q.b) {
                                    throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                                }
                                c28655q.m87150e0(-2063631847);
                                m127479w(c28655q, 0);
                                c28655q.m87173q(false);
                            }
                        }
                        function6 = function18;
                        function5 = function17;
                        str2 = str4;
                        z17 = z25;
                        function7 = function15;
                        z18 = z26;
                        function8 = function16;
                    } else {
                        c28655q.m87138X();
                        str2 = str;
                        function5 = function1;
                        function6 = function2;
                        function7 = function3;
                        function8 = function4;
                        z17 = z14;
                        z18 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
                    }
                }
                i15 |= 24576;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    z15 = z13;
                } else {
                    z15 = z13;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87155h(z15)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                i34 = i15;
                i35 = i14 & 128;
                if (i35 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 12582912) != 0) {
                    if (c28655q.m87157i(function4)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i34 |= i36;
                }
                i37 = i34;
                if ((i37 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i37 & 1, z16)) {
                    if (i44 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C39611k(19);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function9 = (Function1) objM87133R6;
                    } else {
                        function9 = function1;
                    }
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39611k(21);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                        i38 = i26;
                    } else {
                        i38 = i26;
                        function10 = function2;
                    }
                    if (i38 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39611k(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                        i39 = i28;
                    } else {
                        i39 = i28;
                        function11 = function3;
                    }
                    if (i39 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i35 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39611k(23);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function4;
                    }
                    Object[] objArr6 = new Object[0];
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39681c(9);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr6, (InterfaceC4339a) objM87133R, c28655q, 48);
                    if (viewState instanceof AbstractC37636q.c) {
                        c28655q.m87150e0(450464751);
                        AbstractC37636q.c cVar6 = (AbstractC37636q.c) viewState;
                        m127433I(cVar6, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                        str4 = str3;
                        z25 = z19;
                        function19 = function9;
                        function20 = function10;
                        function15 = function11;
                        z26 = z24;
                        function16 = function12;
                        c37631lM120958e = cVar6.getSummary();
                        if (c37631lM120958e == null) {
                            c28655q.m87150e0(450897851);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(450897852);
                            if (m127429E(interfaceC28601c1)) {
                                c28655q.m87150e0(208006964);
                                if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                    function19.invoke(AbstractC37634o.b.f161089a);
                                }
                                function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(208296225);
                                c28655q.m87173q(false);
                            }
                            m127430F(interfaceC28601c1, true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        function17 = function19;
                        function18 = function20;
                    } else {
                        str4 = str3;
                        z25 = z19;
                        function13 = function9;
                        function14 = function10;
                        function15 = function11;
                        z26 = z24;
                        function16 = function12;
                        if (viewState instanceof AbstractC37636q.a) {
                            c28655q.m87150e0(451356435);
                            AbstractC33208p0.b bVar6 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                            TextResource textResourceM21278l11 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                            TextResource textResourceM21278l12 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                            if ((i37 & 7168) == 2048) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            if ((i37 & 14) == 4) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            z29 = z27 | z28;
                            objM87133R2 = c28655q.m87133R();
                            if (z29) {
                                objM87133R2 = new C39689b(3, function13, viewState);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C39689b(3, function13, viewState);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i415 = AbstractC33208p0.b.f138467h;
                            int i416 = TextResource.$stable;
                            function18 = function14;
                            function17 = function13;
                            AbstractC33199m0.m105214F(bVar6, textResourceM21278l11, null, textResourceM21278l12, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i415 | (i416 << 3) | (i416 << 9), 6, 3044);
                            c28655q.m87173q(false);
                        } else {
                            function17 = function13;
                            function18 = function14;
                            if (viewState instanceof AbstractC37636q.b) {
                                throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                            }
                            c28655q.m87150e0(-2063631847);
                            m127479w(c28655q, 0);
                            c28655q.m87173q(false);
                        }
                    }
                    function6 = function18;
                    function5 = function17;
                    str2 = str4;
                    z17 = z25;
                    function7 = function15;
                    z18 = z26;
                    function8 = function16;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    function5 = function1;
                    function6 = function2;
                    function7 = function3;
                    function8 = function4;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
                }
            }
            i15 |= 3072;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(function2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    z15 = z13;
                } else {
                    z15 = z13;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87155h(z15)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                i34 = i15;
                i35 = i14 & 128;
                if (i35 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 12582912) != 0) {
                    if (c28655q.m87157i(function4)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i34 |= i36;
                }
                i37 = i34;
                if ((i37 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i37 & 1, z16)) {
                    if (i44 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C39611k(19);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function9 = (Function1) objM87133R6;
                    } else {
                        function9 = function1;
                    }
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39611k(21);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                        i38 = i26;
                    } else {
                        i38 = i26;
                        function10 = function2;
                    }
                    if (i38 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39611k(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                        i39 = i28;
                    } else {
                        i39 = i28;
                        function11 = function3;
                    }
                    if (i39 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i35 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39611k(23);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function4;
                    }
                    Object[] objArr7 = new Object[0];
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39681c(9);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr7, (InterfaceC4339a) objM87133R, c28655q, 48);
                    if (viewState instanceof AbstractC37636q.c) {
                        c28655q.m87150e0(450464751);
                        AbstractC37636q.c cVar7 = (AbstractC37636q.c) viewState;
                        m127433I(cVar7, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                        str4 = str3;
                        z25 = z19;
                        function19 = function9;
                        function20 = function10;
                        function15 = function11;
                        z26 = z24;
                        function16 = function12;
                        c37631lM120958e = cVar7.getSummary();
                        if (c37631lM120958e == null) {
                            c28655q.m87150e0(450897851);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(450897852);
                            if (m127429E(interfaceC28601c1)) {
                                c28655q.m87150e0(208006964);
                                if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                    function19.invoke(AbstractC37634o.b.f161089a);
                                }
                                function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(208296225);
                                c28655q.m87173q(false);
                            }
                            m127430F(interfaceC28601c1, true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        function17 = function19;
                        function18 = function20;
                    } else {
                        str4 = str3;
                        z25 = z19;
                        function13 = function9;
                        function14 = function10;
                        function15 = function11;
                        z26 = z24;
                        function16 = function12;
                        if (viewState instanceof AbstractC37636q.a) {
                            c28655q.m87150e0(451356435);
                            AbstractC33208p0.b bVar7 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                            TextResource textResourceM21278l13 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                            TextResource textResourceM21278l14 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                            if ((i37 & 7168) == 2048) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            if ((i37 & 14) == 4) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            z29 = z27 | z28;
                            objM87133R2 = c28655q.m87133R();
                            if (z29) {
                                objM87133R2 = new C39689b(3, function13, viewState);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C39689b(3, function13, viewState);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i417 = AbstractC33208p0.b.f138467h;
                            int i418 = TextResource.$stable;
                            function18 = function14;
                            function17 = function13;
                            AbstractC33199m0.m105214F(bVar7, textResourceM21278l13, null, textResourceM21278l14, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i417 | (i418 << 3) | (i418 << 9), 6, 3044);
                            c28655q.m87173q(false);
                        } else {
                            function17 = function13;
                            function18 = function14;
                            if (viewState instanceof AbstractC37636q.b) {
                                throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                            }
                            c28655q.m87150e0(-2063631847);
                            m127479w(c28655q, 0);
                            c28655q.m87173q(false);
                        }
                    }
                    function6 = function18;
                    function5 = function17;
                    str2 = str4;
                    z17 = z25;
                    function7 = function15;
                    z18 = z26;
                    function8 = function16;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    function5 = function1;
                    function6 = function2;
                    function7 = function3;
                    function8 = function4;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
                }
            }
            i15 |= 24576;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(function3)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
                z15 = z13;
            } else {
                z15 = z13;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z15)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
            }
            i34 = i15;
            i35 = i14 & 128;
            if (i35 != 0) {
                i34 |= 12582912;
            } else if ((i13 & 12582912) != 0) {
                if (c28655q.m87157i(function4)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i34 |= i36;
            }
            i37 = i34;
            if ((i37 & 4793491) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i37 & 1, z16)) {
                if (i44 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i16 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C39611k(19);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function9 = (Function1) objM87133R6;
                } else {
                    function9 = function1;
                }
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39611k(21);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                    i38 = i26;
                } else {
                    i38 = i26;
                    function10 = function2;
                }
                if (i38 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39611k(22);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                    i39 = i28;
                } else {
                    i39 = i28;
                    function11 = function3;
                }
                if (i39 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i35 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39611k(23);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function12 = (Function1) objM87133R3;
                } else {
                    function12 = function4;
                }
                Object[] objArr8 = new Object[0];
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39681c(9);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr8, (InterfaceC4339a) objM87133R, c28655q, 48);
                if (viewState instanceof AbstractC37636q.c) {
                    c28655q.m87150e0(450464751);
                    AbstractC37636q.c cVar8 = (AbstractC37636q.c) viewState;
                    m127433I(cVar8, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                    str4 = str3;
                    z25 = z19;
                    function19 = function9;
                    function20 = function10;
                    function15 = function11;
                    z26 = z24;
                    function16 = function12;
                    c37631lM120958e = cVar8.getSummary();
                    if (c37631lM120958e == null) {
                        c28655q.m87150e0(450897851);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(450897852);
                        if (m127429E(interfaceC28601c1)) {
                            c28655q.m87150e0(208006964);
                            if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                function19.invoke(AbstractC37634o.b.f161089a);
                            }
                            function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(208296225);
                            c28655q.m87173q(false);
                        }
                        m127430F(interfaceC28601c1, true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    function17 = function19;
                    function18 = function20;
                } else {
                    str4 = str3;
                    z25 = z19;
                    function13 = function9;
                    function14 = function10;
                    function15 = function11;
                    z26 = z24;
                    function16 = function12;
                    if (viewState instanceof AbstractC37636q.a) {
                        c28655q.m87150e0(451356435);
                        AbstractC33208p0.b bVar8 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                        TextResource textResourceM21278l15 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                        TextResource textResourceM21278l16 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                        if ((i37 & 7168) == 2048) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        if ((i37 & 14) == 4) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = z27 | z28;
                        objM87133R2 = c28655q.m87133R();
                        if (z29) {
                            objM87133R2 = new C39689b(3, function13, viewState);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C39689b(3, function13, viewState);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i419 = AbstractC33208p0.b.f138467h;
                        int i4110 = TextResource.$stable;
                        function18 = function14;
                        function17 = function13;
                        AbstractC33199m0.m105214F(bVar8, textResourceM21278l15, null, textResourceM21278l16, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i419 | (i4110 << 3) | (i4110 << 9), 6, 3044);
                        c28655q.m87173q(false);
                    } else {
                        function17 = function13;
                        function18 = function14;
                        if (viewState instanceof AbstractC37636q.b) {
                            throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                        }
                        c28655q.m87150e0(-2063631847);
                        m127479w(c28655q, 0);
                        c28655q.m87173q(false);
                    }
                }
                function6 = function18;
                function5 = function17;
                str2 = str4;
                z17 = z25;
                function7 = function15;
                z18 = z26;
                function8 = function16;
            } else {
                c28655q.m87138X();
                str2 = str;
                function5 = function1;
                function6 = function2;
                function7 = function3;
                function8 = function4;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
            }
        }
        i15 |= 48;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z14 = z4;
                if (c28655q.m87155h(z14)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q.m87157i(function1)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        if (c28655q.m87157i(function2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    i26 = i14 & 32;
                    if (i26 != 0) {
                        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q.m87157i(function3)) {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i27;
                    }
                    i28 = i14 & 64;
                    if (i28 != 0) {
                        i15 |= 1572864;
                        z15 = z13;
                    } else {
                        z15 = z13;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q.m87155h(z15)) {
                                i29 = 1048576;
                            } else {
                                i29 = 524288;
                            }
                            i15 |= i29;
                        }
                    }
                    i34 = i15;
                    i35 = i14 & 128;
                    if (i35 != 0) {
                        i34 |= 12582912;
                    } else if ((i13 & 12582912) != 0) {
                        if (c28655q.m87157i(function4)) {
                            i36 = 8388608;
                        } else {
                            i36 = 4194304;
                        }
                        i34 |= i36;
                    }
                    i37 = i34;
                    if ((i37 & 4793491) != 4793490) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i37 & 1, z16)) {
                        if (i44 != 0) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        if (i16 != 0) {
                            z19 = true;
                        } else {
                            z19 = z14;
                        }
                        c28676v0 = C28635l.f115821a;
                        if (i18 != 0) {
                            objM87133R6 = c28655q.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C39611k(19);
                                c28655q.m87172p0(objM87133R6);
                            }
                            function9 = (Function1) objM87133R6;
                        } else {
                            function9 = function1;
                        }
                        if (i24 != 0) {
                            objM87133R5 = c28655q.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C39611k(21);
                                c28655q.m87172p0(objM87133R5);
                            }
                            function10 = (Function1) objM87133R5;
                            i38 = i26;
                        } else {
                            i38 = i26;
                            function10 = function2;
                        }
                        if (i38 != 0) {
                            objM87133R4 = c28655q.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C39611k(22);
                                c28655q.m87172p0(objM87133R4);
                            }
                            function11 = (Function1) objM87133R4;
                            i39 = i28;
                        } else {
                            i39 = i28;
                            function11 = function3;
                        }
                        if (i39 != 0) {
                            z24 = false;
                        } else {
                            z24 = z15;
                        }
                        if (i35 != 0) {
                            objM87133R3 = c28655q.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C39611k(23);
                                c28655q.m87172p0(objM87133R3);
                            }
                            function12 = (Function1) objM87133R3;
                        } else {
                            function12 = function4;
                        }
                        Object[] objArr9 = new Object[0];
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C39681c(9);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr9, (InterfaceC4339a) objM87133R, c28655q, 48);
                        if (viewState instanceof AbstractC37636q.c) {
                            c28655q.m87150e0(450464751);
                            AbstractC37636q.c cVar9 = (AbstractC37636q.c) viewState;
                            m127433I(cVar9, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                            str4 = str3;
                            z25 = z19;
                            function19 = function9;
                            function20 = function10;
                            function15 = function11;
                            z26 = z24;
                            function16 = function12;
                            c37631lM120958e = cVar9.getSummary();
                            if (c37631lM120958e == null) {
                                c28655q.m87150e0(450897851);
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(450897852);
                                if (m127429E(interfaceC28601c1)) {
                                    c28655q.m87150e0(208006964);
                                    if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                        function19.invoke(AbstractC37634o.b.f161089a);
                                    }
                                    function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                                    c28655q.m87173q(false);
                                } else {
                                    c28655q.m87150e0(208296225);
                                    c28655q.m87173q(false);
                                }
                                m127430F(interfaceC28601c1, true);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(false);
                            function17 = function19;
                            function18 = function20;
                        } else {
                            str4 = str3;
                            z25 = z19;
                            function13 = function9;
                            function14 = function10;
                            function15 = function11;
                            z26 = z24;
                            function16 = function12;
                            if (viewState instanceof AbstractC37636q.a) {
                                c28655q.m87150e0(451356435);
                                AbstractC33208p0.b bVar9 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                                TextResource textResourceM21278l17 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                                TextResource textResourceM21278l18 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                                if ((i37 & 7168) == 2048) {
                                    z27 = true;
                                } else {
                                    z27 = false;
                                }
                                if ((i37 & 14) == 4) {
                                    z28 = true;
                                } else {
                                    z28 = false;
                                }
                                z29 = z27 | z28;
                                objM87133R2 = c28655q.m87133R();
                                if (z29) {
                                    objM87133R2 = new C39689b(3, function13, viewState);
                                    c28655q.m87172p0(objM87133R2);
                                } else {
                                    objM87133R2 = new C39689b(3, function13, viewState);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                int i4111 = AbstractC33208p0.b.f138467h;
                                int i4112 = TextResource.$stable;
                                function18 = function14;
                                function17 = function13;
                                AbstractC33199m0.m105214F(bVar9, textResourceM21278l17, null, textResourceM21278l18, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i4111 | (i4112 << 3) | (i4112 << 9), 6, 3044);
                                c28655q.m87173q(false);
                            } else {
                                function17 = function13;
                                function18 = function14;
                                if (viewState instanceof AbstractC37636q.b) {
                                    throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                                }
                                c28655q.m87150e0(-2063631847);
                                m127479w(c28655q, 0);
                                c28655q.m87173q(false);
                            }
                        }
                        function6 = function18;
                        function5 = function17;
                        str2 = str4;
                        z17 = z25;
                        function7 = function15;
                        z18 = z26;
                        function8 = function16;
                    } else {
                        c28655q.m87138X();
                        str2 = str;
                        function5 = function1;
                        function6 = function2;
                        function7 = function3;
                        function8 = function4;
                        z17 = z14;
                        z18 = z15;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
                    }
                }
                i15 |= 24576;
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    z15 = z13;
                } else {
                    z15 = z13;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87155h(z15)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                i34 = i15;
                i35 = i14 & 128;
                if (i35 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 12582912) != 0) {
                    if (c28655q.m87157i(function4)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i34 |= i36;
                }
                i37 = i34;
                if ((i37 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i37 & 1, z16)) {
                    if (i44 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C39611k(19);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function9 = (Function1) objM87133R6;
                    } else {
                        function9 = function1;
                    }
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39611k(21);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                        i38 = i26;
                    } else {
                        i38 = i26;
                        function10 = function2;
                    }
                    if (i38 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39611k(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                        i39 = i28;
                    } else {
                        i39 = i28;
                        function11 = function3;
                    }
                    if (i39 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i35 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39611k(23);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function4;
                    }
                    Object[] objArr10 = new Object[0];
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39681c(9);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr10, (InterfaceC4339a) objM87133R, c28655q, 48);
                    if (viewState instanceof AbstractC37636q.c) {
                        c28655q.m87150e0(450464751);
                        AbstractC37636q.c cVar10 = (AbstractC37636q.c) viewState;
                        m127433I(cVar10, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                        str4 = str3;
                        z25 = z19;
                        function19 = function9;
                        function20 = function10;
                        function15 = function11;
                        z26 = z24;
                        function16 = function12;
                        c37631lM120958e = cVar10.getSummary();
                        if (c37631lM120958e == null) {
                            c28655q.m87150e0(450897851);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(450897852);
                            if (m127429E(interfaceC28601c1)) {
                                c28655q.m87150e0(208006964);
                                if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                    function19.invoke(AbstractC37634o.b.f161089a);
                                }
                                function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(208296225);
                                c28655q.m87173q(false);
                            }
                            m127430F(interfaceC28601c1, true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        function17 = function19;
                        function18 = function20;
                    } else {
                        str4 = str3;
                        z25 = z19;
                        function13 = function9;
                        function14 = function10;
                        function15 = function11;
                        z26 = z24;
                        function16 = function12;
                        if (viewState instanceof AbstractC37636q.a) {
                            c28655q.m87150e0(451356435);
                            AbstractC33208p0.b bVar10 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                            TextResource textResourceM21278l19 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                            TextResource textResourceM21278l110 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                            if ((i37 & 7168) == 2048) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            if ((i37 & 14) == 4) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            z29 = z27 | z28;
                            objM87133R2 = c28655q.m87133R();
                            if (z29) {
                                objM87133R2 = new C39689b(3, function13, viewState);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C39689b(3, function13, viewState);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i4113 = AbstractC33208p0.b.f138467h;
                            int i4114 = TextResource.$stable;
                            function18 = function14;
                            function17 = function13;
                            AbstractC33199m0.m105214F(bVar10, textResourceM21278l19, null, textResourceM21278l110, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i4113 | (i4114 << 3) | (i4114 << 9), 6, 3044);
                            c28655q.m87173q(false);
                        } else {
                            function17 = function13;
                            function18 = function14;
                            if (viewState instanceof AbstractC37636q.b) {
                                throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                            }
                            c28655q.m87150e0(-2063631847);
                            m127479w(c28655q, 0);
                            c28655q.m87173q(false);
                        }
                    }
                    function6 = function18;
                    function5 = function17;
                    str2 = str4;
                    z17 = z25;
                    function7 = function15;
                    z18 = z26;
                    function8 = function16;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    function5 = function1;
                    function6 = function2;
                    function7 = function3;
                    function8 = function4;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
                }
            }
            i15 |= 3072;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(function2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    z15 = z13;
                } else {
                    z15 = z13;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87155h(z15)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                i34 = i15;
                i35 = i14 & 128;
                if (i35 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 12582912) != 0) {
                    if (c28655q.m87157i(function4)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i34 |= i36;
                }
                i37 = i34;
                if ((i37 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i37 & 1, z16)) {
                    if (i44 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C39611k(19);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function9 = (Function1) objM87133R6;
                    } else {
                        function9 = function1;
                    }
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39611k(21);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                        i38 = i26;
                    } else {
                        i38 = i26;
                        function10 = function2;
                    }
                    if (i38 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39611k(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                        i39 = i28;
                    } else {
                        i39 = i28;
                        function11 = function3;
                    }
                    if (i39 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i35 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39611k(23);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function4;
                    }
                    Object[] objArr11 = new Object[0];
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39681c(9);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr11, (InterfaceC4339a) objM87133R, c28655q, 48);
                    if (viewState instanceof AbstractC37636q.c) {
                        c28655q.m87150e0(450464751);
                        AbstractC37636q.c cVar11 = (AbstractC37636q.c) viewState;
                        m127433I(cVar11, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                        str4 = str3;
                        z25 = z19;
                        function19 = function9;
                        function20 = function10;
                        function15 = function11;
                        z26 = z24;
                        function16 = function12;
                        c37631lM120958e = cVar11.getSummary();
                        if (c37631lM120958e == null) {
                            c28655q.m87150e0(450897851);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(450897852);
                            if (m127429E(interfaceC28601c1)) {
                                c28655q.m87150e0(208006964);
                                if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                    function19.invoke(AbstractC37634o.b.f161089a);
                                }
                                function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(208296225);
                                c28655q.m87173q(false);
                            }
                            m127430F(interfaceC28601c1, true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        function17 = function19;
                        function18 = function20;
                    } else {
                        str4 = str3;
                        z25 = z19;
                        function13 = function9;
                        function14 = function10;
                        function15 = function11;
                        z26 = z24;
                        function16 = function12;
                        if (viewState instanceof AbstractC37636q.a) {
                            c28655q.m87150e0(451356435);
                            AbstractC33208p0.b bVar11 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                            TextResource textResourceM21278l111 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                            TextResource textResourceM21278l112 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                            if ((i37 & 7168) == 2048) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            if ((i37 & 14) == 4) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            z29 = z27 | z28;
                            objM87133R2 = c28655q.m87133R();
                            if (z29) {
                                objM87133R2 = new C39689b(3, function13, viewState);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C39689b(3, function13, viewState);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i4115 = AbstractC33208p0.b.f138467h;
                            int i4116 = TextResource.$stable;
                            function18 = function14;
                            function17 = function13;
                            AbstractC33199m0.m105214F(bVar11, textResourceM21278l111, null, textResourceM21278l112, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i4115 | (i4116 << 3) | (i4116 << 9), 6, 3044);
                            c28655q.m87173q(false);
                        } else {
                            function17 = function13;
                            function18 = function14;
                            if (viewState instanceof AbstractC37636q.b) {
                                throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                            }
                            c28655q.m87150e0(-2063631847);
                            m127479w(c28655q, 0);
                            c28655q.m87173q(false);
                        }
                    }
                    function6 = function18;
                    function5 = function17;
                    str2 = str4;
                    z17 = z25;
                    function7 = function15;
                    z18 = z26;
                    function8 = function16;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    function5 = function1;
                    function6 = function2;
                    function7 = function3;
                    function8 = function4;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
                }
            }
            i15 |= 24576;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(function3)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
                z15 = z13;
            } else {
                z15 = z13;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z15)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
            }
            i34 = i15;
            i35 = i14 & 128;
            if (i35 != 0) {
                i34 |= 12582912;
            } else if ((i13 & 12582912) != 0) {
                if (c28655q.m87157i(function4)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i34 |= i36;
            }
            i37 = i34;
            if ((i37 & 4793491) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i37 & 1, z16)) {
                if (i44 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i16 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C39611k(19);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function9 = (Function1) objM87133R6;
                } else {
                    function9 = function1;
                }
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39611k(21);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                    i38 = i26;
                } else {
                    i38 = i26;
                    function10 = function2;
                }
                if (i38 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39611k(22);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                    i39 = i28;
                } else {
                    i39 = i28;
                    function11 = function3;
                }
                if (i39 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i35 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39611k(23);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function12 = (Function1) objM87133R3;
                } else {
                    function12 = function4;
                }
                Object[] objArr12 = new Object[0];
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39681c(9);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr12, (InterfaceC4339a) objM87133R, c28655q, 48);
                if (viewState instanceof AbstractC37636q.c) {
                    c28655q.m87150e0(450464751);
                    AbstractC37636q.c cVar12 = (AbstractC37636q.c) viewState;
                    m127433I(cVar12, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                    str4 = str3;
                    z25 = z19;
                    function19 = function9;
                    function20 = function10;
                    function15 = function11;
                    z26 = z24;
                    function16 = function12;
                    c37631lM120958e = cVar12.getSummary();
                    if (c37631lM120958e == null) {
                        c28655q.m87150e0(450897851);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(450897852);
                        if (m127429E(interfaceC28601c1)) {
                            c28655q.m87150e0(208006964);
                            if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                function19.invoke(AbstractC37634o.b.f161089a);
                            }
                            function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(208296225);
                            c28655q.m87173q(false);
                        }
                        m127430F(interfaceC28601c1, true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    function17 = function19;
                    function18 = function20;
                } else {
                    str4 = str3;
                    z25 = z19;
                    function13 = function9;
                    function14 = function10;
                    function15 = function11;
                    z26 = z24;
                    function16 = function12;
                    if (viewState instanceof AbstractC37636q.a) {
                        c28655q.m87150e0(451356435);
                        AbstractC33208p0.b bVar12 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                        TextResource textResourceM21278l113 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                        TextResource textResourceM21278l114 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                        if ((i37 & 7168) == 2048) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        if ((i37 & 14) == 4) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = z27 | z28;
                        objM87133R2 = c28655q.m87133R();
                        if (z29) {
                            objM87133R2 = new C39689b(3, function13, viewState);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C39689b(3, function13, viewState);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i4117 = AbstractC33208p0.b.f138467h;
                        int i4118 = TextResource.$stable;
                        function18 = function14;
                        function17 = function13;
                        AbstractC33199m0.m105214F(bVar12, textResourceM21278l113, null, textResourceM21278l114, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i4117 | (i4118 << 3) | (i4118 << 9), 6, 3044);
                        c28655q.m87173q(false);
                    } else {
                        function17 = function13;
                        function18 = function14;
                        if (viewState instanceof AbstractC37636q.b) {
                            throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                        }
                        c28655q.m87150e0(-2063631847);
                        m127479w(c28655q, 0);
                        c28655q.m87173q(false);
                    }
                }
                function6 = function18;
                function5 = function17;
                str2 = str4;
                z17 = z25;
                function7 = function15;
                z18 = z26;
                function8 = function16;
            } else {
                c28655q.m87138X();
                str2 = str;
                function5 = function1;
                function6 = function2;
                function7 = function3;
                function8 = function4;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
            }
        }
        i15 |= 384;
        z14 = z4;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q.m87157i(function1)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q.m87157i(function2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                i26 = i14 & 32;
                if (i26 != 0) {
                    i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q.m87157i(function3)) {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i27;
                }
                i28 = i14 & 64;
                if (i28 != 0) {
                    i15 |= 1572864;
                    z15 = z13;
                } else {
                    z15 = z13;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87155h(z15)) {
                            i29 = 1048576;
                        } else {
                            i29 = 524288;
                        }
                        i15 |= i29;
                    }
                }
                i34 = i15;
                i35 = i14 & 128;
                if (i35 != 0) {
                    i34 |= 12582912;
                } else if ((i13 & 12582912) != 0) {
                    if (c28655q.m87157i(function4)) {
                        i36 = 8388608;
                    } else {
                        i36 = 4194304;
                    }
                    i34 |= i36;
                }
                i37 = i34;
                if ((i37 & 4793491) != 4793490) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i37 & 1, z16)) {
                    if (i44 != 0) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    if (i16 != 0) {
                        z19 = true;
                    } else {
                        z19 = z14;
                    }
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0) {
                        objM87133R6 = c28655q.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C39611k(19);
                            c28655q.m87172p0(objM87133R6);
                        }
                        function9 = (Function1) objM87133R6;
                    } else {
                        function9 = function1;
                    }
                    if (i24 != 0) {
                        objM87133R5 = c28655q.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C39611k(21);
                            c28655q.m87172p0(objM87133R5);
                        }
                        function10 = (Function1) objM87133R5;
                        i38 = i26;
                    } else {
                        i38 = i26;
                        function10 = function2;
                    }
                    if (i38 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C39611k(22);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function11 = (Function1) objM87133R4;
                        i39 = i28;
                    } else {
                        i39 = i28;
                        function11 = function3;
                    }
                    if (i39 != 0) {
                        z24 = false;
                    } else {
                        z24 = z15;
                    }
                    if (i35 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C39611k(23);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function12 = (Function1) objM87133R3;
                    } else {
                        function12 = function4;
                    }
                    Object[] objArr13 = new Object[0];
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C39681c(9);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr13, (InterfaceC4339a) objM87133R, c28655q, 48);
                    if (viewState instanceof AbstractC37636q.c) {
                        c28655q.m87150e0(450464751);
                        AbstractC37636q.c cVar13 = (AbstractC37636q.c) viewState;
                        m127433I(cVar13, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                        str4 = str3;
                        z25 = z19;
                        function19 = function9;
                        function20 = function10;
                        function15 = function11;
                        z26 = z24;
                        function16 = function12;
                        c37631lM120958e = cVar13.getSummary();
                        if (c37631lM120958e == null) {
                            c28655q.m87150e0(450897851);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(450897852);
                            if (m127429E(interfaceC28601c1)) {
                                c28655q.m87150e0(208006964);
                                if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                    function19.invoke(AbstractC37634o.b.f161089a);
                                }
                                function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                                c28655q.m87173q(false);
                            } else {
                                c28655q.m87150e0(208296225);
                                c28655q.m87173q(false);
                            }
                            m127430F(interfaceC28601c1, true);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(false);
                        function17 = function19;
                        function18 = function20;
                    } else {
                        str4 = str3;
                        z25 = z19;
                        function13 = function9;
                        function14 = function10;
                        function15 = function11;
                        z26 = z24;
                        function16 = function12;
                        if (viewState instanceof AbstractC37636q.a) {
                            c28655q.m87150e0(451356435);
                            AbstractC33208p0.b bVar13 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                            TextResource textResourceM21278l115 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                            TextResource textResourceM21278l116 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                            if ((i37 & 7168) == 2048) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            if ((i37 & 14) == 4) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            z29 = z27 | z28;
                            objM87133R2 = c28655q.m87133R();
                            if (z29) {
                                objM87133R2 = new C39689b(3, function13, viewState);
                                c28655q.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C39689b(3, function13, viewState);
                                c28655q.m87172p0(objM87133R2);
                            }
                            int i4119 = AbstractC33208p0.b.f138467h;
                            int i41110 = TextResource.$stable;
                            function18 = function14;
                            function17 = function13;
                            AbstractC33199m0.m105214F(bVar13, textResourceM21278l115, null, textResourceM21278l116, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i4119 | (i41110 << 3) | (i41110 << 9), 6, 3044);
                            c28655q.m87173q(false);
                        } else {
                            function17 = function13;
                            function18 = function14;
                            if (viewState instanceof AbstractC37636q.b) {
                                throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                            }
                            c28655q.m87150e0(-2063631847);
                            m127479w(c28655q, 0);
                            c28655q.m87173q(false);
                        }
                    }
                    function6 = function18;
                    function5 = function17;
                    str2 = str4;
                    z17 = z25;
                    function7 = function15;
                    z18 = z26;
                    function8 = function16;
                } else {
                    c28655q.m87138X();
                    str2 = str;
                    function5 = function1;
                    function6 = function2;
                    function7 = function3;
                    function8 = function4;
                    z17 = z14;
                    z18 = z15;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
                }
            }
            i15 |= 24576;
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(function3)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
                z15 = z13;
            } else {
                z15 = z13;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z15)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
            }
            i34 = i15;
            i35 = i14 & 128;
            if (i35 != 0) {
                i34 |= 12582912;
            } else if ((i13 & 12582912) != 0) {
                if (c28655q.m87157i(function4)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i34 |= i36;
            }
            i37 = i34;
            if ((i37 & 4793491) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i37 & 1, z16)) {
                if (i44 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i16 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C39611k(19);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function9 = (Function1) objM87133R6;
                } else {
                    function9 = function1;
                }
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39611k(21);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                    i38 = i26;
                } else {
                    i38 = i26;
                    function10 = function2;
                }
                if (i38 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39611k(22);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                    i39 = i28;
                } else {
                    i39 = i28;
                    function11 = function3;
                }
                if (i39 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i35 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39611k(23);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function12 = (Function1) objM87133R3;
                } else {
                    function12 = function4;
                }
                Object[] objArr14 = new Object[0];
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39681c(9);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr14, (InterfaceC4339a) objM87133R, c28655q, 48);
                if (viewState instanceof AbstractC37636q.c) {
                    c28655q.m87150e0(450464751);
                    AbstractC37636q.c cVar14 = (AbstractC37636q.c) viewState;
                    m127433I(cVar14, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                    str4 = str3;
                    z25 = z19;
                    function19 = function9;
                    function20 = function10;
                    function15 = function11;
                    z26 = z24;
                    function16 = function12;
                    c37631lM120958e = cVar14.getSummary();
                    if (c37631lM120958e == null) {
                        c28655q.m87150e0(450897851);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(450897852);
                        if (m127429E(interfaceC28601c1)) {
                            c28655q.m87150e0(208006964);
                            if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                function19.invoke(AbstractC37634o.b.f161089a);
                            }
                            function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(208296225);
                            c28655q.m87173q(false);
                        }
                        m127430F(interfaceC28601c1, true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    function17 = function19;
                    function18 = function20;
                } else {
                    str4 = str3;
                    z25 = z19;
                    function13 = function9;
                    function14 = function10;
                    function15 = function11;
                    z26 = z24;
                    function16 = function12;
                    if (viewState instanceof AbstractC37636q.a) {
                        c28655q.m87150e0(451356435);
                        AbstractC33208p0.b bVar14 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                        TextResource textResourceM21278l117 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                        TextResource textResourceM21278l118 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                        if ((i37 & 7168) == 2048) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        if ((i37 & 14) == 4) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = z27 | z28;
                        objM87133R2 = c28655q.m87133R();
                        if (z29) {
                            objM87133R2 = new C39689b(3, function13, viewState);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C39689b(3, function13, viewState);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i41111 = AbstractC33208p0.b.f138467h;
                        int i41112 = TextResource.$stable;
                        function18 = function14;
                        function17 = function13;
                        AbstractC33199m0.m105214F(bVar14, textResourceM21278l117, null, textResourceM21278l118, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i41111 | (i41112 << 3) | (i41112 << 9), 6, 3044);
                        c28655q.m87173q(false);
                    } else {
                        function17 = function13;
                        function18 = function14;
                        if (viewState instanceof AbstractC37636q.b) {
                            throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                        }
                        c28655q.m87150e0(-2063631847);
                        m127479w(c28655q, 0);
                        c28655q.m87173q(false);
                    }
                }
                function6 = function18;
                function5 = function17;
                str2 = str4;
                z17 = z25;
                function7 = function15;
                z18 = z26;
                function8 = function16;
            } else {
                c28655q.m87138X();
                str2 = str;
                function5 = function1;
                function6 = function2;
                function7 = function3;
                function8 = function4;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
            }
        }
        i15 |= 3072;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q.m87157i(function2)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            i26 = i14 & 32;
            if (i26 != 0) {
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q.m87157i(function3)) {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i27;
            }
            i28 = i14 & 64;
            if (i28 != 0) {
                i15 |= 1572864;
                z15 = z13;
            } else {
                z15 = z13;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z15)) {
                        i29 = 1048576;
                    } else {
                        i29 = 524288;
                    }
                    i15 |= i29;
                }
            }
            i34 = i15;
            i35 = i14 & 128;
            if (i35 != 0) {
                i34 |= 12582912;
            } else if ((i13 & 12582912) != 0) {
                if (c28655q.m87157i(function4)) {
                    i36 = 8388608;
                } else {
                    i36 = 4194304;
                }
                i34 |= i36;
            }
            i37 = i34;
            if ((i37 & 4793491) != 4793490) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i37 & 1, z16)) {
                if (i44 != 0) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (i16 != 0) {
                    z19 = true;
                } else {
                    z19 = z14;
                }
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    objM87133R6 = c28655q.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C39611k(19);
                        c28655q.m87172p0(objM87133R6);
                    }
                    function9 = (Function1) objM87133R6;
                } else {
                    function9 = function1;
                }
                if (i24 != 0) {
                    objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C39611k(21);
                        c28655q.m87172p0(objM87133R5);
                    }
                    function10 = (Function1) objM87133R5;
                    i38 = i26;
                } else {
                    i38 = i26;
                    function10 = function2;
                }
                if (i38 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C39611k(22);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function11 = (Function1) objM87133R4;
                    i39 = i28;
                } else {
                    i39 = i28;
                    function11 = function3;
                }
                if (i39 != 0) {
                    z24 = false;
                } else {
                    z24 = z15;
                }
                if (i35 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C39611k(23);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function12 = (Function1) objM87133R3;
                } else {
                    function12 = function4;
                }
                Object[] objArr15 = new Object[0];
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C39681c(9);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr15, (InterfaceC4339a) objM87133R, c28655q, 48);
                if (viewState instanceof AbstractC37636q.c) {
                    c28655q.m87150e0(450464751);
                    AbstractC37636q.c cVar15 = (AbstractC37636q.c) viewState;
                    m127433I(cVar15, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                    str4 = str3;
                    z25 = z19;
                    function19 = function9;
                    function20 = function10;
                    function15 = function11;
                    z26 = z24;
                    function16 = function12;
                    c37631lM120958e = cVar15.getSummary();
                    if (c37631lM120958e == null) {
                        c28655q.m87150e0(450897851);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(450897852);
                        if (m127429E(interfaceC28601c1)) {
                            c28655q.m87150e0(208006964);
                            if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                                function19.invoke(AbstractC37634o.b.f161089a);
                            }
                            function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(208296225);
                            c28655q.m87173q(false);
                        }
                        m127430F(interfaceC28601c1, true);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(false);
                    function17 = function19;
                    function18 = function20;
                } else {
                    str4 = str3;
                    z25 = z19;
                    function13 = function9;
                    function14 = function10;
                    function15 = function11;
                    z26 = z24;
                    function16 = function12;
                    if (viewState instanceof AbstractC37636q.a) {
                        c28655q.m87150e0(451356435);
                        AbstractC33208p0.b bVar15 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                        TextResource textResourceM21278l119 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                        TextResource textResourceM21278l1110 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                        if ((i37 & 7168) == 2048) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        if ((i37 & 14) == 4) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        z29 = z27 | z28;
                        objM87133R2 = c28655q.m87133R();
                        if (z29) {
                            objM87133R2 = new C39689b(3, function13, viewState);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C39689b(3, function13, viewState);
                            c28655q.m87172p0(objM87133R2);
                        }
                        int i41113 = AbstractC33208p0.b.f138467h;
                        int i41114 = TextResource.$stable;
                        function18 = function14;
                        function17 = function13;
                        AbstractC33199m0.m105214F(bVar15, textResourceM21278l119, null, textResourceM21278l1110, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i41113 | (i41114 << 3) | (i41114 << 9), 6, 3044);
                        c28655q.m87173q(false);
                    } else {
                        function17 = function13;
                        function18 = function14;
                        if (viewState instanceof AbstractC37636q.b) {
                            throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                        }
                        c28655q.m87150e0(-2063631847);
                        m127479w(c28655q, 0);
                        c28655q.m87173q(false);
                    }
                }
                function6 = function18;
                function5 = function17;
                str2 = str4;
                z17 = z25;
                function7 = function15;
                z18 = z26;
                function8 = function16;
            } else {
                c28655q.m87138X();
                str2 = str;
                function5 = function1;
                function6 = function2;
                function7 = function3;
                function8 = function4;
                z17 = z14;
                z18 = z15;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
            }
        }
        i15 |= 24576;
        i26 = i14 & 32;
        if (i26 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q.m87157i(function3)) {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i27 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            i15 |= i27;
        }
        i28 = i14 & 64;
        if (i28 != 0) {
            i15 |= 1572864;
            z15 = z13;
        } else {
            z15 = z13;
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87155h(z15)) {
                    i29 = 1048576;
                } else {
                    i29 = 524288;
                }
                i15 |= i29;
            }
        }
        i34 = i15;
        i35 = i14 & 128;
        if (i35 != 0) {
            i34 |= 12582912;
        } else if ((i13 & 12582912) != 0) {
            if (c28655q.m87157i(function4)) {
                i36 = 8388608;
            } else {
                i36 = 4194304;
            }
            i34 |= i36;
        }
        i37 = i34;
        if ((i37 & 4793491) != 4793490) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i37 & 1, z16)) {
            if (i44 != 0) {
                str3 = "";
            } else {
                str3 = str;
            }
            if (i16 != 0) {
                z19 = true;
            } else {
                z19 = z14;
            }
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                objM87133R6 = c28655q.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C39611k(19);
                    c28655q.m87172p0(objM87133R6);
                }
                function9 = (Function1) objM87133R6;
            } else {
                function9 = function1;
            }
            if (i24 != 0) {
                objM87133R5 = c28655q.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C39611k(21);
                    c28655q.m87172p0(objM87133R5);
                }
                function10 = (Function1) objM87133R5;
                i38 = i26;
            } else {
                i38 = i26;
                function10 = function2;
            }
            if (i38 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C39611k(22);
                    c28655q.m87172p0(objM87133R4);
                }
                function11 = (Function1) objM87133R4;
                i39 = i28;
            } else {
                i39 = i28;
                function11 = function3;
            }
            if (i39 != 0) {
                z24 = false;
            } else {
                z24 = z15;
            }
            if (i35 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C39611k(23);
                    c28655q.m87172p0(objM87133R3);
                }
                function12 = (Function1) objM87133R3;
            } else {
                function12 = function4;
            }
            Object[] objArr16 = new Object[0];
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C39681c(9);
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr16, (InterfaceC4339a) objM87133R, c28655q, 48);
            if (viewState instanceof AbstractC37636q.c) {
                c28655q.m87150e0(450464751);
                AbstractC37636q.c cVar16 = (AbstractC37636q.c) viewState;
                m127433I(cVar16, str3, z19, function9, function10, function11, z24, function12, c28655q, i37 & 33554430, 0);
                str4 = str3;
                z25 = z19;
                function19 = function9;
                function20 = function10;
                function15 = function11;
                z26 = z24;
                function16 = function12;
                c37631lM120958e = cVar16.getSummary();
                if (c37631lM120958e == null) {
                    c28655q.m87150e0(450897851);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(450897852);
                    if (m127429E(interfaceC28601c1)) {
                        c28655q.m87150e0(208006964);
                        if (C38072d.f163053a.m121950c(c28655q, C38072d.f163054b).isFeatureEnabled(FeatureFlagRepositoryKt.WEEKLY_PLAN_API_FIX)) {
                            function19.invoke(AbstractC37634o.b.f161089a);
                        }
                        function20.invoke(new AbstractC36498g.d(c37631lM120958e.getGoalsCompleted(), c37631lM120958e.getPlanId()));
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(208296225);
                        c28655q.m87173q(false);
                    }
                    m127430F(interfaceC28601c1, true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
                function17 = function19;
                function18 = function20;
            } else {
                str4 = str3;
                z25 = z19;
                function13 = function9;
                function14 = function10;
                function15 = function11;
                z26 = z24;
                function16 = function12;
                if (viewState instanceof AbstractC37636q.a) {
                    c28655q.m87150e0(451356435);
                    AbstractC33208p0.b bVar16 = new AbstractC33208p0.b(AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89935g)), false, null, 6, null);
                    TextResource textResourceM21278l1111 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89932d));
                    TextResource textResourceM21278l1112 = AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC22822a.f89933e));
                    if ((i37 & 7168) == 2048) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    if ((i37 & 14) == 4) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = z27 | z28;
                    objM87133R2 = c28655q.m87133R();
                    if (z29) {
                        objM87133R2 = new C39689b(3, function13, viewState);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C39689b(3, function13, viewState);
                        c28655q.m87172p0(objM87133R2);
                    }
                    int i41115 = AbstractC33208p0.b.f138467h;
                    int i41116 = TextResource.$stable;
                    function18 = function14;
                    function17 = function13;
                    AbstractC33199m0.m105214F(bVar16, textResourceM21278l1111, null, textResourceM21278l1112, (InterfaceC4339a) objM87133R2, false, false, null, null, null, true, false, c28655q, i41115 | (i41116 << 3) | (i41116 << 9), 6, 3044);
                    c28655q.m87173q(false);
                } else {
                    function17 = function13;
                    function18 = function14;
                    if (viewState instanceof AbstractC37636q.b) {
                        throw AbstractC11895b.m32003v(-2063680108, c28655q, false);
                    }
                    c28655q.m87150e0(-2063631847);
                    m127479w(c28655q, 0);
                    c28655q.m87173q(false);
                }
            }
            function6 = function18;
            function5 = function17;
            str2 = str4;
            z17 = z25;
            function7 = function15;
            z18 = z26;
            function8 = function16;
        } else {
            c28655q.m87138X();
            str2 = str;
            function5 = function1;
            function6 = function2;
            function7 = function3;
            function8 = function4;
            z17 = z14;
            z18 = z15;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9785i(viewState, str2, z17, function5, function6, function7, z18, function8, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m127482z(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
