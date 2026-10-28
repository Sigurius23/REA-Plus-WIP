package to;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C4969a;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;
import jp.HandlerC21846d;
import p097ds.RunnableC12316s;

/* JADX INFO: renamed from: to.r0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC33996r0 extends AbstractC33975h implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: E */
    public final GoogleApiAvailability f142478E;

    /* JADX INFO: renamed from: x */
    public volatile boolean f142479x;

    /* JADX INFO: renamed from: y */
    public final AtomicReference f142480y;

    /* JADX INFO: renamed from: z */
    public final HandlerC21846d f142481z;

    public AbstractDialogInterfaceOnCancelListenerC33996r0(InterfaceC33977i interfaceC33977i, GoogleApiAvailability googleApiAvailability) {
        super(interfaceC33977i);
        this.f142480y = new AtomicReference(null);
        this.f142481z = new HandlerC21846d(Looper.getMainLooper(), 0);
        this.f142478E = googleApiAvailability;
    }

    @Override // to.AbstractC33975h
    /* JADX INFO: renamed from: c */
    public final void mo107439c(int i13, int i14, Intent intent) {
        AtomicReference atomicReference = this.f142480y;
        C33992p0 c33992p0 = (C33992p0) atomicReference.get();
        if (i13 != 1) {
            if (i13 == 2) {
                int iIsGooglePlayServicesAvailable = this.f142478E.isGooglePlayServicesAvailable(m107438a());
                if (iIsGooglePlayServicesAvailable == 0) {
                    atomicReference.set(null);
                    mo107418k();
                    return;
                } else {
                    if (c33992p0 == null) {
                        return;
                    }
                    if (c33992p0.f142471b.f20480x == 18 && iIsGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else if (i14 == -1) {
            atomicReference.set(null);
            mo107418k();
            return;
        } else if (i14 == 0) {
            if (c33992p0 != null) {
                C4969a c4969a = new C4969a(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, c33992p0.f142471b.toString());
                int i15 = c33992p0.f142470a;
                atomicReference.set(null);
                mo107417j(c4969a, i15);
                return;
            }
            return;
        }
        if (c33992p0 != null) {
            C4969a c4969a2 = c33992p0.f142471b;
            int i16 = c33992p0.f142470a;
            atomicReference.set(null);
            mo107417j(c4969a2, i16);
        }
    }

    @Override // to.AbstractC33975h
    /* JADX INFO: renamed from: d */
    public final void mo107440d(Bundle bundle) {
        if (bundle != null) {
            this.f142480y.set(bundle.getBoolean("resolving_error", false) ? new C33992p0(new C4969a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // to.AbstractC33975h
    /* JADX INFO: renamed from: g */
    public final void mo107442g(Bundle bundle) {
        C33992p0 c33992p0 = (C33992p0) this.f142480y.get();
        if (c33992p0 == null) {
            return;
        }
        C4969a c4969a = c33992p0.f142471b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c33992p0.f142470a);
        bundle.putInt("failed_status", c4969a.f20480x);
        bundle.putParcelable("failed_resolution", c4969a.f20481y);
    }

    @Override // to.AbstractC33975h
    /* JADX INFO: renamed from: h */
    public void mo107443h() {
        this.f142479x = true;
    }

    @Override // to.AbstractC33975h
    /* JADX INFO: renamed from: i */
    public void mo29700i() {
        this.f142479x = false;
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo107417j(C4969a c4969a, int i13);

    /* JADX INFO: renamed from: k */
    public abstract void mo107418k();

    /* JADX INFO: renamed from: l */
    public final void m107469l(C4969a c4969a, int i13) {
        AtomicReference atomicReference;
        C33992p0 c33992p0 = new C33992p0(c4969a, i13);
        do {
            atomicReference = this.f142480y;
            if (atomicReference.compareAndSet(null, c33992p0)) {
                this.f142481z.post(new RunnableC12316s(this, c33992p0, false, 17));
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C4969a c4969a = new C4969a(13, null);
        AtomicReference atomicReference = this.f142480y;
        C33992p0 c33992p0 = (C33992p0) atomicReference.get();
        int i13 = c33992p0 == null ? -1 : c33992p0.f142470a;
        atomicReference.set(null);
        mo107417j(c4969a, i13);
    }
}
