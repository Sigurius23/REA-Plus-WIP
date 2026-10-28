package p679zf;

import java.io.IOException;
import ne3.C26616h;
import ne3.C26637r0;
import ne3.InterfaceC26629n0;
import p647yf.C39498k;
import p647yf.InterfaceC39507t;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zf.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C40606g implements InterfaceC26629n0 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC39507t f174969w;

    public C40606g(InterfaceC39507t delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f174969w = delegate;
    }

    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f174969w.close();
    }

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() {
        this.f174969w.flush();
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        return C26637r0.f105903d;
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        this.f174969w.mo126145Y(new C39498k(source), j7);
    }
}
