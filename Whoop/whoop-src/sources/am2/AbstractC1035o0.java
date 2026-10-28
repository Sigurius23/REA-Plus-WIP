package am2;

import a20.C0167g;
import a41.C0373i;
import al0.C0974i;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.AbstractC1707m0;
import b61.AbstractC2756k;
import b91.C2886a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bm2.AbstractC3431c1;
import bm2.AbstractC3435e;
import bm2.AbstractC3436e0;
import bm2.AbstractC3468q;
import bm2.AbstractC3469q0;
import bm2.AbstractC3487z0;
import bm2.C3432d;
import bm2.C3437e1;
import bm2.C3438f;
import bm2.C3439f0;
import bm2.C3448i0;
import bm2.C3458l1;
import bm2.C3470r;
import bm2.C3471r0;
import bm2.EnumC3457l0;
import c01.C3802b;
import c01.C3808h;
import c41.C4071m2;
import c41.C4092p2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cm2.AbstractC4813a0;
import cm2.AbstractC4835w;
import cm2.AbstractC4837y;
import cm2.C4819g;
import cm2.EnumC4816d;
import cm2.EnumC4821i;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.item.DesignItemInteraction;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.SeeAllRecordingsScreenModel;
import com.whoop.util.TrendKey;
import d61.InterfaceC11732a;
import dp0.AbstractC12248d;
import dp0.AbstractC12250f;
import ec3.C13084s1;
import ec3.InterfaceC13062m;
import ep0.C13404j;
import fy1.AbstractC14874j;
import gb1.AbstractC15673b0;
import gf1.C15784c;
import gf1.C15791j;
import h01.AbstractC16549p;
import h01.C16550q;
import h51.C16934f;
import hg3.AbstractC17269i;
import hv1.C17675e;
import i11.C17858a;
import i11.C17863f;
import ih0.AbstractC18489d0;
import io.sentry.config.AbstractC20301a;
import j11.AbstractC21211n;
import j71.C21395c;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k21.C22157a;
import k21.C22160d;
import k71.C22246d;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.C22411w;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n21.AbstractC26189c;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.C27256h;
import ny0.EnumC27269n0;
import ny0.EnumC27284v;
import or2.EnumC28166h0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.C13762f;
import p000.C17820i;
import p000.C21061j;
import p000.C22079k;
import p000.C28503p;
import p000.C29656q;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p077d0.AbstractC11348f;
import p077d0.C11347e2;
import p163g1.AbstractC15005f3;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23254g;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.C25308q;
import p720m91.Function1;
import p720m91.InterfaceC25297f;
import p720m91.InterfaceC25312u;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import p736sz0.AbstractC33231x0;
import p736sz0.C33223u0;
import p745y81.C39336i;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import q32.InterfaceC29950b;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qz0.AbstractC30795n;
import r21.C30885c;
import r21.C30886d;
import r83.EnumC31071a;
import rz0.AbstractC31926e;
import s01.C32048d;
import s32.C32110b;
import s32.C32115g;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sl2.AbstractC32706a;
import te0.AbstractC33745d;
import vl2.EnumC36106a;
import vz0.AbstractC36612a;
import vz0.C36613b;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import y71.AbstractC39281n;
import y71.C39274g;
import y71.C39282o;
import yl2.AbstractC39640g;
import yl2.C39635b;
import yl2.C39645l;

/* JADX INFO: renamed from: am2.o0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a£\u0001\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010 \u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b \u0010!\u001a!\u0010%\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020#H\u0001¢\u0006\u0004\b%\u0010&\u001a?\u0010)\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020'2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010-\u001a\u00020,*\u00020+H\u0002¢\u0006\u0004\b-\u0010.\"\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u0006:²\u0006\u000e\u00103\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00105\u001a\u0004\u0018\u0001048\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00107\u001a\u0004\u0018\u0001068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00108\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00109\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lcm2/a0;", "viewState", "Lkotlin/Function1;", "Lcm2/y;", "Ll83/a0;", "onViewEvent", "Lyl2/g;", "onNavigationEvent", "Lcm2/w;", "onAnalyticsEvent", "Lkotlin/Function2;", "", "Lcom/whoop/util/TrendKey;", "onCarouselItemClicked", "onBodyCompInfoClicked", "Lorg/joda/time/DateTime;", "dateTimeNow", "Lorg/joda/time/LocalDate;", "localDateNow", "", "isUsing24HourTime", "isExerciseDetailsV2ExperimentEnabled", "g0", "(Lcm2/a0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lorg/joda/time/DateTime;Lorg/joda/time/LocalDate;ZZLandroidx/compose/runtime/Composer;II)V", NotificationCompat.CATEGORY_EVENT, "n1", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Z)V", "Lam2/p0;", "state", "X", "(Lam2/p0;Landroidx/compose/runtime/Composer;I)V", "Lk21/d;", "Z", "(Lk21/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lam2/o;", "Ly3/f;", "horizontalPadding", "e0", "(Lam2/o;FLandroidx/compose/runtime/Composer;II)V", "Lbm2/i0;", "onEvent", "e1", "(Lbm2/i0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lam2/p;", "Lk71/d;", "o1", "(Lam2/p;)Lk71/d;", "Lm91/p;", "a", "Lm91/p;", "trendsMiniArchItemFactory", "showManualMeasurements", "Lhv1/e;", "manualMeasurementBottomSheetViewState", "", "selectedMenuId", "isMenuSheetVisible", "showVo2MaxDialog", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC1035o0 {

    /* JADX INFO: renamed from: a */
    private static final C25307p f3931a = Function1.m74306g(new C28503p(24));

    /* JADX INFO: renamed from: am2.o0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements p715kotlin.jvm.functions.Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f3932w = new a();

        /* JADX INFO: renamed from: a */
        public final long m2929a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m2929a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: am2.o0$b */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.TrendsScreenKt$TrendsScreen$1$1", m100430f = "TrendsScreen.kt", m100431l = {203}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f3933E;

        /* JADX INFO: renamed from: w */
        int f3934w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f3935x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f3936y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f3937z;

        /* JADX INFO: renamed from: am2.o0$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ p715kotlin.jvm.functions.Function1 f3938w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28601c1 f3939x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f3940y;

            public a(p715kotlin.jvm.functions.Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
                this.f3938w = function1;
                this.f3939x = interfaceC28601c1;
                this.f3940y = interfaceC28601c2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(EnumC15209z3 enumC15209z3, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (enumC15209z3 == EnumC15209z3.f57106w) {
                    AbstractC1035o0.m2889j0(this.f3939x, false);
                    AbstractC1035o0.m2872d1(this.f3940y, null);
                    this.f3938w.invoke(new AbstractC4837y.k(InterfaceC1038q.d.f4000a));
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15199y3 c15199y3, p715kotlin.jvm.functions.Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3935x = c15199y3;
            this.f3936y = function1;
            this.f3937z = interfaceC28601c1;
            this.f3933E = interfaceC28601c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final EnumC15209z3 m2931h(C15199y3 c15199y3) {
            return c15199y3.m43221b();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f3935x, this.f3936y, this.f3937z, this.f3933E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3934w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C1028l(this.f3935x, 1));
                a aVar = new a(this.f3936y, this.f3937z, this.f3933E);
                this.f3934w = 1;
                if (c13084s1M87240H.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: am2.o0$c */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.TrendsScreenKt$TrendsScreen$2$1$4$11$1$2$1$1$1", m100430f = "TrendsScreen.kt", m100431l = {497}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3941w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f3942x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C15199y3 c15199y3, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3942x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f3942x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3941w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f3942x;
                this.f3941w = 1;
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

    /* JADX INFO: renamed from: am2.o0$d */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.TrendsScreenKt$TrendsScreen$2$3$1$1", m100430f = "TrendsScreen.kt", m100431l = {634}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3943w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f3944x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C15199y3 c15199y3, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3944x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f3944x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3943w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f3944x;
                this.f3943w = 1;
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

    /* JADX INFO: renamed from: am2.o0$e */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.TrendsScreenKt$TrendsScreen$2$5$1", m100430f = "TrendsScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3945w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28601c1 f3946x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4813a0 f3947y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f3948z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC28601c1 interfaceC28601c1, AbstractC4813a0 abstractC4813a0, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3946x = interfaceC28601c1;
            this.f3947y = abstractC4813a0;
            this.f3948z = interfaceC28601c2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f3946x, this.f3947y, this.f3948z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x004a  */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC25312u interfaceC25312uM3069d;
            Object next;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f3945w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Integer numM2869c1 = AbstractC1035o0.m2869c1(this.f3946x);
            if (numM2869c1 != null) {
                AbstractC4813a0 abstractC4813a0 = this.f3947y;
                InterfaceC28601c1 interfaceC28601c1 = this.f3948z;
                int iIntValue = numM2869c1.intValue();
                List<C1048y> listM2941F = ((AbstractC4813a0.d) abstractC4813a0).getViewState().m2941F();
                if (listM2941F != null) {
                    Iterator<T> it = listM2941F.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((C1048y) next).getMenuIndex() != iIntValue);
                    C1048y c1048y = (C1048y) next;
                    if (c1048y != null) {
                        interfaceC25312uM3069d = c1048y.getMenuSheet();
                    } else {
                        interfaceC25312uM3069d = null;
                    }
                } else {
                    interfaceC25312uM3069d = null;
                }
                C17675e c17675e = interfaceC25312uM3069d instanceof C17675e ? (C17675e) interfaceC25312uM3069d : null;
                if (c17675e != null) {
                    AbstractC1035o0.m2866b1(interfaceC28601c1, c17675e);
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: am2.o0$f */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.TrendsScreenKt$TrendsScreen$2$7$1$1", m100430f = "TrendsScreen.kt", m100431l = {668}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3949w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f3950x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f3951y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3950x = c15199y3;
            this.f3951y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f3950x, this.f3951y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3949w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f3950x;
                this.f3949w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AbstractC1035o0.m2856X0(this.f3951y, false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: am2.o0$g */
    @InterfaceC32271e(m100429c = "com.whoop.trends.view.TrendsScreenKt$TrendsScreen$2$7$1$2", m100430f = "TrendsScreen.kt", m100431l = {675}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3952w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f3953x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C15199y3 c15199y3, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3953x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f3953x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3952w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f3953x;
                this.f3952w = 1;
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final Modifier m2810A0(C39282o it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-195708152);
        float f13 = 8;
        float f14 = 2 * f13;
        Modifier modifierM3397s = AbstractC1099a.m3397s(C2314t.f9131w, f14, ((float) 0.5d) * f13, f14, 1 * f13);
        c28655q.m87173q(false);
        return modifierM3397s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m2812B0(p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, C1037p0 c1037p0, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC39640g.a(C39645l.f170567a));
        function2.invoke(new AbstractC4837y.h(c1037p0.getMetaData().getGraphKey()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C0 */
    public static final C23454a0 m2814C0(C1037p0 c1037p0, p715kotlin.jvm.functions.Function1 function1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        C9598e c9598eM46800i = c1037p0.getUpsellCard().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
        if (c9598eM46800i != null) {
            function1.invoke(new AbstractC39640g.c(c9598eM46800i, null, 2, 0 == true ? 1 : 0));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m2816D0(p715kotlin.jvm.functions.Function1 function1, C1037p0 c1037p0, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it == EnumC3457l0.EDUCATION) {
            function1.invoke(c1037p0.getMetaData().getGraphKey().toTrendKey());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m2818E0(InterfaceC4351m interfaceC4351m, C1037p0 c1037p0, Object event) {
        AbstractC22676k.m65750j(event, "event");
        interfaceC4351m.invoke(event, c1037p0.getMetaData().getGraphKey().toTrendKey());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m2820F0(p715kotlin.jvm.functions.Function1 function1, C1037p0 c1037p0, boolean z4, Object scrubEvent) {
        AbstractC22676k.m65750j(scrubEvent, "scrubEvent");
        if (scrubEvent instanceof InterfaceC11732a.c) {
            function1.invoke(C1039q0.f4005a.m2986d(c1037p0, (InterfaceC11732a) scrubEvent, true, z4));
        } else if (scrubEvent instanceof InterfaceC11732a.a) {
            function1.invoke(C1039q0.f4005a.m2986d(c1037p0, (InterfaceC11732a) scrubEvent, false, z4));
        } else if (scrubEvent.equals(InterfaceC11732a.b.f37977a)) {
            function1.invoke(new AbstractC4837y.l(C25271y.f99162w, c1037p0.getMetaData().getGraphKey(), c1037p0.getMetaData().getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), c1037p0.getMetaData().getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), false));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C23454a0 m2822G0(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C23454a0 m2824H0(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final Modifier m2826I0(C4092p2 it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1080036459);
        float f13 = 8;
        float f14 = 2 * f13;
        Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, f14, 0.0f, f14, 1 * f13, 2);
        c28655q.m87173q(false);
        return modifierM3398t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C23454a0 m2828J0(p715kotlin.jvm.functions.Function1 function1, Object event) {
        String strM12480a;
        AbstractC22676k.m65750j(event, "event");
        if ((event instanceof C4071m2) && (strM12480a = ((C4071m2) event).getComponentId()) != null) {
            function1.invoke(new AbstractC4837y.e(strM12480a));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final C23454a0 m2830K0(InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        m2895l0(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C23454a0 m2832L0(InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        m2895l0(interfaceC28601c1, !m2892k0(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M0 */
    public static final C23454a0 m2834M0(p715kotlin.jvm.functions.Function1 function1, C9598e navAction) {
        AbstractC22676k.m65750j(navAction, "navAction");
        function1.invoke(new AbstractC39640g.c(navAction, null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C23454a0 m2836N0(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public static final C23454a0 m2838O0(C39282o c39282o, p715kotlin.jvm.functions.Function1 function1) {
        C9598e destination = c39282o.getDestination();
        if (destination != null) {
            function1.invoke(new AbstractC39640g.c(destination, null, 2, 0 == true ? 1 : 0));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final Modifier m2840P0(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1138137076);
        float f13 = 8;
        Modifier modifierM3395q = AbstractC1099a.m3395q(C2314t.f9131w, 2 * f13, 1 * f13);
        c28655q.m87173q(false);
        return modifierM3395q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final C23454a0 m2842Q0(p715kotlin.jvm.functions.Function1 function1, boolean z4, Object event) {
        AbstractC22676k.m65750j(event, "event");
        m2902n1(event, function1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final C23454a0 m2844R0(InterfaceC28601c1 interfaceC28601c1) {
        m2856X0(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C23454a0 m2846S0(InterfaceC2994c0 interfaceC2994c0, p715kotlin.jvm.functions.Function1 function1, AbstractC4813a0 abstractC4813a0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, C3439f0 result) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(c15199y3, null), 3);
        m2856X0(interfaceC28601c1, false);
        function1.invoke(new AbstractC4837y.a(result));
        AbstractC4813a0.d dVar = (AbstractC4813a0.d) abstractC4813a0;
        function1.invoke(new AbstractC4837y.n(dVar.getViewState().getMetaData().getGraphKey(), dVar.getViewState().getMetaData().getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), dVar.getViewState().getMetaData().getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), false, null, false, 56, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C23454a0 m2848T0() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C23454a0 m2850U0(p715kotlin.jvm.functions.Function1 function1, InterfaceC1038q it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC4837y.k(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C23454a0 m2852V0(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, p715kotlin.jvm.functions.Function1 function1, InterfaceC28601c1 interfaceC28601c1, C15199y3 c15199y4, InterfaceC28601c1 interfaceC28601c2) {
        if (m2883h0(interfaceC28601c1)) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new f(c15199y4, interfaceC28601c1, null), 3);
        }
        if (c15199y3.m43224e()) {
            m2889j0(interfaceC28601c2, false);
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new g(c15199y3, null), 3);
        }
        function1.invoke(new AbstractC39640g.d(AbstractC39640g.b.Fragment));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C23454a0 m2854W0(p715kotlin.jvm.functions.Function1 function1, AbstractC4813a0 abstractC4813a0) {
        AbstractC4813a0.b bVar = (AbstractC4813a0.b) abstractC4813a0;
        function1.invoke(new AbstractC4837y.n(bVar.getGraphKey(), bVar.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), bVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), false, null, false, 56, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X */
    private static final void m2855X(C1037p0 c1037p0, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-6941048);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c1037p0) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * 2.0f, AbstractC1099a.m3384f(AbstractC1102d.m3409f(1.0f, c2314t), false, 1.3333334f));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
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
            C38072d c38072d = C38072d.f163053a;
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getVarious().getMissingData(), c28655q, 6);
            int i15 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, null, c38072d.m121949b(c28655q, i15).getWhite30(), c28655q, 48, 4);
            TextResource textResourceM2805b = c1037p0.getEmptyState().getTitle();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM2805b, c28655q, i16);
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a c2886aM8436q = c38072d.m121952e(c28655q, i15).getH3();
            float f13 = 4;
            float f14 = f13 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8436q, null, c28655q, 48, i17, 196600);
            String strM21274h2 = AbstractC8693b.m21274h(c1037p0.getEmptyState().getBody(), c28655q, i16);
            long jM125382b1 = c38072d.m121949b(c28655q, i15).getWhite50();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i15).getB1();
            float f15 = 12 * f13;
            AbstractC30795n.m94707h(strM21274h2, AbstractC1099a.m3398t(c2314t, f15, f14, f15, 0.0f, 8), jM125382b1, 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 0, i17, 196088);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(c1037p0, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final void m2856X0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m2857Y(C1037p0 c1037p0, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m2855X(c1037p0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C23454a0 m2858Y0(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new AbstractC39640g.d(AbstractC39640g.b.Fragment));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Z */
    private static final void m2859Z(C22160d c22160d, p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1111610892);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c22160d) : c28655q.m87157i(c22160d) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            float f13 = 8;
            Modifier modifierM3395q = AbstractC1099a.m3395q(C2314t.f9131w, 2 * f13, 1 * f13);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC31926e.m99375j(null, null, c38072d.m121949b(c28655q, i15).getTransparent(), null, AbstractC17269i.m48880a((float) 1.5d, c38072d.m121949b(c28655q, i15).getWhite10()), null, 0.0f, AbstractC37817c.m121344e(1305364014, c28655q, new C1029l0(c22160d, function1, 0)), c28655q, 12582912, 107);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22079k(c22160d, function1, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C23454a0 m2860Z0(AbstractC4813a0 abstractC4813a0, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, p715kotlin.jvm.functions.Function1 function3, InterfaceC4351m interfaceC4351m, p715kotlin.jvm.functions.Function1 function4, DateTime dateTime, LocalDate localDate, boolean z4, boolean z13, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m2880g0(abstractC4813a0, function1, function2, function3, interfaceC4351m, function4, dateTime, localDate, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a0 */
    public static final C23454a0 m2862a0(C22160d c22160d, p715kotlin.jvm.functions.Function1 function1, Composer composer, int i13) {
        boolean z4;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            float f15 = 4;
            Modifier modifierM3395q = AbstractC1099a.m3395q(AbstractC1102d.m3409f(1.0f, c2314t), f14, f15 * f13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q, 54);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(c22160d.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3), null, AbstractC1102d.m3419p(25 * f15, c2314t), null, null, 0.0f, null, c28655q, 432, 120);
            String strM63438g = c22160d.getTitle();
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C2886a c2886aM8419Q = c38072d.m121952e(c28655q, i14).getT4();
            C36775k c36775k = new C36775k(3);
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM63438g, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8419Q, null, c28655q, 48, i15, 196088);
            float f16 = 1 * f13;
            AbstractC30795n.m94707h(c22160d.getSubtitle(), AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, f16, 5), c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 48, i15, 196088);
            C28655q c28655q2 = c28655q;
            C22157a c22157aM63435c = c22160d.getPrimaryButtonState();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (c22157aM63435c == null) {
                c28655q2.m87150e0(-1601248907);
                z4 = false;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1601248906);
                EnumC27284v enumC27284v = EnumC27284v.TextMedium;
                String strM21274h = AbstractC8693b.m21274h(c22157aM63435c.getTitle(), c28655q2, TextResource.$stable);
                long jMo134584toComposableColorWaAFU9c = c22157aM63435c.getColor().mo134584toComposableColorWaAFU9c(c28655q2, 0);
                Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC1102d.m3409f(1.0f, c2314t));
                boolean zM87153g = c28655q2.m87153g(function1) | c28655q2.m87157i(c22157aM63435c);
                Object objM87133R = c28655q2.m87133R();
                if (zM87153g || objM87133R == c28676v0) {
                    objM87133R = new C1031m0(function1, c22157aM63435c, 0);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC27282u.m82292h(modifierM3394p, enumC27284v, strM21274h, false, jMo134584toComposableColorWaAFU9c, null, false, (InterfaceC4339a) objM87133R, c28655q2, 54, 104);
                c28655q2 = c28655q2;
                z4 = false;
                c28655q2.m87173q(false);
            }
            C22157a c22157aM63436e = c22160d.getSecondaryButtonState();
            if (c22157aM63436e == null) {
                c28655q2.m87150e0(-1600676213);
                c28655q2.m87173q(z4);
            } else {
                c28655q2.m87150e0(-1600676212);
                EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
                TextResource textResourceM63415c = c22157aM63436e.getTitle();
                C39274g c39274g = new C39274g(AbstractC18489d0.m53359E(c38072d), null, 2, 0 == true ? 1 : 0);
                Object objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = a.f3932w;
                    c28655q2.m87172p0(objM87133R2);
                }
                InterfaceC39332e interfaceC39332eM125323a = p745y81.Function1.m125323a((p715kotlin.jvm.functions.Function1) objM87133R2);
                boolean zM87153g2 = c28655q2.m87153g(function1) | c28655q2.m87157i(c22157aM63436e);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C0167g(8, function1, c22157aM63436e);
                    c28655q2.m87172p0(objM87133R3);
                }
                C28655q c28655q3 = c28655q2;
                AbstractC27265l0.m82217i(c2314t, enumC27269n0, textResourceM63415c, null, c39274g, false, interfaceC39332eM125323a, null, false, false, null, null, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q3, (TextResource.$stable << 6) | 54 | (C39274g.f168929c << 12), 0, 4008);
                c28655q2 = c28655q3;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a1 */
    private static final C17675e m2863a1(InterfaceC28601c1 interfaceC28601c1) {
        return (C17675e) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m2865b0(p715kotlin.jvm.functions.Function1 function1, C22157a c22157a) {
        function1.invoke(new AbstractC39640g.c(c22157a.getDestination(), null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final void m2866b1(InterfaceC28601c1 interfaceC28601c1, C17675e c17675e) {
        interfaceC28601c1.setValue(c17675e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m2868c0(p715kotlin.jvm.functions.Function1 function1, C22157a c22157a, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC39640g.c(c22157a.getDestination(), null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final Integer m2869c1(InterfaceC28601c1 interfaceC28601c1) {
        return (Integer) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m2871d0(C22160d c22160d, p715kotlin.jvm.functions.Function1 function1, int i13, Composer composer, int i14) {
        m2859Z(c22160d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final void m2872d1(InterfaceC28601c1 interfaceC28601c1, Integer num) {
        interfaceC28601c1.setValue(num);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:44:0x0149  */
    /* JADX WARN: Code duplicated, block: B:45:0x014b  */
    /* JADX WARN: Code duplicated, block: B:47:0x014e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0162  */
    /* JADX WARN: Code duplicated, block: B:51:0x016c  */
    /* JADX WARN: Code duplicated, block: B:54:0x01be  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x0215  */
    /* JADX WARN: Code duplicated, block: B:61:0x021f  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e0 */
    public static final void m2874e0(C1034o viewState, float f13, Composer composer, int i13, int i14) {
        int i15;
        float f14;
        boolean z4;
        float f15;
        C28677v1 c28677v1M87180u;
        float f16;
        float f17;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        int i16;
        C38072d c38072d;
        int i17;
        int i18;
        boolean z13;
        String strM2807b;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1007200986);
        if ((i13 & 6) == 0) {
            i15 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i19 = i14 & 2;
        if (i19 == 0) {
            if ((i13 & 48) == 0) {
                f14 = f13;
                i15 |= c28655q.m87147d(f14) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                if (i19 != 0) {
                    f16 = 2 * 8;
                } else {
                    f16 = f14;
                }
                f17 = 4;
                c2314t = C2314t.f9131w;
                AbstractC11266d.m30469w(f17, f17, c2314t, c28655q);
                Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f16, 0.0f, 2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                TextResource textResourceM2806a = viewState.getLeadingText();
                i16 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(textResourceM2806a, c28655q, i16);
                c38072d = C38072d.f163053a;
                i17 = C38072d.f163054b;
                C2886a c2886aM8423d = c38072d.m121952e(c28655q, i17).getB4();
                long jM125382b1 = c38072d.m121949b(c28655q, i17).getWhite50();
                i18 = C2886a.f11498d << 18;
                float f18 = f16;
                AbstractC30795n.m94707h(strM21274h, null, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8423d, null, c28655q, 0, i18, 196602);
                c28655q = c28655q;
                if (1.0f > 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
                if (viewState.getTrailingText() == null) {
                    c28655q.m87150e0(314923150);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(314923151);
                    AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTrailingText(), c28655q, i16), null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB4(), null, c28655q, 0, i18, 196602);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                }
                strM2807b = viewState.getTrailingImage();
                if (strM2807b == null) {
                    c28655q.m87150e0(315171584);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(315171585);
                    C28655q c28655q2 = c28655q;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.c(strM2807b, 0, 0, 0, 14, null), null, null, c28655q, AbstractC22403o.c.f87642f, 3), "", AbstractC1102d.m3424u(20 * f17, AbstractC1102d.m3411h(((float) 2.5d) * f17, c2314t)), null, C39102j.f168199a, 0.0f, null, c28655q2, 25008, 104);
                    c28655q = c28655q2;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                f15 = f18;
            } else {
                c28655q.m87138X();
                f15 = f14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C1027k0(viewState, f15, i13, i14, 0);
            }
        }
        i15 |= 48;
        f14 = f13;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            if (i19 != 0) {
                f16 = 2 * 8;
            } else {
                f16 = f14;
            }
            f17 = 4;
            c2314t = C2314t.f9131w;
            AbstractC11266d.m30469w(f17, f17, c2314t, c28655q);
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f16, 0.0f, 2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9107J, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            TextResource textResourceM2806a2 = viewState.getLeadingText();
            i16 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(textResourceM2806a2, c28655q, i16);
            c38072d = C38072d.f163053a;
            i17 = C38072d.f163054b;
            C2886a c2886aM8423d2 = c38072d.m121952e(c28655q, i17).getB4();
            long jM125382b2 = c38072d.m121949b(c28655q, i17).getWhite50();
            i18 = C2886a.f11498d << 18;
            float f19 = f16;
            AbstractC30795n.m94707h(strM21274h2, null, jM125382b2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8423d2, null, c28655q, 0, i18, 196602);
            c28655q = c28655q;
            if (1.0f > 0.0d) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
            if (viewState.getTrailingText() == null) {
                c28655q.m87150e0(314923150);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(314923151);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getTrailingText(), c28655q, i16), null, c38072d.m121949b(c28655q, i17).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB4(), null, c28655q, 0, i18, 196602);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            strM2807b = viewState.getTrailingImage();
            if (strM2807b == null) {
                c28655q.m87150e0(315171584);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(315171585);
                C28655q c28655q3 = c28655q;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(new AbstractC22403o.c(strM2807b, 0, 0, 0, 14, null), null, null, c28655q, AbstractC22403o.c.f87642f, 3), "", AbstractC1102d.m3424u(20 * f17, AbstractC1102d.m3411h(((float) 2.5d) * f17, c2314t)), null, C39102j.f168199a, 0.0f, null, c28655q3, 25008, 104);
                c28655q = c28655q3;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            f15 = f19;
        } else {
            c28655q.m87138X();
            f15 = f14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1027k0(viewState, f15, i13, i14, 0);
        }
    }

    /* JADX INFO: renamed from: e1 */
    public static final void m2875e1(C3448i0 viewState, p715kotlin.jvm.functions.Function1 onAnalyticsEvent, p715kotlin.jvm.functions.Function1 onEvent, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1061562503);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(viewState) : c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onAnalyticsEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onEvent) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            onAnalyticsEvent.invoke(AbstractC4835w.d.f19918a);
            TextResource textResourceM10088c = viewState.getTitle();
            TextResource textResourceM10086a = viewState.getButtonTitle();
            C23254g c23254gM9922p = AbstractC3435e.m9922p(viewState.getDescription(), c28655q2, 0);
            int i15 = i14 & 896;
            boolean z4 = i15 == 256;
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C1043t(onEvent, 3);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            boolean z13 = i15 == 256;
            Object objM87133R2 = c28655q2.m87133R();
            if (z13 || objM87133R2 == c28676v0) {
                objM87133R2 = new C1043t(onEvent, 4);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R2;
            int i16 = TextResource.$stable;
            c28655q = c28655q2;
            AbstractC21211n.m59497o(null, textResourceM10088c, null, textResourceM10086a, false, null, null, null, null, null, null, false, false, null, null, false, 0, null, c23254gM9922p, null, false, null, interfaceC4339a, null, interfaceC4339a2, null, null, null, c28655q, (i16 << 3) | (i16 << 9), 384, 0, 247197685);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C21061j(viewState, onAnalyticsEvent, onEvent, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C23454a0 m2877f0(C1034o c1034o, float f13, int i13, int i14, Composer composer, int i15) {
        m2874e0(c1034o, f13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final C23454a0 m2878f1(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new Object());
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:157:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:159:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:162:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:163:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:167:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:170:0x0424  */
    /* JADX WARN: Code duplicated, block: B:173:0x0473  */
    /* JADX WARN: Code duplicated, block: B:174:0x0477  */
    /* JADX WARN: Code duplicated, block: B:179:0x0492  */
    /* JADX WARN: Code duplicated, block: B:182:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:183:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:185:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:186:0x0500  */
    /* JADX WARN: Code duplicated, block: B:191:0x051b  */
    /* JADX WARN: Code duplicated, block: B:194:0x0558  */
    /* JADX WARN: Code duplicated, block: B:195:0x055c  */
    /* JADX WARN: Code duplicated, block: B:200:0x0585  */
    /* JADX WARN: Code duplicated, block: B:203:0x0599  */
    /* JADX WARN: Code duplicated, block: B:205:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:207:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:208:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:213:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:217:0x060b  */
    /* JADX WARN: Code duplicated, block: B:219:0x061c  */
    /* JADX WARN: Code duplicated, block: B:222:0x0637  */
    /* JADX WARN: Code duplicated, block: B:224:0x0663  */
    /* JADX WARN: Code duplicated, block: B:225:0x0667  */
    /* JADX WARN: Code duplicated, block: B:230:0x0682  */
    /* JADX WARN: Code duplicated, block: B:233:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:235:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:239:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:242:0x070b  */
    /* JADX WARN: Code duplicated, block: B:243:0x070f  */
    /* JADX WARN: Code duplicated, block: B:248:0x072a  */
    /* JADX WARN: Code duplicated, block: B:251:0x0766  */
    /* JADX WARN: Code duplicated, block: B:252:0x076a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0793  */
    /* JADX WARN: Code duplicated, block: B:261:0x07bc A[LOOP:5: B:259:0x07b6->B:261:0x07bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:264:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:265:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:271:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:274:0x084c  */
    /* JADX WARN: Code duplicated, block: B:275:0x0850  */
    /* JADX WARN: Code duplicated, block: B:280:0x0879  */
    /* JADX WARN: Code duplicated, block: B:283:0x0894  */
    /* JADX WARN: Code duplicated, block: B:284:0x0896  */
    /* JADX WARN: Code duplicated, block: B:288:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:291:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:292:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:295:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:297:0x0914  */
    /* JADX WARN: Code duplicated, block: B:298:0x0916  */
    /* JADX WARN: Code duplicated, block: B:302:0x091f  */
    /* JADX WARN: Code duplicated, block: B:304:0x093f  */
    /* JADX WARN: Code duplicated, block: B:306:0x0947  */
    /* JADX WARN: Code duplicated, block: B:307:0x09a1  */
    /* JADX WARN: Code duplicated, block: B:310:0x09b5  */
    /* JADX WARN: Code duplicated, block: B:311:0x09c1  */
    /* JADX WARN: Code duplicated, block: B:313:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:316:0x09e9 A[LOOP:7: B:314:0x09e3->B:316:0x09e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:318:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:322:0x0a12  */
    /* JADX WARN: Code duplicated, block: B:324:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:325:0x0a50  */
    /* JADX WARN: Code duplicated, block: B:329:0x0a65  */
    /* JADX WARN: Code duplicated, block: B:331:0x0a93  */
    /* JADX WARN: Code duplicated, block: B:350:0x0b0c  */
    /* JADX WARN: Code duplicated, block: B:353:0x0b1b  */
    /* JADX WARN: Code duplicated, block: B:354:0x0b28  */
    /* JADX WARN: Code duplicated, block: B:356:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:357:0x0b4b  */
    /* JADX WARN: Code duplicated, block: B:360:0x0b5e  */
    /* JADX WARN: Code duplicated, block: B:362:0x0b6a  */
    /* JADX WARN: Code duplicated, block: B:363:0x0b76  */
    /* JADX WARN: Code duplicated, block: B:365:0x0b82  */
    /* JADX WARN: Code duplicated, block: B:368:0x0ba3  */
    /* JADX WARN: Code duplicated, block: B:372:0x0bb7  */
    /* JADX WARN: Code duplicated, block: B:373:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:376:0x0bd7  */
    /* JADX WARN: Code duplicated, block: B:378:0x0be5  */
    /* JADX WARN: Code duplicated, block: B:379:0x0be7  */
    /* JADX WARN: Code duplicated, block: B:383:0x0bf0  */
    /* JADX WARN: Code duplicated, block: B:385:0x0c04  */
    /* JADX WARN: Code duplicated, block: B:387:0x0c0a  */
    /* JADX WARN: Code duplicated, block: B:388:0x0c1d  */
    /* JADX WARN: Code duplicated, block: B:391:0x0c2c  */
    /* JADX WARN: Code duplicated, block: B:392:0x0c38  */
    /* JADX WARN: Code duplicated, block: B:394:0x0c5c  */
    /* JADX WARN: Code duplicated, block: B:400:0x0c99  */
    /* JADX WARN: Code duplicated, block: B:402:0x0cce  */
    /* JADX WARN: Code duplicated, block: B:403:0x0cd0  */
    /* JADX WARN: Code duplicated, block: B:407:0x0cda  */
    /* JADX WARN: Code duplicated, block: B:412:0x0d18  */
    /* JADX WARN: Code duplicated, block: B:414:0x0d2d  */
    /* JADX WARN: Code duplicated, block: B:415:0x0d2f  */
    /* JADX WARN: Code duplicated, block: B:418:0x0d38  */
    /* JADX WARN: Code duplicated, block: B:419:0x0d3a  */
    /* JADX WARN: Code duplicated, block: B:425:0x0d48  */
    /* JADX WARN: Code duplicated, block: B:429:0x0d75  */
    /* JADX WARN: Code duplicated, block: B:430:0x0d96  */
    /* JADX WARN: Code duplicated, block: B:433:0x0dae  */
    /* JADX WARN: Code duplicated, block: B:435:0x0dd8  */
    /* JADX WARN: Code duplicated, block: B:436:0x0dda  */
    /* JADX WARN: Code duplicated, block: B:439:0x0de0  */
    /* JADX WARN: Code duplicated, block: B:440:0x0de2  */
    /* JADX WARN: Code duplicated, block: B:444:0x0dec  */
    /* JADX WARN: Code duplicated, block: B:449:0x0e4d  */
    /* JADX WARN: Code duplicated, block: B:450:0x0e57  */
    /* JADX WARN: Code duplicated, block: B:455:0x0eeb  */
    /* JADX WARN: Code duplicated, block: B:457:0x0f02  */
    /* JADX WARN: Code duplicated, block: B:458:0x0f0e  */
    /* JADX WARN: Code duplicated, block: B:461:0x0f29  */
    /* JADX WARN: Code duplicated, block: B:462:0x0f33  */
    /* JADX WARN: Code duplicated, block: B:464:0x0f8e  */
    /* JADX WARN: Code duplicated, block: B:467:0x0f9d  */
    /* JADX WARN: Code duplicated, block: B:469:0x0fb2  */
    /* JADX WARN: Code duplicated, block: B:471:0x0fb6  */
    /* JADX WARN: Code duplicated, block: B:473:0x0fba  */
    /* JADX WARN: Code duplicated, block: B:474:0x0fbc  */
    /* JADX WARN: Code duplicated, block: B:478:0x0fcd  */
    /* JADX WARN: Code duplicated, block: B:480:0x0feb  */
    /* JADX WARN: Code duplicated, block: B:483:0x0ffa  */
    /* JADX WARN: Code duplicated, block: B:485:0x1032  */
    /* JADX WARN: Code duplicated, block: B:486:0x1036  */
    /* JADX WARN: Code duplicated, block: B:491:0x105f  */
    /* JADX WARN: Code duplicated, block: B:494:0x1077  */
    /* JADX WARN: Code duplicated, block: B:495:0x1079  */
    /* JADX WARN: Code duplicated, block: B:499:0x1083  */
    /* JADX WARN: Code duplicated, block: B:501:0x10b1  */
    /* JADX WARN: Code duplicated, block: B:504:0x10c6  */
    /* JADX WARN: Code duplicated, block: B:506:0x10d6  */
    /* JADX WARN: Code duplicated, block: B:508:0x10da  */
    /* JADX WARN: Code duplicated, block: B:514:0x10ed  */
    /* JADX WARN: Code duplicated, block: B:516:0x1102  */
    /* JADX WARN: Code duplicated, block: B:519:0x1118  */
    /* JADX WARN: Code duplicated, block: B:520:0x1127  */
    /* JADX WARN: Code duplicated, block: B:522:0x1135  */
    /* JADX WARN: Code duplicated, block: B:523:0x1137  */
    /* JADX WARN: Code duplicated, block: B:529:0x1149  */
    /* JADX WARN: Code duplicated, block: B:532:0x1179  */
    /* JADX WARN: Code duplicated, block: B:533:0x118c  */
    /* JADX WARN: Code duplicated, block: B:536:0x119d  */
    /* JADX WARN: Code duplicated, block: B:538:0x11a7  */
    /* JADX WARN: Code duplicated, block: B:541:0x11bd  */
    /* JADX WARN: Code duplicated, block: B:543:0x11e1  */
    /* JADX WARN: Code duplicated, block: B:546:0x1225  */
    /* JADX WARN: Code duplicated, block: B:548:0x122c  */
    /* JADX WARN: Code duplicated, block: B:551:0x123b  */
    /* JADX WARN: Code duplicated, block: B:552:0x1247  */
    /* JADX WARN: Code duplicated, block: B:554:0x1262  */
    /* JADX WARN: Code duplicated, block: B:559:0x12a3  */
    /* JADX WARN: Code duplicated, block: B:583:0x138d  */
    /* JADX WARN: Code duplicated, block: B:586:0x13b2  */
    /* JADX WARN: Code duplicated, block: B:587:0x13b4  */
    /* JADX WARN: Code duplicated, block: B:590:0x13bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:593:0x13c5  */
    /* JADX WARN: Code duplicated, block: B:596:0x13df  */
    /* JADX WARN: Code duplicated, block: B:609:0x1433  */
    /* JADX WARN: Code duplicated, block: B:612:0x1454  */
    /* JADX WARN: Code duplicated, block: B:613:0x1456  */
    /* JADX WARN: Code duplicated, block: B:616:0x145e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:619:0x1464  */
    /* JADX WARN: Code duplicated, block: B:671:0x11eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:0x0626 A[SYNTHETIC] */
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
    /* JADX INFO: renamed from: g0 */
    public static final void m2880g0(AbstractC4813a0 viewState, p715kotlin.jvm.functions.Function1 onViewEvent, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 onAnalyticsEvent, InterfaceC4351m onCarouselItemClicked, p715kotlin.jvm.functions.Function1 onBodyCompInfoClicked, DateTime dateTimeNow, LocalDate localDateNow, boolean z4, boolean z13, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        AbstractC4813a0 abstractC4813a0;
        p715kotlin.jvm.functions.Function1 function2;
        p715kotlin.jvm.functions.Function1 function3;
        boolean z14;
        C28655q c28655q;
        C15199y3 c15199y3;
        C28655q c28655q2;
        InterfaceC28601c1 interfaceC28601c1;
        C28676v0 c28676v0;
        p715kotlin.jvm.functions.Function1 function4;
        InterfaceC28601c1 interfaceC28601c2;
        InterfaceC28601c1 interfaceC28601c3;
        C28655q c28655q3;
        C28676v0 c28676v1;
        float f13;
        float f14;
        float f15;
        float f16;
        int iHashCode;
        C0213j c0213jM545a;
        C0209i c0209iM8291d;
        Modifier modifierM2724a;
        int iHashCode2;
        C0213j c0213jM545a2;
        C0209i c0209iM8291d2;
        float f17;
        float f18;
        int iHashCode3;
        C0213j c0213jM545a3;
        C0209i c0209iM546b;
        int size;
        int iHashCode4;
        C0213j c0213jM545a4;
        C0209i c0209iM8291d3;
        int iHashCode5;
        C0213j c0213jM545a5;
        C0209i c0209iM546b2;
        ArrayList arrayList;
        Iterator<T> it;
        boolean z15;
        boolean z16;
        Object objM87133R;
        p715kotlin.jvm.functions.Function1 function5;
        float f19;
        int iHashCode6;
        C0213j c0213jM545a6;
        C0209i c0209iM546b3;
        boolean z17;
        boolean z18;
        Object objM87133R2;
        C2314t c2314t;
        boolean z19;
        float f24;
        boolean z24;
        List<C1036p> listM2959o;
        float f25;
        ArrayList arrayList2;
        Iterator<T> it3;
        List<C4092p2> listM2954j;
        C3438f c3438fM2947c;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c4;
        C3448i0 c3448i0M10037e;
        Object objM87133R4;
        C1034o c1034oM2958n;
        C3808h c3808hM2946b;
        Object objM87133R5;
        boolean z25;
        Object objM87133R6;
        boolean z26;
        boolean zM87157i;
        Object objM87133R7;
        boolean z27;
        boolean z28;
        Object objM87133R8;
        int iHashCode7;
        C0213j c0213jM545a7;
        C0209i c0209iM8291d4;
        Object objM87133R9;
        int iHashCode8;
        C0213j c0213jM545a8;
        C0209i c0209iM8291d5;
        Object objM87133R10;
        boolean z29;
        Iterator it4;
        float f26;
        C28655q c28655q4;
        boolean z34;
        List<C1048y> listM2941F;
        Iterator it5;
        C28655q c28655q5;
        float f27;
        p715kotlin.jvm.functions.Function1 function6;
        float f28;
        InterfaceC28601c1 interfaceC28601c5;
        InterfaceC2994c0 interfaceC2994c0;
        InterfaceC28601c1 interfaceC28601c6;
        C1037p0 c1037p0;
        p715kotlin.jvm.functions.Function1 function7;
        C2307m c2307m;
        int i15;
        int i16;
        C1048y c1048y;
        boolean z35;
        boolean z36;
        boolean z37;
        Object c1019g0;
        InterfaceC28601c1 interfaceC28601c7;
        InterfaceC2994c0 interfaceC2994c1;
        InterfaceC28601c1 interfaceC28601c8;
        int i17;
        C28655q c28655q6;
        C28655q c28655q7;
        TextResource textResourceM3068c;
        C28655q c28655q8;
        C28655q c28655q9;
        C28655q c28655q10;
        C1037p0 c1037p1;
        C28655q c28655q11;
        C1037p0 c1037p2;
        C16934f c16934fM2950f;
        boolean z38;
        boolean zM87157i2;
        Object objM87133R11;
        float f29;
        C23454a0 c23454a0;
        C28655q c28655q12;
        List<C30885c> listM2965u;
        boolean z39;
        InterfaceC28601c1 interfaceC28601c9;
        C30885c c30885cM2966v;
        Object objM87133R12;
        C28655q c28655q13;
        C28655q c28655q14;
        InterfaceC2994c0 interfaceC2994c2;
        C28676v0 c28676v2;
        int i18;
        C15199y3 c15199y4;
        C28655q c28655q15;
        boolean z44;
        Object objM87133R13;
        InterfaceC28601c1 interfaceC28601c10;
        C15199y3 c15199y5;
        C28655q c28655q16;
        boolean z45;
        boolean z46;
        Object objM87133R14;
        int i19;
        boolean z47;
        InterfaceC28601c1 interfaceC28601c11;
        Object c1040r;
        InterfaceC2994c0 interfaceC2994c3;
        boolean z48;
        C28655q c28655q17;
        Object objM87133R15;
        boolean z49;
        boolean zM87157i3;
        Object objM87133R16;
        int iHashCode9;
        C0213j c0213jM545a9;
        C0209i c0209iM546b4;
        C1037p0 c1037p3;
        boolean z52;
        boolean z54;
        Object objM87133R17;
        boolean z55;
        boolean z56;
        C1037p0 c1037p4;
        boolean zM87157i4;
        Object objM87133R18;
        Object objM87133R19;
        InterfaceC28601c1 interfaceC28601c12;
        C28655q c28655q18;
        TextResource textResourceM2962r;
        boolean z57;
        boolean z58;
        boolean z59;
        Object objM87133R20;
        boolean z60;
        C39282o c39282o;
        boolean z64;
        boolean z65;
        Object objM87133R21;
        Object objM87133R22;
        boolean z66;
        boolean zM87157i5;
        Object objM87133R23;
        boolean z67;
        boolean z68;
        p715kotlin.jvm.functions.Function1 onNavigationEvent = function1;
        C2306l c2306l = C2299e.f9107J;
        C2307m c2307m2 = C2299e.f9114w;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(onCarouselItemClicked, "onCarouselItemClicked");
        AbstractC22676k.m65750j(onBodyCompInfoClicked, "onBodyCompInfoClicked");
        AbstractC22676k.m65750j(dateTimeNow, "dateTimeNow");
        AbstractC22676k.m65750j(localDateNow, "localDateNow");
        C28655q c28655q19 = (C28655q) composer;
        c28655q19.m87154g0(830681985);
        int i24 = (i13 & 6) == 0 ? (c28655q19.m87153g(viewState) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i24 |= c28655q19.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i24 |= c28655q19.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i24 |= c28655q19.m87157i(onAnalyticsEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i24 |= c28655q19.m87157i(onCarouselItemClicked) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i24 |= c28655q19.m87157i(onBodyCompInfoClicked) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i24 |= c28655q19.m87157i(dateTimeNow) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i24 |= c28655q19.m87157i(localDateNow) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i24 |= c28655q19.m87155h(z4) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        int i25 = i14 & 512;
        if (i25 != 0) {
            i24 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            i24 |= c28655q19.m87155h(z13) ? 536870912 : 268435456;
        }
        if (c28655q19.m87135U(i24 & 1, (i24 & 306783379) != 306783378)) {
            boolean z69 = i25 != 0 ? false : z13;
            int i26 = i24 & 14;
            AbstractC14874j.m42904c(viewState, viewState.getScreenTag(), c28655q19, i26);
            Object objM87133R24 = c28655q19.m87133R();
            C28676v0 c28676v3 = C28635l.f115821a;
            if (objM87133R24 == c28676v3) {
                objM87133R24 = AbstractC28683x.m87262p(c28655q19);
                c28655q19.m87172p0(objM87133R24);
            }
            InterfaceC2994c0 interfaceC2994c4 = (InterfaceC2994c0) objM87133R24;
            C2307m c2307m3 = c2307m2;
            Object objM87133R25 = c28655q19.m87133R();
            if (objM87133R25 == c28676v3) {
                objM87133R25 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q19.m87172p0(objM87133R25);
            }
            InterfaceC28601c1 interfaceC28601c13 = (InterfaceC28601c1) objM87133R25;
            int i27 = i24;
            Object objM87133R26 = c28655q19.m87133R();
            if (objM87133R26 == c28676v3) {
                objM87133R26 = AbstractC28683x.m87272z(null);
                c28655q19.m87172p0(objM87133R26);
            }
            InterfaceC28601c1 interfaceC28601c14 = (InterfaceC28601c1) objM87133R26;
            Object objM87133R27 = c28655q19.m87133R();
            if (objM87133R27 == c28676v3) {
                objM87133R27 = AbstractC28683x.m87272z(null);
                c28655q19.m87172p0(objM87133R27);
            }
            InterfaceC28601c1 interfaceC28601c15 = (InterfaceC28601c1) objM87133R27;
            Object objM87133R28 = c28655q19.m87133R();
            if (objM87133R28 == c28676v3) {
                objM87133R28 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q19.m87172p0(objM87133R28);
            }
            InterfaceC28601c1 interfaceC28601c16 = (InterfaceC28601c1) objM87133R28;
            Object objM87133R29 = c28655q19.m87133R();
            if (objM87133R29 == c28676v3) {
                objM87133R29 = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q19.m87172p0(objM87133R29);
            }
            InterfaceC28601c1 interfaceC28601c17 = (InterfaceC28601c1) objM87133R29;
            boolean zIsFeatureEnabled = ((FeatureFlagChecker) c28655q19.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("hours-vs-needed-percentage-trend");
            EnumC15209z3 enumC15209z3 = EnumC15209z3.f57106w;
            C11347e2 c11347e2M30574v = AbstractC11348f.m30574v(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 0, null, 6);
            Object objM87133R30 = c28655q19.m87133R();
            if (objM87133R30 == c28676v3) {
                objM87133R30 = new C1010c(5, interfaceC28601c13);
                c28655q19.m87172p0(objM87133R30);
            }
            C15199y3 c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, c11347e2M30574v, (p715kotlin.jvm.functions.Function1) objM87133R30, true, c28655q19, 3510, 0);
            C15199y3 c15199y3M3460c2 = AbstractC1118c.m3460c(enumC15209z3, AbstractC11348f.m30574v(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 0, null, 6), null, true, c28655q19, 3126, 4);
            int i28 = i27 & 112;
            boolean zM87157i6 = c28655q19.m87157i(c15199y3M3460c2) | (i28 == 32);
            Object objM87133R31 = c28655q19.m87133R();
            if (zM87157i6 || objM87133R31 == c28676v3) {
                c15199y3 = c15199y3M3460c2;
                c28655q2 = c28655q19;
                interfaceC28601c1 = interfaceC28601c13;
                c28676v0 = c28676v3;
                function4 = onViewEvent;
                b bVar = new b(c15199y3, function4, interfaceC28601c16, interfaceC28601c15, null);
                interfaceC28601c2 = interfaceC28601c16;
                interfaceC28601c3 = interfaceC28601c15;
                c28655q2.m87172p0(bVar);
                objM87133R31 = bVar;
            } else {
                interfaceC28601c1 = interfaceC28601c13;
                c15199y3 = c15199y3M3460c2;
                c28655q2 = c28655q19;
                c28676v0 = c28676v3;
                interfaceC28601c2 = interfaceC28601c16;
                interfaceC28601c3 = interfaceC28601c15;
                function4 = onViewEvent;
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R31, c15199y3);
            boolean z74 = viewState instanceof AbstractC4813a0.d;
            C2314t c2314t2 = C2314t.f9131w;
            if (z74) {
                c28655q2.m87150e0(-751480685);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m3, false);
                int iHashCode10 = Long.hashCode(AbstractC28683x.m87267u(c28655q2));
                InterfaceC28601c1 interfaceC28601c18 = interfaceC28601c3;
                InterfaceC28653p1 interfaceC28653p1M87116A = c28655q2.m87116A();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
                InterfaceC0221l.f734a.getClass();
                InterfaceC28601c1 interfaceC28601c19 = interfaceC28601c2;
                C0213j c0213jM545a10 = C0217k.m545a();
                c28655q2.m87158i0();
                if (c28655q2.m87120E()) {
                    c28655q2.m87163l(c0213jM545a10);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.m547c(), interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.m549e(), interfaceC28653p1M87116A);
                C0209i c0209iM546b5 = C0217k.m546b();
                if (c28655q2.m87120E() || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode10))) {
                    AbstractC11266d.m30471y(iHashCode10, c28655q2, iHashCode10, c0209iM546b5);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.m548d(), modifierM118962N);
                Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t2)));
                AbstractC4813a0.d dVar = (AbstractC4813a0.d) viewState;
                C13404j c13404jM2968x = dVar.getViewState().getScreenContextMetadata();
                boolean z75 = m2886i0(interfaceC28601c19) || m2883h0(interfaceC28601c1);
                int i29 = C13404j.f46947x << 3;
                C28655q c28655q20 = c28655q2;
                Modifier modifierM34129b = AbstractC12250f.m34129b(modifierM66724m, c13404jM2968x, z75, c28655q20, i29, 0);
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q20, 0);
                int iHashCode11 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                C15199y3 c15199y6 = c15199y3;
                InterfaceC28653p1 interfaceC28653p1M87116A2 = c28655q20.m87116A();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q20, modifierM34129b);
                C0213j c0213jM545a11 = C0217k.m545a();
                c28655q20.m87158i0();
                if (c28655q20.m87120E()) {
                    c28655q20.m87163l(c0213jM545a11);
                } else {
                    c28655q20.m87178s0();
                }
                C0209i c0209iM8291d6 = AbstractC2875y.m8291d(c28655q20, c23010xM66775a, c28655q20, interfaceC28653p1M87116A2);
                if (c28655q20.m87120E() || !AbstractC22676k.m65745e(c28655q20.m87133R(), Integer.valueOf(iHashCode11))) {
                    AbstractC11266d.m30471y(iHashCode11, c28655q20, iHashCode11, c0209iM8291d6);
                }
                AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N2);
                C1037p0 c1037p0M15198c = dVar.getViewState();
                AbstractC6721d abstractC6721dM2939D = c1037p0M15198c.getToolbarState();
                int i34 = i27 & 896;
                boolean z76 = i34 == 256;
                Object objM87133R32 = c28655q20.m87133R();
                if (z76) {
                    c28676v1 = c28676v0;
                } else {
                    c28676v1 = c28676v0;
                    if (objM87133R32 == c28676v1) {
                    }
                    AbstractC6719b.m20143d(null, abstractC6721dM2939D, null, (InterfaceC4339a) objM87133R32, null, null, c28655q20, AbstractC6721d.f25640b << 3, 53);
                    f13 = 2;
                    f14 = 4;
                    f15 = f13 * f14;
                    AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(f15, c2314t2));
                    if (c1037p0M15198c.getInterTrendNavigationState().m10206b().isEmpty()) {
                        f16 = f14;
                        c28655q20.m87150e0(-1838360467);
                        c28655q20.m87179t();
                    } else {
                        c28655q20.m87150e0(-1839312818);
                        f16 = f14;
                        Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t2, f13 * 8, 0.0f, 2);
                        C3470r c3470rM2956l = c1037p0M15198c.getInterTrendNavigationState();
                        EnumC28166h0 enumC28166h0M2722c = c1037p0M15198c.getMetaData().getGraphKey();
                        objM87133R22 = c28655q20.m87133R();
                        if (objM87133R22 == c28676v1) {
                            objM87133R22 = new C28503p(20);
                            c28655q20.m87172p0(objM87133R22);
                        }
                        p715kotlin.jvm.functions.Function1 function8 = (p715kotlin.jvm.functions.Function1) objM87133R22;
                        if (i28 == 32) {
                            z66 = true;
                        } else {
                            z66 = false;
                        }
                        zM87157i5 = z66 | c28655q20.m87157i(c1037p0M15198c);
                        objM87133R23 = c28655q20.m87133R();
                        if (zM87157i5 || objM87133R23 == c28676v1) {
                            objM87133R23 = new C1021h0(function4, c1037p0M15198c, 2);
                            c28655q20.m87172p0(objM87133R23);
                        }
                        AbstractC3468q.m10173h(modifierM3396r, c3470rM2956l, null, enumC28166h0M2722c, function8, (p715kotlin.jvm.functions.Function1) objM87133R23, c28655q20, 24582, 4);
                        AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(6 * f16, c2314t2));
                        c28655q20.m87179t();
                    }
                    Modifier modifierM34108a = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(c2314t2, AbstractC30060g.m92099U(0, c28655q20, 1), 14), c1037p0M15198c.getScreenContextMetadata(), 0.0f, false, c28655q20, i29, 6);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q20, 0);
                    iHashCode = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                    InterfaceC28653p1 interfaceC28653p1M87116A3 = c28655q20.m87116A();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q20, modifierM34108a);
                    c0213jM545a = C0217k.m545a();
                    c28655q20.m87158i0();
                    if (c28655q20.m87120E()) {
                        c28655q20.m87163l(c0213jM545a);
                    } else {
                        c28655q20.m87178s0();
                    }
                    c0209iM8291d = AbstractC2875y.m8291d(c28655q20, c23010xM66775a2, c28655q20, interfaceC28653p1M87116A3);
                    if (c28655q20.m87120E() || !AbstractC22676k.m65745e(c28655q20.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q20, iHashCode, c0209iM8291d);
                    }
                    AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N3);
                    modifierM2724a = C1015e0.f3803a.m2724a(c2314t2, c1037p0M15198c.getMetaData().getGraphKey());
                    if (c1037p0M15198c.getIntegrationsUpsellState() != null) {
                        c28655q20.m87150e0(1840171131);
                        m2859Z(c1037p0M15198c.getIntegrationsUpsellState(), onNavigationEvent, c28655q20, C22160d.f85916g | ((i27 >> 3) & 112));
                        c28655q20.m87179t();
                        function5 = onViewEvent;
                        c2314t = c2314t2;
                        f25 = f16;
                        z29 = i34 == true ? 1 : 0;
                    } else {
                        c28655q20.m87150e0(1840660745);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q20, 0);
                        iHashCode2 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                        InterfaceC28653p1 interfaceC28653p1M87116A4 = c28655q20.m87116A();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q20, modifierM2724a);
                        c0213jM545a2 = C0217k.m545a();
                        c28655q20.m87158i0();
                        if (c28655q20.m87120E()) {
                            c28655q20.m87163l(c0213jM545a2);
                        } else {
                            c28655q20.m87178s0();
                        }
                        c0209iM8291d2 = AbstractC2875y.m8291d(c28655q20, c23010xM66775a3, c28655q20, interfaceC28653p1M87116A4);
                        if (c28655q20.m87120E() || !AbstractC22676k.m65745e(c28655q20.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q20, iHashCode2, c0209iM8291d2);
                        }
                        AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N4);
                        f17 = 8;
                        f18 = f13 * f17;
                        Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2);
                        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q20, 0);
                        iHashCode3 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                        InterfaceC28653p1 interfaceC28653p1M87116A5 = c28655q20.m87116A();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q20, modifierM3396r2);
                        c0213jM545a3 = C0217k.m545a();
                        c28655q20.m87158i0();
                        if (c28655q20.m87120E()) {
                            c28655q20.m87163l(c0213jM545a3);
                        } else {
                            c28655q20.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q20, C0217k.m547c(), c22994r1M66759a);
                        AbstractC28683x.m87239G(c28655q20, C0217k.m549e(), interfaceC28653p1M87116A5);
                        c0209iM546b = C0217k.m546b();
                        if (c28655q20.m87120E() || !AbstractC22676k.m65745e(c28655q20.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q20, iHashCode3, c0209iM546b);
                        }
                        AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N5);
                        size = c1037p0M15198c.m2957m().size();
                        if (size != 0) {
                            c28655q20.m87150e0(439580279);
                            c28655q20.m87179t();
                        } else if (size != 1) {
                            c28655q20.m87150e0(439987805);
                            Modifier modifierM3409f = AbstractC1102d.m3409f(0.5f, c2314t2);
                            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q20, 0);
                            iHashCode8 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                            InterfaceC28653p1 interfaceC28653p1M87116A6 = c28655q20.m87116A();
                            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q20, modifierM3409f);
                            c0213jM545a8 = C0217k.m545a();
                            c28655q20.m87158i0();
                            if (c28655q20.m87120E()) {
                                c28655q20.m87163l(c0213jM545a8);
                            } else {
                                c28655q20.m87178s0();
                            }
                            c0209iM8291d5 = AbstractC2875y.m8291d(c28655q20, c23010xM66775a4, c28655q20, interfaceC28653p1M87116A6);
                            if (c28655q20.m87120E() || !AbstractC22676k.m65745e(c28655q20.m87133R(), Integer.valueOf(iHashCode8))) {
                                AbstractC11266d.m30471y(iHashCode8, c28655q20, iHashCode8, c0209iM8291d5);
                            }
                            AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N6);
                            c28655q20.m87150e0(-126496420);
                            for (C3458l1 c3458l1 : c1037p0M15198c.m2957m()) {
                                C3437e1 c3437e1 = new C3437e1();
                                objM87133R10 = c28655q20.m87133R();
                                if (objM87133R10 == c28676v1) {
                                    objM87133R10 = new C28503p(23);
                                    c28655q20.m87172p0(objM87133R10);
                                }
                                c3437e1.Compose(c3458l1, (p715kotlin.jvm.functions.Function1) objM87133R10, c28655q20, 48);
                            }
                            c28655q20.m87179t();
                            c28655q20.m87177s();
                            c28655q20.m87179t();
                        } else {
                            c28655q20.m87150e0(439637133);
                            Modifier modifierM3409f2 = AbstractC1102d.m3409f(0.5f, c2314t2);
                            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q20, 0);
                            iHashCode7 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                            InterfaceC28653p1 interfaceC28653p1M87116A7 = c28655q20.m87116A();
                            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q20, modifierM3409f2);
                            c0213jM545a7 = C0217k.m545a();
                            c28655q20.m87158i0();
                            if (c28655q20.m87120E()) {
                                c28655q20.m87163l(c0213jM545a7);
                            } else {
                                c28655q20.m87178s0();
                            }
                            c0209iM8291d4 = AbstractC2875y.m8291d(c28655q20, c23010xM66775a5, c28655q20, interfaceC28653p1M87116A7);
                            if (c28655q20.m87120E() || !AbstractC22676k.m65745e(c28655q20.m87133R(), Integer.valueOf(iHashCode7))) {
                                AbstractC11266d.m30471y(iHashCode7, c28655q20, iHashCode7, c0209iM8291d4);
                            }
                            AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N7);
                            C3437e1 c3437e2 = new C3437e1();
                            C3458l1 c3458l2 = c1037p0M15198c.m2957m().get(0);
                            objM87133R9 = c28655q20.m87133R();
                            if (objM87133R9 == c28676v1) {
                                objM87133R9 = new C28503p(22);
                                c28655q20.m87172p0(objM87133R9);
                            }
                            c3437e2.Compose(c3458l2, (p715kotlin.jvm.functions.Function1) objM87133R9, c28655q20, 48);
                            c28655q20.m87177s();
                            c28655q20.m87179t();
                        }
                        if (1.0f <= 0.0d) {
                            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                        }
                        Modifier modifierMo3471e = new LayoutWeightElement(1.0f, true).mo3471e(new VerticalAlignElement(c2306l));
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q20, 54);
                        iHashCode4 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                        InterfaceC28653p1 interfaceC28653p1M87116A8 = c28655q20.m87116A();
                        Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q20, modifierMo3471e);
                        InterfaceC0221l.f734a.getClass();
                        c0213jM545a4 = C0217k.m545a();
                        c28655q20.m87158i0();
                        if (c28655q20.m87120E()) {
                            c28655q20.m87163l(c0213jM545a4);
                        } else {
                            c28655q20.m87178s0();
                        }
                        c0209iM8291d3 = AbstractC2875y.m8291d(c28655q20, c23010xM66775a6, c28655q20, interfaceC28653p1M87116A8);
                        if (c28655q20.m87120E() || !AbstractC22676k.m65745e(c28655q20.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q20, iHashCode4, c0209iM8291d3);
                        }
                        AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N8);
                        AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(f15, c2314t2));
                        Modifier modifierM3424u = AbstractC1102d.m3424u(42 * f16, c2314t2);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m3, false);
                        iHashCode5 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                        InterfaceC28653p1 interfaceC28653p1M87116A9 = c28655q20.m87116A();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q20, modifierM3424u);
                        c0213jM545a5 = C0217k.m545a();
                        c28655q20.m87158i0();
                        if (c28655q20.m87120E()) {
                            c28655q20.m87163l(c0213jM545a5);
                        } else {
                            c28655q20.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q20, C0217k.m547c(), interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q20, C0217k.m549e(), interfaceC28653p1M87116A9);
                        c0209iM546b2 = C0217k.m546b();
                        if (c28655q20.m87120E() || !AbstractC22676k.m65745e(c28655q20.m87133R(), Integer.valueOf(iHashCode5))) {
                            AbstractC11266d.m30471y(iHashCode5, c28655q20, iHashCode5, c0209iM546b2);
                        }
                        AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N9);
                        List<C23465k> listM3065b = c1037p0M15198c.getSegmentControlState().m3065b();
                        arrayList = new ArrayList(AbstractC25267u.m74163i0(listM3065b, 10));
                        it = listM3065b.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new C33223u0((String) ((C23465k) it.next()).f92937w, null, 2, false ? 1 : 0));
                        }
                        int iM3064a = c1037p0M15198c.getSegmentControlState().getInitialSelected();
                        boolean zM87157i7 = c28655q20.m87157i(c1037p0M15198c);
                        if (i28 == 32) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87157i7 | z15;
                        objM87133R = c28655q20.m87133R();
                        if (!z16 || objM87133R == c28676v1) {
                            function5 = onViewEvent;
                            objM87133R = new C1021h0(c1037p0M15198c, function5, 3);
                            c28655q20.m87172p0(objM87133R);
                        } else {
                            function5 = onViewEvent;
                        }
                        AbstractC33231x0.m105420e(arrayList, iM3064a, null, null, (p715kotlin.jvm.functions.Function1) objM87133R, c28655q20, 0, 12);
                        c28655q20.m87177s();
                        f19 = f16 * f16;
                        AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(f19, c2314t2));
                        Modifier modifierM3424u2 = AbstractC1102d.m3424u(52 * f16, c2314t2);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m3, false);
                        iHashCode6 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                        InterfaceC28653p1 interfaceC28653p1M87116A10 = c28655q20.m87116A();
                        Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q20, modifierM3424u2);
                        InterfaceC0221l.f734a.getClass();
                        c0213jM545a6 = C0217k.m545a();
                        c28655q20.m87158i0();
                        if (c28655q20.m87120E()) {
                            c28655q20.m87163l(c0213jM545a6);
                        } else {
                            c28655q20.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q20, C0217k.m547c(), interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q20, C0217k.m549e(), interfaceC28653p1M87116A10);
                        c0209iM546b3 = C0217k.m546b();
                        if (c28655q20.m87120E() || !AbstractC22676k.m65745e(c28655q20.m87133R(), Integer.valueOf(iHashCode6))) {
                            AbstractC11266d.m30471y(iHashCode6, c28655q20, iHashCode6, c0209iM546b3);
                        }
                        AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N10);
                        C17858a c17858a = new C17858a();
                        C17863f c17863fM2948d = c1037p0M15198c.getDateSelectorState();
                        boolean zM87157i8 = c28655q20.m87157i(c1037p0M15198c);
                        if (i28 == 32) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        z18 = zM87157i8 | z17;
                        objM87133R2 = c28655q20.m87133R();
                        if (z18 || objM87133R2 == c28676v1) {
                            objM87133R2 = new C1021h0(c1037p0M15198c, function5, 4);
                            c28655q20.m87172p0(objM87133R2);
                        }
                        c17858a.Compose(c2314t2, c17863fM2948d, (p715kotlin.jvm.functions.Function1) objM87133R2, c28655q20, (C17863f.f69516k << 3) | 6 | (C17858a.f69479a << 9));
                        c2314t = c2314t2;
                        if (c1037p0M15198c.m2957m().size() > 1) {
                            c28655q20.m87150e0(-2011835814);
                            AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(3 * f16, c2314t));
                            c28655q20.m87179t();
                        } else {
                            c28655q20.m87150e0(-2011701274);
                            c28655q20.m87179t();
                        }
                        c28655q20.m87177s();
                        c28655q20.m87177s();
                        c28655q20.m87177s();
                        if (c1037p0M15198c.getWhoopCoachVow() != null) {
                            c28655q20.m87150e0(1692028414);
                            C32048d c32048dM2944I = c1037p0M15198c.getWhoopCoachVow();
                            C13762f c13762f = new C13762f(11);
                            z68 = i34 == true ? 1 : 0;
                            if (z27 == 256) {
                                z27 = z68;
                                z28 = true;
                            } else {
                                z27 = z68;
                                z28 = false;
                            }
                            objM87133R8 = c28655q20.m87133R();
                            if (z28 || objM87133R8 == c28676v1) {
                                objM87133R8 = new C1016f(onNavigationEvent, 3);
                                c28655q20.m87172p0(objM87133R8);
                            }
                            AbstractC25303l.m74291r(c32048dM2944I, null, c13762f, (p715kotlin.jvm.functions.Function1) objM87133R8, c28655q20, C32048d.f132920h, 2);
                            c28655q20.m87179t();
                            f24 = f18;
                            z24 = z27;
                        } else {
                            z67 = i34 == true ? 1 : 0;
                            if (c1037p0M15198c.getVow() != null) {
                                z19 = z67;
                                AbstractC33745d.m106667z(c28655q20, 1692718102, c2314t, f19, c28655q20);
                                f24 = f18;
                                Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, f24, 0.0f, 2);
                                String strM21274h = AbstractC8693b.m21274h(c1037p0M15198c.getVow(), c28655q20, TextResource.$stable);
                                C38072d c38072d = C38072d.f163053a;
                                int i35 = C38072d.f163054b;
                                AbstractC30795n.m94707h(strM21274h, modifierM3396r3, c38072d.m121949b(c28655q20, i35).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q20, i35).getB1(), null, c28655q20, 48, C2886a.f11498d << 18, 196600);
                                c28655q20.m87179t();
                                z24 = z19;
                            } else {
                                z19 = z67;
                                f24 = f18;
                                c28655q20.m87150e0(1693216861);
                                c28655q20.m87179t();
                                z24 = z19;
                            }
                        }
                        c28655q20.m87177s();
                        listM2959o = c1037p0M15198c.m2959o();
                        if (listM2959o == null) {
                            c28655q20.m87150e0(1846652920);
                            c28655q20.m87179t();
                            f25 = f16;
                        } else {
                            c28655q20.m87150e0(1846652921);
                            if (listM2959o.isEmpty()) {
                                f25 = f16;
                            } else {
                                f25 = f16;
                                AbstractC11266d.m30469w(6, f25, c2314t, c28655q20);
                                List<C1036p> list = listM2959o;
                                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                                it3 = list.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(m2905o1((C1036p) it3.next()));
                                }
                                AbstractC26189c.m77740e(arrayList2, null, 0L, c28655q20, 0, 6);
                            }
                            c28655q20.m87179t();
                        }
                        if (c1037p0M15198c.getGraphState() != null) {
                            c28655q20.m87150e0(1847148673);
                            AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(f17 * f25, c2314t));
                            c28655q20.m87144b0(59588852, c1037p0M15198c.getMetaData());
                            Modifier modifierM3384f = AbstractC1099a.m3384f(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 1 * f17, 0.0f, 11), false, 1.3333334f);
                            C21395c c21395cM2952h = c1037p0M15198c.getGraphState();
                            if (i28 == 32) {
                                z26 = true;
                            } else {
                                z26 = false;
                            }
                            zM87157i = c28655q20.m87157i(c1037p0M15198c) | z26 | c28655q20.m87155h(zIsFeatureEnabled);
                            objM87133R7 = c28655q20.m87133R();
                            if (zM87157i || objM87133R7 == c28676v1) {
                                objM87133R7 = new C1023i0(function5, c1037p0M15198c, zIsFeatureEnabled, 0);
                                c28655q20.m87172p0(objM87133R7);
                            }
                            AbstractC2756k.m7799p(modifierM3384f, c21395cM2952h, null, null, false, null, (p715kotlin.jvm.functions.Function1) objM87133R7, c28655q20, (C21395c.f81985e << 3) | 6, 60);
                            c28655q20.m87173q(false);
                            c28655q20.m87179t();
                        } else {
                            c28655q20.m87150e0(1849300228);
                            m2855X(c1037p0M15198c, c28655q20, 0);
                            c28655q20.m87179t();
                        }
                        listM2954j = c1037p0M15198c.m2954j();
                        if (listM2954j != null || listM2954j.isEmpty()) {
                            c28655q20.m87150e0(1850319415);
                            c28655q20.m87179t();
                        } else {
                            c28655q20.m87150e0(1849480462);
                            AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(3 * f25, c2314t));
                            for (C4092p2 c4092p2 : c1037p0M15198c.m2954j()) {
                                C13762f c13762f2 = new C13762f(10);
                                boolean z77 = i28 == 32;
                                Object objM87133R33 = c28655q20.m87133R();
                                if (z77 || objM87133R33 == c28676v1) {
                                    objM87133R33 = new C1016f(function5, 4);
                                    c28655q20.m87172p0(objM87133R33);
                                }
                                AbstractC25303l.m74291r(c4092p2, null, c13762f2, (p715kotlin.jvm.functions.Function1) objM87133R33, c28655q20, C4092p2.f16593v, 2);
                            }
                            c28655q20.m87179t();
                        }
                        c3438fM2947c = c1037p0M15198c.getCardioFitnessLevel();
                        if (c3438fM2947c == null) {
                            c28655q20.m87150e0(1850392047);
                            c28655q20.m87179t();
                        } else {
                            c28655q20.m87150e0(1850392048);
                            C3432d c3432d = new C3432d();
                            Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, f24, 0.0f, 2);
                            objM87133R3 = c28655q20.m87133R();
                            if (objM87133R3 == c28676v1) {
                                interfaceC28601c4 = interfaceC28601c17;
                                objM87133R3 = new C1010c(7, interfaceC28601c4);
                                c28655q20.m87172p0(objM87133R3);
                            } else {
                                interfaceC28601c4 = interfaceC28601c17;
                            }
                            c3432d.Compose(modifierM3396r4, c3438fM2947c, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q20, 390);
                            if (m2892k0(interfaceC28601c4)) {
                                c28655q20.m87150e0(-491383044);
                                c3448i0M10037e = c3438fM2947c.getModal();
                                if (c3448i0M10037e == null) {
                                    c28655q20.m87150e0(1946994821);
                                    c28655q20.m87179t();
                                } else {
                                    c28655q20.m87150e0(1946994822);
                                    objM87133R4 = c28655q20.m87133R();
                                    if (objM87133R4 == c28676v1) {
                                        objM87133R4 = new C1010c(8, interfaceC28601c4);
                                        c28655q20.m87172p0(objM87133R4);
                                    }
                                    m2875e1(c3448i0M10037e, onAnalyticsEvent, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q20, TextResource.$stable | 384 | ((i27 >> 6) & 112));
                                    c28655q20.m87179t();
                                }
                                c28655q20.m87179t();
                            } else {
                                c28655q20.m87150e0(1947141948);
                                c28655q20.m87179t();
                            }
                            c28655q20.m87179t();
                        }
                        c1034oM2958n = c1037p0M15198c.getLastUpdatedViewState();
                        if (c1034oM2958n == null) {
                            c28655q20.m87150e0(1850982163);
                            c28655q20.m87179t();
                        } else {
                            c28655q20.m87150e0(1850982164);
                            m2874e0(c1034oM2958n, 0.0f, c28655q20, TextResource.$stable, 2);
                            c28655q20.m87179t();
                        }
                        if (c1037p0M15198c.getAdditionalInfoText() != null) {
                            c28655q20.m87150e0(1851155888);
                            C36613b c36613bM2945a = c1037p0M15198c.getAdditionalInfoText();
                            if (z24 == 256) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            objM87133R6 = c28655q20.m87133R();
                            if (z25 || objM87133R6 == c28676v1) {
                                objM87133R6 = new C1016f(onNavigationEvent, 5);
                                c28655q20.m87172p0(objM87133R6);
                            }
                            AbstractC36612a.m117607d(c36613bM2945a, (p715kotlin.jvm.functions.Function1) objM87133R6, c28655q20, C36613b.f156835d);
                            c28655q20.m87179t();
                        } else if (c1037p0M15198c.getInfoCalloutDisplay() != null) {
                            c28655q20.m87150e0(1851547852);
                            AbstractC3431c1.m9900b(c1037p0M15198c.getInfoCalloutDisplay(), c28655q20, TextResource.$stable);
                            c28655q20.m87179t();
                        } else {
                            c28655q20.m87150e0(1851650679);
                            c28655q20.m87179t();
                        }
                        c3808hM2946b = c1037p0M15198c.getBreakdownBarState();
                        if (c3808hM2946b == null) {
                            c28655q20.m87150e0(1851712399);
                            c28655q20.m87179t();
                        } else {
                            c28655q20.m87150e0(1851712400);
                            float f34 = 3;
                            AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(f34 * f25, c2314t));
                            C3802b c3802b = new C3802b();
                            Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t, f34 * f17, 0.0f, 2);
                            objM87133R5 = c28655q20.m87133R();
                            if (objM87133R5 == c28676v1) {
                                objM87133R5 = new C28503p(25);
                                c28655q20.m87172p0(objM87133R5);
                            }
                            c3802b.Compose(modifierM3396r5, c3808hM2946b, (p715kotlin.jvm.functions.Function1) objM87133R5, c28655q20, (C3808h.f15610f << 3) | 390 | (C3802b.f15555a << 9));
                            c28655q20.m87179t();
                        }
                        c28655q20.m87179t();
                        z29 = z24;
                    }
                    c28655q20.m87150e0(59743121);
                    it4 = c1037p0M15198c.m2940E().iterator();
                    while (it4.hasNext()) {
                        c39282o = (C39282o) it4.next();
                        Iterator it6 = it4;
                        float f35 = f15;
                        Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1099a.m3394p(8 * f13, c2314t), C38072d.f163053a.m121949b(c28655q20, C38072d.f163054b).getWhite10(), C22411w.f87680a.m64535a().m64090c());
                        boolean zM87157i9 = c28655q20.m87157i(c39282o);
                        if (z29 == 256) {
                            z64 = true;
                        } else {
                            z64 = false;
                        }
                        z65 = zM87157i9 | z64;
                        objM87133R21 = c28655q20.m87133R();
                        if (z65 || objM87133R21 == c28676v1) {
                            objM87133R21 = new C1033n0(c39282o, onNavigationEvent, 0);
                            c28655q20.m87172p0(objM87133R21);
                        }
                        AbstractC39281n.m125207c(modifierM3358c, c39282o, (InterfaceC4339a) objM87133R21, c28655q20, C39282o.f168987q << 3, 0);
                        it4 = it6;
                        f15 = f35;
                    }
                    f26 = f15;
                    c28655q20.m87179t();
                    c28655q20.m87150e0(59776282);
                    for (InterfaceC25312u interfaceC25312u : c1037p0M15198c.m2949e()) {
                        C25307p c25307p = f3931a;
                        C13762f c13762f3 = new C13762f(12);
                        if (z29 == 256) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        if ((i27 & 1879048192) == 536870912) {
                            z58 = true;
                        } else {
                            z58 = false;
                        }
                        z59 = z57 | z58;
                        objM87133R20 = c28655q20.m87133R();
                        if (!z59 || objM87133R20 == c28676v1) {
                            z60 = z69;
                            objM87133R20 = new C1017f0(onNavigationEvent, z60, 0);
                            c28655q20.m87172p0(objM87133R20);
                        } else {
                            z60 = z69;
                        }
                        AbstractC25303l.m74291r(interfaceC25312u, c25307p, c13762f3, (p715kotlin.jvm.functions.Function1) objM87133R20, c28655q20, C25307p.f99300b << 3, 0);
                        z69 = z60;
                    }
                    c28655q4 = c28655q20;
                    z34 = z69;
                    c28655q4.m87179t();
                    listM2941F = c1037p0M15198c.m2941F();
                    if (listM2941F == null) {
                        c28655q4.m87150e0(1853989876);
                        c28655q4.m87179t();
                        c28655q8 = c28655q4;
                        f27 = f25;
                        function6 = function5;
                        z69 = z34;
                        f28 = f26;
                        interfaceC28601c5 = interfaceC28601c14;
                        interfaceC2994c0 = interfaceC2994c4;
                        interfaceC28601c6 = interfaceC28601c18;
                        c1037p0 = c1037p0M15198c;
                        function7 = onNavigationEvent;
                        c2307m = c2307m3;
                        i15 = 8;
                        i16 = i28;
                    } else {
                        c28655q4.m87150e0(1853989877);
                        c28655q4.m87150e0(59808362);
                        it5 = listM2941F.iterator();
                        c28655q5 = c28655q4;
                        while (it5.hasNext()) {
                            c1048y = (C1048y) it5.next();
                            C39282o c39282oM3067b = c1048y.getMenuItem();
                            C13762f c13762f4 = new C13762f(7);
                            Iterator it7 = it5;
                            boolean zM87157i10 = c28655q5.m87157i(c1048y) | c28655q5.m87157i(interfaceC2994c4) | c28655q5.m87157i(c15199y6);
                            if (i28 == 32) {
                                z35 = true;
                            } else {
                                z35 = false;
                            }
                            boolean z78 = z35 | zM87157i10;
                            if (z29 == 256) {
                                z36 = true;
                            } else {
                                z36 = false;
                            }
                            z37 = z78 | z36;
                            Object objM87133R34 = c28655q5.m87133R();
                            if (!z37 || objM87133R34 == c28676v1) {
                                C28655q c28655q21 = c28655q5;
                                interfaceC28601c7 = interfaceC28601c14;
                                interfaceC2994c1 = interfaceC2994c4;
                                interfaceC28601c8 = interfaceC28601c18;
                                i17 = 8;
                                c1019g0 = new C1019g0(c1048y, interfaceC2994c1, interfaceC28601c8, interfaceC28601c7, interfaceC28601c19, c15199y6, function5, onNavigationEvent, 0);
                                c28655q21.m87172p0(c1019g0);
                                c28655q6 = c28655q21;
                            } else {
                                c28655q6 = c28655q5;
                                c1019g0 = objM87133R34;
                                interfaceC28601c7 = interfaceC28601c14;
                                interfaceC2994c1 = interfaceC2994c4;
                                interfaceC28601c8 = interfaceC28601c18;
                                i17 = 8;
                            }
                            InterfaceC28601c1 interfaceC28601c20 = interfaceC28601c8;
                            c28655q7 = c28655q6;
                            InterfaceC2994c0 interfaceC2994c5 = interfaceC2994c1;
                            InterfaceC28601c1 interfaceC28601c21 = interfaceC28601c7;
                            AbstractC25303l.m74291r(c39282oM3067b, null, c13762f4, (p715kotlin.jvm.functions.Function1) c1019g0, c28655q7, C39282o.f168987q, 2);
                            textResourceM3068c = c1048y.getMenuItemDetailText();
                            if (textResourceM3068c == null) {
                                c28655q7.m87150e0(238254520);
                                c28655q7.m87179t();
                            } else {
                                c28655q7.m87150e0(238254521);
                                String strM21274h2 = AbstractC8693b.m21274h(textResourceM3068c, c28655q7, TextResource.$stable);
                                float f36 = i17;
                                Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t, f36 * f13, ((float) 0.5d) * f36);
                                C38072d c38072d2 = C38072d.f163053a;
                                int i36 = C38072d.f163054b;
                                AbstractC30795n.m94707h(strM21274h2, modifierM3395q, c38072d2.m121949b(c28655q7, i36).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q7, i36).getB2(), null, c28655q7, 0, C2886a.f11498d << 18, 196600);
                                c28655q7.m87179t();
                            }
                            function5 = function5;
                            onNavigationEvent = onNavigationEvent;
                            i28 = i28;
                            c2307m3 = c2307m3;
                            c1037p0M15198c = c1037p0M15198c;
                            z34 = z34;
                            f25 = f25;
                            f26 = f26;
                            interfaceC28601c18 = interfaceC28601c20;
                            interfaceC2994c4 = interfaceC2994c5;
                            interfaceC28601c14 = interfaceC28601c21;
                            c28655q5 = c28655q7;
                            it5 = it7;
                        }
                        C28655q c28655q22 = c28655q5;
                        f27 = f25;
                        function6 = function5;
                        z69 = z34;
                        f28 = f26;
                        interfaceC28601c5 = interfaceC28601c14;
                        interfaceC2994c0 = interfaceC2994c4;
                        interfaceC28601c6 = interfaceC28601c18;
                        c1037p0 = c1037p0M15198c;
                        function7 = onNavigationEvent;
                        c2307m = c2307m3;
                        i15 = 8;
                        i16 = i28;
                        c28655q22.m87179t();
                        c28655q22.m87179t();
                        c28655q8 = c28655q22;
                    }
                    if (c1037p0.getManualMeasurementItem() != null) {
                        c28655q8.m87150e0(1857129185);
                        C39282o c39282oM2960p = c1037p0.getManualMeasurementItem();
                        C13762f c13762f5 = new C13762f(8);
                        objM87133R19 = c28655q8.m87133R();
                        if (objM87133R19 == c28676v1) {
                            interfaceC28601c12 = interfaceC28601c1;
                            objM87133R19 = new C1010c(6, interfaceC28601c12);
                            c28655q8.m87172p0(objM87133R19);
                        } else {
                            interfaceC28601c12 = interfaceC28601c1;
                        }
                        C28655q c28655q23 = c28655q8;
                        interfaceC28601c1 = interfaceC28601c12;
                        AbstractC25303l.m74291r(c39282oM2960p, null, c13762f5, (p715kotlin.jvm.functions.Function1) objM87133R19, c28655q23, C39282o.f168987q | 3072, 2);
                        c28655q18 = c28655q23;
                        textResourceM2962r = c1037p0.getManualMeasurementTextDisplay();
                        if (textResourceM2962r == null) {
                            c28655q18.m87150e0(1857519505);
                            c28655q18.m87179t();
                        } else {
                            c28655q18.m87150e0(1857519506);
                            String strM21274h3 = AbstractC8693b.m21274h(textResourceM2962r, c28655q18, TextResource.$stable);
                            float f37 = i15;
                            Modifier modifierM3395q2 = AbstractC1099a.m3395q(c2314t, f13 * f37, 1 * f37);
                            C38072d c38072d3 = C38072d.f163053a;
                            int i37 = C38072d.f163054b;
                            AbstractC30795n.m94707h(strM21274h3, modifierM3395q2, c38072d3.m121949b(c28655q18, i37).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q18, i37).getB2(), null, c28655q18, 48, C2886a.f11498d << 18, 196600);
                            c28655q18.m87179t();
                        }
                        c28655q18.m87179t();
                        c28655q9 = c28655q18;
                    } else {
                        c28655q8.m87150e0(1857949879);
                        c28655q8.m87179t();
                        c28655q9 = c28655q8;
                    }
                    if (c1037p0.getSeeAllDataItem() != null) {
                        c28655q9.m87150e0(1858031409);
                        C39282o c39282oM2969y = c1037p0.getSeeAllDataItem();
                        C13762f c13762f6 = new C13762f(9);
                        if (z29 == 256) {
                            z55 = true;
                        } else {
                            z55 = false;
                        }
                        if (i16 == 32) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        boolean z79 = z55 | z56;
                        c1037p4 = c1037p0;
                        zM87157i4 = z79 | c28655q9.m87157i(c1037p4);
                        objM87133R18 = c28655q9.m87133R();
                        if (zM87157i4 || objM87133R18 == c28676v1) {
                            objM87133R18 = new C29656q(function7, (Object) function6, (Object) c1037p4, 2);
                            c28655q9.m87172p0(objM87133R18);
                        }
                        C28655q c28655q24 = c28655q9;
                        c1037p0 = c1037p4;
                        AbstractC25303l.m74291r(c39282oM2969y, null, c13762f6, (p715kotlin.jvm.functions.Function1) objM87133R18, c28655q24, C39282o.f168987q, 2);
                        C28655q c28655q25 = c28655q24;
                        c28655q25.m87179t();
                        c28655q10 = c28655q25;
                    } else {
                        c28655q9.m87150e0(1858713719);
                        c28655q9.m87179t();
                        c28655q10 = c28655q9;
                    }
                    if (c1037p0.getUpsellCard() != null) {
                        c28655q10.m87150e0(1858784275);
                        Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t, i15 * f13, 0.0f, 2);
                        InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m, false);
                        iHashCode9 = Long.hashCode(AbstractC28683x.m87267u(c28655q10));
                        InterfaceC28653p1 interfaceC28653p1M87116A11 = c28655q10.m87116A();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q10, modifierM3396r6);
                        InterfaceC0221l.f734a.getClass();
                        c0213jM545a9 = C0217k.m545a();
                        c28655q10.m87158i0();
                        if (c28655q10.m87120E()) {
                            c28655q10.m87163l(c0213jM545a9);
                        } else {
                            c28655q10.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q10, C0217k.m547c(), interfaceC39127r0M66763d4);
                        AbstractC28683x.m87239G(c28655q10, C0217k.m549e(), interfaceC28653p1M87116A11);
                        c0209iM546b4 = C0217k.m546b();
                        if (c28655q10.m87120E() || !AbstractC22676k.m65745e(c28655q10.m87133R(), Integer.valueOf(iHashCode9))) {
                            AbstractC11266d.m30471y(iHashCode9, c28655q10, iHashCode9, c0209iM546b4);
                        }
                        AbstractC28683x.m87239G(c28655q10, C0217k.m548d(), modifierM118962N11);
                        C16550q c16550qM2942G = c1037p0.getUpsellCard();
                        c1037p3 = c1037p0;
                        boolean zM87157i11 = c28655q10.m87157i(c1037p3);
                        if (z29 == 256) {
                            z52 = true;
                        } else {
                            z52 = false;
                        }
                        z54 = zM87157i11 | z52;
                        objM87133R17 = c28655q10.m87133R();
                        if (z54 || objM87133R17 == c28676v1) {
                            objM87133R17 = new C1021h0(c1037p3, function7, 0);
                            c28655q10.m87172p0(objM87133R17);
                        }
                        C28655q c28655q26 = c28655q10;
                        c1037p1 = c1037p3;
                        AbstractC16549p.m46792z(null, c16550qM2942G, false, (p715kotlin.jvm.functions.Function1) objM87133R17, c28655q26, C16550q.f63696v << 3, 5);
                        C28655q c28655q27 = c28655q26;
                        c28655q27.m87177s();
                        c28655q27.m87179t();
                        c28655q11 = c28655q27;
                    } else {
                        c1037p1 = c1037p0;
                        c28655q10.m87150e0(1859280151);
                        c28655q10.m87179t();
                        c28655q11 = c28655q10;
                    }
                    if (c1037p1.getSegmentalAnalysisViewState() != null) {
                        c28655q11.m87150e0(1859362611);
                        C3471r0 c3471r0M2936A = c1037p1.getSegmentalAnalysisViewState();
                        if ((i27 & 458752) == 131072) {
                            z49 = true;
                        } else {
                            z49 = false;
                        }
                        c1037p2 = c1037p1;
                        zM87157i3 = z49 | c28655q11.m87157i(c1037p2);
                        objM87133R16 = c28655q11.m87133R();
                        if (zM87157i3 || objM87133R16 == c28676v1) {
                            objM87133R16 = new C1021h0(onBodyCompInfoClicked, c1037p2, 1);
                            c28655q11.m87172p0(objM87133R16);
                        }
                        AbstractC3469q0.m10196d(c3471r0M2936A, (p715kotlin.jvm.functions.Function1) objM87133R16, c28655q11, 0);
                        c28655q11.m87179t();
                    } else {
                        c1037p2 = c1037p1;
                        c28655q11.m87150e0(1859704727);
                        c28655q11.m87179t();
                    }
                    c16934fM2950f = c1037p2.getEducationCarouselModel();
                    if (c16934fM2950f == null) {
                        c28655q11.m87150e0(1859775282);
                        c28655q11.m87179t();
                        f29 = f28;
                        c23454a0 = null;
                    } else {
                        float f38 = f28;
                        AbstractC33745d.m106667z(c28655q11, 1859775283, c2314t, f38, c28655q11);
                        if ((i27 & 57344) == 16384) {
                            z38 = true;
                        } else {
                            z38 = false;
                        }
                        zM87157i2 = z38 | c28655q11.m87157i(c1037p2);
                        objM87133R11 = c28655q11.m87133R();
                        if (zM87157i2 || objM87133R11 == c28676v1) {
                            objM87133R11 = new C0167g(7, onCarouselItemClicked, c1037p2);
                            c28655q11.m87172p0(objM87133R11);
                        }
                        C28655q c28655q28 = c28655q11;
                        f29 = f38;
                        AbstractC25303l.m74291r(c16934fM2950f, null, null, (p715kotlin.jvm.functions.Function1) objM87133R11, c28655q28, C16934f.f64958n, 6);
                        C28655q c28655q29 = c28655q28;
                        AbstractC22953f.m66715b(c28655q29, AbstractC1102d.m3411h(1 * f27, c2314t));
                        c28655q29.m87179t();
                        c23454a0 = C23454a0.f92919a;
                        c28655q12 = c28655q29;
                    }
                    if (c23454a0 == null) {
                        c28655q12 = c28655q11;
                        c28655q12.m87150e0(1860247599);
                        AbstractC22953f.m66715b(c28655q12, AbstractC1102d.m3411h(f27 * f27, c2314t));
                        c28655q12.m87179t();
                    } else {
                        c28655q12 = c28655q11;
                        c28655q12.m87150e0(59991929);
                        c28655q12.m87179t();
                    }
                    listM2965u = c1037p2.m2965u();
                    if (listM2965u != null) {
                        z48 = true;
                        if (!listM2965u.isEmpty()) {
                            c28655q12.m87150e0(1860444325);
                            c28655q17 = c28655q12;
                            for (C30885c c30885c : c1037p2.m2965u()) {
                                C30886d c30886d = new C30886d();
                                InterfaceC28601c1 interfaceC28601c22 = interfaceC28601c5;
                                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1099a.m3396r(c2314t, f13 * 8, 0.0f, 2), "metricEducation");
                                objM87133R15 = c28655q17.m87133R();
                                if (objM87133R15 == c28676v1) {
                                    objM87133R15 = new C28503p(19);
                                    c28655q17.m87172p0(objM87133R15);
                                }
                                C28655q c28655q30 = c28655q17;
                                c30886d.Compose(modifierM3599a, c30885c, (p715kotlin.jvm.functions.Function1) objM87133R15, c28655q30, (C30885c.f127341h << 3) | 390 | (C30886d.f127349a << 9));
                                C28655q c28655q31 = c28655q30;
                                AbstractC22953f.m66715b(c28655q31, AbstractC1102d.m3411h(f29, c2314t));
                                AbstractC22953f.m66715b(c28655q31, AbstractC22953f.m66722k(c2314t));
                                interfaceC28601c5 = interfaceC28601c22;
                                z48 = true;
                                c28655q17 = c28655q31;
                            }
                            interfaceC28601c9 = interfaceC28601c5;
                            z39 = z48;
                            c28655q17.m87179t();
                            c28655q14 = c28655q17;
                        } else {
                            z39 = true;
                        }
                        c28655q14.m87177s();
                        c28655q14.m87177s();
                        if (m2883h0(interfaceC28601c1) || dVar.getViewState().getManualMeasurementViewState() == null) {
                            interfaceC28601c9 = interfaceC28601c9;
                            interfaceC2994c2 = interfaceC2994c0;
                            c28676v2 = c28676v1;
                            i18 = r37;
                            c15199y4 = c15199y3M3460c;
                            c28655q14.m87150e0(-1783148477);
                            c28655q14.m87179t();
                            c28655q15 = c28655q14;
                        } else {
                            c28655q14.m87150e0(-1784529031);
                            C4819g c4819gM2963s = dVar.getViewState().getManualMeasurementViewState();
                            String strM21273g = AbstractC8693b.m21273g(AbstractC32706a.f135948b, c28655q14, 0);
                            String strM21273g2 = AbstractC8693b.m21273g(AbstractC32706a.f135949c, c28655q14, 0);
                            Object objM87133R35 = c28655q14.m87133R();
                            if (objM87133R35 == c28676v1) {
                                interfaceC28601c11 = interfaceC28601c1;
                                objM87133R35 = new C1014e(3, interfaceC28601c11);
                                c28655q14.m87172p0(objM87133R35);
                            } else {
                                interfaceC28601c11 = interfaceC28601c1;
                            }
                            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R35;
                            C15199y3 c15199y7 = c15199y3M3460c;
                            i18 = i26;
                            boolean zM87157i12 = c28655q14.m87157i(interfaceC2994c0) | c28655q14.m87157i(c15199y7) | (i16 == 32 ? z39 : false) | (i18 == 4 ? z39 : false);
                            Object objM87133R36 = c28655q14.m87133R();
                            if (zM87157i12 || objM87133R36 == c28676v1) {
                                InterfaceC2994c0 interfaceC2994c6 = interfaceC2994c0;
                                InterfaceC28601c1 interfaceC28601c23 = interfaceC28601c11;
                                c1040r = new C1040r(interfaceC2994c6, onViewEvent, (Object) viewState, c15199y7, interfaceC28601c23, 2);
                                interfaceC2994c3 = interfaceC2994c6;
                                interfaceC28601c1 = interfaceC28601c23;
                                c15199y7 = c15199y7;
                                c28655q14.m87172p0(c1040r);
                            } else {
                                interfaceC2994c3 = interfaceC2994c0;
                                c1040r = objM87133R36;
                                interfaceC28601c1 = interfaceC28601c11;
                            }
                            p715kotlin.jvm.functions.Function1 function9 = (p715kotlin.jvm.functions.Function1) c1040r;
                            Object objM87133R37 = c28655q14.m87133R();
                            Object obj = objM87133R37;
                            if (objM87133R37 == c28676v1) {
                                C0974i c0974i = new C0974i(3);
                                c28655q14.m87172p0(c0974i);
                                obj = c0974i;
                            }
                            int i38 = r49 >> 6;
                            int i39 = ((r49 >> 9) & 14) | 3120;
                            C28676v0 c28676v4 = c28676v1;
                            C15199y3 c15199y8 = c15199y7;
                            c28676v2 = c28676v4;
                            C28655q c28655q32 = c28655q14;
                            InterfaceC2994c0 interfaceC2994c7 = interfaceC2994c3;
                            AbstractC3436e0.m9933F(strM21273g, false, c4819gM2963s, c15199y8, dateTimeNow, localDateNow, z4, interfaceC2994c7, strM21273g2, null, onAnalyticsEvent, interfaceC4339a, function9, (InterfaceC4339a) obj, c28655q32, (i38 & 3670016) | (i38 & 57344) | 805310512 | (i38 & 458752), i39, 0);
                            c15199y4 = c15199y8;
                            interfaceC2994c2 = interfaceC2994c7;
                            C28655q c28655q33 = c28655q32;
                            c28655q33.m87179t();
                            c28655q15 = c28655q33;
                        }
                        List<C1048y> listM2941F2 = dVar.getViewState().m2941F();
                        if (i18 == 4) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R13 = c28655q15.m87133R();
                        C28676v0 c28676v5 = c28676v2;
                        if (!z44 || objM87133R13 == c28676v5) {
                            abstractC4813a0 = viewState;
                            interfaceC28601c10 = interfaceC28601c9;
                            objM87133R13 = new e(interfaceC28601c6, abstractC4813a0, interfaceC28601c10, null);
                            c28655q15.m87172p0(objM87133R13);
                        } else {
                            abstractC4813a0 = viewState;
                            interfaceC28601c10 = interfaceC28601c9;
                        }
                        AbstractC28683x.m87253g(c28655q15, (InterfaceC4351m) objM87133R13, listM2941F2);
                        if (m2886i0(interfaceC28601c19) || m2863a1(interfaceC28601c10) == null) {
                            function3 = onViewEvent;
                            c15199y5 = c15199y6;
                            c28655q15.m87150e0(-1782089021);
                            c28655q15.m87179t();
                            c28655q16 = c28655q15;
                        } else {
                            c28655q15.m87150e0(-1782521471);
                            C17675e c17675eM2863a1 = m2863a1(interfaceC28601c10);
                            AbstractC22676k.m65747g(c17675eM2863a1);
                            if (i19 == 32) {
                                i19 = i16;
                                z47 = true;
                            } else {
                                i19 = i16;
                                z47 = false;
                            }
                            Object objM87133R38 = c28655q15.m87133R();
                            if (z47 || objM87133R38 == c28676v5) {
                                function3 = onViewEvent;
                                objM87133R38 = new C1016f(function3, 2);
                                c28655q15.m87172p0(objM87133R38);
                            } else {
                                function3 = onViewEvent;
                            }
                            C28655q c28655q34 = c28655q15;
                            InterfaceC2994c0 interfaceC2994c8 = interfaceC2994c2;
                            AbstractC3487z0.m10230M(c17675eM2863a1, c15199y6, interfaceC2994c8, (p715kotlin.jvm.functions.Function1) objM87133R38, onAnalyticsEvent, c28655q34, ((i27 << 3) & 57344) | 64, 0);
                            interfaceC2994c2 = interfaceC2994c8;
                            C28655q c28655q35 = c28655q34;
                            c15199y5 = c15199y6;
                            c28655q35.m87179t();
                            c28655q16 = c28655q35;
                        }
                        boolean zM87157i13 = c28655q16.m87157i(interfaceC2994c2) | c28655q16.m87157i(c15199y4) | c28655q16.m87157i(c15199y5);
                        if (z29 == 256) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        z46 = zM87157i13 | z45;
                        objM87133R14 = c28655q16.m87133R();
                        if (!z46 || objM87133R14 == c28676v5) {
                            C1045v c1045v = new C1045v(interfaceC2994c2, c15199y5, function1, interfaceC28601c1, c15199y4, interfaceC28601c19);
                            function2 = function1;
                            c28655q16.m87172p0(c1045v);
                            objM87133R14 = c1045v;
                        } else {
                            function2 = function1;
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R14, false, c28655q16, 0, 1);
                        c28655q16.m87177s();
                        c28655q16.m87179t();
                        c28655q3 = c28655q16;
                    } else {
                        z39 = true;
                    }
                    interfaceC28601c9 = interfaceC28601c5;
                    c28655q12.m87150e0(1861127441);
                    c30885cM2966v = c1037p2.getMetricEducationState();
                    if (c30885cM2966v == null) {
                        c28655q12.m87150e0(1861127440);
                        c28655q12.m87179t();
                        c28655q13 = c28655q12;
                    } else {
                        c28655q12.m87150e0(1861127441);
                        C30886d c30886d2 = new C30886d();
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3396r(c2314t, 8 * f13, 0.0f, 2), "metricEducation");
                        objM87133R12 = c28655q12.m87133R();
                        if (objM87133R12 == c28676v1) {
                            objM87133R12 = new C28503p(21);
                            c28655q12.m87172p0(objM87133R12);
                        }
                        C28655q c28655q36 = c28655q12;
                        c30886d2.Compose(modifierM3599a2, c30885cM2966v, (p715kotlin.jvm.functions.Function1) objM87133R12, c28655q36, (C30885c.f127341h << 3) | 390 | (C30886d.f127349a << 9));
                        C28655q c28655q37 = c28655q36;
                        AbstractC22953f.m66715b(c28655q37, AbstractC1102d.m3411h(f29, c2314t));
                        AbstractC22953f.m66715b(c28655q37, AbstractC22953f.m66722k(c2314t));
                        c28655q37.m87179t();
                        c28655q13 = c28655q37;
                    }
                    c28655q13.m87179t();
                    c28655q14 = c28655q13;
                    c28655q14.m87177s();
                    c28655q14.m87177s();
                    if (m2883h0(interfaceC28601c1)) {
                        interfaceC28601c9 = interfaceC28601c9;
                        interfaceC2994c2 = interfaceC2994c0;
                        c28676v2 = c28676v1;
                        i18 = r37;
                        c15199y4 = c15199y3M3460c;
                        c28655q14.m87150e0(-1783148477);
                        c28655q14.m87179t();
                        c28655q15 = c28655q14;
                    } else {
                        interfaceC28601c9 = interfaceC28601c9;
                        interfaceC2994c2 = interfaceC2994c0;
                        c28676v2 = c28676v1;
                        i18 = r37;
                        c15199y4 = c15199y3M3460c;
                        c28655q14.m87150e0(-1783148477);
                        c28655q14.m87179t();
                        c28655q15 = c28655q14;
                    }
                    List<C1048y> listM2941F3 = dVar.getViewState().m2941F();
                    if (i18 == 4) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R13 = c28655q15.m87133R();
                    C28676v0 c28676v6 = c28676v2;
                    if (z44) {
                        abstractC4813a0 = viewState;
                        interfaceC28601c10 = interfaceC28601c9;
                        objM87133R13 = new e(interfaceC28601c6, abstractC4813a0, interfaceC28601c10, null);
                        c28655q15.m87172p0(objM87133R13);
                    } else {
                        abstractC4813a0 = viewState;
                        interfaceC28601c10 = interfaceC28601c9;
                        objM87133R13 = new e(interfaceC28601c6, abstractC4813a0, interfaceC28601c10, null);
                        c28655q15.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q15, (InterfaceC4351m) objM87133R13, listM2941F3);
                    if (m2886i0(interfaceC28601c19)) {
                        function3 = onViewEvent;
                        c15199y5 = c15199y6;
                        c28655q15.m87150e0(-1782089021);
                        c28655q15.m87179t();
                        c28655q16 = c28655q15;
                    } else {
                        function3 = onViewEvent;
                        c15199y5 = c15199y6;
                        c28655q15.m87150e0(-1782089021);
                        c28655q15.m87179t();
                        c28655q16 = c28655q15;
                    }
                    boolean zM87157i14 = c28655q16.m87157i(interfaceC2994c2) | c28655q16.m87157i(c15199y4) | c28655q16.m87157i(c15199y5);
                    if (z29 == 256) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = zM87157i14 | z45;
                    objM87133R14 = c28655q16.m87133R();
                    if (z46) {
                        C1045v c1045v2 = new C1045v(interfaceC2994c2, c15199y5, function1, interfaceC28601c1, c15199y4, interfaceC28601c19);
                        function2 = function1;
                        c28655q16.m87172p0(c1045v2);
                        objM87133R14 = c1045v2;
                    } else {
                        C1045v c1045v3 = new C1045v(interfaceC2994c2, c15199y5, function1, interfaceC28601c1, c15199y4, interfaceC28601c19);
                        function2 = function1;
                        c28655q16.m87172p0(c1045v3);
                        objM87133R14 = c1045v3;
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R14, false, c28655q16, 0, 1);
                    c28655q16.m87177s();
                    c28655q16.m87179t();
                    c28655q3 = c28655q16;
                }
                objM87133R32 = new C1043t(onNavigationEvent, 1);
                c28655q20.m87172p0(objM87133R32);
                AbstractC6719b.m20143d(null, abstractC6721dM2939D, null, (InterfaceC4339a) objM87133R32, null, null, c28655q20, AbstractC6721d.f25640b << 3, 53);
                f13 = 2;
                f14 = 4;
                f15 = f13 * f14;
                AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(f15, c2314t2));
                if (c1037p0M15198c.getInterTrendNavigationState().m10206b().isEmpty()) {
                    c28655q20.m87150e0(-1839312818);
                    f16 = f14;
                    Modifier modifierM3396r7 = AbstractC1099a.m3396r(c2314t2, f13 * 8, 0.0f, 2);
                    C3470r c3470rM2956l2 = c1037p0M15198c.getInterTrendNavigationState();
                    EnumC28166h0 enumC28166h0M2722c2 = c1037p0M15198c.getMetaData().getGraphKey();
                    objM87133R22 = c28655q20.m87133R();
                    if (objM87133R22 == c28676v1) {
                        objM87133R22 = new C28503p(20);
                        c28655q20.m87172p0(objM87133R22);
                    }
                    p715kotlin.jvm.functions.Function1 function10 = (p715kotlin.jvm.functions.Function1) objM87133R22;
                    if (i28 == 32) {
                        z66 = true;
                    } else {
                        z66 = false;
                    }
                    zM87157i5 = z66 | c28655q20.m87157i(c1037p0M15198c);
                    objM87133R23 = c28655q20.m87133R();
                    if (zM87157i5) {
                        objM87133R23 = new C1021h0(function4, c1037p0M15198c, 2);
                        c28655q20.m87172p0(objM87133R23);
                    } else {
                        objM87133R23 = new C1021h0(function4, c1037p0M15198c, 2);
                        c28655q20.m87172p0(objM87133R23);
                    }
                    AbstractC3468q.m10173h(modifierM3396r7, c3470rM2956l2, null, enumC28166h0M2722c2, function10, (p715kotlin.jvm.functions.Function1) objM87133R23, c28655q20, 24582, 4);
                    AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(6 * f16, c2314t2));
                    c28655q20.m87179t();
                } else {
                    f16 = f14;
                    c28655q20.m87150e0(-1838360467);
                    c28655q20.m87179t();
                }
                Modifier modifierM34108a2 = AbstractC12248d.m34108a(AbstractC30060g.m92116f0(c2314t2, AbstractC30060g.m92099U(0, c28655q20, 1), 14), c1037p0M15198c.getScreenContextMetadata(), 0.0f, false, c28655q20, i29, 6);
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q20, 0);
                iHashCode = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                InterfaceC28653p1 interfaceC28653p1M87116A12 = c28655q20.m87116A();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q20, modifierM34108a2);
                c0213jM545a = C0217k.m545a();
                c28655q20.m87158i0();
                if (c28655q20.m87120E()) {
                    c28655q20.m87163l(c0213jM545a);
                } else {
                    c28655q20.m87178s0();
                }
                c0209iM8291d = AbstractC2875y.m8291d(c28655q20, c23010xM66775a7, c28655q20, interfaceC28653p1M87116A12);
                if (c28655q20.m87120E()) {
                    AbstractC11266d.m30471y(iHashCode, c28655q20, iHashCode, c0209iM8291d);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q20, iHashCode, c0209iM8291d);
                }
                AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N12);
                modifierM2724a = C1015e0.f3803a.m2724a(c2314t2, c1037p0M15198c.getMetaData().getGraphKey());
                if (c1037p0M15198c.getIntegrationsUpsellState() != null) {
                    c28655q20.m87150e0(1840171131);
                    m2859Z(c1037p0M15198c.getIntegrationsUpsellState(), onNavigationEvent, c28655q20, C22160d.f85916g | ((i27 >> 3) & 112));
                    c28655q20.m87179t();
                    function5 = onViewEvent;
                    c2314t = c2314t2;
                    f25 = f16;
                    z29 = i34 == true ? 1 : 0;
                } else {
                    c28655q20.m87150e0(1840660745);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q20, 0);
                    iHashCode2 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                    InterfaceC28653p1 interfaceC28653p1M87116A13 = c28655q20.m87116A();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q20, modifierM2724a);
                    c0213jM545a2 = C0217k.m545a();
                    c28655q20.m87158i0();
                    if (c28655q20.m87120E()) {
                        c28655q20.m87163l(c0213jM545a2);
                    } else {
                        c28655q20.m87178s0();
                    }
                    c0209iM8291d2 = AbstractC2875y.m8291d(c28655q20, c23010xM66775a8, c28655q20, interfaceC28653p1M87116A13);
                    if (c28655q20.m87120E()) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q20, iHashCode2, c0209iM8291d2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q20, iHashCode2, c0209iM8291d2);
                    }
                    AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N13);
                    f17 = 8;
                    f18 = f13 * f17;
                    Modifier modifierM3396r8 = AbstractC1099a.m3396r(c2314t2, f18, 0.0f, 2);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q20, 0);
                    iHashCode3 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                    InterfaceC28653p1 interfaceC28653p1M87116A14 = c28655q20.m87116A();
                    Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q20, modifierM3396r8);
                    c0213jM545a3 = C0217k.m545a();
                    c28655q20.m87158i0();
                    if (c28655q20.m87120E()) {
                        c28655q20.m87163l(c0213jM545a3);
                    } else {
                        c28655q20.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q20, C0217k.m547c(), c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q20, C0217k.m549e(), interfaceC28653p1M87116A14);
                    c0209iM546b = C0217k.m546b();
                    if (c28655q20.m87120E()) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q20, iHashCode3, c0209iM546b);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q20, iHashCode3, c0209iM546b);
                    }
                    AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N14);
                    size = c1037p0M15198c.m2957m().size();
                    if (size != 0) {
                        c28655q20.m87150e0(439580279);
                        c28655q20.m87179t();
                    } else if (size != 1) {
                        c28655q20.m87150e0(439987805);
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(0.5f, c2314t2);
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q20, 0);
                        iHashCode8 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                        InterfaceC28653p1 interfaceC28653p1M87116A15 = c28655q20.m87116A();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q20, modifierM3409f3);
                        c0213jM545a8 = C0217k.m545a();
                        c28655q20.m87158i0();
                        if (c28655q20.m87120E()) {
                            c28655q20.m87163l(c0213jM545a8);
                        } else {
                            c28655q20.m87178s0();
                        }
                        c0209iM8291d5 = AbstractC2875y.m8291d(c28655q20, c23010xM66775a9, c28655q20, interfaceC28653p1M87116A15);
                        if (c28655q20.m87120E()) {
                            AbstractC11266d.m30471y(iHashCode8, c28655q20, iHashCode8, c0209iM8291d5);
                        } else {
                            AbstractC11266d.m30471y(iHashCode8, c28655q20, iHashCode8, c0209iM8291d5);
                        }
                        AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N15);
                        c28655q20.m87150e0(-126496420);
                        while (r0.hasNext()) {
                            C3437e1 c3437e3 = new C3437e1();
                            objM87133R10 = c28655q20.m87133R();
                            if (objM87133R10 == c28676v1) {
                                objM87133R10 = new C28503p(23);
                                c28655q20.m87172p0(objM87133R10);
                            }
                            c3437e3.Compose(c3458l1, (p715kotlin.jvm.functions.Function1) objM87133R10, c28655q20, 48);
                        }
                        c28655q20.m87179t();
                        c28655q20.m87177s();
                        c28655q20.m87179t();
                    } else {
                        c28655q20.m87150e0(439637133);
                        Modifier modifierM3409f4 = AbstractC1102d.m3409f(0.5f, c2314t2);
                        C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q20, 0);
                        iHashCode7 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                        InterfaceC28653p1 interfaceC28653p1M87116A16 = c28655q20.m87116A();
                        Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q20, modifierM3409f4);
                        c0213jM545a7 = C0217k.m545a();
                        c28655q20.m87158i0();
                        if (c28655q20.m87120E()) {
                            c28655q20.m87163l(c0213jM545a7);
                        } else {
                            c28655q20.m87178s0();
                        }
                        c0209iM8291d4 = AbstractC2875y.m8291d(c28655q20, c23010xM66775a10, c28655q20, interfaceC28653p1M87116A16);
                        if (c28655q20.m87120E()) {
                            AbstractC11266d.m30471y(iHashCode7, c28655q20, iHashCode7, c0209iM8291d4);
                        } else {
                            AbstractC11266d.m30471y(iHashCode7, c28655q20, iHashCode7, c0209iM8291d4);
                        }
                        AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N16);
                        C3437e1 c3437e4 = new C3437e1();
                        C3458l1 c3458l3 = c1037p0M15198c.m2957m().get(0);
                        objM87133R9 = c28655q20.m87133R();
                        if (objM87133R9 == c28676v1) {
                            objM87133R9 = new C28503p(22);
                            c28655q20.m87172p0(objM87133R9);
                        }
                        c3437e4.Compose(c3458l3, (p715kotlin.jvm.functions.Function1) objM87133R9, c28655q20, 48);
                        c28655q20.m87177s();
                        c28655q20.m87179t();
                    }
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    Modifier modifierMo3471e2 = new LayoutWeightElement(1.0f, true).mo3471e(new VerticalAlignElement(c2306l));
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9112O, c28655q20, 54);
                    iHashCode4 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                    InterfaceC28653p1 interfaceC28653p1M87116A17 = c28655q20.m87116A();
                    Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q20, modifierMo3471e2);
                    InterfaceC0221l.f734a.getClass();
                    c0213jM545a4 = C0217k.m545a();
                    c28655q20.m87158i0();
                    if (c28655q20.m87120E()) {
                        c28655q20.m87163l(c0213jM545a4);
                    } else {
                        c28655q20.m87178s0();
                    }
                    c0209iM8291d3 = AbstractC2875y.m8291d(c28655q20, c23010xM66775a11, c28655q20, interfaceC28653p1M87116A17);
                    if (c28655q20.m87120E()) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q20, iHashCode4, c0209iM8291d3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q20, iHashCode4, c0209iM8291d3);
                    }
                    AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N17);
                    AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(f15, c2314t2));
                    Modifier modifierM3424u3 = AbstractC1102d.m3424u(42 * f16, c2314t2);
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(c2307m3, false);
                    iHashCode5 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                    InterfaceC28653p1 interfaceC28653p1M87116A18 = c28655q20.m87116A();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q20, modifierM3424u3);
                    c0213jM545a5 = C0217k.m545a();
                    c28655q20.m87158i0();
                    if (c28655q20.m87120E()) {
                        c28655q20.m87163l(c0213jM545a5);
                    } else {
                        c28655q20.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q20, C0217k.m547c(), interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q20, C0217k.m549e(), interfaceC28653p1M87116A18);
                    c0209iM546b2 = C0217k.m546b();
                    if (c28655q20.m87120E()) {
                        AbstractC11266d.m30471y(iHashCode5, c28655q20, iHashCode5, c0209iM546b2);
                    } else {
                        AbstractC11266d.m30471y(iHashCode5, c28655q20, iHashCode5, c0209iM546b2);
                    }
                    AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N18);
                    List<C23465k> listM3065b2 = c1037p0M15198c.getSegmentControlState().m3065b();
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(listM3065b2, 10));
                    it = listM3065b2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C33223u0((String) ((C23465k) it.next()).f92937w, null, 2, false ? 1 : 0));
                    }
                    int iM3064a2 = c1037p0M15198c.getSegmentControlState().getInitialSelected();
                    boolean zM87157i15 = c28655q20.m87157i(c1037p0M15198c);
                    if (i28 == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i15 | z15;
                    objM87133R = c28655q20.m87133R();
                    if (z16) {
                        function5 = onViewEvent;
                        objM87133R = new C1021h0(c1037p0M15198c, function5, 3);
                        c28655q20.m87172p0(objM87133R);
                    } else {
                        function5 = onViewEvent;
                        objM87133R = new C1021h0(c1037p0M15198c, function5, 3);
                        c28655q20.m87172p0(objM87133R);
                    }
                    AbstractC33231x0.m105420e(arrayList, iM3064a2, null, null, (p715kotlin.jvm.functions.Function1) objM87133R, c28655q20, 0, 12);
                    c28655q20.m87177s();
                    f19 = f16 * f16;
                    AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(f19, c2314t2));
                    Modifier modifierM3424u4 = AbstractC1102d.m3424u(52 * f16, c2314t2);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m3, false);
                    iHashCode6 = Long.hashCode(AbstractC28683x.m87267u(c28655q20));
                    InterfaceC28653p1 interfaceC28653p1M87116A19 = c28655q20.m87116A();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q20, modifierM3424u4);
                    InterfaceC0221l.f734a.getClass();
                    c0213jM545a6 = C0217k.m545a();
                    c28655q20.m87158i0();
                    if (c28655q20.m87120E()) {
                        c28655q20.m87163l(c0213jM545a6);
                    } else {
                        c28655q20.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q20, C0217k.m547c(), interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q20, C0217k.m549e(), interfaceC28653p1M87116A19);
                    c0209iM546b3 = C0217k.m546b();
                    if (c28655q20.m87120E()) {
                        AbstractC11266d.m30471y(iHashCode6, c28655q20, iHashCode6, c0209iM546b3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode6, c28655q20, iHashCode6, c0209iM546b3);
                    }
                    AbstractC28683x.m87239G(c28655q20, C0217k.m548d(), modifierM118962N19);
                    C17858a c17858a2 = new C17858a();
                    C17863f c17863fM2948d2 = c1037p0M15198c.getDateSelectorState();
                    boolean zM87157i16 = c28655q20.m87157i(c1037p0M15198c);
                    if (i28 == 32) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = zM87157i16 | z17;
                    objM87133R2 = c28655q20.m87133R();
                    if (z18) {
                        objM87133R2 = new C1021h0(c1037p0M15198c, function5, 4);
                        c28655q20.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C1021h0(c1037p0M15198c, function5, 4);
                        c28655q20.m87172p0(objM87133R2);
                    }
                    c17858a2.Compose(c2314t2, c17863fM2948d2, (p715kotlin.jvm.functions.Function1) objM87133R2, c28655q20, (C17863f.f69516k << 3) | 6 | (C17858a.f69479a << 9));
                    c2314t = c2314t2;
                    if (c1037p0M15198c.m2957m().size() > 1) {
                        c28655q20.m87150e0(-2011835814);
                        AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(3 * f16, c2314t));
                        c28655q20.m87179t();
                    } else {
                        c28655q20.m87150e0(-2011701274);
                        c28655q20.m87179t();
                    }
                    c28655q20.m87177s();
                    c28655q20.m87177s();
                    c28655q20.m87177s();
                    if (c1037p0M15198c.getWhoopCoachVow() != null) {
                        c28655q20.m87150e0(1692028414);
                        C32048d c32048dM2944I2 = c1037p0M15198c.getWhoopCoachVow();
                        C13762f c13762f7 = new C13762f(11);
                        z68 = i34 == true ? 1 : 0;
                        if (z27 == 256) {
                            z27 = z68;
                            z28 = true;
                        } else {
                            z27 = z68;
                            z28 = false;
                        }
                        objM87133R8 = c28655q20.m87133R();
                        if (z28) {
                            objM87133R8 = new C1016f(onNavigationEvent, 3);
                            c28655q20.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C1016f(onNavigationEvent, 3);
                            c28655q20.m87172p0(objM87133R8);
                        }
                        AbstractC25303l.m74291r(c32048dM2944I2, null, c13762f7, (p715kotlin.jvm.functions.Function1) objM87133R8, c28655q20, C32048d.f132920h, 2);
                        c28655q20.m87179t();
                        f24 = f18;
                        z24 = z27;
                    } else {
                        z67 = i34 == true ? 1 : 0;
                        if (c1037p0M15198c.getVow() != null) {
                            z19 = z67;
                            AbstractC33745d.m106667z(c28655q20, 1692718102, c2314t, f19, c28655q20);
                            f24 = f18;
                            Modifier modifierM3396r9 = AbstractC1099a.m3396r(c2314t, f24, 0.0f, 2);
                            String strM21274h4 = AbstractC8693b.m21274h(c1037p0M15198c.getVow(), c28655q20, TextResource.$stable);
                            C38072d c38072d4 = C38072d.f163053a;
                            int i310 = C38072d.f163054b;
                            AbstractC30795n.m94707h(strM21274h4, modifierM3396r9, c38072d4.m121949b(c28655q20, i310).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q20, i310).getB1(), null, c28655q20, 48, C2886a.f11498d << 18, 196600);
                            c28655q20.m87179t();
                            z24 = z19;
                        } else {
                            z19 = z67;
                            f24 = f18;
                            c28655q20.m87150e0(1693216861);
                            c28655q20.m87179t();
                            z24 = z19;
                        }
                    }
                    c28655q20.m87177s();
                    listM2959o = c1037p0M15198c.m2959o();
                    if (listM2959o == null) {
                        c28655q20.m87150e0(1846652920);
                        c28655q20.m87179t();
                        f25 = f16;
                    } else {
                        c28655q20.m87150e0(1846652921);
                        if (listM2959o.isEmpty()) {
                            f25 = f16;
                            AbstractC11266d.m30469w(6, f25, c2314t, c28655q20);
                            List<C1036p> list2 = listM2959o;
                            arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                            it3 = list2.iterator();
                            while (it3.hasNext()) {
                                arrayList2.add(m2905o1((C1036p) it3.next()));
                            }
                            AbstractC26189c.m77740e(arrayList2, null, 0L, c28655q20, 0, 6);
                        } else {
                            f25 = f16;
                        }
                        c28655q20.m87179t();
                    }
                    if (c1037p0M15198c.getGraphState() != null) {
                        c28655q20.m87150e0(1847148673);
                        AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(f17 * f25, c2314t));
                        c28655q20.m87144b0(59588852, c1037p0M15198c.getMetaData());
                        Modifier modifierM3384f2 = AbstractC1099a.m3384f(AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 1 * f17, 0.0f, 11), false, 1.3333334f);
                        C21395c c21395cM2952h2 = c1037p0M15198c.getGraphState();
                        if (i28 == 32) {
                            z26 = true;
                        } else {
                            z26 = false;
                        }
                        zM87157i = c28655q20.m87157i(c1037p0M15198c) | z26 | c28655q20.m87155h(zIsFeatureEnabled);
                        objM87133R7 = c28655q20.m87133R();
                        if (zM87157i) {
                            objM87133R7 = new C1023i0(function5, c1037p0M15198c, zIsFeatureEnabled, 0);
                            c28655q20.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C1023i0(function5, c1037p0M15198c, zIsFeatureEnabled, 0);
                            c28655q20.m87172p0(objM87133R7);
                        }
                        AbstractC2756k.m7799p(modifierM3384f2, c21395cM2952h2, null, null, false, null, (p715kotlin.jvm.functions.Function1) objM87133R7, c28655q20, (C21395c.f81985e << 3) | 6, 60);
                        c28655q20.m87173q(false);
                        c28655q20.m87179t();
                    } else {
                        c28655q20.m87150e0(1849300228);
                        m2855X(c1037p0M15198c, c28655q20, 0);
                        c28655q20.m87179t();
                    }
                    listM2954j = c1037p0M15198c.m2954j();
                    if (listM2954j != null) {
                        c28655q20.m87150e0(1850319415);
                        c28655q20.m87179t();
                    } else {
                        c28655q20.m87150e0(1850319415);
                        c28655q20.m87179t();
                    }
                    c3438fM2947c = c1037p0M15198c.getCardioFitnessLevel();
                    if (c3438fM2947c == null) {
                        c28655q20.m87150e0(1850392047);
                        c28655q20.m87179t();
                    } else {
                        c28655q20.m87150e0(1850392048);
                        C3432d c3432d2 = new C3432d();
                        Modifier modifierM3396r10 = AbstractC1099a.m3396r(c2314t, f24, 0.0f, 2);
                        objM87133R3 = c28655q20.m87133R();
                        if (objM87133R3 == c28676v1) {
                            interfaceC28601c4 = interfaceC28601c17;
                            objM87133R3 = new C1010c(7, interfaceC28601c4);
                            c28655q20.m87172p0(objM87133R3);
                        } else {
                            interfaceC28601c4 = interfaceC28601c17;
                        }
                        c3432d2.Compose(modifierM3396r10, c3438fM2947c, (p715kotlin.jvm.functions.Function1) objM87133R3, c28655q20, 390);
                        if (m2892k0(interfaceC28601c4)) {
                            c28655q20.m87150e0(-491383044);
                            c3448i0M10037e = c3438fM2947c.getModal();
                            if (c3448i0M10037e == null) {
                                c28655q20.m87150e0(1946994821);
                                c28655q20.m87179t();
                            } else {
                                c28655q20.m87150e0(1946994822);
                                objM87133R4 = c28655q20.m87133R();
                                if (objM87133R4 == c28676v1) {
                                    objM87133R4 = new C1010c(8, interfaceC28601c4);
                                    c28655q20.m87172p0(objM87133R4);
                                }
                                m2875e1(c3448i0M10037e, onAnalyticsEvent, (p715kotlin.jvm.functions.Function1) objM87133R4, c28655q20, TextResource.$stable | 384 | ((i27 >> 6) & 112));
                                c28655q20.m87179t();
                            }
                            c28655q20.m87179t();
                        } else {
                            c28655q20.m87150e0(1947141948);
                            c28655q20.m87179t();
                        }
                        c28655q20.m87179t();
                    }
                    c1034oM2958n = c1037p0M15198c.getLastUpdatedViewState();
                    if (c1034oM2958n == null) {
                        c28655q20.m87150e0(1850982163);
                        c28655q20.m87179t();
                    } else {
                        c28655q20.m87150e0(1850982164);
                        m2874e0(c1034oM2958n, 0.0f, c28655q20, TextResource.$stable, 2);
                        c28655q20.m87179t();
                    }
                    if (c1037p0M15198c.getAdditionalInfoText() != null) {
                        c28655q20.m87150e0(1851155888);
                        C36613b c36613bM2945a2 = c1037p0M15198c.getAdditionalInfoText();
                        if (z24 == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        objM87133R6 = c28655q20.m87133R();
                        if (z25) {
                            objM87133R6 = new C1016f(onNavigationEvent, 5);
                            c28655q20.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C1016f(onNavigationEvent, 5);
                            c28655q20.m87172p0(objM87133R6);
                        }
                        AbstractC36612a.m117607d(c36613bM2945a2, (p715kotlin.jvm.functions.Function1) objM87133R6, c28655q20, C36613b.f156835d);
                        c28655q20.m87179t();
                    } else if (c1037p0M15198c.getInfoCalloutDisplay() != null) {
                        c28655q20.m87150e0(1851547852);
                        AbstractC3431c1.m9900b(c1037p0M15198c.getInfoCalloutDisplay(), c28655q20, TextResource.$stable);
                        c28655q20.m87179t();
                    } else {
                        c28655q20.m87150e0(1851650679);
                        c28655q20.m87179t();
                    }
                    c3808hM2946b = c1037p0M15198c.getBreakdownBarState();
                    if (c3808hM2946b == null) {
                        c28655q20.m87150e0(1851712399);
                        c28655q20.m87179t();
                    } else {
                        c28655q20.m87150e0(1851712400);
                        float f39 = 3;
                        AbstractC22953f.m66715b(c28655q20, AbstractC1102d.m3411h(f39 * f25, c2314t));
                        C3802b c3802b2 = new C3802b();
                        Modifier modifierM3396r11 = AbstractC1099a.m3396r(c2314t, f39 * f17, 0.0f, 2);
                        objM87133R5 = c28655q20.m87133R();
                        if (objM87133R5 == c28676v1) {
                            objM87133R5 = new C28503p(25);
                            c28655q20.m87172p0(objM87133R5);
                        }
                        c3802b2.Compose(modifierM3396r11, c3808hM2946b, (p715kotlin.jvm.functions.Function1) objM87133R5, c28655q20, (C3808h.f15610f << 3) | 390 | (C3802b.f15555a << 9));
                        c28655q20.m87179t();
                    }
                    c28655q20.m87179t();
                    z29 = z24;
                }
                c28655q20.m87150e0(59743121);
                it4 = c1037p0M15198c.m2940E().iterator();
                while (it4.hasNext()) {
                    c39282o = (C39282o) it4.next();
                    Iterator it8 = it4;
                    float f310 = f15;
                    Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1099a.m3394p(8 * f13, c2314t), C38072d.f163053a.m121949b(c28655q20, C38072d.f163054b).getWhite10(), C22411w.f87680a.m64535a().m64090c());
                    boolean zM87157i17 = c28655q20.m87157i(c39282o);
                    if (z29 == 256) {
                        z64 = true;
                    } else {
                        z64 = false;
                    }
                    z65 = zM87157i17 | z64;
                    objM87133R21 = c28655q20.m87133R();
                    if (z65) {
                        objM87133R21 = new C1033n0(c39282o, onNavigationEvent, 0);
                        c28655q20.m87172p0(objM87133R21);
                    } else {
                        objM87133R21 = new C1033n0(c39282o, onNavigationEvent, 0);
                        c28655q20.m87172p0(objM87133R21);
                    }
                    AbstractC39281n.m125207c(modifierM3358c2, c39282o, (InterfaceC4339a) objM87133R21, c28655q20, C39282o.f168987q << 3, 0);
                    it4 = it8;
                    f15 = f310;
                }
                f26 = f15;
                c28655q20.m87179t();
                c28655q20.m87150e0(59776282);
                while (r0.hasNext()) {
                    C25307p c25307p2 = f3931a;
                    C13762f c13762f8 = new C13762f(12);
                    if (z29 == 256) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    if ((i27 & 1879048192) == 536870912) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    z59 = z57 | z58;
                    objM87133R20 = c28655q20.m87133R();
                    if (z59) {
                        z60 = z69;
                        objM87133R20 = new C1017f0(onNavigationEvent, z60, 0);
                        c28655q20.m87172p0(objM87133R20);
                    } else {
                        z60 = z69;
                        objM87133R20 = new C1017f0(onNavigationEvent, z60, 0);
                        c28655q20.m87172p0(objM87133R20);
                    }
                    AbstractC25303l.m74291r(interfaceC25312u, c25307p2, c13762f8, (p715kotlin.jvm.functions.Function1) objM87133R20, c28655q20, C25307p.f99300b << 3, 0);
                    z69 = z60;
                }
                c28655q4 = c28655q20;
                z34 = z69;
                c28655q4.m87179t();
                listM2941F = c1037p0M15198c.m2941F();
                if (listM2941F == null) {
                    c28655q4.m87150e0(1853989876);
                    c28655q4.m87179t();
                    c28655q8 = c28655q4;
                    f27 = f25;
                    function6 = function5;
                    z69 = z34;
                    f28 = f26;
                    interfaceC28601c5 = interfaceC28601c14;
                    interfaceC2994c0 = interfaceC2994c4;
                    interfaceC28601c6 = interfaceC28601c18;
                    c1037p0 = c1037p0M15198c;
                    function7 = onNavigationEvent;
                    c2307m = c2307m3;
                    i15 = 8;
                    i16 = i28;
                } else {
                    c28655q4.m87150e0(1853989877);
                    c28655q4.m87150e0(59808362);
                    it5 = listM2941F.iterator();
                    c28655q5 = c28655q4;
                    while (it5.hasNext()) {
                        c1048y = (C1048y) it5.next();
                        C39282o c39282oM3067b2 = c1048y.getMenuItem();
                        C13762f c13762f9 = new C13762f(7);
                        Iterator it9 = it5;
                        boolean zM87157i18 = c28655q5.m87157i(c1048y) | c28655q5.m87157i(interfaceC2994c4) | c28655q5.m87157i(c15199y6);
                        if (i28 == 32) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        boolean z710 = z35 | zM87157i18;
                        if (z29 == 256) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        z37 = z710 | z36;
                        Object objM87133R39 = c28655q5.m87133R();
                        if (z37) {
                            C28655q c28655q210 = c28655q5;
                            interfaceC28601c7 = interfaceC28601c14;
                            interfaceC2994c1 = interfaceC2994c4;
                            interfaceC28601c8 = interfaceC28601c18;
                            i17 = 8;
                            c1019g0 = new C1019g0(c1048y, interfaceC2994c1, interfaceC28601c8, interfaceC28601c7, interfaceC28601c19, c15199y6, function5, onNavigationEvent, 0);
                            c28655q210.m87172p0(c1019g0);
                            c28655q6 = c28655q210;
                        } else {
                            C28655q c28655q211 = c28655q5;
                            interfaceC28601c7 = interfaceC28601c14;
                            interfaceC2994c1 = interfaceC2994c4;
                            interfaceC28601c8 = interfaceC28601c18;
                            i17 = 8;
                            c1019g0 = new C1019g0(c1048y, interfaceC2994c1, interfaceC28601c8, interfaceC28601c7, interfaceC28601c19, c15199y6, function5, onNavigationEvent, 0);
                            c28655q211.m87172p0(c1019g0);
                            c28655q6 = c28655q211;
                        }
                        InterfaceC28601c1 interfaceC28601c24 = interfaceC28601c8;
                        c28655q7 = c28655q6;
                        InterfaceC2994c0 interfaceC2994c9 = interfaceC2994c1;
                        InterfaceC28601c1 interfaceC28601c25 = interfaceC28601c7;
                        AbstractC25303l.m74291r(c39282oM3067b2, null, c13762f9, (p715kotlin.jvm.functions.Function1) c1019g0, c28655q7, C39282o.f168987q, 2);
                        textResourceM3068c = c1048y.getMenuItemDetailText();
                        if (textResourceM3068c == null) {
                            c28655q7.m87150e0(238254520);
                            c28655q7.m87179t();
                        } else {
                            c28655q7.m87150e0(238254521);
                            String strM21274h5 = AbstractC8693b.m21274h(textResourceM3068c, c28655q7, TextResource.$stable);
                            float f311 = i17;
                            Modifier modifierM3395q3 = AbstractC1099a.m3395q(c2314t, f311 * f13, ((float) 0.5d) * f311);
                            C38072d c38072d5 = C38072d.f163053a;
                            int i311 = C38072d.f163054b;
                            AbstractC30795n.m94707h(strM21274h5, modifierM3395q3, c38072d5.m121949b(c28655q7, i311).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d5.m121952e(c28655q7, i311).getB2(), null, c28655q7, 0, C2886a.f11498d << 18, 196600);
                            c28655q7.m87179t();
                        }
                        function5 = function5;
                        onNavigationEvent = onNavigationEvent;
                        i28 = i28;
                        c2307m3 = c2307m3;
                        c1037p0M15198c = c1037p0M15198c;
                        z34 = z34;
                        f25 = f25;
                        f26 = f26;
                        interfaceC28601c18 = interfaceC28601c24;
                        interfaceC2994c4 = interfaceC2994c9;
                        interfaceC28601c14 = interfaceC28601c25;
                        c28655q5 = c28655q7;
                        it5 = it9;
                    }
                    C28655q c28655q212 = c28655q5;
                    f27 = f25;
                    function6 = function5;
                    z69 = z34;
                    f28 = f26;
                    interfaceC28601c5 = interfaceC28601c14;
                    interfaceC2994c0 = interfaceC2994c4;
                    interfaceC28601c6 = interfaceC28601c18;
                    c1037p0 = c1037p0M15198c;
                    function7 = onNavigationEvent;
                    c2307m = c2307m3;
                    i15 = 8;
                    i16 = i28;
                    c28655q212.m87179t();
                    c28655q212.m87179t();
                    c28655q8 = c28655q212;
                }
                if (c1037p0.getManualMeasurementItem() != null) {
                    c28655q8.m87150e0(1857129185);
                    C39282o c39282oM2960p2 = c1037p0.getManualMeasurementItem();
                    C13762f c13762f10 = new C13762f(8);
                    objM87133R19 = c28655q8.m87133R();
                    if (objM87133R19 == c28676v1) {
                        interfaceC28601c12 = interfaceC28601c1;
                        objM87133R19 = new C1010c(6, interfaceC28601c12);
                        c28655q8.m87172p0(objM87133R19);
                    } else {
                        interfaceC28601c12 = interfaceC28601c1;
                    }
                    C28655q c28655q213 = c28655q8;
                    interfaceC28601c1 = interfaceC28601c12;
                    AbstractC25303l.m74291r(c39282oM2960p2, null, c13762f10, (p715kotlin.jvm.functions.Function1) objM87133R19, c28655q213, C39282o.f168987q | 3072, 2);
                    c28655q18 = c28655q213;
                    textResourceM2962r = c1037p0.getManualMeasurementTextDisplay();
                    if (textResourceM2962r == null) {
                        c28655q18.m87150e0(1857519505);
                        c28655q18.m87179t();
                    } else {
                        c28655q18.m87150e0(1857519506);
                        String strM21274h6 = AbstractC8693b.m21274h(textResourceM2962r, c28655q18, TextResource.$stable);
                        float f312 = i15;
                        Modifier modifierM3395q4 = AbstractC1099a.m3395q(c2314t, f13 * f312, 1 * f312);
                        C38072d c38072d6 = C38072d.f163053a;
                        int i312 = C38072d.f163054b;
                        AbstractC30795n.m94707h(strM21274h6, modifierM3395q4, c38072d6.m121949b(c28655q18, i312).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d6.m121952e(c28655q18, i312).getB2(), null, c28655q18, 48, C2886a.f11498d << 18, 196600);
                        c28655q18.m87179t();
                    }
                    c28655q18.m87179t();
                    c28655q9 = c28655q18;
                } else {
                    c28655q8.m87150e0(1857949879);
                    c28655q8.m87179t();
                    c28655q9 = c28655q8;
                }
                if (c1037p0.getSeeAllDataItem() != null) {
                    c28655q9.m87150e0(1858031409);
                    C39282o c39282oM2969y2 = c1037p0.getSeeAllDataItem();
                    C13762f c13762f11 = new C13762f(9);
                    if (z29 == 256) {
                        z55 = true;
                    } else {
                        z55 = false;
                    }
                    if (i16 == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    boolean z711 = z55 | z56;
                    c1037p4 = c1037p0;
                    zM87157i4 = z711 | c28655q9.m87157i(c1037p4);
                    objM87133R18 = c28655q9.m87133R();
                    if (zM87157i4) {
                        objM87133R18 = new C29656q(function7, (Object) function6, (Object) c1037p4, 2);
                        c28655q9.m87172p0(objM87133R18);
                    } else {
                        objM87133R18 = new C29656q(function7, (Object) function6, (Object) c1037p4, 2);
                        c28655q9.m87172p0(objM87133R18);
                    }
                    C28655q c28655q214 = c28655q9;
                    c1037p0 = c1037p4;
                    AbstractC25303l.m74291r(c39282oM2969y2, null, c13762f11, (p715kotlin.jvm.functions.Function1) objM87133R18, c28655q214, C39282o.f168987q, 2);
                    C28655q c28655q215 = c28655q214;
                    c28655q215.m87179t();
                    c28655q10 = c28655q215;
                } else {
                    c28655q9.m87150e0(1858713719);
                    c28655q9.m87179t();
                    c28655q10 = c28655q9;
                }
                if (c1037p0.getUpsellCard() != null) {
                    c28655q10.m87150e0(1858784275);
                    Modifier modifierM3396r12 = AbstractC1099a.m3396r(c2314t, i15 * f13, 0.0f, 2);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(c2307m, false);
                    iHashCode9 = Long.hashCode(AbstractC28683x.m87267u(c28655q10));
                    InterfaceC28653p1 interfaceC28653p1M87116A110 = c28655q10.m87116A();
                    Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q10, modifierM3396r12);
                    InterfaceC0221l.f734a.getClass();
                    c0213jM545a9 = C0217k.m545a();
                    c28655q10.m87158i0();
                    if (c28655q10.m87120E()) {
                        c28655q10.m87163l(c0213jM545a9);
                    } else {
                        c28655q10.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q10, C0217k.m547c(), interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q10, C0217k.m549e(), interfaceC28653p1M87116A110);
                    c0209iM546b4 = C0217k.m546b();
                    if (c28655q10.m87120E()) {
                        AbstractC11266d.m30471y(iHashCode9, c28655q10, iHashCode9, c0209iM546b4);
                    } else {
                        AbstractC11266d.m30471y(iHashCode9, c28655q10, iHashCode9, c0209iM546b4);
                    }
                    AbstractC28683x.m87239G(c28655q10, C0217k.m548d(), modifierM118962N110);
                    C16550q c16550qM2942G2 = c1037p0.getUpsellCard();
                    c1037p3 = c1037p0;
                    boolean zM87157i19 = c28655q10.m87157i(c1037p3);
                    if (z29 == 256) {
                        z52 = true;
                    } else {
                        z52 = false;
                    }
                    z54 = zM87157i19 | z52;
                    objM87133R17 = c28655q10.m87133R();
                    if (z54) {
                        objM87133R17 = new C1021h0(c1037p3, function7, 0);
                        c28655q10.m87172p0(objM87133R17);
                    } else {
                        objM87133R17 = new C1021h0(c1037p3, function7, 0);
                        c28655q10.m87172p0(objM87133R17);
                    }
                    C28655q c28655q216 = c28655q10;
                    c1037p1 = c1037p3;
                    AbstractC16549p.m46792z(null, c16550qM2942G2, false, (p715kotlin.jvm.functions.Function1) objM87133R17, c28655q216, C16550q.f63696v << 3, 5);
                    C28655q c28655q217 = c28655q216;
                    c28655q217.m87177s();
                    c28655q217.m87179t();
                    c28655q11 = c28655q217;
                } else {
                    c1037p1 = c1037p0;
                    c28655q10.m87150e0(1859280151);
                    c28655q10.m87179t();
                    c28655q11 = c28655q10;
                }
                if (c1037p1.getSegmentalAnalysisViewState() != null) {
                    c28655q11.m87150e0(1859362611);
                    C3471r0 c3471r0M2936A2 = c1037p1.getSegmentalAnalysisViewState();
                    if ((i27 & 458752) == 131072) {
                        z49 = true;
                    } else {
                        z49 = false;
                    }
                    c1037p2 = c1037p1;
                    zM87157i3 = z49 | c28655q11.m87157i(c1037p2);
                    objM87133R16 = c28655q11.m87133R();
                    if (zM87157i3) {
                        objM87133R16 = new C1021h0(onBodyCompInfoClicked, c1037p2, 1);
                        c28655q11.m87172p0(objM87133R16);
                    } else {
                        objM87133R16 = new C1021h0(onBodyCompInfoClicked, c1037p2, 1);
                        c28655q11.m87172p0(objM87133R16);
                    }
                    AbstractC3469q0.m10196d(c3471r0M2936A2, (p715kotlin.jvm.functions.Function1) objM87133R16, c28655q11, 0);
                    c28655q11.m87179t();
                } else {
                    c1037p2 = c1037p1;
                    c28655q11.m87150e0(1859704727);
                    c28655q11.m87179t();
                }
                c16934fM2950f = c1037p2.getEducationCarouselModel();
                if (c16934fM2950f == null) {
                    c28655q11.m87150e0(1859775282);
                    c28655q11.m87179t();
                    f29 = f28;
                    c23454a0 = null;
                } else {
                    float f313 = f28;
                    AbstractC33745d.m106667z(c28655q11, 1859775283, c2314t, f313, c28655q11);
                    if ((i27 & 57344) == 16384) {
                        z38 = true;
                    } else {
                        z38 = false;
                    }
                    zM87157i2 = z38 | c28655q11.m87157i(c1037p2);
                    objM87133R11 = c28655q11.m87133R();
                    if (zM87157i2) {
                        objM87133R11 = new C0167g(7, onCarouselItemClicked, c1037p2);
                        c28655q11.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C0167g(7, onCarouselItemClicked, c1037p2);
                        c28655q11.m87172p0(objM87133R11);
                    }
                    C28655q c28655q218 = c28655q11;
                    f29 = f313;
                    AbstractC25303l.m74291r(c16934fM2950f, null, null, (p715kotlin.jvm.functions.Function1) objM87133R11, c28655q218, C16934f.f64958n, 6);
                    C28655q c28655q219 = c28655q218;
                    AbstractC22953f.m66715b(c28655q219, AbstractC1102d.m3411h(1 * f27, c2314t));
                    c28655q219.m87179t();
                    c23454a0 = C23454a0.f92919a;
                    c28655q12 = c28655q219;
                }
                if (c23454a0 == null) {
                    c28655q12 = c28655q11;
                    c28655q12.m87150e0(1860247599);
                    AbstractC22953f.m66715b(c28655q12, AbstractC1102d.m3411h(f27 * f27, c2314t));
                    c28655q12.m87179t();
                } else {
                    c28655q12 = c28655q11;
                    c28655q12.m87150e0(59991929);
                    c28655q12.m87179t();
                }
                listM2965u = c1037p2.m2965u();
                if (listM2965u != null) {
                    z48 = true;
                    if (!listM2965u.isEmpty()) {
                        c28655q12.m87150e0(1860444325);
                        c28655q17 = c28655q12;
                        while (r16.hasNext()) {
                            C30886d c30886d3 = new C30886d();
                            InterfaceC28601c1 interfaceC28601c26 = interfaceC28601c5;
                            Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1099a.m3396r(c2314t, f13 * 8, 0.0f, 2), "metricEducation");
                            objM87133R15 = c28655q17.m87133R();
                            if (objM87133R15 == c28676v1) {
                                objM87133R15 = new C28503p(19);
                                c28655q17.m87172p0(objM87133R15);
                            }
                            C28655q c28655q38 = c28655q17;
                            c30886d3.Compose(modifierM3599a3, c30885c, (p715kotlin.jvm.functions.Function1) objM87133R15, c28655q38, (C30885c.f127341h << 3) | 390 | (C30886d.f127349a << 9));
                            C28655q c28655q39 = c28655q38;
                            AbstractC22953f.m66715b(c28655q39, AbstractC1102d.m3411h(f29, c2314t));
                            AbstractC22953f.m66715b(c28655q39, AbstractC22953f.m66722k(c2314t));
                            interfaceC28601c5 = interfaceC28601c26;
                            z48 = true;
                            c28655q17 = c28655q39;
                        }
                        interfaceC28601c9 = interfaceC28601c5;
                        z39 = z48;
                        c28655q17.m87179t();
                        c28655q14 = c28655q17;
                    } else {
                        z39 = true;
                    }
                    c28655q14.m87177s();
                    c28655q14.m87177s();
                    if (m2883h0(interfaceC28601c1)) {
                        interfaceC28601c9 = interfaceC28601c9;
                        interfaceC2994c2 = interfaceC2994c0;
                        c28676v2 = c28676v1;
                        i18 = r37;
                        c15199y4 = c15199y3M3460c;
                        c28655q14.m87150e0(-1783148477);
                        c28655q14.m87179t();
                        c28655q15 = c28655q14;
                    } else {
                        interfaceC28601c9 = interfaceC28601c9;
                        interfaceC2994c2 = interfaceC2994c0;
                        c28676v2 = c28676v1;
                        i18 = r37;
                        c15199y4 = c15199y3M3460c;
                        c28655q14.m87150e0(-1783148477);
                        c28655q14.m87179t();
                        c28655q15 = c28655q14;
                    }
                    List<C1048y> listM2941F4 = dVar.getViewState().m2941F();
                    if (i18 == 4) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R13 = c28655q15.m87133R();
                    C28676v0 c28676v7 = c28676v2;
                    if (z44) {
                        abstractC4813a0 = viewState;
                        interfaceC28601c10 = interfaceC28601c9;
                        objM87133R13 = new e(interfaceC28601c6, abstractC4813a0, interfaceC28601c10, null);
                        c28655q15.m87172p0(objM87133R13);
                    } else {
                        abstractC4813a0 = viewState;
                        interfaceC28601c10 = interfaceC28601c9;
                        objM87133R13 = new e(interfaceC28601c6, abstractC4813a0, interfaceC28601c10, null);
                        c28655q15.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q15, (InterfaceC4351m) objM87133R13, listM2941F4);
                    if (m2886i0(interfaceC28601c19)) {
                        function3 = onViewEvent;
                        c15199y5 = c15199y6;
                        c28655q15.m87150e0(-1782089021);
                        c28655q15.m87179t();
                        c28655q16 = c28655q15;
                    } else {
                        function3 = onViewEvent;
                        c15199y5 = c15199y6;
                        c28655q15.m87150e0(-1782089021);
                        c28655q15.m87179t();
                        c28655q16 = c28655q15;
                    }
                    boolean zM87157i110 = c28655q16.m87157i(interfaceC2994c2) | c28655q16.m87157i(c15199y4) | c28655q16.m87157i(c15199y5);
                    if (z29 == 256) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    z46 = zM87157i110 | z45;
                    objM87133R14 = c28655q16.m87133R();
                    if (z46) {
                        C1045v c1045v4 = new C1045v(interfaceC2994c2, c15199y5, function1, interfaceC28601c1, c15199y4, interfaceC28601c19);
                        function2 = function1;
                        c28655q16.m87172p0(c1045v4);
                        objM87133R14 = c1045v4;
                    } else {
                        C1045v c1045v5 = new C1045v(interfaceC2994c2, c15199y5, function1, interfaceC28601c1, c15199y4, interfaceC28601c19);
                        function2 = function1;
                        c28655q16.m87172p0(c1045v5);
                        objM87133R14 = c1045v5;
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R14, false, c28655q16, 0, 1);
                    c28655q16.m87177s();
                    c28655q16.m87179t();
                    c28655q3 = c28655q16;
                } else {
                    z39 = true;
                }
                interfaceC28601c9 = interfaceC28601c5;
                c28655q12.m87150e0(1861127441);
                c30885cM2966v = c1037p2.getMetricEducationState();
                if (c30885cM2966v == null) {
                    c28655q12.m87150e0(1861127440);
                    c28655q12.m87179t();
                    c28655q13 = c28655q12;
                } else {
                    c28655q12.m87150e0(1861127441);
                    C30886d c30886d4 = new C30886d();
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1099a.m3396r(c2314t, 8 * f13, 0.0f, 2), "metricEducation");
                    objM87133R12 = c28655q12.m87133R();
                    if (objM87133R12 == c28676v1) {
                        objM87133R12 = new C28503p(21);
                        c28655q12.m87172p0(objM87133R12);
                    }
                    C28655q c28655q310 = c28655q12;
                    c30886d4.Compose(modifierM3599a4, c30885cM2966v, (p715kotlin.jvm.functions.Function1) objM87133R12, c28655q310, (C30885c.f127341h << 3) | 390 | (C30886d.f127349a << 9));
                    C28655q c28655q311 = c28655q310;
                    AbstractC22953f.m66715b(c28655q311, AbstractC1102d.m3411h(f29, c2314t));
                    AbstractC22953f.m66715b(c28655q311, AbstractC22953f.m66722k(c2314t));
                    c28655q311.m87179t();
                    c28655q13 = c28655q311;
                }
                c28655q13.m87179t();
                c28655q14 = c28655q13;
                c28655q14.m87177s();
                c28655q14.m87177s();
                if (m2883h0(interfaceC28601c1)) {
                    interfaceC28601c9 = interfaceC28601c9;
                    interfaceC2994c2 = interfaceC2994c0;
                    c28676v2 = c28676v1;
                    i18 = r37;
                    c15199y4 = c15199y3M3460c;
                    c28655q14.m87150e0(-1783148477);
                    c28655q14.m87179t();
                    c28655q15 = c28655q14;
                } else {
                    interfaceC28601c9 = interfaceC28601c9;
                    interfaceC2994c2 = interfaceC2994c0;
                    c28676v2 = c28676v1;
                    i18 = r37;
                    c15199y4 = c15199y3M3460c;
                    c28655q14.m87150e0(-1783148477);
                    c28655q14.m87179t();
                    c28655q15 = c28655q14;
                }
                List<C1048y> listM2941F5 = dVar.getViewState().m2941F();
                if (i18 == 4) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                objM87133R13 = c28655q15.m87133R();
                C28676v0 c28676v8 = c28676v2;
                if (z44) {
                    abstractC4813a0 = viewState;
                    interfaceC28601c10 = interfaceC28601c9;
                    objM87133R13 = new e(interfaceC28601c6, abstractC4813a0, interfaceC28601c10, null);
                    c28655q15.m87172p0(objM87133R13);
                } else {
                    abstractC4813a0 = viewState;
                    interfaceC28601c10 = interfaceC28601c9;
                    objM87133R13 = new e(interfaceC28601c6, abstractC4813a0, interfaceC28601c10, null);
                    c28655q15.m87172p0(objM87133R13);
                }
                AbstractC28683x.m87253g(c28655q15, (InterfaceC4351m) objM87133R13, listM2941F5);
                if (m2886i0(interfaceC28601c19)) {
                    function3 = onViewEvent;
                    c15199y5 = c15199y6;
                    c28655q15.m87150e0(-1782089021);
                    c28655q15.m87179t();
                    c28655q16 = c28655q15;
                } else {
                    function3 = onViewEvent;
                    c15199y5 = c15199y6;
                    c28655q15.m87150e0(-1782089021);
                    c28655q15.m87179t();
                    c28655q16 = c28655q15;
                }
                boolean zM87157i111 = c28655q16.m87157i(interfaceC2994c2) | c28655q16.m87157i(c15199y4) | c28655q16.m87157i(c15199y5);
                if (z29 == 256) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                z46 = zM87157i111 | z45;
                objM87133R14 = c28655q16.m87133R();
                if (z46) {
                    C1045v c1045v6 = new C1045v(interfaceC2994c2, c15199y5, function1, interfaceC28601c1, c15199y4, interfaceC28601c19);
                    function2 = function1;
                    c28655q16.m87172p0(c1045v6);
                    objM87133R14 = c1045v6;
                } else {
                    C1045v c1045v7 = new C1045v(interfaceC2994c2, c15199y5, function1, interfaceC28601c1, c15199y4, interfaceC28601c19);
                    function2 = function1;
                    c28655q16.m87172p0(c1045v7);
                    objM87133R14 = c1045v7;
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R14, false, c28655q16, 0, 1);
                c28655q16.m87177s();
                c28655q16.m87179t();
                c28655q3 = c28655q16;
            } else {
                function3 = function4;
                function2 = onNavigationEvent;
                C28655q c28655q40 = c28655q2;
                C28676v0 c28676v9 = c28676v0;
                int i44 = 2;
                List list3 = null;
                boolean z84 = false;
                boolean z85 = false;
                boolean z86 = false;
                boolean z87 = false;
                boolean z88 = false;
                boolean z89 = false;
                boolean z94 = false;
                abstractC4813a0 = viewState;
                if (abstractC4813a0 instanceof AbstractC4813a0.c) {
                    c28655q40.m87150e0(-724878252);
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.m66738a(), C2299e.f9111N, c28655q40, 54);
                    int iHashCode12 = Long.hashCode(AbstractC28683x.m87267u(c28655q40));
                    InterfaceC28653p1 interfaceC28653p1M87116A20 = c28655q40.m87116A();
                    Modifier modifierM118962N20 = AbstractC37056f.m118962N(c28655q40, c2314t2);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213jM545a12 = C0217k.m545a();
                    c28655q40.m87158i0();
                    if (c28655q40.m87120E()) {
                        c28655q40.m87163l(c0213jM545a12);
                    } else {
                        c28655q40.m87178s0();
                    }
                    C0209i c0209iM8291d7 = AbstractC2875y.m8291d(c28655q40, c23010xM66775a12, c28655q40, interfaceC28653p1M87116A20);
                    if (c28655q40.m87120E() || !AbstractC22676k.m65745e(c28655q40.m87133R(), Integer.valueOf(iHashCode12))) {
                        AbstractC11266d.m30471y(iHashCode12, c28655q40, iHashCode12, c0209iM8291d7);
                    }
                    AbstractC28683x.m87239G(c28655q40, C0217k.m548d(), modifierM118962N20);
                    AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q40, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                    c28655q40.m87177s();
                    c28655q40.m87179t();
                    c28655q3 = c28655q40;
                } else {
                    if (!(abstractC4813a0 instanceof AbstractC4813a0.b)) {
                        c28655q40.m87150e0(-578431286);
                        c28655q40.m87179t();
                        throw new NoWhenBranchMatchedException();
                    }
                    c28655q40.m87150e0(-724481700);
                    AbstractC33208p0.b bVar2 = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC32706a.f135963q, list3, i44, z94 ? 1 : 0), false, null, 6, null);
                    TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC32706a.f135960n, z89 ? 1 : 0, i44, z88 ? 1 : 0);
                    TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC32706a.f135962p, z87 ? 1 : 0, i44, z86 ? 1 : 0);
                    TextResource.C8688b c8688b3 = new TextResource.C8688b(AbstractC32706a.f135961o, z85 ? 1 : 0, i44, z84 ? 1 : 0);
                    boolean z95 = (i28 == 32) | (r37 == 4);
                    Object objM87133R40 = c28655q40.m87133R();
                    if (z95 || objM87133R40 == c28676v9) {
                        objM87133R40 = new C17820i(9, function3, abstractC4813a0);
                        c28655q40.m87172p0(objM87133R40);
                    }
                    InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R40;
                    boolean z96 = (i27 & 896) == 256;
                    Object objM87133R41 = c28655q40.m87133R();
                    if (z96 || objM87133R41 == c28676v9) {
                        objM87133R41 = new C1043t(function2, 2);
                        c28655q40.m87172p0(objM87133R41);
                    }
                    InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R41;
                    int i45 = AbstractC33208p0.b.f138467h | ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    int i46 = TextResource.C8688b.f25889c;
                    AbstractC33199m0.m105214F(bVar2, c8688b, null, c8688b3, interfaceC4339a2, true, false, c8688b2, interfaceC4339a3, null, false, false, c28655q40, i45 | (i46 << 3) | (i46 << 9) | (i46 << 21), 0, 3652);
                    c28655q40.m87179t();
                    c28655q3 = c28655q40;
                }
            }
            z14 = z69;
            c28655q = c28655q3;
        } else {
            abstractC4813a0 = viewState;
            C28655q c28655q41 = c28655q19;
            function2 = onNavigationEvent;
            function3 = onViewEvent;
            c28655q41.m87138X();
            z14 = z13;
            c28655q = c28655q41;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.m87205f(new C1025j0(abstractC4813a0, function3, function2, onAnalyticsEvent, onCarouselItemClicked, onBodyCompInfoClicked, dateTimeNow, localDateNow, z4, z14, i13, i14));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final C23454a0 m2881g1(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new Object());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h0 */
    private static final boolean m2883h0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final C23454a0 m2884h1(C3448i0 c3448i0, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, int i13, Composer composer, int i14) {
        m2875e1(c3448i0, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i0 */
    private static final boolean m2886i0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final void m2889j0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: k0 */
    private static final boolean m2892k0(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l0 */
    private static final void m2895l0(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final boolean m2898m0(InterfaceC28601c1 interfaceC28601c1, EnumC15209z3 it) {
        AbstractC22676k.m65750j(it, "it");
        if (it != EnumC15209z3.f57106w) {
            return true;
        }
        m2856X0(interfaceC28601c1, false);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final C23454a0 m2901n0(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new AbstractC39640g.d(AbstractC39640g.b.Fragment));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n1 */
    public static final void m2902n1(Object event, p715kotlin.jvm.functions.Function1 onNavigationEvent, boolean z4) {
        Object actionArgument;
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        DesignItemInteraction designItemInteraction = event instanceof DesignItemInteraction ? (DesignItemInteraction) event : null;
        if (designItemInteraction != null && (actionArgument = designItemInteraction.getActionArgument()) != null) {
            event = actionArgument;
        }
        if (event instanceof InterfaceC29950b.a) {
            onNavigationEvent.invoke(new AbstractC39640g.a(new C39635b(((InterfaceC29950b.a) event).getExerciseId(), z4, null, 4, null)));
            return;
        }
        int i13 = 2;
        if (event instanceof C9598e) {
            onNavigationEvent.invoke(new AbstractC39640g.c((C9598e) event, str, i13, objArr3 == true ? 1 : 0));
        } else if (event instanceof C27256h) {
            C27256h c27256h = (C27256h) event;
            if (AbstractC22676k.m65745e(c27256h.getDestination().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
                return;
            }
            onNavigationEvent.invoke(new AbstractC39640g.c(c27256h.getDestination(), objArr2 == true ? 1 : 0, i13, objArr == true ? 1 : 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m2904o0(TrendKey it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o1 */
    private static final C22246d m2905o1(C1036p c1036p) {
        return new C22246d(c1036p.getLegendColor(), c1036p.getLegendTitle(), null, c1036p.getLegendShape(), null, 20, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final C23454a0 m2907p0(p715kotlin.jvm.functions.Function1 function1, C1037p0 c1037p0, EnumC28166h0 it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC4837y.n(it, c1037p0.getMetaData().getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), c1037p0.getMetaData().getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), false, null, true, 24, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final C23454a0 m2908p1(C25308q designItemViewFactory) {
        AbstractC22676k.m65750j(designItemViewFactory, "$this$designItemViewFactory");
        Map<InterfaceC21461d, InterfaceC25297f<?>> mapM74324c = designItemViewFactory.m74324c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        mapM74324c.put(c22673i0.getOrCreateKotlinClass(C15791j.class), new C15784c());
        designItemViewFactory.m74324c().put(c22673i0.getOrCreateKotlinClass(C32115g.class), new C32110b());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m2910q0(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m2912r0(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final C23454a0 m2914s0(C1037p0 c1037p0, p715kotlin.jvm.functions.Function1 function1, int i13) {
        EnumC36106a enumC36106a;
        C23465k c23465k = (C23465k) AbstractC25265s.m74102I0(i13, c1037p0.getSegmentControlState().m3065b());
        if (c23465k == null || (enumC36106a = (EnumC36106a) c23465k.f92938x) == null) {
            enumC36106a = EnumC36106a.MONTHLY;
        }
        function1.invoke(new AbstractC4837y.f(c1037p0.getMetaData().getGraphKey(), enumC36106a, c1037p0.getMetaData().getCom.mapbox.common.HttpHeaders.DATE java.lang.String()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final C23454a0 m2916t0(C1037p0 c1037p0, p715kotlin.jvm.functions.Function1 function1, Object it) {
        EnumC4816d enumC4816d;
        AbstractC22676k.m65750j(it, "it");
        String str = (String) it;
        if (str.equals(c1037p0.getDateSelectorState().getBackDate())) {
            enumC4816d = EnumC4816d.PREVIOUS;
        } else {
            enumC4816d = str.equals(c1037p0.getDateSelectorState().getForwardDate()) ? EnumC4816d.NEXT : EnumC4816d.NONE;
        }
        EnumC4816d enumC4816d2 = enumC4816d;
        String strPrint = DateTimeFormat.forPattern("yyyy-MM-dd").print(DateTime.parse(str));
        EnumC28166h0 enumC28166h0M2722c = c1037p0.getMetaData().getGraphKey();
        EnumC36106a enumC36106aM2721b = c1037p0.getMetaData().getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String();
        AbstractC22676k.m65747g(strPrint);
        function1.invoke(new AbstractC4837y.n(enumC28166h0M2722c, enumC36106aM2721b, strPrint, false, enumC4816d2, false, 32, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final Modifier m2918u0(C32048d it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(252129066);
        float f13 = 8;
        Modifier modifierM3395q = AbstractC1099a.m3395q(C2314t.f9131w, 2 * f13, 1 * f13);
        c28655q.m87173q(false);
        return modifierM3395q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m2920v0(p715kotlin.jvm.functions.Function1 function1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof C32048d) {
            function1.invoke(new AbstractC39640g.a((InterfaceC25312u) event));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final Modifier m2922w0(C39282o it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(1522138928);
        float f13 = 8;
        Modifier modifierM3395q = AbstractC1099a.m3395q(C2314t.f9131w, 2 * f13, 1 * f13);
        c28655q.m87173q(false);
        return modifierM3395q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m2924x0(C1048y c1048y, InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC28601c1 interfaceC28601c3, C15199y3 c15199y3, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, Object it) {
        EnumC4821i enumC4821i;
        AbstractC22676k.m65750j(it, "it");
        InterfaceC25312u interfaceC25312uM3069d = c1048y.getMenuSheet();
        EnumC4821i enumC4821i2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (interfaceC25312uM3069d != null) {
            m2872d1(interfaceC28601c1, Integer.valueOf(c1048y.getMenuIndex()));
            m2866b1(interfaceC28601c2, (C17675e) interfaceC25312uM3069d);
            m2889j0(interfaceC28601c3, true);
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new c(c15199y3, null), 3);
        }
        C9598e destination = c1048y.getMenuItem().getDestination();
        if (destination != null) {
            if (AbstractC22676k.m65745e(destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName(), AppScreen.C9309f5.f27604w.getName())) {
                if (destination.getParameters() instanceof SeeAllRecordingsScreenModel) {
                    NavigationScreenModel parameters = destination.getParameters();
                    AbstractC22676k.m65748h(parameters, "null cannot be cast to non-null type com.whoop.navigation.SeeAllRecordingsScreenModel");
                    String measurementId = ((SeeAllRecordingsScreenModel) parameters).getMeasurementId();
                    enumC4821i = EnumC4821i.VO2_MAX;
                    for (EnumC4821i enumC4821i3 : EnumC4821i.values()) {
                        if (AbstractC22676k.m65745e(enumC4821i3.name(), measurementId)) {
                            enumC4821i2 = enumC4821i3;
                            break;
                        }
                    }
                    if (enumC4821i2 != null) {
                        enumC4821i = enumC4821i2;
                    }
                } else {
                    enumC4821i = EnumC4821i.VO2_MAX;
                }
                function1.invoke(new AbstractC4837y.m(enumC4821i));
                function2.invoke(new AbstractC39640g.a(c1048y.getMenuItem()));
            } else {
                function2.invoke(new AbstractC39640g.c(destination, objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final Modifier m2926y0(C39282o it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1747362681);
        float f13 = 8;
        Modifier modifierM3395q = AbstractC1099a.m3395q(C2314t.f9131w, 2 * f13, 1 * f13);
        c28655q.m87173q(false);
        return modifierM3395q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m2928z0(InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        m2856X0(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }
}
