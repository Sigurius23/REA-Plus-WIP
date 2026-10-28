package hj0;

import av0.C2093a;
import b12.InterfaceC2285a;
import c92.C4335g;
import com.whoop.data.onboarding.OnboardingStatusInteractor;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.UserRepository;
import com.whoop.service.push.notifications.C9993e;
import dq0.C12286d;
import dx0.C12423b;
import dy1.C12448d;
import e82.C12853a;
import eq1.C13562a;
import f70.C14202r;
import i03.C17848a;
import ia0.C18292a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21153l0;
import ji0.C21717e;
import lj0.C24465d;
import lj0.C24470i;
import lm0.C24509d;
import mx0.C25993c;
import ni0.C26733d;
import nl1.C26813a;
import o92.C27702f0;
import o92.C27707i;
import od1.C27838b;
import od1.C27839b0;
import od1.C27843f;
import od1.C27861x;
import or2.C28195r;
import or2.C28210w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pj1.C29297a;
import pr2.C29493a;
import qh2.C30370b;
import rk2.C31505i;
import rr2.C31778o;
import rv1.C31842a;
import sh1.C32506e;
import sk2.C32574a;
import tr2.C34104b;
import us0.InterfaceC35205a;
import we1.C37223g;
import wg1.C37264c;
import x42.C37966c;
import xs1.C38639a;
import y42.C39228j;
import z82.C40192f;

/* JADX INFO: renamed from: hj0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bb\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010G\u001a\u00020F\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020J\u0012\u0006\u0010M\u001a\u00020L\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010Q\u001a\u00020P\u0012\u0006\u0010S\u001a\u00020R\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010[\u001a\u00020Z\u0012\u0006\u0010]\u001a\u00020\\\u0012\u0006\u0010_\u001a\u00020^\u0012\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\r\u0010e\u001a\u00020d¢\u0006\u0004\be\u0010fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010gR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0016\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0016\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0016\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0016\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0016\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0016\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0016\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0016\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0016\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0016\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0016\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0016\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0016\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0016\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0016\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0016\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0016\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0016\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0016\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0016\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0016\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0016\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001¨\u0006Æ\u0001"}, m65681d2 = {"Lhj0/b;", "", "Lia0/a;", "activityTypesRepository", "Li03/a;", "appForegroundWidgetUpdateTrigger", "Ltr2/b;", "appStateLogger", "Lhj0/d;", "applicationLifecycleObserver", "Lpr2/a;", "avatarObserver", "Lus0/a;", "backgroundUsageAggregator", "Lc92/g;", "bluetoothSyncManager", "Lf70/r;", "appDestinationCacheLifecycleHandler", "Lod1/b;", "cacheLifecycleHandler", "Lav0/a;", "connectivityCrashContextReporter", "Lor2/r;", "crashReporterFeatureFlagInstaller", "Lod1/f;", "cycleMgr", "Ldx0/b;", "dataSyncServiceManager", "Lni0/d;", "designModelMapperContributionInstaller", "Lor2/w;", "deviceStateLogger", "Lji0/e;", "appConfigurationRepository", "Lwe1/g;", "entitlementsRepository", "Lsh1/e;", "gpsCollectionLifecycleHandler", "Lpj1/a;", "healthConnectChecker", "Lmx0/c;", "highWatermarkHelper", "Leq1/a;", "hrZonesRepository", "Lz82/f;", "internetAppForegroundEventSender", "Lxs1/a;", "labradorReadingResultDbLifecycleHandler", "Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "Lrv1/a;", "membershipRepository", "Lqh2/b;", "metricsHistorySync", "Lcom/whoop/data/onboarding/OnboardingStatusInteractor;", "onboardingStatusInteractor", "Llj0/i;", "packetSnifferAnalytics", "Lo92/f0;", "strapOffBodyNotification", "Lo92/i;", "firmwareUpdateNotification", "Lcom/whoop/service/push/notifications/e;", "dorsetDetectedNotification", "Lod1/x;", "userMgr", "Lcom/whoop/data/repositories/UserRepository;", "userRepository", "Lwg1/c;", "periodicFwUpdateInitializer", "Lnl1/a;", "newFirmwareUpdateMonitor", "Lrr2/o;", "sentryReporter", "Lx42/c;", "puffinFwUpdateMonitor", "Ldy1/d;", "newMemfaultManager", "Ly42/j;", "puffinManager", "Lj02/l0;", "navigationReporter", "Lb12/a;", "deadBatteryNotificationMonitor", "Llj0/d;", "historyPullThroughputAnalytics", "Lod1/b0;", "userStateLifecycleObserver", "Llm0/d;", "bondLossReceiver", "Le82/a;", "r10RealtimeStream", "Ldq0/d;", "streamSessionLifecycleHandler", "Lrk2/i;", "trackActivityLogoutLifecycleHandler", "Lsk2/a;", "trackActivityPrefetchScheduler", "<init>", "(Lia0/a;Li03/a;Ltr2/b;Lhj0/d;Lpr2/a;Lus0/a;Lc92/g;Lf70/r;Lod1/b;Lav0/a;Lor2/r;Lod1/f;Ldx0/b;Lni0/d;Lor2/w;Lji0/e;Lwe1/g;Lsh1/e;Lpj1/a;Lmx0/c;Leq1/a;Lz82/f;Lxs1/a;Lcom/whoop/data/repositories/LanguageRepository;Lrv1/a;Lqh2/b;Lcom/whoop/data/onboarding/OnboardingStatusInteractor;Llj0/i;Lo92/f0;Lo92/i;Lcom/whoop/service/push/notifications/e;Lod1/x;Lcom/whoop/data/repositories/UserRepository;Lwg1/c;Lnl1/a;Lrr2/o;Lx42/c;Ldy1/d;Ly42/j;Lj02/l0;Lb12/a;Llj0/d;Lod1/b0;Llm0/d;Le82/a;Ldq0/d;Lrk2/i;Lsk2/a;)V", "Ll83/a0;", "a", "()V", "Lia0/a;", "b", "Li03/a;", "c", "Ltr2/b;", "d", "Lhj0/d;", "e", "Lpr2/a;", "f", "Lus0/a;", "g", "Lc92/g;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lf70/r;", "i", "Lod1/b;", "j", "Lav0/a;", "k", "Lor2/r;", "l", "Lod1/f;", "m", "Ldx0/b;", "n", "Lni0/d;", "o", "Lor2/w;", "p", "Lji0/e;", "q", "Lwe1/g;", "r", "Lsh1/e;", "s", "Lpj1/a;", "t", "Lmx0/c;", "u", "Leq1/a;", "v", "Lz82/f;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lxs1/a;", "x", "Lcom/whoop/data/repositories/LanguageRepository;", "y", "Lrv1/a;", "z", "Lqh2/b;", "A", "Lcom/whoop/data/onboarding/OnboardingStatusInteractor;", "B", "Llj0/i;", "C", "Lo92/f0;", "D", "Lo92/i;", "E", "Lcom/whoop/service/push/notifications/e;", "F", "Lod1/x;", "G", "Lcom/whoop/data/repositories/UserRepository;", "H", "Lwg1/c;", "I", "Lnl1/a;", "J", "Lrr2/o;", "K", "Lx42/c;", "L", "Ldy1/d;", "M", "Ly42/j;", "N", "Lj02/l0;", "O", "Lb12/a;", "P", "Llj0/d;", "Q", "Lod1/b0;", "R", "Llm0/d;", "S", "Le82/a;", "T", "Ldq0/d;", "U", "Lrk2/i;", "V", "Lsk2/a;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17343b {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final OnboardingStatusInteractor onboardingStatusInteractor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final C24470i packetSnifferAnalytics;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final C27702f0 strapOffBodyNotification;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final C27707i firmwareUpdateNotification;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C9993e dorsetDetectedNotification;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C27861x userMgr;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final UserRepository userRepository;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C37264c periodicFwUpdateInitializer;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C26813a newFirmwareUpdateMonitor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C31778o sentryReporter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final C37966c puffinFwUpdateMonitor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final C12448d newMemfaultManager;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final C39228j puffinManager;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC21153l0 navigationReporter;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC2285a deadBatteryNotificationMonitor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final C24465d historyPullThroughputAnalytics;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final C27839b0 userStateLifecycleObserver;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final C24509d bondLossReceiver;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final C12853a r10RealtimeStream;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final C12286d streamSessionLifecycleHandler;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final C31505i trackActivityLogoutLifecycleHandler;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final C32574a trackActivityPrefetchScheduler;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C18292a activityTypesRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C17848a appForegroundWidgetUpdateTrigger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C34104b appStateLogger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17345d applicationLifecycleObserver;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C29493a avatarObserver;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC35205a backgroundUsageAggregator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C4335g bluetoothSyncManager;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C14202r appDestinationCacheLifecycleHandler;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C27838b cacheLifecycleHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C2093a connectivityCrashContextReporter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C28195r crashReporterFeatureFlagInstaller;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C27843f cycleMgr;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final C12423b dataSyncServiceManager;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final C26733d designModelMapperContributionInstaller;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final C28210w deviceStateLogger;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final C21717e appConfigurationRepository;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final C37223g entitlementsRepository;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final C32506e gpsCollectionLifecycleHandler;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final C29297a healthConnectChecker;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final C25993c highWatermarkHelper;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final C13562a hrZonesRepository;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final C40192f internetAppForegroundEventSender;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C38639a labradorReadingResultDbLifecycleHandler;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final LanguageRepository languageRepository;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C31842a membershipRepository;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C30370b metricsHistorySync;

    public C17343b(C18292a activityTypesRepository, C17848a appForegroundWidgetUpdateTrigger, C34104b appStateLogger, C17345d applicationLifecycleObserver, C29493a avatarObserver, InterfaceC35205a backgroundUsageAggregator, C4335g bluetoothSyncManager, C14202r appDestinationCacheLifecycleHandler, C27838b cacheLifecycleHandler, C2093a connectivityCrashContextReporter, C28195r crashReporterFeatureFlagInstaller, C27843f cycleMgr, C12423b dataSyncServiceManager, C26733d designModelMapperContributionInstaller, C28210w deviceStateLogger, C21717e appConfigurationRepository, C37223g entitlementsRepository, C32506e gpsCollectionLifecycleHandler, C29297a healthConnectChecker, C25993c highWatermarkHelper, C13562a hrZonesRepository, C40192f internetAppForegroundEventSender, C38639a labradorReadingResultDbLifecycleHandler, LanguageRepository languageRepository, C31842a membershipRepository, C30370b metricsHistorySync, OnboardingStatusInteractor onboardingStatusInteractor, C24470i packetSnifferAnalytics, C27702f0 strapOffBodyNotification, C27707i firmwareUpdateNotification, C9993e dorsetDetectedNotification, C27861x userMgr, UserRepository userRepository, C37264c periodicFwUpdateInitializer, C26813a newFirmwareUpdateMonitor, C31778o sentryReporter, C37966c puffinFwUpdateMonitor, C12448d newMemfaultManager, C39228j puffinManager, InterfaceC21153l0 navigationReporter, InterfaceC2285a deadBatteryNotificationMonitor, C24465d historyPullThroughputAnalytics, C27839b0 userStateLifecycleObserver, C24509d bondLossReceiver, C12853a r10RealtimeStream, C12286d streamSessionLifecycleHandler, C31505i trackActivityLogoutLifecycleHandler, C32574a trackActivityPrefetchScheduler) {
        AbstractC22676k.m65750j(activityTypesRepository, "activityTypesRepository");
        AbstractC22676k.m65750j(appForegroundWidgetUpdateTrigger, "appForegroundWidgetUpdateTrigger");
        AbstractC22676k.m65750j(appStateLogger, "appStateLogger");
        AbstractC22676k.m65750j(applicationLifecycleObserver, "applicationLifecycleObserver");
        AbstractC22676k.m65750j(avatarObserver, "avatarObserver");
        AbstractC22676k.m65750j(backgroundUsageAggregator, "backgroundUsageAggregator");
        AbstractC22676k.m65750j(bluetoothSyncManager, "bluetoothSyncManager");
        AbstractC22676k.m65750j(appDestinationCacheLifecycleHandler, "appDestinationCacheLifecycleHandler");
        AbstractC22676k.m65750j(cacheLifecycleHandler, "cacheLifecycleHandler");
        AbstractC22676k.m65750j(connectivityCrashContextReporter, "connectivityCrashContextReporter");
        AbstractC22676k.m65750j(crashReporterFeatureFlagInstaller, "crashReporterFeatureFlagInstaller");
        AbstractC22676k.m65750j(cycleMgr, "cycleMgr");
        AbstractC22676k.m65750j(dataSyncServiceManager, "dataSyncServiceManager");
        AbstractC22676k.m65750j(designModelMapperContributionInstaller, "designModelMapperContributionInstaller");
        AbstractC22676k.m65750j(deviceStateLogger, "deviceStateLogger");
        AbstractC22676k.m65750j(appConfigurationRepository, "appConfigurationRepository");
        AbstractC22676k.m65750j(entitlementsRepository, "entitlementsRepository");
        AbstractC22676k.m65750j(gpsCollectionLifecycleHandler, "gpsCollectionLifecycleHandler");
        AbstractC22676k.m65750j(healthConnectChecker, "healthConnectChecker");
        AbstractC22676k.m65750j(highWatermarkHelper, "highWatermarkHelper");
        AbstractC22676k.m65750j(hrZonesRepository, "hrZonesRepository");
        AbstractC22676k.m65750j(internetAppForegroundEventSender, "internetAppForegroundEventSender");
        AbstractC22676k.m65750j(labradorReadingResultDbLifecycleHandler, "labradorReadingResultDbLifecycleHandler");
        AbstractC22676k.m65750j(languageRepository, "languageRepository");
        AbstractC22676k.m65750j(membershipRepository, "membershipRepository");
        AbstractC22676k.m65750j(metricsHistorySync, "metricsHistorySync");
        AbstractC22676k.m65750j(onboardingStatusInteractor, "onboardingStatusInteractor");
        AbstractC22676k.m65750j(packetSnifferAnalytics, "packetSnifferAnalytics");
        AbstractC22676k.m65750j(strapOffBodyNotification, "strapOffBodyNotification");
        AbstractC22676k.m65750j(firmwareUpdateNotification, "firmwareUpdateNotification");
        AbstractC22676k.m65750j(dorsetDetectedNotification, "dorsetDetectedNotification");
        AbstractC22676k.m65750j(userMgr, "userMgr");
        AbstractC22676k.m65750j(userRepository, "userRepository");
        AbstractC22676k.m65750j(periodicFwUpdateInitializer, "periodicFwUpdateInitializer");
        AbstractC22676k.m65750j(newFirmwareUpdateMonitor, "newFirmwareUpdateMonitor");
        AbstractC22676k.m65750j(sentryReporter, "sentryReporter");
        AbstractC22676k.m65750j(puffinFwUpdateMonitor, "puffinFwUpdateMonitor");
        AbstractC22676k.m65750j(newMemfaultManager, "newMemfaultManager");
        AbstractC22676k.m65750j(puffinManager, "puffinManager");
        AbstractC22676k.m65750j(navigationReporter, "navigationReporter");
        AbstractC22676k.m65750j(deadBatteryNotificationMonitor, "deadBatteryNotificationMonitor");
        AbstractC22676k.m65750j(historyPullThroughputAnalytics, "historyPullThroughputAnalytics");
        AbstractC22676k.m65750j(userStateLifecycleObserver, "userStateLifecycleObserver");
        AbstractC22676k.m65750j(bondLossReceiver, "bondLossReceiver");
        AbstractC22676k.m65750j(r10RealtimeStream, "r10RealtimeStream");
        AbstractC22676k.m65750j(streamSessionLifecycleHandler, "streamSessionLifecycleHandler");
        AbstractC22676k.m65750j(trackActivityLogoutLifecycleHandler, "trackActivityLogoutLifecycleHandler");
        AbstractC22676k.m65750j(trackActivityPrefetchScheduler, "trackActivityPrefetchScheduler");
        this.activityTypesRepository = activityTypesRepository;
        this.appForegroundWidgetUpdateTrigger = appForegroundWidgetUpdateTrigger;
        this.appStateLogger = appStateLogger;
        this.applicationLifecycleObserver = applicationLifecycleObserver;
        this.avatarObserver = avatarObserver;
        this.backgroundUsageAggregator = backgroundUsageAggregator;
        this.bluetoothSyncManager = bluetoothSyncManager;
        this.appDestinationCacheLifecycleHandler = appDestinationCacheLifecycleHandler;
        this.cacheLifecycleHandler = cacheLifecycleHandler;
        this.connectivityCrashContextReporter = connectivityCrashContextReporter;
        this.crashReporterFeatureFlagInstaller = crashReporterFeatureFlagInstaller;
        this.cycleMgr = cycleMgr;
        this.dataSyncServiceManager = dataSyncServiceManager;
        this.designModelMapperContributionInstaller = designModelMapperContributionInstaller;
        this.deviceStateLogger = deviceStateLogger;
        this.appConfigurationRepository = appConfigurationRepository;
        this.entitlementsRepository = entitlementsRepository;
        this.gpsCollectionLifecycleHandler = gpsCollectionLifecycleHandler;
        this.healthConnectChecker = healthConnectChecker;
        this.highWatermarkHelper = highWatermarkHelper;
        this.hrZonesRepository = hrZonesRepository;
        this.internetAppForegroundEventSender = internetAppForegroundEventSender;
        this.labradorReadingResultDbLifecycleHandler = labradorReadingResultDbLifecycleHandler;
        this.languageRepository = languageRepository;
        this.membershipRepository = membershipRepository;
        this.metricsHistorySync = metricsHistorySync;
        this.onboardingStatusInteractor = onboardingStatusInteractor;
        this.packetSnifferAnalytics = packetSnifferAnalytics;
        this.strapOffBodyNotification = strapOffBodyNotification;
        this.firmwareUpdateNotification = firmwareUpdateNotification;
        this.dorsetDetectedNotification = dorsetDetectedNotification;
        this.userMgr = userMgr;
        this.userRepository = userRepository;
        this.periodicFwUpdateInitializer = periodicFwUpdateInitializer;
        this.newFirmwareUpdateMonitor = newFirmwareUpdateMonitor;
        this.sentryReporter = sentryReporter;
        this.puffinFwUpdateMonitor = puffinFwUpdateMonitor;
        this.newMemfaultManager = newMemfaultManager;
        this.puffinManager = puffinManager;
        this.navigationReporter = navigationReporter;
        this.deadBatteryNotificationMonitor = deadBatteryNotificationMonitor;
        this.historyPullThroughputAnalytics = historyPullThroughputAnalytics;
        this.userStateLifecycleObserver = userStateLifecycleObserver;
        this.bondLossReceiver = bondLossReceiver;
        this.r10RealtimeStream = r10RealtimeStream;
        this.streamSessionLifecycleHandler = streamSessionLifecycleHandler;
        this.trackActivityLogoutLifecycleHandler = trackActivityLogoutLifecycleHandler;
        this.trackActivityPrefetchScheduler = trackActivityPrefetchScheduler;
    }

    /* JADX INFO: renamed from: a */
    public final void m49087a() {
        C17345d c17345d = this.applicationLifecycleObserver;
        c17345d.m49090c(this.activityTypesRepository);
        c17345d.m49090c(this.appForegroundWidgetUpdateTrigger);
        c17345d.m49090c(this.appStateLogger);
        c17345d.m49090c(this.avatarObserver);
        c17345d.m49090c(this.backgroundUsageAggregator);
        c17345d.m49090c(this.bluetoothSyncManager);
        c17345d.m49090c(this.appDestinationCacheLifecycleHandler);
        c17345d.m49090c(this.cacheLifecycleHandler);
        c17345d.m49090c(this.connectivityCrashContextReporter);
        c17345d.m49090c(this.crashReporterFeatureFlagInstaller);
        c17345d.m49090c(this.cycleMgr);
        c17345d.m49090c(this.dataSyncServiceManager);
        c17345d.m49090c(this.deviceStateLogger);
        c17345d.m49090c(this.designModelMapperContributionInstaller);
        c17345d.m49090c(this.appConfigurationRepository);
        c17345d.m49090c(this.entitlementsRepository);
        c17345d.m49090c(this.gpsCollectionLifecycleHandler);
        c17345d.m49090c(this.healthConnectChecker);
        c17345d.m49090c(this.highWatermarkHelper);
        c17345d.m49090c(this.hrZonesRepository);
        c17345d.m49090c(this.internetAppForegroundEventSender);
        c17345d.m49090c(this.labradorReadingResultDbLifecycleHandler);
        c17345d.m49090c(this.languageRepository);
        c17345d.m49090c(this.membershipRepository);
        c17345d.m49090c(this.metricsHistorySync);
        c17345d.m49090c(this.onboardingStatusInteractor);
        c17345d.m49090c(this.packetSnifferAnalytics);
        c17345d.m49090c(this.historyPullThroughputAnalytics);
        c17345d.m49090c(this.strapOffBodyNotification);
        c17345d.m49090c(this.firmwareUpdateNotification);
        c17345d.m49090c(this.dorsetDetectedNotification);
        c17345d.m49090c(this.userMgr);
        c17345d.m49090c(this.userRepository);
        c17345d.m49090c(this.periodicFwUpdateInitializer);
        c17345d.m49090c(this.newFirmwareUpdateMonitor);
        c17345d.m49090c(this.sentryReporter);
        c17345d.m49090c(this.puffinFwUpdateMonitor);
        c17345d.m49090c(this.newMemfaultManager);
        c17345d.m49090c(this.puffinManager);
        c17345d.m49090c(this.navigationReporter);
        c17345d.m49090c(this.deadBatteryNotificationMonitor);
        c17345d.m49090c(this.userStateLifecycleObserver);
        c17345d.m49090c(this.bondLossReceiver);
        c17345d.m49090c(this.r10RealtimeStream);
        c17345d.m49090c(this.streamSessionLifecycleHandler);
        c17345d.m49090c(this.trackActivityLogoutLifecycleHandler);
        c17345d.m49090c(this.trackActivityPrefetchScheduler);
    }
}
