package p117eh;

import java.io.Closeable;
import yb3.C39412p;

/* JADX INFO: renamed from: eh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C13186c implements Closeable {

    /* JADX INFO: renamed from: w */
    public final C13185b f45709w;

    /* JADX INFO: renamed from: x */
    public boolean f45710x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13188e f45711y;

    public C13186c(C13188e c13188e, C13185b c13185b) {
        this.f45711y = c13188e;
        this.f45709w = c13185b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f45710x) {
            return;
        }
        this.f45710x = true;
        C13188e c13188e = this.f45711y;
        synchronized (c13188e) {
            C13185b c13185b = this.f45709w;
            int i13 = c13185b.f45707h - 1;
            c13185b.f45707h = i13;
            if (i13 == 0 && c13185b.f45705f) {
                C39412p c39412p = C13188e.f45712Q;
                c13188e.m37084T(c13185b);
            }
        }
    }
}
