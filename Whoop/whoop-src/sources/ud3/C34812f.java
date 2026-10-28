package ud3;

import c33.C3936c;
import java.io.IOException;
import ne3.AbstractC26636r;
import ne3.InterfaceC26629n0;
import p031b9.C2817b;

/* JADX INFO: renamed from: ud3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C34812f extends AbstractC26636r {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C34815g f146571w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3936c f146572x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34812f(C34815g c34815g, C3936c c3936c, InterfaceC26629n0 interfaceC26629n0) {
        super(interfaceC26629n0);
        this.f146571w = c34815g;
        this.f146572x = c3936c;
    }

    @Override // ne3.AbstractC26636r, ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C34815g c34815g = this.f146571w;
        C3936c c3936c = this.f146572x;
        synchronized (c34815g) {
            if (c3936c.f16068a) {
                return;
            }
            c3936c.f16068a = true;
            super.close();
            ((C2817b) this.f146572x.f16070c).m8006e();
        }
    }
}
