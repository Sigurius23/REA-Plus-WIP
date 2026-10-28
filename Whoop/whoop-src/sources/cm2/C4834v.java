package cm2;

import am2.C1013d0;
import am2.C1015e0;
import am2.C1032n;
import am2.C1034o;
import am2.C1036p;
import am2.C1037p0;
import am2.C1047x;
import am2.C1048y;
import bm2.AbstractC3436e0;
import bm2.AbstractC3469q0;
import bm2.C3438f;
import bm2.C3445h0;
import bm2.C3448i0;
import bm2.C3458l1;
import bm2.C3470r;
import bm2.C3473s0;
import bm2.EnumC3461m1;
import bm2.EnumC3477u0;
import bm2.EnumC3479v0;
import c41.C4092p2;
import com.mapbox.common.HttpHeaders;
import com.whoop.coacheverywherecommon.models.AbstractC6219a;
import com.whoop.coacheverywherecommon.models.AiContextMetadata;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.cards.TextWithIllustrationCardModel;
import com.whoop.design.models.items.AdditionalInfoTextModel;
import com.whoop.design.models.items.ArticleTileCarouselModel;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.MenuItemModel;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.trends.data.model.BreakDownBarDtoV3;
import com.whoop.trends.data.model.CardioFitnessLevelModel;
import com.whoop.trends.data.model.ImageDisplay;
import com.whoop.trends.data.model.IntegrationsUpsellButtonDtoV3;
import com.whoop.trends.data.model.IntegrationsUpsellDtoV3;
import com.whoop.trends.data.model.LegendItemDtoV3;
import com.whoop.trends.data.model.ManualMeasurementSheet;
import com.whoop.trends.data.model.MeasurementBox;
import com.whoop.trends.data.model.MeasurementSection;
import com.whoop.trends.data.model.MetaData;
import com.whoop.trends.data.model.MetricEducationV3;
import com.whoop.trends.data.model.MetricsTrendKey;
import com.whoop.trends.data.model.ModalModel;
import com.whoop.trends.data.model.NavigationItemV3;
import com.whoop.trends.data.model.NavigationSectionV3;
import com.whoop.trends.data.model.RecordedData;
import com.whoop.trends.data.model.ReplaceDialog;
import com.whoop.trends.data.model.Sections;
import com.whoop.trends.data.model.SegmentalAnalysisModel;
import com.whoop.trends.data.model.SegmentsModel;
import com.whoop.trends.data.model.TimeSegmentDtoV3;
import com.whoop.trends.data.model.TimeSegmentLastUpdated;
import com.whoop.trends.data.model.TrendMetricDtoV3;
import com.whoop.trends.data.model.TrendsMenuItemDtoV3;
import ff1.AbstractC14427a;
import gz0.AbstractC16319p0;
import gz0.EnumC16313m0;
import h01.C16550q;
import h51.C16934f;
import hv1.C17675e;
import i11.C17863f;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j71.C21395c;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import jb1.C21536b;
import k21.C22157a;
import k21.C22160d;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.AbstractC22406r;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import or2.C28204u;
import or2.EnumC28166h0;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.C22949e;
import p294l3.C23246c;
import p294l3.C23254g;
import p702ch0.C4614e;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.AbstractC23608d;
import p716lb1.C23749z0;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import r21.C30885c;
import r32.AbstractC30912a;
import s01.C32048d;
import sl2.AbstractC32706a;
import ul2.EnumC35069b;
import uv0.AbstractC35283c;
import vl2.AbstractC36112e;
import vl2.AbstractC36125r;
import vl2.AbstractC36130w;
import vl2.C36113f;
import vl2.C36120m;
import vl2.C36133z;
import vl2.EnumC36106a;
import vl2.InterfaceC36116i;
import wb3.AbstractC37056f;
import y71.AbstractC39279l;
import y71.C39274g;
import y71.C39282o;
import zr2.AbstractC41071b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: cm2.v */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0090\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J#\u0010/\u001a\u00020.2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010-\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b/\u00100J'\u00103\u001a\u0002012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u00142\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J'\u00106\u001a\u00020.2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00142\b\u00105\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b6\u00107J\u0017\u0010:\u001a\u0004\u0018\u000109*\u0004\u0018\u000108H\u0002¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020.2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010<\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b=\u00100J\u0019\u0010@\u001a\u0004\u0018\u00010?2\u0006\u0010>\u001a\u00020\u0010H\u0002¢\u0006\u0004\b@\u0010AJ\u0013\u0010D\u001a\u00020C*\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u0013\u0010H\u001a\u00020G*\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u0013\u0010L\u001a\u00020K*\u00020JH\u0002¢\u0006\u0004\bL\u0010MJI\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020S0R0\u00142\b\u0010N\u001a\u0004\u0018\u00010?2\u0006\u0010O\u001a\u00020?2\u0006\u0010P\u001a\u00020?2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020&0\u0014H\u0002¢\u0006\u0004\bT\u0010UJ#\u0010Y\u001a\u00020X*\u00020V2\u0006\u0010W\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010^\u001a\u00020]2\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0004\b^\u0010_J\u0015\u0010b\u001a\u00020a2\u0006\u0010>\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u0017\u0010e\u001a\u00020d2\u0006\u0010\"\u001a\u00020\u0010H\u0000¢\u0006\u0004\be\u0010fJ)\u0010k\u001a\u00020j2\b\u0010g\u001a\u0004\u0018\u00010?2\u0006\u0010h\u001a\u00020]2\b\b\u0002\u0010i\u001a\u00020]¢\u0006\u0004\bk\u0010lR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010sR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010u¨\u0006v"}, m65681d2 = {"Lcm2/v;", "", "Lcm2/c;", "breakdownBarHelper", "Lcm2/x;", "trendsColorHelper", "Lcm2/a;", "allReportsReducer", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lzr2/a;", "dateAndTimeProvider", "Lcm2/t;", "trendMenuSheetReducer", "<init>", "(Lcm2/c;Lcm2/x;Lcm2/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lzr2/a;Lcm2/t;)V", "Lvl2/w$c;", "Lcm2/a0$d;", "v", "(Lvl2/w$c;)Lcm2/a0$d;", "", "Lvl2/m;", "trendMenus", "Ljb1/a;", "designItemReducer", "Lam2/y;", "r", "(Ljava/util/List;Ljb1/a;)Ljava/util/List;", "Lam2/d0;", "metaData", "Lcm2/r;", "q", "(Lvl2/w$c;Ljb1/a;Lam2/d0;)Lcm2/r;", "Lcom/whoop/trends/data/model/CardioFitnessLevelModel;", "model", "Lbm2/f;", "p", "(Lcom/whoop/trends/data/model/CardioFitnessLevelModel;)Lbm2/f;", "", "info", "Ll3/g;", "d", "(Ljava/lang/String;)Ll3/g;", "Lvl2/z;", "scrubStates", "metricValue", "Lcom/whoop/design/util/TextResource;", "g", "(Lvl2/z;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;", "Lbm2/u0;", "trendDirection", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/util/List;Lbm2/u0;)Lbm2/u0;", "trendDisplay", "i", "(Ljava/util/List;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;", "Lcom/whoop/trends/data/model/TrendMetricDtoV3;", "Ly81/e;", "l", "(Lcom/whoop/trends/data/model/TrendMetricDtoV3;)Ly81/e;", HttpHeaders.DATE, "f", "domainResult", "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "n", "(Lvl2/w$c;)Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;", "Lk21/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lcom/whoop/trends/data/model/IntegrationsUpsellDtoV3;)Lk21/d;", "Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;", "Ly71/o;", "x", "(Lcom/whoop/trends/data/model/TrendsMenuItemDtoV3;)Ly71/o;", "Lcom/whoop/trends/data/model/ManualMeasurementSheet;", "Lcm2/g;", "t", "(Lcom/whoop/trends/data/model/ManualMeasurementSheet;)Lcm2/g;", "weekSegment", "monthSegment", "sixMonthSegment", "elementNames", "Ll83/k;", "Lvl2/a;", "e", "(Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/trends/data/model/RecordedData;", "reducer", "Lcm2/m;", "u", "(Lcom/whoop/trends/data/model/RecordedData;Ljb1/a;Lam2/d0;)Lcm2/m;", "Lor2/h0;", "graphKey", "", "s", "(Lor2/h0;)Z", "Lvl2/w;", "Lcm2/a0;", "o", "(Lvl2/w;)Lcm2/a0;", "", "m", "(Lvl2/w$c;)I", "timeSegment", "isScrubbing", "useSmallType", "Lbm2/v0;", "j", "(Lcom/whoop/trends/data/model/TimeSegmentDtoV3;ZZ)Lbm2/v0;", "a", "Lcm2/c;", "b", "Lcm2/x;", "c", "Lcm2/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lzr2/a;", "Lcm2/t;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4834v {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C4815c breakdownBarHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C4836x trendsColorHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C4812a allReportsReducer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C4832t trendMenuSheetReducer;

    /* JADX INFO: renamed from: cm2.v$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f19899a;

        static {
            int[] iArr = new int[EnumC36106a.values().length];
            try {
                iArr[EnumC36106a.WEEKLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36106a.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC36106a.SIX_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC36106a.ALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC36106a.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f19899a = iArr;
        }
    }

    /* JADX INFO: renamed from: cm2.v$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f19900w = new b();

        /* JADX INFO: renamed from: a */
        public final long m15296a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15296a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.v$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final c f19901w = new c();

        /* JADX INFO: renamed from: a */
        public final long m15297a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15297a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.v$d */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final d f19902w = new d();

        /* JADX INFO: renamed from: a */
        public final long m15298a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15298a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.v$e */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final e f19903w = new e();

        /* JADX INFO: renamed from: a */
        public final long m15299a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15299a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.v$f */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final f f19904w = new f();

        /* JADX INFO: renamed from: a */
        public final long m15300a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15300a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.v$g */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final g f19905w = new g();

        /* JADX INFO: renamed from: a */
        public final long m15301a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15301a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.v$h */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final h f19906w = new h();

        /* JADX INFO: renamed from: a */
        public final long m15302a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getWhite30();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15302a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.v$i */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final i f19907w = new i();

        /* JADX INFO: renamed from: a */
        public final long m15303a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandBlack();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m15303a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: cm2.v$j */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ boolean f19908w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ EnumC28166h0 f19909x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC36130w.c f19910y;

        public j(boolean z4, EnumC28166h0 enumC28166h0, AbstractC36130w.c cVar) {
            this.f19908w = z4;
            this.f19909x = enumC28166h0;
            this.f19910y = cVar;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(InterfaceC25312u it) {
            AbstractC22676k.m65750j(it, "it");
            return AbstractC4817e.m15204a((C21395c) it, this.f19908w, this.f19909x, this.f19910y.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String());
        }
    }

    /* JADX INFO: renamed from: cm2.v$k */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f19911w;

        public k(Function1 function1) {
            this.f19911w = function1;
        }

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC25312u invoke(DesignSystemModel it) {
            AbstractC22676k.m65750j(it, "it");
            return (InterfaceC25312u) this.f19911w.invoke((MeasurementBox) it);
        }
    }

    public C4834v(C4815c breakdownBarHelper, C4836x trendsColorHelper, C4812a allReportsReducer, FeatureFlagChecker featureFlagChecker, InterfaceC41070a dateAndTimeProvider, C4832t trendMenuSheetReducer) {
        AbstractC22676k.m65750j(breakdownBarHelper, "breakdownBarHelper");
        AbstractC22676k.m65750j(trendsColorHelper, "trendsColorHelper");
        AbstractC22676k.m65750j(allReportsReducer, "allReportsReducer");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(trendMenuSheetReducer, "trendMenuSheetReducer");
        this.breakdownBarHelper = breakdownBarHelper;
        this.trendsColorHelper = trendsColorHelper;
        this.allReportsReducer = allReportsReducer;
        this.featureFlagChecker = featureFlagChecker;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.trendMenuSheetReducer = trendMenuSheetReducer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C4820h m15269A(C4834v c4834v, MeasurementBox model) {
        EnumC16313m0 enumC16313m0;
        AbstractC22676k.m65750j(model, "model");
        String id4 = model.getId();
        String iconUrl = model.getIconUrl();
        AbstractC22403o abstractC22403oM64503l = iconUrl != null ? AbstractC22404p.m64503l(iconUrl) : null;
        String icon = model.getIcon();
        if (icon == null) {
            icon = "";
        }
        EnumC16313m0 enumC16313m1 = EnumC16313m0.NOTES_EDIT;
        EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
        int length = enumC16313m0ArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC16313m0 = null;
                break;
            }
            enumC16313m0 = enumC16313m0ArrValues[i13];
            if (AbstractC22676k.m65745e(enumC16313m0.name(), icon)) {
                break;
            }
            i13++;
        }
        if (enumC16313m0 != null) {
            enumC16313m1 = enumC16313m0;
        }
        TextResource textResourceM21278l = AbstractC8693b.m21278l(String.valueOf(AbstractC3436e0.m9974Z0(model.getWeight(), 1)));
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSubtitle());
        ManualMeasurementSheet weightDetailsScreen = model.getWeightDetailsScreen();
        return new C4820h(id4, abstractC22403oM64503l, enumC16313m1, textResourceM21278l, AbstractC8693b.m21278l(model.getMetricUnit()), textResourceM21278l2, weightDetailsScreen != null ? c4834v.m15286t(weightDetailsScreen) : null, model.getSource());
    }

    /* JADX INFO: renamed from: d */
    private final C23254g m15273d(String info) {
        StringBuilder sb4 = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb4.append(info);
        String string = sb4.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            arrayList2.add(((C23246c) arrayList.get(i13)).m67297a(sb4.length()));
        }
        return new C23254g(string, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX INFO: renamed from: e */
    private final List<C23465k> m15274e(TimeSegmentDtoV3 weekSegment, TimeSegmentDtoV3 monthSegment, TimeSegmentDtoV3 sixMonthSegment, List<String> elementNames) {
        C23465k c23465k;
        List<String> list = elementNames;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        int i13 = 0;
        int i14 = 0;
        for (Object obj : list) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            String str = (String) obj;
            if (i14 == 0) {
                c23465k = new C23465k(str, EnumC36106a.WEEKLY);
            } else if (i14 != 1) {
                c23465k = i14 != 2 ? new C23465k(str, EnumC36106a.NONE) : new C23465k(str, EnumC36106a.SIX_MONTH);
            } else {
                c23465k = new C23465k(str, EnumC36106a.MONTHLY);
            }
            arrayList.add(c23465k);
            i14 = i15;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            int i16 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2 && !sixMonthSegment.isHidden()) {
                        arrayList2.add(obj2);
                    }
                } else if (!monthSegment.isHidden()) {
                    arrayList2.add(obj2);
                }
            } else if (weekSegment != null && !weekSegment.isHidden()) {
                arrayList2.add(obj2);
            }
            i13 = i16;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: f */
    private final TextResource m15275f(C36133z scrubStates, String date) {
        TextResource textResourceM21278l = (scrubStates == null || AbstractC22676k.m65745e(scrubStates.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), AbstractC8693b.m21267a())) ? AbstractC8693b.m21278l(date) : scrubStates.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
        return textResourceM21278l == null ? AbstractC8693b.m21267a() : textResourceM21278l;
    }

    /* JADX INFO: renamed from: g */
    private final TextResource m15276g(C36133z scrubStates, String metricValue) {
        TextResource textResourceM21278l = (scrubStates == null || AbstractC22676k.m65745e(scrubStates.getKeyMetricValue(), AbstractC8693b.m21267a())) ? AbstractC8693b.m21278l(metricValue) : scrubStates.getKeyMetricValue();
        return textResourceM21278l == null ? AbstractC8693b.m21267a() : textResourceM21278l;
    }

    /* JADX INFO: renamed from: h */
    private final EnumC3477u0 m15277h(List<C36133z> scrubStates, EnumC3477u0 trendDirection) {
        if ((scrubStates != null ? (C36133z) AbstractC25265s.m74102I0(0, scrubStates) : null) != null) {
            C36133z c36133z = (C36133z) AbstractC25265s.m74102I0(0, scrubStates);
            if (!AbstractC22676k.m65745e(c36133z != null ? c36133z.getKeyMetricValue() : null, AbstractC8693b.m21267a())) {
                return EnumC3477u0.NONE;
            }
        }
        return trendDirection;
    }

    /* JADX INFO: renamed from: i */
    private final TextResource m15278i(List<C36133z> scrubStates, String trendDisplay) {
        if (AbstractC25265s.m74102I0(0, scrubStates) != null) {
            C36133z c36133z = (C36133z) AbstractC25265s.m74102I0(0, scrubStates);
            if (!AbstractC22676k.m65745e(c36133z != null ? c36133z.getKeyMetricValue() : null, AbstractC8693b.m21267a())) {
                return AbstractC8693b.m21267a();
            }
        }
        return AbstractC8693b.m21278l(trendDisplay);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ EnumC3479v0 m15279k(C4834v c4834v, TimeSegmentDtoV3 timeSegmentDtoV3, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        return c4834v.m15293j(timeSegmentDtoV3, z4, z13);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC39332e m15280l(TrendMetricDtoV3 trendMetricDtoV3) {
        MetricsTrendKey metricsTrendKey;
        C4836x c4836x = this.trendsColorHelper;
        if (trendMetricDtoV3 == null || (metricsTrendKey = trendMetricDtoV3.getMetricsTrendKey()) == null) {
            metricsTrendKey = MetricsTrendKey.NONE;
        }
        return C4836x.m15312c(c4836x, metricsTrendKey, null, false, false, 14, null);
    }

    /* JADX INFO: renamed from: n */
    private final TimeSegmentDtoV3 m15281n(AbstractC36130w.c domainResult) {
        int i13 = a.f19899a[domainResult.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String().ordinal()];
        if (i13 == 1) {
            return domainResult.getWeekGraph();
        }
        if (i13 == 2) {
            return domainResult.getMonthGraph();
        }
        if (i13 == 3) {
            return domainResult.getSixMonthGraph();
        }
        if (i13 == 4) {
            return domainResult.getAllTimeGraph();
        }
        if (i13 == 5) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private final C3438f m15282p(CardioFitnessLevelModel model) {
        Object c3448i0;
        String buttonTitle;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(model.getTitle());
        EnumC16313m0 icon = model.getIcon();
        Integer score = model.getMeter().getScore();
        List<SegmentsModel> segments = model.getMeter().getSegments();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(segments, 10));
        Iterator<T> it = segments.iterator();
        while (true) {
            c3448i0 = null;
            if (!it.hasNext()) {
                break;
            }
            SegmentsModel segmentsModel = (SegmentsModel) it.next();
            String style = segmentsModel.getStyle();
            EnumC3461m1 enumC3461m1 = EnumC3461m1.VO2_MAX_1;
            for (EnumC3461m1 enumC3461m2 : EnumC3461m1.values()) {
                if (AbstractC22676k.m65745e(enumC3461m2.name(), style)) {
                    c3448i0 = enumC3461m2;
                    break;
                }
            }
            arrayList.add(new C3473s0(c3448i0 == null ? enumC3461m1 : c3448i0, (float) segmentsModel.getWidthPercent(), segmentsModel.getLowerBound(), segmentsModel.getUpperBound(), AbstractC8693b.m21278l(segmentsModel.getDisplayValue())));
        }
        C3445h0 c3445h0 = new C3445h0(score, arrayList);
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(model.getSubtitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(model.getSubtitleSuffix());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(model.getDescription());
        ModalModel modal = model.getModal();
        if (modal != null && (buttonTitle = modal.getButtonTitle()) != null && buttonTitle.length() > 0) {
            TextResource textResourceM21278l5 = AbstractC8693b.m21278l(modal.getTitle());
            TextResource textResourceM21278l6 = AbstractC8693b.m21278l(modal.getButtonTitle());
            String infoModalContent = modal.getInfoModalContent();
            if (infoModalContent == null) {
                infoModalContent = "";
            }
            c3448i0 = new C3448i0(textResourceM21278l5, textResourceM21278l6, m15273d(infoModalContent));
        }
        return new C3438f(textResourceM21278l, icon, c3445h0, textResourceM21278l2, textResourceM21278l3, textResourceM21278l4, c3448i0, null, 128, null);
    }

    /* JADX INFO: renamed from: q */
    private final AbstractC4830r m15283q(AbstractC36130w.c cVar, C21535a c21535a, C1013d0 c1013d0) {
        AbstractC36112e abstractC36112eM114935q = cVar.getMeasurementRecordDeleteState();
        if (abstractC36112eM114935q instanceof AbstractC36112e.c) {
            return AbstractC4830r.c.f19882a;
        }
        if (abstractC36112eM114935q instanceof AbstractC36112e.b) {
            return AbstractC4830r.b.f19881a;
        }
        if (abstractC36112eM114935q instanceof AbstractC36112e.a) {
            return new AbstractC4830r.a(((AbstractC36112e.a) abstractC36112eM114935q).getId());
        }
        if (abstractC36112eM114935q instanceof AbstractC36112e.e) {
            return AbstractC4830r.d.f19883a;
        }
        if (!(abstractC36112eM114935q instanceof AbstractC36112e.d)) {
            throw new NoWhenBranchMatchedException();
        }
        C36113f c36113fM114931m = cVar.getManualMeasurementRecords();
        if (c36113fM114931m != null) {
            return this.allReportsReducer.m15191a(c36113fM114931m, c21535a, this.trendMenuSheetReducer, c1013d0);
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    private final List<C1048y> m15284r(List<C36120m> trendMenus, C21535a designItemReducer) {
        List<C36120m> list = trendMenus;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            C17675e c17675eM15264g = null;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            C36120m c36120m = (C36120m) obj;
            InterfaceC25312u interfaceC25312uM60541h = designItemReducer.m60541h(c36120m.getTrendMenuItem());
            AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.design.atomic.organism.menuitem.MenuItemState");
            C39282o c39282o = (C39282o) interfaceC25312uM60541h;
            TextResource textResourceM114789b = c36120m.getTrendMenuDetailText();
            InterfaceC36116i interfaceC36116iM114788a = c36120m.getMenuSheetDomainState();
            if (interfaceC36116iM114788a != null) {
                c17675eM15264g = C4832t.m15264g(this.trendMenuSheetReducer, interfaceC36116iM114788a, null, 2, null);
            }
            arrayList.add(new C1048y(i13, c39282o, textResourceM114789b, c17675eM15264g));
            i13 = i14;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: s */
    private final boolean m15285s(EnumC28166h0 graphKey) {
        C1015e0 c1015e0 = C1015e0.f3803a;
        return c1015e0.m2726c().contains(graphKey) || c1015e0.m2725b().contains(graphKey);
    }

    /* JADX INFO: renamed from: t */
    private final C4819g m15286t(ManualMeasurementSheet manualMeasurementSheet) throws ParseException {
        EnumC4822j enumC4822j;
        C4826n c4826n;
        DateTime dateTime = DateTime.parse(manualMeasurementSheet.getTimestamp(), C28204u.INSTANCE.m85363f());
        InterfaceC41070a interfaceC41070a = this.dateAndTimeProvider;
        AbstractC22676k.m65747g(dateTime);
        LocalDateTime localDateTimeM133371d = AbstractC41071b.m133371d(interfaceC41070a, dateTime);
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(manualMeasurementSheet.getStartDateTimestamp());
        boolean zM65745e = AbstractC22676k.m65745e(manualMeasurementSheet.getMetricType(), "KG");
        double weightKG = manualMeasurementSheet.getWeightKG();
        if (!zM65745e) {
            weightKG = AbstractC3436e0.m9970X0(weightKG);
        }
        Double leanBodyMassKG = (AbstractC22676k.m65745e(manualMeasurementSheet.getMetricType(), "KG") || manualMeasurementSheet.getLeanBodyMassKG() == null) ? manualMeasurementSheet.getLeanBodyMassKG() : Double.valueOf(AbstractC3436e0.m9970X0(manualMeasurementSheet.getLeanBodyMassKG().doubleValue()));
        AbstractC22676k.m65747g(date);
        Double bodyFatPercent = manualMeasurementSheet.getBodyFatPercent();
        String metricType = manualMeasurementSheet.getMetricType();
        EnumC4822j enumC4822j2 = EnumC4822j.KG;
        EnumC4822j[] enumC4822jArrValues = EnumC4822j.values();
        int length = enumC4822jArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC4822j = null;
                break;
            }
            enumC4822j = enumC4822jArrValues[i13];
            if (AbstractC22676k.m65745e(enumC4822j.name(), metricType)) {
                break;
            }
            i13++;
        }
        EnumC4822j enumC4822j3 = enumC4822j == null ? enumC4822j2 : enumC4822j;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(manualMeasurementSheet.getBodyFatSuffix());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(manualMeasurementSheet.getLeanBodyMassSuffix());
        String source = manualMeasurementSheet.getSource();
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(manualMeasurementSheet.getSaveTitle());
        TextResource textResourceM21278l4 = AbstractC8693b.m21278l(manualMeasurementSheet.getDeleteTitle());
        ReplaceDialog replaceDialog = manualMeasurementSheet.getReplaceDialog();
        if (replaceDialog != null) {
            c4826n = new C4826n(AbstractC8693b.m21278l(replaceDialog.getTitle()), AbstractC8693b.m21278l(replaceDialog.getDescription()), AbstractC8693b.m21278l(replaceDialog.getStartingWeight()), AbstractC8693b.m21278l(replaceDialog.getPrimaryButtonTitle()), AbstractC8693b.m21278l(replaceDialog.getSecondaryButtonTitle()));
        } else {
            c4826n = null;
        }
        return new C4819g(localDateTimeM133371d, date, weightKG, bodyFatPercent, leanBodyMassKG, enumC4822j3, textResourceM21278l2, textResourceM21278l, c4826n, source, textResourceM21278l3, textResourceM21278l4);
    }

    /* JADX INFO: renamed from: u */
    private final AbstractC4825m m15287u(RecordedData recordedData, C21535a c21535a, C1013d0 c1013d0) {
        ManualMeasurementSheet manualMeasurementSheetCopy$default;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(recordedData.getNavigationBarTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(recordedData.getTitle());
        TextResource textResourceM21278l3 = AbstractC8693b.m21278l(recordedData.getSubtitle());
        C39282o c39282o = new C39282o(null, AbstractC8693b.m21278l(recordedData.getAddManualMeasurement().getTitle()), null, false, false, new AbstractC39279l.b(null, null, new C39274g(AbstractC16319p0.m46430a().getAction().getAdd(), null, 2, null), p745y81.Function1.m125323a(h.f19906w), null, null, null, null, null, null, null, false, 4083, null), false, null, null, recordedData.getAddManualMeasurement().getDestination(), false, null, null, null, null, 32221, null);
        ManualMeasurementSheet manualMeasurementUpdates = recordedData.getManualMeasurementUpdates();
        C4819g c4819gM15286t = (manualMeasurementUpdates == null || (manualMeasurementSheetCopy$default = ManualMeasurementSheet.copy$default(manualMeasurementUpdates, null, null, 0.0d, null, null, null, null, null, null, null, null, null, 3839, null)) == null) ? null : m15286t(manualMeasurementSheetCopy$default);
        Sections sections = recordedData.getSections();
        String nextToken = sections.getNextToken();
        List<MeasurementSection> records = sections.getRecords();
        ArrayList arrayList = new ArrayList();
        for (MeasurementSection measurementSection : records) {
            List listM118958J = AbstractC37056f.m118958J(new C4823k(measurementSection.getTitle(), AbstractC8693b.m21278l(measurementSection.getTitle())));
            List<DesignSystemModel> measurements = measurementSection.getMeasurements();
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(measurements, 10));
            Iterator<T> it = measurements.iterator();
            while (it.hasNext()) {
                InterfaceC25312u interfaceC25312uM60541h = c21535a.m60541h((DesignSystemModel) it.next());
                AbstractC22676k.m65748h(interfaceC25312uM60541h, "null cannot be cast to non-null type com.whoop.trends.viewmodel.MeasurementBoxViewState");
                C4820h c4820h = (C4820h) interfaceC25312uM60541h;
                arrayList2.add(new C4823k(c4820h.getId(), c4820h));
            }
            AbstractC25265s.m74141p0(arrayList, AbstractC25265s.m74129g1(listM118958J, arrayList2));
        }
        return new AbstractC4825m.c(new C4824l(textResourceM21278l, textResourceM21278l2, textResourceM21278l3, c39282o, c4819gM15286t, new C4831s(nextToken, arrayList), c1013d0));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049  */
    /* JADX WARN: Code duplicated, block: B:128:0x0292  */
    /* JADX WARN: Code duplicated, block: B:156:0x0346  */
    /* JADX WARN: Code duplicated, block: B:158:0x0350  */
    /* JADX WARN: Code duplicated, block: B:159:0x0357  */
    /* JADX WARN: Code duplicated, block: B:161:0x035d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0399  */
    /* JADX WARN: Code duplicated, block: B:305:0x067d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2, types: [c01.h] */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [j71.c] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [r21.c] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2, types: [s01.d] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r30v2, types: [h51.f] */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v4, types: [am2.o] */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r35v9 */
    /* JADX WARN: Type inference failed for: r36v4 */
    /* JADX WARN: Type inference failed for: r36v5, types: [bm2.r0] */
    /* JADX WARN: Type inference failed for: r36v6 */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r37v7 */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r39v4, types: [h01.q] */
    /* JADX WARN: Type inference failed for: r39v5 */
    /* JADX WARN: Type inference failed for: r39v6 */
    /* JADX WARN: Type inference failed for: r39v7, types: [kd1.o] */
    /* JADX WARN: Type inference failed for: r39v8 */
    /* JADX WARN: Type inference failed for: r40v4 */
    /* JADX WARN: Type inference failed for: r40v5, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r40v6 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /* JADX WARN: Type inference failed for: r44v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r44v5 */
    /* JADX WARN: Type inference failed for: r45v1 */
    /* JADX WARN: Type inference failed for: r45v2, types: [com.whoop.design.util.TextResource] */
    /* JADX WARN: Type inference failed for: r45v3 */
    /* JADX WARN: Type inference failed for: r47v1 */
    /* JADX WARN: Type inference failed for: r47v2, types: [vz0.b] */
    /* JADX WARN: Type inference failed for: r47v3 */
    /* JADX WARN: Type inference failed for: r50v1 */
    /* JADX WARN: Type inference failed for: r50v2, types: [ep0.j] */
    /* JADX WARN: Type inference failed for: r50v3 */
    /* JADX INFO: renamed from: v */
    private final AbstractC4813a0.d m15288v(AbstractC36130w.c cVar) {
        boolean z4;
        GraphModel graphModel;
        TimeSegmentDtoV3 timeSegmentDtoV3;
        int i13;
        int i14;
        List list;
        List<TrendMetricDtoV3> metrics;
        TextResource textResourceM21267a;
        InterfaceC39332e interfaceC39332eM15280l;
        Object next;
        TextResource textResourceM21278l;
        TextResource textResourceM21267a2;
        ?? r44;
        ?? r26;
        String vow;
        ?? r29;
        Object obj;
        AbstractC4825m abstractC4825mM15287u;
        ?? r39;
        ?? r45;
        AiContextMetadata aiContextMetadata;
        IntegrationsUpsellDtoV3 integrationsUpsellDtoV3M114929k;
        String imageDescription;
        String imageUrl;
        DateSelectorModel datePicker;
        String nextDateTime;
        DateSelectorModel datePicker2;
        String prevDateTime;
        DateSelectorModel datePicker3;
        String nextDateTime2;
        DateSelectorModel datePicker4;
        String prevDateTime2;
        DateSelectorModel datePicker5;
        String currentDateRange;
        String name;
        GraphModel graphModel2;
        TextResource textResourceM15275f;
        List<TrendMetricDtoV3> metrics2;
        TrendMetricDtoV3 trendMetricDtoV3;
        EnumC3477u0 trendDirection;
        TextResource textResourceM21267a3;
        InterfaceC39332e interfaceC39332eM15280l2;
        List<TrendMetricDtoV3> metrics3;
        List<TrendMetricDtoV3> metrics4;
        List<TrendMetricDtoV3> metrics5;
        TrendMetricDtoV3 trendMetricDtoV4;
        String metricUnits;
        List<TrendMetricDtoV3> metrics6;
        TrendMetricDtoV3 trendMetricDtoV5;
        List<TrendMetricDtoV3> metrics7;
        TrendMetricDtoV3 trendMetricDtoV6;
        List<C23465k> listM15274e = m15274e(cVar.getWeekGraph(), cVar.getMonthGraph(), cVar.getSixMonthGraph(), cVar.getSegmentController().getElementNames());
        TimeSegmentDtoV3 timeSegmentDtoV3M15281n = m15281n(cVar);
        int i15 = 0;
        GraphModel graphModel3 = null;
        if (AbstractC25265s.m74102I0(0, cVar.m114909A()) == null) {
            z4 = false;
        } else {
            C36133z c36133z = (C36133z) AbstractC25265s.m74102I0(0, cVar.m114909A());
            if (AbstractC22676k.m65745e(c36133z != null ? c36133z.getKeyMetricValue() : null, AbstractC8693b.m21267a())) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        EnumC28166h0 enumC28166h0M114926h = cVar.getGraphKey();
        boolean z13 = z4;
        C21535a c21535aM60554d = AbstractC21537c.m60554d(new C4614e(z4, enumC28166h0M114926h, cVar, this, 1));
        C1013d0 c1013d0 = new C1013d0(cVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), cVar.getGraphKey(), cVar.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), cVar.getMeasurementId());
        AbstractC6721d.a aVar = new AbstractC6721d.a(new TextResource.C8688b(AbstractC32706a.f135964r, null, 2, null), null, Integer.valueOf(AbstractC16319p0.m46430a().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getNavigationBackward()), new TextResource.C8688b(AbstractC35283c.f150167E, null, 2, null).toString(), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null);
        Object objM74102I0 = AbstractC25265s.m74102I0(0, cVar.m114909A());
        List<InterfaceC25312u> listM60540g = C25271y.f99162w;
        int i16 = 10;
        if (objM74102I0 == null) {
            graphModel = null;
            if (timeSegmentDtoV3M15281n != null || (metrics = timeSegmentDtoV3M15281n.getMetrics()) == null) {
                timeSegmentDtoV3 = timeSegmentDtoV3M15281n;
                i13 = 10;
                i14 = 0;
                list = listM60540g;
            } else {
                List<TrendMetricDtoV3> list2 = metrics;
                int i17 = 10;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                int i18 = 0;
                for (Object obj2 : list2) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    TrendMetricDtoV3 trendMetricDtoV7 = (TrendMetricDtoV3) obj2;
                    TextResource textResourceM15275f2 = m15275f((C36133z) AbstractC25265s.m74102I0(i18, cVar.m114909A()), trendMetricDtoV7.getMetricName());
                    TextResource textResourceM15276g = m15276g((C36133z) AbstractC25265s.m74102I0(i18, cVar.m114909A()), trendMetricDtoV7.getMetricValue());
                    EnumC3477u0 enumC3477u0M15277h = m15277h(cVar.m114909A(), trendMetricDtoV7.getTrendDirection());
                    String metricUnits2 = trendMetricDtoV7.getMetricUnits();
                    if (metricUnits2 == null || (textResourceM21267a = AbstractC8693b.m21278l(metricUnits2)) == null) {
                        textResourceM21267a = AbstractC8693b.m21267a();
                    }
                    TextResource textResource = textResourceM21267a;
                    TextResource textResourceM15278i = m15278i(cVar.m114909A(), trendMetricDtoV7.getTrendText());
                    if (AbstractC25265s.m74102I0(0, cVar.m114909A()) != null) {
                        C36133z c36133z2 = (C36133z) AbstractC25265s.m74102I0(i18, cVar.m114909A());
                        if (!AbstractC22676k.m65745e(c36133z2 != null ? c36133z2.getKeyMetricValue() : null, AbstractC8693b.m21267a())) {
                            interfaceC39332eM15280l = m15280l(trendMetricDtoV7);
                            if (interfaceC39332eM15280l == null) {
                                interfaceC39332eM15280l = p745y81.Function1.m125323a(d.f19902w);
                            }
                        } else if (timeSegmentDtoV3M15281n.getMetrics().size() == 1) {
                            interfaceC39332eM15280l = p745y81.Function1.m125323a(e.f19903w);
                        } else {
                            interfaceC39332eM15280l = m15280l(trendMetricDtoV7);
                            if (interfaceC39332eM15280l == null) {
                                interfaceC39332eM15280l = p745y81.Function1.m125323a(f.f19904w);
                            }
                        }
                    } else if (timeSegmentDtoV3M15281n.getMetrics().size() == 1) {
                        interfaceC39332eM15280l = p745y81.Function1.m125323a(e.f19903w);
                    } else {
                        interfaceC39332eM15280l = m15280l(trendMetricDtoV7);
                        if (interfaceC39332eM15280l == null) {
                            interfaceC39332eM15280l = p745y81.Function1.m125323a(f.f19904w);
                        }
                    }
                    InterfaceC39332e interfaceC39332e = interfaceC39332eM15280l;
                    TimeSegmentDtoV3 timeSegmentDtoV4 = timeSegmentDtoV3M15281n;
                    arrayList.add(new C3458l1(textResourceM15275f2, textResourceM15276g, textResource, enumC3477u0M15277h, trendMetricDtoV7.getTrendStyle(), textResourceM15278i, interfaceC39332e, null, null, m15279k(this, timeSegmentDtoV4, false, false, 4, null), 384, null));
                    i17 = i17;
                    timeSegmentDtoV3M15281n = timeSegmentDtoV4;
                    i18 = i19;
                }
                timeSegmentDtoV3 = timeSegmentDtoV3M15281n;
                i14 = 0;
                i13 = i17;
                list = arrayList;
            }
        } else {
            C36133z c36133z3 = (C36133z) AbstractC25265s.m74102I0(0, cVar.m114909A());
            if (AbstractC22676k.m65745e(c36133z3 != null ? c36133z3.getKeyMetricValue() : null, AbstractC8693b.m21267a())) {
                graphModel = null;
                if (timeSegmentDtoV3M15281n != null) {
                    timeSegmentDtoV3 = timeSegmentDtoV3M15281n;
                    i13 = 10;
                    i14 = 0;
                    list = listM60540g;
                } else {
                    timeSegmentDtoV3 = timeSegmentDtoV3M15281n;
                    i13 = 10;
                    i14 = 0;
                    list = listM60540g;
                }
            } else {
                List<C36133z> listM114909A = cVar.m114909A();
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(listM114909A, 10));
                int i24 = 0;
                for (Object obj3 : listM114909A) {
                    int i25 = i24 + 1;
                    if (i24 < 0) {
                        ?? r18 = graphModel3;
                        AbstractC37056f.m118977d0();
                        throw r18;
                    }
                    C36133z c36133z4 = (C36133z) obj3;
                    if (i24 != 0) {
                        textResourceM15275f = AbstractC8693b.m21267a();
                        graphModel2 = graphModel3;
                    } else {
                        graphModel2 = graphModel3;
                        textResourceM15275f = m15275f(c36133z4, (timeSegmentDtoV3M15281n == null || (metrics2 = timeSegmentDtoV3M15281n.getMetrics()) == null || (trendMetricDtoV3 = (TrendMetricDtoV3) AbstractC25265s.m74102I0(i24, metrics2)) == null) ? graphModel2 : trendMetricDtoV3.getMetricName());
                    }
                    TextResource textResourceM15276g2 = m15276g(c36133z4, (timeSegmentDtoV3M15281n == null || (metrics7 = timeSegmentDtoV3M15281n.getMetrics()) == null || (trendMetricDtoV6 = (TrendMetricDtoV3) AbstractC25265s.m74102I0(i24, metrics7)) == null) ? graphModel2 : trendMetricDtoV6.getMetricValue());
                    List<C36133z> listM114909A2 = cVar.m114909A();
                    if (timeSegmentDtoV3M15281n == null || (metrics6 = timeSegmentDtoV3M15281n.getMetrics()) == null || (trendMetricDtoV5 = (TrendMetricDtoV3) AbstractC25265s.m74102I0(i24, metrics6)) == null || (trendDirection = trendMetricDtoV5.getTrendDirection()) == null) {
                        trendDirection = EnumC3477u0.NO_CHANGE;
                    }
                    EnumC3477u0 enumC3477u0M15277h2 = m15277h(listM114909A2, trendDirection);
                    EnumC28166h0 enumC28166h0 = EnumC28166h0.STRESS;
                    if (enumC28166h0M114926h == enumC28166h0 || enumC28166h0M114926h == EnumC28166h0.STRESS_DURING_NON_STRAIN || enumC28166h0M114926h == EnumC28166h0.STRESS_DURING_SLEEP) {
                        textResourceM21267a3 = AbstractC8693b.m21267a();
                    } else if (enumC28166h0M114926h == EnumC28166h0.HOURS_V_NEED) {
                        textResourceM21267a3 = c36133z4.getUnit();
                        if (textResourceM21267a3 == null) {
                            textResourceM21267a3 = AbstractC8693b.m21267a();
                        }
                    } else if (timeSegmentDtoV3M15281n == null || (metrics5 = timeSegmentDtoV3M15281n.getMetrics()) == null || (trendMetricDtoV4 = (TrendMetricDtoV3) AbstractC25265s.m74102I0(i15, metrics5)) == null || (metricUnits = trendMetricDtoV4.getMetricUnits()) == null || (textResourceM21267a3 = AbstractC8693b.m21278l(metricUnits)) == null) {
                        textResourceM21267a3 = AbstractC8693b.m21267a();
                    }
                    TextResource textResource2 = textResourceM21267a3;
                    TextResource footer = c36133z4.getFooter();
                    if (footer == null) {
                        footer = AbstractC8693b.m21267a();
                    }
                    TextResource textResource3 = footer;
                    if (!AbstractC22676k.m65745e(c36133z4.getKeyMetricValue(), AbstractC8693b.m21267a())) {
                        interfaceC39332eM15280l2 = c36133z4.getKeyMetricColor();
                    } else if (timeSegmentDtoV3M15281n == null || (metrics4 = timeSegmentDtoV3M15281n.getMetrics()) == null || metrics4.size() != 1) {
                        interfaceC39332eM15280l2 = m15280l((timeSegmentDtoV3M15281n == null || (metrics3 = timeSegmentDtoV3M15281n.getMetrics()) == null) ? graphModel2 : (TrendMetricDtoV3) AbstractC25265s.m74102I0(i24, metrics3));
                        if (interfaceC39332eM15280l2 == null) {
                            interfaceC39332eM15280l2 = p745y81.Function1.m125323a(c.f19901w);
                        }
                    } else {
                        interfaceC39332eM15280l2 = p745y81.Function1.m125323a(b.f19900w);
                    }
                    InterfaceC39332e interfaceC39332e2 = interfaceC39332eM15280l2;
                    TextResource phaseLabelValue = c36133z4.getPhaseLabelValue();
                    if (phaseLabelValue == null) {
                        phaseLabelValue = AbstractC8693b.m21267a();
                    }
                    arrayList2.add(new C3458l1(textResourceM15275f, textResourceM15276g2, textResource2, enumC3477u0M15277h2, EnumC35069b.NONE, textResource3, interfaceC39332e2, phaseLabelValue, c36133z4.getPhaseLabelColor(), m15293j(timeSegmentDtoV3M15281n, true, cVar.getGraphKey() == EnumC28166h0.WHOOP_AGE || cVar.getGraphKey() == EnumC28166h0.RESTORATIVE_SLEEP || cVar.getGraphKey() == enumC28166h0 || cVar.getGraphKey() == EnumC28166h0.STRESS_DURING_NON_STRAIN || cVar.getGraphKey() == EnumC28166h0.STRESS_DURING_SLEEP || cVar.getGraphKey() == EnumC28166h0.BODY_COMPOSITION || cVar.getGraphKey() == EnumC28166h0.HR_ZONES_ALL || cVar.getGraphKey() == EnumC28166h0.HR_ZONES_1_3 || cVar.getGraphKey() == EnumC28166h0.HR_ZONES_4_5 || cVar.getGraphKey() == EnumC28166h0.HOURS_V_NEED)));
                    i24 = i25;
                    graphModel3 = graphModel2;
                    i16 = 10;
                    i15 = 0;
                }
                graphModel = graphModel3;
                timeSegmentDtoV3 = timeSegmentDtoV3M15281n;
                i14 = i15;
                i13 = i16;
                list = arrayList2;
            }
        }
        TextResource textResourceM21267a4 = AbstractC8693b.m21267a();
        C1047x c1047x = new C1047x(listM15274e, m15294m(cVar));
        List<InterfaceC25312u> listM15207b = AbstractC4818f.m15207b(cVar.m114940v(), enumC28166h0M114926h);
        C39282o.Companion companion = C39282o.INSTANCE;
        List<NavigationSectionV3> listM114940v = cVar.m114940v();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = listM114940v.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList3, ((NavigationSectionV3) it.next()).getNavigationItems());
        }
        Iterator it3 = arrayList3.iterator();
        do {
            if (!it3.hasNext()) {
                next = graphModel;
                break;
            }
            next = it3.next();
        } while (!AbstractC22676k.m65745e(((NavigationItemV3) next).getGraphKey().getTrendName(), cVar.getGraphKey().getTrendName()));
        NavigationItemV3 navigationItemV3 = (NavigationItemV3) next;
        if (navigationItemV3 == null || (name = navigationItemV3.getName()) == null || (textResourceM21278l = AbstractC8693b.m21278l(name)) == null) {
            textResourceM21278l = AbstractC8693b.m21278l(String.valueOf(cVar.getGraphKey()));
        }
        C3470r c3470r = new C3470r(listM15207b, C39282o.Companion.m125229d(companion, textResourceM21278l, null, null, null, null, AbstractC4818f.m15206a(enumC28166h0M114926h), null, null, null, null, null, null, null, p745y81.Function1.m125323a(i.f19907w), false, false, null, false, null, null, cVar.getGraphKey(), false, null, 7331806, null));
        C22949e c22949e = AbstractC22977m.f90651b;
        if (timeSegmentDtoV3 == null || (datePicker5 = timeSegmentDtoV3.getDatePicker()) == null || (currentDateRange = datePicker5.getCurrentDateRange()) == null || (textResourceM21267a2 = AbstractC8693b.m21278l(currentDateRange)) == null) {
            textResourceM21267a2 = AbstractC8693b.m21267a();
        }
        C17863f c17863f = new C17863f(c22949e, textResourceM21267a2, (timeSegmentDtoV3 == null || (datePicker4 = timeSegmentDtoV3.getDatePicker()) == null || (prevDateTime2 = datePicker4.getPrevDateTime()) == null) ? i14 : prevDateTime2.length() > 0 ? 1 : i14, (timeSegmentDtoV3 == null || (datePicker2 = timeSegmentDtoV3.getDatePicker()) == null || (prevDateTime = datePicker2.getPrevDateTime()) == null) ? "" : prevDateTime, (timeSegmentDtoV3 == null || (datePicker3 = timeSegmentDtoV3.getDatePicker()) == null || (nextDateTime2 = datePicker3.getNextDateTime()) == null) ? i14 : nextDateTime2.length() > 0 ? 1 : i14, (timeSegmentDtoV3 == null || (datePicker = timeSegmentDtoV3.getDatePicker()) == null || (nextDateTime = datePicker.getNextDateTime()) == null) ? "" : nextDateTime, null, null, null, null, 960, null);
        GraphModel graph = timeSegmentDtoV3 != null ? timeSegmentDtoV3.getGraph() : graphModel;
        AbstractC22676k.m65748h(graph, "null cannot be cast to non-null type com.whoop.design.models.items.graph.GraphModel");
        InterfaceC25312u interfaceC25312uM60541h = c21535aM60554d.m60541h(graph);
        ?? r24 = interfaceC25312uM60541h instanceof C21395c ? (C21395c) interfaceC25312uM60541h : graphModel;
        BreakDownBarDtoV3 breakdownBar = timeSegmentDtoV3.getBreakdownBar();
        ?? M15202a = breakdownBar != null ? this.breakdownBarHelper.m15202a(breakdownBar, enumC28166h0M114926h) : graphModel;
        MetricEducationV3 metricEducationV3M114937s = cVar.getMetricEducation();
        ?? c30885c = metricEducationV3M114937s != null ? new C30885c(AbstractC8693b.m21278l(metricEducationV3M114937s.getTitle()), AbstractC8693b.m21278l(metricEducationV3M114937s.getContent()), null, null, false, null, null, 124, null) : graphModel;
        List<MetricEducationV3> listM114938t = cVar.m114938t();
        if (listM114938t != null) {
            List<MetricEducationV3> list3 = listM114938t;
            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(list3, i13));
            for (MetricEducationV3 metricEducationV3 : list3) {
                TextResource textResourceM21278l2 = AbstractC8693b.m21278l(metricEducationV3.getTitle());
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(metricEducationV3.getContent());
                ImageDisplay imageDisplay = metricEducationV3.getImageDisplay();
                ?? M64503l = (imageDisplay == null || (imageUrl = imageDisplay.getImageUrl()) == null) ? graphModel : AbstractC22404p.m64503l(imageUrl);
                ImageDisplay imageDisplay2 = metricEducationV3.getImageDisplay();
                arrayList4.add(new C30885c(textResourceM21278l2, textResourceM21278l3, null, null, false, M64503l, (imageDisplay2 == null || (imageDescription = imageDisplay2.getImageDescription()) == null) ? graphModel : AbstractC8693b.m21278l(imageDescription), 28, null));
            }
            r44 = arrayList4;
        } else {
            r44 = graphModel;
        }
        C1032n c1032n = new C1032n(AbstractC8693b.m21278l(cVar.getNoDataNameDisplay()), AbstractC8693b.m21278l(cVar.getNoDataSubtextNameDisplay()));
        WhoopCoachVowModel whoopCoachVow = timeSegmentDtoV3.getWhoopCoachVow();
        if (whoopCoachVow != null) {
            Object objM60541h = c21535aM60554d.m60541h(whoopCoachVow);
            r26 = objM60541h instanceof C32048d ? (C32048d) objM60541h : graphModel;
        } else {
            r26 = graphModel;
        }
        ?? M21278l = ((m15285s(enumC28166h0M114926h) && z13) || (vow = timeSegmentDtoV3.getVow()) == null) ? graphModel : AbstractC8693b.m21278l(vow);
        String strM114927i = cVar.getInfoCallout();
        ?? M21278l2 = strM114927i != null ? AbstractC8693b.m21278l(strM114927i) : graphModel;
        List<LegendItemDtoV3> legend = timeSegmentDtoV3.getLegend();
        if (legend != null) {
            List<LegendItemDtoV3> list4 = legend;
            ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(list4, i13));
            for (LegendItemDtoV3 legendItemDtoV3 : list4) {
                arrayList5.add(new C1036p(AbstractC8693b.m21278l(legendItemDtoV3.getText()), AbstractC36125r.m114800a(legendItemDtoV3.getStyle()), this.trendsColorHelper.m15316d(legendItemDtoV3.getStyle())));
            }
            r29 = arrayList5;
        } else {
            r29 = graphModel;
        }
        ArticleTileCarouselModel articleTileCarouselModelM114925g = cVar.getEducationCarouselModel();
        if (articleTileCarouselModelM114925g != null) {
            Object objM60541h2 = c21535aM60554d.m60541h(articleTileCarouselModelM114925g);
            if (objM60541h2 instanceof C16934f) {
                obj = (C16934f) objM60541h2;
            } else {
                obj = graphModel;
            }
        } else {
            obj = graphModel;
        }
        C22160d c22160dM15289w = (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.BODY_COMPOSITION) || (integrationsUpsellDtoV3M114929k = cVar.getIntegrationsUpsell()) == null) ? graphModel : m15289w(integrationsUpsellDtoV3M114929k);
        TrendsMenuItemDtoV3 trendsMenuItemDtoV3M114930l = cVar.getManualMeasurementItem();
        C39282o c39282oM15290x = trendsMenuItemDtoV3M114930l != null ? m15290x(trendsMenuItemDtoV3M114930l) : graphModel;
        TrendsMenuItemDtoV3 trendsMenuItemDtoV3M114910B = cVar.getSeeAllDataItem();
        C39282o c39282oM15290x2 = trendsMenuItemDtoV3M114910B != null ? m15290x(trendsMenuItemDtoV3M114910B) : graphModel;
        TimeSegmentLastUpdated lastUpdated = timeSegmentDtoV3.getLastUpdated();
        ?? c1034o = lastUpdated != null ? new C1034o(AbstractC8693b.m21278l(lastUpdated.getLeadingText()), AbstractC8693b.m21278l(lastUpdated.getTrailingText()), lastUpdated.getTrailingImage()) : graphModel;
        ManualMeasurementSheet manualMeasurementSheetM114932n = cVar.getManualMeasurementSheet();
        C4819g c4819gM15286t = manualMeasurementSheetM114932n != null ? m15286t(manualMeasurementSheetM114932n) : graphModel;
        if (cVar.getRecordedDataError()) {
            abstractC4825mM15287u = new AbstractC4825m.a(cVar.getGraphKey());
        } else {
            RecordedData recordedDataM114943y = cVar.getRecordedData();
            if (recordedDataM114943y == null || (abstractC4825mM15287u = m15287u(recordedDataM114943y, c21535aM60554d, c1013d0)) == null) {
                abstractC4825mM15287u = AbstractC4825m.b.f19861a;
            }
        }
        AbstractC4825m abstractC4825m = abstractC4825mM15287u;
        SegmentalAnalysisModel segmentalBodyComposition = timeSegmentDtoV3.getSegmentalBodyComposition();
        ?? M10202j = segmentalBodyComposition != null ? AbstractC3469q0.m10202j(segmentalBodyComposition) : graphModel;
        boolean zM114914F = cVar.getSuccessSavingManualMeasurement();
        TextWithIllustrationCardModel textWithIllustrationCardModelM114917I = cVar.getUpsellCard();
        if (textWithIllustrationCardModelM114917I != null) {
            Object objM60541h3 = c21535aM60554d.m60541h(textWithIllustrationCardModelM114917I);
            r39 = objM60541h3 instanceof C16550q ? (C16550q) objM60541h3 : graphModel;
        } else {
            r39 = graphModel;
        }
        List<MenuItemModel> listM114915G = cVar.m114915G();
        ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(listM114915G, 10));
        Iterator it4 = listM114915G.iterator();
        while (it4.hasNext()) {
            InterfaceC25312u interfaceC25312uM60541h2 = c21535aM60554d.m60541h((MenuItemModel) it4.next());
            AbstractC22676k.m65748h(interfaceC25312uM60541h2, "null cannot be cast to non-null type com.whoop.design.atomic.organism.menuitem.MenuItemState");
            arrayList6.add((C39282o) interfaceC25312uM60541h2);
        }
        boolean zIsHidden = timeSegmentDtoV3.isHidden();
        CardioFitnessLevelModel cardioFitnessLevelModelM114921c = cVar.getCardioFitnessLevel();
        C3438f c3438fM15282p = cardioFitnessLevelModelM114921c != null ? m15282p(cardioFitnessLevelModelM114921c) : graphModel;
        List<InfoCalloutTileModel> listM114928j = cVar.m114928j();
        if (listM114928j != null) {
            List<InfoCalloutTileModel> list5 = listM114928j;
            ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(list5, 10));
            Iterator it5 = list5.iterator();
            while (it5.hasNext()) {
                InterfaceC25312u interfaceC25312uM60541h3 = c21535aM60554d.m60541h((InfoCalloutTileModel) it5.next());
                AbstractC22676k.m65748h(interfaceC25312uM60541h3, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.InfoCalloutState");
                arrayList7.add((C4092p2) interfaceC25312uM60541h3);
            }
            r45 = arrayList7;
        } else {
            r45 = graphModel;
        }
        String strM114933o = cVar.getManualMeasurementTextDisplay();
        ?? M21278l3 = strM114933o != null ? AbstractC8693b.m21278l(strM114933o) : graphModel;
        List<C36120m> listM114916H = cVar.m114916H();
        List<C1048y> listM15284r = listM114916H != null ? m15284r(listM114916H, c21535aM60554d) : graphModel;
        AdditionalInfoTextModel additionalInfoTextModelM114919a = cVar.getAdditionalInfoText();
        ?? M68616a = additionalInfoTextModelM114919a != null ? AbstractC23608d.m68616a(additionalInfoTextModelM114919a) : graphModel;
        AbstractC4830r abstractC4830rM15283q = m15283q(cVar, c21535aM60554d, c1013d0);
        boolean zM114913E = cVar.getSuccessDeleteMeasurement();
        MetaData metaDataM114936r = cVar.getMetadata();
        ?? M18523a = (metaDataM114936r == null || (aiContextMetadata = metaDataM114936r.getAiContextMetadata()) == null) ? graphModel : AbstractC6219a.m18523a(aiContextMetadata);
        List<? extends DesignSystemModel> listM114923e = cVar.m114923e();
        if (listM114923e == null) {
            listM114923e = listM60540g;
        }
        if (!listM114923e.isEmpty()) {
            listM60540g = c21535aM60554d.m60540g(listM114923e);
        }
        return new AbstractC4813a0.d(new C1037p0(aVar, list, textResourceM21267a4, c1047x, c17863f, c3470r, M15202a, r24, c30885c, c1032n, M21278l, r26, c1013d0, M21278l2, r29, obj, c22160dM15289w, c39282oM15290x, c39282oM15290x2, c1034o, c4819gM15286t, M10202j, abstractC4825m, zM114914F, r39, zIsHidden, arrayList6, c3438fM15282p, r44, r45, M21278l3, listM15284r, M68616a, abstractC4830rM15283q, zM114913E, M18523a, listM60540g));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX INFO: renamed from: w */
    private final C22160d m15289w(IntegrationsUpsellDtoV3 integrationsUpsellDtoV3) {
        C22157a c22157a;
        EnumC39333f enumC39333f;
        EnumC39333f enumC39333f2;
        AbstractC22403o abstractC22403oM64511a = AbstractC22406r.m64511a(integrationsUpsellDtoV3.getImage());
        String title = integrationsUpsellDtoV3.getTitle();
        String subtitle = integrationsUpsellDtoV3.getSubtitle();
        IntegrationsUpsellButtonDtoV3 primaryButton = integrationsUpsellDtoV3.getPrimaryButton();
        if (primaryButton != null) {
            TextResource textResourceM21278l = AbstractC8693b.m21278l(primaryButton.getTitle());
            C9598e destination = primaryButton.getDestination();
            String color = primaryButton.getColor();
            if (color != null) {
                enumC39333f = EnumC39333f.BRAND_WHITE;
                EnumC39333f[] enumC39333fArrValues = EnumC39333f.values();
                int length = enumC39333fArrValues.length;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        enumC39333f2 = null;
                        break;
                    }
                    enumC39333f2 = enumC39333fArrValues[i13];
                    if (AbstractC22676k.m65745e(enumC39333f2.name(), color)) {
                        break;
                    }
                    i13++;
                }
                if (enumC39333f2 != null) {
                    enumC39333f = enumC39333f2;
                }
                if (enumC39333f == null) {
                    enumC39333f = EnumC39333f.BRAND_WHITE;
                }
            } else {
                enumC39333f = EnumC39333f.BRAND_WHITE;
            }
            c22157a = new C22157a(textResourceM21278l, destination, enumC39333f);
        } else {
            c22157a = null;
        }
        IntegrationsUpsellButtonDtoV3 secondaryButton = integrationsUpsellDtoV3.getSecondaryButton();
        return new C22160d(abstractC22403oM64511a, title, subtitle, c22157a, secondaryButton != null ? new C22157a(AbstractC8693b.m21278l(secondaryButton.getTitle()), secondaryButton.getDestination(), EnumC39333f.RECOVERY) : null, null, 32, null);
    }

    /* JADX INFO: renamed from: x */
    private final C39282o m15290x(TrendsMenuItemDtoV3 trendsMenuItemDtoV3) {
        C39274g c39274g;
        C39282o.Companion companion = C39282o.INSTANCE;
        TextResource textResourceM21278l = AbstractC8693b.m21278l(trendsMenuItemDtoV3.getTitle());
        TextResource textResourceM21278l2 = AbstractC8693b.m21278l(trendsMenuItemDtoV3.getSubtitle());
        String leftIcon = trendsMenuItemDtoV3.getLeftIcon();
        EnumC16313m0 enumC16313m0 = null;
        if (leftIcon != null) {
            EnumC16313m0 enumC16313m1 = EnumC16313m0.CARET_FORWARD;
            for (EnumC16313m0 enumC16313m2 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m2.name(), leftIcon)) {
                    enumC16313m0 = enumC16313m2;
                    break;
                }
            }
            if (enumC16313m0 != null) {
                enumC16313m1 = enumC16313m0;
            }
            c39274g = new C39274g(enumC16313m1.toWhoopIcon(), AbstractC8693b.m21278l(""));
        } else {
            c39274g = null;
        }
        return C39282o.Companion.m125229d(companion, textResourceM21278l, null, null, textResourceM21278l2, null, c39274g, p745y81.Function1.m125323a(g.f19905w), null, null, null, null, null, null, null, false, false, null, false, null, null, null, false, null, 8388502, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m15291y(boolean z4, EnumC28166h0 enumC28166h0, AbstractC36130w.c cVar, C4834v c4834v, C21536b designItemReducer) {
        AbstractC22676k.m65750j(designItemReducer, "$this$designItemReducer");
        designItemReducer.m60546a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21395c.class), new j(z4, enumC28166h0, cVar));
        designItemReducer.m60547b(new C4833u(c4834v, 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m15292z(C4834v c4834v, C23749z0 addModelMapper) {
        AbstractC22676k.m65750j(addModelMapper, "$this$addModelMapper");
        addModelMapper.m69765a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(MeasurementBox.class), new k(new C4833u(c4834v, 1)));
        AbstractC30912a.m95039b(addModelMapper);
        AbstractC14427a.m41140b(addModelMapper);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public final EnumC3479v0 m15293j(TimeSegmentDtoV3 timeSegment, boolean isScrubbing, boolean useSmallType) {
        List<TrendMetricDtoV3> metrics;
        if (!useSmallType) {
            if (((timeSegment == null || (metrics = timeSegment.getMetrics()) == null) ? 0 : metrics.size()) <= 1) {
                return EnumC3479v0.DEFAULT;
            }
        }
        return isScrubbing ? EnumC3479v0.SMALL : EnumC3479v0.FLAT;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX INFO: renamed from: m */
    public final int m15294m(AbstractC36130w.c model) {
        EnumC36106a enumC36106a;
        AbstractC22676k.m65750j(model, "model");
        TimeSegmentDtoV3 timeSegmentDtoV3M114918J = model.getWeekGraph();
        if (timeSegmentDtoV3M114918J == null) {
            enumC36106a = null;
        } else {
            if (timeSegmentDtoV3M114918J.isHidden()) {
                timeSegmentDtoV3M114918J = null;
            }
            if (timeSegmentDtoV3M114918J != null) {
                enumC36106a = EnumC36106a.WEEKLY;
            } else {
                enumC36106a = null;
            }
        }
        TimeSegmentDtoV3 timeSegmentDtoV3M114939u = model.getMonthGraph();
        if (timeSegmentDtoV3M114939u.isHidden()) {
            timeSegmentDtoV3M114939u = null;
        }
        EnumC36106a enumC36106a2 = timeSegmentDtoV3M114939u != null ? EnumC36106a.MONTHLY : null;
        TimeSegmentDtoV3 timeSegmentDtoV3M114912D = model.getSixMonthGraph();
        if (timeSegmentDtoV3M114912D.isHidden()) {
            timeSegmentDtoV3M114912D = null;
        }
        int iIndexOf = ((ArrayList) AbstractC25260n.m74077r0(new EnumC36106a[]{enumC36106a, enumC36106a2, timeSegmentDtoV3M114912D != null ? EnumC36106a.SIX_MONTH : null})).indexOf(model.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String());
        Integer numValueOf = iIndexOf >= 0 ? Integer.valueOf(iIndexOf) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final AbstractC4813a0 m15295o(AbstractC36130w domainResult) {
        AbstractC22676k.m65750j(domainResult, "domainResult");
        if (domainResult instanceof AbstractC36130w.c) {
            return m15288v((AbstractC36130w.c) domainResult);
        }
        if (domainResult instanceof AbstractC36130w.b) {
            return new AbstractC4813a0.c(((AbstractC36130w.b) domainResult).getGraphKey(), null, 2, 0 == true ? 1 : 0);
        }
        if (!(domainResult instanceof AbstractC36130w.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC36130w.a aVar = (AbstractC36130w.a) domainResult;
        return new AbstractC4813a0.b(aVar.getGraphKey(), aVar.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), aVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), null, 8, null);
    }
}
