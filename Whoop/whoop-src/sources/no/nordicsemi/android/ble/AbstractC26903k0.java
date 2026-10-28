package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.ConditionVariable;
import android.os.Handler;
import android.util.Log;
import androidx.profileinstaller.RunnableC1650a;
import md3.InterfaceC25455a;
import md3.InterfaceC25457c;
import md3.InterfaceC25458d;
import md3.InterfaceC25459e;
import p249jc.AbstractC21598x;
import p619xl.C38445a;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.k0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26903k0 {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f107381m = 0;

    /* JADX INFO: renamed from: a */
    public AbstractC21598x f107382a;

    /* JADX INFO: renamed from: b */
    public InterfaceC26889d0 f107383b;

    /* JADX INFO: renamed from: c */
    public final ConditionVariable f107384c;

    /* JADX INFO: renamed from: d */
    public final int f107385d;

    /* JADX INFO: renamed from: e */
    public final BluetoothGattCharacteristic f107386e;

    /* JADX INFO: renamed from: f */
    public InterfaceC25455a f107387f;

    /* JADX INFO: renamed from: g */
    public InterfaceC25459e f107388g;

    /* JADX INFO: renamed from: h */
    public InterfaceC25457c f107389h;

    /* JADX INFO: renamed from: i */
    public InterfaceC25458d f107390i;

    /* JADX INFO: renamed from: j */
    public boolean f107391j;

    /* JADX INFO: renamed from: k */
    public boolean f107392k;

    /* JADX INFO: renamed from: l */
    public boolean f107393l;

    public AbstractC26903k0(int i13) {
        this.f107385d = i13;
        this.f107386e = null;
        this.f107384c = new ConditionVariable(true);
    }

    /* JADX INFO: renamed from: a */
    public AbstractC26903k0 mo80348a(InterfaceC25459e interfaceC25459e) {
        this.f107388g = interfaceC25459e;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m80359b() {
        this.f107382a.mo60716F(this);
    }

    /* JADX INFO: renamed from: c */
    public AbstractC26903k0 mo80349c(InterfaceC25457c interfaceC25457c) {
        this.f107389h = interfaceC25457c;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC26903k0 mo80350d(InterfaceC25458d interfaceC25458d) {
        this.f107390i = interfaceC25458d;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public void mo80360e(BluetoothDevice bluetoothDevice, int i13) {
        if (this.f107393l) {
            return;
        }
        this.f107393l = true;
        this.f107383b.mo80334e(new RunnableC1650a(this, bluetoothDevice, i13, 4));
    }

    /* JADX INFO: renamed from: f */
    public void mo80361f() {
        if (this.f107393l) {
            return;
        }
        this.f107393l = true;
        this.f107383b.mo80334e(new Runnable() { // from class: no.nordicsemi.android.ble.j0
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC25458d interfaceC25458d = this.f107376w.f107390i;
                if (interfaceC25458d != null) {
                    try {
                        interfaceC25458d.mo9033b();
                    } catch (Throwable th3) {
                        Log.e("k0", "Exception in Invalid Request callback", th3);
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public void mo80362g(BluetoothDevice bluetoothDevice) {
        if (this.f107392k) {
            return;
        }
        this.f107392k = true;
        this.f107383b.mo80334e(new RunnableC26899i0(this, bluetoothDevice, 1));
    }

    /* JADX INFO: renamed from: h */
    public boolean mo80363h(BluetoothDevice bluetoothDevice) {
        if (this.f107393l) {
            return false;
        }
        this.f107393l = true;
        this.f107383b.mo80334e(new RunnableC26899i0(this, bluetoothDevice, 0));
        return true;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC26903k0 mo80351i(Handler handler) {
        this.f107383b = new C38445a(this, handler);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public void mo80352j(AbstractC21598x abstractC21598x) {
        this.f107382a = abstractC21598x;
        if (this.f107383b == null) {
            this.f107383b = abstractC21598x;
        }
    }

    public AbstractC26903k0(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i13) {
        this.f107385d = i13;
        this.f107386e = bluetoothGattCharacteristic;
        this.f107384c = new ConditionVariable(true);
    }
}
