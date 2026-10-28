package p710im1;

import androidx.core.app.NotificationCompat;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.C9598e;
import dm1.AbstractC12177a;
import em1.AbstractC13325a;
import em1.AbstractC13330d;
import em1.AbstractC13331e;
import em1.AbstractC13332f;
import em1.AbstractC13333g;
import em1.AbstractC13340n;
import em1.AbstractC13343q;
import em1.InterfaceC13346t;
import fm1.C14598b;
import fm1.C14599c;
import fm1.C14600d;
import fm1.EnumC14603g;
import gl1.C15967b;
import il1.AbstractC18642s;
import java.time.LocalDate;
import jl1.AbstractC21772c;
import kd1.EnumC22400l;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import s21.C32079b;
import tr2.InterfaceC34116n;
import xm1.C38459a;

/* JADX INFO: renamed from: im1.n */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b#\u0010$J1\u0010*\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u0016\u001a\u00020,¢\u0006\u0004\b.\u0010/J+\u00100\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0016\u001a\u00020,2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00105¨\u00066"}, m65681d2 = {"Lim1/n;", "", "Lxm1/a;", "requestDateGetter", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lgl1/b;", "homeAnalyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lxm1/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lgl1/b;Ltr2/n;)V", "Lfm1/c;", "homeFeed", "", "fromFab", "Lfm1/g;", "sourcePillar", "Ldm1/a$h0;", "e", "(Lfm1/c;ZLfm1/g;)Ldm1/a$h0;", "Lil1/s$e0;", NotificationCompat.CATEGORY_EVENT, "Lem1/n$b;", "f", "(Lil1/s$e0;)Lem1/n$b;", "Lil1/s$p;", "Ljava/time/LocalDate;", "currentDay", "pillarType", "Ldm1/a;", "g", "(Lil1/s$p;Ljava/time/LocalDate;Lfm1/g;)Ldm1/a;", "Lkd1/l;", "fabItem", "a", "(Lkd1/l;Lfm1/c;Lfm1/g;)Ldm1/a;", "Lfm1/d;", "homeMetadata", "", "source", "Ldm1/a$r;", "b", "(ZLfm1/d;Lfm1/g;Ljava/lang/String;)Ldm1/a$r;", "Lil1/s;", "Lem1/t;", "d", "(Lil1/s;)Lem1/t;", "c", "(Lil1/s;Ljava/time/LocalDate;Lfm1/g;)Ldm1/a;", "Lxm1/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lgl1/b;", "Ltr2/n;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C18684n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C38459a requestDateGetter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C15967b homeAnalyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: im1.n$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f73305a;

        static {
            int[] iArr = new int[EnumC22400l.values().length];
            try {
                iArr[EnumC22400l.ADD_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC22400l.JOURNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC22400l.START_ACTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC22400l.START_ACTIVITY_REVAMP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC22400l.WHOOP_LIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC22400l.STRENGTH_BUILDER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC22400l.BEHAVIOR_IMPACTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC22400l.SLEEP_PILLAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC22400l.RECOVERY_PILLAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC22400l.STRAIN_PILLAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC22400l.CUSTOMIZE_KEY_STATISTICS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC22400l.CUSTOMIZE_MY_DASHBOARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f73305a = iArr;
        }
    }

    public C18684n(C38459a requestDateGetter, FeatureFlagChecker featureFlagChecker, C15967b homeAnalyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(requestDateGetter, "requestDateGetter");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(homeAnalyticsHelper, "homeAnalyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.requestDateGetter = requestDateGetter;
        this.featureFlagChecker = featureFlagChecker;
        this.homeAnalyticsHelper = homeAnalyticsHelper;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC12177a.h0 m54252e(C14599c homeFeed, boolean fromFab, EnumC14603g sourcePillar) {
        C14600d homeMetaData = homeFeed.getHomeMetaData();
        long cycleId = homeMetaData.getCycleId();
        String string = homeMetaData.getCurrentCycleStartDay().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        String string2 = homeMetaData.getCurrentCycleEndDay().toString();
        AbstractC22676k.m65749i(string2, "toString(...)");
        return new AbstractC12177a.h0(fromFab, sourcePillar, cycleId, string, string2, homeMetaData.getWhoopLiveMetaData().getDayStrainValue(), homeMetaData.getWhoopLiveMetaData().getRecoveryScoreValue(), homeMetaData.getWhoopLiveMetaData().getMillisOfSleep(), homeMetaData.getWhoopLiveMetaData().getCalories(), homeMetaData.getHasRecovery(), false, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, null);
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC13340n.b m54253f(AbstractC18642s.e0 event) {
        switch (a.f73305a[event.getCtaNavType().ordinal()]) {
            case 8:
                return new AbstractC13340n.b(EnumC14603g.SLEEP);
            case 9:
                return new AbstractC13340n.b(EnumC14603g.RECOVERY);
            case 10:
                return new AbstractC13340n.b(EnumC14603g.STRAIN);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private final AbstractC12177a m54254g(AbstractC18642s.p event, LocalDate currentDay, EnumC14603g pillarType) {
        int i13 = a.f73305a[event.getHomeCtaType().ordinal()];
        if (i13 == 11) {
            return new AbstractC12177a.i(event.getIsOnboardingState());
        }
        if (i13 == 12) {
            return new AbstractC12177a.h(event.getIsOnboardingState());
        }
        switch (i13) {
            case 1:
                LocalDate localDateNow = currentDay == null ? LocalDate.now() : currentDay;
                AbstractC22676k.m65747g(localDateNow);
                return new AbstractC12177a.b(localDateNow, false, false, pillarType, false, null, null, event.getFromMyDay(), 114, null);
            case 2:
                String str = event.getFromMyDay() ? "my_day" : "SectionHeaderFab";
                LocalDate localDateNow2 = currentDay == null ? LocalDate.now() : currentDay;
                AbstractC22676k.m65747g(localDateNow2);
                String string = (currentDay == null ? LocalDate.now() : currentDay).toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                return new AbstractC12177a.r(false, pillarType, str, false, false, -1L, null, null, localDateNow2, null, string);
            case 3:
                return new AbstractC12177a.x(false, pillarType, event.getFromMyDay());
            case 4:
                return new AbstractC12177a.y(false, pillarType, event.getFromMyDay());
            case 5:
                C14600d homeMetaData = event.getHomeMetaData();
                if (homeMetaData == null) {
                    return new AbstractC12177a.h0(false, pillarType, 0L, "", "", 0.0d, -1, -1L, -1, false, event.getFromMyDay());
                }
                long cycleId = homeMetaData.getCycleId();
                String string2 = homeMetaData.getCurrentCycleStartDay().toString();
                AbstractC22676k.m65749i(string2, "toString(...)");
                String string3 = homeMetaData.getCurrentCycleEndDay().toString();
                AbstractC22676k.m65749i(string3, "toString(...)");
                return new AbstractC12177a.h0(false, pillarType, cycleId, string2, string3, homeMetaData.getWhoopLiveMetaData().getDayStrainValue(), homeMetaData.getWhoopLiveMetaData().getRecoveryScoreValue(), homeMetaData.getWhoopLiveMetaData().getMillisOfSleep(), homeMetaData.getWhoopLiveMetaData().getCalories(), homeMetaData.getHasRecovery(), event.getFromMyDay());
            case 6:
                return new AbstractC12177a.z(false, pillarType, event.getFromMyDay());
            default:
                throw new IllegalArgumentException("Could not find header CTA type: " + event.getHomeCtaType());
        }
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC12177a m54255a(EnumC22400l fabItem, C14599c homeFeed, EnumC14603g sourcePillar) {
        AbstractC22676k.m65750j(fabItem, "fabItem");
        AbstractC22676k.m65750j(homeFeed, "homeFeed");
        switch (a.f73305a[fabItem.ordinal()]) {
            case 1:
                return new AbstractC12177a.b(homeFeed.getHomeMetaData().getCurrentDay(), false, true, sourcePillar, false, null, null, false, 242, null);
            case 2:
                return m54256b(true, homeFeed.getHomeMetaData(), sourcePillar, "Fab");
            case 3:
                return new AbstractC12177a.x(true, sourcePillar, false, 4, null);
            case 4:
                return new AbstractC12177a.y(true, sourcePillar, false, 4, null);
            case 5:
                return m54252e(homeFeed, true, sourcePillar);
            case 6:
                return new AbstractC12177a.z(true, sourcePillar, false, 4, null);
            case 7:
                return AbstractC12177a.f.f40517a;
            default:
                this.logger.mo85228t("Unknown FabItem selected " + fabItem, new AbstractC30556a.a[0]);
                return AbstractC12177a.d0.f40512a;
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC12177a.r m54256b(boolean fromFab, C14600d homeMetadata, EnumC14603g sourcePillar, String source) {
        AbstractC22676k.m65750j(source, "source");
        if (homeMetadata == null) {
            throw new IllegalArgumentException("Metadata cannot be null for Journal navigation");
        }
        boolean isAutoPop = homeMetadata.getJournalMeta().getIsAutoPop();
        long cycleId = homeMetadata.getCycleId();
        C14598b previousCycleDuring = homeMetadata.getJournalMeta().getPreviousCycleDuring();
        Long lValueOf = previousCycleDuring != null ? Long.valueOf(previousCycleDuring.getLowerEndpoint()) : null;
        C14598b previousCycleDuring2 = homeMetadata.getJournalMeta().getPreviousCycleDuring();
        return new AbstractC12177a.r(fromFab, sourcePillar, source, isAutoPop, homeMetadata.getJournalMeta().getShouldShowJournalTutorial(), cycleId, lValueOf, previousCycleDuring2 != null ? Long.valueOf(previousCycleDuring2.getUpperEndpoint()) : null, homeMetadata.getCurrentCycleStartDay(), homeMetadata.getCurrentCycleEndDay(), this.requestDateGetter.m123250a(homeMetadata, this.featureFlagChecker));
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC12177a m54257c(AbstractC18642s event, LocalDate currentDay, EnumC14603g pillarType) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC18642s.d) {
            AbstractC18642s.d dVar = (AbstractC18642s.d) event;
            return new AbstractC12177a.c(dVar.getSuggestionCategory(), dVar.getHint(), dVar.getContextualMessage(), dVar.getCycleId(), pillarType, dVar.getEducationType(), dVar.getConversationSeedId(), dVar.getSourceType(), dVar.getSourceId());
        }
        if (event instanceof AbstractC18642s.a) {
            AbstractC18642s.a aVar = (AbstractC18642s.a) event;
            return new AbstractC12177a.a(aVar.getActivityIdV1(), aVar.getActivityIdV2(), aVar.getActivityType(), aVar.getLocalDate(), aVar.getWhoopActivity(), pillarType);
        }
        if (event instanceof AbstractC18642s.b) {
            LocalDate localDateNow = currentDay;
            if (localDateNow == null) {
                localDateNow = LocalDate.now();
            }
            LocalDate localDate = localDateNow;
            AbstractC22676k.m65747g(localDate);
            AbstractC18642s.b bVar = (AbstractC18642s.b) event;
            return new AbstractC12177a.b(localDate, true, false, null, bVar.getIsGdcFlow(), null, bVar.getActivityInternalName(), false, 172, null);
        }
        LocalDate localDateNow2 = currentDay;
        if (event instanceof AbstractC18642s.a0) {
            return new AbstractC12177a.x(false, pillarType, false, 4, null);
        }
        if (event instanceof AbstractC18642s.f) {
            return new AbstractC12177a.d(((AbstractC18642s.f) event).getNavType());
        }
        if (event instanceof AbstractC18642s.h) {
            return AbstractC12177a.f.f40517a;
        }
        if (event instanceof AbstractC18642s.j) {
            return new AbstractC12177a.g(((AbstractC18642s.j) event).getConnectivityNavType(), pillarType, null, 4, null);
        }
        if (event instanceof AbstractC18642s.l) {
            AbstractC18642s.l lVar = (AbstractC18642s.l) event;
            return new AbstractC12177a.l(lVar.m54036b(), lVar.m54035a());
        }
        if (event instanceof AbstractC18642s.n) {
            return new AbstractC12177a.o(pillarType);
        }
        if (event instanceof AbstractC18642s.o) {
            AbstractC18642s.o oVar = (AbstractC18642s.o) event;
            return new AbstractC12177a.p(oVar.getHelpType(), oVar.getFromTile(), null, 4, null);
        }
        if (event instanceof AbstractC18642s.p) {
            return m54254g((AbstractC18642s.p) event, localDateNow2, pillarType);
        }
        if (event instanceof AbstractC18642s.q) {
            return m54256b(false, ((AbstractC18642s.q) event).getHomeMetaData(), pillarType, "Home Feed");
        }
        if (event instanceof AbstractC18642s.y) {
            String gaugeType = ((AbstractC18642s.y) event).getGaugeType();
            if (localDateNow2 == null) {
                localDateNow2 = LocalDate.now();
            }
            AbstractC22676k.m65747g(localDateNow2);
            return new AbstractC12177a.v(gaugeType, localDateNow2, pillarType);
        }
        if (event instanceof AbstractC18642s.b0) {
            return new AbstractC12177a.a0(localDateNow2);
        }
        if (event instanceof AbstractC18642s.c0) {
            AbstractC18642s.c0 c0Var = (AbstractC18642s.c0) event;
            return new AbstractC12177a.q(c0Var.getTrendKey(), c0Var.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), c0Var.getSource(), pillarType, c0Var.getSendTileProperties());
        }
        if (event instanceof AbstractC18642s.d0) {
            return new AbstractC12177a.c0(((AbstractC18642s.d0) event).getNotificationTileId());
        }
        if (event instanceof AbstractC18642s.e0) {
            return new AbstractC12177a.e0(((AbstractC18642s.e0) event).getCtaNavType(), pillarType);
        }
        if (event instanceof AbstractC18642s.f0) {
            return AbstractC12177a.f0.f40518a;
        }
        if (event instanceof AbstractC18642s.g0) {
            return AbstractC12177a.g0.f40523a;
        }
        if (event instanceof AbstractC18642s.g) {
            AbstractC18642s.g gVar = (AbstractC18642s.g) event;
            return new AbstractC12177a.s(gVar.getNavigationAction(), gVar.getActionArgument(), gVar.getFromMyDay());
        }
        if (!(event instanceof AbstractC18642s.t)) {
            return null;
        }
        AbstractC18642s.t tVar = (AbstractC18642s.t) event;
        C32079b analytics = tVar.getAnalytics();
        if (analytics != null) {
            C15967b c15967b = this.homeAnalyticsHelper;
            String eventName = analytics.getEventName();
            if (eventName == null) {
                eventName = "Discover More Section";
            }
            C15967b.m45049u(c15967b, eventName, analytics.getCategory(), "click", analytics.getLabel(), analytics.getValue(), null, 32, null);
        }
        C9598e navigationAction = tVar.getNavigationAction();
        if (navigationAction != null) {
            return new AbstractC12177a.s(navigationAction, null, false, 6, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13346t m54258d(AbstractC18642s event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC18642s.e0) {
            return m54253f((AbstractC18642s.e0) event);
        }
        if (event instanceof AbstractC18642s.c) {
            AbstractC18642s.c cVar = (AbstractC18642s.c) event;
            return new AbstractC13343q.a(cVar.getGpsEnabled(), cVar.getStartAt(), cVar.getSportId(), "WAD Activity Save");
        }
        if (event instanceof AbstractC18642s.z) {
            AbstractC18642s.z zVar = (AbstractC18642s.z) event;
            return new AbstractC13343q.c(zVar.getCycleId(), zVar.getSource());
        }
        if (event instanceof AbstractC18642s.k) {
            return new AbstractC13331e.b(((AbstractC18642s.k) event).getCycleId());
        }
        if (event instanceof AbstractC18642s.h) {
            if (((AbstractC18642s.h) event).getDismiss()) {
                return AbstractC13331e.a.f46192a;
            }
            return null;
        }
        if (event instanceof AbstractC18642s.v) {
            return AbstractC13333g.c.f46197a;
        }
        if (event instanceof AbstractC18642s.x) {
            return AbstractC13333g.e.f46199a;
        }
        if (event instanceof AbstractC18642s.w) {
            return AbstractC13333g.d.f46198a;
        }
        if (event instanceof AbstractC18642s.r) {
            return AbstractC13333g.b.f46196a;
        }
        if (event instanceof AbstractC18642s.e) {
            return new AbstractC13330d.a(((AbstractC18642s.e) event).getId());
        }
        if (event instanceof AbstractC18642s.u) {
            return new AbstractC13340n.a(((AbstractC18642s.u) event).getAction());
        }
        if (event instanceof AbstractC18642s.s) {
            return AbstractC13330d.b.f46191a;
        }
        if (event instanceof AbstractC18642s.m) {
            return AbstractC13332f.a.f46194a;
        }
        if (!(event instanceof AbstractC18642s.i)) {
            return null;
        }
        AbstractC18642s.i iVar = (AbstractC18642s.i) event;
        return new AbstractC13325a.a(iVar.getNavigationAction().getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName(), AbstractC21772c.m61573a(iVar.getNavigationAction()));
    }

    public /* synthetic */ C18684n(C38459a c38459a, FeatureFlagChecker featureFlagChecker, C15967b c15967b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c38459a, featureFlagChecker, c15967b, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HomeEventBuilder") : interfaceC34116n);
    }
}
