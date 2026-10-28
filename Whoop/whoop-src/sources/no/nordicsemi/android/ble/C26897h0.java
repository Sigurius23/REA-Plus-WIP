package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import androidx.fragment.app.RunnableC1283d;
import md3.InterfaceC25456b;
import md3.InterfaceC25457c;
import md3.InterfaceC25458d;
import md3.InterfaceC25459e;
import nd3.C26591a;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.h0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26897h0 extends AbstractC26909n0 {

    /* JADX INFO: renamed from: r */
    public boolean f107367r;

    public C26897h0() {
        super(27);
        this.f107367r = false;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26903k0
    /* JADX INFO: renamed from: a */
    public final AbstractC26903k0 mo80348a(InterfaceC25459e interfaceC25459e) {
        this.f107388g = interfaceC25459e;
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26903k0
    /* JADX INFO: renamed from: c */
    public final AbstractC26903k0 mo80349c(InterfaceC25457c interfaceC25457c) {
        this.f107389h = interfaceC25457c;
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26903k0
    /* JADX INFO: renamed from: d */
    public final AbstractC26903k0 mo80350d(InterfaceC25458d interfaceC25458d) {
        this.f107390i = interfaceC25458d;
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26903k0
    /* JADX INFO: renamed from: i */
    public final AbstractC26903k0 mo80351i(Handler handler) {
        super.mo80354m(null);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26903k0
    /* JADX INFO: renamed from: j */
    public final void mo80352j(AbstractC21598x abstractC21598x) {
        m80366n(abstractC21598x);
    }

    @Override // no.nordicsemi.android.ble.AbstractC26907m0
    /* JADX INFO: renamed from: m */
    public final AbstractC26907m0 mo80354m(Handler handler) {
        super.mo80354m(null);
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m80356o() {
        return (this.f107367r || this.f107399o || this.f107393l) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public final void m80357p(BluetoothDevice bluetoothDevice, byte[] bArr) {
        InterfaceC25456b interfaceC25456b = (InterfaceC25456b) this.f107402q;
        if (interfaceC25456b == null) {
            this.f107367r = true;
            return;
        }
        this.f107367r = true;
        this.f107383b.mo80334e(new RunnableC1283d(interfaceC25456b, bluetoothDevice, new C26591a(bArr), 16));
    }

    /* JADX INFO: renamed from: q */
    public final void m80358q(InterfaceC25456b interfaceC25456b) {
        this.f107402q = interfaceC25456b;
    }
}
