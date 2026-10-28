package or2;

import android.content.Context;
import android.os.BatteryManager;
import android.os.PowerManager;
import c92.C4329a;
import i92.InterfaceC18260e;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: or2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0017\u0010$R\u0011\u0010&\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001e\u0010$R\u0011\u0010'\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001a\u0010$R\u0011\u0010(\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001c\u0010$¨\u0006)"}, m65681d2 = {"Lor2/c;", "", "Landroid/content/Context;", "context", "Lc92/a;", "bluetoothHelper", "Lor2/y0;", "locationServicesHelper", "Li92/e;", "networkMonitor", "Ltr2/n;", "logger", "Landroid/os/BatteryManager;", "batteryManager", "Landroid/os/PowerManager;", "powerManager", "<init>", "(Landroid/content/Context;Lc92/a;Lor2/y0;Li92/e;Ltr2/n;Landroid/os/BatteryManager;Landroid/os/PowerManager;)V", "", "permissionName", "", "b", "(Ljava/lang/String;)Z", "a", "Landroid/content/Context;", "Lc92/a;", "c", "Lor2/y0;", "d", "Li92/e;", "e", "Ltr2/n;", "f", "Landroid/os/BatteryManager;", "g", "Landroid/os/PowerManager;", "()Z", "locationServicesEnabled", "isNetworkConnected", "isBluetoothEnabled", "isBluetoothSupportedAndEnabled", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28150c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C4329a bluetoothHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C28217y0 locationServicesHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final BatteryManager batteryManager;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final PowerManager powerManager;

    public C28150c(Context context, C4329a bluetoothHelper, C28217y0 locationServicesHelper, InterfaceC18260e networkMonitor, InterfaceC34116n logger, BatteryManager batteryManager, PowerManager powerManager) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(bluetoothHelper, "bluetoothHelper");
        AbstractC22676k.m65750j(locationServicesHelper, "locationServicesHelper");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.bluetoothHelper = bluetoothHelper;
        this.locationServicesHelper = locationServicesHelper;
        this.networkMonitor = networkMonitor;
        this.logger = logger;
        this.batteryManager = batteryManager;
        this.powerManager = powerManager;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m85178a() {
        return this.locationServicesHelper.m85444e();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m85179b(String permissionName) {
        AbstractC22676k.m65750j(permissionName, "permissionName");
        return AbstractC32122c.checkSelfPermission(this.context, permissionName) == 0;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m85180c() {
        if (!this.bluetoothHelper.getIsBluetoothSupported()) {
            this.logger.mo85220k("AppDiagnostics", "Bluetooth not supported", new AbstractC30556a.a[0]);
            return false;
        }
        if (this.bluetoothHelper.m13651d()) {
            return true;
        }
        this.logger.mo85220k("AppDiagnostics", "Bluetooth setting has been disabled", new AbstractC30556a.a[0]);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m85181d() {
        return this.bluetoothHelper.m13653f();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m85182e() {
        return this.networkMonitor.isConnected();
    }
}
