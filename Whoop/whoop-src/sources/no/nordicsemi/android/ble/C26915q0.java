package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Handler;
import java.util.Arrays;
import md3.InterfaceC25457c;
import md3.InterfaceC25458d;
import md3.InterfaceC25459e;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C26915q0 extends AbstractC26909n0 {

    /* JADX INFO: renamed from: r */
    public final byte[] f107416r;

    /* JADX INFO: renamed from: s */
    public final int f107417s;

    /* JADX INFO: renamed from: t */
    public byte[] f107418t;

    /* JADX INFO: renamed from: u */
    public int f107419u;

    /* JADX INFO: renamed from: v */
    public boolean f107420v;

    public C26915q0(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i13) {
        super(bluetoothGattCharacteristic, i13);
        this.f107419u = 0;
        this.f107416r = null;
        this.f107417s = 0;
        this.f107420v = true;
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
    public final boolean m80367o(final BluetoothDevice bluetoothDevice, byte[] bArr) {
        final int i13 = this.f107419u;
        final byte[] bArr2 = this.f107418t;
        this.f107383b.mo80334e(new Runnable(bluetoothDevice, bArr2, i13) { // from class: no.nordicsemi.android.ble.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f107411w.getClass();
            }
        });
        this.f107419u++;
        if (this.f107420v) {
            this.f107383b.mo80334e(new RunnableC26900j(2, this, bluetoothDevice));
        }
        if (this.f107417s == 2) {
            return Arrays.equals(bArr, bArr2);
        }
        return true;
    }

    public C26915q0(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i13, int i14) {
        byte[] bArr2;
        super(bluetoothGattCharacteristic, 7);
        this.f107419u = 0;
        this.f107420v = false;
        if (bArr == null || bArr.length < 0) {
            bArr2 = null;
        } else {
            int iMin = Math.min(bArr.length, i13);
            bArr2 = new byte[iMin];
            System.arraycopy(bArr, 0, bArr2, 0, iMin);
        }
        this.f107416r = bArr2;
        this.f107417s = i14;
    }
}
