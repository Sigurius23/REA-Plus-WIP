package p33;

import android.bluetooth.BluetoothDevice;
import l83.C23454a0;
import md3.InterfaceC25457c;
import md3.InterfaceC25458d;
import md3.InterfaceC25459e;
import n23.C26198a;
import n23.C26203f;
import n23.C26204g;
import no.nordicsemi.android.ble.AbstractC26903k0;
import no.nordicsemi.android.ble.exception.BluetoothDisabledException;
import no.nordicsemi.android.ble.exception.DeviceDisconnectedException;
import no.nordicsemi.android.ble.exception.InvalidRequestException;
import no.nordicsemi.android.ble.exception.RequestFailedException;
import org.webrtc.AddIceObserver;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30065l;

/* JADX INFO: renamed from: p33.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C28809b implements AddIceObserver, SdpObserver, InterfaceC25458d, InterfaceC25457c, InterfaceC25459e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f116632w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30065l f116633x;

    public C28809b(AbstractC26903k0 abstractC26903k0, C30065l c30065l) {
        this.f116632w = 4;
        this.f116633x = c30065l;
    }

    /* JADX INFO: renamed from: a */
    private final void m87675a(String str) {
    }

    /* JADX INFO: renamed from: e */
    private final void m87676e(SessionDescription sessionDescription) {
    }

    /* JADX INFO: renamed from: f */
    private final void m87677f(String str) {
    }

    /* JADX INFO: renamed from: g */
    private final void m87678g() {
    }

    @Override // md3.InterfaceC25458d
    /* JADX INFO: renamed from: b */
    public void mo9033b() {
        this.f116633x.resumeWith(AbstractC34132o.m107888l(new InvalidRequestException()));
    }

    @Override // md3.InterfaceC25457c
    /* JADX INFO: renamed from: c */
    public void mo9034c(BluetoothDevice bluetoothDevice, int i13) {
        Throwable bluetoothDisabledException;
        AbstractC22676k.m65750j(bluetoothDevice, "<unused var>");
        if (i13 != -100) {
            bluetoothDisabledException = i13 != -1 ? new RequestFailedException(i13) : new DeviceDisconnectedException();
        } else {
            bluetoothDisabledException = new BluetoothDisabledException();
        }
        this.f116633x.resumeWith(AbstractC34132o.m107888l(bluetoothDisabledException));
    }

    @Override // md3.InterfaceC25459e
    /* JADX INFO: renamed from: d */
    public void mo9035d(BluetoothDevice it) {
        AbstractC22676k.m65750j(it, "it");
        this.f116633x.resumeWith(C23454a0.f92919a);
    }

    @Override // org.webrtc.AddIceObserver
    public void onAddFailure(String str) {
        if (str == null) {
            str = "";
        }
        this.f116633x.resumeWith(new C26203f(new C26198a(str)));
    }

    @Override // org.webrtc.AddIceObserver
    public void onAddSuccess() {
        this.f116633x.resumeWith(new C26204g(C23454a0.f92919a));
    }

    @Override // org.webrtc.SdpObserver
    public void onCreateFailure(String str) {
        switch (this.f116632w) {
            case 1:
                if (str == null) {
                    str = "Couldn't create a SDP message.";
                }
                this.f116633x.resumeWith(new C26203f(new C26198a(str)));
                break;
        }
    }

    @Override // org.webrtc.SdpObserver
    public void onCreateSuccess(SessionDescription sessionDescription) {
        switch (this.f116632w) {
            case 1:
                if (sessionDescription != null) {
                    this.f116633x.resumeWith(new C26204g(sessionDescription));
                }
                break;
        }
    }

    @Override // org.webrtc.SdpObserver
    public void onSetFailure(String str) {
        switch (this.f116632w) {
            case 1:
                break;
            default:
                if (str == null) {
                    str = "Couldn't create a SDP message.";
                }
                this.f116633x.resumeWith(new C26203f(new C26198a(str)));
                break;
        }
    }

    @Override // org.webrtc.SdpObserver
    public void onSetSuccess() {
        switch (this.f116632w) {
            case 1:
                break;
            default:
                this.f116633x.resumeWith(new C26204g(C23454a0.f92919a));
                break;
        }
    }

    public /* synthetic */ C28809b(C30065l c30065l, int i13) {
        this.f116632w = i13;
        this.f116633x = c30065l;
    }

    public C28809b(C30065l c30065l, AbstractC26903k0 abstractC26903k0) {
        this.f116632w = 3;
        this.f116633x = c30065l;
    }
}
