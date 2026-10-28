package ne3;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ne3.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C26644x implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: w */
    public final C26621j0 f105924w;

    /* JADX INFO: renamed from: x */
    public final Inflater f105925x;

    /* JADX INFO: renamed from: y */
    public int f105926y;

    /* JADX INFO: renamed from: z */
    public boolean f105927z;

    public C26644x(C26621j0 c26621j0, Inflater inflater) {
        this.f105924w = c26621j0;
        this.f105925x = inflater;
    }

    /* JADX INFO: renamed from: b */
    public final long m79286b(C26616h sink, long j7) throws IOException {
        Inflater inflater = this.f105925x;
        AbstractC22676k.m65750j(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount < 0: ").toString());
        }
        if (this.f105927z) {
            throw new IllegalStateException("closed");
        }
        if (j7 != 0) {
            try {
                C26623k0 c26623k0M79216k1 = sink.m79216k1(1);
                int iMin = (int) Math.min(j7, 8192 - c26623k0M79216k1.f105876c);
                boolean zNeedsInput = inflater.needsInput();
                C26621j0 c26621j0 = this.f105924w;
                if (zNeedsInput && !c26621j0.mo79222o()) {
                    C26623k0 c26623k0 = c26621j0.f105872x.f105865w;
                    AbstractC22676k.m65747g(c26623k0);
                    int i13 = c26623k0.f105876c;
                    int i14 = c26623k0.f105875b;
                    int i15 = i13 - i14;
                    this.f105926y = i15;
                    inflater.setInput(c26623k0.f105874a, i14, i15);
                }
                int iInflate = inflater.inflate(c26623k0M79216k1.f105874a, c26623k0M79216k1.f105876c, iMin);
                int i16 = this.f105926y;
                if (i16 != 0) {
                    int remaining = i16 - inflater.getRemaining();
                    this.f105926y -= remaining;
                    c26621j0.skip(remaining);
                }
                if (iInflate > 0) {
                    c26623k0M79216k1.f105876c += iInflate;
                    long j13 = iInflate;
                    sink.f105866x += j13;
                    return j13;
                }
                if (c26623k0M79216k1.f105875b == c26623k0M79216k1.f105876c) {
                    sink.f105865w = c26623k0M79216k1.m79243a();
                    AbstractC26625l0.m79267a(c26623k0M79216k1);
                }
            } catch (DataFormatException e5) {
                throw new IOException(e5);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f105927z) {
            return;
        }
        this.f105925x.end();
        this.f105927z = true;
        this.f105924w.close();
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) throws IOException {
        AbstractC22676k.m65750j(sink, "sink");
        do {
            long jM79286b = m79286b(sink, j7);
            if (jM79286b > 0) {
                return jM79286b;
            }
            Inflater inflater = this.f105925x;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f105924w.mo79222o());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return this.f105924w.f105871w.timeout();
    }
}
