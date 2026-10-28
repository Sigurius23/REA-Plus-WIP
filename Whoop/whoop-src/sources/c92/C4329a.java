package c92;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.lang.reflect.InvocationTargetException;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import tt0.AbstractC34156a;

/* JADX INFO: renamed from: c92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u001f\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018¨\u0006 "}, m65681d2 = {"Lc92/a;", "", "Landroid/bluetooth/BluetoothAdapter;", "bluetoothAdapter", "<init>", "(Landroid/bluetooth/BluetoothAdapter;)V", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroid/bluetooth/BluetoothDevice;)Z", "device", "", "a", "(Landroid/bluetooth/BluetoothDevice;)Ljava/lang/String;", "", "state", "c", "(I)Ljava/lang/String;", "Landroid/bluetooth/BluetoothAdapter;", "b", "()Landroid/bluetooth/BluetoothAdapter;", "Z", "e", "()Z", "isBluetoothSupported", "d", "isBluetoothEnabled", "f", "isBluetoothSupportedAndEnabled", "g", "isLe2mSupported", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4329a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final BluetoothAdapter bluetoothAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isBluetoothSupported;

    public C4329a(BluetoothAdapter bluetoothAdapter) {
        this.bluetoothAdapter = bluetoothAdapter;
        this.isBluetoothSupported = bluetoothAdapter != null;
    }

    /* JADX INFO: renamed from: a */
    public final String m13648a(BluetoothDevice device) {
        AbstractC22676k.m65750j(device, "device");
        return AbstractC11895b.m31997p(device.getName(), "(", device.getAddress(), ")");
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BluetoothAdapter getBluetoothAdapter() {
        return this.bluetoothAdapter;
    }

    /* JADX INFO: renamed from: c */
    public final String m13650c(int state) {
        switch (state) {
            case 10:
                return "Off";
            case 11:
                return "Turning On";
            case 12:
                return "On";
            case 13:
                return "Turning Off";
            default:
                return String.valueOf(state);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13651d() {
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.isEnabled();
        }
        throw new IllegalArgumentException("bluetooth is not supported on this device");
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsBluetoothSupported() {
        return this.isBluetoothSupported;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m13653f() {
        return this.isBluetoothSupported && m13651d();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m13654g() {
        BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.isLe2MPhySupported();
        }
        throw new IllegalArgumentException("bluetooth is not supported on this device");
    }

    /* JADX INFO: renamed from: h */
    public final boolean m13655h(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            try {
                Object objInvoke = bluetoothDevice.getClass().getDeclaredMethod("removeBond", null).invoke(bluetoothDevice, null);
                AbstractC22676k.m65748h(objInvoke, "null cannot be cast to non-null type kotlin.Boolean");
                return ((Boolean) objInvoke).booleanValue();
            } catch (IllegalAccessException e5) {
                AbstractC4330b.f17588a.mo85230v(AbstractC11266d.m30461o("Failed to remove bond from ", AbstractC34156a.m107933a(bluetoothDevice)), e5, new AbstractC30556a.a[0]);
            } catch (NoSuchMethodException e13) {
                AbstractC4330b.f17588a.mo85230v(AbstractC11266d.m30461o("Failed to remove bond from ", AbstractC34156a.m107933a(bluetoothDevice)), e13, new AbstractC30556a.a[0]);
            } catch (NullPointerException e14) {
                AbstractC4330b.f17588a.mo85230v(AbstractC11266d.m30461o("Failed to remove bond from ", AbstractC34156a.m107933a(bluetoothDevice)), e14, new AbstractC30556a.a[0]);
            } catch (InvocationTargetException e15) {
                AbstractC4330b.f17588a.mo85230v(AbstractC11266d.m30461o("Failed to remove bond from ", AbstractC34156a.m107933a(bluetoothDevice)), e15, new AbstractC30556a.a[0]);
            }
        }
        return false;
    }
}
