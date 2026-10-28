package lu;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import p031b9.C2817b;

/* JADX INFO: renamed from: lu.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C24739a extends FilterOutputStream {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C2817b f96733w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24739a(C2817b c2817b, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.f96733w = c2817b;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.f96733w.f11023x = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.f96733w.f11023x = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i13) {
        try {
            ((FilterOutputStream) this).out.write(i13);
        } catch (IOException unused) {
            this.f96733w.f11023x = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i13, int i14) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i13, i14);
        } catch (IOException unused) {
            this.f96733w.f11023x = true;
        }
    }
}
