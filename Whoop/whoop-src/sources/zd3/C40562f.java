package zd3;

import java.io.IOException;
import java.net.ProtocolException;
import ne3.AbstractC26638s;
import ne3.C26616h;
import ne3.InterfaceC26633p0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: zd3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C40562f extends AbstractC26638s {

    /* JADX INFO: renamed from: E */
    public boolean f174678E;

    /* JADX INFO: renamed from: F */
    public boolean f174679F;

    /* JADX INFO: renamed from: G */
    public boolean f174680G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C40563g f174681H;

    /* JADX INFO: renamed from: x */
    public final long f174682x;

    /* JADX INFO: renamed from: y */
    public final boolean f174683y;

    /* JADX INFO: renamed from: z */
    public long f174684z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40562f(C40563g c40563g, InterfaceC26633p0 delegate, long j7, boolean z4) {
        super(delegate);
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f174681H = c40563g;
        this.f174682x = j7;
        this.f174683y = z4;
        this.f174678E = true;
        if (j7 == 0) {
            m131533b(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final IOException m131533b(IOException iOException) {
        if (this.f174679F) {
            return iOException;
        }
        this.f174679F = true;
        C40563g c40563g = this.f174681H;
        if (iOException == null && this.f174678E) {
            this.f174678E = false;
            c40563g.f174686b.responseBodyStart(c40563g.f174685a);
        }
        return C40563g.m131534a(c40563g, this.f174684z, this.f174683y, iOException, 8);
    }

    @Override // ne3.AbstractC26638s, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f174680G) {
            return;
        }
        this.f174680G = true;
        try {
            super.close();
            m131533b(null);
        } catch (IOException e5) {
            IOException iOExceptionM131533b = m131533b(e5);
            AbstractC22676k.m65747g(iOExceptionM131533b);
            throw iOExceptionM131533b;
        }
    }

    @Override // ne3.AbstractC26638s, ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) throws IOException {
        AbstractC22676k.m65750j(sink, "sink");
        if (this.f174680G) {
            throw new IllegalStateException("closed");
        }
        try {
            long jMo9164h1 = this.f105907w.mo9164h1(sink, j7);
            boolean z4 = this.f174678E;
            C40563g c40563g = this.f174681H;
            if (z4) {
                this.f174678E = false;
                c40563g.f174686b.responseBodyStart(c40563g.f174685a);
            }
            if (jMo9164h1 == -1) {
                m131533b(null);
                return -1L;
            }
            long j13 = this.f174684z + jMo9164h1;
            long j14 = this.f174682x;
            if (j14 == -1 || j13 <= j14) {
                this.f174684z = j13;
                if (c40563g.f174688d.mo1926d()) {
                    m131533b(null);
                }
                return jMo9164h1;
            }
            throw new ProtocolException("expected " + j14 + " bytes but received " + j13);
        } catch (IOException e5) {
            IOException iOExceptionM131533b = m131533b(e5);
            AbstractC22676k.m65747g(iOExceptionM131533b);
            throw iOExceptionM131533b;
        }
    }
}
