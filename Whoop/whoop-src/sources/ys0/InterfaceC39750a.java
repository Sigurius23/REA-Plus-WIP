package ys0;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import androidx.core.app.NotificationCompat;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ys0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0007\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00022\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00170\u0016H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH&¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!À\u0006\u0003"}, m65681d2 = {"Lys0/a;", "", "", "k", "()Z", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "a", "(Landroid/bluetooth/BluetoothDevice;)Z", "Ll83/a0;", "x", "(Landroid/bluetooth/BluetoothDevice;)V", "d", "force", "y", "(Z)V", "Landroid/bluetooth/BluetoothGattCharacteristic;", "bluetoothGattCharacteristic", "", "data", "z", "(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Z", "", "Lys0/a$b;", "chars", "b", "(Ljava/util/Map;)Z", "v", "()V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()I", "maxTransmissionUnit", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC39750a {

    /* JADX INFO: renamed from: ys0.a$a */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\u0006J'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, m65681d2 = {"Lys0/a$a;", "", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "Ll83/a0;", "v0", "(Landroid/bluetooth/BluetoothDevice;)V", "m", "q", "C0", "L", "P", "V", "", NotificationCompat.CATEGORY_STATUS, "", "message", "X0", "(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V", "", "Landroid/bluetooth/BluetoothGattService;", "services", "", "c1", "(Ljava/util/List;)Z", "c", "F0", "()V", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {
        /* JADX INFO: renamed from: C0 */
        void mo106372C0(BluetoothDevice bluetoothDevice);

        /* JADX INFO: renamed from: F0 */
        void mo106374F0();

        /* JADX INFO: renamed from: L */
        void mo106376L(BluetoothDevice bluetoothDevice);

        /* JADX INFO: renamed from: P */
        void mo106380P(BluetoothDevice bluetoothDevice);

        /* JADX INFO: renamed from: V */
        void mo106384V(BluetoothDevice bluetoothDevice);

        /* JADX INFO: renamed from: X0 */
        void mo106387X0(BluetoothDevice bluetoothDevice, int status, String message);

        /* JADX INFO: renamed from: c */
        void mo106391c(BluetoothDevice bluetoothDevice);

        /* JADX INFO: renamed from: c1 */
        boolean mo106392c1(List<? extends BluetoothGattService> services);

        /* JADX INFO: renamed from: m */
        void mo106394m(BluetoothDevice bluetoothDevice);

        /* JADX INFO: renamed from: q */
        void mo106395q(BluetoothDevice bluetoothDevice);

        /* JADX INFO: renamed from: v0 */
        void mo106399v0(BluetoothDevice bluetoothDevice);
    }

    /* JADX INFO: renamed from: ys0.a$b */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lys0/a$b;", "", "", "data", "Ll83/a0;", "a", "([B)V", "", "getName", "()Ljava/lang/String;", "name", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo106402a(byte[] data);

        String getName();
    }

    /* JADX INFO: renamed from: a */
    boolean mo100524a(BluetoothDevice bluetoothDevice);

    /* JADX INFO: renamed from: b */
    boolean mo100525b(Map<BluetoothGattCharacteristic, ? extends b> chars);

    /* JADX INFO: renamed from: d */
    void mo100526d(BluetoothDevice bluetoothDevice);

    /* JADX INFO: renamed from: k */
    boolean mo100527k();

    /* JADX INFO: renamed from: v */
    void mo100528v();

    /* JADX INFO: renamed from: w */
    int mo100529w();

    /* JADX INFO: renamed from: x */
    void mo100530x(BluetoothDevice bluetoothDevice);

    /* JADX INFO: renamed from: y */
    void mo100531y(boolean force);

    /* JADX INFO: renamed from: z */
    boolean mo100532z(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] data);
}
