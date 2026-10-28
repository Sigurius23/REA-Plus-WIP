package p092dh;

import c93.InterfaceC4339a;
import java.io.File;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26603a0;
import ne3.C26611e0;
import ne3.C26617h0;
import ne3.C26621j0;
import ne3.InterfaceC26620j;
import p098dt.AbstractC12350b;
import p249jc.C21567b;
import p425qh.AbstractC30358d;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: dh.z */
/* JADX INFO: loaded from: classes6.dex */
public final class C12039z extends AbstractC12037x {

    /* JADX INFO: renamed from: E */
    public C26611e0 f39809E;

    /* JADX INFO: renamed from: w */
    public final AbstractC12350b f39810w;

    /* JADX INFO: renamed from: x */
    public boolean f39811x;

    /* JADX INFO: renamed from: y */
    public InterfaceC26620j f39812y;

    /* JADX INFO: renamed from: z */
    public InterfaceC4339a f39813z;

    public C12039z(InterfaceC26620j interfaceC26620j, InterfaceC4339a interfaceC4339a, AbstractC12350b abstractC12350b) {
        this.f39810w = abstractC12350b;
        this.f39812y = interfaceC26620j;
        this.f39813z = interfaceC4339a;
    }

    @Override // p092dh.AbstractC12037x
    /* JADX INFO: renamed from: D0 */
    public final synchronized C26611e0 mo33149D0() {
        Throwable th3;
        if (this.f39811x) {
            throw new IllegalStateException("closed");
        }
        C26611e0 c26611e0 = this.f39809E;
        if (c26611e0 != null) {
            return c26611e0;
        }
        InterfaceC4339a interfaceC4339a = this.f39813z;
        AbstractC22676k.m65747g(interfaceC4339a);
        File file = (File) interfaceC4339a.invoke();
        if (!file.isDirectory()) {
            throw new IllegalStateException("cacheDirectory must be a directory.");
        }
        String str = C26611e0.f105848x;
        C26611e0 c26611e0M60607p = C21567b.m60607p(File.createTempFile("tmp", null, file));
        C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(AbstractC26632p.f105900w.mo37080p0(c26611e0M60607p, false));
        try {
            InterfaceC26620j interfaceC26620j = this.f39812y;
            AbstractC22676k.m65747g(interfaceC26620j);
            c26617h0M79157b.mo79189N0(interfaceC26620j);
            try {
                c26617h0M79157b.close();
                th3 = null;
            } catch (Throwable th4) {
                th3 = th4;
            }
        } catch (Throwable th5) {
            try {
                c26617h0M79157b.close();
            } catch (Throwable th6) {
                AbstractC29125c.m88530g(th5, th6);
            }
            th3 = th5;
        }
        if (th3 != null) {
            throw th3;
        }
        this.f39812y = null;
        this.f39809E = c26611e0M60607p;
        this.f39813z = null;
        return c26611e0M60607p;
    }

    @Override // p092dh.AbstractC12037x
    /* JADX INFO: renamed from: V0 */
    public final synchronized C26611e0 mo33150V0() {
        if (this.f39811x) {
            throw new IllegalStateException("closed");
        }
        return this.f39809E;
    }

    @Override // p092dh.AbstractC12037x
    /* JADX INFO: renamed from: b */
    public final AbstractC12350b mo33151b() {
        return this.f39810w;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f39811x = true;
            InterfaceC26620j interfaceC26620j = this.f39812y;
            if (interfaceC26620j != null) {
                AbstractC30358d.m92827a(interfaceC26620j);
            }
            C26611e0 c26611e0 = this.f39809E;
            if (c26611e0 != null) {
                C26603a0 c26603a0 = AbstractC26632p.f105900w;
                c26603a0.getClass();
                c26603a0.mo79153m(c26611e0);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // p092dh.AbstractC12037x
    /* JADX INFO: renamed from: d1 */
    public final synchronized InterfaceC26620j mo33152d1() {
        if (this.f39811x) {
            throw new IllegalStateException("closed");
        }
        InterfaceC26620j interfaceC26620j = this.f39812y;
        if (interfaceC26620j != null) {
            return interfaceC26620j;
        }
        C26603a0 c26603a0 = AbstractC26632p.f105900w;
        C26611e0 c26611e0 = this.f39809E;
        AbstractC22676k.m65747g(c26611e0);
        C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(c26603a0.mo79155x0(c26611e0));
        this.f39812y = c26621j0M79158c;
        return c26621j0M79158c;
    }
}
