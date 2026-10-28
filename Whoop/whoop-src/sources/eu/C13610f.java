package eu;

import android.bluetooth.BluetoothDevice;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import bc3.C3033m;
import com.google.android.gms.tasks.Task;
import hc3.C17191x;
import j43.C21317a;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;
import l83.C23454a0;
import md3.InterfaceC25457c;
import md3.InterfaceC25458d;
import md3.InterfaceC25459e;
import no.nordicsemi.android.ble.AbstractC26907m0;
import no.nordicsemi.android.ble.exception.BluetoothDisabledException;
import no.nordicsemi.android.ble.exception.DeviceDisconnectedException;
import no.nordicsemi.android.ble.exception.InvalidRequestException;
import no.nordicsemi.android.ble.exception.RequestFailedException;
import p073cq.InterfaceC11035d;
import p320m5.C25059c;
import p320m5.C25071o;
import p320m5.InterfaceC25063g;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34850x0;
import ud3.InterfaceC34821j;
import ud3.InterfaceC34823k;
import vd3.C35915a;

/* JADX INFO: renamed from: eu.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C13610f implements InterfaceC25063g, InterfaceC11035d, InterfaceC25458d, InterfaceC25457c, InterfaceC25459e, InterfaceC34823k {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48173w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3033m f48174x;

    public /* synthetic */ C13610f(C3033m c3033m, int i13) {
        this.f48173w = i13;
        this.f48174x = c3033m;
    }

    @Override // p320m5.InterfaceC25063g
    /* JADX INFO: renamed from: a */
    public void mo38428a(Object obj) {
        switch (this.f48173w) {
            case 1:
                CreateCredentialException e5 = (CreateCredentialException) obj;
                AbstractC22676k.m65750j(e5, "e");
                C3033m c3033m = this.f48174x;
                if (c3033m.isActive()) {
                    c3033m.resumeWith(AbstractC34132o.m107888l(e5));
                }
                break;
            default:
                GetCredentialException e13 = (GetCredentialException) obj;
                AbstractC22676k.m65750j(e13, "e");
                C3033m c3033m2 = this.f48174x;
                if (c3033m2.isActive()) {
                    c3033m2.resumeWith(AbstractC34132o.m107888l(e13));
                }
                break;
        }
    }

    @Override // md3.InterfaceC25458d
    /* JADX INFO: renamed from: b */
    public void mo9033b() {
        this.f48174x.resumeWith(AbstractC34132o.m107888l(new InvalidRequestException()));
    }

    @Override // md3.InterfaceC25457c
    /* JADX INFO: renamed from: c */
    public void mo9034c(BluetoothDevice bluetoothDevice, int i13) {
        Throwable bluetoothDisabledException;
        AbstractC22676k.m65750j(bluetoothDevice, "<unused var>");
        if (i13 == -100) {
            bluetoothDisabledException = new BluetoothDisabledException();
        } else if (i13 != -7) {
            bluetoothDisabledException = i13 != -1 ? new RequestFailedException(i13) : new DeviceDisconnectedException();
        } else {
            bluetoothDisabledException = new CancellationException("Request cancelled.");
        }
        C3033m c3033m = this.f48174x;
        if (c3033m.isActive()) {
            c3033m.resumeWith(AbstractC34132o.m107888l(bluetoothDisabledException));
        }
    }

    @Override // md3.InterfaceC25459e
    /* JADX INFO: renamed from: d */
    public void mo9035d(BluetoothDevice it) {
        AbstractC22676k.m65750j(it, "it");
        this.f48174x.resumeWith(C23454a0.f92919a);
    }

    @Override // ud3.InterfaceC34823k
    public void onFailure(InterfaceC34821j interfaceC34821j, IOException iOException) throws DispatchException {
        switch (this.f48173w) {
            case 8:
                C3033m c3033m = this.f48174x;
                C17191x c17191xM8760F = c3033m.m8760F(iOException);
                if (c17191xM8760F != null) {
                    c3033m.mo8746n(c17191xM8760F);
                }
                break;
            default:
                this.f48174x.resumeWith(AbstractC34132o.m107888l(iOException));
                break;
        }
    }

    @Override // ud3.InterfaceC34823k
    public void onResponse(InterfaceC34821j interfaceC34821j, C34850x0 c34850x0) throws DispatchException {
        switch (this.f48173w) {
            case 8:
                this.f48174x.mo8744e(c34850x0, new C21317a(interfaceC34821j, 12));
                break;
            default:
                this.f48174x.mo8745g(c34850x0, C35915a.f152974w);
                break;
        }
    }

    @Override // p320m5.InterfaceC25063g
    public void onResult(Object obj) {
        switch (this.f48173w) {
            case 1:
                C25059c result = (C25059c) obj;
                AbstractC22676k.m65750j(result, "result");
                C3033m c3033m = this.f48174x;
                if (c3033m.isActive()) {
                    c3033m.resumeWith(result);
                }
                break;
            default:
                C25071o result2 = (C25071o) obj;
                AbstractC22676k.m65750j(result2, "result");
                C3033m c3033m2 = this.f48174x;
                if (c3033m2.isActive()) {
                    c3033m2.resumeWith(result2);
                }
                break;
        }
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public void mo944q(Task p13) {
        switch (this.f48173w) {
            case 3:
                Exception exception = p13.getException();
                C3033m c3033m = this.f48174x;
                if (exception != null) {
                    c3033m.resumeWith(AbstractC34132o.m107888l(exception));
                } else if (!p13.isCanceled()) {
                    c3033m.resumeWith(p13.getResult());
                } else {
                    c3033m.cancel(null);
                }
                break;
            case 7:
                AbstractC22676k.m65750j(p13, "p0");
                this.f48174x.resumeWith(p13);
                break;
            default:
                AbstractC22676k.m65750j(p13, "p0");
                this.f48174x.resumeWith(p13);
                break;
        }
    }

    public C13610f(C3033m c3033m, AbstractC26907m0 abstractC26907m0) {
        this.f48173w = 4;
        this.f48174x = c3033m;
    }

    public C13610f(AbstractC26907m0 abstractC26907m0, C3033m c3033m) {
        this.f48173w = 5;
        this.f48174x = c3033m;
    }
}
