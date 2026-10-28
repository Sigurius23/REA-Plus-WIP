package androidx.lifecycle;

import java.util.ArrayDeque;

/* JADX INFO: renamed from: androidx.lifecycle.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1608n {

    /* JADX INFO: renamed from: b */
    public boolean f6282b;

    /* JADX INFO: renamed from: c */
    public boolean f6283c;

    /* JADX INFO: renamed from: a */
    public boolean f6281a = true;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f6284d = new ArrayDeque();

    /* JADX INFO: renamed from: a */
    public final void m5007a() {
        ArrayDeque arrayDeque = this.f6284d;
        if (this.f6283c) {
            return;
        }
        try {
            this.f6283c = true;
            while (!arrayDeque.isEmpty()) {
                if (!(this.f6282b || !this.f6281a)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f6283c = false;
        }
    }
}
