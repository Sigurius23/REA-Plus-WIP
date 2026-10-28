package com.whoop.service.push;

import android.app.NotificationManager;
import android.content.Context;
import bc3.InterfaceC2994c0;
import com.whoop.data.remote.AppConfigurationRepository;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.NotificationRepository;
import com.whoop.data.repositories.SmartAlarmTriggerRepository;
import com.whoop.service.push.notifications.C10000l;
import com.whoop.service.push.notifications.C10001m;
import com.whoop.service.push.notifications.C10002n;
import com.whoop.service.push.notifications.C9989a;
import com.whoop.service.push.notifications.C9990b;
import com.whoop.service.push.notifications.C9992d;
import com.whoop.service.push.notifications.C9994f;
import com.whoop.service.push.notifications.C9995g;
import com.whoop.service.push.notifications.C9996h;
import com.whoop.service.push.notifications.C9997i;
import com.whoop.service.push.notifications.C9998j;
import com.whoop.service.push.notifications.C9999k;
import cq0.C11059g;
import dp0.InterfaceC12251g;
import hj0.C17345d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import m92.C25323f;
import m92.InterfaceC25322e;
import o92.C27691a;
import o92.C27696c0;
import o92.C27704g0;
import o92.C27706h0;
import o92.C27708i0;
import o92.C27710j0;
import o92.C27714l0;
import o92.C27720r;
import o92.C27721s;
import od1.C27858u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p92.C29020i;
import pd1.C29104a;
import rr2.InterfaceC31766c;
import rv1.C31842a;
import us0.C35210f;
import we1.C37223g;
import we1.InterfaceC37217a;
import wm0.C37378a;
import x82.C38082i;
import yp0.InterfaceC39700a;
import z82.C40191e;
import z82.C40197k;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: com.whoop.service.push.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 t2\u00020\u0001:\u0001;BÙ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\b\b\u0002\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0019\u0010;\u001a\u0004\u0018\u00010:2\u0006\u00109\u001a\u000208H\u0007¢\u0006\u0004\b;\u0010<J%\u0010B\u001a\u00020A2\u0006\u00109\u001a\u0002082\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006u"}, m65681d2 = {"Lcom/whoop/service/push/b;", "", "Lrr2/c;", "crashReporter", "Lcq0/g;", "teamsRepository", "Lod1/u;", "userContext", "Lrv1/a;", "membershipRepository", "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;", "smartAlarmTriggerRepository", "Lz82/e;", "eventDispatcher", "Lp92/i;", "realTimeStreamController", "Lx82/i;", "batteryMonitor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcom/whoop/data/repositories/NotificationRepository;", "notificationRepository", "Lwm0/a;", "scopeCoordinator", "Lz82/k;", "analyticsManager", "Lus0/f;", "historySyncAnalytics", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lwe1/a;", "entitlementChecker", "Lyp0/a;", "communityAccessChecker", "Lwe1/g;", "entitlementsRepository", "Lcom/whoop/data/remote/AppConfigurationRepository;", "appConfigurationRepository", "Lzr2/a;", "dateAndTimeProvider", "Lo92/j0;", "stressMonitorPushNotificationTitleGetter", "Lo92/c0;", "sleepNeedPushNotificationBodyGetter", "Lpd1/a;", "bootstrapUserSignIn", "Liy1/c;", "metricWriter", "Ldp0/g;", "globalCoachManager", "Lhj0/d;", "appLifecycle", "Lbc3/c0;", "scope", "<init>", "(Lrr2/c;Lcq0/g;Lod1/u;Lrv1/a;Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lz82/e;Lp92/i;Lx82/i;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/data/repositories/NotificationRepository;Lwm0/a;Lz82/k;Lus0/f;Lcom/whoop/data/repositories/FeatureFlagRepository;Lwe1/a;Lyp0/a;Lwe1/g;Lcom/whoop/data/remote/AppConfigurationRepository;Lzr2/a;Lo92/j0;Lo92/c0;Lpd1/a;Liy1/c;Ldp0/g;Lhj0/d;Lbc3/c0;)V", "", "notificationType", "Lm92/e;", "a", "(Ljava/lang/String;)Lm92/e;", "Lm92/f;", "dataMap", "Landroid/content/Context;", "context", "", "b", "(Ljava/lang/String;Lm92/f;Landroid/content/Context;)Z", "Lrr2/c;", "Lcq0/g;", "c", "Lod1/u;", "d", "Lrv1/a;", "e", "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;", "f", "Lz82/e;", "g", "Lp92/i;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lx82/i;", "i", "Lwm0/a;", "j", "Lz82/k;", "k", "Lus0/f;", "l", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "m", "Lwe1/a;", "n", "Lyp0/a;", "o", "Lwe1/g;", "p", "Lcom/whoop/data/remote/AppConfigurationRepository;", "q", "Lzr2/a;", "r", "Lo92/j0;", "s", "Lo92/c0;", "t", "Lpd1/a;", "u", "Liy1/c;", "v", "Ldp0/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lhj0/d;", "Lo92/s;", "x", "Lo92/s;", "pushContext", "y", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C9985b {

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: z */
    public static final int f29486z = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11059g teamsRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C31842a membershipRepository;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final SmartAlarmTriggerRepository smartAlarmTriggerRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C29020i realTimeStreamController;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C38082i batteryMonitor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C37378a scopeCoordinator;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C40197k analyticsManager;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C35210f historySyncAnalytics;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC37217a entitlementChecker;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final InterfaceC39700a communityAccessChecker;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C37223g entitlementsRepository;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final AppConfigurationRepository appConfigurationRepository;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C27710j0 stressMonitorPushNotificationTitleGetter;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C27696c0 sleepNeedPushNotificationBodyGetter;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C29104a bootstrapUserSignIn;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final InterfaceC12251g globalCoachManager;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C17345d appLifecycle;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C27721s pushContext;

    /* JADX INFO: renamed from: com.whoop.service.push.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/service/push/b$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m24512a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            C9989a.INSTANCE.m24526a(context, manager);
            C9992d.INSTANCE.m24538a(context, manager);
            C9990b.INSTANCE.m24530a(context, manager);
            C9996h.INSTANCE.m24564a(context, manager);
            C9998j.INSTANCE.m24576a(context, manager);
            C27691a.INSTANCE.m83711a(context, manager);
            C9997i.INSTANCE.m24572b(context, manager);
            C9995g.INSTANCE.m24559b(context, manager);
            C9994f.INSTANCE.m24552a(context, manager);
            C10001m.INSTANCE.m24600b(context, manager);
            C10000l.INSTANCE.m24590a(context, manager);
            C9999k.INSTANCE.m24579a(context, manager);
            C27714l0.INSTANCE.m83769a(context, manager);
            C27720r.INSTANCE.m83781a(context, manager);
            C10002n.INSTANCE.m24602a(context, manager);
            C27708i0.INSTANCE.m83758a(context, manager);
            C27706h0.INSTANCE.m83747a(context, manager);
            C27704g0.INSTANCE.m83744a(context, manager);
        }

        private Companion() {
        }
    }

    public C9985b(InterfaceC31766c crashReporter, C11059g teamsRepository, C27858u userContext, C31842a membershipRepository, SmartAlarmTriggerRepository smartAlarmTriggerRepository, C40191e eventDispatcher, C29020i realTimeStreamController, C38082i batteryMonitor, FeatureFlagChecker featureFlagChecker, NotificationRepository notificationRepository, C37378a scopeCoordinator, C40197k analyticsManager, C35210f historySyncAnalytics, FeatureFlagRepository featureFlagRepository, InterfaceC37217a entitlementChecker, InterfaceC39700a communityAccessChecker, C37223g entitlementsRepository, AppConfigurationRepository appConfigurationRepository, InterfaceC41070a dateAndTimeProvider, C27710j0 stressMonitorPushNotificationTitleGetter, C27696c0 sleepNeedPushNotificationBodyGetter, C29104a bootstrapUserSignIn, InterfaceC21030c metricWriter, InterfaceC12251g globalCoachManager, C17345d appLifecycle, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(teamsRepository, "teamsRepository");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(membershipRepository, "membershipRepository");
        AbstractC22676k.m65750j(smartAlarmTriggerRepository, "smartAlarmTriggerRepository");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(realTimeStreamController, "realTimeStreamController");
        AbstractC22676k.m65750j(batteryMonitor, "batteryMonitor");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(notificationRepository, "notificationRepository");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(historySyncAnalytics, "historySyncAnalytics");
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(entitlementChecker, "entitlementChecker");
        AbstractC22676k.m65750j(communityAccessChecker, "communityAccessChecker");
        AbstractC22676k.m65750j(entitlementsRepository, "entitlementsRepository");
        AbstractC22676k.m65750j(appConfigurationRepository, "appConfigurationRepository");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(stressMonitorPushNotificationTitleGetter, "stressMonitorPushNotificationTitleGetter");
        AbstractC22676k.m65750j(sleepNeedPushNotificationBodyGetter, "sleepNeedPushNotificationBodyGetter");
        AbstractC22676k.m65750j(bootstrapUserSignIn, "bootstrapUserSignIn");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(globalCoachManager, "globalCoachManager");
        AbstractC22676k.m65750j(appLifecycle, "appLifecycle");
        AbstractC22676k.m65750j(scope, "scope");
        this.crashReporter = crashReporter;
        this.teamsRepository = teamsRepository;
        this.userContext = userContext;
        this.membershipRepository = membershipRepository;
        this.smartAlarmTriggerRepository = smartAlarmTriggerRepository;
        this.eventDispatcher = eventDispatcher;
        this.realTimeStreamController = realTimeStreamController;
        this.batteryMonitor = batteryMonitor;
        this.scopeCoordinator = scopeCoordinator;
        this.analyticsManager = analyticsManager;
        this.historySyncAnalytics = historySyncAnalytics;
        this.featureFlagRepository = featureFlagRepository;
        this.entitlementChecker = entitlementChecker;
        this.communityAccessChecker = communityAccessChecker;
        this.entitlementsRepository = entitlementsRepository;
        this.appConfigurationRepository = appConfigurationRepository;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.stressMonitorPushNotificationTitleGetter = stressMonitorPushNotificationTitleGetter;
        this.sleepNeedPushNotificationBodyGetter = sleepNeedPushNotificationBodyGetter;
        this.bootstrapUserSignIn = bootstrapUserSignIn;
        this.metricWriter = metricWriter;
        this.globalCoachManager = globalCoachManager;
        this.appLifecycle = appLifecycle;
        this.pushContext = new C27721s(crashReporter, featureFlagChecker, notificationRepository, scope);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0309, code lost:
    
        if (r6.equals("Study Completed") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0323, code lost:
    
        if (r6.equals("whoop_labs") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x032d, code lost:
    
        return new com.whoop.service.push.notifications.C10002n(r5.pushContext);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m92.InterfaceC25322e m24510a(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.service.push.C9985b.m24510a(java.lang.String):m92.e");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m24511b(String notificationType, C25323f dataMap, Context context) {
        AbstractC22676k.m65750j(notificationType, "notificationType");
        AbstractC22676k.m65750j(dataMap, "dataMap");
        AbstractC22676k.m65750j(context, "context");
        InterfaceC25322e interfaceC25322eM24510a = m24510a(notificationType);
        if (interfaceC25322eM24510a != null) {
            interfaceC25322eM24510a.mo24524a(dataMap, context);
        }
        return interfaceC25322eM24510a != null;
    }
}
