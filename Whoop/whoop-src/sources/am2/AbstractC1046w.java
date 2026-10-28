package am2;

import a11.C0130h;
import a81.C0561l;
import al0.C0974i;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bm2.AbstractC3436e0;
import bm2.AbstractC3442g0;
import bm2.C3439f0;
import bm2.EnumC3475t0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import cm2.AbstractC4825m;
import cm2.AbstractC4837y;
import cm2.C4819g;
import cm2.C4820h;
import cm2.C4823k;
import cm2.C4824l;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import gb1.AbstractC15673b0;
import gy0.AbstractC16276e;
import gz0.AbstractC16319p0;
import hy0.AbstractC17755i2;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.sentry.config.AbstractC20301a;
import java.util.List;
import java.util.Locale;
import l83.C23454a0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p000.AbstractC11266d;
import p000.C13762f;
import p000.C17820i;
import p000.C28503p;
import p000.C3718c;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p163g1.C15093n7;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sl2.AbstractC32706a;
import uv0.AbstractC35283c;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39282o;
import yl2.AbstractC39640g;

/* JADX INFO: renamed from: am2.w */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ak\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001ak\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001c\u001a\u00020\u0004*\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006&²\u0006\u000e\u0010 \u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010#8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010%\u001a\u0004\u0018\u00010\u00198\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lam2/p0;", "viewStateTrends", "Lkotlin/Function1;", "Lcm2/y;", "Ll83/a0;", "onViewEvent", "Lyl2/g;", "onNavigationEvent", "Lcom/whoop/util/TrendKey;", "onWeightInfoClicked", "Lorg/joda/time/DateTime;", "dateTimeNow", "Lorg/joda/time/LocalDate;", "localDateNow", "", "isUsing24HourTime", "C", "(Lam2/p0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lorg/joda/time/DateTime;Lorg/joda/time/LocalDate;ZLandroidx/compose/runtime/Composer;I)V", "Lcm2/l;", "viewState", "G", "(Lcm2/l;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lorg/joda/time/DateTime;Lorg/joda/time/LocalDate;ZLandroidx/compose/runtime/Composer;I)V", "Ln0/u;", "", "buffer", "", "nextToken", "onLoading", "z", "(Ln0/u;ILjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "x", "(Landroidx/compose/runtime/Composer;I)V", "isLoadingMore", "showAddManualMeasurements", "showManualMeasurementsDetails", "Lcm2/g;", "selectedMeasurementState", "selectedMeasurementId", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC1046w {

    /* JADX INFO: renamed from: am2.w$a */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.RecordedDataScreenKt$OnBottomReached$1$1", m100430f = "RecordedDataScreen.kt", m100431l = {376}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f4036w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f4037x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f4038y;

        /* JADX INFO: renamed from: am2.w$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41283a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ Function1 f4039w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28670t2 f4040x;

            public C41283a(Function1 function1, InterfaceC28670t2 interfaceC28670t2) {
                this.f4039w = function1;
                this.f4040x = interfaceC28670t2;
            }

            /* JADX INFO: renamed from: b */
            public final Object m3055b(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f4039w.invoke(this.f4040x.getValue());
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m3055b(((Boolean) obj).booleanValue(), interfaceC30057d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC28670t2 interfaceC28670t2, Function1 function1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f4037x = interfaceC28670t2;
            this.f4038y = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final boolean m3054h(InterfaceC28670t2 interfaceC28670t2) {
            return ((Boolean) interfaceC28670t2.getValue()).booleanValue();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f4037x, this.f4038y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f4036w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C1030m(this.f4037x, 1));
                C41283a c41283a = new C41283a(this.f4038y, this.f4037x);
                this.f4036w = 1;
                if (c13084s1M87240H.collect(c41283a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: am2.w$b */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.RecordedDataScreenKt$RecordedDataScreen$2$1", m100430f = "RecordedDataScreen.kt", m100431l = {92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f4041w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f4042x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C1037p0 f4043y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, C1037p0 c1037p0, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f4042x = function1;
            this.f4043y = c1037p0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f4042x, this.f4043y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f4041w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f4041w = 1;
                if (AbstractC3034m0.m8782b(500L, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f4042x.invoke(new AbstractC4837y.h(this.f4043y.getMetaData().getGraphKey()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: am2.w$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f4044w = new c();

        /* JADX INFO: renamed from: a */
        public final long m3056a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m3056a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: am2.w$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f4045w = new d();

        /* JADX INFO: renamed from: a */
        public final long m3057a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getGreyL1();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m3057a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: am2.w$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f4046w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4823k f4047x;

        public e(Function1 function1, C4823k c4823k) {
            this.f4046w = function1;
            this.f4047x = c4823k;
        }

        /* JADX INFO: renamed from: a */
        public final void m3058a() {
            this.f4046w.invoke(new AbstractC4837y.d(this.f4047x.getId(), ((C4820h) this.f4047x.getContent()).getSource()));
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3058a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: am2.w$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C4823k f4048w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f4049x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f4050y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f4051z;

        public f(C4823k c4823k, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
            this.f4048w = c4823k;
            this.f4049x = interfaceC28601c1;
            this.f4050y = interfaceC28601c2;
            this.f4051z = interfaceC28601c3;
        }

        /* JADX INFO: renamed from: a */
        public final void m3059a() {
            AbstractC1046w.m3001M(this.f4049x, this.f4048w.getId());
            AbstractC1046w.m2999K(this.f4050y, ((C4820h) this.f4048w.getContent()).getWeightDetailsScreen());
            AbstractC1046w.m3030h0(this.f4051z, true);
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m3059a();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: am2.w$g */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.RecordedDataScreenKt$SuccessBody$1$4$1$1", m100430f = "RecordedDataScreen.kt", m100431l = {304}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f4052w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f4053x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C15199y3 c15199y3, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f4053x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f4053x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f4052w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f4053x;
                this.f4052w = 1;
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

    /* JADX INFO: renamed from: am2.w$h */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.RecordedDataScreenKt$SuccessBody$1$6$1$4$1$1", m100430f = "RecordedDataScreen.kt", m100431l = {328}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f4054w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f4055x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C15199y3 c15199y3, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f4055x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f4055x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f4054w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f4055x;
                this.f4054w = 1;
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

    /* JADX INFO: renamed from: am2.w$i */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.RecordedDataScreenKt$SuccessBody$1$6$1$5$1$1", m100430f = "RecordedDataScreen.kt", m100431l = {333}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f4056w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f4057x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C15199y3 c15199y3, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f4057x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f4057x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f4056w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f4057x;
                this.f4056w = 1;
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

    /* JADX INFO: renamed from: am2.w$j */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.RecordedDataScreenKt$SuccessBody$1$7$1$1", m100430f = "RecordedDataScreen.kt", m100431l = {345}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f4058w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f4059x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f4060y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f4059x = c15199y3;
            this.f4060y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new j(this.f4059x, this.f4060y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f4058w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f4059x;
                this.f4058w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC1046w.m3024e0(this.f4060y, false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: am2.w$k */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.RecordedDataScreenKt$SuccessBody$1$7$1$2", m100430f = "RecordedDataScreen.kt", m100431l = {351}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f4061w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f4062x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f4063y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f4062x = c15199y3;
            this.f4063y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new k(this.f4062x, this.f4063y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f4061w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f4062x;
                this.f4061w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC1046w.m3030h0(this.f4063y, false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: am2.w$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f4064w = new l();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C4823k c4823k) {
            return null;
        }
    }

    /* JADX INFO: renamed from: am2.w$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f4065w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f4066x;

        public m(Function1 function1, List list) {
            this.f4065w = function1;
            this.f4066x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m3061a(int i13) {
            return this.f4065w.invoke(this.f4066x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m3061a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: am2.w$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f4067w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f4068x;

        public n(Function1 function1, List list) {
            this.f4067w = function1;
            this.f4068x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m3062a(int i13) {
            return this.f4067w.invoke(this.f4068x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m3062a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: am2.w$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f4069E;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f4070w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f4071x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f4072y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f4073z;

        public o(List list, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3) {
            this.f4070w = list;
            this.f4071x = function1;
            this.f4072y = interfaceC28601c1;
            this.f4073z = interfaceC28601c2;
            this.f4069E = interfaceC28601c3;
        }

        /* JADX INFO: renamed from: a */
        public final void m3063a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
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
            C4823k c4823k = (C4823k) this.f4070w.get(i13);
            c28655q.m87150e0(1171021767);
            Object objM15228a = c4823k.getContent();
            if (objM15228a instanceof TextResource) {
                c28655q.m87150e0(1171060764);
                AbstractC17755i2.m50938j(null, null, null, (TextResource) c4823k.getContent(), null, 0L, 0L, null, c28655q, 0, 247);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else if (objM15228a instanceof C4820h) {
                c28655q.m87150e0(1171238146);
                C4820h c4820h = (C4820h) c4823k.getContent();
                boolean zM87153g = c28655q.m87153g(this.f4071x) | c28655q.m87157i(c4823k);
                Object objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new e(this.f4071x, c4823k);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
                boolean zM87157i = c28655q.m87157i(c4823k);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new f(c4823k, this.f4072y, this.f4073z, this.f4069E);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC3442g0.m10053i(c4820h, interfaceC4339a, (InterfaceC4339a) objM87133R2, new C15093n7(EnumC3475t0.NOT_EXPANDED, null, 6), c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1172028894);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m3063a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: A */
    public static final boolean m2989A(C26068u c26068u, String str, int i13) {
        InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(c26068u.m77565h().f103177k);
        return (interfaceC26054g == null || str == null || ((C26062o) interfaceC26054g).f103184a < (c26068u.m77565h().f103180n - i13) - 1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m2990B(C26068u c26068u, int i13, String str, Function1 function1, int i14, int i15, Composer composer, int i16) {
        m3052z(c26068u, i13, str, function1, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public static final void m2991C(C1037p0 viewStateTrends, Function1 function1, Function1 onNavigationEvent, Function1 onWeightInfoClicked, DateTime dateTimeNow, LocalDate localDateNow, boolean z4, Composer composer, int i13) {
        int i14;
        Function1 function2;
        boolean z13;
        Function1 onViewEvent = function1;
        C2305k c2305k = C2299e.f9111N;
        AbstractC22676k.m65750j(viewStateTrends, "viewStateTrends");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onWeightInfoClicked, "onWeightInfoClicked");
        AbstractC22676k.m65750j(dateTimeNow, "dateTimeNow");
        AbstractC22676k.m65750j(localDateNow, "localDateNow");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(384230946);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewStateTrends) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onWeightInfoClicked) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(dateTimeNow) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i14 |= c28655q.m87157i(localDateNow) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87155h(z4) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            boolean zM2938C = viewStateTrends.getSuccessSavingManualMeasurement();
            C2314t c2314t = C2314t.f9131w;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM2938C) {
                c28655q.m87150e0(536637844);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q = c28655q;
                c28655q.m87173q(true);
                Boolean bool = Boolean.TRUE;
                boolean zM87157i = c28655q.m87157i(viewStateTrends) | ((i14 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new b(onViewEvent, viewStateTrends, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, bool);
                c28655q.m87173q(false);
                function2 = onNavigationEvent;
            } else {
                List list = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                c28655q.m87150e0(537153684);
                AbstractC4825m abstractC4825mM2967w = viewStateTrends.getRecordedData();
                if (abstractC4825mM2967w instanceof AbstractC4825m.c) {
                    c28655q.m87150e0(-121217973);
                    function2 = onNavigationEvent;
                    m2995G(((AbstractC4825m.c) viewStateTrends.getRecordedData()).getViewState(), onViewEvent, function2, onWeightInfoClicked, dateTimeNow, localDateNow, z4, c28655q, i14 & 4194288);
                    onViewEvent = onViewEvent;
                    c28655q.m87173q(false);
                    z13 = false;
                } else {
                    function2 = onNavigationEvent;
                    if (abstractC4825mM2967w instanceof AbstractC4825m.a) {
                        c28655q.m87150e0(537709297);
                        AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC32706a.f135963q, list, i15, objArr7 == true ? 1 : 0), false, null, 6, null);
                        TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC32706a.f135960n, objArr6 == true ? 1 : 0, i15, objArr5 == true ? 1 : 0);
                        TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC32706a.f135962p, objArr4 == true ? 1 : 0, i15, objArr3 == true ? 1 : 0);
                        TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC32706a.f135961o, objArr2 == true ? 1 : 0, i15, objArr == true ? 1 : 0);
                        boolean zM87157i2 = ((i14 & 112) == 32) | c28655q.m87157i(viewStateTrends);
                        Object objM87133R2 = c28655q.m87133R();
                        if (zM87157i2 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C1006a(onViewEvent, viewStateTrends, 3);
                            c28655q.m87172p0(objM87133R2);
                        }
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R2;
                        boolean z14 = (i14 & 896) == 256;
                        Object objM87133R3 = c28655q.m87133R();
                        if (z14 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C1043t(function2, 0);
                            c28655q.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R3;
                        int i16 = AbstractC33208p0.b.f138467h | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        int i17 = TextResource.C8688b.f25889c;
                        int i18 = i16 | (i17 << 3) | (i17 << 9) | (i17 << 21);
                        z13 = false;
                        AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b3, interfaceC4339a, true, false, c8688b2, interfaceC4339a2, null, false, false, c28655q, i18, 0, 3652);
                        c28655q = c28655q;
                        c28655q.m87173q(false);
                    } else {
                        z13 = false;
                        if (!AbstractC22676k.m65745e(abstractC4825mM2967w, AbstractC4825m.b.f19861a) && abstractC4825mM2967w != null) {
                            throw AbstractC11895b.m32003v(-121219794, c28655q, false);
                        }
                        c28655q.m87150e0(538570849);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 54);
                        int iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                        InterfaceC0221l.f734a.getClass();
                        C0213j c0213j2 = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                        C0209i c0209i2 = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                        AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                        c28655q = c28655q;
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    }
                }
                c28655q.m87173q(z13);
            }
        } else {
            function2 = onNavigationEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1044u(viewStateTrends, onViewEvent, function2, onWeightInfoClicked, dateTimeNow, localDateNow, z4, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m2992D(Function1 function1, C1037p0 c1037p0) {
        function1.invoke(new AbstractC4837y.h(((AbstractC4825m.a) c1037p0.getRecordedData()).getGraphKey()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m2993E(Function1 function1) {
        function1.invoke(new AbstractC39640g.d(AbstractC39640g.b.Fragment));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m2994F(C1037p0 c1037p0, Function1 function1, Function1 function2, Function1 function3, DateTime dateTime, LocalDate localDate, boolean z4, int i13, Composer composer, int i14) {
        m2991C(c1037p0, function1, function2, function3, dateTime, localDate, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:105:0x021a  */
    /* JADX WARN: Code duplicated, block: B:108:0x026b  */
    /* JADX WARN: Code duplicated, block: B:109:0x026d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0279  */
    /* JADX WARN: Code duplicated, block: B:113:0x027c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0286  */
    /* JADX WARN: Code duplicated, block: B:119:0x028b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0290  */
    /* JADX WARN: Code duplicated, block: B:124:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:125:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:128:0x030c  */
    /* JADX WARN: Code duplicated, block: B:130:0x031a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0344  */
    /* JADX WARN: Code duplicated, block: B:134:0x0348  */
    /* JADX WARN: Code duplicated, block: B:137:0x0355  */
    /* JADX WARN: Code duplicated, block: B:139:0x0363  */
    /* JADX WARN: Code duplicated, block: B:142:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:145:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:148:0x0412  */
    /* JADX WARN: Code duplicated, block: B:149:0x0414  */
    /* JADX WARN: Code duplicated, block: B:152:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x0426  */
    /* JADX WARN: Code duplicated, block: B:158:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:159:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:162:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:163:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:166:0x0506 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x0508  */
    /* JADX WARN: Code duplicated, block: B:172:0x0561  */
    /* JADX WARN: Code duplicated, block: B:175:0x058e  */
    /* JADX WARN: Code duplicated, block: B:177:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:179:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:182:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:201:0x0671  */
    /* JADX WARN: Code duplicated, block: B:204:0x0688  */
    /* JADX WARN: Code duplicated, block: B:206:0x0694  */
    /* JADX WARN: Code duplicated, block: B:207:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:209:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:210:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:212:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:213:0x0705  */
    /* JADX WARN: Code duplicated, block: B:216:0x071a  */
    /* JADX WARN: Code duplicated, block: B:217:0x0726  */
    /* JADX WARN: Code duplicated, block: B:220:0x073b  */
    /* JADX WARN: Code duplicated, block: B:223:0x0755  */
    /* JADX WARN: Code duplicated, block: B:224:0x0757  */
    /* JADX WARN: Code duplicated, block: B:227:0x0764 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x0766  */
    /* JADX WARN: Code duplicated, block: B:233:0x0791  */
    /* JADX WARN: Code duplicated, block: B:234:0x0793  */
    /* JADX WARN: Code duplicated, block: B:237:0x07a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:242:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:245:0x080b  */
    /* JADX WARN: Code duplicated, block: B:246:0x080d  */
    /* JADX WARN: Code duplicated, block: B:249:0x0815 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:250:0x0817  */
    /* JADX WARN: Code duplicated, block: B:99:0x01fb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r10v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v13, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r15v14, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r15v16, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r15v17, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r15v18, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r15v2, types: [p1.q] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r25v6, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v33 */
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
    /* JADX INFO: renamed from: G */
    private static final void m2995G(C4824l c4824l, Function1 function1, Function1 function2, Function1 function3, DateTime dateTime, LocalDate localDate, boolean z4, Composer composer, int i13) {
        int i14;
        ?? r15;
        Object obj;
        Object obj2;
        InterfaceC28601c1 interfaceC28601c1;
        int iHashCode;
        int i15;
        boolean z13;
        int i16;
        boolean z14;
        boolean z15;
        Object objM87133R;
        C28676v0 c28676v0;
        Object obj3;
        int i17;
        int iHashCode2;
        int iHashCode3;
        int i18;
        Object objM87133R2;
        Object obj4;
        Object objM87133R3;
        Object obj5;
        boolean z16;
        boolean zM87157i;
        Object obj6;
        Object objM87133R4;
        InterfaceC28601c1 interfaceC28601c2;
        Object obj7;
        InterfaceC28601c1 interfaceC28601c3;
        boolean z17;
        boolean z18;
        Object objM87133R5;
        int i19;
        InterfaceC28601c1 interfaceC28601c4;
        boolean z19;
        InterfaceC28601c1 interfaceC28601c5;
        InterfaceC28601c1 interfaceC28601c6;
        boolean z24;
        C28655q c28655q;
        Object objM87133R6;
        Object obj8;
        InterfaceC28601c1 interfaceC28601c7;
        InterfaceC28601c1 interfaceC28601c8;
        C15199y3 c15199y3;
        InterfaceC2994c0 interfaceC2994c0;
        ?? r16;
        ?? r10;
        C15199y3 c15199y4;
        ?? r17;
        ?? r14;
        ?? r18;
        int i24;
        Object objM87133R7;
        C4819g c4819gM2998J;
        String strM3000L;
        TextResource textResourceM15217h;
        String str;
        TextResource textResourceM15212c;
        String str2;
        Object objM87133R8;
        Object obj9;
        ?? r19;
        boolean z25;
        Object objM87133R9;
        ?? r110;
        boolean z26;
        boolean z27;
        Object objM87133R10;
        ?? r111;
        ?? r112;
        ?? r113;
        ?? r114;
        Object obj10;
        String strM15257a;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1672312544);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(c4824l) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(dateTime) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87157i(localDate) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 1048576 : 524288;
        }
        if (c28655q2.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            Object objM87133R11 = c28655q2.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (objM87133R11 == c28676v1) {
                obj = objM87133R11;
                InterfaceC2994c0 interfaceC2994c0M87262p = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(interfaceC2994c0M87262p);
                obj = interfaceC2994c0M87262p;
            }
            obj = objM87133R11;
            InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) obj;
            C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q2, 3);
            Object objM87133R12 = c28655q2.m87133R();
            Object obj11 = objM87133R12;
            if (objM87133R12 == c28676v1) {
                C28633k1 c28633k1M87272z = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(c28633k1M87272z);
                obj11 = c28633k1M87272z;
            }
            InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) obj11;
            Object objM87133R13 = c28655q2.m87133R();
            Object obj12 = objM87133R13;
            if (objM87133R13 == c28676v1) {
                C28633k1 c28633k1M87272z2 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(c28633k1M87272z2);
                obj12 = c28633k1M87272z2;
            }
            InterfaceC28601c1 interfaceC28601c10 = (InterfaceC28601c1) obj12;
            EnumC15209z3 enumC15209z3 = EnumC15209z3.f57106w;
            Object objM87133R14 = c28655q2.m87133R();
            Object obj13 = objM87133R14;
            if (objM87133R14 == c28676v1) {
                C1010c c1010c = new C1010c(4, interfaceC28601c10);
                c28655q2.m87172p0(c1010c);
                obj13 = c1010c;
            }
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, (Function1) obj13, true, c28655q2, 3462, 2);
            Object objM87133R15 = c28655q2.m87133R();
            Object obj14 = objM87133R15;
            if (objM87133R15 == c28676v1) {
                C28633k1 c28633k1M87272z3 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(c28633k1M87272z3);
                obj14 = c28633k1M87272z3;
            }
            InterfaceC28601c1 interfaceC28601c11 = (InterfaceC28601c1) obj14;
            Object objM87133R16 = c28655q2.m87133R();
            if (objM87133R16 == c28676v1) {
                C1010c c1010c2 = new C1010c(1, interfaceC28601c11);
                c28655q2.m87172p0(c1010c2);
                obj2 = c1010c2;
            } else {
                obj2 = objM87133R16;
            }
            C15199y3 c15199y3M3460c2 = AbstractC1118c.m3460c(enumC15209z3, null, (Function1) obj2, true, c28655q2, 3462, 2);
            Object objM87133R17 = c28655q2.m87133R();
            Object obj15 = objM87133R17;
            if (objM87133R17 == c28676v1) {
                C28633k1 c28633k1M87272z4 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(c28633k1M87272z4);
                obj15 = c28633k1M87272z4;
            }
            InterfaceC28601c1 interfaceC28601c12 = (InterfaceC28601c1) obj15;
            Object objM87133R18 = c28655q2.m87133R();
            Object obj16 = objM87133R18;
            if (objM87133R18 == c28676v1) {
                C28633k1 c28633k1M87272z5 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(c28633k1M87272z5);
                obj16 = c28633k1M87272z5;
            }
            InterfaceC28601c1 interfaceC28601c13 = (InterfaceC28601c1) obj16;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
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
            if (c28655q2.f115903S) {
                interfaceC28601c1 = interfaceC28601c10;
            } else {
                interfaceC28601c1 = interfaceC28601c10;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM66724m);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                AbstractC6721d.a aVar = new AbstractC6721d.a(c4824l.getNavigationBarTitle(), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward()), new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, false ? 1 : 0).toString(), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
                i15 = i14 & 112;
                if (i15 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean zM87157i2 = z13 | c28655q2.m87157i(c4824l);
                i16 = i14 & 896;
                if (i16 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = zM87157i2 | z14;
                objM87133R = c28655q2.m87133R();
                if (z15) {
                    c28676v0 = c28676v1;
                } else {
                    c28676v0 = c28676v1;
                    if (objM87133R == c28676v0) {
                        obj3 = objM87133R;
                    }
                    i17 = i16;
                    AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) obj3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                    float f13 = 2;
                    float f14 = 4;
                    AbstractC11266d.m30469w(f13, f14, c2314t, c28655q2);
                    float f15 = 8;
                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, f13 * f15, 0.0f, 2);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                    C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q2, 6);
                    iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m4);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N4);
                    TextResource textResourceM15236g = c4824l.getTitle();
                    i18 = TextResource.$stable;
                    String strM21274h = AbstractC8693b.m21274h(textResourceM15236g, c28655q2, i18);
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    C2886a c2886aM8418P = c38072d.m121952e(c28655q2, i25).getT3();
                    long jM125430y = c38072d.m121949b(c28655q2, i25).getBrandWhite();
                    int i26 = C2886a.f11498d << 18;
                    AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q2, 0, i26, 196602);
                    AbstractC27274q.g gVar = AbstractC27274q.g.f109144f;
                    int iM46245w = c38072d.m121951d().getTinyIcons().getTinyInformation();
                    objM87133R2 = c28655q2.m87133R();
                    obj4 = objM87133R2;
                    if (objM87133R2 == c28676v0) {
                        c cVar = c.f4044w;
                        c28655q2.m87172p0(cVar);
                        obj4 = cVar;
                    }
                    InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((Function1) obj4);
                    objM87133R3 = c28655q2.m87133R();
                    obj5 = objM87133R3;
                    if (objM87133R3 == c28676v0) {
                        d dVar = d.f4045w;
                        c28655q2.m87172p0(dVar);
                        obj5 = dVar;
                    }
                    C27270o c27270o = new C27270o(gVar, iM46245w, interfaceC39332eM125323a, p745y81.Function1.m125323a((Function1) obj5), null, false, false, false, 0.0f, false, MessageListItemViewType.GIPHY, null);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q2, AbstractC32706a.f135956j);
                    if ((i14 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87157i = z16 | c28655q2.m87157i(c4824l);
                    Object objM87133R19 = c28655q2.m87133R();
                    if (!zM87157i || objM87133R19 == c28676v0) {
                        C17820i c17820i = new C17820i(8, function3, c4824l);
                        c28655q2.m87172p0(c17820i);
                        obj6 = c17820i;
                    } else {
                        obj6 = objM87133R19;
                    }
                    AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) obj6, c28655q2, C27270o.f109105k, 12);
                    c28655q2.m87173q(true);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f14, c2314t));
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4824l.getSubtitle(), c28655q2, i18), null, c38072d.m121949b(c28655q2, i25).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i25).getB1(), null, c28655q2, 0, i26, 196602);
                    float f16 = 6 * f14;
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f16, c2314t));
                    C39282o c39282oM15230a = c4824l.getAddManualMeasurement();
                    C13762f c13762f = new C13762f(6);
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        interfaceC28601c2 = interfaceC28601c1;
                        C1010c c1010c3 = new C1010c(2, interfaceC28601c2);
                        c28655q2.m87172p0(c1010c3);
                        obj7 = c1010c3;
                    } else {
                        interfaceC28601c2 = interfaceC28601c1;
                        obj7 = objM87133R4;
                    }
                    interfaceC28601c3 = interfaceC28601c2;
                    AbstractC25303l.m74291r(c39282oM15230a, null, c13762f, (Function1) obj7, c28655q2, C39282o.f168987q | 3072, 2);
                    AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f16, c2314t));
                    Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f14 * f15, 7);
                    C22971k c22971kM66746i = AbstractC22977m.m66746i(3 * f14);
                    boolean zM87157i3 = c28655q2.m87157i(c4824l);
                    if (i15 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zM87157i3 | z17;
                    objM87133R5 = c28655q2.m87133R();
                    if (!z18 || objM87133R5 == c28676v0) {
                        i19 = i14;
                        interfaceC28601c4 = interfaceC28601c11;
                        z19 = false;
                        C1040r c1040r = new C1040r((Object) c4824l, (Object) function1, (Object) interfaceC28601c13, (Object) interfaceC28601c12, (Object) interfaceC28601c4, 0);
                        interfaceC28601c5 = interfaceC28601c13;
                        interfaceC28601c6 = interfaceC28601c12;
                        c28655q2.m87172p0(c1040r);
                        objM87133R5 = c1040r;
                    } else {
                        i19 = i14;
                        interfaceC28601c6 = interfaceC28601c12;
                        interfaceC28601c5 = interfaceC28601c13;
                        interfaceC28601c4 = interfaceC28601c11;
                        z19 = false;
                    }
                    z24 = z19;
                    AbstractC22674j.m65717c(modifierM3398t, c26068uM77569a, null, c22971kM66746i, null, null, false, null, (Function1) objM87133R5, c28655q2, 24582, 492);
                    c28655q = c28655q2;
                    String strM15257a2 = c4824l.getSections().getNextToken();
                    objM87133R6 = c28655q.m87133R();
                    obj8 = objM87133R6;
                    if (objM87133R6 == c28676v0) {
                        C1010c c1010c4 = new C1010c(3, interfaceC28601c9);
                        c28655q.m87172p0(c1010c4);
                        obj8 = c1010c4;
                    }
                    interfaceC28601c7 = interfaceC28601c4;
                    m3052z(c26068uM77569a, 0, strM15257a2, (Function1) obj8, c28655q, 3072, 1);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    if (m2996H(interfaceC28601c9)) {
                        c28655q.m87150e0(1734447581);
                        m3050x(c28655q, z24 ? 1 : 0);
                        strM15257a = c4824l.getSections().getNextToken();
                        if (strM15257a != null) {
                            function1.invoke(new AbstractC4837y.g(c4824l.getMetaData().getGraphKey(), strM15257a));
                        }
                        c28655q.m87173q(z24);
                    } else {
                        c28655q.m87150e0(1734642664);
                        c28655q.m87173q(z24);
                    }
                    if (m3022d0(interfaceC28601c3) || c4824l.getManualMeasurementUpdates() == null) {
                        interfaceC28601c8 = interfaceC28601c3;
                        boolean z28 = z24 ? 1 : 0;
                        c15199y3 = c15199y3M3460c;
                        interfaceC2994c0 = interfaceC2994c1;
                        c28655q.m87150e0(1735787432);
                        c28655q.m87173q(z28);
                        r10 = z28;
                        r16 = c28655q;
                    } else {
                        c28655q.m87150e0(1734775189);
                        C4819g c4819gM15231b = c4824l.getManualMeasurementUpdates();
                        String strM21273g = AbstractC8693b.m21273g(AbstractC32706a.f135948b, c28655q, z24 ? 1 : 0);
                        String strM21273g2 = AbstractC8693b.m21273g(AbstractC32706a.f135949c, c28655q, z24 ? 1 : 0);
                        Object objM87133R20 = c28655q.m87133R();
                        if (objM87133R20 == c28676v0) {
                            obj10 = objM87133R20;
                            C1014e c1014e = new C1014e(1, interfaceC28601c3);
                            c28655q.m87172p0(c1014e);
                            obj10 = c1014e;
                        }
                        obj10 = objM87133R20;
                        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj10;
                        interfaceC2994c0 = interfaceC2994c1;
                        boolean z29 = ((c28655q.m87157i(interfaceC2994c0) ? 1 : 0) | (c28655q.m87157i(c15199y3M3460c) ? 1 : 0) ? 1 : 0) | (i15 == 32 ? true : z24 ? 1 : 0);
                        Object objM87133R21 = c28655q.m87133R();
                        if (z29 || objM87133R21 == c28676v0) {
                            C1042s c1042s = new C1042s(interfaceC2994c0, function1, c15199y3M3460c, interfaceC28601c3, 0);
                            interfaceC28601c8 = interfaceC28601c3;
                            c15199y3 = c15199y3M3460c;
                            c28655q.m87172p0(c1042s);
                            objM87133R21 = c1042s;
                        } else {
                            interfaceC28601c8 = interfaceC28601c3;
                            c15199y3 = c15199y3M3460c;
                        }
                        Function1 function4 = (Function1) objM87133R21;
                        Object objM87133R22 = c28655q.m87133R();
                        Object obj17 = objM87133R22;
                        if (objM87133R22 == c28676v0) {
                            C0974i c0974i = new C0974i(2);
                            c28655q.m87172p0(c0974i);
                            obj17 = c0974i;
                        }
                        boolean z34 = z24 ? 1 : 0;
                        AbstractC3436e0.m9933F(strM21273g, false, c4819gM15231b, c15199y3, dateTime, localDate, z4, interfaceC2994c0, strM21273g2, null, null, interfaceC4339a, function4, (InterfaceC4339a) obj17, c28655q, 805310512 | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016), 3120, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                        C28655q c28655q3 = c28655q;
                        c28655q3.m87173q(z34);
                        r10 = z34;
                        r16 = c28655q3;
                    }
                    if (m3028g0(interfaceC28601c7)) {
                        r16.m87150e0(-913833805);
                        c4819gM2998J = m2998J(interfaceC28601c6);
                        if (c4819gM2998J == null) {
                            r16.m87150e0(1735923118);
                            r16.m87173q(r10);
                            r114 = r10;
                            i17 = i17;
                            c15199y4 = c15199y3M3460c2;
                            r113 = r16;
                        } else {
                            r16.m87150e0(1735923119);
                            strM3000L = m3000L(interfaceC28601c5);
                            if (strM3000L == null) {
                                r16.m87150e0(1503597964);
                                r16.m87173q(r10);
                                r112 = r10;
                                i17 = i17;
                                c15199y4 = c15199y3M3460c2;
                                r111 = r16;
                            } else {
                                r16.m87150e0(1503597965);
                                C4819g c4819gM2998J2 = m2998J(interfaceC28601c6);
                                AbstractC22676k.m65747g(c4819gM2998J2);
                                String strM21273g3 = AbstractC8693b.m21273g(AbstractC32706a.f135957k, r16, r10);
                                C4819g c4819gM2998J3 = m2998J(interfaceC28601c6);
                                AbstractC22676k.m65747g(c4819gM2998J3);
                                String lowerCase = c4819gM2998J3.getSource().toLowerCase(Locale.ROOT);
                                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                                boolean z35 = !lowerCase.equals("manual");
                                textResourceM15217h = c4819gM2998J.getSaveTitle();
                                if (textResourceM15217h == null) {
                                    r16.m87150e0(1265554631);
                                    r16.m87173q(r10);
                                    str = null;
                                } else {
                                    r16.m87150e0(1265554632);
                                    String strM21274h2 = AbstractC8693b.m21274h(textResourceM15217h, r16, i18);
                                    r16.m87173q(r10);
                                    str = strM21274h2;
                                }
                                textResourceM15212c = c4819gM2998J.getDeleteTitle();
                                if (textResourceM15212c == null) {
                                    r16.m87150e0(1265644903);
                                    r16.m87173q(r10);
                                    str2 = null;
                                } else {
                                    r16.m87150e0(1265644904);
                                    String strM21274h3 = AbstractC8693b.m21274h(textResourceM15212c, r16, i18);
                                    r16.m87173q(r10);
                                    str2 = strM21274h3;
                                }
                                objM87133R8 = r16.m87133R();
                                obj9 = objM87133R8;
                                if (objM87133R8 == c28676v0) {
                                    C1014e c1014e2 = new C1014e(2, interfaceC28601c7);
                                    r16.m87172p0(c1014e2);
                                    obj9 = c1014e2;
                                }
                                InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) obj9;
                                boolean z36 = (r16.m87157i(interfaceC2994c0) ? 1 : 0) | (r16.m87157i(c15199y3) ? 1 : 0);
                                if (i15 == 32) {
                                    r19 = 1;
                                } else {
                                    r19 = r10;
                                }
                                z25 = (((z36 ? 1 : 0) | r19) == true ? 1 : 0) | (r16.m87153g(strM3000L) ? 1 : 0);
                                objM87133R9 = r16.m87133R();
                                if (z25 == 0 || objM87133R9 == c28676v0) {
                                    r110 = r10 == true ? 1 : 0;
                                    C1040r c1040r2 = new C1040r(interfaceC2994c0, function1, (Object) strM3000L, c15199y3, interfaceC28601c7, 1);
                                    r16.m87172p0(c1040r2);
                                    objM87133R9 = c1040r2;
                                } else {
                                    r110 = r10;
                                }
                                Function1 function5 = (Function1) objM87133R9;
                                boolean z37 = (r16.m87157i(interfaceC2994c0) ? 1 : 0) | (r16.m87157i(c15199y3) ? 1 : 0);
                                if (i15 == 32) {
                                    z26 = true;
                                } else {
                                    z26 = r110 == true ? 1 : 0;
                                }
                                z27 = (((z37 ? 1 : 0) | z26 ? 1 : 0) | (r16.m87153g(strM3000L) ? 1 : 0) ? 1 : 0) | (r16.m87157i(c4819gM2998J) ? 1 : 0);
                                objM87133R10 = r16.m87133R();
                                if (z27 || objM87133R10 == c28676v0) {
                                    C15199y3 c15199y5 = c15199y3;
                                    C0561l c0561l = new C0561l((Object) interfaceC2994c0, function1, (Object) strM3000L, (Object) c4819gM2998J, (Object) c15199y5, (Object) interfaceC28601c7, 1);
                                    c15199y3 = c15199y5;
                                    interfaceC28601c7 = interfaceC28601c7;
                                    r16.m87172p0(c0561l);
                                    objM87133R10 = c0561l;
                                }
                                ?? r25 = r16;
                                c15199y4 = c15199y3M3460c2;
                                AbstractC3436e0.m9933F(strM21273g3, z35, c4819gM2998J2, c15199y4, dateTime, localDate, z4, interfaceC2994c0, str, str2, null, interfaceC4339a2, function5, (InterfaceC4339a) objM87133R10, r25, 4096 | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016), 48, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                                ?? r115 = r25;
                                r115.m87173q(r110);
                                r112 = r110;
                                r111 = r115;
                            }
                            r111.m87173q(r112);
                            r114 = r112;
                            r113 = r111;
                        }
                        r113.m87173q(r114);
                        r14 = r114;
                        r17 = r113;
                    } else {
                        ?? r116 = r10;
                        i17 = i17;
                        c15199y4 = c15199y3M3460c2;
                        r16.m87150e0(1737525416);
                        r16.m87173q(r116);
                        r14 = r116;
                        r17 = r16;
                    }
                    boolean z38 = ((r17.m87157i(interfaceC2994c0) ? 1 : 0) | (r17.m87157i(c15199y3) ? 1 : 0) ? 1 : 0) | (r17.m87157i(c15199y4) ? 1 : 0);
                    if (i17 == 256) {
                        r18 = 1;
                    } else {
                        r18 = r14;
                    }
                    i24 = (z38 ? 1 : 0) | r18;
                    objM87133R7 = r17.m87133R();
                    if (i24 == 0 || objM87133R7 == c28676v0) {
                        C1045v c1045v = new C1045v(interfaceC2994c0, function2, interfaceC28601c8, c15199y3, interfaceC28601c7, c15199y4);
                        r17.m87172p0(c1045v);
                        objM87133R7 = c1045v;
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R7, r14, r17, r14, 1);
                    r17.m87173q(true);
                    r15 = r17;
                }
                C3718c c3718c = new C3718c(function1, c4824l, function2, 4);
                c28655q2.m87172p0(c3718c);
                obj3 = c3718c;
                i17 = i16;
                AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) obj3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                float f17 = 2;
                float f18 = 4;
                AbstractC11266d.m30469w(f17, f18, c2314t, c28655q2);
                float f19 = 8;
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, f17 * f19, 0.0f, 2);
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM3396r2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m5);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N5);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q2, 6);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM3409f2);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m6);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N6);
                TextResource textResourceM15236g2 = c4824l.getTitle();
                i18 = TextResource.$stable;
                String strM21274h4 = AbstractC8693b.m21274h(textResourceM15236g2, c28655q2, i18);
                C38072d c38072d2 = C38072d.f163053a;
                int i27 = C38072d.f163054b;
                C2886a c2886aM8418P2 = c38072d2.m121952e(c28655q2, i27).getT3();
                long jM125430y2 = c38072d2.m121949b(c28655q2, i27).getBrandWhite();
                int i28 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h4, null, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P2, null, c28655q2, 0, i28, 196602);
                AbstractC27274q.g gVar2 = AbstractC27274q.g.f109144f;
                int iM46245w2 = c38072d2.m121951d().getTinyIcons().getTinyInformation();
                objM87133R2 = c28655q2.m87133R();
                obj4 = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    c cVar2 = c.f4044w;
                    c28655q2.m87172p0(cVar2);
                    obj4 = cVar2;
                }
                InterfaceC39332e interfaceC39332eM125323a2 = p745y81.Function1.m125323a((Function1) obj4);
                objM87133R3 = c28655q2.m87133R();
                obj5 = objM87133R3;
                if (objM87133R3 == c28676v0) {
                    d dVar2 = d.f4045w;
                    c28655q2.m87172p0(dVar2);
                    obj5 = dVar2;
                }
                C27270o c27270o2 = new C27270o(gVar2, iM46245w2, interfaceC39332eM125323a2, p745y81.Function1.m125323a((Function1) obj5), null, false, false, false, 0.0f, false, MessageListItemViewType.GIPHY, null);
                String strM92103Y2 = AbstractC30060g.m92103Y(c28655q2, AbstractC32706a.f135956j);
                if ((i14 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i = z16 | c28655q2.m87157i(c4824l);
                Object objM87133R110 = c28655q2.m87133R();
                if (zM87157i) {
                    C17820i c17820i2 = new C17820i(8, function3, c4824l);
                    c28655q2.m87172p0(c17820i2);
                    obj6 = c17820i2;
                } else {
                    C17820i c17820i3 = new C17820i(8, function3, c4824l);
                    c28655q2.m87172p0(c17820i3);
                    obj6 = c17820i3;
                }
                AbstractC27242b1.m82092d(c27270o2, strM92103Y2, null, null, (InterfaceC4339a) obj6, c28655q2, C27270o.f109105k, 12);
                c28655q2.m87173q(true);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f18, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4824l.getSubtitle(), c28655q2, i18), null, c38072d2.m121949b(c28655q2, i27).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q2, i27).getB1(), null, c28655q2, 0, i28, 196602);
                float f110 = 6 * f18;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f110, c2314t));
                C39282o c39282oM15230a2 = c4824l.getAddManualMeasurement();
                C13762f c13762f2 = new C13762f(6);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    interfaceC28601c2 = interfaceC28601c1;
                    C1010c c1010c5 = new C1010c(2, interfaceC28601c2);
                    c28655q2.m87172p0(c1010c5);
                    obj7 = c1010c5;
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    obj7 = objM87133R4;
                }
                interfaceC28601c3 = interfaceC28601c2;
                AbstractC25303l.m74291r(c39282oM15230a2, null, c13762f2, (Function1) obj7, c28655q2, C39282o.f168987q | 3072, 2);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f110, c2314t));
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f18 * f19, 7);
                C22971k c22971kM66746i2 = AbstractC22977m.m66746i(3 * f18);
                boolean zM87157i4 = c28655q2.m87157i(c4824l);
                if (i15 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87157i4 | z17;
                objM87133R5 = c28655q2.m87133R();
                if (z18) {
                    i19 = i14;
                    interfaceC28601c4 = interfaceC28601c11;
                    z19 = false;
                    C1040r c1040r3 = new C1040r((Object) c4824l, (Object) function1, (Object) interfaceC28601c13, (Object) interfaceC28601c12, (Object) interfaceC28601c4, 0);
                    interfaceC28601c5 = interfaceC28601c13;
                    interfaceC28601c6 = interfaceC28601c12;
                    c28655q2.m87172p0(c1040r3);
                    objM87133R5 = c1040r3;
                } else {
                    i19 = i14;
                    interfaceC28601c4 = interfaceC28601c11;
                    z19 = false;
                    C1040r c1040r4 = new C1040r((Object) c4824l, (Object) function1, (Object) interfaceC28601c13, (Object) interfaceC28601c12, (Object) interfaceC28601c4, 0);
                    interfaceC28601c5 = interfaceC28601c13;
                    interfaceC28601c6 = interfaceC28601c12;
                    c28655q2.m87172p0(c1040r4);
                    objM87133R5 = c1040r4;
                }
                z24 = z19;
                AbstractC22674j.m65717c(modifierM3398t2, c26068uM77569a, null, c22971kM66746i2, null, null, false, null, (Function1) objM87133R5, c28655q2, 24582, 492);
                c28655q = c28655q2;
                String strM15257a3 = c4824l.getSections().getNextToken();
                objM87133R6 = c28655q.m87133R();
                obj8 = objM87133R6;
                if (objM87133R6 == c28676v0) {
                    C1010c c1010c6 = new C1010c(3, interfaceC28601c9);
                    c28655q.m87172p0(c1010c6);
                    obj8 = c1010c6;
                }
                interfaceC28601c7 = interfaceC28601c4;
                m3052z(c26068uM77569a, 0, strM15257a3, (Function1) obj8, c28655q, 3072, 1);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (m2996H(interfaceC28601c9)) {
                    c28655q.m87150e0(1734447581);
                    m3050x(c28655q, z24 ? 1 : 0);
                    strM15257a = c4824l.getSections().getNextToken();
                    if (strM15257a != null) {
                        function1.invoke(new AbstractC4837y.g(c4824l.getMetaData().getGraphKey(), strM15257a));
                    }
                    c28655q.m87173q(z24);
                } else {
                    c28655q.m87150e0(1734642664);
                    c28655q.m87173q(z24);
                }
                if (m3022d0(interfaceC28601c3)) {
                    interfaceC28601c8 = interfaceC28601c3;
                    boolean z210 = z24 ? 1 : 0;
                    c15199y3 = c15199y3M3460c;
                    interfaceC2994c0 = interfaceC2994c1;
                    c28655q.m87150e0(1735787432);
                    c28655q.m87173q(z210);
                    r10 = z210;
                    r16 = c28655q;
                } else {
                    interfaceC28601c8 = interfaceC28601c3;
                    boolean z211 = z24 ? 1 : 0;
                    c15199y3 = c15199y3M3460c;
                    interfaceC2994c0 = interfaceC2994c1;
                    c28655q.m87150e0(1735787432);
                    c28655q.m87173q(z211);
                    r10 = z211;
                    r16 = c28655q;
                }
                if (m3028g0(interfaceC28601c7)) {
                    r16.m87150e0(-913833805);
                    c4819gM2998J = m2998J(interfaceC28601c6);
                    if (c4819gM2998J == null) {
                        r16.m87150e0(1735923118);
                        r16.m87173q(r10);
                        r114 = r10;
                        i17 = i17;
                        c15199y4 = c15199y3M3460c2;
                        r113 = r16;
                    } else {
                        r16.m87150e0(1735923119);
                        strM3000L = m3000L(interfaceC28601c5);
                        if (strM3000L == null) {
                            r16.m87150e0(1503597964);
                            r16.m87173q(r10);
                            r112 = r10;
                            i17 = i17;
                            c15199y4 = c15199y3M3460c2;
                            r111 = r16;
                        } else {
                            r16.m87150e0(1503597965);
                            C4819g c4819gM2998J4 = m2998J(interfaceC28601c6);
                            AbstractC22676k.m65747g(c4819gM2998J4);
                            String strM21273g4 = AbstractC8693b.m21273g(AbstractC32706a.f135957k, r16, r10);
                            C4819g c4819gM2998J5 = m2998J(interfaceC28601c6);
                            AbstractC22676k.m65747g(c4819gM2998J5);
                            String lowerCase2 = c4819gM2998J5.getSource().toLowerCase(Locale.ROOT);
                            AbstractC22676k.m65749i(lowerCase2, "toLowerCase(...)");
                            boolean z39 = !lowerCase2.equals("manual");
                            textResourceM15217h = c4819gM2998J.getSaveTitle();
                            if (textResourceM15217h == null) {
                                r16.m87150e0(1265554631);
                                r16.m87173q(r10);
                                str = null;
                            } else {
                                r16.m87150e0(1265554632);
                                String strM21274h5 = AbstractC8693b.m21274h(textResourceM15217h, r16, i18);
                                r16.m87173q(r10);
                                str = strM21274h5;
                            }
                            textResourceM15212c = c4819gM2998J.getDeleteTitle();
                            if (textResourceM15212c == null) {
                                r16.m87150e0(1265644903);
                                r16.m87173q(r10);
                                str2 = null;
                            } else {
                                r16.m87150e0(1265644904);
                                String strM21274h6 = AbstractC8693b.m21274h(textResourceM15212c, r16, i18);
                                r16.m87173q(r10);
                                str2 = strM21274h6;
                            }
                            objM87133R8 = r16.m87133R();
                            obj9 = objM87133R8;
                            if (objM87133R8 == c28676v0) {
                                C1014e c1014e3 = new C1014e(2, interfaceC28601c7);
                                r16.m87172p0(c1014e3);
                                obj9 = c1014e3;
                            }
                            InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) obj9;
                            boolean z310 = (r16.m87157i(interfaceC2994c0) ? 1 : 0) | (r16.m87157i(c15199y3) ? 1 : 0);
                            if (i15 == 32) {
                                r19 = 1;
                            } else {
                                r19 = r10;
                            }
                            z25 = (((z310 ? 1 : 0) | r19) == true ? 1 : 0) | (r16.m87153g(strM3000L) ? 1 : 0);
                            objM87133R9 = r16.m87133R();
                            if (z25 == 0) {
                                r110 = r10 == true ? 1 : 0;
                                C1040r c1040r5 = new C1040r(interfaceC2994c0, function1, (Object) strM3000L, c15199y3, interfaceC28601c7, 1);
                                r16.m87172p0(c1040r5);
                                objM87133R9 = c1040r5;
                            } else {
                                r110 = r10 == true ? 1 : 0;
                                C1040r c1040r6 = new C1040r(interfaceC2994c0, function1, (Object) strM3000L, c15199y3, interfaceC28601c7, 1);
                                r16.m87172p0(c1040r6);
                                objM87133R9 = c1040r6;
                            }
                            Function1 function6 = (Function1) objM87133R9;
                            boolean z311 = (r16.m87157i(interfaceC2994c0) ? 1 : 0) | (r16.m87157i(c15199y3) ? 1 : 0);
                            if (i15 == 32) {
                                z26 = true;
                            } else {
                                z26 = r110 == true ? 1 : 0;
                            }
                            z27 = (((z311 ? 1 : 0) | z26 ? 1 : 0) | (r16.m87153g(strM3000L) ? 1 : 0) ? 1 : 0) | (r16.m87157i(c4819gM2998J) ? 1 : 0);
                            objM87133R10 = r16.m87133R();
                            if (z27) {
                                C15199y3 c15199y6 = c15199y3;
                                C0561l c0561l2 = new C0561l((Object) interfaceC2994c0, function1, (Object) strM3000L, (Object) c4819gM2998J, (Object) c15199y6, (Object) interfaceC28601c7, 1);
                                c15199y3 = c15199y6;
                                interfaceC28601c7 = interfaceC28601c7;
                                r16.m87172p0(c0561l2);
                                objM87133R10 = c0561l2;
                            } else {
                                C15199y3 c15199y7 = c15199y3;
                                C0561l c0561l3 = new C0561l((Object) interfaceC2994c0, function1, (Object) strM3000L, (Object) c4819gM2998J, (Object) c15199y7, (Object) interfaceC28601c7, 1);
                                c15199y3 = c15199y7;
                                interfaceC28601c7 = interfaceC28601c7;
                                r16.m87172p0(c0561l3);
                                objM87133R10 = c0561l3;
                            }
                            ?? r26 = r16;
                            c15199y4 = c15199y3M3460c2;
                            AbstractC3436e0.m9933F(strM21273g4, z39, c4819gM2998J4, c15199y4, dateTime, localDate, z4, interfaceC2994c0, str, str2, null, interfaceC4339a3, function6, (InterfaceC4339a) objM87133R10, r26, 4096 | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016), 48, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                            ?? r117 = r26;
                            r117.m87173q(r110);
                            r112 = r110;
                            r111 = r117;
                        }
                        r111.m87173q(r112);
                        r114 = r112;
                        r113 = r111;
                    }
                    r113.m87173q(r114);
                    r14 = r114;
                    r17 = r113;
                } else {
                    ?? r118 = r10;
                    i17 = i17;
                    c15199y4 = c15199y3M3460c2;
                    r16.m87150e0(1737525416);
                    r16.m87173q(r118);
                    r14 = r118;
                    r17 = r16;
                }
                boolean z312 = ((r17.m87157i(interfaceC2994c0) ? 1 : 0) | (r17.m87157i(c15199y3) ? 1 : 0) ? 1 : 0) | (r17.m87157i(c15199y4) ? 1 : 0);
                if (i17 == 256) {
                    r18 = 1;
                } else {
                    r18 = r14;
                }
                i24 = (z312 ? 1 : 0) | r18;
                objM87133R7 = r17.m87133R();
                if (i24 == 0) {
                    C1045v c1045v2 = new C1045v(interfaceC2994c0, function2, interfaceC28601c8, c15199y3, interfaceC28601c7, c15199y4);
                    r17.m87172p0(c1045v2);
                    objM87133R7 = c1045v2;
                } else {
                    C1045v c1045v3 = new C1045v(interfaceC2994c0, function2, interfaceC28601c8, c15199y3, interfaceC28601c7, c15199y4);
                    r17.m87172p0(c1045v3);
                    objM87133R7 = c1045v3;
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R7, r14, r17, r14, 1);
                r17.m87173q(true);
                r15 = r17;
            }
            AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
            Modifier modifierM66724m2 = AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t)));
            C22957g c22957g2 = AbstractC22977m.f90652c;
            C2305k c2305k2 = C2299e.f9110M;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM66724m2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m7);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N7);
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(c4824l.getNavigationBarTitle(), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward()), new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, false ? 1 : 0).toString(), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
            i15 = i14 & 112;
            if (i15 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean zM87157i5 = z13 | c28655q2.m87157i(c4824l);
            i16 = i14 & 896;
            if (i16 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = zM87157i5 | z14;
            objM87133R = c28655q2.m87133R();
            if (z15) {
                c28676v0 = c28676v1;
                if (objM87133R == c28676v0) {
                    obj3 = objM87133R;
                }
                i17 = i16;
                AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) obj3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
                float f111 = 2;
                float f112 = 4;
                AbstractC11266d.m30469w(f111, f112, c2314t, c28655q2);
                float f113 = 8;
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, f111 * f113, 0.0f, 2);
                C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM3396r3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a5);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m8);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N8);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q2, 6);
                iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM3409f3);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a3);
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m9);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N9);
                TextResource textResourceM15236g3 = c4824l.getTitle();
                i18 = TextResource.$stable;
                String strM21274h7 = AbstractC8693b.m21274h(textResourceM15236g3, c28655q2, i18);
                C38072d c38072d3 = C38072d.f163053a;
                int i29 = C38072d.f163054b;
                C2886a c2886aM8418P3 = c38072d3.m121952e(c28655q2, i29).getT3();
                long jM125430y3 = c38072d3.m121949b(c28655q2, i29).getBrandWhite();
                int i210 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h7, null, jM125430y3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P3, null, c28655q2, 0, i210, 196602);
                AbstractC27274q.g gVar3 = AbstractC27274q.g.f109144f;
                int iM46245w3 = c38072d3.m121951d().getTinyIcons().getTinyInformation();
                objM87133R2 = c28655q2.m87133R();
                obj4 = objM87133R2;
                if (objM87133R2 == c28676v0) {
                    c cVar3 = c.f4044w;
                    c28655q2.m87172p0(cVar3);
                    obj4 = cVar3;
                }
                InterfaceC39332e interfaceC39332eM125323a3 = p745y81.Function1.m125323a((Function1) obj4);
                objM87133R3 = c28655q2.m87133R();
                obj5 = objM87133R3;
                if (objM87133R3 == c28676v0) {
                    d dVar3 = d.f4045w;
                    c28655q2.m87172p0(dVar3);
                    obj5 = dVar3;
                }
                C27270o c27270o3 = new C27270o(gVar3, iM46245w3, interfaceC39332eM125323a3, p745y81.Function1.m125323a((Function1) obj5), null, false, false, false, 0.0f, false, MessageListItemViewType.GIPHY, null);
                String strM92103Y3 = AbstractC30060g.m92103Y(c28655q2, AbstractC32706a.f135956j);
                if ((i14 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87157i = z16 | c28655q2.m87157i(c4824l);
                Object objM87133R111 = c28655q2.m87133R();
                if (zM87157i) {
                    C17820i c17820i4 = new C17820i(8, function3, c4824l);
                    c28655q2.m87172p0(c17820i4);
                    obj6 = c17820i4;
                } else {
                    C17820i c17820i5 = new C17820i(8, function3, c4824l);
                    c28655q2.m87172p0(c17820i5);
                    obj6 = c17820i5;
                }
                AbstractC27242b1.m82092d(c27270o3, strM92103Y3, null, null, (InterfaceC4339a) obj6, c28655q2, C27270o.f109105k, 12);
                c28655q2.m87173q(true);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f112, c2314t));
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4824l.getSubtitle(), c28655q2, i18), null, c38072d3.m121949b(c28655q2, i29).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q2, i29).getB1(), null, c28655q2, 0, i210, 196602);
                float f114 = 6 * f112;
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f114, c2314t));
                C39282o c39282oM15230a3 = c4824l.getAddManualMeasurement();
                C13762f c13762f3 = new C13762f(6);
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    interfaceC28601c2 = interfaceC28601c1;
                    C1010c c1010c7 = new C1010c(2, interfaceC28601c2);
                    c28655q2.m87172p0(c1010c7);
                    obj7 = c1010c7;
                } else {
                    interfaceC28601c2 = interfaceC28601c1;
                    obj7 = objM87133R4;
                }
                interfaceC28601c3 = interfaceC28601c2;
                AbstractC25303l.m74291r(c39282oM15230a3, null, c13762f3, (Function1) obj7, c28655q2, C39282o.f168987q | 3072, 2);
                AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f114, c2314t));
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f112 * f113, 7);
                C22971k c22971kM66746i3 = AbstractC22977m.m66746i(3 * f112);
                boolean zM87157i6 = c28655q2.m87157i(c4824l);
                if (i15 == 32) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = zM87157i6 | z17;
                objM87133R5 = c28655q2.m87133R();
                if (z18) {
                    i19 = i14;
                    interfaceC28601c4 = interfaceC28601c11;
                    z19 = false;
                    C1040r c1040r7 = new C1040r((Object) c4824l, (Object) function1, (Object) interfaceC28601c13, (Object) interfaceC28601c12, (Object) interfaceC28601c4, 0);
                    interfaceC28601c5 = interfaceC28601c13;
                    interfaceC28601c6 = interfaceC28601c12;
                    c28655q2.m87172p0(c1040r7);
                    objM87133R5 = c1040r7;
                } else {
                    i19 = i14;
                    interfaceC28601c4 = interfaceC28601c11;
                    z19 = false;
                    C1040r c1040r8 = new C1040r((Object) c4824l, (Object) function1, (Object) interfaceC28601c13, (Object) interfaceC28601c12, (Object) interfaceC28601c4, 0);
                    interfaceC28601c5 = interfaceC28601c13;
                    interfaceC28601c6 = interfaceC28601c12;
                    c28655q2.m87172p0(c1040r8);
                    objM87133R5 = c1040r8;
                }
                z24 = z19;
                AbstractC22674j.m65717c(modifierM3398t3, c26068uM77569a, null, c22971kM66746i3, null, null, false, null, (Function1) objM87133R5, c28655q2, 24582, 492);
                c28655q = c28655q2;
                String strM15257a4 = c4824l.getSections().getNextToken();
                objM87133R6 = c28655q.m87133R();
                obj8 = objM87133R6;
                if (objM87133R6 == c28676v0) {
                    C1010c c1010c8 = new C1010c(3, interfaceC28601c9);
                    c28655q.m87172p0(c1010c8);
                    obj8 = c1010c8;
                }
                interfaceC28601c7 = interfaceC28601c4;
                m3052z(c26068uM77569a, 0, strM15257a4, (Function1) obj8, c28655q, 3072, 1);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                if (m2996H(interfaceC28601c9)) {
                    c28655q.m87150e0(1734447581);
                    m3050x(c28655q, z24 ? 1 : 0);
                    strM15257a = c4824l.getSections().getNextToken();
                    if (strM15257a != null) {
                        function1.invoke(new AbstractC4837y.g(c4824l.getMetaData().getGraphKey(), strM15257a));
                    }
                    c28655q.m87173q(z24);
                } else {
                    c28655q.m87150e0(1734642664);
                    c28655q.m87173q(z24);
                }
                if (m3022d0(interfaceC28601c3)) {
                    interfaceC28601c8 = interfaceC28601c3;
                    boolean z212 = z24 ? 1 : 0;
                    c15199y3 = c15199y3M3460c;
                    interfaceC2994c0 = interfaceC2994c1;
                    c28655q.m87150e0(1735787432);
                    c28655q.m87173q(z212);
                    r10 = z212;
                    r16 = c28655q;
                } else {
                    interfaceC28601c8 = interfaceC28601c3;
                    boolean z213 = z24 ? 1 : 0;
                    c15199y3 = c15199y3M3460c;
                    interfaceC2994c0 = interfaceC2994c1;
                    c28655q.m87150e0(1735787432);
                    c28655q.m87173q(z213);
                    r10 = z213;
                    r16 = c28655q;
                }
                if (m3028g0(interfaceC28601c7)) {
                    r16.m87150e0(-913833805);
                    c4819gM2998J = m2998J(interfaceC28601c6);
                    if (c4819gM2998J == null) {
                        r16.m87150e0(1735923118);
                        r16.m87173q(r10);
                        r114 = r10;
                        i17 = i17;
                        c15199y4 = c15199y3M3460c2;
                        r113 = r16;
                    } else {
                        r16.m87150e0(1735923119);
                        strM3000L = m3000L(interfaceC28601c5);
                        if (strM3000L == null) {
                            r16.m87150e0(1503597964);
                            r16.m87173q(r10);
                            r112 = r10;
                            i17 = i17;
                            c15199y4 = c15199y3M3460c2;
                            r111 = r16;
                        } else {
                            r16.m87150e0(1503597965);
                            C4819g c4819gM2998J6 = m2998J(interfaceC28601c6);
                            AbstractC22676k.m65747g(c4819gM2998J6);
                            String strM21273g5 = AbstractC8693b.m21273g(AbstractC32706a.f135957k, r16, r10);
                            C4819g c4819gM2998J7 = m2998J(interfaceC28601c6);
                            AbstractC22676k.m65747g(c4819gM2998J7);
                            String lowerCase3 = c4819gM2998J7.getSource().toLowerCase(Locale.ROOT);
                            AbstractC22676k.m65749i(lowerCase3, "toLowerCase(...)");
                            boolean z313 = !lowerCase3.equals("manual");
                            textResourceM15217h = c4819gM2998J.getSaveTitle();
                            if (textResourceM15217h == null) {
                                r16.m87150e0(1265554631);
                                r16.m87173q(r10);
                                str = null;
                            } else {
                                r16.m87150e0(1265554632);
                                String strM21274h8 = AbstractC8693b.m21274h(textResourceM15217h, r16, i18);
                                r16.m87173q(r10);
                                str = strM21274h8;
                            }
                            textResourceM15212c = c4819gM2998J.getDeleteTitle();
                            if (textResourceM15212c == null) {
                                r16.m87150e0(1265644903);
                                r16.m87173q(r10);
                                str2 = null;
                            } else {
                                r16.m87150e0(1265644904);
                                String strM21274h9 = AbstractC8693b.m21274h(textResourceM15212c, r16, i18);
                                r16.m87173q(r10);
                                str2 = strM21274h9;
                            }
                            objM87133R8 = r16.m87133R();
                            obj9 = objM87133R8;
                            if (objM87133R8 == c28676v0) {
                                C1014e c1014e4 = new C1014e(2, interfaceC28601c7);
                                r16.m87172p0(c1014e4);
                                obj9 = c1014e4;
                            }
                            InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) obj9;
                            boolean z314 = (r16.m87157i(interfaceC2994c0) ? 1 : 0) | (r16.m87157i(c15199y3) ? 1 : 0);
                            if (i15 == 32) {
                                r19 = 1;
                            } else {
                                r19 = r10;
                            }
                            z25 = (((z314 ? 1 : 0) | r19) == true ? 1 : 0) | (r16.m87153g(strM3000L) ? 1 : 0);
                            objM87133R9 = r16.m87133R();
                            if (z25 == 0) {
                                r110 = r10 == true ? 1 : 0;
                                C1040r c1040r9 = new C1040r(interfaceC2994c0, function1, (Object) strM3000L, c15199y3, interfaceC28601c7, 1);
                                r16.m87172p0(c1040r9);
                                objM87133R9 = c1040r9;
                            } else {
                                r110 = r10 == true ? 1 : 0;
                                C1040r c1040r10 = new C1040r(interfaceC2994c0, function1, (Object) strM3000L, c15199y3, interfaceC28601c7, 1);
                                r16.m87172p0(c1040r10);
                                objM87133R9 = c1040r10;
                            }
                            Function1 function7 = (Function1) objM87133R9;
                            boolean z315 = (r16.m87157i(interfaceC2994c0) ? 1 : 0) | (r16.m87157i(c15199y3) ? 1 : 0);
                            if (i15 == 32) {
                                z26 = true;
                            } else {
                                z26 = r110 == true ? 1 : 0;
                            }
                            z27 = (((z315 ? 1 : 0) | z26 ? 1 : 0) | (r16.m87153g(strM3000L) ? 1 : 0) ? 1 : 0) | (r16.m87157i(c4819gM2998J) ? 1 : 0);
                            objM87133R10 = r16.m87133R();
                            if (z27) {
                                C15199y3 c15199y8 = c15199y3;
                                C0561l c0561l4 = new C0561l((Object) interfaceC2994c0, function1, (Object) strM3000L, (Object) c4819gM2998J, (Object) c15199y8, (Object) interfaceC28601c7, 1);
                                c15199y3 = c15199y8;
                                interfaceC28601c7 = interfaceC28601c7;
                                r16.m87172p0(c0561l4);
                                objM87133R10 = c0561l4;
                            } else {
                                C15199y3 c15199y9 = c15199y3;
                                C0561l c0561l5 = new C0561l((Object) interfaceC2994c0, function1, (Object) strM3000L, (Object) c4819gM2998J, (Object) c15199y9, (Object) interfaceC28601c7, 1);
                                c15199y3 = c15199y9;
                                interfaceC28601c7 = interfaceC28601c7;
                                r16.m87172p0(c0561l5);
                                objM87133R10 = c0561l5;
                            }
                            ?? r27 = r16;
                            c15199y4 = c15199y3M3460c2;
                            AbstractC3436e0.m9933F(strM21273g5, z313, c4819gM2998J6, c15199y4, dateTime, localDate, z4, interfaceC2994c0, str, str2, null, interfaceC4339a4, function7, (InterfaceC4339a) objM87133R10, r27, 4096 | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016), 48, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                            ?? r119 = r27;
                            r119.m87173q(r110);
                            r112 = r110;
                            r111 = r119;
                        }
                        r111.m87173q(r112);
                        r114 = r112;
                        r113 = r111;
                    }
                    r113.m87173q(r114);
                    r14 = r114;
                    r17 = r113;
                } else {
                    ?? r1110 = r10;
                    i17 = i17;
                    c15199y4 = c15199y3M3460c2;
                    r16.m87150e0(1737525416);
                    r16.m87173q(r1110);
                    r14 = r1110;
                    r17 = r16;
                }
                boolean z316 = ((r17.m87157i(interfaceC2994c0) ? 1 : 0) | (r17.m87157i(c15199y3) ? 1 : 0) ? 1 : 0) | (r17.m87157i(c15199y4) ? 1 : 0);
                if (i17 == 256) {
                    r18 = 1;
                } else {
                    r18 = r14;
                }
                i24 = (z316 ? 1 : 0) | r18;
                objM87133R7 = r17.m87133R();
                if (i24 == 0) {
                    C1045v c1045v4 = new C1045v(interfaceC2994c0, function2, interfaceC28601c8, c15199y3, interfaceC28601c7, c15199y4);
                    r17.m87172p0(c1045v4);
                    objM87133R7 = c1045v4;
                } else {
                    C1045v c1045v5 = new C1045v(interfaceC2994c0, function2, interfaceC28601c8, c15199y3, interfaceC28601c7, c15199y4);
                    r17.m87172p0(c1045v5);
                    objM87133R7 = c1045v5;
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R7, r14, r17, r14, 1);
                r17.m87173q(true);
                r15 = r17;
            } else {
                c28676v0 = c28676v1;
            }
            C3718c c3718c2 = new C3718c(function1, c4824l, function2, 4);
            c28655q2.m87172p0(c3718c2);
            obj3 = c3718c2;
            i17 = i16;
            AbstractC6719b.m20143d(null, aVar2, null, (InterfaceC4339a) obj3, null, null, c28655q2, AbstractC6721d.a.f25641r << 3, 53);
            float f115 = 2;
            float f116 = 4;
            AbstractC11266d.m30469w(f115, f116, c2314t, c28655q2);
            float f117 = 8;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, f115 * f117, 0.0f, 2);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3396r4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m10);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N10);
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q2, 6);
            iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM3409f4);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m11);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N11);
            TextResource textResourceM15236g4 = c4824l.getTitle();
            i18 = TextResource.$stable;
            String strM21274h10 = AbstractC8693b.m21274h(textResourceM15236g4, c28655q2, i18);
            C38072d c38072d4 = C38072d.f163053a;
            int i211 = C38072d.f163054b;
            C2886a c2886aM8418P4 = c38072d4.m121952e(c28655q2, i211).getT3();
            long jM125430y4 = c38072d4.m121949b(c28655q2, i211).getBrandWhite();
            int i212 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h10, null, jM125430y4, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P4, null, c28655q2, 0, i212, 196602);
            AbstractC27274q.g gVar4 = AbstractC27274q.g.f109144f;
            int iM46245w4 = c38072d4.m121951d().getTinyIcons().getTinyInformation();
            objM87133R2 = c28655q2.m87133R();
            obj4 = objM87133R2;
            if (objM87133R2 == c28676v0) {
                c cVar4 = c.f4044w;
                c28655q2.m87172p0(cVar4);
                obj4 = cVar4;
            }
            InterfaceC39332e interfaceC39332eM125323a4 = p745y81.Function1.m125323a((Function1) obj4);
            objM87133R3 = c28655q2.m87133R();
            obj5 = objM87133R3;
            if (objM87133R3 == c28676v0) {
                d dVar4 = d.f4045w;
                c28655q2.m87172p0(dVar4);
                obj5 = dVar4;
            }
            C27270o c27270o4 = new C27270o(gVar4, iM46245w4, interfaceC39332eM125323a4, p745y81.Function1.m125323a((Function1) obj5), null, false, false, false, 0.0f, false, MessageListItemViewType.GIPHY, null);
            String strM92103Y4 = AbstractC30060g.m92103Y(c28655q2, AbstractC32706a.f135956j);
            if ((i14 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87157i = z16 | c28655q2.m87157i(c4824l);
            Object objM87133R112 = c28655q2.m87133R();
            if (zM87157i) {
                C17820i c17820i6 = new C17820i(8, function3, c4824l);
                c28655q2.m87172p0(c17820i6);
                obj6 = c17820i6;
            } else {
                C17820i c17820i7 = new C17820i(8, function3, c4824l);
                c28655q2.m87172p0(c17820i7);
                obj6 = c17820i7;
            }
            AbstractC27242b1.m82092d(c27270o4, strM92103Y4, null, null, (InterfaceC4339a) obj6, c28655q2, C27270o.f109105k, 12);
            c28655q2.m87173q(true);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(1 * f116, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c4824l.getSubtitle(), c28655q2, i18), null, c38072d4.m121949b(c28655q2, i211).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q2, i211).getB1(), null, c28655q2, 0, i212, 196602);
            float f118 = 6 * f116;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f118, c2314t));
            C39282o c39282oM15230a4 = c4824l.getAddManualMeasurement();
            C13762f c13762f4 = new C13762f(6);
            objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v0) {
                interfaceC28601c2 = interfaceC28601c1;
                C1010c c1010c9 = new C1010c(2, interfaceC28601c2);
                c28655q2.m87172p0(c1010c9);
                obj7 = c1010c9;
            } else {
                interfaceC28601c2 = interfaceC28601c1;
                obj7 = objM87133R4;
            }
            interfaceC28601c3 = interfaceC28601c2;
            AbstractC25303l.m74291r(c39282oM15230a4, null, c13762f4, (Function1) obj7, c28655q2, C39282o.f168987q | 3072, 2);
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3411h(f118, c2314t));
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f116 * f117, 7);
            C22971k c22971kM66746i4 = AbstractC22977m.m66746i(3 * f116);
            boolean zM87157i7 = c28655q2.m87157i(c4824l);
            if (i15 == 32) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = zM87157i7 | z17;
            objM87133R5 = c28655q2.m87133R();
            if (z18) {
                i19 = i14;
                interfaceC28601c4 = interfaceC28601c11;
                z19 = false;
                C1040r c1040r11 = new C1040r((Object) c4824l, (Object) function1, (Object) interfaceC28601c13, (Object) interfaceC28601c12, (Object) interfaceC28601c4, 0);
                interfaceC28601c5 = interfaceC28601c13;
                interfaceC28601c6 = interfaceC28601c12;
                c28655q2.m87172p0(c1040r11);
                objM87133R5 = c1040r11;
            } else {
                i19 = i14;
                interfaceC28601c4 = interfaceC28601c11;
                z19 = false;
                C1040r c1040r12 = new C1040r((Object) c4824l, (Object) function1, (Object) interfaceC28601c13, (Object) interfaceC28601c12, (Object) interfaceC28601c4, 0);
                interfaceC28601c5 = interfaceC28601c13;
                interfaceC28601c6 = interfaceC28601c12;
                c28655q2.m87172p0(c1040r12);
                objM87133R5 = c1040r12;
            }
            z24 = z19;
            AbstractC22674j.m65717c(modifierM3398t4, c26068uM77569a, null, c22971kM66746i4, null, null, false, null, (Function1) objM87133R5, c28655q2, 24582, 492);
            c28655q = c28655q2;
            String strM15257a5 = c4824l.getSections().getNextToken();
            objM87133R6 = c28655q.m87133R();
            obj8 = objM87133R6;
            if (objM87133R6 == c28676v0) {
                C1010c c1010c10 = new C1010c(3, interfaceC28601c9);
                c28655q.m87172p0(c1010c10);
                obj8 = c1010c10;
            }
            interfaceC28601c7 = interfaceC28601c4;
            m3052z(c26068uM77569a, 0, strM15257a5, (Function1) obj8, c28655q, 3072, 1);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (m2996H(interfaceC28601c9)) {
                c28655q.m87150e0(1734447581);
                m3050x(c28655q, z24 ? 1 : 0);
                strM15257a = c4824l.getSections().getNextToken();
                if (strM15257a != null) {
                    function1.invoke(new AbstractC4837y.g(c4824l.getMetaData().getGraphKey(), strM15257a));
                }
                c28655q.m87173q(z24);
            } else {
                c28655q.m87150e0(1734642664);
                c28655q.m87173q(z24);
            }
            if (m3022d0(interfaceC28601c3)) {
                interfaceC28601c8 = interfaceC28601c3;
                boolean z214 = z24 ? 1 : 0;
                c15199y3 = c15199y3M3460c;
                interfaceC2994c0 = interfaceC2994c1;
                c28655q.m87150e0(1735787432);
                c28655q.m87173q(z214);
                r10 = z214;
                r16 = c28655q;
            } else {
                interfaceC28601c8 = interfaceC28601c3;
                boolean z215 = z24 ? 1 : 0;
                c15199y3 = c15199y3M3460c;
                interfaceC2994c0 = interfaceC2994c1;
                c28655q.m87150e0(1735787432);
                c28655q.m87173q(z215);
                r10 = z215;
                r16 = c28655q;
            }
            if (m3028g0(interfaceC28601c7)) {
                r16.m87150e0(-913833805);
                c4819gM2998J = m2998J(interfaceC28601c6);
                if (c4819gM2998J == null) {
                    r16.m87150e0(1735923118);
                    r16.m87173q(r10);
                    r114 = r10;
                    i17 = i17;
                    c15199y4 = c15199y3M3460c2;
                    r113 = r16;
                } else {
                    r16.m87150e0(1735923119);
                    strM3000L = m3000L(interfaceC28601c5);
                    if (strM3000L == null) {
                        r16.m87150e0(1503597964);
                        r16.m87173q(r10);
                        r112 = r10;
                        i17 = i17;
                        c15199y4 = c15199y3M3460c2;
                        r111 = r16;
                    } else {
                        r16.m87150e0(1503597965);
                        C4819g c4819gM2998J8 = m2998J(interfaceC28601c6);
                        AbstractC22676k.m65747g(c4819gM2998J8);
                        String strM21273g6 = AbstractC8693b.m21273g(AbstractC32706a.f135957k, r16, r10);
                        C4819g c4819gM2998J9 = m2998J(interfaceC28601c6);
                        AbstractC22676k.m65747g(c4819gM2998J9);
                        String lowerCase4 = c4819gM2998J9.getSource().toLowerCase(Locale.ROOT);
                        AbstractC22676k.m65749i(lowerCase4, "toLowerCase(...)");
                        boolean z317 = !lowerCase4.equals("manual");
                        textResourceM15217h = c4819gM2998J.getSaveTitle();
                        if (textResourceM15217h == null) {
                            r16.m87150e0(1265554631);
                            r16.m87173q(r10);
                            str = null;
                        } else {
                            r16.m87150e0(1265554632);
                            String strM21274h11 = AbstractC8693b.m21274h(textResourceM15217h, r16, i18);
                            r16.m87173q(r10);
                            str = strM21274h11;
                        }
                        textResourceM15212c = c4819gM2998J.getDeleteTitle();
                        if (textResourceM15212c == null) {
                            r16.m87150e0(1265644903);
                            r16.m87173q(r10);
                            str2 = null;
                        } else {
                            r16.m87150e0(1265644904);
                            String strM21274h12 = AbstractC8693b.m21274h(textResourceM15212c, r16, i18);
                            r16.m87173q(r10);
                            str2 = strM21274h12;
                        }
                        objM87133R8 = r16.m87133R();
                        obj9 = objM87133R8;
                        if (objM87133R8 == c28676v0) {
                            C1014e c1014e5 = new C1014e(2, interfaceC28601c7);
                            r16.m87172p0(c1014e5);
                            obj9 = c1014e5;
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) obj9;
                        boolean z318 = (r16.m87157i(interfaceC2994c0) ? 1 : 0) | (r16.m87157i(c15199y3) ? 1 : 0);
                        if (i15 == 32) {
                            r19 = 1;
                        } else {
                            r19 = r10;
                        }
                        z25 = (((z318 ? 1 : 0) | r19) == true ? 1 : 0) | (r16.m87153g(strM3000L) ? 1 : 0);
                        objM87133R9 = r16.m87133R();
                        if (z25 == 0) {
                            r110 = r10 == true ? 1 : 0;
                            C1040r c1040r13 = new C1040r(interfaceC2994c0, function1, (Object) strM3000L, c15199y3, interfaceC28601c7, 1);
                            r16.m87172p0(c1040r13);
                            objM87133R9 = c1040r13;
                        } else {
                            r110 = r10 == true ? 1 : 0;
                            C1040r c1040r14 = new C1040r(interfaceC2994c0, function1, (Object) strM3000L, c15199y3, interfaceC28601c7, 1);
                            r16.m87172p0(c1040r14);
                            objM87133R9 = c1040r14;
                        }
                        Function1 function8 = (Function1) objM87133R9;
                        boolean z319 = (r16.m87157i(interfaceC2994c0) ? 1 : 0) | (r16.m87157i(c15199y3) ? 1 : 0);
                        if (i15 == 32) {
                            z26 = true;
                        } else {
                            z26 = r110 == true ? 1 : 0;
                        }
                        z27 = (((z319 ? 1 : 0) | z26 ? 1 : 0) | (r16.m87153g(strM3000L) ? 1 : 0) ? 1 : 0) | (r16.m87157i(c4819gM2998J) ? 1 : 0);
                        objM87133R10 = r16.m87133R();
                        if (z27) {
                            C15199y3 c15199y10 = c15199y3;
                            C0561l c0561l6 = new C0561l((Object) interfaceC2994c0, function1, (Object) strM3000L, (Object) c4819gM2998J, (Object) c15199y10, (Object) interfaceC28601c7, 1);
                            c15199y3 = c15199y10;
                            interfaceC28601c7 = interfaceC28601c7;
                            r16.m87172p0(c0561l6);
                            objM87133R10 = c0561l6;
                        } else {
                            C15199y3 c15199y11 = c15199y3;
                            C0561l c0561l7 = new C0561l((Object) interfaceC2994c0, function1, (Object) strM3000L, (Object) c4819gM2998J, (Object) c15199y11, (Object) interfaceC28601c7, 1);
                            c15199y3 = c15199y11;
                            interfaceC28601c7 = interfaceC28601c7;
                            r16.m87172p0(c0561l7);
                            objM87133R10 = c0561l7;
                        }
                        ?? r28 = r16;
                        c15199y4 = c15199y3M3460c2;
                        AbstractC3436e0.m9933F(strM21273g6, z317, c4819gM2998J8, c15199y4, dateTime, localDate, z4, interfaceC2994c0, str, str2, null, interfaceC4339a5, function8, (InterfaceC4339a) objM87133R10, r28, 4096 | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016), 48, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
                        ?? r1111 = r28;
                        r1111.m87173q(r110);
                        r112 = r110;
                        r111 = r1111;
                    }
                    r111.m87173q(r112);
                    r114 = r112;
                    r113 = r111;
                }
                r113.m87173q(r114);
                r14 = r114;
                r17 = r113;
            } else {
                ?? r1112 = r10;
                i17 = i17;
                c15199y4 = c15199y3M3460c2;
                r16.m87150e0(1737525416);
                r16.m87173q(r1112);
                r14 = r1112;
                r17 = r16;
            }
            boolean z3110 = ((r17.m87157i(interfaceC2994c0) ? 1 : 0) | (r17.m87157i(c15199y3) ? 1 : 0) ? 1 : 0) | (r17.m87157i(c15199y4) ? 1 : 0);
            if (i17 == 256) {
                r18 = 1;
            } else {
                r18 = r14;
            }
            i24 = (z3110 ? 1 : 0) | r18;
            objM87133R7 = r17.m87133R();
            if (i24 == 0) {
                C1045v c1045v6 = new C1045v(interfaceC2994c0, function2, interfaceC28601c8, c15199y3, interfaceC28601c7, c15199y4);
                r17.m87172p0(c1045v6);
                objM87133R7 = c1045v6;
            } else {
                C1045v c1045v7 = new C1045v(interfaceC2994c0, function2, interfaceC28601c8, c15199y3, interfaceC28601c7, c15199y4);
                r17.m87172p0(c1045v7);
                objM87133R7 = c1045v7;
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R7, r14, r17, r14, 1);
            r17.m87173q(true);
            r15 = r17;
        } else {
            c28655q2.m87138X();
            r15 = c28655q2;
        }
        C28677v1 c28677v1M87180u = r15.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1044u(c4824l, function1, function2, function3, dateTime, localDate, z4, i13, 1);
        }
    }

    /* JADX INFO: renamed from: H */
    private static final boolean m2996H(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final boolean m2997I(InterfaceC28601c1 interfaceC28601c1, EnumC15209z3 it) {
        AbstractC22676k.m65750j(it, "it");
        if (it != EnumC15209z3.f57106w) {
            return true;
        }
        m3030h0(interfaceC28601c1, false);
        return true;
    }

    /* JADX INFO: renamed from: J */
    private static final C4819g m2998J(InterfaceC28601c1 interfaceC28601c1) {
        return (C4819g) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m2999K(InterfaceC28601c1 interfaceC28601c1, C4819g c4819g) {
        interfaceC28601c1.setValue(c4819g);
    }

    /* JADX INFO: renamed from: L */
    private static final String m3000L(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final void m3001M(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m3002N(Function1 function1, C4824l c4824l, Function1 function2) {
        function1.invoke(new AbstractC4837y.n(c4824l.getMetaData().getGraphKey(), c4824l.getMetaData().getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), c4824l.getMetaData().getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), false, null, false, 56, null));
        function2.invoke(new AbstractC39640g.d(AbstractC39640g.b.Compose));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m3003O(Function1 function1, C4824l c4824l) {
        function1.invoke(c4824l.getMetaData().getGraphKey().toTrendKey());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final Modifier m3004P(C39282o it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-574443932);
        Modifier modifierM3396r = AbstractC1099a.m3396r(C2314t.f9131w, 0.0f, 1 * 8, 1);
        c28655q.m87173q(false);
        return modifierM3396r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m3005Q(InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        m3024e0(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m3006R(C4824l c4824l, Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        List<C4823k> listM15258b = c4824l.getSections().m15258b();
        C26053f c26053f = (C26053f) LazyColumn;
        c26053f.m77529r(listM15258b.size(), new m(new C28503p(18), listM15258b), new n(l.f4064w, listM15258b), new C37816b(new o(listM15258b, function1, interfaceC28601c1, interfaceC28601c2, interfaceC28601c3), true, 802480018));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final Object m3007S(C4823k it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m3008T(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m3020c0(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m3009U(InterfaceC28601c1 interfaceC28601c1) {
        m3024e0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m3010V(InterfaceC2994c0 interfaceC2994c0, Function1 function1, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, C3439f0 result) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new g(c15199y3, null), 3);
        m3024e0(interfaceC28601c1, false);
        function1.invoke(new AbstractC4837y.b(result));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m3011W() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m3012X(InterfaceC28601c1 interfaceC28601c1) {
        m3030h0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m3013Y(InterfaceC2994c0 interfaceC2994c0, Function1 function1, String str, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, C3439f0 result) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new h(c15199y3, null), 3);
        m3030h0(interfaceC28601c1, false);
        function1.invoke(new AbstractC4837y.p(str, result));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m3014Z(InterfaceC2994c0 interfaceC2994c0, Function1 function1, String str, C4819g c4819g, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new i(c15199y3, null), 3);
        m3030h0(interfaceC28601c1, false);
        function1.invoke(new AbstractC4837y.d(str, c4819g.getSource()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m3016a0(InterfaceC2994c0 interfaceC2994c0, Function1 function1, InterfaceC28601c1 interfaceC28601c1, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c2, C15199y3 c15199y4) {
        if (m3022d0(interfaceC28601c1)) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new j(c15199y3, interfaceC28601c1, null), 3);
        }
        if (m3028g0(interfaceC28601c2)) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new k(c15199y4, interfaceC28601c2, null), 3);
        }
        function1.invoke(new AbstractC39640g.d(AbstractC39640g.b.Compose));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m3018b0(C4824l c4824l, Function1 function1, Function1 function2, Function1 function3, DateTime dateTime, LocalDate localDate, boolean z4, int i13, Composer composer, int i14) {
        m2995G(c4824l, function1, function2, function3, dateTime, localDate, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c0 */
    private static final void m3020c0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: d0 */
    private static final boolean m3022d0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final void m3024e0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final boolean m3026f0(InterfaceC28601c1 interfaceC28601c1, EnumC15209z3 it) {
        AbstractC22676k.m65750j(it, "it");
        if (it != EnumC15209z3.f57106w) {
            return true;
        }
        m3024e0(interfaceC28601c1, false);
        return true;
    }

    /* JADX INFO: renamed from: g0 */
    private static final boolean m3028g0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final void m3030h0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: x */
    private static final void m3050x(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1097431039);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            float f13 = 8;
            Modifier modifierM3411h = AbstractC1102d.m3411h(f13 * 4, AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 3 * f13, 7));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3411h);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC35684p.m113047h(null, InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62210d)), false, 0.0f, 0, null, null, null, null, c28655q, 0, 509);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0130h(i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m3051y(int i13, Composer composer, int i14) {
        m3050x(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: z */
    private static final void m3052z(C26068u c26068u, int i13, String str, Function1 function1, Composer composer, int i14, int i15) {
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(490159849);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87153g(c26068u) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q.m87153g(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q.m87157i(function1) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 1171) != 1170)) {
            if (i17 != 0) {
                i13 = 0;
            }
            boolean z4 = (i16 & 896) == 256;
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87264r(new C1020h(c26068u, str, i13, 1));
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC28670t2 interfaceC28670t2 = (InterfaceC28670t2) objM87133R;
            boolean zM87153g = c28655q.m87153g(interfaceC28670t2) | ((i16 & 7168) == 2048);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new a(interfaceC28670t2, function1, null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, interfaceC28670t2);
        } else {
            c28655q.m87138X();
        }
        int i18 = i13;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1022i(c26068u, i18, str, function1, i14, i15, 1);
        }
    }
}
