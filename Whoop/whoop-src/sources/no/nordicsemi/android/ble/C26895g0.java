package no.nordicsemi.android.ble;

import android.os.Handler;
import io.sentry.android.replay.C20214m;
import md3.InterfaceC25457c;
import md3.InterfaceC25458d;
import md3.InterfaceC25459e;
import p249jc.AbstractC21598x;

/* JADX INFO: renamed from: no.nordicsemi.android.ble.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C26895g0 extends C26905l0 {

    /* JADX INFO: renamed from: n */
    public C20214m f107362n;

    /* JADX INFO: renamed from: o */
    public final int f107363o;

    public C26895g0(int i13) {
        super(31);
        i13 = i13 < 23 ? 23 : i13;
        this.f107363o = i13 > 517 ? 517 : i13;
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
        super.mo80351i(null);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final void m80355l(AbstractC21598x abstractC21598x) {
        super.mo80352j(abstractC21598x);
    }
}
