package p647yf;

import c13.AbstractC3855a;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import ne3.C26616h;
import p715kotlin.jvm.internal.AbstractC22676k;
import s30.AbstractC32100b;

/* JADX INFO: renamed from: yf.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C39498k implements InterfaceC39500m, InterfaceC39499l {

    /* JADX INFO: renamed from: w */
    public final C26616h f169914w;

    public C39498k() {
        this(new C26616h());
    }

    @Override // p647yf.InterfaceC39499l
    /* JADX INFO: renamed from: C */
    public final long mo126144C(InterfaceC39508u source) throws IOException {
        AbstractC22676k.m65750j(source, "source");
        try {
            return this.f169914w.mo79189N0(AbstractC32100b.m99874x(source));
        } catch (EOFException e5) {
            throw new aws.smithy.kotlin.runtime.p022io.EOFException("Okio operation failed: " + e5.getMessage(), e5);
        } catch (IOException e13) {
            throw new IOException(AbstractC3855a.m11824h(e13, new StringBuilder("Okio operation failed: ")), e13);
        }
    }

    @Override // p647yf.InterfaceC39507t
    /* JADX INFO: renamed from: Y */
    public final void mo126145Y(C39498k source, long j7) throws IOException {
        AbstractC22676k.m65750j(source, "source");
        try {
            this.f169914w.write(source.f169914w, j7);
        } catch (EOFException e5) {
            throw new aws.smithy.kotlin.runtime.p022io.EOFException("Okio operation failed: " + e5.getMessage(), e5);
        } catch (IOException e13) {
            throw new IOException(AbstractC3855a.m11824h(e13, new StringBuilder("Okio operation failed: ")), e13);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m126161b() throws IOException {
        try {
            return this.f169914w.m79194S0();
        } catch (EOFException e5) {
            throw new aws.smithy.kotlin.runtime.p022io.EOFException("Okio operation failed: " + e5.getMessage(), e5);
        } catch (IOException e13) {
            throw new IOException(AbstractC3855a.m11824h(e13, new StringBuilder("Okio operation failed: ")), e13);
        }
    }

    @Override // p647yf.InterfaceC39508u
    /* JADX INFO: renamed from: c0 */
    public final long mo119145c0(C39498k sink, long j7) throws IOException {
        AbstractC22676k.m65750j(sink, "sink");
        try {
            return this.f169914w.mo9164h1(sink.f169914w, j7);
        } catch (EOFException e5) {
            throw new aws.smithy.kotlin.runtime.p022io.EOFException("Okio operation failed: " + e5.getMessage(), e5);
        } catch (IOException e13) {
            throw new IOException(AbstractC3855a.m11824h(e13, new StringBuilder("Okio operation failed: ")), e13);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        try {
            this.f169914w.getClass();
        } catch (EOFException e5) {
            throw new aws.smithy.kotlin.runtime.p022io.EOFException("Okio operation failed: " + e5.getMessage(), e5);
        } catch (IOException e13) {
            throw new IOException(AbstractC3855a.m11824h(e13, new StringBuilder("Okio operation failed: ")), e13);
        }
    }

    @Override // p647yf.InterfaceC39499l
    /* JADX INFO: renamed from: e */
    public final void mo126146e() {
        this.f169914w.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39498k)) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f169914w, ((C39498k) obj).f169914w);
    }

    @Override // p647yf.InterfaceC39499l
    /* JADX INFO: renamed from: f */
    public final C39498k mo126147f() {
        return this;
    }

    @Override // p647yf.InterfaceC39507t
    public final void flush() throws IOException {
        try {
            this.f169914w.getClass();
        } catch (EOFException e5) {
            throw new aws.smithy.kotlin.runtime.p022io.EOFException("Okio operation failed: " + e5.getMessage(), e5);
        } catch (IOException e13) {
            throw new IOException(AbstractC3855a.m11824h(e13, new StringBuilder("Okio operation failed: ")), e13);
        }
    }

    public final int hashCode() {
        return this.f169914w.hashCode();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        this.f169914w.getClass();
        return true;
    }

    @Override // p647yf.InterfaceC39500m
    /* JADX INFO: renamed from: n */
    public final byte[] mo126149n() throws IOException {
        try {
            C26616h c26616h = this.f169914w;
            return c26616h.m79201b0(c26616h.f105866x);
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
            return this.f169914w.mo79222o();
        } catch (EOFException e5) {
            throw new aws.smithy.kotlin.runtime.p022io.EOFException("Okio operation failed: " + e5.getMessage(), e5);
        } catch (IOException e13) {
            throw new IOException(AbstractC3855a.m11824h(e13, new StringBuilder("Okio operation failed: ")), e13);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer dst) {
        AbstractC22676k.m65750j(dst, "dst");
        return this.f169914w.read(dst);
    }

    public final String toString() {
        return this.f169914w.toString();
    }

    public final void write(byte[] source, int i13, int i14) throws IOException {
        AbstractC22676k.m65750j(source, "source");
        try {
            this.f169914w.m134463write(source, i13, i14);
        } catch (EOFException e5) {
            throw new aws.smithy.kotlin.runtime.p022io.EOFException("Okio operation failed: " + e5.getMessage(), e5);
        } catch (IOException e13) {
            throw new IOException(AbstractC3855a.m11824h(e13, new StringBuilder("Okio operation failed: ")), e13);
        }
    }

    @Override // p647yf.InterfaceC39499l
    /* JADX INFO: renamed from: z */
    public final void mo126148z(int i13, String string) throws IOException {
        AbstractC22676k.m65750j(string, "string");
        try {
            this.f169914w.m79231t1(0, i13, string);
        } catch (EOFException e5) {
            throw new aws.smithy.kotlin.runtime.p022io.EOFException("Okio operation failed: " + e5.getMessage(), e5);
        } catch (IOException e13) {
            throw new IOException(AbstractC3855a.m11824h(e13, new StringBuilder("Okio operation failed: ")), e13);
        }
    }

    public C39498k(C26616h buffer) {
        AbstractC22676k.m65750j(buffer, "buffer");
        this.f169914w = buffer;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer src) {
        AbstractC22676k.m65750j(src, "src");
        return this.f169914w.write(src);
    }
}
