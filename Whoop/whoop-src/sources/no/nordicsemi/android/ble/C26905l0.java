package no.nordicsemi.android.ble;

import android.os.ConditionVariable;
import android.os.Looper;
import bd3.C3143v;
import md3.InterfaceC25455a;
import md3.InterfaceC25457c;
import md3.InterfaceC25459e;
import no.nordicsemi.android.ble.exception.BluetoothDisabledException;
import no.nordicsemi.android.ble.exception.DeviceDisconnectedException;
import no.nordicsemi.android.ble.exception.InvalidRequestException;
import no.nordicsemi.android.ble.exception.RequestFailedException;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.l0 */
/* JADX INFO: loaded from: classes5.dex */
public class C26905l0 extends AbstractC26903k0 {
    /* JADX INFO: renamed from: k */
    public final void m80364k() {
        ConditionVariable conditionVariable = this.f107384c;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot execute synchronous operation from the UI thread.");
        }
        InterfaceC25455a interfaceC25455a = this.f107387f;
        InterfaceC25459e interfaceC25459e = this.f107388g;
        InterfaceC25457c interfaceC25457c = this.f107389h;
        try {
            if (this.f107393l || this.f107391j) {
                throw new IllegalStateException();
            }
            conditionVariable.close();
            C3143v c3143v = new C3143v(this, 9);
            this.f107387f = null;
            mo80348a(c3143v).mo80349c(c3143v).mo80350d(c3143v).m80359b();
            conditionVariable.block();
            int i13 = c3143v.f12310x;
            if (i13 == 0) {
                this.f107387f = interfaceC25455a;
                this.f107388g = interfaceC25459e;
                this.f107389h = interfaceC25457c;
            } else {
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
            this.f107387f = interfaceC25455a;
            this.f107388g = interfaceC25459e;
            this.f107389h = interfaceC25457c;
            throw th3;
        }
    }
}
