package be3;

import java.io.IOException;
import ne3.C26616h;
import ne3.C26617h0;
import ne3.C26637r0;
import ne3.C26640t;
import ne3.InterfaceC26629n0;
import p715kotlin.jvm.internal.AbstractC22676k;
import rq0.C31703x;
import wd3.AbstractC37172f;

/* JADX INFO: renamed from: be3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3183e implements InterfaceC26629n0 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12482w = 0;

    /* JADX INFO: renamed from: x */
    public boolean f12483x;

    /* JADX INFO: renamed from: y */
    public final Object f12484y;

    /* JADX INFO: renamed from: z */
    public final Object f12485z;

    public C3183e(InterfaceC26629n0 interfaceC26629n0, C31703x c31703x) {
        this.f12484y = interfaceC26629n0;
        this.f12485z = c31703x;
    }

    @Override // ne3.InterfaceC26629n0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f12482w) {
            case 0:
                C3185g c3185g = (C3185g) this.f12485z;
                if (!this.f12483x) {
                    this.f12483x = true;
                    C26640t c26640t = (C26640t) this.f12484y;
                    C26637r0 c26637r0 = c26640t.f105912e;
                    c26640t.f105912e = C26637r0.f105903d;
                    c26637r0.mo79278a();
                    c26637r0.mo79279b();
                    c3185g.f12491d = 3;
                    break;
                }
                break;
            default:
                try {
                    ((InterfaceC26629n0) this.f12484y).close();
                } catch (IOException e5) {
                    this.f12483x = true;
                    ((C31703x) this.f12485z).invoke(e5);
                    return;
                }
                break;
        }
    }

    @Override // ne3.InterfaceC26629n0, java.io.Flushable
    public final void flush() {
        switch (this.f12482w) {
            case 0:
                if (!this.f12483x) {
                    ((C26617h0) ((C3185g) this.f12485z).f12490c.f132770y).flush();
                    break;
                }
                break;
            default:
                try {
                    ((InterfaceC26629n0) this.f12484y).flush();
                } catch (IOException e5) {
                    this.f12483x = true;
                    ((C31703x) this.f12485z).invoke(e5);
                    return;
                }
                break;
        }
    }

    @Override // ne3.InterfaceC26629n0
    public final C26637r0 timeout() {
        switch (this.f12482w) {
            case 0:
                return (C26640t) this.f12484y;
            default:
                return ((InterfaceC26629n0) this.f12484y).timeout();
        }
    }

    @Override // ne3.InterfaceC26629n0
    public final void write(C26616h source, long j7) {
        switch (this.f12482w) {
            case 0:
                AbstractC22676k.m65750j(source, "source");
                if (this.f12483x) {
                    throw new IllegalStateException("closed");
                }
                AbstractC37172f.m119116a(source.f105866x, 0L, j7);
                ((C26617h0) ((C3185g) this.f12485z).f12490c.f132770y).write(source, j7);
                return;
            default:
                if (this.f12483x) {
                    source.skip(j7);
                    return;
                }
                try {
                    ((InterfaceC26629n0) this.f12484y).write(source, j7);
                    return;
                } catch (IOException e5) {
                    this.f12483x = true;
                    ((C31703x) this.f12485z).invoke(e5);
                    return;
                }
        }
    }

    public C3183e(C3185g c3185g) {
        this.f12485z = c3185g;
        this.f12484y = new C26640t(((C26617h0) c3185g.f12490c.f132770y).f105867w.timeout());
    }
}
