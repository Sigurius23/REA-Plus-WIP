package tk0;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.location.LocationManager;
import com.whoop.ble.api.scan.ScanFailure;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tk0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f¨\u0006\u0016"}, m65681d2 = {"Ltk0/a;", "Ltk0/e;", "Landroid/content/Context;", "context", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "", "sdkVersion", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;I)V", "", "c", "()Z", "d", "Lcom/whoop/ble/api/scan/ScanFailure;", "a", "()Lcom/whoop/ble/api/scan/ScanFailure;", "Landroid/content/Context;", "b", "Landroid/bluetooth/BluetoothAdapter;", "I", "needsLocationForScan", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33875a implements InterfaceC33879e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int sdkVersion;

    public C33875a(Context context, BluetoothAdapter bluetoothAdapter, int i13) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        this.bluetoothAdapter = bluetoothAdapter;
        this.sdkVersion = i13;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m107124b() {
        return this.sdkVersion < 31;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m107125c() {
        return this.context.checkSelfPermission(m107124b() ? "android.permission.ACCESS_FINE_LOCATION" : "android.permission.BLUETOOTH_SCAN") == 0;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m107126d() {
        LocationManager locationManager = (LocationManager) this.context.getSystemService(LocationManager.class);
        return locationManager != null && locationManager.isLocationEnabled();
    }

    @Override // tk0.InterfaceC33879e
    /* JADX INFO: renamed from: a */
    public ScanFailure mo107127a() {
        if (this.bluetoothAdapter == null) {
            return ScanFailure.BluetoothUnsupported.f24068w;
        }
        if (!m107125c()) {
            return ScanFailure.PermissionDenied.f24070w;
        }
        if (!this.bluetoothAdapter.isEnabled()) {
            return ScanFailure.BluetoothOff.f24067w;
        }
        if (!m107124b() || m107126d()) {
            return null;
        }
        return ScanFailure.LocationServicesOff.f24069w;
    }
}
