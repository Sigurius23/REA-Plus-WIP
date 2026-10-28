package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import md3.InterfaceC25457c;
import md3.InterfaceC25458d;
import md3.InterfaceC25459e;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C26891e0 extends AbstractC26907m0 {

    /* JADX INFO: renamed from: q */
    public final BluetoothDevice f107351q;

    /* JADX INFO: renamed from: r */
    public int f107352r;

    /* JADX INFO: renamed from: s */
    public int f107353s;

    /* JADX INFO: renamed from: t */
    public int f107354t;

    /* JADX INFO: renamed from: u */
    public int f107355u;

    /* JADX INFO: renamed from: v */
    public boolean f107356v;

    /* JADX INFO: renamed from: w */
    public final boolean f107357w;

    public C26891e0(BluetoothDevice bluetoothDevice) {
        super(2);
        this.f107353s = 0;
        this.f107354t = 0;
        this.f107355u = 0;
        this.f107356v = false;
        this.f107357w = true;
        this.f107351q = bluetoothDevice;
        this.f107352r = 1;
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
    /* JADX INFO: renamed from: l */
    public final void mo80353l() {
        if (!this.f107392k) {
            this.f107399o = true;
            this.f107393l = true;
        } else {
            if (this.f107393l) {
                return;
            }
            this.f107399o = true;
            this.f107382a.mo60720o();
        }
    }

    @Override // no.nordicsemi.android.ble.AbstractC26907m0
    /* JADX INFO: renamed from: m */
    public final AbstractC26907m0 mo80354m(Handler handler) {
        super.mo80354m(null);
        return this;
    }
}
