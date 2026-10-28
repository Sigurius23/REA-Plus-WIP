package oe3;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import ne3.AbstractC26604b;
import ne3.AbstractC26625l0;
import ne3.C26616h;
import ne3.C26623k0;
import ne3.C26637r0;
import ne3.InterfaceC26629n0;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oe3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C27884d implements InterfaceC26629n0 {

    /* JADX INFO: renamed from: w */
    public final OutputStream f112434w;

    /* JADX INFO: renamed from: x */
    public final C27888h f112435x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C41113q f112436y;

    public C27884d(C41113q c41113q) {
        this.f112436y = c41113q;
        Socket socket = (Socket) c41113q.f177224x;
        this.f112434w = socket.getOutputStream();
        this.f112435x = new C27888h(socket);
    }

    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i13;
        OutputStream outputStream = this.f112434w;
        C41113q c41113q = this.f112436y;
        C27888h c27888h = this.f112435x;
        c27888h.m79170i();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) c41113q.f177225y;
                Socket socket = (Socket) c41113q.f177224x;
                AbstractC22676k.m65750j(atomicInteger, "<this>");
                while (true) {
                    int i14 = atomicInteger.get();
                    if ((i14 & 1) != 0) {
                        i13 = 0;
                        break;
                    }
                    int i15 = i14 | 1;
                    if (atomicInteger.compareAndSet(i14, i15)) {
                        i13 = i15;
                        break;
                    }
                }
                if (i13 == 0) {
                    c27888h.m79171j();
                    return;
                }
                if (i13 != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    c27888h.m79171j();
                    return;
                }
                socket.close();
                if (c27888h.m79171j()) {
                    throw c27888h.m84160l(null);
                }
            } catch (Throwable th3) {
                c27888h.m79171j();
                throw th3;
            }
        } catch (IOException e5) {
            if (!c27888h.m79171j()) {
                throw e5;
            }
            throw c27888h.m84160l(e5);
        }
    }

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() throws IOException {
        C27888h c27888h = this.f112435x;
        c27888h.m79170i();
        try {
            try {
                this.f112434w.flush();
                if (c27888h.m79171j()) {
                    throw c27888h.m84160l(null);
                }
            } catch (IOException e5) {
                if (!c27888h.m79171j()) {
                    throw e5;
                }
                throw c27888h.m84160l(e5);
            }
        } catch (Throwable th3) {
            c27888h.m79171j();
            throw th3;
        }
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        return this.f112435x;
    }

    public final String toString() {
        return "sink(" + ((Socket) this.f112436y.f177224x) + ')';
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) throws IOException {
        AbstractC22676k.m65750j(source, "source");
        AbstractC26604b.m79160e(source.f105866x, 0L, j7);
        while (j7 > 0) {
            C27888h c27888h = this.f112435x;
            c27888h.mo79276f();
            C26623k0 c26623k0 = source.f105865w;
            AbstractC22676k.m65747g(c26623k0);
            int iMin = (int) Math.min(j7, c26623k0.f105876c - c26623k0.f105875b);
            c27888h.m79170i();
            try {
                try {
                    this.f112434w.write(c26623k0.f105874a, c26623k0.f105875b, iMin);
                    if (c27888h.m79171j()) {
                        throw c27888h.m84160l(null);
                    }
                    int i13 = c26623k0.f105875b + iMin;
                    c26623k0.f105875b = i13;
                    long j13 = iMin;
                    j7 -= j13;
                    source.f105866x -= j13;
                    if (i13 == c26623k0.f105876c) {
                        source.f105865w = c26623k0.m79243a();
                        AbstractC26625l0.m79267a(c26623k0);
                    }
                } catch (IOException e5) {
                    if (!c27888h.m79171j()) {
                        throw e5;
                    }
                    throw c27888h.m84160l(e5);
                }
            } catch (Throwable th3) {
                c27888h.m79171j();
                throw th3;
            }
        }
    }
}
