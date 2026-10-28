package p679zf;

import ne3.InterfaceC26629n0;
import p647yf.C39498k;
import p647yf.InterfaceC39507t;

/* JADX INFO: renamed from: zf.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C40604e implements InterfaceC39507t {

    /* JADX INFO: renamed from: w */
    public final InterfaceC26629n0 f174967w;

    public C40604e(InterfaceC26629n0 interfaceC26629n0) {
        this.f174967w = interfaceC26629n0;
    }

    @Override // p647yf.InterfaceC39507t
    /* JADX INFO: renamed from: Y */
    public final void mo126145Y(C39498k c39498k, long j7) {
        this.f174967w.write(c39498k.f169914w, j7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f174967w.close();
    }

    @Override // p647yf.InterfaceC39507t
    public final void flush() {
        this.f174967w.flush();
    }
}
