package io.sentry.util;

import java.io.Writer;

/* JADX INFO: renamed from: io.sentry.util.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C20581c extends Writer {

    /* JADX INFO: renamed from: w */
    public long f77082w = 0;

    /* JADX INFO: renamed from: b */
    public static int m56712b(char c3) {
        if (c3 <= 127) {
            return 1;
        }
        return (c3 > 2047 && !Character.isSurrogate(c3)) ? 3 : 2;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i13, int i14) {
        for (int i15 = i13; i15 < i13 + i14; i15++) {
            this.f77082w += (long) m56712b(cArr[i15]);
        }
    }

    @Override // java.io.Writer
    public final void write(int i13) {
        this.f77082w += (long) m56712b((char) i13);
    }

    @Override // java.io.Writer
    public final void write(String str, int i13, int i14) {
        for (int i15 = i13; i15 < i13 + i14; i15++) {
            this.f77082w += (long) m56712b(str.charAt(i15));
        }
    }
}
