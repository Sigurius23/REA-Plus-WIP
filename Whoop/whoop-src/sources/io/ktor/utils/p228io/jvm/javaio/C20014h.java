package io.ktor.utils.p228io.jvm.javaio;

import bc3.C3031l1;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3056s0;
import io.ktor.utils.p228io.C20020m;
import io.ktor.utils.p228io.InterfaceC20024q;
import java.io.InputStream;
import java.util.concurrent.CancellationException;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C20014h extends InputStream {

    /* JADX INFO: renamed from: w */
    public final InterfaceC20024q f75096w;

    /* JADX INFO: renamed from: x */
    public final C3031l1 f75097x;

    /* JADX INFO: renamed from: y */
    public final C20013g f75098y;

    /* JADX INFO: renamed from: z */
    public byte[] f75099z;

    public C20014h(InterfaceC3027k1 interfaceC3027k1, InterfaceC20024q channel) {
        AbstractC22676k.m65750j(channel, "channel");
        this.f75096w = channel;
        this.f75097x = new C3031l1(interfaceC3027k1);
        this.f75098y = new C20013g(interfaceC3027k1, this);
    }

    @Override // java.io.InputStream
    public final int available() {
        return ((C20020m) this.f75096w).m55848l();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            super.close();
            InterfaceC20024q interfaceC20024q = this.f75096w;
            AbstractC22676k.m65750j(interfaceC20024q, "<this>");
            ((C20020m) interfaceC20024q).m55845i(new CancellationException("Channel has been cancelled"));
            if (!this.f75097x.isCompleted()) {
                this.f75097x.cancel((CancellationException) null);
            }
            C20013g c20013g = this.f75098y;
            InterfaceC3056s0 interfaceC3056s0 = c20013g.f75083c;
            if (interfaceC3056s0 != null) {
                interfaceC3056s0.dispose();
            }
            c20013g.f75082b.resumeWith(AbstractC34132o.m107888l(new CancellationException("Stream closed")));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
        try {
            byte[] bArr = this.f75099z;
            if (bArr == null) {
                bArr = new byte[1];
                this.f75099z = bArr;
            }
            int iM55814b = this.f75098y.m55814b(bArr, 0, 1);
            if (iM55814b == -1) {
                return -1;
            }
            if (iM55814b == 1) {
                return bArr[0] & 255;
            }
            throw new IllegalStateException(("Expected a single byte or EOF. Got " + iM55814b + " bytes.").toString());
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i13, int i14) {
        C20013g c20013g;
        c20013g = this.f75098y;
        AbstractC22676k.m65747g(bArr);
        return c20013g.m55814b(bArr, i13, i14);
    }
}
