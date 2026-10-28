package s92;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ys0.InterfaceC39750a;

/* JADX INFO: renamed from: s92.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u0003R\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m65681d2 = {"Ls92/a;", "Lys0/a;", "<init>", "()V", "", "k", "()Z", "Landroid/bluetooth/BluetoothDevice;", "bluetoothDevice", "a", "(Landroid/bluetooth/BluetoothDevice;)Z", "Ll83/a0;", "x", "(Landroid/bluetooth/BluetoothDevice;)V", "d", "force", "y", "(Z)V", "Landroid/bluetooth/BluetoothGattCharacteristic;", "bluetoothGattCharacteristic", "", "data", "z", "(Landroid/bluetooth/BluetoothGattCharacteristic;[B)Z", "", "Lys0/a$b;", "chars", "b", "(Ljava/util/Map;)Z", "v", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()I", "maxTransmissionUnit", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32293a implements InterfaceC39750a {
    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: a */
    public boolean mo100524a(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
        return true;
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: b */
    public boolean mo100525b(Map<BluetoothGattCharacteristic, ? extends InterfaceC39750a.b> chars) {
        AbstractC22676k.m65750j(chars, "chars");
        return true;
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: d */
    public void mo100526d(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: k */
    public boolean mo100527k() {
        return true;
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: v */
    public void mo100528v() {
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: w */
    public int getMaxTransmissionUnit() {
        return 247;
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: x */
    public void mo100530x(BluetoothDevice bluetoothDevice) {
        AbstractC22676k.m65750j(bluetoothDevice, "bluetoothDevice");
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: y */
    public void mo100531y(boolean force) {
    }

    @Override // ys0.InterfaceC39750a
    /* JADX INFO: renamed from: z */
    public boolean mo100532z(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] data) {
        AbstractC22676k.m65750j(bluetoothGattCharacteristic, "bluetoothGattCharacteristic");
        AbstractC22676k.m65750j(data, "data");
        return true;
    }
}
