package p092dh;

import java.io.Closeable;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.C26621j0;
import ne3.InterfaceC26620j;
import p098dt.AbstractC12350b;
import p425qh.AbstractC30358d;

/* JADX INFO: renamed from: dh.p */
/* JADX INFO: loaded from: classes.dex */
public final class C12029p extends AbstractC12037x {

    /* JADX INFO: renamed from: E */
    public boolean f39776E;

    /* JADX INFO: renamed from: F */
    public C26621j0 f39777F;

    /* JADX INFO: renamed from: w */
    public final C26611e0 f39778w;

    /* JADX INFO: renamed from: x */
    public final AbstractC26632p f39779x;

    /* JADX INFO: renamed from: y */
    public final String f39780y;

    /* JADX INFO: renamed from: z */
    public final Closeable f39781z;

    public C12029p(C26611e0 c26611e0, AbstractC26632p abstractC26632p, String str, Closeable closeable) {
        this.f39778w = c26611e0;
        this.f39779x = abstractC26632p;
        this.f39780y = str;
        this.f39781z = closeable;
    }

    @Override // p092dh.AbstractC12037x
    /* JADX INFO: renamed from: D0 */
    public final synchronized C26611e0 mo33149D0() {
        if (this.f39776E) {
            throw new IllegalStateException("closed");
        }
        return this.f39778w;
    }

    @Override // p092dh.AbstractC12037x
    /* JADX INFO: renamed from: V0 */
    public final C26611e0 mo33150V0() {
        return mo33149D0();
    }

    @Override // p092dh.AbstractC12037x
    /* JADX INFO: renamed from: b */
    public final AbstractC12350b mo33151b() {
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f39776E = true;
            C26621j0 c26621j0 = this.f39777F;
            if (c26621j0 != null) {
                AbstractC30358d.m92827a(c26621j0);
            }
            Closeable closeable = this.f39781z;
            if (closeable != null) {
                AbstractC30358d.m92827a(closeable);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // p092dh.AbstractC12037x
    /* JADX INFO: renamed from: d1 */
    public final synchronized InterfaceC26620j mo33152d1() {
        if (this.f39776E) {
            throw new IllegalStateException("closed");
        }
        C26621j0 c26621j0 = this.f39777F;
        if (c26621j0 != null) {
            return c26621j0;
        }
        C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(this.f39779x.mo79155x0(this.f39778w));
        this.f39777F = c26621j0M79158c;
        return c26621j0M79158c;
    }
}
