package p076d;

import java.io.IOException;
import java.io.InputStream;
import p012ab.C0682h0;

/* JADX INFO: renamed from: d.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11318v0 extends InputStream {

    /* JADX INFO: renamed from: w */
    public final C0682h0 f36266w;

    /* JADX INFO: renamed from: x */
    public boolean f36267x = true;

    /* JADX INFO: renamed from: y */
    public InputStream f36268y;

    public C11318v0(C0682h0 c0682h0) {
        this.f36266w = c0682h0;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC11269a1 m30531b() throws IOException {
        C0682h0 c0682h0 = this.f36266w;
        int i13 = ((AbstractC11305p) c0682h0.f2433y).read();
        InterfaceC11307q interfaceC11307qM1687b = i13 < 0 ? null : c0682h0.m1687b(i13);
        if (interfaceC11307qM1687b == null) {
            return null;
        }
        if (interfaceC11307qM1687b instanceof InterfaceC11269a1) {
            return (InterfaceC11269a1) interfaceC11307qM1687b;
        }
        throw new IOException("unknown object encountered: " + interfaceC11307qM1687b.getClass());
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        InterfaceC11269a1 interfaceC11269a1M30531b;
        if (this.f36268y == null) {
            if (!this.f36267x || (interfaceC11269a1M30531b = m30531b()) == null) {
                return -1;
            }
            this.f36267x = false;
            this.f36268y = interfaceC11269a1M30531b.mo30481c();
        }
        while (true) {
            int i13 = this.f36268y.read();
            if (i13 >= 0) {
                return i13;
            }
            InterfaceC11269a1 interfaceC11269a1M30531b2 = m30531b();
            if (interfaceC11269a1M30531b2 == null) {
                this.f36268y = null;
                return -1;
            }
            this.f36268y = interfaceC11269a1M30531b2.mo30481c();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i13, int i14) throws IOException {
        InterfaceC11269a1 interfaceC11269a1M30531b;
        int i15 = 0;
        if (this.f36268y == null) {
            if (!this.f36267x || (interfaceC11269a1M30531b = m30531b()) == null) {
                return -1;
            }
            this.f36267x = false;
            this.f36268y = interfaceC11269a1M30531b.mo30481c();
        }
        while (true) {
            int i16 = this.f36268y.read(bArr, i13 + i15, i14 - i15);
            if (i16 >= 0) {
                i15 += i16;
                if (i15 == i14) {
                    return i15;
                }
            } else {
                InterfaceC11269a1 interfaceC11269a1M30531b2 = m30531b();
                if (interfaceC11269a1M30531b2 == null) {
                    this.f36268y = null;
                    if (i15 < 1) {
                        return -1;
                    }
                    return i15;
                }
                this.f36268y = interfaceC11269a1M30531b2.mo30481c();
            }
        }
    }
}
