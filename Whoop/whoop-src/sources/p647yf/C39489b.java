package p647yf;

import c13.AbstractC3855a;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import ne3.C26621j0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yf.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C39489b implements InterfaceC39500m {

    /* JADX INFO: renamed from: w */
    public final C26621j0 f169885w;

    public C39489b(C26621j0 c26621j0) {
        this.f169885w = c26621j0;
    }

    @Override // p647yf.InterfaceC39508u
    /* JADX INFO: renamed from: c0 */
    public final long mo119145c0(C39498k sink, long j7) throws IOException {
        AbstractC22676k.m65750j(sink, "sink");
        try {
            return this.f169885w.mo9164h1(sink.f169914w, j7);
        } catch (EOFException e5) {
            throw new aws.smithy.kotlin.runtime.p022io.EOFException("Okio operation failed: " + e5.getMessage(), e5);
        } catch (IOException e13) {
            throw new IOException(AbstractC3855a.m11824h(e13, new StringBuilder("Okio operation failed: ")), e13);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        try {
            this.f169885w.close();
        } catch (EOFException e5) {
            throw new aws.smithy.kotlin.runtime.p022io.EOFException("Okio operation failed: " + e5.getMessage(), e5);
        } catch (IOException e13) {
            throw new IOException(AbstractC3855a.m11824h(e13, new StringBuilder("Okio operation failed: ")), e13);
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f169885w.isOpen();
    }

    @Override // p647yf.InterfaceC39500m
    /* JADX INFO: renamed from: n */
    public final byte[] mo126149n() throws IOException {
        try {
            return this.f169885w.mo79220n();
        } catch (EOFException e5) {
            throw new aws.smithy.kotlin.runtime.p022io.EOFException("Okio operation failed: " + e5.getMessage(), e5);
        } catch (IOException e13) {
            throw new IOException(AbstractC3855a.m11824h(e13, new StringBuilder("Okio operation failed: ")), e13);
        }
    }

    @Override // p647yf.InterfaceC39500m
    /* JADX INFO: renamed from: o */
    public final boolean mo126150o() throws IOException {
        try {
            return this.f169885w.mo79222o();
        } catch (EOFException e5) {
            throw new aws.smithy.kotlin.runtime.p022io.EOFException("Okio operation failed: " + e5.getMessage(), e5);
        } catch (IOException e13) {
            throw new IOException(AbstractC3855a.m11824h(e13, new StringBuilder("Okio operation failed: ")), e13);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer dst) {
        AbstractC22676k.m65750j(dst, "dst");
        return this.f169885w.read(dst);
    }
}
