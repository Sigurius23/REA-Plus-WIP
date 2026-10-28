package p647yf;

import java.io.IOException;
import ne3.AbstractC26604b;
import ne3.C26610e;
import ne3.C26612f;
import ne3.C26616h;
import oe3.AbstractC27881a;
import p302lf.InterfaceC23891a;
import p679zf.C40604e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: yf.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C39493f implements InterfaceC39507t {

    /* JADX INFO: renamed from: w */
    public final InterfaceC39507t f169889w;

    /* JADX INFO: renamed from: x */
    public final C26612f f169890x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC23891a f169891y;

    public C39493f(InterfaceC23891a hash) {
        C40604e sink = new C40604e(new C26610e());
        AbstractC22676k.m65750j(hash, "hash");
        AbstractC22676k.m65750j(sink, "sink");
        this.f169889w = sink;
        this.f169890x = new C26612f();
        this.f169891y = hash;
    }

    @Override // p647yf.InterfaceC39507t
    /* JADX INFO: renamed from: Y */
    public final void mo126145Y(C39498k c39498k, long j7) {
        C26616h c26616h = c39498k.f169914w;
        c26616h.getClass();
        C26612f unsafeCursor = this.f169890x;
        AbstractC22676k.m65750j(unsafeCursor, "unsafeCursor");
        byte[] bArr = AbstractC27881a.f112425a;
        C26612f c26612f = unsafeCursor == AbstractC26604b.f105833a ? new C26612f() : unsafeCursor;
        if (c26612f.f105853w != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        c26612f.f105853w = c26616h;
        c26612f.f105854x = false;
        try {
            long j13 = j7;
            for (int iM79181i = unsafeCursor.m79181i(0L); iM79181i > 0 && j13 > 0; iM79181i = unsafeCursor.m79179b()) {
                int iMin = Math.min(iM79181i, (int) j13);
                byte[] bArr2 = unsafeCursor.f105850E;
                if (bArr2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                this.f169891y.update(bArr2, unsafeCursor.f105851F, iMin);
                j13 -= (long) iMin;
            }
            unsafeCursor.close();
            this.f169889w.mo126145Y(c39498k, j7);
        } catch (Throwable th3) {
            unsafeCursor.close();
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f169889w.close();
    }

    @Override // p647yf.InterfaceC39507t
    public final void flush() {
        this.f169889w.flush();
    }
}
