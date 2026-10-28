package y82;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import bh3.InterfaceC3255b;
import c92.C4335g;
import ci2.AbstractC4732a;
import ci2.InterfaceC4733b;
import e50.C12723b;
import fk2.C14554a;
import ge3.AbstractC15751g;
import gt0.AbstractC16185g;
import gt0.InterfaceC16183e;
import hx0.C17708d;
import i92.AbstractC18264i;
import i92.InterfaceC18260e;
import java.util.List;
import java.util.Objects;
import jk0.InterfaceC21750d;
import m92.C25327j;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import qr2.AbstractC30556a;
import r03.C30844a;
import s03.C32052a;
import s52.C32225f;
import tr2.InterfaceC34116n;
import u92.C34660d;
import xg3.C38289p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: y82.b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC39339b {
    private static final String LOG_TAG = "WhoopAction";
    public static final String RESULT_FAILURE = "Failed";
    public static final String RESULT_SUCCESS = "Success";
    private String actionString;
    private boolean isVisibleInUi;
    private String userDisplayName;
    public static final EnumC39339b ENABLE_IMU_STREAM = new k();
    public static final EnumC39339b DISABLE_IMU_STREAM = new l();
    public static final EnumC39339b SEND_HIGH_FREQ_HIST_SYNC_COMMAND = new m();
    public static final EnumC39339b RUN_HAPTICS_PATTERN_2 = new n();
    public static final EnumC39339b SET_ALARM_TIME = new o();
    public static final EnumC39339b RUN_ALARM = new p();
    public static final EnumC39339b DISABLE_ALARM = new q();
    public static final EnumC39339b TRIGGER_BACKGROUND_FW_UPDATE = new r();
    public static final EnumC39339b FORCE_LOGS_LIVE_STREAM = new s();
    public static final EnumC39339b UPLOAD_CONSOLE_LOGS = new a();
    public static final EnumC39339b UPLOAD_RAW_DATA = new b();
    public static final EnumC39339b DELETE_SHARED_PREFS = new c();
    public static final EnumC39339b BLE_RECONNECT_TICKLE = new d();
    public static final EnumC39339b UPDATE_TIME_ZONE = new e();
    public static final EnumC39339b GET_PUSH_TOKEN = new f();
    public static final EnumC39339b SYNC_PERSISTED_ACTIVITIES = new g();
    public static final EnumC39339b LENIENT_STRAP_SYNC = new h();
    public static final EnumC39339b GET_ACCESS_TOKEN = new i();
    public static final EnumC39339b ENABLE_VERBOSE_NETWORK_LOG = new j();
    private static final /* synthetic */ EnumC39339b[] $VALUES = $values();
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormat.forPattern("MMM d y h:mm:ss a Z");

    /* JADX INFO: renamed from: y82.b$a */
    public final enum a extends EnumC39339b {
        public /* synthetic */ a() {
            this("UPLOAD_CONSOLE_LOGS", 9, "Upload Console Logs");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            ((C30844a) AbstractC15751g.m44472y(C30844a.class, null, null)).m94867d();
            return t.m125446c();
        }

        private a(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$b */
    public final enum b extends EnumC39339b {
        public /* synthetic */ b() {
            this("UPLOAD_RAW_DATA", 10, "Upload Raw Data Packets");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            ((C17708d) AbstractC15751g.m44472y(C17708d.class, null, null)).m50701c();
            return t.m125446c();
        }

        private b(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$c */
    public final enum c extends EnumC39339b {
        public /* synthetic */ c() {
            this("DELETE_SHARED_PREFS", 11, "Delete Shared Prefs");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            ((C34660d) AbstractC15751g.m44472y(C34660d.class, null, null)).m109545x();
            return t.m125446c();
        }

        private c(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$d */
    public final enum d extends EnumC39339b {
        public /* synthetic */ d() {
            this("BLE_RECONNECT_TICKLE", 12, "BLE Reconnect Tickle");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            ((C4335g) AbstractC15751g.m44472y(C4335g.class, null, null)).mo13713a(1000L);
            return t.m125446c();
        }

        private d(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$e */
    public final enum e extends EnumC39339b {
        public /* synthetic */ e() {
            this("UPDATE_TIME_ZONE", 13, "Update Time Zone");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            if (!EnumC39339b.isNetworkConnected()) {
                return t.m125444a();
            }
            C12723b.m35566a().m35573h().m84090C();
            return t.m125446c();
        }

        private e(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$f */
    public final enum f extends EnumC39339b {
        public /* synthetic */ f() {
            this("GET_PUSH_TOKEN", 14, "Get Push Token");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$perform$2(InterfaceC34116n interfaceC34116n, String str) {
            interfaceC34116n.mo85228t(str, new AbstractC30556a.a[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$perform$3(InterfaceC34116n interfaceC34116n, Throwable th3) {
            interfaceC34116n.mo85230v("Failed to get push token", th3, new AbstractC30556a.a[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$performFromUi$0(Context context, String str) {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager == null) {
                Toast.makeText(context, "Failed to copy push token to clipboard", 0).show();
                return;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Push Token", str));
            Toast.makeText(context, "Copied push token to clipboard: " + str, 0).show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$performFromUi$1(Context context, Throwable th3) {
            Toast.makeText(context, "Failed to get push token", 0).show();
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            final InterfaceC34116n interfaceC34116nM107846d = InterfaceC34116n.m107846d("Push Token");
            C38289p c38289pM74405B = ((C25327j) AbstractC15751g.m44472y(C25327j.class, null, null)).m74405B();
            Objects.requireNonNull(interfaceC34116nM107846d);
            final int i13 = 0;
            final int i14 = 1;
            c38289pM74405B.m122686d(new InterfaceC3255b() { // from class: y82.c
                @Override // bh3.InterfaceC3255b
                /* JADX INFO: renamed from: b */
                public final void mo9472b(Object obj) {
                    switch (i13) {
                        case 0:
                            EnumC39339b.f.lambda$perform$2(interfaceC34116nM107846d, (String) obj);
                            break;
                        default:
                            EnumC39339b.f.lambda$perform$3(interfaceC34116nM107846d, (Throwable) obj);
                            break;
                    }
                }
            }, new InterfaceC3255b() { // from class: y82.c
                @Override // bh3.InterfaceC3255b
                /* JADX INFO: renamed from: b */
                public final void mo9472b(Object obj) {
                    switch (i14) {
                        case 0:
                            EnumC39339b.f.lambda$perform$2(interfaceC34116nM107846d, (String) obj);
                            break;
                        default:
                            EnumC39339b.f.lambda$perform$3(interfaceC34116nM107846d, (Throwable) obj);
                            break;
                    }
                }
            });
            return t.m125447d("Fetching push token");
        }

        @Override // y82.EnumC39339b
        public t performFromUi(final Context context) {
            final int i13 = 0;
            final int i14 = 1;
            ((C25327j) AbstractC15751g.m44472y(C25327j.class, null, null)).m74405B().m122686d(new InterfaceC3255b() { // from class: y82.d
                @Override // bh3.InterfaceC3255b
                /* JADX INFO: renamed from: b */
                public final void mo9472b(Object obj) {
                    switch (i13) {
                        case 0:
                            EnumC39339b.f.lambda$performFromUi$0(context, (String) obj);
                            break;
                        default:
                            EnumC39339b.f.lambda$performFromUi$1(context, (Throwable) obj);
                            break;
                    }
                }
            }, new InterfaceC3255b() { // from class: y82.d
                @Override // bh3.InterfaceC3255b
                /* JADX INFO: renamed from: b */
                public final void mo9472b(Object obj) {
                    switch (i14) {
                        case 0:
                            EnumC39339b.f.lambda$performFromUi$0(context, (String) obj);
                            break;
                        default:
                            EnumC39339b.f.lambda$performFromUi$1(context, (Throwable) obj);
                            break;
                    }
                }
            });
            return t.m125446c();
        }

        private f(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$g */
    public final enum g extends EnumC39339b {
        public /* synthetic */ g() {
            this("SYNC_PERSISTED_ACTIVITIES", 15, "Sync Persisted Activities");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            if (EnumC39339b.isNetworkConnected()) {
                return ((C32225f) AbstractC15751g.m44472y(C32225f.class, null, null)).m100250g() ? t.m125446c() : t.m125445b("Real Time Sync didn't complete successfully");
            }
            return t.m125445b("No network available");
        }

        @Override // y82.EnumC39339b
        public boolean requiresNetwork() {
            return true;
        }

        private g(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$h */
    public final enum h extends EnumC39339b {
        public /* synthetic */ h() {
            this("LENIENT_STRAP_SYNC", 16, "Lenient Strap Sync");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            return ((C4335g) AbstractC15751g.m44472y(C4335g.class, null, null)).m13712Z() ? t.m125446c() : t.m125444a();
        }

        private h(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$i */
    public final enum i extends EnumC39339b {
        public /* synthetic */ i() {
            this("GET_ACCESS_TOKEN", 17, "Get API access token");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            return t.m125447d("Access token: " + C12723b.m35566a().m35572g().m84057h().getAuthToken().getAccessToken());
        }

        @Override // y82.EnumC39339b
        public t performFromUi(Context context) {
            String accessToken = C12723b.m35566a().m35572g().m84057h().getAuthToken().getAccessToken();
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager == null) {
                Toast.makeText(context, "Failed to copy access token to clipboard", 0).show();
                return t.m125444a();
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Access Token", accessToken));
            Toast.makeText(context, "Copied access token to clipboard: " + accessToken, 0).show();
            return t.m125446c();
        }

        private i(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$j */
    public final enum j extends EnumC39339b {
        public /* synthetic */ j() {
            this("ENABLE_VERBOSE_NETWORK_LOG", 18, "Toggle verbose network logging");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            AbstractC18264i.m52616b();
            boolean zM52615a = AbstractC18264i.m52615a();
            StringBuilder sb4 = new StringBuilder("Verbose network logging ");
            sb4.append(zM52615a ? "enabled" : "disabled");
            sb4.append(" for all requests, including passwords and sensitive information");
            sb4.append(zM52615a ? ", until next app restart." : ".");
            Toast.makeText(context, sb4.toString(), 0).show();
            return t.m125446c();
        }

        private j(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$k */
    public final enum k extends EnumC39339b {
        public /* synthetic */ k() {
            this("ENABLE_IMU_STREAM", 0, "Enable IMU Data Stream");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            ((C39344g) AbstractC15751g.m44472y(C39344g.class, null, null)).m125468i(true);
            return t.m125446c();
        }

        private k(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$l */
    public final enum l extends EnumC39339b {
        public /* synthetic */ l() {
            this("DISABLE_IMU_STREAM", 1, "Disable IMU Data Stream");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            ((C39344g) AbstractC15751g.m44472y(C39344g.class, null, null)).m125468i(false);
            return t.m125446c();
        }

        private l(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$m */
    public final enum m extends EnumC39339b {
        public /* synthetic */ m() {
            this("SEND_HIGH_FREQ_HIST_SYNC_COMMAND", 2, "Send high frequency history sync command (1 minute)");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            ((C39344g) AbstractC15751g.m44472y(C39344g.class, null, null)).m125464e(7200);
            return t.m125446c();
        }

        private m(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$n */
    public final enum n extends EnumC39339b {
        public /* synthetic */ n() {
            this("RUN_HAPTICS_PATTERN_2", 3, "Run Haptics Pattern #2");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            ((C39344g) AbstractC15751g.m44472y(C39344g.class, null, null)).m125466g();
            return t.m125446c();
        }

        private n(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$o */
    public final enum o extends EnumC39339b {
        public /* synthetic */ o() {
            this("SET_ALARM_TIME", 4, "Set Alarm Time (Noon)");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            InterfaceC34116n interfaceC34116nM107846d = InterfaceC34116n.m107846d("WHOOP_ACTION_SET_ALARM_TIME");
            C39344g c39344g = (C39344g) AbstractC15751g.m44472y(C39344g.class, null, null);
            DateTime dateTimeNow = DateTime.now();
            DateTime dateTimeWithSecondOfMinute = dateTimeNow.withHourOfDay(12).withMinuteOfHour(0).withSecondOfMinute(0);
            Seconds secondsSecondsBetween = Seconds.secondsBetween(dateTimeNow, dateTimeWithSecondOfMinute);
            if (secondsSecondsBetween.getSeconds() <= 0) {
                secondsSecondsBetween = Seconds.secondsBetween(dateTimeNow, dateTimeWithSecondOfMinute.plusDays(1));
            }
            C14554a c14554a = new C14554a();
            C14554a c14554a2 = new C14554a(c14554a.m41580f() + ((long) secondsSecondsBetween.getSeconds()), c14554a.m41579e());
            interfaceC34116nM107846d.mo85228t("Sending Set alarm time to gen 3 strap for " + c14554a2.m41582i(), new AbstractC30556a.a[0]);
            c39344g.m125467h(c14554a2.m41583j());
            return t.m125446c();
        }

        private o(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$p */
    public final enum p extends EnumC39339b {
        public /* synthetic */ p() {
            this("RUN_ALARM", 5, "Run Alarm");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            InterfaceC34116n interfaceC34116nM107846d = InterfaceC34116n.m107846d("WHOOP_ACTION_RUN_ALARM");
            C39344g c39344g = (C39344g) AbstractC15751g.m44472y(C39344g.class, null, null);
            interfaceC34116nM107846d.mo85228t("Sending Run Alarm command to the strap", new AbstractC30556a.a[0]);
            c39344g.m125465f();
            return t.m125446c();
        }

        private p(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$q */
    public final enum q extends EnumC39339b {
        public /* synthetic */ q() {
            this("DISABLE_ALARM", 6, "Disable Alarm");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            InterfaceC34116n interfaceC34116nM107846d = InterfaceC34116n.m107846d("WHOOP_ACTION_DISABLE_ALARM");
            C39344g c39344g = (C39344g) AbstractC15751g.m44472y(C39344g.class, null, null);
            interfaceC34116nM107846d.mo85228t("Sending Disable Alarm command to the strap", new AbstractC30556a.a[0]);
            c39344g.m125463d();
            return t.m125446c();
        }

        private q(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$r */
    public final enum r extends EnumC39339b {
        public /* synthetic */ r() {
            this("TRIGGER_BACKGROUND_FW_UPDATE", 7, "Trigger Background FW Update");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            InterfaceC16183e interfaceC16183e = (InterfaceC16183e) AbstractC15751g.m44472y(InterfaceC16183e.class, null, null);
            List replayCache = ((InterfaceC4733b) AbstractC15751g.m44472y(InterfaceC4733b.class, null, null)).mo14818b().getReplayCache();
            InterfaceC21750d interfaceC21750d = replayCache.isEmpty() ? null : (InterfaceC21750d) replayCache.get(0);
            if (interfaceC21750d == null) {
                return t.m125445b("No strap connected");
            }
            interfaceC16183e.mo45721b(new AbstractC16185g.a(AbstractC4732a.m14816b(interfaceC21750d)));
            return t.m125446c();
        }

        private r(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$s */
    public final enum s extends EnumC39339b {
        public /* synthetic */ s() {
            this("FORCE_LOGS_LIVE_STREAM", 8, "Force Logs Live Stream");
        }

        @Override // y82.EnumC39339b
        public t perform(Context context) {
            ((C32052a) AbstractC15751g.m44472y(C32052a.class, null, null)).m99627e();
            return t.m125446c();
        }

        private s(String str, int i13, String str2) {
            super(str, i13, str2, 0);
        }
    }

    /* JADX INFO: renamed from: y82.b$t */
    /* JADX INFO: loaded from: classes10.dex */
    public static class t {

        /* JADX INFO: renamed from: a */
        public boolean f169308a;

        /* JADX INFO: renamed from: b */
        public String f169309b;

        private t(boolean z4, String str) {
            this.f169308a = z4;
            this.f169309b = str;
        }

        /* JADX INFO: renamed from: a */
        public static t m125444a() {
            return m125445b(EnumC39339b.RESULT_FAILURE);
        }

        /* JADX INFO: renamed from: b */
        public static t m125445b(String str) {
            return new t(false, str);
        }

        /* JADX INFO: renamed from: c */
        public static t m125446c() {
            return m125447d(EnumC39339b.RESULT_SUCCESS);
        }

        /* JADX INFO: renamed from: d */
        public static t m125447d(String str) {
            return new t(true, str);
        }

        /* JADX INFO: renamed from: g */
        public static boolean m125448g(t tVar) {
            return tVar != null && tVar.m125450f();
        }

        /* JADX INFO: renamed from: e */
        public String m125449e() {
            return this.f169309b;
        }

        /* JADX INFO: renamed from: f */
        public boolean m125450f() {
            return this.f169308a;
        }

        public String toString() {
            return "WhoopAction.Result(success=" + m125450f() + ", message=" + m125449e() + ")";
        }
    }

    private static /* synthetic */ EnumC39339b[] $values() {
        return new EnumC39339b[]{ENABLE_IMU_STREAM, DISABLE_IMU_STREAM, SEND_HIGH_FREQ_HIST_SYNC_COMMAND, RUN_HAPTICS_PATTERN_2, SET_ALARM_TIME, RUN_ALARM, DISABLE_ALARM, TRIGGER_BACKGROUND_FW_UPDATE, FORCE_LOGS_LIVE_STREAM, UPLOAD_CONSOLE_LOGS, UPLOAD_RAW_DATA, DELETE_SHARED_PREFS, BLE_RECONNECT_TICKLE, UPDATE_TIME_ZONE, GET_PUSH_TOKEN, SYNC_PERSISTED_ACTIVITIES, LENIENT_STRAP_SYNC, GET_ACCESS_TOKEN, ENABLE_VERBOSE_NETWORK_LOG};
    }

    public /* synthetic */ EnumC39339b(String str, int i13, String str2, int i14) {
        this(str, i13, str2);
    }

    public static EnumC39339b fromActionString(String str) {
        for (EnumC39339b enumC39339b : values()) {
            if (enumC39339b.getActionString().equals(str)) {
                return enumC39339b;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isNetworkConnected() {
        return ((InterfaceC18260e) AbstractC15751g.m44472y(InterfaceC18260e.class, null, null)).isConnected();
    }

    public static EnumC39339b valueOf(String str) {
        return (EnumC39339b) Enum.valueOf(EnumC39339b.class, str);
    }

    public static EnumC39339b[] values() {
        return (EnumC39339b[]) $VALUES.clone();
    }

    public t attemptToPerform(Context context) {
        InterfaceC34116n interfaceC34116nM107846d = InterfaceC34116n.m107846d(LOG_TAG);
        if (!requiresNetwork() || isNetworkConnected()) {
            return perform(context);
        }
        interfaceC34116nM107846d.mo85216g("Cannot perform action: " + this + ", Network required but not connected", new AbstractC30556a.a[0]);
        return null;
    }

    public String getActionString() {
        return this.actionString;
    }

    public String getUserDisplayName() {
        return this.userDisplayName;
    }

    public boolean isVisibleInUi() {
        return this.isVisibleInUi;
    }

    public abstract t perform(Context context);

    public t performFromUi(Context context) {
        return perform(context);
    }

    public boolean requiresNetwork() {
        return false;
    }

    private EnumC39339b(String str, int i13, String str2) {
        super(str, i13);
        this.userDisplayName = str2;
        this.actionString = name();
        this.isVisibleInUi = true;
    }

    private EnumC39339b(String str, int i13, String str2, boolean z4) {
        this(str, i13, str2);
        this.isVisibleInUi = z4;
    }
}
