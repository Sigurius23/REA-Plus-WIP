package fq2;

import a51.C0391f;
import androidx.compose.foundation.layout.AbstractC1099a;
import b91.AbstractC2890e;
import b91.C2886a;
import b91.EnumC2888c;
import br2.EnumC3560b;
import c51.C4236m;
import c51.C4237n;
import c51.C4238o;
import c51.C4242s;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ScoreGaugeDialModel;
import com.whoop.design.models.items.UnknownDesignModel;
import com.whoop.design.models.items.amoeba.AmoebaDomainResult;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import com.whoop.design.models.items.amoeba.reducers.AmoebaViewStateReducer;
import com.whoop.design.models.items.graph.plot.bar.BarStyle;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.user.journey.model.yearinreview.AnimatableTextModel;
import com.whoop.user.journey.model.yearinreview.Bar;
import com.whoop.user.journey.model.yearinreview.ComparisonRow;
import com.whoop.user.journey.model.yearinreview.HighlightTextItem;
import com.whoop.user.journey.model.yearinreview.StyleType;
import com.whoop.user.journey.model.yearinreview.TimeCapsuleModel;
import com.whoop.user.journey.model.yearinreview.YearInReviewComparisonModel;
import com.whoop.user.journey.model.yearinreview.YearInReviewHighlightsListModel;
import com.whoop.user.journey.model.yearinreview.YearInReviewStreaksStatsCard;
import com.whoop.user.journey.model.yearinreview.YearInReviewSummaryCardModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.GaugeValueModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.InsightValueListModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.NumberValueModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.YearInReviewCardModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.YearInReviewTimelineModel;
import f41.C14068f;
import gq2.C16084c;
import gz0.AbstractC16315n0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25267u;
import nb1.C26538b;
import no.nordicsemi.android.dfu.DfuBaseService;
import nq2.C27058a;
import nq2.C27063f;
import nq2.C27066i;
import ny0.C27256h;
import p026b2.C2299e;
import p026b2.C2307m;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p716lb1.AbstractC23720u1;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import s51.C32212i;
import wb3.AbstractC37056f;
import xq2.C38553c0;
import xq2.C38555d;
import xq2.C38558e;
import xq2.C38564g;
import xq2.C38565g0;
import xq2.C38566g1;
import xq2.C38567h;
import xq2.C38569i;
import xq2.C38571j;
import xq2.C38573k;
import xq2.C38575l;
import xq2.C38577m;
import xq2.C38578m0;
import xq2.C38579n;
import xq2.C38588r0;
import xq2.C38589s;
import xq2.C38593u;
import xq2.C38594u0;
import xq2.C38599x;
import xq2.EnumC38561f;
import xq2.EnumC38568h0;
import z41.C40071f;
import z41.C40072g;

/* JADX INFO: renamed from: fq2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!\u001a\u0013\u0010$\u001a\u00020#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%\u001a%\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b+\u0010,\u001a\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101\u001a\u0017\u00104\u001a\u0002032\u0006\u0010\u0001\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105\u001a\u0017\u00109\u001a\u0002082\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:\u001a'\u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020;2\u0006\u0010.\u001a\u00020;H\u0002¢\u0006\u0004\b?\u0010@\"\u001a\u0010F\u001a\u00020A8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E¨\u0006G"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewCardModel;", "model", "Lxq2/m0;", "W", "(Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewCardModel;)Lxq2/m0;", "Lcom/whoop/user/journey/model/yearinreview/YearInReviewHighlightsListModel;", "Lnq2/f;", "v", "(Lcom/whoop/user/journey/model/yearinreview/YearInReviewHighlightsListModel;)Lnq2/f;", "Lcom/whoop/user/journey/model/yearinreview/YearInReviewStreaksStatsCard;", "Lnq2/i;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/user/journey/model/yearinreview/YearInReviewStreaksStatsCard;)Lnq2/i;", "Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/InsightValueListModel;", "Lxq2/s;", "D", "(Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/InsightValueListModel;)Lxq2/s;", "Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;", "Lxq2/n;", "C", "(Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/GaugeValueModel;)Lxq2/n;", "Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;", "barStyle", "Li91/a;", "u", "(Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;)Li91/a;", "Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/NumberValueModel;", "Lxq2/u;", "E", "(Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/NumberValueModel;)Lxq2/u;", "Lcom/whoop/design/models/items/ScoreGaugeDialModel;", "Ls51/i;", "H", "(Lcom/whoop/design/models/items/ScoreGaugeDialModel;)Ls51/i;", "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "Lc51/s;", "G", "(Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;)Lc51/s;", "", "totalTicks", "ticksPerStep", "", "Lxq2/g0;", "r", "(II)Ljava/util/List;", "Lxq2/h0;", "style", "Lxq2/x;", "s", "(Lxq2/h0;)Lxq2/x;", "Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;", "Lxq2/r0;", "F", "(Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;)Lxq2/r0;", "Lcom/whoop/user/journey/model/yearinreview/Bar;", "bar", "Lxq2/i;", "y", "(Lcom/whoop/user/journey/model/yearinreview/Bar;)Lxq2/i;", "", "stat", "text", "Lxq2/m;", "B", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lxq2/m;", "Ljb1/a;", "a", "Ljb1/a;", "t", "()Ljb1/a;", "userJourneyDesignItemReducer", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14687d {

    /* JADX INFO: renamed from: a */
    private static final C21535a f54256a = AbstractC21537c.m60554d(new C14068f(22));

    /* JADX INFO: renamed from: fq2.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54257a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f54258b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f54259c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f54260d;

        static {
            int[] iArr = new int[BarStyle.values().length];
            try {
                iArr[BarStyle.RECOVERY_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarStyle.RECOVERY_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BarStyle.RECOVERY_HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f54257a = iArr;
            int[] iArr2 = new int[EnumC38568h0.values().length];
            try {
                iArr2[EnumC38568h0.HIGHLIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC38568h0.NEUTRAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f54258b = iArr2;
            int[] iArr3 = new int[EnumC3560b.values().length];
            try {
                iArr3[EnumC3560b.POSITIVE_RECOVERY_TREND.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[EnumC3560b.NEGATIVE_RECOVERY_TREND.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f54259c = iArr3;
            int[] iArr4 = new int[EnumC38561f.values().length];
            try {
                iArr4[EnumC38561f.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[EnumC38561f.TRAILING.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f54260d = iArr4;
        }
    }

    /* JADX INFO: renamed from: fq2.d$a0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f54261w;

        public a0(Function1 function1) {
            this.f54261w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f54261w.invoke((GaugeValueModel) it);
        }
    }

    /* JADX INFO: renamed from: fq2.d$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f54262w = new b();

        /* JADX INFO: renamed from: a */
        public final long m42089a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecoveryLowRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42089a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$b0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f54263w;

        public b0(Function1 function1) {
            this.f54263w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f54263w.invoke((NumberValueModel) it);
        }
    }

    /* JADX INFO: renamed from: fq2.d$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f54264w = new c();

        /* JADX INFO: renamed from: a */
        public final long m42091a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecoveryMediumRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42091a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$c0 */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c0 implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f54265w;

        public c0(Function1 function1) {
            this.f54265w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f54265w.invoke((TimeCapsuleModel) it);
        }
    }

    /* JADX INFO: renamed from: fq2.d$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f54266w = new d();

        /* JADX INFO: renamed from: a */
        public final long m42093a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getRecoveryHighRecovery();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42093a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$e */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f54267w = new e();

        /* JADX INFO: renamed from: a */
        public final long m42094a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42094a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f54268w = new f();

        /* JADX INFO: renamed from: a */
        public final long m42095a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42095a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f54269w = new g();

        /* JADX INFO: renamed from: a */
        public final long m42096a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42096a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$h */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f54270w = new h();

        /* JADX INFO: renamed from: a */
        public final long m42097a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTextBaseSecondary();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42097a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$i */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Bar f54271w;

        public i(Bar bar) {
            this.f54271w = bar;
        }

        /* JADX INFO: renamed from: a */
        public final long m42098a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(this.f54271w.getOpacity(), colorBackground.getAccentPositiveTrend15());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42098a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$j */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Bar f54272w;

        public j(Bar bar) {
            this.f54272w = bar;
        }

        /* JADX INFO: renamed from: a */
        public final long m42099a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(this.f54272w.getOpacity(), colorBackground.getAccentNegativeTrend15());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42099a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Bar f54273w;

        public k(Bar bar) {
            this.f54273w = bar;
        }

        /* JADX INFO: renamed from: a */
        public final long m42100a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(this.f54273w.getOpacity(), colorBackground.getWhite5());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42100a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final l f54274w = new l();

        /* JADX INFO: renamed from: a */
        public final long m42101a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentPositiveTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42101a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final m f54275w = new m();

        /* JADX INFO: renamed from: a */
        public final long m42102a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.4f, colorBackground.getAccentPositiveTrend15());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42102a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final n f54276w = new n();

        /* JADX INFO: renamed from: a */
        public final long m42103a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getAccentNegativeTrend();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42103a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final o f54277w = new o();

        /* JADX INFO: renamed from: a */
        public final long m42104a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.4f, colorBackground.getAccentNegativeTrend15());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42104a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final p f54278w = new p();

        /* JADX INFO: renamed from: a */
        public final long m42105a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getTextBaseSecondary();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42105a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class q implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final q f54279w = new q();

        /* JADX INFO: renamed from: a */
        public final long m42106a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return C17919x.m51541c(0.4f, colorBackground.getWhite5());
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m42106a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: fq2.d$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class r implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f54280w;

        public r(Function1 function1) {
            this.f54280w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f54280w.invoke((WhoopAgeAmoeba) it);
        }
    }

    /* JADX INFO: renamed from: fq2.d$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class s implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f54281w;

        public s(Function1 function1) {
            this.f54281w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f54281w.invoke((YearInReviewTimelineModel) it);
        }
    }

    /* JADX INFO: renamed from: fq2.d$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class t implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f54282w;

        public t(Function1 function1) {
            this.f54282w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f54282w.invoke((YearInReviewComparisonModel) it);
        }
    }

    /* JADX INFO: renamed from: fq2.d$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class u implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f54283w;

        public u(Function1 function1) {
            this.f54283w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f54283w.invoke((AnimatableTextModel) it);
        }
    }

    /* JADX INFO: renamed from: fq2.d$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class v implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f54284w;

        public v(Function1 function1) {
            this.f54284w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f54284w.invoke((YearInReviewCardModel) it);
        }
    }

    /* JADX INFO: renamed from: fq2.d$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class w implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f54285w;

        public w(Function1 function1) {
            this.f54285w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f54285w.invoke((YearInReviewSummaryCardModel) it);
        }
    }

    /* JADX INFO: renamed from: fq2.d$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class x implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f54286w;

        public x(Function1 function1) {
            this.f54286w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f54286w.invoke((YearInReviewStreaksStatsCard) it);
        }
    }

    /* JADX INFO: renamed from: fq2.d$y */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class y implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f54287w;

        public y(Function1 function1) {
            this.f54287w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f54287w.invoke((YearInReviewHighlightsListModel) it);
        }
    }

    /* JADX INFO: renamed from: fq2.d$z */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class z implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f54288w;

        public z(Function1 function1) {
            this.f54288w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f54288w.invoke((InsightValueListModel) it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final AbstractC17911t m42039A(EnumC3560b enumC3560b, C39336i brushBackground) {
        long jM51541c;
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        C17909s c17909s = AbstractC17911t.f69612b;
        C17919x c17919x = new C17919x(AbstractC17918w0.m51517e(3422552064L));
        int i13 = a.f54259c[enumC3560b.ordinal()];
        if (i13 != 1) {
            jM51541c = i13 != 2 ? C17919x.m51541c(0.05f, brushBackground.getWhite5()) : C17919x.m51541c(0.05f, brushBackground.getAccentNegativeTrend());
        } else {
            jM51541c = C17919x.m51541c(0.05f, brushBackground.getAccentPositiveTrend());
        }
        return C17909s.m51483a(c17909s, AbstractC37056f.m118959K(c17919x, new C17919x(jM51541c)), 0.0f, 0.0f, 14);
    }

    /* JADX INFO: renamed from: B */
    private static final C38577m m42040B(String str, String str2, String str3) {
        EnumC3560b enumC3560b;
        C23465k c23465k;
        EnumC3560b enumC3560b2 = EnumC3560b.NEUTRAL;
        EnumC3560b[] enumC3560bArrValues = EnumC3560b.values();
        int length = enumC3560bArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC3560b = null;
                break;
            }
            enumC3560b = enumC3560bArrValues[i13];
            if (AbstractC22676k.m65745e(enumC3560b.name(), str3)) {
                break;
            }
            i13++;
        }
        if (enumC3560b != null) {
            enumC3560b2 = enumC3560b;
        }
        int i14 = a.f54259c[enumC3560b2.ordinal()];
        if (i14 != 1) {
            c23465k = i14 != 2 ? new C23465k(p745y81.Function1.m125323a(p.f54278w), AbstractC18249c.m52574l(q.f54279w)) : new C23465k(p745y81.Function1.m125323a(n.f54276w), AbstractC18249c.m52574l(o.f54277w));
        } else {
            c23465k = new C23465k(p745y81.Function1.m125323a(l.f54274w), AbstractC18249c.m52574l(m.f54275w));
        }
        return new C38577m(AbstractC8693b.m21278l(str), AbstractC8693b.m21278l(str2), (InterfaceC39332e) c23465k.f92937w, (AbstractC18247a) c23465k.f92938x);
    }

    /* JADX INFO: renamed from: C */
    public static final C38579n m42041C(GaugeValueModel gaugeValueModel) {
        BarStyle barStyle;
        AbstractC22676k.m65750j(gaugeValueModel, "<this>");
        String progressStyle = gaugeValueModel.getProgressStyle();
        BarStyle barStyle2 = BarStyle.STRAIN;
        BarStyle[] barStyleArrValues = BarStyle.values();
        int length = barStyleArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                barStyle = null;
                break;
            }
            barStyle = barStyleArrValues[i13];
            if (AbstractC22676k.m65745e(barStyle.name(), progressStyle)) {
                break;
            }
            i13++;
        }
        if (barStyle != null) {
            barStyle2 = barStyle;
        }
        return new C38579n(AbstractC8693b.m21278l(gaugeValueModel.getTitle()), AbstractC8693b.m21278l(gaugeValueModel.getSubtitle()), gaugeValueModel.getValue(), AbstractC8693b.m21278l(gaugeValueModel.getValueSuffix()), gaugeValueModel.getFillPercentage(), m42082u(barStyle2));
    }

    /* JADX INFO: renamed from: D */
    public static final C38589s m42042D(InsightValueListModel insightValueListModel) {
        AbstractC22676k.m65750j(insightValueListModel, "<this>");
        List<DesignSystemModel> items = insightValueListModel.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (!(((DesignSystemModel) obj) instanceof UnknownDesignModel)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(f54256a.m60541h((DesignSystemModel) it.next()));
        }
        return new C38589s(arrayList2);
    }

    /* JADX INFO: renamed from: E */
    public static final C38593u m42043E(NumberValueModel numberValueModel) {
        AbstractC22676k.m65750j(numberValueModel, "<this>");
        return new C38593u(AbstractC8693b.m21278l(numberValueModel.getTitle()), AbstractC8693b.m21278l(numberValueModel.getSubtitle()), AbstractC8693b.m21278l(numberValueModel.getValue()), AbstractC8693b.m21278l(numberValueModel.getValueSuffix()));
    }

    /* JADX INFO: renamed from: F */
    private static final C38588r0 m42044F(YearInReviewComparisonModel yearInReviewComparisonModel) {
        TextResource textResourceM21278l = AbstractC8693b.m21278l(yearInReviewComparisonModel.getTitle());
        String leftImage = yearInReviewComparisonModel.getHeader().getLeftImage();
        AbstractC22403o abstractC22403oM64503l = leftImage != null ? AbstractC22404p.m64503l(leftImage) : null;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(yearInReviewComparisonModel.getHeader().getLeftText());
        String rightImage = yearInReviewComparisonModel.getHeader().getRightImage();
        C38573k c38573k = new C38573k(abstractC22403oM64503l, textResourceM21278l2, rightImage != null ? AbstractC22404p.m64503l(rightImage) : null, AbstractC8693b.m21278l(yearInReviewComparisonModel.getHeader().getRightText()));
        List<ComparisonRow> comparisons = yearInReviewComparisonModel.getComparisons();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(comparisons, 10));
        for (ComparisonRow comparisonRow : comparisons) {
            TextResource textResourceM21278l3 = AbstractC8693b.m21278l(comparisonRow.getTitle());
            List<Bar> bars = comparisonRow.getBars();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(bars, 10));
            Iterator<T> it = bars.iterator();
            while (it.hasNext()) {
                arrayList2.add(m42086y((Bar) it.next()));
            }
            arrayList.add(new C38575l(textResourceM21278l3, arrayList2));
        }
        return new C38588r0(textResourceM21278l, c38573k, arrayList, new C38571j(m42040B(yearInReviewComparisonModel.getFooter().getLeftStat(), yearInReviewComparisonModel.getFooter().getLeftText(), yearInReviewComparisonModel.getFooter().getLeftStyle()), m42040B(yearInReviewComparisonModel.getFooter().getRightStat(), yearInReviewComparisonModel.getFooter().getRightText(), yearInReviewComparisonModel.getFooter().getRightStyle())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    private static final C4242s m42045G(WhoopAgeAmoeba whoopAgeAmoeba) {
        C4242s c4242sReduce = new AmoebaViewStateReducer(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0).reduce(new AmoebaDomainResult.Result(whoopAgeAmoeba, null, null, whoopAgeAmoeba.isCalibrating()));
        C40072g c40072gM13196a = c4242sReduce.getParticles().getParticleSystemSettings();
        float f13 = 4;
        float f14 = f13 * f13;
        float f15 = ((float) 1.5d) * 8;
        float speed = c40072gM13196a.getSpeed();
        C26538b c26538b = C26538b.f105478a;
        C4236m c4236m = new C4236m(C40072g.m128427b(c40072gM13196a, 0, 0, c26538b.m78638c() * speed, c26538b.m78638c() * c40072gM13196a.getMaxSpeed(), 0.0f, C40071f.m128422b(c40072gM13196a.getSize(), c26538b.m78637b() * c40072gM13196a.getSize().getBaseValue(), 0.0f, null, null, 14, null), null, null, 0L, false, 0.0f, null, c40072gM13196a.getRadius() * 0.6f, 0, 0.0f, C0391f.m1066b(c40072gM13196a.getEmitter(), null, c40072gM13196a.getEmitter().getParticlesPerSecond() * 0.6f, null, 5, null), null, 0.0f, 225235, null), 0.0f, 2, 0 == true ? 1 : 0);
        C4238o text = c4242sReduce.getText();
        return c4242sReduce.m13236b((8191 & 1) != 0 ? c4242sReduce.radius : f14, (8191 & 2) != 0 ? c4242sReduce.padding : f15, (8191 & 4) != 0 ? c4242sReduce.gradientPadding : 0.0f, (8191 & 8) != 0 ? c4242sReduce.paceOfAgingAnimationScore : 0.0d, (8191 & 16) != 0 ? c4242sReduce.yearsDifferenceAnimationScore : 0.0d, (8191 & 32) != 0 ? c4242sReduce.colors : null, (8191 & 64) != 0 ? c4242sReduce.centerShadowBrush : null, (8191 & 128) != 0 ? c4242sReduce.outline : null, (8191 & 256) != 0 ? c4242sReduce.usingPrimitiveEdgeFade : false, (8191 & 512) != 0 ? c4242sReduce.edgeFade : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c4242sReduce.primitiveEdgeFade : null, (8191 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? c4242sReduce.particles : c4236m, (8191 & 4096) != 0 ? c4242sReduce.transition : null, (8191 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c4242sReduce.text : text != null ? C4238o.m13215b(text, null, null, null, null, null, EnumC2888c.N8, true, 31, null) : null);
    }

    /* JADX INFO: renamed from: H */
    private static final C32212i m42046H(ScoreGaugeDialModel scoreGaugeDialModel) {
        String id4 = scoreGaugeDialModel.getId();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(scoreGaugeDialModel.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(scoreGaugeDialModel.getScoreDisplay());
        String scoreDisplaySuffix = scoreGaugeDialModel.getScoreDisplaySuffix();
        return new C32212i(id4, textResourceM21278l, textResourceM21278l2, scoreDisplaySuffix != null ? AbstractC8693b.m21278l(scoreDisplaySuffix) : null, null, AbstractC23720u1.m69480t(scoreGaugeDialModel.getProgressFillStyle()), scoreGaugeDialModel.getGaugeFillPercentage(), scoreGaugeDialModel.getScoreTarget(), scoreGaugeDialModel.getLowerOptimalPercentage(), scoreGaugeDialModel.getHigherOptimalPercentage(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m42047I(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60547b(new C14068f(28));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m42048J(C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        C14068f c14068f = new C14068f(29);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(AnimatableTextModel.class), new u(c14068f));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(YearInReviewCardModel.class), new v(new C14686c(2)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(YearInReviewSummaryCardModel.class), new w(new C14686c(3)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(YearInReviewStreaksStatsCard.class), new x(new C14686c(4)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(YearInReviewHighlightsListModel.class), new y(new C14686c(5)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(InsightValueListModel.class), new z(new C14686c(6)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(GaugeValueModel.class), new a0(new C14068f(23)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(NumberValueModel.class), new b0(new C14068f(24)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(TimeCapsuleModel.class), new c0(new C14068f(25)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(WhoopAgeAmoeba.class), new r(new C14068f(26)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(YearInReviewTimelineModel.class), new s(new C14686c(0)));
        addModelMapper.m69765a(c22673i0.getOrCreateKotlinClass(YearInReviewComparisonModel.class), new t(new C14686c(1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C38555d m42049K(AnimatableTextModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C38555d(new C38558e(AbstractC8693b.m21278l(model.getText())), AbstractC16315n0.m46376a(model.getIcon()), model.getAlignment());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C38578m0 m42050L(YearInReviewCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m42061W(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C38566g1 m42051M(YearInReviewTimelineModel model) {
        AbstractC22676k.m65750j(model, "model");
        Integer ticksPerStep = model.getTicksPerStep();
        int iIntValue = ticksPerStep != null ? ticksPerStep.intValue() : 7;
        Integer totalTicks = model.getTotalTicks();
        List<C38565g0> listM42079r = m42079r(totalTicks != null ? totalTicks.intValue() : 1000, iIntValue);
        boolean amoebaHighlighted = model.getAmoebaHighlighted();
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSubtitle());
        WhoopAgeAmoeba amoeba = model.getAmoeba();
        return new C38566g1(amoebaHighlighted, textResourceM21278l, textResourceM21278l2, amoeba != null ? m42045G(amoeba) : null, iIntValue, listM42079r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C38588r0 m42052N(YearInReviewComparisonModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m42044F(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C38594u0 m42053O(YearInReviewSummaryCardModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C38594u0(AbstractC8693b.m21278l(model.getHeadline()), AbstractC8693b.m21278l(model.getBodyTitle()), AbstractC8693b.m21278l(model.getBodyText()), AbstractC22404p.m64503l(model.getBackgroundImageUrl()), C16084c.m45448b(C16084c.f60870a, model.getTheme(), null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C27066i m42054P(YearInReviewStreaksStatsCard model) {
        AbstractC22676k.m65750j(model, "model");
        return m42084w(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C27063f m42055Q(YearInReviewHighlightsListModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m42083v(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C38589s m42056R(InsightValueListModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m42042D(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C38579n m42057S(GaugeValueModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m42041C(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C38593u m42058T(NumberValueModel model) {
        AbstractC22676k.m65750j(model, "model");
        return m42043E(model);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C38553c0 m42059U(TimeCapsuleModel model) {
        AbstractC22676k.m65750j(model, "model");
        return new C38553c0(AbstractC8693b.m21278l(model.getHeader()), AbstractC8693b.m21278l(model.getTitle()), AbstractC8693b.m21278l(model.getTextPrompt()), new C27256h(AbstractC8693b.m21278l(model.getButtonTitle()), null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, null, null, null, 33529854, null), model.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C4242s m42060V(WhoopAgeAmoeba amoebaModel) {
        AbstractC22676k.m65750j(amoebaModel, "amoebaModel");
        return new AmoebaViewStateReducer(new C4237n(0.0f, 0.0f, null, null, null, null, null, null, 0.0f, null, null, 2047, null).m13212p(0.75f)).reduce(new AmoebaDomainResult.Result(amoebaModel, null, null, false));
    }

    /* JADX INFO: renamed from: W */
    private static final C38578m0 m42061W(YearInReviewCardModel yearInReviewCardModel) {
        TextResource textResourceM21267a;
        String header = yearInReviewCardModel.getHeader();
        TextResource textResourceM21278l = header != null ? AbstractC8693b.m21278l(header) : null;
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(yearInReviewCardModel.getTitle());
        String subtitle = yearInReviewCardModel.getSubtitle();
        if (subtitle == null || (textResourceM21267a = AbstractC8693b.m21278l(subtitle)) == null) {
            textResourceM21267a = AbstractC8693b.m21267a();
        }
        TextResource textResource = textResourceM21267a;
        String image = yearInReviewCardModel.getImage();
        AbstractC22403o abstractC22403oM64503l = image != null ? AbstractC22404p.m64503l(image) : null;
        ScoreGaugeDialModel scoreGaugeDial = yearInReviewCardModel.getScoreGaugeDial();
        C32212i c32212iM42046H = scoreGaugeDial != null ? m42046H(scoreGaugeDial) : null;
        List<DesignSystemModel> cardItems = yearInReviewCardModel.getCardItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(cardItems, 10));
        Iterator<T> it = cardItems.iterator();
        while (it.hasNext()) {
            arrayList.add(f54256a.m60541h((DesignSystemModel) it.next()));
        }
        return new C38578m0(textResourceM21278l, textResourceM21278l2, textResource, abstractC22403oM64503l, c32212iM42046H, arrayList, false, 64, null);
    }

    /* JADX INFO: renamed from: r */
    private static final List<C38565g0> m42079r(int i13, int i14) {
        ArrayList arrayList = new ArrayList(i13);
        for (int i15 = 0; i15 < i13; i15++) {
            arrayList.add(new C38565g0(m42080s(i15 % i14 == 0 ? EnumC38568h0.HIGHLIGHT : EnumC38568h0.NEUTRAL)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    public static final C38599x m42080s(EnumC38568h0 style) {
        AbstractC22676k.m65750j(style, "style");
        int i13 = a.f54258b[style.ordinal()];
        if (i13 == 1) {
            float f13 = 4;
            return new C38599x(((float) 0.5d) * f13, ((float) 2.5d) * f13, EnumC39333f.WHITE_30, null);
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        float f14 = 4;
        return new C38599x(((float) 0.25d) * f14, 2 * f14, EnumC39333f.WHITE_10, null);
    }

    /* JADX INFO: renamed from: t */
    public static final C21535a m42081t() {
        return f54256a;
    }

    /* JADX INFO: renamed from: u */
    private static final AbstractC18247a m42082u(BarStyle barStyle) {
        int i13 = a.f54257a[barStyle.ordinal()];
        if (i13 == 1) {
            return AbstractC18249c.m52574l(b.f54262w);
        }
        if (i13 != 2) {
            return i13 != 3 ? AbstractC18249c.m52574l(e.f54267w) : AbstractC18249c.m52574l(d.f54266w);
        }
        return AbstractC18249c.m52574l(c.f54264w);
    }

    /* JADX INFO: renamed from: v */
    public static final C27063f m42083v(YearInReviewHighlightsListModel yearInReviewHighlightsListModel) {
        AbstractC22676k.m65750j(yearInReviewHighlightsListModel, "<this>");
        TextResource textResourceM21278l = AbstractC8693b.m21278l(yearInReviewHighlightsListModel.getTitle());
        List<HighlightTextItem> items = yearInReviewHighlightsListModel.getItems();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(new C27058a(AbstractC8693b.m21278l(((HighlightTextItem) it.next()).getText())));
        }
        return new C27063f(textResourceM21278l, arrayList);
    }

    /* JADX INFO: renamed from: w */
    public static final C27066i m42084w(YearInReviewStreaksStatsCard yearInReviewStreaksStatsCard) {
        ArrayList arrayList;
        StyleType styleType;
        AbstractC22676k.m65750j(yearInReviewStreaksStatsCard, "<this>");
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C14068f(27));
        String styleType2 = yearInReviewStreaksStatsCard.getStyleType();
        StyleType styleType3 = StyleType.NUMBER_LARGE;
        StyleType[] styleTypeArrValues = StyleType.values();
        int length = styleTypeArrValues.length;
        int i13 = 0;
        while (true) {
            arrayList = null;
            if (i13 >= length) {
                styleType = null;
                break;
            }
            styleType = styleTypeArrValues[i13];
            if (AbstractC22676k.m65745e(styleType.name(), styleType2)) {
                break;
            }
            i13++;
        }
        StyleType styleType4 = styleType == null ? styleType3 : styleType;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(yearInReviewStreaksStatsCard.getStatValueTitle());
        String statSubtitle = yearInReviewStreaksStatsCard.getStatSubtitle();
        TextResource textResourceM21278l2 = statSubtitle != null ? AbstractC8693b.m21278l(statSubtitle) : null;
        EnumC39333f enumC39333f = styleType4 == StyleType.NUMBER_LARGE ? EnumC39333f.BRAND_WHITE : EnumC39333f.WHITE_70;
        String imageUrl = yearInReviewStreaksStatsCard.getImageUrl();
        String lottieUrl = yearInReviewStreaksStatsCard.getLottieUrl();
        String todayStreakState = yearInReviewStreaksStatsCard.getTodayStreakState();
        List<DesignSystemModel> items = yearInReviewStreaksStatsCard.getItems();
        if (items != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : items) {
                if (!(((DesignSystemModel) obj) instanceof UnknownDesignModel)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(c21535aM60554d.m60541h((DesignSystemModel) it.next()));
            }
        }
        return new C27066i(textResourceM21278l, textResourceM21278l2, enumC39333f, styleType4, imageUrl, lottieUrl, todayStreakState, arrayList, null, 256, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m42085x(C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final C38569i m42086y(Bar bar) {
        EnumC38561f enumC38561f;
        final EnumC3560b enumC3560b;
        C23465k c23465k;
        AbstractC18247a abstractC18247aM52572j;
        C38564g c38564g;
        C2307m c2307m = C2299e.f9103F;
        C2307m c2307m2 = C2299e.f9117z;
        String barType = bar.getBarType();
        EnumC3560b enumC3560b2 = EnumC3560b.NEUTRAL;
        EnumC3560b[] enumC3560bArrValues = EnumC3560b.values();
        int length = enumC3560bArrValues.length;
        int i13 = 0;
        while (true) {
            enumC38561f = null;
            if (i13 >= length) {
                enumC3560b = null;
                break;
            }
            enumC3560b = enumC3560bArrValues[i13];
            if (AbstractC22676k.m65745e(enumC3560b.name(), barType)) {
                break;
            }
            i13++;
        }
        if (enumC3560b == null) {
            enumC3560b = enumC3560b2;
        }
        String alignment = bar.getAlignment();
        if (alignment == null) {
            alignment = "";
        }
        EnumC38561f enumC38561f2 = EnumC38561f.TRAILING;
        for (EnumC38561f enumC38561f3 : EnumC38561f.values()) {
            if (AbstractC22676k.m65745e(enumC38561f3.name(), alignment)) {
                enumC38561f = enumC38561f3;
                break;
            }
        }
        EnumC38561f enumC38561f4 = enumC38561f == null ? enumC38561f2 : enumC38561f;
        int[] iArr = a.f54259c;
        int i14 = iArr[enumC3560b.ordinal()];
        if (i14 == 1) {
            c23465k = new C23465k(p745y81.Function1.m125323a(f.f54268w), AbstractC2890e.m8450e().getN5());
        } else if (i14 != 2) {
            c23465k = new C23465k(p745y81.Function1.m125323a(h.f54270w), bar.getPrimary() ? AbstractC2890e.m8450e().getN3() : AbstractC2890e.m8450e().getN5());
        } else {
            c23465k = new C23465k(p745y81.Function1.m125323a(g.f54269w), AbstractC2890e.m8450e().getN5());
        }
        InterfaceC39332e interfaceC39332e = (InterfaceC39332e) c23465k.f92937w;
        C2886a c2886a = (C2886a) c23465k.f92938x;
        int[] iArr2 = a.f54260d;
        int i15 = iArr2[enumC38561f4.ordinal()];
        if (i15 == 1) {
            final int i16 = 0;
            abstractC18247aM52572j = AbstractC18249c.m52572j(new Function1() { // from class: fq2.b
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i16) {
                        case 0:
                            return AbstractC14687d.m42087z(enumC3560b, (C39336i) obj);
                        default:
                            return AbstractC14687d.m42039A(enumC3560b, (C39336i) obj);
                    }
                }
            });
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            final int i17 = 1;
            abstractC18247aM52572j = AbstractC18249c.m52572j(new Function1() { // from class: fq2.b
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i17) {
                        case 0:
                            return AbstractC14687d.m42087z(enumC3560b, (C39336i) obj);
                        default:
                            return AbstractC14687d.m42039A(enumC3560b, (C39336i) obj);
                    }
                }
            });
        }
        AbstractC18247a abstractC18247a = abstractC18247aM52572j;
        int i18 = iArr2[enumC38561f4.ordinal()];
        if (i18 == 1) {
            float f13 = 2 * 4;
            c38564g = new C38564g(AbstractC33253j.m105491g(f13, 0.0f, 0.0f, f13, 6), c2307m, c2307m2, AbstractC1099a.m3381c(((float) 2.5d) * 8, 0.0f, 0, 0.0f, 10), abstractC18247a);
        } else {
            if (i18 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            float f14 = 2 * 4;
            c38564g = new C38564g(AbstractC33253j.m105491g(0.0f, f14, f14, 0.0f, 9), c2307m2, c2307m, AbstractC1099a.m3381c(0, 0.0f, ((float) 2.5d) * 8, 0.0f, 10), abstractC18247a);
        }
        C38564g c38564g2 = c38564g;
        int i19 = iArr[enumC3560b.ordinal()];
        return new C38569i(AbstractC8693b.m21278l(bar.getMetric()), interfaceC39332e, c2886a, enumC38561f4, c38564g2, new C38567h(bar.getFillPercentage(), i19 != 1 ? i19 != 2 ? AbstractC18249c.m52574l(new k(bar)) : AbstractC18249c.m52574l(new j(bar)) : AbstractC18249c.m52574l(new i(bar))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final AbstractC17911t m42087z(EnumC3560b enumC3560b, C39336i brushBackground) {
        long jM51541c;
        AbstractC22676k.m65750j(brushBackground, "$this$brushBackground");
        C17909s c17909s = AbstractC17911t.f69612b;
        int i13 = a.f54259c[enumC3560b.ordinal()];
        if (i13 != 1) {
            jM51541c = i13 != 2 ? C17919x.m51541c(0.05f, brushBackground.getWhite5()) : C17919x.m51541c(0.05f, brushBackground.getAccentNegativeTrend());
        } else {
            jM51541c = C17919x.m51541c(0.05f, brushBackground.getAccentPositiveTrend());
        }
        return C17909s.m51483a(c17909s, AbstractC37056f.m118959K(new C17919x(jM51541c), new C17919x(AbstractC17918w0.m51517e(3422552064L))), 0.0f, 0.0f, 14);
    }
}
