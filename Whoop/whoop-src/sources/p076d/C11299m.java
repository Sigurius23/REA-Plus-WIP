package p076d;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import p001a.C0002v;
import ro.C31624i;

/* JADX INFO: renamed from: d.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C11299m extends AbstractC11290h1 {

    /* JADX INFO: renamed from: b */
    public byte[] f36225b;

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: c */
    public final int mo30479c(boolean z4) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f36225b;
        }
        return bArr != null ? C31624i.m97696b(bArr.length, z4) : super.mo30477k().mo30479c(z4);
    }

    @Override // p076d.AbstractC11272b1
    /* JADX INFO: renamed from: f */
    public final void mo30480f(C31624i c31624i, boolean z4) throws IOException {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f36225b;
        }
        if (bArr != null) {
            c31624i.m97707f(48, z4, bArr);
        } else {
            super.mo30477k().mo30480f(c31624i, z4);
        }
    }

    @Override // p076d.AbstractC11290h1, p076d.AbstractC11272b1
    public final int hashCode() {
        m30511r();
        return super.hashCode();
    }

    @Override // p076d.AbstractC11290h1, p076d.AbstractC11272b1
    /* JADX INFO: renamed from: j */
    public final AbstractC11272b1 mo30476j() {
        m30511r();
        return super.mo30476j();
    }

    @Override // p076d.AbstractC11290h1, p076d.AbstractC11272b1
    /* JADX INFO: renamed from: k */
    public final AbstractC11272b1 mo30477k() {
        m30511r();
        return super.mo30477k();
    }

    @Override // p076d.AbstractC11290h1
    /* JADX INFO: renamed from: l */
    public final InterfaceC11307q mo30505l(int i13) {
        m30511r();
        return this.f36215a[i13];
    }

    @Override // p076d.AbstractC11290h1
    /* JADX INFO: renamed from: o */
    public final int mo30507o() {
        m30511r();
        return this.f36215a.length;
    }

    @Override // p076d.AbstractC11290h1
    /* JADX INFO: renamed from: p */
    public final AbstractC11285g mo30490p() {
        m30511r();
        return ((AbstractC11290h1) super.mo30477k()).mo30490p();
    }

    @Override // p076d.AbstractC11290h1
    /* JADX INFO: renamed from: q */
    public final AbstractC11322x0 mo30491q() {
        m30511r();
        return ((AbstractC11290h1) super.mo30477k()).mo30491q();
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m30511r() {
        C11311s c11311s;
        try {
            if (this.f36225b != null) {
                byte[] bArr = this.f36225b;
                C11286g0 c11286g0 = new C11286g0(new ByteArrayInputStream(bArr), bArr.length, true);
                try {
                    AbstractC11272b1 abstractC11272b1M30502i = c11286g0.m30502i();
                    if (abstractC11272b1M30502i == null) {
                        c11311s = new C11311s(0);
                    } else {
                        C11311s c11311s2 = new C11311s(10);
                        do {
                            c11311s2.m30522e(abstractC11272b1M30502i);
                            abstractC11272b1M30502i = c11286g0.m30502i();
                        } while (abstractC11272b1M30502i != null);
                        c11311s = c11311s2;
                    }
                    c11286g0.close();
                    this.f36215a = c11311s.m30523f();
                    this.f36225b = null;
                } catch (IOException e5) {
                    throw new C0002v(e5, "malformed ASN.1: " + e5);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
