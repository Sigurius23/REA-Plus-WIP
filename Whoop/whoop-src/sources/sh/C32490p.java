package sh;

import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.C26621j0;
import ne3.InterfaceC26620j;
import p319m4.AbstractC25012a;
import p477s2.AbstractC32069a;

/* JADX INFO: renamed from: sh.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C32490p implements InterfaceC32491q {

    /* JADX INFO: renamed from: E */
    public final Object f134523E = new Object();

    /* JADX INFO: renamed from: F */
    public boolean f134524F;

    /* JADX INFO: renamed from: G */
    public C26621j0 f134525G;

    /* JADX INFO: renamed from: w */
    public final C26611e0 f134526w;

    /* JADX INFO: renamed from: x */
    public final AbstractC26632p f134527x;

    /* JADX INFO: renamed from: y */
    public final String f134528y;

    /* JADX INFO: renamed from: z */
    public final AutoCloseable f134529z;

    public C32490p(C26611e0 c26611e0, AbstractC26632p abstractC26632p, String str, AutoCloseable autoCloseable) {
        this.f134526w = c26611e0;
        this.f134527x = abstractC26632p;
        this.f134528y = str;
        this.f134529z = autoCloseable;
    }

    @Override // sh.InterfaceC32491q
    /* JADX INFO: renamed from: D0 */
    public final C26611e0 mo101467D0() {
        C26611e0 c26611e0;
        synchronized (this.f134523E) {
            if (this.f134524F) {
                throw new IllegalStateException("closed");
            }
            c26611e0 = this.f134526w;
        }
        return c26611e0;
    }

    @Override // sh.InterfaceC32491q
    /* JADX INFO: renamed from: V0 */
    public final C26611e0 mo101468V0() {
        return mo101467D0();
    }

    @Override // sh.InterfaceC32491q
    /* JADX INFO: renamed from: c */
    public final AbstractC32069a mo101469c() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        AutoCloseable autoCloseable;
        synchronized (this.f134523E) {
            this.f134524F = true;
            C26621j0 c26621j0 = this.f134525G;
            if (c26621j0 != null) {
                try {
                    c26621j0.close();
                } catch (RuntimeException e5) {
                    throw e5;
                } catch (Exception unused) {
                }
                autoCloseable = this.f134529z;
                if (autoCloseable != null) {
                    try {
                        AbstractC25012a.m73390w(autoCloseable);
                    } catch (RuntimeException e13) {
                        throw e13;
                    } catch (Exception unused2) {
                    }
                }
            } else {
                autoCloseable = this.f134529z;
                if (autoCloseable != null) {
                    AbstractC25012a.m73390w(autoCloseable);
                }
            }
            throw th;
        }
    }

    @Override // sh.InterfaceC32491q
    /* JADX INFO: renamed from: d1 */
    public final InterfaceC26620j mo101470d1() {
        synchronized (this.f134523E) {
            if (this.f134524F) {
                throw new IllegalStateException("closed");
            }
            C26621j0 c26621j0 = this.f134525G;
            if (c26621j0 != null) {
                return c26621j0;
            }
            C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(this.f134527x.mo79155x0(this.f134526w));
            this.f134525G = c26621j0M79158c;
            return c26621j0M79158c;
        }
    }

    @Override // sh.InterfaceC32491q
    public final AbstractC26632p getFileSystem() {
        return this.f134527x;
    }
}
