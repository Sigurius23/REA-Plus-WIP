package oe3;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import ne3.AbstractC26625l0;
import ne3.C26616h;
import ne3.C26623k0;
import ne3.C26637r0;
import ne3.InterfaceC26633p0;
import p088dc.AbstractC11895b;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oe3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C27885e implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: w */
    public final InputStream f112437w;

    /* JADX INFO: renamed from: x */
    public final C27888h f112438x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C41113q f112439y;

    public C27885e(C41113q c41113q) {
        this.f112439y = c41113q;
        Socket socket = (Socket) c41113q.f177224x;
        this.f112437w = socket.getInputStream();
        this.f112438x = new C27888h(socket);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i13;
        C41113q c41113q = this.f112439y;
        C27888h c27888h = this.f112438x;
        c27888h.m79170i();
        try {
            try {
                AtomicInteger atomicInteger = (AtomicInteger) c41113q.f177225y;
                Socket socket = (Socket) c41113q.f177224x;
                AbstractC22676k.m65750j(atomicInteger, "<this>");
                while (true) {
                    int i14 = atomicInteger.get();
                    if ((i14 & 2) != 0) {
                        i13 = 0;
                        break;
                    }
                    int i15 = i14 | 2;
                    if (atomicInteger.compareAndSet(i14, i15)) {
                        i13 = i15;
                        break;
                    }
                }
                if (i13 == 0) {
                    c27888h.m79171j();
                    return;
                }
                if (i13 == 3) {
                    socket.close();
                } else if (socket.isClosed() || socket.isInputShutdown()) {
                    c27888h.m79171j();
                    return;
                } else {
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.f112437w.close();
                    }
                }
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

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) throws IOException {
        AbstractC22676k.m65750j(sink, "sink");
        if (j7 == 0) {
            return 0L;
        }
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount < 0: ").toString());
        }
        C27888h c27888h = this.f112438x;
        c27888h.mo79276f();
        C26623k0 c26623k0M79216k1 = sink.m79216k1(1);
        int iMin = (int) Math.min(j7, 8192 - c26623k0M79216k1.f105876c);
        try {
            c27888h.m79170i();
            try {
                try {
                    int i13 = this.f112437w.read(c26623k0M79216k1.f105874a, c26623k0M79216k1.f105876c, iMin);
                    if (c27888h.m79171j()) {
                        throw c27888h.m84160l(null);
                    }
                    if (i13 != -1) {
                        c26623k0M79216k1.f105876c += i13;
                        long j13 = i13;
                        sink.f105866x += j13;
                        return j13;
                    }
                    if (c26623k0M79216k1.f105875b != c26623k0M79216k1.f105876c) {
                        return -1L;
                    }
                    sink.f105865w = c26623k0M79216k1.m79243a();
                    AbstractC26625l0.m79267a(c26623k0M79216k1);
                    return -1L;
                } catch (IOException e5) {
                    if (c27888h.m79171j()) {
                        throw c27888h.m84160l(e5);
                    }
                    throw e5;
                }
            } catch (Throwable th3) {
                c27888h.m79171j();
                throw th3;
            }
        } catch (AssertionError e13) {
            if (AbstractC27891k.m84162b(e13)) {
                throw new IOException(e13);
            }
            throw e13;
        }
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return this.f112438x;
    }

    public final String toString() {
        return "source(" + ((Socket) this.f112439y.f177224x) + ')';
    }
}
