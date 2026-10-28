package p117eh;

import java.io.Closeable;

/* JADX INFO: renamed from: eh.g */
/* JADX INFO: loaded from: classes.dex */
public final class C13190g implements Closeable {

    /* JADX INFO: renamed from: w */
    public final C13186c f45731w;

    public C13190g(C13186c c13186c) {
        this.f45731w = c13186c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f45731w.close();
    }
}
