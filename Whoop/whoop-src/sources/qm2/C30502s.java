package qm2;

import android.bluetooth.BluetoothDevice;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qm2.s */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lqm2/s;", "", "", "name", "address", "", "rssi", "Landroid/bluetooth/BluetoothDevice;", "device", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILandroid/bluetooth/BluetoothDevice;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "d", "Landroid/bluetooth/BluetoothDevice;", "()Landroid/bluetooth/BluetoothDevice;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C30502s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int rssi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final BluetoothDevice device;

    public C30502s(String str, String address, int i13, BluetoothDevice device) {
        AbstractC22676k.m65750j(address, "address");
        AbstractC22676k.m65750j(device, "device");
        this.name = str;
        this.address = address;
        this.rssi = i13;
        this.device = device;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BluetoothDevice getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRssi() {
        return this.rssi;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C30502s)) {
            return false;
        }
        C30502s c30502s = (C30502s) other;
        return AbstractC22676k.m65745e(this.name, c30502s.name) && AbstractC22676k.m65745e(this.address, c30502s.address) && this.rssi == c30502s.rssi && AbstractC22676k.m65745e(this.device, c30502s.device);
    }

    public int hashCode() {
        String str = this.name;
        return this.device.hashCode() + AbstractC11266d.m30448b(this.rssi, AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.address), 31);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.address;
        int i13 = this.rssi;
        BluetoothDevice bluetoothDevice = this.device;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ScanResultWrapper(name=", str, ", address=", str2, ", rssi=");
        sbM32001t.append(i13);
        sbM32001t.append(", device=");
        sbM32001t.append(bluetoothDevice);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
