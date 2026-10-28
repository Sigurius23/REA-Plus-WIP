package zd3;

import java.io.IOException;
import java.net.ProtocolException;
import ne3.AbstractC26636r;
import ne3.C26616h;
import ne3.InterfaceC26629n0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: zd3.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C40561e extends AbstractC26636r {

    /* JADX INFO: renamed from: E */
    public boolean f174671E;

    /* JADX INFO: renamed from: F */
    public boolean f174672F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C40563g f174673G;

    /* JADX INFO: renamed from: w */
    public final long f174674w;

    /* JADX INFO: renamed from: x */
    public final boolean f174675x;

    /* JADX INFO: renamed from: y */
    public boolean f174676y;

    /* JADX INFO: renamed from: z */
    public long f174677z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40561e(C40563g c40563g, InterfaceC26629n0 delegate, long j7, boolean z4) {
        super(delegate);
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f174673G = c40563g;
        this.f174674w = j7;
        this.f174675x = z4;
        this.f174671E = z4;
    }

    /* JADX INFO: renamed from: b */
    public final IOException m131532b(IOException iOException) {
        if (this.f174676y) {
            return iOException;
        }
        this.f174676y = true;
        return C40563g.m131534a(this.f174673G, this.f174677z, this.f174675x, iOException, 4);
    }

    @Override // ne3.AbstractC26636r, ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f174672F) {
            return;
        }
        this.f174672F = true;
        long j7 = this.f174674w;
        if (j7 != -1 && this.f174677z != j7) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            m131532b(null);
        } catch (IOException e5) {
            IOException iOExceptionM131532b = m131532b(e5);
            AbstractC22676k.m65747g(iOExceptionM131532b);
            throw iOExceptionM131532b;
        }
    }

    @Override // ne3.AbstractC26636r, ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e5) {
            IOException iOExceptionM131532b = m131532b(e5);
            AbstractC22676k.m65747g(iOExceptionM131532b);
            throw iOExceptionM131532b;
        }
    }

    @Override // ne3.AbstractC26636r, ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) throws IOException {
        AbstractC22676k.m65750j(source, "source");
        if (this.f174672F) {
            throw new IllegalStateException("closed");
        }
        long j13 = this.f174674w;
        if (j13 != -1 && this.f174677z + j7 > j13) {
            StringBuilder sbM125596b = AbstractC39383f.m125596b(j13, "expected ", " bytes but received ");
            sbM125596b.append(this.f174677z + j7);
            throw new ProtocolException(sbM125596b.toString());
        }
        try {
            if (this.f174671E) {
                this.f174671E = false;
                C40563g c40563g = this.f174673G;
                c40563g.f174686b.requestBodyStart(c40563g.f174685a);
            }
            super.write(source, j7);
            this.f174677z += j7;
        } catch (IOException e5) {
            IOException iOExceptionM131532b = m131532b(e5);
            AbstractC22676k.m65747g(iOExceptionM131532b);
            throw iOExceptionM131532b;
        }
    }
}
