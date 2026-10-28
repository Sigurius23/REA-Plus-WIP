package b50;

import a50.C0385a;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kr.C22786e;
import m83.AbstractC25265s;
import p558vp.AbstractC36259c;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import u00.C34377e;
import x30.AbstractC37926s0;
import z40.C40059f;
import z40.C40064k;

/* JADX INFO: renamed from: b50.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C2735c extends BroadcastReceiver implements BluetoothProfile.ServiceListener {

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ int f10752K = 0;

    /* JADX INFO: renamed from: E */
    public final C22786e f10753E;

    /* JADX INFO: renamed from: F */
    public BluetoothHeadset f10754F;

    /* JADX INFO: renamed from: G */
    public boolean f10755G;

    /* JADX INFO: renamed from: H */
    public AbstractC37926s0 f10756H;

    /* JADX INFO: renamed from: I */
    public final C2733a f10757I;

    /* JADX INFO: renamed from: J */
    public final C2733a f10758J;

    /* JADX INFO: renamed from: w */
    public final Context f10759w;

    /* JADX INFO: renamed from: x */
    public final C22786e f10760x;

    /* JADX INFO: renamed from: y */
    public final BluetoothAdapter f10761y;

    /* JADX INFO: renamed from: z */
    public C40064k f10762z;

    public C2735c(Context context, C22786e c22786e, BluetoothAdapter bluetoothAdapter, C40059f c40059f) {
        Handler handler = new Handler(Looper.getMainLooper());
        C34377e c34377e = new C34377e(4);
        C22786e c22786e2 = new C22786e(3);
        this.f10759w = context;
        this.f10760x = c22786e;
        this.f10761y = bluetoothAdapter;
        this.f10762z = null;
        this.f10753E = c22786e2;
        this.f10754F = null;
        this.f10755G = false;
        this.f10756H = C2734b.f10751f;
        this.f10757I = new C2733a(this, c22786e, c40059f, handler, c34377e, 1);
        this.f10758J = new C2733a(this, c22786e, c40059f, handler, c34377e, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m7704a() {
        if (AbstractC22676k.m65745e(this.f10756H, C2734b.f10747b)) {
            this.f10758J.m7260m();
            return;
        }
        String message = "Cannot deactivate when in the " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(this.f10756H.getClass()).getSimpleName() + " state";
        this.f10760x.getClass();
        AbstractC22676k.m65750j(message, "message");
    }

    /* JADX INFO: renamed from: b */
    public final String m7705b() {
        List<BluetoothDevice> connectedDevices;
        Object next;
        BluetoothHeadset bluetoothHeadset = this.f10754F;
        if (bluetoothHeadset != null && (connectedDevices = bluetoothHeadset.getConnectedDevices()) != null) {
            int size = connectedDevices.size();
            C22786e c22786e = this.f10760x;
            if (size > 1 && m7706c()) {
                Iterator<T> it = connectedDevices.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!bluetoothHeadset.isAudioConnected((BluetoothDevice) next));
                BluetoothDevice bluetoothDevice = (BluetoothDevice) next;
                String name = bluetoothDevice != null ? bluetoothDevice.getName() : null;
                String message = "Device size > 1 with device name: " + name;
                c22786e.getClass();
                AbstractC22676k.m65750j(message, "message");
                return name;
            }
            if (connectedDevices.size() == 1) {
                String name2 = ((BluetoothDevice) AbstractC25265s.m74096F0(connectedDevices)).getName();
                String message2 = "Device size 1 with device name: " + name2;
                c22786e.getClass();
                AbstractC22676k.m65750j(message2, "message");
                return name2;
            }
            c22786e.getClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7706c() {
        Boolean boolValueOf;
        boolean z4;
        BluetoothHeadset bluetoothHeadset = this.f10754F;
        if (bluetoothHeadset != null) {
            List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
            if (connectedDevices != null) {
                List<BluetoothDevice> list = connectedDevices;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z4 = false;
                            break;
                        }
                        if (bluetoothHeadset.isAudioConnected((BluetoothDevice) it.next())) {
                            z4 = true;
                            break;
                        }
                    }
                } else {
                    z4 = false;
                    break;
                }
                boolValueOf = Boolean.valueOf(z4);
            } else {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                return boolValueOf.booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7707d() {
        BluetoothHeadset bluetoothHeadset = this.f10754F;
        if (bluetoothHeadset == null) {
            return false;
        }
        List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
        Boolean boolValueOf = connectedDevices != null ? Boolean.valueOf(!connectedDevices.isEmpty()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m7708e(AbstractC37926s0 abstractC37926s0) {
        if (AbstractC22676k.m65745e(this.f10756H, abstractC37926s0)) {
            return;
        }
        this.f10756H = abstractC37926s0;
        String message = "Headset state changed to " + AbstractC22671h0.f89337a.getOrCreateKotlinClass(abstractC37926s0.getClass()).getSimpleName();
        this.f10760x.getClass();
        AbstractC22676k.m65750j(message, "message");
        if (abstractC37926s0.equals(C2734b.f10751f)) {
            this.f10757I.m7254g();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Integer num;
        int iIntValue;
        C2734b c2734b = C2734b.f10750e;
        C2734b c2734b2 = C2734b.f10747b;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(intent, "intent");
        String action = intent.getAction();
        if (AbstractC22676k.m65745e(action, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") || AbstractC22676k.m65745e(action, "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED") || AbstractC22676k.m65745e(action, "android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
            this.f10753E.getClass();
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            C0385a c0385a = null;
            C0385a c0385a2 = bluetoothDevice != null ? new C0385a(bluetoothDevice) : null;
            if (c0385a2 != null && (num = c0385a2.f1333c) != null && ((iIntValue = num.intValue()) == 1032 || iIntValue == 1028 || iIntValue == 1056 || iIntValue == 1048 || iIntValue == 7936)) {
                c0385a = c0385a2;
            }
            C22786e c22786e = this.f10760x;
            if (c0385a != null) {
                String str = c0385a.f1332b;
                int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                if (intExtra == 0) {
                    String message = "Bluetooth headset " + c0385a + " disconnected";
                    c22786e.getClass();
                    AbstractC22676k.m65750j(message, "message");
                    if (m7706c()) {
                        c2734b = c2734b2;
                    } else if (!m7707d()) {
                        c2734b = C2734b.f10751f;
                    }
                    m7708e(c2734b);
                    C40064k c40064k = this.f10762z;
                    if (c40064k != null) {
                        c40064k.m128406a(str);
                    }
                } else if (intExtra != 2) {
                    C2733a c2733a = this.f10757I;
                    if (intExtra == 10) {
                        String message2 = "Bluetooth audio disconnected on device " + c0385a;
                        c22786e.getClass();
                        AbstractC22676k.m65750j(message2, "message");
                        this.f10758J.m7254g();
                        if (AbstractC22676k.m65745e(this.f10756H, c2734b2) && m7707d() && !m7706c()) {
                            c2733a.m7260m();
                        }
                        C40064k c40064k2 = this.f10762z;
                        if (c40064k2 != null) {
                            c40064k2.m128406a(str);
                        }
                    } else if (intExtra == 12) {
                        String message3 = "Bluetooth audio connected on device " + c0385a;
                        c22786e.getClass();
                        AbstractC22676k.m65750j(message3, "message");
                        c2733a.m7254g();
                        m7708e(c2734b2);
                        C40064k c40064k3 = this.f10762z;
                        if (c40064k3 != null) {
                            c40064k3.m128406a(str);
                        }
                    }
                } else {
                    String message4 = "Bluetooth headset " + c0385a + " connected";
                    c22786e.getClass();
                    AbstractC22676k.m65750j(message4, "message");
                    if (!m7706c()) {
                        m7708e(c2734b);
                    }
                    C40064k c40064k4 = this.f10762z;
                    if (c40064k4 != null) {
                        c40064k4.m128406a(str);
                    }
                }
            }
            int intExtra2 = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0);
            if (intExtra2 == 0) {
                c22786e.getClass();
            } else if (intExtra2 == 1) {
                c22786e.getClass();
            } else {
                if (intExtra2 != 2) {
                    return;
                }
                c22786e.getClass();
            }
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i13, BluetoothProfile bluetoothProfile) {
        AbstractC22676k.m65750j(bluetoothProfile, "bluetoothProfile");
        BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
        this.f10754F = bluetoothHeadset;
        List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
        AbstractC22676k.m65749i(connectedDevices, "bluetoothProfile.connectedDevices");
        Iterator<T> it = connectedDevices.iterator();
        while (it.hasNext()) {
            String message = "Bluetooth " + ((BluetoothDevice) it.next()).getName() + " connected";
            this.f10760x.getClass();
            AbstractC22676k.m65750j(message, "message");
        }
        if (m7707d()) {
            if (!m7706c()) {
                m7708e(C2734b.f10750e);
            }
            C40064k c40064k = this.f10762z;
            if (c40064k != null) {
                AbstractC36259c.m115695j0(c40064k, m7705b(), 2);
            }
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i13) {
        this.f10760x.getClass();
        m7708e(C2734b.f10751f);
        C40064k c40064k = this.f10762z;
        if (c40064k != null) {
            AbstractC36259c.m115695j0(c40064k, null, 3);
        }
    }
}
