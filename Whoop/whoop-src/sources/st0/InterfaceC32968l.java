package st0;

import android.bluetooth.BluetoothDevice;
import c83.AbstractC4309a;
import ec3.InterfaceC13058l;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: st0.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 À\u0006\u0003"}, m65681d2 = {"Lst0/l;", "", "Lc83/a;", "Lst0/f;", "callback", "Ll83/a0;", "M", "(Lc83/a;)V", "f0", "O", "()V", "Landroid/bluetooth/BluetoothDevice;", "A", "()Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "", "a", "()Ljava/lang/String;", "address", "getName", "name", "getConnectionState", "()Lst0/f;", "connectionState", "", "C", "()I", "mtu", "Lec3/l;", "d0", "()Lec3/l;", "connectionStateFlow", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC32968l {
    /* JADX INFO: renamed from: A */
    BluetoothDevice getBluetoothDevice();

    /* JADX INFO: renamed from: C */
    int mo104072C();

    /* JADX INFO: renamed from: M */
    void mo104073M(AbstractC4309a callback);

    /* JADX INFO: renamed from: O */
    void mo104074O();

    /* JADX INFO: renamed from: a */
    String getAddress();

    /* JADX INFO: renamed from: d0 */
    InterfaceC13058l getConnectionStateFlow();

    /* JADX INFO: renamed from: f0 */
    void mo104077f0(AbstractC4309a callback);

    AbstractC32962f getConnectionState();

    String getName();
}
