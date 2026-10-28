package p647yf;

import java.io.Closeable;

/* JADX INFO: renamed from: yf.n */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC39501n extends InterfaceC39502o, Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        mo126154r(null);
    }

    /* JADX INFO: renamed from: r */
    boolean mo126154r(Throwable th3);
}
