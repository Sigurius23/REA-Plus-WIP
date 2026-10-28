package pg3;

import java.io.IOException;
import ne3.AbstractC26604b;
import ne3.C26621j0;
import ne3.InterfaceC26620j;
import p092dh.C12015b;
import ud3.AbstractC34799a1;
import ud3.C34818h0;

/* JADX INFO: renamed from: pg3.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C29225z extends AbstractC34799a1 {

    /* JADX INFO: renamed from: E */
    public IOException f118296E;

    /* JADX INFO: renamed from: y */
    public final AbstractC34799a1 f118297y;

    /* JADX INFO: renamed from: z */
    public final C26621j0 f118298z;

    public C29225z(AbstractC34799a1 abstractC34799a1) {
        this.f118297y = abstractC34799a1;
        this.f118298z = AbstractC26604b.m79158c(new C12015b(this, abstractC34799a1.mo1940d1()));
    }

    @Override // ud3.AbstractC34799a1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f118297y.close();
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: d1 */
    public final InterfaceC26620j mo1940d1() {
        return this.f118298z;
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: i */
    public final long mo1941i() {
        return this.f118297y.mo1941i();
    }

    @Override // ud3.AbstractC34799a1
    /* JADX INFO: renamed from: k */
    public final C34818h0 mo1942k() {
        return this.f118297y.mo1942k();
    }
}
