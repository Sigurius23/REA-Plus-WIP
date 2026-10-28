package x82;

import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import b12.C2288d;
import b12.InterfaceC2286b;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c12.C3853d;
import c12.EnumC3851b;
import c12.InterfaceC3852c;
import c93.InterfaceC4351m;
import com.whoop.data.featureFlags.CoreFeatureFlagsKt;
import com.whoop.data.onboarding.C6529c;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.domain.model.WhoopStrapInfo;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13075p1;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kh2.AbstractC22486a;
import kh3.C22488a;
import kk0.C22538a;
import kk0.C22539b;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.C28204u;
import p000.AbstractC11266d;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p138f6.AbstractC14134f;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import u92.C34660d;
import uv0.AbstractC35283c;
import z82.C40191e;
import z82.C40195i;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: x82.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 v2\u00020\u0001:\u00018Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u001fH\u0082@¢\u0006\u0004\b+\u0010,J\u0018\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0082@¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b2\u0010'J\u000f\u00103\u001a\u00020\u001fH\u0002¢\u0006\u0004\b3\u0010!J\u000f\u00104\u001a\u00020\u001fH\u0002¢\u0006\u0004\b4\u0010!J!\u00106\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u00105\u001a\u00020-H\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010T\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010X\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bY\u0010WR\u0016\u0010[\u001a\u00020U8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u0010WR\u0014\u0010\\\u001a\u00020(8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u00106R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020$0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010i\u001a\b\u0012\u0004\u0012\u00020-0d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010fR\u0014\u0010l\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR$\u0010p\u001a\u00020-2\u0006\u00105\u001a\u00020-8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\ba\u0010m\"\u0004\bn\u0010oR$\u0010s\u001a\u00020$2\u0006\u0010%\u001a\u00020$8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\be\u0010q\"\u0004\br\u0010'R$\u0010u\u001a\u00020-2\u0006\u00105\u001a\u00020-8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bh\u0010m\"\u0004\bt\u0010oR\u0014\u0010x\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010w¨\u0006y"}, m65681d2 = {"Lx82/i;", "", "Landroid/content/Context;", "context", "Ltd1/b;", "whoopStrap", "Lu92/d;", "prefs", "La6/g;", "Lf6/f;", "dataStore", "Lx82/f;", "intentBuilder", "Lc12/c;", "notificationInitializer", "Lz82/e;", "eventDispatcher", "Lb12/b;", "lowBatteryMonitor", "Lz82/i;", "analyticsHelper", "Lzr2/a;", "timeProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "Lx82/j;", "stringsContextProvider", "Lbc3/c0;", "coroutineScope", "<init>", "(Landroid/content/Context;Ltd1/b;Lu92/d;La6/g;Lx82/f;Lc12/c;Lz82/e;Lb12/b;Lz82/i;Lzr2/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lx82/j;Lbc3/c0;)V", "Ll83/a0;", "r", "()V", "z", "A", "", "level", "C", "(B)V", "", "s", "()I", "H", "(Lq83/d;)Ljava/lang/Object;", "", "now", "", "G", "(JLq83/d;)Ljava/lang/Object;", "q", "x", "y", "time", "I", "(Ljava/lang/Byte;J)V", "a", "Landroid/content/Context;", "b", "Ltd1/b;", "c", "Lu92/d;", "d", "La6/g;", "e", "Lx82/f;", "f", "Lc12/c;", "g", "Lz82/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lb12/b;", "i", "Lz82/i;", "j", "Lzr2/a;", "k", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "l", "Lx82/j;", "m", "Lbc3/c0;", "n", "Ljava/lang/Byte;", "previousLevel", "Landroidx/core/app/NotificationCompat$Builder;", "o", "Landroidx/core/app/NotificationCompat$Builder;", "lowBatteryNotification", "p", "fullBatteryNotification", "sleepBatteryNotification", "notificationId", "Landroid/app/NotificationManager;", "Landroid/app/NotificationManager;", "notificationManager", "Ltr2/n;", "t", "Ltr2/n;", "logger", "Lec3/p1;", "u", "Lec3/p1;", "lastBatteryLevel", "v", "lastBatteryTime", "B", "()Z", "isCharging", "()J", "D", "(J)V", "lastLowBatteryNotificationTime", "()B", "E", "lastNotificationBatteryLevel", "F", "lastSleepNotificationTime", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()Landroid/content/Context;", "stringsContext", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38082i {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: x */
    private static final C3853d f163087x;

    /* JADX INFO: renamed from: y */
    private static final C14132d f163088y;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C34660d prefs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC38079f intentBuilder;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC3852c notificationInitializer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC2286b lowBatteryMonitor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C40195i analyticsHelper;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC41070a timeProvider;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C38083j stringsContextProvider;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private Byte previousLevel;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private NotificationCompat.Builder lowBatteryNotification;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private NotificationCompat.Builder fullBatteryNotification;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private NotificationCompat.Builder sleepBatteryNotification;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int notificationId;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final NotificationManager notificationManager;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final InterfaceC13075p1 lastBatteryLevel;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final InterfaceC13075p1 lastBatteryTime;

    /* JADX INFO: renamed from: x82.i$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0014\u0010!\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\rR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00160\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, m65681d2 = {"Lx82/i$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/app/NotificationManager;", "manager", "Ll83/a0;", "a", "(Landroid/content/Context;Landroid/app/NotificationManager;)V", "", "CHANNEL_ID", "Ljava/lang/String;", "Lc12/d;", "NOTIFICATION_SETTINGS", "Lc12/d;", "KEY_LAST_NOTIFICATION_TIME_LOW_BATTERY", "KEY_LAST_SLEEP_NOTIFICATION_TIME", "KEY_LAST_BATTERY_LEVEL", "KEY_LAST_BATTERY_TIME", "KEY_LAST_NOTIFICATION_BATTERY_LEVEL", "", "SLEEP_BATTERY_RECENCY_THRESHOLD", "J", "", "SLEEP_BATTERY_LEVEL_THRESHOLD", "B", "SLEEP_BATTERY_DELAY_RENOTIFY", "DELAY_RENOTIFY_LOW", "DELAY_RENOTIFY_FULL_BATTERY", "FULL_BATTERY_THRESHOLD", "LAST_NOTIFICATION_NONE", "LOG_TAG", "Lf6/d;", "KEY_LAST_FULL_BATTERY_NOTIFICATION_TIME", "Lf6/d;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final void m122033a(Context context, NotificationManager manager) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(manager, "manager");
            C38082i.f163087x.m11806e(manager, context);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: x82.i$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.StrapBatteryMonitor$checkNotification$1", m100430f = "StrapBatteryMonitor.kt", m100431l = {313}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f163111w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ byte f163113y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(byte b, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f163113y = b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C38082i.this.new b(this.f163113y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f163111w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC2286b interfaceC2286b = C38082i.this.lowBatteryMonitor;
                byte b = this.f163113y;
                this.f163111w = 1;
                obj = interfaceC2286b.mo7149a(b, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C2288d c2288d = (C2288d) obj;
            NotificationCompat.Builder builder = C38082i.this.lowBatteryNotification;
            if (builder == null) {
                AbstractC22676k.m65757q("lowBatteryNotification");
                throw null;
            }
            builder.setContentTitle(c2288d.getTitle());
            NotificationCompat.Builder builder2 = C38082i.this.lowBatteryNotification;
            if (builder2 == null) {
                AbstractC22676k.m65757q("lowBatteryNotification");
                throw null;
            }
            builder2.setContentText(c2288d.getBody());
            NotificationCompat.Builder builder3 = C38082i.this.lowBatteryNotification;
            if (builder3 == null) {
                AbstractC22676k.m65757q("lowBatteryNotification");
                throw null;
            }
            builder3.setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(c2288d.getTitle()).bigText(c2288d.getBody()));
            C38082i.this.analyticsHelper.m129074a(this.f163113y, c2288d.getAnalyticsLabel());
            NotificationManager notificationManager = C38082i.this.notificationManager;
            int i14 = C38082i.this.notificationId;
            NotificationCompat.Builder builder4 = C38082i.this.lowBatteryNotification;
            if (builder4 != null) {
                notificationManager.notify(i14, builder4.build());
                return C23454a0.f92919a;
            }
            AbstractC22676k.m65757q("lowBatteryNotification");
            throw null;
        }
    }

    /* JADX INFO: renamed from: x82.i$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.StrapBatteryMonitor$onLevelChanged$1", m100430f = "StrapBatteryMonitor.kt", m100431l = {232}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f163114w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C38082i.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f163114w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C38082i c38082i = C38082i.this;
                this.f163114w = 1;
                if (c38082i.m122005H(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: x82.i$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.StrapBatteryMonitor", m100430f = "StrapBatteryMonitor.kt", m100431l = {287}, m100432m = "shouldShowBatteryNotification", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f163117F;

        /* JADX INFO: renamed from: w */
        long f163118w;

        /* JADX INFO: renamed from: x */
        int f163119x;

        /* JADX INFO: renamed from: y */
        int f163120y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f163121z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163121z = obj;
            this.f163117F |= Integer.MIN_VALUE;
            return C38082i.this.m122004G(0L, this);
        }
    }

    /* JADX INFO: renamed from: x82.i$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.StrapBatteryMonitor", m100430f = "StrapBatteryMonitor.kt", m100431l = {261, 264}, m100432m = "showFullBatteryNotification", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        long f163122w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f163123x;

        /* JADX INFO: renamed from: z */
        int f163125z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163123x = obj;
            this.f163125z |= Integer.MIN_VALUE;
            return C38082i.this.m122005H(this);
        }
    }

    static {
        C3853d c3853dM11813l = new C3853d(EnumC3851b.MAX, "00250_StrapBattery", AbstractC35283c.f150206w).m11811j(true).m11813l(true);
        AbstractC22676k.m65749i(c3853dM11813l, "setVibrationEnabled(...)");
        f163087x = c3853dM11813l;
        f163088y = AbstractC15751g.m44429I("BatteryMonitor:LastFullBatteryNotificationTime");
    }

    public C38082i(Context context, InterfaceC33704b whoopStrap, C34660d prefs, InterfaceC0422g dataStore, InterfaceC38079f intentBuilder, InterfaceC3852c notificationInitializer, C40191e eventDispatcher, InterfaceC2286b lowBatteryMonitor, C40195i analyticsHelper, InterfaceC41070a timeProvider, FeatureFlagChecker ffChecker, C38083j stringsContextProvider, InterfaceC2994c0 coroutineScope) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(whoopStrap, "whoopStrap");
        AbstractC22676k.m65750j(prefs, "prefs");
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(intentBuilder, "intentBuilder");
        AbstractC22676k.m65750j(notificationInitializer, "notificationInitializer");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(lowBatteryMonitor, "lowBatteryMonitor");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(timeProvider, "timeProvider");
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        AbstractC22676k.m65750j(stringsContextProvider, "stringsContextProvider");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.context = context;
        this.whoopStrap = whoopStrap;
        this.prefs = prefs;
        this.dataStore = dataStore;
        this.intentBuilder = intentBuilder;
        this.notificationInitializer = notificationInitializer;
        this.eventDispatcher = eventDispatcher;
        this.lowBatteryMonitor = lowBatteryMonitor;
        this.analyticsHelper = analyticsHelper;
        this.timeProvider = timeProvider;
        this.ffChecker = ffChecker;
        this.stringsContextProvider = stringsContextProvider;
        this.coroutineScope = coroutineScope;
        this.notificationId = 30;
        Object systemService = context.getApplicationContext().getSystemService("notification");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.notificationManager = (NotificationManager) systemService;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("BatteryMonitor");
        this.lastBatteryLevel = AbstractC13091v.m36593c(Byte.valueOf((byte) prefs.m109531h("BatteryMonitor:LastBatteryLevel", -1)));
        this.lastBatteryTime = AbstractC13091v.m36593c(Long.valueOf(prefs.m109532i("BatteryMonitor:LastBatteryTime", 0L)));
        m122031z();
        m121998A();
        final int i13 = 0;
        whoopStrap.getChargeStatus().m65151f().m122652B(C22488a.m64989a().f88182b).m122661K(new C6529c(new Function1(this) { // from class: x82.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C38082i f163085x;

            {
                this.f163085x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return C38082i.m122011e(this.f163085x, (C22539b) obj);
                    default:
                        return C38082i.m122013g(this.f163085x, (Byte) obj);
                }
            }
        }, 26));
        final int i14 = 1;
        whoopStrap.getBatteryLevel().m65140j().m122652B(C22488a.m64989a().f88182b).m122661K(new C6529c(new Function1(this) { // from class: x82.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C38082i f163085x;

            {
                this.f163085x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return C38082i.m122011e(this.f163085x, (C22539b) obj);
                    default:
                        return C38082i.m122013g(this.f163085x, (Byte) obj);
                }
            }
        }, 27));
    }

    /* JADX INFO: renamed from: A */
    private final void m121998A() {
        NotificationCompat.Builder contentText = this.notificationInitializer.mo11800a(this.context).setAutoCancel(true).setDeleteIntent(this.intentBuilder.mo121991d(this.context)).setContentIntent(this.ffChecker.isFeatureEnabled(CoreFeatureFlagsKt.BATTERY_NOTIFICATIONS_TO_DEVICE_SETTINGS) ? this.intentBuilder.mo121989b(this.context) : this.intentBuilder.mo121990c(this.context)).setContentTitle(m122028w().getString(AbstractC35283c.f150201r)).setContentText(m122028w().getString(AbstractC35283c.f150200q));
        AbstractC22676k.m65749i(contentText, "setContentText(...)");
        this.sleepBatteryNotification = contentText;
        f163087x.m11805a(contentText);
        NotificationCompat.Builder builder = this.lowBatteryNotification;
        if (builder != null) {
            builder.setCategory(NotificationCompat.CATEGORY_STATUS);
        } else {
            AbstractC22676k.m65757q("lowBatteryNotification");
            throw null;
        }
    }

    /* JADX INFO: renamed from: B */
    private final boolean m121999B() {
        return this.whoopStrap.getChargeStatus().m65149d();
    }

    /* JADX INFO: renamed from: C */
    private final void m122000C(byte level) {
        if (level == 100) {
            this.eventDispatcher.m128978A0(this.whoopStrap.mo106491d().analyticsName());
            this.logger.mo85228t("Triggering full battery notification", new AbstractC30556a.a[0]);
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(null), 3);
        }
        this.logger.mo85216g(AbstractC2875y.m8296i(level, "Strap battery level updated: new = ", "%"), new AbstractC30556a.a[0]);
        Byte b6 = this.previousLevel;
        if (b6 == null || Math.abs(level - b6.byteValue()) > m122024s()) {
            this.previousLevel = Byte.valueOf(level);
            m122023q(level);
            this.logger.mo85216g("previous level = " + this.previousLevel + ", new level = " + ((int) level), new AbstractC30556a.a[0]);
        }
        if (level > 25) {
            m122030y();
        }
        m122006I(Byte.valueOf(level), this.timeProvider.mo133363b());
    }

    /* JADX INFO: renamed from: D */
    private final void m122001D(long j7) {
        this.prefs.m109542u("BatteryMonitor:LastLowBatteryNotificationTime", j7);
    }

    /* JADX INFO: renamed from: E */
    private final void m122002E(byte b6) {
        this.prefs.m109541t("BatteryMonitor:LastNotificationBatteryLevel", b6);
    }

    /* JADX INFO: renamed from: F */
    private final void m122003F(long j7) {
        this.prefs.m109542u("BatteryMonitor:LastSleepNotificationTime", j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX INFO: renamed from: G */
    public final Object m122004G(long j7, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        d dVar;
        int i13;
        ?? r10;
        boolean zBooleanValue;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i14 = dVar.f163117F;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f163117F = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM36575A = dVar.f163121z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = dVar.f163117F;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            StatusBarNotification[] activeNotifications = this.notificationManager.getActiveNotifications();
            AbstractC22676k.m65749i(activeNotifications, "getActiveNotifications(...)");
            int length = activeNotifications.length;
            int i16 = 0;
            while (true) {
                if (i16 >= length) {
                    i13 = 0;
                    break;
                }
                if (activeNotifications[i16].getId() == 32) {
                    i13 = 1;
                    break;
                }
                i16++;
            }
            if (i13 != 0) {
                this.logger.mo85228t("Attempted to show the full battery notification, but it is already showing in the status bar.", new AbstractC30556a.a[0]);
                return Boolean.FALSE;
            }
            Boolean boolMo106497j = this.whoopStrap.mo106497j();
            if (boolMo106497j != null) {
                zBooleanValue = boolMo106497j.booleanValue();
            } else {
                r10 = 0;
            }
            if (r10 == 0) {
                r10 = zBooleanValue;
                this.logger.mo85228t("Attempted to show the full battery notification, but the battery pack is already off.", new AbstractC30556a.a[0]);
                return Boolean.FALSE;
            }
            if (this.ffChecker.isFeatureEnabled(CoreFeatureFlagsKt.DROID_DEDUPE_FULL_BATTERY_NOTIFICATIONS)) {
                InterfaceC13058l data = this.dataStore.getData();
                dVar.f163118w = j7;
                dVar.f163119x = i13;
                dVar.f163120y = r10;
                dVar.f163117F = 1;
                objM36575A = AbstractC13091v.m36575A(data, dVar);
                if (objM36575A == enumC31071a) {
                    r10 = zBooleanValue;
                    return enumC31071a;
                }
            }
            r10 = zBooleanValue;
            return Boolean.TRUE;
        }
        if (i15 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j7 = dVar.f163118w;
        AbstractC34132o.m107864I(objM36575A);
        r10 = zBooleanValue;
        Long l7 = (Long) ((AbstractC14134f) objM36575A).mo40227b(f163088y);
        if (j7 - (l7 != null ? l7.longValue() : -36000000L) < 129600000) {
            this.logger.mo85222m(AbstractC31061c.m95636l(129600000 / C28204u.INSTANCE.m85365h(), "Not sending full battery notification as previous one was sent less than ", " hours ago."), new AbstractC30556a.a[0]);
            return Boolean.FALSE;
        }
        r10 = zBooleanValue;
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: H */
    public final Object m122005H(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        e eVar;
        long j7;
        long j13;
        NotificationCompat.Builder builder;
        NotificationManager notificationManager;
        NotificationCompat.Builder builder2;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f163125z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f163125z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM122004G = eVar.f163123x;
        Object obj = EnumC31071a.f128113w;
        int i14 = eVar.f163125z;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM122004G);
            long jMo133363b = this.timeProvider.mo133363b();
            eVar.f163122w = jMo133363b;
            eVar.f163125z = 1;
            objM122004G = m122004G(jMo133363b, eVar);
            if (objM122004G != obj) {
                j7 = jMo133363b;
            }
            return obj;
        }
        if (i14 == 1) {
            j7 = eVar.f163122w;
            AbstractC34132o.m107864I(objM122004G);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j13 = eVar.f163122w;
            AbstractC34132o.m107864I(objM122004G);
        }
        j7 = j13;
        builder = this.fullBatteryNotification;
        if (builder != null) {
            AbstractC22676k.m65757q("fullBatteryNotification");
            throw null;
        }
        builder.setWhen(j7);
        notificationManager = this.notificationManager;
        builder2 = this.fullBatteryNotification;
        if (builder2 != null) {
            AbstractC22676k.m65757q("fullBatteryNotification");
            throw null;
        }
        notificationManager.notify(32, builder2.build());
        this.logger.mo85228t("Showing full battery notification.", new AbstractC30556a.a[0]);
        return c23454a0;
        if (!((Boolean) objM122004G).booleanValue()) {
            return c23454a0;
        }
        if (this.ffChecker.isFeatureEnabled(CoreFeatureFlagsKt.DROID_DEDUPE_FULL_BATTERY_NOTIFICATIONS)) {
            InterfaceC0422g interfaceC0422g = this.dataStore;
            C14132d c14132d = f163088y;
            Long l7 = new Long(j7);
            eVar.f163122w = j7;
            eVar.f163125z = 2;
            if (AbstractC22486a.m64987c(interfaceC0422g, c14132d, l7, eVar) != obj) {
                j13 = j7;
                j7 = j13;
            }
            return obj;
        }
        builder = this.fullBatteryNotification;
        if (builder != null) {
            AbstractC22676k.m65757q("fullBatteryNotification");
            throw null;
        }
        builder.setWhen(j7);
        notificationManager = this.notificationManager;
        builder2 = this.fullBatteryNotification;
        if (builder2 != null) {
            AbstractC22676k.m65757q("fullBatteryNotification");
            throw null;
        }
        notificationManager.notify(32, builder2.build());
        this.logger.mo85228t("Showing full battery notification.", new AbstractC30556a.a[0]);
        return c23454a0;
    }

    /* JADX INFO: renamed from: I */
    private final void m122006I(Byte level, long time) {
        if (level == null) {
            this.prefs.m109537p("BatteryMonitor:LastBatteryLevel");
            this.prefs.m109537p("BatteryMonitor:LastBatteryTime");
            C13045h2 c13045h2 = (C13045h2) this.lastBatteryLevel;
            c13045h2.getClass();
            c13045h2.m36571k(null, (byte) -1);
            C13045h2 c13045h3 = (C13045h2) this.lastBatteryTime;
            c13045h3.getClass();
            c13045h3.m36571k(null, 0L);
            return;
        }
        this.prefs.m109541t("BatteryMonitor:LastBatteryLevel", level.byteValue());
        this.prefs.m109542u("BatteryMonitor:LastBatteryTime", time);
        C13045h2 c13045h4 = (C13045h2) this.lastBatteryLevel;
        c13045h4.getClass();
        c13045h4.m36571k(null, level);
        InterfaceC13075p1 interfaceC13075p1 = this.lastBatteryTime;
        Long lValueOf = Long.valueOf(time);
        C13045h2 c13045h5 = (C13045h2) interfaceC13075p1;
        c13045h5.getClass();
        c13045h5.m36571k(null, lValueOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m122011e(C38082i c38082i, C22539b strapChargePackStatus) {
        AbstractC22676k.m65750j(strapChargePackStatus, "strapChargePackStatus");
        if (strapChargePackStatus.m65149d()) {
            c38082i.m122029x();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m122012f(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m122013g(C38082i c38082i, Byte b6) {
        AbstractC22676k.m65747g(b6);
        c38082i.m122000C(b6.byteValue());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m122014h(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    private final void m122023q(byte level) {
        this.logger.mo85216g("strap battery monitor checking for notification", new AbstractC30556a.a[0]);
        C22538a.Companion companion = C22538a.INSTANCE;
        if (!companion.m65143b(level) || m121999B()) {
            if (!companion.m65143b(level) || m121999B()) {
                m122029x();
                return;
            }
            return;
        }
        long jMo133363b = this.timeProvider.mo133363b();
        if (this.lowBatteryMonitor.mo7150b(m122026u(), level, jMo133363b - m122025t())) {
            m122001D(jMo133363b);
            m122002E(level);
            NotificationCompat.Builder builder = this.lowBatteryNotification;
            if (builder == null) {
                AbstractC22676k.m65757q("lowBatteryNotification");
                throw null;
            }
            builder.setWhen(jMo133363b);
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(level, null), 3);
        }
    }

    /* JADX INFO: renamed from: s */
    private final int m122024s() {
        WhoopStrapInfo whoopStrapInfoMo106493f = this.whoopStrap.mo106493f();
        EnumC32978v whoopDeviceType = whoopStrapInfoMo106493f != null ? whoopStrapInfoMo106493f.getWhoopDeviceType() : null;
        return (whoopDeviceType == null || !whoopDeviceType.isMaverickOrGoose()) ? 2 : 0;
    }

    /* JADX INFO: renamed from: t */
    private final long m122025t() {
        return this.prefs.m109532i("BatteryMonitor:LastLowBatteryNotificationTime", -36000000L);
    }

    /* JADX INFO: renamed from: u */
    private final byte m122026u() {
        return (byte) this.prefs.m109531h("BatteryMonitor:LastNotificationBatteryLevel", -1);
    }

    /* JADX INFO: renamed from: v */
    private final long m122027v() {
        return this.prefs.m109532i("BatteryMonitor:LastSleepNotificationTime", -36000000L);
    }

    /* JADX INFO: renamed from: w */
    private final Context m122028w() {
        return this.stringsContextProvider.m122034a(this.context);
    }

    /* JADX INFO: renamed from: x */
    private final void m122029x() {
        this.notificationManager.cancel(this.notificationId);
        this.logger.mo85216g(AbstractC11266d.m30462p("Canceling low battery notification, isCharging: ", m121999B()), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: y */
    private final void m122030y() {
        this.logger.mo85216g("Canceling sleep low battery notification", new AbstractC30556a.a[0]);
        this.notificationManager.cancel(31);
    }

    /* JADX INFO: renamed from: z */
    private final void m122031z() {
        NotificationCompat.Builder contentText = this.notificationInitializer.mo11800a(this.context).setAutoCancel(true).setDeleteIntent(this.intentBuilder.mo121993f(this.context)).setContentIntent(this.ffChecker.isFeatureEnabled(CoreFeatureFlagsKt.BATTERY_NOTIFICATIONS_TO_DEVICE_SETTINGS) ? this.intentBuilder.mo121989b(this.context) : this.intentBuilder.mo121988a(this.context)).setContentTitle(m122028w().getString(AbstractC35283c.f150205v)).setContentText(m122028w().getString(AbstractC35283c.f150199p));
        AbstractC22676k.m65749i(contentText, "setContentText(...)");
        this.lowBatteryNotification = contentText;
        C3853d c3853d = f163087x;
        c3853d.m11805a(contentText);
        NotificationCompat.Builder builder = this.lowBatteryNotification;
        if (builder == null) {
            AbstractC22676k.m65757q("lowBatteryNotification");
            throw null;
        }
        builder.setCategory(NotificationCompat.CATEGORY_STATUS);
        NotificationCompat.Builder contentText2 = this.notificationInitializer.mo11800a(this.context).setAutoCancel(true).setContentIntent(this.ffChecker.isFeatureEnabled(CoreFeatureFlagsKt.BATTERY_NOTIFICATIONS_TO_DEVICE_SETTINGS) ? this.intentBuilder.mo121989b(this.context) : this.intentBuilder.mo121992e(this.context)).setContentTitle(m122028w().getString(AbstractC35283c.f150173K)).setContentText(m122028w().getString(AbstractC35283c.f150172J));
        AbstractC22676k.m65749i(contentText2, "setContentText(...)");
        this.fullBatteryNotification = contentText2;
        c3853d.m11805a(contentText2);
        NotificationCompat.Builder builder2 = this.fullBatteryNotification;
        if (builder2 != null) {
            builder2.setCategory(NotificationCompat.CATEGORY_STATUS);
        } else {
            AbstractC22676k.m65757q("fullBatteryNotification");
            throw null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m122032r() {
        if (((Number) ((C13045h2) this.lastBatteryLevel).getValue()).byteValue() > 25) {
            m122030y();
            return;
        }
        long jMo133363b = this.timeProvider.mo133363b();
        if (jMo133363b - ((Number) ((C13045h2) this.lastBatteryTime).getValue()).longValue() >= 7200000 || jMo133363b - m122027v() <= 28800000) {
            return;
        }
        this.logger.mo85216g("Sending sleep low battery notification (" + this.lastBatteryLevel + ")", new AbstractC30556a.a[0]);
        m122003F(jMo133363b);
        NotificationCompat.Builder builder = this.sleepBatteryNotification;
        if (builder == null) {
            AbstractC22676k.m65757q("sleepBatteryNotification");
            throw null;
        }
        builder.setWhen(jMo133363b);
        NotificationManager notificationManager = this.notificationManager;
        NotificationCompat.Builder builder2 = this.sleepBatteryNotification;
        if (builder2 == null) {
            AbstractC22676k.m65757q("sleepBatteryNotification");
            throw null;
        }
        notificationManager.notify(31, builder2.build());
        this.eventDispatcher.m129052q((Byte) ((C13045h2) this.lastBatteryLevel).getValue());
    }

    public /* synthetic */ C38082i(Context context, InterfaceC33704b interfaceC33704b, C34660d c34660d, InterfaceC0422g interfaceC0422g, InterfaceC38079f interfaceC38079f, InterfaceC3852c interfaceC3852c, C40191e c40191e, InterfaceC2286b interfaceC2286b, C40195i c40195i, InterfaceC41070a interfaceC41070a, FeatureFlagChecker featureFlagChecker, C38083j c38083j, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC33704b, c34660d, interfaceC0422g, interfaceC38079f, interfaceC3852c, c40191e, interfaceC2286b, c40195i, interfaceC41070a, featureFlagChecker, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? new C38083j() : c38083j, interfaceC2994c0);
    }
}
