package p647yf;

import java.nio.ByteBuffer;
import ne3.C26617h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import s30.AbstractC32100b;

/* JADX INFO: renamed from: yf.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C39488a implements InterfaceC39499l {

    /* JADX INFO: renamed from: w */
    public final C26617h0 f169884w;

    public C39488a(C26617h0 c26617h0) {
        this.f169884w = c26617h0;
    }

    @Override // p647yf.InterfaceC39499l
    /* JADX INFO: renamed from: C */
    public final long mo126144C(InterfaceC39508u source) {
        AbstractC22676k.m65750j(source, "source");
        return this.f169884w.mo79189N0(AbstractC32100b.m99874x(source));
    }

    @Override // p647yf.InterfaceC39507t
    /* JADX INFO: renamed from: Y */
    public final void mo126145Y(C39498k c39498k, long j7) {
        this.f169884w.write(c39498k.f169914w, j7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        this.f169884w.close();
    }

    @Override // p647yf.InterfaceC39499l
    /* JADX INFO: renamed from: e */
    public final void mo126146e() {
        this.f169884w.mo79203e();
    }

    @Override // p647yf.InterfaceC39499l
    /* JADX INFO: renamed from: f */
    public final C39498k mo126147f() {
        return new C39498k(this.f169884w.f105868x);
    }

    @Override // p647yf.InterfaceC39507t
    public final void flush() {
        this.f169884w.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f169884w.isOpen();
    }

    public final String toString() {
        return this.f169884w.toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer src) {
        AbstractC22676k.m65750j(src, "src");
        return this.f169884w.write(src);
    }

    @Override // p647yf.InterfaceC39499l
    /* JADX INFO: renamed from: z */
    public final void mo126148z(int i13, String string) {
        AbstractC22676k.m65750j(string, "string");
        this.f169884w.mo79186L0(0, i13, string);
    }
}
