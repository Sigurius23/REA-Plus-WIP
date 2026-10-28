package ne3;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: ne3.n0 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC26629n0 extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    C26637r0 timeout();

    void write(C26616h c26616h, long j7);
}
