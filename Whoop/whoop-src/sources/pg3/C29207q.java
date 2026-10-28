package pg3;

import java.util.concurrent.Executor;
import ud3.C34832o0;

/* JADX INFO: renamed from: pg3.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C29207q implements InterfaceC29182e {

    /* JADX INFO: renamed from: w */
    public final Executor f118206w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC29182e f118207x;

    public C29207q(Executor executor, InterfaceC29182e interfaceC29182e) {
        this.f118206w = executor;
        this.f118207x = interfaceC29182e;
    }

    @Override // pg3.InterfaceC29182e
    /* JADX INFO: renamed from: F0 */
    public final boolean mo88672F0() {
        return this.f118207x.mo88672F0();
    }

    @Override // pg3.InterfaceC29182e
    /* JADX INFO: renamed from: R0 */
    public final void mo88673R0(InterfaceC29189h interfaceC29189h) {
        this.f118207x.mo88673R0(new C29205p(0, this, interfaceC29189h));
    }

    @Override // pg3.InterfaceC29182e
    public final void cancel() {
        this.f118207x.cancel();
    }

    @Override // pg3.InterfaceC29182e
    /* JADX INFO: renamed from: m */
    public final C34832o0 mo88678m() {
        return this.f118207x.mo88678m();
    }

    @Override // pg3.InterfaceC29182e
    public final InterfaceC29182e clone() {
        return new C29207q(this.f118206w, this.f118207x.clone());
    }
}
