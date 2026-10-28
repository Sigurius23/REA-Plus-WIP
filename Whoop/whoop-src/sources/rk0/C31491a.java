package rk0;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.util.Set;
import java.util.UUID;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pj0.InterfaceC29293a;
import pj0.InterfaceC29294b;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: rk0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lrk0/a;", "Lpj0/b;", "Landroid/content/Context;", "context", "Landroid/bluetooth/BluetoothAdapter;", "adapter", "", "sdkVersion", "Ltr2/n;", "logger", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;ILtr2/n;)V", "", "b", "()Z", "", "address", "Ljava/util/UUID;", "serviceId", "", "characteristicIds", "Lpj0/a;", "a", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/Set;)Lpj0/a;", "Landroid/content/Context;", "Landroid/bluetooth/BluetoothAdapter;", "c", "I", "d", "Ltr2/n;", "whoop-ble-transport_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31491a implements InterfaceC29294b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final BluetoothAdapter adapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int sdkVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C31491a(Context context, BluetoothAdapter bluetoothAdapter, int i13, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logger, "logger");
        this.context = context;
        this.adapter = bluetoothAdapter;
        this.sdkVersion = i13;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: b */
    private final boolean m97004b() {
        return this.sdkVersion < 31 || this.context.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0;
    }

    @Override // pj0.InterfaceC29294b
    /* JADX INFO: renamed from: a */
    public InterfaceC29293a mo88911a(String address, UUID serviceId, Set<UUID> characteristicIds) {
        AbstractC22676k.m65750j(address, "address");
        AbstractC22676k.m65750j(serviceId, "serviceId");
        AbstractC22676k.m65750j(characteristicIds, "characteristicIds");
        if (this.adapter == null) {
            this.logger.mo85222m("No Bluetooth adapter, so there is no transport for ".concat(address), new AbstractC30556a.a[0]);
            return null;
        }
        if (!m97004b()) {
            this.logger.mo85222m("BLUETOOTH_CONNECT is not granted, so there is no transport for ".concat(address), new AbstractC30556a.a[0]);
            return null;
        }
        try {
            BluetoothDevice remoteDevice = this.adapter.getRemoteDevice(address);
            Context context = this.context;
            AbstractC22676k.m65747g(remoteDevice);
            return new C31493c(context, remoteDevice, serviceId, characteristicIds, this.logger, null, 32, null);
        } catch (IllegalArgumentException e5) {
            this.logger.mo85230v("Not a Bluetooth address: ".concat(address), e5, new AbstractC30556a.a[0]);
            return null;
        }
    }
}
