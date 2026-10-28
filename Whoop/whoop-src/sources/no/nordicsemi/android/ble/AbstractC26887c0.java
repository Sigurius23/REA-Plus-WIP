package no.nordicsemi.android.ble;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import androidx.health.platform.client.proto.C1533u;
import io.sentry.C20440o;
import java.lang.reflect.Method;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.LinkedBlockingDeque;
import md3.InterfaceC25456b;
import nd3.C26591a;
import p108e4.AbstractC12682p;
import p249jc.AbstractC21598x;
import p479s4.AbstractC32122c;
import qd3.InterfaceC30296a;
import qd3.InterfaceC30297b;
import rd3.AbstractC31252a;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.c0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26887c0 extends AbstractC21598x {

    /* JADX INFO: renamed from: E */
    private AbstractC26886c f107311E;

    /* JADX INFO: renamed from: F */
    private Handler f107312F;

    /* JADX INFO: renamed from: G */
    private final Deque<AbstractC26903k0> f107313G;

    /* JADX INFO: renamed from: H */
    private Deque<AbstractC26903k0> f107314H;

    /* JADX INFO: renamed from: I */
    private boolean f107315I;

    /* JADX INFO: renamed from: J */
    private boolean f107316J;

    /* JADX INFO: renamed from: K */
    private boolean f107317K;

    /* JADX INFO: renamed from: L */
    private boolean f107318L;

    /* JADX INFO: renamed from: M */
    private long f107319M;

    /* JADX INFO: renamed from: N */
    private int f107320N;

    /* JADX INFO: renamed from: O */
    private boolean f107321O;

    /* JADX INFO: renamed from: P */
    private boolean f107322P;

    /* JADX INFO: renamed from: Q */
    private boolean f107323Q;

    /* JADX INFO: renamed from: R */
    private boolean f107324R;

    /* JADX INFO: renamed from: S */
    private boolean f107325S;

    /* JADX INFO: renamed from: T */
    private int f107326T;

    /* JADX INFO: renamed from: U */
    private boolean f107327U;

    /* JADX INFO: renamed from: V */
    private boolean f107328V;

    /* JADX INFO: renamed from: W */
    private int f107329W;

    /* JADX INFO: renamed from: X */
    private int f107330X;

    /* JADX INFO: renamed from: Y */
    private int f107331Y;

    /* JADX INFO: renamed from: Z */
    private int f107332Z;

    /* JADX INFO: renamed from: a0 */
    @Deprecated
    private int f107333a0;

    /* JADX INFO: renamed from: b0 */
    private Map<BluetoothGattCharacteristic, byte[]> f107334b0;

    /* JADX INFO: renamed from: c0 */
    private C26891e0 f107335c0;

    /* JADX INFO: renamed from: d0 */
    private AbstractC26903k0 f107336d0;

    /* JADX INFO: renamed from: e0 */
    private final HashMap<Object, C26911o0> f107337e0;

    /* JADX INFO: renamed from: f0 */
    private final HashMap<Object, Object> f107338f0;

    /* JADX INFO: renamed from: g0 */
    @Deprecated
    private C26911o0 f107339g0;

    /* JADX INFO: renamed from: h0 */
    private final BroadcastReceiver f107340h0;

    /* JADX INFO: renamed from: i0 */
    private final BroadcastReceiver f107341i0;

    /* JADX INFO: renamed from: j0 */
    private final BluetoothGattCallback f107342j0;

    /* JADX INFO: renamed from: x */
    private final Object f107343x;

    /* JADX INFO: renamed from: y */
    private BluetoothDevice f107344y;

    /* JADX INFO: renamed from: z */
    BluetoothGatt f107345z;

    public AbstractC26887c0() {
        super(21);
        this.f107343x = new Object();
        this.f107313G = new LinkedBlockingDeque();
        this.f107320N = 0;
        this.f107326T = 0;
        this.f107327U = false;
        this.f107329W = 23;
        this.f107333a0 = -1;
        this.f107337e0 = new HashMap<>();
        this.f107338f0 = new HashMap<>();
        this.f107340h0 = new C26904l(this, 1);
        this.f107341i0 = new C26904l(this, 0);
        this.f107342j0 = new BleManagerHandler$4(this);
    }

    /* JADX INFO: renamed from: A1 */
    public static BluetoothGattDescriptor m80262A1(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i13) {
        if (bluetoothGattCharacteristic == null || (i13 & bluetoothGattCharacteristic.getProperties()) == 0) {
            return null;
        }
        return bluetoothGattCharacteristic.getDescriptor(AbstractC26886c.f107301f);
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m80263F0(AbstractC26887c0 abstractC26887c0, AbstractC26903k0 abstractC26903k0, BluetoothDevice bluetoothDevice) {
        if (abstractC26887c0.f107336d0 == abstractC26903k0) {
            abstractC26903k0.mo80360e(bluetoothDevice, -5);
            abstractC26887c0.m80324V1(true);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public static void m80264G0(AbstractC26887c0 abstractC26887c0, AbstractC26903k0 abstractC26903k0, BluetoothDevice bluetoothDevice) {
        if (4 >= abstractC26887c0.f107311E.mo80240I()) {
            abstractC26887c0.f107311E.mo80247P(4, "Cache refreshed");
        }
        abstractC26903k0.mo80363h(bluetoothDevice);
        abstractC26887c0.f107336d0 = null;
        abstractC26887c0.m80344w1(-3);
        BluetoothGatt bluetoothGatt = abstractC26887c0.f107345z;
        if (!abstractC26887c0.f107321O || bluetoothGatt == null) {
            return;
        }
        abstractC26887c0.f107311E.mo80251T();
        abstractC26887c0.mo80336f2();
        abstractC26887c0.f107318L = true;
        abstractC26887c0.f107316J = false;
        if (2 >= abstractC26887c0.f107311E.mo80240I()) {
            abstractC26887c0.f107311E.mo80247P(2, "Discovering Services...");
        }
        if (3 >= abstractC26887c0.f107311E.mo80240I()) {
            abstractC26887c0.f107311E.mo80247P(3, "gatt.discoverServices()");
        }
        bluetoothGatt.discoverServices();
    }

    /* JADX INFO: renamed from: H0 */
    public static void m80265H0(AbstractC26887c0 abstractC26887c0, C26591a c26591a) {
        byte[] bArr = c26591a.f105756w;
        if ((bArr != null ? bArr.length : 0) == 1) {
            byte[] bArr2 = c26591a.f105756w;
            int iIntValue = (1 > (bArr2 != null ? bArr2.length : 0) ? null : Integer.valueOf(bArr2[0] & 255)).intValue();
            if (4 >= abstractC26887c0.f107311E.mo80240I()) {
                abstractC26887c0.f107311E.mo80247P(4, "Battery Level received: " + iIntValue + "%");
            }
            abstractC26887c0.f107333a0 = iIntValue;
            abstractC26887c0.m80326X1(abstractC26887c0.f107345z, iIntValue);
            abstractC26887c0.f107311E.getClass();
        }
    }

    /* JADX INFO: renamed from: t1 */
    public static void m80303t1(AbstractC26887c0 abstractC26887c0, int i13) {
        abstractC26887c0.m80323U1(6, new C26917s(i13, 6));
        abstractC26887c0.f107311E.getClass();
    }

    /* JADX INFO: renamed from: u1 */
    public static void m80304u1(AbstractC26887c0 abstractC26887c0, final C26894g c26894g) {
        final InterfaceC30296a interfaceC30296a = abstractC26887c0.f107311E.f107308c;
        if (interfaceC30296a != null) {
            abstractC26887c0.mo80334e(new Runnable() { // from class: no.nordicsemi.android.ble.i
                @Override // java.lang.Runnable
                public final void run() {
                    C26894g c26894g2 = c26894g;
                    int i13 = c26894g2.f107360a;
                    InterfaceC30296a interfaceC30296a2 = interfaceC30296a;
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) c26894g2.f107361b;
                    switch (i13) {
                        case 2:
                            interfaceC30296a2.mo92597m(bluetoothDevice);
                            break;
                        case 3:
                            interfaceC30296a2.mo92598n(bluetoothDevice);
                            break;
                        default:
                            interfaceC30296a2.mo92599o(bluetoothDevice);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final int m80305B1() {
        return this.f107329W;
    }

    /* JADX INFO: renamed from: C1 */
    public C26911o0 m80306C1(Object obj) {
        C26911o0 c26911o0 = this.f107337e0.get(obj);
        if (c26911o0 != null) {
            if (this.f107344y != null) {
                c26911o0.f107405a = null;
            }
            return c26911o0;
        }
        C26911o0 c26911o1 = new C26911o0(this);
        if (obj == null) {
            return c26911o1;
        }
        synchronized (this.f107337e0) {
            this.f107337e0.put(obj, c26911o1);
        }
        return c26911o1;
    }

    /* JADX INFO: renamed from: D1 */
    public void m80307D1(AbstractC26886c abstractC26886c, Handler handler) {
        this.f107311E = abstractC26886c;
        this.f107312F = handler;
    }

    @Deprecated
    /* JADX INFO: renamed from: E1 */
    public Deque<AbstractC26903k0> m80308E1(BluetoothGatt bluetoothGatt) {
        return null;
    }

    @Override // p249jc.AbstractC21598x
    /* JADX INFO: renamed from: F */
    public final void mo60716F(AbstractC26903k0 abstractC26903k0) {
        Deque<AbstractC26903k0> deque;
        if (!abstractC26903k0.f107391j) {
            if (!this.f107315I || (deque = this.f107314H) == null) {
                deque = this.f107313G;
            }
            deque.add(abstractC26903k0);
            abstractC26903k0.f107391j = true;
        }
        m80324V1(false);
    }

    /* JADX INFO: renamed from: F1 */
    public void mo80309F1() {
    }

    /* JADX INFO: renamed from: G1 */
    public final boolean m80310G1(BluetoothDevice bluetoothDevice, C26891e0 c26891e0) {
        C26891e0 c26891e1;
        boolean zIsEnabled = BluetoothAdapter.getDefaultAdapter().isEnabled();
        if (this.f107321O || !zIsEnabled) {
            BluetoothDevice bluetoothDevice2 = this.f107344y;
            if (zIsEnabled && bluetoothDevice2 != null && bluetoothDevice2.equals(bluetoothDevice)) {
                C26891e0 c26891e2 = this.f107335c0;
                if (c26891e2 != null) {
                    c26891e2.mo80363h(bluetoothDevice);
                }
            } else {
                C26891e0 c26891e3 = this.f107335c0;
                if (c26891e3 != null) {
                    c26891e3.mo80360e(bluetoothDevice, zIsEnabled ? -4 : -100);
                }
            }
            this.f107335c0 = null;
            m80324V1(true);
            return true;
        }
        Context contextM80238G = this.f107311E.m80238G();
        synchronized (this.f107343x) {
            boolean z4 = false;
            if (this.f107345z != null) {
                if (!this.f107325S) {
                    if (3 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(3, "gatt.close()");
                    }
                    try {
                        this.f107345z.close();
                    } catch (Throwable unused) {
                    }
                    this.f107345z = null;
                    try {
                        if (3 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(3, "wait(200)");
                        }
                        Thread.sleep(200L);
                        if (this.f107345z != null || (c26891e0 != null && c26891e0.f107393l)) {
                        }
                    } catch (InterruptedException unused2) {
                    }
                    return true;
                }
                this.f107325S = false;
                this.f107319M = 0L;
                this.f107326T = 1;
                if (2 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(2, "Connecting...");
                }
                this.f107311E.getClass();
                m80342l2(new C26888d(bluetoothDevice, 1));
                if (Build.VERSION.SDK_INT >= 34) {
                    int i13 = c26891e0 != null ? c26891e0.f107352r : 1;
                    BluetoothGatt bluetoothGatt = this.f107345z;
                    if (3 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(3, "gatt.close()");
                    }
                    bluetoothGatt.close();
                    if (3 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(3, "gatt = device.connectGatt(autoConnect = true, TRANSPORT_LE, " + AbstractC31252a.m96276c(i13) + ")");
                    }
                    this.f107345z = bluetoothDevice.connectGatt(contextM80238G, true, this.f107342j0, 2, i13, this.f107312F);
                } else {
                    if (3 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(3, "gatt.connect()");
                    }
                    this.f107345z.connect();
                }
                return true;
            }
            if (c26891e0 != null) {
                AbstractC32122c.registerReceiver(contextM80238G, this.f107340h0, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"), 2);
                AbstractC32122c.registerReceiver(contextM80238G, this.f107341i0, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"), 2);
            }
            if (c26891e0 == null) {
                return false;
            }
            boolean z13 = c26891e0.f107356v;
            if (z13) {
                boolean z14 = c26891e0.f107357w;
                this.f107325S = z14;
                z4 = !z14;
            }
            this.f107324R = !z13;
            this.f107344y = bluetoothDevice;
            if (!z4) {
                if (2 >= this.f107311E.mo80240I()) {
                    AbstractC26886c abstractC26886c = this.f107311E;
                    int i14 = c26891e0.f107353s;
                    c26891e0.f107353s = i14 + 1;
                    abstractC26886c.mo80247P(2, i14 == 0 ? "Connecting..." : "Retrying...");
                }
                this.f107326T = 1;
                this.f107311E.getClass();
                m80342l2(new C26888d(bluetoothDevice, 0));
            }
            this.f107319M = SystemClock.elapsedRealtime();
            int i15 = c26891e0.f107352r;
            if (3 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(3, "gatt = device.connectGatt(autoConnect = " + z4 + ", TRANSPORT_LE, " + AbstractC31252a.m96276c(i15) + ")");
            }
            boolean z15 = z4;
            this.f107345z = bluetoothDevice.connectGatt(contextM80238G, z15, this.f107342j0, 2, i15, this.f107312F);
            if (z15 && (c26891e1 = this.f107335c0) != null) {
                c26891e1.mo80363h(bluetoothDevice);
                this.f107335c0 = null;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final boolean m80311H1(boolean z4) {
        BluetoothDevice bluetoothDevice = this.f107344y;
        if (bluetoothDevice == null) {
            return false;
        }
        if (z4) {
            if (2 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(2, "Ensuring bonding...");
            }
        } else if (2 >= this.f107311E.mo80240I()) {
            this.f107311E.mo80247P(2, "Starting bonding...");
        }
        if (!z4 && bluetoothDevice.getBondState() == 12) {
            if (5 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(5, "Bond information present on client, skipping bonding");
            }
            this.f107336d0.mo80363h(bluetoothDevice);
            m80324V1(true);
            return true;
        }
        if (3 >= this.f107311E.mo80240I()) {
            this.f107311E.mo80247P(3, "device.createBond()");
        }
        boolean zCreateBond = bluetoothDevice.createBond();
        if (!z4 || zCreateBond) {
            return zCreateBond;
        }
        C26905l0 c26905l0 = new C26905l0(4);
        c26905l0.mo80352j(this);
        AbstractC26903k0 abstractC26903k0 = this.f107336d0;
        c26905l0.f107388g = abstractC26903k0.f107388g;
        c26905l0.f107390i = abstractC26903k0.f107390i;
        c26905l0.f107389h = abstractC26903k0.f107389h;
        abstractC26903k0.f107388g = null;
        abstractC26903k0.f107390i = null;
        abstractC26903k0.f107389h = null;
        m80345x1(c26905l0);
        C26905l0 c26905l1 = new C26905l0(6);
        c26905l1.mo80352j(this);
        m80345x1(c26905l1);
        m80324V1(true);
        return true;
    }

    /* JADX INFO: renamed from: I1 */
    public final boolean m80312I1(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor bluetoothGattDescriptorM80262A1;
        BluetoothGatt bluetoothGatt = this.f107345z;
        if (bluetoothGatt != null && bluetoothGattCharacteristic != null && this.f107321O && (bluetoothGattDescriptorM80262A1 = m80262A1(bluetoothGattCharacteristic, 48)) != null) {
            if (3 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(3, "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", false)");
            }
            try {
                bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, false);
                if (2 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(2, "Disabling notifications and indications for " + bluetoothGattCharacteristic.getUuid());
                }
                try {
                    if (Build.VERSION.SDK_INT < 33) {
                        if (3 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(3, "descriptor.setValue(0x00-00)");
                        }
                        bluetoothGattDescriptorM80262A1.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                        if (3 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(3, "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb)");
                        }
                        return bluetoothGatt.writeDescriptor(bluetoothGattDescriptorM80262A1);
                    }
                    if (3 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(3, "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb, value=0x00-00)");
                    }
                    if (bluetoothGatt.writeDescriptor(bluetoothGattDescriptorM80262A1, BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE) == 0) {
                        return true;
                    }
                } catch (SecurityException e5) {
                    if (6 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(6, e5.getLocalizedMessage());
                    }
                    return false;
                }
            } catch (SecurityException e13) {
                if (6 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(6, e13.getLocalizedMessage());
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J1 */
    public final void m80313J1(int i13) {
        this.f107324R = true;
        this.f107325S = false;
        this.f107322P = false;
        BluetoothDevice device = this.f107344y;
        BluetoothGatt bluetoothGatt = this.f107345z;
        if (bluetoothGatt != null) {
            boolean z4 = this.f107321O;
            this.f107326T = 3;
            if (2 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(2, z4 ? "Disconnecting..." : "Cancelling connection...");
            }
            BluetoothDevice device2 = bluetoothGatt.getDevice();
            if (z4) {
                this.f107311E.getClass();
                m80342l2(new C26894g(device2, 1));
            }
            if (3 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(3, "gatt.disconnect()");
            }
            try {
                bluetoothGatt.disconnect();
            } catch (SecurityException e5) {
                if (6 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(6, e5.getLocalizedMessage());
                }
            }
            if (z4) {
                return;
            }
            this.f107326T = 0;
            if (4 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(4, "Disconnected");
            }
            m80343v1();
            this.f107311E.getClass();
            m80342l2(new C26896h(device2, i13, 3));
        }
        AbstractC26903k0 abstractC26903k0 = this.f107336d0;
        if (abstractC26903k0 != null && abstractC26903k0.f107385d == 3) {
            if (device == null && bluetoothGatt == null) {
                abstractC26903k0.mo80361f();
            } else {
                if (device == null) {
                    device = bluetoothGatt.getDevice();
                }
                abstractC26903k0.mo80363h(device);
            }
        }
        m80324V1(true);
    }

    /* JADX INFO: renamed from: K1 */
    public final boolean m80314K1(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor bluetoothGattDescriptorM80262A1;
        BluetoothGatt bluetoothGatt = this.f107345z;
        if (bluetoothGatt != null && bluetoothGattCharacteristic != null && this.f107321O && (bluetoothGattDescriptorM80262A1 = m80262A1(bluetoothGattCharacteristic, 32)) != null) {
            if (3 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(3, "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", true)");
            }
            try {
                bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
                if (2 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(2, "Enabling indications for " + bluetoothGattCharacteristic.getUuid());
                }
                try {
                    if (Build.VERSION.SDK_INT < 33) {
                        if (3 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(3, "descriptor.setValue(0x02-00)");
                        }
                        bluetoothGattDescriptorM80262A1.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
                        if (3 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(3, "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb)");
                        }
                        return bluetoothGatt.writeDescriptor(bluetoothGattDescriptorM80262A1);
                    }
                    if (3 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(3, "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb, value=0x02-00)");
                    }
                    if (bluetoothGatt.writeDescriptor(bluetoothGattDescriptorM80262A1, BluetoothGattDescriptor.ENABLE_INDICATION_VALUE) == 0) {
                        return true;
                    }
                } catch (SecurityException e5) {
                    if (6 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(6, e5.getLocalizedMessage());
                    }
                    return false;
                }
            } catch (SecurityException e13) {
                if (6 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(6, e13.getLocalizedMessage());
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: L1 */
    public final boolean m80315L1(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor bluetoothGattDescriptorM80262A1;
        BluetoothGatt bluetoothGatt = this.f107345z;
        if (bluetoothGatt != null && bluetoothGattCharacteristic != null && this.f107321O && (bluetoothGattDescriptorM80262A1 = m80262A1(bluetoothGattCharacteristic, 16)) != null) {
            if (3 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(3, "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", true)");
            }
            try {
                bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
                if (2 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(2, "Enabling notifications for " + bluetoothGattCharacteristic.getUuid());
                }
                try {
                    if (Build.VERSION.SDK_INT < 33) {
                        if (3 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(3, "descriptor.setValue(0x01-00)");
                        }
                        bluetoothGattDescriptorM80262A1.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                        if (3 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(3, "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb)");
                        }
                        return bluetoothGatt.writeDescriptor(bluetoothGattDescriptorM80262A1);
                    }
                    if (3 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(3, "gatt.writeDescriptor(00002902-0000-1000-8000-00805f9b34fb, value=0x01-00)");
                    }
                    if (bluetoothGatt.writeDescriptor(bluetoothGattDescriptorM80262A1, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE) == 0) {
                        return true;
                    }
                } catch (SecurityException e5) {
                    if (6 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(6, e5.getLocalizedMessage());
                    }
                    return false;
                }
            } catch (SecurityException e13) {
                if (6 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(6, e13.getLocalizedMessage());
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: M1 */
    public final boolean m80316M1(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGatt bluetoothGatt = this.f107345z;
        if (bluetoothGatt != null && bluetoothGattCharacteristic != null && this.f107321O && (bluetoothGattCharacteristic.getProperties() & 2) != 0) {
            try {
                if (2 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(2, "Reading characteristic " + bluetoothGattCharacteristic.getUuid());
                }
                if (3 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(3, "gatt.readCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")");
                }
                return bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
            } catch (SecurityException e5) {
                if (6 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(6, e5.getLocalizedMessage());
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: N1 */
    public final boolean m80317N1() {
        BluetoothGatt bluetoothGatt = this.f107345z;
        if (bluetoothGatt != null) {
            if (2 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(2, "Refreshing device cache...");
            }
            if (3 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(3, "gatt.refresh() (hidden)");
            }
            try {
                if (bluetoothGatt.getClass().getMethod("refresh", null).invoke(bluetoothGatt, null) == Boolean.TRUE) {
                    return true;
                }
            } catch (Exception e5) {
                Log.w("BleManager", "An exception occurred while refreshing device", e5);
                if (5 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(5, "gatt.refresh() method not found");
                }
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: O1 */
    public final boolean m80318O1() {
        BluetoothDevice bluetoothDevice = this.f107344y;
        if (bluetoothDevice == null) {
            return false;
        }
        if (2 >= this.f107311E.mo80240I()) {
            this.f107311E.mo80247P(2, "Removing bond information...");
        }
        if (bluetoothDevice.getBondState() == 10) {
            if (5 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(5, "Device is not bonded");
            }
            this.f107336d0.mo80363h(bluetoothDevice);
            m80324V1(true);
            return true;
        }
        try {
            Method method = bluetoothDevice.getClass().getMethod("removeBond", null);
            if (3 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(3, "device.removeBond() (hidden)");
            }
            this.f107324R = true;
            return method.invoke(bluetoothDevice, null) == Boolean.TRUE;
        } catch (Exception e5) {
            Log.w("BleManager", "An exception occurred while removing bond", e5);
            return false;
        }
    }

    /* JADX INFO: renamed from: P1 */
    public final boolean m80319P1(boolean z4) {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.f107345z;
        if (bluetoothGatt == null || !this.f107321O || (service = bluetoothGatt.getService(AbstractC26886c.f107302g)) == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(AbstractC26886c.f107303h);
        return z4 ? m80315L1(characteristic) : m80312I1(characteristic);
    }

    /* JADX INFO: renamed from: Q1 */
    public final boolean m80320Q1(final BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, final int i13) {
        BluetoothGatt bluetoothGatt = this.f107345z;
        if (bluetoothGatt != null && bluetoothGattCharacteristic != null && this.f107321O && (bluetoothGattCharacteristic.getProperties() & 12) != 0) {
            if (bArr == null) {
                try {
                    bArr = new byte[0];
                } catch (SecurityException e5) {
                    if (6 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(6, e5.getLocalizedMessage());
                    }
                }
            }
            if (Build.VERSION.SDK_INT < 33) {
                final int i14 = 0;
                m80323U1(2, new InterfaceC26885b0() { // from class: no.nordicsemi.android.ble.e
                    @Override // no.nordicsemi.android.ble.InterfaceC26885b0
                    /* JADX INFO: renamed from: b */
                    public final String mo80233b() {
                        switch (i14) {
                            case 0:
                                return "Writing characteristic " + bluetoothGattCharacteristic.getUuid() + " (" + AbstractC31252a.m96278e(i13) + ")";
                            default:
                                return "Writing characteristic " + bluetoothGattCharacteristic.getUuid() + " (" + AbstractC31252a.m96278e(i13) + ")";
                        }
                    }
                });
                if (3 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(3, "characteristic.setValue(" + AbstractC31252a.m96275b(bArr) + ")");
                }
                bluetoothGattCharacteristic.setValue(bArr);
                m80323U1(3, new C26910o(i13, 7));
                bluetoothGattCharacteristic.setWriteType(i13);
                if (3 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(3, "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")");
                }
                return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
            }
            final int i15 = 1;
            m80323U1(2, new InterfaceC26885b0() { // from class: no.nordicsemi.android.ble.e
                @Override // no.nordicsemi.android.ble.InterfaceC26885b0
                /* JADX INFO: renamed from: b */
                public final String mo80233b() {
                    switch (i15) {
                        case 0:
                            return "Writing characteristic " + bluetoothGattCharacteristic.getUuid() + " (" + AbstractC31252a.m96278e(i13) + ")";
                        default:
                            return "Writing characteristic " + bluetoothGattCharacteristic.getUuid() + " (" + AbstractC31252a.m96278e(i13) + ")";
                    }
                }
            });
            if (3 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(3, "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ", value=" + AbstractC31252a.m96275b(bArr) + ", " + AbstractC31252a.m96278e(i13) + ")");
            }
            if (bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, i13) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: R1 */
    public final boolean m80321R1() {
        return this.f107321O;
    }

    @Deprecated
    /* JADX INFO: renamed from: S1 */
    public boolean m80322S1(BluetoothGatt bluetoothGatt) {
        return false;
    }

    /* JADX INFO: renamed from: T1 */
    public abstract boolean mo80230T1(BluetoothGatt bluetoothGatt);

    /* JADX INFO: renamed from: U1 */
    public final void m80323U1(int i13, InterfaceC26885b0 interfaceC26885b0) {
        if (i13 >= this.f107311E.mo80240I()) {
            this.f107311E.mo80247P(i13, interfaceC26885b0.mo80233b());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:223:0x034e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:226:0x0354  */
    /* JADX WARN: Code duplicated, block: B:227:0x0356 A[Catch: all -> 0x000b, TryCatch #4 {all -> 0x000b, blocks: (B:5:0x0004, B:7:0x0008, B:10:0x000e, B:14:0x0014, B:16:0x0017, B:18:0x001b, B:23:0x0026, B:25:0x002a, B:27:0x0037, B:28:0x0045, B:30:0x0049, B:31:0x0050, B:33:0x0059, B:36:0x0064, B:38:0x0068, B:41:0x006d, B:43:0x0075, B:46:0x0083, B:47:0x008c, B:48:0x008f, B:50:0x0095, B:51:0x009a, B:52:0x009b, B:54:0x00a1, B:224:0x0350, B:231:0x0364, B:227:0x0356, B:55:0x00ae, B:57:0x00b2, B:60:0x00b7, B:62:0x00bf, B:63:0x00c6, B:65:0x00ce, B:66:0x00d5, B:69:0x00dd, B:70:0x00ea, B:71:0x00ef, B:72:0x00f0, B:73:0x00f5, B:74:0x00f6, B:75:0x00fb, B:76:0x00fc, B:78:0x0105, B:80:0x0109, B:83:0x010e, B:85:0x0116, B:86:0x011d, B:88:0x0125, B:89:0x013d, B:90:0x0143, B:92:0x0147, B:96:0x015c, B:98:0x0160, B:101:0x0166, B:104:0x0174, B:107:0x017e, B:110:0x0188, B:112:0x0191, B:113:0x0198, B:114:0x019e, B:115:0x01a4, B:116:0x01aa, B:118:0x01ae, B:121:0x01b4, B:124:0x01be, B:125:0x01ca, B:126:0x01cf, B:127:0x01d0, B:128:0x01d5, B:129:0x01d6, B:130:0x01de, B:131:0x01e6, B:132:0x01ee, B:133:0x01f6, B:135:0x01fa, B:138:0x0200, B:141:0x0206, B:143:0x020e, B:144:0x0215, B:146:0x021d, B:147:0x0224, B:150:0x022a, B:152:0x0232, B:153:0x023d, B:155:0x0241, B:158:0x0247, B:161:0x024d, B:163:0x0255, B:164:0x025c, B:166:0x0264, B:167:0x026b, B:170:0x0272, B:172:0x027a, B:173:0x0285, B:175:0x0289, B:178:0x028e, B:195:0x02ce, B:181:0x0294, B:183:0x029c, B:184:0x02a3, B:186:0x02ab, B:187:0x02b2, B:190:0x02ba, B:192:0x02c2, B:198:0x02d8, B:199:0x02e3, B:200:0x02ea, B:204:0x02f8, B:206:0x02fc, B:208:0x0303, B:210:0x030b, B:203:0x02f6, B:211:0x0314, B:215:0x0324, B:214:0x0322, B:216:0x032b, B:217:0x0330, B:218:0x0335, B:219:0x033a, B:221:0x033f, B:234:0x036e, B:235:0x0373, B:45:0x0080, B:236:0x0374), top: B:250:0x0004, inners: #0, #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0360  */
    /* JADX WARN: Code duplicated, block: B:230:0x0362  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX INFO: renamed from: V1 */
    public final synchronized void m80324V1(boolean z4) {
        final AbstractC26903k0 abstractC26903k0Poll;
        boolean zM80310G1;
        int i13;
        BluetoothGattService service;
        BluetoothGattService service2;
        BluetoothGattCharacteristic characteristic;
        if (z4) {
            try {
                if (this.f107323Q) {
                    this.f107323Q = false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (this.f107323Q) {
            return;
        }
        final BluetoothDevice bluetoothDevice = this.f107344y;
        try {
            Deque<AbstractC26903k0> deque = this.f107314H;
            abstractC26903k0Poll = deque != null ? deque.poll() : null;
        } catch (Exception unused) {
        }
        if (abstractC26903k0Poll == null) {
            if (this.f107314H != null) {
                this.f107314H = null;
                this.f107323Q = true;
                this.f107322P = true;
                this.f107311E.m80248Q();
                if (bluetoothDevice != null) {
                    this.f107311E.getClass();
                    m80342l2(new C26888d(bluetoothDevice, 2));
                }
                C26891e0 c26891e0 = this.f107335c0;
                if (c26891e0 != null) {
                    c26891e0.mo80363h(c26891e0.f107351q);
                    this.f107335c0 = null;
                }
            }
            try {
                abstractC26903k0Poll = this.f107313G.remove();
            } catch (Exception unused2) {
                this.f107323Q = false;
                this.f107336d0 = null;
                this.f107311E.m80249R();
                return;
            }
        }
        if (abstractC26903k0Poll.f107393l) {
            m80324V1(false);
            return;
        }
        this.f107323Q = true;
        this.f107336d0 = abstractC26903k0Poll;
        if (abstractC26903k0Poll instanceof C26891e0) {
            C26891e0 c26891e1 = (C26891e0) abstractC26903k0Poll;
            c26891e1.mo80362g(c26891e1.f107351q);
        } else {
            if (bluetoothDevice == null) {
                abstractC26903k0Poll.mo80361f();
                m80324V1(true);
                return;
            }
            abstractC26903k0Poll.mo80362g(bluetoothDevice);
        }
        int iM35485e = AbstractC12682p.m35485e(abstractC26903k0Poll.f107385d);
        switch (iM35485e) {
            case 0:
                throw new ClassCastException();
            case 1:
                C26891e0 c26891e2 = (C26891e0) abstractC26903k0Poll;
                this.f107335c0 = c26891e2;
                this.f107336d0 = null;
                zM80310G1 = m80310G1(c26891e2.f107351q, c26891e2);
                if (!zM80310G1 && bluetoothDevice != null) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 2:
                m80313J1(0);
                zM80310G1 = true;
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 3:
                zM80310G1 = m80311H1(false);
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 4:
                zM80310G1 = m80311H1(true);
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 5:
                zM80310G1 = m80318O1();
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 6:
                C26915q0 c26915q0 = (C26915q0) abstractC26903k0Poll;
                BluetoothGattCharacteristic bluetoothGattCharacteristic = c26915q0.f107386e;
                c26915q0.f107420v = true;
                byte[] bArr = c26915q0.f107416r;
                c26915q0.f107418t = bArr;
                if (bArr == null) {
                    bArr = new byte[0];
                }
                zM80310G1 = m80320Q1(bluetoothGattCharacteristic, bArr, c26915q0.f107417s);
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 7:
            case 8:
                C26915q0 c26915q1 = (C26915q0) abstractC26903k0Poll;
                c26915q1.f107420v = true;
                byte[] bArr2 = c26915q1.f107416r;
                c26915q1.f107418t = bArr2;
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                BluetoothGattCharacteristic bluetoothGattCharacteristic2 = c26915q1.f107386e;
                if (bluetoothGattCharacteristic2 != null) {
                    bluetoothGattCharacteristic2.setValue(bArr2);
                    Map<BluetoothGattCharacteristic, byte[]> map = this.f107334b0;
                    if (map != null && map.containsKey(c26915q1.f107386e)) {
                        this.f107334b0.put(c26915q1.f107386e, bArr2);
                    }
                }
                zM80310G1 = false;
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 9:
                zM80310G1 = m80316M1(abstractC26903k0Poll.f107386e);
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 10:
                C26915q0 c26915q2 = (C26915q0) abstractC26903k0Poll;
                c26915q2.f107420v = true;
                c26915q2.f107418t = c26915q2.f107416r;
                zM80310G1 = false;
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 11:
                zM80310G1 = false;
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 12:
                BluetoothGatt bluetoothGatt = this.f107345z;
                if (bluetoothGatt != null && this.f107321O) {
                    if (this.f107328V) {
                        zM80310G1 = true;
                    } else {
                        if (2 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(2, "Beginning reliable write...");
                        }
                        if (3 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(3, "gatt.beginReliableWrite()");
                        }
                        try {
                            zM80310G1 = bluetoothGatt.beginReliableWrite();
                            this.f107328V = zM80310G1;
                        } catch (SecurityException e5) {
                            if (6 >= this.f107311E.mo80240I()) {
                                this.f107311E.mo80247P(6, e5.getLocalizedMessage());
                            }
                            zM80310G1 = false;
                        }
                    }
                    break;
                } else {
                    zM80310G1 = false;
                }
                if (zM80310G1) {
                    this.f107336d0.mo80363h(bluetoothDevice);
                    m80324V1(true);
                    return;
                }
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 13:
                BluetoothGatt bluetoothGatt2 = this.f107345z;
                if (bluetoothGatt2 != null && this.f107321O && this.f107328V) {
                    if (2 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(2, "Executing reliable write...");
                    }
                    if (3 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(3, "gatt.executeReliableWrite()");
                    }
                    try {
                        zM80310G1 = bluetoothGatt2.executeReliableWrite();
                    } catch (SecurityException e13) {
                        if (6 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(6, e13.getLocalizedMessage());
                        }
                        zM80310G1 = false;
                    }
                    break;
                } else {
                    zM80310G1 = false;
                }
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 14:
                BluetoothGatt bluetoothGatt3 = this.f107345z;
                if (bluetoothGatt3 != null && this.f107321O && this.f107328V) {
                    try {
                        if (2 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(2, "Aborting reliable write...");
                        }
                        if (3 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(3, "gatt.abortReliableWrite()");
                        }
                        bluetoothGatt3.abortReliableWrite();
                        zM80310G1 = true;
                    } catch (SecurityException e14) {
                        if (6 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(6, e14.getLocalizedMessage());
                        }
                        zM80310G1 = false;
                    }
                    if (!zM80310G1) {
                        if (this.f107321O) {
                            i13 = -3;
                        } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                            i13 = -1;
                        } else {
                            i13 = -100;
                        }
                        abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                        this.f107327U = false;
                        m80324V1(true);
                    }
                    return;
                }
                zM80310G1 = false;
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 15:
                zM80310G1 = m80315L1(abstractC26903k0Poll.f107386e);
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case 16:
                zM80310G1 = m80314K1(abstractC26903k0Poll.f107386e);
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                zM80310G1 = m80312I1(abstractC26903k0Poll.f107386e);
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                zM80310G1 = m80312I1(abstractC26903k0Poll.f107386e);
                if (!zM80310G1) {
                    if (this.f107321O) {
                        i13 = -3;
                    } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                        i13 = -1;
                    } else {
                        i13 = -100;
                    }
                    abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                    this.f107327U = false;
                    m80324V1(true);
                }
                return;
            default:
                switch (iM35485e) {
                    case 24:
                        throw new ClassCastException();
                    case 25:
                        throw new ClassCastException();
                    case 26:
                        BluetoothGatt bluetoothGatt4 = this.f107345z;
                        if (bluetoothGatt4 == null || !this.f107321O || (service = bluetoothGatt4.getService(AbstractC26886c.f107302g)) == null) {
                            zM80310G1 = false;
                        } else {
                            zM80310G1 = m80316M1(service.getCharacteristic(AbstractC26886c.f107303h));
                        }
                        if (!zM80310G1) {
                            if (this.f107321O) {
                                i13 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i13 = -1;
                            } else {
                                i13 = -100;
                            }
                            abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                            this.f107327U = false;
                            m80324V1(true);
                        }
                        return;
                    case 27:
                        zM80310G1 = m80319P1(true);
                        if (!zM80310G1) {
                            if (this.f107321O) {
                                i13 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i13 = -1;
                            } else {
                                i13 = -100;
                            }
                            abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                            this.f107327U = false;
                            m80324V1(true);
                        }
                        return;
                    case 28:
                        zM80310G1 = m80319P1(false);
                        if (!zM80310G1) {
                            if (this.f107321O) {
                                i13 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i13 = -1;
                            } else {
                                i13 = -100;
                            }
                            abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                            this.f107327U = false;
                            m80324V1(true);
                        }
                        return;
                    case 29:
                        BluetoothGatt bluetoothGatt5 = this.f107345z;
                        if (bluetoothGatt5 == null || !this.f107321O || bluetoothGatt5.getDevice().getBondState() != 12 || (service2 = bluetoothGatt5.getService(AbstractC26886c.f107304i)) == null || (characteristic = service2.getCharacteristic(AbstractC26886c.f107305j)) == null) {
                            zM80310G1 = false;
                        } else {
                            if (4 >= this.f107311E.mo80240I()) {
                                this.f107311E.mo80247P(4, "Service Changed characteristic found on a bonded device");
                            }
                            zM80310G1 = m80314K1(characteristic);
                        }
                        if (!zM80310G1) {
                            if (this.f107321O) {
                                i13 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i13 = -1;
                            } else {
                                i13 = -100;
                            }
                            abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                            this.f107327U = false;
                            m80324V1(true);
                        }
                        return;
                    case 30:
                        C26895g0 c26895g0 = (C26895g0) abstractC26903k0Poll;
                        int i14 = this.f107329W;
                        int i15 = c26895g0.f107363o;
                        if (i14 != i15) {
                            BluetoothGatt bluetoothGatt6 = this.f107345z;
                            if (bluetoothGatt6 == null || !this.f107321O) {
                                zM80310G1 = false;
                            } else {
                                if (2 >= this.f107311E.mo80240I()) {
                                    this.f107311E.mo80247P(2, "Requesting new MTU...");
                                }
                                if (3 >= this.f107311E.mo80240I()) {
                                    this.f107311E.mo80247P(3, "gatt.requestMtu(" + i15 + ")");
                                }
                                zM80310G1 = bluetoothGatt6.requestMtu(i15);
                            }
                        } else {
                            boolean z13 = this.f107321O;
                            if (z13) {
                                c26895g0.f107383b.mo80334e(new RunnableC26912p(c26895g0, bluetoothDevice, i14));
                                c26895g0.mo80363h(bluetoothDevice);
                                m80324V1(true);
                                return;
                            }
                            zM80310G1 = z13;
                        }
                        if (!zM80310G1) {
                            if (this.f107321O) {
                                i13 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i13 = -1;
                            } else {
                                i13 = -100;
                            }
                            abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                            this.f107327U = false;
                            m80324V1(true);
                        }
                        return;
                    case 31:
                        throw new ClassCastException();
                    case 32:
                        throw new ClassCastException();
                    case 33:
                        throw new ClassCastException();
                    case 34:
                        BluetoothGatt bluetoothGatt7 = this.f107345z;
                        if (bluetoothGatt7 == null || !this.f107321O) {
                            zM80310G1 = false;
                        } else {
                            if (2 >= this.f107311E.mo80240I()) {
                                this.f107311E.mo80247P(2, "Reading remote RSSI...");
                            }
                            if (3 >= this.f107311E.mo80240I()) {
                                this.f107311E.mo80247P(3, "gatt.readRemoteRssi()");
                            }
                            zM80310G1 = bluetoothGatt7.readRemoteRssi();
                        }
                        if (zM80310G1) {
                            final int i16 = 0;
                            mo80337g(new Runnable(this) { // from class: no.nordicsemi.android.ble.k

                                /* JADX INFO: renamed from: x */
                                public final /* synthetic */ AbstractC26887c0 f107378x;

                                {
                                    this.f107378x = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i16) {
                                        case 0:
                                            AbstractC26887c0.m80263F0(this.f107378x, abstractC26903k0Poll, bluetoothDevice);
                                            break;
                                        default:
                                            AbstractC26887c0.m80264G0(this.f107378x, abstractC26903k0Poll, bluetoothDevice);
                                            break;
                                    }
                                }
                            }, 1000L);
                        }
                        if (!zM80310G1) {
                            if (this.f107321O) {
                                i13 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i13 = -1;
                            } else {
                                i13 = -100;
                            }
                            abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                            this.f107327U = false;
                            m80324V1(true);
                        }
                        return;
                    case 35:
                        zM80310G1 = m80317N1();
                        if (zM80310G1) {
                            final int i17 = 1;
                            mo80337g(new Runnable(this) { // from class: no.nordicsemi.android.ble.k

                                /* JADX INFO: renamed from: x */
                                public final /* synthetic */ AbstractC26887c0 f107378x;

                                {
                                    this.f107378x = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            AbstractC26887c0.m80263F0(this.f107378x, abstractC26903k0Poll, bluetoothDevice);
                                            break;
                                        default:
                                            AbstractC26887c0.m80264G0(this.f107378x, abstractC26903k0Poll, bluetoothDevice);
                                            break;
                                    }
                                }
                            }, 200L);
                        }
                        if (!zM80310G1) {
                            if (this.f107321O) {
                                i13 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i13 = -1;
                            } else {
                                i13 = -100;
                            }
                            abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                            this.f107327U = false;
                            m80324V1(true);
                        }
                        return;
                    case 36:
                        throw new ClassCastException();
                    default:
                        zM80310G1 = false;
                        if (!zM80310G1) {
                            if (this.f107321O) {
                                i13 = -3;
                            } else if (BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                                i13 = -1;
                            } else {
                                i13 = -100;
                            }
                            abstractC26903k0Poll.mo80360e(bluetoothDevice, i13);
                            this.f107327U = false;
                            m80324V1(true);
                        }
                        return;
                }
        }
    }

    /* JADX INFO: renamed from: W1 */
    public void m80325W1(BluetoothDevice bluetoothDevice, int i13) {
        if (this.f107326T == 0) {
            return;
        }
        boolean z4 = this.f107321O;
        boolean z13 = this.f107316J;
        this.f107321O = false;
        this.f107322P = false;
        this.f107316J = false;
        this.f107318L = false;
        this.f107317K = false;
        this.f107329W = 23;
        this.f107332Z = 0;
        this.f107331Y = 0;
        this.f107330X = 0;
        this.f107326T = 0;
        if (z4) {
            if (this.f107324R) {
                if (4 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(4, "Disconnected");
                }
                AbstractC26903k0 abstractC26903k0 = this.f107336d0;
                if (abstractC26903k0 == null || abstractC26903k0.f107385d != 6) {
                    m80343v1();
                }
                this.f107311E.getClass();
                m80342l2(new C26896h(bluetoothDevice, i13, 1));
                if (abstractC26903k0 != null && abstractC26903k0.f107385d == 3) {
                    abstractC26903k0.mo80363h(bluetoothDevice);
                    this.f107336d0 = null;
                }
            } else {
                if (5 >= this.f107311E.mo80240I()) {
                    this.f107311E.mo80247P(5, "Connection lost");
                }
                this.f107311E.getClass();
                m80342l2(new C26896h(bluetoothDevice, i13 == 2 ? 2 : 3, 2));
            }
        } else {
            if (5 >= this.f107311E.mo80240I()) {
                this.f107311E.mo80247P(5, "Connection attempt timed out");
            }
            m80343v1();
            this.f107311E.getClass();
            m80342l2(new C26896h(bluetoothDevice, i13, 0));
        }
        synchronized (this.f107337e0) {
            try {
                Iterator<C26911o0> it = this.f107337e0.values().iterator();
                while (it.hasNext()) {
                    it.next().f107405a = null;
                }
                this.f107337e0.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f107338f0.clear();
        this.f107339g0 = null;
        this.f107333a0 = -1;
        if (z13) {
            this.f107311E.mo80251T();
        }
        mo80336f2();
    }

    @Deprecated
    /* JADX INFO: renamed from: X1 */
    public void m80326X1(BluetoothGatt bluetoothGatt, int i13) {
    }

    @Deprecated
    /* JADX INFO: renamed from: Y1 */
    public void m80327Y1(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    @Deprecated
    /* JADX INFO: renamed from: Z1 */
    public void m80328Z1(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26889d0
    /* JADX INFO: renamed from: a */
    public void mo80329a(Runnable runnable) {
        this.f107312F.removeCallbacks(runnable);
    }

    @Deprecated
    /* JADX INFO: renamed from: a2 */
    public void m80330a2(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    @Deprecated
    /* JADX INFO: renamed from: b2 */
    public void m80331b2(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    @TargetApi(26)
    @Deprecated
    /* JADX INFO: renamed from: c2 */
    public void m80332c2(BluetoothGatt bluetoothGatt, int i13, int i14, int i15) {
    }

    @Deprecated
    /* JADX INFO: renamed from: d2 */
    public void m80333d2(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26889d0
    /* JADX INFO: renamed from: e */
    public void mo80334e(Runnable runnable) {
        this.f107312F.post(runnable);
    }

    @Override // p249jc.AbstractC21598x
    /* JADX INFO: renamed from: e0 */
    public final void mo60717e0(BluetoothDevice bluetoothDevice, AbstractC26907m0 abstractC26907m0) {
        if (5 >= this.f107311E.mo80240I()) {
            this.f107311E.mo80247P(5, "Request timed out");
        }
        AbstractC26903k0 abstractC26903k0 = this.f107336d0;
        if (abstractC26903k0 instanceof AbstractC26907m0) {
            ((AbstractC26907m0) abstractC26903k0).mo80360e(bluetoothDevice, -5);
        }
        abstractC26907m0.mo80360e(bluetoothDevice, -5);
        int i13 = abstractC26907m0.f107385d;
        if (i13 == 2) {
            this.f107335c0 = null;
            m80313J1(10);
        } else if (i13 == 3) {
            m80343v1();
        } else {
            AbstractC26903k0 abstractC26903k1 = this.f107336d0;
            m80324V1(abstractC26903k1 == null || abstractC26903k1.f107393l);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e2 */
    public void m80335e2(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
    }

    @Deprecated
    /* JADX INFO: renamed from: f2 */
    public void mo80336f2() {
    }

    @Override // no.nordicsemi.android.ble.InterfaceC26889d0
    /* JADX INFO: renamed from: g */
    public void mo80337g(Runnable runnable, long j7) {
        new Timer().schedule(new C20440o(runnable, 2), j7);
    }

    @Deprecated
    /* JADX INFO: renamed from: g2 */
    public void m80338g2() {
    }

    @Deprecated
    /* JADX INFO: renamed from: h2 */
    public void m80339h2() {
    }

    @Deprecated
    /* JADX INFO: renamed from: i2 */
    public void m80340i2(BluetoothGatt bluetoothGatt, int i13) {
    }

    /* JADX INFO: renamed from: j2 */
    public abstract void mo80231j2();

    /* JADX INFO: renamed from: k2 */
    public final void m80341k2() {
        this.f107311E.getClass();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m80342l2(InterfaceC26883a0 interfaceC26883a0) {
        InterfaceC30297b interfaceC30297b = this.f107311E.f107309d;
        if (interfaceC30297b != null) {
            mo80334e(new RunnableC26900j(0, interfaceC26883a0, interfaceC30297b));
        }
    }

    @Override // p249jc.AbstractC21598x
    /* JADX INFO: renamed from: n */
    public final void mo60719n() {
        BluetoothDevice bluetoothDevice = this.f107344y;
        if (bluetoothDevice == null) {
            return;
        }
        if (5 >= this.f107311E.mo80240I()) {
            this.f107311E.mo80247P(5, "Request cancelled");
        }
        AbstractC26903k0 abstractC26903k0 = this.f107336d0;
        if (abstractC26903k0 instanceof AbstractC26907m0) {
            ((AbstractC26907m0) abstractC26903k0).mo80360e(bluetoothDevice, -7);
        }
        AbstractC26903k0 abstractC26903k1 = this.f107336d0;
        m80324V1(abstractC26903k1 == null || abstractC26903k1.f107393l);
    }

    @Override // p249jc.AbstractC21598x
    /* JADX INFO: renamed from: o */
    public final void mo60720o() {
        m80344w1(-7);
        this.f107315I = false;
        BluetoothDevice bluetoothDevice = this.f107344y;
        if (bluetoothDevice == null) {
            return;
        }
        if (this.f107323Q) {
            mo60719n();
        }
        C26891e0 c26891e0 = this.f107335c0;
        if (c26891e0 != null) {
            c26891e0.mo80360e(bluetoothDevice, -7);
            this.f107335c0 = null;
            m80313J1(5);
        }
    }

    /* JADX INFO: renamed from: v1 */
    public void m80343v1() {
        try {
            Context contextM80238G = this.f107311E.m80238G();
            contextM80238G.unregisterReceiver(this.f107340h0);
            contextM80238G.unregisterReceiver(this.f107341i0);
        } catch (Exception unused) {
        }
        synchronized (this.f107343x) {
            try {
                boolean z4 = this.f107321O;
                BluetoothDevice bluetoothDevice = this.f107344y;
                if (this.f107345z != null) {
                    if (this.f107311E.m80260c0()) {
                        if (m80317N1()) {
                            if (4 >= this.f107311E.mo80240I()) {
                                this.f107311E.mo80247P(4, "Cache refreshed");
                            }
                        } else if (5 >= this.f107311E.mo80240I()) {
                            this.f107311E.mo80247P(5, "Refreshing failed");
                        }
                    }
                    if (3 >= this.f107311E.mo80240I()) {
                        this.f107311E.mo80247P(3, "gatt.close()");
                    }
                    try {
                        this.f107345z.close();
                    } catch (Throwable unused2) {
                    }
                    this.f107345z = null;
                }
                this.f107328V = false;
                this.f107325S = false;
                m80344w1(-1);
                this.f107315I = false;
                this.f107344y = null;
                this.f107321O = false;
                this.f107326T = 0;
                this.f107329W = 23;
                this.f107332Z = 0;
                this.f107331Y = 0;
                this.f107330X = 0;
                if (z4 && bluetoothDevice != null) {
                    this.f107311E.getClass();
                    m80342l2(new C26894g(bluetoothDevice, 0));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m80344w1(int i13) {
        BluetoothDevice bluetoothDevice = this.f107344y;
        Deque<AbstractC26903k0> deque = this.f107314H;
        if (deque != null) {
            for (AbstractC26903k0 abstractC26903k0 : deque) {
                if (bluetoothDevice != null) {
                    abstractC26903k0.mo80360e(bluetoothDevice, i13);
                } else {
                    abstractC26903k0.mo80361f();
                }
            }
            this.f107314H = null;
        }
        for (AbstractC26903k0 abstractC26903k1 : this.f107313G) {
            if (bluetoothDevice == null) {
                abstractC26903k1.mo80361f();
            } else if (i13 == -100 || abstractC26903k1.f107386e != null) {
                abstractC26903k1.mo80360e(bluetoothDevice, i13);
            } else {
                abstractC26903k1.mo80360e(bluetoothDevice, -7);
            }
        }
        this.f107313G.clear();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m80345x1(AbstractC26903k0 abstractC26903k0) {
        Deque<AbstractC26903k0> deque;
        if (!this.f107315I || (deque = this.f107314H) == null) {
            deque = this.f107313G;
        }
        deque.addFirst(abstractC26903k0);
        abstractC26903k0.f107391j = true;
        this.f107323Q = false;
    }

    @Deprecated
    /* JADX INFO: renamed from: y1 */
    public InterfaceC25456b m80346y1() {
        return new InterfaceC25456b() { // from class: no.nordicsemi.android.ble.f
            @Override // md3.InterfaceC25456b
            /* JADX INFO: renamed from: a */
            public final void mo74863a(BluetoothDevice bluetoothDevice, C26591a c26591a) {
                AbstractC26887c0.m80265H0(this.f107359a, c26591a);
            }
        };
    }

    /* JADX INFO: renamed from: z1 */
    public BluetoothDevice m80347z1() {
        return this.f107344y;
    }
}
