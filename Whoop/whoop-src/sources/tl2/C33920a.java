package tl2;

import androidx.core.app.NotificationCompat;
import bm2.C3439f0;
import c61.C4272a;
import cm2.AbstractC4835w;
import cm2.AbstractC4837y;
import cm2.EnumC4816d;
import cm2.EnumC4821i;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.models.items.ArticleTileCarouselEventEnum;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.domain.model.UnitSystem;
import com.whoop.navigation.AddActivityModel;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CoachScreenModel;
import com.whoop.navigation.IntegrationsScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.SeeAllRecordingsScreenModel;
import com.whoop.navigation.WeeklyPlanEditScreenModel;
import com.whoop.util.TrendKey;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.HashMap;
import java.util.LinkedHashMap;
import l83.C23465k;
import m83.AbstractC25247g0;
import or2.EnumC28166h0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Days;
import org.joda.time.format.ISODateTimeFormat;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import tr2.InterfaceC34116n;
import vl2.EnumC36106a;
import y71.C39282o;
import yb3.AbstractC39414r;
import yl2.AbstractC39640g;
import z82.InterfaceC40188b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: tl2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020'¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0010¢\u0006\u0004\b*\u0010&J)\u0010/\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010\u000e2\b\u0010,\u001a\u0004\u0018\u00010\u000e2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020\u00102\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0015\u00105\u001a\u00020\u00102\u0006\u00102\u001a\u000201¢\u0006\u0004\b5\u00104J\u0015\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u000e¢\u0006\u0004\b7\u0010\u0012J\u000f\u00108\u001a\u00020\u0010H\u0002¢\u0006\u0004\b8\u0010&J\u000f\u00109\u001a\u00020\u0010H\u0002¢\u0006\u0004\b9\u0010&J?\u0010@\u001a\u00020\u00102\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\u000e2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020BH\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020F2\u0006\u0010E\u001a\u00020\u000eH\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020F2\u0006\u0010>\u001a\u00020\u000eH\u0002¢\u0006\u0004\bI\u0010HJ\u0017\u0010K\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u000eH\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\bM\u0010\u001cJO\u0010T\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u000e2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010N2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010P2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010PH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020\u00102\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\u00102\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\u00102\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b^\u0010]J\u001f\u0010a\u001a\u00020\u00102\u0006\u0010_\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020\u000eH\u0002¢\u0006\u0004\ba\u0010bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010gR\u0016\u0010J\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010hR\u0016\u0010i\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010h¨\u0006j"}, m65681d2 = {"Ltl2/a;", "", "Lz82/b;", "analyticsManager", "Lzr2/a;", "dateAndTimeProvider", "Lc61/a;", "scrubberAnalyticsHelper", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "Ltr2/n;", "logger", "<init>", "(Lz82/b;Lzr2/a;Lc61/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "", "accessPoint", "Ll83/a0;", "A", "(Ljava/lang/String;)V", "Lcm2/y;", "trendsViewEvent", "eventSource", "r", "(Lcm2/y;Ljava/lang/String;)V", "clickEvent", "Lcom/whoop/util/TrendKey;", "trendKey", "i", "(Ljava/lang/Object;Lcom/whoop/util/TrendKey;)V", "Lyl2/g;", "trendsNavEvent", "s", "(Lyl2/g;)V", "Lcm2/w;", NotificationCompat.CATEGORY_EVENT, "p", "(Lcm2/w;)V", "k", "()V", "Lyl2/g$c;", "e", "(Lyl2/g$c;)V", "g", "articleTitle", "trendName", "", "isCloseVideoEvent", "q", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lbm2/f0;", "measurement", "x", "(Lbm2/f0;)V", "y", "source", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "o", "m", "Lor2/h0;", "graphKey", "Lvl2/a;", AttachmentExtensionsKt.EXTRA_DURATION, "dateString", "action", "b", "(Lor2/h0;Lvl2/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcm2/w$a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcm2/w$a;)V", "endDate", "", "d", "(Ljava/lang/String;)I", "a", "fromLocation", "c", "(Ljava/lang/String;)Ljava/lang/String;", "j", "Lcom/whoop/domain/model/UnitSystem;", "unitSystem", "", "weight", "leanBodyMass", "segmentalBodyComp", "u", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/domain/model/UnitSystem;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "Lcom/whoop/navigation/e;", "navigationAction", "z", "(Lcom/whoop/navigation/e;)V", "Lcm2/i;", "measurementType", "n", "(Lcm2/i;)V", "l", "label", "category", "f", "(Ljava/lang/String;Ljava/lang/String;)V", "Lz82/b;", "Lzr2/a;", "Lc61/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "Ljava/lang/String;", "currentTrend", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33920a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C4272a scrubberAnalyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private String fromLocation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private String currentTrend;

    /* JADX INFO: renamed from: tl2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f142133a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f142134b;

        static {
            int[] iArr = new int[EnumC36106a.values().length];
            try {
                iArr[EnumC36106a.SIX_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36106a.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC36106a.WEEKLY.ordinal()] = 3;
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
            f142133a = iArr;
            int[] iArr2 = new int[EnumC4816d.values().length];
            try {
                iArr2[EnumC4816d.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC4816d.NEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC4816d.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f142134b = iArr2;
        }
    }

    public C33920a(InterfaceC40188b analyticsManager, InterfaceC41070a dateAndTimeProvider, C4272a scrubberAnalyticsHelper, FeatureFlagChecker ffChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(scrubberAnalyticsHelper, "scrubberAnalyticsHelper");
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.analyticsManager = analyticsManager;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.scrubberAnalyticsHelper = scrubberAnalyticsHelper;
        this.ffChecker = ffChecker;
        this.logger = logger;
        this.fromLocation = "";
        this.currentTrend = TrendKey.NONE.getTrendName();
    }

    /* JADX INFO: renamed from: a */
    private final int m107299a(String dateString) {
        return Days.daysBetween(ISODateTimeFormat.dateTimeParser().withZoneUTC().parseDateTime(dateString), this.dateAndTimeProvider.mo133364c()).getDays();
    }

    /* JADX INFO: renamed from: b */
    private final void m107300b(EnumC28166h0 graphKey, EnumC36106a duration, String dateString, String source, String action) {
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("Time Period", duration.getDurationName()));
        if (source != null) {
            linkedHashMapM73993b0.put("Source", source);
            linkedHashMapM73993b0.put("new_home", Boolean.TRUE);
        }
        String trendName = graphKey.getTrendName();
        this.currentTrend = trendName;
        this.analyticsManager.mo41422d(trendName, action, m107301c(this.fromLocation), "Viewed Trend Screen", String.valueOf(m107299a(dateString)), linkedHashMapM73993b0);
        this.fromLocation = graphKey.getTrendName();
    }

    /* JADX INFO: renamed from: c */
    private final String m107301c(String fromLocation) {
        for (TrendKey trendKey : TrendKey.values()) {
            if (AbstractC22676k.m65745e(trendKey.getTrendName(), fromLocation)) {
                return AbstractC2875y.m8299l(fromLocation, " - Trend Screen");
            }
        }
        return fromLocation;
    }

    /* JADX INFO: renamed from: d */
    private final int m107302d(String endDate) {
        DateTime dateTimeAtStartOfDay;
        try {
            dateTimeAtStartOfDay = ISODateTimeFormat.dateTimeParser().withZoneUTC().parseDateTime(endDate);
        } catch (IllegalArgumentException e5) {
            this.logger.mo85213c(AbstractC11266d.m30461o("Failed to parse analytics endDate as datetime, attempting date-only parse: ", endDate), e5, new AbstractC30556a.a[0]);
            try {
                dateTimeAtStartOfDay = ISODateTimeFormat.date().withZoneUTC().parseLocalDate(endDate).toDateTimeAtStartOfDay(DateTimeZone.UTC);
            } catch (IllegalArgumentException e13) {
                this.logger.mo85213c(AbstractC11266d.m30461o("Failed to parse analytics endDate as date-only, using 0 days: ", endDate), e13, new AbstractC30556a.a[0]);
                return 0;
            }
        }
        return Days.daysBetween(dateTimeAtStartOfDay, this.dateAndTimeProvider.mo133364c()).getDays();
    }

    /* JADX INFO: renamed from: f */
    private final void m107303f(String label, String category) {
        this.analyticsManager.mo41428k(category, "Press", label, "Weekly Plan", AbstractC31061c.m95645u("source", "Trends"));
    }

    /* JADX INFO: renamed from: h */
    private final void m107304h(AbstractC4835w.a event) {
        String str;
        int i13 = a.f142134b[event.getDirection().ordinal()];
        if (i13 == 1) {
            str = "Press Previous Date";
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            str = "Press Next Date";
        }
        String str2 = str;
        String strM15309d = event.getTrendName();
        this.currentTrend = strM15309d;
        this.analyticsManager.mo41422d(strM15309d, str2, m107301c(this.fromLocation), "Viewed Trend Screen", String.valueOf(m107302d(event.getEndDate())), AbstractC25247g0.m73990Y(new C23465k("Start Date", event.getStartDate()), new C23465k("End Date", event.getEndDate())));
    }

    /* JADX INFO: renamed from: j */
    private final void m107305j(Object clickEvent, TrendKey trendKey) {
        if (clickEvent == ArticleTileCarouselEventEnum.VIEW_ALL) {
            this.analyticsManager.mo41422d(null, "View All", null, "Education Tile", null, AbstractC31061c.m95645u("Source", trendKey.getTrendName()));
            return;
        }
        if (clickEvent instanceof ArticleTileModelEvent.Url) {
            InterfaceC40188b interfaceC40188b = this.analyticsManager;
            ArticleTileModelEvent.Url url = (ArticleTileModelEvent.Url) clickEvent;
            String title = url.getTitle();
            Integer index = url.getIndex();
            interfaceC40188b.mo41422d(null, "Tap", title, "Education Tile", String.valueOf(index != null ? Integer.valueOf(index.intValue() + 1) : null), AbstractC25247g0.m73990Y(new C23465k("Source", trendKey.getTrendName()), new C23465k("Type", url.getTag()), new C23465k("Native", this.ffChecker.isFeatureEnabled(FeatureFlagRepositoryKt.TRENDS_EDUCATION_CAROUSEL_V2) ? "Yes" : "No")));
        }
    }

    /* JADX INFO: renamed from: l */
    private final void m107306l(EnumC4821i measurementType) {
        this.analyticsManager.mo41424f(null, "tapped_add_manual", null, AbstractC33921b.m107326a(measurementType));
    }

    /* JADX INFO: renamed from: m */
    private final void m107307m() {
        this.analyticsManager.mo41424f(null, "update_weight", null, "VO2 Max");
    }

    /* JADX INFO: renamed from: n */
    private final void m107308n(EnumC4821i measurementType) {
        this.analyticsManager.mo41424f(null, "tapped_see_all_manual_entries", null, AbstractC33921b.m107326a(measurementType));
    }

    /* JADX INFO: renamed from: o */
    private final void m107309o() {
        this.analyticsManager.mo41424f(null, "tapped_information_icon", null, "VO2 Max");
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m107310t(C33920a c33920a, AbstractC4837y abstractC4837y, String str, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        c33920a.m107321r(abstractC4837y, str);
    }

    /* JADX INFO: renamed from: u */
    private final void m107311u(String source, String action, UnitSystem unitSystem, Number weight, Number leanBodyMass, Number segmentalBodyComp) {
        HashMap map = new HashMap();
        map.put("source", source);
        if (weight != null) {
            map.put("weight", weight);
        }
        if (leanBodyMass != null) {
            map.put("lean_body_mass", leanBodyMass);
        }
        if (segmentalBodyComp != null) {
            map.put("segmental_body_comp", segmentalBodyComp);
        }
        this.analyticsManager.mo41428k(null, action, unitSystem != null ? unitSystem.toName() : null, "Weight and Lean Body Mass", map);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m107312v(C33920a c33920a, String str, String str2, UnitSystem unitSystem, Number number, Number number2, Number number3, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            unitSystem = null;
        }
        if ((i13 & 8) != 0) {
            number = null;
        }
        if ((i13 & 16) != 0) {
            number2 = null;
        }
        if ((i13 & 32) != 0) {
            number3 = null;
        }
        c33920a.m107311u(str, str2, unitSystem, number, number2, number3);
    }

    /* JADX INFO: renamed from: z */
    private final void m107313z(C9598e navigationAction) {
        if (!(navigationAction.getParameters() instanceof WeeklyPlanEditScreenModel)) {
            if (navigationAction.getParameters() instanceof AddActivityModel) {
                m107318k();
            }
        } else {
            NavigationScreenModel parameters = navigationAction.getParameters();
            AbstractC22676k.m65748h(parameters, "null cannot be cast to non-null type com.whoop.navigation.WeeklyPlanEditScreenModel");
            String analyticsSource = ((WeeklyPlanEditScreenModel) parameters).getAnalyticsSource();
            m107303f(AbstractC22676k.m65745e(analyticsSource, "CREATE_PLAN") ? "Start" : "Steps", AbstractC22676k.m65745e(analyticsSource, "CREATE_PLAN") ? "Create Plan" : "Edit Plan");
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m107314A(String accessPoint) {
        AbstractC22676k.m65750j(accessPoint, "accessPoint");
        this.fromLocation = accessPoint;
    }

    /* JADX INFO: renamed from: e */
    public final void m107315e(AbstractC39640g.c event) {
        AbstractC22676k.m65750j(event, "event");
        NavigationScreenModel parameters = event.getNavAction().getParameters();
        if ((parameters instanceof WeeklyPlanEditScreenModel) || (parameters instanceof AddActivityModel)) {
            m107313z(event.getNavAction());
            return;
        }
        if ((parameters instanceof IntegrationsScreenModel) || (parameters instanceof CoachScreenModel)) {
            m107316g();
            return;
        }
        AppScreen appScreen = event.getNavAction().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9464z2.f28083w) || AbstractC22676k.m65745e(appScreen, AppScreen.C9345k1.f27714w)) {
            m107316g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m107316g() {
        this.analyticsManager.mo41424f(this.currentTrend, null, null, "Closed Trend Screen");
    }

    /* JADX INFO: renamed from: i */
    public final void m107317i(Object clickEvent, TrendKey trendKey) {
        AbstractC22676k.m65750j(clickEvent, "clickEvent");
        AbstractC22676k.m65750j(trendKey, "trendKey");
        m107305j(clickEvent, trendKey);
    }

    /* JADX INFO: renamed from: k */
    public final void m107318k() {
        this.analyticsManager.mo41428k("Recording Data", "Open", "Menu", "Add Activity - Open", AbstractC31061c.m95645u("source", "hr_zones_trend"));
    }

    /* JADX INFO: renamed from: p */
    public final void m107319p(AbstractC4835w event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC4835w.c.f19917a)) {
            m107307m();
            return;
        }
        if (event.equals(AbstractC4835w.d.f19918a)) {
            m107309o();
        } else if (event instanceof AbstractC4835w.b) {
            m107306l(((AbstractC4835w.b) event).getMeasurementType());
        } else {
            if (!(event instanceof AbstractC4835w.a)) {
                throw new NoWhenBranchMatchedException();
            }
            m107304h((AbstractC4835w.a) event);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m107320q(String articleTitle, String trendName, boolean isCloseVideoEvent) {
        InterfaceC40188b interfaceC40188b = this.analyticsManager;
        String str = isCloseVideoEvent ? "Close" : "Viewed Full Video";
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("Source", trendName));
        if (isCloseVideoEvent) {
            linkedHashMapM73993b0.put("Type", "VIDEO");
        }
        interfaceC40188b.mo41422d(null, str, articleTitle, "Education Tile", "", linkedHashMapM73993b0);
    }

    /* JADX INFO: renamed from: r */
    public final void m107321r(AbstractC4837y trendsViewEvent, String eventSource) {
        C4272a.c cVar;
        AbstractC22676k.m65750j(trendsViewEvent, "trendsViewEvent");
        if (trendsViewEvent instanceof AbstractC4837y.n) {
            AbstractC4837y.n nVar = (AbstractC4837y.n) trendsViewEvent;
            if (nVar.getDirection() == EnumC4816d.NONE) {
                String str = "Open";
                if (!nVar.getIsTrendMenuSelection() && (eventSource == null || AbstractC39414r.m125890i0(eventSource))) {
                    str = null;
                }
                m107300b(nVar.getGraphKey(), nVar.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), nVar.getDateString(), eventSource, str);
                return;
            }
            return;
        }
        if (trendsViewEvent instanceof AbstractC4837y.f) {
            AbstractC4837y.f fVar = (AbstractC4837y.f) trendsViewEvent;
            m107300b(fVar.getGraphKey(), fVar.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String(), fVar.getDateString(), eventSource, "Change Time Period");
            return;
        }
        if (trendsViewEvent instanceof AbstractC4837y.l) {
            AbstractC4837y.l lVar = (AbstractC4837y.l) trendsViewEvent;
            if (lVar.getSendAnalytics()) {
                C4272a c4272a = this.scrubberAnalyticsHelper;
                String trendName = lVar.getGraphKey().getTrendName();
                int i13 = a.f142133a[lVar.getIo.getstream.chat.android.client.extensions.AttachmentExtensionsKt.EXTRA_DURATION java.lang.String().ordinal()];
                if (i13 == 1) {
                    cVar = C4272a.c.SIX_MONTH;
                } else if (i13 == 2) {
                    cVar = C4272a.c.MONTH;
                } else if (i13 == 3) {
                    cVar = C4272a.c.WEEK;
                } else if (i13 == 4) {
                    cVar = C4272a.c.ALL;
                } else {
                    if (i13 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = C4272a.c.NONE;
                }
                c4272a.m13310b(trendName, cVar);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m107322s(AbstractC39640g trendsNavEvent) {
        EnumC4821i enumC4821i;
        AbstractC22676k.m65750j(trendsNavEvent, "trendsNavEvent");
        if (!(trendsNavEvent instanceof AbstractC39640g.a)) {
            if (!(trendsNavEvent instanceof AbstractC39640g.c) && !(trendsNavEvent instanceof AbstractC39640g.d)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        InterfaceC25312u interfaceC25312uM126722a = ((AbstractC39640g.a) trendsNavEvent).getItemViewState();
        EnumC4821i enumC4821i2 = null;
        C39282o c39282o = interfaceC25312uM126722a instanceof C39282o ? (C39282o) interfaceC25312uM126722a : null;
        if (c39282o == null) {
            return;
        }
        C9598e destination = c39282o.getDestination();
        if (AbstractC22676k.m65745e(destination != null ? destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String() : null, AppScreen.C9309f5.f27604w)) {
            C9598e destination2 = c39282o.getDestination();
            NavigationScreenModel parameters = destination2 != null ? destination2.getParameters() : null;
            if (parameters instanceof SeeAllRecordingsScreenModel) {
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
            m107308n(enumC4821i);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m107323w(String source) {
        AbstractC22676k.m65750j(source, "source");
        m107312v(this, source, "deleted", null, null, null, null, 60, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m107324x(C3439f0 measurement) {
        AbstractC22676k.m65750j(measurement, "measurement");
        m107312v(this, "manual", "edited", measurement.getMetricType().getUnitSystem(), Double.valueOf(measurement.getWeight()), measurement.getLeanBodyMass(), null, 32, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m107325y(C3439f0 measurement) {
        AbstractC22676k.m65750j(measurement, "measurement");
        m107312v(this, "manual", "recorded", measurement.getMetricType().getUnitSystem(), Double.valueOf(measurement.getWeight()), measurement.getLeanBodyMass(), null, 32, null);
    }
}
