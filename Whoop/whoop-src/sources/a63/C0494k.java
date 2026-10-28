package a63;

import io.ktor.utils.p228io.jvm.javaio.C20014h;
import j93.AbstractC21478l0;
import java.io.IOException;
import java.io.InputStream;
import p715kotlin.jvm.internal.AbstractC22676k;
import r63.AbstractC30993e;
import w53.C36845b;

/* JADX INFO: renamed from: a63.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C0494k extends InputStream {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C20014h f1666w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC30993e f1667x;

    public C0494k(C20014h c20014h, AbstractC30993e abstractC30993e) {
        this.f1666w = c20014h;
        this.f1667x = abstractC30993e;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1666w.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f1666w.close();
        AbstractC21478l0.m60446q(((C36845b) this.f1667x.f127968w).m118140d());
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f1666w.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] b, int i13, int i14) {
        AbstractC22676k.m65750j(b, "b");
        return this.f1666w.read(b, i13, i14);
    }
}
