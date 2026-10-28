package or2;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.PowerManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: or2.w */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0003#\r\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, m65681d2 = {"Lor2/w;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", "context", "Ltr2/n;", "logger", "<init>", "(Landroid/content/Context;Ltr2/n;)V", "Ll83/a0;", "g", "()V", "f", "", "c", "()Ljava/lang/String;", "b", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "", "e", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "x", "Ltr2/n;", "d", "()Ltr2/n;", "Landroid/os/PowerManager;", "y", "Landroid/os/PowerManager;", "pm", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28210w implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final PowerManager pm;

    /* JADX INFO: renamed from: or2.w$a */
    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lor2/w$a;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "<init>", "(Lor2/w;Landroid/content/Context;)V", "Ll83/a0;", "a", "()V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Landroid/content/IntentFilter;", "b", "Landroid/content/IntentFilter;", "filter", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final IntentFilter filter;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C28210w f113976c;

        public a(C28210w c28210w, Context context) {
            AbstractC22676k.m65750j(context, "context");
            this.f113976c = c28210w;
            this.context = context;
            this.filter = new IntentFilter("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
        }

        /* JADX INFO: renamed from: a */
        public final void m85396a() {
            this.context.registerReceiver(this, this.filter);
            this.f113976c.getLogger().mo85216g(AbstractC11266d.m30461o("Background app connectivity started as ", this.f113976c.m85390b()), new AbstractC30556a.a[0]);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(intent, "intent");
            this.f113976c.getLogger().mo85216g(AbstractC11266d.m30461o("Background app connectivity restriction changed: ", this.f113976c.m85390b()), new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: or2.w$b */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lor2/w$b;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/os/PowerManager;", "pm", "<init>", "(Lor2/w;Landroid/content/Context;Landroid/os/PowerManager;)V", "Ll83/a0;", "a", "()V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Landroid/os/PowerManager;", "getPm", "()Landroid/os/PowerManager;", "Landroid/content/IntentFilter;", "c", "Landroid/content/IntentFilter;", "filter", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final PowerManager pm;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final IntentFilter filter;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C28210w f113980d;

        public b(C28210w c28210w, Context context, PowerManager powerManager) {
            AbstractC22676k.m65750j(context, "context");
            this.f113980d = c28210w;
            this.context = context;
            this.pm = powerManager;
            this.filter = new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }

        /* JADX INFO: renamed from: a */
        public final void m85397a() {
            InterfaceC34116n logger = this.f113980d.getLogger();
            PowerManager powerManager = this.pm;
            logger.mo85216g("Idle Mode started as " + (powerManager != null ? Boolean.valueOf(powerManager.isDeviceIdleMode()) : null), new AbstractC30556a.a[0]);
            this.context.registerReceiver(this, this.filter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(intent, "intent");
            InterfaceC34116n logger = this.f113980d.getLogger();
            PowerManager powerManager = this.pm;
            logger.mo85220k("WakeWindow", "Idle Mode changed to " + (powerManager != null ? Boolean.valueOf(powerManager.isDeviceIdleMode()) : null), new AbstractC30556a.a[0]);
        }
    }

    /* JADX INFO: renamed from: or2.w$c */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lor2/w$c;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/os/PowerManager;", "pm", "<init>", "(Lor2/w;Landroid/content/Context;Landroid/os/PowerManager;)V", "Ll83/a0;", "a", "()V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Landroid/os/PowerManager;", "getPm", "()Landroid/os/PowerManager;", "Landroid/content/IntentFilter;", "c", "Landroid/content/IntentFilter;", "filter", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public final class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final PowerManager pm;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final IntentFilter filter;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C28210w f113984d;

        public c(C28210w c28210w, Context context, PowerManager powerManager) {
            AbstractC22676k.m65750j(context, "context");
            this.f113984d = c28210w;
            this.context = context;
            this.pm = powerManager;
            this.filter = new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED");
        }

        /* JADX INFO: renamed from: a */
        public final void m85398a() {
            this.context.registerReceiver(this, this.filter);
            InterfaceC34116n logger = this.f113984d.getLogger();
            PowerManager powerManager = this.pm;
            logger.mo85216g("Power Save Mode started as " + (powerManager != null ? Boolean.valueOf(powerManager.isPowerSaveMode()) : null), new AbstractC30556a.a[0]);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC22676k.m65750j(context, "context");
            AbstractC22676k.m65750j(intent, "intent");
            InterfaceC34116n logger = this.f113984d.getLogger();
            PowerManager powerManager = this.pm;
            logger.mo85220k("WakeWindow", "Power Save Mode changed to " + (powerManager != null ? Boolean.valueOf(powerManager.isPowerSaveMode()) : null), new AbstractC30556a.a[0]);
        }
    }

    public C28210w(Context context, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.logger = logger;
        this.pm = (PowerManager) context.getSystemService("power");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: b */
    public final String m85390b() {
        Object systemService = this.context.getSystemService("connectivity");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (!connectivityManager.isActiveNetworkMetered()) {
            return "The device is not on a metered network, data usage not restricted";
        }
        int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
        if (restrictBackgroundStatus == 1) {
            return "Data Saver is disabled";
        }
        if (restrictBackgroundStatus != 2) {
            return restrictBackgroundStatus != 3 ? "Data saver status could not be determined" : "Background data usage is blocked for this app.";
        }
        return "This app is whitelisted";
    }

    /* JADX INFO: renamed from: c */
    private final String m85391c() {
        return m85395e() ? "is" : "is not";
    }

    /* JADX INFO: renamed from: f */
    private final void m85392f() {
        this.logger.mo85216g(AbstractC11895b.m31996o("This app ", m85391c(), " ignoring battery optimizations"), new AbstractC30556a.a[0]);
    }

    /* JADX INFO: renamed from: g */
    private final void m85393g() {
        this.logger.mo85216g(AbstractC11266d.m30461o("Background app connectivity restriction is ", m85390b()), new AbstractC30556a.a[0]);
        new a(this, this.context).m85396a();
        new c(this, this.context, this.pm).m85398a();
        new b(this, this.context, this.pm).m85397a();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final InterfaceC34116n getLogger() {
        return this.logger;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m85395e() {
        PowerManager powerManager = this.pm;
        if (powerManager != null) {
            return powerManager.isIgnoringBatteryOptimizations(this.context.getPackageName());
        }
        return false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        m85393g();
        m85392f();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }
}
