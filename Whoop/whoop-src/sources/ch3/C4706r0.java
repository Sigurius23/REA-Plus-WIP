package ch3;

import bh3.InterfaceC3254a;
import com.google.crypto.tink.internal.C5101l0;
import xg3.InterfaceC38282i;

/* JADX INFO: renamed from: ch3.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C4706r0 implements InterfaceC3254a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f19266w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C5101l0 f19267x;

    public C4706r0(C5101l0 c5101l0, long j7) {
        this.f19267x = c5101l0;
        this.f19266w = j7;
    }

    @Override // bh3.InterfaceC3254a
    public final void call() {
        ((InterfaceC38282i) this.f19267x.f21443x).request(this.f19266w);
    }
}
