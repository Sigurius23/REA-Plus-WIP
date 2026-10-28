package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: renamed from: androidx.fragment.app.m2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1322m2 extends Writer {

    /* JADX INFO: renamed from: x */
    public final StringBuilder f5679x = new StringBuilder(128);

    /* JADX INFO: renamed from: w */
    public final String f5678w = "FragmentManager";

    /* JADX INFO: renamed from: b */
    public final void m4128b() {
        StringBuilder sb4 = this.f5679x;
        if (sb4.length() > 0) {
            Log.d(this.f5678w, sb4.toString());
            sb4.delete(0, sb4.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m4128b();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m4128b();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i13, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            char c3 = cArr[i13 + i15];
            if (c3 == '\n') {
                m4128b();
            } else {
                this.f5679x.append(c3);
            }
        }
    }
}
