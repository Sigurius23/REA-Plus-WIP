package live.hms.video.factories;

import c33.ThreadFactoryC3934a;
import c93.InterfaceC4339a;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23465k;
import l83.InterfaceC23462h;
import lh1.C24069a;
import live.hms.video.utils.HMSLogger;
import m83.AbstractC25265s;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ud3.AbstractC34798a0;
import ud3.C34810e0;
import ud3.InterfaceC34821j;
import ud3.InterfaceC34845v;
import va3.AbstractC35854l;
import zd3.C40571o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 C2\u00020\u0001:\u0002CDBO\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u0012 \b\u0002\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001b2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010#J1\u0010$\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010%J)\u0010'\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010-\u001a\u00020!2\u0006\u0010*\u001a\u00020)H\u0000¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040.2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00103\u001a\u00020!H\u0000¢\u0006\u0004\b1\u00102R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u00104R,\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00105R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00107R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u000209088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R(\u0010<\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001b088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010;R \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0005088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006E"}, m65681d2 = {"Llive/hms/video/factories/HappyEyeballsDns;", "Lud3/v;", "systemDns", "Lkotlin/Function3;", "Ljava/net/InetAddress;", "", "", "probe", "Lkotlin/Function0;", "", "nowMs", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "<init>", "(Lud3/v;Lkotlin/jvm/functions/Function3;Lc93/a;Ljava/util/concurrent/ScheduledExecutorService;)V", "ipv6", "ipv4", "port", "", "preferenceKey", "(Ljava/net/InetAddress;Ljava/net/InetAddress;I)Ljava/lang/String;", "key", "cachedPreference", "(Ljava/lang/String;)Ljava/lang/Boolean;", "hostname", "raceOrJoinRace", "(Ljava/lang/String;Ljava/lang/String;Ljava/net/InetAddress;Ljava/net/InetAddress;I)Ljava/lang/Boolean;", "Ljava/util/concurrent/FutureTask;", "runningRace", "startedAtMs", "awaitVerdict", "(Ljava/util/concurrent/FutureTask;Ljava/lang/String;J)Ljava/lang/Boolean;", "preferIpv6", "Ll83/a0;", "rememberVerdict", "(Ljava/lang/String;Z)V", "race", "(Ljava/lang/String;Ljava/net/InetAddress;Ljava/net/InetAddress;I)Ljava/lang/Boolean;", "reason", "noWinner", "(Ljava/lang/String;JLjava/lang/String;)Ljava/lang/Boolean;", "Lud3/e0;", QueryParams.URL, "notePort$lib_release", "(Lud3/e0;)V", "notePort", "", "lookup", "(Ljava/lang/String;)Ljava/util/List;", "invalidate$lib_release", "()V", "invalidate", "Lud3/v;", "Lkotlin/jvm/functions/Function3;", "Lc93/a;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ConcurrentHashMap;", "Llive/hms/video/factories/HappyEyeballsDns$Preference;", "preferences", "Ljava/util/concurrent/ConcurrentHashMap;", "inFlightRaces", "portsByHost", "Lud3/a0;", "portHintListener", "Lud3/a0;", "getPortHintListener", "()Lud3/a0;", "Companion", "Preference", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HappyEyeballsDns implements InterfaceC34845v {
    private static final long IDLE_THREAD_KEEP_ALIVE_S = 60;
    private static final int MAX_PREFERENCES = 64;
    private static final long PREFERENCE_TTL_MS = 60000;
    private static final int PROBE_THREADS = 4;
    private static final int PROBE_TIMEOUT_MS = 1500;
    private static final long RACE_BUDGET_MS = 2000;
    private static final String TAG = "HappyEyeballsDns";
    private static final long V6_HEAD_START_MS = 250;
    private final ScheduledExecutorService executor;
    private final ConcurrentHashMap<String, FutureTask<Boolean>> inFlightRaces;
    private final InterfaceC4339a nowMs;
    private final AbstractC34798a0 portHintListener;
    private final ConcurrentHashMap<String, Integer> portsByHost;
    private final ConcurrentHashMap<String, Preference> preferences;
    private final Function3 probe;
    private final InterfaceC34845v systemDns;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h defaultExecutor$delegate = AbstractC30060g.m92088H(new C24069a(3));

    /* JADX INFO: renamed from: live.hms.video.factories.HappyEyeballsDns$1 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C241441 extends C22672i implements Function3 {
        public C241441(Object obj) {
            super(3, 0, Companion.class, obj, "tcpHandshakeSucceeds", "tcpHandshakeSucceeds(Ljava/net/InetAddress;II)Z");
        }

        public final Boolean invoke(InetAddress p13, int i13, int i14) {
            AbstractC22676k.m65750j(p13, "p0");
            return Boolean.valueOf(((Companion) this.receiver).tcpHandshakeSucceeds(p13, i13, i14));
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InetAddress) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: live.hms.video.factories.HappyEyeballsDns$2 */
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class C241452 extends C22672i implements InterfaceC4339a {
        public static final C241452 INSTANCE = new C241452();

        public C241452() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // c93.InterfaceC4339a
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0017¨\u0006\u001f"}, m65681d2 = {"Llive/hms/video/factories/HappyEyeballsDns$Companion;", "", "<init>", "()V", "Ljava/net/InetAddress;", "address", "", "port", "timeoutMs", "", "tcpHandshakeSucceeds", "(Ljava/net/InetAddress;II)Z", "Ljava/util/concurrent/ScheduledExecutorService;", "defaultExecutor$delegate", "Ll83/h;", "getDefaultExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "defaultExecutor", "", "TAG", "Ljava/lang/String;", "", "V6_HEAD_START_MS", "J", "PROBE_TIMEOUT_MS", "I", "RACE_BUDGET_MS", "PREFERENCE_TTL_MS", "MAX_PREFERENCES", "PROBE_THREADS", "IDLE_THREAD_KEEP_ALIVE_S", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ScheduledExecutorService getDefaultExecutor() {
            return (ScheduledExecutorService) HappyEyeballsDns.defaultExecutor$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean tcpHandshakeSucceeds(InetAddress address, int port, int timeoutMs) {
            try {
                Socket socket = new Socket();
                try {
                    socket.connect(new InetSocketAddress(address, port), timeoutMs);
                    socket.close();
                    return true;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(socket, th3);
                        throw th4;
                    }
                }
            } catch (IOException | SecurityException unused) {
                return false;
            }
        }

        private Companion() {
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Llive/hms/video/factories/HappyEyeballsDns$Preference;", "", "preferIpv6", "", "decidedAtMs", "", "<init>", "(ZJ)V", "getPreferIpv6", "()Z", "getDecidedAtMs", "()J", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final /* data */ class Preference {
        private final long decidedAtMs;
        private final boolean preferIpv6;

        public Preference(boolean z4, long j7) {
            this.preferIpv6 = z4;
            this.decidedAtMs = j7;
        }

        public static /* synthetic */ Preference copy$default(Preference preference, boolean z4, long j7, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = preference.preferIpv6;
            }
            if ((i13 & 2) != 0) {
                j7 = preference.decidedAtMs;
            }
            return preference.copy(z4, j7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getPreferIpv6() {
            return this.preferIpv6;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getDecidedAtMs() {
            return this.decidedAtMs;
        }

        public final Preference copy(boolean preferIpv6, long decidedAtMs) {
            return new Preference(preferIpv6, decidedAtMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Preference)) {
                return false;
            }
            Preference preference = (Preference) other;
            return this.preferIpv6 == preference.preferIpv6 && this.decidedAtMs == preference.decidedAtMs;
        }

        public final long getDecidedAtMs() {
            return this.decidedAtMs;
        }

        public final boolean getPreferIpv6() {
            return this.preferIpv6;
        }

        public int hashCode() {
            return Long.hashCode(this.decidedAtMs) + (Boolean.hashCode(this.preferIpv6) * 31);
        }

        public String toString() {
            StringBuilder sb4 = new StringBuilder("Preference(preferIpv6=");
            sb4.append(this.preferIpv6);
            sb4.append(", decidedAtMs=");
            return AbstractC2875y.m8302o(sb4, this.decidedAtMs, ')');
        }
    }

    public HappyEyeballsDns() {
        this(null, null, null, null, 15, null);
    }

    private final Boolean awaitVerdict(FutureTask<Boolean> runningRace, String hostname, long startedAtMs) {
        try {
            return runningRace.get(2000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e5) {
            StringBuilder sb4 = new StringBuilder("joined race failed: ");
            Throwable cause = e5.getCause();
            sb4.append(cause != null ? cause.getMessage() : null);
            return noWinner(hostname, startedAtMs, sb4.toString());
        } catch (TimeoutException unused2) {
            return noWinner(hostname, startedAtMs, "joined race did not finish in time");
        }
    }

    private final Boolean cachedPreference(String key) {
        Preference preference = this.preferences.get(key);
        if (preference == null) {
            return null;
        }
        if (((Number) this.nowMs.invoke()).longValue() - preference.getDecidedAtMs() < 60000) {
            return Boolean.valueOf(preference.getPreferIpv6());
        }
        this.preferences.remove(key, preference);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ScheduledThreadPoolExecutor defaultExecutor_delegate$lambda$10() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(4, new ThreadFactoryC3934a(1));
        scheduledThreadPoolExecutor.setKeepAliveTime(IDLE_THREAD_KEEP_ALIVE_S, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread defaultExecutor_delegate$lambda$10$lambda$8(Runnable runnable) {
        Thread thread = new Thread(runnable, "hms-happy-eyeballs");
        thread.setDaemon(true);
        return thread;
    }

    private final Boolean noWinner(String hostname, long startedAtMs, String reason) {
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("race: ", hostname, " undecided after ");
        sbM53375p.append(((Number) this.nowMs.invoke()).longValue() - startedAtMs);
        sbM53375p.append("ms (");
        sbM53375p.append(reason);
        sbM53375p.append(')');
        HMSLogger.m71136d(TAG, sbM53375p.toString());
        return null;
    }

    private final String preferenceKey(InetAddress ipv6, InetAddress ipv4, int port) {
        return ipv6.getHostAddress() + '|' + ipv4.getHostAddress() + '|' + port;
    }

    private final Boolean race(String hostname, InetAddress ipv6, InetAddress ipv4, int port) {
        C23465k c23465k;
        long jLongValue = ((Number) this.nowMs.invoke()).longValue();
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(2);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.executor.execute(new RunnableC24150e(this, ipv6, port, atomicBoolean, arrayBlockingQueue));
        this.executor.schedule(new RunnableC24150e(atomicBoolean, arrayBlockingQueue, this, ipv4, port), V6_HEAD_START_MS, TimeUnit.MILLISECONDS);
        long j7 = 2000 + jLongValue;
        for (int i13 = 0; i13 < 2; i13++) {
            long jLongValue2 = j7 - ((Number) this.nowMs.invoke()).longValue();
            if (jLongValue2 > 0 && (c23465k = (C23465k) arrayBlockingQueue.poll(jLongValue2, TimeUnit.MILLISECONDS)) != null) {
                Boolean bool = (Boolean) c23465k.f92937w;
                boolean zBooleanValue = bool.booleanValue();
                if (((Boolean) c23465k.f92938x).booleanValue()) {
                    rememberVerdict(preferenceKey(ipv6, ipv4, port), zBooleanValue);
                    StringBuilder sbM53375p = AbstractC18489d0.m53375p("race: ", hostname, " prefers ");
                    sbM53375p.append(zBooleanValue ? "IPv6" : "IPv4");
                    sbM53375p.append(" in ");
                    sbM53375p.append(((Number) this.nowMs.invoke()).longValue() - jLongValue);
                    sbM53375p.append("ms");
                    HMSLogger.m71136d(TAG, sbM53375p.toString());
                    return bool;
                }
            }
            return noWinner(hostname, jLongValue, "race budget exhausted");
        }
        return noWinner(hostname, jLongValue, "neither address family answered");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void race$lambda$4(HappyEyeballsDns this$0, InetAddress ipv6, int i13, AtomicBoolean ipv6Succeeded, ArrayBlockingQueue outcomes) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(ipv6, "$ipv6");
        AbstractC22676k.m65750j(ipv6Succeeded, "$ipv6Succeeded");
        AbstractC22676k.m65750j(outcomes, "$outcomes");
        Boolean bool = (Boolean) this$0.probe.invoke(ipv6, Integer.valueOf(i13), Integer.valueOf(PROBE_TIMEOUT_MS));
        if (bool.booleanValue()) {
            ipv6Succeeded.set(true);
        }
        outcomes.offer(new C23465k(Boolean.TRUE, bool));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void race$lambda$5(AtomicBoolean ipv6Succeeded, ArrayBlockingQueue outcomes, HappyEyeballsDns this$0, InetAddress ipv4, int i13) {
        AbstractC22676k.m65750j(ipv6Succeeded, "$ipv6Succeeded");
        AbstractC22676k.m65750j(outcomes, "$outcomes");
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(ipv4, "$ipv4");
        if (!ipv6Succeeded.get()) {
            outcomes.offer(new C23465k(Boolean.FALSE, this$0.probe.invoke(ipv4, Integer.valueOf(i13), Integer.valueOf(PROBE_TIMEOUT_MS))));
        } else {
            Boolean bool = Boolean.FALSE;
            outcomes.offer(new C23465k(bool, bool));
        }
    }

    private final Boolean raceOrJoinRace(String key, final String hostname, final InetAddress ipv6, final InetAddress ipv4, final int port) {
        long jLongValue = ((Number) this.nowMs.invoke()).longValue();
        FutureTask<Boolean> futureTask = new FutureTask<>(new Callable() { // from class: live.hms.video.factories.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return HappyEyeballsDns.raceOrJoinRace$lambda$1(this.f95229w, hostname, ipv6, ipv4, port);
            }
        });
        FutureTask<Boolean> futureTaskPutIfAbsent = this.inFlightRaces.putIfAbsent(key, futureTask);
        if (futureTaskPutIfAbsent != null) {
            return awaitVerdict(futureTaskPutIfAbsent, hostname, jLongValue);
        }
        Boolean boolNoWinner = null;
        try {
            futureTask.run();
            return futureTask.get();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return boolNoWinner;
        } catch (ExecutionException e5) {
            StringBuilder sb4 = new StringBuilder("race failed: ");
            Throwable cause = e5.getCause();
            sb4.append(cause != null ? cause.getMessage() : null);
            boolNoWinner = noWinner(hostname, jLongValue, sb4.toString());
            return boolNoWinner;
        } finally {
            this.inFlightRaces.remove(key, futureTask);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean raceOrJoinRace$lambda$1(HappyEyeballsDns this$0, String hostname, InetAddress ipv6, InetAddress ipv4, int i13) {
        AbstractC22676k.m65750j(this$0, "this$0");
        AbstractC22676k.m65750j(hostname, "$hostname");
        AbstractC22676k.m65750j(ipv6, "$ipv6");
        AbstractC22676k.m65750j(ipv4, "$ipv4");
        return this$0.race(hostname, ipv6, ipv4, i13);
    }

    private final void rememberVerdict(String key, boolean preferIpv6) {
        if (this.preferences.size() >= 64) {
            Set<Map.Entry<String, Preference>> setEntrySet = this.preferences.entrySet();
            AbstractC22676k.m65749i(setEntrySet, "<get-entries>(...)");
            ArrayList<Map.Entry> arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (((Number) this.nowMs.invoke()).longValue() - ((Preference) ((Map.Entry) obj).getValue()).getDecidedAtMs() >= 60000) {
                    arrayList.add(obj);
                }
            }
            for (Map.Entry entry : arrayList) {
                this.preferences.remove(entry.getKey(), entry.getValue());
            }
            if (this.preferences.size() >= 64) {
                this.preferences.clear();
            }
        }
        this.preferences.put(key, new Preference(preferIpv6, ((Number) this.nowMs.invoke()).longValue()));
    }

    public final AbstractC34798a0 getPortHintListener() {
        return this.portHintListener;
    }

    public final void invalidate$lib_release() {
        this.preferences.clear();
    }

    @Override // ud3.InterfaceC34845v
    public List<InetAddress> lookup(String hostname) {
        boolean zBooleanValue;
        AbstractC22676k.m65750j(hostname, "hostname");
        List<InetAddress> listLookup = this.systemDns.lookup(hostname);
        List<InetAddress> list = listLookup;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof Inet6Address) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!(((InetAddress) obj2) instanceof Inet6Address)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
            Integer num = this.portsByHost.get(hostname);
            if (num == null) {
                HMSLogger.m71136d(TAG, "lookup: no port seen for " + hostname + " yet, leaving system order");
                return listLookup;
            }
            String strPreferenceKey = preferenceKey((InetAddress) AbstractC25265s.m74096F0(arrayList), (InetAddress) AbstractC25265s.m74096F0(arrayList2), num.intValue());
            Boolean boolCachedPreference = cachedPreference(strPreferenceKey);
            if (boolCachedPreference != null) {
                zBooleanValue = boolCachedPreference.booleanValue();
            } else {
                Boolean boolRaceOrJoinRace = raceOrJoinRace(strPreferenceKey, hostname, (InetAddress) AbstractC25265s.m74096F0(arrayList), (InetAddress) AbstractC25265s.m74096F0(arrayList2), num.intValue());
                if (boolRaceOrJoinRace != null) {
                    zBooleanValue = boolRaceOrJoinRace.booleanValue();
                }
            }
            return zBooleanValue ? AbstractC25265s.m74129g1(arrayList, arrayList2) : AbstractC25265s.m74129g1(arrayList2, arrayList);
        }
        return listLookup;
    }

    public final void notePort$lib_release(C34810e0 url) {
        AbstractC22676k.m65750j(url, "url");
        this.portsByHost.put(url.f146565d, Integer.valueOf(url.f146566e));
    }

    public HappyEyeballsDns(InterfaceC34845v systemDns, Function3 probe, InterfaceC4339a nowMs, ScheduledExecutorService executor) {
        AbstractC22676k.m65750j(systemDns, "systemDns");
        AbstractC22676k.m65750j(probe, "probe");
        AbstractC22676k.m65750j(nowMs, "nowMs");
        AbstractC22676k.m65750j(executor, "executor");
        this.systemDns = systemDns;
        this.probe = probe;
        this.nowMs = nowMs;
        this.executor = executor;
        this.preferences = new ConcurrentHashMap<>();
        this.inFlightRaces = new ConcurrentHashMap<>();
        this.portsByHost = new ConcurrentHashMap<>();
        this.portHintListener = new AbstractC34798a0() { // from class: live.hms.video.factories.HappyEyeballsDns$portHintListener$1
            @Override // ud3.AbstractC34798a0
            public void callStart(InterfaceC34821j call) {
                AbstractC22676k.m65750j(call, "call");
                this.this$0.notePort$lib_release(((C40571o) call).f174722x.f146712a);
            }
        };
    }

    public /* synthetic */ HappyEyeballsDns(InterfaceC34845v interfaceC34845v, Function3 function3, InterfaceC4339a interfaceC4339a, ScheduledExecutorService scheduledExecutorService, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34845v.f146759v : interfaceC34845v, (i13 & 2) != 0 ? new C241441(INSTANCE) : function3, (i13 & 4) != 0 ? C241452.INSTANCE : interfaceC4339a, (i13 & 8) != 0 ? INSTANCE.getDefaultExecutor() : scheduledExecutorService);
    }
}
