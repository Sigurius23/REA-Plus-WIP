package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import java.util.UUID;
import p479s4.AbstractC32122c;
import qd3.InterfaceC30296a;
import qd3.InterfaceC30297b;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26886c {

    /* JADX INFO: renamed from: f */
    static final UUID f107301f = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: g */
    static final UUID f107302g = UUID.fromString("0000180F-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: h */
    static final UUID f107303h = UUID.fromString("00002A19-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: i */
    static final UUID f107304i = UUID.fromString("00001801-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: j */
    static final UUID f107305j = UUID.fromString("00002A05-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: a */
    private final Context f107306a;

    /* JADX INFO: renamed from: b */
    final AbstractC26884b f107307b;

    /* JADX INFO: renamed from: c */
    InterfaceC30296a f107308c;

    /* JADX INFO: renamed from: d */
    InterfaceC30297b f107309d;

    /* JADX INFO: renamed from: e */
    private final BroadcastReceiver f107310e;

    public AbstractC26886c(Context context, Handler handler) {
        C26904l c26904l = new C26904l(this, 2);
        this.f107310e = c26904l;
        this.f107306a = context;
        AbstractC26884b abstractC26884bMo80239H = mo80239H();
        this.f107307b = abstractC26884bMo80239H;
        abstractC26884bMo80239H.m80307D1(this, handler);
        AbstractC32122c.registerReceiver(context, c26904l, new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST"), 2);
    }

    /* JADX INFO: renamed from: C */
    public final C26891e0 m80234C(BluetoothDevice bluetoothDevice) {
        C26891e0 c26891e0 = new C26891e0(bluetoothDevice);
        c26891e0.f107356v = m80259b0();
        c26891e0.m80366n(this.f107307b);
        return c26891e0;
    }

    /* JADX INFO: renamed from: D */
    public AbstractC26903k0 m80235D() {
        C26905l0 c26905l0 = new C26905l0(4);
        c26905l0.mo80352j(this.f107307b);
        return c26905l0;
    }

    /* JADX INFO: renamed from: E */
    public final C26893f0 m80236E() {
        C26893f0 c26893f0 = new C26893f0();
        c26893f0.m80366n(this.f107307b);
        return c26893f0;
    }

    /* JADX INFO: renamed from: F */
    public C26915q0 m80237F(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        C26915q0 c26915q0 = new C26915q0(bluetoothGattCharacteristic, 16);
        c26915q0.m80366n(this.f107307b);
        return c26915q0;
    }

    /* JADX INFO: renamed from: G */
    public final Context m80238G() {
        return this.f107306a;
    }

    @Deprecated
    /* JADX INFO: renamed from: H */
    public AbstractC26884b mo80239H() {
        return new C26882a();
    }

    /* JADX INFO: renamed from: I */
    public abstract int mo80240I();

    /* JADX INFO: renamed from: J */
    public int m80241J() {
        return this.f107307b.m80305B1();
    }

    /* JADX INFO: renamed from: K */
    public int m80242K(boolean z4) {
        return z4 ? 1600 : 300;
    }

    /* JADX INFO: renamed from: L */
    public void mo80243L() {
        this.f107307b.mo80309F1();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m80244M() {
        BluetoothDevice bluetoothDeviceM80347z1 = this.f107307b.m80347z1();
        return bluetoothDeviceM80347z1 != null && bluetoothDeviceM80347z1.getBondState() == 12;
    }

    /* JADX INFO: renamed from: N */
    public boolean m80245N(BluetoothGatt bluetoothGatt) {
        return this.f107307b.m80322S1(bluetoothGatt);
    }

    /* JADX INFO: renamed from: O */
    public boolean mo80246O(BluetoothGatt bluetoothGatt) {
        return this.f107307b.mo80230T1(bluetoothGatt);
    }

    /* JADX INFO: renamed from: P */
    public void mo80247P(int i13, String str) {
    }

    /* JADX INFO: renamed from: Q */
    public void m80248Q() {
        this.f107307b.m80338g2();
    }

    /* JADX INFO: renamed from: R */
    public void m80249R() {
        this.f107307b.m80339h2();
    }

    /* JADX INFO: renamed from: S */
    public void m80250S(BluetoothDevice bluetoothDevice, int i13, int i14) {
    }

    /* JADX INFO: renamed from: T */
    public void mo80251T() {
        this.f107307b.mo80231j2();
    }

    @Deprecated
    /* JADX INFO: renamed from: U */
    public void m80252U() {
        C26897h0 c26897h0 = new C26897h0();
        c26897h0.m80366n(this.f107307b);
        c26897h0.m80358q(this.f107307b.m80346y1());
        c26897h0.m80359b();
    }

    /* JADX INFO: renamed from: V */
    public AbstractC26903k0 m80253V() {
        C26905l0 c26905l0 = new C26905l0(36);
        c26905l0.mo80352j(this.f107307b);
        return c26905l0;
    }

    /* JADX INFO: renamed from: W */
    public AbstractC26903k0 m80254W() {
        C26905l0 c26905l0 = new C26905l0(6);
        c26905l0.mo80352j(this.f107307b);
        return c26905l0;
    }

    /* JADX INFO: renamed from: X */
    public C26895g0 m80255X(int i13) {
        C26895g0 c26895g0 = new C26895g0(i13);
        c26895g0.m80355l(this.f107307b);
        return c26895g0;
    }

    /* JADX INFO: renamed from: Y */
    public final void m80256Y(InterfaceC30296a interfaceC30296a) {
        this.f107308c = interfaceC30296a;
    }

    /* JADX INFO: renamed from: Z */
    public final void m80257Z(InterfaceC30297b interfaceC30297b) {
        this.f107309d = interfaceC30297b;
    }

    /* JADX INFO: renamed from: a0 */
    public C26911o0 m80258a0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.f107307b.m80306C1(bluetoothGattCharacteristic);
    }

    @Deprecated
    /* JADX INFO: renamed from: b0 */
    public boolean m80259b0() {
        return false;
    }

    /* JADX INFO: renamed from: c0 */
    public boolean m80260c0() {
        return false;
    }

    public void close() {
        try {
            this.f107306a.unregisterReceiver(this.f107310e);
        } catch (Exception unused) {
        }
        this.f107307b.m80343v1();
    }

    /* JADX INFO: renamed from: d0 */
    public C26915q0 m80261d0(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i13) {
        C26915q0 c26915q0 = new C26915q0(bluetoothGattCharacteristic, bArr, bArr != null ? bArr.length : 0, i13);
        c26915q0.m80366n(this.f107307b);
        return c26915q0;
    }
}
