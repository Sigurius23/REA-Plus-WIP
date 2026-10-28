package p007a6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import ne3.C26616h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a6.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0430i1 extends OutputStream {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1482w = 0;

    /* JADX INFO: renamed from: x */
    public final Object f1483x;

    public C0430i1(FileOutputStream fileOutputStream) {
        this.f1483x = fileOutputStream;
    }

    /* JADX INFO: renamed from: b */
    private final void m1115b() {
    }

    /* JADX INFO: renamed from: h */
    private final void m1116h() {
    }

    /* JADX INFO: renamed from: i */
    private final void m1117i() {
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i13 = this.f1482w;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f1482w) {
            case 0:
                ((FileOutputStream) this.f1483x).flush();
                break;
        }
    }

    public String toString() {
        switch (this.f1482w) {
            case 1:
                return ((C26616h) this.f1483x) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] b) throws IOException {
        switch (this.f1482w) {
            case 0:
                AbstractC22676k.m65750j(b, "b");
                ((FileOutputStream) this.f1483x).write(b);
                break;
            default:
                super.write(b);
                break;
        }
    }

    public C0430i1(C26616h c26616h) {
        this.f1483x = c26616h;
    }

    @Override // java.io.OutputStream
    public final void write(int i13) throws IOException {
        switch (this.f1482w) {
            case 0:
                ((FileOutputStream) this.f1483x).write(i13);
                break;
            default:
                ((C26616h) this.f1483x).m79219m1(i13);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i13, int i14) throws IOException {
        switch (this.f1482w) {
            case 0:
                AbstractC22676k.m65750j(bytes, "bytes");
                ((FileOutputStream) this.f1483x).write(bytes, i13, i14);
                break;
            default:
                AbstractC22676k.m65750j(bytes, "data");
                ((C26616h) this.f1483x).m134463write(bytes, i13, i14);
                break;
        }
    }
}
