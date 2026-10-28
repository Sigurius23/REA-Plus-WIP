package ne3;

import java.io.IOException;
import l83.InterfaceC23457c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.r */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC26636r implements InterfaceC26629n0 {
    private final InterfaceC26629n0 delegate;

    public AbstractC26636r(InterfaceC26629n0 delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.delegate = delegate;
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final InterfaceC26629n0 m134464deprecated_delegate() {
        return this.delegate;
    }

    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final InterfaceC26629n0 delegate() {
        return this.delegate;
    }

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        return this.delegate.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // ne3.InterfaceC26629n0
    public void write(C26616h source, long j7) {
        AbstractC22676k.m65750j(source, "source");
        this.delegate.write(source, j7);
    }
}
