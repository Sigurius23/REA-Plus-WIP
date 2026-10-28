package ne3;

import java.io.InputStream;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C26614g extends InputStream {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C26616h f105863w;

    public C26614g(C26616h c26616h) {
        this.f105863w = c26616h;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.f105863w.f105866x, Integer.MAX_VALUE);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read() {
        C26616h c26616h = this.f105863w;
        if (c26616h.f105866x > 0) {
            return c26616h.readByte() & 255;
        }
        return -1;
    }

    public final String toString() {
        return this.f105863w + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i13, int i14) {
        AbstractC22676k.m65750j(sink, "sink");
        return this.f105863w.read(sink, i13, i14);
    }
}
