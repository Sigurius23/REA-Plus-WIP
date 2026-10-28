package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import bd3.C3143v;
import java.util.concurrent.CancellationException;
import md3.InterfaceC25457c;
import md3.InterfaceC25459e;
import no.nordicsemi.android.ble.exception.BluetoothDisabledException;
import no.nordicsemi.android.ble.exception.DeviceDisconnectedException;
import no.nordicsemi.android.ble.exception.InvalidRequestException;
import no.nordicsemi.android.ble.exception.RequestFailedException;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.m0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26907m0 extends AbstractC26903k0 {

    /* JADX INFO: renamed from: n */
    public RunnableC26900j f107398n;

    /* JADX INFO: renamed from: o */
    public boolean f107399o;

    /* JADX INFO: renamed from: p */
    public long f107400p;

    @Override // no.nordicsemi.android.ble.AbstractC26903k0
    /* JADX INFO: renamed from: e */
    public void mo80360e(BluetoothDevice bluetoothDevice, int i13) {
        RunnableC26900j runnableC26900j = this.f107398n;
        if (runnableC26900j != null) {
            this.f107383b.mo80329a(runnableC26900j);
            this.f107398n = null;
        }
        super.mo80360e(bluetoothDevice, i13);
    }

    @Override // no.nordicsemi.android.ble.AbstractC26903k0
    /* JADX INFO: renamed from: f */
    public final void mo80361f() {
        RunnableC26900j runnableC26900j = this.f107398n;
        if (runnableC26900j != null) {
            this.f107383b.mo80329a(runnableC26900j);
            this.f107398n = null;
        }
        super.mo80361f();
    }

    @Override // no.nordicsemi.android.ble.AbstractC26903k0
    /* JADX INFO: renamed from: g */
    public final void mo80362g(BluetoothDevice bluetoothDevice) {
        long j7 = this.f107400p;
        if (j7 > 0) {
            RunnableC26900j runnableC26900j = new RunnableC26900j(1, this, bluetoothDevice);
            this.f107398n = runnableC26900j;
            this.f107383b.mo80337g(runnableC26900j, j7);
        }
        super.mo80362g(bluetoothDevice);
    }

    @Override // no.nordicsemi.android.ble.AbstractC26903k0
    /* JADX INFO: renamed from: h */
    public final boolean mo80363h(BluetoothDevice bluetoothDevice) {
        RunnableC26900j runnableC26900j = this.f107398n;
        if (runnableC26900j != null) {
            this.f107383b.mo80329a(runnableC26900j);
            this.f107398n = null;
        }
        return super.mo80363h(bluetoothDevice);
    }

    /* JADX INFO: renamed from: k */
    public final void m80365k() {
        ConditionVariable conditionVariable = this.f107384c;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot execute synchronous operation from the UI thread.");
        }
        if (this.f107399o) {
            throw new CancellationException();
        }
        if (this.f107393l || this.f107391j) {
            throw new IllegalStateException();
        }
        InterfaceC25459e interfaceC25459e = this.f107388g;
        InterfaceC25457c interfaceC25457c = this.f107389h;
        try {
            conditionVariable.close();
            C3143v c3143v = new C3143v(this, 9);
            mo80348a(c3143v).mo80349c(c3143v).mo80350d(c3143v).m80359b();
            if (!conditionVariable.block(this.f107400p)) {
                throw new InterruptedException();
            }
            int i13 = c3143v.f12310x;
            if (i13 == 0) {
                this.f107388g = interfaceC25459e;
                this.f107389h = interfaceC25457c;
            } else {
                if (i13 == -7) {
                    throw new CancellationException();
                }
                if (i13 == -1) {
                    throw new DeviceDisconnectedException();
                }
                if (i13 == -100) {
                    throw new BluetoothDisabledException();
                }
                if (i13 != -1000000) {
                    throw new RequestFailedException(c3143v.f12310x);
                }
                throw new InvalidRequestException();
            }
        } catch (Throwable th3) {
            this.f107388g = interfaceC25459e;
            this.f107389h = interfaceC25457c;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo80353l() {
        if (!this.f107392k) {
            this.f107399o = true;
            this.f107393l = true;
        } else {
            if (this.f107393l) {
                return;
            }
            this.f107399o = true;
            this.f107382a.mo60719n();
        }
    }

    /* JADX INFO: renamed from: m */
    public AbstractC26907m0 mo80354m(Handler handler) {
        super.mo80351i(handler);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m80366n(AbstractC21598x abstractC21598x) {
        super.mo80352j(abstractC21598x);
    }
}
